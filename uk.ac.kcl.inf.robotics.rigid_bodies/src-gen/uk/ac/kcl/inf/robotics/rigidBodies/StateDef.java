/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.StateDef#getInstances <em>Instances</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.StateDef#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getStateDef()
 * @model
 * @generated
 */
public interface StateDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' containment reference list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getStateDef_Instances()
   * @model containment="true"
   * @generated
   */
  EList<SystemInstantiation> getInstances();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getStateDef_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // StateDef
