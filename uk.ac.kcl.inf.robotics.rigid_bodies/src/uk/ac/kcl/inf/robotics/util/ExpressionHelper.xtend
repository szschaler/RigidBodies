package uk.ac.kcl.inf.robotics.util

import org.eclipse.emf.ecore.util.EcoreUtil
import uk.ac.kcl.inf.robotics.rigidBodies.AddExp
import uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp
import uk.ac.kcl.inf.robotics.rigidBodies.Expression
import uk.ac.kcl.inf.robotics.rigidBodies.MultExp
import uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral
import uk.ac.kcl.inf.robotics.rigidBodies.ParenthesisedExp
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesFactory

/**
 * A helper class with functions to simplify handling of expressions. To be imported as a library of extension methods.
 * 
 * @author Steffen Zschaler
 */
class ExpressionHelper {

	/**
	 * A somewhat simplistic constant folder. Note that every call to foldConstants will always return a new expression object so that containment relationships are not damaged.
	 */
	static dispatch def Expression foldConstants(Expression exp) { return exp; }

	static dispatch def Expression foldConstants(AddExp exp) {
		var tentativeResult = RigidBodiesFactory.eINSTANCE.createAddExp;
		tentativeResult.left = exp.left.foldConstants

		tentativeResult = (0 ..< exp.op.size).fold(tentativeResult, [ rExp, idx |
			// Fold the next expression from the list of expressions on the right
			val foldedRight = exp.right.get(idx).foldConstants

			if ((rExp.right == null) || (rExp.right.empty)) {
				if ((rExp.left instanceof NumberLiteral) && (foldedRight instanceof NumberLiteral)) {
					rExp.left = exp.op.get(idx).foldBasicOp(rExp.left as NumberLiteral, foldedRight as NumberLiteral)
				} else {
					// This is the first time we add something to the right, because we have just given up folding constants...
					rExp.right.add(foldedRight)
					rExp.op.add(exp.op.get(idx))
				}
			} else {
				// We've already previously decided to stop folding, so simply add to the end of the right expressions
				rExp.right.add(foldedRight)
				rExp.op.add(exp.op.get(idx))
			}

			rExp
		])

		if ((tentativeResult.right != null) && (!tentativeResult.right.empty)) {
			return tentativeResult
		} else {
			return tentativeResult.left
		}
	}

	static dispatch def Expression foldConstants(MultExp exp) {
		var tentativeResult = RigidBodiesFactory.eINSTANCE.createMultExp;
		tentativeResult.left = exp.left.foldConstants

		tentativeResult = (0 ..< exp.op.size).fold(tentativeResult, [ rExp, idx |
			// Fold the next expression from the list of expressions on the right
			val foldedRight = exp.right.get(idx).foldConstants

			if ((rExp.right == null) || (rExp.right.empty)) {
				if ((rExp.left instanceof NumberLiteral) && (foldedRight instanceof NumberLiteral)) {
					rExp.left = exp.op.get(idx).foldBasicOp(rExp.left as NumberLiteral, foldedRight as NumberLiteral)
				} else {
					// This is the first time we add something to the right, because we have just given up folding constants...
					rExp.right.add(foldedRight)
					rExp.op.add(exp.op.get(idx))
				}
			} else {
				// We've already previously decided to stop folding, so simply add to the end of the right expressions
				rExp.right.add(foldedRight)
				rExp.op.add(exp.op.get(idx))
			}

			rExp
		])

		if ((tentativeResult.right != null) && (!tentativeResult.right.empty)) {
			return tentativeResult
		} else {
			return tentativeResult.left
		}
	}

	static dispatch def Expression foldConstants(ParenthesisedExp pe) {
		val foldedInner = pe.exp.foldConstants

		if (foldedInner instanceof NumberLiteral) {
			return foldedInner
		} else {
			val result = RigidBodiesFactory.eINSTANCE.createParenthesisedExp

			result.exp = foldedInner

			return result
		}
	}

	static dispatch def Expression foldConstants(ConstantOrFunctionCallExp cofce) {
		val result = RigidBodiesFactory.eINSTANCE.createConstantOrFunctionCallExp

		result.label = cofce.label
		result.param.addAll(cofce.param.map[p|p.foldConstants])

		return result
	}

	static dispatch def Expression foldConstants(NumberLiteral nl) { 
		return EcoreUtil.copy (nl)
	}

	static private def NumberLiteral foldBasicOp(String op, NumberLiteral nl1, NumberLiteral nl2) {
		val num1 = nl1.parse
		val num2 = nl2.parse

		switch (op) {
			case "+": return (num1 + num2).unparse
			case "-": return (num1 - num2).unparse
			case "*": return (num1 * num2).unparse
			case "/": return (num1 / num2).unparse
			default: throw new IllegalArgumentException("Unknown operator " + op)
		}
	}

	static def parse(NumberLiteral nl) {
		val basicValue = Double.parseDouble(nl.value)
		if (nl.neg) {
			return -basicValue
		} else {
			return basicValue
		}
	}

	static private def unparse(Double dValue) {
		val result = RigidBodiesFactory.eINSTANCE.createNumberLiteral

		result.neg = dValue < 0.0d
		result.value = Double.toString(Math.abs(dValue))

		return result
	}

	static def dispatch boolean isZero(AddExp ae) {
		val foldedExp = ae.foldConstants
		if (foldedExp instanceof NumberLiteral) {
			foldedExp.isZero
		} else {
			false
		}
	}

	static def dispatch boolean isZero(MultExp me) {
		val foldedExp = me.foldConstants
		if (foldedExp instanceof NumberLiteral) {
			foldedExp.isZero
		} else {
			false
		}
	}

	static def dispatch boolean isZero(ParenthesisedExp pe) { pe.exp.isZero }

	static def dispatch boolean isZero(ConstantOrFunctionCallExp cofce) { false }

	static def dispatch boolean isZero(NumberLiteral nl) { nl.parse == 0.0d }
}