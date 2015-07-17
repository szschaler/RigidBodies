/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The feature id for the '<em><b>Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DEFS = 0;

  /**
   * The feature id for the '<em><b>World</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__WORLD = 1;

  /**
   * The feature id for the '<em><b>Bodies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BODIES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.InitialDefinitionImpl <em>Initial Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.InitialDefinitionImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getInitialDefinition()
   * @generated
   */
  int INITIAL_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Initial Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.EnvironmentImpl <em>Environment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.EnvironmentImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getEnvironment()
   * @generated
   */
  int ENVIRONMENT = 2;

  /**
   * The feature id for the '<em><b>Gravity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__GRAVITY = 0;

  /**
   * The number of structural features of the '<em>Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.SystemImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.SystemElementImpl <em>System Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.SystemElementImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getSystemElement()
   * @generated
   */
  int SYSTEM_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>System Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getBody()
   * @generated
   */
  int BODY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__NAME = SYSTEM_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__MASS = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MassImpl <em>Mass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MassImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMass()
   * @generated
   */
  int MASS = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS__POSITION = 1;

  /**
   * The feature id for the '<em><b>Inertia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS__INERTIA = 2;

  /**
   * The number of structural features of the '<em>Mass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl <em>Joint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getJoint()
   * @generated
   */
  int JOINT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__NAME = SYSTEM_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__TYPE = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__IS_START = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__BODY1 = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rel Trans1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__REL_TRANS1 = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__BODY2 = SYSTEM_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Rel Trans2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__REL_TRANS2 = SYSTEM_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Spring Coeff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__SPRING_COEFF = SYSTEM_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Spring Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__SPRING_INIT = SYSTEM_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Damp Viscous</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__DAMP_VISCOUS = SYSTEM_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Damp Coulomb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__DAMP_COULOMB = SYSTEM_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Joint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointTypeImpl <em>Joint Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.JointTypeImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getJointType()
   * @generated
   */
  int JOINT_TYPE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT_TYPE__NAME = INITIAL_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT_TYPE__EXP = INITIAL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Joint Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT_TYPE_FEATURE_COUNT = INITIAL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointTypeExpressionImpl <em>Joint Type Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.JointTypeExpressionImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getJointTypeExpression()
   * @generated
   */
  int JOINT_TYPE_EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT_TYPE_EXPRESSION__REF = 0;

  /**
   * The feature id for the '<em><b>Axis</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT_TYPE_EXPRESSION__AXIS = 1;

  /**
   * The number of structural features of the '<em>Joint Type Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT_TYPE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.RelativeTransformationImpl <em>Relative Transformation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RelativeTransformationImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getRelativeTransformation()
   * @generated
   */
  int RELATIVE_TRANSFORMATION = 10;

  /**
   * The feature id for the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_TRANSFORMATION__POSITION = 0;

  /**
   * The feature id for the '<em><b>Reorient</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_TRANSFORMATION__REORIENT = 1;

  /**
   * The number of structural features of the '<em>Relative Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_TRANSFORMATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ReorientationImpl <em>Reorientation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ReorientationImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getReorientation()
   * @generated
   */
  int REORIENTATION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REORIENTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REORIENTATION__EXP = 1;

  /**
   * The number of structural features of the '<em>Reorientation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REORIENTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ReorientExpressionImpl <em>Reorient Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ReorientExpressionImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getReorientExpression()
   * @generated
   */
  int REORIENT_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REORIENT_EXPRESSION__REF = 0;

  /**
   * The feature id for the '<em><b>Axis</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REORIENT_EXPRESSION__AXIS = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REORIENT_EXPRESSION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Reorient Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REORIENT_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__NAME = SYSTEM_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__TYPE = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__BODY1 = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rel Trans1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__REL_TRANS1 = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__BODY2 = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Rel Trans2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__REL_TRANS2 = SYSTEM_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ExternalLoadImpl <em>External Load</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ExternalLoadImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getExternalLoad()
   * @generated
   */
  int EXTERNAL_LOAD = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LOAD__NAME = SYSTEM_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LOAD__TYPE = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LOAD__BODY1 = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rel Trans1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LOAD__REL_TRANS1 = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LOAD__BODY2 = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Rel Trans2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LOAD__REL_TRANS2 = SYSTEM_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>External Load</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LOAD_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixImpl <em>Matrix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrix()
   * @generated
   */
  int MATRIX = 15;

  /**
   * The number of structural features of the '<em>Matrix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrixImpl <em>Base Matrix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrixImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getBaseMatrix()
   * @generated
   */
  int BASE_MATRIX = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_MATRIX__NAME = INITIAL_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_MATRIX__VALUES = INITIAL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Base Matrix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_MATRIX_FEATURE_COUNT = INITIAL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixRefImpl <em>Matrix Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixRefImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrixRef()
   * @generated
   */
  int MATRIX_REF = 17;

  /**
   * The feature id for the '<em><b>Matrix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_REF__MATRIX = MATRIX_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Matrix Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_REF_FEATURE_COUNT = MATRIX_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ExpressionImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 18;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstantOrFunctionCallExpImpl <em>Constant Or Function Call Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstantOrFunctionCallExpImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getConstantOrFunctionCallExp()
   * @generated
   */
  int CONSTANT_OR_FUNCTION_CALL_EXP = 19;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_OR_FUNCTION_CALL_EXP__LABEL = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_OR_FUNCTION_CALL_EXP__PARAM = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant Or Function Call Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_OR_FUNCTION_CALL_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.NumberLiteralImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 20;

  /**
   * The feature id for the '<em><b>Neg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__NEG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.AddExpImpl <em>Add Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.AddExpImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getAddExp()
   * @generated
   */
  int ADD_EXP = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXP__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXP__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXP__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Add Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MultExpImpl <em>Mult Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MultExpImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMultExp()
   * @generated
   */
  int MULT_EXP = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_EXP__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_EXP__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_EXP__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mult Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.AXIS <em>AXIS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.AXIS
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getAXIS()
   * @generated
   */
  int AXIS = 23;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ConstraintType <em>Constraint Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ConstraintType
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getConstraintType()
   * @generated
   */
  int CONSTRAINT_TYPE = 24;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.LoadType <em>Load Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.LoadType
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getLoadType()
   * @generated
   */
  int LOAD_TYPE = 25;


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
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.robotics.rigidBodies.Model#getDefs <em>Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defs</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Model#getDefs()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Defs();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Model#getWorld <em>World</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>World</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Model#getWorld()
   * @see #getModel()
   * @generated
   */
  EReference getModel_World();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.robotics.rigidBodies.Model#getBodies <em>Bodies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bodies</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Model#getBodies()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Bodies();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition <em>Initial Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initial Definition</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition
   * @generated
   */
  EClass getInitialDefinition();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition#getName()
   * @see #getInitialDefinition()
   * @generated
   */
  EAttribute getInitialDefinition_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Environment
   * @generated
   */
  EClass getEnvironment();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Environment#getGravity <em>Gravity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gravity</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Environment#getGravity()
   * @see #getEnvironment()
   * @generated
   */
  EReference getEnvironment_Gravity();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.System#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.System#getName()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.robotics.rigidBodies.System#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.System#getElements()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Elements();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.SystemElement <em>System Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Element</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.SystemElement
   * @generated
   */
  EClass getSystemElement();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.SystemElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.SystemElement#getName()
   * @see #getSystemElement()
   * @generated
   */
  EAttribute getSystemElement_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Body#getMass <em>Mass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mass</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Body#getMass()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Mass();

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
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Mass#getValue()
   * @see #getMass()
   * @generated
   */
  EReference getMass_Value();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Position</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Mass#getPosition()
   * @see #getMass()
   * @generated
   */
  EReference getMass_Position();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getInertia <em>Inertia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inertia</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Mass#getInertia()
   * @see #getMass()
   * @generated
   */
  EReference getMass_Inertia();

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
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getType()
   * @see #getJoint()
   * @generated
   */
  EReference getJoint_Type();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#isIsStart <em>Is Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Start</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#isIsStart()
   * @see #getJoint()
   * @generated
   */
  EAttribute getJoint_IsStart();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody1 <em>Body1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Body1</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody1()
   * @see #getJoint()
   * @generated
   */
  EReference getJoint_Body1();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTrans1 <em>Rel Trans1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel Trans1</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTrans1()
   * @see #getJoint()
   * @generated
   */
  EReference getJoint_RelTrans1();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody2 <em>Body2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Body2</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody2()
   * @see #getJoint()
   * @generated
   */
  EReference getJoint_Body2();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTrans2 <em>Rel Trans2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel Trans2</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTrans2()
   * @see #getJoint()
   * @generated
   */
  EReference getJoint_RelTrans2();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getSpringCoeff <em>Spring Coeff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spring Coeff</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getSpringCoeff()
   * @see #getJoint()
   * @generated
   */
  EReference getJoint_SpringCoeff();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getSpringInit <em>Spring Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spring Init</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getSpringInit()
   * @see #getJoint()
   * @generated
   */
  EReference getJoint_SpringInit();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getDampViscous <em>Damp Viscous</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Damp Viscous</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getDampViscous()
   * @see #getJoint()
   * @generated
   */
  EReference getJoint_DampViscous();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getDampCoulomb <em>Damp Coulomb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Damp Coulomb</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getDampCoulomb()
   * @see #getJoint()
   * @generated
   */
  EReference getJoint_DampCoulomb();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointType <em>Joint Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Joint Type</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.JointType
   * @generated
   */
  EClass getJointType();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointType#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.JointType#getExp()
   * @see #getJointType()
   * @generated
   */
  EReference getJointType_Exp();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression <em>Joint Type Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Joint Type Expression</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression
   * @generated
   */
  EClass getJointTypeExpression();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression#getRef()
   * @see #getJointTypeExpression()
   * @generated
   */
  EReference getJointTypeExpression_Ref();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression#getAxis <em>Axis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Axis</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression#getAxis()
   * @see #getJointTypeExpression()
   * @generated
   */
  EAttribute getJointTypeExpression_Axis();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation <em>Relative Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relative Transformation</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation
   * @generated
   */
  EClass getRelativeTransformation();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Position</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation#getPosition()
   * @see #getRelativeTransformation()
   * @generated
   */
  EReference getRelativeTransformation_Position();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation#getReorient <em>Reorient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reorient</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation#getReorient()
   * @see #getRelativeTransformation()
   * @generated
   */
  EReference getRelativeTransformation_Reorient();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Reorientation <em>Reorientation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reorientation</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Reorientation
   * @generated
   */
  EClass getReorientation();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.Reorientation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Reorientation#getName()
   * @see #getReorientation()
   * @generated
   */
  EAttribute getReorientation_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Reorientation#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Reorientation#getExp()
   * @see #getReorientation()
   * @generated
   */
  EReference getReorientation_Exp();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression <em>Reorient Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reorient Expression</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression
   * @generated
   */
  EClass getReorientExpression();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression#getRef()
   * @see #getReorientExpression()
   * @generated
   */
  EReference getReorientExpression_Ref();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression#getAxis <em>Axis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Axis</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression#getAxis()
   * @see #getReorientExpression()
   * @generated
   */
  EAttribute getReorientExpression_Axis();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression#getValue()
   * @see #getReorientExpression()
   * @generated
   */
  EReference getReorientExpression_Value();

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
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.Constraint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Constraint#getType()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Type();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Constraint#getBody1 <em>Body1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Body1</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Constraint#getBody1()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Body1();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Constraint#getRelTrans1 <em>Rel Trans1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel Trans1</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Constraint#getRelTrans1()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_RelTrans1();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Constraint#getBody2 <em>Body2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Body2</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Constraint#getBody2()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Body2();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Constraint#getRelTrans2 <em>Rel Trans2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel Trans2</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Constraint#getRelTrans2()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_RelTrans2();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad <em>External Load</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Load</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad
   * @generated
   */
  EClass getExternalLoad();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getType()
   * @see #getExternalLoad()
   * @generated
   */
  EAttribute getExternalLoad_Type();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getBody1 <em>Body1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Body1</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getBody1()
   * @see #getExternalLoad()
   * @generated
   */
  EReference getExternalLoad_Body1();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getRelTrans1 <em>Rel Trans1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel Trans1</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getRelTrans1()
   * @see #getExternalLoad()
   * @generated
   */
  EReference getExternalLoad_RelTrans1();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getBody2 <em>Body2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Body2</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getBody2()
   * @see #getExternalLoad()
   * @generated
   */
  EReference getExternalLoad_Body2();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getRelTrans2 <em>Rel Trans2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel Trans2</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getRelTrans2()
   * @see #getExternalLoad()
   * @generated
   */
  EReference getExternalLoad_RelTrans2();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix <em>Matrix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matrix</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix
   * @generated
   */
  EClass getMatrix();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix <em>Base Matrix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Matrix</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix
   * @generated
   */
  EClass getBaseMatrix();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix#getValues()
   * @see #getBaseMatrix()
   * @generated
   */
  EReference getBaseMatrix_Values();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef <em>Matrix Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matrix Ref</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef
   * @generated
   */
  EClass getMatrixRef();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef#getMatrix <em>Matrix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Matrix</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef#getMatrix()
   * @see #getMatrixRef()
   * @generated
   */
  EReference getMatrixRef_Matrix();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp <em>Constant Or Function Call Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Or Function Call Exp</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp
   * @generated
   */
  EClass getConstantOrFunctionCallExp();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp#getLabel()
   * @see #getConstantOrFunctionCallExp()
   * @generated
   */
  EAttribute getConstantOrFunctionCallExp_Label();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp#getParam()
   * @see #getConstantOrFunctionCallExp()
   * @generated
   */
  EReference getConstantOrFunctionCallExp_Param();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral#isNeg <em>Neg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Neg</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral#isNeg()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Neg();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.AddExp <em>Add Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Exp</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.AddExp
   * @generated
   */
  EClass getAddExp();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.AddExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.AddExp#getLeft()
   * @see #getAddExp()
   * @generated
   */
  EReference getAddExp_Left();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.robotics.rigidBodies.AddExp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.AddExp#getOp()
   * @see #getAddExp()
   * @generated
   */
  EAttribute getAddExp_Op();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.AddExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.AddExp#getRight()
   * @see #getAddExp()
   * @generated
   */
  EReference getAddExp_Right();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.MultExp <em>Mult Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mult Exp</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.MultExp
   * @generated
   */
  EClass getMultExp();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.MultExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.MultExp#getLeft()
   * @see #getMultExp()
   * @generated
   */
  EReference getMultExp_Left();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.robotics.rigidBodies.MultExp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.MultExp#getOp()
   * @see #getMultExp()
   * @generated
   */
  EAttribute getMultExp_Op();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.MultExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.MultExp#getRight()
   * @see #getMultExp()
   * @generated
   */
  EReference getMultExp_Right();

  /**
   * Returns the meta object for enum '{@link uk.ac.kcl.inf.robotics.rigidBodies.AXIS <em>AXIS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>AXIS</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.AXIS
   * @generated
   */
  EEnum getAXIS();

  /**
   * Returns the meta object for enum '{@link uk.ac.kcl.inf.robotics.rigidBodies.ConstraintType <em>Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Constraint Type</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ConstraintType
   * @generated
   */
  EEnum getConstraintType();

  /**
   * Returns the meta object for enum '{@link uk.ac.kcl.inf.robotics.rigidBodies.LoadType <em>Load Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Load Type</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.LoadType
   * @generated
   */
  EEnum getLoadType();

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
     * The meta object literal for the '<em><b>Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DEFS = eINSTANCE.getModel_Defs();

    /**
     * The meta object literal for the '<em><b>World</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__WORLD = eINSTANCE.getModel_World();

    /**
     * The meta object literal for the '<em><b>Bodies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BODIES = eINSTANCE.getModel_Bodies();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.InitialDefinitionImpl <em>Initial Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.InitialDefinitionImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getInitialDefinition()
     * @generated
     */
    EClass INITIAL_DEFINITION = eINSTANCE.getInitialDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIAL_DEFINITION__NAME = eINSTANCE.getInitialDefinition_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.EnvironmentImpl <em>Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.EnvironmentImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getEnvironment()
     * @generated
     */
    EClass ENVIRONMENT = eINSTANCE.getEnvironment();

    /**
     * The meta object literal for the '<em><b>Gravity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT__GRAVITY = eINSTANCE.getEnvironment_Gravity();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.SystemImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__ELEMENTS = eINSTANCE.getSystem_Elements();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.SystemElementImpl <em>System Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.SystemElementImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getSystemElement()
     * @generated
     */
    EClass SYSTEM_ELEMENT = eINSTANCE.getSystemElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_ELEMENT__NAME = eINSTANCE.getSystemElement_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Mass</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__MASS = eINSTANCE.getBody_Mass();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MASS__VALUE = eINSTANCE.getMass_Value();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MASS__POSITION = eINSTANCE.getMass_Position();

    /**
     * The meta object literal for the '<em><b>Inertia</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MASS__INERTIA = eINSTANCE.getMass_Inertia();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__TYPE = eINSTANCE.getJoint_Type();

    /**
     * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOINT__IS_START = eINSTANCE.getJoint_IsStart();

    /**
     * The meta object literal for the '<em><b>Body1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__BODY1 = eINSTANCE.getJoint_Body1();

    /**
     * The meta object literal for the '<em><b>Rel Trans1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__REL_TRANS1 = eINSTANCE.getJoint_RelTrans1();

    /**
     * The meta object literal for the '<em><b>Body2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__BODY2 = eINSTANCE.getJoint_Body2();

    /**
     * The meta object literal for the '<em><b>Rel Trans2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__REL_TRANS2 = eINSTANCE.getJoint_RelTrans2();

    /**
     * The meta object literal for the '<em><b>Spring Coeff</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__SPRING_COEFF = eINSTANCE.getJoint_SpringCoeff();

    /**
     * The meta object literal for the '<em><b>Spring Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__SPRING_INIT = eINSTANCE.getJoint_SpringInit();

    /**
     * The meta object literal for the '<em><b>Damp Viscous</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__DAMP_VISCOUS = eINSTANCE.getJoint_DampViscous();

    /**
     * The meta object literal for the '<em><b>Damp Coulomb</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__DAMP_COULOMB = eINSTANCE.getJoint_DampCoulomb();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointTypeImpl <em>Joint Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.JointTypeImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getJointType()
     * @generated
     */
    EClass JOINT_TYPE = eINSTANCE.getJointType();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT_TYPE__EXP = eINSTANCE.getJointType_Exp();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointTypeExpressionImpl <em>Joint Type Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.JointTypeExpressionImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getJointTypeExpression()
     * @generated
     */
    EClass JOINT_TYPE_EXPRESSION = eINSTANCE.getJointTypeExpression();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT_TYPE_EXPRESSION__REF = eINSTANCE.getJointTypeExpression_Ref();

    /**
     * The meta object literal for the '<em><b>Axis</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOINT_TYPE_EXPRESSION__AXIS = eINSTANCE.getJointTypeExpression_Axis();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.RelativeTransformationImpl <em>Relative Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RelativeTransformationImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getRelativeTransformation()
     * @generated
     */
    EClass RELATIVE_TRANSFORMATION = eINSTANCE.getRelativeTransformation();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIVE_TRANSFORMATION__POSITION = eINSTANCE.getRelativeTransformation_Position();

    /**
     * The meta object literal for the '<em><b>Reorient</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIVE_TRANSFORMATION__REORIENT = eINSTANCE.getRelativeTransformation_Reorient();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ReorientationImpl <em>Reorientation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ReorientationImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getReorientation()
     * @generated
     */
    EClass REORIENTATION = eINSTANCE.getReorientation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REORIENTATION__NAME = eINSTANCE.getReorientation_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REORIENTATION__EXP = eINSTANCE.getReorientation_Exp();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ReorientExpressionImpl <em>Reorient Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ReorientExpressionImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getReorientExpression()
     * @generated
     */
    EClass REORIENT_EXPRESSION = eINSTANCE.getReorientExpression();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REORIENT_EXPRESSION__REF = eINSTANCE.getReorientExpression_Ref();

    /**
     * The meta object literal for the '<em><b>Axis</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REORIENT_EXPRESSION__AXIS = eINSTANCE.getReorientExpression_Axis();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REORIENT_EXPRESSION__VALUE = eINSTANCE.getReorientExpression_Value();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__TYPE = eINSTANCE.getConstraint_Type();

    /**
     * The meta object literal for the '<em><b>Body1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__BODY1 = eINSTANCE.getConstraint_Body1();

    /**
     * The meta object literal for the '<em><b>Rel Trans1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__REL_TRANS1 = eINSTANCE.getConstraint_RelTrans1();

    /**
     * The meta object literal for the '<em><b>Body2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__BODY2 = eINSTANCE.getConstraint_Body2();

    /**
     * The meta object literal for the '<em><b>Rel Trans2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__REL_TRANS2 = eINSTANCE.getConstraint_RelTrans2();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ExternalLoadImpl <em>External Load</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ExternalLoadImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getExternalLoad()
     * @generated
     */
    EClass EXTERNAL_LOAD = eINSTANCE.getExternalLoad();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_LOAD__TYPE = eINSTANCE.getExternalLoad_Type();

    /**
     * The meta object literal for the '<em><b>Body1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_LOAD__BODY1 = eINSTANCE.getExternalLoad_Body1();

    /**
     * The meta object literal for the '<em><b>Rel Trans1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_LOAD__REL_TRANS1 = eINSTANCE.getExternalLoad_RelTrans1();

    /**
     * The meta object literal for the '<em><b>Body2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_LOAD__BODY2 = eINSTANCE.getExternalLoad_Body2();

    /**
     * The meta object literal for the '<em><b>Rel Trans2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_LOAD__REL_TRANS2 = eINSTANCE.getExternalLoad_RelTrans2();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixImpl <em>Matrix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrix()
     * @generated
     */
    EClass MATRIX = eINSTANCE.getMatrix();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrixImpl <em>Base Matrix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrixImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getBaseMatrix()
     * @generated
     */
    EClass BASE_MATRIX = eINSTANCE.getBaseMatrix();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_MATRIX__VALUES = eINSTANCE.getBaseMatrix_Values();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixRefImpl <em>Matrix Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixRefImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrixRef()
     * @generated
     */
    EClass MATRIX_REF = eINSTANCE.getMatrixRef();

    /**
     * The meta object literal for the '<em><b>Matrix</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATRIX_REF__MATRIX = eINSTANCE.getMatrixRef_Matrix();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ExpressionImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstantOrFunctionCallExpImpl <em>Constant Or Function Call Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstantOrFunctionCallExpImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getConstantOrFunctionCallExp()
     * @generated
     */
    EClass CONSTANT_OR_FUNCTION_CALL_EXP = eINSTANCE.getConstantOrFunctionCallExp();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_OR_FUNCTION_CALL_EXP__LABEL = eINSTANCE.getConstantOrFunctionCallExp_Label();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_OR_FUNCTION_CALL_EXP__PARAM = eINSTANCE.getConstantOrFunctionCallExp_Param();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.NumberLiteralImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Neg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__NEG = eINSTANCE.getNumberLiteral_Neg();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.AddExpImpl <em>Add Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.AddExpImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getAddExp()
     * @generated
     */
    EClass ADD_EXP = eINSTANCE.getAddExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_EXP__LEFT = eINSTANCE.getAddExp_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_EXP__OP = eINSTANCE.getAddExp_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_EXP__RIGHT = eINSTANCE.getAddExp_Right();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MultExpImpl <em>Mult Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MultExpImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMultExp()
     * @generated
     */
    EClass MULT_EXP = eINSTANCE.getMultExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULT_EXP__LEFT = eINSTANCE.getMultExp_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULT_EXP__OP = eINSTANCE.getMultExp_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULT_EXP__RIGHT = eINSTANCE.getMultExp_Right();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.AXIS <em>AXIS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.AXIS
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getAXIS()
     * @generated
     */
    EEnum AXIS = eINSTANCE.getAXIS();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ConstraintType <em>Constraint Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.ConstraintType
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getConstraintType()
     * @generated
     */
    EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.LoadType <em>Load Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.LoadType
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getLoadType()
     * @generated
     */
    EEnum LOAD_TYPE = eINSTANCE.getLoadType();

  }

} //RigidBodiesPackage
