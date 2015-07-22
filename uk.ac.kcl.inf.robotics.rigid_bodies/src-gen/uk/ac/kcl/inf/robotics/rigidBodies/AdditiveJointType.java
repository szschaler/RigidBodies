/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Joint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getAdditiveJointType()
 * @model
 * @generated
 */
public interface AdditiveJointType extends JointTypeExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(JointTypeExpression)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getAdditiveJointType_Left()
   * @model containment="true"
   * @generated
   */
  JointTypeExpression getLeft();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(JointTypeExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(JointTypeExpression)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getAdditiveJointType_Right()
   * @model containment="true"
   * @generated
   */
  JointTypeExpression getRight();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(JointTypeExpression value);

} // AdditiveJointType
