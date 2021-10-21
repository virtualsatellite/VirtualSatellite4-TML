/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.configuration.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import de.dlr.sc.virsat.project.ui.navigator.util.VirSatSelectionHelper;

/**
 * Handles an UI request for opening the tree editor
 * @author fran_tb
 *
 */
public class TreeEditorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = selectionService.getSelection();

		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		// Get resource of structural element
		Resource virsatStructuralResource = selectionHelper.getFirstEObject().eResource();
		try {
			openTreeEditor(virsatStructuralResource);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Opens the editor for a given resource
	 * @param resource the resource the editor should edit
	 * @return if it worked
	 * @throws PartInitException if editor could not be opened
	 */
	public static boolean openTreeEditor(Resource resource) throws PartInitException {
		String path = resource.getURI().toPlatformString(true);
		IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
		if (workspaceResource instanceof IFile) {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			return null != page.openEditor(new FileEditorInput((IFile) workspaceResource),
					"de.dlr.sc.virsat.model.ext.tml.configuration.configuration.presentation.ConfigurationDMFEditorID");
		}
		return false;
	}

}
