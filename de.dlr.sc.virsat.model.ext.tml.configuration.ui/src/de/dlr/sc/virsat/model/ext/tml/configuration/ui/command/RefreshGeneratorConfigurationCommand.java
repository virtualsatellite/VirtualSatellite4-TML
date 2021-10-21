/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.configuration.ui.command;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TaskingEnvironmentConfiguration;
import de.dlr.sc.virsat.model.ext.tml.configuration.ui.provider.DefaultConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

/**
 * Class for a command refreshing the current configuration of the generator
 * @author fran_tb
 *
 */
public class RefreshGeneratorConfigurationCommand extends RecordingCommand {

	TMLConfiguration configurationRoot;
	GenerationConfiguration genConfig;
	TaskingEnvironmentConfiguration taskingConfiguration;
	TaskingEnvironment taskingEnv;

	/**
	 * Create a new command for a given editing domain and a configuration
	 * @param domain editing domain
	 * @param configRoot root of the current configuration
	 */
	public RefreshGeneratorConfigurationCommand(TransactionalEditingDomain domain, TMLConfiguration configRoot) {
		super(domain);
		configurationRoot = configRoot;
		genConfig = configurationRoot.getGeneratorConfiguration();
		taskingConfiguration = genConfig.getTaskingEnvironmentConfiguration();
		taskingEnv = taskingConfiguration.getDomainElement();
	}

	@Override
	protected void doExecute() {
		if (taskingEnv == null) {
			return;
		}
		DefaultConfigurationProvider.getiINSTANCE().initCongfigRootValues(genConfig);
	}

	
}
