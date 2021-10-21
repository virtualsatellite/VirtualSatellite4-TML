/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.source;

/**
 * Interface fo all kinf of source templates
 * @author fran_tb
 *
 */
public interface ISourceTemplate {

	/**
	 * Return the source code of the head file of an element
	 * @return source code as string
	 */
	String compileHeader();
	
	/**
	 * Return the source code of the source file of an element
	 * @return source code as string
	 */
	String compileSource();
	
	
	/**
	 * Return the abstract source code of the head file of an element
	 * @return source code as string
	 */
	String compileAbstractHeader();
	
	/**
	 * Return the abstract source code of the source file of an element
	 * @return source code as string
	 */
	String compileAbstractSource();
}
