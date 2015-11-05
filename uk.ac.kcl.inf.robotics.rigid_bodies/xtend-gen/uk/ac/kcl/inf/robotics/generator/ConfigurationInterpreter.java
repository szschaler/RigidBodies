package uk.ac.kcl.inf.robotics.generator;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import uk.ac.kcl.inf.robotics.rigidBodies.Configuration;
import uk.ac.kcl.inf.robotics.rigidBodies.ConfigurationStatement;
import uk.ac.kcl.inf.robotics.rigidBodies.Joint;
import uk.ac.kcl.inf.robotics.rigidBodies.LockStatement;

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
  
  private Object _doConfigure(final LockStatement ls, final EcoreUtil.Copier copier) {
    Joint _joint = ls.getJoint();
    EObject _get = copier.get(_joint);
    final Joint jointToModify = ((Joint) _get);
    return null;
  }
  
  private Object doConfigure(final ConfigurationStatement ls, final EcoreUtil.Copier copier) {
    if (ls instanceof LockStatement) {
      return _doConfigure((LockStatement)ls, copier);
    } else if (ls != null) {
      return _doConfigure(ls, copier);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ls, copier).toString());
    }
  }
}
