/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Environment#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject
{
  /**
   * Returns the value of the '<em><b>Gravity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gravity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gravity</em>' containment reference.
   * @see #setGravity(Matrix)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getEnvironment_Gravity()
   * @model containment="true"
   * @generated
   */
  Matrix getGravity();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Environment#getGravity <em>Gravity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gravity</em>' containment reference.
   * @see #getGravity()
   * @generated
   */
  void setGravity(Matrix value);

} // Environment
