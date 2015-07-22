/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointMovement;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Joint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BasicJointTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BasicJointTypeImpl#getStiffness <em>Stiffness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicJointTypeImpl extends JointTypeExpressionImpl implements BasicJointType
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JointMovement type;

  /**
   * The cached value of the '{@link #getStiffness() <em>Stiffness</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStiffness()
   * @generated
   * @ordered
   */
  protected StiffnessExp stiffness;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicJointTypeImpl()
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
    return RigidBodiesPackage.Literals.BASIC_JOINT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JointMovement getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JointMovement newType, NotificationChain msgs)
  {
    JointMovement oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASIC_JOINT_TYPE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JointMovement newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASIC_JOINT_TYPE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASIC_JOINT_TYPE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASIC_JOINT_TYPE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StiffnessExp getStiffness()
  {
    return stiffness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStiffness(StiffnessExp newStiffness, NotificationChain msgs)
  {
    StiffnessExp oldStiffness = stiffness;
    stiffness = newStiffness;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASIC_JOINT_TYPE__STIFFNESS, oldStiffness, newStiffness);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStiffness(StiffnessExp newStiffness)
  {
    if (newStiffness != stiffness)
    {
      NotificationChain msgs = null;
      if (stiffness != null)
        msgs = ((InternalEObject)stiffness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASIC_JOINT_TYPE__STIFFNESS, null, msgs);
      if (newStiffness != null)
        msgs = ((InternalEObject)newStiffness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASIC_JOINT_TYPE__STIFFNESS, null, msgs);
      msgs = basicSetStiffness(newStiffness, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASIC_JOINT_TYPE__STIFFNESS, newStiffness, newStiffness));
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
      case RigidBodiesPackage.BASIC_JOINT_TYPE__TYPE:
        return basicSetType(null, msgs);
      case RigidBodiesPackage.BASIC_JOINT_TYPE__STIFFNESS:
        return basicSetStiffness(null, msgs);
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
      case RigidBodiesPackage.BASIC_JOINT_TYPE__TYPE:
        return getType();
      case RigidBodiesPackage.BASIC_JOINT_TYPE__STIFFNESS:
        return getStiffness();
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
      case RigidBodiesPackage.BASIC_JOINT_TYPE__TYPE:
        setType((JointMovement)newValue);
        return;
      case RigidBodiesPackage.BASIC_JOINT_TYPE__STIFFNESS:
        setStiffness((StiffnessExp)newValue);
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
      case RigidBodiesPackage.BASIC_JOINT_TYPE__TYPE:
        setType((JointMovement)null);
        return;
      case RigidBodiesPackage.BASIC_JOINT_TYPE__STIFFNESS:
        setStiffness((StiffnessExp)null);
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
      case RigidBodiesPackage.BASIC_JOINT_TYPE__TYPE:
        return type != null;
      case RigidBodiesPackage.BASIC_JOINT_TYPE__STIFFNESS:
        return stiffness != null;
    }
    return super.eIsSet(featureID);
  }

} //BasicJointTypeImpl
