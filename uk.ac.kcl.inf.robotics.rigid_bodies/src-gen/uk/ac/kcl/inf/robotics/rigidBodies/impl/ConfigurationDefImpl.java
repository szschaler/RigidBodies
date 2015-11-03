/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.robotics.rigidBodies.Configuration;
import uk.ac.kcl.inf.robotics.rigidBodies.ConfigurationDef;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConfigurationDefImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ConfigurationDefImpl#getConfigs <em>Configs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationDefImpl extends MinimalEObjectImpl.Container implements ConfigurationDef
{
  /**
   * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstances()
   * @generated
   * @ordered
   */
  protected EList<SystemInstantiation> instances;

  /**
   * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigs()
   * @generated
   * @ordered
   */
  protected EList<Configuration> configs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationDefImpl()
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
    return RigidBodiesPackage.Literals.CONFIGURATION_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SystemInstantiation> getInstances()
  {
    if (instances == null)
    {
      instances = new EObjectContainmentEList<SystemInstantiation>(SystemInstantiation.class, this, RigidBodiesPackage.CONFIGURATION_DEF__INSTANCES);
    }
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Configuration> getConfigs()
  {
    if (configs == null)
    {
      configs = new EObjectContainmentEList<Configuration>(Configuration.class, this, RigidBodiesPackage.CONFIGURATION_DEF__CONFIGS);
    }
    return configs;
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
      case RigidBodiesPackage.CONFIGURATION_DEF__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
      case RigidBodiesPackage.CONFIGURATION_DEF__CONFIGS:
        return ((InternalEList<?>)getConfigs()).basicRemove(otherEnd, msgs);
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
      case RigidBodiesPackage.CONFIGURATION_DEF__INSTANCES:
        return getInstances();
      case RigidBodiesPackage.CONFIGURATION_DEF__CONFIGS:
        return getConfigs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.CONFIGURATION_DEF__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends SystemInstantiation>)newValue);
        return;
      case RigidBodiesPackage.CONFIGURATION_DEF__CONFIGS:
        getConfigs().clear();
        getConfigs().addAll((Collection<? extends Configuration>)newValue);
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
      case RigidBodiesPackage.CONFIGURATION_DEF__INSTANCES:
        getInstances().clear();
        return;
      case RigidBodiesPackage.CONFIGURATION_DEF__CONFIGS:
        getConfigs().clear();
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
      case RigidBodiesPackage.CONFIGURATION_DEF__INSTANCES:
        return instances != null && !instances.isEmpty();
      case RigidBodiesPackage.CONFIGURATION_DEF__CONFIGS:
        return configs != null && !configs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConfigurationDefImpl
