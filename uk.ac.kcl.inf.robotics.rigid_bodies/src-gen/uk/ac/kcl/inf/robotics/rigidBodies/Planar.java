/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.Planar#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getPlanar()
 * @model
 * @generated
 */
public interface Planar extends EObject
{
  /**
   * Returns the value of the '<em><b>Axis</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.robotics.rigidBodies.AXIS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axis</em>' attribute.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.AXIS
   * @see #setAxis(AXIS)
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#getPlanar_Axis()
   * @model
   * @generated
   */
  AXIS getAxis();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.robotics.rigidBodies.Planar#getAxis <em>Axis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axis</em>' attribute.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.AXIS
   * @see #getAxis()
   * @generated
   */
  void setAxis(AXIS value);

} // Planar
