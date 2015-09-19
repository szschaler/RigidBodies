/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.inf.robotics.rigidBodies.AddExp;
import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition;
import uk.ac.kcl.inf.robotics.rigidBodies.Connective;
import uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp;
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint;
import uk.ac.kcl.inf.robotics.rigidBodies.Environment;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad;
import uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointMovement;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeReference;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef;
import uk.ac.kcl.inf.robotics.rigidBodies.Model;
import uk.ac.kcl.inf.robotics.rigidBodies.MultExp;
import uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral;
import uk.ac.kcl.inf.robotics.rigidBodies.ParenthesisedExp;
import uk.ac.kcl.inf.robotics.rigidBodies.Planar;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientRef;
import uk.ac.kcl.inf.robotics.rigidBodies.Reorientation;
import uk.ac.kcl.inf.robotics.rigidBodies.Revolute;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.State;
import uk.ac.kcl.inf.robotics.rigidBodies.StateDef;
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessExp;
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessRef;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation;

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
      public Adapter caseStateDef(StateDef object)
      {
        return createStateDefAdapter();
      }
      @Override
      public Adapter caseSystemInstantiation(SystemInstantiation object)
      {
        return createSystemInstantiationAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseSystemElement(SystemElement object)
      {
        return createSystemElementAdapter();
      }
      @Override
      public Adapter caseConnective(Connective object)
      {
        return createConnectiveAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter caseBodyReference(BodyReference object)
      {
        return createBodyReferenceAdapter();
      }
      @Override
      public Adapter caseBodyRepetition(BodyRepetition object)
      {
        return createBodyRepetitionAdapter();
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
      public Adapter caseJointType(JointType object)
      {
        return createJointTypeAdapter();
      }
      @Override
      public Adapter caseJointTypeExpression(JointTypeExpression object)
      {
        return createJointTypeExpressionAdapter();
      }
      @Override
      public Adapter caseJointTypeReference(JointTypeReference object)
      {
        return createJointTypeReferenceAdapter();
      }
      @Override
      public Adapter caseBasicJointType(BasicJointType object)
      {
        return createBasicJointTypeAdapter();
      }
      @Override
      public Adapter caseJointMovement(JointMovement object)
      {
        return createJointMovementAdapter();
      }
      @Override
      public Adapter caseRevolute(Revolute object)
      {
        return createRevoluteAdapter();
      }
      @Override
      public Adapter casePlanar(Planar object)
      {
        return createPlanarAdapter();
      }
      @Override
      public Adapter caseStiffnessExp(StiffnessExp object)
      {
        return createStiffnessExpAdapter();
      }
      @Override
      public Adapter caseStiffnessRef(StiffnessRef object)
      {
        return createStiffnessRefAdapter();
      }
      @Override
      public Adapter caseBaseStiffnessExp(BaseStiffnessExp object)
      {
        return createBaseStiffnessExpAdapter();
      }
      @Override
      public Adapter caseRelativeTransformation(RelativeTransformation object)
      {
        return createRelativeTransformationAdapter();
      }
      @Override
      public Adapter caseReorientation(Reorientation object)
      {
        return createReorientationAdapter();
      }
      @Override
      public Adapter caseReorientExpression(ReorientExpression object)
      {
        return createReorientExpressionAdapter();
      }
      @Override
      public Adapter caseReorientRef(ReorientRef object)
      {
        return createReorientRefAdapter();
      }
      @Override
      public Adapter caseBasicReorientExpression(BasicReorientExpression object)
      {
        return createBasicReorientExpressionAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseJointConstraint(JointConstraint object)
      {
        return createJointConstraintAdapter();
      }
      @Override
      public Adapter caseExternalLoad(ExternalLoad object)
      {
        return createExternalLoadAdapter();
      }
      @Override
      public Adapter caseMatrix(Matrix object)
      {
        return createMatrixAdapter();
      }
      @Override
      public Adapter caseBaseMatrix(BaseMatrix object)
      {
        return createBaseMatrixAdapter();
      }
      @Override
      public Adapter caseMatrixRef(MatrixRef object)
      {
        return createMatrixRefAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseParenthesisedExp(ParenthesisedExp object)
      {
        return createParenthesisedExpAdapter();
      }
      @Override
      public Adapter caseConstantOrFunctionCallExp(ConstantOrFunctionCallExp object)
      {
        return createConstantOrFunctionCallExpAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseAdditiveJointType(AdditiveJointType object)
      {
        return createAdditiveJointTypeAdapter();
      }
      @Override
      public Adapter caseAddExp(AddExp object)
      {
        return createAddExpAdapter();
      }
      @Override
      public Adapter caseMultExp(MultExp object)
      {
        return createMultExpAdapter();
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
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.StateDef <em>State Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.StateDef
   * @generated
   */
  public Adapter createStateDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation <em>System Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation
   * @generated
   */
  public Adapter createSystemInstantiationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.State
   * @generated
   */
  public Adapter createStateAdapter()
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
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Connective <em>Connective</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Connective
   * @generated
   */
  public Adapter createConnectiveAdapter()
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
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyReference <em>Body Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BodyReference
   * @generated
   */
  public Adapter createBodyReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition <em>Body Repetition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition
   * @generated
   */
  public Adapter createBodyRepetitionAdapter()
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
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointType <em>Joint Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.JointType
   * @generated
   */
  public Adapter createJointTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression <em>Joint Type Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression
   * @generated
   */
  public Adapter createJointTypeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointTypeReference <em>Joint Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.JointTypeReference
   * @generated
   */
  public Adapter createJointTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType <em>Basic Joint Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType
   * @generated
   */
  public Adapter createBasicJointTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointMovement <em>Joint Movement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.JointMovement
   * @generated
   */
  public Adapter createJointMovementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Revolute <em>Revolute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Revolute
   * @generated
   */
  public Adapter createRevoluteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Planar <em>Planar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Planar
   * @generated
   */
  public Adapter createPlanarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.StiffnessExp <em>Stiffness Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.StiffnessExp
   * @generated
   */
  public Adapter createStiffnessExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.StiffnessRef <em>Stiffness Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.StiffnessRef
   * @generated
   */
  public Adapter createStiffnessRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp <em>Base Stiffness Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp
   * @generated
   */
  public Adapter createBaseStiffnessExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation <em>Relative Transformation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation
   * @generated
   */
  public Adapter createRelativeTransformationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Reorientation <em>Reorientation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Reorientation
   * @generated
   */
  public Adapter createReorientationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression <em>Reorient Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression
   * @generated
   */
  public Adapter createReorientExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.ReorientRef <em>Reorient Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ReorientRef
   * @generated
   */
  public Adapter createReorientRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BasicReorientExpression <em>Basic Reorient Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BasicReorientExpression
   * @generated
   */
  public Adapter createBasicReorientExpressionAdapter()
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
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint <em>Joint Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint
   * @generated
   */
  public Adapter createJointConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad <em>External Load</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad
   * @generated
   */
  public Adapter createExternalLoadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Matrix <em>Matrix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Matrix
   * @generated
   */
  public Adapter createMatrixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix <em>Base Matrix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix
   * @generated
   */
  public Adapter createBaseMatrixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef <em>Matrix Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef
   * @generated
   */
  public Adapter createMatrixRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.ParenthesisedExp <em>Parenthesised Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ParenthesisedExp
   * @generated
   */
  public Adapter createParenthesisedExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp <em>Constant Or Function Call Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp
   * @generated
   */
  public Adapter createConstantOrFunctionCallExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType <em>Additive Joint Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType
   * @generated
   */
  public Adapter createAdditiveJointTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.AddExp <em>Add Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.AddExp
   * @generated
   */
  public Adapter createAddExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.robotics.rigidBodies.MultExp <em>Mult Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.robotics.rigidBodies.MultExp
   * @generated
   */
  public Adapter createMultExpAdapter()
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
