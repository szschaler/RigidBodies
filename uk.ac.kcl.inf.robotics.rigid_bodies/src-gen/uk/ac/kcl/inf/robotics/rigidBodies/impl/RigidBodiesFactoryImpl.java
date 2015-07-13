/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.robotics.rigidBodies.*;

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
      case RigidBodiesPackage.RIGID_BODY: return createRigidBody();
      case RigidBodiesPackage.JOINT: return createJoint();
      case RigidBodiesPackage.MASS: return createMass();
      case RigidBodiesPackage.TRANSFORMATION: return createTransformation();
      case RigidBodiesPackage.CONSTRAINT: return createConstraint();
      case RigidBodiesPackage.COLOCATION_CONSTRAINT: return createColocationConstraint();
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
  public RigidBody createRigidBody()
  {
    RigidBodyImpl rigidBody = new RigidBodyImpl();
    return rigidBody;
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
  public Transformation createTransformation()
  {
    TransformationImpl transformation = new TransformationImpl();
    return transformation;
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
