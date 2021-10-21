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
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.util.IColorConstant;

import de.dlr.sc.virsat.graphiti.ui.diagram.feature.VirSatUpdateFeature;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.TMLDiagramUtil;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.nodes.NodeDiagramStyle;

/**
 * 
 * @author nepa_ay
 *
 */
public class TaskDiagramUpdateFeature extends VirSatUpdateFeature {

	private boolean changedDuringUpdate;
	
	/**
	 * TaskDiagramUpdateFeature
	 * @param fp feature provider.
	 */
	public TaskDiagramUpdateFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canUpdate(IUpdateContext context) {
		return context.getPictogramElement() instanceof ContainerShape && super.canUpdate(context);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		boolean needUpdate = false;
		ContainerShape container = (ContainerShape) context.getPictogramElement();
		TaskInstance task = (TaskInstance) getBusinessObjectForPictogramElement(container);
		
		List<GraphicsAlgorithm> labels = container.getChildren().stream()
												.map(s -> s.getGraphicsAlgorithm())
												.filter(g -> g instanceof AbstractText)
												.collect(Collectors.toList());
		if (labels.size() > 0) {
			AbstractText nameLabel = (AbstractText) labels.get(0);
			needUpdate |= updateNeededNameLabel(nameLabel, task);
		}
		if (labels.size() > 1) {
			AbstractText typeLabel = (AbstractText) labels.get(1);
			needUpdate |= updateNeededTypeLabel(typeLabel, task);
		}
		
		if (!needUpdate) {
			Set<IBeanCategoryAssignment> allTaskInputsInDiagram = TMLDiagramUtil.getBeanObjectsFromDiagramRecursive(getFeatureProvider(), container, TaskInput.class);
			needUpdate |= allTaskInputsInDiagram.size() != task.getInputs().size();
			needUpdate |= !allTaskInputsInDiagram.containsAll(task.getInputs());
		}
		if (!needUpdate) {
			Set<IBeanCategoryAssignment> allTaskOutputsInDiagram = TMLDiagramUtil.getBeanObjectsFromDiagramRecursive(getFeatureProvider(), container, TaskOutput.class);
			needUpdate |= allTaskOutputsInDiagram.size() != task.getOutputs().size();
			needUpdate |= !allTaskOutputsInDiagram.containsAll(task.getOutputs());
		}
		
		return needUpdate ? Reason.createTrueReason("Model has been changed.") : Reason.createFalseReason();
	}
	
	@Override
	public boolean update(IUpdateContext context) {
		ContainerShape container = (ContainerShape) context.getPictogramElement();
		TaskInstance task = (TaskInstance) getBusinessObjectForPictogramElement(container);
		
		List<GraphicsAlgorithm> labels = container.getChildren().stream()
				.map(s -> s.getGraphicsAlgorithm())
				.filter(g -> g instanceof AbstractText)
				.collect(Collectors.toList());

		if (labels.size() > 0) {
			AbstractText nameLabel = (AbstractText) container.getChildren().get(0).getGraphicsAlgorithm();
			updateNameLabel(nameLabel, task);
		}
		if (labels.size() > 1) {
			AbstractText typeLabel = (AbstractText) container.getChildren().get(1).getGraphicsAlgorithm();
			updateTypeLabel(typeLabel, task);
		}

		List<Shape> ports = container.getChildren().stream()
											.filter(s -> s.getGraphicsAlgorithm() instanceof Polygon)
											.collect(Collectors.toList());
		
		IFeatureProvider fp = getFeatureProvider();
		changedDuringUpdate |= TMLDiagramUtil.removeDeletedPictogramElements(fp, ports);
		changedDuringUpdate |= TMLDiagramUtil.addMissingPorts(fp, container);
		
		return changedDuringUpdate;
	}
	
	@Override
	public boolean hasDoneChanges() {
		return changedDuringUpdate;
	}

	@Override
	public boolean isAvailable(IContext context) {
		return false;
	}
	
	/**
	 * Check if name label needs update
	 * @param label
	 * @param task
	 * @return True, if label needs update
	 */
	private boolean updateNeededNameLabel(AbstractText label, TaskInstance task) {
		boolean ret = false;
		String labelText = task.getName();
		ret |= labelTextUpdateNeeded(labelText, label.getValue());
		return ret;
	}
	
	/**
	 * Check if type label needs update
	 * @param label
	 * @param task
	 * @return True, if label needs update
	 */
	private boolean updateNeededTypeLabel(AbstractText label, TaskInstance task) {	
		boolean ret = false;
		String labelText = getTypeLabelText(task);
		ret |= labelTextUpdateNeeded(labelText, label.getValue());
		
		Color sollForecolor = getTypeLabelForecolor(task);			
		ret |= labelForeColorUpdateNeeded(sollForecolor, label.getForeground());
	
		return ret;
	}
	
	/**
	 * Update name label
	 * @param label
	 * @param task
	 */
	private void updateNameLabel(AbstractText label, TaskInstance task) {
		String newText = task.getName();
		if (!label.getValue().equals(newText)) {
			label.setValue(newText);
			changedDuringUpdate = true;
		}
	}
	
	/**
	 * Update type label
	 * @param label
	 * @param task
	 */
	private void updateTypeLabel(AbstractText label, TaskInstance task) {
		String newText = getTypeLabelText(task);
		if (!label.getValue().equals(newText)) {
			label.setValue(newText);
			changedDuringUpdate = true;
		}
		Color newColor = getTypeLabelForecolor(task);
		if (labelForeColorUpdateNeeded(newColor, label.getForeground())) {
			label.setForeground(newColor);
			changedDuringUpdate = true;
		}
	}
	
	/**
	 * Compares two texts
	 * @param text1
	 * @param text2
	 * @return 
	 */
	private boolean labelTextUpdateNeeded(String text1, String text2) {
		if (!text1.equals(text2)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Check if the color are same
	 * @param color1
	 * @param color2
	 * @return True, if colors are different
	 */
	private boolean labelForeColorUpdateNeeded(Color color1, Color color2) {
		return color1.getRed() != color2.getRed() || color1.getGreen() != color2.getGreen() || color1.getBlue() != color2.getBlue();
	}
	
	/**
	 * Get type label text
	 * @param task
	 * @return
	 */
	private String getTypeLabelText(TaskInstance task) {
		String type = task.getTypeOf() == null ? NodeDiagramStyle.NULL_TEXT : task.getTypeOf().getName();
		return type;
	}
	
	/**
	 * Get type label forecolor
	 * @param task
	 * @return
	 */
	private Color getTypeLabelForecolor(TaskInstance task) {
		IColorConstant color = task.getTypeOf() == null ? NodeDiagramStyle.FORECOLOR_ERROR : NodeDiagramStyle.FORECOLOR_NORMAL;
		return manageColor(color);
	}
}
