/**
 * generated by Xtext
 */
package uk.ac.kcl.inf.robotics.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import uk.ac.kcl.inf.robotics.rigidBodies.AXIS;
import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveLockedJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicLockedJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition;
import uk.ac.kcl.inf.robotics.rigidBodies.Environment;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointMovement;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.KeepUnlockedJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.LockDoFStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.LockedJointMovement;
import uk.ac.kcl.inf.robotics.rigidBodies.LockedJointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.LockedPlanar;
import uk.ac.kcl.inf.robotics.rigidBodies.LockedRevolute;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef;
import uk.ac.kcl.inf.robotics.rigidBodies.Model;
import uk.ac.kcl.inf.robotics.rigidBodies.Planar;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.Revolute;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;
import uk.ac.kcl.inf.robotics.util.JointTypeHelper;
import uk.ac.kcl.inf.robotics.validation.AbstractRigidBodiesValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class RigidBodiesValidator extends AbstractRigidBodiesValidator {
  public final static String TOO_MANY_START_JOINTS = "tooManyStartJoints";
  
  @Check
  public void checkOnlyOneStartJoint(final uk.ac.kcl.inf.robotics.rigidBodies.System s) {
    EList<SystemElement> _elements = s.getElements();
    Iterable<Joint> _filter = Iterables.<Joint>filter(_elements, Joint.class);
    final Function1<Joint, Boolean> _function = new Function1<Joint, Boolean>() {
      @Override
      public Boolean apply(final Joint j) {
        return Boolean.valueOf(j.isIsStart());
      }
    };
    Iterable<Joint> startJoints = IterableExtensions.<Joint>filter(_filter, _function);
    int _size = IterableExtensions.size(startJoints);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      final Consumer<Joint> _function_1 = new Consumer<Joint>() {
        @Override
        public void accept(final Joint j) {
          RigidBodiesValidator.this.warning("There can only be one start joint for each system", j, 
            RigidBodiesPackage.Literals.JOINT__IS_START, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, 
            RigidBodiesValidator.TOO_MANY_START_JOINTS);
        }
      };
      startJoints.forEach(_function_1);
    }
  }
  
  public final static String NEW_OUTSIDE_REPEAT = "newOutsideRepeat";
  
  public final static String LAST_OUTSIDE_REPEAT = "lastOutsideRepeat";
  
  @Check
  public void checkUseOfNewAndLast(final BodyReference br) {
    boolean _or = false;
    boolean _isNew = br.isNew();
    if (_isNew) {
      _or = true;
    } else {
      boolean _and = false;
      boolean _isLast = br.isLast();
      if (!_isLast) {
        _and = false;
      } else {
        Body _ref = br.getRef();
        boolean _equals = Objects.equal(_ref, null);
        _and = _equals;
      }
      _or = _and;
    }
    if (_or) {
      EObject container = br;
      while (((!(container instanceof Model)) && (!(container instanceof BodyRepetition)))) {
        EObject _eContainer = container.eContainer();
        container = _eContainer;
      }
      if ((container instanceof Model)) {
        boolean _isNew_1 = br.isNew();
        if (_isNew_1) {
          this.error("new is only a valid body reference within a repeat expression.", br, 
            RigidBodiesPackage.Literals.BODY_REFERENCE__NEW, 
            ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.NEW_OUTSIDE_REPEAT);
        } else {
          this.error("last must provide a body reference outside a repeat expression.", br, 
            RigidBodiesPackage.Literals.BODY_REFERENCE__LAST, 
            ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.LAST_OUTSIDE_REPEAT);
        }
      }
    }
  }
  
  public final static String NO_NEW_IN_REPEAT = "noNewInRepeat";
  
  @Check
  public void repeatBodyMustContainJointDefinition(final BodyRepetition br) {
    EList<SystemElement> _connectionExp = br.getConnectionExp();
    Iterable<Joint> _filter = Iterables.<Joint>filter(_connectionExp, Joint.class);
    final Function1<Joint, Boolean> _function = new Function1<Joint, Boolean>() {
      @Override
      public Boolean apply(final Joint j) {
        boolean _or = false;
        BodyReference _body1 = j.getBody1();
        boolean _isNew = _body1.isNew();
        if (_isNew) {
          _or = true;
        } else {
          BodyReference _body2 = j.getBody2();
          boolean _isNew_1 = _body2.isNew();
          _or = _isNew_1;
        }
        return Boolean.valueOf(_or);
      }
    };
    boolean _exists = IterableExtensions.<Joint>exists(_filter, _function);
    boolean _not = (!_exists);
    if (_not) {
      this.error("Repeat expression must contain at least one joint referencing the new body.", br, 
        RigidBodiesPackage.Literals.BODY_REPETITION__CONNECTION_EXP, 
        ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.NO_NEW_IN_REPEAT);
    }
  }
  
  public final static String GRAVITY_NO_3D = "gravityNo3D";
  
  @Check
  public void gravityMustBe3D(final Environment e) {
    Matrix _gravity = e.getGravity();
    int _length = this.getLength(_gravity);
    boolean _notEquals = (_length != 3);
    if (_notEquals) {
      this.error("Gravity must be a 3D vector.", e, RigidBodiesPackage.Literals.ENVIRONMENT__GRAVITY, 
        ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.GRAVITY_NO_3D);
    }
  }
  
  public final static String MASS_POS_NO_3D = "massPosNo3D";
  
  public final static String MASS_INERTIA_NO_9D = "massInertiaNo9D";
  
  @Check
  public void massVectorSizes(final Mass m) {
    Matrix _position = m.getPosition();
    int _length = this.getLength(_position);
    boolean _notEquals = (_length != 3);
    if (_notEquals) {
      this.error("Mass position must be a 3D vector.", m, RigidBodiesPackage.Literals.MASS__POSITION, 
        ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.MASS_POS_NO_3D);
    }
    Matrix _inertia = m.getInertia();
    int _length_1 = this.getLength(_inertia);
    boolean _notEquals_1 = (_length_1 != 9);
    if (_notEquals_1) {
      this.error("Mass inertia must be a 3 by 3 matrix.", m, RigidBodiesPackage.Literals.MASS__INERTIA, 
        ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.MASS_INERTIA_NO_9D);
    }
  }
  
  public final static String RELTRANS_POS_NO_3D = "relTransPosNo3D";
  
  @Check
  public void relTransPosMustBe3D(final RelativeTransformation rt) {
    Matrix _position = rt.getPosition();
    int _length = this.getLength(_position);
    boolean _notEquals = (_length != 3);
    if (_notEquals) {
      this.error("Relative transformation position must be a 3D vector.", rt, 
        RigidBodiesPackage.Literals.RELATIVE_TRANSFORMATION__POSITION, 
        ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.RELTRANS_POS_NO_3D);
    }
  }
  
  protected int _getLength(final BaseMatrix matrix) {
    EList<Expression> _values = matrix.getValues();
    return ((Object[])Conversions.unwrapArray(_values, Object.class)).length;
  }
  
  protected int _getLength(final MatrixRef mr) {
    BaseMatrix _matrix = mr.getMatrix();
    return this.getLength(_matrix);
  }
  
  public final static String BODY_REF_WO_CONTEXT = "bodyRefWoContext";
  
  public final static String BODY_REF_BAD_REF = "bodyRefBadRef";
  
  public final static String BODY_REF_NO_REPETITION = "bodyRefNoRepetition";
  
  public final static String BODY_REF_TOO_FEW_REPETITIONS = "bodyRefTooFewRepetitions";
  
  @Check
  public void isValidIndexedBodyReference(final BodyReference br) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _isNew = br.isNew();
    boolean _not = (!_isNew);
    if (!_not) {
      _and_1 = false;
    } else {
      boolean _isLast = br.isLast();
      boolean _not_1 = (!_isLast);
      _and_1 = _not_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _isBase = br.isBase();
      boolean _not_2 = (!_isBase);
      _and = _not_2;
    }
    if (_and) {
      int _idx = br.getIdx();
      boolean _greaterThan = (_idx > 0);
      if (_greaterThan) {
        EObject container = this.getContainerForIndexing(br);
        boolean _equals = Objects.equal(container, null);
        if (_equals) {
          this.error("Indexed body reference must be in a repetition or system.", br, 
            RigidBodiesPackage.Literals.BODY_REFERENCE__REF, 
            ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.BODY_REF_WO_CONTEXT);
        } else {
          if ((container instanceof BodyRepetition)) {
            Body _ref = br.getRef();
            Body _body = ((BodyRepetition) container).getBody();
            boolean _equals_1 = Objects.equal(_ref, _body);
            if (_equals_1) {
              this.error("Cannot put in an indexed reference to body being repeated.", br, 
                RigidBodiesPackage.Literals.BODY_REFERENCE__REF, 
                ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.BODY_REF_BAD_REF);
            }
            EObject _containerForIndexing = this.getContainerForIndexing(container);
            container = _containerForIndexing;
          }
        }
        boolean _equals_2 = Objects.equal(container, null);
        if (_equals_2) {
          this.error("Indexed body reference must be in a repetition or system.", br, 
            RigidBodiesPackage.Literals.BODY_REFERENCE__REF, 
            ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.BODY_REF_WO_CONTEXT);
        } else {
          if ((container instanceof uk.ac.kcl.inf.robotics.rigidBodies.System)) {
            EList<SystemElement> _elements = ((uk.ac.kcl.inf.robotics.rigidBodies.System) container).getElements();
            Iterable<BodyRepetition> _filter = Iterables.<BodyRepetition>filter(_elements, BodyRepetition.class);
            final Function1<BodyRepetition, Boolean> _function = new Function1<BodyRepetition, Boolean>() {
              @Override
              public Boolean apply(final BodyRepetition brep) {
                Body _body = brep.getBody();
                Body _ref = br.getRef();
                return Boolean.valueOf(Objects.equal(_body, _ref));
              }
            };
            boolean _exists = IterableExtensions.<BodyRepetition>exists(_filter, _function);
            boolean _not_3 = (!_exists);
            if (_not_3) {
              this.error("Indexed body reference must reference a repeated body.", br, 
                RigidBodiesPackage.Literals.BODY_REFERENCE__REF, 
                ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.BODY_REF_NO_REPETITION);
            } else {
              EList<SystemElement> _elements_1 = ((uk.ac.kcl.inf.robotics.rigidBodies.System) container).getElements();
              Iterable<BodyRepetition> _filter_1 = Iterables.<BodyRepetition>filter(_elements_1, BodyRepetition.class);
              final Function1<BodyRepetition, Boolean> _function_1 = new Function1<BodyRepetition, Boolean>() {
                @Override
                public Boolean apply(final BodyRepetition brep) {
                  Body _body = brep.getBody();
                  Body _ref = br.getRef();
                  return Boolean.valueOf(Objects.equal(_body, _ref));
                }
              };
              Iterable<BodyRepetition> _filter_2 = IterableExtensions.<BodyRepetition>filter(_filter_1, _function_1);
              final Function2<Integer, BodyRepetition, Integer> _function_2 = new Function2<Integer, BodyRepetition, Integer>() {
                @Override
                public Integer apply(final Integer acc, final BodyRepetition brep) {
                  int _number = brep.getNumber();
                  return Integer.valueOf(((acc).intValue() + _number));
                }
              };
              Integer _fold = IterableExtensions.<BodyRepetition, Integer>fold(_filter_2, Integer.valueOf(0), _function_2);
              int _idx_1 = br.getIdx();
              boolean _lessThan = ((_fold).intValue() < _idx_1);
              if (_lessThan) {
                this.error("Indexed body reference cannot use index higher than sum of repetition counts.", br, 
                  RigidBodiesPackage.Literals.BODY_REFERENCE__REF, 
                  ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.BODY_REF_TOO_FEW_REPETITIONS);
              }
            }
          }
        }
      }
    }
  }
  
  private EObject getContainerForIndexing(final EObject eo) {
    EObject container = eo.eContainer();
    while (((!Objects.equal(container, null)) && (!((container instanceof uk.ac.kcl.inf.robotics.rigidBodies.System) || (container instanceof BodyRepetition))))) {
      EObject _eContainer = container.eContainer();
      container = _eContainer;
    }
    return container;
  }
  
  public final static String LOCKED_TYPE_NO_MATCH = "LOCKED_TYPE_NO_MATCH";
  
  @Check
  public void isValidLockDoFStatement(final LockDoFStatement ldfs) {
    LockedJointTypeExpression _lockedType = ldfs.getLockedType();
    Joint _joint = ldfs.getJoint();
    JointType _type = _joint.getType();
    JointTypeExpression _exp = _type.getExp();
    this.checkIsValidLocking(_lockedType, _exp);
  }
  
  private void _checkIsValidLocking(final AdditiveLockedJointType aljt, final JointTypeExpression exp) {
    LockedJointTypeExpression _left = aljt.getLeft();
    JointTypeExpression _get = JointTypeHelper.get(exp, 0);
    this.checkIsValidLocking(_left, _get);
    EList<LockedJointTypeExpression> _right = aljt.getRight();
    final Procedure2<LockedJointTypeExpression, Integer> _function = new Procedure2<LockedJointTypeExpression, Integer>() {
      @Override
      public void apply(final LockedJointTypeExpression e, final Integer idx) {
        final JointTypeExpression jt = JointTypeHelper.get(exp, ((idx).intValue() + 1));
        boolean _notEquals = (!Objects.equal(jt, null));
        if (_notEquals) {
          RigidBodiesValidator.this.checkIsValidLocking(e, jt);
        } else {
          RigidBodiesValidator.this.error("No matching element in original joint type", e, null, 
            ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.LOCKED_TYPE_NO_MATCH);
        }
      }
    };
    IterableExtensions.<LockedJointTypeExpression>forEach(_right, _function);
  }
  
  private void _checkIsValidLocking(final KeepUnlockedJointType kujt, final JointTypeExpression exp) {
  }
  
  private void _checkIsValidLocking(final BasicLockedJointType bljt, final JointTypeExpression exp) {
    JointTypeExpression _get = JointTypeHelper.get(exp, 0);
    if ((_get instanceof BasicJointType)) {
      LockedJointMovement _type = bljt.getType();
      JointTypeExpression _get_1 = JointTypeHelper.get(exp, 0);
      JointMovement _type_1 = ((BasicJointType) _get_1).getType();
      this.checkIsValidLocking(_type, _type_1);
    } else {
      this.error("No matching element in original joint type", bljt, null, 
        ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.LOCKED_TYPE_NO_MATCH);
    }
  }
  
  private void _checkIsValidLocking(final LockedRevolute lr, final JointMovement jm) {
    boolean _and = false;
    if (!(jm instanceof Revolute)) {
      _and = false;
    } else {
      AXIS _axis = lr.getAxis();
      AXIS _axis_1 = ((Revolute) jm).getAxis();
      boolean _equals = Objects.equal(_axis, _axis_1);
      _and = _equals;
    }
    boolean _not = (!_and);
    if (_not) {
      this.error("No matching element in original joint type", lr, null, 
        ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.LOCKED_TYPE_NO_MATCH);
    }
  }
  
  private void _checkIsValidLocking(final LockedPlanar lp, final JointMovement jm) {
    boolean _and = false;
    if (!(jm instanceof Planar)) {
      _and = false;
    } else {
      AXIS _axis = lp.getAxis();
      AXIS _axis_1 = ((Planar) jm).getAxis();
      boolean _equals = Objects.equal(_axis, _axis_1);
      _and = _equals;
    }
    boolean _not = (!_and);
    if (_not) {
      this.error("No matching element in original joint type", lp, null, 
        ValidationMessageAcceptor.INSIGNIFICANT_INDEX, RigidBodiesValidator.LOCKED_TYPE_NO_MATCH);
    }
  }
  
  public int getLength(final Matrix matrix) {
    if (matrix instanceof BaseMatrix) {
      return _getLength((BaseMatrix)matrix);
    } else if (matrix instanceof MatrixRef) {
      return _getLength((MatrixRef)matrix);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(matrix).toString());
    }
  }
  
  private void checkIsValidLocking(final EObject aljt, final EObject exp) {
    if (aljt instanceof AdditiveLockedJointType
         && exp instanceof JointTypeExpression) {
      _checkIsValidLocking((AdditiveLockedJointType)aljt, (JointTypeExpression)exp);
      return;
    } else if (aljt instanceof BasicLockedJointType
         && exp instanceof JointTypeExpression) {
      _checkIsValidLocking((BasicLockedJointType)aljt, (JointTypeExpression)exp);
      return;
    } else if (aljt instanceof KeepUnlockedJointType
         && exp instanceof JointTypeExpression) {
      _checkIsValidLocking((KeepUnlockedJointType)aljt, (JointTypeExpression)exp);
      return;
    } else if (aljt instanceof LockedPlanar
         && exp instanceof JointMovement) {
      _checkIsValidLocking((LockedPlanar)aljt, (JointMovement)exp);
      return;
    } else if (aljt instanceof LockedRevolute
         && exp instanceof JointMovement) {
      _checkIsValidLocking((LockedRevolute)aljt, (JointMovement)exp);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aljt, exp).toString());
    }
  }
}
