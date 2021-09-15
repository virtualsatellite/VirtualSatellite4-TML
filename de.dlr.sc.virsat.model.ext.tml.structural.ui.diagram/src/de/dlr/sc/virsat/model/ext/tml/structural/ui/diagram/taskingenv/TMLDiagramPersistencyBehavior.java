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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;

import de.dlr.sc.virsat.graphiti.ui.diagram.editor.VirSatDiagramPersistencyBehavior;

/**
 * 
 * @author nepa_ay
 *
 */
public class TMLDiagramPersistencyBehavior extends VirSatDiagramPersistencyBehavior {

	/**
	 * Standard constructor
	 * @param diagramBehavior the diagram behavior
	 */
	public TMLDiagramPersistencyBehavior(DiagramBehavior diagramBehavior) {
		super(diagramBehavior);
	}

	@Override
	public void saveDiagram(IProgressMonitor monitor) {
		super.saveDiagram(monitor);
	}

	@Override
	public boolean isDirty() {
		return super.isDirty();
	}	
}
