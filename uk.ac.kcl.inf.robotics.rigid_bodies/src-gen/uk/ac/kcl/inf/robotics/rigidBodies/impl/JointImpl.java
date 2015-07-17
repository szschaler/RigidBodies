/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getBody1 <em>Body1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getRelTrans1 <em>Rel Trans1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getBody2 <em>Body2</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getRelTrans2 <em>Rel Trans2</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getSpringCoeff <em>Spring Coeff</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getSpringInit <em>Spring Init</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getDampViscous <em>Damp Viscous</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.JointImpl#getDampCoulomb <em>Damp Coulomb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JointImpl extends SystemElementImpl implements Joint
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JointType type;

  /**
   * The default value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStart()
   * @generated
   * @ordered
   */
  protected static final boolean IS_START_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStart()
   * @generated
   * @ordered
   */
  protected boolean isStart = IS_START_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody1() <em>Body1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody1()
   * @generated
   * @ordered
   */
  protected Body body1;

  /**
   * The cached value of the '{@link #getRelTrans1() <em>Rel Trans1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelTrans1()
   * @generated
   * @ordered
   */
  protected RelativeTransformation relTrans1;

  /**
   * The cached value of the '{@link #getBody2() <em>Body2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody2()
   * @generated
   * @ordered
   */
  protected Body body2;

  /**
   * The cached value of the '{@link #getRelTrans2() <em>Rel Trans2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelTrans2()
   * @generated
   * @ordered
   */
  protected RelativeTransformation relTrans2;

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
  protected JointImpl()
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
    return RigidBodiesPackage.Literals.JOINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JointType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JointType newType, NotificationChain msgs)
  {
    JointType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JointType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsStart()
  {
    return isStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsStart(boolean newIsStart)
  {
    boolean oldIsStart = isStart;
    isStart = newIsStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__IS_START, oldIsStart, isStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body getBody1()
  {
    if (body1 != null && body1.eIsProxy())
    {
      InternalEObject oldBody1 = (InternalEObject)body1;
      body1 = (Body)eResolveProxy(oldBody1);
      if (body1 != oldBody1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.JOINT__BODY1, oldBody1, body1));
      }
    }
    return body1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body basicGetBody1()
  {
    return body1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody1(Body newBody1)
  {
    Body oldBody1 = body1;
    body1 = newBody1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__BODY1, oldBody1, body1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativeTransformation getRelTrans1()
  {
    return relTrans1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelTrans1(RelativeTransformation newRelTrans1, NotificationChain msgs)
  {
    RelativeTransformation oldRelTrans1 = relTrans1;
    relTrans1 = newRelTrans1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__REL_TRANS1, oldRelTrans1, newRelTrans1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelTrans1(RelativeTransformation newRelTrans1)
  {
    if (newRelTrans1 != relTrans1)
    {
      NotificationChain msgs = null;
      if (relTrans1 != null)
        msgs = ((InternalEObject)relTrans1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__REL_TRANS1, null, msgs);
      if (newRelTrans1 != null)
        msgs = ((InternalEObject)newRelTrans1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__REL_TRANS1, null, msgs);
      msgs = basicSetRelTrans1(newRelTrans1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__REL_TRANS1, newRelTrans1, newRelTrans1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body getBody2()
  {
    if (body2 != null && body2.eIsProxy())
    {
      InternalEObject oldBody2 = (InternalEObject)body2;
      body2 = (Body)eResolveProxy(oldBody2);
      if (body2 != oldBody2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.JOINT__BODY2, oldBody2, body2));
      }
    }
    return body2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body basicGetBody2()
  {
    return body2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody2(Body newBody2)
  {
    Body oldBody2 = body2;
    body2 = newBody2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__BODY2, oldBody2, body2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativeTransformation getRelTrans2()
  {
    return relTrans2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelTrans2(RelativeTransformation newRelTrans2, NotificationChain msgs)
  {
    RelativeTransformation oldRelTrans2 = relTrans2;
    relTrans2 = newRelTrans2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__REL_TRANS2, oldRelTrans2, newRelTrans2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelTrans2(RelativeTransformation newRelTrans2)
  {
    if (newRelTrans2 != relTrans2)
    {
      NotificationChain msgs = null;
      if (relTrans2 != null)
        msgs = ((InternalEObject)relTrans2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__REL_TRANS2, null, msgs);
      if (newRelTrans2 != null)
        msgs = ((InternalEObject)newRelTrans2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__REL_TRANS2, null, msgs);
      msgs = basicSetRelTrans2(newRelTrans2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__REL_TRANS2, newRelTrans2, newRelTrans2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__SPRING_COEFF, oldSpringCoeff, newSpringCoeff);
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
        msgs = ((InternalEObject)springCoeff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__SPRING_COEFF, null, msgs);
      if (newSpringCoeff != null)
        msgs = ((InternalEObject)newSpringCoeff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__SPRING_COEFF, null, msgs);
      msgs = basicSetSpringCoeff(newSpringCoeff, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__SPRING_COEFF, newSpringCoeff, newSpringCoeff));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__SPRING_INIT, oldSpringInit, newSpringInit);
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
        msgs = ((InternalEObject)springInit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__SPRING_INIT, null, msgs);
      if (newSpringInit != null)
        msgs = ((InternalEObject)newSpringInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__SPRING_INIT, null, msgs);
      msgs = basicSetSpringInit(newSpringInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__SPRING_INIT, newSpringInit, newSpringInit));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__DAMP_VISCOUS, oldDampViscous, newDampViscous);
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
        msgs = ((InternalEObject)dampViscous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__DAMP_VISCOUS, null, msgs);
      if (newDampViscous != null)
        msgs = ((InternalEObject)newDampViscous).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__DAMP_VISCOUS, null, msgs);
      msgs = basicSetDampViscous(newDampViscous, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__DAMP_VISCOUS, newDampViscous, newDampViscous));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__DAMP_COULOMB, oldDampCoulomb, newDampCoulomb);
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
        msgs = ((InternalEObject)dampCoulomb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__DAMP_COULOMB, null, msgs);
      if (newDampCoulomb != null)
        msgs = ((InternalEObject)newDampCoulomb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.JOINT__DAMP_COULOMB, null, msgs);
      msgs = basicSetDampCoulomb(newDampCoulomb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.JOINT__DAMP_COULOMB, newDampCoulomb, newDampCoulomb));
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
      case RigidBodiesPackage.JOINT__TYPE:
        return basicSetType(null, msgs);
      case RigidBodiesPackage.JOINT__REL_TRANS1:
        return basicSetRelTrans1(null, msgs);
      case RigidBodiesPackage.JOINT__REL_TRANS2:
        return basicSetRelTrans2(null, msgs);
      case RigidBodiesPackage.JOINT__SPRING_COEFF:
        return basicSetSpringCoeff(null, msgs);
      case RigidBodiesPackage.JOINT__SPRING_INIT:
        return basicSetSpringInit(null, msgs);
      case RigidBodiesPackage.JOINT__DAMP_VISCOUS:
        return basicSetDampViscous(null, msgs);
      case RigidBodiesPackage.JOINT__DAMP_COULOMB:
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
      case RigidBodiesPackage.JOINT__TYPE:
        return getType();
      case RigidBodiesPackage.JOINT__IS_START:
        return isIsStart();
      case RigidBodiesPackage.JOINT__BODY1:
        if (resolve) return getBody1();
        return basicGetBody1();
      case RigidBodiesPackage.JOINT__REL_TRANS1:
        return getRelTrans1();
      case RigidBodiesPackage.JOINT__BODY2:
        if (resolve) return getBody2();
        return basicGetBody2();
      case RigidBodiesPackage.JOINT__REL_TRANS2:
        return getRelTrans2();
      case RigidBodiesPackage.JOINT__SPRING_COEFF:
        return getSpringCoeff();
      case RigidBodiesPackage.JOINT__SPRING_INIT:
        return getSpringInit();
      case RigidBodiesPackage.JOINT__DAMP_VISCOUS:
        return getDampViscous();
      case RigidBodiesPackage.JOINT__DAMP_COULOMB:
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
      case RigidBodiesPackage.JOINT__TYPE:
        setType((JointType)newValue);
        return;
      case RigidBodiesPackage.JOINT__IS_START:
        setIsStart((Boolean)newValue);
        return;
      case RigidBodiesPackage.JOINT__BODY1:
        setBody1((Body)newValue);
        return;
      case RigidBodiesPackage.JOINT__REL_TRANS1:
        setRelTrans1((RelativeTransformation)newValue);
        return;
      case RigidBodiesPackage.JOINT__BODY2:
        setBody2((Body)newValue);
        return;
      case RigidBodiesPackage.JOINT__REL_TRANS2:
        setRelTrans2((RelativeTransformation)newValue);
        return;
      case RigidBodiesPackage.JOINT__SPRING_COEFF:
        setSpringCoeff((Expression)newValue);
        return;
      case RigidBodiesPackage.JOINT__SPRING_INIT:
        setSpringInit((Expression)newValue);
        return;
      case RigidBodiesPackage.JOINT__DAMP_VISCOUS:
        setDampViscous((Expression)newValue);
        return;
      case RigidBodiesPackage.JOINT__DAMP_COULOMB:
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
      case RigidBodiesPackage.JOINT__TYPE:
        setType((JointType)null);
        return;
      case RigidBodiesPackage.JOINT__IS_START:
        setIsStart(IS_START_EDEFAULT);
        return;
      case RigidBodiesPackage.JOINT__BODY1:
        setBody1((Body)null);
        return;
      case RigidBodiesPackage.JOINT__REL_TRANS1:
        setRelTrans1((RelativeTransformation)null);
        return;
      case RigidBodiesPackage.JOINT__BODY2:
        setBody2((Body)null);
        return;
      case RigidBodiesPackage.JOINT__REL_TRANS2:
        setRelTrans2((RelativeTransformation)null);
        return;
      case RigidBodiesPackage.JOINT__SPRING_COEFF:
        setSpringCoeff((Expression)null);
        return;
      case RigidBodiesPackage.JOINT__SPRING_INIT:
        setSpringInit((Expression)null);
        return;
      case RigidBodiesPackage.JOINT__DAMP_VISCOUS:
        setDampViscous((Expression)null);
        return;
      case RigidBodiesPackage.JOINT__DAMP_COULOMB:
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
      case RigidBodiesPackage.JOINT__TYPE:
        return type != null;
      case RigidBodiesPackage.JOINT__IS_START:
        return isStart != IS_START_EDEFAULT;
      case RigidBodiesPackage.JOINT__BODY1:
        return body1 != null;
      case RigidBodiesPackage.JOINT__REL_TRANS1:
        return relTrans1 != null;
      case RigidBodiesPackage.JOINT__BODY2:
        return body2 != null;
      case RigidBodiesPackage.JOINT__REL_TRANS2:
        return relTrans2 != null;
      case RigidBodiesPackage.JOINT__SPRING_COEFF:
        return springCoeff != null;
      case RigidBodiesPackage.JOINT__SPRING_INIT:
        return springInit != null;
      case RigidBodiesPackage.JOINT__DAMP_VISCOUS:
        return dampViscous != null;
      case RigidBodiesPackage.JOINT__DAMP_COULOMB:
        return dampCoulomb != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isStart: ");
    result.append(isStart);
    result.append(')');
    return result.toString();
  }

} //JointImpl
