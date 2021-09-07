/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.ui.util;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.common.CommandException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

import de.dlr.sc.virsat.project.ui.navigator.util.VirSatSelectionHelper;

/**
 * Provides utility methods for handling UI related stuffs in the QUANTUS project
 * @author nepa_ay
 *
 */
public class TMLUiUtil {
	
	public static final String SET_NAME_DIALOG_TITLE = "Change Name";
	public static final String SET_NAME_DIALOG_MSG = "Change the Name of this object to:";
	
	/**
	 * Hidden constructor
	 */
	private TMLUiUtil() {	
	}
	
	/**
	 * Get first selected EObject from the tree.
	 * @return
	 */
	public static EObject getSelection() {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = selectionService.getSelection();
		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);
		return selectionHelper.getFirstEObject();
	}
	
	/**
	 * Get the shell of the current workbench
	 * @return the shell
	 */
	public static Shell getShell() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		return workbenchWindow.getShell();
	}
	
	/**
	 * Show dialog asking user for a string input.
	 * @param dialogTitle Dialog title
	 * @param dialogMessage Message
	 * @param initialValue Initial value that is printed in the field.
	 * @return New string that user has given
	 */
	public static String showStringInputDialog(String dialogTitle, String dialogMessage, String initialValue, IInputValidator validator) {
		String ret = initialValue;
		Shell shell = getShell();
		InputDialog inputDialog = new InputDialog(shell, dialogTitle, dialogMessage, initialValue, validator);
		int retDialog = inputDialog.open();
		if (retDialog == Window.OK) {
			ret = inputDialog.getValue().trim();
		}
		return ret;
	}
	
	/**
	 * Show dialog asking user for a name.
	 * @param initialValue Initial value to print in the field, e.g. current name
	 * @return Given name.
	 */
	public static String showChangeNameDialog(String initialValue, IInputValidator validator) {
		return showStringInputDialog(SET_NAME_DIALOG_TITLE, SET_NAME_DIALOG_MSG, initialValue, validator);
	}
	
	/**
	 * Trigger save on all open editors
	 * @param currentEditor The editor where the save event has been triggered by the user
	 */
	public static void saveAllOtherOpenedEditors(IEditorPart currentEditor) {
		IEditorReference[] editorReferences = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences();
		for (IEditorReference editorRef : editorReferences) {
			IEditorPart editor = editorRef.getEditor(false);
			if (editor != null && !editor.equals(currentEditor)) {
				if (editor.isDirty()) {
					editor.doSave(new NullProgressMonitor());
				}
			}
		}
	}
	
	/**
	 * Open editor given by eiditor id
	 * @param editorId Editor id
	 * @return true if can open editor, otherwise false
	 */
	public static boolean openEditor(String editorId) {
		ICommandService commandService = PlatformUI.getWorkbench().getService(ICommandService.class);
		Command openCustomEditorCmd = commandService.getCommand(editorId);
		
		if (openCustomEditorCmd != null && openCustomEditorCmd.isHandled()) {
			try {
				openCustomEditorCmd.executeWithChecks(new ExecutionEvent());
				return true;
			} catch (CommandException ex) {
				ex.printStackTrace();
				MessageDialog.openError(TMLUiUtil.getShell(), "Failed to open editor:", editorId);
			}
		}
		return false;
	}
}
