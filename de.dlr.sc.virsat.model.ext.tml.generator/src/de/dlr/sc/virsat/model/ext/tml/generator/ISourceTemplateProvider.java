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

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.ISourceTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

/**
 * Interface for source template providers
 * @author fran_tb
 *
 */
public interface ISourceTemplateProvider {

	/**
	 * Creates a template class for the given data type
	 * @param dataType element for which a template should be created
	 * @return the template object
	 */
	ISourceTemplate getDatatypeTemplate(DataType dataType);
	
	/**
	 * Creates a template class for the given data type
	 * @param enumeration element for which a template should be created
	 * @return the template object
	 */
	ISourceTemplate getEnumerationTemplate(Enumeration enumeration);

	/**
	 * Creates a template class for the given data type
	 * @param taskingEnvironmentPart model part object
	 * @param taskDefinition element for which a template should be created
	 * @return the template object
	 */
	ISourceTemplate getTaskDefinitionTemplate(TaskingEnvironment taskingEnvironment, TaskDefinition taskDefinition);

	/**
	 * Creates a template class for the given channel behavior
	 * @param channelBehaviorDefinition element for which a template should be created
	 * @return the template object
	 */
	ISourceTemplate getChannelBehaviorDefinitionTemplate(ChannelBehaviorDefinition channelBehaviorDefinition);
	
	/**
	 * Create a template class for the abstract fifo channel
	 * @return the template object
	 */
	ISourceTemplate getAbstractChannelTemplate();

	/**
	 * Create a template class for the channel queue class
	 * @return the template object
	 */
	ISourceTemplate getChannelQueueTemplate();
	
	/**
	 * Create a template for the tasking environment configuration class
	 * @param taskingEnvironment model  object
	 * @param taskDefinitions List of all the components in the tasking environment
	 * @return the template object
	 */
	ISourceTemplate getTMLConfigurationLoaderTemplate(TaskingEnvironment taskingEnvironment);

	/**
	 * Creates a template class for the given data type
	 * @param taskEnvironment element for which a template should be created
	 * @return the template object
	 */
	ISourceTemplate getTaskingEnvironmentTemplate(TaskingEnvironment taskEnvironment);
}
