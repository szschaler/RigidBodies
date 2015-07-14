/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix4X4;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4Ref;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix4 X4 Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix4X4RefImpl#getMatrix <em>Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Matrix4X4RefImpl extends Matrix4X4Impl implements Matrix4X4Ref
{
  /**
   * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatrix()
   * @generated
   * @ordered
   */
  protected BaseMatrix4X4 matrix;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Matrix4X4RefImpl()
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
    return RigidBodiesPackage.Literals.MATRIX4_X4_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseMatrix4X4 getMatrix()
  {
    if (matrix != null && matrix.eIsProxy())
    {
      InternalEObject oldMatrix = (InternalEObject)matrix;
      matrix = (BaseMatrix4X4)eResolveProxy(oldMatrix);
      if (matrix != oldMatrix)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.MATRIX4_X4_REF__MATRIX, oldMatrix, matrix));
      }
    }
    return matrix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseMatrix4X4 basicGetMatrix()
  {
    return matrix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatrix(BaseMatrix4X4 newMatrix)
  {
    BaseMatrix4X4 oldMatrix = matrix;
    matrix = newMatrix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.MATRIX4_X4_REF__MATRIX, oldMatrix, matrix));
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
      case RigidBodiesPackage.MATRIX4_X4_REF__MATRIX:
        if (resolve) return getMatrix();
        return basicGetMatrix();
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
      case RigidBodiesPackage.MATRIX4_X4_REF__MATRIX:
        setMatrix((BaseMatrix4X4)newValue);
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
      case RigidBodiesPackage.MATRIX4_X4_REF__MATRIX:
        setMatrix((BaseMatrix4X4)null);
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
      case RigidBodiesPackage.MATRIX4_X4_REF__MATRIX:
        return matrix != null;
    }
    return super.eIsSet(featureID);
  }

} //Matrix4X4RefImpl
