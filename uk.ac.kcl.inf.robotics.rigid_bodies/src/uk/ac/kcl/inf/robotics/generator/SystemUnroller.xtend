package uk.ac.kcl.inf.robotics.generator

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.util.EcoreUtil
import uk.ac.kcl.inf.robotics.rigidBodies.Body
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference
import uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad
import uk.ac.kcl.inf.robotics.rigidBodies.Joint
import uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesFactory
import uk.ac.kcl.inf.robotics.rigidBodies.System
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement

/**
 * Unroll's any repeat statements in the system and resolves new and last references as it goes along
 */
class SystemUnroller {

	private System system

	new(System system) {
		this.system = system

		unroll
	}

	/**
	 * The actual unrolling process. At the end of this, the system no longer contains any body repetitions or references to new or last bodies.
	 */
	private def unroll() {
		// 1. Unroll repetitions, keeping track of last bodies as we go
		val Map<String, Body> currentLasts = new HashMap<String, Body>

		// Note we need to say toList below to make a copy of the original list and avoid concurrent modification.
		system.elements.filter(BodyRepetition).toList.forEach [ br |
			// 1. Conditionally initialise last body pointer for the referenced body
			if (!currentLasts.containsKey(br.body.name)) {
				currentLasts.put(br.body.name, br.body)
			}
			
			// 2. Unroll loop, creating copies of the loop body as we go
			(1 .. br.number).forEach [ idx |
				// We need to use an explicitly constructed copier object so that references to duplicated elements are re-routed correctly
				val EcoreUtil.Copier copier = new EcoreUtil.Copier()

				val newBody = br.body.duplicateBody(idx, copier)

				br.connectionExp.forEach [ e |
					system.elements.add(e.duplicate(idx, newBody, currentLasts.get(br.body.name), copier))
				]

				copier.copyReferences

				currentLasts.put(br.body.name, newBody)
			]
			
			// 3. Remove body repetition from system elements
			system.elements.remove(br)
		]

		// 2. Resolve explicit last references
		system.elements.forEach [e | e.resolveExplicitLastReferences (currentLasts)]
	}

	// Create a duplicate of the given body. Name this duplicate using the name of the given body and appending the given idx.
	private def Body duplicateBody(Body b, int idx, EcoreUtil.Copier copier) {
		val bodyDuplicate = copier.copy (b) as Body

		bodyDuplicate.name = b.name + idx

		return bodyDuplicate
	}

	/**
	 * These dispatch methods duplicate the given element of a repetition, adjust its name based on the given idx and adjust 
	 * and (implicit) last or new references based on the two bodies given.
	 */
	private dispatch def duplicate(Joint j, int idx, Body newBody, Body lastBody, EcoreUtil.Copier copier) {
		val jointDuplicate =  copier.copy(j) as Joint
		
		jointDuplicate.name = j.name + idx
		jointDuplicate.body1.adjustImplicitReferences (newBody, lastBody)
		jointDuplicate.body2.adjustImplicitReferences (newBody, lastBody)
		
		return jointDuplicate
	}
	
	private dispatch def duplicate (Constraint c, int idx, Body newBody, Body lastBody, EcoreUtil.Copier copier) {
		val constraintDuplicate = copier.copy (c) as Constraint
		
		constraintDuplicate.name = c.name + idx
		constraintDuplicate.body1.adjustImplicitReferences (newBody, lastBody)
		constraintDuplicate.body2.adjustImplicitReferences (newBody, lastBody)
		
		return constraintDuplicate
	}
	
	private dispatch def duplicate (ExternalLoad el, int idx, Body newBody, Body lastBody, EcoreUtil.Copier copier) {
		val loadDuplicate = copier.copy (el) as ExternalLoad
		
		loadDuplicate.name = el.name + idx
		loadDuplicate.body1.adjustImplicitReferences (newBody, lastBody)
		
		return loadDuplicate
	}
	
	private dispatch def duplicate (JointConstraint jc, int idx, Body newBody, Body lastBody, EcoreUtil.Copier copier) {
		val jcDuplicate = copier.copy (jc) as JointConstraint
		
		jcDuplicate.name = jc.name + idx
		
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
	
	private dispatch def void resolveExplicitLastReferences (SystemElement se, Map<String, Body> currentLasts) { }
	
	private dispatch def void resolveExplicitLastReferences (Joint j, Map<String, Body> currentLasts) { 
		j.body1.resolveExplicitLastReferences (currentLasts) 
		j.body2.resolveExplicitLastReferences (currentLasts) 
	}

	private dispatch def void resolveExplicitLastReferences (Constraint c, Map<String, Body> currentLasts) { 
		c.body1.resolveExplicitLastReferences (currentLasts) 
		c.body2.resolveExplicitLastReferences (currentLasts) 
	}
	private dispatch def void resolveExplicitLastReferences (ExternalLoad el, Map<String, Body> currentLasts) { 
		el.body1.resolveExplicitLastReferences (currentLasts)
	}
	
	private dispatch def void resolveExplicitLastReferences (BodyReference br, Map<String, Body> currentLasts) {
		if (br.last && (br.ref != null)) {
			br.last = false
			br.ref = currentLasts.get (br.ref.name)
			
			if (br.ref == null) {
				// TODO: Emit error message!
				throw new IllegalStateException ("Created null body reference!")
			}
		}
	}

	def getUnrolledSystem() {
		system
	}
}