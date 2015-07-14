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
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Body#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Body#getFrame <em>Frame</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBody_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Body#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Frame</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frame</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frame</em>' containment reference.
   * @see #setFrame(LocalFrame)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBody_Frame()
   * @model containment="true"
   * @generated
   */
  LocalFrame getFrame();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Body#getFrame <em>Frame</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Frame</em>' containment reference.
   * @see #getFrame()
   * @generated
   */
  void setFrame(LocalFrame value);

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
