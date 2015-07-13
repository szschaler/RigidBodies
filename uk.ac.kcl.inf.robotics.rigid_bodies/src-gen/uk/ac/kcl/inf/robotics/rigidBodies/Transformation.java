/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Transformation#getJoint <em>Joint</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject
{
  /**
   * Returns the value of the '<em><b>Joint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Joint</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Joint</em>' reference.
   * @see #setJoint(Joint)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getTransformation_Joint()
   * @model
   * @generated
   */
  Joint getJoint();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Transformation#getJoint <em>Joint</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Joint</em>' reference.
   * @see #getJoint()
   * @generated
   */
  void setJoint(Joint value);

} // Transformation
