/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.ui.editor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.util.StringInputStream;

import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.dmf.DObject;
import de.dlr.sc.virsat.model.dvlm.general.IName;
import de.dlr.sc.virsat.model.dvlm.general.IUuid;
import de.dlr.sc.virsat.model.ext.tml.resource.IXtextRootObjectProvider;
import de.dlr.sc.virsat.model.ext.tml.resource.VirSatAwareXtextResourceSet;
import de.dlr.sc.virsat.model.ext.tml.util.ResourceUtil;
import de.dlr.sc.virsat.project.Activator;
import de.dlr.sc.virsat.project.editingDomain.VirSatEditingDomainRegistry;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;
import de.dlr.sc.virsat.project.resources.VirSatResourceSet;
import de.dlr.sc.virsat.project.resources.dmf.DmfResource;

/**
 * Generic editor input for xtext editors based on virsat concept extensions in
 * DMF.
 * 
 * @author fran_tb
 *
 */
public abstract class VirsatCategoryXtextEditorInput extends FileEditorInput
		implements IPersistableElement, IXtextRootObjectProvider {

	/**
	 * Creates an editor input for a VirsatCategoryXtextEditor
	 * 
	 * @param resourceFile
	 *            resource file of the virtual xtext file
	 * @param uri
	 *            the file's URI
	 * @param container
	 *            the container element of the new content
	 * @param subject
	 *            the current content of the model part to be edited
	 */
	public VirsatCategoryXtextEditorInput(IFile resourceFile, URI uri, CategoryAssignment container,
			CategoryAssignment subject) {
		super(resourceFile);
		this.resourceFile = resourceFile;
		this.originalUri = uri;
		this.dmfUri = uri.appendFileExtension(DmfResource.DMF_FILENAME_EXTENSION);
		try {
			this.proxyFile = createFileProxy();
			this.dmfRoot = getDMFRootContainerForUri();
			this.dmfContainer = getContainerFromDMFRoot(dmfRoot, container);
			this.dmfSubject = getSubjectFromDMFRoot(dmfRoot, container, subject);
			if (dmfSubject == null) {
				reintegrateEditorSubject(getInitialSubject(), "");	 // To ensure correct subject scope
			}
			this.virSatResource = getEditingDomain().getResourceSet().getResource(uri, true);
		} catch (Exception e) {
			System.err.println("Could not load file!");
			e.printStackTrace();
		}

	}

	/**
	 * Creates an editor input for a VirsatCategoryXtextEditor
	 * 
	 * @param resourceFile
	 *            resource file of the virtual xtext file
	 * @param uri
	 *            the file's URI
	 */
	public VirsatCategoryXtextEditorInput(IFile resourceFile, URI uri) {
		super(resourceFile);
		this.resourceFile = resourceFile;
		this.originalUri = uri;
		this.dmfUri = uri.appendFileExtension(DmfResource.DMF_FILENAME_EXTENSION);
		try {
			this.proxyFile = createFileProxy();
			this.dmfRoot = getDMFRootContainerForUri();
			this.dmfContainer = dmfRoot;
			this.virSatResource = getEditingDomain().getResourceSet().getResource(uri, true);
		} catch (Exception e) {
			System.err.println("Could not load file!");
			e.printStackTrace();
		}

	}

	// DMF view
	protected URI dmfUri;
	protected EObject dmfContainer;
	protected EObject dmfSubject;
	protected ResourceSet dmfResourceSet;
	protected Resource dmfResource;
	protected EObject dmfRoot;
	protected IFile dmfResourceFile;

	// Virsat view
	protected URI originalUri;
	protected Resource virSatResource;
	private IFile resourceFile;
	private IFile proxyFile;
	private static final String EMPTY_CONTENT = "";

	@Override
	public abstract String getFactoryId();

	@Override
	public abstract int hashCode();

	/**
	 * Method to reintegrate the editor content into the data model
	 * 
	 * @param subject
	 *            The model part in the editor
	 * @param serializedData
	 *            the textual editor content
	 */
	public abstract void reintegrateEditorSubject(EObject subject, String serializedData);

	/**
	 * Create and initial empty subject, that can be integrated into the container
	 * tree to initialize subject's scope
	 * 
	 * @return an empty subject
	 */
	protected abstract EObject getInitialSubject();

	/**
	 * Get the Memento ID
	 * 
	 * @return Memento ID as String
	 */
	protected abstract String getMementoIdURI();

	/**
	 * Get the editor DMF subject from the DMF root
	 * 
	 * @param dmfRoot
	 *            The root element of the DMF model view
	 * @param container
	 *            The editor element container as category assignment
	 * @param subject
	 *            The element to be edited as category assignment
	 * @return The element to be edited as DMF object
	 */
	protected abstract EObject getSubjectFromDMFRoot(EObject dmfRoot, CategoryAssignment container,
			CategoryAssignment subject);

	/**
	 * Get the editor DMF container from the DMF root
	 * 
	 * @param dmfRoot
	 *            The root element of the DMF model view
	 * @param container
	 *            The editor element container as category assignment
	 * @return The container element as DMF object
	 */
	protected abstract EObject getContainerFromDMFRoot(EObject dmfRoot, CategoryAssignment container);

	/**
	 * Returns the textual editor content
	 * 
	 * @return the editor content as string
	 */
	public abstract String getSerializedInput();

	/**
	 * method to retrieve the current Resource which belongs to the project in which
	 * this EditorInput points to.
	 * 
	 * @return the VirSatResourceSet
	 */
	public Resource getVirSatResource() {
		return virSatResource;
	}

	/**
	 * Save the DMF resource
	 */
	protected void saveDMFResource() {
		try {
			dmfResource.save(Collections.EMPTY_MAP);
		} catch (Exception e) {
			System.err.println("Could not save dmf file");
			e.printStackTrace();
		}
	}

	/**
	 * Method to replace the old model element against the new, edited one
	 * 
	 * @param oldSubject
	 *            the old model element
	 * @param newSubject
	 *            the new model element
	 */
	protected void updateSubject(EObject oldSubject, EObject newSubject) {
		// Merge elements into new subject
		updateElement(oldSubject, newSubject);

		// Replace old against new subject in container
		EObject container = oldSubject.eContainer();
		EReference feature = oldSubject.eContainmentFeature();
		if (FeatureMapUtil.isMany(container, feature)) {
			@SuppressWarnings("unchecked")
			List<Object> list = (List<Object>) container.eGet(feature);
			list.set(list.indexOf(oldSubject), newSubject);
		} else {
			container.eSet(feature, newSubject);
		}
		dmfSubject = newSubject;
	}

	/**
	 * Recursively update all edited elements - Copy old UUID to new elements - If
	 * elements do not have a UUID, then map elements by name
	 * 
	 * @param oldElement
	 *            Old model element
	 * @param newElement
	 *            New model element
	 */
	public void updateElement(EObject oldElement, EObject newElement) {
		// Update UUID
		if (oldElement instanceof IUuid && newElement instanceof IUuid) {
			((IUuid) newElement).setUuid(((IUuid) oldElement).getUuid());
		}
		for (EObject content : newElement.eContents()) {
			// If other elements are able to reference the content (if it has a
			// name) the UUID needs to be updated
			if (content instanceof IName) {
				EObject oldChildElement = null;
				for (EObject oldContent : oldElement.eContents()) {
					if (oldContent instanceof IName) {
						if (((IName) oldContent).getName() != null) {
							if (((IName) oldContent).getName().equals(((IName) content).getName())) {
								oldChildElement = oldContent;
							}
						} else {
							if (oldContent.toString().equals(content.toString())) {
								oldChildElement = oldContent;
							}
						}
					}
				}
				// If it has existed before, updated its ID
				if (oldChildElement != null) {
					updateElement(oldChildElement, content);
				}
			}
		}

	}

	/**
	 * Removes the editor subject if the input is empty
	 */
	public void removeSubject() {
		if (dmfSubject != null) {
			EcoreUtil.remove(dmfSubject);
		}
		dmfSubject = null;
		saveDMFResource();
	}

	/**
	 * Get the virsat resource set of a file in a virsat project
	 * 
	 * @return vrisat resource set
	 */
	public VirSatResourceSet getVirSatResourceSet() {
		IProject project = resourceFile.getProject();
		return VirSatResourceSet.getResourceSet(project);
	}

	/**
	 * Get the virsat editing domain
	 * 
	 * @return editing domain
	 */
	protected VirSatTransactionalEditingDomain getEditingDomain() {
		return VirSatEditingDomainRegistry.INSTANCE.getEd(getVirSatResourceSet());
	}

	// CHECKSTYLE:OFF
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof VirsatCategoryXtextEditorInput)) {
			return false;
		}
		VirsatCategoryXtextEditorInput other = (VirsatCategoryXtextEditorInput) obj;
		return dmfUri.equals(other.getUri());
	}
	// CHECKSTYLE:ON

	/**
	 * Hands back the URI of this EditorInput
	 * 
	 * @return the current URI
	 */
	protected URI getUri() {
		return dmfUri;
	}

	@Override
	public String getName() {

		if (dmfSubject != null && dmfSubject instanceof DObject) {
			return ((DObject) dmfSubject).getName();
		} else {
			return "";
		}

	}

	@Override
	public IFile getFile() {
		return proxyFile;
	}

	/**
	 * Call this method to find out if the resource itself is in a dirty state. We
	 * will need this information to correctly store the XtextEditor in case it is
	 * saved The equations are a subset of the total XMI model. Thus when the Xtext
	 * editor saves it will update the part of the EMF DVLM model of e.g. a
	 * StructuralElementInstance and then it needs to hit the save functionality
	 * through the editing domain
	 * 
	 * @return true in case the resource is considered dirty
	 */
	public boolean isDirtyResource() {
		return getEditingDomain().isDirty(virSatResource)
				|| (dmfSubject != null && ((DObject) dmfSubject).getName() == null);
	}

	/**
	 * This method accesses the ResourceSet which belongs to the resourceFile
	 * Associated to this EditorInput. From this file the resource set as well as
	 * the final resource is accessed to load it and ask it for its content. This
	 * method should get called regularly to load directly from the resource and for
	 * not missing resource updates and reloads, which are handled by the VirSat
	 * Resource Set. This happens for example if a resource is changed in a text
	 * editor directly in the XMI.
	 * 
	 * @return The EquationSectionCOntainer of the currently loaded resource
	 * @throws IllegalArgumentException
	 *             throws exception
	 * @throws IOException
	 *             throws exception
	 */
	private EObject getDMFRootContainerForUri() throws IllegalArgumentException, IOException {

		ResourceUtil.registerDMFResourceFactory();

		dmfResourceSet = new ResourceSetImpl();
		dmfResource = dmfResourceSet.getResource(dmfUri, true);

		return dmfResource.getContents().get(0);
	}

	/**
	 * This method creates the file Proxy that redirects the question for the files
	 * content. rather than handing back the correct DVLM file content it will make
	 * sure that the equations part will be taken and handed back
	 * 
	 * @return the file Proxy
	 * @throws IllegalArgumentException
	 *             throws exception
	 * @throws IOException
	 *             throws exception
	 */
	private IFile createFileProxy() throws IllegalArgumentException, IOException {

		return (IFile) Proxy.newProxyInstance(VirsatCategoryXtextEditorInput.class.getClassLoader(),
				new Class<?>[] { IFile.class }, new VirsatCategoryInvocationHandler());
	}

	/**
	 * Create an initial serialization of model elements Still used?
	 * 
	 * @return the Xtext string repesentation of the model element
	 */
	@SuppressWarnings("deprecation")
	public String initSerialization() {

		String ret = "";
		try {

			if (dmfSubject == null) {
				return EMPTY_CONTENT;
			}

			URI virsatURI = virSatResource.getURI();
			URI resUri = virsatURI.appendFileExtension(getResourceFileEnding());

			IResourceServiceProvider rsp = IResourceServiceProvider.Registry.INSTANCE
					.getResourceServiceProvider(resUri);
			VirSatAwareXtextResourceSet virSatAwareXtextResourceSet = rsp.get(VirSatAwareXtextResourceSet.class);

			EcoreUtil.resolveAll(dmfSubject);
			EObject copyiedElement = EcoreUtil2.copy(dmfSubject);
			Resource xtextReequationSectionXtextResource = virSatAwareXtextResourceSet
					.createFromContainerResource(resUri, virSatResource, this);
			xtextReequationSectionXtextResource.getContents().add(copyiedElement);
			OutputStream outStream = new ByteArrayOutputStream();
			xtextReequationSectionXtextResource.save(outStream,
					SaveOptions.newBuilder().noValidation().getOptions().toOptionsMap());

			ret = outStream.toString();
		} catch (IOException | RuntimeException e) {
			return EMPTY_CONTENT;
		}
		return ret;
	}

	@Override
	public void saveState(IMemento memento) {
		String uriString = dmfUri.toPlatformString(true);
		memento.putString(getMementoIdURI(), uriString);
	}

	@Override
	public IPersistableElement getPersistable() {
		return this;
	}

	/**
	 * Saves the resource which is attached to this EditorInput
	 */
	public void saveVirsatContainer() {
		if (getEditingDomain().isDirty(virSatResource)) {
			// Doing the save in a workspace operation is intended, to not let
			// the automatic builders jump on these files in between
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor progressMonitor) throws CoreException {
					// Store it through the editing domain so it keeps track of
					// further
					// further changes. This is important to have exact
					// knowledge about the
					// resources dirty state.
					getEditingDomain().saveAll();
					try {
						virSatResource.save(Collections.EMPTY_MAP);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			};

			try {
				operation.run(new NullProgressMonitor());
			} catch (InvocationTargetException | InterruptedException e) {

				Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.getPluginId(),
						"Failed to save resource through saveables!", e));
			}
		}
		virSatResource.setModified(false);
	}

	/**
	 * This InvokationHandler is placed between the calls to the underlying file It
	 * will bend the getContents method to our content of the DataModel. The
	 * SystemCOmponent contains the formulas.
	 * 
	 * @author fisc_ph
	 *
	 */
	class VirsatCategoryInvocationHandler implements InvocationHandler {

		/**
		 * COnstructor of the InvokationHandler. The UUID is needed to access the right
		 * content of the correct SystemComponent
		 * 
		 * @throws IOException
		 *             throws exception
		 */
		VirsatCategoryInvocationHandler() throws IOException {
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			// System.out.println("Invocation: " + method.getName());

			if (method.getName().equals("equals")) {
				return proxy == args[0] || resourceFile == args[0] || resourceFile.equals(args[0]);
			}

			if (method.getName().equals("isConflicting")) {
				return proxy == args[0] || resourceFile == args[0];
				// return false;
			}

			// Just digest the call to set contents We may consider to move the
			// deserialization here
			// so that the Xtext language is changed into the actual EMF model.
			// But be aware,
			// if we don't digest this call,w e would write the serialized
			// equations into the
			// XMI file of the StructuralElementInstance. This would actually
			// destroy it.
			if (method.getName().equals("setContents")) {
				return null;
			}

			// The invocation to get the content is redirected to our data model
			if (method.getName().equals("getContents")) {
				String serializedModel = getSerializedInput();
				return new StringInputStream(serializedModel);
			}

			// The ReadOnly method tells if the User is allowed to access and
			// alter the content
			if (method.getName().equals("isReadOnly")) {
				return false;
			}

			// All other calls are directly forwarded to the File object
			return method.invoke(resourceFile, args);
		}
	}

}
