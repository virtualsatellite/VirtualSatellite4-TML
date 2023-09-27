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

import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.util.ColorConstant;

/**
 * 
 * @author nepa_ay
 *
 */
public abstract class LinkDiagramStyle {
	
	public static final ColorConstant LINK_COLOR = new ColorConstant(100, 100, 100);
	
	public static final int LINK_WIDTH = 1;
	
	public static final LineStyle LINK_STYLE = LineStyle.DASH; 
	
}