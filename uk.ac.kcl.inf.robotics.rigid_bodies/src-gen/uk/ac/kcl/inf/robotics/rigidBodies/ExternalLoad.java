/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getBody1 <em>Body1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getRelTrans1 <em>Rel Trans1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getBody2 <em>Body2</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getRelTrans2 <em>Rel Trans2</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getExternalLoad()
 * @model
 * @generated
 */
public interface ExternalLoad extends SystemElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.robotics.rigidBodies.LoadType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.LoadType
   * @see #setType(LoadType)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getExternalLoad_Type()
   * @model
   * @generated
   */
  LoadType getType();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.LoadType
   * @see #getType()
   * @generated
   */
  void setType(LoadType value);

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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getExternalLoad_Body1()
   * @model containment="true"
   * @generated
   */
  BodyReference getBody1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getBody1 <em>Body1</em>}' containment reference.
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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getExternalLoad_RelTrans1()
   * @model containment="true"
   * @generated
   */
  RelativeTransformation getRelTrans1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getRelTrans1 <em>Rel Trans1</em>}' containment reference.
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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getExternalLoad_Body2()
   * @model containment="true"
   * @generated
   */
  BodyReference getBody2();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getBody2 <em>Body2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body2</em>' containment reference.
   * @see #getBody2()
   * @generated
   */
  void setBody2(BodyReference value);

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
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getExternalLoad_RelTrans2()
   * @model containment="true"
   * @generated
   */
  RelativeTransformation getRelTrans2();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad#getRelTrans2 <em>Rel Trans2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel Trans2</em>' containment reference.
   * @see #getRelTrans2()
   * @generated
   */
  void setRelTrans2(RelativeTransformation value);

} // ExternalLoad
