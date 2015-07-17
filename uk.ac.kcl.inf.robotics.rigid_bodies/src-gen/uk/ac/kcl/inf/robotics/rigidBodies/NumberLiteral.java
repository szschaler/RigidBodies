/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral#isNeg <em>Neg</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getNumberLiteral()
 * @model
 * @generated
 */
public interface NumberLiteral extends Expression
{
  /**
   * Returns the value of the '<em><b>Neg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Neg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Neg</em>' attribute.
   * @see #setNeg(boolean)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getNumberLiteral_Neg()
   * @model
   * @generated
   */
  boolean isNeg();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral#isNeg <em>Neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Neg</em>' attribute.
   * @see #isNeg()
   * @generated
   */
  void setNeg(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getNumberLiteral_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // NumberLiteral
