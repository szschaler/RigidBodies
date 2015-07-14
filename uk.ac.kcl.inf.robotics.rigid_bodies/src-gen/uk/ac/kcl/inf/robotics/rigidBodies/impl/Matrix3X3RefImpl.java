/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix3X3;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3Ref;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix3 X3 Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.Matrix3X3RefImpl#getMatrix <em>Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Matrix3X3RefImpl extends Matrix3X3Impl implements Matrix3X3Ref
{
  /**
   * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatrix()
   * @generated
   * @ordered
   */
  protected BaseMatrix3X3 matrix;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Matrix3X3RefImpl()
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
    return RigidBodiesPackage.Literals.MATRIX3_X3_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseMatrix3X3 getMatrix()
  {
    if (matrix != null && matrix.eIsProxy())
    {
      InternalEObject oldMatrix = (InternalEObject)matrix;
      matrix = (BaseMatrix3X3)eResolveProxy(oldMatrix);
      if (matrix != oldMatrix)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.MATRIX3_X3_REF__MATRIX, oldMatrix, matrix));
      }
    }
    return matrix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseMatrix3X3 basicGetMatrix()
  {
    return matrix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatrix(BaseMatrix3X3 newMatrix)
  {
    BaseMatrix3X3 oldMatrix = matrix;
    matrix = newMatrix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.MATRIX3_X3_REF__MATRIX, oldMatrix, matrix));
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
      case RigidBodiesPackage.MATRIX3_X3_REF__MATRIX:
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
      case RigidBodiesPackage.MATRIX3_X3_REF__MATRIX:
        setMatrix((BaseMatrix3X3)newValue);
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
      case RigidBodiesPackage.MATRIX3_X3_REF__MATRIX:
        setMatrix((BaseMatrix3X3)null);
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
      case RigidBodiesPackage.MATRIX3_X3_REF__MATRIX:
        return matrix != null;
    }
    return super.eIsSet(featureID);
  }

} //Matrix3X3RefImpl
