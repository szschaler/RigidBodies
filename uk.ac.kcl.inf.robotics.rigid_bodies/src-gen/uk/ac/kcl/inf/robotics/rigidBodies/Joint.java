/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody1 <em>Body1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTrans1 <em>Rel Trans1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody2 <em>Body2</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTrans2 <em>Rel Trans2</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getSpringCoeff <em>Spring Coeff</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getSpringInit <em>Spring Init</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getDampViscous <em>Damp Viscous</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getDampCoulomb <em>Damp Coulomb</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint()
 * @model
 * @generated
 */
public interface Joint extends SystemElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JointType)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_Type()
   * @model containment="true"
   * @generated
   */
  JointType getType();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JointType value);

  /**
   * Returns the value of the '<em><b>Is Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Start</em>' attribute.
   * @see #setIsStart(boolean)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_IsStart()
   * @model
   * @generated
   */
  boolean isIsStart();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#isIsStart <em>Is Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Start</em>' attribute.
   * @see #isIsStart()
   * @generated
   */
  void setIsStart(boolean value);

  /**
   * Returns the value of the '<em><b>Body1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body1</em>' reference.
   * @see #setBody1(Body)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_Body1()
   * @model
   * @generated
   */
  Body getBody1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody1 <em>Body1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body1</em>' reference.
   * @see #getBody1()
   * @generated
   */
  void setBody1(Body value);

  /**
   * Returns the value of the '<em><b>Rel Trans1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Trans1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Trans1</em>' containment reference.
   * @see #setRelTrans1(RelativeTransformation)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_RelTrans1()
   * @model containment="true"
   * @generated
   */
  RelativeTransformation getRelTrans1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTrans1 <em>Rel Trans1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel Trans1</em>' containment reference.
   * @see #getRelTrans1()
   * @generated
   */
  void setRelTrans1(RelativeTransformation value);

  /**
   * Returns the value of the '<em><b>Body2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body2</em>' reference.
   * @see #setBody2(Body)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_Body2()
   * @model
   * @generated
   */
  Body getBody2();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody2 <em>Body2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body2</em>' reference.
   * @see #getBody2()
   * @generated
   */
  void setBody2(Body value);

  /**
   * Returns the value of the '<em><b>Rel Trans2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Trans2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Trans2</em>' containment reference.
   * @see #setRelTrans2(RelativeTransformation)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_RelTrans2()
   * @model containment="true"
   * @generated
   */
  RelativeTransformation getRelTrans2();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTrans2 <em>Rel Trans2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel Trans2</em>' containment reference.
   * @see #getRelTrans2()
   * @generated
   */
  void setRelTrans2(RelativeTransformation value);

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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_SpringCoeff()
   * @model containment="true"
   * @generated
   */
  Expression getSpringCoeff();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getSpringCoeff <em>Spring Coeff</em>}' containment reference.
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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_SpringInit()
   * @model containment="true"
   * @generated
   */
  Expression getSpringInit();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getSpringInit <em>Spring Init</em>}' containment reference.
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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_DampViscous()
   * @model containment="true"
   * @generated
   */
  Expression getDampViscous();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getDampViscous <em>Damp Viscous</em>}' containment reference.
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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_DampCoulomb()
   * @model containment="true"
   * @generated
   */
  Expression getDampCoulomb();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getDampCoulomb <em>Damp Coulomb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Damp Coulomb</em>' containment reference.
   * @see #getDampCoulomb()
   * @generated
   */
  void setDampCoulomb(Expression value);

} // Joint
