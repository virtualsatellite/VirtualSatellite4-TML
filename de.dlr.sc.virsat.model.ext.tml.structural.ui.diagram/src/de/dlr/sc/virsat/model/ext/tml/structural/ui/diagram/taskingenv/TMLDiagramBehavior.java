/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.editor.DefaultPaletteBehavior;
import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;
import org.eclipse.graphiti.ui.editor.DefaultUpdateBehavior;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;

import de.dlr.sc.virsat.graphiti.ui.diagram.editor.VirSatDiagramBehavior;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.palette.TMLPaletteBehaviour;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.providers.TMLDiagramContextMenuProvider;

/**
 * 
 * @author nepa_ay
 *
 */
public class TMLDiagramBehavior extends VirSatDiagramBehavior {

	/**
	 * 
	 * @param diagramContainer diagramContainer
	 */
	public TMLDiagramBehavior(IDiagramContainerUI diagramContainer) {
		super(diagramContainer);
	}

	@Override
	protected DefaultPaletteBehavior createPaletteBehaviour() {
		return new TMLPaletteBehaviour(this);
	}

	@Override
	protected ContextMenuProvider createContextMenuProvider() {
		return new TMLDiagramContextMenuProvider(getDiagramContainer().getGraphicalViewer(),
				getDiagramContainer().getActionRegistry(), getConfigurationProvider());
	}
	
	@Override
	public Point calculateRealMouseLocation(Point nativeLocation) {
		try {
			return super.calculateRealMouseLocation(nativeLocation);
		} catch (RuntimeException e) {
			return new Point(nativeLocation);
		}
	}
	
	@Override
	public void refresh() {
		super.refresh();
	}
	
	@Override
	protected DefaultPersistencyBehavior createPersistencyBehavior() {
		return new TMLDiagramPersistencyBehavior(this);
	}
	
	@Override
	protected DefaultUpdateBehavior createUpdateBehavior() {
		return new TMLDiagramUpdateBehavior(this);
	}
	
	@Override
	public void refreshRenderingDecorators(PictogramElement pe) {
		IDiagramContainerUI container = getDiagramContainer();
		GraphicalViewer graphicalViewer = container.getGraphicalViewer();
		if (graphicalViewer != null) {
			super.refreshRenderingDecorators(pe);
		}
	}

}
