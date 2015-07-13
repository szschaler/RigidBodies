/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesFactory
 * @model kind="package"
 * @generated
 */
public interface RigidBodiesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rigidBodies";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/kcl/inf/robotics/RigidBodies";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rigidBodies";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RigidBodiesPackage eINSTANCE = uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ModelImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Rigid Bodies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RIGID_BODIES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodyImpl <em>Rigid Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodyImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getRigidBody()
   * @generated
   */
  int RIGID_BODY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_BODY__NAME = 0;

  /**
   * The feature id for the '<em><b>Joints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_BODY__JOINTS = 1;

  /**
   * The feature id for the '<em><b>Masses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_BODY__MASSES = 2;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_BODY__CONSTRAINTS = 3;

  /**
   * The number of structural features of the '<em>Rigid Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_BODY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl <em>Joint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getJoint()
   * @generated
   */
  int JOINT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__NAME = 0;

  /**
   * The number of structural features of the '<em>Joint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MassImpl <em>Mass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MassImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMass()
   * @generated
   */
  int MASS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS__VALUE = 1;

  /**
   * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS__TRANSFORMATIONS = 2;

  /**
   * The number of structural features of the '<em>Mass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.TransformationImpl <em>Transformation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.TransformationImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getTransformation()
   * @generated
   */
  int TRANSFORMATION = 4;

  /**
   * The feature id for the '<em><b>Joint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__JOINT = 0;

  /**
   * The number of structural features of the '<em>Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 5;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ColocationConstraintImpl <em>Colocation Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ColocationConstraintImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getColocationConstraint()
   * @generated
   */
  int COLOCATION_CONSTRAINT = 6;

  /**
   * The feature id for the '<em><b>Joint1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOCATION_CONSTRAINT__JOINT1 = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Joint2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOCATION_CONSTRAINT__JOINT2 = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Colocation Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOCATION_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.robotics.rigidBodies.Model#getRigidBodies <em>Rigid Bodies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rigid Bodies</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Model#getRigidBodies()
   * @see #getModel()
   * @generated
   */
  EReference getModel_RigidBodies();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.RigidBody <em>Rigid Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rigid Body</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBody
   * @generated
   */
  EClass getRigidBody();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getName()
   * @see #getRigidBody()
   * @generated
   */
  EAttribute getRigidBody_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getJoints <em>Joints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Joints</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getJoints()
   * @see #getRigidBody()
   * @generated
   */
  EReference getRigidBody_Joints();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getMasses <em>Masses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Masses</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getMasses()
   * @see #getRigidBody()
   * @generated
   */
  EReference getRigidBody_Masses();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getConstraints()
   * @see #getRigidBody()
   * @generated
   */
  EReference getRigidBody_Constraints();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint <em>Joint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Joint</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint
   * @generated
   */
  EClass getJoint();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getName()
   * @see #getJoint()
   * @generated
   */
  EAttribute getJoint_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass <em>Mass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mass</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Mass
   * @generated
   */
  EClass getMass();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Mass#getName()
   * @see #getMass()
   * @generated
   */
  EAttribute getMass_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Mass#getValue()
   * @see #getMass()
   * @generated
   */
  EAttribute getMass_Value();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getTransformations <em>Transformations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transformations</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Mass#getTransformations()
   * @see #getMass()
   * @generated
   */
  EReference getMass_Transformations();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Transformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Transformation
   * @generated
   */
  EClass getTransformation();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Transformation#getJoint <em>Joint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Joint</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Transformation#getJoint()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Joint();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.ColocationConstraint <em>Colocation Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Colocation Constraint</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ColocationConstraint
   * @generated
   */
  EClass getColocationConstraint();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.ColocationConstraint#getJoint1 <em>Joint1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Joint1</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ColocationConstraint#getJoint1()
   * @see #getColocationConstraint()
   * @generated
   */
  EReference getColocationConstraint_Joint1();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.ColocationConstraint#getJoint2 <em>Joint2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Joint2</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ColocationConstraint#getJoint2()
   * @see #getColocationConstraint()
   * @generated
   */
  EReference getColocationConstraint_Joint2();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RigidBodiesFactory getRigidBodiesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ModelImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Rigid Bodies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RIGID_BODIES = eINSTANCE.getModel_RigidBodies();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodyImpl <em>Rigid Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodyImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getRigidBody()
     * @generated
     */
    EClass RIGID_BODY = eINSTANCE.getRigidBody();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RIGID_BODY__NAME = eINSTANCE.getRigidBody_Name();

    /**
     * The meta object literal for the '<em><b>Joints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGID_BODY__JOINTS = eINSTANCE.getRigidBody_Joints();

    /**
     * The meta object literal for the '<em><b>Masses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGID_BODY__MASSES = eINSTANCE.getRigidBody_Masses();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGID_BODY__CONSTRAINTS = eINSTANCE.getRigidBody_Constraints();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl <em>Joint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getJoint()
     * @generated
     */
    EClass JOINT = eINSTANCE.getJoint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOINT__NAME = eINSTANCE.getJoint_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MassImpl <em>Mass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MassImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMass()
     * @generated
     */
    EClass MASS = eINSTANCE.getMass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MASS__NAME = eINSTANCE.getMass_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MASS__VALUE = eINSTANCE.getMass_Value();

    /**
     * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MASS__TRANSFORMATIONS = eINSTANCE.getMass_Transformations();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.TransformationImpl <em>Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.TransformationImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getTransformation()
     * @generated
     */
    EClass TRANSFORMATION = eINSTANCE.getTransformation();

    /**
     * The meta object literal for the '<em><b>Joint</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__JOINT = eINSTANCE.getTransformation_Joint();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ColocationConstraintImpl <em>Colocation Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ColocationConstraintImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getColocationConstraint()
     * @generated
     */
    EClass COLOCATION_CONSTRAINT = eINSTANCE.getColocationConstraint();

    /**
     * The meta object literal for the '<em><b>Joint1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOCATION_CONSTRAINT__JOINT1 = eINSTANCE.getColocationConstraint_Joint1();

    /**
     * The meta object literal for the '<em><b>Joint2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOCATION_CONSTRAINT__JOINT2 = eINSTANCE.getColocationConstraint_Joint2();

  }

} //RigidBodiesPackage
