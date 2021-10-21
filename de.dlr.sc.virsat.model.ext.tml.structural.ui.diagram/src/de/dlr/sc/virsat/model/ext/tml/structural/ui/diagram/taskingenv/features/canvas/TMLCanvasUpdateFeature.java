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

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dlr.sc.virsat.graphiti.ui.diagram.feature.VirSatUpdateFeature;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.ext.tml.structural.model.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TimeEvent;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.TMLDiagramUtil;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.links.LinkDiagramDomainElement;


/**
 * 
 * @author nepa_ay
 *
 */
public class TMLCanvasUpdateFeature extends VirSatUpdateFeature {

	private boolean changeDuringUpdate;

	/**
	 * TML Canvas Update Feature
	 * @param fp Feature Provider
	 */
	public TMLCanvasUpdateFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		return context.getPictogramElement() instanceof Diagram && super.canUpdate(context);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		boolean updateNeeded = TMLDiagramUtil.pictogramElementsNeedUpdate(getFeatureProvider(), getDiagram().getChildren());
		
		if (!updateNeeded) {
			updateNeeded |= taskDiagramsNeedUpdate();
		}
		if (!updateNeeded) {
			updateNeeded |= channelDiagramsNeedUpdate();
		} 
		if (!updateNeeded) {
			updateNeeded |= timeEventDiagramsNeedUpdate();
		}
		if (!updateNeeded) {
			TaskingEnvironment taskingEnvironment = (TaskingEnvironment) getBusinessObjectForPictogramElement(getDiagram());
			Map<String, LinkDiagramDomainElement> connectionsInModel = TMLDiagramUtil.getConnectionBeans(taskingEnvironment);
			List<Connection> connectionsInDiagram = getDiagram().getConnections();

			updateNeeded |= connectionsInModel.size() != connectionsInDiagram.size();
		
			Iterator<Connection> connIterator = connectionsInDiagram.iterator();
			while (!updateNeeded && connIterator.hasNext()) {
				Connection conn = connIterator.next();
				updateNeeded |= TMLDiagramUtil.pictogramElementNeedsUpdate(getFeatureProvider(), conn);
				
				if (!updateNeeded) {
					IBeanCategoryAssignment sourceBean = (IBeanCategoryAssignment) getBusinessObjectForPictogramElement(conn.getStart());
					IBeanCategoryAssignment targetBean = (IBeanCategoryAssignment) getBusinessObjectForPictogramElement(conn.getEnd());
					updateNeeded |= !connectionsInModel.containsKey(LinkDiagramDomainElement.createUuid(sourceBean, targetBean));
				}
			}
		}
		if (!updateNeeded) {
			Iterator<Shape> iterator = getDiagram().getChildren().iterator();
			while (!updateNeeded && iterator.hasNext()) {
				updateNeeded |= getBusinessObjectForPictogramElement(iterator.next()) == null;
			}
		}
		return updateNeeded ? Reason.createTrueReason("TML model has changed.") : Reason.createFalseReason();
	}
	
	/**
	 * Check if task diagram is out-of-date.
	 * @return True if need update.
	 */
	private boolean taskDiagramsNeedUpdate() {
		TaskingEnvironment taskingEnvironment = (TaskingEnvironment) getBusinessObjectForPictogramElement(getDiagram());
		Set<IBeanCategoryAssignment> inDiagram = getBeanObjectsFromDiagram(TaskInstance.class);
		List<TaskInstance> inModel = taskingEnvironment.getTasks();
		
		boolean updateNeeded = inDiagram.size() != inModel.size();
		updateNeeded = updateNeeded || !inDiagram.containsAll(inModel);
		updateNeeded = updateNeeded || !taskingEnvironment.getTasks().containsAll(inDiagram);
		
		if (!updateNeeded) {
			
			Set<IBeanCategoryAssignment> allTaskInputsInDiagram = getBeanObjectsFromDiagramRecursive(TaskInput.class);
			Set<IBeanCategoryAssignment> allTaskOutputsInDiagram = getBeanObjectsFromDiagramRecursive(TaskOutput.class);
							
			for (TaskInstance task : taskingEnvironment.getTasks()) {
				updateNeeded |= !allTaskInputsInDiagram.containsAll(task.getInputs());
				updateNeeded |= !allTaskOutputsInDiagram.containsAll(task.getOutputs());
				
				if (!updateNeeded) {
					allTaskInputsInDiagram.removeAll(task.getInputs());
					allTaskOutputsInDiagram.removeAll(task.getOutputs());
				} else {
					break;
				}
			}
			updateNeeded |= !allTaskInputsInDiagram.isEmpty();
			updateNeeded |= !allTaskOutputsInDiagram.isEmpty();
		}
		return updateNeeded;
	}
	
	/**
	 * Check if channel diagram is out-of-date.
	 * @return True if need update.
	 */
	private boolean channelDiagramsNeedUpdate() {
		TaskingEnvironment taskingEnvironment = (TaskingEnvironment) getBusinessObjectForPictogramElement(getDiagram());
		Set<IBeanCategoryAssignment> inDiagram = getBeanObjectsFromDiagram(Channel.class);
		List<Channel> inModel = taskingEnvironment.getChannels();
		boolean updateNeeded = inDiagram.size() != inModel.size();
		if (!updateNeeded) {
			updateNeeded |= !inDiagram.containsAll(inModel);
			updateNeeded |= !inModel.containsAll(inDiagram);
		}
		return updateNeeded;
	}
	
	/**
	 * Check if time-event diagram is out-of-date.
	 * @return True if need update.
	 */
	private boolean timeEventDiagramsNeedUpdate() {
		TaskingEnvironment taskingEnvironment = (TaskingEnvironment) getBusinessObjectForPictogramElement(getDiagram());
		Set<IBeanCategoryAssignment> inDiagram = getBeanObjectsFromDiagram(TimeEvent.class);
		List<TimeEvent> inModel = taskingEnvironment.getTimeEvents();
		boolean updateNeeded = inDiagram.size() != inModel.size();
		if (!updateNeeded) {
			updateNeeded |= !inDiagram.containsAll(inModel);
			updateNeeded |= !inModel.containsAll(inDiagram);
		}
		return updateNeeded;
	}
	
	/**
	 * 
	 * @param beanClass
	 * @return
	 */
	private Set<IBeanCategoryAssignment> getBeanObjectsFromDiagram(Class<?> beanClass) {
		return TMLDiagramUtil.getBeanObjectsFromDiagram(getFeatureProvider(), getDiagram(), beanClass);
	}
	
	/**
	 * 
	 * @param beanClass
	 * @return
	 */
	private Set<IBeanCategoryAssignment> getBeanObjectsFromDiagramRecursive(Class<?> beanClass) {
		return TMLDiagramUtil.getBeanObjectsFromDiagramRecursive(getFeatureProvider(), getDiagram(), beanClass);
	}

	@Override
	public boolean update(IUpdateContext context) {
		changeDuringUpdate = false;
		if (updateNeeded(context).toBoolean()) {
			updateNodes();
			updateLinks();	
		}
		if (changeDuringUpdate) {
			getDiagramBehavior().getDiagramContainer().doSave(new NullProgressMonitor());
		}
		getDiagram().getChildren().forEach(pe -> {
			getDiagramBehavior().refreshRenderingDecorators(pe);
		});
		return changeDuringUpdate;
	}

	/**
	 * Update nodes (tasks, channels, time-events)
	 */
	private void updateNodes() {
		IFeatureProvider fp = getFeatureProvider();
		List<Shape> shapes = getDiagram().getChildren();
		changeDuringUpdate |= TMLDiagramUtil.removeDeletedPictogramElements(fp, shapes);
		changeDuringUpdate |= TMLDiagramUtil.addMissingNodes(fp);
		changeDuringUpdate |= TMLDiagramUtil.updatePictogramElementsIfNeeded(fp, shapes);
	}

	/**
	 * Update links
	 */
	private void updateLinks() {
		IFeatureProvider fp = getFeatureProvider();
		List<Connection> connections = getDiagram().getConnections();
		changeDuringUpdate |= TMLDiagramUtil.removeDeletedPictogramElements(fp, connections);
		changeDuringUpdate |= TMLDiagramUtil.addMissingLinks(fp);
		changeDuringUpdate |= TMLDiagramUtil.updatePictogramElementsIfNeeded(fp, connections);
	}
	
	@Override
	public boolean hasDoneChanges() {
		return changeDuringUpdate;
	}
}