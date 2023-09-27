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

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.dmf.DObjectContainer;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration;
import de.dlr.sc.virsat.model.ext.tml.configuration.ui.command.RefreshGeneratorConfigurationCommand;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.command.CreateInitialConfigurationCommand;
import de.dlr.sc.virsat.model.ext.tml.util.ResourceUtil;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;
import de.dlr.sc.virsat.project.ui.navigator.util.VirSatSelectionHelper;

/**
 * Handles an UI request to create an intial generation configuration
 * @author fran_tb
 *
 */
public class CreateGenerationConfigurationHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = selectionService.getSelection();

		VirSatSelectionHelper selectionHelper = new VirSatSelectionHelper(selection);

		CategoryAssignment taskingEnvironment = null;
		// Selection is tasking environment
		if (isTaskingEnvironment(selectionHelper.getFirstEObject())) {
			taskingEnvironment = (CategoryAssignment) selectionHelper.getFirstEObject();
		}
		if (taskingEnvironment == null) {
			return null;
		}
		// Create initial model
		VirSatTransactionalEditingDomain editingDomain = selectionHelper.getEditingDomain();
		editingDomain.getCommandStack()
				.execute(new CreateInitialConfigurationCommand(editingDomain, taskingEnvironment));
		editingDomain.saveAll();

		// Create default configurations
		Resource virsatStructuralResource = selectionHelper.getFirstEObject().eResource();
		URI dvlmResourceUri = virsatStructuralResource.getURI();
		ResourceUtil.registerDMFResourceFactory();
		Resource dmfResource = ResourceUtil.getDMFResourcefromVirsatResourceURI(dvlmResourceUri,
				virsatStructuralResource.getResourceSet());
		EObject fileRoot = (EObject) dmfResource.getContents().get(0);
		if (fileRoot instanceof DObjectContainer) {
			for (EObject dmfElemement : ((DObjectContainer) fileRoot).eContents()) {
				if (dmfElemement instanceof TMLConfiguration) {
					editingDomain.getVirSatCommandStack().execute(
							new RefreshGeneratorConfigurationCommand(editingDomain, (TMLConfiguration) dmfElemement));
					try {
						dmfResource.save(Collections.EMPTY_MAP);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
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
		if (isTaskingEnvironment(selectionHelper.getFirstEObject())) {
			return true;
		}

		// Child of Tasking environment
		if (isChildOfTaskingEnvironment(selectionHelper.getFirstEObject())) {
			return true;
		}

		return false;
	}

	/**
	 * Checks if a selected element is a tasking environment
	 * @param object selected element
	 * @return returns if element is a tasking environment
	 */
	protected boolean isTaskingEnvironment(EObject object) {
		if (object instanceof CategoryAssignment) {
			CategoryAssignment categoryA = (CategoryAssignment) object;

			return categoryA.getType().getFullQualifiedName().equals(TaskingEnvironment.FULL_QUALIFIED_CATEGORY_NAME);
		}

		return false;
	}

	/**
	 * Checks recursively if element is child of a tasking environment
	 * @param object selected element
	 * @return returns if element is child of a tasking environment or not
	 */
	protected boolean isChildOfTaskingEnvironment(EObject object) {
		if (object.eContainer() != null) {
			if (isTaskingEnvironment(object.eContainer())) {
				return true;
			} else {
				return isChildOfTaskingEnvironment(object.eContainer());
			}
		} else {
			return false;
		}
	}

}
