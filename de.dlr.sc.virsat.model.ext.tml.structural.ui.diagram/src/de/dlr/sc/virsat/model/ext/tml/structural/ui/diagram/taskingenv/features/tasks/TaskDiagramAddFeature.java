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


import org.apache.commons.lang.WordUtils;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.dlr.sc.virsat.graphiti.ui.diagram.feature.VirSatAddShapeFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.nodes.NodeDiagramStyle;

/**
 * 
 * @author nepa_ay
 *
 */
public class TaskDiagramAddFeature extends VirSatAddShapeFeature {

	private IPeCreateService peCreateService; 
	private IGaService gaService;
	
	/**
	 * ChannelDiagramAddFeature
	 * @param fp Feature provider.
	 */
	public TaskDiagramAddFeature(IFeatureProvider fp) {
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
		TaskInstance taskInstance = (TaskInstance) context.getNewObject();
		
		ContainerShape targetContainer = context.getTargetContainer();	
		
		ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
		// create link and wire it
        link(containerShape, taskInstance);
        
		// check whether the context has a size (e.g. from a create feature)
	    // otherwise define a default size for the shape
	    int width = context.getWidth() <= 0 ? NodeDiagramStyle.WIDTH : context.getWidth();
	    int height = context.getHeight() <= 0 ? NodeDiagramStyle.HEIGHT : context.getHeight();
	    
	    // reset height to fit input and output ports vertically
	    int maxPortCount = Math.max(taskInstance.getOutputs().size(), taskInstance.getInputs().size());
        height = Math.max(height, maxPortCount * NodeDiagramStyle.PORT_WIDTH);
	    
        int labelLocX = NodeDiagramStyle.PORT_WIDTH;
		int labelLocY = NodeDiagramStyle.PORT_WIDTH;
		int labelWidth = width;
		int labelHeight = height;
		
		// create invisible outer rectangle expanded by
        // the width needed for the anchor
        Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
		gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width + NodeDiagramStyle.PORT_WIDTH * 2, height + NodeDiagramStyle.PORT_WIDTH * 2);
        
        // create and set visible rectangle inside invisible rectangle
        RoundedRectangle innerRectangle = gaService.createRoundedRectangle(invisibleRectangle, NodeDiagramStyle.CORNER_SHAPE, NodeDiagramStyle.CORNER_SHAPE);
        innerRectangle.setBackground(manageColor(NodeDiagramStyle.COLOR_CONST_TASK));
        innerRectangle.setLineWidth(NodeDiagramStyle.LINE_WIDTH_NORMAL);
        gaService.setLocationAndSize(innerRectangle, NodeDiagramStyle.PORT_WIDTH, NodeDiagramStyle.PORT_WIDTH, width, height);
 	    
		Shape nameShape = peCreateService.createShape(containerShape, false);
		String name = taskInstance.getName();
		AbstractText nameText = createNameLabel(nameShape, name);
		gaService.setLocationAndSize(nameText, labelLocX, labelLocY, labelWidth, labelHeight);
		
		Shape typeShape = peCreateService.createShape(containerShape, false);
		String type = taskInstance.getTypeOf() == null ? NodeDiagramStyle.NULL_TEXT : taskInstance.getTypeOf().getName();
		AbstractText typeText = createTypeLabel(typeShape, type);
		gaService.setLocationAndSize(typeText, labelLocX, labelLocY, labelWidth, labelHeight);
		
		addTaskInputShapes(context, containerShape, taskInstance);
	    
		addTaskOutputShapes(context, containerShape, taskInstance);
			    
	    return containerShape;
	}

	/**
	 * Get label for figure.
	 * @param shape Label shape.
	 * @param labelText Label text string.
	 * @param isItalic Label text is italic-faced.
	 * @param isBold Label text is bold-faced.
	 * @return Text object.
	 */
	private AbstractText getLabel(Shape shape, String labelText, IColorConstant forecolor, 
			boolean isItalic, boolean isBold, Orientation horizontalAlignment, Orientation verticalAlignment) {
		String wrappedText = WordUtils.wrap(labelText, 1);
		AbstractText text = gaService.createMultiText(shape, wrappedText);	 
		text.setForeground(manageColor(forecolor));	
		text.setHorizontalAlignment(horizontalAlignment);	
		text.setVerticalAlignment(verticalAlignment);
		Font font = gaService.manageFont(getDiagram(), NodeDiagramStyle.LABEL_FONT_NAME, NodeDiagramStyle.LABEL_FONT_SIZE, isItalic, isBold);
		text.setFont(font);
		return text;
	}
	
	/**
	 * 
	 * @param nameShape
	 * @param labelText
	 * @return
	 */
	private AbstractText createNameLabel(Shape nameShape, String labelText) {
		return getLabel(nameShape, labelText, NodeDiagramStyle.FORECOLOR_NORMAL, 
				false, false, Orientation.ALIGNMENT_CENTER, Orientation.ALIGNMENT_TOP);
	}
	
	/**
	 * 
	 * @param typeShape
	 * @param labelText
	 * @return
	 */
	private AbstractText createTypeLabel(Shape typeShape, String labelText) {
		return getLabel(typeShape, labelText, NodeDiagramStyle.FORECOLOR_NORMAL, 
				false, true, Orientation.ALIGNMENT_CENTER, Orientation.ALIGNMENT_BOTTOM);
	}
	
	/**
	 * 
	 * @param context
	 * @param containerShape
	 * @param taskInstance
	 */
	private void addTaskInputShapes(IAddContext context, ContainerShape containerShape, TaskInstance taskInstance) {
		int posY = 0;
		for (TaskInput taskInput : taskInstance.getInputs()) {
			AddContext addContext = new AddContext(context, taskInput);
			addContext.setTargetContainer(containerShape);
			addContext.setX(0);
			addContext.setY((++posY) * NodeDiagramStyle.PORT_WIDTH);
			getFeatureProvider().getAddFeature(addContext).add(addContext);	
		}
	}
	
	/**
	 * 
	 * @param context
	 * @param containerShape
	 * @param taskInstance
	 */
	private void addTaskOutputShapes(IAddContext context, ContainerShape containerShape, TaskInstance taskInstance) {
		int posY = 0;
		for (TaskOutput taskOutput : taskInstance.getOutputs()) {
			AddContext addContext = new AddContext(context, taskOutput);
			addContext.setTargetContainer(containerShape);
			addContext.setX(containerShape.getGraphicsAlgorithm().getWidth() - NodeDiagramStyle.PORT_WIDTH);
			addContext.setY((++posY) * NodeDiagramStyle.PORT_WIDTH);
			getFeatureProvider().getAddFeature(addContext).add(addContext);	
		}
	}
}
