/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rigid Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getJoints <em>Joints</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getMasses <em>Masses</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getRigidBody()
 * @model
 * @generated
 */
public interface RigidBody extends EObject
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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getRigidBody_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.RigidBody#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Joints</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.Joint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Joints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Joints</em>' containment reference list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getRigidBody_Joints()
   * @model containment="true"
   * @generated
   */
  EList<Joint> getJoints();

  /**
   * Returns the value of the '<em><b>Masses</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.Mass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Masses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Masses</em>' containment reference list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getRigidBody_Masses()
   * @model containment="true"
   * @generated
   */
  EList<Mass> getMasses();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getRigidBody_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // RigidBody
