/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.LockJointStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lock Joint Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.LockJointStatementImpl#getSystem <em>System</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.LockJointStatementImpl#getJoint <em>Joint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LockJointStatementImpl extends ConfigurationStatementImpl implements LockJointStatement
{
  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected SystemInstantiation system;

  /**
   * The cached value of the '{@link #getJoint() <em>Joint</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoint()
   * @generated
   * @ordered
   */
  protected Joint joint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LockJointStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RigidBodiesPackage.Literals.LOCK_JOINT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemInstantiation getSystem()
  {
    if (system != null && system.eIsProxy())
    {
      InternalEObject oldSystem = (InternalEObject)system;
      system = (SystemInstantiation)eResolveProxy(oldSystem);
      if (system != oldSystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.LOCK_JOINT_STATEMENT__SYSTEM, oldSystem, system));
      }
    }
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemInstantiation basicGetSystem()
  {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(SystemInstantiation newSystem)
  {
    SystemInstantiation oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.LOCK_JOINT_STATEMENT__SYSTEM, oldSystem, system));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Joint getJoint()
  {
    if (joint != null && joint.eIsProxy())
    {
      InternalEObject oldJoint = (InternalEObject)joint;
      joint = (Joint)eResolveProxy(oldJoint);
      if (joint != oldJoint)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.LOCK_JOINT_STATEMENT__JOINT, oldJoint, joint));
      }
    }
    return joint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Joint basicGetJoint()
  {
    return joint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJoint(Joint newJoint)
  {
    Joint oldJoint = joint;
    joint = newJoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.LOCK_JOINT_STATEMENT__JOINT, oldJoint, joint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__SYSTEM:
        if (resolve) return getSystem();
        return basicGetSystem();
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__JOINT:
        if (resolve) return getJoint();
        return basicGetJoint();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__SYSTEM:
        setSystem((SystemInstantiation)newValue);
        return;
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__JOINT:
        setJoint((Joint)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__SYSTEM:
        setSystem((SystemInstantiation)null);
        return;
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__JOINT:
        setJoint((Joint)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__SYSTEM:
        return system != null;
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__JOINT:
        return joint != null;
    }
    return super.eIsSet(featureID);
  }

} //LockJointStatementImpl
