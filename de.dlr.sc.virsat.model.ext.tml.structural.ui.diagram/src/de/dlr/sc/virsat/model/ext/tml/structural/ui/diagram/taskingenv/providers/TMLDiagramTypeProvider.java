/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.providers;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

/**
 * 
 * @author fran_tb
 *
 */
public class TMLDiagramTypeProvider extends AbstractDiagramTypeProvider {
	
	public static final String STRUCTURAL_CONCEPT_ID = "de.dlr.sc.virsat.model.ext.tml.structural";
	public static final String BEHAVIORAL_CONCEPT_ID = "de.dlr.sc.virsat.model.ext.tml.behavioral";
	public static final String PROVIDER_ID = "de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.TMLStructuralTypeProvider";
	public static final String DIAGRAM_TYPE_ID = "de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv";

	private IToolBehaviorProvider[] toolBehaviorProviders;
	
	/**
	 * Default Constructor
	 */
	public TMLDiagramTypeProvider() {
		super();
		setFeatureProvider(new TMLDiagramFeatureProvider(this));
	}
	
	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if (toolBehaviorProviders == null) {
			toolBehaviorProviders =
					new IToolBehaviorProvider[] { new TMLDiagramToolBehaviorProvider(this) };
		}
		return toolBehaviorProviders;
	}
	
	@Override
	public boolean isAutoUpdateAtStartup() {
		return true;
	}

	@Override
	public boolean isAutoUpdateAtRuntime() {
		return true;
	}

	@Override
	public boolean isAutoUpdateAtRuntimeWhenEditorIsSaved() {
		return true;
	}
}
