/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.Connective;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConnectiveImpl#getRelTrans1 <em>Rel Trans1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectiveImpl extends SystemElementImpl implements Connective
{
  /**
   * The cached value of the '{@link #getRelTrans1() <em>Rel Trans1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelTrans1()
   * @generated
   * @ordered
   */
  protected RelativeTransformation relTrans1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectiveImpl()
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
    return RigidBodiesPackage.Literals.CONNECTIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativeTransformation getRelTrans1()
  {
    return relTrans1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelTrans1(RelativeTransformation newRelTrans1, NotificationChain msgs)
  {
    RelativeTransformation oldRelTrans1 = relTrans1;
    relTrans1 = newRelTrans1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONNECTIVE__REL_TRANS1, oldRelTrans1, newRelTrans1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelTrans1(RelativeTransformation newRelTrans1)
  {
    if (newRelTrans1 != relTrans1)
    {
      NotificationChain msgs = null;
      if (relTrans1 != null)
        msgs = ((InternalEObject)relTrans1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONNECTIVE__REL_TRANS1, null, msgs);
      if (newRelTrans1 != null)
        msgs = ((InternalEObject)newRelTrans1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONNECTIVE__REL_TRANS1, null, msgs);
      msgs = basicSetRelTrans1(newRelTrans1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONNECTIVE__REL_TRANS1, newRelTrans1, newRelTrans1));
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
      case RigidBodiesPackage.CONNECTIVE__REL_TRANS1:
        return basicSetRelTrans1(null, msgs);
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
      case RigidBodiesPackage.CONNECTIVE__REL_TRANS1:
        return getRelTrans1();
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
      case RigidBodiesPackage.CONNECTIVE__REL_TRANS1:
        setRelTrans1((RelativeTransformation)newValue);
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
      case RigidBodiesPackage.CONNECTIVE__REL_TRANS1:
        setRelTrans1((RelativeTransformation)null);
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
      case RigidBodiesPackage.CONNECTIVE__REL_TRANS1:
        return relTrans1 != null;
    }
    return super.eIsSet(featureID);
  }

} //ConnectiveImpl
