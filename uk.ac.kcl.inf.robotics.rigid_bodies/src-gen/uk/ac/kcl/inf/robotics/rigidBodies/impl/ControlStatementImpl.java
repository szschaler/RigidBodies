/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.ConstraintClause;
import uk.ac.kcl.inf.robotics.rigidBodies.ControlStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ControlStatementImpl#getBodyref <em>Bodyref</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ControlStatementImpl#getRelative_transform <em>Relative transform</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ControlStatementImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ControlStatementImpl#getP <em>P</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ControlStatementImpl#getI <em>I</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.ControlStatementImpl#getD <em>D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlStatementImpl extends ConfigurationStatementImpl implements ControlStatement
{
  /**
   * The cached value of the '{@link #getBodyref() <em>Bodyref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyref()
   * @generated
   * @ordered
   */
  protected BodyReference bodyref;

  /**
   * The cached value of the '{@link #getRelative_transform() <em>Relative transform</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelative_transform()
   * @generated
   * @ordered
   */
  protected RelativeTransformation relative_transform;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<ConstraintClause> constraints;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected Expression p;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected Expression i;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected Expression d;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlStatementImpl()
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
    return RigidBodiesPackage.Literals.CONTROL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyReference getBodyref()
  {
    return bodyref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBodyref(BodyReference newBodyref, NotificationChain msgs)
  {
    BodyReference oldBodyref = bodyref;
    bodyref = newBodyref;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONTROL_STATEMENT__BODYREF, oldBodyref, newBodyref);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBodyref(BodyReference newBodyref)
  {
    if (newBodyref != bodyref)
    {
      NotificationChain msgs = null;
      if (bodyref != null)
        msgs = ((InternalEObject)bodyref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONTROL_STATEMENT__BODYREF, null, msgs);
      if (newBodyref != null)
        msgs = ((InternalEObject)newBodyref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONTROL_STATEMENT__BODYREF, null, msgs);
      msgs = basicSetBodyref(newBodyref, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONTROL_STATEMENT__BODYREF, newBodyref, newBodyref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativeTransformation getRelative_transform()
  {
    return relative_transform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelative_transform(RelativeTransformation newRelative_transform, NotificationChain msgs)
  {
    RelativeTransformation oldRelative_transform = relative_transform;
    relative_transform = newRelative_transform;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONTROL_STATEMENT__RELATIVE_TRANSFORM, oldRelative_transform, newRelative_transform);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelative_transform(RelativeTransformation newRelative_transform)
  {
    if (newRelative_transform != relative_transform)
    {
      NotificationChain msgs = null;
      if (relative_transform != null)
        msgs = ((InternalEObject)relative_transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONTROL_STATEMENT__RELATIVE_TRANSFORM, null, msgs);
      if (newRelative_transform != null)
        msgs = ((InternalEObject)newRelative_transform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONTROL_STATEMENT__RELATIVE_TRANSFORM, null, msgs);
      msgs = basicSetRelative_transform(newRelative_transform, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONTROL_STATEMENT__RELATIVE_TRANSFORM, newRelative_transform, newRelative_transform));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstraintClause> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<ConstraintClause>(ConstraintClause.class, this, RigidBodiesPackage.CONTROL_STATEMENT__CONSTRAINTS);
    }
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetP(Expression newP, NotificationChain msgs)
  {
    Expression oldP = p;
    p = newP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONTROL_STATEMENT__P, oldP, newP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setP(Expression newP)
  {
    if (newP != p)
    {
      NotificationChain msgs = null;
      if (p != null)
        msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONTROL_STATEMENT__P, null, msgs);
      if (newP != null)
        msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONTROL_STATEMENT__P, null, msgs);
      msgs = basicSetP(newP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONTROL_STATEMENT__P, newP, newP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetI(Expression newI, NotificationChain msgs)
  {
    Expression oldI = i;
    i = newI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONTROL_STATEMENT__I, oldI, newI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(Expression newI)
  {
    if (newI != i)
    {
      NotificationChain msgs = null;
      if (i != null)
        msgs = ((InternalEObject)i).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONTROL_STATEMENT__I, null, msgs);
      if (newI != null)
        msgs = ((InternalEObject)newI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONTROL_STATEMENT__I, null, msgs);
      msgs = basicSetI(newI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONTROL_STATEMENT__I, newI, newI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetD(Expression newD, NotificationChain msgs)
  {
    Expression oldD = d;
    d = newD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONTROL_STATEMENT__D, oldD, newD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD(Expression newD)
  {
    if (newD != d)
    {
      NotificationChain msgs = null;
      if (d != null)
        msgs = ((InternalEObject)d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONTROL_STATEMENT__D, null, msgs);
      if (newD != null)
        msgs = ((InternalEObject)newD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RigidBodiesPackage.CONTROL_STATEMENT__D, null, msgs);
      msgs = basicSetD(newD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.CONTROL_STATEMENT__D, newD, newD));
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
      case RigidBodiesPackage.CONTROL_STATEMENT__BODYREF:
        return basicSetBodyref(null, msgs);
      case RigidBodiesPackage.CONTROL_STATEMENT__RELATIVE_TRANSFORM:
        return basicSetRelative_transform(null, msgs);
      case RigidBodiesPackage.CONTROL_STATEMENT__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
      case RigidBodiesPackage.CONTROL_STATEMENT__P:
        return basicSetP(null, msgs);
      case RigidBodiesPackage.CONTROL_STATEMENT__I:
        return basicSetI(null, msgs);
      case RigidBodiesPackage.CONTROL_STATEMENT__D:
        return basicSetD(null, msgs);
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
      case RigidBodiesPackage.CONTROL_STATEMENT__BODYREF:
        return getBodyref();
      case RigidBodiesPackage.CONTROL_STATEMENT__RELATIVE_TRANSFORM:
        return getRelative_transform();
      case RigidBodiesPackage.CONTROL_STATEMENT__CONSTRAINTS:
        return getConstraints();
      case RigidBodiesPackage.CONTROL_STATEMENT__P:
        return getP();
      case RigidBodiesPackage.CONTROL_STATEMENT__I:
        return getI();
      case RigidBodiesPackage.CONTROL_STATEMENT__D:
        return getD();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RigidBodiesPackage.CONTROL_STATEMENT__BODYREF:
        setBodyref((BodyReference)newValue);
        return;
      case RigidBodiesPackage.CONTROL_STATEMENT__RELATIVE_TRANSFORM:
        setRelative_transform((RelativeTransformation)newValue);
        return;
      case RigidBodiesPackage.CONTROL_STATEMENT__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends ConstraintClause>)newValue);
        return;
      case RigidBodiesPackage.CONTROL_STATEMENT__P:
        setP((Expression)newValue);
        return;
      case RigidBodiesPackage.CONTROL_STATEMENT__I:
        setI((Expression)newValue);
        return;
      case RigidBodiesPackage.CONTROL_STATEMENT__D:
        setD((Expression)newValue);
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
      case RigidBodiesPackage.CONTROL_STATEMENT__BODYREF:
        setBodyref((BodyReference)null);
        return;
      case RigidBodiesPackage.CONTROL_STATEMENT__RELATIVE_TRANSFORM:
        setRelative_transform((RelativeTransformation)null);
        return;
      case RigidBodiesPackage.CONTROL_STATEMENT__CONSTRAINTS:
        getConstraints().clear();
        return;
      case RigidBodiesPackage.CONTROL_STATEMENT__P:
        setP((Expression)null);
        return;
      case RigidBodiesPackage.CONTROL_STATEMENT__I:
        setI((Expression)null);
        return;
      case RigidBodiesPackage.CONTROL_STATEMENT__D:
        setD((Expression)null);
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
      case RigidBodiesPackage.CONTROL_STATEMENT__BODYREF:
        return bodyref != null;
      case RigidBodiesPackage.CONTROL_STATEMENT__RELATIVE_TRANSFORM:
        return relative_transform != null;
      case RigidBodiesPackage.CONTROL_STATEMENT__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
      case RigidBodiesPackage.CONTROL_STATEMENT__P:
        return p != null;
      case RigidBodiesPackage.CONTROL_STATEMENT__I:
        return i != null;
      case RigidBodiesPackage.CONTROL_STATEMENT__D:
        return d != null;
    }
    return super.eIsSet(featureID);
  }

} //ControlStatementImpl
