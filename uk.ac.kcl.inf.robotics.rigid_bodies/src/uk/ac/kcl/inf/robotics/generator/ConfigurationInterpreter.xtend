package uk.ac.kcl.inf.robotics.generator

import java.util.List
import uk.ac.kcl.inf.robotics.rigidBodies.Configuration
import uk.ac.kcl.inf.robotics.rigidBodies.System

class ConfigurationInterpreter {
	
	val Configuration config
	val List<Pair<String, System>> systemInstances
	
	new (Configuration config, List<Pair<String, System>> systemInstances) {
		this.config = config
		this.systemInstances = systemInstances
		
		// TODO Actually interpret configuration information
	}
	
	def getConfiguredSystem() {
		systemInstances.head.value
	}
}