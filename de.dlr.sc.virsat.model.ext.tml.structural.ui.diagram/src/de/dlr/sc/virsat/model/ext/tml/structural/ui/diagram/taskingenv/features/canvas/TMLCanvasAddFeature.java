/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.canvas;

import de.dlr.sc.virsat.model.concept.types.category.ABeanCategoryAssignment;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.ext.tml.structural.model.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TimeEvent;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.nodes.NodeDiagramStyle;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

/**
 * 
 * @author nepa_ay
 *
 */
public class TMLCanvasAddFeature extends AbstractAddShapeFeature {

	private Diagram diagram;
	private TaskingEnvironment taskingEnvironment;
	
	/**
	 * Add features to tasking-environment diagram.
	 * @param fp Feature provider
	 */
	public TMLCanvasAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		ContainerShape target = context.getTargetContainer();
		return target instanceof Diagram && getBusinessObjectForPictogramElement(target) == null;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		diagram = getDiagram();
		taskingEnvironment = (TaskingEnvironment) context.getNewObject();
		link(diagram, taskingEnvironment);
		
		addTasks(context);
		addChannels(context);
		addTimeEvents(context);
		addConnections(context);
		
		getDiagramBehavior().refreshPalette();
		return null;
	}
	
	/**
	 * Add Tasks
	 * @param context Add Context
	 */
	private void addTasks(IAddContext context) {
		List<TaskInstance> tasks = taskingEnvironment.getTasks();
		int hTaskCount = (int) Math.ceil(Math.sqrt(tasks.size()));
		int counter = 0;
		int xPadding = NodeDiagramStyle.WIDTH;
		int yPadding = NodeDiagramStyle.HEIGHT;

		for (TaskInstance task : tasks) {
			AddContext addContext = new AddContext(context, task);
			addContext.setTargetContainer(getDiagram());
			addContext.setX(xPadding);
			addContext.setY(yPadding);
			getFeatureProvider().getAddFeature(addContext).add(addContext);	
			
			xPadding = xPadding + NodeDiagramStyle.WIDTH * 2; 
			counter++;
			if (counter >= hTaskCount) {
				counter = 0;
				yPadding = yPadding + NodeDiagramStyle.HEIGHT * 2;
				xPadding = NodeDiagramStyle.WIDTH;
			}
		}
	}
	
	
	/**
	 * Add Channels
	 * @param context Add Context
	 */
	private void addChannels(IAddContext context) {
		List<Channel> channels = taskingEnvironment.getChannels();
		int hTaskCount = (int) Math.ceil(Math.sqrt(channels.size()));
		int counter = 0;
		int xPadding = NodeDiagramStyle.WIDTH;
		int yPadding = NodeDiagramStyle.HEIGHT / 2;

		for (Channel channel : channels) {
			AddContext addContext = new AddContext(context, channel);
			addContext.setTargetContainer(getDiagram());
			addContext.setX(xPadding);
			addContext.setY(yPadding);

			getFeatureProvider().getAddFeature(addContext).add(addContext);	
			
			xPadding = xPadding + NodeDiagramStyle.WIDTH * 2; 
			counter++;
			if (counter >= hTaskCount) {
				counter = 0;
				yPadding = yPadding + NodeDiagramStyle.HEIGHT * 2;
				xPadding = NodeDiagramStyle.WIDTH;
			}
		}
	}
	
	/**
	 * Add Time Events
	 * @param context Add Context
	 */
	private void addTimeEvents(IAddContext context) {
		List<TimeEvent> timeEvents = taskingEnvironment.getTimeEvents();
		int hTaskCount = (int) Math.ceil(Math.sqrt(timeEvents.size()));
		int counter = 0;
		int xPadding = NodeDiagramStyle.WIDTH * 2;
		int yPadding = NodeDiagramStyle.HEIGHT / 2;

		for (TimeEvent timeEvent : timeEvents) {
			AddContext addContext = new AddContext(context, timeEvent);
			addContext.setTargetContainer(getDiagram());
			addContext.setX(xPadding);
			addContext.setY(yPadding);

			getFeatureProvider().getAddFeature(addContext).add(addContext);	
			
			xPadding = xPadding + NodeDiagramStyle.WIDTH * 2; 
			counter++;
			if (counter >= hTaskCount) {
				counter = 0;
				yPadding = yPadding + NodeDiagramStyle.HEIGHT * 2;
				xPadding = NodeDiagramStyle.WIDTH * 2;
			}
		}
	}
	
	/**
	 * Add Links
	 * @param context Add Context
	 */
	private void addConnections(IAddContext context) {
		for (TimeEvent timeEvent : taskingEnvironment.getTimeEvents()) {
			for (TaskInput taskInput : timeEvent.getInputs()) {
				addConnection(timeEvent, taskInput);
			}
		}
		
		List<TaskOutput> taskOutputs = new ArrayList<>();
		for (TaskInstance task : taskingEnvironment.getTasks()) {
			taskOutputs.addAll(task.getOutputs());
		}
		
		for (TaskOutput taskOutput : taskOutputs) {
			for (Channel channel : taskOutput.getChannels()) {
				addConnection(taskOutput, channel);
				for (TaskInput taskInput : channel.getInputs()) {
					addConnection(channel, taskInput);
				}
			}
		}
	}
	
	/**
	 * Add a link
	 * @param sourceBean Source bean object.
	 * @param targetBean Target bean object.
	 */
	private void addConnection(ABeanCategoryAssignment sourceBean, ABeanCategoryAssignment targetBean) {
		Anchor sourceAnchor = null;
		Anchor targetAnchor = null;
		
		ABeanCategoryAssignment[] linkObjects = { sourceBean, targetBean };
		final PictogramElement[] pictogramElements = getFeatureProvider()
														.getDiagramTypeProvider()
														.getNotificationService()
														.calculateRelatedPictogramElements(linkObjects);
		
		for (PictogramElement pe : pictogramElements) {
			if (pe instanceof Anchor) {
				IBeanCategoryAssignment bean = (IBeanCategoryAssignment) getBusinessObjectForPictogramElement(pe);
				if (bean.getUuid().equals(sourceBean.getUuid())) {
					sourceAnchor = (Anchor) pe;
				}
				if (bean.getUuid().equals(targetBean.getUuid())) {
					targetAnchor = (Anchor) pe;
				}
			}
		}
		
		if (sourceAnchor != null && targetAnchor != null) {
			AddConnectionContext addConnectionContext = new AddConnectionContext(sourceAnchor, targetAnchor);
			addConnectionContext.setTargetContainer(getDiagram());
			addConnectionContext.setNewObject(sourceBean);
			getFeatureProvider().addIfPossible(addConnectionContext);
		}
	}
	
}
