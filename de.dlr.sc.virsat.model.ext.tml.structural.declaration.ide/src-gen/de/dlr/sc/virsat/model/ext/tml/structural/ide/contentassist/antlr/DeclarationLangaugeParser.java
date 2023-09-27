/*
 * generated by Xtext 2.26.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.dlr.sc.virsat.model.ext.tml.structural.ide.contentassist.antlr.internal.InternalDeclarationLangaugeParser;
import de.dlr.sc.virsat.model.ext.tml.structural.services.DeclarationLangaugeGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DeclarationLangaugeParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DeclarationLangaugeGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DeclarationLangaugeGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAttributeAccess().getAlternatives_5(), "rule__Attribute__Alternatives_5");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_5_0(), "rule__Attribute__Group_5_0__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_5_2_0(), "rule__Attribute__Group_5_2_0__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_5_2_0_1(), "rule__Attribute__Group_5_2_0_1__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_5_2_1(), "rule__Attribute__Group_5_2_1__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_5_2_2(), "rule__Attribute__Group_5_2_2__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_5_2_3(), "rule__Attribute__Group_5_2_3__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_5_2_4(), "rule__Attribute__Group_5_2_4__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_5_2_4_0(), "rule__Attribute__Group_5_2_4_0__0");
			builder.put(grammarAccess.getArrayDimensionAccess().getGroup(), "rule__ArrayDimension__Group__0");
			builder.put(grammarAccess.getArrayDimensionAccess().getGroup_2(), "rule__ArrayDimension__Group_2__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getAttributeAccess().getIsConstAssignment_0(), "rule__Attribute__IsConstAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getTypeOfAssignment_3(), "rule__Attribute__TypeOfAssignment_3");
			builder.put(grammarAccess.getAttributeAccess().getDimensionsAssignment_4(), "rule__Attribute__DimensionsAssignment_4");
			builder.put(grammarAccess.getAttributeAccess().getValueLiteralAssignment_5_0_1(), "rule__Attribute__ValueLiteralAssignment_5_0_1");
			builder.put(grammarAccess.getAttributeAccess().getValueLiteralAssignment_5_2_0_1_2(), "rule__Attribute__ValueLiteralAssignment_5_2_0_1_2");
			builder.put(grammarAccess.getAttributeAccess().getMaxValueLiteralAssignment_5_2_1_2(), "rule__Attribute__MaxValueLiteralAssignment_5_2_1_2");
			builder.put(grammarAccess.getAttributeAccess().getMinValueLiteralAssignment_5_2_2_2(), "rule__Attribute__MinValueLiteralAssignment_5_2_2_2");
			builder.put(grammarAccess.getAttributeAccess().getReferenceFrameAssignment_5_2_3_2(), "rule__Attribute__ReferenceFrameAssignment_5_2_3_2");
			builder.put(grammarAccess.getAttributeAccess().getTypeUnitAssignment_5_2_4_0_2(), "rule__Attribute__TypeUnitAssignment_5_2_4_0_2");
			builder.put(grammarAccess.getArrayDimensionAccess().getSizeAssignment_1(), "rule__ArrayDimension__SizeAssignment_1");
			builder.put(grammarAccess.getArrayDimensionAccess().getNameAssignment_2_3(), "rule__ArrayDimension__NameAssignment_2_3");
			builder.put(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), "rule__Attribute__UnorderedGroup_5_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DeclarationLangaugeGrammarAccess grammarAccess;

	@Override
	protected InternalDeclarationLangaugeParser createParser() {
		InternalDeclarationLangaugeParser result = new InternalDeclarationLangaugeParser(null);
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

	public DeclarationLangaugeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DeclarationLangaugeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
