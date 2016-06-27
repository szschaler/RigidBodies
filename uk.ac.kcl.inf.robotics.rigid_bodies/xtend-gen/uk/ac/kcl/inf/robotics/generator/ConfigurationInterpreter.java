package uk.ac.kcl.inf.robotics.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import uk.ac.kcl.inf.robotics.rigidBodies.AXIS;
import uk.ac.kcl.inf.robotics.rigidBodies.AddExp;
import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveLockedJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicLockedJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.Configuration;
import uk.ac.kcl.inf.robotics.rigidBodies.ConfigurationStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.KeepUnlockedJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.LockDoFStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.LockJointStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.LockedJointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientRef;
import uk.ac.kcl.inf.robotics.rigidBodies.Reorientation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesFactory;
import uk.ac.kcl.inf.robotics.util.ExpressionHelper;
import uk.ac.kcl.inf.robotics.util.JointTypeHelper;

@SuppressWarnings("all")
public class ConfigurationInterpreter {
  private final Configuration config;
  
  private final EcoreUtil.Copier copier;
  
  public ConfigurationInterpreter(final Configuration config, final List<Pair<String, uk.ac.kcl.inf.robotics.rigidBodies.System>> systemInstances) {
    this.config = config;
    EcoreUtil.Copier _copier = new EcoreUtil.Copier();
    this.copier = _copier;
    final Consumer<Pair<String, uk.ac.kcl.inf.robotics.rigidBodies.System>> _function = new Consumer<Pair<String, uk.ac.kcl.inf.robotics.rigidBodies.System>>() {
      @Override
      public void accept(final Pair<String, uk.ac.kcl.inf.robotics.rigidBodies.System> p) {
        uk.ac.kcl.inf.robotics.rigidBodies.System _value = p.getValue();
        ConfigurationInterpreter.this.copier.copy(_value);
      }
    };
    systemInstances.forEach(_function);
    this.copier.copyReferences();
    this.configureSystems(this.copier);
  }
  
  public uk.ac.kcl.inf.robotics.rigidBodies.System getConfiguredSystem() {
    Collection<EObject> _values = this.copier.values();
    EObject _head = IterableExtensions.<EObject>head(_values);
    return ((uk.ac.kcl.inf.robotics.rigidBodies.System) _head);
  }
  
  private void configureSystems(final EcoreUtil.Copier copier) {
    EList<ConfigurationStatement> _statements = this.config.getStatements();
    final Consumer<ConfigurationStatement> _function = new Consumer<ConfigurationStatement>() {
      @Override
      public void accept(final ConfigurationStatement stmt) {
        ConfigurationInterpreter.this.doConfigure(stmt, copier);
      }
    };
    _statements.forEach(_function);
  }
  
  private Object _doConfigure(final ConfigurationStatement ls, final EcoreUtil.Copier copier) {
    return null;
  }
  
  private Object _doConfigure(final LockDoFStatement ldfs, final EcoreUtil.Copier copier) {
    Object _xblockexpression = null;
    {
      Joint _joint = ldfs.getJoint();
      EObject _get = copier.get(_joint);
      final Joint jointToModify = ((Joint) _get);
      LockedJointTypeExpression _lockedType = ldfs.getLockedType();
      JointType _type = jointToModify.getType();
      JointTypeExpression _exp = _type.getExp();
      _xblockexpression = this.getLockedTypeFor(_lockedType, _exp);
    }
    return _xblockexpression;
  }
  
  private List<JointTypeExpression> _getLockedTypeFor(final AdditiveLockedJointType aljt, final JointTypeExpression exp) {
    ArrayList<JointTypeExpression> _xblockexpression = null;
    {
      final int[] idx = ((int[])Conversions.unwrapArray(Collections.<Integer>unmodifiableSet(CollectionLiterals.<Integer>newHashSet(Integer.valueOf(1))), int.class));
      EList<LockedJointTypeExpression> _right = aljt.getRight();
      LockedJointTypeExpression _left = aljt.getLeft();
      JointTypeExpression _get = JointTypeHelper.get(exp, 0);
      List<JointTypeExpression> _lockedTypeFor = this.getLockedTypeFor(_left, _get);
      ArrayList<JointTypeExpression> _arrayList = new ArrayList<JointTypeExpression>(_lockedTypeFor);
      final Function2<ArrayList<JointTypeExpression>, LockedJointTypeExpression, ArrayList<JointTypeExpression>> _function = new Function2<ArrayList<JointTypeExpression>, LockedJointTypeExpression, ArrayList<JointTypeExpression>>() {
        @Override
        public ArrayList<JointTypeExpression> apply(final ArrayList<JointTypeExpression> l, final LockedJointTypeExpression c) {
          int _get = idx[0];
          JointTypeExpression _get_1 = JointTypeHelper.get(exp, _get);
          List<JointTypeExpression> _lockedTypeFor = ConfigurationInterpreter.this.getLockedTypeFor(c, _get_1);
          l.addAll(_lockedTypeFor);
          int _get_2 = idx[0];
          int _plus = (_get_2 + 1);
          idx[0] = _plus;
          return l;
        }
      };
      _xblockexpression = IterableExtensions.<LockedJointTypeExpression, ArrayList<JointTypeExpression>>fold(_right, _arrayList, _function);
    }
    return _xblockexpression;
  }
  
  private List<JointTypeExpression> _getLockedTypeFor(final KeepUnlockedJointType kujt, final JointTypeExpression exp) {
    return Collections.<JointTypeExpression>singletonList(exp);
  }
  
  private List<JointTypeExpression> _getLockedTypeFor(final BasicLockedJointType bljt, final JointTypeExpression exp) {
    Object _xifexpression = null;
    JointTypeExpression _get = JointTypeHelper.get(exp, 0);
    if ((_get instanceof BasicJointType)) {
      _xifexpression = null;
    } else {
      _xifexpression = null;
    }
    return ((List<JointTypeExpression>)_xifexpression);
  }
  
  private Object _doConfigure(final LockJointStatement ls, final EcoreUtil.Copier copier) {
    Joint _joint = ls.getJoint();
    EObject _get = copier.get(_joint);
    final Joint jointToModify = ((Joint) _get);
    RelativeTransformation _relTrans1 = jointToModify.getRelTrans1();
    Matrix _translation = ls.getTranslation();
    Matrix _rotation = ls.getRotation();
    this.setFixed(_relTrans1, _translation, _rotation);
    jointToModify.setType(null);
    return null;
  }
  
  private void setFixed(final RelativeTransformation relTrans, final Matrix mTranslation, final Matrix mRotation) {
    this.fixTranslation(relTrans, mTranslation);
    this.fixRotation(relTrans, mRotation);
  }
  
  private boolean fixTranslation(final RelativeTransformation relTrans, final Matrix mTranslation) {
    boolean _xblockexpression = false;
    {
      Matrix _position = relTrans.getPosition();
      List<Expression> _elements = this.elements(_position);
      int _size = _elements.size();
      final Expression[] posElements = new Expression[_size];
      Matrix _position_1 = relTrans.getPosition();
      List<Expression> _elements_1 = this.elements(_position_1);
      final Procedure2<Expression, Integer> _function = new Procedure2<Expression, Integer>() {
        @Override
        public void apply(final Expression exp, final Integer idx) {
          final AddExp addExp = RigidBodiesFactory.eINSTANCE.createAddExp();
          EList<Expression> _right = addExp.getRight();
          Expression _copy = EcoreUtil.<Expression>copy(exp);
          _right.add(_copy);
          List<Expression> _elements = ConfigurationInterpreter.this.elements(mTranslation);
          Expression _get = _elements.get((idx).intValue());
          Expression _copy_1 = EcoreUtil.<Expression>copy(_get);
          addExp.setLeft(_copy_1);
          EList<String> _op = addExp.getOp();
          _op.add("+");
          Expression _foldConstants = ExpressionHelper.foldConstants(addExp);
          posElements[(idx).intValue()] = _foldConstants;
        }
      };
      IterableExtensions.<Expression>forEach(_elements_1, _function);
      Matrix _position_2 = relTrans.getPosition();
      List<Expression> _elements_2 = this.elements(_position_2);
      _elements_2.clear();
      Matrix _position_3 = relTrans.getPosition();
      List<Expression> _elements_3 = this.elements(_position_3);
      _xblockexpression = CollectionExtensions.<Expression>addAll(_elements_3, posElements);
    }
    return _xblockexpression;
  }
  
  private void fixRotation(final RelativeTransformation relTrans, final Matrix mRotation) {
    final BasicReorientExpression amendedReorient = RigidBodiesFactory.eINSTANCE.createBasicReorientExpression();
    Reorientation _reorient = relTrans.getReorient();
    ReorientExpression _exp = _reorient.getExp();
    this.addAllElementsTo(_exp, amendedReorient);
    List<Expression> _elements = this.elements(mRotation);
    Expression _get = _elements.get(0);
    this.addConstantReorient(amendedReorient, AXIS.X, _get);
    List<Expression> _elements_1 = this.elements(mRotation);
    Expression _get_1 = _elements_1.get(1);
    this.addConstantReorient(amendedReorient, AXIS.Y, _get_1);
    List<Expression> _elements_2 = this.elements(mRotation);
    Expression _get_2 = _elements_2.get(2);
    this.addConstantReorient(amendedReorient, AXIS.Z, _get_2);
    Reorientation _reorient_1 = relTrans.getReorient();
    _reorient_1.setExp(amendedReorient);
  }
  
  private void addConstantReorient(final BasicReorientExpression bre, final AXIS axis, final Expression exp) {
    final Expression foldedExp = ExpressionHelper.foldConstants(exp);
    boolean _isZero = ExpressionHelper.isZero(foldedExp);
    boolean _not = (!_isZero);
    if (_not) {
      EList<AXIS> _axis = bre.getAxis();
      _axis.add(axis);
      EList<Expression> _value = bre.getValue();
      _value.add(foldedExp);
    }
  }
  
  private void _addAllElementsTo(final ReorientRef rrSrc, final BasicReorientExpression breTgt) {
    Reorientation _ref = rrSrc.getRef();
    ReorientExpression _exp = _ref.getExp();
    this.addAllElementsTo(_exp, breTgt);
  }
  
  private void _addAllElementsTo(final BasicReorientExpression breSrc, final BasicReorientExpression breTgt) {
    EList<AXIS> _axis = breTgt.getAxis();
    EList<AXIS> _axis_1 = breSrc.getAxis();
    _axis.addAll(_axis_1);
    EList<Expression> _value = breTgt.getValue();
    EList<Expression> _value_1 = breSrc.getValue();
    final Function1<Expression, Expression> _function = new Function1<Expression, Expression>() {
      @Override
      public Expression apply(final Expression exp) {
        return EcoreUtil.<Expression>copy(exp);
      }
    };
    List<Expression> _map = ListExtensions.<Expression, Expression>map(_value_1, _function);
    _value.addAll(_map);
  }
  
  private List<Expression> _elements(final Matrix m) {
    return null;
  }
  
  private List<Expression> _elements(final BaseMatrix bm) {
    return bm.getValues();
  }
  
  private List<Expression> _elements(final MatrixRef mr) {
    BaseMatrix _matrix = mr.getMatrix();
    return this.elements(_matrix);
  }
  
  private Object doConfigure(final ConfigurationStatement ldfs, final EcoreUtil.Copier copier) {
    if (ldfs instanceof LockDoFStatement) {
      return _doConfigure((LockDoFStatement)ldfs, copier);
    } else if (ldfs instanceof LockJointStatement) {
      return _doConfigure((LockJointStatement)ldfs, copier);
    } else if (ldfs != null) {
      return _doConfigure(ldfs, copier);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ldfs, copier).toString());
    }
  }
  
  private List<JointTypeExpression> getLockedTypeFor(final LockedJointTypeExpression aljt, final JointTypeExpression exp) {
    if (aljt instanceof AdditiveLockedJointType) {
      return _getLockedTypeFor((AdditiveLockedJointType)aljt, exp);
    } else if (aljt instanceof BasicLockedJointType) {
      return _getLockedTypeFor((BasicLockedJointType)aljt, exp);
    } else if (aljt instanceof KeepUnlockedJointType) {
      return _getLockedTypeFor((KeepUnlockedJointType)aljt, exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aljt, exp).toString());
    }
  }
  
  private void addAllElementsTo(final ReorientExpression breSrc, final BasicReorientExpression breTgt) {
    if (breSrc instanceof BasicReorientExpression) {
      _addAllElementsTo((BasicReorientExpression)breSrc, breTgt);
      return;
    } else if (breSrc instanceof ReorientRef) {
      _addAllElementsTo((ReorientRef)breSrc, breTgt);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(breSrc, breTgt).toString());
    }
  }
  
  private List<Expression> elements(final Matrix bm) {
    if (bm instanceof BaseMatrix) {
      return _elements((BaseMatrix)bm);
    } else if (bm instanceof MatrixRef) {
      return _elements((MatrixRef)bm);
    } else if (bm != null) {
      return _elements(bm);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bm).toString());
    }
  }
}
