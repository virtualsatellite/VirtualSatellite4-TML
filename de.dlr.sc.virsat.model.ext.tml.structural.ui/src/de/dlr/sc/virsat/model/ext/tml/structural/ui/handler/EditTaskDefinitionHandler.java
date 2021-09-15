/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.handler;

import java.util.Arrays;

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

import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ComposedPropertyInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.DatatypeDefinitionUiModule;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.editor.TaskDefinitionEditor;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.editor.TaskDefinitionEditorInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.ATaskingDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskDefinition;
import de.dlr.sc.virsat.project.ui.navigator.util.VirSatSelectionHelper;

/**
 * Auto Generated Class inheriting from Generator Gap Class
 * 
 * This class is generated once, do your changes here
 * 
 * Data type - describing a set of data
 * 
 */
public class EditTaskDefinitionHandler extends AbstractHandler implements IHandler {

	public static final String COMMAND_HANDLER_ID = "de.dlr.sc.virsat.model.ext.tml.structural.ui.command.EditTaskDefinition";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// get file from selection via the event
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		CategoryAssignment categorySubject = getTaskCAssignment(selectionHelper.getFirstEObject());
		CategoryAssignment categoryContainer = getTaskingDefinitionCAssignment(selectionHelper.getFirstEObject());

		openXtextEditor(categoryContainer, categorySubject);

		return null;
	}

	/**
	 * Opens another editor on the given type instance
	 * 
	 * @param containerCatergoryAssignment
	 *            Container element of the element to edit as category assignment
	 * @param subjectCatergoryAssignment
	 *            Current element to be edited
	 */
	protected static void openXtextEditor(CategoryAssignment containerCatergoryAssignment,
			CategoryAssignment subjectCatergoryAssignment) {

		TaskDefinitionEditorInput editorInput = createEditorInput(containerCatergoryAssignment,
				subjectCatergoryAssignment);
		try {
			IWorkbench workbench = PlatformUI.getWorkbench();
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage workbenchPage = workbenchWindow.getActivePage();
			workbenchPage.openEditor(editorInput, TaskDefinitionEditor.TASK_DEFINITION_EDITOR_ID);
		} catch (PartInitException ex) {
			DatatypeDefinitionUiModule.LOGGER.error(
					"de.dlr.sc.virsat.model.ext.tml.structural.ui.handler: Part Init Exception" + Arrays.toString(ex.getStackTrace()));
		}
	}

	/**
	 * Creates an editor input for a given container element
	 * @param containerCatergoryAssignment container for new task definition as category assignment
	 * @param subjectCatergoryAssignment current model content that should be edited as category assignment
	 * @return editor input
	 */
	protected static TaskDefinitionEditorInput createEditorInput(CategoryAssignment containerCatergoryAssignment,
			CategoryAssignment subjectCatergoryAssignment) {
		Resource resource = subjectCatergoryAssignment.eResource();
		URI resourceUri = resource.getURI();
		URI resourceAndEObjectUri = resourceUri.appendFragment(resource.getURIFragment(subjectCatergoryAssignment));
		IFile file = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resourceAndEObjectUri.toPlatformString(true)));
		return new TaskDefinitionEditorInput(file, resourceAndEObjectUri, containerCatergoryAssignment,
				subjectCatergoryAssignment);
	}

	@Override
	public boolean isEnabled() {
		// Get the info of where to execute this handler
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = selectionService.getSelection();

		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		if (selectionHelper.getFirstEObject() instanceof ComposedPropertyInstance) {
			ComposedPropertyInstance property = (ComposedPropertyInstance) selectionHelper.getFirstEObject();
			return property.getType().getName().equals(ATaskingDefinition.PROPERTY_TASKDEFINITIONS);
		}

		// Selection is tasking environment
		if (selectionHelper.getFirstEObject() instanceof CategoryAssignment) {
			CategoryAssignment categoryA = (CategoryAssignment) selectionHelper.getFirstEObject();

			return categoryA.getType().getFullQualifiedName().equals(TaskDefinition.FULL_QUALIFIED_CATEGORY_NAME);
		}

		return false;
	}

	/**
	 * Get the data type instance from the selection
	 * @param selection the selected element
	 * @return the task as category assignment
	 */
	protected CategoryAssignment getTaskCAssignment(EObject selection) {

		if (selection instanceof CategoryAssignment) {
			return (CategoryAssignment) selection;
		}

		if (selection instanceof ComposedPropertyInstance) {
			ComposedPropertyInstance prop = (ComposedPropertyInstance) selection;
			return (CategoryAssignment) prop.getTypeInstance();
		}

		return null;
	}

	/**
	 * Returns the root tasking definition for a selected element
	 * @param selection selection of the current UI request
	 * @return the category assignment of the tasking definition
	 */
	protected CategoryAssignment getTaskingDefinitionCAssignment(EObject selection) {

		if (selection instanceof CategoryAssignment) {
			EObject conceptContainter;
			try {
				conceptContainter = selection.eContainer().eContainer().eContainer();
			} catch (NullPointerException e) {
				System.err.println("Unecpected model format");
				return null;
			}
			if (conceptContainter instanceof CategoryAssignment) {
				CategoryAssignment categoryA = (CategoryAssignment) conceptContainter;
				if (categoryA.getType().getFullQualifiedName()
						.equals(ATaskingDefinition.FULL_QUALIFIED_CATEGORY_NAME)) {
					return categoryA;
				}
			}
		}

		if (selection instanceof ComposedPropertyInstance) {
			return getTaskingDefinitionCAssignment(((ComposedPropertyInstance) selection).getTypeInstance());
		}

		return null;
	}

}
