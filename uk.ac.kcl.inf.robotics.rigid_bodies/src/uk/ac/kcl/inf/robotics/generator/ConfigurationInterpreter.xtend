package uk.ac.kcl.inf.robotics.generator

import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil
import uk.ac.kcl.inf.robotics.rigidBodies.AXIS
import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveLockedJointType
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix
import uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType
import uk.ac.kcl.inf.robotics.rigidBodies.BasicLockedJointType
import uk.ac.kcl.inf.robotics.rigidBodies.BasicReorientExpression
import uk.ac.kcl.inf.robotics.rigidBodies.Configuration
import uk.ac.kcl.inf.robotics.rigidBodies.ConfigurationStatement
import uk.ac.kcl.inf.robotics.rigidBodies.Expression
import uk.ac.kcl.inf.robotics.rigidBodies.Joint
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression
import uk.ac.kcl.inf.robotics.rigidBodies.KeepUnlockedJointType
import uk.ac.kcl.inf.robotics.rigidBodies.LockDoFStatement
import uk.ac.kcl.inf.robotics.rigidBodies.LockJointStatement
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientRef
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesFactory
import uk.ac.kcl.inf.robotics.rigidBodies.System

import static extension uk.ac.kcl.inf.robotics.util.ExpressionHelper.*
import static extension uk.ac.kcl.inf.robotics.util.JointTypeHelper.*

class ConfigurationInterpreter {

	val Configuration config
	val EcoreUtil.Copier copier

	new(Configuration config, List<Pair<String, System>> systemInstances) {
		this.config = config

		// Make a copy of the systems so that we can modify them as needed
		copier = new EcoreUtil.Copier()
		systemInstances.forEach [ p |
			copier.copy(p.value)
		]
		copier.copyReferences();

		configureSystems(copier)
	}

	def getConfiguredSystem() {
		copier.values.head as System
	}

	private def configureSystems(EcoreUtil.Copier copier) {
		config.statements.forEach [ stmt |
			stmt.doConfigure(copier)
		]
	}

	private dispatch def doConfigure(ConfigurationStatement ls, EcoreUtil.Copier copier) {}

	private dispatch def doConfigure(LockDoFStatement ldfs, EcoreUtil.Copier copier) {
		val Joint jointToModify = copier.get(ldfs.joint) as Joint

		// TODO Update DoF list one by one
		ldfs.lockedType.getLockedTypeFor (jointToModify.type.exp)
		
		// TODO Check whether any free DoFs remain
		// We could probably generalise this to a step that optimises the DoF list by collapsing, as much as possible, any sub-sequences of fixed DoFs		
	}

	private dispatch def List<JointTypeExpression> getLockedTypeFor (AdditiveLockedJointType aljt, JointTypeExpression exp) {
		val int[] idx = #{1}
		aljt.right.fold(new ArrayList<JointTypeExpression>(aljt.left.getLockedTypeFor (exp.get (0))), [l, c |
			l.addAll (c.getLockedTypeFor (exp.get (idx.get(0))))
			idx.set(0, idx.get(0)+1)
			return l
		])
	}
	
	private dispatch def getLockedTypeFor(KeepUnlockedJointType kujt, JointTypeExpression exp) {
		Collections.singletonList(exp)
	}

	private dispatch def getLockedTypeFor (BasicLockedJointType bljt, JointTypeExpression exp) {
		if (exp.get(0) instanceof BasicJointType) {
			//TODO bljt.type.checkIsValidLocking((exp.get(0) as BasicJointType).type)
		} else {
			// This is an illegal situation
		}
	}
	
	private dispatch def doConfigure(LockJointStatement ls, EcoreUtil.Copier copier) {
		val Joint jointToModify = copier.get(ls.joint) as Joint

		jointToModify.relTrans1.setFixed(ls.translation, ls.rotation)
		jointToModify.type = null
	}

	private def setFixed(RelativeTransformation relTrans, Matrix mTranslation, Matrix mRotation) {
		relTrans.fixTranslation(mTranslation)
		relTrans.fixRotation(mRotation)
	}

	private def fixTranslation(RelativeTransformation relTrans, Matrix mTranslation) {
		val Expression[] posElements = newArrayOfSize(relTrans.position.elements.size)

		relTrans.position.elements.forEach [ exp, idx |
			val addExp = RigidBodiesFactory.eINSTANCE.createAddExp
			addExp.right.add(EcoreUtil.copy(exp))
			addExp.left = EcoreUtil.copy(mTranslation.elements.get(idx))
			addExp.op.add("+")
			posElements.set(idx, addExp.foldConstants)
		]
		relTrans.position.elements.clear
		relTrans.position.elements.addAll(posElements)
	}

	private def fixRotation(RelativeTransformation relTrans, Matrix mRotation) {
		val amendedReorient = RigidBodiesFactory.eINSTANCE.createBasicReorientExpression
		// Keep the original elements
		relTrans.reorient.exp.addAllElementsTo(amendedReorient)
		// Add elements as described by the rotation matrix
		amendedReorient.addConstantReorient(AXIS.X, mRotation.elements.get(0))
		amendedReorient.addConstantReorient(AXIS.Y, mRotation.elements.get(1))
		amendedReorient.addConstantReorient(AXIS.Z, mRotation.elements.get(2))

		relTrans.reorient.exp = amendedReorient
	}

	private def void addConstantReorient(BasicReorientExpression bre, AXIS axis, Expression exp) {
		val foldedExp = exp.foldConstants
		if (! foldedExp.isZero) {
			bre.axis.add(axis)
			bre.value.add(foldedExp)
		}
	}

	private dispatch def void addAllElementsTo(ReorientRef rrSrc, BasicReorientExpression breTgt) {
		rrSrc.ref.exp.addAllElementsTo(breTgt)
	}

	private dispatch def void addAllElementsTo(BasicReorientExpression breSrc, BasicReorientExpression breTgt) {
		breTgt.axis.addAll(breSrc.axis)
		breTgt.value.addAll(breSrc.value.map[exp|EcoreUtil.copy(exp)])
	}

	private dispatch def List<Expression> elements(Matrix m) {}

	private dispatch def List<Expression> elements(BaseMatrix bm) {
		bm.values
	}

	private dispatch def List<Expression> elements(MatrixRef mr) {
		mr.matrix.elements
	}
}