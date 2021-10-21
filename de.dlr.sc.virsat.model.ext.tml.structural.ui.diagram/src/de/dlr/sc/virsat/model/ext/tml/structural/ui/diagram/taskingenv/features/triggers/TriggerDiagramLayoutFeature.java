/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
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
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;


/**
 * 
 * @author nepa_ay
 *
 */
public class TriggerDiagramLayoutFeature extends AbstractLayoutFeature {

	/**
	 * 
	 * @param fp IFeatureProvider
	 */
	public TriggerDiagramLayoutFeature(IFeatureProvider fp) {
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
        GraphicsAlgorithm polygon = containerShape.getGraphicsAlgorithm();
         
        List<GraphicsAlgorithm> gaChildren = containerShape.getChildren().stream().map(s -> s.getGraphicsAlgorithm()).collect(Collectors.toList());
        for (GraphicsAlgorithm ga : gaChildren) {
        	// adjust height and width of name label.
        	if (ga instanceof Text) {
        		gaService.setLocationAndSize(ga, 0, 0, polygon.getWidth(), polygon.getHeight());
        		anythingChanged = true;
        	} 
        }
		return anythingChanged;
	}

}
