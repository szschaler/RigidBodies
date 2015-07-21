/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad;
import uk.ac.kcl.inf.robotics.rigidBodies.LoadType;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ExternalLoadImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ExternalLoadImpl#getBody <em>Body</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ExternalLoadImpl#getRelTrans1 <em>Rel Trans1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalLoadImpl extends SystemElementImpl implements ExternalLoad
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final LoadType TYPE_EDEFAULT = LoadType.FORCE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected LoadType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected BodyReference body;

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
  protected ExternalLoadImpl()
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
    return RigidBodiesPackage.Literals.EXTERNAL_LOAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(LoadType newType)
  {
    LoadType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.EXTERNAL_LOAD__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyReference getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(BodyReference newBody, NotificationChain msgs)
  {
    BodyReference oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.EXTERNAL_LOAD__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(BodyReference newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.EXTERNAL_LOAD__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.EXTERNAL_LOAD__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.EXTERNAL_LOAD__BODY, newBody, newBody));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.EXTERNAL_LOAD__REL_TRANS1, oldRelTrans1, newRelTrans1);
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
        msgs = ((InternalEObject)relTrans1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.EXTERNAL_LOAD__REL_TRANS1, null, msgs);
      if (newRelTrans1 != null)
        msgs = ((InternalEObject)newRelTrans1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.EXTERNAL_LOAD__REL_TRANS1, null, msgs);
      msgs = basicSetRelTrans1(newRelTrans1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.EXTERNAL_LOAD__REL_TRANS1, newRelTrans1, newRelTrans1));
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
      case RigidBodiesPackage.EXTERNAL_LOAD__BODY:
        return basicSetBody(null, msgs);
      case RigidBodiesPackage.EXTERNAL_LOAD__REL_TRANS1:
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
      case RigidBodiesPackage.EXTERNAL_LOAD__TYPE:
        return getType();
      case RigidBodiesPackage.EXTERNAL_LOAD__BODY:
        return getBody();
      case RigidBodiesPackage.EXTERNAL_LOAD__REL_TRANS1:
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
      case RigidBodiesPackage.EXTERNAL_LOAD__TYPE:
        setType((LoadType)newValue);
        return;
      case RigidBodiesPackage.EXTERNAL_LOAD__BODY:
        setBody((BodyReference)newValue);
        return;
      case RigidBodiesPackage.EXTERNAL_LOAD__REL_TRANS1:
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
      case RigidBodiesPackage.EXTERNAL_LOAD__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RigidBodiesPackage.EXTERNAL_LOAD__BODY:
        setBody((BodyReference)null);
        return;
      case RigidBodiesPackage.EXTERNAL_LOAD__REL_TRANS1:
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
      case RigidBodiesPackage.EXTERNAL_LOAD__TYPE:
        return type != TYPE_EDEFAULT;
      case RigidBodiesPackage.EXTERNAL_LOAD__BODY:
        return body != null;
      case RigidBodiesPackage.EXTERNAL_LOAD__REL_TRANS1:
        return relTrans1 != null;
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

} //ExternalLoadImpl
