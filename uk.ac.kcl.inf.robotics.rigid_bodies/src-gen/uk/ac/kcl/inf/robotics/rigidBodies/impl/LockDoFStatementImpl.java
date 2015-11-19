/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.LockDoFStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.LockedJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lock Do FStatement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.LockDoFStatementImpl#getLockedType <em>Locked Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LockDoFStatementImpl extends ConfigurationStatementImpl implements LockDoFStatement
{
  /**
   * The cached value of the '{@link #getLockedType() <em>Locked Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLockedType()
   * @generated
   * @ordered
   */
  protected LockedJointType lockedType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LockDoFStatementImpl()
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
    return RigidBodiesPackage.Literals.LOCK_DO_FSTATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LockedJointType getLockedType()
  {
    return lockedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLockedType(LockedJointType newLockedType, NotificationChain msgs)
  {
    LockedJointType oldLockedType = lockedType;
    lockedType = newLockedType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.LOCK_DO_FSTATEMENT__LOCKED_TYPE, oldLockedType, newLockedType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLockedType(LockedJointType newLockedType)
  {
    if (newLockedType != lockedType)
    {
      NotificationChain msgs = null;
      if (lockedType != null)
        msgs = ((InternalEObject)lockedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.LOCK_DO_FSTATEMENT__LOCKED_TYPE, null, msgs);
      if (newLockedType != null)
        msgs = ((InternalEObject)newLockedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.LOCK_DO_FSTATEMENT__LOCKED_TYPE, null, msgs);
      msgs = basicSetLockedType(newLockedType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.LOCK_DO_FSTATEMENT__LOCKED_TYPE, newLockedType, newLockedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.LOCK_DO_FSTATEMENT__LOCKED_TYPE:
        return basicSetLockedType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RigidBodiesPackage.LOCK_DO_FSTATEMENT__LOCKED_TYPE:
        return getLockedType();
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
      case RigidBodiesPackage.LOCK_DO_FSTATEMENT__LOCKED_TYPE:
        setLockedType((LockedJointType)newValue);
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
      case RigidBodiesPackage.LOCK_DO_FSTATEMENT__LOCKED_TYPE:
        setLockedType((LockedJointType)null);
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
      case RigidBodiesPackage.LOCK_DO_FSTATEMENT__LOCKED_TYPE:
        return lockedType != null;
    }
    return super.eIsSet(featureID);
  }

} //LockDoFStatementImpl
