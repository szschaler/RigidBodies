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
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody1 <em>Body1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTrans1 <em>Rel Trans1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody2 <em>Body2</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint()
 * @model
 * @generated
 */
public interface Joint extends Connective
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
   * Returns the value of the '<em><b>Body1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body1</em>' containment reference.
   * @see #setBody1(BodyReference)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_Body1()
   * @model containment="true"
   * @generated
   */
  BodyReference getBody1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody1 <em>Body1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body1</em>' containment reference.
   * @see #getBody1()
   * @generated
   */
  void setBody1(BodyReference value);

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
   * Returns the value of the '<em><b>Body2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body2</em>' containment reference.
   * @see #setBody2(BodyReference)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_Body2()
   * @model containment="true"
   * @generated
   */
  BodyReference getBody2();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody2 <em>Body2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body2</em>' containment reference.
   * @see #getBody2()
   * @generated
   */
  void setBody2(BodyReference value);

} // Joint
