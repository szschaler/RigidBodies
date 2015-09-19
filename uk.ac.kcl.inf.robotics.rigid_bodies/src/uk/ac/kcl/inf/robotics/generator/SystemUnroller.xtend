package uk.ac.kcl.inf.robotics.generator

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.util.EcoreUtil
import uk.ac.kcl.inf.robotics.rigidBodies.Body
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference
import uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad
import uk.ac.kcl.inf.robotics.rigidBodies.Joint
import uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint
import uk.ac.kcl.inf.robotics.rigidBodies.System
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement

/**
 * Unroll's any repeat statements in the system and resolves new and last references as it goes along. Also resolves indexed references.
 */
class SystemUnroller {

	private System system

	new(System system) {
		this.system = system

		unroll
	}

	/**
	 * The actual unrolling process. At the end of this, the system no longer contains any body repetitions or references to new or last bodies or indexed references.
	 */
	private def unroll() {
		// 1. Unroll repetitions, keeping track of duplicated bodies as we go
		val Map<String, List<Body>> duplicatedBodies = new HashMap<String, List<Body>>

		// Note we need to say toList below to make a copy of the original list and avoid concurrent modification.
		system.elements.filter(BodyRepetition).toList.forEach [ br |
			// 1. Conditionally initialise last body pointer for the referenced body
			if (!duplicatedBodies.containsKey(br.body.name)) {
				val List<Body> l = new ArrayList<Body>
				l.add (br.body)
				duplicatedBodies.put(br.body.name, l)
			}

			// 2. Unroll loop, creating copies of the loop body as we go
			(1 .. br.number).forEach [ idx |
				// We need to use an explicitly constructed copier object so that references to duplicated elements are re-routed correctly
				val EcoreUtil.Copier copier = new EcoreUtil.Copier()

				val newBody = br.body.duplicateBody(idx, copier)

				br.connectionExp.forEach [ e |
					system.elements.add(e.duplicate(idx, newBody, duplicatedBodies.get(br.body.name).last, copier))
				]

				copier.copyReferences

				duplicatedBodies.get(br.body.name).add (newBody)
			]

			// 3. Remove body repetition from system elements
			system.elements.remove(br)
		]

		// 2. Resolve explicit last references and indexed references
		system.elements.forEach[e|e.resolveExplicitLastAndIndexedReferences(duplicatedBodies)]
	}

	// Create a duplicate of the given body. Name this duplicate using the name of the given body and appending the given idx.
	private def Body duplicateBody(Body b, int idx, EcoreUtil.Copier copier) {
		val bodyDuplicate = copier.copy(b) as Body

		bodyDuplicate.name = b.name.makeUnique (idx)

		return bodyDuplicate
	}

	/**
	 * These dispatch methods duplicate the given element of a repetition, adjust its name based on the given idx and adjust 
	 * and (implicit) last or new references based on the two bodies given.
	 */
	private dispatch def duplicate(Joint j, int idx, Body newBody, Body lastBody, EcoreUtil.Copier copier) {
		val jointDuplicate = copier.copy(j) as Joint

		jointDuplicate.name = j.name.makeUnique (idx)
		jointDuplicate.body1.adjustImplicitReferences(newBody, lastBody)
		jointDuplicate.body2.adjustImplicitReferences(newBody, lastBody)

		return jointDuplicate
	}

	private dispatch def duplicate(Constraint c, int idx, Body newBody, Body lastBody, EcoreUtil.Copier copier) {
		val constraintDuplicate = copier.copy(c) as Constraint

		constraintDuplicate.name = c.name.makeUnique (idx)
		constraintDuplicate.body1.adjustImplicitReferences(newBody, lastBody)
		constraintDuplicate.body2.adjustImplicitReferences(newBody, lastBody)

		return constraintDuplicate
	}

	private dispatch def duplicate(ExternalLoad el, int idx, Body newBody, Body lastBody, EcoreUtil.Copier copier) {
		val loadDuplicate = copier.copy(el) as ExternalLoad

		loadDuplicate.name = el.name.makeUnique (idx)
		loadDuplicate.body1.adjustImplicitReferences(newBody, lastBody)

		return loadDuplicate
	}

	private dispatch def duplicate(JointConstraint jc, int idx, Body newBody, Body lastBody, EcoreUtil.Copier copier) {
		val jcDuplicate = copier.copy(jc) as JointConstraint

		jcDuplicate.name = jc.name.makeUnique (idx)

		return jcDuplicate
	}

	private def void adjustImplicitReferences(BodyReference br, Body newBody, Body lastBody) {
		if (br.^new) {
			br.^new = false
			br.ref = newBody
		} else if (br.last && (br.ref == null)) {
			br.last = false
			br.ref = lastBody
		}
	}

	private dispatch def void resolveExplicitLastAndIndexedReferences(SystemElement se, Map<String, List<Body>> duplicatedBodies) {}

	private dispatch def void resolveExplicitLastAndIndexedReferences(Joint j, Map<String, List<Body>> duplicatedBodies) {
		j.body1.resolveExplicitLastAndIndexedReferences(duplicatedBodies)
		j.body2.resolveExplicitLastAndIndexedReferences(duplicatedBodies)
	}

	private dispatch def void resolveExplicitLastAndIndexedReferences(Constraint c, Map<String, List<Body>> duplicatedBodies) {
		c.body1.resolveExplicitLastAndIndexedReferences(duplicatedBodies)
		c.body2.resolveExplicitLastAndIndexedReferences(duplicatedBodies)
	}

	private dispatch def void resolveExplicitLastAndIndexedReferences(ExternalLoad el, Map<String, List<Body>> duplicatedBodies) {
		el.body1.resolveExplicitLastAndIndexedReferences(duplicatedBodies)
	}

	private dispatch def void resolveExplicitLastAndIndexedReferences(BodyReference br, Map<String, List<Body>> duplicatedBodies) {
		if (br.last && (br.ref != null)) {
			br.last = false
			br.ref = duplicatedBodies.get(br.ref.name).last

			if (br.ref == null) {
				// TODO: Emit error message!
				throw new IllegalStateException("Created null body reference!")
			}
		} else if (!br.last && !br.^new && !br.base && (br.idx > 0)) {
			br.ref = duplicatedBodies.get(br.ref.name).get(br.idx)
			br.idx = 0
		}
	}

	private def makeUnique(String name, int idx) {
		'''«name»_«idx»'''.toString
	}

	def getUnrolledSystem() {
		system
	}
}