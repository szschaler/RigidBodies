package uk.ac.kcl.inf.robotics.util;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import uk.ac.kcl.inf.robotics.rigidBodies.AddExp;
import uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.MultExp;
import uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral;
import uk.ac.kcl.inf.robotics.rigidBodies.ParenthesisedExp;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesFactory;

/**
 * A helper class with functions to simplify handling of expressions. To be imported as a library of extension methods.
 * 
 * @author Steffen Zschaler
 */
@SuppressWarnings("all")
public class ExpressionHelper {
  /**
   * A somewhat simplistic constant folder. Note that every call to foldConstants will always return a new expression object so that containment relationships are not damaged.
   */
  protected static Expression _foldConstants(final Expression exp) {
    return exp;
  }
  
  protected static Expression _foldConstants(final AddExp exp) {
    AddExp tentativeResult = RigidBodiesFactory.eINSTANCE.createAddExp();
    Expression _left = exp.getLeft();
    Expression _foldConstants = ExpressionHelper.foldConstants(_left);
    tentativeResult.setLeft(_foldConstants);
    EList<String> _op = exp.getOp();
    int _size = _op.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    final Function2<AddExp, Integer, AddExp> _function = new Function2<AddExp, Integer, AddExp>() {
      @Override
      public AddExp apply(final AddExp rExp, final Integer idx) {
        AddExp _xblockexpression = null;
        {
          EList<Expression> _right = exp.getRight();
          Expression _get = _right.get((idx).intValue());
          final Expression foldedRight = ExpressionHelper.foldConstants(_get);
          boolean _or = false;
          EList<Expression> _right_1 = rExp.getRight();
          boolean _equals = Objects.equal(_right_1, null);
          if (_equals) {
            _or = true;
          } else {
            EList<Expression> _right_2 = rExp.getRight();
            boolean _isEmpty = _right_2.isEmpty();
            _or = _isEmpty;
          }
          if (_or) {
            boolean _and = false;
            Expression _left = rExp.getLeft();
            if (!(_left instanceof NumberLiteral)) {
              _and = false;
            } else {
              _and = (foldedRight instanceof NumberLiteral);
            }
            if (_and) {
              EList<String> _op = exp.getOp();
              String _get_1 = _op.get((idx).intValue());
              Expression _left_1 = rExp.getLeft();
              NumberLiteral _foldBasicOp = ExpressionHelper.foldBasicOp(_get_1, ((NumberLiteral) _left_1), ((NumberLiteral) foldedRight));
              rExp.setLeft(_foldBasicOp);
            } else {
              EList<Expression> _right_3 = rExp.getRight();
              _right_3.add(foldedRight);
              EList<String> _op_1 = rExp.getOp();
              EList<String> _op_2 = exp.getOp();
              String _get_2 = _op_2.get((idx).intValue());
              _op_1.add(_get_2);
            }
          } else {
            EList<Expression> _right_4 = rExp.getRight();
            _right_4.add(foldedRight);
            EList<String> _op_3 = rExp.getOp();
            EList<String> _op_4 = exp.getOp();
            String _get_3 = _op_4.get((idx).intValue());
            _op_3.add(_get_3);
          }
          _xblockexpression = rExp;
        }
        return _xblockexpression;
      }
    };
    AddExp _fold = IterableExtensions.<Integer, AddExp>fold(_doubleDotLessThan, tentativeResult, _function);
    tentativeResult = _fold;
    boolean _and = false;
    EList<Expression> _right = tentativeResult.getRight();
    boolean _notEquals = (!Objects.equal(_right, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EList<Expression> _right_1 = tentativeResult.getRight();
      boolean _isEmpty = _right_1.isEmpty();
      boolean _not = (!_isEmpty);
      _and = _not;
    }
    if (_and) {
      return tentativeResult;
    } else {
      return tentativeResult.getLeft();
    }
  }
  
  protected static Expression _foldConstants(final MultExp exp) {
    MultExp tentativeResult = RigidBodiesFactory.eINSTANCE.createMultExp();
    Expression _left = exp.getLeft();
    Expression _foldConstants = ExpressionHelper.foldConstants(_left);
    tentativeResult.setLeft(_foldConstants);
    EList<String> _op = exp.getOp();
    int _size = _op.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    final Function2<MultExp, Integer, MultExp> _function = new Function2<MultExp, Integer, MultExp>() {
      @Override
      public MultExp apply(final MultExp rExp, final Integer idx) {
        MultExp _xblockexpression = null;
        {
          EList<Expression> _right = exp.getRight();
          Expression _get = _right.get((idx).intValue());
          final Expression foldedRight = ExpressionHelper.foldConstants(_get);
          boolean _or = false;
          EList<Expression> _right_1 = rExp.getRight();
          boolean _equals = Objects.equal(_right_1, null);
          if (_equals) {
            _or = true;
          } else {
            EList<Expression> _right_2 = rExp.getRight();
            boolean _isEmpty = _right_2.isEmpty();
            _or = _isEmpty;
          }
          if (_or) {
            boolean _and = false;
            Expression _left = rExp.getLeft();
            if (!(_left instanceof NumberLiteral)) {
              _and = false;
            } else {
              _and = (foldedRight instanceof NumberLiteral);
            }
            if (_and) {
              EList<String> _op = exp.getOp();
              String _get_1 = _op.get((idx).intValue());
              Expression _left_1 = rExp.getLeft();
              NumberLiteral _foldBasicOp = ExpressionHelper.foldBasicOp(_get_1, ((NumberLiteral) _left_1), ((NumberLiteral) foldedRight));
              rExp.setLeft(_foldBasicOp);
            } else {
              EList<Expression> _right_3 = rExp.getRight();
              _right_3.add(foldedRight);
              EList<String> _op_1 = rExp.getOp();
              EList<String> _op_2 = exp.getOp();
              String _get_2 = _op_2.get((idx).intValue());
              _op_1.add(_get_2);
            }
          } else {
            EList<Expression> _right_4 = rExp.getRight();
            _right_4.add(foldedRight);
            EList<String> _op_3 = rExp.getOp();
            EList<String> _op_4 = exp.getOp();
            String _get_3 = _op_4.get((idx).intValue());
            _op_3.add(_get_3);
          }
          _xblockexpression = rExp;
        }
        return _xblockexpression;
      }
    };
    MultExp _fold = IterableExtensions.<Integer, MultExp>fold(_doubleDotLessThan, tentativeResult, _function);
    tentativeResult = _fold;
    boolean _and = false;
    EList<Expression> _right = tentativeResult.getRight();
    boolean _notEquals = (!Objects.equal(_right, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EList<Expression> _right_1 = tentativeResult.getRight();
      boolean _isEmpty = _right_1.isEmpty();
      boolean _not = (!_isEmpty);
      _and = _not;
    }
    if (_and) {
      return tentativeResult;
    } else {
      return tentativeResult.getLeft();
    }
  }
  
  protected static Expression _foldConstants(final ParenthesisedExp pe) {
    Expression _exp = pe.getExp();
    final Expression foldedInner = ExpressionHelper.foldConstants(_exp);
    if ((foldedInner instanceof NumberLiteral)) {
      return foldedInner;
    } else {
      final ParenthesisedExp result = RigidBodiesFactory.eINSTANCE.createParenthesisedExp();
      result.setExp(foldedInner);
      return result;
    }
  }
  
  protected static Expression _foldConstants(final ConstantOrFunctionCallExp cofce) {
    final ConstantOrFunctionCallExp result = RigidBodiesFactory.eINSTANCE.createConstantOrFunctionCallExp();
    String _label = cofce.getLabel();
    result.setLabel(_label);
    EList<Expression> _param = result.getParam();
    EList<Expression> _param_1 = cofce.getParam();
    final Function1<Expression, Expression> _function = new Function1<Expression, Expression>() {
      @Override
      public Expression apply(final Expression p) {
        return ExpressionHelper.foldConstants(p);
      }
    };
    List<Expression> _map = ListExtensions.<Expression, Expression>map(_param_1, _function);
    _param.addAll(_map);
    return result;
  }
  
  protected static Expression _foldConstants(final NumberLiteral nl) {
    return EcoreUtil.<NumberLiteral>copy(nl);
  }
  
  private static NumberLiteral foldBasicOp(final String op, final NumberLiteral nl1, final NumberLiteral nl2) {
    final double num1 = ExpressionHelper.parse(nl1);
    final double num2 = ExpressionHelper.parse(nl2);
    switch (op) {
      case "+":
        return ExpressionHelper.unparse(Double.valueOf((num1 + num2)));
      case "-":
        return ExpressionHelper.unparse(Double.valueOf((num1 - num2)));
      case "*":
        return ExpressionHelper.unparse(Double.valueOf((num1 * num2)));
      case "/":
        return ExpressionHelper.unparse(Double.valueOf((num1 / num2)));
      default:
        throw new IllegalArgumentException(("Unknown operator " + op));
    }
  }
  
  public static double parse(final NumberLiteral nl) {
    String _value = nl.getValue();
    final double basicValue = Double.parseDouble(_value);
    boolean _isNeg = nl.isNeg();
    if (_isNeg) {
      return (-basicValue);
    } else {
      return basicValue;
    }
  }
  
  private static NumberLiteral unparse(final Double dValue) {
    final NumberLiteral result = RigidBodiesFactory.eINSTANCE.createNumberLiteral();
    result.setNeg(((dValue).doubleValue() < 0.0d));
    double _abs = Math.abs((dValue).doubleValue());
    String _string = Double.toString(_abs);
    result.setValue(_string);
    return result;
  }
  
  protected static boolean _isZero(final AddExp ae) {
    boolean _xblockexpression = false;
    {
      final Expression foldedExp = ExpressionHelper.foldConstants(ae);
      boolean _xifexpression = false;
      if ((foldedExp instanceof NumberLiteral)) {
        _xifexpression = ExpressionHelper.isZero(foldedExp);
      } else {
        _xifexpression = false;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected static boolean _isZero(final MultExp me) {
    boolean _xblockexpression = false;
    {
      final Expression foldedExp = ExpressionHelper.foldConstants(me);
      boolean _xifexpression = false;
      if ((foldedExp instanceof NumberLiteral)) {
        _xifexpression = ExpressionHelper.isZero(foldedExp);
      } else {
        _xifexpression = false;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected static boolean _isZero(final ParenthesisedExp pe) {
    Expression _exp = pe.getExp();
    return ExpressionHelper.isZero(_exp);
  }
  
  protected static boolean _isZero(final ConstantOrFunctionCallExp cofce) {
    return false;
  }
  
  protected static boolean _isZero(final NumberLiteral nl) {
    double _parse = ExpressionHelper.parse(nl);
    return (_parse == 0.0d);
  }
  
  public static Expression foldConstants(final Expression exp) {
    if (exp instanceof AddExp) {
      return _foldConstants((AddExp)exp);
    } else if (exp instanceof ConstantOrFunctionCallExp) {
      return _foldConstants((ConstantOrFunctionCallExp)exp);
    } else if (exp instanceof MultExp) {
      return _foldConstants((MultExp)exp);
    } else if (exp instanceof NumberLiteral) {
      return _foldConstants((NumberLiteral)exp);
    } else if (exp instanceof ParenthesisedExp) {
      return _foldConstants((ParenthesisedExp)exp);
    } else if (exp != null) {
      return _foldConstants(exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public static boolean isZero(final Expression ae) {
    if (ae instanceof AddExp) {
      return _isZero((AddExp)ae);
    } else if (ae instanceof ConstantOrFunctionCallExp) {
      return _isZero((ConstantOrFunctionCallExp)ae);
    } else if (ae instanceof MultExp) {
      return _isZero((MultExp)ae);
    } else if (ae instanceof NumberLiteral) {
      return _isZero((NumberLiteral)ae);
    } else if (ae instanceof ParenthesisedExp) {
      return _isZero((ParenthesisedExp)ae);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ae).toString());
    }
  }
}
