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
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(double)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getMass_Value()
   * @model
   * @generated
   */
  double getValue();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(double value);

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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getMass_Position()
   * @model containment="true"
   * @generated
   */
  Vector3 getPosition();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Vector3 value);

  /**
   * Returns the value of the '<em><b>Inertia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inertia</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inertia</em>' containment reference.
   * @see #setInertia(Matrix3X3)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getMass_Inertia()
   * @model containment="true"
   * @generated
   */
  Matrix3X3 getInertia();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass#getInertia <em>Inertia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inertia</em>' containment reference.
   * @see #getInertia()
   * @generated
   */
  void setInertia(Matrix3X3 value);

} // Mass
