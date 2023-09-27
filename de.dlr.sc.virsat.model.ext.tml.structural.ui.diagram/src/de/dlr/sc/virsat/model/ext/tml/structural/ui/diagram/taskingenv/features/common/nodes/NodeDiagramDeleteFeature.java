/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.nodes;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.graphiti.features.IFeatureProvider;

import de.dlr.sc.virsat.model.concept.types.IBeanDelete;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.CommonDeleteFeature;

/**
 * 
 * @author nepa_ay
 *
 */
public class NodeDiagramDeleteFeature extends CommonDeleteFeature {
	
	/**
	 * TML Node Diagram Delete Feature
	 * @param fp Feature Provider
	 */
	public NodeDiagramDeleteFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	protected void deleteBusinessObject(Object obj) {
		IBeanDelete bean = (IBeanDelete) obj;
		EditingDomain ed = getDiagramBehavior().getEditingDomain();
		ed.getCommandStack().execute(bean.delete(ed));
	}
}
