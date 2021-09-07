/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.handler;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.dlr.sc.virsat.graphiti.util.DiagramHelper;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.TMLDiagramEditor;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.providers.TMLDiagramTypeProvider;
import de.dlr.sc.virsat.model.ext.tml.util.ResourceUtil;
import de.dlr.sc.virsat.project.resources.VirSatResourceSet;
import de.dlr.sc.virsat.project.ui.editingDomain.handler.AEditingDomainCommandHandler;
import de.dlr.sc.virsat.project.ui.navigator.util.VirSatSelectionHelper;

/**
 * Class to handle UI request to open a tasking diagram
 * @author nepa_ay
 *
 */
public class OpenDiagramFileHandler extends AEditingDomainCommandHandler {
	
	private String editorId;
	private String providerId;
	
	@Override
	protected void execute() {
		CategoryAssignment ca = (CategoryAssignment) firstSelectedEObject;
		IBeanCategoryAssignment bean;
		String fileExtension;
		String diagramTypeId;
		if (ca.getType().getFullQualifiedName().equals(TaskingEnvironment.FULL_QUALIFIED_CATEGORY_NAME)) {
			bean = new TaskingEnvironment(ca);
			editorId = TMLDiagramEditor.DIAGRAM_EDITOR_ID;
			providerId = TMLDiagramTypeProvider.PROVIDER_ID;
			fileExtension = TMLDiagramEditor.DIAGRAM_FILE_EXTENSION;
			diagramTypeId = TMLDiagramTypeProvider.DIAGRAM_TYPE_ID;
		} else {
			MessageDialog.openError(getShell(), "Error creating domain element.", "Could not open diagram.");
			return;
		}

		VirSatResourceSet resourceSet = ed.getResourceSet();
		IFolder diagramFolder = project.getFolder(ResourceUtil.DIAGRAM_FILE_EXTENSION);
		IFile diagramFile = diagramFolder.getFile(bean.getUuid() + fileExtension);
		
		Diagram diagram;
		if (diagramFile.exists()) {
			ed.reloadAll(); // had to explicitly call reload, otherwise doesnt work when new link was added! - this is because there is no domain-element for links 
			diagram = getDiagramFromFile(diagramFile, new ResourceSetImpl());
			openDiagram(diagram);
		} else {
			URI uri = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
			Resource staleResource = resourceSet.getResource(uri, false);
			if (staleResource != null) {
				resourceSet.removeResource(staleResource);
			}
			diagram = Graphiti.getPeCreateService().createDiagram(diagramTypeId, bean.getName(), true);
			DiagramHelper.createDiagram(uri, diagram, resourceSet);
			DiagramEditor editor = (DiagramEditor) openDiagram(diagram);
			addObjectToDiagram(bean, editor.getDiagramTypeProvider());
		}
	}
	
	/**
	 * 
	 * @param bean bean
	 * @param diagramTypeProvider diagramTypeProvider
	 */
	private void addObjectToDiagram(IBeanCategoryAssignment bean, IDiagramTypeProvider diagramTypeProvider) {
		AddContext addContext = new AddContext();
		addContext.setNewObject(bean);
		addContext.setTargetContainer(diagramTypeProvider.getDiagram());
		diagramTypeProvider.getFeatureProvider().addIfPossible(addContext);
	}
	
	@Override
	public boolean isEnabled() {
		// Get the info of where to execute this handler
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = selectionService.getSelection();

		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		// Selection is tasking environment
		if (selectionHelper.getFirstEObject() instanceof CategoryAssignment) {
			CategoryAssignment categoryA = (CategoryAssignment) selectionHelper.getFirstEObject();
			return categoryA.getType().getFullQualifiedName().equals(TaskingEnvironment.FULL_QUALIFIED_CATEGORY_NAME);
		}
		return false;
	}

	/**
	 * Get the shell of the current workbench
	 * @return the shell
	 */
	protected Shell getShell() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		return workbenchWindow.getShell();
	}

	/**
	 * Returns the root tasking environment for a selected element
	 * @param selection selection of the current UI request
	 * @return the category assignment of the tasking environment
	 */
	protected CategoryAssignment getTaskingEnvironmentCAssignment(EObject selection) {
		if (selection instanceof ArrayInstance) {
			ArrayInstance arrayProperty = (ArrayInstance) selection;
			return (CategoryAssignment) arrayProperty.eContainer();
		}
		if (selection instanceof CategoryAssignment) {
			return (CategoryAssignment) selection;
		}
		return null;
	}

	/**
	 * Opens the diagram in the editor.
	 * @param diagram Diagram object
	 * @return diagram editor 
	 */
	private IEditorPart openDiagram(Diagram diagram) {
		try {
			return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.openEditor(new DiagramEditorInput(EcoreUtil.getURI(diagram), providerId), editorId);
		} catch (PartInitException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Get diagram object from file.
	 * @param file Diagram file.
	 * @param resourceSet Resource set.
	 * @return Diagram file object.
	 */
	private static Diagram getDiagramFromFile(IFile file, ResourceSet resourceSet) {
		final URI resourceURI = getFileURI(file, resourceSet);
		Resource resource;
		resource = resourceSet.getResource(resourceURI, true);
		if (resource != null) {
			final EList<EObject> contents = resource.getContents();
			for (final EObject object : contents) {
				if (object instanceof Diagram) {
					return (Diagram) object;
				}
			}
		}
		return null;
	}
	
	/**
	 * Get URI from file.
	 * @param file File.
	 * @param resourceSet Resource set.
	 * @return URI of file.
	 */
	private static URI getFileURI(IFile file, ResourceSet resourceSet) {
		final String pathName = file.getFullPath().toString();
		URI resourceURI = URI.createFileURI(pathName);
		resourceURI = resourceSet.getURIConverter().normalize(resourceURI);
		return resourceURI;
	}
}
