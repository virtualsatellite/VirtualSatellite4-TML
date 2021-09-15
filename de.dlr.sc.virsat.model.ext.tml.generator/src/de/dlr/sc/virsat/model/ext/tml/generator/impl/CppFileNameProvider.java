/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.impl;

import de.dlr.sc.virsat.model.dvlm.general.IName;
import de.dlr.sc.virsat.model.ext.tml.generator.IFileNameProvider;

/**
 * File name provide for cpp source files
 * @author fran_tb
 *
 */
public class CppFileNameProvider implements IFileNameProvider {

	@Override
	public String getHeaderFileName(IName element) {
		return getHeaderFileName(element.getName());
	}

	@Override
	public String getHeaderFileName(String className) {
		return className + ".h";
	}
	
	@Override
	public String getSourceFileName(IName element) {
		return getSourceFileName(element.getName());
	}

	@Override
	public String getSourceFileName(String className) {
		return className + ".cpp";
	}
	
	@Override
	public String getAbstractHeaderFileName(IName element) {
		return getAbstractHeaderFileName(element.getName());
	}

	@Override
	public String getAbstractHeaderFileName(String className) {
		return "A" + className + ".h";
	}
	
	@Override
	public String getAbstractSourceFileName(IName element) {
		return getAbstractSourceFileName(element.getName());
	}
	
	@Override
	public String getAbstractSourceFileName(String className) {
		return "A" + className + ".cpp";
	}
	
	@Override
	public String getCmakeListsFilename() {
		return "CMakeLists.txt";
	}

	@Override
	public String getTestHeaderFilename(String className) {
		return "test" + className + ".h";
	}

	@Override
	public String getTestSourceFilename(String className) {
		return "test" + className + ".cpp";
	}

}