/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Stiffness Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseStiffnessExpImpl#getSpringCoeff <em>Spring Coeff</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseStiffnessExpImpl#getSpringInit <em>Spring Init</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseStiffnessExpImpl#getDampViscous <em>Damp Viscous</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BaseStiffnessExpImpl#getDampCoulomb <em>Damp Coulomb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseStiffnessExpImpl extends InitialDefinitionImpl implements BaseStiffnessExp
{
  /**
   * The cached value of the '{@link #getSpringCoeff() <em>Spring Coeff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpringCoeff()
   * @generated
   * @ordered
   */
  protected Expression springCoeff;

  /**
   * The cached value of the '{@link #getSpringInit() <em>Spring Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpringInit()
   * @generated
   * @ordered
   */
  protected Expression springInit;

  /**
   * The cached value of the '{@link #getDampViscous() <em>Damp Viscous</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDampViscous()
   * @generated
   * @ordered
   */
  protected Expression dampViscous;

  /**
   * The cached value of the '{@link #getDampCoulomb() <em>Damp Coulomb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDampCoulomb()
   * @generated
   * @ordered
   */
  protected Expression dampCoulomb;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BaseStiffnessExpImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RigidBodiesPackage.Literals.BASE_STIFFNESS_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSpringCoeff()
  {
    return springCoeff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpringCoeff(Expression newSpringCoeff, NotificationChain msgs)
  {
    Expression oldSpringCoeff = springCoeff;
    springCoeff = newSpringCoeff;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_COEFF, oldSpringCoeff, newSpringCoeff);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpringCoeff(Expression newSpringCoeff)
  {
    if (newSpringCoeff != springCoeff)
    {
      NotificationChain msgs = null;
      if (springCoeff != null)
        msgs = ((InternalEObject)springCoeff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_COEFF, null, msgs);
      if (newSpringCoeff != null)
        msgs = ((InternalEObject)newSpringCoeff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_COEFF, null, msgs);
      msgs = basicSetSpringCoeff(newSpringCoeff, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_COEFF, newSpringCoeff, newSpringCoeff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSpringInit()
  {
    return springInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpringInit(Expression newSpringInit, NotificationChain msgs)
  {
    Expression oldSpringInit = springInit;
    springInit = newSpringInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_INIT, oldSpringInit, newSpringInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpringInit(Expression newSpringInit)
  {
    if (newSpringInit != springInit)
    {
      NotificationChain msgs = null;
      if (springInit != null)
        msgs = ((InternalEObject)springInit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_INIT, null, msgs);
      if (newSpringInit != null)
        msgs = ((InternalEObject)newSpringInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_INIT, null, msgs);
      msgs = basicSetSpringInit(newSpringInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_INIT, newSpringInit, newSpringInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDampViscous()
  {
    return dampViscous;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDampViscous(Expression newDampViscous, NotificationChain msgs)
  {
    Expression oldDampViscous = dampViscous;
    dampViscous = newDampViscous;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_VISCOUS, oldDampViscous, newDampViscous);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDampViscous(Expression newDampViscous)
  {
    if (newDampViscous != dampViscous)
    {
      NotificationChain msgs = null;
      if (dampViscous != null)
        msgs = ((InternalEObject)dampViscous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_VISCOUS, null, msgs);
      if (newDampViscous != null)
        msgs = ((InternalEObject)newDampViscous).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_VISCOUS, null, msgs);
      msgs = basicSetDampViscous(newDampViscous, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_VISCOUS, newDampViscous, newDampViscous));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDampCoulomb()
  {
    return dampCoulomb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDampCoulomb(Expression newDampCoulomb, NotificationChain msgs)
  {
    Expression oldDampCoulomb = dampCoulomb;
    dampCoulomb = newDampCoulomb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_COULOMB, oldDampCoulomb, newDampCoulomb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDampCoulomb(Expression newDampCoulomb)
  {
    if (newDampCoulomb != dampCoulomb)
    {
      NotificationChain msgs = null;
      if (dampCoulomb != null)
        msgs = ((InternalEObject)dampCoulomb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_COULOMB, null, msgs);
      if (newDampCoulomb != null)
        msgs = ((InternalEObject)newDampCoulomb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_COULOMB, null, msgs);
      msgs = basicSetDampCoulomb(newDampCoulomb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_COULOMB, newDampCoulomb, newDampCoulomb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_COEFF:
        return basicSetSpringCoeff(null, msgs);
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_INIT:
        return basicSetSpringInit(null, msgs);
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_VISCOUS:
        return basicSetDampViscous(null, msgs);
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_COULOMB:
        return basicSetDampCoulomb(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_COEFF:
        return getSpringCoeff();
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_INIT:
        return getSpringInit();
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_VISCOUS:
        return getDampViscous();
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_COULOMB:
        return getDampCoulomb();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_COEFF:
        setSpringCoeff((Expression)newValue);
        return;
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_INIT:
        setSpringInit((Expression)newValue);
        return;
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_VISCOUS:
        setDampViscous((Expression)newValue);
        return;
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_COULOMB:
        setDampCoulomb((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_COEFF:
        setSpringCoeff((Expression)null);
        return;
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_INIT:
        setSpringInit((Expression)null);
        return;
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_VISCOUS:
        setDampViscous((Expression)null);
        return;
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_COULOMB:
        setDampCoulomb((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_COEFF:
        return springCoeff != null;
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__SPRING_INIT:
        return springInit != null;
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_VISCOUS:
        return dampViscous != null;
      case RigidBodiesPackage.BASE_STIFFNESS_EXP__DAMP_COULOMB:
        return dampCoulomb != null;
    }
    return super.eIsSet(featureID);
  }

} //BaseStiffnessExpImpl
