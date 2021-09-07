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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.dmf.DObjectContainer;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration;
import de.dlr.sc.virsat.model.ext.tml.configuration.ui.command.RefreshGeneratorConfigurationCommand;
import de.dlr.sc.virsat.model.ext.tml.util.ResourceUtil;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;
import de.dlr.sc.virsat.project.ui.navigator.util.VirSatSelectionHelper;

/**
 * Handles an UI refresh request of a existing configuration 
 * @author fran_tb
 *
 */
public class RefreshModelHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = selectionService.getSelection();

		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		// Get resource of structural element
		Resource virsatStructuralResource = selectionHelper.getFirstEObject().eResource();
		URI dvlmResourceUri = virsatStructuralResource.getURI();

		// Get virsat editing domain
		ResourceUtil.registerDMFResourceFactory();
		VirSatTransactionalEditingDomain editingDomain = ResourceUtil
				.getOrCreateVirsatEditingDomain(virsatStructuralResource);
		ResourceSet resourceSet = editingDomain.getResourceSet();

		// Load DMF model
		EObject configRoot = null;
		try {
			DObjectContainer dmfRoot = ResourceUtil.getDMFRootfromVirsatResourceURI(dvlmResourceUri, resourceSet);
			for (EObject dmfElemement : dmfRoot.eContents()) {
				if (dmfElemement instanceof TMLConfiguration) {
					configRoot = dmfElemement;
					editingDomain.getVirSatCommandStack().execute(
							new RefreshGeneratorConfigurationCommand(editingDomain, (TMLConfiguration) configRoot));
					editingDomain.saveAll();
				}
			}
		} catch (WrappedException ex) {
			System.err.println("GenerateCodeHanlder: can't open DMF file");
		}
		return null;
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

			return categoryA.getType().getFullQualifiedName().equals(
					de.dlr.sc.virsat.model.ext.tml.configuration.model.TMLConfiguration.FULL_QUALIFIED_CATEGORY_NAME);
		}

		return false;
	}

}
