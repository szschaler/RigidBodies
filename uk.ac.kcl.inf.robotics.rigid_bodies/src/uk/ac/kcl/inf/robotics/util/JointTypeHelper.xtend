package uk.ac.kcl.inf.robotics.util

import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeReference

class JointTypeHelper {
	static dispatch def JointTypeExpression get(JointTypeExpression exp, int i) {
		if (i == 0)
			return exp
		else
			return null
	}

	static dispatch def JointTypeExpression get(AdditiveJointType exp, int i) {
		if (i == 0)
			return exp.left
		else
			return exp.right.get(i - 1)
	}

	static dispatch def JointTypeExpression get(JointTypeReference exp, int i) {
		exp.ref.exp.get(i)
	}
}