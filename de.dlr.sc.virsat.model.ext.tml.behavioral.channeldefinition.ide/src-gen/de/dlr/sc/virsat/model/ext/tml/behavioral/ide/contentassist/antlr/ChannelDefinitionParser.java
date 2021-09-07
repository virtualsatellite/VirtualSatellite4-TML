/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.behavioral.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.dlr.sc.virsat.model.ext.tml.behavioral.ide.contentassist.antlr.internal.InternalChannelDefinitionParser;
import de.dlr.sc.virsat.model.ext.tml.behavioral.services.ChannelDefinitionGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ChannelDefinitionParser extends AbstractContentAssistParser {

	@Inject
	private ChannelDefinitionGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalChannelDefinitionParser createParser() {
		InternalChannelDefinitionParser result = new InternalChannelDefinitionParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getChannelBehaviorDefinitionAccess().getAlternatives_5(), "rule__ChannelBehaviorDefinition__Alternatives_5");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEnumStorageTypeAccess().getAlternatives(), "rule__EnumStorageType__Alternatives");
					put(grammarAccess.getEnumValueTypeAccess().getAlternatives(), "rule__EnumValueType__Alternatives");
					put(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup(), "rule__ChannelBehaviorDefinition__Group__0");
					put(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_4(), "rule__ChannelBehaviorDefinition__Group_4__0");
					put(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_5_0(), "rule__ChannelBehaviorDefinition__Group_5_0__0");
					put(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup(), "rule__BehavioralParameterDefinition__Group__0");
					put(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_2(), "rule__BehavioralParameterDefinition__Group_2__0");
					put(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_3(), "rule__BehavioralParameterDefinition__Group_3__0");
					put(grammarAccess.getChannelBehaviorDefinitionAccess().getNameAssignment_1(), "rule__ChannelBehaviorDefinition__NameAssignment_1");
					put(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeAssignment_3(), "rule__ChannelBehaviorDefinition__StorageTypeAssignment_3");
					put(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameAssignment_4_1(), "rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1");
					put(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersAssignment_5_0_1(), "rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1");
					put(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticAssignment_0(), "rule__BehavioralParameterDefinition__IsStaticAssignment_0");
					put(grammarAccess.getBehavioralParameterDefinitionAccess().getNameAssignment_1(), "rule__BehavioralParameterDefinition__NameAssignment_1");
					put(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeAssignment_2_1(), "rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1");
					put(grammarAccess.getBehavioralParameterDefinitionAccess().getValueAssignment_3_1(), "rule__BehavioralParameterDefinition__ValueAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ChannelDefinitionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ChannelDefinitionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
