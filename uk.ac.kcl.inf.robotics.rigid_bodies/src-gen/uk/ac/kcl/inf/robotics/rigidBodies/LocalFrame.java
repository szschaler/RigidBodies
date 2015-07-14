/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getLocalFrame()
 * @model
 * @generated
 */
public interface LocalFrame extends EObject
{
  /**
   * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orientation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orientation</em>' containment reference.
   * @see #setOrientation(Matrix3X3)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getLocalFrame_Orientation()
   * @model containment="true"
   * @generated
   */
  Matrix3X3 getOrientation();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame#getOrientation <em>Orientation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orientation</em>' containment reference.
   * @see #getOrientation()
   * @generated
   */
  void setOrientation(Matrix3X3 value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' containment reference.
   * @see #setPosition(Vector3)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getLocalFrame_Position()
   * @model containment="true"
   * @generated
   */
  Vector3 getPosition();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Vector3 value);

} // LocalFrame
