/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common;

import java.text.MessageFormat;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IMultiDeleteInfo;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

/**
 * 
 * @author nepa_ay
 *
 */
public class CommonDeleteFeature extends DefaultDeleteFeature implements IMenuActionFeature {
	
	/**
	 * Common Delete Feature
	 * @param fp Feature Provider
	 */
	public CommonDeleteFeature(IFeatureProvider fp) {
		super(fp);
	}
		
	@Override
	protected boolean getUserDecision(IDeleteContext context) {
		String msg;
		IMultiDeleteInfo multiDeleteInfo = context.getMultiDeleteInfo();
		if (multiDeleteInfo != null) {
			msg = MessageFormat.format("Are you sure you want to delete these {0} elements ?", multiDeleteInfo.getNumber());
			return MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Confirm Delete", msg);
		} 
		return true;
	}

	@Override
	public String getName() {
		return "Delete";
	}
	
	@Override
	public String getDescription() {
		return "Delete selected element(s)";
	}
	
	@Override
	public String getImageId() {
		return IPlatformImageConstants.IMG_EDIT_DELETE;
	}
	
}
