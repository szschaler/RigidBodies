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
import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveLockedJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicLockedJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition;
import uk.ac.kcl.inf.robotics.rigidBodies.Configuration;
import uk.ac.kcl.inf.robotics.rigidBodies.ConfigurationDef;
import uk.ac.kcl.inf.robotics.rigidBodies.ConfigurationStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.Connective;
import uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp;
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint;
import uk.ac.kcl.inf.robotics.rigidBodies.ConstraintType;
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
import uk.ac.kcl.inf.robotics.rigidBodies.KeepUnlockedJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.LoadType;
import uk.ac.kcl.inf.robotics.rigidBodies.LockDoFStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.LockJointStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.LockedJointMovement;
import uk.ac.kcl.inf.robotics.rigidBodies.LockedJointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.LockedPlanar;
import uk.ac.kcl.inf.robotics.rigidBodies.LockedRevolute;
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
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesFactory;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessExp;
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessRef;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation;

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
      case RigidBodiesPackage.CONFIGURATION_DEF: return createConfigurationDef();
      case RigidBodiesPackage.SYSTEM_INSTANTIATION: return createSystemInstantiation();
      case RigidBodiesPackage.CONFIGURATION: return createConfiguration();
      case RigidBodiesPackage.CONFIGURATION_STATEMENT: return createConfigurationStatement();
      case RigidBodiesPackage.LOCK_JOINT_STATEMENT: return createLockJointStatement();
      case RigidBodiesPackage.LOCK_DO_FSTATEMENT: return createLockDoFStatement();
      case RigidBodiesPackage.LOCKED_JOINT_TYPE_EXPRESSION: return createLockedJointTypeExpression();
      case RigidBodiesPackage.KEEP_UNLOCKED_JOINT_TYPE: return createKeepUnlockedJointType();
      case RigidBodiesPackage.BASIC_LOCKED_JOINT_TYPE: return createBasicLockedJointType();
      case RigidBodiesPackage.LOCKED_JOINT_MOVEMENT: return createLockedJointMovement();
      case RigidBodiesPackage.LOCKED_REVOLUTE: return createLockedRevolute();
      case RigidBodiesPackage.LOCKED_PLANAR: return createLockedPlanar();
      case RigidBodiesPackage.SYSTEM_ELEMENT: return createSystemElement();
      case RigidBodiesPackage.CONNECTIVE: return createConnective();
      case RigidBodiesPackage.BODY: return createBody();
      case RigidBodiesPackage.BODY_REFERENCE: return createBodyReference();
      case RigidBodiesPackage.BODY_REPETITION: return createBodyRepetition();
      case RigidBodiesPackage.MASS: return createMass();
      case RigidBodiesPackage.JOINT: return createJoint();
      case RigidBodiesPackage.JOINT_TYPE: return createJointType();
      case RigidBodiesPackage.JOINT_TYPE_EXPRESSION: return createJointTypeExpression();
      case RigidBodiesPackage.JOINT_TYPE_REFERENCE: return createJointTypeReference();
      case RigidBodiesPackage.BASIC_JOINT_TYPE: return createBasicJointType();
      case RigidBodiesPackage.JOINT_MOVEMENT: return createJointMovement();
      case RigidBodiesPackage.REVOLUTE: return createRevolute();
      case RigidBodiesPackage.PLANAR: return createPlanar();
      case RigidBodiesPackage.STIFFNESS_EXP: return createStiffnessExp();
      case RigidBodiesPackage.STIFFNESS_REF: return createStiffnessRef();
      case RigidBodiesPackage.BASE_STIFFNESS_EXP: return createBaseStiffnessExp();
      case RigidBodiesPackage.RELATIVE_TRANSFORMATION: return createRelativeTransformation();
      case RigidBodiesPackage.REORIENTATION: return createReorientation();
      case RigidBodiesPackage.REORIENT_EXPRESSION: return createReorientExpression();
      case RigidBodiesPackage.REORIENT_REF: return createReorientRef();
      case RigidBodiesPackage.BASIC_REORIENT_EXPRESSION: return createBasicReorientExpression();
      case RigidBodiesPackage.CONSTRAINT: return createConstraint();
      case RigidBodiesPackage.JOINT_CONSTRAINT: return createJointConstraint();
      case RigidBodiesPackage.EXTERNAL_LOAD: return createExternalLoad();
      case RigidBodiesPackage.MATRIX: return createMatrix();
      case RigidBodiesPackage.BASE_MATRIX: return createBaseMatrix();
      case RigidBodiesPackage.MATRIX_REF: return createMatrixRef();
      case RigidBodiesPackage.EXPRESSION: return createExpression();
      case RigidBodiesPackage.PARENTHESISED_EXP: return createParenthesisedExp();
      case RigidBodiesPackage.CONSTANT_OR_FUNCTION_CALL_EXP: return createConstantOrFunctionCallExp();
      case RigidBodiesPackage.NUMBER_LITERAL: return createNumberLiteral();
      case RigidBodiesPackage.ADDITIVE_LOCKED_JOINT_TYPE: return createAdditiveLockedJointType();
      case RigidBodiesPackage.ADDITIVE_JOINT_TYPE: return createAdditiveJointType();
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
  public ConfigurationDef createConfigurationDef()
  {
    ConfigurationDefImpl configurationDef = new ConfigurationDefImpl();
    return configurationDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemInstantiation createSystemInstantiation()
  {
    SystemInstantiationImpl systemInstantiation = new SystemInstantiationImpl();
    return systemInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationStatement createConfigurationStatement()
  {
    ConfigurationStatementImpl configurationStatement = new ConfigurationStatementImpl();
    return configurationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LockJointStatement createLockJointStatement()
  {
    LockJointStatementImpl lockJointStatement = new LockJointStatementImpl();
    return lockJointStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LockDoFStatement createLockDoFStatement()
  {
    LockDoFStatementImpl lockDoFStatement = new LockDoFStatementImpl();
    return lockDoFStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LockedJointTypeExpression createLockedJointTypeExpression()
  {
    LockedJointTypeExpressionImpl lockedJointTypeExpression = new LockedJointTypeExpressionImpl();
    return lockedJointTypeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeepUnlockedJointType createKeepUnlockedJointType()
  {
    KeepUnlockedJointTypeImpl keepUnlockedJointType = new KeepUnlockedJointTypeImpl();
    return keepUnlockedJointType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicLockedJointType createBasicLockedJointType()
  {
    BasicLockedJointTypeImpl basicLockedJointType = new BasicLockedJointTypeImpl();
    return basicLockedJointType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LockedJointMovement createLockedJointMovement()
  {
    LockedJointMovementImpl lockedJointMovement = new LockedJointMovementImpl();
    return lockedJointMovement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LockedRevolute createLockedRevolute()
  {
    LockedRevoluteImpl lockedRevolute = new LockedRevoluteImpl();
    return lockedRevolute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LockedPlanar createLockedPlanar()
  {
    LockedPlanarImpl lockedPlanar = new LockedPlanarImpl();
    return lockedPlanar;
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
  public Connective createConnective()
  {
    ConnectiveImpl connective = new ConnectiveImpl();
    return connective;
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
  public BodyRepetition createBodyRepetition()
  {
    BodyRepetitionImpl bodyRepetition = new BodyRepetitionImpl();
    return bodyRepetition;
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
  public JointTypeReference createJointTypeReference()
  {
    JointTypeReferenceImpl jointTypeReference = new JointTypeReferenceImpl();
    return jointTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicJointType createBasicJointType()
  {
    BasicJointTypeImpl basicJointType = new BasicJointTypeImpl();
    return basicJointType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JointMovement createJointMovement()
  {
    JointMovementImpl jointMovement = new JointMovementImpl();
    return jointMovement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Revolute createRevolute()
  {
    RevoluteImpl revolute = new RevoluteImpl();
    return revolute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Planar createPlanar()
  {
    PlanarImpl planar = new PlanarImpl();
    return planar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StiffnessExp createStiffnessExp()
  {
    StiffnessExpImpl stiffnessExp = new StiffnessExpImpl();
    return stiffnessExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StiffnessRef createStiffnessRef()
  {
    StiffnessRefImpl stiffnessRef = new StiffnessRefImpl();
    return stiffnessRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseStiffnessExp createBaseStiffnessExp()
  {
    BaseStiffnessExpImpl baseStiffnessExp = new BaseStiffnessExpImpl();
    return baseStiffnessExp;
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
  public ReorientRef createReorientRef()
  {
    ReorientRefImpl reorientRef = new ReorientRefImpl();
    return reorientRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicReorientExpression createBasicReorientExpression()
  {
    BasicReorientExpressionImpl basicReorientExpression = new BasicReorientExpressionImpl();
    return basicReorientExpression;
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
  public JointConstraint createJointConstraint()
  {
    JointConstraintImpl jointConstraint = new JointConstraintImpl();
    return jointConstraint;
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
  public ParenthesisedExp createParenthesisedExp()
  {
    ParenthesisedExpImpl parenthesisedExp = new ParenthesisedExpImpl();
    return parenthesisedExp;
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
  public AdditiveLockedJointType createAdditiveLockedJointType()
  {
    AdditiveLockedJointTypeImpl additiveLockedJointType = new AdditiveLockedJointTypeImpl();
    return additiveLockedJointType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveJointType createAdditiveJointType()
  {
    AdditiveJointTypeImpl additiveJointType = new AdditiveJointTypeImpl();
    return additiveJointType;
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
