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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ExternalType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralFactory;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.ui.editor.VirsatCategoryXtextEditorInput;

/**
 * 
 * @author fran_tb
 * Custom class for data type editor input
 *   - Creating root for editor
 *   - Integrating editor content into virsat model 
 *
 */
public class DatatypeDefinitionEditorInput extends VirsatCategoryXtextEditorInput {

	public static final String MEMENTO_ID_URI = "de.dlr.sc.virsat.model.ext.tml.structural.declaration.ui.editor.DatatypeDefinitionEditorInput.uri";

	/**
	 * Forwarding constructor to super class
	 * 
	 * @param resourceFile The file to be edited by the editor
	 * @param uri The URI of the file to edit
	 * @param container The model container in which the editor content should be integrated
	 * @param subject If content already exists, it should be passed here
	 */
	public DatatypeDefinitionEditorInput(IFile resourceFile, URI uri, CategoryAssignment container, CategoryAssignment subject) {
		super(resourceFile, uri, container, subject);
	}

	/**
	 * Method for getting the DMF subject of the editor
	 * @return DMF Channel behavior definition
	 */
	private DataType getSubject() {
		return (DataType) dmfSubject;
	}

	/**
	 * Method for getting the container of the editor content
	 * @return The DMF container of the editor content
	 */
	private TaskingDefinition getContainer() {
		return (TaskingDefinition) dmfContainer;
	}

	@Override
	public int hashCode() {
		return (HASH_CODE_PREFIX + dmfUri.toString()).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	private static final String HASH_CODE_PREFIX = "DatatypeDefinitionEditorInput: ";

	@Override
	public String getName() {
		if (getSubject() == null || getSubject().getName() == null) {
			return "New Data Type";
		} else {
			return getSubject().getName();
		}
	}

	@Override
	public String getSerializedInput() {
		if (getSubject() == null) {
			return "";
		}
		if (getSubject().getSerializedDefinition() != null && !getSubject().getSerializedDefinition().equals("")) {
			return getSubject().getSerializedDefinition();
		} else {
			return initSerialization();
		}
	}

	@Override
	public String getFactoryId() {
		return DatatypeDefinitionXtextEditorRestoreFactory.FACTORY_ID;
	}

	@Override
	public void reintegrateEditorSubject(EObject subject, String serializedData) {
		if (subject instanceof DataType) {
			((DataType) subject).setSerializedDefinition(serializedData);
			if (getSubject() != null) {
				updateSubject(getSubject(), subject);
			} else {
				if (subject instanceof ExternalType) {
					getContainer().getExternalTypes().add((ExternalType) subject);
				} else {
					getContainer().getDataTypes().add((DataType) subject);
				}
				
				dmfSubject = subject;
			}
		}
		saveDMFResource();

	}

	@Override
	public EObject getResourceRootObject() {

		return null;
	}

	@Override
	public String getResourceFileEnding() {
		return "dtype";
	}

	@Override
	protected String getMementoIdURI() {
		return MEMENTO_ID_URI;
	}

	@Override
	protected EObject getSubjectFromDMFRoot(EObject dmfRoot, CategoryAssignment container, CategoryAssignment subject) {
		if (subject != null) {
			for (DataType dType : getContainer().getDataTypes()) {
				if (dType.getName().equals(subject.getName())) {
					return dType;
				}
			}
			for (DataType dType : getContainer().getExternalTypes()) {
				if (dType.getName().equals(subject.getName())) {
					return dType;
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
	protected EObject getInitialSubject() {
		return StructuralFactory.eINSTANCE.createDataType();
	}

}
