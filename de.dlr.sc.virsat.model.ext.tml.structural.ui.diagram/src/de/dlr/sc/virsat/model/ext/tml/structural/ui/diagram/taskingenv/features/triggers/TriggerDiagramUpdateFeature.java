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

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

import de.dlr.sc.virsat.graphiti.ui.diagram.feature.VirSatUpdateFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.model.IEventSource;

/**
 * 
 * @author nepa_ay
 *
 */
public class TriggerDiagramUpdateFeature extends VirSatUpdateFeature {

	private boolean changed;

	/**
	 * 
	 * @param fp Feature Provider
	 */
	public TriggerDiagramUpdateFeature(IFeatureProvider fp) {
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
		
		Object bo = getBusinessObjectForPictogramElement(container);
		needUpdate |= !(bo instanceof IEventSource);
		
		if (!needUpdate) {
			IEventSource trigger = (IEventSource) bo;
			
			List<GraphicsAlgorithm> labels = container.getChildren().stream()
					.map(s -> s.getGraphicsAlgorithm())
					.filter(g -> g instanceof AbstractText)
					.collect(Collectors.toList());
			
			if (labels.size() > 0) {
				AbstractText nameLabel = (AbstractText) labels.get(0);
				needUpdate |= updateNeededNameLabel(nameLabel, trigger.getName());
			}
		}
		
		return needUpdate ? Reason.createTrueReason("Model has been changed.") : Reason.createFalseReason();
	}

	/**
	 * Check if name label needs update
	 * @param label
	 * @param task
	 * @return True, if label needs update
	 */
	private boolean updateNeededNameLabel(AbstractText label, String name) {
		boolean ret = false;
		ret |= !label.getValue().equals(name);
		return ret;
	}
	
	@Override
	public boolean update(IUpdateContext context) {
		ContainerShape container = (ContainerShape) context.getPictogramElement();
		List<GraphicsAlgorithm> labels = container.getChildren().stream()
				.map(s -> s.getGraphicsAlgorithm())
				.filter(g -> g instanceof AbstractText)
				.collect(Collectors.toList());
		
		if (labels.size() > 0) {
			IEventSource trigger = (IEventSource) getBusinessObjectForPictogramElement(container);
			AbstractText nameLabel = (AbstractText) labels.get(0);
			nameLabel.setValue(trigger.getName());
			changed = true;
		}
		
		return changed;
	}
	
	
	@Override
	public boolean hasDoneChanges() {
		return changed;
	}

	@Override
	public boolean isAvailable(IContext context) {
		return false;
	}
}
