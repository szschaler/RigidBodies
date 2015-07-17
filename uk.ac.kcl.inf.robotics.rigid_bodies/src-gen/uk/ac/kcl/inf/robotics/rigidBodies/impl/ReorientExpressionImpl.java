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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.robotics.rigidBodies.AXIS;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.Reorientation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reorient Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ReorientExpressionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ReorientExpressionImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ReorientExpressionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReorientExpressionImpl extends MinimalEObjectImpl.Container implements ReorientExpression
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Reorientation ref;

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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<Expression> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReorientExpressionImpl()
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
    return RigidBodiesPackage.Literals.REORIENT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reorientation getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (Reorientation)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.REORIENT_EXPRESSION__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reorientation basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(Reorientation newRef)
  {
    Reorientation oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.REORIENT_EXPRESSION__REF, oldRef, ref));
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
      axis = new EDataTypeEList<AXIS>(AXIS.class, this, RigidBodiesPackage.REORIENT_EXPRESSION__AXIS);
    }
    return axis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getValue()
  {
    if (value == null)
    {
      value = new EObjectContainmentEList<Expression>(Expression.class, this, RigidBodiesPackage.REORIENT_EXPRESSION__VALUE);
    }
    return value;
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
      case RigidBodiesPackage.REORIENT_EXPRESSION__VALUE:
        return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
      case RigidBodiesPackage.REORIENT_EXPRESSION__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case RigidBodiesPackage.REORIENT_EXPRESSION__AXIS:
        return getAxis();
      case RigidBodiesPackage.REORIENT_EXPRESSION__VALUE:
        return getValue();
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
      case RigidBodiesPackage.REORIENT_EXPRESSION__REF:
        setRef((Reorientation)newValue);
        return;
      case RigidBodiesPackage.REORIENT_EXPRESSION__AXIS:
        getAxis().clear();
        getAxis().addAll((Collection<? extends AXIS>)newValue);
        return;
      case RigidBodiesPackage.REORIENT_EXPRESSION__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends Expression>)newValue);
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
      case RigidBodiesPackage.REORIENT_EXPRESSION__REF:
        setRef((Reorientation)null);
        return;
      case RigidBodiesPackage.REORIENT_EXPRESSION__AXIS:
        getAxis().clear();
        return;
      case RigidBodiesPackage.REORIENT_EXPRESSION__VALUE:
        getValue().clear();
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
      case RigidBodiesPackage.REORIENT_EXPRESSION__REF:
        return ref != null;
      case RigidBodiesPackage.REORIENT_EXPRESSION__AXIS:
        return axis != null && !axis.isEmpty();
      case RigidBodiesPackage.REORIENT_EXPRESSION__VALUE:
        return value != null && !value.isEmpty();
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

} //ReorientExpressionImpl
