/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Stiffness Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp#getSpringCoeff <em>Spring Coeff</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp#getSpringInit <em>Spring Init</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp#getDampViscous <em>Damp Viscous</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp#getDampCoulomb <em>Damp Coulomb</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBaseStiffnessExp()
 * @model
 * @generated
 */
public interface BaseStiffnessExp extends InitialDefinition, StiffnessExp
{
  /**
   * Returns the value of the '<em><b>Spring Coeff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spring Coeff</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spring Coeff</em>' containment reference.
   * @see #setSpringCoeff(Expression)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBaseStiffnessExp_SpringCoeff()
   * @model containment="true"
   * @generated
   */
  Expression getSpringCoeff();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp#getSpringCoeff <em>Spring Coeff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spring Coeff</em>' containment reference.
   * @see #getSpringCoeff()
   * @generated
   */
  void setSpringCoeff(Expression value);

  /**
   * Returns the value of the '<em><b>Spring Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spring Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spring Init</em>' containment reference.
   * @see #setSpringInit(Expression)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBaseStiffnessExp_SpringInit()
   * @model containment="true"
   * @generated
   */
  Expression getSpringInit();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp#getSpringInit <em>Spring Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spring Init</em>' containment reference.
   * @see #getSpringInit()
   * @generated
   */
  void setSpringInit(Expression value);

  /**
   * Returns the value of the '<em><b>Damp Viscous</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Damp Viscous</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Damp Viscous</em>' containment reference.
   * @see #setDampViscous(Expression)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBaseStiffnessExp_DampViscous()
   * @model containment="true"
   * @generated
   */
  Expression getDampViscous();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp#getDampViscous <em>Damp Viscous</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Damp Viscous</em>' containment reference.
   * @see #getDampViscous()
   * @generated
   */
  void setDampViscous(Expression value);

  /**
   * Returns the value of the '<em><b>Damp Coulomb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Damp Coulomb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Damp Coulomb</em>' containment reference.
   * @see #setDampCoulomb(Expression)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBaseStiffnessExp_DampCoulomb()
   * @model containment="true"
   * @generated
   */
  Expression getDampCoulomb();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp#getDampCoulomb <em>Damp Coulomb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Damp Coulomb</em>' containment reference.
   * @see #getDampCoulomb()
   * @generated
   */
  void setDampCoulomb(Expression value);

} // BaseStiffnessExp
