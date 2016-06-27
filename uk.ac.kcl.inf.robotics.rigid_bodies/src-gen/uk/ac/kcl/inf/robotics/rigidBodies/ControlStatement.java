/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement#getBodyref <em>Bodyref</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement#getRelative_transform <em>Relative transform</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement#getP <em>P</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement#getI <em>I</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement#getD <em>D</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getControlStatement()
 * @model
 * @generated
 */
public interface ControlStatement extends ConfigurationStatement
{
  /**
   * Returns the value of the '<em><b>Bodyref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bodyref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bodyref</em>' containment reference.
   * @see #setBodyref(BodyReference)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getControlStatement_Bodyref()
   * @model containment="true"
   * @generated
   */
  BodyReference getBodyref();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement#getBodyref <em>Bodyref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bodyref</em>' containment reference.
   * @see #getBodyref()
   * @generated
   */
  void setBodyref(BodyReference value);

  /**
   * Returns the value of the '<em><b>Relative transform</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relative transform</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relative transform</em>' containment reference.
   * @see #setRelative_transform(RelativeTransformation)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getControlStatement_Relative_transform()
   * @model containment="true"
   * @generated
   */
  RelativeTransformation getRelative_transform();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement#getRelative_transform <em>Relative transform</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relative transform</em>' containment reference.
   * @see #getRelative_transform()
   * @generated
   */
  void setRelative_transform(RelativeTransformation value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.robotics.rigidBodies.ConstraintClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getControlStatement_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<ConstraintClause> getConstraints();

  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference.
   * @see #setP(Expression)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getControlStatement_P()
   * @model containment="true"
   * @generated
   */
  Expression getP();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement#getP <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' containment reference.
   * @see #getP()
   * @generated
   */
  void setP(Expression value);

  /**
   * Returns the value of the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I</em>' containment reference.
   * @see #setI(Expression)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getControlStatement_I()
   * @model containment="true"
   * @generated
   */
  Expression getI();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement#getI <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I</em>' containment reference.
   * @see #getI()
   * @generated
   */
  void setI(Expression value);

  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference.
   * @see #setD(Expression)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getControlStatement_D()
   * @model containment="true"
   * @generated
   */
  Expression getD();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement#getD <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' containment reference.
   * @see #getD()
   * @generated
   */
  void setD(Expression value);

} // ControlStatement
