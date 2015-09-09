package uk.ac.kcl.inf.robotics.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseStiffnessExp;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.Connective;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointMovement;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeReference;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessExp;
import uk.ac.kcl.inf.robotics.rigidBodies.StiffnessRef;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;

/**
 * Build up a joint tree representation of a given connective. This assumes the given system to have been unrolled first using @{SystemUnroller}.
 */
@SuppressWarnings("all")
public class ConnectiveTreeBuilder {
  public static class ConnectiveTree {
    private Connective connective;
    
    private int idx;
    
    private boolean isConstraint;
    
    private List<ConnectiveTreeBuilder.ConnectiveTree> children;
    
    public ConnectiveTree(final ExternalLoad load) {
      this.connective = load;
      this.idx = (-1);
      this.isConstraint = false;
      this.children = null;
    }
    
    public ConnectiveTree(final Connective c, final int idx) {
      this(c, idx, false);
    }
    
    public ConnectiveTree(final Connective c, final int idx, final boolean treatAsConstraint) {
      this(c, idx, treatAsConstraint, null);
    }
    
    public ConnectiveTree(final Connective c, final int idx, final List<ConnectiveTreeBuilder.ConnectiveTree> children) {
      this(c, idx, false, children);
    }
    
    public ConnectiveTree(final Connective c, final int idx, final boolean treatAsConstraint, final List<ConnectiveTreeBuilder.ConnectiveTree> children) {
      this.connective = c;
      this.idx = idx;
      this.isConstraint = treatAsConstraint;
      this.children = children;
    }
    
    public Connective getConnective() {
      return this.connective;
    }
    
    public List<ConnectiveTreeBuilder.ConnectiveTree> getChildren() {
      return this.children;
    }
    
    public int getIdx() {
      return this.idx;
    }
    
    public boolean isConstraint() {
      return this.isConstraint;
    }
    
    public boolean isLoad() {
      return (this.connective instanceof ExternalLoad);
    }
    
    public boolean isJoint() {
      boolean _and = false;
      if (!(this.connective instanceof Joint)) {
        _and = false;
      } else {
        _and = (!this.isConstraint);
      }
      return _and;
    }
  }
  
  /**
   * Adapted from original xtext class, which stupidly had a package-private constructor...
   */
  public static class Triple<S1 extends Object, S2 extends Object, S3 extends Object> {
    private final S1 s1;
    
    private final S2 s2;
    
    private final S3 s3;
    
    public Triple(final S1 first, final S2 second, final S3 third) {
      this.s1 = first;
      this.s2 = second;
      this.s3 = third;
    }
    
    public S1 getFirst() {
      return this.s1;
    }
    
    public S2 getSecond() {
      return this.s2;
    }
    
    public S3 getThird() {
      return this.s3;
    }
    
    @Override
    public boolean equals(final Object other) {
      boolean _equals = Objects.equal(other, null);
      if (_equals) {
        return false;
      }
      boolean _equals_1 = Objects.equal(other, this);
      if (_equals_1) {
        return true;
      }
      if ((other instanceof ConnectiveTreeBuilder.Triple<?, ?, ?>)) {
        final ConnectiveTreeBuilder.Triple<?, ?, ?> r = ((ConnectiveTreeBuilder.Triple<?, ?, ?>) other);
        boolean _and = false;
        boolean _and_1 = false;
        boolean _xifexpression = false;
        S1 _first = this.getFirst();
        boolean _equals_2 = Objects.equal(_first, null);
        if (_equals_2) {
          Object _first_1 = r.getFirst();
          _xifexpression = Objects.equal(_first_1, null);
        } else {
          S1 _first_2 = this.getFirst();
          Object _first_3 = r.getFirst();
          _xifexpression = _first_2.equals(_first_3);
        }
        if (!_xifexpression) {
          _and_1 = false;
        } else {
          boolean _xifexpression_1 = false;
          S2 _second = this.getSecond();
          boolean _equals_3 = Objects.equal(_second, null);
          if (_equals_3) {
            Object _second_1 = r.getSecond();
            _xifexpression_1 = Objects.equal(_second_1, null);
          } else {
            S2 _second_2 = this.getSecond();
            Object _second_3 = r.getSecond();
            _xifexpression_1 = _second_2.equals(_second_3);
          }
          _and_1 = _xifexpression_1;
        }
        if (!_and_1) {
          _and = false;
        } else {
          boolean _xifexpression_2 = false;
          S3 _third = this.getThird();
          boolean _equals_4 = Objects.equal(_third, null);
          if (_equals_4) {
            Object _third_1 = r.getThird();
            _xifexpression_2 = Objects.equal(_third_1, null);
          } else {
            S3 _third_2 = this.getThird();
            Object _third_3 = r.getThird();
            _xifexpression_2 = _third_2.equals(_third_3);
          }
          _and = _xifexpression_2;
        }
        return _and;
      }
      return false;
    }
    
    @Override
    public int hashCode() {
      int _xifexpression = (int) 0;
      S1 _first = this.getFirst();
      boolean _equals = Objects.equal(_first, null);
      if (_equals) {
        _xifexpression = 0;
      } else {
        S1 _first_1 = this.getFirst();
        _xifexpression = _first_1.hashCode();
      }
      int _multiply = (3 * _xifexpression);
      int _xifexpression_1 = (int) 0;
      S2 _second = this.getSecond();
      boolean _equals_1 = Objects.equal(_second, null);
      if (_equals_1) {
        _xifexpression_1 = 0;
      } else {
        S2 _second_1 = this.getSecond();
        _xifexpression_1 = _second_1.hashCode();
      }
      int _multiply_1 = (11 * _xifexpression_1);
      int _plus = (_multiply + _multiply_1);
      int _xifexpression_2 = (int) 0;
      S3 _third = this.getThird();
      boolean _equals_2 = Objects.equal(_third, null);
      if (_equals_2) {
        _xifexpression_2 = 0;
      } else {
        S3 _third_1 = this.getThird();
        _xifexpression_2 = _third_1.hashCode();
      }
      int _multiply_2 = (17 * _xifexpression_2);
      return (_plus + _multiply_2);
    }
    
    @Override
    public String toString() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Triple(");
      S1 _first = this.getFirst();
      _builder.append(_first, "");
      _builder.append(", ");
      S2 _second = this.getSecond();
      _builder.append(_second, "");
      _builder.append(", ");
      S3 _third = this.getThird();
      _builder.append(_third, "");
      _builder.append(")");
      return _builder.toString();
    }
  }
  
  private uk.ac.kcl.inf.robotics.rigidBodies.System system;
  
  private ConnectiveTreeBuilder.ConnectiveTree ctRoot;
  
  private List<Pair<String, Expression>> massValues = new LinkedList<Pair<String, Expression>>();
  
  private List<Pair<String, BaseMatrix>> inertias = new LinkedList<Pair<String, BaseMatrix>>();
  
  private List<Pair<String, BaseMatrix>> positions = new LinkedList<Pair<String, BaseMatrix>>();
  
  private List<Pair<Integer, Pair<String, Integer>>> lcCodeColumns = new LinkedList<Pair<Integer, Pair<String, Integer>>>();
  
  private List<Pair<String, BaseMatrix>> constraintPositions = new LinkedList<Pair<String, BaseMatrix>>();
  
  private List<Pair<Integer, Pair<String, Integer>>> constraintLcCodeColumns = new LinkedList<Pair<Integer, Pair<String, Integer>>>();
  
  private List<Pair<String, BaseMatrix>> loadPositions = new LinkedList<Pair<String, BaseMatrix>>();
  
  private List<Pair<Integer, Pair<String, Integer>>> loadLcCodeColumns = new LinkedList<Pair<Integer, Pair<String, Integer>>>();
  
  private List<Pair<String, List<JointMovement>>> jointStates = new LinkedList<Pair<String, List<JointMovement>>>();
  
  private List<Pair<String, List<JointMovement>>> constraintStates = new LinkedList<Pair<String, List<JointMovement>>>();
  
  private List<Pair<String, List<JointMovement>>> loadStates = new LinkedList<Pair<String, List<JointMovement>>>();
  
  private List<Pair<String, RelativeTransformation>> jointTransformations = new LinkedList<Pair<String, RelativeTransformation>>();
  
  private List<Pair<String, RelativeTransformation>> constraintTransformations = new LinkedList<Pair<String, RelativeTransformation>>();
  
  private List<Pair<Joint, List<BaseStiffnessExp>>> jointStiffnesses = new LinkedList<Pair<Joint, List<BaseStiffnessExp>>>();
  
  private List<Pair<String, List<BaseStiffnessExp>>> constraintStiffnesses = new LinkedList<Pair<String, List<BaseStiffnessExp>>>();
  
  public ConnectiveTreeBuilder(final uk.ac.kcl.inf.robotics.rigidBodies.System s) {
    this.system = s;
    Joint _startJoint = this.getStartJoint();
    LinkedList<Connective> _linkedList = new LinkedList<Connective>();
    LinkedList<Body> _linkedList_1 = new LinkedList<Body>();
    ConnectiveTreeBuilder.ConnectiveTree _generateConnectiveTree = this.generateConnectiveTree(_startJoint, _linkedList, _linkedList_1, new int[] { 0 });
    this.ctRoot = _generateConnectiveTree;
    this.traverseTree();
  }
  
  private ConnectiveTreeBuilder.ConnectiveTree generateConnectiveTree(final Connective start, final List<Connective> connectiveList, final List<Body> bodyList, final int[] idx) {
    if ((start instanceof Joint)) {
      final Joint curJoint = ((Joint) start);
      boolean _contains = connectiveList.contains(curJoint);
      if (_contains) {
        int _get = idx[0];
        int _plus = (_get + 1);
        idx[0] = _plus;
        int _get_1 = idx[0];
        return new ConnectiveTreeBuilder.ConnectiveTree(curJoint, _get_1);
      } else {
        boolean _or = false;
        BodyReference _body2 = curJoint.getBody2();
        boolean _isBase = _body2.isBase();
        if (_isBase) {
          _or = true;
        } else {
          BodyReference _body2_1 = curJoint.getBody2();
          Body _ref = _body2_1.getRef();
          boolean _contains_1 = bodyList.contains(_ref);
          _or = _contains_1;
        }
        if (_or) {
          return new ConnectiveTreeBuilder.ConnectiveTree(curJoint, (-1), true);
        } else {
          final ArrayList<ConnectiveTreeBuilder.ConnectiveTree> nextTreeLayer = new ArrayList<ConnectiveTreeBuilder.ConnectiveTree>();
          connectiveList.add(curJoint);
          BodyReference _body2_2 = curJoint.getBody2();
          Body _ref_1 = _body2_2.getRef();
          bodyList.add(_ref_1);
          int _get_2 = idx[0];
          int _plus_1 = (_get_2 + 1);
          idx[0] = _plus_1;
          int index = idx[0];
          BodyReference _body2_3 = curJoint.getBody2();
          Body _ref_2 = _body2_3.getRef();
          Iterable<Connective> _connectiveFanOut = this.getConnectiveFanOut(_ref_2);
          final Consumer<Connective> _function = new Consumer<Connective>() {
            @Override
            public void accept(final Connective j) {
              ConnectiveTreeBuilder.ConnectiveTree child = ConnectiveTreeBuilder.this.generateConnectiveTree(j, connectiveList, bodyList, idx);
              boolean _notEquals = (!Objects.equal(child, null));
              if (_notEquals) {
                nextTreeLayer.add(child);
              }
            }
          };
          _connectiveFanOut.forEach(_function);
          return new ConnectiveTreeBuilder.ConnectiveTree(start, index, nextTreeLayer);
        }
      }
    } else {
      if ((start instanceof ExternalLoad)) {
        return new ConnectiveTreeBuilder.ConnectiveTree(((ExternalLoad) start));
      }
    }
    return null;
  }
  
  private Joint getStartJoint() {
    EList<SystemElement> _elements = this.system.getElements();
    Iterable<Joint> _filter = Iterables.<Joint>filter(_elements, Joint.class);
    final Function1<Joint, Boolean> _function = new Function1<Joint, Boolean>() {
      @Override
      public Boolean apply(final Joint j) {
        BodyReference _body1 = j.getBody1();
        return Boolean.valueOf(_body1.isBase());
      }
    };
    return IterableExtensions.<Joint>findFirst(_filter, _function);
  }
  
  /**
   * Find all Connectives that connect from the given body in the given system.
   */
  private Iterable<Connective> getConnectiveFanOut(final Body b) {
    EList<SystemElement> _elements = this.system.getElements();
    Iterable<Connective> _filter = Iterables.<Connective>filter(_elements, Connective.class);
    final Function1<Connective, Boolean> _function = new Function1<Connective, Boolean>() {
      @Override
      public Boolean apply(final Connective j) {
        BodyReference _body1 = j.getBody1();
        Body _ref = _body1.getRef();
        return Boolean.valueOf(Objects.equal(_ref, b));
      }
    };
    return IterableExtensions.<Connective>filter(_filter, _function);
  }
  
  private void traverseTree() {
    this.traverse(this.ctRoot, null);
  }
  
  private void traverse(final ConnectiveTreeBuilder.ConnectiveTree ct, final ConnectiveTreeBuilder.ConnectiveTree parent) {
    this.visit(ct, parent);
    boolean _notEquals = (!Objects.equal(ct.children, null));
    if (_notEquals) {
      final Consumer<ConnectiveTreeBuilder.ConnectiveTree> _function = new Consumer<ConnectiveTreeBuilder.ConnectiveTree>() {
        @Override
        public void accept(final ConnectiveTreeBuilder.ConnectiveTree c) {
          ConnectiveTreeBuilder.this.traverse(c, ct);
        }
      };
      ct.children.forEach(_function);
    }
  }
  
  private boolean visit(final ConnectiveTreeBuilder.ConnectiveTree ct, final ConnectiveTreeBuilder.ConnectiveTree parent) {
    boolean _xblockexpression = false;
    {
      Pair<String, Integer> parentDesc = null;
      boolean _notEquals = (!Objects.equal(parent, null));
      if (_notEquals) {
        String _name = ct.connective.getName();
        String _plus = (_name + " relative to ");
        String _name_1 = parent.connective.getName();
        String _plus_1 = (_plus + _name_1);
        Pair<String, Integer> _pair = new Pair<String, Integer>(_plus_1, Integer.valueOf(parent.idx));
        parentDesc = _pair;
      } else {
        String _name_2 = ct.connective.getName();
        String _plus_2 = (_name_2 + " relative to base");
        Pair<String, Integer> _pair_1 = new Pair<String, Integer>(_plus_2, Integer.valueOf(0));
        parentDesc = _pair_1;
      }
      boolean _xifexpression = false;
      boolean _isJoint = ct.isJoint();
      if (_isJoint) {
        boolean _xblockexpression_1 = false;
        {
          final Joint joint = ((Joint) ct.connective);
          BodyReference _body2 = joint.getBody2();
          final Body bTgt = _body2.getRef();
          final Mass mTgt = bTgt.getMass();
          String _name_3 = bTgt.getName();
          Expression _value = mTgt.getValue();
          Pair<String, Expression> _pair_2 = new Pair<String, Expression>(_name_3, _value);
          this.massValues.add(_pair_2);
          String _name_4 = bTgt.getName();
          Matrix _inertia = mTgt.getInertia();
          BaseMatrix _matrix = this.getMatrix(_inertia);
          Pair<String, BaseMatrix> _pair_3 = new Pair<String, BaseMatrix>(_name_4, _matrix);
          this.inertias.add(_pair_3);
          String _name_5 = bTgt.getName();
          String _plus_3 = ("body " + _name_5);
          Matrix _position = mTgt.getPosition();
          BaseMatrix _matrix_1 = this.getMatrix(_position);
          Pair<String, BaseMatrix> _pair_4 = new Pair<String, BaseMatrix>(_plus_3, _matrix_1);
          this.positions.add(_pair_4);
          Pair<Integer, Pair<String, Integer>> _pair_5 = new Pair<Integer, Pair<String, Integer>>(Integer.valueOf(0), parentDesc);
          this.lcCodeColumns.add(_pair_5);
          String _name_6 = joint.getName();
          String _plus_4 = ("joint " + _name_6);
          JointType _type = joint.getType();
          JointTypeExpression _exp = _type.getExp();
          List<JointMovement> _stateList = this.toStateList(_exp);
          Pair<String, List<JointMovement>> _pair_6 = new Pair<String, List<JointMovement>>(_plus_4, _stateList);
          this.jointStates.add(_pair_6);
          JointType _type_1 = joint.getType();
          JointTypeExpression _exp_1 = _type_1.getExp();
          List<BaseStiffnessExp> _stiffnessList = this.toStiffnessList(_exp_1);
          Pair<Joint, List<BaseStiffnessExp>> _pair_7 = new Pair<Joint, List<BaseStiffnessExp>>(joint, _stiffnessList);
          this.jointStiffnesses.add(_pair_7);
          String _name_7 = joint.getName();
          String _plus_5 = ("joint" + _name_7);
          RelativeTransformation _relTrans1 = joint.getRelTrans1();
          Pair<String, RelativeTransformation> _pair_8 = new Pair<String, RelativeTransformation>(_plus_5, _relTrans1);
          _xblockexpression_1 = this.jointTransformations.add(_pair_8);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        boolean _xifexpression_1 = false;
        if (ct.isConstraint) {
          boolean _xblockexpression_2 = false;
          {
            final Joint joint = ((Joint) ct.connective);
            BodyReference _body1 = joint.getBody1();
            final Body bTgt = _body1.getRef();
            final Mass mTgt = bTgt.getMass();
            String _name_3 = bTgt.getName();
            String _plus_3 = ("body " + _name_3);
            Matrix _position = mTgt.getPosition();
            BaseMatrix _matrix = this.getMatrix(_position);
            Pair<String, BaseMatrix> _pair_2 = new Pair<String, BaseMatrix>(_plus_3, _matrix);
            this.constraintPositions.add(_pair_2);
            Pair<Integer, Pair<String, Integer>> _pair_3 = new Pair<Integer, Pair<String, Integer>>(Integer.valueOf(1), parentDesc);
            this.constraintLcCodeColumns.add(_pair_3);
            String _name_4 = joint.getName();
            String _plus_4 = ("constraint joint " + _name_4);
            JointType _type = joint.getType();
            JointTypeExpression _exp = _type.getExp();
            List<JointMovement> _stateList = this.toStateList(_exp);
            Pair<String, List<JointMovement>> _pair_4 = new Pair<String, List<JointMovement>>(_plus_4, _stateList);
            this.constraintStates.add(_pair_4);
            String _name_5 = joint.getName();
            String _plus_5 = ("constraint joint " + _name_5);
            JointType _type_1 = joint.getType();
            JointTypeExpression _exp_1 = _type_1.getExp();
            List<BaseStiffnessExp> _stiffnessList = this.toStiffnessList(_exp_1);
            Pair<String, List<BaseStiffnessExp>> _pair_5 = new Pair<String, List<BaseStiffnessExp>>(_plus_5, _stiffnessList);
            this.constraintStiffnesses.add(_pair_5);
            String _name_6 = joint.getName();
            String _plus_6 = ("constraint joint" + _name_6);
            RelativeTransformation _relTrans1 = joint.getRelTrans1();
            Pair<String, RelativeTransformation> _pair_6 = new Pair<String, RelativeTransformation>(_plus_6, _relTrans1);
            _xblockexpression_2 = this.constraintTransformations.add(_pair_6);
          }
          _xifexpression_1 = _xblockexpression_2;
        } else {
          boolean _xblockexpression_3 = false;
          {
            final ExternalLoad load = ((ExternalLoad) ct.connective);
            String _name_3 = load.getName();
            String _plus_3 = ("load " + _name_3);
            Matrix _position = load.getPosition();
            BaseMatrix _matrix = this.getMatrix(_position);
            Pair<String, BaseMatrix> _pair_2 = new Pair<String, BaseMatrix>(_plus_3, _matrix);
            this.loadPositions.add(_pair_2);
            Pair<Integer, Pair<String, Integer>> _pair_3 = new Pair<Integer, Pair<String, Integer>>(Integer.valueOf(2), parentDesc);
            this.loadLcCodeColumns.add(_pair_3);
            String _name_4 = load.getName();
            String _plus_4 = ("load " + _name_4);
            Pair<String, List<JointMovement>> _pair_4 = new Pair<String, List<JointMovement>>(_plus_4, null);
            _xblockexpression_3 = this.loadStates.add(_pair_4);
          }
          _xifexpression_1 = _xblockexpression_3;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private List<BaseStiffnessExp> _toStiffnessList(final AdditiveJointType ajt) {
    final List<BaseStiffnessExp> lResult = new LinkedList<BaseStiffnessExp>();
    JointTypeExpression _left = ajt.getLeft();
    List<BaseStiffnessExp> _stiffnessList = this.toStiffnessList(_left);
    lResult.addAll(_stiffnessList);
    EList<JointTypeExpression> _right = ajt.getRight();
    final Consumer<JointTypeExpression> _function = new Consumer<JointTypeExpression>() {
      @Override
      public void accept(final JointTypeExpression jte) {
        List<BaseStiffnessExp> _stiffnessList = ConnectiveTreeBuilder.this.toStiffnessList(jte);
        lResult.addAll(_stiffnessList);
      }
    };
    _right.forEach(_function);
    return lResult;
  }
  
  private List<BaseStiffnessExp> _toStiffnessList(final JointTypeReference jtr) {
    final List<BaseStiffnessExp> lResult = new LinkedList<BaseStiffnessExp>();
    JointType _ref = jtr.getRef();
    JointTypeExpression _exp = _ref.getExp();
    List<BaseStiffnessExp> _stiffnessList = this.toStiffnessList(_exp);
    lResult.addAll(_stiffnessList);
    return lResult;
  }
  
  private List<BaseStiffnessExp> _toStiffnessList(final BasicJointType bjt) {
    final List<BaseStiffnessExp> lResult = new LinkedList<BaseStiffnessExp>();
    StiffnessExp _stiffness = bjt.getStiffness();
    BaseStiffnessExp _resolve = this.resolve(_stiffness);
    lResult.add(_resolve);
    return lResult;
  }
  
  private BaseStiffnessExp _resolve(final StiffnessRef sr) {
    BaseStiffnessExp _ref = sr.getRef();
    return this.resolve(_ref);
  }
  
  private BaseStiffnessExp _resolve(final BaseStiffnessExp bse) {
    return bse;
  }
  
  private List<JointMovement> _toStateList(final AdditiveJointType ajt) {
    final List<JointMovement> lResult = new LinkedList<JointMovement>();
    JointTypeExpression _left = ajt.getLeft();
    List<JointMovement> _stateList = this.toStateList(_left);
    lResult.addAll(_stateList);
    EList<JointTypeExpression> _right = ajt.getRight();
    final Consumer<JointTypeExpression> _function = new Consumer<JointTypeExpression>() {
      @Override
      public void accept(final JointTypeExpression jte) {
        List<JointMovement> _stateList = ConnectiveTreeBuilder.this.toStateList(jte);
        lResult.addAll(_stateList);
      }
    };
    _right.forEach(_function);
    return lResult;
  }
  
  private List<JointMovement> _toStateList(final JointTypeReference jtr) {
    final List<JointMovement> lResult = new LinkedList<JointMovement>();
    JointType _ref = jtr.getRef();
    JointTypeExpression _exp = _ref.getExp();
    List<JointMovement> _stateList = this.toStateList(_exp);
    lResult.addAll(_stateList);
    return lResult;
  }
  
  private List<JointMovement> _toStateList(final BasicJointType bjt) {
    final List<JointMovement> lResult = new LinkedList<JointMovement>();
    JointMovement _type = bjt.getType();
    lResult.add(_type);
    return lResult;
  }
  
  private BaseMatrix _getMatrix(final BaseMatrix m) {
    return m;
  }
  
  private BaseMatrix _getMatrix(final MatrixRef mr) {
    return mr.getMatrix();
  }
  
  public ConnectiveTreeBuilder.ConnectiveTree getTree() {
    return this.ctRoot;
  }
  
  public List<Pair<String, Expression>> getMasses() {
    return this.massValues;
  }
  
  public List<Pair<String, BaseMatrix>> getInertias() {
    return this.inertias;
  }
  
  public List<Pair<String, BaseMatrix>> getPositions() {
    return this.positions;
  }
  
  public List<Pair<Integer, Pair<String, Integer>>> getLcCodeColumns() {
    return this.lcCodeColumns;
  }
  
  public List<Pair<String, BaseMatrix>> getConstraintPositions() {
    return this.constraintPositions;
  }
  
  public List<Pair<Integer, Pair<String, Integer>>> getConstraintLcCodeColumns() {
    return this.constraintLcCodeColumns;
  }
  
  public List<Pair<String, BaseMatrix>> getLoadPositions() {
    return this.loadPositions;
  }
  
  public List<Pair<Integer, Pair<String, Integer>>> getLoadLcCodeColumns() {
    return this.loadLcCodeColumns;
  }
  
  private List<Pair<String, List<JointMovement>>> allStates = null;
  
  public List<Pair<String, List<JointMovement>>> getStates() {
    boolean _equals = Objects.equal(this.allStates, null);
    if (_equals) {
      LinkedList<Pair<String, List<JointMovement>>> _linkedList = new LinkedList<Pair<String, List<JointMovement>>>(this.jointStates);
      this.allStates = _linkedList;
      this.allStates.addAll(this.constraintStates);
      this.allStates.addAll(this.loadStates);
    }
    return this.allStates;
  }
  
  private List<Pair<String, RelativeTransformation>> allTransformations = null;
  
  public List<Pair<String, RelativeTransformation>> getJointTransformations() {
    boolean _equals = Objects.equal(this.allTransformations, null);
    if (_equals) {
      LinkedList<Pair<String, RelativeTransformation>> _linkedList = new LinkedList<Pair<String, RelativeTransformation>>(this.jointTransformations);
      this.allTransformations = _linkedList;
      this.allTransformations.addAll(this.constraintTransformations);
      List<Pair<String, List<JointMovement>>> _states = this.getStates();
      int _size = _states.size();
      int _size_1 = this.allTransformations.size();
      int _minus = (_size - _size_1);
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _minus, true);
      final Consumer<Integer> _function = new Consumer<Integer>() {
        @Override
        public void accept(final Integer it) {
          ConnectiveTreeBuilder.this.allTransformations.add(null);
        }
      };
      _doubleDotLessThan.forEach(_function);
    }
    return this.allTransformations;
  }
  
  private List<ConnectiveTreeBuilder.Triple<String, List<BaseStiffnessExp>, Joint>> allStiffnesses = null;
  
  public List<ConnectiveTreeBuilder.Triple<String, List<BaseStiffnessExp>, Joint>> getStiffnesses() {
    boolean _equals = Objects.equal(this.allStiffnesses, null);
    if (_equals) {
      final Map<Joint, Joint> syncConstraints = this.getSyncConstraints();
      LinkedList<ConnectiveTreeBuilder.Triple<String, List<BaseStiffnessExp>, Joint>> _linkedList = new LinkedList<ConnectiveTreeBuilder.Triple<String, List<BaseStiffnessExp>, Joint>>();
      this.allStiffnesses = _linkedList;
      final Consumer<Pair<Joint, List<BaseStiffnessExp>>> _function = new Consumer<Pair<Joint, List<BaseStiffnessExp>>>() {
        @Override
        public void accept(final Pair<Joint, List<BaseStiffnessExp>> js) {
          Joint _key = js.getKey();
          String _name = _key.getName();
          String _plus = ("joint " + _name);
          List<BaseStiffnessExp> _value = js.getValue();
          Joint _key_1 = js.getKey();
          Joint _get = syncConstraints.get(_key_1);
          ConnectiveTreeBuilder.Triple<String, List<BaseStiffnessExp>, Joint> _triple = new ConnectiveTreeBuilder.Triple<String, List<BaseStiffnessExp>, Joint>(_plus, _value, _get);
          ConnectiveTreeBuilder.this.allStiffnesses.add(_triple);
        }
      };
      this.jointStiffnesses.forEach(_function);
      final Consumer<Pair<String, List<BaseStiffnessExp>>> _function_1 = new Consumer<Pair<String, List<BaseStiffnessExp>>>() {
        @Override
        public void accept(final Pair<String, List<BaseStiffnessExp>> cs) {
          String _key = cs.getKey();
          List<BaseStiffnessExp> _value = cs.getValue();
          ConnectiveTreeBuilder.Triple<String, List<BaseStiffnessExp>, Joint> _triple = new ConnectiveTreeBuilder.Triple<String, List<BaseStiffnessExp>, Joint>(_key, _value, null);
          ConnectiveTreeBuilder.this.allStiffnesses.add(_triple);
        }
      };
      this.constraintStiffnesses.forEach(_function_1);
    }
    return this.allStiffnesses;
  }
  
  private HashMap<Joint, Joint> getSyncConstraints() {
    EList<SystemElement> _elements = this.system.getElements();
    Iterable<JointConstraint> _filter = Iterables.<JointConstraint>filter(_elements, JointConstraint.class);
    HashMap<Joint, Joint> _hashMap = new HashMap<Joint, Joint>();
    final Function2<HashMap<Joint, Joint>, JointConstraint, HashMap<Joint, Joint>> _function = new Function2<HashMap<Joint, Joint>, JointConstraint, HashMap<Joint, Joint>>() {
      @Override
      public HashMap<Joint, Joint> apply(final HashMap<Joint, Joint> mp, final JointConstraint jc) {
        Joint _joint1 = jc.getJoint1();
        Joint _joint2 = jc.getJoint2();
        mp.put(_joint1, _joint2);
        return mp;
      }
    };
    return IterableExtensions.<JointConstraint, HashMap<Joint, Joint>>fold(_filter, _hashMap, _function);
  }
  
  /**
   * Traverse the connective tree to find the index of the given joint
   */
  public int findIndexFor(final Joint j) {
    return this.findIndexFor(this.ctRoot, j);
  }
  
  public int findIndexFor(final ConnectiveTreeBuilder.ConnectiveTree ct, final Joint j) {
    Integer _xifexpression = null;
    boolean _equals = Objects.equal(ct.connective, j);
    if (_equals) {
      _xifexpression = Integer.valueOf(ct.idx);
    } else {
      final Function2<Integer, ConnectiveTreeBuilder.ConnectiveTree, Integer> _function = new Function2<Integer, ConnectiveTreeBuilder.ConnectiveTree, Integer>() {
        @Override
        public Integer apply(final Integer acc, final ConnectiveTreeBuilder.ConnectiveTree ch) {
          Integer _xifexpression = null;
          if (((acc).intValue() == (-1))) {
            _xifexpression = Integer.valueOf(ConnectiveTreeBuilder.this.findIndexFor(ch, j));
          } else {
            _xifexpression = acc;
          }
          return _xifexpression;
        }
      };
      _xifexpression = IterableExtensions.<ConnectiveTreeBuilder.ConnectiveTree, Integer>fold(ct.children, Integer.valueOf((-1)), _function);
    }
    return (_xifexpression).intValue();
  }
  
  private List<BaseStiffnessExp> toStiffnessList(final JointTypeExpression ajt) {
    if (ajt instanceof AdditiveJointType) {
      return _toStiffnessList((AdditiveJointType)ajt);
    } else if (ajt instanceof BasicJointType) {
      return _toStiffnessList((BasicJointType)ajt);
    } else if (ajt instanceof JointTypeReference) {
      return _toStiffnessList((JointTypeReference)ajt);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ajt).toString());
    }
  }
  
  private BaseStiffnessExp resolve(final StiffnessExp bse) {
    if (bse instanceof BaseStiffnessExp) {
      return _resolve((BaseStiffnessExp)bse);
    } else if (bse instanceof StiffnessRef) {
      return _resolve((StiffnessRef)bse);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bse).toString());
    }
  }
  
  private List<JointMovement> toStateList(final JointTypeExpression ajt) {
    if (ajt instanceof AdditiveJointType) {
      return _toStateList((AdditiveJointType)ajt);
    } else if (ajt instanceof BasicJointType) {
      return _toStateList((BasicJointType)ajt);
    } else if (ajt instanceof JointTypeReference) {
      return _toStateList((JointTypeReference)ajt);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ajt).toString());
    }
  }
  
  private BaseMatrix getMatrix(final Matrix m) {
    if (m instanceof BaseMatrix) {
      return _getMatrix((BaseMatrix)m);
    } else if (m instanceof MatrixRef) {
      return _getMatrix((MatrixRef)m);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(m).toString());
    }
  }
}
