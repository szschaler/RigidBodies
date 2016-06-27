/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ConfigurationStatement#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getConfigurationStatement()
 * @model
 * @generated
 */
public interface ConfigurationStatement extends EObject
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
   * @see #setSystem(SystemInstantiation)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getConfigurationStatement_System()
   * @model
   * @generated
   */
  SystemInstantiation getSystem();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ConfigurationStatement#getSystem <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(SystemInstantiation value);

} // ConfigurationStatement
