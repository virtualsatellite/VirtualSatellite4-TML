/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.links;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.dlr.sc.virsat.model.ext.tml.structural.model.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.model.IEventSource;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironment;
import de.dlr.sc.virsat.project.editingDomain.VirSatEditingDomainRegistry;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;


/**
 * 
 * @author nepa_ay
 *
 */
public class LinkDiagramCreateFeature extends AbstractCreateConnectionFeature {

	/**
	 * Link Create Feature
	 * @param fp Feature provider.
	 */
	public LinkDiagramCreateFeature(IFeatureProvider fp) {
		super(fp, "Connection", "Create a connection.");
	}	

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		Object sourceObject = getBusinessObjectForPictogramElement(context.getSourceAnchor());
		return sourceObject instanceof IEventSource || sourceObject instanceof TaskOutput;
	}
	
	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		Anchor sourceAnchor = context.getSourceAnchor();
		Anchor targetAnchor = context.getTargetAnchor();
		if (sourceAnchor != null && targetAnchor != null && !sourceAnchor.equals(targetAnchor)) {
			Object sourceObject = getBusinessObjectForPictogramElement(sourceAnchor);
			Object targetObject = getBusinessObjectForPictogramElement(targetAnchor);
			return canLinkObjects(sourceObject, targetObject);
		}		
		return false;
	}
	
	/**
	 * Can create.
	 * @param sourceObject Source object.
	 * @param targetObject Target object.
	 * @return Can create
	 */
	private boolean canLinkObjects(Object sourceObject, Object targetObject) {
		boolean typeMatch = false;
		boolean linkExists = false;
		if (sourceObject instanceof TaskOutput && targetObject instanceof Channel) {
			TaskOutput taskOutput = (TaskOutput) sourceObject;
			Channel channel = (Channel) targetObject;
			if (channel.getDataType() != null) {
				typeMatch = channel.getDataType().equals(taskOutput.getTypeOf().getDataType());
			} else {
				typeMatch = true;
			}
			linkExists = taskOutput.getChannels().contains(channel);
		} else if (sourceObject instanceof IEventSource && targetObject instanceof TaskInput) {
			IEventSource eventSource = (IEventSource) sourceObject;
			TaskInput taskInput = (TaskInput) targetObject;
			if (eventSource instanceof Channel) {
				Channel channel = (Channel) eventSource;
				if (channel.getDataType() != null) {
					typeMatch = channel.getDataType().equals(taskInput.getTypeOf().getDataType());
				} else {
					typeMatch = true;
				}
			} else {
				typeMatch = true;
			}
			linkExists = eventSource.getInputs().contains(taskInput) || taskInput.getTrigger() != null;
		} 
		return typeMatch && !linkExists;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection connection = null;
		
		Anchor sourceAnchor = context.getSourceAnchor();
		Anchor targetAnchor = context.getTargetAnchor();
		Object sourceObject = getBusinessObjectForPictogramElement(sourceAnchor);
		Object targetObject = getBusinessObjectForPictogramElement(targetAnchor);
		
		if (sourceObject != null || targetObject != null) {
			TaskingEnvironment taskingEnvironment = (TaskingEnvironment) getBusinessObjectForPictogramElement(getDiagram());
			VirSatTransactionalEditingDomain ed = VirSatEditingDomainRegistry.INSTANCE.getEd(taskingEnvironment.getATypeInstance());
			CommandStack commandStack = ed.getCommandStack();
			
			if (sourceObject instanceof TaskOutput && targetObject instanceof Channel) {
				TaskOutput taskOutput = (TaskOutput) sourceObject;
				Channel channel = (Channel) targetObject;
				commandStack.execute(channel.setDataType(ed, taskOutput.getTypeOf().getDataType()));
				commandStack.execute(taskOutput.getChannels().add(ed, channel));
			} else if (sourceObject instanceof IEventSource && targetObject instanceof TaskInput) {
				IEventSource eventSource = (IEventSource) sourceObject;
				TaskInput taskInput = (TaskInput) targetObject;
				commandStack.execute(taskInput.setTrigger(ed, eventSource));
				commandStack.execute(eventSource.getInputs().add(ed, taskInput));
			} 
			
			AddConnectionContext addConnectionContext = new AddConnectionContext(sourceAnchor, targetAnchor);
			addConnectionContext.setNewObject(sourceObject);
			connection = (Connection) getFeatureProvider().addIfPossible(addConnectionContext);
		}
		return connection;
	}

}
