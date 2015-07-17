/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#isBase <em>Base</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBodyReference()
 * @model
 * @generated
 */
public interface BodyReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' attribute.
   * @see #setBase(boolean)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBodyReference_Base()
   * @model
   * @generated
   */
  boolean isBase();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#isBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #isBase()
   * @generated
   */
  void setBase(boolean value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Body)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBodyReference_Ref()
   * @model
   * @generated
   */
  Body getRef();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Body value);

} // BodyReference
