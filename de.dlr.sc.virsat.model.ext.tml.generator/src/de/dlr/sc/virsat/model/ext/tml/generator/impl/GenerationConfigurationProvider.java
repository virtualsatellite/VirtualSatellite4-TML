/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.impl;

import java.io.File;

import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration;
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;

/**
 * Generic singleton for providing configuration elements
 * @author fran_tb
 *
 */
public class GenerationConfigurationProvider implements IGenerationConfigurationProvider {

	private static GenerationConfigurationProvider iINSTANCE = new GenerationConfigurationProvider();

	protected GenerationConfiguration generationConfiguration;
	protected String projectPath;
	
	/**
	 * Constructor for the configuration provider of a given configuration
	 * @param projectPath absolute path to the current project.
	 * @param configuration the configuration
	 * @return the provider
	 */
	public GenerationConfigurationProvider init(String projectPath, GenerationConfiguration configuration) {
		this.projectPath = projectPath;
		this.generationConfiguration = configuration;
		return getInstance();
	}

	@Override
	public String getName() {
		return generationConfiguration.getName();
	}

	@Override
	public String getRootPath() {
		String rootPath = generationConfiguration.getGenerationPath();
		if (!new File(rootPath).isAbsolute()) {
			rootPath = this.projectPath + rootPath;
		}
		return rootPath;
	}
	
	@Override
	public String getGenerationPath() {
		return generationConfiguration.getGenerationPath();
	}

	@Override
	public String getSrcGenPath() {
		return generationConfiguration.getSrcGenPath();
	}

	@Override
	public String getSrcPath() {
		return generationConfiguration.getSrcPath();
	}

	@Override
	public String getBuildGenPath() {
		return generationConfiguration.getBuildGenPath();
	}

	@Override
	public String getTestPath() {
		return generationConfiguration.getTestPath();
	}

	@Override
	public String getTaskDefinitionFolder() {
		return generationConfiguration.getTaskDefinitionFolder();
	}

	@Override
	public String getChannelDefinitionFolder() {
		return generationConfiguration.getChannelDefinitionFolder();
	}

	@Override
	public String getTypeDefinitionFolder() {
		return generationConfiguration.getTypeDefinitionFolder();
	}

	@Override
	public String getProjectName() {
		return generationConfiguration.getTaskingEnvironmentConfiguration().getImplementationName();
	}

	@Override
	public String getContribFolder() {
		return generationConfiguration.getContribFolder();
	}
	
	@Override
	public String getLibconfigFolder() {
		return generationConfiguration.getLibconfigFolder();
	}
	
	@Override
	public String getQueueClassName() {
		return "Queue";
	}
	
	@Override
	public String getAbstractChannelClassName() {
		return "AChannel";
	}
	
	@Override
	public String getConfigurationLoaderClassName() {
		return "ConfigurationLoader";
	}

	@Override
	public String getTestConfigFilename() {
		return "TestConfigFile.cfg";
	}
	
	@Override
	public String getDefaultConfigFilename() {
		return getProjectName() + ".cfg";
	}
	
	@Override
	public String getTaskingVersion() {
		return generationConfiguration.getTaskingVersion();
	}
	
	/**
	 * Getter for the provider's instance
	 * @return instance
	 */
	public static GenerationConfigurationProvider getInstance() {
		return iINSTANCE;
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider#useLibconfig()
	 */
	@Override
	public boolean useLibconfig() {
		if (getLibconfigFolder() == null) {
			return false;
		} else {
			return !getLibconfigFolder().isEmpty();
		}
	}

}
