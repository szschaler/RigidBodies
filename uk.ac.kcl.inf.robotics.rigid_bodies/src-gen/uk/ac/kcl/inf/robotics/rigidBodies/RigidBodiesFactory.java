/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage
 * @generated
 */
public interface RigidBodiesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RigidBodiesFactory eINSTANCE = uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Initial Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initial Definition</em>'.
   * @generated
   */
  InitialDefinition createInitialDefinition();

  /**
   * Returns a new object of class '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment</em>'.
   * @generated
   */
  Environment createEnvironment();

  /**
   * Returns a new object of class '<em>System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System</em>'.
   * @generated
   */
  System createSystem();

  /**
   * Returns a new object of class '<em>System Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Element</em>'.
   * @generated
   */
  SystemElement createSystemElement();

  /**
   * Returns a new object of class '<em>Connective</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connective</em>'.
   * @generated
   */
  Connective createConnective();

  /**
   * Returns a new object of class '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body</em>'.
   * @generated
   */
  Body createBody();

  /**
   * Returns a new object of class '<em>Body Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body Reference</em>'.
   * @generated
   */
  BodyReference createBodyReference();

  /**
   * Returns a new object of class '<em>Body Repetition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body Repetition</em>'.
   * @generated
   */
  BodyRepetition createBodyRepetition();

  /**
   * Returns a new object of class '<em>Mass</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mass</em>'.
   * @generated
   */
  Mass createMass();

  /**
   * Returns a new object of class '<em>Joint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Joint</em>'.
   * @generated
   */
  Joint createJoint();

  /**
   * Returns a new object of class '<em>Joint Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Joint Type</em>'.
   * @generated
   */
  JointType createJointType();

  /**
   * Returns a new object of class '<em>Joint Type Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Joint Type Expression</em>'.
   * @generated
   */
  JointTypeExpression createJointTypeExpression();

  /**
   * Returns a new object of class '<em>Joint Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Joint Type Reference</em>'.
   * @generated
   */
  JointTypeReference createJointTypeReference();

  /**
   * Returns a new object of class '<em>Basic Joint Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Joint Type</em>'.
   * @generated
   */
  BasicJointType createBasicJointType();

  /**
   * Returns a new object of class '<em>Joint Movement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Joint Movement</em>'.
   * @generated
   */
  JointMovement createJointMovement();

  /**
   * Returns a new object of class '<em>Revolute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Revolute</em>'.
   * @generated
   */
  Revolute createRevolute();

  /**
   * Returns a new object of class '<em>Planar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Planar</em>'.
   * @generated
   */
  Planar createPlanar();

  /**
   * Returns a new object of class '<em>Stiffness Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stiffness Exp</em>'.
   * @generated
   */
  StiffnessExp createStiffnessExp();

  /**
   * Returns a new object of class '<em>Stiffness Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stiffness Ref</em>'.
   * @generated
   */
  StiffnessRef createStiffnessRef();

  /**
   * Returns a new object of class '<em>Base Stiffness Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Stiffness Exp</em>'.
   * @generated
   */
  BaseStiffnessExp createBaseStiffnessExp();

  /**
   * Returns a new object of class '<em>Relative Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relative Transformation</em>'.
   * @generated
   */
  RelativeTransformation createRelativeTransformation();

  /**
   * Returns a new object of class '<em>Reorientation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reorientation</em>'.
   * @generated
   */
  Reorientation createReorientation();

  /**
   * Returns a new object of class '<em>Reorient Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reorient Expression</em>'.
   * @generated
   */
  ReorientExpression createReorientExpression();

  /**
   * Returns a new object of class '<em>Reorient Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reorient Ref</em>'.
   * @generated
   */
  ReorientRef createReorientRef();

  /**
   * Returns a new object of class '<em>Basic Reorient Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Reorient Expression</em>'.
   * @generated
   */
  BasicReorientExpression createBasicReorientExpression();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Joint Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Joint Constraint</em>'.
   * @generated
   */
  JointConstraint createJointConstraint();

  /**
   * Returns a new object of class '<em>External Load</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Load</em>'.
   * @generated
   */
  ExternalLoad createExternalLoad();

  /**
   * Returns a new object of class '<em>Matrix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Matrix</em>'.
   * @generated
   */
  Matrix createMatrix();

  /**
   * Returns a new object of class '<em>Base Matrix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Matrix</em>'.
   * @generated
   */
  BaseMatrix createBaseMatrix();

  /**
   * Returns a new object of class '<em>Matrix Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Matrix Ref</em>'.
   * @generated
   */
  MatrixRef createMatrixRef();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Parenthesised Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenthesised Exp</em>'.
   * @generated
   */
  ParenthesisedExp createParenthesisedExp();

  /**
   * Returns a new object of class '<em>Constant Or Function Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Or Function Call Exp</em>'.
   * @generated
   */
  ConstantOrFunctionCallExp createConstantOrFunctionCallExp();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>Additive Joint Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Additive Joint Type</em>'.
   * @generated
   */
  AdditiveJointType createAdditiveJointType();

  /**
   * Returns a new object of class '<em>Add Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Exp</em>'.
   * @generated
   */
  AddExp createAddExp();

  /**
   * Returns a new object of class '<em>Mult Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mult Exp</em>'.
   * @generated
   */
  MultExp createMultExp();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RigidBodiesPackage getRigidBodiesPackage();

} //RigidBodiesFactory
