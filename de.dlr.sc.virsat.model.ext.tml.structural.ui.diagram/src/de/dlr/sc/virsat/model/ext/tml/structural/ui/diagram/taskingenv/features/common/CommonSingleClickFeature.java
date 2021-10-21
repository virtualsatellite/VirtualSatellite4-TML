/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;

/**
 * Common single click feature
 * @author nepa_ay
 *
 */
public class CommonSingleClickFeature extends AbstractCustomFeature {

	public CommonSingleClickFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canExecute(ICustomContext context) {
		return true;
	}
	
	@Override
	public void execute(ICustomContext context) {
		getDiagram().getChildren().stream().forEach(pe -> {
			getDiagramBehavior().refreshRenderingDecorators(pe);
		});
	}
	
}
