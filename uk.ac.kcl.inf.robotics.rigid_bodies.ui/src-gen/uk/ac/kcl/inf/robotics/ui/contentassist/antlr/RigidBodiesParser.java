/*
 * generated by Xtext
 */
package uk.ac.kcl.inf.robotics.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import uk.ac.kcl.inf.robotics.services.RigidBodiesGrammarAccess;

public class RigidBodiesParser extends AbstractContentAssistParser {
	
	@Inject
	private RigidBodiesGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected uk.ac.kcl.inf.robotics.ui.contentassist.antlr.internal.InternalRigidBodiesParser createParser() {
		uk.ac.kcl.inf.robotics.ui.contentassist.antlr.internal.InternalRigidBodiesParser result = new uk.ac.kcl.inf.robotics.ui.contentassist.antlr.internal.InternalRigidBodiesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInitialDefinitionAccess().getAlternatives(), "rule__InitialDefinition__Alternatives");
					put(grammarAccess.getSystemElementAccess().getAlternatives(), "rule__SystemElement__Alternatives");
					put(grammarAccess.getBodyReferenceAccess().getAlternatives(), "rule__BodyReference__Alternatives");
					put(grammarAccess.getJointTypeExpressionAccess().getAlternatives(), "rule__JointTypeExpression__Alternatives");
					put(grammarAccess.getReorientExpressionAccess().getAlternatives(), "rule__ReorientExpression__Alternatives");
					put(grammarAccess.getMatrixAccess().getAlternatives(), "rule__Matrix__Alternatives");
					put(grammarAccess.getAddExpAccess().getOpAlternatives_1_1_0(), "rule__AddExp__OpAlternatives_1_1_0");
					put(grammarAccess.getMultExpAccess().getOpAlternatives_1_1_0(), "rule__MultExp__OpAlternatives_1_1_0");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getAXISAccess().getAlternatives(), "rule__AXIS__Alternatives");
					put(grammarAccess.getConstraintTypeAccess().getAlternatives(), "rule__ConstraintType__Alternatives");
					put(grammarAccess.getLoadTypeAccess().getAlternatives(), "rule__LoadType__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getEnvironmentAccess().getGroup(), "rule__Environment__Group__0");
					put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
					put(grammarAccess.getBodyAccess().getGroup(), "rule__Body__Group__0");
					put(grammarAccess.getMassAccess().getGroup(), "rule__Mass__Group__0");
					put(grammarAccess.getJointAccess().getGroup(), "rule__Joint__Group__0");
					put(grammarAccess.getJointTypeAccess().getGroup(), "rule__JointType__Group__0");
					put(grammarAccess.getJointTypeAccess().getGroup_0(), "rule__JointType__Group_0__0");
					put(grammarAccess.getJointTypeExpressionAccess().getGroup_1(), "rule__JointTypeExpression__Group_1__0");
					put(grammarAccess.getJointTypeExpressionAccess().getGroup_1_3(), "rule__JointTypeExpression__Group_1_3__0");
					put(grammarAccess.getJointTypeExpressionAccess().getGroup_2(), "rule__JointTypeExpression__Group_2__0");
					put(grammarAccess.getJointTypeExpressionAccess().getGroup_2_3(), "rule__JointTypeExpression__Group_2_3__0");
					put(grammarAccess.getRelativeTransformationAccess().getGroup(), "rule__RelativeTransformation__Group__0");
					put(grammarAccess.getReorientationAccess().getGroup(), "rule__Reorientation__Group__0");
					put(grammarAccess.getReorientationAccess().getGroup_0(), "rule__Reorientation__Group_0__0");
					put(grammarAccess.getReorientExpressionAccess().getGroup_1(), "rule__ReorientExpression__Group_1__0");
					put(grammarAccess.getReorientExpressionAccess().getGroup_1_2(), "rule__ReorientExpression__Group_1_2__0");
					put(grammarAccess.getReorientExpressionAccess().getGroup_1_2_5(), "rule__ReorientExpression__Group_1_2_5__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getExternalLoadAccess().getGroup(), "rule__ExternalLoad__Group__0");
					put(grammarAccess.getBaseMatrixAccess().getGroup(), "rule__BaseMatrix__Group__0");
					put(grammarAccess.getBaseMatrixAccess().getGroup_0(), "rule__BaseMatrix__Group_0__0");
					put(grammarAccess.getBaseMatrixAccess().getGroup_3(), "rule__BaseMatrix__Group_3__0");
					put(grammarAccess.getAddExpAccess().getGroup(), "rule__AddExp__Group__0");
					put(grammarAccess.getAddExpAccess().getGroup_1(), "rule__AddExp__Group_1__0");
					put(grammarAccess.getMultExpAccess().getGroup(), "rule__MultExp__Group__0");
					put(grammarAccess.getMultExpAccess().getGroup_1(), "rule__MultExp__Group_1__0");
					put(grammarAccess.getParenthesisedExpAccess().getGroup(), "rule__ParenthesisedExp__Group__0");
					put(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup(), "rule__ConstantOrFunctionCallExp__Group__0");
					put(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup_1(), "rule__ConstantOrFunctionCallExp__Group_1__0");
					put(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup_1_2(), "rule__ConstantOrFunctionCallExp__Group_1_2__0");
					put(grammarAccess.getNumberLiteralAccess().getGroup(), "rule__NumberLiteral__Group__0");
					put(grammarAccess.getModelAccess().getDefsAssignment_0(), "rule__Model__DefsAssignment_0");
					put(grammarAccess.getModelAccess().getWorldAssignment_1(), "rule__Model__WorldAssignment_1");
					put(grammarAccess.getModelAccess().getBodiesAssignment_2(), "rule__Model__BodiesAssignment_2");
					put(grammarAccess.getEnvironmentAccess().getGravityAssignment_3(), "rule__Environment__GravityAssignment_3");
					put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
					put(grammarAccess.getSystemAccess().getElementsAssignment_3(), "rule__System__ElementsAssignment_3");
					put(grammarAccess.getBodyAccess().getNameAssignment_1(), "rule__Body__NameAssignment_1");
					put(grammarAccess.getBodyAccess().getMassAssignment_3(), "rule__Body__MassAssignment_3");
					put(grammarAccess.getBodyReferenceAccess().getBaseAssignment_0(), "rule__BodyReference__BaseAssignment_0");
					put(grammarAccess.getBodyReferenceAccess().getRefAssignment_1(), "rule__BodyReference__RefAssignment_1");
					put(grammarAccess.getMassAccess().getValueAssignment_3(), "rule__Mass__ValueAssignment_3");
					put(grammarAccess.getMassAccess().getPositionAssignment_5(), "rule__Mass__PositionAssignment_5");
					put(grammarAccess.getMassAccess().getInertiaAssignment_7(), "rule__Mass__InertiaAssignment_7");
					put(grammarAccess.getJointAccess().getNameAssignment_1(), "rule__Joint__NameAssignment_1");
					put(grammarAccess.getJointAccess().getTypeAssignment_3(), "rule__Joint__TypeAssignment_3");
					put(grammarAccess.getJointAccess().getIsStartAssignment_4(), "rule__Joint__IsStartAssignment_4");
					put(grammarAccess.getJointAccess().getBody1Assignment_6(), "rule__Joint__Body1Assignment_6");
					put(grammarAccess.getJointAccess().getRelTrans1Assignment_7(), "rule__Joint__RelTrans1Assignment_7");
					put(grammarAccess.getJointAccess().getBody2Assignment_9(), "rule__Joint__Body2Assignment_9");
					put(grammarAccess.getJointAccess().getRelTrans2Assignment_10(), "rule__Joint__RelTrans2Assignment_10");
					put(grammarAccess.getJointAccess().getSpringCoeffAssignment_14(), "rule__Joint__SpringCoeffAssignment_14");
					put(grammarAccess.getJointAccess().getSpringInitAssignment_16(), "rule__Joint__SpringInitAssignment_16");
					put(grammarAccess.getJointAccess().getDampViscousAssignment_18(), "rule__Joint__DampViscousAssignment_18");
					put(grammarAccess.getJointAccess().getDampCoulombAssignment_20(), "rule__Joint__DampCoulombAssignment_20");
					put(grammarAccess.getJointTypeAccess().getNameAssignment_0_2(), "rule__JointType__NameAssignment_0_2");
					put(grammarAccess.getJointTypeAccess().getExpAssignment_1(), "rule__JointType__ExpAssignment_1");
					put(grammarAccess.getJointTypeExpressionAccess().getRefAssignment_0(), "rule__JointTypeExpression__RefAssignment_0");
					put(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_1_2(), "rule__JointTypeExpression__AxisAssignment_1_2");
					put(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_1_3_1(), "rule__JointTypeExpression__AxisAssignment_1_3_1");
					put(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_2_2(), "rule__JointTypeExpression__AxisAssignment_2_2");
					put(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_2_3_1(), "rule__JointTypeExpression__AxisAssignment_2_3_1");
					put(grammarAccess.getRelativeTransformationAccess().getPositionAssignment_4(), "rule__RelativeTransformation__PositionAssignment_4");
					put(grammarAccess.getRelativeTransformationAccess().getReorientAssignment_6(), "rule__RelativeTransformation__ReorientAssignment_6");
					put(grammarAccess.getReorientationAccess().getNameAssignment_0_1(), "rule__Reorientation__NameAssignment_0_1");
					put(grammarAccess.getReorientationAccess().getExpAssignment_1(), "rule__Reorientation__ExpAssignment_1");
					put(grammarAccess.getReorientExpressionAccess().getRefAssignment_0(), "rule__ReorientExpression__RefAssignment_0");
					put(grammarAccess.getReorientExpressionAccess().getAxisAssignment_1_2_1(), "rule__ReorientExpression__AxisAssignment_1_2_1");
					put(grammarAccess.getReorientExpressionAccess().getValueAssignment_1_2_3(), "rule__ReorientExpression__ValueAssignment_1_2_3");
					put(grammarAccess.getReorientExpressionAccess().getAxisAssignment_1_2_5_2(), "rule__ReorientExpression__AxisAssignment_1_2_5_2");
					put(grammarAccess.getReorientExpressionAccess().getValueAssignment_1_2_5_4(), "rule__ReorientExpression__ValueAssignment_1_2_5_4");
					put(grammarAccess.getConstraintAccess().getNameAssignment_1(), "rule__Constraint__NameAssignment_1");
					put(grammarAccess.getConstraintAccess().getTypeAssignment_3(), "rule__Constraint__TypeAssignment_3");
					put(grammarAccess.getConstraintAccess().getBody1Assignment_5(), "rule__Constraint__Body1Assignment_5");
					put(grammarAccess.getConstraintAccess().getRelTrans1Assignment_6(), "rule__Constraint__RelTrans1Assignment_6");
					put(grammarAccess.getConstraintAccess().getBody2Assignment_8(), "rule__Constraint__Body2Assignment_8");
					put(grammarAccess.getConstraintAccess().getRelTrans2Assignment_9(), "rule__Constraint__RelTrans2Assignment_9");
					put(grammarAccess.getExternalLoadAccess().getNameAssignment_2(), "rule__ExternalLoad__NameAssignment_2");
					put(grammarAccess.getExternalLoadAccess().getTypeAssignment_4(), "rule__ExternalLoad__TypeAssignment_4");
					put(grammarAccess.getExternalLoadAccess().getBodyAssignment_6(), "rule__ExternalLoad__BodyAssignment_6");
					put(grammarAccess.getExternalLoadAccess().getRelTrans1Assignment_7(), "rule__ExternalLoad__RelTrans1Assignment_7");
					put(grammarAccess.getBaseMatrixAccess().getNameAssignment_0_1(), "rule__BaseMatrix__NameAssignment_0_1");
					put(grammarAccess.getBaseMatrixAccess().getValuesAssignment_2(), "rule__BaseMatrix__ValuesAssignment_2");
					put(grammarAccess.getBaseMatrixAccess().getValuesAssignment_3_1(), "rule__BaseMatrix__ValuesAssignment_3_1");
					put(grammarAccess.getMatrixRefAccess().getMatrixAssignment(), "rule__MatrixRef__MatrixAssignment");
					put(grammarAccess.getAddExpAccess().getOpAssignment_1_1(), "rule__AddExp__OpAssignment_1_1");
					put(grammarAccess.getAddExpAccess().getRightAssignment_1_2(), "rule__AddExp__RightAssignment_1_2");
					put(grammarAccess.getMultExpAccess().getOpAssignment_1_1(), "rule__MultExp__OpAssignment_1_1");
					put(grammarAccess.getMultExpAccess().getRightAssignment_1_2(), "rule__MultExp__RightAssignment_1_2");
					put(grammarAccess.getParenthesisedExpAccess().getExpAssignment_1(), "rule__ParenthesisedExp__ExpAssignment_1");
					put(grammarAccess.getConstantOrFunctionCallExpAccess().getLabelAssignment_0(), "rule__ConstantOrFunctionCallExp__LabelAssignment_0");
					put(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAssignment_1_1(), "rule__ConstantOrFunctionCallExp__ParamAssignment_1_1");
					put(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAssignment_1_2_1(), "rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1");
					put(grammarAccess.getNumberLiteralAccess().getNegAssignment_0(), "rule__NumberLiteral__NegAssignment_0");
					put(grammarAccess.getNumberLiteralAccess().getValueAssignment_1(), "rule__NumberLiteral__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			uk.ac.kcl.inf.robotics.ui.contentassist.antlr.internal.InternalRigidBodiesParser typedParser = (uk.ac.kcl.inf.robotics.ui.contentassist.antlr.internal.InternalRigidBodiesParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RigidBodiesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RigidBodiesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
