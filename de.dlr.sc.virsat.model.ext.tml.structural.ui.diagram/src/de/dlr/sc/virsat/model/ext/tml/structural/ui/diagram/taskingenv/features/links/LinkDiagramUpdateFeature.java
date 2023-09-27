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
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.dlr.sc.virsat.graphiti.ui.diagram.feature.VirSatUpdateFeature;

/**
 * 
 * @author nepa_ay
 *
 */
public class LinkDiagramUpdateFeature extends VirSatUpdateFeature {

	private boolean changeDuringUpdate;

	/**
	 * 
	 * @param fp IFeatureProvider
	 */
	public LinkDiagramUpdateFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		Connection connection = (Connection) context.getPictogramElement();
		if (null == getBusinessObjectForPictogramElement(connection)) {
			return Reason.createTrueReason("Link has been deleted.");
		}
		Object sourceBean = getBusinessObjectForPictogramElement(connection.getStart());
		Object targetBean = getBusinessObjectForPictogramElement(connection.getEnd());
		if (sourceBean == null || targetBean == null) {
			return Reason.createTrueReason("Bean element has been deleted.");
		}
		return Reason.createFalseReason();
	}

	@Override
	public boolean update(IUpdateContext context) {
		changeDuringUpdate = false;
		// There is nothing to update.
		return changeDuringUpdate;
	}

	@Override
	public boolean hasDoneChanges() {
		return changeDuringUpdate;
	}

	@Override
	public boolean isAvailable(IContext context) {
		return false;
	}
}
