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

import uk.ac.kcl.inf.robotics.rigidBodies.Constraint;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rigid Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodyImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodyImpl#getJoints <em>Joints</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodyImpl#getMasses <em>Masses</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.RigidBodyImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RigidBodyImpl extends MinimalEObjectImpl.Container implements RigidBody
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
   * The cached value of the '{@link #getJoints() <em>Joints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoints()
   * @generated
   * @ordered
   */
  protected EList<Joint> joints;

  /**
   * The cached value of the '{@link #getMasses() <em>Masses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMasses()
   * @generated
   * @ordered
   */
  protected EList<Mass> masses;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RigidBodyImpl()
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
    return RigidBodiesPackage.Literals.RIGID_BODY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.RIGID_BODY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Joint> getJoints()
  {
    if (joints == null)
    {
      joints = new EObjectContainmentEList<Joint>(Joint.class, this, RigidBodiesPackage.RIGID_BODY__JOINTS);
    }
    return joints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mass> getMasses()
  {
    if (masses == null)
    {
      masses = new EObjectContainmentEList<Mass>(Mass.class, this, RigidBodiesPackage.RIGID_BODY__MASSES);
    }
    return masses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, RigidBodiesPackage.RIGID_BODY__CONSTRAINTS);
    }
    return constraints;
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
      case RigidBodiesPackage.RIGID_BODY__JOINTS:
        return ((InternalEList<?>)getJoints()).basicRemove(otherEnd, msgs);
      case RigidBodiesPackage.RIGID_BODY__MASSES:
        return ((InternalEList<?>)getMasses()).basicRemove(otherEnd, msgs);
      case RigidBodiesPackage.RIGID_BODY__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
      case RigidBodiesPackage.RIGID_BODY__NAME:
        return getName();
      case RigidBodiesPackage.RIGID_BODY__JOINTS:
        return getJoints();
      case RigidBodiesPackage.RIGID_BODY__MASSES:
        return getMasses();
      case RigidBodiesPackage.RIGID_BODY__CONSTRAINTS:
        return getConstraints();
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
      case RigidBodiesPackage.RIGID_BODY__NAME:
        setName((String)newValue);
        return;
      case RigidBodiesPackage.RIGID_BODY__JOINTS:
        getJoints().clear();
        getJoints().addAll((Collection<? extends Joint>)newValue);
        return;
      case RigidBodiesPackage.RIGID_BODY__MASSES:
        getMasses().clear();
        getMasses().addAll((Collection<? extends Mass>)newValue);
        return;
      case RigidBodiesPackage.RIGID_BODY__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
      case RigidBodiesPackage.RIGID_BODY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RigidBodiesPackage.RIGID_BODY__JOINTS:
        getJoints().clear();
        return;
      case RigidBodiesPackage.RIGID_BODY__MASSES:
        getMasses().clear();
        return;
      case RigidBodiesPackage.RIGID_BODY__CONSTRAINTS:
        getConstraints().clear();
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
      case RigidBodiesPackage.RIGID_BODY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RigidBodiesPackage.RIGID_BODY__JOINTS:
        return joints != null && !joints.isEmpty();
      case RigidBodiesPackage.RIGID_BODY__MASSES:
        return masses != null && !masses.isEmpty();
      case RigidBodiesPackage.RIGID_BODY__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
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

} //RigidBodyImpl
