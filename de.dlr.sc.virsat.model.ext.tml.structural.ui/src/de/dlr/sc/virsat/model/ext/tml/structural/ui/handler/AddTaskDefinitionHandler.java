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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import de.dlr.sc.virsat.model.dvlm.Repository;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.DatatypeDefinitionUiModule;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.editor.TaskDefinitionEditor;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.editor.TaskDefinitionEditorInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.ATaskingDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.command.CreateAddTaskDefinitionCommand;
import de.dlr.sc.virsat.project.ui.navigator.util.VirSatSelectionHelper;

/**
 * Auto Generated Class inheriting from Generator Gap Class
 * 
 * This class is generated once, do your changes here
 * 
 * Pure definition and specification of a task
 * 
 */
public class AddTaskDefinitionHandler extends AbstractHandler implements IHandler {

	public static final String COMMAND_HANDLER_ID = "de.dlr.sc.virsat.model.ext.tml.structural.ui.command.AddTaskDefinition";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// get file from selection via the event
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		EObject eSelection = selectionHelper.getFirstEObject();

		CategoryAssignment categoryA = getTaskingDefinitionCAssignment(eSelection);

		if (categoryA != null) {
			openXtextEditor(categoryA);
		} else {
			openXtextEditor(eSelection);
		}

		return null;
	}

	/**
	 * Opens another editor on the given type instance
	 * 
	 * @param catergoryAssignment
	 *            the typeInstance for which to open an editor
	 */
	protected static void openXtextEditor(CategoryAssignment catergoryAssignment) {

		TaskDefinitionEditorInput editorInput = createEditorInput(catergoryAssignment);
		try {
			IWorkbench workbench = PlatformUI.getWorkbench();
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage workbenchPage = workbenchWindow.getActivePage();
			workbenchPage.openEditor(editorInput, TaskDefinitionEditor.TASK_DEFINITION_EDITOR_ID);
		} catch (PartInitException ex) {
			DatatypeDefinitionUiModule.LOGGER.error(
					"de.dlr.sc.virsat.model.ext.tml.structural.ui.handler: Part Init Exception" + ex.getStackTrace());
		}
	}

	/**
	 * Opens another editor on the given type instance
	 * 
	 * @param selection
	 *            the container for which to open an editor
	 */
	protected static void openXtextEditor(EObject selection) {
		TaskDefinitionEditorInput editorInput = createEditorInput(selection);
		try {
			IWorkbench workbench = PlatformUI.getWorkbench();
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage workbenchPage = workbenchWindow.getActivePage();
			workbenchPage.openEditor(editorInput, TaskDefinitionEditor.TASK_DEFINITION_EDITOR_ID);
		} catch (PartInitException ex) {
			DatatypeDefinitionUiModule.LOGGER.error(
					"de.dlr.sc.virsat.model.ext.tml.structural.ui.handler: Part Init Exception" + ex.getStackTrace());
		}
	}

	/**
	 * Creates an editor input for a given container element
	 * 
	 * @param catergoryAssignment
	 *            container for new task definition as category assignment
	 * @return editor input
	 */
	protected static TaskDefinitionEditorInput createEditorInput(CategoryAssignment catergoryAssignment) {
		Resource resource = catergoryAssignment.eResource();
		URI resourceUri = resource.getURI();
		URI resourceAndEObjectUri = resourceUri.appendFragment(resource.getURIFragment(catergoryAssignment));
		IFile file = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resourceAndEObjectUri.toPlatformString(true)));
		return new TaskDefinitionEditorInput(file, resourceAndEObjectUri, catergoryAssignment, null);
	}

	/**
	 * Creates an editor input for a given container element
	 * 
	 * @param container
	 *            container for new task definition
	 * @return editor input
	 */
	protected static TaskDefinitionEditorInput createEditorInput(EObject container) {
		Resource resource = container.eResource();
		URI resourceUri = resource.getURI();
		URI resourceAndEObjectUri = resourceUri.appendFragment(resource.getURIFragment(container));
		IFile file = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resourceAndEObjectUri.toPlatformString(true)));
		return new TaskDefinitionEditorInput(file, resourceAndEObjectUri);
	}

	@Override
	public boolean isEnabled() {
		// Get the info of where to execute this handler
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = selectionService.getSelection();

		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		// Selection is datatype container array
		if (selectionHelper.getFirstEObject() instanceof ArrayInstance) {
			ArrayInstance arrayProperty = (ArrayInstance) selectionHelper.getFirstEObject();

			return arrayProperty.getType().getFullQualifiedName()
					.equals(ATaskingDefinition.FULL_QUALIFIED_CATEGORY_NAME + "."
							+ ATaskingDefinition.PROPERTY_TASKDEFINITIONS);
		}

		// Selection is tasking definition
		if (selectionHelper.getFirstEObject() instanceof CategoryAssignment) {
			CategoryAssignment categoryA = (CategoryAssignment) selectionHelper.getFirstEObject();

			return categoryA.getType().getFullQualifiedName().equals(ATaskingDefinition.FULL_QUALIFIED_CATEGORY_NAME);
		}

		//If non of upper options is true, then check if generated add command would be able to be executed
		Repository currentRepository = selectionHelper.getEditingDomain().getResourceSet().getRepository();
		ActiveConceptHelper acHelper = new ActiveConceptHelper(currentRepository);
		Concept activeConcept = acHelper.getConcept(getConceptName());
		if (activeConcept == null) {
			return false;
		}

		return new CreateAddTaskDefinitionCommand()
				.create(selectionHelper.getEditingDomain(), selectionHelper.getFirstEObject(), activeConcept)
				.canExecute();
	}

	/**
	 * Returns the root tasking definition for a selected element
	 * 
	 * @param selection
	 *            selection of the current UI request
	 * @return the category assignment of the tasking definition
	 */
	protected CategoryAssignment getTaskingDefinitionCAssignment(EObject selection) {
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
	 * Returns the name of the structural concept
	 * 
	 * @return the concept name
	 */
	protected String getConceptName() {
		return "de.dlr.sc.virsat.model.ext.tml.structural";
	}

}