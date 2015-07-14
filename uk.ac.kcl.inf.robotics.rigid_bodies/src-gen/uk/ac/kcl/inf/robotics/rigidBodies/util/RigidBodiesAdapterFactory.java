/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage
 * @generated
 */
public class RigidBodiesAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RigidBodiesPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RigidBodiesAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RigidBodiesPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RigidBodiesSwitch<Adapter> modelSwitch =
    new RigidBodiesSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseInitialDefinition(InitialDefinition object)
      {
        return createInitialDefinitionAdapter();
      }
      @Override
      public Adapter caseEnvironment(Environment object)
      {
        return createEnvironmentAdapter();
      }
      @Override
      public Adapter caseSystem(uk.ac.kcl.inf.robotics.rigidBodies.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseSystemElement(SystemElement object)
      {
        return createSystemElementAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter caseLocalFrame(LocalFrame object)
      {
        return createLocalFrameAdapter();
      }
      @Override
      public Adapter caseMass(Mass object)
      {
        return createMassAdapter();
      }
      @Override
      public Adapter caseJoint(Joint object)
      {
        return createJointAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseColocationConstraint(ColocationConstraint object)
      {
        return createColocationConstraintAdapter();
      }
      @Override
      public Adapter caseVector3(Vector3 object)
      {
        return createVector3Adapter();
      }
      @Override
      public Adapter caseBaseVector3(BaseVector3 object)
      {
        return createBaseVector3Adapter();
      }
      @Override
      public Adapter caseVector3Ref(Vector3Ref object)
      {
        return createVector3RefAdapter();
      }
      @Override
      public Adapter caseMatrix3X3(Matrix3X3 object)
      {
        return createMatrix3X3Adapter();
      }
      @Override
      public Adapter caseBaseMatrix3X3(BaseMatrix3X3 object)
      {
        return createBaseMatrix3X3Adapter();
      }
      @Override
      public Adapter caseMatrix3X3Ref(Matrix3X3Ref object)
      {
        return createMatrix3X3RefAdapter();
      }
      @Override
      public Adapter caseMatrix4X4(Matrix4X4 object)
      {
        return createMatrix4X4Adapter();
      }
      @Override
      public Adapter caseBaseMatrix4X4(BaseMatrix4X4 object)
      {
        return createBaseMatrix4X4Adapter();
      }
      @Override
      public Adapter caseMatrix4X4Ref(Matrix4X4Ref object)
      {
        return createMatrix4X4RefAdapter();
      }
      @Override
      public Adapter caseMatrixDef(MatrixDef object)
      {
        return createMatrixDefAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition <em>Initial Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition
   * @generated
   */
  public Adapter createInitialDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Environment
   * @generated
   */
  public Adapter createEnvironmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.SystemElement <em>System Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.SystemElement
   * @generated
   */
  public Adapter createSystemElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Body
   * @generated
   */
  public Adapter createBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame <em>Local Frame</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.LocalFrame
   * @generated
   */
  public Adapter createLocalFrameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Mass <em>Mass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Mass
   * @generated
   */
  public Adapter createMassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Joint <em>Joint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Joint
   * @generated
   */
  public Adapter createJointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.ColocationConstraint <em>Colocation Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ColocationConstraint
   * @generated
   */
  public Adapter createColocationConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Vector3 <em>Vector3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Vector3
   * @generated
   */
  public Adapter createVector3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseVector3 <em>Base Vector3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BaseVector3
   * @generated
   */
  public Adapter createBaseVector3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Vector3Ref <em>Vector3 Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Vector3Ref
   * @generated
   */
  public Adapter createVector3RefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3 <em>Matrix3 X3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3
   * @generated
   */
  public Adapter createMatrix3X3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix3X3 <em>Base Matrix3 X3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix3X3
   * @generated
   */
  public Adapter createBaseMatrix3X3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3Ref <em>Matrix3 X3 Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix3X3Ref
   * @generated
   */
  public Adapter createMatrix3X3RefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4 <em>Matrix4 X4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4
   * @generated
   */
  public Adapter createMatrix4X4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix4X4 <em>Base Matrix4 X4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix4X4
   * @generated
   */
  public Adapter createBaseMatrix4X4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4Ref <em>Matrix4 X4 Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix4X4Ref
   * @generated
   */
  public Adapter createMatrix4X4RefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.MatrixDef <em>Matrix Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.MatrixDef
   * @generated
   */
  public Adapter createMatrixDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RigidBodiesAdapterFactory
