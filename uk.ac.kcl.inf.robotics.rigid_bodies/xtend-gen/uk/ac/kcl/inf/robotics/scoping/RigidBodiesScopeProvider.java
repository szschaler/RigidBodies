/**
 * generated by Xtext
 */
package uk.ac.kcl.inf.robotics.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.robotics.rigidBodies.BaseMatrix;
import uk.ac.kcl.inf.robotics.rigidBodies.BodyRepetition;
import uk.ac.kcl.inf.robotics.rigidBodies.ConfigurationStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.Reorientation;
import uk.ac.kcl.inf.robotics.rigidBodies.RigidBodiesPackage;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemElement;
import uk.ac.kcl.inf.robotics.rigidBodies.SystemInstantiation;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class RigidBodiesScopeProvider extends AbstractDeclarativeScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    Class<? extends EObject> class_ = null;
    boolean _equals = Objects.equal(reference, RigidBodiesPackage.Literals.MATRIX_REF__MATRIX);
    if (_equals) {
      class_ = BaseMatrix.class;
    } else {
      boolean _equals_1 = Objects.equal(reference, RigidBodiesPackage.Literals.JOINT_TYPE_REFERENCE__REF);
      if (_equals_1) {
        class_ = JointType.class;
      } else {
        boolean _equals_2 = Objects.equal(reference, RigidBodiesPackage.Literals.REORIENT_REF__REF);
        if (_equals_2) {
          class_ = Reorientation.class;
        }
      }
    }
    boolean _notEquals = (!Objects.equal(class_, null));
    if (_notEquals) {
      EObject rootElement = EcoreUtil2.getRootContainer(context);
      List<? extends EObject> candidates = EcoreUtil2.getAllContentsOfType(rootElement, class_);
      return Scopes.scopeFor(candidates);
    } else {
      return super.getScope(context, reference);
    }
  }
  
  public IScope scope_ConfigurationStatement_joint(final ConfigurationStatement cs, final EReference reference) {
    SystemInstantiation _system = cs.getSystem();
    uk.ac.kcl.inf.robotics.rigidBodies.System _system_1 = _system.getSystem();
    EList<SystemElement> _elements = _system_1.getElements();
    final Function1<SystemElement, Boolean> _function = new Function1<SystemElement, Boolean>() {
      @Override
      public Boolean apply(final SystemElement elt) {
        boolean _or = false;
        if ((elt instanceof Joint)) {
          _or = true;
        } else {
          _or = (elt instanceof BodyRepetition);
        }
        return Boolean.valueOf(_or);
      }
    };
    Iterable<SystemElement> _filter = IterableExtensions.<SystemElement>filter(_elements, _function);
    LinkedList<Joint> _linkedList = new LinkedList<Joint>();
    final Function2<LinkedList<Joint>, SystemElement, LinkedList<Joint>> _function_1 = new Function2<LinkedList<Joint>, SystemElement, LinkedList<Joint>>() {
      @Override
      public LinkedList<Joint> apply(final LinkedList<Joint> lAcc, final SystemElement elt) {
        if ((elt instanceof Joint)) {
          lAcc.add(((Joint) elt));
        } else {
          EList<SystemElement> _connectionExp = ((BodyRepetition) elt).getConnectionExp();
          Iterable<Joint> _filter = Iterables.<Joint>filter(_connectionExp, Joint.class);
          Iterables.<Joint>addAll(lAcc, _filter);
        }
        return lAcc;
      }
    };
    LinkedList<Joint> _fold = IterableExtensions.<SystemElement, LinkedList<Joint>>fold(_filter, _linkedList, _function_1);
    return Scopes.scopeFor(_fold);
  }
}
