/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.taskports;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import de.dlr.sc.virsat.graphiti.ui.diagram.feature.VirSatAddShapeFeature;
import de.dlr.sc.virsat.model.concept.types.category.ABeanCategoryAssignment;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.nodes.NodeDiagramStyle;

/**
 * 
 * @author nepa_ay
 *
 */
public class TaskPortDiagramAddFeature extends VirSatAddShapeFeature {
	
	private IPeCreateService peCreateService; 
	private IGaService gaService;
	
	/**
	 * ChannelDiagramAddFeature
	 * @param fp Feature provider.
	 */
	public TaskPortDiagramAddFeature(IFeatureProvider fp) {
		super(fp);
		peCreateService = Graphiti.getPeCreateService();
		gaService = Graphiti.getGaService();
	}

	@Override
	public boolean canAdd(IAddContext context) {
		ContainerShape targetContainer = context.getTargetContainer();	
		Object task = getBusinessObjectForPictogramElement(targetContainer);
		return task != null && super.canAdd(context);
	}
	
	@Override
	public PictogramElement add(IAddContext context) {
		ContainerShape targetContainer = context.getTargetContainer();	
		
		Object domainElement = context.getNewObject();
		
		ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
		link(containerShape, domainElement);
		
		// add a chopbox anchor to the shape
        ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(containerShape);
		link(boxAnchor, domainElement);
		
		ABeanCategoryAssignment bean = (ABeanCategoryAssignment) domainElement;
		
		Polygon polygon = gaService.createPlainPolygon(containerShape, getPoints(bean));
		polygon.setBackground(manageColor(NodeDiagramStyle.COLOR_CONST_TASKPORT));
		polygon.setLineWidth(NodeDiagramStyle.LINE_WIDTH_THIN);
		gaService.setLocationAndSize(polygon, context.getX(), context.getY(), NodeDiagramStyle.PORT_WIDTH, NodeDiagramStyle.PORT_WIDTH);
		link(containerShape, domainElement);
		
		return containerShape;
	}
	
	/**
	 * 
	 * @param bean A Bean Category Assignment.
	 * @return Points to create task-input figure.
	 */
	private int[] getPoints(ABeanCategoryAssignment bean) {
		if (bean instanceof TaskInput) {
			return getTaskInputPoints();
		} else if (bean instanceof TaskOutput) {
			return getTaskOutputPoints();
		}
		return null;
	}
	
	/**
	 * 
	 * @return points
	 */
	private int[] getTaskInputPoints() {
		final int w = NodeDiagramStyle.PORT_WIDTH;
		final int[] points = new int[] {0, 0, w, 0, w, w, 0, w, w / 2, w / 2};
		return points;
	}
	
	/**
	 * 
	 * @return points
	 */
	private int[] getTaskOutputPoints() {
		final int w = NodeDiagramStyle.PORT_WIDTH;
		final int[] points = new int[] {0, 0, w / 2, 0, w, w / 2, w / 2, w, 0, w};
		return points;
	}
}
