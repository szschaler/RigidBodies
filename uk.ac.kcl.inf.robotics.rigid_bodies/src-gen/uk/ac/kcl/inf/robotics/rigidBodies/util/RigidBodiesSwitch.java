/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.inf.robotics.rigidBodies.AddExp;
import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition;
import uk.ac.kcl.inf.robotics.rigidBodies.Connective;
import uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp;
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint;
import uk.ac.kcl.inf.robotics.rigidBodies.Environment;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad;
import uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointMovement;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeReference;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef;
import uk.ac.kcl.inf.robotics.rigidBodies.Model;
import uk.ac.kcl.inf.robotics.rigidBodies.MultExp;
import uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral;
import uk.ac.kcl.inf.robotics.rigidBodies.ParenthesisedExp;
import uk.ac.kcl.inf.robotics.rigidBodies.Planar;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientRef;
import uk.ac.kcl.inf.robotics.rigidBodies.Reorientation;
import uk.ac.kcl.inf.robotics.rigidBodies.Revolute;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.State;
import uk.ac.kcl.inf.robotics.rigidBodies.StateDef;
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessExp;
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessRef;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage
 * @generated
 */
public class RigidBodiesSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RigidBodiesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RigidBodiesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RigidBodiesPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RigidBodiesPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.INITIAL_DEFINITION:
      {
        InitialDefinition initialDefinition = (InitialDefinition)theEObject;
        T result = caseInitialDefinition(initialDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.ENVIRONMENT:
      {
        Environment environment = (Environment)theEObject;
        T result = caseEnvironment(environment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.SYSTEM:
      {
        uk.ac.kcl.inf.robotics.rigidBodies.System system = (uk.ac.kcl.inf.robotics.rigidBodies.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.STATE_DEF:
      {
        StateDef stateDef = (StateDef)theEObject;
        T result = caseStateDef(stateDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.SYSTEM_INSTANTIATION:
      {
        SystemInstantiation systemInstantiation = (SystemInstantiation)theEObject;
        T result = caseSystemInstantiation(systemInstantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.SYSTEM_ELEMENT:
      {
        SystemElement systemElement = (SystemElement)theEObject;
        T result = caseSystemElement(systemElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.CONNECTIVE:
      {
        Connective connective = (Connective)theEObject;
        T result = caseConnective(connective);
        if (result == null) result = caseSystemElement(connective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = caseSystemElement(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.BODY_REFERENCE:
      {
        BodyReference bodyReference = (BodyReference)theEObject;
        T result = caseBodyReference(bodyReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.BODY_REPETITION:
      {
        BodyRepetition bodyRepetition = (BodyRepetition)theEObject;
        T result = caseBodyRepetition(bodyRepetition);
        if (result == null) result = caseSystemElement(bodyRepetition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.MASS:
      {
        Mass mass = (Mass)theEObject;
        T result = caseMass(mass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.JOINT:
      {
        Joint joint = (Joint)theEObject;
        T result = caseJoint(joint);
        if (result == null) result = caseConnective(joint);
        if (result == null) result = caseSystemElement(joint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.JOINT_TYPE:
      {
        JointType jointType = (JointType)theEObject;
        T result = caseJointType(jointType);
        if (result == null) result = caseInitialDefinition(jointType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.JOINT_TYPE_EXPRESSION:
      {
        JointTypeExpression jointTypeExpression = (JointTypeExpression)theEObject;
        T result = caseJointTypeExpression(jointTypeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.JOINT_TYPE_REFERENCE:
      {
        JointTypeReference jointTypeReference = (JointTypeReference)theEObject;
        T result = caseJointTypeReference(jointTypeReference);
        if (result == null) result = caseJointTypeExpression(jointTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.BASIC_JOINT_TYPE:
      {
        BasicJointType basicJointType = (BasicJointType)theEObject;
        T result = caseBasicJointType(basicJointType);
        if (result == null) result = caseJointTypeExpression(basicJointType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.JOINT_MOVEMENT:
      {
        JointMovement jointMovement = (JointMovement)theEObject;
        T result = caseJointMovement(jointMovement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.REVOLUTE:
      {
        Revolute revolute = (Revolute)theEObject;
        T result = caseRevolute(revolute);
        if (result == null) result = caseJointMovement(revolute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.PLANAR:
      {
        Planar planar = (Planar)theEObject;
        T result = casePlanar(planar);
        if (result == null) result = caseJointMovement(planar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.STIFFNESS_EXP:
      {
        StiffnessExp stiffnessExp = (StiffnessExp)theEObject;
        T result = caseStiffnessExp(stiffnessExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.STIFFNESS_REF:
      {
        StiffnessRef stiffnessRef = (StiffnessRef)theEObject;
        T result = caseStiffnessRef(stiffnessRef);
        if (result == null) result = caseStiffnessExp(stiffnessRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.BASE_STIFFNESS_EXP:
      {
        BaseStiffnessExp baseStiffnessExp = (BaseStiffnessExp)theEObject;
        T result = caseBaseStiffnessExp(baseStiffnessExp);
        if (result == null) result = caseInitialDefinition(baseStiffnessExp);
        if (result == null) result = caseStiffnessExp(baseStiffnessExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION:
      {
        RelativeTransformation relativeTransformation = (RelativeTransformation)theEObject;
        T result = caseRelativeTransformation(relativeTransformation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.REORIENTATION:
      {
        Reorientation reorientation = (Reorientation)theEObject;
        T result = caseReorientation(reorientation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.REORIENT_EXPRESSION:
      {
        ReorientExpression reorientExpression = (ReorientExpression)theEObject;
        T result = caseReorientExpression(reorientExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.REORIENT_REF:
      {
        ReorientRef reorientRef = (ReorientRef)theEObject;
        T result = caseReorientRef(reorientRef);
        if (result == null) result = caseReorientExpression(reorientRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.BASIC_REORIENT_EXPRESSION:
      {
        BasicReorientExpression basicReorientExpression = (BasicReorientExpression)theEObject;
        T result = caseBasicReorientExpression(basicReorientExpression);
        if (result == null) result = caseReorientExpression(basicReorientExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = caseConnective(constraint);
        if (result == null) result = caseSystemElement(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.JOINT_CONSTRAINT:
      {
        JointConstraint jointConstraint = (JointConstraint)theEObject;
        T result = caseJointConstraint(jointConstraint);
        if (result == null) result = caseSystemElement(jointConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.EXTERNAL_LOAD:
      {
        ExternalLoad externalLoad = (ExternalLoad)theEObject;
        T result = caseExternalLoad(externalLoad);
        if (result == null) result = caseConnective(externalLoad);
        if (result == null) result = caseSystemElement(externalLoad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.MATRIX:
      {
        Matrix matrix = (Matrix)theEObject;
        T result = caseMatrix(matrix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.BASE_MATRIX:
      {
        BaseMatrix baseMatrix = (BaseMatrix)theEObject;
        T result = caseBaseMatrix(baseMatrix);
        if (result == null) result = caseInitialDefinition(baseMatrix);
        if (result == null) result = caseMatrix(baseMatrix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.MATRIX_REF:
      {
        MatrixRef matrixRef = (MatrixRef)theEObject;
        T result = caseMatrixRef(matrixRef);
        if (result == null) result = caseMatrix(matrixRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.PARENTHESISED_EXP:
      {
        ParenthesisedExp parenthesisedExp = (ParenthesisedExp)theEObject;
        T result = caseParenthesisedExp(parenthesisedExp);
        if (result == null) result = caseExpression(parenthesisedExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.CONSTANT_OR_FUNCTION_CALL_EXP:
      {
        ConstantOrFunctionCallExp constantOrFunctionCallExp = (ConstantOrFunctionCallExp)theEObject;
        T result = caseConstantOrFunctionCallExp(constantOrFunctionCallExp);
        if (result == null) result = caseExpression(constantOrFunctionCallExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = caseExpression(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.ADDITIVE_JOINT_TYPE:
      {
        AdditiveJointType additiveJointType = (AdditiveJointType)theEObject;
        T result = caseAdditiveJointType(additiveJointType);
        if (result == null) result = caseJointTypeExpression(additiveJointType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.ADD_EXP:
      {
        AddExp addExp = (AddExp)theEObject;
        T result = caseAddExp(addExp);
        if (result == null) result = caseExpression(addExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.MULT_EXP:
      {
        MultExp multExp = (MultExp)theEObject;
        T result = caseMultExp(multExp);
        if (result == null) result = caseExpression(multExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialDefinition(InitialDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironment(Environment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(uk.ac.kcl.inf.robotics.rigidBodies.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateDef(StateDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemInstantiation(SystemInstantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemElement(SystemElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connective</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connective</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnective(Connective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyReference(BodyReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Repetition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Repetition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyRepetition(BodyRepetition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMass(Mass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Joint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoint(Joint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Joint Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joint Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJointType(JointType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Joint Type Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joint Type Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJointTypeExpression(JointTypeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Joint Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joint Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJointTypeReference(JointTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Joint Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Joint Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicJointType(BasicJointType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Joint Movement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joint Movement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJointMovement(JointMovement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Revolute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Revolute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRevolute(Revolute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Planar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Planar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlanar(Planar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stiffness Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stiffness Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStiffnessExp(StiffnessExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stiffness Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stiffness Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStiffnessRef(StiffnessRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Stiffness Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Stiffness Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseStiffnessExp(BaseStiffnessExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relative Transformation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relative Transformation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelativeTransformation(RelativeTransformation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reorientation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reorientation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReorientation(Reorientation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reorient Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reorient Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReorientExpression(ReorientExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reorient Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reorient Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReorientRef(ReorientRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Reorient Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Reorient Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicReorientExpression(BasicReorientExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Joint Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joint Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJointConstraint(JointConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Load</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Load</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalLoad(ExternalLoad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrix(Matrix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Matrix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Matrix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseMatrix(BaseMatrix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrixRef(MatrixRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesised Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesised Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesisedExp(ParenthesisedExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Or Function Call Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Or Function Call Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantOrFunctionCallExp(ConstantOrFunctionCallExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive Joint Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Joint Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditiveJointType(AdditiveJointType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddExp(AddExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultExp(MultExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RigidBodiesSwitch
