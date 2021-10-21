/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

/**
 * This resource is capable of maintaining a link from the Xtext resource
 * to a VirSat resource this is needed for scoping and cross references
 * from within the Xtext editor to the VirSat DVLM model
 * 
 * @author fran_tb
 *
 */
public class VirsatReferenceableXtextResource extends LazyLinkingResource implements Resource {

	private Resource equationSectionContainerResource;
	private IXtextRootObjectProvider rootObjectProvider;
	
	/**
	 * Call this method to get the VirSatResource that is linked to this XtextResource
	 * @return the VirSat Resource that holds the DVLM EquationSectionContainer of the currently displayed equations in the Xtext Resource
	 */
	public Resource getContainerResource() {
		return equationSectionContainerResource;
	}
	
	/**
	 * Call this method to set a new VirSat Resource to be linked with this Xtext Resource
	 * @param equationSectionContainerResource the Resource which holds the DVLM EquationSectionContainer of the currently displayed equations
	 * @param equationSectionProvider provider for the associated editor subject
	 */
	public void setContainerResource(Resource equationSectionContainerResource, IXtextRootObjectProvider equationSectionProvider) {
		this.equationSectionContainerResource = equationSectionContainerResource;
		this.rootObjectProvider = equationSectionProvider;
	}
	
	/**
	 * Get the associated editor subject editor input
	 * @return the associated editor subject editor input
	 */
	public EObject getEditorSubject() {
		return rootObjectProvider.getResourceRootObject();
	}
}
