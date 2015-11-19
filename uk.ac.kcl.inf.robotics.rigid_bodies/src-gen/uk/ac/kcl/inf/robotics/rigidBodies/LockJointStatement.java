/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lock Joint Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.LockJointStatement#getRotation <em>Rotation</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.LockJointStatement#getTranslation <em>Translation</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getLockJointStatement()
 * @model
 * @generated
 */
public interface LockJointStatement extends ConfigurationStatement
{
  /**
   * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rotation</em>' containment reference.
   * @see #setRotation(Matrix)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getLockJointStatement_Rotation()
   * @model containment="true"
   * @generated
   */
  Matrix getRotation();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.LockJointStatement#getRotation <em>Rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotation</em>' containment reference.
   * @see #getRotation()
   * @generated
   */
  void setRotation(Matrix value);

  /**
   * Returns the value of the '<em><b>Translation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Translation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Translation</em>' containment reference.
   * @see #setTranslation(Matrix)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getLockJointStatement_Translation()
   * @model containment="true"
   * @generated
   */
  Matrix getTranslation();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.LockJointStatement#getTranslation <em>Translation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Translation</em>' containment reference.
   * @see #getTranslation()
   * @generated
   */
  void setTranslation(Matrix value);

} // LockJointStatement
