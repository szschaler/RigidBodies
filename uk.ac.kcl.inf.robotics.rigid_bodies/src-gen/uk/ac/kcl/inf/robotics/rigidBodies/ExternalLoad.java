/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getBody1 <em>Body1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getExternalLoad()
 * @model
 * @generated
 */
public interface ExternalLoad extends Connective
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.robotics.rigidBodies.LoadType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.LoadType
   * @see #setType(LoadType)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getExternalLoad_Type()
   * @model
   * @generated
   */
  LoadType getType();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.LoadType
   * @see #getType()
   * @generated
   */
  void setType(LoadType value);

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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getExternalLoad_Body1()
   * @model containment="true"
   * @generated
   */
  BodyReference getBody1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getBody1 <em>Body1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body1</em>' containment reference.
   * @see #getBody1()
   * @generated
   */
  void setBody1(BodyReference value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' containment reference.
   * @see #setPosition(Matrix)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getExternalLoad_Position()
   * @model containment="true"
   * @generated
   */
  Matrix getPosition();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Matrix value);

} // ExternalLoad
