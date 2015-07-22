package uk.ac.kcl.inf.robotics.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.BasicJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.Connective;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointMovement;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeReference;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef;
import uk.ac.kcl.inf.robotics.rigidBodies.RelativeTransformation;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;

/**
 * Build up a joint tree representation of a given connective
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
          final Procedure1<Connective> _function = new Procedure1<Connective>() {
            @Override
            public void apply(final Connective j) {
              ConnectiveTreeBuilder.ConnectiveTree child = ConnectiveTreeBuilder.this.generateConnectiveTree(j, connectiveList, bodyList, idx);
              boolean _notEquals = (!Objects.equal(child, null));
              if (_notEquals) {
                nextTreeLayer.add(child);
              }
            }
          };
          IterableExtensions.<Connective>forEach(_connectiveFanOut, _function);
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
      final Procedure1<ConnectiveTreeBuilder.ConnectiveTree> _function = new Procedure1<ConnectiveTreeBuilder.ConnectiveTree>() {
        @Override
        public void apply(final ConnectiveTreeBuilder.ConnectiveTree c) {
          ConnectiveTreeBuilder.this.traverse(c, ct);
        }
      };
      IterableExtensions.<ConnectiveTreeBuilder.ConnectiveTree>forEach(ct.children, _function);
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
          String _name_7 = joint.getName();
          String _plus_5 = ("joint" + _name_7);
          RelativeTransformation _relTrans1 = joint.getRelTrans1();
          Pair<String, RelativeTransformation> _pair_7 = new Pair<String, RelativeTransformation>(_plus_5, _relTrans1);
          _xblockexpression_1 = this.jointTransformations.add(_pair_7);
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
            String _plus_5 = ("constraint joint" + _name_5);
            RelativeTransformation _relTrans1 = joint.getRelTrans1();
            Pair<String, RelativeTransformation> _pair_5 = new Pair<String, RelativeTransformation>(_plus_5, _relTrans1);
            _xblockexpression_2 = this.constraintTransformations.add(_pair_5);
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
  
  private List<JointMovement> _toStateList(final AdditiveJointType ajt) {
    final List<JointMovement> lResult = new LinkedList<JointMovement>();
    JointTypeExpression _left = ajt.getLeft();
    List<JointMovement> _stateList = this.toStateList(_left);
    lResult.addAll(_stateList);
    EList<JointTypeExpression> _right = ajt.getRight();
    final Procedure1<JointTypeExpression> _function = new Procedure1<JointTypeExpression>() {
      @Override
      public void apply(final JointTypeExpression jte) {
        List<JointMovement> _stateList = ConnectiveTreeBuilder.this.toStateList(jte);
        lResult.addAll(_stateList);
      }
    };
    IterableExtensions.<JointTypeExpression>forEach(_right, _function);
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
      final Procedure1<Integer> _function = new Procedure1<Integer>() {
        @Override
        public void apply(final Integer it) {
          ConnectiveTreeBuilder.this.allTransformations.add(null);
        }
      };
      IterableExtensions.<Integer>forEach(_doubleDotLessThan, _function);
    }
    return this.allTransformations;
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
