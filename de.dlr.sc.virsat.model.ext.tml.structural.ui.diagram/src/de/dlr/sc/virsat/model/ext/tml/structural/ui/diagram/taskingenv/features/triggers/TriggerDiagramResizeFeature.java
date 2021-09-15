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

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;

import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;

/**
 * 
 * @author nepa_ay
 *
 */
public class TriggerDiagramResizeFeature extends DefaultResizeShapeFeature {
			
	/**
	 * Trigger Diagram Resize Feature
	 * @param fp Feature Provider
	 */
	public TriggerDiagramResizeFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public void resizeShape(IResizeShapeContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (pe instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pe;
			if (cs.getGraphicsAlgorithm() instanceof Polygon) {
				int width = Math.max(context.getWidth(), TriggerDiagramAddFeature.TRIGGER_MIN_WIDTH);
				int height = Math.max(context.getHeight(), TriggerDiagramAddFeature.TRIGGER_MIN_HEIGHT);
				IBeanCategoryAssignment bean = (IBeanCategoryAssignment) getBusinessObjectForPictogramElement(pe);		
				List<Point> points = Graphiti.getGaService().createPointList(TriggerDiagramAddFeature.getPolygon(bean, width, height));
				Polygon polygon = (Polygon) cs.getGraphicsAlgorithm();
				polygon.getPoints().clear();
				polygon.getPoints().addAll(points);
				Graphiti.getGaService().setLocationAndSize(polygon, context.getX(), context.getY(), width, height);	
				layoutPictogramElement(cs);
			}
		}
	}
}
