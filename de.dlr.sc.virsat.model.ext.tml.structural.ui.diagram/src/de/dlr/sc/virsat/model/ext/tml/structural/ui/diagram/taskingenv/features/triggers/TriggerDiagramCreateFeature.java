/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.triggers;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.command.Command;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.dlr.sc.virsat.graphiti.util.DiagramHelper;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.BehaviorParameter;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.BehavioralParameterDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.ChannelBehavior;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.model.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TimeEvent;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.TMLDiagramUtil;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.providers.TMLDiagramTypeProvider;
import de.dlr.sc.virsat.project.editingDomain.VirSatEditingDomainRegistry;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;

/**
 * 
 * @author nepa_ay
 *
 */
public class TriggerDiagramCreateFeature extends AbstractCreateFeature {
	
	private ChannelBehaviorDefinition channelBehaviorDefinition;
	/**
	 * Trigger Diagram Create Feature
	 * @param fp feature provider.
	 */
	public TriggerDiagramCreateFeature(IFeatureProvider fp) {
		super(fp, "TimeEvent", "Create time-event.");
	}
	
	/**
	 * ChannelDiagramCreateFeature
	 * @param fp feature provider.
	 * @param channelBehaviorDefinition channelBehaviorDefinition
	 */
	public TriggerDiagramCreateFeature(IFeatureProvider fp, ChannelBehaviorDefinition channelBehaviorDefinition) {
		super(fp, channelBehaviorDefinition.getName(), "Create channel of type: " + channelBehaviorDefinition.getName());
		this.channelBehaviorDefinition = channelBehaviorDefinition;
	}
	
	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		TaskingEnvironment taskingEnvironment = (TaskingEnvironment) getBusinessObjectForPictogramElement(getDiagram());
		VirSatTransactionalEditingDomain ed = VirSatEditingDomainRegistry.INSTANCE.getEd(taskingEnvironment.getTypeInstance());
		Concept conceptBehavior = DiagramHelper.getConcept(ed, TMLDiagramTypeProvider.BEHAVIORAL_CONCEPT_ID);
		Concept conceptStructural = DiagramHelper.getConcept(ed, TMLDiagramTypeProvider.STRUCTURAL_CONCEPT_ID);

		IBeanCategoryAssignment bean = null;
		if (isChannel()) {
			bean = configureChannel(conceptStructural, conceptBehavior, taskingEnvironment);
			Command command = taskingEnvironment.getChannels().add(ed, (Channel) bean);
			ed.getCommandStack().execute(command);
		} else {
			bean = new TimeEvent(conceptStructural);
			bean.setName(getTriggerInstanceName(taskingEnvironment));
			Command command = taskingEnvironment.getTimeEvents().add(ed, (TimeEvent) bean);
			ed.getCommandStack().execute(command);
		}
		// Delegate to the add feature
		addGraphicalRepresentation(context, bean);
		
		getFeatureProvider().getDirectEditingInfo().setActive(true);
		return new Object[] {bean};
	}
	
	/**
	 * Create channel element 
	 * 
	 * @param concept the concept 
	 * @param container the tasking environment container
	 * @return
	 */
	protected Channel configureChannel(Concept structuralConcept, Concept behavioralConcept, TaskingEnvironment container) {
		Channel channel = new Channel(structuralConcept);
		channel.setName(getChannelInstanceName(container));
		ChannelBehavior behavior = channel.getChannelBehavior();
		behavior.setTypeOf(channelBehaviorDefinition);
		for (BehavioralParameterDefinition paramDef : channelBehaviorDefinition.getParameters()) {
			BehaviorParameter paramInstance = new BehaviorParameter(behavioralConcept);
			paramInstance.setName(paramDef.getName());
			paramInstance.setTypeOf(paramDef);
			behavior.getParameterInstances().add(paramInstance);
		}
		return channel;
	}
	
	/**
	 * Compute unique name for new time-event instance
	 * @param taskingEnvironment Tasking environment.
	 * @return id
	 */
	private String getTriggerInstanceName(TaskingEnvironment taskingEnvironment) {
		List<String> namesToAvoid = taskingEnvironment.getTimeEvents().stream().map(t -> t.getName()).collect(Collectors.toList());
		return TMLDiagramUtil.getUniqueName("timeEvent", namesToAvoid);
	}
	
	/**
	 * Compute unique name for new task-instance.
	 * @param taskingEnvironment Tasking environment.
	 * @return id
	 */
	private String getChannelInstanceName(TaskingEnvironment taskingEnvironment) {
		List<String> namesToAvoid = taskingEnvironment.getChannels().stream().map(t -> t.getName()).collect(Collectors.toList());
		return TMLDiagramUtil.getUniqueName(channelBehaviorDefinition.getName(), namesToAvoid);
	}
	
	/**
	 * Checks if channel or time-event trigger.
	 * @return True if channel.
	 */
	public boolean isChannel() {
		return this.channelBehaviorDefinition != null;
	}
}
