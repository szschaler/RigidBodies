package uk.ac.kcl.inf.robotics.generator

import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil
import uk.ac.kcl.inf.robotics.rigidBodies.Configuration
import uk.ac.kcl.inf.robotics.rigidBodies.ConfigurationStatement
import uk.ac.kcl.inf.robotics.rigidBodies.Joint
import uk.ac.kcl.inf.robotics.rigidBodies.LockJointStatement
import uk.ac.kcl.inf.robotics.rigidBodies.System

class ConfigurationInterpreter {
	
	val Configuration config
	val EcoreUtil.Copier copier
	
	new (Configuration config, List<Pair<String, System>> systemInstances) {
		this.config = config

		// Make a copy of the systems so that we can modify them as needed
		copier = new EcoreUtil.Copier()
		systemInstances.forEach[p | 
			copier.copy(p.value)
		]
		copier.copyReferences();
		
		configureSystems (copier)		
	}
	
	def getConfiguredSystem() {
		copier.values.head as System
	}
	
	private def configureSystems (EcoreUtil.Copier copier) {
		config.statements.forEach[stmt |
			stmt.doConfigure (copier)
		]
	}
	
	private dispatch def doConfigure (ConfigurationStatement ls, EcoreUtil.Copier copier) {}
	
	private dispatch def doConfigure (LockJointStatement ls, EcoreUtil.Copier copier) {
		val Joint jointToModify = copier.get (ls.joint) as Joint 
		
		// TODO How do I actually express a completely locked joint? What's the right joint type?
	}
}