/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lock Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.LockStatement#getSystem <em>System</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.LockStatement#getJoint <em>Joint</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getLockStatement()
 * @model
 * @generated
 */
public interface LockStatement extends ConfigurationStatement
{
  /**
   * Returns the value of the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' reference.
   * @see #setSystem(SystemInstantiation)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getLockStatement_System()
   * @model
   * @generated
   */
  SystemInstantiation getSystem();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.LockStatement#getSystem <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(SystemInstantiation value);

  /**
   * Returns the value of the '<em><b>Joint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Joint</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Joint</em>' reference.
   * @see #setJoint(Joint)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getLockStatement_Joint()
   * @model
   * @generated
   */
  Joint getJoint();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.LockStatement#getJoint <em>Joint</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Joint</em>' reference.
   * @see #getJoint()
   * @generated
   */
  void setJoint(Joint value);

} // LockStatement
