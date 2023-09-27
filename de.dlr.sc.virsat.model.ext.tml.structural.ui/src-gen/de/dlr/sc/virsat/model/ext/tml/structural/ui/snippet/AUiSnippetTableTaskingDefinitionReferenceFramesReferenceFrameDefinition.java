/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.snippet;

import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import org.eclipse.emf.edit.domain.EditingDomain;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.command.CreateAddArrayElementReferenceFramesCommand;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.uiengine.ui.editor.snippets.IUiSnippet;
import de.dlr.sc.virsat.uiengine.ui.editor.snippets.AUiSnippetArrayInstanceCategoryTable;


/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Overall Container to describe a tasking definitions
 * 
 */	
public abstract class AUiSnippetTableTaskingDefinitionReferenceFramesReferenceFrameDefinition extends AUiSnippetArrayInstanceCategoryTable implements IUiSnippet {

	public AUiSnippetTableTaskingDefinitionReferenceFramesReferenceFrameDefinition() {
		super("de.dlr.sc.virsat.model.ext.tml.structural",
			"ReferenceFrameDefinition",
			"referenceFrames",
			"TaskingDefinition",
			"de.dlr.sc.virsat.model.ext.tml.structural.ReferenceFrameDefinition",
			STYLE_ADD_BUTTON | STYLE_REMOVE_BUTTON | STYLE_EDITOR_BUTTON);
	}
	
	@Override
	protected Command createAddCommand(EditingDomain editingDomain, Concept activeConcept) {
		return new CreateAddArrayElementReferenceFramesCommand().create(editingDomain, getArrayInstance(model),  ActiveConceptHelper.getCategory(activeConcept, "ReferenceFrameDefinition"));
	}
}
