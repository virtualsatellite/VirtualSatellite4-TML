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

import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.IDocumentProviderExtension;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain.IResourceEventListener;

/**
 * Generic Xtext editor implementation for virsat concept extensions by using
 * DMF. The editor uses a virtual file to map the data model into the common
 * xtext editor implementation
 * 
 * @author fran_tb
 *
 */
public class VirsatCategoryXtextEditor extends XtextEditor {

	@Override
	protected void sanityCheckState(IEditorInput input) {
		// if we implement this file, the editor checks if the file which corresponds to
		// the name of the editor input has changed
		// but the name of the EditorInput is not the name of the file
		// therefore we do not react on the change
	}

	@Override
	protected void validateState(IEditorInput input) {
		// We override this method to avoid validation on the actual file input which we
		// need
		// to open the editor. if we do the full validation, we will be asked to set the
		// file
		// to writable. since we work on the data model we are not interested in this
		// behavior
		IDocumentProvider provider = getDocumentProvider();
		if (!(provider instanceof IDocumentProviderExtension)) {
			return;
		}

		updateStateDependentActions();
	}

	@Override
	public boolean isDirty() {
		boolean isDirtyResource = false;
		IEditorInput editorInput = getEditorInput();
		if (editorInput instanceof VirsatCategoryXtextEditorInput) {
			VirsatCategoryXtextEditorInput virsatCategoryXtextEditorInput = (VirsatCategoryXtextEditorInput) editorInput;
			isDirtyResource = virsatCategoryXtextEditorInput.isDirtyResource();
		}
		return super.isDirty() || isDirtyResource;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected void performSave(boolean overwrite, IProgressMonitor progressMonitor) {

		// Safely access the Subject and take a copy of it
		EObject subject = (EObject) getDocument().readOnly(new IUnitOfWork() {
			@Override
			public Object exec(Object state) throws Exception {
				if (state instanceof Resource) {
					Resource res = (Resource) state;
					if (res.getContents().size() > 0) {
						EObject editorSubject = (EObject) res.getContents().get(0);
						EObject copiedSubject = EcoreUtil2.copy(editorSubject);
						return copiedSubject;
					} // Maybe add an else that creates a new subject with the editorinput's root
						// provider
				}
				return null;
			}
		});

		// Now use the copy to hand it back to the EditorInput which is
		// capable of merging back the content to the original StructuralElementInstance
		IEditorInput editorInput = getEditorInput();
		if (editorInput instanceof VirsatCategoryXtextEditorInput) {
			VirsatCategoryXtextEditorInput virsatCategoryXtextEditorInput = (VirsatCategoryXtextEditorInput) editorInput;
			
			if (subject != null) {
				virsatCategoryXtextEditorInput.reintegrateEditorSubject(subject, getDocument().get());
			} else {
				virsatCategoryXtextEditorInput.removeSubject();
			}
			

			virsatCategoryXtextEditorInput.saveVirsatContainer();
			editorSaved();
			updateState(virsatCategoryXtextEditorInput);
		}
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		VirSatTransactionalEditingDomain.addResourceEventListener(eventListener);
	}

	private boolean isDisposed = false;

	@Override
	public void dispose() {
		VirSatTransactionalEditingDomain.removeResourceEventListener(eventListener);

		isDisposed = true;

		super.dispose();
	}

	/**
	 * This event listener handles the updates of resources which happen when a
	 * resource is changed in something such as an external editor
	 */
	private IResourceEventListener eventListener = (Set<Resource> newResources, int event) -> {
		Display.getDefault().asyncExec(() -> {
			if (isDisposed) {
				return;
			}
			if (event == VirSatTransactionalEditingDomain.EVENT_RELOAD) {
				updatedEditorContent();
			}
		});
	};

	/**
	 * This method updates the document of the editor by the document provider. The
	 * reset calls the file to be reloaded, which is proxied by the editor input
	 * Therefore the resource is serialized again and pasted into the text of the
	 * editor document
	 */
	private void updatedEditorContent() {
		Display.getCurrent().asyncExec(() -> {
			IEditorInput editorInput = getEditorInput();
			IDocumentProvider p = getDocumentProvider();

			try {
				p.resetDocument(editorInput);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

}
