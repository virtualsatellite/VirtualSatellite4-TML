/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.behavioral.serializer;

import com.google.inject.Inject;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.services.ChannelDefinitionGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class ChannelDefinitionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ChannelDefinitionGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BehavioralPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION:
				sequence_BehavioralParameterDefinition(context, (BehavioralParameterDefinition) semanticObject); 
				return; 
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION:
				sequence_ChannelBehaviorDefinition(context, (ChannelBehaviorDefinition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BehavioralParameterDefinition returns BehavioralParameterDefinition
	 *
	 * Constraint:
	 *     (isStatic?='static'? name=EString valueType=EnumValueType? value=EString?)
	 */
	protected void sequence_BehavioralParameterDefinition(ISerializationContext context, BehavioralParameterDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChannelBehaviorDefinition returns ChannelBehaviorDefinition
	 *
	 * Constraint:
	 *     (name=EString storageType=EnumStorageType implName=EString? parameters+=BehavioralParameterDefinition*)
	 */
	protected void sequence_ChannelBehaviorDefinition(ISerializationContext context, ChannelBehaviorDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
