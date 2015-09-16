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
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#isBase <em>Base</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#isNew <em>New</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#isLast <em>Last</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#getRef <em>Ref</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#getIdx <em>Idx</em>}</li>
 * </ul>
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
   * Returns the value of the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New</em>' attribute.
   * @see #setNew(boolean)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBodyReference_New()
   * @model
   * @generated
   */
  boolean isNew();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#isNew <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New</em>' attribute.
   * @see #isNew()
   * @generated
   */
  void setNew(boolean value);

  /**
   * Returns the value of the '<em><b>Last</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last</em>' attribute.
   * @see #setLast(boolean)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBodyReference_Last()
   * @model
   * @generated
   */
  boolean isLast();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#isLast <em>Last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last</em>' attribute.
   * @see #isLast()
   * @generated
   */
  void setLast(boolean value);

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

  /**
   * Returns the value of the '<em><b>Idx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Idx</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Idx</em>' attribute.
   * @see #setIdx(int)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getBodyReference_Idx()
   * @model
   * @generated
   */
  int getIdx();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference#getIdx <em>Idx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Idx</em>' attribute.
   * @see #getIdx()
   * @generated
   */
  void setIdx(int value);

} // BodyReference
