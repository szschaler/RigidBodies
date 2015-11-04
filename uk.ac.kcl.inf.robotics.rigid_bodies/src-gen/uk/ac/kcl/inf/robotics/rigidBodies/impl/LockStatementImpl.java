/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.LockStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lock Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.LockStatementImpl#getSysName <em>Sys Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.LockStatementImpl#getJoint <em>Joint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LockStatementImpl extends ConfigurationStatementImpl implements LockStatement
{
  /**
   * The cached value of the '{@link #getSysName() <em>Sys Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSysName()
   * @generated
   * @ordered
   */
  protected SystemInstantiation sysName;

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
  protected LockStatementImpl()
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
    return RigidBodiesPackage.Literals.LOCK_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemInstantiation getSysName()
  {
    if (sysName != null && sysName.eIsProxy())
    {
      InternalEObject oldSysName = (InternalEObject)sysName;
      sysName = (SystemInstantiation)eResolveProxy(oldSysName);
      if (sysName != oldSysName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.LOCK_STATEMENT__SYS_NAME, oldSysName, sysName));
      }
    }
    return sysName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemInstantiation basicGetSysName()
  {
    return sysName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSysName(SystemInstantiation newSysName)
  {
    SystemInstantiation oldSysName = sysName;
    sysName = newSysName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.LOCK_STATEMENT__SYS_NAME, oldSysName, sysName));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.LOCK_STATEMENT__JOINT, oldJoint, joint));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.LOCK_STATEMENT__JOINT, oldJoint, joint));
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
      case RigidBodiesPackage.LOCK_STATEMENT__SYS_NAME:
        if (resolve) return getSysName();
        return basicGetSysName();
      case RigidBodiesPackage.LOCK_STATEMENT__JOINT:
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
      case RigidBodiesPackage.LOCK_STATEMENT__SYS_NAME:
        setSysName((SystemInstantiation)newValue);
        return;
      case RigidBodiesPackage.LOCK_STATEMENT__JOINT:
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
      case RigidBodiesPackage.LOCK_STATEMENT__SYS_NAME:
        setSysName((SystemInstantiation)null);
        return;
      case RigidBodiesPackage.LOCK_STATEMENT__JOINT:
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
      case RigidBodiesPackage.LOCK_STATEMENT__SYS_NAME:
        return sysName != null;
      case RigidBodiesPackage.LOCK_STATEMENT__JOINT:
        return joint != null;
    }
    return super.eIsSet(featureID);
  }

} //LockStatementImpl
