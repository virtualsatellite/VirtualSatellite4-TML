/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.configuration.ui.provider;

import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration;

/**
 * Class that provides default configurations for the code generation
 * @author fran_tb
 *
 */
public class DefaultConfigurationProvider {

	private static DefaultConfigurationProvider iINSTANCE = new DefaultConfigurationProvider();

	/**
	 * Constructor for the provider
	 */
	protected DefaultConfigurationProvider() {

	}

	/**
	 * Default values for the configuration elements
	 * @param genConfig empty configuration
	 */
	public void initCongfigRootValues(GenerationConfiguration genConfig) {

		if (genConfig.getGenerationPath() == null) {
			genConfig.setGenerationPath("cpp/");
		}
		if (genConfig.getSrcGenPath() == null) {
			genConfig.setSrcGenPath("src-gen/");
		}
		if (genConfig.getSrcPath() == null) {
			genConfig.setSrcPath("src/");
		}
		if (genConfig.getBuildGenPath() == null) {
			genConfig.setBuildGenPath("build-gen/");
		}
		if (genConfig.getTestPath() == null) {
			genConfig.setTestPath("test/");
		}
		if (genConfig.getTaskDefinitionFolder() == null) {
			genConfig.setTaskDefinitionFolder("components/");
		}
		if (genConfig.getChannelDefinitionFolder() == null) {
			genConfig.setChannelDefinitionFolder("channels/");
		}
		if (genConfig.getTypeDefinitionFolder() == null) {
			genConfig.setTypeDefinitionFolder("types/");
		}
		if (genConfig.getContribFolder() == null) {
			genConfig.setContribFolder("contrib/");
		}
		if (genConfig.getTaskingVersion() == null) {
			genConfig.setTaskingVersion("Tasking_2");
		}
		genConfig.getTaskingEnvironmentConfiguration()
				.setImplementationName(genConfig.getTaskingEnvironmentConfiguration().getDomainElement().getName());
	}

	/**
	 * Returns an instance of the configuration provider
	 * @return instance
	 */
	public static DefaultConfigurationProvider getiINSTANCE() {
		return iINSTANCE;
	}


}
