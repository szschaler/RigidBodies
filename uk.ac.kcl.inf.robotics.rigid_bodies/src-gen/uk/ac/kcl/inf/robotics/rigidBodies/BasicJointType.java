/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Joint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType#getStiffness <em>Stiffness</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBasicJointType()
 * @model
 * @generated
 */
public interface BasicJointType extends JointTypeExpression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JointMovement)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBasicJointType_Type()
   * @model containment="true"
   * @generated
   */
  JointMovement getType();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JointMovement value);

  /**
   * Returns the value of the '<em><b>Stiffness</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stiffness</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stiffness</em>' containment reference.
   * @see #setStiffness(StiffnessExp)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBasicJointType_Stiffness()
   * @model containment="true"
   * @generated
   */
  StiffnessExp getStiffness();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType#getStiffness <em>Stiffness</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stiffness</em>' containment reference.
   * @see #getStiffness()
   * @generated
   */
  void setStiffness(StiffnessExp value);

} // BasicJointType
