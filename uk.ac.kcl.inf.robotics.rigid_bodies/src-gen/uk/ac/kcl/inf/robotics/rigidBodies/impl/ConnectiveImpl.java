/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.Connective;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConnectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConnectiveImpl#getBody1 <em>Body1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectiveImpl extends SystemElementImpl implements Connective
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
   * The cached value of the '{@link #getBody1() <em>Body1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody1()
   * @generated
   * @ordered
   */
  protected BodyReference body1;

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
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONNECTIVE__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONNECTIVE__BODY1, oldBody1, newBody1);
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
        msgs = ((InternalEObject)body1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONNECTIVE__BODY1, null, msgs);
      if (newBody1 != null)
        msgs = ((InternalEObject)newBody1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONNECTIVE__BODY1, null, msgs);
      msgs = basicSetBody1(newBody1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONNECTIVE__BODY1, newBody1, newBody1));
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
      case RigidBodiesPackage.CONNECTIVE__BODY1:
        return basicSetBody1(null, msgs);
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
      case RigidBodiesPackage.CONNECTIVE__NAME:
        return getName();
      case RigidBodiesPackage.CONNECTIVE__BODY1:
        return getBody1();
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
      case RigidBodiesPackage.CONNECTIVE__NAME:
        setName((String)newValue);
        return;
      case RigidBodiesPackage.CONNECTIVE__BODY1:
        setBody1((BodyReference)newValue);
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
      case RigidBodiesPackage.CONNECTIVE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RigidBodiesPackage.CONNECTIVE__BODY1:
        setBody1((BodyReference)null);
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
      case RigidBodiesPackage.CONNECTIVE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RigidBodiesPackage.CONNECTIVE__BODY1:
        return body1 != null;
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

} //ConnectiveImpl
