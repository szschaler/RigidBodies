package uk.ac.kcl.inf.robotics.generator;

import java.util.List;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import uk.ac.kcl.inf.robotics.rigidBodies.Configuration;

@SuppressWarnings("all")
public class ConfigurationInterpreter {
  private final Configuration config;
  
  private final List<Pair<String, uk.ac.kcl.inf.robotics.rigidBodies.System>> systemInstances;
  
  public ConfigurationInterpreter(final Configuration config, final List<Pair<String, uk.ac.kcl.inf.robotics.rigidBodies.System>> systemInstances) {
    this.config = config;
    this.systemInstances = systemInstances;
  }
  
  public uk.ac.kcl.inf.robotics.rigidBodies.System getConfiguredSystem() {
    Pair<String, uk.ac.kcl.inf.robotics.rigidBodies.System> _head = IterableExtensions.<Pair<String, uk.ac.kcl.inf.robotics.rigidBodies.System>>head(this.systemInstances);
    return _head.getValue();
  }
}
