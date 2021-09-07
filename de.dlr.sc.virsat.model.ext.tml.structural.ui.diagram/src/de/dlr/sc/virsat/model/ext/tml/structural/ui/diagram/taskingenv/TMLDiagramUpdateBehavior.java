/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;

import de.dlr.sc.virsat.graphiti.ui.diagram.editor.VirSatDiagramUpdateBehavior;

/**
 * Class to handle updating of diagram
 * @author nepa_ay
 *
 */
public class TMLDiagramUpdateBehavior extends VirSatDiagramUpdateBehavior {

	public TMLDiagramUpdateBehavior(DiagramBehavior diagramBehavior) {
		super(diagramBehavior);
	}

	@Override
	public void handleActivate() {
		updateDiagram();
		diagramBehavior.refreshContent();
		diagramBehavior.refreshRenderingDecorators(diagramBehavior.getDiagramTypeProvider().getDiagram());
		super.handleActivate();
	}
	
	/**
	 * Updates the diagram
	 */
	private void updateDiagram() {
		IDiagramTypeProvider diagramTypeProvider = diagramBehavior.getDiagramTypeProvider();
		Diagram diagram = diagramTypeProvider.getDiagram();
		IFeatureProvider featureProvider = diagramTypeProvider.getFeatureProvider();
		IUpdateContext updateCtx = new UpdateContext(diagram);
		featureProvider.updateIfPossible(updateCtx);
	}
}
