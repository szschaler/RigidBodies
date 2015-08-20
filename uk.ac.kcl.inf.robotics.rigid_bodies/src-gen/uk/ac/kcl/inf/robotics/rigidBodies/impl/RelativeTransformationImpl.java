/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.Reorientation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.RelativeTransformationImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.RelativeTransformationImpl#getReorient <em>Reorient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeTransformationImpl extends MinimalEObjectImpl.Container implements RelativeTransformation
{
  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected Matrix position;

  /**
   * The cached value of the '{@link #getReorient() <em>Reorient</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReorient()
   * @generated
   * @ordered
   */
  protected Reorientation reorient;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelativeTransformationImpl()
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
    return RigidBodiesPackage.Literals.RELATIVE_TRANSFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPosition(Matrix newPosition, NotificationChain msgs)
  {
    Matrix oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.RELATIVE_TRANSFORMATION__POSITION, oldPosition, newPosition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(Matrix newPosition)
  {
    if (newPosition != position)
    {
      NotificationChain msgs = null;
      if (position != null)
        msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.RELATIVE_TRANSFORMATION__POSITION, null, msgs);
      if (newPosition != null)
        msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.RELATIVE_TRANSFORMATION__POSITION, null, msgs);
      msgs = basicSetPosition(newPosition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.RELATIVE_TRANSFORMATION__POSITION, newPosition, newPosition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reorientation getReorient()
  {
    return reorient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReorient(Reorientation newReorient, NotificationChain msgs)
  {
    Reorientation oldReorient = reorient;
    reorient = newReorient;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.RELATIVE_TRANSFORMATION__REORIENT, oldReorient, newReorient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReorient(Reorientation newReorient)
  {
    if (newReorient != reorient)
    {
      NotificationChain msgs = null;
      if (reorient != null)
        msgs = ((InternalEObject)reorient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.RELATIVE_TRANSFORMATION__REORIENT, null, msgs);
      if (newReorient != null)
        msgs = ((InternalEObject)newReorient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.RELATIVE_TRANSFORMATION__REORIENT, null, msgs);
      msgs = basicSetReorient(newReorient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.RELATIVE_TRANSFORMATION__REORIENT, newReorient, newReorient));
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
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION__POSITION:
        return basicSetPosition(null, msgs);
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION__REORIENT:
        return basicSetReorient(null, msgs);
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
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION__POSITION:
        return getPosition();
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION__REORIENT:
        return getReorient();
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
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION__POSITION:
        setPosition((Matrix)newValue);
        return;
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION__REORIENT:
        setReorient((Reorientation)newValue);
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
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION__POSITION:
        setPosition((Matrix)null);
        return;
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION__REORIENT:
        setReorient((Reorientation)null);
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
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION__POSITION:
        return position != null;
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION__REORIENT:
        return reorient != null;
    }
    return super.eIsSet(featureID);
  }

} //RelativeTransformationImpl
