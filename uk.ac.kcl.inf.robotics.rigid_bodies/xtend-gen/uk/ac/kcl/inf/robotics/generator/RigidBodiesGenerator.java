/**
 * generated by Xtext
 */
package uk.ac.kcl.inf.robotics.generator;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import uk.ac.kcl.inf.robotics.generator.ConnectiveTreeBuilder;
import uk.ac.kcl.inf.robotics.rigidBodies.AddExp;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.ConstantOrFunctionCallExp;
import uk.ac.kcl.inf.robotics.rigidBodies.Environment;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef;
import uk.ac.kcl.inf.robotics.rigidBodies.Model;
import uk.ac.kcl.inf.robotics.rigidBodies.MultExp;
import uk.ac.kcl.inf.robotics.rigidBodies.NumberLiteral;
import uk.ac.kcl.inf.robotics.rigidBodies.ParenthesisedExp;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RigidBodiesGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Model> _filter = Iterators.<Model>filter(_allContents, Model.class);
    final Model model = IteratorExtensions.<Model>head(_filter);
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterator<uk.ac.kcl.inf.robotics.rigidBodies.System> _filter_1 = Iterators.<uk.ac.kcl.inf.robotics.rigidBodies.System>filter(_allContents_1, uk.ac.kcl.inf.robotics.rigidBodies.System.class);
    final Procedure1<uk.ac.kcl.inf.robotics.rigidBodies.System> _function = new Procedure1<uk.ac.kcl.inf.robotics.rigidBodies.System>() {
      @Override
      public void apply(final uk.ac.kcl.inf.robotics.rigidBodies.System s) {
        StringConcatenation _builder = new StringConcatenation();
        String _name = s.getName();
        _builder.append(_name, "");
        _builder.append(".m");
        Environment _world = model.getWorld();
        ConnectiveTreeBuilder _connectiveTreeBuilder = new ConnectiveTreeBuilder(s);
        CharSequence _generate = RigidBodiesGenerator.this.generate(_world, _connectiveTreeBuilder);
        fsa.generateFile(_builder.toString(), _generate);
      }
    };
    IteratorExtensions.<uk.ac.kcl.inf.robotics.rigidBodies.System>forEach(_filter_1, _function);
  }
  
  public CharSequence generate(final Environment world, final ConnectiveTreeBuilder ctb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("% EOM Simulation:");
    _builder.newLine();
    _builder.append("clc");
    _builder.newLine();
    _builder.append("clear all");
    _builder.newLine();
    _builder.append("close all");
    _builder.newLine();
    _builder.newLine();
    _builder.append("% Gravity vector");
    _builder.newLine();
    _builder.append("g = [");
    Matrix _gravity = world.getGravity();
    CharSequence _renderValues = this.renderValues(_gravity, ", ");
    _builder.append(_renderValues, "");
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("% Inputs");
    _builder.newLine();
    _builder.newLine();
    _builder.append("% Locations");
    _builder.newLine();
    _builder.append("lc = [");
    _builder.newLine();
    _builder.append("\t");
    List<Pair<String, BaseMatrix>> _positions = ctb.getPositions();
    int _size = _positions.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    final Function1<Integer, CharSequence> _function = new Function1<Integer, CharSequence>() {
      @Override
      public CharSequence apply(final Integer i) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("% Position data from ");
        List<Pair<String, BaseMatrix>> _positions = ctb.getPositions();
        Pair<String, BaseMatrix> _get = _positions.get((i).intValue());
        String _key = _get.getKey();
        _builder.append(_key, "");
        _builder.append(" for a joint ");
        List<Pair<Integer, Pair<String, Integer>>> _lcCodeColumns = ctb.getLcCodeColumns();
        Pair<Integer, Pair<String, Integer>> _get_1 = _lcCodeColumns.get((i).intValue());
        Pair<String, Integer> _value = _get_1.getValue();
        String _key_1 = _value.getKey();
        _builder.append(_key_1, "");
        _builder.newLineIfNotEmpty();
        List<Pair<String, BaseMatrix>> _positions_1 = ctb.getPositions();
        Pair<String, BaseMatrix> _get_2 = _positions_1.get((i).intValue());
        BaseMatrix _value_1 = _get_2.getValue();
        CharSequence _renderValues = RigidBodiesGenerator.this.renderValues(_value_1, " ");
        _builder.append(_renderValues, "");
        _builder.append(" ");
        List<Pair<Integer, Pair<String, Integer>>> _lcCodeColumns_1 = ctb.getLcCodeColumns();
        Pair<Integer, Pair<String, Integer>> _get_3 = _lcCodeColumns_1.get((i).intValue());
        Integer _key_2 = _get_3.getKey();
        _builder.append(_key_2, "");
        _builder.append(" ");
        List<Pair<Integer, Pair<String, Integer>>> _lcCodeColumns_2 = ctb.getLcCodeColumns();
        Pair<Integer, Pair<String, Integer>> _get_4 = _lcCodeColumns_2.get((i).intValue());
        Pair<String, Integer> _value_2 = _get_4.getValue();
        Integer _value_3 = _value_2.getValue();
        _builder.append(_value_3, "");
        return _builder.toString();
      }
    };
    String _join = IterableExtensions.<Integer>join(_doubleDotLessThan, ";\n", _function);
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<Pair<String, BaseMatrix>> _constraintPositions = ctb.getConstraintPositions();
    int _size_1 = _constraintPositions.size();
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
    final Function1<Integer, CharSequence> _function_1 = new Function1<Integer, CharSequence>() {
      @Override
      public CharSequence apply(final Integer i) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("% Position data from ");
        List<Pair<String, BaseMatrix>> _constraintPositions = ctb.getConstraintPositions();
        Pair<String, BaseMatrix> _get = _constraintPositions.get((i).intValue());
        String _key = _get.getKey();
        _builder.append(_key, "");
        _builder.append(" for a constraint ");
        List<Pair<Integer, Pair<String, Integer>>> _constraintLcCodeColumns = ctb.getConstraintLcCodeColumns();
        Pair<Integer, Pair<String, Integer>> _get_1 = _constraintLcCodeColumns.get((i).intValue());
        Pair<String, Integer> _value = _get_1.getValue();
        String _key_1 = _value.getKey();
        _builder.append(_key_1, "");
        _builder.newLineIfNotEmpty();
        _builder.append("% TODO: Check with Hadi that we\'re using the correct position data here.");
        _builder.newLine();
        List<Pair<String, BaseMatrix>> _constraintPositions_1 = ctb.getConstraintPositions();
        Pair<String, BaseMatrix> _get_2 = _constraintPositions_1.get((i).intValue());
        BaseMatrix _value_1 = _get_2.getValue();
        CharSequence _renderValues = RigidBodiesGenerator.this.renderValues(_value_1, " ");
        _builder.append(_renderValues, "");
        _builder.append(" ");
        List<Pair<Integer, Pair<String, Integer>>> _constraintLcCodeColumns_1 = ctb.getConstraintLcCodeColumns();
        Pair<Integer, Pair<String, Integer>> _get_3 = _constraintLcCodeColumns_1.get((i).intValue());
        Integer _key_2 = _get_3.getKey();
        _builder.append(_key_2, "");
        _builder.append(" ");
        List<Pair<Integer, Pair<String, Integer>>> _constraintLcCodeColumns_2 = ctb.getConstraintLcCodeColumns();
        Pair<Integer, Pair<String, Integer>> _get_4 = _constraintLcCodeColumns_2.get((i).intValue());
        Pair<String, Integer> _value_2 = _get_4.getValue();
        Integer _value_3 = _value_2.getValue();
        _builder.append(_value_3, "");
        return _builder.toString();
      }
    };
    String _join_1 = IterableExtensions.<Integer>join(_doubleDotLessThan_1, ";\n", _function_1);
    _builder.append(_join_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<Pair<String, BaseMatrix>> _loadPositions = ctb.getLoadPositions();
    int _size_2 = _loadPositions.size();
    ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _size_2, true);
    final Function1<Integer, CharSequence> _function_2 = new Function1<Integer, CharSequence>() {
      @Override
      public CharSequence apply(final Integer i) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("% Position data from ");
        List<Pair<String, BaseMatrix>> _loadPositions = ctb.getLoadPositions();
        Pair<String, BaseMatrix> _get = _loadPositions.get((i).intValue());
        String _key = _get.getKey();
        _builder.append(_key, "");
        _builder.append(" for a load ");
        List<Pair<Integer, Pair<String, Integer>>> _loadLcCodeColumns = ctb.getLoadLcCodeColumns();
        Pair<Integer, Pair<String, Integer>> _get_1 = _loadLcCodeColumns.get((i).intValue());
        Pair<String, Integer> _value = _get_1.getValue();
        String _key_1 = _value.getKey();
        _builder.append(_key_1, "");
        _builder.newLineIfNotEmpty();
        List<Pair<String, BaseMatrix>> _loadPositions_1 = ctb.getLoadPositions();
        Pair<String, BaseMatrix> _get_2 = _loadPositions_1.get((i).intValue());
        BaseMatrix _value_1 = _get_2.getValue();
        CharSequence _renderValues = RigidBodiesGenerator.this.renderValues(_value_1, " ");
        _builder.append(_renderValues, "");
        _builder.append(" ");
        List<Pair<Integer, Pair<String, Integer>>> _loadLcCodeColumns_1 = ctb.getLoadLcCodeColumns();
        Pair<Integer, Pair<String, Integer>> _get_3 = _loadLcCodeColumns_1.get((i).intValue());
        Integer _key_2 = _get_3.getKey();
        _builder.append(_key_2, "");
        _builder.append(" ");
        List<Pair<Integer, Pair<String, Integer>>> _loadLcCodeColumns_2 = ctb.getLoadLcCodeColumns();
        Pair<Integer, Pair<String, Integer>> _get_4 = _loadLcCodeColumns_2.get((i).intValue());
        Pair<String, Integer> _value_2 = _get_4.getValue();
        Integer _value_3 = _value_2.getValue();
        _builder.append(_value_3, "");
        return _builder.toString();
      }
    };
    String _join_2 = IterableExtensions.<Integer>join(_doubleDotLessThan_2, ";\n", _function_2);
    _builder.append(_join_2, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("];");
    _builder.newLine();
    _builder.newLine();
    _builder.append("% Mass values");
    _builder.newLine();
    _builder.append("m = [");
    _builder.newLine();
    _builder.append("\t");
    List<Pair<String, Expression>> _masses = ctb.getMasses();
    final Function1<Pair<String, Expression>, CharSequence> _function_3 = new Function1<Pair<String, Expression>, CharSequence>() {
      @Override
      public CharSequence apply(final Pair<String, Expression> m) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("% ");
        String _key = m.getKey();
        _builder.append(_key, "");
        _builder.newLineIfNotEmpty();
        Expression _value = m.getValue();
        CharSequence _render = RigidBodiesGenerator.this.render(_value);
        _builder.append(_render, "");
        return _builder.toString();
      }
    };
    String _join_3 = IterableExtensions.<Pair<String, Expression>>join(_masses, ",\n", _function_3);
    _builder.append(_join_3, "\t");
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("% Inertia values");
    _builder.newLine();
    _builder.append("I = sym (zeros (3, 3, ");
    List<Pair<String, BaseMatrix>> _inertias = ctb.getInertias();
    int _size_3 = _inertias.size();
    _builder.append(_size_3, "");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    List<Pair<String, BaseMatrix>> _inertias_1 = ctb.getInertias();
    int _size_4 = _inertias_1.size();
    ExclusiveRange _doubleDotLessThan_3 = new ExclusiveRange(0, _size_4, true);
    final Function1<Integer, CharSequence> _function_4 = new Function1<Integer, CharSequence>() {
      @Override
      public CharSequence apply(final Integer idx) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("% Inertia for body ");
        List<Pair<String, BaseMatrix>> _inertias = ctb.getInertias();
        Pair<String, BaseMatrix> _get = _inertias.get((idx).intValue());
        String _key = _get.getKey();
        _builder.append(_key, "");
        _builder.newLineIfNotEmpty();
        _builder.append("I (:, :, ");
        _builder.append(idx, "");
        _builder.append(") = [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        List<Pair<String, BaseMatrix>> _inertias_1 = ctb.getInertias();
        Pair<String, BaseMatrix> _get_1 = _inertias_1.get((idx).intValue());
        BaseMatrix _value = _get_1.getValue();
        CharSequence _renderValues = RigidBodiesGenerator.this.renderValues(_value, Integer.valueOf(3));
        _builder.append(_renderValues, "\t");
        _builder.append("];");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      }
    };
    String _join_4 = IterableExtensions.<Integer>join(_doubleDotLessThan_3, "\n", _function_4);
    _builder.append(_join_4, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("% Run program -- Should this really be generated?");
    _builder.newLine();
    _builder.newLine();
    _builder.append("% EOM:");
    _builder.newLine();
    _builder.append("[ M , T , Dd , fg , fj , rj , rc , vc , wc , ref , rcn ,  Tef , Tcn , Dcn , qf , uf ] = ...");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TMTEoM ( lc , m , I , j , jkd , g );");
    _builder.newLine();
    _builder.newLine();
    _builder.append("% numerical simulation");
    _builder.newLine();
    _builder.append("[ t , z , tfinal ] = SimEoM ( M , T , Dd , fg , fj , qf , uf , 1 );");
    _builder.newLine();
    _builder.append("plot ( t , z );");
    _builder.newLine();
    _builder.append("pause;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("% animation");
    _builder.newLine();
    _builder.append("AnimEOM ( t , z , rj , qf , uf );");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _renderValues(final MatrixRef mr, final CharSequence sep) {
    BaseMatrix _matrix = mr.getMatrix();
    return this.renderValues(_matrix, sep);
  }
  
  protected CharSequence _renderValues(final BaseMatrix bm, final CharSequence sep) {
    EList<Expression> _values = bm.getValues();
    final Function1<Expression, CharSequence> _function = new Function1<Expression, CharSequence>() {
      @Override
      public CharSequence apply(final Expression v) {
        return RigidBodiesGenerator.this.render(v);
      }
    };
    return IterableExtensions.<Expression>join(_values, sep, _function);
  }
  
  protected CharSequence _renderValues(final BaseMatrix bm, final int rowLength) {
    EList<Expression> _values = bm.getValues();
    int _size = _values.size();
    int _divide = (_size / rowLength);
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _divide, true);
    final Function1<Integer, CharSequence> _function = new Function1<Integer, CharSequence>() {
      @Override
      public CharSequence apply(final Integer y) {
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, rowLength, true);
        final Function1<Integer, CharSequence> _function = new Function1<Integer, CharSequence>() {
          @Override
          public CharSequence apply(final Integer x) {
            EList<Expression> _values = bm.getValues();
            Expression _get = _values.get((((y).intValue() * rowLength) + (x).intValue()));
            return RigidBodiesGenerator.this.render(_get);
          }
        };
        return IterableExtensions.<Integer>join(_doubleDotLessThan, " ", _function);
      }
    };
    return IterableExtensions.<Integer>join(_doubleDotLessThan, ";\n", _function);
  }
  
  protected CharSequence _render(final AddExp e) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = e.getLeft();
    CharSequence _render = this.render(_left);
    _builder.append(_render, "");
    _builder.append(" ");
    EList<String> _op = e.getOp();
    int _size = _op.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    final Function1<Integer, CharSequence> _function = new Function1<Integer, CharSequence>() {
      @Override
      public CharSequence apply(final Integer idx) {
        StringConcatenation _builder = new StringConcatenation();
        EList<String> _op = e.getOp();
        String _get = _op.get((idx).intValue());
        _builder.append(_get, "");
        _builder.append(" ");
        EList<Expression> _right = e.getRight();
        Expression _get_1 = _right.get((idx).intValue());
        CharSequence _render = RigidBodiesGenerator.this.render(_get_1);
        _builder.append(_render, "");
        return _builder.toString();
      }
    };
    String _join = IterableExtensions.<Integer>join(_doubleDotLessThan, " ", _function);
    _builder.append(_join, "");
    return _builder;
  }
  
  protected CharSequence _render(final MultExp e) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = e.getLeft();
    CharSequence _render = this.render(_left);
    _builder.append(_render, "");
    _builder.append(" ");
    EList<String> _op = e.getOp();
    int _size = _op.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    final Function1<Integer, CharSequence> _function = new Function1<Integer, CharSequence>() {
      @Override
      public CharSequence apply(final Integer idx) {
        StringConcatenation _builder = new StringConcatenation();
        EList<String> _op = e.getOp();
        String _get = _op.get((idx).intValue());
        _builder.append(_get, "");
        _builder.append(" ");
        EList<Expression> _right = e.getRight();
        Expression _get_1 = _right.get((idx).intValue());
        CharSequence _render = RigidBodiesGenerator.this.render(_get_1);
        _builder.append(_render, "");
        return _builder.toString();
      }
    };
    String _join = IterableExtensions.<Integer>join(_doubleDotLessThan, " ", _function);
    _builder.append(_join, "");
    return _builder;
  }
  
  protected CharSequence _render(final ParenthesisedExp pe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _exp = pe.getExp();
    CharSequence _render = this.render(_exp);
    _builder.append(_render, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _render(final NumberLiteral literal) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _xifexpression = null;
    boolean _isNeg = literal.isNeg();
    if (_isNeg) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("-");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression, "");
    String _value = literal.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected CharSequence _render(final ConstantOrFunctionCallExp cofce) {
    StringConcatenation _builder = new StringConcatenation();
    String _label = cofce.getLabel();
    _builder.append(_label, "");
    _builder.append(" ");
    CharSequence _xifexpression = null;
    EList<Expression> _param = cofce.getParam();
    int _size = _param.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("(");
      EList<Expression> _param_1 = cofce.getParam();
      final Function1<Expression, CharSequence> _function = new Function1<Expression, CharSequence>() {
        @Override
        public CharSequence apply(final Expression p) {
          return RigidBodiesGenerator.this.render(p);
        }
      };
      String _join = IterableExtensions.<Expression>join(_param_1, ", ", _function);
      _builder_1.append(_join, "");
      _builder_1.append(")");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  public CharSequence renderValues(final Matrix bm, final Object rowLength) {
    if (bm instanceof BaseMatrix
         && rowLength instanceof Integer) {
      return _renderValues((BaseMatrix)bm, (Integer)rowLength);
    } else if (bm instanceof BaseMatrix
         && rowLength instanceof CharSequence) {
      return _renderValues((BaseMatrix)bm, (CharSequence)rowLength);
    } else if (bm instanceof MatrixRef
         && rowLength instanceof CharSequence) {
      return _renderValues((MatrixRef)bm, (CharSequence)rowLength);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bm, rowLength).toString());
    }
  }
  
  public CharSequence render(final Expression e) {
    if (e instanceof AddExp) {
      return _render((AddExp)e);
    } else if (e instanceof ConstantOrFunctionCallExp) {
      return _render((ConstantOrFunctionCallExp)e);
    } else if (e instanceof MultExp) {
      return _render((MultExp)e);
    } else if (e instanceof NumberLiteral) {
      return _render((NumberLiteral)e);
    } else if (e instanceof ParenthesisedExp) {
      return _render((ParenthesisedExp)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
