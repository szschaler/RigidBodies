/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.ColocationConstraint;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colocation Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ColocationConstraintImpl#getJoint1 <em>Joint1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ColocationConstraintImpl#getJoint2 <em>Joint2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColocationConstraintImpl extends ConstraintImpl implements ColocationConstraint
{
  /**
   * The cached value of the '{@link #getJoint1() <em>Joint1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoint1()
   * @generated
   * @ordered
   */
  protected Joint joint1;

  /**
   * The cached value of the '{@link #getJoint2() <em>Joint2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoint2()
   * @generated
   * @ordered
   */
  protected Joint joint2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColocationConstraintImpl()
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
    return RigidBodiesPackage.Literals.COLOCATION_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Joint getJoint1()
  {
    if (joint1 != null && joint1.eIsProxy())
    {
      InternalEObject oldJoint1 = (InternalEObject)joint1;
      joint1 = (Joint)eResolveProxy(oldJoint1);
      if (joint1 != oldJoint1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT1, oldJoint1, joint1));
      }
    }
    return joint1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Joint basicGetJoint1()
  {
    return joint1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJoint1(Joint newJoint1)
  {
    Joint oldJoint1 = joint1;
    joint1 = newJoint1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT1, oldJoint1, joint1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Joint getJoint2()
  {
    if (joint2 != null && joint2.eIsProxy())
    {
      InternalEObject oldJoint2 = (InternalEObject)joint2;
      joint2 = (Joint)eResolveProxy(oldJoint2);
      if (joint2 != oldJoint2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT2, oldJoint2, joint2));
      }
    }
    return joint2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Joint basicGetJoint2()
  {
    return joint2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJoint2(Joint newJoint2)
  {
    Joint oldJoint2 = joint2;
    joint2 = newJoint2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT2, oldJoint2, joint2));
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
      case RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT1:
        if (resolve) return getJoint1();
        return basicGetJoint1();
      case RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT2:
        if (resolve) return getJoint2();
        return basicGetJoint2();
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
      case RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT1:
        setJoint1((Joint)newValue);
        return;
      case RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT2:
        setJoint2((Joint)newValue);
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
      case RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT1:
        setJoint1((Joint)null);
        return;
      case RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT2:
        setJoint2((Joint)null);
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
      case RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT1:
        return joint1 != null;
      case RigidBodiesPackage.COLOCATION_CONSTRAINT__JOINT2:
        return joint2 != null;
    }
    return super.eIsSet(featureID);
  }

} //ColocationConstraintImpl
