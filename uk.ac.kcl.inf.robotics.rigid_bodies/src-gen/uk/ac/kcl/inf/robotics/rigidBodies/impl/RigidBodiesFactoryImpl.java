/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.robotics.rigidBodies.AXIS;
import uk.ac.kcl.inf.robotics.rigidBodies.AddExp;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp;
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint;
import uk.ac.kcl.inf.robotics.rigidBodies.ConstraintType;
import uk.ac.kcl.inf.robotics.rigidBodies.Environment;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad;
import uk.ac.kcl.inf.robotics.rigidBodies.InitialDefinition;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.LoadType;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef;
import uk.ac.kcl.inf.robotics.rigidBodies.Model;
import uk.ac.kcl.inf.robotics.rigidBodies.MultExp;
import uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.Reorientation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesFactory;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RigidBodiesFactoryImpl extends EFactoryImpl implements RigidBodiesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RigidBodiesFactory init()
  {
    try
    {
      RigidBodiesFactory theRigidBodiesFactory = (RigidBodiesFactory)EPackage.Registry.INSTANCE.getEFactory(RigidBodiesPackage.eNS_URI);
      if (theRigidBodiesFactory != null)
      {
        return theRigidBodiesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RigidBodiesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RigidBodiesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RigidBodiesPackage.MODEL: return createModel();
      case RigidBodiesPackage.INITIAL_DEFINITION: return createInitialDefinition();
      case RigidBodiesPackage.ENVIRONMENT: return createEnvironment();
      case RigidBodiesPackage.SYSTEM: return createSystem();
      case RigidBodiesPackage.SYSTEM_ELEMENT: return createSystemElement();
      case RigidBodiesPackage.BODY: return createBody();
      case RigidBodiesPackage.BODY_REFERENCE: return createBodyReference();
      case RigidBodiesPackage.MASS: return createMass();
      case RigidBodiesPackage.JOINT: return createJoint();
      case RigidBodiesPackage.JOINT_TYPE: return createJointType();
      case RigidBodiesPackage.JOINT_TYPE_EXPRESSION: return createJointTypeExpression();
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION: return createRelativeTransformation();
      case RigidBodiesPackage.REORIENTATION: return createReorientation();
      case RigidBodiesPackage.REORIENT_EXPRESSION: return createReorientExpression();
      case RigidBodiesPackage.CONSTRAINT: return createConstraint();
      case RigidBodiesPackage.EXTERNAL_LOAD: return createExternalLoad();
      case RigidBodiesPackage.MATRIX: return createMatrix();
      case RigidBodiesPackage.BASE_MATRIX: return createBaseMatrix();
      case RigidBodiesPackage.MATRIX_REF: return createMatrixRef();
      case RigidBodiesPackage.EXPRESSION: return createExpression();
      case RigidBodiesPackage.CONSTANT_OR_FUNCTION_CALL_EXP: return createConstantOrFunctionCallExp();
      case RigidBodiesPackage.NUMBER_LITERAL: return createNumberLiteral();
      case RigidBodiesPackage.ADD_EXP: return createAddExp();
      case RigidBodiesPackage.MULT_EXP: return createMultExp();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RigidBodiesPackage.AXIS:
        return createAXISFromString(eDataType, initialValue);
      case RigidBodiesPackage.CONSTRAINT_TYPE:
        return createConstraintTypeFromString(eDataType, initialValue);
      case RigidBodiesPackage.LOAD_TYPE:
        return createLoadTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RigidBodiesPackage.AXIS:
        return convertAXISToString(eDataType, instanceValue);
      case RigidBodiesPackage.CONSTRAINT_TYPE:
        return convertConstraintTypeToString(eDataType, instanceValue);
      case RigidBodiesPackage.LOAD_TYPE:
        return convertLoadTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialDefinition createInitialDefinition()
  {
    InitialDefinitionImpl initialDefinition = new InitialDefinitionImpl();
    return initialDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment createEnvironment()
  {
    EnvironmentImpl environment = new EnvironmentImpl();
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uk.ac.kcl.inf.robotics.rigidBodies.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemElement createSystemElement()
  {
    SystemElementImpl systemElement = new SystemElementImpl();
    return systemElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyReference createBodyReference()
  {
    BodyReferenceImpl bodyReference = new BodyReferenceImpl();
    return bodyReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mass createMass()
  {
    MassImpl mass = new MassImpl();
    return mass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Joint createJoint()
  {
    JointImpl joint = new JointImpl();
    return joint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JointType createJointType()
  {
    JointTypeImpl jointType = new JointTypeImpl();
    return jointType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JointTypeExpression createJointTypeExpression()
  {
    JointTypeExpressionImpl jointTypeExpression = new JointTypeExpressionImpl();
    return jointTypeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativeTransformation createRelativeTransformation()
  {
    RelativeTransformationImpl relativeTransformation = new RelativeTransformationImpl();
    return relativeTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reorientation createReorientation()
  {
    ReorientationImpl reorientation = new ReorientationImpl();
    return reorientation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReorientExpression createReorientExpression()
  {
    ReorientExpressionImpl reorientExpression = new ReorientExpressionImpl();
    return reorientExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalLoad createExternalLoad()
  {
    ExternalLoadImpl externalLoad = new ExternalLoadImpl();
    return externalLoad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix createMatrix()
  {
    MatrixImpl matrix = new MatrixImpl();
    return matrix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseMatrix createBaseMatrix()
  {
    BaseMatrixImpl baseMatrix = new BaseMatrixImpl();
    return baseMatrix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatrixRef createMatrixRef()
  {
    MatrixRefImpl matrixRef = new MatrixRefImpl();
    return matrixRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantOrFunctionCallExp createConstantOrFunctionCallExp()
  {
    ConstantOrFunctionCallExpImpl constantOrFunctionCallExp = new ConstantOrFunctionCallExpImpl();
    return constantOrFunctionCallExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddExp createAddExp()
  {
    AddExpImpl addExp = new AddExpImpl();
    return addExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultExp createMultExp()
  {
    MultExpImpl multExp = new MultExpImpl();
    return multExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AXIS createAXISFromString(EDataType eDataType, String initialValue)
  {
    AXIS result = AXIS.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAXISToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintType createConstraintTypeFromString(EDataType eDataType, String initialValue)
  {
    ConstraintType result = ConstraintType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConstraintTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadType createLoadTypeFromString(EDataType eDataType, String initialValue)
  {
    LoadType result = LoadType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLoadTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RigidBodiesPackage getRigidBodiesPackage()
  {
    return (RigidBodiesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RigidBodiesPackage getPackage()
  {
    return RigidBodiesPackage.eINSTANCE;
  }

} //RigidBodiesFactoryImpl