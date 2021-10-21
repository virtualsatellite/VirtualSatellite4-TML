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

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

/**
 * Class provides icons for the diagram - palette etc.
 * @author nepa_ay
 *
 */
public class TMLDiagramIconProvider extends AbstractImageProvider {

	public static final String ID = "de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.TMLDiagramIconProvider";

	public static final String ICON_PATH = "resources/icons/";
	public static final String ICON_EXT = ".gif";
	
	public static final String GRAPH_ICON = ICON_PATH + "tml_graph" + ICON_EXT;
	public static final String VIRSAT_EDITOR_ICON = ICON_PATH + "virsat_editor" + ICON_EXT;
		
	@Override
	protected void addAvailableImages() {
		addImageFilePath(GRAPH_ICON, GRAPH_ICON);
		addImageFilePath(VIRSAT_EDITOR_ICON, VIRSAT_EDITOR_ICON);
				
		// Icons for the palette	
	}

}
