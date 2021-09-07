/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.tasks;

import org.eclipse.graphiti.util.ColorConstant;

/**
 * 
 * @author nepa_ay
 *
 */
public abstract class TaskDiagramStyle {
	
	public static final int WIDTH = 150;
	public static final int HEIGHT = 70;
	public static final int CORNER_SHAPE = 20;
		
	public static final int LABEL_OFFSET = 12;
	public static final String LABEL_FONT_NAME = "Arial";
	public static final int LABEL_FONT_SIZE = 9;
	
	public static final int MIN_WIDTH = 100;
	public static final int MIN_HEIGHT = 100;
	
	public static final int PORT_WIDTH = 30;

	public static final ColorConstant COLOR_CONST_TASK = new ColorConstant(180, 200, 255);
	public static final ColorConstant COLOR_CONST_TASKPORT = new ColorConstant(230, 230, 230);
	public static final ColorConstant COLOR_CONST_CHANNEL = new ColorConstant(200, 200, 200);
	public static final ColorConstant COLOR_CONST_TIMEEVENT = new ColorConstant(255, 180, 180);
	
}
