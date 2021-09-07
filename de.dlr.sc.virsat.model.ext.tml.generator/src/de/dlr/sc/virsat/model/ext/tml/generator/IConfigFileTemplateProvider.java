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

import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.IConfigFileTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

/**
 * @author nepa_ay
 * Template provider for the configuration file
 */
public interface IConfigFileTemplateProvider {
	
	/**
	 * Create the template for tasking-environment configuration 
	 * @param taskingEnvironmentPart Tasking environment for which config-file is generated
	 * @return the template object
	 */
	IConfigFileTemplate getConfigFileDefaultTemplate(TaskingEnvironment taskingEnvironment);
	
	/**
	 * Create the template for tasking-environment configuration for testing
	 * @param taskingEnvironmentPart Tasking environment for which config-file is generated
	 * @return the template object
	 */
	IConfigFileTemplate getConfigFileTestTemplate(TaskingEnvironment taskingEnvironment);

}
