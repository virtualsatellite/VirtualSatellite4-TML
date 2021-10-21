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

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
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
public class TaskDiagramLayoutFeature extends AbstractLayoutFeature {

	/**
	 * 
	 * @param fp IFeatureProvider
	 */
	public TaskDiagramLayoutFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = false;
		
		IGaService gaService = Graphiti.getGaService();
        ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
        GraphicsAlgorithm invisibleRectangle = containerShape.getGraphicsAlgorithm();
 
    	// the containerGa is the invisible rectangle
        // containing the visible rectangle as its (first and only) child
        GraphicsAlgorithm rectangle = invisibleRectangle.getGraphicsAlgorithmChildren().get(0);
        
    	// height of invisible rectangle
        if (invisibleRectangle.getHeight() < NodeDiagramStyle.MIN_HEIGHT) {
            invisibleRectangle.setHeight(NodeDiagramStyle.MIN_HEIGHT);
            anythingChanged = true;
        }
 
        // width of invisible rectangle
        if (invisibleRectangle.getWidth() < NodeDiagramStyle.MIN_WIDTH) {
            invisibleRectangle.setWidth(NodeDiagramStyle.MIN_WIDTH);
            anythingChanged = true;
        }
        
        // width of visible rectangle (smaller than invisible rectangle)
        int rectangleWidth = invisibleRectangle.getWidth() - NodeDiagramStyle.PORT_WIDTH * 2;
        if (rectangle.getWidth() != rectangleWidth) {
            rectangle.setWidth(rectangleWidth);
            anythingChanged = true;
        }
        
        // height of visible rectangle (smaller than invisible rectangle)
        int rectangleHeight = invisibleRectangle.getHeight() - NodeDiagramStyle.PORT_WIDTH * 2;
        if (rectangle.getHeight() != rectangleHeight) {
            rectangle.setHeight(rectangleHeight);
            anythingChanged = true;
        }
        
        List<GraphicsAlgorithm> gaChildren = containerShape.getChildren().stream().map(s -> s.getGraphicsAlgorithm()).collect(Collectors.toList());
        for (GraphicsAlgorithm ga : gaChildren) {
        	// adjust height and width of name and type labels.
        	if (ga instanceof AbstractText) {
        		int locX = NodeDiagramStyle.PORT_WIDTH;
        		int locY = NodeDiagramStyle.PORT_WIDTH;
        		int width = rectangle.getWidth();
        		int height = rectangle.getHeight();
        		gaService.setLocationAndSize(ga, locX, locY, width, height);
        		anythingChanged = true;
        	} else {
        		Object obj = getBusinessObjectForPictogramElement(ga.getPictogramElement());
        		if (obj instanceof TaskInput || obj instanceof TaskOutput) {
        			final int X = ga.getX();
    				final int Y = ga.getY(); 
					if (X >= 0 && X <= rectangleWidth + NodeDiagramStyle.PORT_WIDTH
						&& Y >= 0 && Y <= rectangleHeight + NodeDiagramStyle.PORT_WIDTH) {
						int x = X <= Math.abs(X - (rectangle.getWidth() + NodeDiagramStyle.PORT_WIDTH)) ? 0 : rectangle.getWidth() + NodeDiagramStyle.PORT_WIDTH;
						int y = Y <= Math.abs(Y - (rectangle.getHeight() + NodeDiagramStyle.PORT_WIDTH)) ? 0 : rectangle.getHeight() + NodeDiagramStyle.PORT_WIDTH;
						
						if (TMLDiagramUtil.getDistance(X, Y, x, Y) < TMLDiagramUtil.getDistance(X, Y, X, y)) {
							gaService.setLocation(ga, x, Y);
						} else {
							gaService.setLocation(ga, X, y);
						}
					} else {	
    					int x = Math.min(Math.max(0, X), (rectangle.getWidth() + NodeDiagramStyle.PORT_WIDTH));
    					int y = Math.min(Math.max(0, Y), (rectangle.getHeight() + NodeDiagramStyle.PORT_WIDTH));
    					gaService.setLocation(ga, x, y);
    				}
        			anythingChanged = true;
        		}
        	} 
        }
		return anythingChanged;
	}

}
