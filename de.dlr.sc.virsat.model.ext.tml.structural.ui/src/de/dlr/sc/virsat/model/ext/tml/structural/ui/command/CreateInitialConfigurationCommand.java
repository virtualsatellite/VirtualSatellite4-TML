/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.command;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.dlr.sc.virsat.model.dvlm.Repository;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.categories.ICategoryAssignmentContainer;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import de.dlr.sc.virsat.model.ext.tml.configuration.model.TMLConfiguration;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironment;

/**
 * Command to create an initial configuration for code generation based on a given tasking environment
 * @author fran_tb
 *
 */
public class CreateInitialConfigurationCommand extends RecordingCommand {

	CategoryAssignment taskingEnvironment;

	/**
	 * Creates the command given the editing domain and the domain model element
	 * @param domain the editing domain
	 * @param taskingEnvironment the root domain model element
	 */
	public CreateInitialConfigurationCommand(TransactionalEditingDomain domain, CategoryAssignment taskingEnvironment) {
		super(domain);
		this.taskingEnvironment = taskingEnvironment;
	}

	@Override
	protected void doExecute() {
		ICategoryAssignmentContainer parent = (ICategoryAssignmentContainer) taskingEnvironment.eContainer();
		TaskingEnvironment beanTaskingEnvironment = new TaskingEnvironment(taskingEnvironment);

		ActiveConceptHelper acHelper = new ActiveConceptHelper(
				(Repository) beanTaskingEnvironment.getConcept().eContainer());
		Concept concept = acHelper.getConcept("de.dlr.sc.virsat.model.ext.tml.configuration");
		TMLConfiguration tmlConfiguration = new TMLConfiguration(concept);
		parent.getCategoryAssignments().add(tmlConfiguration.getTypeInstance());
		tmlConfiguration.setName(beanTaskingEnvironment.getName() + "Configuration");
		tmlConfiguration.getGeneratorConfiguration().getTaskingEnvironmentConfiguration()
				.setDomainElement(beanTaskingEnvironment);
	}

}
