/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix3X3;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix4X4;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseVector3;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.ColocationConstraint;
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint;
import uk.ac.kcl.inf.robotics.rigidBodies.Environment;
import uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3Ref;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4Ref;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixDef;
import uk.ac.kcl.inf.robotics.rigidBodies.Model;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesFactory;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;
import uk.ac.kcl.inf.robotics.rigidBodies.Vector3;
import uk.ac.kcl.inf.robotics.rigidBodies.Vector3Ref;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RigidBodiesFactoryImpl extends EFactoryImpl implements RigidBodiesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RigidBodiesFactory init()
  {
    try
    {
      RigidBodiesFactory theRigidBodiesFactory = (RigidBodiesFactory)EPackage.Registry.INSTANCE.getEFactory(RigidBodiesPackage.eNS_URI);
      if (theRigidBodiesFactory != null)
      {
        return theRigidBodiesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RigidBodiesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RigidBodiesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RigidBodiesPackage.MODEL: return createModel();
      case RigidBodiesPackage.INITIAL_DEFINITION: return createInitialDefinition();
      case RigidBodiesPackage.ENVIRONMENT: return createEnvironment();
      case RigidBodiesPackage.SYSTEM: return createSystem();
      case RigidBodiesPackage.SYSTEM_ELEMENT: return createSystemElement();
      case RigidBodiesPackage.BODY: return createBody();
      case RigidBodiesPackage.LOCAL_FRAME: return createLocalFrame();
      case RigidBodiesPackage.MASS: return createMass();
      case RigidBodiesPackage.JOINT: return createJoint();
      case RigidBodiesPackage.CONSTRAINT: return createConstraint();
      case RigidBodiesPackage.COLOCATION_CONSTRAINT: return createColocationConstraint();
      case RigidBodiesPackage.VECTOR3: return createVector3();
      case RigidBodiesPackage.BASE_VECTOR3: return createBaseVector3();
      case RigidBodiesPackage.VECTOR3_REF: return createVector3Ref();
      case RigidBodiesPackage.MATRIX3_X3: return createMatrix3X3();
      case RigidBodiesPackage.BASE_MATRIX3_X3: return createBaseMatrix3X3();
      case RigidBodiesPackage.MATRIX3_X3_REF: return createMatrix3X3Ref();
      case RigidBodiesPackage.MATRIX4_X4: return createMatrix4X4();
      case RigidBodiesPackage.BASE_MATRIX4_X4: return createBaseMatrix4X4();
      case RigidBodiesPackage.MATRIX4_X4_REF: return createMatrix4X4Ref();
      case RigidBodiesPackage.MATRIX_DEF: return createMatrixDef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialDefinition createInitialDefinition()
  {
    InitialDefinitionImpl initialDefinition = new InitialDefinitionImpl();
    return initialDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment createEnvironment()
  {
    EnvironmentImpl environment = new EnvironmentImpl();
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uk.ac.kcl.inf.robotics.rigidBodies.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemElement createSystemElement()
  {
    SystemElementImpl systemElement = new SystemElementImpl();
    return systemElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalFrame createLocalFrame()
  {
    LocalFrameImpl localFrame = new LocalFrameImpl();
    return localFrame;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mass createMass()
  {
    MassImpl mass = new MassImpl();
    return mass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Joint createJoint()
  {
    JointImpl joint = new JointImpl();
    return joint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColocationConstraint createColocationConstraint()
  {
    ColocationConstraintImpl colocationConstraint = new ColocationConstraintImpl();
    return colocationConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector3 createVector3()
  {
    Vector3Impl vector3 = new Vector3Impl();
    return vector3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseVector3 createBaseVector3()
  {
    BaseVector3Impl baseVector3 = new BaseVector3Impl();
    return baseVector3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector3Ref createVector3Ref()
  {
    Vector3RefImpl vector3Ref = new Vector3RefImpl();
    return vector3Ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix3X3 createMatrix3X3()
  {
    Matrix3X3Impl matrix3X3 = new Matrix3X3Impl();
    return matrix3X3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseMatrix3X3 createBaseMatrix3X3()
  {
    BaseMatrix3X3Impl baseMatrix3X3 = new BaseMatrix3X3Impl();
    return baseMatrix3X3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix3X3Ref createMatrix3X3Ref()
  {
    Matrix3X3RefImpl matrix3X3Ref = new Matrix3X3RefImpl();
    return matrix3X3Ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix4X4 createMatrix4X4()
  {
    Matrix4X4Impl matrix4X4 = new Matrix4X4Impl();
    return matrix4X4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseMatrix4X4 createBaseMatrix4X4()
  {
    BaseMatrix4X4Impl baseMatrix4X4 = new BaseMatrix4X4Impl();
    return baseMatrix4X4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix4X4Ref createMatrix4X4Ref()
  {
    Matrix4X4RefImpl matrix4X4Ref = new Matrix4X4RefImpl();
    return matrix4X4Ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatrixDef createMatrixDef()
  {
    MatrixDefImpl matrixDef = new MatrixDefImpl();
    return matrixDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RigidBodiesPackage getRigidBodiesPackage()
  {
    return (RigidBodiesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RigidBodiesPackage getPackage()
  {
    return RigidBodiesPackage.eINSTANCE;
  }

} //RigidBodiesFactoryImpl
