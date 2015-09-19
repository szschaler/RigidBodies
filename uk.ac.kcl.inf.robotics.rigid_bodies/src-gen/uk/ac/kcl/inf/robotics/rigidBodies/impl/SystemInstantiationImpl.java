/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.SystemInstantiationImpl#getSystem <em>System</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.SystemInstantiationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemInstantiationImpl extends MinimalEObjectImpl.Container implements SystemInstantiation
{
  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected uk.ac.kcl.inf.robotics.rigidBodies.System system;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemInstantiationImpl()
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
    return RigidBodiesPackage.Literals.SYSTEM_INSTANTIATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uk.ac.kcl.inf.robotics.rigidBodies.System getSystem()
  {
    if (system != null && system.eIsProxy())
    {
      InternalEObject oldSystem = (InternalEObject)system;
      system = (uk.ac.kcl.inf.robotics.rigidBodies.System)eResolveProxy(oldSystem);
      if (system != oldSystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.SYSTEM_INSTANTIATION__SYSTEM, oldSystem, system));
      }
    }
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uk.ac.kcl.inf.robotics.rigidBodies.System basicGetSystem()
  {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(uk.ac.kcl.inf.robotics.rigidBodies.System newSystem)
  {
    uk.ac.kcl.inf.robotics.rigidBodies.System oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.SYSTEM_INSTANTIATION__SYSTEM, oldSystem, system));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.SYSTEM_INSTANTIATION__NAME, oldName, name));
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
      case RigidBodiesPackage.SYSTEM_INSTANTIATION__SYSTEM:
        if (resolve) return getSystem();
        return basicGetSystem();
      case RigidBodiesPackage.SYSTEM_INSTANTIATION__NAME:
        return getName();
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
      case RigidBodiesPackage.SYSTEM_INSTANTIATION__SYSTEM:
        setSystem((uk.ac.kcl.inf.robotics.rigidBodies.System)newValue);
        return;
      case RigidBodiesPackage.SYSTEM_INSTANTIATION__NAME:
        setName((String)newValue);
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
      case RigidBodiesPackage.SYSTEM_INSTANTIATION__SYSTEM:
        setSystem((uk.ac.kcl.inf.robotics.rigidBodies.System)null);
        return;
      case RigidBodiesPackage.SYSTEM_INSTANTIATION__NAME:
        setName(NAME_EDEFAULT);
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
      case RigidBodiesPackage.SYSTEM_INSTANTIATION__SYSTEM:
        return system != null;
      case RigidBodiesPackage.SYSTEM_INSTANTIATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //SystemInstantiationImpl
