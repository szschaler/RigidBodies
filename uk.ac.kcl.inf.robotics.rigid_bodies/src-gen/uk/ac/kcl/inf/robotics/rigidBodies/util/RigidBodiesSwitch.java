/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix3X3;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix4X4;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseVector3;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.ColocationConstraint;
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint;
import uk.ac.kcl.inf.robotics.rigidBodies.Environment;
import uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3Ref;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4Ref;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixDef;
import uk.ac.kcl.inf.robotics.rigidBodies.Model;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;
import uk.ac.kcl.inf.robotics.rigidBodies.Vector3;
import uk.ac.kcl.inf.robotics.rigidBodies.Vector3Ref;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage
 * @generated
 */
public class RigidBodiesSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RigidBodiesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RigidBodiesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RigidBodiesPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RigidBodiesPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.INITIAL_DEFINITION:
      {
        InitialDefinition initialDefinition = (InitialDefinition)theEObject;
        T result = caseInitialDefinition(initialDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.ENVIRONMENT:
      {
        Environment environment = (Environment)theEObject;
        T result = caseEnvironment(environment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.SYSTEM:
      {
        uk.ac.kcl.inf.robotics.rigidBodies.System system = (uk.ac.kcl.inf.robotics.rigidBodies.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.SYSTEM_ELEMENT:
      {
        SystemElement systemElement = (SystemElement)theEObject;
        T result = caseSystemElement(systemElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = caseSystemElement(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.LOCAL_FRAME:
      {
        LocalFrame localFrame = (LocalFrame)theEObject;
        T result = caseLocalFrame(localFrame);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.MASS:
      {
        Mass mass = (Mass)theEObject;
        T result = caseMass(mass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.JOINT:
      {
        Joint joint = (Joint)theEObject;
        T result = caseJoint(joint);
        if (result == null) result = caseSystemElement(joint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = caseSystemElement(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.COLOCATION_CONSTRAINT:
      {
        ColocationConstraint colocationConstraint = (ColocationConstraint)theEObject;
        T result = caseColocationConstraint(colocationConstraint);
        if (result == null) result = caseConstraint(colocationConstraint);
        if (result == null) result = caseSystemElement(colocationConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.VECTOR3:
      {
        Vector3 vector3 = (Vector3)theEObject;
        T result = caseVector3(vector3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.BASE_VECTOR3:
      {
        BaseVector3 baseVector3 = (BaseVector3)theEObject;
        T result = caseBaseVector3(baseVector3);
        if (result == null) result = caseInitialDefinition(baseVector3);
        if (result == null) result = caseVector3(baseVector3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.VECTOR3_REF:
      {
        Vector3Ref vector3Ref = (Vector3Ref)theEObject;
        T result = caseVector3Ref(vector3Ref);
        if (result == null) result = caseVector3(vector3Ref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.MATRIX3_X3:
      {
        Matrix3X3 matrix3X3 = (Matrix3X3)theEObject;
        T result = caseMatrix3X3(matrix3X3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.BASE_MATRIX3_X3:
      {
        BaseMatrix3X3 baseMatrix3X3 = (BaseMatrix3X3)theEObject;
        T result = caseBaseMatrix3X3(baseMatrix3X3);
        if (result == null) result = caseMatrix3X3(baseMatrix3X3);
        if (result == null) result = caseMatrixDef(baseMatrix3X3);
        if (result == null) result = caseInitialDefinition(baseMatrix3X3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.MATRIX3_X3_REF:
      {
        Matrix3X3Ref matrix3X3Ref = (Matrix3X3Ref)theEObject;
        T result = caseMatrix3X3Ref(matrix3X3Ref);
        if (result == null) result = caseMatrix3X3(matrix3X3Ref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.MATRIX4_X4:
      {
        Matrix4X4 matrix4X4 = (Matrix4X4)theEObject;
        T result = caseMatrix4X4(matrix4X4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.BASE_MATRIX4_X4:
      {
        BaseMatrix4X4 baseMatrix4X4 = (BaseMatrix4X4)theEObject;
        T result = caseBaseMatrix4X4(baseMatrix4X4);
        if (result == null) result = caseMatrix4X4(baseMatrix4X4);
        if (result == null) result = caseMatrixDef(baseMatrix4X4);
        if (result == null) result = caseInitialDefinition(baseMatrix4X4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.MATRIX4_X4_REF:
      {
        Matrix4X4Ref matrix4X4Ref = (Matrix4X4Ref)theEObject;
        T result = caseMatrix4X4Ref(matrix4X4Ref);
        if (result == null) result = caseMatrix4X4(matrix4X4Ref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RigidBodiesPackage.MATRIX_DEF:
      {
        MatrixDef matrixDef = (MatrixDef)theEObject;
        T result = caseMatrixDef(matrixDef);
        if (result == null) result = caseInitialDefinition(matrixDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialDefinition(InitialDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironment(Environment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(uk.ac.kcl.inf.robotics.rigidBodies.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemElement(SystemElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Frame</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Frame</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalFrame(LocalFrame object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMass(Mass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Joint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoint(Joint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Colocation Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Colocation Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColocationConstraint(ColocationConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vector3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vector3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVector3(Vector3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Vector3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Vector3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseVector3(BaseVector3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vector3 Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vector3 Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVector3Ref(Vector3Ref object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix3 X3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix3 X3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrix3X3(Matrix3X3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Matrix3 X3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Matrix3 X3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseMatrix3X3(BaseMatrix3X3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix3 X3 Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix3 X3 Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrix3X3Ref(Matrix3X3Ref object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix4 X4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix4 X4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrix4X4(Matrix4X4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Matrix4 X4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Matrix4 X4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseMatrix4X4(BaseMatrix4X4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix4 X4 Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix4 X4 Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrix4X4Ref(Matrix4X4Ref object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrixDef(MatrixDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RigidBodiesSwitch
