/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lock Do FStatement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.LockDoFStatement#getLockedType <em>Locked Type</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getLockDoFStatement()
 * @model
 * @generated
 */
public interface LockDoFStatement extends ConfigurationStatement
{
  /**
   * Returns the value of the '<em><b>Locked Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locked Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locked Type</em>' containment reference.
   * @see #setLockedType(LockedJointTypeExpression)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getLockDoFStatement_LockedType()
   * @model containment="true"
   * @generated
   */
  LockedJointTypeExpression getLockedType();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.LockDoFStatement#getLockedType <em>Locked Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Locked Type</em>' containment reference.
   * @see #getLockedType()
   * @generated
   */
  void setLockedType(LockedJointTypeExpression value);

} // LockDoFStatement
