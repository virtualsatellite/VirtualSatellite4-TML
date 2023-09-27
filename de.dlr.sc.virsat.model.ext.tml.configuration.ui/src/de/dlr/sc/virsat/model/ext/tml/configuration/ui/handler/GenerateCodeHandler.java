/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
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
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.dmf.DObjectContainer;
import de.dlr.sc.virsat.model.dvlm.general.IUuid;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration;
import de.dlr.sc.virsat.model.ext.tml.generator.TMLGenerator;
import de.dlr.sc.virsat.model.ext.tml.util.ResourceUtil;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;
import de.dlr.sc.virsat.project.ui.navigator.util.VirSatSelectionHelper;

/**
 * Class that handles an UI request for generating code
 * 
 * @author fran_tb
 *
 */
public class GenerateCodeHandler extends AbstractHandler {

	protected String configruationID;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = selectionService.getSelection();

		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		// Get resource of structural element
		Resource virsatStructuralResource = selectionHelper.getFirstEObject().eResource();
		URI dvlmResourceUri = virsatStructuralResource.getURI();

		if (selectionHelper.getFirstEObject() instanceof CategoryAssignment) {
			configruationID = ((CategoryAssignment) selectionHelper.getFirstEObject()).getUuid().toString();
		} else {
			return null;
		}

		// Get virsat editing domain
		ResourceUtil.registerDMFResourceFactory();
		VirSatTransactionalEditingDomain editingDomain = ResourceUtil
				.getOrCreateVirsatEditingDomain(virsatStructuralResource);
		ResourceSet resourceSet = editingDomain.getResourceSet();

		// Load DMF model
		TMLConfiguration configRoot = null;
		try {
			DObjectContainer dmfRoot = ResourceUtil.getDMFRootfromVirsatResourceURI(dvlmResourceUri, resourceSet);
			for (EObject dmfElemement : dmfRoot.eContents()) {
				if (dmfElemement instanceof TMLConfiguration) {
					if (((TMLConfiguration) dmfElemement).getUuid().toString().equals(configruationID)) {
						configRoot = (TMLConfiguration) dmfElemement;
					}
				}
			}
		} catch (WrappedException ex) {
			System.err.println("GenerateCodeHanlder: can't open DMF file");
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error",
					"Could not load model!");
		}

		IPath projectPath = ResourceUtil.getFilefromEMFResource(virsatStructuralResource).getProject().getLocation()
				.addTrailingSeparator();
		String projectStringPath = projectPath.toString();
		TMLGenerator generator = new TMLGenerator(projectStringPath, configRoot.getGeneratorConfiguration());

		Job codeGenerationJob = new Job("Performing Code Generation") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {

				generator.doGenerate(monitor);
				try {
					ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}

				return Status.OK_STATUS;
			}
		};
		codeGenerationJob.schedule();
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.eclipse.ui.navigator.ProjectExplorer");
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		

		return null;
	}

	@Override
	public boolean isEnabled() {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = selectionService.getSelection();

		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		// Selection is tasking environment
		if (selectionHelper.getFirstEObject() instanceof CategoryAssignment) {
			CategoryAssignment categoryA = (CategoryAssignment) selectionHelper.getFirstEObject();

			return categoryA.getType().getFullQualifiedName().equals(
					de.dlr.sc.virsat.model.ext.tml.configuration.model.TMLConfiguration.FULL_QUALIFIED_CATEGORY_NAME);
		}

		return false;
	}

	/**
	 * Returns a DMF object for a given virsat category assignment
	 * 
	 * @param categoryAssignment
	 *            virsat element
	 * @param dmfConfigRoot
	 *            DMF root
	 * @return the DMF object
	 */
	protected EObject getDMFObjectForVirsatCategory(CategoryAssignment categoryAssignment,
			TMLConfiguration dmfConfigRoot) {
		EObject dmfElement = null;

		for (EObject genConfig : dmfConfigRoot.getGeneratorConfiguration().eContents()) {
			if (((IUuid) genConfig).getUuid().toString().equals(categoryAssignment.getUuid().toString())) {
				dmfElement = genConfig;
			}
		}

		return dmfElement;
	}

}
