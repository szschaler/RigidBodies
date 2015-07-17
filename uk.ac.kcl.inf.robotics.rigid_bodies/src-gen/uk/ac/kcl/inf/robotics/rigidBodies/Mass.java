/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getPosition <em>Position</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getInertia <em>Inertia</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getMass()
 * @model
 * @generated
 */
public interface Mass extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getMass_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getMass_Position()
   * @model containment="true"
   * @generated
   */
  Matrix getPosition();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Matrix value);

  /**
   * Returns the value of the '<em><b>Inertia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inertia</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inertia</em>' containment reference.
   * @see #setInertia(Matrix)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getMass_Inertia()
   * @model containment="true"
   * @generated
   */
  Matrix getInertia();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getInertia <em>Inertia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inertia</em>' containment reference.
   * @see #getInertia()
   * @generated
   */
  void setInertia(Matrix value);

} // Mass
