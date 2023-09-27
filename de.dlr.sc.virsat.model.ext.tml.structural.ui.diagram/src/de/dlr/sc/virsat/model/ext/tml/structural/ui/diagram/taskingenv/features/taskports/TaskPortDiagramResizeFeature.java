/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.taskports;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;

/**
 * 
 * @author nepa_ay
 *
 */
public class TaskPortDiagramResizeFeature extends DefaultResizeShapeFeature {
			
	/**
	 * TML Structural Resize Shape Feature
	 * @param fp Feature Provider
	 */
	public TaskPortDiagramResizeFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canResizeShape(IResizeShapeContext context) {
		return false;
	}
	
}
