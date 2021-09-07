/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.behavioral.ui.snippet;

import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import org.eclipse.emf.edit.domain.EditingDomain;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.uiengine.ui.editor.snippets.IUiSnippet;
import de.dlr.sc.virsat.uiengine.ui.editor.snippets.AUiSnippetArrayInstanceCategoryTable;
import de.dlr.sc.virsat.model.ext.tml.behavioral.ui.command.CreateAddArrayElementParametersCommand;


/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Super concept for all behavioral categories
 * 
 */	
public abstract class AUiSnippetTableBehaviorDefinitionParametersBehavioralParameterDefinition extends AUiSnippetArrayInstanceCategoryTable implements IUiSnippet {

	public AUiSnippetTableBehaviorDefinitionParametersBehavioralParameterDefinition() {
		super("de.dlr.sc.virsat.model.ext.tml.behavioral",
			"BehavioralParameterDefinition",
			"parameters",
			"BehaviorDefinition",
			"de.dlr.sc.virsat.model.ext.tml.behavioral.BehavioralParameterDefinition",
			STYLE_ADD_BUTTON | STYLE_REMOVE_BUTTON | STYLE_EDITOR_BUTTON);
	}
	
	@Override
	protected Command createAddCommand(EditingDomain editingDomain, Concept activeConcept) {
		return new CreateAddArrayElementParametersCommand().create(editingDomain, getArrayInstance(model),  ActiveConceptHelper.getCategory(activeConcept, "BehavioralParameterDefinition"));
	}
}
