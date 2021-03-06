/*
 * generated by Xtext 2.22.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui;

import com.google.inject.Injector;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.taskdefinition.ui.internal.TaskdefinitionActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TaskDefinitionExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(TaskdefinitionActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		TaskdefinitionActivator activator = TaskdefinitionActivator.getInstance();
		return activator != null ? activator.getInjector(TaskdefinitionActivator.DE_DLR_SC_VIRSAT_MODEL_EXT_TML_STRUCTURAL_DECLARATION_TASKDEFINITION) : null;
	}

}
