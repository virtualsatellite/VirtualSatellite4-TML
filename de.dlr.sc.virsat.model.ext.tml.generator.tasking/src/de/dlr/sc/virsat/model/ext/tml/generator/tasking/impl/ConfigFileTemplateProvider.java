/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.tasking.impl;

import de.dlr.sc.virsat.model.ext.tml.generator.IConfigFileTemplateProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.IConfigFileTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.config.ConfigFileDefaultTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.config.ConfigFileTestTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

/**
 * Provides config-file template
 * @author nepa_ay
 *
 */
public class ConfigFileTemplateProvider implements IConfigFileTemplateProvider {
	
	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.IConfigFileTemplateProvider#getConfigFileDefaultTemplate(de.dlr.sc.virsat.model.ext.tml.generator.s.TaskingEnvironment)
	 */
	@Override
	public IConfigFileTemplate getConfigFileDefaultTemplate(TaskingEnvironment taskingEnvironment) {
		return new ConfigFileDefaultTemplate(taskingEnvironment);
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.IConfigFileTemplateProvider#getConfigFileTestTemplate(de.dlr.sc.virsat.model.ext.tml.generator.s.TaskingEnvironment)
	 */
	@Override
	public IConfigFileTemplate getConfigFileTestTemplate(TaskingEnvironment taskingEnvironment) {
		return new ConfigFileTestTemplate(taskingEnvironment);
	}
		
}
