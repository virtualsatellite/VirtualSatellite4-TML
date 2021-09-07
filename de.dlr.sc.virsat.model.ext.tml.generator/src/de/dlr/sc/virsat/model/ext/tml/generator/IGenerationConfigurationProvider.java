/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator;

import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration;

/**
 * Interface for configuration providers
 * @author fran_tb
 *
 */
public interface IGenerationConfigurationProvider {

	/**
	 * Initializes the provider with base configuration
	 * @param projectPath the project path
	 * @param configuration the base configuration
	 * @return an instance
	 */
	IGenerationConfigurationProvider init(String projectPath, GenerationConfiguration configuration);
	
	/**
	 * Get the name of the configuration element
	 * @return the name
	 */
	String getName();

	/**
	 * Get the absolute root path of the generated code
	 * @return absolute path as string
	 */
	String getRootPath();
	
	/**
	 * Get the path for the generated code
	 * @return relative path
	 */
	String getGenerationPath();

	/**
	 * Get the sub path of the src-gen folder
	 * @return relative path
	 */
	String getSrcGenPath();

	/**
	 * Get the sub path of the src folder
	 * @return relative path
	 */
	String getSrcPath();

	/**
	 * Get the sub path of the build-gen folder
	 * @return relative path
	 */
	String getBuildGenPath();

	/**
	 * Get the sub path of the test folder
	 * @return relative path
	 */
	String getTestPath();

	/**
	 * Get the sub path of the folder containing the task classes
	 * @return relative path
	 */
	String getTaskDefinitionFolder();

	/**
	 * Get the sub path of the folder containing the channel classes
	 * @return relative path
	 */
	String getChannelDefinitionFolder();

	/**
	 * Get the sub path of the folder containing the type classes
	 * @return relative path
	 */
	String getTypeDefinitionFolder();

	/**
	 * Returns the project name
	 * @return project name
	 */
	String getProjectName();
	
	/**
	 * Get the root directory for generator
	 * @return directory as string
	 */
	String getContribFolder();
	
	/**
	 * Get libconfig folder
	 * @return directory as string
	 */
	String getLibconfigFolder();
	
	/**
	 * Get libconfig folder
	 * @return directory as string
	 */
	boolean useLibconfig();
	
	/**
	 * Get Queue class name for the channel fifo
	 * @return "Queue"
	 */
	String getQueueClassName();
	
	/**
	 * Get Abstract channel class name
	 * @return "IChannel"
	 */
	String getAbstractChannelClassName();
	
	/**
	 * Get name for ConfiguationLoader class
	 * @return class name as string
	 */
	String getConfigurationLoaderClassName();
	
	/**
	 * Get name for default libconfig file
	 * @return filename as string
	 */
	String getDefaultConfigFilename();
	
	/**
	 * Get name for libconfig file for testing
	 * @return filename as string
	 */
	String getTestConfigFilename();
	
	/**
	 * Get Tasking Version
	 * @return the tasking version label specified in the generator extension
	 */
	String getTaskingVersion();
}
