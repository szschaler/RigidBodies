/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation#getPosition <em>Position</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation#getReorient <em>Reorient</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getRelativeTransformation()
 * @model
 * @generated
 */
public interface RelativeTransformation extends EObject
{
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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getRelativeTransformation_Position()
   * @model containment="true"
   * @generated
   */
  Matrix getPosition();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Matrix value);

  /**
   * Returns the value of the '<em><b>Reorient</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reorient</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reorient</em>' containment reference.
   * @see #setReorient(Reorientation)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getRelativeTransformation_Reorient()
   * @model containment="true"
   * @generated
   */
  Reorientation getReorient();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation#getReorient <em>Reorient</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reorient</em>' containment reference.
   * @see #getReorient()
   * @generated
   */
  void setReorient(Reorientation value);

} // RelativeTransformation
