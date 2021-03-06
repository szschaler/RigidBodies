package uk.ac.kcl.inf.robotics.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition;
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint;
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;

/**
 * Unroll's any repeat statements in the system and resolves new and last references as it goes along. Also resolves indexed references.
 */
@SuppressWarnings("all")
public class SystemUnroller {
  private uk.ac.kcl.inf.robotics.rigidBodies.System system;
  
  public SystemUnroller(final uk.ac.kcl.inf.robotics.rigidBodies.System system) {
    this.system = system;
    this.unroll();
  }
  
  /**
   * The actual unrolling process. At the end of this, the system no longer contains any body repetitions or references to new or last bodies or indexed references.
   */
  private void unroll() {
    final Map<String, List<Body>> duplicatedBodies = new HashMap<String, List<Body>>();
    EList<SystemElement> _elements = this.system.getElements();
    Iterable<BodyRepetition> _filter = Iterables.<BodyRepetition>filter(_elements, BodyRepetition.class);
    List<BodyRepetition> _list = IterableExtensions.<BodyRepetition>toList(_filter);
    final Consumer<BodyRepetition> _function = new Consumer<BodyRepetition>() {
      @Override
      public void accept(final BodyRepetition br) {
        Body _body = br.getBody();
        String _name = _body.getName();
        boolean _containsKey = duplicatedBodies.containsKey(_name);
        boolean _not = (!_containsKey);
        if (_not) {
          final List<Body> l = new ArrayList<Body>();
          Body _body_1 = br.getBody();
          l.add(_body_1);
          Body _body_2 = br.getBody();
          String _name_1 = _body_2.getName();
          duplicatedBodies.put(_name_1, l);
        }
        int _number = br.getNumber();
        IntegerRange _upTo = new IntegerRange(1, _number);
        final Consumer<Integer> _function = new Consumer<Integer>() {
          @Override
          public void accept(final Integer idx) {
            final EcoreUtil.Copier copier = new EcoreUtil.Copier();
            Body _body = br.getBody();
            final Body newBody = SystemUnroller.this.duplicateBody(_body, (idx).intValue(), copier);
            EList<SystemElement> _connectionExp = br.getConnectionExp();
            final Consumer<SystemElement> _function = new Consumer<SystemElement>() {
              @Override
              public void accept(final SystemElement e) {
                EList<SystemElement> _elements = SystemUnroller.this.system.getElements();
                Body _body = br.getBody();
                String _name = _body.getName();
                List<Body> _get = duplicatedBodies.get(_name);
                Body _last = IterableExtensions.<Body>last(_get);
                SystemElement _duplicate = SystemUnroller.this.duplicate(e, (idx).intValue(), newBody, _last, copier);
                _elements.add(_duplicate);
              }
            };
            _connectionExp.forEach(_function);
            copier.copyReferences();
            Body _body_1 = br.getBody();
            String _name = _body_1.getName();
            List<Body> _get = duplicatedBodies.get(_name);
            _get.add(newBody);
          }
        };
        _upTo.forEach(_function);
        EList<SystemElement> _elements = SystemUnroller.this.system.getElements();
        _elements.remove(br);
      }
    };
    _list.forEach(_function);
    EList<SystemElement> _elements_1 = this.system.getElements();
    final Consumer<SystemElement> _function_1 = new Consumer<SystemElement>() {
      @Override
      public void accept(final SystemElement e) {
        SystemUnroller.this.resolveExplicitLastAndIndexedReferences(e, duplicatedBodies);
      }
    };
    _elements_1.forEach(_function_1);
  }
  
  private Body duplicateBody(final Body b, final int idx, final EcoreUtil.Copier copier) {
    EObject _copy = copier.copy(b);
    final Body bodyDuplicate = ((Body) _copy);
    String _name = b.getName();
    String _makeUnique = this.makeUnique(_name, idx);
    bodyDuplicate.setName(_makeUnique);
    return bodyDuplicate;
  }
  
  /**
   * These dispatch methods duplicate the given element of a repetition, adjust its name based on the given idx and adjust
   * and (implicit) last or new references based on the two bodies given.
   */
  private SystemElement _duplicate(final Joint j, final int idx, final Body newBody, final Body lastBody, final EcoreUtil.Copier copier) {
    EObject _copy = copier.copy(j);
    final Joint jointDuplicate = ((Joint) _copy);
    String _name = j.getName();
    String _makeUnique = this.makeUnique(_name, idx);
    jointDuplicate.setName(_makeUnique);
    BodyReference _body1 = jointDuplicate.getBody1();
    this.adjustImplicitReferences(_body1, newBody, lastBody);
    BodyReference _body2 = jointDuplicate.getBody2();
    this.adjustImplicitReferences(_body2, newBody, lastBody);
    return jointDuplicate;
  }
  
  private SystemElement _duplicate(final Constraint c, final int idx, final Body newBody, final Body lastBody, final EcoreUtil.Copier copier) {
    EObject _copy = copier.copy(c);
    final Constraint constraintDuplicate = ((Constraint) _copy);
    String _name = c.getName();
    String _makeUnique = this.makeUnique(_name, idx);
    constraintDuplicate.setName(_makeUnique);
    BodyReference _body1 = constraintDuplicate.getBody1();
    this.adjustImplicitReferences(_body1, newBody, lastBody);
    BodyReference _body2 = constraintDuplicate.getBody2();
    this.adjustImplicitReferences(_body2, newBody, lastBody);
    return constraintDuplicate;
  }
  
  private SystemElement _duplicate(final ExternalLoad el, final int idx, final Body newBody, final Body lastBody, final EcoreUtil.Copier copier) {
    EObject _copy = copier.copy(el);
    final ExternalLoad loadDuplicate = ((ExternalLoad) _copy);
    String _name = el.getName();
    String _makeUnique = this.makeUnique(_name, idx);
    loadDuplicate.setName(_makeUnique);
    BodyReference _body1 = loadDuplicate.getBody1();
    this.adjustImplicitReferences(_body1, newBody, lastBody);
    return loadDuplicate;
  }
  
  private SystemElement _duplicate(final JointConstraint jc, final int idx, final Body newBody, final Body lastBody, final EcoreUtil.Copier copier) {
    EObject _copy = copier.copy(jc);
    final JointConstraint jcDuplicate = ((JointConstraint) _copy);
    String _name = jc.getName();
    String _makeUnique = this.makeUnique(_name, idx);
    jcDuplicate.setName(_makeUnique);
    return jcDuplicate;
  }
  
  private void adjustImplicitReferences(final BodyReference br, final Body newBody, final Body lastBody) {
    boolean _isNew = br.isNew();
    if (_isNew) {
      br.setNew(false);
      br.setRef(newBody);
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
      if (_and) {
        br.setLast(false);
        br.setRef(lastBody);
      }
    }
  }
  
  private void _resolveExplicitLastAndIndexedReferences(final SystemElement se, final Map<String, List<Body>> duplicatedBodies) {
  }
  
  private void _resolveExplicitLastAndIndexedReferences(final Joint j, final Map<String, List<Body>> duplicatedBodies) {
    BodyReference _body1 = j.getBody1();
    this.resolveExplicitLastAndIndexedReferences(_body1, duplicatedBodies);
    BodyReference _body2 = j.getBody2();
    this.resolveExplicitLastAndIndexedReferences(_body2, duplicatedBodies);
  }
  
  private void _resolveExplicitLastAndIndexedReferences(final Constraint c, final Map<String, List<Body>> duplicatedBodies) {
    BodyReference _body1 = c.getBody1();
    this.resolveExplicitLastAndIndexedReferences(_body1, duplicatedBodies);
    BodyReference _body2 = c.getBody2();
    this.resolveExplicitLastAndIndexedReferences(_body2, duplicatedBodies);
  }
  
  private void _resolveExplicitLastAndIndexedReferences(final ExternalLoad el, final Map<String, List<Body>> duplicatedBodies) {
    BodyReference _body1 = el.getBody1();
    this.resolveExplicitLastAndIndexedReferences(_body1, duplicatedBodies);
  }
  
  private void _resolveExplicitLastAndIndexedReferences(final BodyReference br, final Map<String, List<Body>> duplicatedBodies) {
    boolean _and = false;
    boolean _isLast = br.isLast();
    if (!_isLast) {
      _and = false;
    } else {
      Body _ref = br.getRef();
      boolean _notEquals = (!Objects.equal(_ref, null));
      _and = _notEquals;
    }
    if (_and) {
      br.setLast(false);
      Body _ref_1 = br.getRef();
      String _name = _ref_1.getName();
      List<Body> _get = duplicatedBodies.get(_name);
      Body _last = IterableExtensions.<Body>last(_get);
      br.setRef(_last);
      Body _ref_2 = br.getRef();
      boolean _equals = Objects.equal(_ref_2, null);
      if (_equals) {
        throw new IllegalStateException("Created null body reference!");
      }
    } else {
      boolean _and_1 = false;
      boolean _and_2 = false;
      boolean _and_3 = false;
      boolean _isLast_1 = br.isLast();
      boolean _not = (!_isLast_1);
      if (!_not) {
        _and_3 = false;
      } else {
        boolean _isNew = br.isNew();
        boolean _not_1 = (!_isNew);
        _and_3 = _not_1;
      }
      if (!_and_3) {
        _and_2 = false;
      } else {
        boolean _isBase = br.isBase();
        boolean _not_2 = (!_isBase);
        _and_2 = _not_2;
      }
      if (!_and_2) {
        _and_1 = false;
      } else {
        int _idx = br.getIdx();
        boolean _greaterThan = (_idx > 0);
        _and_1 = _greaterThan;
      }
      if (_and_1) {
        Body _ref_3 = br.getRef();
        String _name_1 = _ref_3.getName();
        List<Body> _get_1 = duplicatedBodies.get(_name_1);
        int _idx_1 = br.getIdx();
        Body _get_2 = _get_1.get(_idx_1);
        br.setRef(_get_2);
        br.setIdx(0);
      }
    }
  }
  
  private String makeUnique(final String name, final int idx) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(name, "");
    _builder.append("_");
    _builder.append(idx, "");
    return _builder.toString();
  }
  
  public uk.ac.kcl.inf.robotics.rigidBodies.System getUnrolledSystem() {
    return this.system;
  }
  
  private SystemElement duplicate(final SystemElement c, final int idx, final Body newBody, final Body lastBody, final EcoreUtil.Copier copier) {
    if (c instanceof Constraint) {
      return _duplicate((Constraint)c, idx, newBody, lastBody, copier);
    } else if (c instanceof ExternalLoad) {
      return _duplicate((ExternalLoad)c, idx, newBody, lastBody, copier);
    } else if (c instanceof Joint) {
      return _duplicate((Joint)c, idx, newBody, lastBody, copier);
    } else if (c instanceof JointConstraint) {
      return _duplicate((JointConstraint)c, idx, newBody, lastBody, copier);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c, idx, newBody, lastBody, copier).toString());
    }
  }
  
  private void resolveExplicitLastAndIndexedReferences(final EObject c, final Map<String, List<Body>> duplicatedBodies) {
    if (c instanceof Constraint) {
      _resolveExplicitLastAndIndexedReferences((Constraint)c, duplicatedBodies);
      return;
    } else if (c instanceof ExternalLoad) {
      _resolveExplicitLastAndIndexedReferences((ExternalLoad)c, duplicatedBodies);
      return;
    } else if (c instanceof Joint) {
      _resolveExplicitLastAndIndexedReferences((Joint)c, duplicatedBodies);
      return;
    } else if (c instanceof BodyReference) {
      _resolveExplicitLastAndIndexedReferences((BodyReference)c, duplicatedBodies);
      return;
    } else if (c instanceof SystemElement) {
      _resolveExplicitLastAndIndexedReferences((SystemElement)c, duplicatedBodies);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c, duplicatedBodies).toString());
    }
  }
}
