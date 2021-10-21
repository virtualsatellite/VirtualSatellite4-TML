/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.palette;

import org.eclipse.gef.ui.palette.PaletteViewerProvider;
import org.eclipse.graphiti.ui.editor.DefaultPaletteBehavior;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;

/**
 * 
 * @author nepa_ay
 *
 */
public class TMLPaletteBehaviour extends DefaultPaletteBehavior {

	/**
	 * TMLStructuralPaletteBehaviour
	 * @param diagramBehavior diagramBehavior
	 */
	public TMLPaletteBehaviour(DiagramBehavior diagramBehavior) {
		super(diagramBehavior);
	}

	@Override
	protected PaletteViewerProvider createPaletteViewerProvider() {
		return new TMLPaletteViewerProvider(diagramBehavior.getEditDomain());
	}
}
