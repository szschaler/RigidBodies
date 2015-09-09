/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint#getJoint1 <em>Joint1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint#getJoint2 <em>Joint2</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJointConstraint()
 * @model
 * @generated
 */
public interface JointConstraint extends Constraint
{
  /**
   * Returns the value of the '<em><b>Joint1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Joint1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Joint1</em>' reference.
   * @see #setJoint1(Joint)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJointConstraint_Joint1()
   * @model
   * @generated
   */
  Joint getJoint1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint#getJoint1 <em>Joint1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Joint1</em>' reference.
   * @see #getJoint1()
   * @generated
   */
  void setJoint1(Joint value);

  /**
   * Returns the value of the '<em><b>Joint2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Joint2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Joint2</em>' reference.
   * @see #setJoint2(Joint)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJointConstraint_Joint2()
   * @model
   * @generated
   */
  Joint getJoint2();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint#getJoint2 <em>Joint2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Joint2</em>' reference.
   * @see #getJoint2()
   * @generated
   */
  void setJoint2(Joint value);

} // JointConstraint
