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

import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

/**
 * 
 * @author nepa_ay
 *
 */
public abstract class NodeDiagramStyle {
	
	public static final int LINE_WIDTH_THIN = 1;
	public static final int LINE_WIDTH_NORMAL = 2;
	public static final int LINE_WIDTH_THICK = 3;
	public static final int LINE_WIDTH_THICKER = 5;
		
	public static final int WIDTH = 100;
	public static final int HEIGHT = 70;
	public static final int CORNER_SHAPE = 20;
		
	public static final String LABEL_FONT_NAME = "Arial";
	public static final int LABEL_FONT_SIZE = 9;
	public static final int LABEL_FONT_SIZE_L = 10;
	public static final int LABEL_FONT_SIZE_XL = 12;
	public static final int LABEL_OFFSET = 5;
	
	public static final int MIN_WIDTH = 100;
	public static final int MIN_HEIGHT = 100;
	
	public static final int PORT_WIDTH = 22;

	public static final IColorConstant COLOR_CONST_TASK = new ColorConstant(180, 220, 250);
	public static final IColorConstant COLOR_CONST_TASKPORT = new ColorConstant(230, 230, 230);
	public static final IColorConstant COLOR_CONST_CHANNEL = new ColorConstant(230, 230, 230);
	public static final IColorConstant COLOR_CONST_TIMEEVENT = new ColorConstant(255, 180, 180);

	public static final IColorConstant FORECOLOR_NORMAL = IColorConstant.BLACK;
	public static final IColorConstant FORECOLOR_ERROR = IColorConstant.RED;

	public static final String NULL_TEXT = "NULL";
}
