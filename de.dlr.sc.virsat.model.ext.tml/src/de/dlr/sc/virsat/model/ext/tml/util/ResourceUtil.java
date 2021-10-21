/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.dmf.DObject;
import de.dlr.sc.virsat.model.dvlm.dmf.DObjectContainer;
import de.dlr.sc.virsat.model.dvlm.general.IName;
import de.dlr.sc.virsat.model.dvlm.structural.StructuralElementInstance;
import de.dlr.sc.virsat.model.dvlm.structural.util.StructuralElementInstanceHelper;
import de.dlr.sc.virsat.model.ext.tml.resource.VirsatReferenceableXtextResource;
import de.dlr.sc.virsat.project.editingDomain.VirSatEditingDomainRegistry;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;
import de.dlr.sc.virsat.project.resources.VirSatResourceSet;
import de.dlr.sc.virsat.project.resources.dmf.DmfResource;
import de.dlr.sc.virsat.project.resources.dmf.DmfResourceFactory;

/**
 * Some general EMF Resource Utilities
 * 
 * @author fisc_ph
 *
 */
public class ResourceUtil {

	protected static String taskingEnvironmentName = "TaskingEnvironment";
	protected static String taskDefinitionName = "TaskDefinition";
	protected static String taskingDefinitionName = "TaskingDefinition";

	/**
	 * Hide the constructor it is a utility class
	 */
	private ResourceUtil() {
	}

	public static final String DIAGRAM_FILE_EXTENSION = "tml_system";

	/**
	 * hands back the Eclipse Workspace Resource of a given EMF Resource
	 * 
	 * @param emfResource
	 *            The EMF Resource
	 * @return hand back the workspace / platform resource as IFile
	 */
	public static IFile getFilefromEMFResource(Resource emfResource) {
		URI normalizedUri = emfResource.getResourceSet().getURIConverter().normalize(emfResource.getURI());
		String scheme = normalizedUri.scheme();
		if ("platform".equals(scheme) && normalizedUri.segmentCount() > 1
				&& "resource".equals(normalizedUri.segment(0))) {
			StringBuffer platformResourcePath = new StringBuffer();
			for (int j = 1, size = normalizedUri.segmentCount(); j < size; ++j) {
				platformResourcePath.append('/');
				platformResourcePath.append(normalizedUri.segment(j));
			}
			return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformResourcePath.toString()));
		}
		return null;
	}

	/**
	 * Hands back the IFile with a given URI from a EMF Resource Set
	 * 
	 * @param resourceURI
	 *            The URI of the file to be handed back
	 * @param resourceSet
	 *            the EMF ResourceSet in which to look for the file.
	 * @return hands back an Eclipse platform IFile
	 */
	public static IFile getFilefromEMFUri(URI resourceURI, ResourceSet resourceSet) {
		URI normalizedUri = resourceSet.getURIConverter().normalize(resourceURI);
		String scheme = normalizedUri.scheme();
		if ("platform".equals(scheme) && normalizedUri.segmentCount() > 1
				&& "resource".equals(normalizedUri.segment(0))) {
			StringBuffer platformResourcePath = new StringBuffer();
			for (int j = 1, size = normalizedUri.segmentCount(); j < size; ++j) {
				platformResourcePath.append('/');
				platformResourcePath.append(normalizedUri.segment(j));
			}
			return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformResourcePath.toString()));
		}
		return null;
	}

	/**
	 * hands back a DMF Resource for a given VirSat URI
	 * 
	 * @param virsatUri
	 *            The VirSat specific URI
	 * @param resourceSet
	 *            The resourceSet in which the DMF Resource should reside
	 * @return the DMF Resource matching the given URI
	 */
	public static Resource getDMFResourcefromVirsatResourceURI(URI virsatUri, ResourceSet resourceSet) {
		URI dmfUri = virsatUri.appendFileExtension(DmfResource.DMF_FILENAME_EXTENSION);
		Resource dmfResource = resourceSet.getResource(dmfUri, true);
		if (dmfResource.isLoaded()) {
			dmfResource.unload();
			try {
				dmfResource.load(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return dmfResource;
	}

	/**
	 * Returns the DMF root container of a given structural element
	 * 
	 * @param structuralElementInstance
	 *            the structural element
	 * @return the DMF root container
	 */
	public static DObjectContainer getDMFRoot(StructuralElementInstance structuralElementInstance) {
		return getDMFRootfromVirsatResourceURI(structuralElementInstance.eResource().getURI(),
				structuralElementInstance.eResource().getResourceSet());
	}

	/**
	 * hands Back the DMF root object for a given VirSat specific URI
	 * 
	 * @param virsatUri
	 *            The URI for which to get the DMF resource
	 * @param resourceSet
	 *            the ResourceSet in which the DMF resource resides
	 * @return the DMF root object from the given resource
	 */
	public static DObjectContainer getDMFRootfromVirsatResourceURI(URI virsatUri, ResourceSet resourceSet) {
		DObjectContainer dmfRoot = null;
		Resource resource = getDMFResourcefromVirsatResourceURI(virsatUri, resourceSet);
		EObject fileRoot = (EObject) resource.getContents().get(0);
		if (fileRoot instanceof DObjectContainer) {
			dmfRoot = (DObjectContainer) fileRoot;
		}
		return dmfRoot;
	}

	/**
	 * hands back the Eclipse Platform path to a diagram corresponding to a VirSat
	 * URI
	 * 
	 * @param virsatModelURI
	 *            the VirSat specific URI
	 * @param diagramRoot
	 *            the Eobject which is the containing root object for the diagram
	 * @return the Eclipse platform path to the diagram file
	 */
	public static IPath getDiagramPath(URI virsatModelURI, EObject diagramRoot) {
		IPath filePath;
		String fileName = URI.decode(virsatModelURI.trimFileExtension().lastSegment());
		if (diagramRoot instanceof IName) {
			fileName = ((IName) diagramRoot).getName();
		}
		if (virsatModelURI.isPlatformResource()) {
			filePath = new Path(virsatModelURI.trimSegments(1).toPlatformString(true));
		} else if (virsatModelURI.isFile()) {
			filePath = new Path(virsatModelURI.trimSegments(1).toFileString());
		} else {
			throw new IllegalArgumentException("Unsupported URI: " + virsatModelURI); //$NON-NLS-1$
		}
		return filePath.append(fileName + "." + DIAGRAM_FILE_EXTENSION);
	}

	/**
	 * Convenience Method to either get or create and Editing Domain for a given
	 * Resource
	 * 
	 * @param resource
	 *            some EMF resource for which to get the Editing Domain
	 * @return The VirSatTransactionalEditingDomain for the given resource
	 */
	public static VirSatTransactionalEditingDomain getOrCreateVirsatEditingDomain(Resource resource) {
		IFile file = ResourceUtil.getFilefromEMFResource(resource);
		return getOrCreateVirsatEditingDomain(file);
	}

	/**
	 * Convenience Method to either get or create and Editing Domain for a given
	 * Eclipse PLatform file
	 * 
	 * @param resource
	 *            some Platform IFile for which to get the Editing Domain
	 * @return The VirSatTransactionalEditingDomain for the given platform Ifile
	 *         resource
	 */
	public static VirSatTransactionalEditingDomain getOrCreateVirsatEditingDomain(IFile resource) {
		IProject project = resource.getProject();
		VirSatResourceSet.getResourceSet(project); // Create editing domain if not existing
		return VirSatEditingDomainRegistry.INSTANCE.getEd(project);
	}

	/**
	 * Convenience method to register the DMF Resource Factory
	 */
	public static void registerDMFResourceFactory() {
		Resource.Factory.Registry resourceRegistry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = resourceRegistry.getExtensionToFactoryMap();
		m.put(DmfResource.DMF_FILENAME_EXTENSION, new DmfResourceFactory());
	}

	/**
	 * Returns the virsat structural element of a DMF object
	 * 
	 * @param treeObject
	 *            The DMF object
	 * @return the structural element
	 */
	public static StructuralElementInstance getSEIofDMFTreeElement(EObject treeObject) {
		Resource treeResource = treeObject.eResource();
		
		Resource dvlmResource = null;
		if (treeResource instanceof DmfResource) {
			dvlmResource = ((DmfResource) treeResource).getVirSatDvlmResource();
		} else if (treeResource instanceof VirsatReferenceableXtextResource) {
			dvlmResource = ((VirsatReferenceableXtextResource) treeResource).getContainerResource(); 
		} 
		
		StructuralElementInstance structuralElementInstance = null;
		if (dvlmResource != null && dvlmResource.getContents().size() > 0) {
			structuralElementInstance = (StructuralElementInstance) dvlmResource.getContents().get(0);
		}
		return structuralElementInstance;
	}

	/**
	 * Returns all TML-DMF root objects in the current structural element tree
	 * 
	 * @param treeElement
	 *            a DMF object
	 * @return a list of DMF objects
	 */
	public static List<EObject> getDObjectsInCurrentTree(EObject treeElement) {
		return getDObjectsinCurrentTree(getSEIofDMFTreeElement(treeElement));
	}

	/**
	 * Return all DMF elements in the current tree
	 * @param treeElement
	 * @param clazz Type of the DMF element
	 * @return List of the DMF elements
	 */
	public static Set<EObject> getAllDObjectsInCurrentTree(EObject treeElement, Class<?> clazz) {
		registerDMFResourceFactory();
		Set<EObject> ret = new HashSet<EObject>();
		// Get resource of structural element
		StructuralElementInstance sei;
		if (treeElement instanceof StructuralElementInstance) {
			sei = (StructuralElementInstance) treeElement;
		} else {
			sei = getSEIofDMFTreeElement(treeElement);
		}
		StructuralElementInstance root = getStructuralRootElement(sei);
		ret.addAll(getAllDObjectsInCurrentSEI(root, clazz));
		for (StructuralElementInstance superSei : root.getDeepChildren()) {
			ret.addAll(getAllDObjectsInCurrentSEI(superSei, clazz));
		}
		return ret;
	}
	
	/**
	 * Return all DMF elements in the current tree
	 * @param treeElement
	 * @param clazz Type of the DMF element
	 * @return List of the DMF elements
	 */
	public static Set<EObject> getAllDObjectsInCurrentSEI(EObject treeElement, Class<?> clazz) {
		registerDMFResourceFactory();
		Set<EObject> ret = new HashSet<EObject>();
		// Get resource of structural element
		StructuralElementInstance sei;
		if (treeElement instanceof StructuralElementInstance) {
			sei = (StructuralElementInstance) treeElement;
		} else {
			sei = getSEIofDMFTreeElement(treeElement);
		}
		if (sei != null && sei.eResource() != null) {
			URI virsatSeiUri = sei.eResource().getURI();
			ResourceSet resourceSet = sei.eResource().getResourceSet();
			
			//Get the DMF root container
			DObjectContainer dmfRoot = getDMFRootfromVirsatResourceURI(virsatSeiUri, resourceSet);
			
			ret.addAll(getAllDObjects(dmfRoot, clazz));
		}
		return ret;
	}
		
	/**
	 * Returns all TML-DMF root objects in the current structural element tree
	 * 
	 * @param structuralElement
	 *            a virsat structural element
	 * @return a list of DMF objects
	 */
	public static List<EObject> getDObjectsinCurrentTree(StructuralElementInstance structuralElement) {
		List<EObject> dmfRootObjects = new ArrayList<EObject>();
		StructuralElementInstance root = getStructuralRootElement(structuralElement);

		if (hasTMLCategory(root)) {
			addAllTMLDObjectRoots(dmfRootObjects, root);
		}

		for (StructuralElementInstance child : root.getDeepChildren()) {
			if (hasTMLCategory(child)) {
				addAllTMLDObjectRoots(dmfRootObjects, child);
			}
		}

		return dmfRootObjects;
	}

	/**
	 * Returns all TML related DObjects of a structural element
	 * 
	 * @param dObjects
	 *            The current list of DObjects
	 * @param structuralElementInstance
	 *            the structural element
	 */
	protected static void addAllTMLDObjectRoots(List<EObject> dObjects,
			StructuralElementInstance structuralElementInstance) {
		DObjectContainer dmfContainer = getDMFRoot(structuralElementInstance);
		if (dmfContainer != null) {
			for (EObject child : dmfContainer.eContents()) {
				if ((child instanceof de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition)
						|| (child instanceof de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment)) {
					dObjects.add(child);
				}
			}
		}
	}

	/**
	 * Returns if a structural element instance has a TML category
	 * 
	 * @param elementInstance
	 *            the structural element
	 * @return boolean that is true if the element has a TML category
	 */
	public static boolean hasTMLCategory(StructuralElementInstance elementInstance) {
		boolean hasTMLCategory = false;
		for (CategoryAssignment ca : elementInstance.getCategoryAssignments()) {
			if ((ca.getType().getName().equals(taskingEnvironmentName))
					|| (ca.getType().getName().equals(taskDefinitionName))
					|| (ca.getType().getName().equals(taskingDefinitionName))) {
				hasTMLCategory = true;
				break;
			}
		}
		return hasTMLCategory;
	}

	/**
	 * Return the root structural element of the current tree element
	 * 
	 * @param structuralElement
	 *            the current tree element
	 * @return the root structural element
	 */
	public static StructuralElementInstance getStructuralRootElement(StructuralElementInstance sei) {
		StructuralElementInstanceHelper helper = new StructuralElementInstanceHelper(sei);
		return (StructuralElementInstance) helper.getRoot();
	}

	/**
	 * Returns the DMF Container object of the given DMF object
	 * 
	 * @param treeObject
	 *            The DMF object. Should be a subtype of DObject
	 * @return the DMF Container
	 */
	public static DObjectContainer getDMFContainer(DObject treeObject) throws IllegalArgumentException {
		DObjectContainer dContainer = null;
		if (treeObject != null) {
			if (treeObject instanceof DObjectContainer) {
				dContainer = (DObjectContainer) treeObject;
			} else {
				EObject container = treeObject.eContainer();
				if (container != null) {
					if (container instanceof DObjectContainer) {
						dContainer = (DObjectContainer) container;
					} else if (container instanceof DObject) {
						dContainer = getDMFContainer((DObject) container);
					}
				}
			}
		}
		return dContainer;
	}
	
	/**
	 * Get URI for file.
	 * @param resourceFile File.
	 * @param resourceSet Resource set.
	 * @return URI of file.
	 */
	public static URI getFileURI(IFile resourceFile, ResourceSet resourceSet) {
		return getFileURI(resourceFile.getFullPath().toString(), resourceSet);		
	}
	
	/**
	 * Get Resource URI for file.
	 * @param resourceFile Resource file.
	 * @return
	 */
	public static URI getFileURI(IFile resourceFile) {
		IProject project = resourceFile.getProject();
		ResourceSet resourceSet = VirSatResourceSet.getResourceSet(project);
		return getFileURI(resourceFile, resourceSet);
	}
	
	/**
	 * Resource URI for file.
	 * @param path Absolute file path.
	 * @param resourceSet Resource set.
	 * @return URI of file.
	 */
	public static URI getFileURI(String path, ResourceSet resourceSet) {
		URI resourceURI = URI.createPlatformResourceURI(path, true);
		resourceURI = resourceSet.getURIConverter().normalize(resourceURI);
		return resourceURI;
	}

	/**
	 * Get DObject for clazz type with the given uuid
	 * @param dmfRoot
	 * @param clazz
	 * @param objectUUID
	 * @return DMF object, if found, otherwise null
	 */
	public static EObject getDObject(DObjectContainer dmfRoot, Class<?> clazz, String objectUUID) {		
		if (dmfRoot.eResource() != null) {		
			try {
				TreeIterator<EObject> allContents = dmfRoot.eResource().getAllContents();
				while (allContents.hasNext()) {
					EObject eObject = allContents.next();
					if (eObject instanceof DObject) {
						DObject dmfElement = (DObject) eObject;
						if (dmfElement.getUuid().toString().equals(objectUUID)) {
							if (dmfElement.getClass().isAssignableFrom(clazz) || clazz.isAssignableFrom(dmfElement.getClass())) {
								return dmfElement;
							} 
							String err = "DObject matching uuid is not of expected type.\n";
							err += "Expected type class: " + clazz.getTypeName() + "\n";
							err += "Actual type class: " + dmfElement.getClass().getTypeName();
							throw new IllegalArgumentException(err);
						}
					}
				}
				
			} catch (IllegalArgumentException ex) {
				System.err.println("Error message: " + ex.getMessage());
				ex.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Get DObject for clazz type with the given uuid
	 * @param dmfRoot
	 * @param clazz
	 * @return DMF object, if found, otherwise null
	 */
	public static List<EObject> getAllDObjects(DObjectContainer dmfRoot, Class<?> clazz) {	
		List<EObject> dmfElements = new ArrayList<EObject>();
		if (dmfRoot.eResource() != null) {		
			TreeIterator<EObject> allContents = dmfRoot.eResource().getAllContents();
			while (allContents.hasNext()) {
				EObject eObject = allContents.next();
				if (eObject instanceof DObject) {
					DObject dmfElement = (DObject) eObject;
					if (dmfElement.getClass().isAssignableFrom(clazz) 
						|| clazz.isAssignableFrom(dmfElement.getClass())) {
						dmfElements.add(dmfElement);
					}
				}
			}
		}
		return dmfElements;
	}
}
