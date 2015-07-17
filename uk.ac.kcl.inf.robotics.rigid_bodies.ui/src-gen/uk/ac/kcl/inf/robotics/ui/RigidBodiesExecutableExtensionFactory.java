/*
 * generated by Xtext
 */
package uk.ac.kcl.inf.robotics.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import uk.ac.kcl.inf.robotics.ui.internal.RigidBodiesActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RigidBodiesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RigidBodiesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RigidBodiesActivator.getInstance().getInjector(RigidBodiesActivator.UK_AC_KCL_INF_ROBOTICS_RIGIDBODIES);
	}
	
}