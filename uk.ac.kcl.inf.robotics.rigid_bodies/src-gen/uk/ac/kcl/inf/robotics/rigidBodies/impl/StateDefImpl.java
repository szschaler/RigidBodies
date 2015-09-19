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

import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.State;
import uk.ac.kcl.inf.robotics.rigidBodies.StateDef;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.StateDefImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.StateDefImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateDefImpl extends MinimalEObjectImpl.Container implements StateDef
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
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateDefImpl()
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
    return RigidBodiesPackage.Literals.STATE_DEF;
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
      instances = new EObjectContainmentEList<SystemInstantiation>(SystemInstantiation.class, this, RigidBodiesPackage.STATE_DEF__INSTANCES);
    }
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, RigidBodiesPackage.STATE_DEF__STATES);
    }
    return states;
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
      case RigidBodiesPackage.STATE_DEF__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
      case RigidBodiesPackage.STATE_DEF__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
      case RigidBodiesPackage.STATE_DEF__INSTANCES:
        return getInstances();
      case RigidBodiesPackage.STATE_DEF__STATES:
        return getStates();
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
      case RigidBodiesPackage.STATE_DEF__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends SystemInstantiation>)newValue);
        return;
      case RigidBodiesPackage.STATE_DEF__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
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
      case RigidBodiesPackage.STATE_DEF__INSTANCES:
        getInstances().clear();
        return;
      case RigidBodiesPackage.STATE_DEF__STATES:
        getStates().clear();
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
      case RigidBodiesPackage.STATE_DEF__INSTANCES:
        return instances != null && !instances.isEmpty();
      case RigidBodiesPackage.STATE_DEF__STATES:
        return states != null && !states.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StateDefImpl
