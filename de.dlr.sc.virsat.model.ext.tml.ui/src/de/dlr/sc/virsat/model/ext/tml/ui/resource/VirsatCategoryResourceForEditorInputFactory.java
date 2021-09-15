/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.ui.resource;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory;
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory;

import com.google.inject.Inject;

import de.dlr.sc.virsat.model.ext.tml.resource.VirSatAwareXtextResourceSet;
import de.dlr.sc.virsat.model.ext.tml.resource.VirsatReferenceableXtextResource;
import de.dlr.sc.virsat.model.ext.tml.ui.editor.VirsatCategoryXtextEditorInput;
import de.dlr.sc.virsat.project.resources.VirSatResourceSet;

/**
 * 
 * @author fran_tb
 *
 */
public class VirsatCategoryResourceForEditorInputFactory extends ResourceForIEditorInputFactory implements IResourceForEditorInputFactory {

	@Inject
	private IResourceFactory resourceFactory;
	
	@Override
	public Resource createResource(IEditorInput editorInput) {
		// Do exactly the same strategy as in the parent classes method
		// but put an additional check for the creation of a VirsatCategoryEditorInput
		// Resource and ResourceSet into the front. This will be called in
		// case of an EquatioNSectionEditorInput. In all other cases handle the
		// Inputs in the standard way. Be aware that we dont derive from the
		// JVM factory.
		try {
			if (editorInput instanceof VirsatCategoryXtextEditorInput) {
				Resource result = createResourceFor((VirsatCategoryXtextEditorInput) editorInput);
				if (result != null) {
					return result;
				}
			} else {
				Resource result = super.createResource(editorInput);
				if (result != null) {
					return result;
				}
			}
		} catch (CoreException e) {
			throw new WrappedException(e);
		}
		throw new IllegalArgumentException("Couldn't create EMF Resource for input " + editorInput);
	}
	
	/**
	 * This method creates the resource for an VirsatCategoryXtextEditorInput.
	 * It takes care of connecting the ResourceSets of the Xtext world. With
	 * the Resource Sets of the VirSat world. Same with the resources.
	 * @param virsatCategoryXtextEditorInput The EditorInput that tells which EquationSectionContainer to load
	 * @return the resource well set up with the link to the VirSat resource
	 * @throws CoreException throws
	 */
	protected Resource createResourceFor(VirsatCategoryXtextEditorInput virsatCategoryXtextEditorInput) throws CoreException {
		// Get the storage to the EditorInput
		IStorage storage = virsatCategoryXtextEditorInput.getStorage();
		
		// Now get the ResourceSet by calling the resourceSet provider
		// Make sure that the VirSatResourceSet from the EditorInput
		// is well registered in case we got the correct type of
		// resourceSet. We will need these links for later scoping.
		ResourceSet resourceSet = getResourceSet(storage);
		URI uri = URI.createPlatformResourceURI(storage.getFullPath().toString(), true);
		configureResourceSet(resourceSet, uri);
		if (resourceSet instanceof VirSatAwareXtextResourceSet) {
			VirSatAwareXtextResourceSet virsatCategoryResourceSet = (VirSatAwareXtextResourceSet) resourceSet;
			VirSatResourceSet virSatResourceSet = virsatCategoryXtextEditorInput.getVirSatResourceSet();
			virsatCategoryResourceSet.addReferencedResourceSet(virSatResourceSet);
		}
		
		// Now its time to create the resource. Rather than calling the resource factory
		// we already now the type of resource we will need. We expect an VirsatReferenceableXtextResource
		// that will allow us to create a direct link from the resource for displaying the calculations
		// to the StructuralElementInstance resource which contains further information such as the
		// ValuePropertyInstances. This link is also very important for the Scoping of the XtextEditor.
		// We should investigate what happens with the resource link in case that the ResourceSet got asked to 
		// reload the resource. This case happens for example if an XMI resource is manually
		// changed within a text editor and stored to disk.
		URI uriForResource = uri; 
		if (!uri.isPlatform()) {
			uriForResource = resourceSet.getURIConverter().normalize(uri);
		}
		XtextResource resource = (XtextResource) resourceFactory.createResource(uriForResource);
		resourceSet.getResources().add(resource);
		resource.setValidationDisabled(isValidationDisabled(uri, storage));
		if (resource instanceof VirsatReferenceableXtextResource) {
			VirsatReferenceableXtextResource virsatReferenceableXtextResource = (VirsatReferenceableXtextResource) resource;
			virsatReferenceableXtextResource.setContainerResource(virsatCategoryXtextEditorInput.getVirSatResource(), virsatCategoryXtextEditorInput);
		}
		
		// Resource should be created here and well set up with all needed
		// links to the resource set as well as the links from the xtextResource
		// to the VirSat resource.
		return resource;
	}
	
}
