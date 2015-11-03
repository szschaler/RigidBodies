/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Model#getDefs <em>Defs</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Model#getWorld <em>World</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Model#getBodies <em>Bodies</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Model#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Defs</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defs</em>' containment reference list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getModel_Defs()
   * @model containment="true"
   * @generated
   */
  EList<InitialDefinition> getDefs();

  /**
   * Returns the value of the '<em><b>World</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>World</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>World</em>' containment reference.
   * @see #setWorld(Environment)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getModel_World()
   * @model containment="true"
   * @generated
   */
  Environment getWorld();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Model#getWorld <em>World</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>World</em>' containment reference.
   * @see #getWorld()
   * @generated
   */
  void setWorld(Environment value);

  /**
   * Returns the value of the '<em><b>Bodies</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.System}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bodies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bodies</em>' containment reference list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getModel_Bodies()
   * @model containment="true"
   * @generated
   */
  EList<uk.ac.kcl.inf.robotics.rigidBodies.System> getBodies();

  /**
   * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration</em>' containment reference.
   * @see #setConfiguration(ConfigurationDef)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getModel_Configuration()
   * @model containment="true"
   * @generated
   */
  ConfigurationDef getConfiguration();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Model#getConfiguration <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Configuration</em>' containment reference.
   * @see #getConfiguration()
   * @generated
   */
  void setConfiguration(ConfigurationDef value);

} // Model
