package uk.ac.kcl.inf.robotics.generator

import java.util.ArrayList
import java.util.LinkedList
import java.util.List
import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix
import uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp
import uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType
import uk.ac.kcl.inf.robotics.rigidBodies.Body
import uk.ac.kcl.inf.robotics.rigidBodies.Connective
import uk.ac.kcl.inf.robotics.rigidBodies.Expression
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad
import uk.ac.kcl.inf.robotics.rigidBodies.Joint
import uk.ac.kcl.inf.robotics.rigidBodies.JointMovement
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeReference
import uk.ac.kcl.inf.robotics.rigidBodies.Mass
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessRef
import uk.ac.kcl.inf.robotics.rigidBodies.System

/**
 * Build up a joint tree representation of a given connective
 */
class ConnectiveTreeBuilder {
	public static class ConnectiveTree {
		Connective connective
		int   idx
		boolean isConstraint
		List<ConnectiveTree> children
		
		new (ExternalLoad load) {
			this.connective = load
			this.idx = -1
			this.isConstraint = false
			this.children = null
		}
		
		new (Connective c, int idx) {
			this (c, idx, false)
		}
		
		new (Connective c, int idx, boolean treatAsConstraint) {
			this (c, idx, treatAsConstraint, null)
		}
		
		new (Connective c, int idx, List<ConnectiveTree> children) {
			this (c, idx, false, children)
		}
		
		new (Connective c, int idx, boolean treatAsConstraint, List<ConnectiveTree> children) {
			this.connective = c
			this.idx = idx
			this.isConstraint = treatAsConstraint
			this.children = children
		}
		
		def getConnective() {
			connective
		}
		
		def getChildren() {
			children
		}
		
		def getIdx() {
			idx
		}
		
		def isConstraint() {
			isConstraint
		}
		
		def isLoad() {
			connective instanceof ExternalLoad
		}
		
		def isJoint() {
			(connective instanceof Joint) && !isConstraint
		}
	} 
	
	System system
	ConnectiveTree ctRoot
	
	List<Pair<String, Expression>> massValues = new LinkedList<Pair<String, Expression>>
	List<Pair<String, BaseMatrix>> inertias = new LinkedList<Pair<String, BaseMatrix>>
	
	List<Pair<String, BaseMatrix>> positions = new LinkedList<Pair<String, BaseMatrix>>
	List<Pair<Integer, Pair<String, Integer>>> lcCodeColumns = new LinkedList<Pair<Integer, Pair<String, Integer>>>
	
	List<Pair<String, BaseMatrix>> constraintPositions = new LinkedList<Pair<String, BaseMatrix>>
	List<Pair<Integer, Pair<String, Integer>>> constraintLcCodeColumns = new LinkedList<Pair<Integer, Pair<String, Integer>>>
	
	List<Pair<String, BaseMatrix>> loadPositions = new LinkedList<Pair<String, BaseMatrix>>
	List<Pair<Integer, Pair<String, Integer>>> loadLcCodeColumns = new LinkedList<Pair<Integer, Pair<String, Integer>>>
	
	List<Pair<String, List<JointMovement>>> jointStates = new LinkedList<Pair<String, List<JointMovement>>>
	List<Pair<String, List<JointMovement>>> constraintStates = new LinkedList<Pair<String, List<JointMovement>>>
	List<Pair<String, List<JointMovement>>> loadStates = new LinkedList<Pair<String, List<JointMovement>>>
	
	List<Pair<String, RelativeTransformation>> jointTransformations = new LinkedList<Pair<String, RelativeTransformation>>
	List<Pair<String, RelativeTransformation>> constraintTransformations = new LinkedList<Pair<String, RelativeTransformation>>
	
	List<Pair<String, List<BaseStiffnessExp>>> jointStiffnesses = new LinkedList<Pair<String, List<BaseStiffnessExp>>> 
	List<Pair<String, List<BaseStiffnessExp>>> constraintStiffnesses = new LinkedList<Pair<String, List<BaseStiffnessExp>>> 
	
	new (System s) {
		this.system = s
		
		ctRoot = generateConnectiveTree (getStartJoint, new LinkedList<Connective>, new LinkedList<Body>, #[0])
		
		traverseTree()
	}
	
	private def ConnectiveTree generateConnectiveTree (Connective start, List<Connective> connectiveList, List<Body> bodyList, int[] idx) {
		if (start instanceof Joint) {
			val curJoint = start as Joint
			
			if (connectiveList.contains (curJoint)) {
				idx.set (0, idx.get(0) + 1)
				return new ConnectiveTree (curJoint, idx.get(0))
			} else if (curJoint.body2.base || bodyList.contains (curJoint.body2.ref)) {
				// This is actually a constraint
				// Constraint joints don't get a new index. They will be stuffed at the end and never referenced by index. If we increment the index for them, we mess up the counting.
				return new ConnectiveTree (curJoint, -1, true)
			}
			else {
				// Build up the tree
				val nextTreeLayer = new ArrayList
				
				connectiveList.add (curJoint)
				bodyList.add(curJoint.body2.ref)
				idx.set (0, idx.get(0) + 1)
				var index = idx.get(0)
				
				getConnectiveFanOut(curJoint.body2.ref).forEach[j |
						var child = generateConnectiveTree(j, connectiveList, bodyList, idx)
						if (child != null) { 
							nextTreeLayer.add (child)
						}
					]
				
				return new ConnectiveTree (start, index, nextTreeLayer)
			}
		} else if (start instanceof ExternalLoad) {
			return new ConnectiveTree (start as ExternalLoad)
		}
	}
	
	// TODO Support start flag or remove it from the language
	private def getStartJoint() {
		system.elements.filter(Joint).findFirst[j|j.body1.base]
	}

	/**
	 * Find all Connectives that connect from the given body in the given system.
	 */
	private def getConnectiveFanOut(Body b) {
		system.elements.filter(Connective).filter[j | j.body1.ref == b]
	}
	
	// Traverse the connective tree and extract the various matrices required for matlab code 
	private def traverseTree() {
		ctRoot.traverse (null)
		// TODO: Add explicitly declared constraints to constraintLists.
	}
	
	private def void traverse (ConnectiveTree ct, ConnectiveTree parent) {
		ct.visit (parent)
		
		if (ct.children != null) {
			ct.children.forEach[c | c.traverse (ct)]
		}
	}
	
	private def visit (ConnectiveTree ct, ConnectiveTree parent) {
		var Pair<String, Integer> parentDesc 
		if (parent != null) {
			parentDesc = new Pair<String, Integer>(ct.connective.name + ' relative to ' + parent.connective.name, parent.idx)
		} else {
			parentDesc = new Pair<String, Integer>(ct.connective.name + ' relative to base', 0)
		}
		
		if (ct.isJoint) {
			val joint = (ct.connective as Joint)
			val Body bTgt = joint.body2.ref
			val Mass mTgt = bTgt.mass
			
			massValues.add (new Pair (bTgt.name, mTgt.value))
			inertias.add (new Pair(bTgt.name, mTgt.inertia.matrix))
			
			positions.add (new Pair("body " + bTgt.name, mTgt.position.matrix))
			lcCodeColumns.add (new Pair<Integer, Pair<String, Integer>> (0, parentDesc))
			
			jointStates.add (new Pair ("joint " + joint.name, joint.type.exp.toStateList))
			jointStiffnesses.add (new Pair ("joint " + joint.name, joint.type.exp.toStiffnessList))

			jointTransformations.add (new Pair ("joint" + joint.name, joint.relTrans1))			
		} else if (ct.isConstraint) {
			val joint = (ct.connective as Joint)
			// TODO: This seems wrong: How is the position of a constraint joint determined?
			val Body bTgt = joint.body1.ref
			val Mass mTgt = bTgt.mass

			constraintPositions.add (new Pair("body " + bTgt.name, mTgt.position.matrix))
			constraintLcCodeColumns.add (new Pair<Integer, Pair<String, Integer>> (1, parentDesc))

			constraintStates.add (new Pair ("constraint joint " + joint.name, joint.type.exp.toStateList))
			constraintStiffnesses.add (new Pair ("constraint joint " + joint.name, joint.type.exp.toStiffnessList))

			constraintTransformations.add (new Pair ("constraint joint" + joint.name, joint.relTrans1))
		} else {
			val load = ct.connective as ExternalLoad
			
			loadPositions.add (new Pair ("load " + load.name, load.position.matrix))			
			loadLcCodeColumns.add (new Pair<Integer, Pair<String, Integer>> (2, parentDesc))
			
			// TODO: Not sure I shouldn't be doing something else here...
			loadStates.add (new Pair ("load " + load.name, null))
		}
	}

	private def dispatch List<BaseStiffnessExp> toStiffnessList (AdditiveJointType ajt) {
		val List<BaseStiffnessExp> lResult = new LinkedList<BaseStiffnessExp>
		
		lResult.addAll (ajt.left.toStiffnessList)
		ajt.right.forEach[jte | lResult.addAll(jte.toStiffnessList)]
		
		return lResult
	}
	
	private def dispatch List<BaseStiffnessExp> toStiffnessList (JointTypeReference jtr) {
		val List<BaseStiffnessExp> lResult = new LinkedList<BaseStiffnessExp>
		
		lResult.addAll (jtr.ref.exp.toStiffnessList)
		
		return lResult
	}

	private def dispatch List<BaseStiffnessExp> toStiffnessList (BasicJointType bjt) {
		val List<BaseStiffnessExp> lResult = new LinkedList<BaseStiffnessExp>
		
		lResult.add (bjt.stiffness.resolve)
		
		return lResult
	}
	
	private def dispatch BaseStiffnessExp resolve (StiffnessRef sr) {
		sr.ref.resolve
	} 

	private def dispatch BaseStiffnessExp resolve (BaseStiffnessExp bse) {
		bse
	}

	private def dispatch List<JointMovement> toStateList (AdditiveJointType ajt) {
		val List<JointMovement> lResult = new LinkedList<JointMovement>
		
		lResult.addAll (ajt.left.toStateList)
		ajt.right.forEach[jte | lResult.addAll(jte.toStateList)]
		
		return lResult
	}
	
	private def dispatch List<JointMovement> toStateList (JointTypeReference jtr) {
		val List<JointMovement> lResult = new LinkedList<JointMovement>
		
		lResult.addAll (jtr.ref.exp.toStateList)
		
		return lResult
	}

	private def dispatch List<JointMovement> toStateList (BasicJointType bjt) {
		val List<JointMovement> lResult = new LinkedList<JointMovement>
		
		lResult.add (bjt.type)
		
		return lResult
	}

	private def dispatch getMatrix (BaseMatrix m) { m }
	
	private def dispatch getMatrix (MatrixRef mr) { mr.matrix }
	
	def getTree() { ctRoot }
	
	def getMasses() { massValues }
	
	def getInertias() { inertias }
	
	def getPositions() { positions }
	
	def getLcCodeColumns() { lcCodeColumns }

	def getConstraintPositions() { constraintPositions }
	
	def getConstraintLcCodeColumns() { constraintLcCodeColumns }

	def getLoadPositions() { loadPositions }
	
	def getLoadLcCodeColumns() { loadLcCodeColumns }

	List<Pair<String, List<JointMovement>>> allStates = null	
	
	def getStates() {
		if (allStates == null) {
			allStates = new LinkedList<Pair<String, List<JointMovement>>>(jointStates)
			allStates.addAll (constraintStates)
			allStates.addAll (loadStates) 
		}
		
		return allStates	
	}

	List<Pair<String, RelativeTransformation>> allTransformations = null 
		
	def getJointTransformations() {
		if (allTransformations == null) {
			allTransformations = new LinkedList<Pair<String, RelativeTransformation>>(jointTransformations)
			allTransformations.addAll(constraintTransformations)
			
			// Fill up with dummy values to make rendering simpler
			(0..<(states.size - allTransformations.size)).forEach[allTransformations.add (null)]			
		}
		
		return allTransformations
	}
	
	List<Pair<String, List<BaseStiffnessExp>>> allStiffnesses = null 
	
	def getStiffnesses() {
		if (allStiffnesses == null) {
			allStiffnesses = new LinkedList<Pair<String, List<BaseStiffnessExp>>> (jointStiffnesses)
			allStiffnesses.addAll (constraintStiffnesses)
		}
		
		return allStiffnesses
	}
}