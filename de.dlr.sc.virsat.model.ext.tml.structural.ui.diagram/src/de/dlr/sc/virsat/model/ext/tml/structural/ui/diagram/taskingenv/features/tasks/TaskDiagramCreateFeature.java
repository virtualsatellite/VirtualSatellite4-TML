/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.tasks;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.dlr.sc.virsat.graphiti.util.DiagramHelper;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInputDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutputDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.TMLDiagramUtil;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.providers.TMLDiagramTypeProvider;
import de.dlr.sc.virsat.project.editingDomain.VirSatEditingDomainRegistry;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;

/**
 * 
 * @author nepa_ay
 *
 */
public class TaskDiagramCreateFeature extends AbstractCreateFeature {

	private TaskDefinition taskDefinition;
	/**
	 * ChannelDiagramCreateFeature
	 * @param fp Feature provider.
	 */
	public TaskDiagramCreateFeature(IFeatureProvider fp) {
		super(fp, "task", "Create task instance.");
	}

	/**
	 * ChannelDiagramCreateFeature
	 * @param fp feature provider.
	 * @param taskDefinition task-diagram type
	 */
	public TaskDiagramCreateFeature(IFeatureProvider fp, TaskDefinition taskDefinition) {
		super(fp, taskDefinition.getName(), "Create task of type: " + taskDefinition.getName());
		this.taskDefinition = taskDefinition;
	}
	
	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		TaskInstance task = createTaskInstance();
		
		// Delegate to the add feature
		addGraphicalRepresentation(context, task);
		
		getFeatureProvider().getDirectEditingInfo().setActive(true);
		return new Object[] { task};
	}
	
	/**
	 * Create task instance
	 * @return task instance.
	 */
	private TaskInstance createTaskInstance() {
		TaskingEnvironment taskingEnvironment = (TaskingEnvironment) getBusinessObjectForPictogramElement(getDiagram());
		VirSatTransactionalEditingDomain ed = VirSatEditingDomainRegistry.INSTANCE.getEd(taskingEnvironment.getTypeInstance());
		Concept concept = DiagramHelper.getConcept(ed, TMLDiagramTypeProvider.STRUCTURAL_CONCEPT_ID);
		CommandStack commandStack = ed.getCommandStack();
		
		TaskInstance task = new TaskInstance(concept);
		task.setName(getTaskInstanceName(taskingEnvironment));
		task.setTypeOf(taskDefinition);
		
		for (TaskInputDefinition taskInputDefinition : taskDefinition.getInputs()) {
			TaskInput taskInput = new TaskInput(concept);
			taskInput.setName(TMLDiagramUtil.getFirstCharLowercase(taskInputDefinition.getName()));
			taskInput.setTypeOf(taskInputDefinition);
			task.getInputs().add(taskInput);
		}
		
		for (TaskOutputDefinition taskOutputDefinition : taskDefinition.getOutputs()) {
			TaskOutput taskOutput = new TaskOutput(concept);
			taskOutput.setName(TMLDiagramUtil.getFirstCharLowercase(taskOutputDefinition.getName()));
			taskOutput.setTypeOf(taskOutputDefinition);
			task.getOutputs().add(taskOutput);
		}
		
		Command command = taskingEnvironment.getTasks().add(ed, task);
		commandStack.execute(command);
		
		return task;
	}
	
	/**
	 * Compute unique name for new task-instance.
	 * @param taskingEnvironment Tasking environment.
	 * @return id
	 */
	private String getTaskInstanceName(TaskingEnvironment taskingEnvironment) {
		List<String> namesToAvoid = taskingEnvironment.getTasks().stream().map(t -> t.getName()).collect(Collectors.toList());
		return TMLDiagramUtil.getUniqueName(taskDefinition.getName(), namesToAvoid);
	}
	
}
