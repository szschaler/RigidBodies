/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyImpl#getMass <em>Mass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyImpl extends SystemElementImpl implements Body
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
   * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMass()
   * @generated
   * @ordered
   */
  protected Mass mass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyImpl()
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
    return RigidBodiesPackage.Literals.BODY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BODY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mass getMass()
  {
    return mass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMass(Mass newMass, NotificationChain msgs)
  {
    Mass oldMass = mass;
    mass = newMass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BODY__MASS, oldMass, newMass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMass(Mass newMass)
  {
    if (newMass != mass)
    {
      NotificationChain msgs = null;
      if (mass != null)
        msgs = ((InternalEObject)mass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BODY__MASS, null, msgs);
      if (newMass != null)
        msgs = ((InternalEObject)newMass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BODY__MASS, null, msgs);
      msgs = basicSetMass(newMass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BODY__MASS, newMass, newMass));
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
      case RigidBodiesPackage.BODY__MASS:
        return basicSetMass(null, msgs);
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
      case RigidBodiesPackage.BODY__NAME:
        return getName();
      case RigidBodiesPackage.BODY__MASS:
        return getMass();
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
      case RigidBodiesPackage.BODY__NAME:
        setName((String)newValue);
        return;
      case RigidBodiesPackage.BODY__MASS:
        setMass((Mass)newValue);
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
      case RigidBodiesPackage.BODY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RigidBodiesPackage.BODY__MASS:
        setMass((Mass)null);
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
      case RigidBodiesPackage.BODY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RigidBodiesPackage.BODY__MASS:
        return mass != null;
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

} //BodyImpl
