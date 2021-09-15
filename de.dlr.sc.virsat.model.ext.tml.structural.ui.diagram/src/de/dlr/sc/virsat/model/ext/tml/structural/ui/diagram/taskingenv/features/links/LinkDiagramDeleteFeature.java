/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.links;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.dlr.sc.virsat.model.ext.tml.structural.model.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.model.IEventSource;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.CommonDeleteFeature;
import de.dlr.sc.virsat.project.editingDomain.VirSatEditingDomainRegistry;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;

/**
 * 
 * @author nepa_ay
 *
 */
public class LinkDiagramDeleteFeature extends CommonDeleteFeature {

	Object sourceObject = null;
	Object targetObject = null;
	
	/**
	 * Link Diagram Delete Feature
	 * @param fp Feature Provider
	 */
	public LinkDiagramDeleteFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public void delete(IDeleteContext context) {
		Connection connection = (Connection) context.getPictogramElement();
		Anchor sourceAnchor = connection.getStart();
		Anchor targetAnchor = connection.getEnd();
		sourceObject = getBusinessObjectForPictogramElement(sourceAnchor);
		targetObject = getBusinessObjectForPictogramElement(targetAnchor);
		super.delete(context);
	}
	
	@Override
	protected void deleteBusinessObject(Object obj) {
		TaskingEnvironment taskingEnvironment = (TaskingEnvironment) getBusinessObjectForPictogramElement(getDiagram());
		VirSatTransactionalEditingDomain ed = VirSatEditingDomainRegistry.INSTANCE.getEd(taskingEnvironment.getATypeInstance());
		
		if (sourceObject instanceof IEventSource && targetObject instanceof TaskInput) {
			IEventSource eventSource = (IEventSource) sourceObject;
			TaskInput taskInput = (TaskInput) targetObject;
			ed.getCommandStack().execute(taskInput.setTrigger(ed, null));
			ed.getCommandStack().execute(eventSource.getInputs().remove(ed, taskInput));
		} else if (sourceObject instanceof TaskOutput && targetObject instanceof Channel) {
			TaskOutput taskOutput = (TaskOutput) sourceObject;
			Channel channel = (Channel) targetObject;
			ed.getCommandStack().execute(taskOutput.getChannels().remove(ed, channel));
		}
	}
	
}
