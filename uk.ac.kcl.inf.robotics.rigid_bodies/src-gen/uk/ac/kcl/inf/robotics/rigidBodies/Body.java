/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Body#getMass <em>Mass</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends SystemElement
{
  /**
   * Returns the value of the '<em><b>Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mass</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mass</em>' containment reference.
   * @see #setMass(Mass)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBody_Mass()
   * @model containment="true"
   * @generated
   */
  Mass getMass();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Body#getMass <em>Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mass</em>' containment reference.
   * @see #getMass()
   * @generated
   */
  void setMass(Mass value);

} // Body
