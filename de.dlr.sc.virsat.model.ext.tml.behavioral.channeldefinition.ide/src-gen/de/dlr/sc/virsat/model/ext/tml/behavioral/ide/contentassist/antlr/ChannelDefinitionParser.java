/*
 * generated by Xtext 2.26.0
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.dlr.sc.virsat.model.ext.tml.behavioral.ide.contentassist.antlr.internal.InternalChannelDefinitionParser;
import de.dlr.sc.virsat.model.ext.tml.behavioral.services.ChannelDefinitionGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ChannelDefinitionParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ChannelDefinitionGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ChannelDefinitionGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getChannelBehaviorDefinitionAccess().getAlternatives_5(), "rule__ChannelBehaviorDefinition__Alternatives_5");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEnumStorageTypeAccess().getAlternatives(), "rule__EnumStorageType__Alternatives");
			builder.put(grammarAccess.getEnumValueTypeAccess().getAlternatives(), "rule__EnumValueType__Alternatives");
			builder.put(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup(), "rule__ChannelBehaviorDefinition__Group__0");
			builder.put(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_4(), "rule__ChannelBehaviorDefinition__Group_4__0");
			builder.put(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_5_0(), "rule__ChannelBehaviorDefinition__Group_5_0__0");
			builder.put(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup(), "rule__BehavioralParameterDefinition__Group__0");
			builder.put(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_2(), "rule__BehavioralParameterDefinition__Group_2__0");
			builder.put(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_3(), "rule__BehavioralParameterDefinition__Group_3__0");
			builder.put(grammarAccess.getChannelBehaviorDefinitionAccess().getNameAssignment_1(), "rule__ChannelBehaviorDefinition__NameAssignment_1");
			builder.put(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeAssignment_3(), "rule__ChannelBehaviorDefinition__StorageTypeAssignment_3");
			builder.put(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameAssignment_4_1(), "rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1");
			builder.put(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersAssignment_5_0_1(), "rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1");
			builder.put(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticAssignment_0(), "rule__BehavioralParameterDefinition__IsStaticAssignment_0");
			builder.put(grammarAccess.getBehavioralParameterDefinitionAccess().getNameAssignment_1(), "rule__BehavioralParameterDefinition__NameAssignment_1");
			builder.put(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeAssignment_2_1(), "rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1");
			builder.put(grammarAccess.getBehavioralParameterDefinitionAccess().getValueAssignment_3_1(), "rule__BehavioralParameterDefinition__ValueAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ChannelDefinitionGrammarAccess grammarAccess;

	@Override
	protected InternalChannelDefinitionParser createParser() {
		InternalChannelDefinitionParser result = new InternalChannelDefinitionParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
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
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
