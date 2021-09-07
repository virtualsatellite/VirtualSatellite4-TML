/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.resource;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author fisc_ph
 *
 */
public interface IXtextRootObjectProvider {
	
	/**
	 * Hands back the root object of a given resource
	 * @return the eObject which is the root object of a resource
	 */
	EObject getResourceRootObject();
	
	/**
	 * Call this method to get the file ending of the current resource
	 * @return the filename extension of the current resource
	 */
	String getResourceFileEnding();

}
