/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.tasks;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;

import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.nodes.NodeDiagramStyle;

/**
 * 
 * @author nepa_ay
 *
 */
public class TaskDiagramResizeFeature extends DefaultResizeShapeFeature {
			
	/**
	 * TML Structural Resize Shape Feature
	 * @param fp Feature Provider
	 */
	public TaskDiagramResizeFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public void resizeShape(IResizeShapeContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (pe instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pe;
			if (cs.getGraphicsAlgorithm() != null) {
				int width = Math.max(context.getWidth(), NodeDiagramStyle.MIN_WIDTH);
				int height = Math.max(context.getHeight(), NodeDiagramStyle.MIN_HEIGHT);
				Graphiti.getGaService().setLocationAndSize(cs.getGraphicsAlgorithm(), context.getX(), context.getY(), width, height);	
				layoutPictogramElement(cs);
			}
		}
	}
}
