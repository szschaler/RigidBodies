package uk.ac.kcl.inf.robotics.generator

import java.util.ArrayList
import java.util.LinkedList
import java.util.List
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix
import uk.ac.kcl.inf.robotics.rigidBodies.Body
import uk.ac.kcl.inf.robotics.rigidBodies.Connective
import uk.ac.kcl.inf.robotics.rigidBodies.Expression
import uk.ac.kcl.inf.robotics.rigidBodies.Joint
import uk.ac.kcl.inf.robotics.rigidBodies.Mass
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef
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
	} 
	
	System system
	ConnectiveTree ctRoot
	
	List<Pair<String, Expression>> massValues = new LinkedList<Pair<String, Expression>>
	List<Pair<String, BaseMatrix>> inertias = new LinkedList<Pair<String, BaseMatrix>>
	List<Pair<String, BaseMatrix>> positions = new LinkedList<Pair<String, BaseMatrix>>
	List<Pair<Integer, Pair<String, Integer>>> lcCodeColumns = new LinkedList<Pair<Integer, Pair<String, Integer>>>
	List<Pair<String, BaseMatrix>> constraintPositions = new LinkedList<Pair<String, BaseMatrix>>
	List<Pair<Integer, Pair<String, Integer>>> constraintLcCodeColumns = new LinkedList<Pair<Integer, Pair<String, Integer>>>
	
	new (System s) {
		this.system = s
		
		ctRoot = generateConnectiveTree (getStartJoint, new LinkedList<Connective>, new LinkedList<Body>, #[0])
		
		traverseTree()
	}
	
	private def ConnectiveTreeBuilder.ConnectiveTree generateConnectiveTree (Connective start, List<Connective> connectiveList, List<Body> bodyList, int[] idx) {
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
				
				getJointFanOut(curJoint.body2.ref).forEach[j |
						var child = generateConnectiveTree(j, connectiveList, bodyList, idx)
						if (child != null) { 
							nextTreeLayer.add (child)
						}
					]
				
				return new ConnectiveTree (start, index, nextTreeLayer)
			}
		}
	}
	
	// TODO Support start flag or remove it from the language
	private def getStartJoint() {
		system.elements.filter(Joint).findFirst[j|j.body1.base]
	}

	/**
	 * Find all Joints that connect from the given body in the given system.
	 */
	private def getJointFanOut(Body b) {
		system.elements.filter(Joint).filter[j | j.body1.ref == b]
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
		if (!ct.isConstraint) {
			val Body bTgt = (ct.connective as Joint).body2.ref
			val Mass mTgt = bTgt.mass
			massValues.add (new Pair (bTgt.name, mTgt.value))
			inertias.add (new Pair(bTgt.name, mTgt.inertia.getMatrix))
			positions.add (new Pair("body " + bTgt.name, mTgt.position.getMatrix))
			var Pair<String, Integer> parentDesc 
			if (parent != null) {
				parentDesc = new Pair<String, Integer>(ct.connective.name + ' relative to ' + parent.connective.name, parent.idx)
			} else {
				parentDesc = new Pair<String, Integer>(ct.connective.name + ' relative to base', 0)
			}
			lcCodeColumns.add (new Pair<Integer, Pair<String, Integer>> (0, parentDesc))
		} else {
			// TODO: This seems wrong: How is the position of a constraint joint determined?
			val Body bTgt = (ct.connective as Joint).body1.ref
			val Mass mTgt = bTgt.mass
			constraintPositions.add (new Pair("body " + bTgt.name, mTgt.position.getMatrix))
			var Pair<String, Integer> parentDesc 
			if (parent != null) {
				parentDesc = new Pair<String, Integer>(ct.connective.name + ' relative to ' + parent.connective.name, parent.idx)
			} else {
				parentDesc = new Pair<String, Integer>(ct.connective.name + ' relative to base', 0)
			}
			constraintLcCodeColumns.add (new Pair<Integer, Pair<String, Integer>> (0, parentDesc))
		}
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
}