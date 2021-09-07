/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.behavioral.ui.handler;

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
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.ui.editor.ChannelDefinitionEditor;
import de.dlr.sc.virsat.model.ext.tml.behavioral.ui.editor.ChannelDefinitionEditorInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.ATaskingDefinition;
import de.dlr.sc.virsat.project.ui.navigator.util.VirSatSelectionHelper;

/**
 * Auto Generated Class inheriting from Generator Gap Class
 * 
 * This class is generated once, do your changes here
 * 
 * Category to specify channel behavior
 * 
 */
public class EditChannelBehaviorDefinitionHandler extends AbstractHandler implements IHandler {

	public static final String COMMAND_HANDLER_ID = "de.dlr.sc.virsat.model.ext.tml.behavioral.ui.command.EditChannelBehaviorDefinition";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// get file from selection via the event
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		CategoryAssignment categorySubject = getChannelBehaviorCA(selectionHelper.getFirstEObject());
		CategoryAssignment categoryContainer = getChannelBehaviorContainerCA(selectionHelper.getFirstEObject());

		openXtextEditor(categoryContainer, categorySubject);

		return null;
	}

	/**
	 * Opens another editor for a given subject
	 * 
	 * @param containerCatergoryAssignment
	 *            the container of the new editor content as category assignment
	 * @param subjectCatergoryAssignment           
	 *            the current subject of the editor as category assignment
	 */
	protected static void openXtextEditor(CategoryAssignment containerCatergoryAssignment,
			CategoryAssignment subjectCatergoryAssignment) {

		ChannelDefinitionEditorInput editorInput = createEditorInput(containerCatergoryAssignment,
				subjectCatergoryAssignment);
		try {
			IWorkbench workbench = PlatformUI.getWorkbench();
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage workbenchPage = workbenchWindow.getActivePage();
			workbenchPage.openEditor(editorInput, ChannelDefinitionEditor.CHANNEL_DEFINITION_EDITOR_ID);
		} catch (PartInitException ex) {
			System.err.println(
					"de.dlr.sc.virsat.model.ext.tml.structural.ui.handler: Part Init Exception" + ex.getStackTrace());
		}
	}

	/**
	 * Creates a custom editor input for a given a container as category assignment
	 * @param containerCatergoryAssignment container for new editor content
	 * @param subjectCatergoryAssignment the current content of the editor
	 * @return returns a editor input for the channel definition editor
	 */
	protected static ChannelDefinitionEditorInput createEditorInput(CategoryAssignment containerCatergoryAssignment,
			CategoryAssignment subjectCatergoryAssignment) {
		Resource resource = containerCatergoryAssignment.eResource();
		URI resourceUri = resource.getURI();
		URI resourceAndEObjectUri = resourceUri.appendFragment(resource.getURIFragment(containerCatergoryAssignment));
		IFile file = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resourceAndEObjectUri.toPlatformString(true)));
		return new ChannelDefinitionEditorInput(file, resourceAndEObjectUri, containerCatergoryAssignment,
				subjectCatergoryAssignment);
	}

	@Override
	public boolean isEnabled() {
		// Get the info of where to execute this handler
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = selectionService.getSelection();

		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		// Selection is channel definition container
		if (selectionHelper.getFirstEObject() instanceof ComposedPropertyInstance) {
			ComposedPropertyInstance property = (ComposedPropertyInstance) selectionHelper.getFirstEObject();
			return property.getType().getName().equals(ATaskingDefinition.PROPERTY_CHANNELBEHAVIORDEFINITIONS);
		}

		// Selection is tasking environment
		if (selectionHelper.getFirstEObject() instanceof CategoryAssignment) {
			CategoryAssignment categoryA = (CategoryAssignment) selectionHelper.getFirstEObject();

			return categoryA.getType().getFullQualifiedName()
					.equals(ChannelBehaviorDefinition.FULL_QUALIFIED_CATEGORY_NAME);
		}

		return false;
	}

	/**
	 * Method to get the current content of the editor as category assignment
	 * @param selection the current selected element of the model
	 * @return the selected category assignment
	 */
	protected CategoryAssignment getChannelBehaviorCA(EObject selection) {

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
	 * If sub element of tasking definition is selected, this function returns the tasking definition object
	 * @param selection The selected element
	 * @return the current tasking definition object as category assignment
	 */
	protected CategoryAssignment getChannelBehaviorContainerCA(EObject selection) {

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
			return getChannelBehaviorContainerCA(((ComposedPropertyInstance) selection).getTypeInstance());
		}

		return null;
	}
}
