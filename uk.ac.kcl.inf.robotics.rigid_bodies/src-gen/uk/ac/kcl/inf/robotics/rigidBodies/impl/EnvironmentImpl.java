/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.Environment;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.EnvironmentImpl#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment
{
  /**
   * The cached value of the '{@link #getGravity() <em>Gravity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGravity()
   * @generated
   * @ordered
   */
  protected Matrix gravity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentImpl()
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
    return RigidBodiesPackage.Literals.ENVIRONMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix getGravity()
  {
    return gravity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGravity(Matrix newGravity, NotificationChain msgs)
  {
    Matrix oldGravity = gravity;
    gravity = newGravity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.ENVIRONMENT__GRAVITY, oldGravity, newGravity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGravity(Matrix newGravity)
  {
    if (newGravity != gravity)
    {
      NotificationChain msgs = null;
      if (gravity != null)
        msgs = ((InternalEObject)gravity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.ENVIRONMENT__GRAVITY, null, msgs);
      if (newGravity != null)
        msgs = ((InternalEObject)newGravity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.ENVIRONMENT__GRAVITY, null, msgs);
      msgs = basicSetGravity(newGravity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.ENVIRONMENT__GRAVITY, newGravity, newGravity));
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
      case RigidBodiesPackage.ENVIRONMENT__GRAVITY:
        return basicSetGravity(null, msgs);
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
      case RigidBodiesPackage.ENVIRONMENT__GRAVITY:
        return getGravity();
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
      case RigidBodiesPackage.ENVIRONMENT__GRAVITY:
        setGravity((Matrix)newValue);
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
      case RigidBodiesPackage.ENVIRONMENT__GRAVITY:
        setGravity((Matrix)null);
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
      case RigidBodiesPackage.ENVIRONMENT__GRAVITY:
        return gravity != null;
    }
    return super.eIsSet(featureID);
  }

} //EnvironmentImpl
