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
   * Returns a new object of class '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body</em>'.
   * @generated
   */
  Body createBody();

  /**
   * Returns a new object of class '<em>Local Frame</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Frame</em>'.
   * @generated
   */
  LocalFrame createLocalFrame();

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
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Colocation Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Colocation Constraint</em>'.
   * @generated
   */
  ColocationConstraint createColocationConstraint();

  /**
   * Returns a new object of class '<em>Vector3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vector3</em>'.
   * @generated
   */
  Vector3 createVector3();

  /**
   * Returns a new object of class '<em>Base Vector3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Vector3</em>'.
   * @generated
   */
  BaseVector3 createBaseVector3();

  /**
   * Returns a new object of class '<em>Vector3 Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vector3 Ref</em>'.
   * @generated
   */
  Vector3Ref createVector3Ref();

  /**
   * Returns a new object of class '<em>Matrix3 X3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Matrix3 X3</em>'.
   * @generated
   */
  Matrix3X3 createMatrix3X3();

  /**
   * Returns a new object of class '<em>Base Matrix3 X3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Matrix3 X3</em>'.
   * @generated
   */
  BaseMatrix3X3 createBaseMatrix3X3();

  /**
   * Returns a new object of class '<em>Matrix3 X3 Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Matrix3 X3 Ref</em>'.
   * @generated
   */
  Matrix3X3Ref createMatrix3X3Ref();

  /**
   * Returns a new object of class '<em>Matrix4 X4</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Matrix4 X4</em>'.
   * @generated
   */
  Matrix4X4 createMatrix4X4();

  /**
   * Returns a new object of class '<em>Base Matrix4 X4</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Matrix4 X4</em>'.
   * @generated
   */
  BaseMatrix4X4 createBaseMatrix4X4();

  /**
   * Returns a new object of class '<em>Matrix4 X4 Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Matrix4 X4 Ref</em>'.
   * @generated
   */
  Matrix4X4Ref createMatrix4X4Ref();

  /**
   * Returns a new object of class '<em>Matrix Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Matrix Def</em>'.
   * @generated
   */
  MatrixDef createMatrixDef();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RigidBodiesPackage getRigidBodiesPackage();

} //RigidBodiesFactory
