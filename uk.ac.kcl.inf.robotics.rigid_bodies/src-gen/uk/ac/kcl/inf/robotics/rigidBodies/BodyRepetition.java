/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Repetition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition#getNumber <em>Number</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition#getBody <em>Body</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition#getConnectionExp <em>Connection Exp</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBodyRepetition()
 * @model
 * @generated
 */
public interface BodyRepetition extends SystemElement
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBodyRepetition_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' reference.
   * @see #setBody(Body)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBodyRepetition_Body()
   * @model
   * @generated
   */
  Body getBody();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition#getBody <em>Body</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Body value);

  /**
   * Returns the value of the '<em><b>Connection Exp</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.SystemElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connection Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection Exp</em>' containment reference list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBodyRepetition_ConnectionExp()
   * @model containment="true"
   * @generated
   */
  EList<SystemElement> getConnectionExp();

} // BodyRepetition
