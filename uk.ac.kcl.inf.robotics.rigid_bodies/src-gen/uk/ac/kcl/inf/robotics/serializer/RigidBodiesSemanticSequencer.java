/*
 * generated by Xtext
 */
package uk.ac.kcl.inf.robotics.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.inf.robotics.rigidBodies.AddExp;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp;
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint;
import uk.ac.kcl.inf.robotics.rigidBodies.Environment;
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef;
import uk.ac.kcl.inf.robotics.rigidBodies.Model;
import uk.ac.kcl.inf.robotics.rigidBodies.MultExp;
import uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.Reorientation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.services.RigidBodiesGrammarAccess;

@SuppressWarnings("all")
public class RigidBodiesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RigidBodiesGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RigidBodiesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RigidBodiesPackage.ADD_EXP:
				sequence_AddExp(context, (AddExp) semanticObject); 
				return; 
			case RigidBodiesPackage.BASE_MATRIX:
				sequence_BaseMatrix(context, (BaseMatrix) semanticObject); 
				return; 
			case RigidBodiesPackage.BODY:
				sequence_Body(context, (Body) semanticObject); 
				return; 
			case RigidBodiesPackage.CONSTANT_OR_FUNCTION_CALL_EXP:
				sequence_ConstantOrFunctionCallExp(context, (ConstantOrFunctionCallExp) semanticObject); 
				return; 
			case RigidBodiesPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case RigidBodiesPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case RigidBodiesPackage.EXTERNAL_LOAD:
				sequence_ExternalLoad(context, (ExternalLoad) semanticObject); 
				return; 
			case RigidBodiesPackage.JOINT:
				sequence_Joint(context, (Joint) semanticObject); 
				return; 
			case RigidBodiesPackage.JOINT_TYPE:
				sequence_JointType(context, (JointType) semanticObject); 
				return; 
			case RigidBodiesPackage.JOINT_TYPE_EXPRESSION:
				sequence_JointTypeExpression(context, (JointTypeExpression) semanticObject); 
				return; 
			case RigidBodiesPackage.MASS:
				sequence_Mass(context, (Mass) semanticObject); 
				return; 
			case RigidBodiesPackage.MATRIX_REF:
				sequence_MatrixRef(context, (MatrixRef) semanticObject); 
				return; 
			case RigidBodiesPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RigidBodiesPackage.MULT_EXP:
				sequence_MultExp(context, (MultExp) semanticObject); 
				return; 
			case RigidBodiesPackage.NUMBER_LITERAL:
				sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
				return; 
			case RigidBodiesPackage.RELATIVE_TRANSFORMATION:
				sequence_RelativeTransformation(context, (RelativeTransformation) semanticObject); 
				return; 
			case RigidBodiesPackage.REORIENT_EXPRESSION:
				sequence_ReorientExpression(context, (ReorientExpression) semanticObject); 
				return; 
			case RigidBodiesPackage.REORIENTATION:
				sequence_Reorientation(context, (Reorientation) semanticObject); 
				return; 
			case RigidBodiesPackage.SYSTEM:
				sequence_System(context, (uk.ac.kcl.inf.robotics.rigidBodies.System) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=AddExp_AddExp_1_0 (op+='+' | op+='-') right=MultExp)
	 */
	protected void sequence_AddExp(EObject context, AddExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? values+=AddExp values+=AddExp*)
	 */
	protected void sequence_BaseMatrix(EObject context, BaseMatrix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID mass=Mass)
	 */
	protected void sequence_Body(EObject context, Body semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.SYSTEM_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.SYSTEM_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.BODY__MASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.BODY__MASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBodyAccess().getMassMassParserRuleCall_3_0(), semanticObject.getMass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=ID (param+=AddExp param+=AddExp*)?)
	 */
	protected void sequence_ConstantOrFunctionCallExp(EObject context, ConstantOrFunctionCallExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=ConstraintType 
	 *         body1=[Body|ID] 
	 *         relTrans1=RelativeTransformation 
	 *         body2=[Body|ID] 
	 *         relTrans2=RelativeTransformation
	 *     )
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.SYSTEM_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.SYSTEM_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.CONSTRAINT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.CONSTRAINT__TYPE));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.CONSTRAINT__BODY1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.CONSTRAINT__BODY1));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.CONSTRAINT__REL_TRANS1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.CONSTRAINT__REL_TRANS1));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.CONSTRAINT__BODY2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.CONSTRAINT__BODY2));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.CONSTRAINT__REL_TRANS2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.CONSTRAINT__REL_TRANS2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConstraintAccess().getBody1BodyIDTerminalRuleCall_5_0_1(), semanticObject.getBody1());
		feeder.accept(grammarAccess.getConstraintAccess().getRelTrans1RelativeTransformationParserRuleCall_6_0(), semanticObject.getRelTrans1());
		feeder.accept(grammarAccess.getConstraintAccess().getBody2BodyIDTerminalRuleCall_8_0_1(), semanticObject.getBody2());
		feeder.accept(grammarAccess.getConstraintAccess().getRelTrans2RelativeTransformationParserRuleCall_9_0(), semanticObject.getRelTrans2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     gravity=Matrix
	 */
	protected void sequence_Environment(EObject context, Environment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.ENVIRONMENT__GRAVITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.ENVIRONMENT__GRAVITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnvironmentAccess().getGravityMatrixParserRuleCall_3_0(), semanticObject.getGravity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=LoadType 
	 *         body1=[Body|ID] 
	 *         relTrans1=RelativeTransformation 
	 *         body2=[Body|ID] 
	 *         relTrans2=RelativeTransformation
	 *     )
	 */
	protected void sequence_ExternalLoad(EObject context, ExternalLoad semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.SYSTEM_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.SYSTEM_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.EXTERNAL_LOAD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.EXTERNAL_LOAD__TYPE));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.EXTERNAL_LOAD__BODY1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.EXTERNAL_LOAD__BODY1));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.EXTERNAL_LOAD__REL_TRANS1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.EXTERNAL_LOAD__REL_TRANS1));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.EXTERNAL_LOAD__BODY2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.EXTERNAL_LOAD__BODY2));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.EXTERNAL_LOAD__REL_TRANS2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.EXTERNAL_LOAD__REL_TRANS2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalLoadAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExternalLoadAccess().getTypeLoadTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getExternalLoadAccess().getBody1BodyIDTerminalRuleCall_6_0_1(), semanticObject.getBody1());
		feeder.accept(grammarAccess.getExternalLoadAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0(), semanticObject.getRelTrans1());
		feeder.accept(grammarAccess.getExternalLoadAccess().getBody2BodyIDTerminalRuleCall_9_0_1(), semanticObject.getBody2());
		feeder.accept(grammarAccess.getExternalLoadAccess().getRelTrans2RelativeTransformationParserRuleCall_10_0(), semanticObject.getRelTrans2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref=[JointType|ID] | (axis+=AXIS axis+=AXIS*) | (axis+=AXIS axis+=AXIS*))
	 */
	protected void sequence_JointTypeExpression(EObject context, JointTypeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? exp=JointTypeExpression)
	 */
	protected void sequence_JointType(EObject context, JointType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=JointType 
	 *         isStart?='start'? 
	 *         body1=[Body|ID] 
	 *         relTrans1=RelativeTransformation 
	 *         body2=[Body|ID] 
	 *         relTrans2=RelativeTransformation 
	 *         springCoeff=AddExp 
	 *         springInit=AddExp 
	 *         dampViscous=AddExp 
	 *         dampCoulomb=AddExp
	 *     )
	 */
	protected void sequence_Joint(EObject context, Joint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=AddExp position=Matrix inertia=Matrix)
	 */
	protected void sequence_Mass(EObject context, Mass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.MASS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.MASS__VALUE));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.MASS__POSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.MASS__POSITION));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.MASS__INERTIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.MASS__INERTIA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMassAccess().getValueAddExpParserRuleCall_3_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getMassAccess().getPositionMatrixParserRuleCall_5_0(), semanticObject.getPosition());
		feeder.accept(grammarAccess.getMassAccess().getInertiaMatrixParserRuleCall_7_0(), semanticObject.getInertia());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     matrix=[BaseMatrix|ID]
	 */
	protected void sequence_MatrixRef(EObject context, MatrixRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.MATRIX_REF__MATRIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.MATRIX_REF__MATRIX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatrixRefAccess().getMatrixBaseMatrixIDTerminalRuleCall_0_1(), semanticObject.getMatrix());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (defs+=InitialDefinition* world=Environment bodies+=System+)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultExp_MultExp_1_0 (op+='*' | op+='/') right=Primary)
	 */
	protected void sequence_MultExp(EObject context, MultExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (neg?='-'? value=REAL)
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (position=Matrix reorient=Reorientation)
	 */
	protected void sequence_RelativeTransformation(EObject context, RelativeTransformation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.RELATIVE_TRANSFORMATION__POSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.RELATIVE_TRANSFORMATION__POSITION));
			if(transientValues.isValueTransient(semanticObject, RigidBodiesPackage.Literals.RELATIVE_TRANSFORMATION__REORIENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RigidBodiesPackage.Literals.RELATIVE_TRANSFORMATION__REORIENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelativeTransformationAccess().getPositionMatrixParserRuleCall_4_0(), semanticObject.getPosition());
		feeder.accept(grammarAccess.getRelativeTransformationAccess().getReorientReorientationParserRuleCall_6_0(), semanticObject.getReorient());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref=[Reorientation|ID] | (axis+=AXIS value+=AddExp (axis+=AXIS value+=AddExp)*))
	 */
	protected void sequence_ReorientExpression(EObject context, ReorientExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? exp=ReorientExpression)
	 */
	protected void sequence_Reorientation(EObject context, Reorientation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=SystemElement+)
	 */
	protected void sequence_System(EObject context, uk.ac.kcl.inf.robotics.rigidBodies.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
