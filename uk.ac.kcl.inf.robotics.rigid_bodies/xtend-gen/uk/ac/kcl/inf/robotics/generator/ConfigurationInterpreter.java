package uk.ac.kcl.inf.robotics.generator;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import uk.ac.kcl.inf.robotics.rigidBodies.AXIS;
import uk.ac.kcl.inf.robotics.rigidBodies.AddExp;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.Configuration;
import uk.ac.kcl.inf.robotics.rigidBodies.ConfigurationStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.LockJointStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef;
import uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.ReorientRef;
import uk.ac.kcl.inf.robotics.rigidBodies.Reorientation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesFactory;
import uk.ac.kcl.inf.robotics.util.ExpressionHelper;

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
          Expression _foldConstants = ExpressionHelper.foldConstants(exp);
          _right.add(_foldConstants);
          List<Expression> _elements = ConfigurationInterpreter.this.elements(mTranslation);
          Expression _get = _elements.get((idx).intValue());
          Expression _foldConstants_1 = ExpressionHelper.foldConstants(_get);
          addExp.setLeft(_foldConstants_1);
          EList<String> _op = addExp.getOp();
          _op.add("+");
          Expression _foldConstants_2 = ExpressionHelper.foldConstants(addExp);
          posElements[(idx).intValue()] = _foldConstants_2;
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
    boolean _or = false;
    if ((!(foldedExp instanceof NumberLiteral))) {
      _or = true;
    } else {
      double _parse = ExpressionHelper.parse(((NumberLiteral) foldedExp));
      boolean _notEquals = (_parse != 0.0);
      _or = _notEquals;
    }
    if (_or) {
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
  
  private Object doConfigure(final ConfigurationStatement ls, final EcoreUtil.Copier copier) {
    if (ls instanceof LockJointStatement) {
      return _doConfigure((LockJointStatement)ls, copier);
    } else if (ls != null) {
      return _doConfigure(ls, copier);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ls, copier).toString());
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
