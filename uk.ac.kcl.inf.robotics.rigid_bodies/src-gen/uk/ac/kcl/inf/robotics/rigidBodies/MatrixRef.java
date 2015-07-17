/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef#getMatrix <em>Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getMatrixRef()
 * @model
 * @generated
 */
public interface MatrixRef extends Matrix
{
  /**
   * Returns the value of the '<em><b>Matrix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matrix</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matrix</em>' reference.
   * @see #setMatrix(BaseMatrix)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getMatrixRef_Matrix()
   * @model
   * @generated
   */
  BaseMatrix getMatrix();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef#getMatrix <em>Matrix</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matrix</em>' reference.
   * @see #getMatrix()
   * @generated
   */
  void setMatrix(BaseMatrix value);

} // MatrixRef
