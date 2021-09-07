/*
 * generated by Xtext 2.22.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.enumdefinition.ui.internal;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinitionRuntimeModule;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.EnumDefinitionUiModule;
import java.util.Collections;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EnumdefinitionActivator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "de.dlr.sc.virsat.model.ext.tml.structural.declaration.enumdefinition.ui";
	public static final String DE_DLR_SC_VIRSAT_MODEL_EXT_TML_STRUCTURAL_DECLARATION_ENUMDEFINITION = "de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinition";
	
	private static final Logger logger = Logger.getLogger(EnumdefinitionActivator.class);
	
	private static EnumdefinitionActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static EnumdefinitionActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			com.google.inject.Module runtimeModule = getRuntimeModule(language);
			com.google.inject.Module sharedStateModule = getSharedStateModule();
			com.google.inject.Module uiModule = getUiModule(language);
			com.google.inject.Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	protected com.google.inject.Module getRuntimeModule(String grammar) {
		if (DE_DLR_SC_VIRSAT_MODEL_EXT_TML_STRUCTURAL_DECLARATION_ENUMDEFINITION.equals(grammar)) {
			return new EnumDefinitionRuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getUiModule(String grammar) {
		if (DE_DLR_SC_VIRSAT_MODEL_EXT_TML_STRUCTURAL_DECLARATION_ENUMDEFINITION.equals(grammar)) {
			return new EnumDefinitionUiModule(this);
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
	
}
