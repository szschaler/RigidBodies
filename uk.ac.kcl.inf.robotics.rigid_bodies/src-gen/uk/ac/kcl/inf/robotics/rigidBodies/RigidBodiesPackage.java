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
   * The number of structural features of the '<em>System Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_ELEMENT_FEATURE_COUNT = 0;

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
  int BODY__NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Frame</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__FRAME = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__MASS = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.LocalFrameImpl <em>Local Frame</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.LocalFrameImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getLocalFrame()
   * @generated
   */
  int LOCAL_FRAME = 6;

  /**
   * The feature id for the '<em><b>Orientation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_FRAME__ORIENTATION = 0;

  /**
   * The feature id for the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_FRAME__POSITION = 1;

  /**
   * The number of structural features of the '<em>Local Frame</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_FRAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MassImpl <em>Mass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MassImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMass()
   * @generated
   */
  int MASS = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
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
  int JOINT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__TYPE = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__BODY1 = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rel Transformation1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__REL_TRANSFORMATION1 = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__BODY2 = SYSTEM_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Rel Transformation2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT__REL_TRANSFORMATION2 = SYSTEM_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Joint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOINT_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 9;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ColocationConstraintImpl <em>Colocation Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.ColocationConstraintImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getColocationConstraint()
   * @generated
   */
  int COLOCATION_CONSTRAINT = 10;

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
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Vector3Impl <em>Vector3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Vector3Impl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getVector3()
   * @generated
   */
  int VECTOR3 = 11;

  /**
   * The number of structural features of the '<em>Vector3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR3_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseVector3Impl <em>Base Vector3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseVector3Impl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getBaseVector3()
   * @generated
   */
  int BASE_VECTOR3 = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_VECTOR3__NAME = INITIAL_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Base Vector3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_VECTOR3_FEATURE_COUNT = INITIAL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Vector3RefImpl <em>Vector3 Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Vector3RefImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getVector3Ref()
   * @generated
   */
  int VECTOR3_REF = 13;

  /**
   * The feature id for the '<em><b>Vector</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR3_REF__VECTOR = VECTOR3_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Vector3 Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR3_REF_FEATURE_COUNT = VECTOR3_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix3X3Impl <em>Matrix3 X3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix3X3Impl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrix3X3()
   * @generated
   */
  int MATRIX3_X3 = 14;

  /**
   * The number of structural features of the '<em>Matrix3 X3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX3_X3_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrix3X3Impl <em>Base Matrix3 X3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrix3X3Impl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getBaseMatrix3X3()
   * @generated
   */
  int BASE_MATRIX3_X3 = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_MATRIX3_X3__NAME = MATRIX3_X3_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Base Matrix3 X3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_MATRIX3_X3_FEATURE_COUNT = MATRIX3_X3_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix3X3RefImpl <em>Matrix3 X3 Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix3X3RefImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrix3X3Ref()
   * @generated
   */
  int MATRIX3_X3_REF = 16;

  /**
   * The feature id for the '<em><b>Matrix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX3_X3_REF__MATRIX = MATRIX3_X3_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Matrix3 X3 Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX3_X3_REF_FEATURE_COUNT = MATRIX3_X3_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix4X4Impl <em>Matrix4 X4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix4X4Impl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrix4X4()
   * @generated
   */
  int MATRIX4_X4 = 17;

  /**
   * The number of structural features of the '<em>Matrix4 X4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX4_X4_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrix4X4Impl <em>Base Matrix4 X4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrix4X4Impl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getBaseMatrix4X4()
   * @generated
   */
  int BASE_MATRIX4_X4 = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_MATRIX4_X4__NAME = MATRIX4_X4_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Base Matrix4 X4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_MATRIX4_X4_FEATURE_COUNT = MATRIX4_X4_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix4X4RefImpl <em>Matrix4 X4 Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix4X4RefImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrix4X4Ref()
   * @generated
   */
  int MATRIX4_X4_REF = 19;

  /**
   * The feature id for the '<em><b>Matrix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX4_X4_REF__MATRIX = MATRIX4_X4_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Matrix4 X4 Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX4_X4_REF_FEATURE_COUNT = MATRIX4_X4_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixDefImpl <em>Matrix Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixDefImpl
   * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrixDef()
   * @generated
   */
  int MATRIX_DEF = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_DEF__NAME = INITIAL_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Matrix Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_DEF_FEATURE_COUNT = INITIAL_DEFINITION_FEATURE_COUNT + 0;


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
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.robotics.rigidBodies.Body#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Body#getName()
   * @see #getBody()
   * @generated
   */
  EAttribute getBody_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Body#getFrame <em>Frame</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Frame</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Body#getFrame()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Frame();

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
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame <em>Local Frame</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Frame</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame
   * @generated
   */
  EClass getLocalFrame();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame#getOrientation <em>Orientation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Orientation</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame#getOrientation()
   * @see #getLocalFrame()
   * @generated
   */
  EReference getLocalFrame_Orientation();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Position</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame#getPosition()
   * @see #getLocalFrame()
   * @generated
   */
  EReference getLocalFrame_Position();

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
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTransformation1 <em>Rel Transformation1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel Transformation1</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTransformation1()
   * @see #getJoint()
   * @generated
   */
  EReference getJoint_RelTransformation1();

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
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTransformation2 <em>Rel Transformation2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel Transformation2</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTransformation2()
   * @see #getJoint()
   * @generated
   */
  EReference getJoint_RelTransformation2();

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
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Vector3 <em>Vector3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector3</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Vector3
   * @generated
   */
  EClass getVector3();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseVector3 <em>Base Vector3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Vector3</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BaseVector3
   * @generated
   */
  EClass getBaseVector3();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Vector3Ref <em>Vector3 Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector3 Ref</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Vector3Ref
   * @generated
   */
  EClass getVector3Ref();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Vector3Ref#getVector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Vector</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Vector3Ref#getVector()
   * @see #getVector3Ref()
   * @generated
   */
  EReference getVector3Ref_Vector();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3 <em>Matrix3 X3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matrix3 X3</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3
   * @generated
   */
  EClass getMatrix3X3();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix3X3 <em>Base Matrix3 X3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Matrix3 X3</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix3X3
   * @generated
   */
  EClass getBaseMatrix3X3();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3Ref <em>Matrix3 X3 Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matrix3 X3 Ref</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3Ref
   * @generated
   */
  EClass getMatrix3X3Ref();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3Ref#getMatrix <em>Matrix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Matrix</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3Ref#getMatrix()
   * @see #getMatrix3X3Ref()
   * @generated
   */
  EReference getMatrix3X3Ref_Matrix();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4 <em>Matrix4 X4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matrix4 X4</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4
   * @generated
   */
  EClass getMatrix4X4();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix4X4 <em>Base Matrix4 X4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Matrix4 X4</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix4X4
   * @generated
   */
  EClass getBaseMatrix4X4();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4Ref <em>Matrix4 X4 Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matrix4 X4 Ref</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4Ref
   * @generated
   */
  EClass getMatrix4X4Ref();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4Ref#getMatrix <em>Matrix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Matrix</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4Ref#getMatrix()
   * @see #getMatrix4X4Ref()
   * @generated
   */
  EReference getMatrix4X4Ref_Matrix();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.robotics.rigidBodies.MatrixDef <em>Matrix Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matrix Def</em>'.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.MatrixDef
   * @generated
   */
  EClass getMatrixDef();

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
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BODY__NAME = eINSTANCE.getBody_Name();

    /**
     * The meta object literal for the '<em><b>Frame</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__FRAME = eINSTANCE.getBody_Frame();

    /**
     * The meta object literal for the '<em><b>Mass</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__MASS = eINSTANCE.getBody_Mass();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.LocalFrameImpl <em>Local Frame</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.LocalFrameImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getLocalFrame()
     * @generated
     */
    EClass LOCAL_FRAME = eINSTANCE.getLocalFrame();

    /**
     * The meta object literal for the '<em><b>Orientation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_FRAME__ORIENTATION = eINSTANCE.getLocalFrame_Orientation();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_FRAME__POSITION = eINSTANCE.getLocalFrame_Position();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MASS__VALUE = eINSTANCE.getMass_Value();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOINT__NAME = eINSTANCE.getJoint_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__TYPE = eINSTANCE.getJoint_Type();

    /**
     * The meta object literal for the '<em><b>Body1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__BODY1 = eINSTANCE.getJoint_Body1();

    /**
     * The meta object literal for the '<em><b>Rel Transformation1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__REL_TRANSFORMATION1 = eINSTANCE.getJoint_RelTransformation1();

    /**
     * The meta object literal for the '<em><b>Body2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__BODY2 = eINSTANCE.getJoint_Body2();

    /**
     * The meta object literal for the '<em><b>Rel Transformation2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOINT__REL_TRANSFORMATION2 = eINSTANCE.getJoint_RelTransformation2();

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

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Vector3Impl <em>Vector3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Vector3Impl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getVector3()
     * @generated
     */
    EClass VECTOR3 = eINSTANCE.getVector3();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseVector3Impl <em>Base Vector3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseVector3Impl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getBaseVector3()
     * @generated
     */
    EClass BASE_VECTOR3 = eINSTANCE.getBaseVector3();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Vector3RefImpl <em>Vector3 Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Vector3RefImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getVector3Ref()
     * @generated
     */
    EClass VECTOR3_REF = eINSTANCE.getVector3Ref();

    /**
     * The meta object literal for the '<em><b>Vector</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR3_REF__VECTOR = eINSTANCE.getVector3Ref_Vector();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix3X3Impl <em>Matrix3 X3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix3X3Impl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrix3X3()
     * @generated
     */
    EClass MATRIX3_X3 = eINSTANCE.getMatrix3X3();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrix3X3Impl <em>Base Matrix3 X3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrix3X3Impl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getBaseMatrix3X3()
     * @generated
     */
    EClass BASE_MATRIX3_X3 = eINSTANCE.getBaseMatrix3X3();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix3X3RefImpl <em>Matrix3 X3 Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix3X3RefImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrix3X3Ref()
     * @generated
     */
    EClass MATRIX3_X3_REF = eINSTANCE.getMatrix3X3Ref();

    /**
     * The meta object literal for the '<em><b>Matrix</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATRIX3_X3_REF__MATRIX = eINSTANCE.getMatrix3X3Ref_Matrix();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix4X4Impl <em>Matrix4 X4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix4X4Impl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrix4X4()
     * @generated
     */
    EClass MATRIX4_X4 = eINSTANCE.getMatrix4X4();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrix4X4Impl <em>Base Matrix4 X4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseMatrix4X4Impl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getBaseMatrix4X4()
     * @generated
     */
    EClass BASE_MATRIX4_X4 = eINSTANCE.getBaseMatrix4X4();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix4X4RefImpl <em>Matrix4 X4 Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix4X4RefImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrix4X4Ref()
     * @generated
     */
    EClass MATRIX4_X4_REF = eINSTANCE.getMatrix4X4Ref();

    /**
     * The meta object literal for the '<em><b>Matrix</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATRIX4_X4_REF__MATRIX = eINSTANCE.getMatrix4X4Ref_Matrix();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixDefImpl <em>Matrix Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.MatrixDefImpl
     * @see uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodiesPackageImpl#getMatrixDef()
     * @generated
     */
    EClass MATRIX_DEF = eINSTANCE.getMatrixDef();

  }

} //RigidBodiesPackage
