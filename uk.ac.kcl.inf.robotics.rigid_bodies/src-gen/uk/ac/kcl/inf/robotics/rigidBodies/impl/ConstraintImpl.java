/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint;
import uk.ac.kcl.inf.robotics.rigidBodies.ConstraintType;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl#getBody1 <em>Body1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl#getRelTrans1 <em>Rel Trans1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl#getBody2 <em>Body2</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConstraintImpl#getRelTrans2 <em>Rel Trans2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends SystemElementImpl implements Constraint
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ConstraintType TYPE_EDEFAULT = ConstraintType.GEOMETRICAL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ConstraintType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody1() <em>Body1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody1()
   * @generated
   * @ordered
   */
  protected BodyReference body1;

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
   * The cached value of the '{@link #getRelTrans2() <em>Rel Trans2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelTrans2()
   * @generated
   * @ordered
   */
  protected RelativeTransformation relTrans2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintImpl()
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
    return RigidBodiesPackage.Literals.CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ConstraintType newType)
  {
    ConstraintType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONSTRAINT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyReference getBody1()
  {
    return body1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody1(BodyReference newBody1, NotificationChain msgs)
  {
    BodyReference oldBody1 = body1;
    body1 = newBody1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONSTRAINT__BODY1, oldBody1, newBody1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody1(BodyReference newBody1)
  {
    if (newBody1 != body1)
    {
      NotificationChain msgs = null;
      if (body1 != null)
        msgs = ((InternalEObject)body1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONSTRAINT__BODY1, null, msgs);
      if (newBody1 != null)
        msgs = ((InternalEObject)newBody1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONSTRAINT__BODY1, null, msgs);
      msgs = basicSetBody1(newBody1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONSTRAINT__BODY1, newBody1, newBody1));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONSTRAINT__REL_TRANS1, oldRelTrans1, newRelTrans1);
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
        msgs = ((InternalEObject)relTrans1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONSTRAINT__REL_TRANS1, null, msgs);
      if (newRelTrans1 != null)
        msgs = ((InternalEObject)newRelTrans1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONSTRAINT__REL_TRANS1, null, msgs);
      msgs = basicSetRelTrans1(newRelTrans1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONSTRAINT__REL_TRANS1, newRelTrans1, newRelTrans1));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONSTRAINT__BODY2, oldBody2, newBody2);
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
        msgs = ((InternalEObject)body2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONSTRAINT__BODY2, null, msgs);
      if (newBody2 != null)
        msgs = ((InternalEObject)newBody2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONSTRAINT__BODY2, null, msgs);
      msgs = basicSetBody2(newBody2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONSTRAINT__BODY2, newBody2, newBody2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativeTransformation getRelTrans2()
  {
    return relTrans2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelTrans2(RelativeTransformation newRelTrans2, NotificationChain msgs)
  {
    RelativeTransformation oldRelTrans2 = relTrans2;
    relTrans2 = newRelTrans2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONSTRAINT__REL_TRANS2, oldRelTrans2, newRelTrans2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelTrans2(RelativeTransformation newRelTrans2)
  {
    if (newRelTrans2 != relTrans2)
    {
      NotificationChain msgs = null;
      if (relTrans2 != null)
        msgs = ((InternalEObject)relTrans2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONSTRAINT__REL_TRANS2, null, msgs);
      if (newRelTrans2 != null)
        msgs = ((InternalEObject)newRelTrans2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONSTRAINT__REL_TRANS2, null, msgs);
      msgs = basicSetRelTrans2(newRelTrans2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONSTRAINT__REL_TRANS2, newRelTrans2, newRelTrans2));
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
      case RigidBodiesPackage.CONSTRAINT__BODY1:
        return basicSetBody1(null, msgs);
      case RigidBodiesPackage.CONSTRAINT__REL_TRANS1:
        return basicSetRelTrans1(null, msgs);
      case RigidBodiesPackage.CONSTRAINT__BODY2:
        return basicSetBody2(null, msgs);
      case RigidBodiesPackage.CONSTRAINT__REL_TRANS2:
        return basicSetRelTrans2(null, msgs);
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
      case RigidBodiesPackage.CONSTRAINT__TYPE:
        return getType();
      case RigidBodiesPackage.CONSTRAINT__BODY1:
        return getBody1();
      case RigidBodiesPackage.CONSTRAINT__REL_TRANS1:
        return getRelTrans1();
      case RigidBodiesPackage.CONSTRAINT__BODY2:
        return getBody2();
      case RigidBodiesPackage.CONSTRAINT__REL_TRANS2:
        return getRelTrans2();
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
      case RigidBodiesPackage.CONSTRAINT__TYPE:
        setType((ConstraintType)newValue);
        return;
      case RigidBodiesPackage.CONSTRAINT__BODY1:
        setBody1((BodyReference)newValue);
        return;
      case RigidBodiesPackage.CONSTRAINT__REL_TRANS1:
        setRelTrans1((RelativeTransformation)newValue);
        return;
      case RigidBodiesPackage.CONSTRAINT__BODY2:
        setBody2((BodyReference)newValue);
        return;
      case RigidBodiesPackage.CONSTRAINT__REL_TRANS2:
        setRelTrans2((RelativeTransformation)newValue);
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
      case RigidBodiesPackage.CONSTRAINT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RigidBodiesPackage.CONSTRAINT__BODY1:
        setBody1((BodyReference)null);
        return;
      case RigidBodiesPackage.CONSTRAINT__REL_TRANS1:
        setRelTrans1((RelativeTransformation)null);
        return;
      case RigidBodiesPackage.CONSTRAINT__BODY2:
        setBody2((BodyReference)null);
        return;
      case RigidBodiesPackage.CONSTRAINT__REL_TRANS2:
        setRelTrans2((RelativeTransformation)null);
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
      case RigidBodiesPackage.CONSTRAINT__TYPE:
        return type != TYPE_EDEFAULT;
      case RigidBodiesPackage.CONSTRAINT__BODY1:
        return body1 != null;
      case RigidBodiesPackage.CONSTRAINT__REL_TRANS1:
        return relTrans1 != null;
      case RigidBodiesPackage.CONSTRAINT__BODY2:
        return body2 != null;
      case RigidBodiesPackage.CONSTRAINT__REL_TRANS2:
        return relTrans2 != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ConstraintImpl
