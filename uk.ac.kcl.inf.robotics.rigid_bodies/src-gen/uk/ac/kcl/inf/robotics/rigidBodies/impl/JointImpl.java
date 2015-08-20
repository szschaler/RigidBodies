/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getRelTrans1 <em>Rel Trans1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getBody2 <em>Body2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointImpl extends ConnectiveImpl implements Joint
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JointType type;

  /**
   * The default value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStart()
   * @generated
   * @ordered
   */
  protected static final boolean IS_START_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStart()
   * @generated
   * @ordered
   */
  protected boolean isStart = IS_START_EDEFAULT;

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
   * The cached value of the '{@link #getBody2() <em>Body2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody2()
   * @generated
   * @ordered
   */
  protected BodyReference body2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JointImpl()
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
    return RigidBodiesPackage.Literals.JOINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JointType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JointType newType, NotificationChain msgs)
  {
    JointType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JointType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsStart()
  {
    return isStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsStart(boolean newIsStart)
  {
    boolean oldIsStart = isStart;
    isStart = newIsStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__IS_START, oldIsStart, isStart));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__REL_TRANS1, oldRelTrans1, newRelTrans1);
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
        msgs = ((InternalEObject)relTrans1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__REL_TRANS1, null, msgs);
      if (newRelTrans1 != null)
        msgs = ((InternalEObject)newRelTrans1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__REL_TRANS1, null, msgs);
      msgs = basicSetRelTrans1(newRelTrans1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__REL_TRANS1, newRelTrans1, newRelTrans1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyReference getBody2()
  {
    return body2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody2(BodyReference newBody2, NotificationChain msgs)
  {
    BodyReference oldBody2 = body2;
    body2 = newBody2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__BODY2, oldBody2, newBody2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody2(BodyReference newBody2)
  {
    if (newBody2 != body2)
    {
      NotificationChain msgs = null;
      if (body2 != null)
        msgs = ((InternalEObject)body2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__BODY2, null, msgs);
      if (newBody2 != null)
        msgs = ((InternalEObject)newBody2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__BODY2, null, msgs);
      msgs = basicSetBody2(newBody2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__BODY2, newBody2, newBody2));
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
      case RigidBodiesPackage.JOINT__TYPE:
        return basicSetType(null, msgs);
      case RigidBodiesPackage.JOINT__REL_TRANS1:
        return basicSetRelTrans1(null, msgs);
      case RigidBodiesPackage.JOINT__BODY2:
        return basicSetBody2(null, msgs);
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
      case RigidBodiesPackage.JOINT__TYPE:
        return getType();
      case RigidBodiesPackage.JOINT__IS_START:
        return isIsStart();
      case RigidBodiesPackage.JOINT__REL_TRANS1:
        return getRelTrans1();
      case RigidBodiesPackage.JOINT__BODY2:
        return getBody2();
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
      case RigidBodiesPackage.JOINT__TYPE:
        setType((JointType)newValue);
        return;
      case RigidBodiesPackage.JOINT__IS_START:
        setIsStart((Boolean)newValue);
        return;
      case RigidBodiesPackage.JOINT__REL_TRANS1:
        setRelTrans1((RelativeTransformation)newValue);
        return;
      case RigidBodiesPackage.JOINT__BODY2:
        setBody2((BodyReference)newValue);
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
      case RigidBodiesPackage.JOINT__TYPE:
        setType((JointType)null);
        return;
      case RigidBodiesPackage.JOINT__IS_START:
        setIsStart(IS_START_EDEFAULT);
        return;
      case RigidBodiesPackage.JOINT__REL_TRANS1:
        setRelTrans1((RelativeTransformation)null);
        return;
      case RigidBodiesPackage.JOINT__BODY2:
        setBody2((BodyReference)null);
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
      case RigidBodiesPackage.JOINT__TYPE:
        return type != null;
      case RigidBodiesPackage.JOINT__IS_START:
        return isStart != IS_START_EDEFAULT;
      case RigidBodiesPackage.JOINT__REL_TRANS1:
        return relTrans1 != null;
      case RigidBodiesPackage.JOINT__BODY2:
        return body2 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isStart: ");
    result.append(isStart);
    result.append(')');
    return result.toString();
  }

} //JointImpl
