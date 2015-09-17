/*
 * generated by Xtext
 */
package uk.ac.kcl.inf.robotics.validation

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.ValidationMessageAcceptor
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference
import uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition
import uk.ac.kcl.inf.robotics.rigidBodies.Environment
import uk.ac.kcl.inf.robotics.rigidBodies.Joint
import uk.ac.kcl.inf.robotics.rigidBodies.Mass
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef
import uk.ac.kcl.inf.robotics.rigidBodies.Model
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage
import uk.ac.kcl.inf.robotics.rigidBodies.System

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RigidBodiesValidator extends AbstractRigidBodiesValidator {

	public static val TOO_MANY_START_JOINTS = "tooManyStartJoints"

	@Check
	def checkOnlyOneStartJoint(System s) {
		var startJoints = s.elements.filter(Joint).filter[j|j.isIsStart]
		if (startJoints.size > 1) {
			startJoints.forEach [ j |
				warning('There can only be one start joint for each system', j,
					RigidBodiesPackage.Literals.JOINT__IS_START, ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					TOO_MANY_START_JOINTS)
				]
		}
	}

	// TODO Check for multiple base references without an explicit start hint
	public static val NEW_OUTSIDE_REPEAT = "newOutsideRepeat"
	public static val LAST_OUTSIDE_REPEAT = "lastOutsideRepeat"

	@Check
	def checkUseOfNewAndLast(BodyReference br) {
		if (br.^new || (br.last && (br.ref == null))) {
			// Reference to the new body (or the generic last body) is only allowed in a repeat expression
			var EObject container = br
			while (!(container instanceof Model) && !(container instanceof BodyRepetition)) {
				container = container.eContainer
			}
			if (container instanceof Model) {
				// We didn't find a containing repeat expression
				if (br.^new) {
					error('new is only a valid body reference within a repeat expression.', br,
						RigidBodiesPackage.Literals.BODY_REFERENCE__NEW,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX, NEW_OUTSIDE_REPEAT)
				} else {
					error('last must provide a body reference outside a repeat expression.', br,
						RigidBodiesPackage.Literals.BODY_REFERENCE__LAST,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX, LAST_OUTSIDE_REPEAT)

				}
			}
		}
	}

	public static val NO_NEW_IN_REPEAT = "noNewInRepeat"

	@Check
	def repeatBodyMustContainJointDefinition(BodyRepetition br) {
		if (! br.connectionExp.filter(Joint).exists[j|j.body1.^new || j.body2.^new]) {
			error('Repeat expression must contain at least one joint referencing the new body.', br,
				RigidBodiesPackage.Literals.BODY_REPETITION__CONNECTION_EXP,
				ValidationMessageAcceptor.INSIGNIFICANT_INDEX, NO_NEW_IN_REPEAT)
		}
	}

	public static val GRAVITY_NO_3D = "gravityNo3D"

	@Check
	def gravityMustBe3D(Environment e) {
		if (e.gravity.length != 3) {
			error('Gravity must be a 3D vector.', e, RigidBodiesPackage.Literals.ENVIRONMENT__GRAVITY,
				ValidationMessageAcceptor.INSIGNIFICANT_INDEX, GRAVITY_NO_3D)
		}
	}

	public static val MASS_POS_NO_3D = "massPosNo3D"
	public static val MASS_INERTIA_NO_9D = "massInertiaNo9D"

	@Check
	def massVectorSizes(Mass m) {
		if (m.position.length != 3) {
			error('Mass position must be a 3D vector.', m, RigidBodiesPackage.Literals.MASS__POSITION,
				ValidationMessageAcceptor.INSIGNIFICANT_INDEX, MASS_POS_NO_3D)
		}
		if (m.inertia.length != 9) {
			error('Mass inertia must be a 3 by 3 matrix.', m, RigidBodiesPackage.Literals.MASS__INERTIA,
				ValidationMessageAcceptor.INSIGNIFICANT_INDEX, MASS_INERTIA_NO_9D)
		}
	}

	public static val RELTRANS_POS_NO_3D = "relTransPosNo3D"

	@Check
	def relTransPosMustBe3D(RelativeTransformation rt) {
		if (rt.position.length != 3) {
			error('Relative transformation position must be a 3D vector.', rt,
				RigidBodiesPackage.Literals.RELATIVE_TRANSFORMATION__POSITION,
				ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RELTRANS_POS_NO_3D)
		}
	}

	def dispatch int getLength(BaseMatrix matrix) {
		matrix.values.length
	}

	def dispatch int getLength(MatrixRef mr) {
		mr.matrix.length
	}

	public static val BODY_REF_WO_CONTEXT = "bodyRefWoContext"
	public static val BODY_REF_BAD_REF = "bodyRefBadRef"
	public static val BODY_REF_NO_REPETITION = "bodyRefNoRepetition"
	
	@Check
	def isValidIndexedBodyReference(BodyReference br) {
		if (!br.^new && !br.last && !br.base) {
			if (br.idx > 0) {
				// TODO: Find containing system and check that this contains a body reference referring to the same body.
				var EObject container = br.containerForIndexing

				if (container == null) {
					error('Indexed body reference must be in a repetition or system.', br,
						RigidBodiesPackage.Literals.BODY_REFERENCE__REF,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX, BODY_REF_WO_CONTEXT)
				} else if (container instanceof BodyRepetition) {
					if (br.ref == (container as BodyRepetition).body) {
						error('Cannot put in an indexed reference to body being repeated.', br,
							RigidBodiesPackage.Literals.BODY_REFERENCE__REF,
							ValidationMessageAcceptor.INSIGNIFICANT_INDEX, BODY_REF_BAD_REF)
					}
					
					container = container.containerForIndexing
				}
				
				if (container == null) {
					error('Indexed body reference must be in a repetition or system.', br,
						RigidBodiesPackage.Literals.BODY_REFERENCE__REF,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX, BODY_REF_WO_CONTEXT)
				} else if (container instanceof System) {
					// Really, there should be no repetition here any more, so only need to check for System
					if (!(container as System).elements.filter(BodyRepetition).exists[brep | brep.body == br.ref]) {
						error('Indexed body reference must reference a repeated body.', br,
							RigidBodiesPackage.Literals.BODY_REFERENCE__REF,
							ValidationMessageAcceptor.INSIGNIFICANT_INDEX, BODY_REF_NO_REPETITION)
					}
				}
			}
		}
	}

	private def EObject getContainerForIndexing(EObject eo) {
		var EObject container = eo.eContainer
		while ((container != null) && !((container instanceof System) || (container instanceof BodyRepetition))) {
			container = container.eContainer
		}

		return container
	}
}