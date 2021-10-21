/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features;

import java.util.stream.Collectors;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstance;

/**
 * TML Structural Change Name Feature
 * @author nepa_ay
 *
 */
public class TMLDiagramChangeNameFeature extends AbstractCustomFeature {

	/**
	 * Constructor
	 * @param fp Feature provider.
	 */
	public TMLDiagramChangeNameFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canExecute(ICustomContext context) {
		Object obj = getBusinessObjectForPictogramElement(context.getInnerPictogramElement());
		return obj instanceof TaskInstance;
	}

	@Override
	public void execute(ICustomContext context) {
		ContainerShape container = (ContainerShape) context.getInnerPictogramElement();
		Text nameLabel = (Text) container.getChildren().stream()
			.filter(s -> s.getGraphicsAlgorithm() instanceof Text).collect(Collectors.toList()).get(0).getGraphicsAlgorithm();
		
		IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(container);
		directEditingInfo.setPictogramElement(container);
		directEditingInfo.setGraphicsAlgorithm(nameLabel);
		directEditingInfo.setActive(true);
		getDiagramBehavior().refresh();
	}

	@Override
	public boolean hasDoneChanges() {
		return false;
	}

	@Override
	public String getName() {
		return "Change Name";
	}
	
	@Override
	public String getDescription() {
		return "Change the Name of this object.";
	}
}
