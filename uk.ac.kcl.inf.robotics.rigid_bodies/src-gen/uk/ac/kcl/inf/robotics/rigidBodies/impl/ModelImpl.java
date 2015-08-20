/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.robotics.rigidBodies.Environment;
import uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition;
import uk.ac.kcl.inf.robotics.rigidBodies.Model;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ModelImpl#getDefs <em>Defs</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ModelImpl#getWorld <em>World</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ModelImpl#getBodies <em>Bodies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getDefs() <em>Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefs()
   * @generated
   * @ordered
   */
  protected EList<InitialDefinition> defs;

  /**
   * The cached value of the '{@link #getWorld() <em>World</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorld()
   * @generated
   * @ordered
   */
  protected Environment world;

  /**
   * The cached value of the '{@link #getBodies() <em>Bodies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodies()
   * @generated
   * @ordered
   */
  protected EList<uk.ac.kcl.inf.robotics.rigidBodies.System> bodies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return RigidBodiesPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InitialDefinition> getDefs()
  {
    if (defs == null)
    {
      defs = new EObjectContainmentEList<InitialDefinition>(InitialDefinition.class, this, RigidBodiesPackage.MODEL__DEFS);
    }
    return defs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment getWorld()
  {
    return world;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorld(Environment newWorld, NotificationChain msgs)
  {
    Environment oldWorld = world;
    world = newWorld;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.MODEL__WORLD, oldWorld, newWorld);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorld(Environment newWorld)
  {
    if (newWorld != world)
    {
      NotificationChain msgs = null;
      if (world != null)
        msgs = ((InternalEObject)world).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.MODEL__WORLD, null, msgs);
      if (newWorld != null)
        msgs = ((InternalEObject)newWorld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.MODEL__WORLD, null, msgs);
      msgs = basicSetWorld(newWorld, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.MODEL__WORLD, newWorld, newWorld));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<uk.ac.kcl.inf.robotics.rigidBodies.System> getBodies()
  {
    if (bodies == null)
    {
      bodies = new EObjectContainmentEList<uk.ac.kcl.inf.robotics.rigidBodies.System>(uk.ac.kcl.inf.robotics.rigidBodies.System.class, this, RigidBodiesPackage.MODEL__BODIES);
    }
    return bodies;
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
      case RigidBodiesPackage.MODEL__DEFS:
        return ((InternalEList<?>)getDefs()).basicRemove(otherEnd, msgs);
      case RigidBodiesPackage.MODEL__WORLD:
        return basicSetWorld(null, msgs);
      case RigidBodiesPackage.MODEL__BODIES:
        return ((InternalEList<?>)getBodies()).basicRemove(otherEnd, msgs);
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
      case RigidBodiesPackage.MODEL__DEFS:
        return getDefs();
      case RigidBodiesPackage.MODEL__WORLD:
        return getWorld();
      case RigidBodiesPackage.MODEL__BODIES:
        return getBodies();
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
      case RigidBodiesPackage.MODEL__DEFS:
        getDefs().clear();
        getDefs().addAll((Collection<? extends InitialDefinition>)newValue);
        return;
      case RigidBodiesPackage.MODEL__WORLD:
        setWorld((Environment)newValue);
        return;
      case RigidBodiesPackage.MODEL__BODIES:
        getBodies().clear();
        getBodies().addAll((Collection<? extends uk.ac.kcl.inf.robotics.rigidBodies.System>)newValue);
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
      case RigidBodiesPackage.MODEL__DEFS:
        getDefs().clear();
        return;
      case RigidBodiesPackage.MODEL__WORLD:
        setWorld((Environment)null);
        return;
      case RigidBodiesPackage.MODEL__BODIES:
        getBodies().clear();
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
      case RigidBodiesPackage.MODEL__DEFS:
        return defs != null && !defs.isEmpty();
      case RigidBodiesPackage.MODEL__WORLD:
        return world != null;
      case RigidBodiesPackage.MODEL__BODIES:
        return bodies != null && !bodies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
