/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.dmf.DObjectContainer;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralFactory;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition;
import de.dlr.sc.virsat.model.ext.tml.ui.editor.VirsatCategoryXtextEditorInput;

/**
 * 
 * @author fran_tb
 * Custom class for task editor input
 *   - Creating root for editor
 *   - Integrating editor content into virsat model 
 *
 */
public class TaskDefinitionEditorInput extends VirsatCategoryXtextEditorInput {

	public static final String MEMENTO_ID_URI = "de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.editor.TaskDefinitionEditorInput.uri";

	/**
	 * Forwarding constructor to super class
	 * 
	 * @param resourceFile The file to be edited by the editor
	 * @param uri The URI of the file to edit
	 * @param container The model container in which the editor content should be integrated
	 * @param subject If content already exists, it should be passed here
	 */
	public TaskDefinitionEditorInput(IFile resourceFile, URI uri, CategoryAssignment container,
			CategoryAssignment subject) {
		super(resourceFile, uri, container, subject);
	}
	
	
	/**
	 * Forwarding constructor to super class
	 * 
	 * @param resourceFile The file to be edited by the editor
	 * @param uri The URI of the file to edit
	 */
	public TaskDefinitionEditorInput(IFile resourceFile, URI uri) {
		super(resourceFile, uri);
	}

	/**
	 * Method for getting the DMF subject of the editor
	 * @return DMF task definition
	 */
	private TaskDefinition getSubject() {
		return (TaskDefinition) dmfSubject;
	}

	/**
	 * Method for getting the container of the editor content
	 * @return The DMF container of the editor content
	 */
	@SuppressWarnings("rawtypes")
	private EList getContainingList() {
		if (dmfContainer instanceof TaskingDefinition) {
			return ((TaskingDefinition) dmfContainer).getTaskDefinitions();
		} else if (dmfContainer instanceof DObjectContainer) {
			return ((DObjectContainer) dmfContainer).getObjects();
		}
		return null;
	}

	@Override
	public int hashCode() {
		return (HASH_CODE_PREFIX + dmfUri.toString()).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	
	private static final String HASH_CODE_PREFIX = "TaskDefinitionEditorInput: ";

	@Override
	public String getName() {
		if (getSubject() == null) {
			return "New Task";
		} else {
			return getSubject().getName();
		}
	}

	@Override
	public String getSerializedInput() {
		if (getSubject() == null) {
			return "";
		}
		if (!getSubject().getSerializedDefinition().equals("")) {
			return getSubject().getSerializedDefinition();
		} else {
			return initSerialization();
		}
	}

	@Override
	public String getFactoryId() {
		return TaskDefinitionXtextEditorRestoreFactory.FACTORY_ID;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void reintegrateEditorSubject(EObject subject, String serializedData) {
		if (subject instanceof TaskDefinition) {
			((TaskDefinition) subject).setSerializedDefinition(serializedData);
			if (getSubject() != null) {
				updateSubject(getSubject(), subject);
			} else {
				getContainingList().add(subject);
				dmfSubject = subject;
			}
		}
		saveDMFResource();

	}

	/**
	 * Update an existing task with new content
	 * @param subject the new content
	 */
	@SuppressWarnings("unchecked")
	protected void updateSubject(EObject subject) {
		if (getSubject() != null) {
			getContainingList().remove(getSubject());
		}
		dmfSubject = subject;
		getContainingList().add(getSubject());
	}

	@Override
	protected String getMementoIdURI() {
		return MEMENTO_ID_URI;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected EObject getSubjectFromDMFRoot(EObject dmfRoot, CategoryAssignment container, CategoryAssignment subject) {
		if (container == null) {
			for (EObject child : dmfRoot.eContents()) {
				if (child instanceof TaskDefinition) {
					return child;
				}
			}
		}
		if (subject != null) {
			for (TaskDefinition task : (EList<TaskDefinition>) getContainingList()) {
				if (task.getName().equals(subject.getName())) {
					return task;
				}
			}
		}
		return null;
	}

	@Override
	protected EObject getContainerFromDMFRoot(EObject dmfRoot, CategoryAssignment container) {
		for (EObject dmfElement : dmfRoot.eContents()) {
			if (dmfElement instanceof TaskingDefinition) {
				return dmfElement;
			}
		}
		return null;
	}

	@Override
	public EObject getResourceRootObject() {

		return null;
	}

	@Override
	public String getResourceFileEnding() {

		return null;
	}


	@Override
	protected EObject getInitialSubject() {
		return StructuralFactory.eINSTANCE.createTaskDefinition();
	}

}
