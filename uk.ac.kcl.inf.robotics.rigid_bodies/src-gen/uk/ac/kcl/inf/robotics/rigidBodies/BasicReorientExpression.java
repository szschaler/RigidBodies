/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Reorient Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BasicReorientExpression#getAxis <em>Axis</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BasicReorientExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBasicReorientExpression()
 * @model
 * @generated
 */
public interface BasicReorientExpression extends ReorientExpression
{
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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBasicReorientExpression_Axis()
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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBasicReorientExpression_Value()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getValue();

} // BasicReorientExpression
