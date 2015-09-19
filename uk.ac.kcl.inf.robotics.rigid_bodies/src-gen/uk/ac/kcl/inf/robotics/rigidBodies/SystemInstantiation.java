/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation#getSystem <em>System</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getSystemInstantiation()
 * @model
 * @generated
 */
public interface SystemInstantiation extends EObject
{
  /**
   * Returns the value of the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' reference.
   * @see #setSystem(uk.ac.kcl.inf.robotics.rigidBodies.System)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getSystemInstantiation_System()
   * @model
   * @generated
   */
  uk.ac.kcl.inf.robotics.rigidBodies.System getSystem();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation#getSystem <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(uk.ac.kcl.inf.robotics.rigidBodies.System value);

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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getSystemInstantiation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // SystemInstantiation
