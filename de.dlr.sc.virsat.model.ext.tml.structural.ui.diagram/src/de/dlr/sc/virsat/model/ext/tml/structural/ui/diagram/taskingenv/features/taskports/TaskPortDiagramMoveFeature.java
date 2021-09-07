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
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.TMLDiagramUtil;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.nodes.NodeDiagramStyle;

/**
 * 
 * @author nepa_ay
 *
 */
public class TaskPortDiagramMoveFeature extends DefaultMoveShapeFeature {

	/**
	 * Task Input Move Feature
	 * @param fp Feature provider.
	 */
	public TaskPortDiagramMoveFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		if (context.getSourceContainer() == context.getTargetContainer()) {
			ContainerShape containerShape = context.getTargetContainer();
			GraphicsAlgorithm invisibleRectangle = containerShape.getGraphicsAlgorithm();
			if (invisibleRectangle.getGraphicsAlgorithmChildren().size() > 0) {
				Object bo = getBusinessObjectForPictogramElement(context.getShape());
				if (bo instanceof TaskInput || bo instanceof TaskOutput) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public void moveShape(IMoveShapeContext context) {
		preMoveShape(context);
		moveAllBendpoints(context);
		internalMove(context);
		postMoveShape(context);
		
		IGaService gaService = Graphiti.getGaService();
		ContainerShape containerShape = context.getSourceContainer();
		GraphicsAlgorithm invisibleRectangle = containerShape.getGraphicsAlgorithm();
		if (invisibleRectangle.getGraphicsAlgorithmChildren().size() > 0) {
			GraphicsAlgorithm rectangle = invisibleRectangle.getGraphicsAlgorithmChildren().get(0);
			Shape shape = context.getShape();
			Object obj = getBusinessObjectForPictogramElement(shape);
			if (obj instanceof TaskInput || obj instanceof TaskOutput) {
				GraphicsAlgorithm inputga = shape.getGraphicsAlgorithm();
				final int newX = context.getX();
				final int newY = context.getY(); 
				
				if ((newX == 0 || newX == rectangle.getWidth() + NodeDiagramStyle.PORT_WIDTH)
					&& (newY == 0 || newY == rectangle.getHeight() + NodeDiagramStyle.PORT_WIDTH)) {
					gaService.setLocation(inputga, newX, newY);
				} else {
					int x = newX <= Math.abs(newX - (rectangle.getWidth() + NodeDiagramStyle.PORT_WIDTH)) ? 0 : rectangle.getWidth() + NodeDiagramStyle.PORT_WIDTH;
					int y = newY <= Math.abs(newY - (rectangle.getHeight() + NodeDiagramStyle.PORT_WIDTH)) ? 0 : rectangle.getHeight() + NodeDiagramStyle.PORT_WIDTH;
					
					if (TMLDiagramUtil.getDistance(newX, newY, x, newY) < TMLDiagramUtil.getDistance(newX, newY, newX, y)) {
						gaService.setLocation(inputga, x, newY);
					} else {
						gaService.setLocation(inputga, newX, y);
					}
				}
			}
		}
	}
}
