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
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody1 <em>Body1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTransformation1 <em>Rel Transformation1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getBody2 <em>Body2</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTransformation2 <em>Rel Transformation2</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Matrix4X4)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_Type()
   * @model containment="true"
   * @generated
   */
  Matrix4X4 getType();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Matrix4X4 value);

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
   * Returns the value of the '<em><b>Rel Transformation1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Transformation1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Transformation1</em>' containment reference.
   * @see #setRelTransformation1(Matrix4X4)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_RelTransformation1()
   * @model containment="true"
   * @generated
   */
  Matrix4X4 getRelTransformation1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTransformation1 <em>Rel Transformation1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel Transformation1</em>' containment reference.
   * @see #getRelTransformation1()
   * @generated
   */
  void setRelTransformation1(Matrix4X4 value);

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
   * Returns the value of the '<em><b>Rel Transformation2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Transformation2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Transformation2</em>' containment reference.
   * @see #setRelTransformation2(Matrix4X4)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getJoint_RelTransformation2()
   * @model containment="true"
   * @generated
   */
  Matrix4X4 getRelTransformation2();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint#getRelTransformation2 <em>Rel Transformation2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel Transformation2</em>' containment reference.
   * @see #getRelTransformation2()
   * @generated
   */
  void setRelTransformation2(Matrix4X4 value);

} // Joint
