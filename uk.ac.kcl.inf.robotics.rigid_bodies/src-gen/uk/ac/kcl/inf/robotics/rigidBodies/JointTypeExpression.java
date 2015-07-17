/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint Type Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression#getRef <em>Ref</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJointTypeExpression()
 * @model
 * @generated
 */
public interface JointTypeExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(JointType)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJointTypeExpression_Ref()
   * @model
   * @generated
   */
  JointType getRef();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(JointType value);

  /**
   * Returns the value of the '<em><b>Axis</b></em>' attribute list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.AXIS}.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.robotics.rigidBodies.AXIS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axis</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axis</em>' attribute list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.AXIS
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJointTypeExpression_Axis()
   * @model unique="false"
   * @generated
   */
  EList<AXIS> getAxis();

} // JointTypeExpression
