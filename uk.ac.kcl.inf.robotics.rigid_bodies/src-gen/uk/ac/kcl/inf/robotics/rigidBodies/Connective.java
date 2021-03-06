/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Connective#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Connective#getBody1 <em>Body1</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getConnective()
 * @model
 * @generated
 */
public interface Connective extends SystemElement
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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getConnective_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Connective#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Body1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body1</em>' containment reference.
   * @see #setBody1(BodyReference)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getConnective_Body1()
   * @model containment="true"
   * @generated
   */
  BodyReference getBody1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Connective#getBody1 <em>Body1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body1</em>' containment reference.
   * @see #getBody1()
   * @generated
   */
  void setBody1(BodyReference value);

} // Connective
