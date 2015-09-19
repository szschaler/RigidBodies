/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import uk.ac.kcl.inf.robotics.rigidBodies.LoadType;
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
import uk.ac.kcl.inf.robotics.rigidBodies.State;
import uk.ac.kcl.inf.robotics.rigidBodies.StateDef;
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessExp;
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessRef;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RigidBodiesPackageImpl extends EPackageImpl implements RigidBodiesPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initialDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemInstantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyRepetitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass massEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jointTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jointTypeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jointTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicJointTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jointMovementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass revoluteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass planarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stiffnessExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stiffnessRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseStiffnessExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relativeTransformationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reorientationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reorientExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reorientRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicReorientExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jointConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalLoadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matrixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseMatrixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matrixRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenthesisedExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantOrFunctionCallExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveJointTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum axisEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum constraintTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum loadTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RigidBodiesPackageImpl()
  {
    super(eNS_URI, RigidBodiesFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RigidBodiesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RigidBodiesPackage init()
  {
    if (isInited) return (RigidBodiesPackage)EPackage.Registry.INSTANCE.getEPackage(RigidBodiesPackage.eNS_URI);

    // Obtain or create and register package
    RigidBodiesPackageImpl theRigidBodiesPackage = (RigidBodiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RigidBodiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RigidBodiesPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRigidBodiesPackage.createPackageContents();

    // Initialize created meta-data
    theRigidBodiesPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRigidBodiesPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RigidBodiesPackage.eNS_URI, theRigidBodiesPackage);
    return theRigidBodiesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Defs()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_World()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Bodies()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_States()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitialDefinition()
  {
    return initialDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitialDefinition_Name()
  {
    return (EAttribute)initialDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironment()
  {
    return environmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironment_Gravity()
  {
    return (EReference)environmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystem()
  {
    return systemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystem_Name()
  {
    return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystem_Elements()
  {
    return (EReference)systemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateDef()
  {
    return stateDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateDef_Instances()
  {
    return (EReference)stateDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateDef_States()
  {
    return (EReference)stateDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemInstantiation()
  {
    return systemInstantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemInstantiation_System()
  {
    return (EReference)systemInstantiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemInstantiation_Name()
  {
    return (EAttribute)systemInstantiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Name()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemElement()
  {
    return systemElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnective()
  {
    return connectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnective_Name()
  {
    return (EAttribute)connectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnective_Body1()
  {
    return (EReference)connectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBody()
  {
    return bodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBody_Name()
  {
    return (EAttribute)bodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Mass()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyReference()
  {
    return bodyReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyReference_Base()
  {
    return (EAttribute)bodyReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyReference_New()
  {
    return (EAttribute)bodyReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyReference_Last()
  {
    return (EAttribute)bodyReferenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyReference_Ref()
  {
    return (EReference)bodyReferenceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyReference_Idx()
  {
    return (EAttribute)bodyReferenceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyRepetition()
  {
    return bodyRepetitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyRepetition_Number()
  {
    return (EAttribute)bodyRepetitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyRepetition_Body()
  {
    return (EReference)bodyRepetitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyRepetition_ConnectionExp()
  {
    return (EReference)bodyRepetitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMass()
  {
    return massEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMass_Value()
  {
    return (EReference)massEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMass_Position()
  {
    return (EReference)massEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMass_Inertia()
  {
    return (EReference)massEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoint()
  {
    return jointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoint_Type()
  {
    return (EReference)jointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoint_IsStart()
  {
    return (EAttribute)jointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoint_RelTrans1()
  {
    return (EReference)jointEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoint_Body2()
  {
    return (EReference)jointEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJointType()
  {
    return jointTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJointType_Exp()
  {
    return (EReference)jointTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJointTypeExpression()
  {
    return jointTypeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJointTypeReference()
  {
    return jointTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJointTypeReference_Ref()
  {
    return (EReference)jointTypeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicJointType()
  {
    return basicJointTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicJointType_Type()
  {
    return (EReference)basicJointTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicJointType_Stiffness()
  {
    return (EReference)basicJointTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJointMovement()
  {
    return jointMovementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJointMovement_Axis()
  {
    return (EAttribute)jointMovementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRevolute()
  {
    return revoluteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlanar()
  {
    return planarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStiffnessExp()
  {
    return stiffnessExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStiffnessRef()
  {
    return stiffnessRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStiffnessRef_Ref()
  {
    return (EReference)stiffnessRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseStiffnessExp()
  {
    return baseStiffnessExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseStiffnessExp_SpringCoeff()
  {
    return (EReference)baseStiffnessExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseStiffnessExp_SpringInit()
  {
    return (EReference)baseStiffnessExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseStiffnessExp_DampViscous()
  {
    return (EReference)baseStiffnessExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseStiffnessExp_DampCoulomb()
  {
    return (EReference)baseStiffnessExpEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelativeTransformation()
  {
    return relativeTransformationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelativeTransformation_Position()
  {
    return (EReference)relativeTransformationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelativeTransformation_Reorient()
  {
    return (EReference)relativeTransformationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReorientation()
  {
    return reorientationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReorientation_Name()
  {
    return (EAttribute)reorientationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReorientation_Exp()
  {
    return (EReference)reorientationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReorientExpression()
  {
    return reorientExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReorientRef()
  {
    return reorientRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReorientRef_Ref()
  {
    return (EReference)reorientRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicReorientExpression()
  {
    return basicReorientExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicReorientExpression_Axis()
  {
    return (EAttribute)basicReorientExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicReorientExpression_Value()
  {
    return (EReference)basicReorientExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_Type()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_RelTrans1()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_Body2()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_RelTrans2()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJointConstraint()
  {
    return jointConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJointConstraint_Name()
  {
    return (EAttribute)jointConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJointConstraint_Joint1()
  {
    return (EReference)jointConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJointConstraint_Joint2()
  {
    return (EReference)jointConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalLoad()
  {
    return externalLoadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalLoad_Type()
  {
    return (EAttribute)externalLoadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalLoad_Position()
  {
    return (EReference)externalLoadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatrix()
  {
    return matrixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseMatrix()
  {
    return baseMatrixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseMatrix_Values()
  {
    return (EReference)baseMatrixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatrixRef()
  {
    return matrixRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatrixRef_Matrix()
  {
    return (EReference)matrixRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParenthesisedExp()
  {
    return parenthesisedExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParenthesisedExp_Exp()
  {
    return (EReference)parenthesisedExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantOrFunctionCallExp()
  {
    return constantOrFunctionCallExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantOrFunctionCallExp_Label()
  {
    return (EAttribute)constantOrFunctionCallExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantOrFunctionCallExp_Param()
  {
    return (EReference)constantOrFunctionCallExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberLiteral()
  {
    return numberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberLiteral_Neg()
  {
    return (EAttribute)numberLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberLiteral_Value()
  {
    return (EAttribute)numberLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditiveJointType()
  {
    return additiveJointTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveJointType_Left()
  {
    return (EReference)additiveJointTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveJointType_Right()
  {
    return (EReference)additiveJointTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddExp()
  {
    return addExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddExp_Left()
  {
    return (EReference)addExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddExp_Op()
  {
    return (EAttribute)addExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddExp_Right()
  {
    return (EReference)addExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultExp()
  {
    return multExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultExp_Left()
  {
    return (EReference)multExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultExp_Op()
  {
    return (EAttribute)multExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultExp_Right()
  {
    return (EReference)multExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAXIS()
  {
    return axisEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConstraintType()
  {
    return constraintTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLoadType()
  {
    return loadTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RigidBodiesFactory getRigidBodiesFactory()
  {
    return (RigidBodiesFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__DEFS);
    createEReference(modelEClass, MODEL__WORLD);
    createEReference(modelEClass, MODEL__BODIES);
    createEReference(modelEClass, MODEL__STATES);

    initialDefinitionEClass = createEClass(INITIAL_DEFINITION);
    createEAttribute(initialDefinitionEClass, INITIAL_DEFINITION__NAME);

    environmentEClass = createEClass(ENVIRONMENT);
    createEReference(environmentEClass, ENVIRONMENT__GRAVITY);

    systemEClass = createEClass(SYSTEM);
    createEAttribute(systemEClass, SYSTEM__NAME);
    createEReference(systemEClass, SYSTEM__ELEMENTS);

    stateDefEClass = createEClass(STATE_DEF);
    createEReference(stateDefEClass, STATE_DEF__INSTANCES);
    createEReference(stateDefEClass, STATE_DEF__STATES);

    systemInstantiationEClass = createEClass(SYSTEM_INSTANTIATION);
    createEReference(systemInstantiationEClass, SYSTEM_INSTANTIATION__SYSTEM);
    createEAttribute(systemInstantiationEClass, SYSTEM_INSTANTIATION__NAME);

    stateEClass = createEClass(STATE);
    createEAttribute(stateEClass, STATE__NAME);

    systemElementEClass = createEClass(SYSTEM_ELEMENT);

    connectiveEClass = createEClass(CONNECTIVE);
    createEAttribute(connectiveEClass, CONNECTIVE__NAME);
    createEReference(connectiveEClass, CONNECTIVE__BODY1);

    bodyEClass = createEClass(BODY);
    createEAttribute(bodyEClass, BODY__NAME);
    createEReference(bodyEClass, BODY__MASS);

    bodyReferenceEClass = createEClass(BODY_REFERENCE);
    createEAttribute(bodyReferenceEClass, BODY_REFERENCE__BASE);
    createEAttribute(bodyReferenceEClass, BODY_REFERENCE__NEW);
    createEAttribute(bodyReferenceEClass, BODY_REFERENCE__LAST);
    createEReference(bodyReferenceEClass, BODY_REFERENCE__REF);
    createEAttribute(bodyReferenceEClass, BODY_REFERENCE__IDX);

    bodyRepetitionEClass = createEClass(BODY_REPETITION);
    createEAttribute(bodyRepetitionEClass, BODY_REPETITION__NUMBER);
    createEReference(bodyRepetitionEClass, BODY_REPETITION__BODY);
    createEReference(bodyRepetitionEClass, BODY_REPETITION__CONNECTION_EXP);

    massEClass = createEClass(MASS);
    createEReference(massEClass, MASS__VALUE);
    createEReference(massEClass, MASS__POSITION);
    createEReference(massEClass, MASS__INERTIA);

    jointEClass = createEClass(JOINT);
    createEReference(jointEClass, JOINT__TYPE);
    createEAttribute(jointEClass, JOINT__IS_START);
    createEReference(jointEClass, JOINT__REL_TRANS1);
    createEReference(jointEClass, JOINT__BODY2);

    jointTypeEClass = createEClass(JOINT_TYPE);
    createEReference(jointTypeEClass, JOINT_TYPE__EXP);

    jointTypeExpressionEClass = createEClass(JOINT_TYPE_EXPRESSION);

    jointTypeReferenceEClass = createEClass(JOINT_TYPE_REFERENCE);
    createEReference(jointTypeReferenceEClass, JOINT_TYPE_REFERENCE__REF);

    basicJointTypeEClass = createEClass(BASIC_JOINT_TYPE);
    createEReference(basicJointTypeEClass, BASIC_JOINT_TYPE__TYPE);
    createEReference(basicJointTypeEClass, BASIC_JOINT_TYPE__STIFFNESS);

    jointMovementEClass = createEClass(JOINT_MOVEMENT);
    createEAttribute(jointMovementEClass, JOINT_MOVEMENT__AXIS);

    revoluteEClass = createEClass(REVOLUTE);

    planarEClass = createEClass(PLANAR);

    stiffnessExpEClass = createEClass(STIFFNESS_EXP);

    stiffnessRefEClass = createEClass(STIFFNESS_REF);
    createEReference(stiffnessRefEClass, STIFFNESS_REF__REF);

    baseStiffnessExpEClass = createEClass(BASE_STIFFNESS_EXP);
    createEReference(baseStiffnessExpEClass, BASE_STIFFNESS_EXP__SPRING_COEFF);
    createEReference(baseStiffnessExpEClass, BASE_STIFFNESS_EXP__SPRING_INIT);
    createEReference(baseStiffnessExpEClass, BASE_STIFFNESS_EXP__DAMP_VISCOUS);
    createEReference(baseStiffnessExpEClass, BASE_STIFFNESS_EXP__DAMP_COULOMB);

    relativeTransformationEClass = createEClass(RELATIVE_TRANSFORMATION);
    createEReference(relativeTransformationEClass, RELATIVE_TRANSFORMATION__POSITION);
    createEReference(relativeTransformationEClass, RELATIVE_TRANSFORMATION__REORIENT);

    reorientationEClass = createEClass(REORIENTATION);
    createEAttribute(reorientationEClass, REORIENTATION__NAME);
    createEReference(reorientationEClass, REORIENTATION__EXP);

    reorientExpressionEClass = createEClass(REORIENT_EXPRESSION);

    reorientRefEClass = createEClass(REORIENT_REF);
    createEReference(reorientRefEClass, REORIENT_REF__REF);

    basicReorientExpressionEClass = createEClass(BASIC_REORIENT_EXPRESSION);
    createEAttribute(basicReorientExpressionEClass, BASIC_REORIENT_EXPRESSION__AXIS);
    createEReference(basicReorientExpressionEClass, BASIC_REORIENT_EXPRESSION__VALUE);

    constraintEClass = createEClass(CONSTRAINT);
    createEAttribute(constraintEClass, CONSTRAINT__TYPE);
    createEReference(constraintEClass, CONSTRAINT__REL_TRANS1);
    createEReference(constraintEClass, CONSTRAINT__BODY2);
    createEReference(constraintEClass, CONSTRAINT__REL_TRANS2);

    jointConstraintEClass = createEClass(JOINT_CONSTRAINT);
    createEAttribute(jointConstraintEClass, JOINT_CONSTRAINT__NAME);
    createEReference(jointConstraintEClass, JOINT_CONSTRAINT__JOINT1);
    createEReference(jointConstraintEClass, JOINT_CONSTRAINT__JOINT2);

    externalLoadEClass = createEClass(EXTERNAL_LOAD);
    createEAttribute(externalLoadEClass, EXTERNAL_LOAD__TYPE);
    createEReference(externalLoadEClass, EXTERNAL_LOAD__POSITION);

    matrixEClass = createEClass(MATRIX);

    baseMatrixEClass = createEClass(BASE_MATRIX);
    createEReference(baseMatrixEClass, BASE_MATRIX__VALUES);

    matrixRefEClass = createEClass(MATRIX_REF);
    createEReference(matrixRefEClass, MATRIX_REF__MATRIX);

    expressionEClass = createEClass(EXPRESSION);

    parenthesisedExpEClass = createEClass(PARENTHESISED_EXP);
    createEReference(parenthesisedExpEClass, PARENTHESISED_EXP__EXP);

    constantOrFunctionCallExpEClass = createEClass(CONSTANT_OR_FUNCTION_CALL_EXP);
    createEAttribute(constantOrFunctionCallExpEClass, CONSTANT_OR_FUNCTION_CALL_EXP__LABEL);
    createEReference(constantOrFunctionCallExpEClass, CONSTANT_OR_FUNCTION_CALL_EXP__PARAM);

    numberLiteralEClass = createEClass(NUMBER_LITERAL);
    createEAttribute(numberLiteralEClass, NUMBER_LITERAL__NEG);
    createEAttribute(numberLiteralEClass, NUMBER_LITERAL__VALUE);

    additiveJointTypeEClass = createEClass(ADDITIVE_JOINT_TYPE);
    createEReference(additiveJointTypeEClass, ADDITIVE_JOINT_TYPE__LEFT);
    createEReference(additiveJointTypeEClass, ADDITIVE_JOINT_TYPE__RIGHT);

    addExpEClass = createEClass(ADD_EXP);
    createEReference(addExpEClass, ADD_EXP__LEFT);
    createEAttribute(addExpEClass, ADD_EXP__OP);
    createEReference(addExpEClass, ADD_EXP__RIGHT);

    multExpEClass = createEClass(MULT_EXP);
    createEReference(multExpEClass, MULT_EXP__LEFT);
    createEAttribute(multExpEClass, MULT_EXP__OP);
    createEReference(multExpEClass, MULT_EXP__RIGHT);

    // Create enums
    axisEEnum = createEEnum(AXIS);
    constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);
    loadTypeEEnum = createEEnum(LOAD_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    connectiveEClass.getESuperTypes().add(this.getSystemElement());
    bodyEClass.getESuperTypes().add(this.getSystemElement());
    bodyRepetitionEClass.getESuperTypes().add(this.getSystemElement());
    jointEClass.getESuperTypes().add(this.getConnective());
    jointTypeEClass.getESuperTypes().add(this.getInitialDefinition());
    jointTypeReferenceEClass.getESuperTypes().add(this.getJointTypeExpression());
    basicJointTypeEClass.getESuperTypes().add(this.getJointTypeExpression());
    revoluteEClass.getESuperTypes().add(this.getJointMovement());
    planarEClass.getESuperTypes().add(this.getJointMovement());
    stiffnessRefEClass.getESuperTypes().add(this.getStiffnessExp());
    baseStiffnessExpEClass.getESuperTypes().add(this.getInitialDefinition());
    baseStiffnessExpEClass.getESuperTypes().add(this.getStiffnessExp());
    reorientRefEClass.getESuperTypes().add(this.getReorientExpression());
    basicReorientExpressionEClass.getESuperTypes().add(this.getReorientExpression());
    constraintEClass.getESuperTypes().add(this.getConnective());
    jointConstraintEClass.getESuperTypes().add(this.getSystemElement());
    externalLoadEClass.getESuperTypes().add(this.getConnective());
    baseMatrixEClass.getESuperTypes().add(this.getInitialDefinition());
    baseMatrixEClass.getESuperTypes().add(this.getMatrix());
    matrixRefEClass.getESuperTypes().add(this.getMatrix());
    parenthesisedExpEClass.getESuperTypes().add(this.getExpression());
    constantOrFunctionCallExpEClass.getESuperTypes().add(this.getExpression());
    numberLiteralEClass.getESuperTypes().add(this.getExpression());
    additiveJointTypeEClass.getESuperTypes().add(this.getJointTypeExpression());
    addExpEClass.getESuperTypes().add(this.getExpression());
    multExpEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Defs(), this.getInitialDefinition(), null, "defs", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_World(), this.getEnvironment(), null, "world", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Bodies(), this.getSystem(), null, "bodies", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_States(), this.getStateDef(), null, "states", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initialDefinitionEClass, InitialDefinition.class, "InitialDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInitialDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, InitialDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnvironment_Gravity(), this.getMatrix(), null, "gravity", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemEClass, uk.ac.kcl.inf.robotics.rigidBodies.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, uk.ac.kcl.inf.robotics.rigidBodies.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystem_Elements(), this.getSystemElement(), null, "elements", null, 0, -1, uk.ac.kcl.inf.robotics.rigidBodies.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateDefEClass, StateDef.class, "StateDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateDef_Instances(), this.getSystemInstantiation(), null, "instances", null, 0, -1, StateDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateDef_States(), this.getState(), null, "states", null, 0, -1, StateDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemInstantiationEClass, SystemInstantiation.class, "SystemInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSystemInstantiation_System(), this.getSystem(), null, "system", null, 0, 1, SystemInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystemInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, SystemInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemElementEClass, SystemElement.class, "SystemElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(connectiveEClass, Connective.class, "Connective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConnective_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnective_Body1(), this.getBodyReference(), null, "body1", null, 0, 1, Connective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBody_Name(), ecorePackage.getEString(), "name", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBody_Mass(), this.getMass(), null, "mass", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyReferenceEClass, BodyReference.class, "BodyReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBodyReference_Base(), ecorePackage.getEBoolean(), "base", null, 0, 1, BodyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBodyReference_New(), ecorePackage.getEBoolean(), "new", null, 0, 1, BodyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBodyReference_Last(), ecorePackage.getEBoolean(), "last", null, 0, 1, BodyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBodyReference_Ref(), this.getBody(), null, "ref", null, 0, 1, BodyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBodyReference_Idx(), ecorePackage.getEInt(), "idx", null, 0, 1, BodyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyRepetitionEClass, BodyRepetition.class, "BodyRepetition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBodyRepetition_Number(), ecorePackage.getEInt(), "number", null, 0, 1, BodyRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBodyRepetition_Body(), this.getBody(), null, "body", null, 0, 1, BodyRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBodyRepetition_ConnectionExp(), this.getSystemElement(), null, "connectionExp", null, 0, -1, BodyRepetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(massEClass, Mass.class, "Mass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMass_Value(), this.getExpression(), null, "value", null, 0, 1, Mass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMass_Position(), this.getMatrix(), null, "position", null, 0, 1, Mass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMass_Inertia(), this.getMatrix(), null, "inertia", null, 0, 1, Mass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jointEClass, Joint.class, "Joint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJoint_Type(), this.getJointType(), null, "type", null, 0, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoint_IsStart(), ecorePackage.getEBoolean(), "isStart", null, 0, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoint_RelTrans1(), this.getRelativeTransformation(), null, "relTrans1", null, 0, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoint_Body2(), this.getBodyReference(), null, "body2", null, 0, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jointTypeEClass, JointType.class, "JointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJointType_Exp(), this.getJointTypeExpression(), null, "exp", null, 0, 1, JointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jointTypeExpressionEClass, JointTypeExpression.class, "JointTypeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jointTypeReferenceEClass, JointTypeReference.class, "JointTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJointTypeReference_Ref(), this.getJointType(), null, "ref", null, 0, 1, JointTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicJointTypeEClass, BasicJointType.class, "BasicJointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBasicJointType_Type(), this.getJointMovement(), null, "type", null, 0, 1, BasicJointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasicJointType_Stiffness(), this.getStiffnessExp(), null, "stiffness", null, 0, 1, BasicJointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jointMovementEClass, JointMovement.class, "JointMovement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJointMovement_Axis(), this.getAXIS(), "axis", null, 0, 1, JointMovement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(revoluteEClass, Revolute.class, "Revolute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(planarEClass, Planar.class, "Planar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stiffnessExpEClass, StiffnessExp.class, "StiffnessExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stiffnessRefEClass, StiffnessRef.class, "StiffnessRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStiffnessRef_Ref(), this.getBaseStiffnessExp(), null, "ref", null, 0, 1, StiffnessRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(baseStiffnessExpEClass, BaseStiffnessExp.class, "BaseStiffnessExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBaseStiffnessExp_SpringCoeff(), this.getExpression(), null, "springCoeff", null, 0, 1, BaseStiffnessExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBaseStiffnessExp_SpringInit(), this.getExpression(), null, "springInit", null, 0, 1, BaseStiffnessExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBaseStiffnessExp_DampViscous(), this.getExpression(), null, "dampViscous", null, 0, 1, BaseStiffnessExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBaseStiffnessExp_DampCoulomb(), this.getExpression(), null, "dampCoulomb", null, 0, 1, BaseStiffnessExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relativeTransformationEClass, RelativeTransformation.class, "RelativeTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelativeTransformation_Position(), this.getMatrix(), null, "position", null, 0, 1, RelativeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelativeTransformation_Reorient(), this.getReorientation(), null, "reorient", null, 0, 1, RelativeTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reorientationEClass, Reorientation.class, "Reorientation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReorientation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Reorientation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReorientation_Exp(), this.getReorientExpression(), null, "exp", null, 0, 1, Reorientation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reorientExpressionEClass, ReorientExpression.class, "ReorientExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(reorientRefEClass, ReorientRef.class, "ReorientRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReorientRef_Ref(), this.getReorientation(), null, "ref", null, 0, 1, ReorientRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicReorientExpressionEClass, BasicReorientExpression.class, "BasicReorientExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasicReorientExpression_Axis(), this.getAXIS(), "axis", null, 0, -1, BasicReorientExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasicReorientExpression_Value(), this.getExpression(), null, "value", null, 0, -1, BasicReorientExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstraint_Type(), this.getConstraintType(), "type", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_RelTrans1(), this.getRelativeTransformation(), null, "relTrans1", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_Body2(), this.getBodyReference(), null, "body2", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_RelTrans2(), this.getRelativeTransformation(), null, "relTrans2", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jointConstraintEClass, JointConstraint.class, "JointConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJointConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, JointConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJointConstraint_Joint1(), this.getJoint(), null, "joint1", null, 0, 1, JointConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJointConstraint_Joint2(), this.getJoint(), null, "joint2", null, 0, 1, JointConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalLoadEClass, ExternalLoad.class, "ExternalLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalLoad_Type(), this.getLoadType(), "type", null, 0, 1, ExternalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalLoad_Position(), this.getMatrix(), null, "position", null, 0, 1, ExternalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(baseMatrixEClass, BaseMatrix.class, "BaseMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBaseMatrix_Values(), this.getExpression(), null, "values", null, 0, -1, BaseMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matrixRefEClass, MatrixRef.class, "MatrixRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatrixRef_Matrix(), this.getBaseMatrix(), null, "matrix", null, 0, 1, MatrixRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parenthesisedExpEClass, ParenthesisedExp.class, "ParenthesisedExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParenthesisedExp_Exp(), this.getExpression(), null, "exp", null, 0, 1, ParenthesisedExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantOrFunctionCallExpEClass, ConstantOrFunctionCallExp.class, "ConstantOrFunctionCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantOrFunctionCallExp_Label(), ecorePackage.getEString(), "label", null, 0, 1, ConstantOrFunctionCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantOrFunctionCallExp_Param(), this.getExpression(), null, "param", null, 0, -1, ConstantOrFunctionCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberLiteral_Neg(), ecorePackage.getEBoolean(), "neg", null, 0, 1, NumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, NumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveJointTypeEClass, AdditiveJointType.class, "AdditiveJointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdditiveJointType_Left(), this.getJointTypeExpression(), null, "left", null, 0, 1, AdditiveJointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdditiveJointType_Right(), this.getJointTypeExpression(), null, "right", null, 0, -1, AdditiveJointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addExpEClass, AddExp.class, "AddExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAddExp_Left(), this.getExpression(), null, "left", null, 0, 1, AddExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddExp_Op(), ecorePackage.getEString(), "op", null, 0, -1, AddExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddExp_Right(), this.getExpression(), null, "right", null, 0, -1, AddExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multExpEClass, MultExp.class, "MultExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultExp_Left(), this.getExpression(), null, "left", null, 0, 1, MultExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultExp_Op(), ecorePackage.getEString(), "op", null, 0, -1, MultExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultExp_Right(), this.getExpression(), null, "right", null, 0, -1, MultExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(axisEEnum, uk.ac.kcl.inf.robotics.rigidBodies.AXIS.class, "AXIS");
    addEEnumLiteral(axisEEnum, uk.ac.kcl.inf.robotics.rigidBodies.AXIS.X);
    addEEnumLiteral(axisEEnum, uk.ac.kcl.inf.robotics.rigidBodies.AXIS.Y);
    addEEnumLiteral(axisEEnum, uk.ac.kcl.inf.robotics.rigidBodies.AXIS.Z);

    initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.GEOMETRICAL);
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.VELOCITY);

    initEEnum(loadTypeEEnum, LoadType.class, "LoadType");
    addEEnumLiteral(loadTypeEEnum, LoadType.FORCE);
    addEEnumLiteral(loadTypeEEnum, LoadType.TORQUE);

    // Create resource
    createResource(eNS_URI);
  }

} //RigidBodiesPackageImpl
