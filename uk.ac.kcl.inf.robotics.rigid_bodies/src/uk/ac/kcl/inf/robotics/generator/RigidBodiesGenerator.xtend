/*
 * generated by Xtext
 */
package uk.ac.kcl.inf.robotics.generator

import java.util.regex.Pattern
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import uk.ac.kcl.inf.robotics.rigidBodies.AXIS
import uk.ac.kcl.inf.robotics.rigidBodies.AddExp
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix
import uk.ac.kcl.inf.robotics.rigidBodies.BasicReorientExpression
import uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp
import uk.ac.kcl.inf.robotics.rigidBodies.Environment
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef
import uk.ac.kcl.inf.robotics.rigidBodies.Model
import uk.ac.kcl.inf.robotics.rigidBodies.MultExp
import uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral
import uk.ac.kcl.inf.robotics.rigidBodies.ParenthesisedExp
import uk.ac.kcl.inf.robotics.rigidBodies.Planar
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientRef
import uk.ac.kcl.inf.robotics.rigidBodies.Reorientation
import uk.ac.kcl.inf.robotics.rigidBodies.Revolute
import uk.ac.kcl.inf.robotics.rigidBodies.System

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RigidBodiesGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val model = resource.allContents.filter(Model).head
		resource.allContents.filter(System).forEach [ s |
			fsa.generateFile('''«s.name».m''', generate(model.world, new ConnectiveTreeBuilder(s)))
		]
	}

	def generate(Environment world,
		ConnectiveTreeBuilder ctb
	) '''
		% EOM Simulation:
		clc
		clear all
		close all
		
		% Gravity vector
		g = [«world.gravity.renderValues (', ')»];
		
		% Inputs
		
		% Locations
		lc = [
			«ctb.generateLCContents»
		];
		
		% Mass values
		m = [
			« // Generate masses vector
		ctb.masses.join (',\n', [m | '''
					% «m.key»
					«m.value.render»'''])»];
		
		% Inertia values
		I = sym (zeros (3, 3, «ctb.inertias.size»));
		«(0..<ctb.inertias.size).join ('\n', [idx | '''
				% Inertia for body «ctb.inertias.get(idx).key»
				I (:, :, «idx + 1») = [
					«ctb.inertias.get(idx).value.renderValues (3)»];
			'''])»
		
		% Joint specifications
		j = sym (zeros («ctb.getMaxJRows», 5, «ctb.states.size»));
		«(0..<ctb.states.size).join ('\n', [ i | '''
				% Joint rotations for «ctb.states.get(i).key»
				j (:, :, «i + 1») = [
					«if (ctb.jointTransformations.get(i) != null) { ctb.jointTransformations.get(i).value.render }»
					«if (ctb.states.get(i).value != null) {
						ctb.states.get(i).value.join (';\n', [jm | jm.render ])
					 } else {
					 	'''0 0 0 0 0'''
					 }»];'''])»
		
		% Stiffness data
		jkd = sym (zeros (3, 2, «ctb.stiffnesses.fold (0, [acc, s | acc + s.value.size ])»));
		«val i = new IntHolder»
		«ctb.stiffnesses.join('\n', [stiff | '''
				% Stiffness values for «stiff.key»
				«stiff.value.join ('\n', [s | '''
					jkd (1, :, «i.value») = [ «s.springCoeff.render» «s.springInit.render» ];
					jkd (2, 1, «i.value») = «s.dampViscous.render»;
					jkd (3, 1, «i.value++») = «s.dampCoulomb.render»;
					'''])»
			'''])»
		
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
	
	def getMaxJRows (ConnectiveTreeBuilder ctb) {
		(0..<ctb.states.size).fold(1, [acc, idx |
				val statesList = ctb.states.get(idx).value
				val transformation = ctb.jointTransformations.get(idx)
				var curLen = 0
				if (statesList != null) { curLen = statesList.size }
				if (transformation != null) { curLen += transformation.value.reorient.size }
				
				Math.max (acc, curLen)
			])	
	}
	
	def generateLCContents (ConnectiveTreeBuilder ctb) {
		val positionEntries = (0..<ctb.positions.size).join (';\n', [ i | '''
				% Position data from «ctb.positions.get(i).key» for a joint «ctb.lcCodeColumns.get(i).value.key»
				«ctb.positions.get(i).value.renderValues (' ')» «ctb.lcCodeColumns.get(i).key» «ctb.lcCodeColumns.get(i).value.value»'''])
		val posSemicolon = if (ctb.positions.size > 0) { ";\n" } else { "" }
		val constraintPositionEntries = (0..<ctb.constraintPositions.size).join (';\n', [ i | '''
				% Position data from «ctb.constraintPositions.get(i).key» for a constraint «ctb.constraintLcCodeColumns.get(i).value.key»
				% TODO: Check with Hadi that we're using the correct position data here.
				«ctb.constraintPositions.get(i).value.renderValues (' ')» «ctb.constraintLcCodeColumns.get(i).key» «ctb.constraintLcCodeColumns.get(i).value.value»'''])
		val consSemicolon = if (ctb.constraintPositions.size > 0) { ";\n" } else { "" }
		val loadPositionEntries = (0..<ctb.loadPositions.size).join (';\n', [ i | '''
				% Position data from «ctb.loadPositions.get(i).key» for a load «ctb.loadLcCodeColumns.get(i).value.key»
				«ctb.loadPositions.get(i).value.renderValues (' ')» «ctb.loadLcCodeColumns.get(i).key» «ctb.loadLcCodeColumns.get(i).value.value»'''])
		val loadSemicolon = if (ctb.loadPositions.size > 0) { ";\n" } else { "" }
				
		return positionEntries + posSemicolon + constraintPositionEntries + consSemicolon + loadPositionEntries + loadSemicolon
	}

	def dispatch CharSequence render(RelativeTransformation rt) '''
		«if (!rt.position.isAllZero) {'''0 0 «rt.position.renderValues(' ')»;
		                              '''}»«rt.reorient.render»'''

	def dispatch int size(ReorientRef rr) {
		rr.ref.size
	}

	def dispatch int size(Reorientation r) {
		r.exp.size
	}

	def dispatch int size(BasicReorientExpression bre) {
		bre.axis.size + 1
	}

	def dispatch CharSequence render(ReorientRef rr) {
		rr.ref.render
	}

	def dispatch CharSequence render(Reorientation r) {
		r.exp.render
	}

	def dispatch CharSequence render(BasicReorientExpression bre) {
		(0 ..< bre.axis.size).join(';\n', [ idx |
			'''«bre.axis.get(idx).render» «bre.value.get(idx).render» 0 0 0'''
		])
	}

	def dispatch CharSequence render(
		Planar p
	) '''0 0 «if (p.axis == AXIS.X) 'inf' else '0'» «if (p.axis == AXIS.Y) 'inf' else '0'» «if (p.axis == AXIS.Z) 'inf'else '0'»'''

	def dispatch CharSequence render(Revolute r) '''«r.axis.render» inf 0 0 0'''

	def dispatch CharSequence render(AXIS a) {
		switch (a) {
			case AXIS.X: '1'
			case AXIS.Y: '2'
			case AXIS.Z: '3'
		}
	}

	def dispatch boolean isAllZero (MatrixRef mr) {
		mr.matrix.isAllZero
	}
	
	def dispatch boolean isAllZero(BaseMatrix bm) {
		bm.values.forall[v | v.isZero]
	}

	// TODO: Should probably do constant folding etc.
	def dispatch boolean isZero (AddExp ae) { false }
	def dispatch boolean isZero (MultExp me) { false }
	def dispatch boolean isZero (ParenthesisedExp pe) { pe.exp.isZero }
	def dispatch boolean isZero (ConstantOrFunctionCallExp cofce) { false }
	
	private static final Pattern pZeroLiteral = Pattern.compile ("\\A0+\\.0+([eE][+-]?\\d*)?\\Z")
	def dispatch boolean isZero (NumberLiteral nl) { pZeroLiteral.matcher (nl.value).matches }

	def dispatch CharSequence renderValues(MatrixRef mr, CharSequence sep) {
		mr.matrix.renderValues(sep)
	}

	def dispatch CharSequence renderValues(BaseMatrix bm, CharSequence sep) {
		bm.values.join(sep, [v|v.render])
	}

	def dispatch CharSequence renderValues(BaseMatrix bm, int rowLength) {
		(0 ..< bm.values.size / rowLength).join(';\n', [ y |
			(0 ..< rowLength).join(' ', [x|bm.values.get(y * rowLength + x).render])
		])
	}

	def dispatch CharSequence render(AddExp e) {
		'''«e.left.render»«(0..<e.op.size).join ('', [idx | '''«e.op.get (idx)»«e.right.get(idx).render»'''])»'''
	}

	def dispatch CharSequence render(
		MultExp e
	) '''«e.left.render»«(0..<e.op.size).join ('', [idx | '''«e.op.get (idx)»«e.right.get(idx).render»'''])»'''

	def dispatch CharSequence render(ParenthesisedExp pe) '''(«pe.exp.render»)'''

	def dispatch CharSequence render(
		NumberLiteral literal) '''«if (literal.isNeg) {'''-'''}»«literal.value»'''

	def dispatch CharSequence render(
		ConstantOrFunctionCallExp cofce
	) '''«cofce.label»«if (cofce.param.size > 0) {'''(«cofce.param.join (',', [p | p.render])»)'''}»'''

	// I know this is silly, but Xtend is a bit too cautious when dealing with final variables...
	private static class IntHolder {
		public int value = 1
	}
}
