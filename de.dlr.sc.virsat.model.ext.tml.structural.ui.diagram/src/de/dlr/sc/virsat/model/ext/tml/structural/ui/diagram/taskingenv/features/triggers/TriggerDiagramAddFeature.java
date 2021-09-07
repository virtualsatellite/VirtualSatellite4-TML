/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.triggers;


import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.dlr.sc.virsat.graphiti.ui.diagram.feature.VirSatAddShapeFeature;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.ext.tml.structural.model.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TimeEvent;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.nodes.NodeDiagramStyle;

/**
 * 
 * @author nepa_ay
 *
 */
public class TriggerDiagramAddFeature extends VirSatAddShapeFeature {

	static final int TRIGGER_MIN_WIDTH = 100;
	static final int TRIGGER_MIN_HEIGHT = NodeDiagramStyle.PORT_WIDTH;
	static final double TRIGGER_ARROW_PART = 0.10;
	
	private IPeCreateService peCreateService; 
	private IGaService gaService;
	
	/**
	 * Trigger Diagram Add Feature
	 * @param fp Feature provider.
	 */
	public TriggerDiagramAddFeature(IFeatureProvider fp) {
		super(fp);
		peCreateService = Graphiti.getPeCreateService();
		gaService = Graphiti.getGaService();
	}

	@Override
	public boolean canAdd(IAddContext context) {
		return context.getTargetContainer() instanceof Diagram && super.canAdd(context);
	}
	
	@Override
	public PictogramElement add(IAddContext context) {
		IBeanCategoryAssignment bean = (IBeanCategoryAssignment) context.getNewObject();
		if (!(bean instanceof Channel || bean instanceof TimeEvent)) {
			return null;
		}
		ContainerShape targetContainer = context.getTargetContainer();	
		
		ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
		// create link and wire it
        link(containerShape, bean);
        
        // add a chopbox anchor to the shape
        ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(containerShape);
		link(boxAnchor, bean);
	    
		// check whether the context has a size (e.g. from a create feature)
	    // otherwise define a default size for the shape
	    int width = context.getWidth() <= 0 ? TRIGGER_MIN_WIDTH : context.getWidth();
	    int height = context.getHeight() <= 0 ? TRIGGER_MIN_HEIGHT : context.getHeight();
	    
	    Polygon polygon = gaService.createPlainPolygon(containerShape, getPolygon(bean, width, height));
		polygon.setBackground(getColor(bean));
		polygon.setLineWidth(1);
		gaService.setLocationAndSize(polygon, context.getX(), context.getY(), width, height);
		link(containerShape, bean);
		
		Shape nameShape = peCreateService.createShape(containerShape, false);
		Text nameText = gaService.createText(nameShape, bean.getName());	    	
		nameText.setForeground(manageColor(IColorConstant.BLACK));	
		nameText.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);	
		nameText.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		Font nameFont = gaService.manageFont(getDiagram(), NodeDiagramStyle.LABEL_FONT_NAME, NodeDiagramStyle.LABEL_FONT_SIZE, false, false);
		nameText.setFont(nameFont);
		gaService.setLocationAndSize(nameText, 0, 0, polygon.getWidth(), polygon.getHeight());
		
	    IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(containerShape);
		directEditingInfo.setPictogramElement(containerShape);
		directEditingInfo.setGraphicsAlgorithm(nameText);
		
	    // call the layout feature
	    layoutPictogramElement(containerShape);
	    
	    return containerShape;
	}

	/**
	 * getPolygon
	 * @param bean bean
	 * @param width width
	 * @param height height
	 * @return points
	 */
	public static int[] getPolygon(IBeanCategoryAssignment bean, int width, int height) {
		final int arrowHead = (int) (width * (1 - TRIGGER_ARROW_PART));
		if (bean instanceof Channel) {
			return new int[] {0, 0, arrowHead, 0, width, height / 2, arrowHead, height, 0, height, (int) (width * TRIGGER_ARROW_PART), height / 2};
		} else {
			return new int[] {0, 0, arrowHead, 0, width, height / 2, arrowHead, height, 0, height};
		}
	}
	
	/**
	 * 
	 * @param bean IBeanCategoryAssignment bean
	 * @return Color constant.
	 */
	private Color getColor(IBeanCategoryAssignment bean) {
		if (bean instanceof Channel) {
			return manageColor(NodeDiagramStyle.COLOR_CONST_CHANNEL);
		} else {
			return manageColor(NodeDiagramStyle.COLOR_CONST_TIMEEVENT);
		}
	} 
}
