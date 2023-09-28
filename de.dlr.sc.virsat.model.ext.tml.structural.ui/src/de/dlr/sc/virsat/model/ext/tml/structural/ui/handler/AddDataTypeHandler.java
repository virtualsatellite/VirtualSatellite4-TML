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
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.DatatypeDefinitionUiModule;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.editor.DatatypeDefinitionEditor;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.editor.DatatypeDefinitionEditorInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.ATaskingDefinition;
import de.dlr.sc.virsat.project.ui.navigator.util.VirSatSelectionHelper;

/**
 * Auto Generated Class inheriting from Generator Gap Class
 * 
 * This class is generated once, do your changes here
 * 
 * Data type - describing a set of data
 * 
 */
public class AddDataTypeHandler extends AbstractHandler implements IHandler {

	public static final String COMMAND_HANDLER_ID = "de.dlr.sc.virsat.model.ext.tml.structural.ui.command.AddDataType";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// get file from selection via the event
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		CategoryAssignment categoryA = getTaskingEnvironmentCAssignment(selectionHelper.getFirstEObject());

		openXtextEditor(categoryA);

		return null;
	}

	/**
	 * Opens another editor on the given type instance
	 * 
	 * @param catergoryAssignment
	 *            the typeInstance for which to open an editor
	 */
	protected static void openXtextEditor(CategoryAssignment catergoryAssignment) {

		DatatypeDefinitionEditorInput editorInput = createEditorInput(catergoryAssignment);
		try {
			IWorkbench workbench = PlatformUI.getWorkbench();
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage workbenchPage = workbenchWindow.getActivePage();
			workbenchPage.openEditor(editorInput, DatatypeDefinitionEditor.DATATYPE_DEFINITION_EDITOR_ID);
		} catch (PartInitException ex) {
			DatatypeDefinitionUiModule.LOGGER.error(
					"de.dlr.sc.virsat.model.ext.tml.structural.ui.handler: Part Init Exception", ex);
		}
	}

	/**
	 * Creates an editor input for a given container element
	 * @param catergoryAssignment container for new data type as category assignment
	 * @return editor input
	 */
	protected static DatatypeDefinitionEditorInput createEditorInput(CategoryAssignment catergoryAssignment) {
		Resource resource = catergoryAssignment.eResource();
		URI resourceUri = resource.getURI();
		URI resourceAndEObjectUri = resourceUri.appendFragment(resource.getURIFragment(catergoryAssignment));
		IFile file = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resourceAndEObjectUri.toPlatformString(true)));
		return new DatatypeDefinitionEditorInput(file, resourceAndEObjectUri, catergoryAssignment, null);
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

			return arrayProperty.getType().getFullQualifiedName().equals(
					ATaskingDefinition.FULL_QUALIFIED_CATEGORY_NAME + "." + ATaskingDefinition.PROPERTY_DATATYPES);
		}

		// Selection is tasking environment
		if (selectionHelper.getFirstEObject() instanceof CategoryAssignment) {
			CategoryAssignment categoryA = (CategoryAssignment) selectionHelper.getFirstEObject();

			return categoryA.getType().getFullQualifiedName().equals(ATaskingDefinition.FULL_QUALIFIED_CATEGORY_NAME);
		}

		return false;
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

}
