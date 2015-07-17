/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reorient Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression#getRef <em>Ref</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression#getAxis <em>Axis</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getReorientExpression()
 * @model
 * @generated
 */
public interface ReorientExpression extends EObject
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
   * @see #setRef(Reorientation)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getReorientExpression_Ref()
   * @model
   * @generated
   */
  Reorientation getRef();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Reorientation value);

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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getReorientExpression_Axis()
   * @model unique="false"
   * @generated
   */
  EList<AXIS> getAxis();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getReorientExpression_Value()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getValue();

} // ReorientExpression
