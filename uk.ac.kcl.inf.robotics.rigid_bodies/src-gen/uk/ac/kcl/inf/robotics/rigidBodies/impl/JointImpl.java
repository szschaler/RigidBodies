/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getBody1 <em>Body1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getRelTransformation1 <em>Rel Transformation1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getBody2 <em>Body2</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getRelTransformation2 <em>Rel Transformation2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JointImpl extends SystemElementImpl implements Joint
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Matrix4X4 type;

  /**
   * The cached value of the '{@link #getBody1() <em>Body1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody1()
   * @generated
   * @ordered
   */
  protected Body body1;

  /**
   * The cached value of the '{@link #getRelTransformation1() <em>Rel Transformation1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelTransformation1()
   * @generated
   * @ordered
   */
  protected Matrix4X4 relTransformation1;

  /**
   * The cached value of the '{@link #getBody2() <em>Body2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody2()
   * @generated
   * @ordered
   */
  protected Body body2;

  /**
   * The cached value of the '{@link #getRelTransformation2() <em>Rel Transformation2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelTransformation2()
   * @generated
   * @ordered
   */
  protected Matrix4X4 relTransformation2;

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
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix4X4 getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Matrix4X4 newType, NotificationChain msgs)
  {
    Matrix4X4 oldType = type;
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
  public void setType(Matrix4X4 newType)
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
  public Body getBody1()
  {
    if (body1 != null && body1.eIsProxy())
    {
      InternalEObject oldBody1 = (InternalEObject)body1;
      body1 = (Body)eResolveProxy(oldBody1);
      if (body1 != oldBody1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.JOINT__BODY1, oldBody1, body1));
      }
    }
    return body1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body basicGetBody1()
  {
    return body1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody1(Body newBody1)
  {
    Body oldBody1 = body1;
    body1 = newBody1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__BODY1, oldBody1, body1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix4X4 getRelTransformation1()
  {
    return relTransformation1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelTransformation1(Matrix4X4 newRelTransformation1, NotificationChain msgs)
  {
    Matrix4X4 oldRelTransformation1 = relTransformation1;
    relTransformation1 = newRelTransformation1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__REL_TRANSFORMATION1, oldRelTransformation1, newRelTransformation1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelTransformation1(Matrix4X4 newRelTransformation1)
  {
    if (newRelTransformation1 != relTransformation1)
    {
      NotificationChain msgs = null;
      if (relTransformation1 != null)
        msgs = ((InternalEObject)relTransformation1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__REL_TRANSFORMATION1, null, msgs);
      if (newRelTransformation1 != null)
        msgs = ((InternalEObject)newRelTransformation1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__REL_TRANSFORMATION1, null, msgs);
      msgs = basicSetRelTransformation1(newRelTransformation1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__REL_TRANSFORMATION1, newRelTransformation1, newRelTransformation1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body getBody2()
  {
    if (body2 != null && body2.eIsProxy())
    {
      InternalEObject oldBody2 = (InternalEObject)body2;
      body2 = (Body)eResolveProxy(oldBody2);
      if (body2 != oldBody2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.JOINT__BODY2, oldBody2, body2));
      }
    }
    return body2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body basicGetBody2()
  {
    return body2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody2(Body newBody2)
  {
    Body oldBody2 = body2;
    body2 = newBody2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__BODY2, oldBody2, body2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix4X4 getRelTransformation2()
  {
    return relTransformation2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelTransformation2(Matrix4X4 newRelTransformation2, NotificationChain msgs)
  {
    Matrix4X4 oldRelTransformation2 = relTransformation2;
    relTransformation2 = newRelTransformation2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__REL_TRANSFORMATION2, oldRelTransformation2, newRelTransformation2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelTransformation2(Matrix4X4 newRelTransformation2)
  {
    if (newRelTransformation2 != relTransformation2)
    {
      NotificationChain msgs = null;
      if (relTransformation2 != null)
        msgs = ((InternalEObject)relTransformation2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__REL_TRANSFORMATION2, null, msgs);
      if (newRelTransformation2 != null)
        msgs = ((InternalEObject)newRelTransformation2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__REL_TRANSFORMATION2, null, msgs);
      msgs = basicSetRelTransformation2(newRelTransformation2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__REL_TRANSFORMATION2, newRelTransformation2, newRelTransformation2));
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
      case RigidBodiesPackage.JOINT__REL_TRANSFORMATION1:
        return basicSetRelTransformation1(null, msgs);
      case RigidBodiesPackage.JOINT__REL_TRANSFORMATION2:
        return basicSetRelTransformation2(null, msgs);
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
      case RigidBodiesPackage.JOINT__NAME:
        return getName();
      case RigidBodiesPackage.JOINT__TYPE:
        return getType();
      case RigidBodiesPackage.JOINT__BODY1:
        if (resolve) return getBody1();
        return basicGetBody1();
      case RigidBodiesPackage.JOINT__REL_TRANSFORMATION1:
        return getRelTransformation1();
      case RigidBodiesPackage.JOINT__BODY2:
        if (resolve) return getBody2();
        return basicGetBody2();
      case RigidBodiesPackage.JOINT__REL_TRANSFORMATION2:
        return getRelTransformation2();
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
      case RigidBodiesPackage.JOINT__NAME:
        setName((String)newValue);
        return;
      case RigidBodiesPackage.JOINT__TYPE:
        setType((Matrix4X4)newValue);
        return;
      case RigidBodiesPackage.JOINT__BODY1:
        setBody1((Body)newValue);
        return;
      case RigidBodiesPackage.JOINT__REL_TRANSFORMATION1:
        setRelTransformation1((Matrix4X4)newValue);
        return;
      case RigidBodiesPackage.JOINT__BODY2:
        setBody2((Body)newValue);
        return;
      case RigidBodiesPackage.JOINT__REL_TRANSFORMATION2:
        setRelTransformation2((Matrix4X4)newValue);
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
      case RigidBodiesPackage.JOINT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RigidBodiesPackage.JOINT__TYPE:
        setType((Matrix4X4)null);
        return;
      case RigidBodiesPackage.JOINT__BODY1:
        setBody1((Body)null);
        return;
      case RigidBodiesPackage.JOINT__REL_TRANSFORMATION1:
        setRelTransformation1((Matrix4X4)null);
        return;
      case RigidBodiesPackage.JOINT__BODY2:
        setBody2((Body)null);
        return;
      case RigidBodiesPackage.JOINT__REL_TRANSFORMATION2:
        setRelTransformation2((Matrix4X4)null);
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
      case RigidBodiesPackage.JOINT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RigidBodiesPackage.JOINT__TYPE:
        return type != null;
      case RigidBodiesPackage.JOINT__BODY1:
        return body1 != null;
      case RigidBodiesPackage.JOINT__REL_TRANSFORMATION1:
        return relTransformation1 != null;
      case RigidBodiesPackage.JOINT__BODY2:
        return body2 != null;
      case RigidBodiesPackage.JOINT__REL_TRANSFORMATION2:
        return relTransformation2 != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //JointImpl
