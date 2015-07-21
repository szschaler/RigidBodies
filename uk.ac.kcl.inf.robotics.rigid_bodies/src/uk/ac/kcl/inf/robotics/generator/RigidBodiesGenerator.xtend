/*
 * generated by Xtext
 */
package uk.ac.kcl.inf.robotics.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import uk.ac.kcl.inf.robotics.rigidBodies.AddExp
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix
import uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp
import uk.ac.kcl.inf.robotics.rigidBodies.Environment
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef
import uk.ac.kcl.inf.robotics.rigidBodies.Model
import uk.ac.kcl.inf.robotics.rigidBodies.MultExp
import uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral
import uk.ac.kcl.inf.robotics.rigidBodies.ParenthesisedExp
import uk.ac.kcl.inf.robotics.rigidBodies.System

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RigidBodiesGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val model = resource.allContents.filter(Model).head
		resource.allContents.filter(System)
			.forEach [s | 
				fsa.generateFile ('''«s.name».m'''.toString(), s.generate(model.world))
			]
	}
	
	def generate(System system, Environment world) '''
		% EOM Simulation:
		clc
		clear all
		close all
		
		% Gravity vector
		g = [«world.gravity.renderValues»]
		
		% Inputs
		
		% Run program -- Should this really be generated?
		
		% EOM:
		[ M , T , Dd , fg , fj , rj , rc , vc , wc , ref , rcn ,  Tef , Tcn , Dcn , qf , uf ] = ...
			TMTEoM ( lc , m , I , j , jkd , g );

		% numerical simulation
		[ t , z , tfinal ] = SimEoM ( M , T , Dd , fg , fj , qf , uf , 1 );
		plot ( t , z );
		pause;
		
		% animation
		AnimEOM ( t , z , rj , qf , uf );
	'''
	
	def dispatch CharSequence renderValues (MatrixRef mr) {
		mr.matrix.renderValues
	}
	
	def dispatch CharSequence renderValues (BaseMatrix bm) {
		bm.values.join(', ', [v | v.render])
	}
	
	def dispatch CharSequence render (AddExp e) {
		'''«e.left.render» «(0..<e.op.size).join (' ', [idx | '''«e.op.get (idx)» «e.right.get(idx).render»'''])»'''	
	}
	
	def dispatch CharSequence render (MultExp e) 
		'''«e.left.render» «(0..<e.op.size).join (' ', [idx | '''«e.op.get (idx)» «e.right.get(idx).render»'''])»'''	
		
	def dispatch CharSequence render (ParenthesisedExp pe) 
		'''(«pe.exp.render»)'''
	
	def dispatch CharSequence render (NumberLiteral literal) 
		'''«if (literal.isNeg) {'''-'''}»«literal.value»'''
	
	def dispatch CharSequence render (ConstantOrFunctionCallExp cofce) 
		'''«cofce.label» «if (cofce.param.size > 0) {'''(«cofce.param.join (', ', [p | p.render])»)'''}»'''
}
