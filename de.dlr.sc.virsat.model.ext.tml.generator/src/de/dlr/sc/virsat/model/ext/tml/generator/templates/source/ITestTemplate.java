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
 * @author nepa_ay
 * Interface for unit test files
 */
public interface ITestTemplate {

	/**
	 * Get test file header content
	 * @return file content as string
	 */
	String compileHeader();
	
	/**
	 * Get test file source content
	 * @return file content as string
	 */
	String compileSource();

}
