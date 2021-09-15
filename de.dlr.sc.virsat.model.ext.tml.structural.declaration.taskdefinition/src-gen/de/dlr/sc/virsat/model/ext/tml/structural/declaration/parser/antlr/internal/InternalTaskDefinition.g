/*
 * generated by Xtext 2.22.0
 */
grammar InternalTaskDefinition;

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
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.services.TaskDefinitionGrammarAccess;

}

@parser::members {

 	private TaskDefinitionGrammarAccess grammarAccess;

    public InternalTaskDefinitionParser(TokenStream input, TaskDefinitionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TaskDefinition";
   	}

   	@Override
   	protected TaskDefinitionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTaskDefinition
entryRuleTaskDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskDefinitionRule()); }
	iv_ruleTaskDefinition=ruleTaskDefinition
	{ $current=$iv_ruleTaskDefinition.current; }
	EOF;

// Rule TaskDefinition
ruleTaskDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{ 
			  getUnorderedGroupHelper().enter(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
			}
			(
				(
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0);
				}
							({true}?=>(otherlv_1='Task'
							{
								newLeafNode(otherlv_1, grammarAccess.getTaskDefinitionAccess().getTaskKeyword_0_0());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getTaskDefinitionAccess().getNameEStringParserRuleCall_0_1_0());
									}
									lv_name_2_0=ruleEString
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
										}
										set(
											$current,
											"name",
											lv_name_2_0,
											"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
										afterParserOrEnumRuleCall();
									}
								)
							)
							otherlv_3='{'
							{
								newLeafNode(otherlv_3, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_0_2());
							}
							(
								otherlv_4='inputs'
								{
									newLeafNode(otherlv_4, grammarAccess.getTaskDefinitionAccess().getInputsKeyword_0_3_0());
								}
								otherlv_5='{'
								{
									newLeafNode(otherlv_5, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_0_3_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getTaskDefinitionAccess().getInputsTaskInputDefinitionParserRuleCall_0_3_2_0());
										}
										lv_inputs_6_0=ruleTaskInputDefinition
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
											}
											add(
												$current,
												"inputs",
												lv_inputs_6_0,
												"de.dlr.sc.virsat.model.ext.tml.structural.declaration.TaskDefinition.TaskInputDefinition");
											afterParserOrEnumRuleCall();
										}
									)
								)*
								otherlv_7='}'
								{
									newLeafNode(otherlv_7, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_0_3_3());
								}
							)?
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1);
				}
							({true}?=>(otherlv_8='outputs'
							{
								newLeafNode(otherlv_8, grammarAccess.getTaskDefinitionAccess().getOutputsKeyword_1_0());
							}
							otherlv_9='{'
							{
								newLeafNode(otherlv_9, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_1_1());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getTaskDefinitionAccess().getOutputsTaskOutputDefinitionParserRuleCall_1_2_0());
									}
									lv_outputs_10_0=ruleTaskOutputDefinition
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
										}
										add(
											$current,
											"outputs",
											lv_outputs_10_0,
											"de.dlr.sc.virsat.model.ext.tml.structural.declaration.TaskDefinition.TaskOutputDefinition");
										afterParserOrEnumRuleCall();
									}
								)
							)*
							otherlv_11='}'
							{
								newLeafNode(otherlv_11, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_1_3());
							}
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2);
				}
							({true}?=>((
								otherlv_12='parameters'
								{
									newLeafNode(otherlv_12, grammarAccess.getTaskDefinitionAccess().getParametersKeyword_2_0_0());
								}
								otherlv_13='{'
								{
									newLeafNode(otherlv_13, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getTaskDefinitionAccess().getParametersAttributeParserRuleCall_2_0_2_0());
										}
										lv_parameters_14_0=ruleAttribute
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
											}
											add(
												$current,
												"parameters",
												lv_parameters_14_0,
												"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.Attribute");
											afterParserOrEnumRuleCall();
										}
									)
								)*
								otherlv_15='}'
								{
									newLeafNode(otherlv_15, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_2_0_3());
								}
							)?
							otherlv_16='}'
							{
								newLeafNode(otherlv_16, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_2_1());
							}
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
				}
			)
		)
				)+
				{getUnorderedGroupHelper().canLeave(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup())}?
			)
		)
			{ 
			  getUnorderedGroupHelper().leave(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
			}
	)
;

// Entry rule entryRuleTaskInputDefinition
entryRuleTaskInputDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskInputDefinitionRule()); }
	iv_ruleTaskInputDefinition=ruleTaskInputDefinition
	{ $current=$iv_ruleTaskInputDefinition.current; }
	EOF;

// Rule TaskInputDefinition
ruleTaskInputDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskInputDefinitionAccess().getNameEStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskInputDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getTaskInputDefinitionAccess().getColonKeyword_1_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTaskInputDefinitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTaskInputDefinitionAccess().getDataTypeDataTypeCrossReference_1_1_0());
					}
					ruleFQN
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getTaskInputDefinitionAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleTaskOutputDefinition
entryRuleTaskOutputDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskOutputDefinitionRule()); }
	iv_ruleTaskOutputDefinition=ruleTaskOutputDefinition
	{ $current=$iv_ruleTaskOutputDefinition.current; }
	EOF;

// Rule TaskOutputDefinition
ruleTaskOutputDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskOutputDefinitionAccess().getNameEStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskOutputDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getTaskOutputDefinitionAccess().getColonKeyword_1_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTaskOutputDefinitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTaskOutputDefinitionAccess().getDataTypeDataTypeCrossReference_1_1_0());
					}
					ruleFQN
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getTaskOutputDefinitionAccess().getSemicolonKeyword_2());
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
