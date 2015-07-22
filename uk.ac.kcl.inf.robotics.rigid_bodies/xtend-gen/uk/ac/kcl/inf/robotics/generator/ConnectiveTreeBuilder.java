package uk.ac.kcl.inf.robotics.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.Connective;
import uk.ac.kcl.inf.robotics.rigidBodies.Expression;
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.Matrix;
import uk.ac.kcl.inf.robotics.rigidBodies.MatrixRef;
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
          Iterable<Joint> _jointFanOut = this.getJointFanOut(_ref_2);
          final Procedure1<Joint> _function = new Procedure1<Joint>() {
            @Override
            public void apply(final Joint j) {
              ConnectiveTreeBuilder.ConnectiveTree child = ConnectiveTreeBuilder.this.generateConnectiveTree(j, connectiveList, bodyList, idx);
              boolean _notEquals = (!Objects.equal(child, null));
              if (_notEquals) {
                nextTreeLayer.add(child);
              }
            }
          };
          IterableExtensions.<Joint>forEach(_jointFanOut, _function);
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
   * Find all Joints that connect from the given body in the given system.
   */
  private Iterable<Joint> getJointFanOut(final Body b) {
    EList<SystemElement> _elements = this.system.getElements();
    Iterable<Joint> _filter = Iterables.<Joint>filter(_elements, Joint.class);
    final Function1<Joint, Boolean> _function = new Function1<Joint, Boolean>() {
      @Override
      public Boolean apply(final Joint j) {
        BodyReference _body1 = j.getBody1();
        Body _ref = _body1.getRef();
        return Boolean.valueOf(Objects.equal(_ref, b));
      }
    };
    return IterableExtensions.<Joint>filter(_filter, _function);
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
  
  private Boolean visit(final ConnectiveTreeBuilder.ConnectiveTree ct, final ConnectiveTreeBuilder.ConnectiveTree parent) {
    Boolean _xifexpression = null;
    boolean _isJoint = ct.isJoint();
    if (_isJoint) {
      boolean _xblockexpression = false;
      {
        BodyReference _body2 = ((Joint) ct.connective).getBody2();
        final Body bTgt = _body2.getRef();
        final Mass mTgt = bTgt.getMass();
        String _name = bTgt.getName();
        Expression _value = mTgt.getValue();
        Pair<String, Expression> _pair = new Pair<String, Expression>(_name, _value);
        this.massValues.add(_pair);
        String _name_1 = bTgt.getName();
        Matrix _inertia = mTgt.getInertia();
        BaseMatrix _matrix = this.getMatrix(_inertia);
        Pair<String, BaseMatrix> _pair_1 = new Pair<String, BaseMatrix>(_name_1, _matrix);
        this.inertias.add(_pair_1);
        String _name_2 = bTgt.getName();
        String _plus = ("body " + _name_2);
        Matrix _position = mTgt.getPosition();
        BaseMatrix _matrix_1 = this.getMatrix(_position);
        Pair<String, BaseMatrix> _pair_2 = new Pair<String, BaseMatrix>(_plus, _matrix_1);
        this.positions.add(_pair_2);
        Pair<String, Integer> parentDesc = null;
        boolean _notEquals = (!Objects.equal(parent, null));
        if (_notEquals) {
          String _name_3 = ct.connective.getName();
          String _plus_1 = (_name_3 + " relative to ");
          String _name_4 = parent.connective.getName();
          String _plus_2 = (_plus_1 + _name_4);
          Pair<String, Integer> _pair_3 = new Pair<String, Integer>(_plus_2, Integer.valueOf(parent.idx));
          parentDesc = _pair_3;
        } else {
          String _name_5 = ct.connective.getName();
          String _plus_3 = (_name_5 + " relative to base");
          Pair<String, Integer> _pair_4 = new Pair<String, Integer>(_plus_3, Integer.valueOf(0));
          parentDesc = _pair_4;
        }
        Pair<Integer, Pair<String, Integer>> _pair_5 = new Pair<Integer, Pair<String, Integer>>(Integer.valueOf(0), parentDesc);
        _xblockexpression = this.lcCodeColumns.add(_pair_5);
      }
      _xifexpression = Boolean.valueOf(_xblockexpression);
    } else {
      Boolean _xifexpression_1 = null;
      if (ct.isConstraint) {
        boolean _xblockexpression_1 = false;
        {
          BodyReference _body1 = ((Joint) ct.connective).getBody1();
          final Body bTgt = _body1.getRef();
          final Mass mTgt = bTgt.getMass();
          String _name = bTgt.getName();
          String _plus = ("body " + _name);
          Matrix _position = mTgt.getPosition();
          BaseMatrix _matrix = this.getMatrix(_position);
          Pair<String, BaseMatrix> _pair = new Pair<String, BaseMatrix>(_plus, _matrix);
          this.constraintPositions.add(_pair);
          Pair<String, Integer> parentDesc = null;
          boolean _notEquals = (!Objects.equal(parent, null));
          if (_notEquals) {
            String _name_1 = ct.connective.getName();
            String _plus_1 = (_name_1 + " relative to ");
            String _name_2 = parent.connective.getName();
            String _plus_2 = (_plus_1 + _name_2);
            Pair<String, Integer> _pair_1 = new Pair<String, Integer>(_plus_2, Integer.valueOf(parent.idx));
            parentDesc = _pair_1;
          } else {
            String _name_3 = ct.connective.getName();
            String _plus_3 = (_name_3 + " relative to base");
            Pair<String, Integer> _pair_2 = new Pair<String, Integer>(_plus_3, Integer.valueOf(0));
            parentDesc = _pair_2;
          }
          Pair<Integer, Pair<String, Integer>> _pair_3 = new Pair<Integer, Pair<String, Integer>>(Integer.valueOf(0), parentDesc);
          _xblockexpression_1 = this.constraintLcCodeColumns.add(_pair_3);
        }
        _xifexpression_1 = Boolean.valueOf(_xblockexpression_1);
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
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
