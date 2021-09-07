/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.links;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import de.dlr.sc.virsat.graphiti.util.DiagramHelper;

/**
 * 
 * @author nepa_ay
 *
 */
public class LinkDiagramAddFeature extends AbstractAddFeature { 

	/**
	 * 
	 * @param fp IFeatureProvider
	 */
	public LinkDiagramAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if (context instanceof IAddConnectionContext) {
			IAddConnectionContext connectionContext = (IAddConnectionContext) context;
			return DiagramHelper.hasDiagramWritePermission(connectionContext.getSourceAnchor());
		} 
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		if (!(context instanceof IAddConnectionContext)) {
			return null;
		}
		
		Object link = context.getNewObject();
		IAddConnectionContext connectionContext = (IAddConnectionContext) context;
		Anchor sourceAnchor = connectionContext.getSourceAnchor();
		Anchor targetAnchor = connectionContext.getTargetAnchor();
		
		Connection connection = null;
		if (sourceAnchor != null && targetAnchor != null) {
			if (!sourceAnchor.equals(targetAnchor)) {
				IPeCreateService peCreateService = Graphiti.getPeCreateService();
				connection = peCreateService.createFreeFormConnection(getDiagram());
				connection.setStart(sourceAnchor);
				connection.setEnd(targetAnchor);
				
				IGaService gaService = Graphiti.getGaService();
				Polyline polyline = gaService.createPlainPolyline(connection);
				polyline.setLineWidth(LinkDiagramStyle.LINK_WIDTH);
				polyline.setLineStyle(LinkDiagramStyle.LINK_STYLE);
				polyline.setForeground(manageColor(LinkDiagramStyle.LINK_COLOR));
				polyline.setBackground(manageColor(LinkDiagramStyle.LINK_COLOR));
				link(connection, link);
			}
		}
		return connection;
	}
}


