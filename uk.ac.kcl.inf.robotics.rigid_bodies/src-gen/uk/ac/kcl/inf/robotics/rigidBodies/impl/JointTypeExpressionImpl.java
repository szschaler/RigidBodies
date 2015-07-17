/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import uk.ac.kcl.inf.robotics.rigidBodies.AXIS;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint Type Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointTypeExpressionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointTypeExpressionImpl#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JointTypeExpressionImpl extends MinimalEObjectImpl.Container implements JointTypeExpression
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected JointType ref;

  /**
   * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected EList<AXIS> axis;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JointTypeExpressionImpl()
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
    return RigidBodiesPackage.Literals.JOINT_TYPE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JointType getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (JointType)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.JOINT_TYPE_EXPRESSION__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JointType basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(JointType newRef)
  {
    JointType oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT_TYPE_EXPRESSION__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AXIS> getAxis()
  {
    if (axis == null)
    {
      axis = new EDataTypeEList<AXIS>(AXIS.class, this, RigidBodiesPackage.JOINT_TYPE_EXPRESSION__AXIS);
    }
    return axis;
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
      case RigidBodiesPackage.JOINT_TYPE_EXPRESSION__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case RigidBodiesPackage.JOINT_TYPE_EXPRESSION__AXIS:
        return getAxis();
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
      case RigidBodiesPackage.JOINT_TYPE_EXPRESSION__REF:
        setRef((JointType)newValue);
        return;
      case RigidBodiesPackage.JOINT_TYPE_EXPRESSION__AXIS:
        getAxis().clear();
        getAxis().addAll((Collection<? extends AXIS>)newValue);
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
      case RigidBodiesPackage.JOINT_TYPE_EXPRESSION__REF:
        setRef((JointType)null);
        return;
      case RigidBodiesPackage.JOINT_TYPE_EXPRESSION__AXIS:
        getAxis().clear();
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
      case RigidBodiesPackage.JOINT_TYPE_EXPRESSION__REF:
        return ref != null;
      case RigidBodiesPackage.JOINT_TYPE_EXPRESSION__AXIS:
        return axis != null && !axis.isEmpty();
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
    result.append(" (axis: ");
    result.append(axis);
    result.append(')');
    return result.toString();
  }

} //JointTypeExpressionImpl
