/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Or Function Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp#getLabel <em>Label</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getConstantOrFunctionCallExp()
 * @model
 * @generated
 */
public interface ConstantOrFunctionCallExp extends Expression
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getConstantOrFunctionCallExp_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getConstantOrFunctionCallExp_Param()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParam();

} // ConstantOrFunctionCallExp
