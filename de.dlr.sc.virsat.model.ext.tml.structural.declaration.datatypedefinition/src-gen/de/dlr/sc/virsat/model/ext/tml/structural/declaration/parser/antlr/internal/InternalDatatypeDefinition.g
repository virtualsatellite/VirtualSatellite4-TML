/*
 * generated by Xtext 2.26.0
 */
grammar InternalDatatypeDefinition;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.services.DatatypeDefinitionGrammarAccess;

}

@parser::members {

 	private DatatypeDefinitionGrammarAccess grammarAccess;

    public InternalDatatypeDefinitionParser(TokenStream input, DatatypeDefinitionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "StartRule";
   	}

   	@Override
   	protected DatatypeDefinitionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleStartRule
entryRuleStartRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStartRuleRule()); }
	iv_ruleStartRule=ruleStartRule
	{ $current=$iv_ruleStartRule.current; }
	EOF;

// Rule StartRule
ruleStartRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStartRuleAccess().getDataTypeParserRuleCall_0());
		}
		this_DataType_0=ruleDataType
		{
			$current = $this_DataType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStartRuleAccess().getExternalTypeParserRuleCall_1());
		}
		this_ExternalType_1=ruleExternalType
		{
			$current = $this_ExternalType_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_abstractType_0_0='abstract'
				{
					newLeafNode(lv_abstractType_0_0, grammarAccess.getDataTypeAccess().getAbstractTypeAbstractKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataTypeRule());
					}
					setWithLastConsumed($current, "abstractType", lv_abstractType_0_0 != null, "abstract");
				}
			)
		)?
		(
			(
				lv_isTMType_1_0='telemetry'
				{
					newLeafNode(lv_isTMType_1_0, grammarAccess.getDataTypeAccess().getIsTMTypeTelemetryKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataTypeRule());
					}
					setWithLastConsumed($current, "isTMType", lv_isTMType_1_0 != null, "telemetry");
				}
			)
		)?
		otherlv_2='DataType'
		{
			newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getDataTypeKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDataTypeAccess().getNameEStringParserRuleCall_3_0());
				}
				lv_name_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataTypeRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='extends'
			{
				newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getExtendsKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataTypeRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getDataTypeAccess().getSuperTypeDataTypeCrossReference_4_1_0());
					}
					ruleFQN
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDataTypeAccess().getAttributesAttributeParserRuleCall_6_0());
				}
				lv_attributes_7_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataTypeRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_7_0,
						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleExternalType
entryRuleExternalType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalTypeRule()); }
	iv_ruleExternalType=ruleExternalType
	{ $current=$iv_ruleExternalType.current; }
	EOF;

// Rule ExternalType
ruleExternalType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='external'
		{
			newLeafNode(otherlv_0, grammarAccess.getExternalTypeAccess().getExternalKeyword_0());
		}
		(
			(
				lv_abstractType_1_0='abstract'
				{
					newLeafNode(lv_abstractType_1_0, grammarAccess.getExternalTypeAccess().getAbstractTypeAbstractKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalTypeRule());
					}
					setWithLastConsumed($current, "abstractType", lv_abstractType_1_0 != null, "abstract");
				}
			)
		)?
		(
			(
				lv_isTMType_2_0='telemetry'
				{
					newLeafNode(lv_isTMType_2_0, grammarAccess.getExternalTypeAccess().getIsTMTypeTelemetryKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalTypeRule());
					}
					setWithLastConsumed($current, "isTMType", lv_isTMType_2_0 != null, "telemetry");
				}
			)
		)?
		otherlv_3='DataType'
		{
			newLeafNode(otherlv_3, grammarAccess.getExternalTypeAccess().getDataTypeKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExternalTypeAccess().getNameEStringParserRuleCall_4_0());
				}
				lv_name_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExternalTypeRule());
					}
					set(
						$current,
						"name",
						lv_name_4_0,
						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='extends'
			{
				newLeafNode(otherlv_5, grammarAccess.getExternalTypeAccess().getExtendsKeyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExternalTypeRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getExternalTypeAccess().getSuperTypeDataTypeCrossReference_5_1_0());
					}
					ruleFQN
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getExternalTypeAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExternalTypeAccess().getAttributesAttributeParserRuleCall_7_0());
				}
				lv_attributes_8_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExternalTypeRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_8_0,
						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getExternalTypeAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isConst_0_0='const'
				{
					newLeafNode(lv_isConst_0_0, grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed($current, "isConst", lv_isConst_0_0 != null, "const");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getTypeOfITypeCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getDimensionsArrayDimensionParserRuleCall_4_0());
				}
				lv_dimensions_4_0=ruleArrayDimension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					add(
						$current,
						"dimensions",
						lv_dimensions_4_0,
						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.ArrayDimension");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				otherlv_5='='
				{
					newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_0_1_0());
						}
						lv_valueLiteral_6_0=ruleEString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAttributeRule());
							}
							set(
								$current,
								"valueLiteral",
								lv_valueLiteral_6_0,
								"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_7=';'
				{
					newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_0_2());
				}
			)
			    |
			otherlv_8=';'
			{
				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_1());
			}
			    |
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0);
						}
									({true}?=>(otherlv_10='{'
									{
										newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0());
									}
									(
										otherlv_11='value'
										{
											newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getValueKeyword_5_2_0_1_0());
										}
										otherlv_12=':'
										{
											newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getColonKeyword_5_2_0_1_1());
										}
										(
											(
												{
													newCompositeNode(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_2_0_1_2_0());
												}
												lv_valueLiteral_13_0=ruleEString
												{
													if ($current==null) {
														$current = createModelElementForParent(grammarAccess.getAttributeRule());
													}
													set(
														$current,
														"valueLiteral",
														lv_valueLiteral_13_0,
														"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
													afterParserOrEnumRuleCall();
												}
											)
										)
										otherlv_14=';'
										{
											newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_0_1_3());
										}
									)?
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1);
						}
									({true}?=>(otherlv_15='max'
									{
										newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getMaxKeyword_5_2_1_0());
									}
									otherlv_16=':'
									{
										newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getColonKeyword_5_2_1_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getAttributeAccess().getMaxValueLiteralEStringParserRuleCall_5_2_1_2_0());
											}
											lv_maxValueLiteral_17_0=ruleEString
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getAttributeRule());
												}
												set(
													$current,
													"maxValueLiteral",
													lv_maxValueLiteral_17_0,
													"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
												afterParserOrEnumRuleCall();
											}
										)
									)
									otherlv_18=';'
									{
										newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_1_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2);
						}
									({true}?=>(otherlv_19='min'
									{
										newLeafNode(otherlv_19, grammarAccess.getAttributeAccess().getMinKeyword_5_2_2_0());
									}
									otherlv_20=':'
									{
										newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getColonKeyword_5_2_2_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getAttributeAccess().getMinValueLiteralEStringParserRuleCall_5_2_2_2_0());
											}
											lv_minValueLiteral_21_0=ruleEString
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getAttributeRule());
												}
												set(
													$current,
													"minValueLiteral",
													lv_minValueLiteral_21_0,
													"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
												afterParserOrEnumRuleCall();
											}
										)
									)
									otherlv_22=';'
									{
										newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_2_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3);
						}
									({true}?=>(otherlv_23='referenceFrame'
									{
										newLeafNode(otherlv_23, grammarAccess.getAttributeAccess().getReferenceFrameKeyword_5_2_3_0());
									}
									otherlv_24=':'
									{
										newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getColonKeyword_5_2_3_1());
									}
									(
										(
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getAttributeRule());
												}
											}
											{
												newCompositeNode(grammarAccess.getAttributeAccess().getReferenceFrameReferenceFrameDefinitionCrossReference_5_2_3_2_0());
											}
											ruleFQN
											{
												afterParserOrEnumRuleCall();
											}
										)
									)
									otherlv_26=';'
									{
										newLeafNode(otherlv_26, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_3_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4);
						}
									({true}?=>((
										otherlv_27='unit'
										{
											newLeafNode(otherlv_27, grammarAccess.getAttributeAccess().getUnitKeyword_5_2_4_0_0());
										}
										otherlv_28=':'
										{
											newLeafNode(otherlv_28, grammarAccess.getAttributeAccess().getColonKeyword_5_2_4_0_1());
										}
										(
											(
												{
													if ($current==null) {
														$current = createModelElement(grammarAccess.getAttributeRule());
													}
												}
												{
													newCompositeNode(grammarAccess.getAttributeAccess().getTypeUnitUnitDefinitionCrossReference_5_2_4_0_2_0());
												}
												ruleFQN
												{
													afterParserOrEnumRuleCall();
												}
											)
										)
										otherlv_30=';'
										{
											newLeafNode(otherlv_30, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_0_3());
										}
									)?
									otherlv_31='}'
									{
										newLeafNode(otherlv_31, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1());
									}
									otherlv_32=';'
									{
										newLeafNode(otherlv_32, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_2());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
					}
			)?
		)
	)
;

// Entry rule entryRuleArrayDimension
entryRuleArrayDimension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayDimensionRule()); }
	iv_ruleArrayDimension=ruleArrayDimension
	{ $current=$iv_ruleArrayDimension.current; }
	EOF;

// Rule ArrayDimension
ruleArrayDimension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getArrayDimensionAccess().getSizeEIntParserRuleCall_1_0());
				}
				lv_size_1_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArrayDimensionRule());
					}
					set(
						$current,
						"size",
						lv_size_1_0,
						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getArrayDimensionAccess().getCommaKeyword_2_0());
			}
			otherlv_3='name'
			{
				newLeafNode(otherlv_3, grammarAccess.getArrayDimensionAccess().getNameKeyword_2_1());
			}
			otherlv_4='='
			{
				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionAccess().getEqualsSignKeyword_2_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArrayDimensionAccess().getNameEStringParserRuleCall_2_3_0());
					}
					lv_name_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArrayDimensionRule());
						}
						set(
							$current,
							"name",
							lv_name_5_0,
							"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6=']'
		{
			newLeafNode(otherlv_6, grammarAccess.getArrayDimensionAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
