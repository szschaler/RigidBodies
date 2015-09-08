/**
 */
package uk.ac.kcl.inf.robotics.rigidBodies.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyReferenceImpl#isBase <em>Base</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyReferenceImpl#isNew <em>New</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyReferenceImpl#isLast <em>Last</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.robotics.rigidBodies.impl.BodyReferenceImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyReferenceImpl extends MinimalEObjectImpl.Container implements BodyReference
{
  /**
   * The default value of the '{@link #isBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBase()
   * @generated
   * @ordered
   */
  protected static final boolean BASE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBase()
   * @generated
   * @ordered
   */
  protected boolean base = BASE_EDEFAULT;

  /**
   * The default value of the '{@link #isNew() <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNew()
   * @generated
   * @ordered
   */
  protected static final boolean NEW_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNew() <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNew()
   * @generated
   * @ordered
   */
  protected boolean new_ = NEW_EDEFAULT;

  /**
   * The default value of the '{@link #isLast() <em>Last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLast()
   * @generated
   * @ordered
   */
  protected static final boolean LAST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLast() <em>Last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLast()
   * @generated
   * @ordered
   */
  protected boolean last = LAST_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Body ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyReferenceImpl()
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
    return RigidBodiesPackage.Literals.BODY_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(boolean newBase)
  {
    boolean oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BODY_REFERENCE__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNew()
  {
    return new_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNew(boolean newNew)
  {
    boolean oldNew = new_;
    new_ = newNew;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BODY_REFERENCE__NEW, oldNew, new_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLast()
  {
    return last;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLast(boolean newLast)
  {
    boolean oldLast = last;
    last = newLast;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BODY_REFERENCE__LAST, oldLast, last));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (Body)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RigidBodiesPackage.BODY_REFERENCE__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(Body newRef)
  {
    Body oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RigidBodiesPackage.BODY_REFERENCE__REF, oldRef, ref));
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
      case RigidBodiesPackage.BODY_REFERENCE__BASE:
        return isBase();
      case RigidBodiesPackage.BODY_REFERENCE__NEW:
        return isNew();
      case RigidBodiesPackage.BODY_REFERENCE__LAST:
        return isLast();
      case RigidBodiesPackage.BODY_REFERENCE__REF:
        if (resolve) return getRef();
        return basicGetRef();
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
      case RigidBodiesPackage.BODY_REFERENCE__BASE:
        setBase((Boolean)newValue);
        return;
      case RigidBodiesPackage.BODY_REFERENCE__NEW:
        setNew((Boolean)newValue);
        return;
      case RigidBodiesPackage.BODY_REFERENCE__LAST:
        setLast((Boolean)newValue);
        return;
      case RigidBodiesPackage.BODY_REFERENCE__REF:
        setRef((Body)newValue);
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
      case RigidBodiesPackage.BODY_REFERENCE__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case RigidBodiesPackage.BODY_REFERENCE__NEW:
        setNew(NEW_EDEFAULT);
        return;
      case RigidBodiesPackage.BODY_REFERENCE__LAST:
        setLast(LAST_EDEFAULT);
        return;
      case RigidBodiesPackage.BODY_REFERENCE__REF:
        setRef((Body)null);
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
      case RigidBodiesPackage.BODY_REFERENCE__BASE:
        return base != BASE_EDEFAULT;
      case RigidBodiesPackage.BODY_REFERENCE__NEW:
        return new_ != NEW_EDEFAULT;
      case RigidBodiesPackage.BODY_REFERENCE__LAST:
        return last != LAST_EDEFAULT;
      case RigidBodiesPackage.BODY_REFERENCE__REF:
        return ref != null;
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
    result.append(" (base: ");
    result.append(base);
    result.append(", new: ");
    result.append(new_);
    result.append(", last: ");
    result.append(last);
    result.append(')');
    return result.toString();
  }

} //BodyReferenceImpl
