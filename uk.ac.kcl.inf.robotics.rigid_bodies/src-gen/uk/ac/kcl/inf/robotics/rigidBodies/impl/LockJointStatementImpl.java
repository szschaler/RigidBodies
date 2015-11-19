/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.LockJointStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lock Joint Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.LockJointStatementImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.LockJointStatementImpl#getTranslation <em>Translation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LockJointStatementImpl extends ConfigurationStatementImpl implements LockJointStatement
{
  /**
   * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotation()
   * @generated
   * @ordered
   */
  protected Matrix rotation;

  /**
   * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTranslation()
   * @generated
   * @ordered
   */
  protected Matrix translation;

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
  public Matrix getRotation()
  {
    return rotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRotation(Matrix newRotation, NotificationChain msgs)
  {
    Matrix oldRotation = rotation;
    rotation = newRotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.LOCK_JOINT_STATEMENT__ROTATION, oldRotation, newRotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRotation(Matrix newRotation)
  {
    if (newRotation != rotation)
    {
      NotificationChain msgs = null;
      if (rotation != null)
        msgs = ((InternalEObject)rotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.LOCK_JOINT_STATEMENT__ROTATION, null, msgs);
      if (newRotation != null)
        msgs = ((InternalEObject)newRotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.LOCK_JOINT_STATEMENT__ROTATION, null, msgs);
      msgs = basicSetRotation(newRotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.LOCK_JOINT_STATEMENT__ROTATION, newRotation, newRotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix getTranslation()
  {
    return translation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTranslation(Matrix newTranslation, NotificationChain msgs)
  {
    Matrix oldTranslation = translation;
    translation = newTranslation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.LOCK_JOINT_STATEMENT__TRANSLATION, oldTranslation, newTranslation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTranslation(Matrix newTranslation)
  {
    if (newTranslation != translation)
    {
      NotificationChain msgs = null;
      if (translation != null)
        msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.LOCK_JOINT_STATEMENT__TRANSLATION, null, msgs);
      if (newTranslation != null)
        msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.LOCK_JOINT_STATEMENT__TRANSLATION, null, msgs);
      msgs = basicSetTranslation(newTranslation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.LOCK_JOINT_STATEMENT__TRANSLATION, newTranslation, newTranslation));
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
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__ROTATION:
        return basicSetRotation(null, msgs);
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__TRANSLATION:
        return basicSetTranslation(null, msgs);
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
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__ROTATION:
        return getRotation();
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__TRANSLATION:
        return getTranslation();
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
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__ROTATION:
        setRotation((Matrix)newValue);
        return;
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__TRANSLATION:
        setTranslation((Matrix)newValue);
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
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__ROTATION:
        setRotation((Matrix)null);
        return;
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__TRANSLATION:
        setTranslation((Matrix)null);
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
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__ROTATION:
        return rotation != null;
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT__TRANSLATION:
        return translation != null;
    }
    return super.eIsSet(featureID);
  }

} //LockJointStatementImpl
