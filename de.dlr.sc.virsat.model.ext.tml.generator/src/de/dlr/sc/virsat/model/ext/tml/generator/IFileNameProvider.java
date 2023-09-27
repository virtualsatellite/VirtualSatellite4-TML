/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator;

import de.dlr.sc.virsat.model.dvlm.general.IName;

/**
 * Interface for file name providers
 * @author fran_tb
 *
 */
public interface IFileNameProvider {

	/**
	 * Get name for header files of the given element
	 * @param element source element as part
	 * @return name
	 */
	String getHeaderFileName(IName element);
	
	/**
	 * Get name for source files of the given element
	 * @param element source element as part
	 * @return name
	 */
	String getSourceFileName(IName element);
	
	/**
	 * Get name for the abstract header files of the given element
	 * -Using generation gap pattern
	 * @param element source element as part
	 * @return name
	 */
	String getAbstractHeaderFileName(IName element);
	
	/**
	 * Get name for the abstract source files of the given element
	 * -Using generation gap pattern
	 * @param element source element as part
	 * @return name
	 */
	String getAbstractSourceFileName(IName element);
	
	/**
	 * Get name for header file for the given class with name
	 * @param className class name
	 * @return header filename for the class
	 */
	String getHeaderFileName(String className);
	
	/**
	 * Get name for source file for the given class with name
	 * @param className class name
	 * @return source filename for the class
	 */
	String getSourceFileName(String className);

	/**
	 * Get name for abstract header file for the given class with name
	 * @param className class name
	 * @return abstract header filename for the class
	 */
	String getAbstractHeaderFileName(String className);
	
	/**
	 * Get name for abstract source file for the given class with name
	 * @param className class name
	 * @return abstract source filename for the class
	 */
	String getAbstractSourceFileName(String className);
	
	/**
	 * Get CMakeLists Filename
	 * @return "CMakeLists.txt"
	 */
	String getCmakeListsFilename();
		
	/**
	 * Get name for unit-test header file for the given class with name
	 * @param className class name
	 * @return unit-test header filename
	 */
	String getTestHeaderFilename(String className);
	
	/**
	 * Get name for unit-test source file for the given class with name
	 * @param className class name
	 * @return unit-test source filename
	 */
	String getTestSourceFilename(String className);
}
