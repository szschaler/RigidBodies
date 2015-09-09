package uk.ac.kcl.inf.robotics.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.robotics.rigidBodies.Body;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyReference;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition;
import uk.ac.kcl.inf.robotics.rigidBodies.Constraint;
import uk.ac.kcl.inf.robotics.rigidBodies.ExternalLoad;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointConstraint;
import uk.ac.kcl.inf.robotics.rigidBodies.Mass;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesFactory;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;

/**
 * Unroll's any repeat statements in the system and resolves new and last references as it goes along
 */
@SuppressWarnings("all")
public class SystemUnroller {
  private uk.ac.kcl.inf.robotics.rigidBodies.System system;
  
  public SystemUnroller(final uk.ac.kcl.inf.robotics.rigidBodies.System system) {
    this.system = system;
    this.unroll();
  }
  
  /**
   * The actual unrolling process. At the end of this, the system no longer contains any body repetitions or references to new or last bodies.
   */
  private void unroll() {
    final Map<String, Body> currentLasts = new HashMap<String, Body>();
    EList<SystemElement> _elements = this.system.getElements();
    Iterable<BodyRepetition> _filter = Iterables.<BodyRepetition>filter(_elements, BodyRepetition.class);
    List<BodyRepetition> _list = IterableExtensions.<BodyRepetition>toList(_filter);
    final Consumer<BodyRepetition> _function = new Consumer<BodyRepetition>() {
      @Override
      public void accept(final BodyRepetition br) {
        Body _body = br.getBody();
        String _name = _body.getName();
        boolean _containsKey = currentLasts.containsKey(_name);
        boolean _not = (!_containsKey);
        if (_not) {
          Body _body_1 = br.getBody();
          String _name_1 = _body_1.getName();
          Body _body_2 = br.getBody();
          currentLasts.put(_name_1, _body_2);
        }
        int _number = br.getNumber();
        IntegerRange _upTo = new IntegerRange(1, _number);
        final Consumer<Integer> _function = new Consumer<Integer>() {
          @Override
          public void accept(final Integer idx) {
            Body _body = br.getBody();
            final Body newBody = SystemUnroller.this.duplicateBody(_body, (idx).intValue());
            EList<SystemElement> _connectionExp = br.getConnectionExp();
            final Consumer<SystemElement> _function = new Consumer<SystemElement>() {
              @Override
              public void accept(final SystemElement e) {
                EList<SystemElement> _elements = SystemUnroller.this.system.getElements();
                Body _body = br.getBody();
                String _name = _body.getName();
                Body _get = currentLasts.get(_name);
                SystemElement _duplicate = SystemUnroller.this.duplicate(e, (idx).intValue(), newBody, _get);
                _elements.add(_duplicate);
              }
            };
            _connectionExp.forEach(_function);
            Body _body_1 = br.getBody();
            String _name = _body_1.getName();
            currentLasts.put(_name, newBody);
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
        SystemUnroller.this.resolveExplicitLastReferences(e, currentLasts);
      }
    };
    _elements_1.forEach(_function_1);
  }
  
  private Body duplicateBody(final Body b, final int idx) {
    final Body bodyDuplicate = RigidBodiesFactory.eINSTANCE.createBody();
    String _name = b.getName();
    String _plus = (_name + Integer.valueOf(idx));
    bodyDuplicate.setName(_plus);
    Mass _mass = b.getMass();
    Mass _copy = EcoreUtil.<Mass>copy(_mass);
    bodyDuplicate.setMass(_copy);
    return bodyDuplicate;
  }
  
  /**
   * These dispatch methods duplicate the given element of a repetition, adjust its name based on the given idx and adjust
   * and (implicit) last or new references based on the two bodies given.
   */
  private SystemElement _duplicate(final Joint j, final int idx, final Body newBody, final Body lastBody) {
    final Joint jointDuplicate = EcoreUtil.<Joint>copy(j);
    String _name = j.getName();
    String _plus = (_name + Integer.valueOf(idx));
    jointDuplicate.setName(_plus);
    BodyReference _body1 = jointDuplicate.getBody1();
    this.adjustImplicitReferences(_body1, newBody, lastBody);
    BodyReference _body2 = jointDuplicate.getBody2();
    this.adjustImplicitReferences(_body2, newBody, lastBody);
    return jointDuplicate;
  }
  
  private SystemElement _duplicate(final Constraint c, final int idx, final Body newBody, final Body lastBody) {
    final Constraint constraintDuplicate = EcoreUtil.<Constraint>copy(c);
    String _name = c.getName();
    String _plus = (_name + Integer.valueOf(idx));
    constraintDuplicate.setName(_plus);
    BodyReference _body1 = constraintDuplicate.getBody1();
    this.adjustImplicitReferences(_body1, newBody, lastBody);
    BodyReference _body2 = constraintDuplicate.getBody2();
    this.adjustImplicitReferences(_body2, newBody, lastBody);
    return constraintDuplicate;
  }
  
  private SystemElement _duplicate(final ExternalLoad el, final int idx, final Body newBody, final Body lastBody) {
    final ExternalLoad loadDuplicate = EcoreUtil.<ExternalLoad>copy(el);
    String _name = el.getName();
    String _plus = (_name + Integer.valueOf(idx));
    loadDuplicate.setName(_plus);
    BodyReference _body1 = loadDuplicate.getBody1();
    this.adjustImplicitReferences(_body1, newBody, lastBody);
    return loadDuplicate;
  }
  
  private SystemElement _duplicate(final JointConstraint jc, final int idx, final Body newBody, final Body lastBody) {
    final JointConstraint jcDuplicate = EcoreUtil.<JointConstraint>copy(jc);
    String _name = jc.getName();
    String _plus = (_name + Integer.valueOf(idx));
    jcDuplicate.setName(_plus);
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
  
  private void _resolveExplicitLastReferences(final SystemElement se, final Map<String, Body> currentLasts) {
  }
  
  private void _resolveExplicitLastReferences(final Joint j, final Map<String, Body> currentLasts) {
    BodyReference _body1 = j.getBody1();
    this.resolveExplicitLastReferences(_body1, currentLasts);
    BodyReference _body2 = j.getBody2();
    this.resolveExplicitLastReferences(_body2, currentLasts);
  }
  
  private void _resolveExplicitLastReferences(final Constraint c, final Map<String, Body> currentLasts) {
    BodyReference _body1 = c.getBody1();
    this.resolveExplicitLastReferences(_body1, currentLasts);
    BodyReference _body2 = c.getBody2();
    this.resolveExplicitLastReferences(_body2, currentLasts);
  }
  
  private void _resolveExplicitLastReferences(final ExternalLoad el, final Map<String, Body> currentLasts) {
    BodyReference _body1 = el.getBody1();
    this.resolveExplicitLastReferences(_body1, currentLasts);
  }
  
  private void _resolveExplicitLastReferences(final BodyReference br, final Map<String, Body> currentLasts) {
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
      Body _get = currentLasts.get(_name);
      br.setRef(_get);
      Body _ref_2 = br.getRef();
      boolean _equals = Objects.equal(_ref_2, null);
      if (_equals) {
        throw new IllegalStateException("Created null body reference!");
      }
    }
  }
  
  public uk.ac.kcl.inf.robotics.rigidBodies.System getUnrolledSystem() {
    return this.system;
  }
  
  private SystemElement duplicate(final SystemElement c, final int idx, final Body newBody, final Body lastBody) {
    if (c instanceof Constraint) {
      return _duplicate((Constraint)c, idx, newBody, lastBody);
    } else if (c instanceof ExternalLoad) {
      return _duplicate((ExternalLoad)c, idx, newBody, lastBody);
    } else if (c instanceof Joint) {
      return _duplicate((Joint)c, idx, newBody, lastBody);
    } else if (c instanceof JointConstraint) {
      return _duplicate((JointConstraint)c, idx, newBody, lastBody);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c, idx, newBody, lastBody).toString());
    }
  }
  
  private void resolveExplicitLastReferences(final EObject c, final Map<String, Body> currentLasts) {
    if (c instanceof Constraint) {
      _resolveExplicitLastReferences((Constraint)c, currentLasts);
      return;
    } else if (c instanceof ExternalLoad) {
      _resolveExplicitLastReferences((ExternalLoad)c, currentLasts);
      return;
    } else if (c instanceof Joint) {
      _resolveExplicitLastReferences((Joint)c, currentLasts);
      return;
    } else if (c instanceof BodyReference) {
      _resolveExplicitLastReferences((BodyReference)c, currentLasts);
      return;
    } else if (c instanceof SystemElement) {
      _resolveExplicitLastReferences((SystemElement)c, currentLasts);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c, currentLasts).toString());
    }
  }
}
