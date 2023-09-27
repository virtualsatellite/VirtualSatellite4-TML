package de.dlr.sc.virsat.model.ext.tml.behavioral.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dlr.sc.virsat.model.ext.tml.behavioral.services.ChannelDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChannelDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Channel'", "':'", "'implementation:'", "'{'", "'}'", "';'", "'static'", "'='", "'DOUBLE_BUFFER'", "'FIFO'", "'LIFO'", "'EVENT_ONLY'", "'CUSTOM'", "'INTEGER'", "'FLOAT'", "'STRING'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalChannelDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalChannelDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalChannelDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalChannelDefinition.g"; }



     	private ChannelDefinitionGrammarAccess grammarAccess;

        public InternalChannelDefinitionParser(TokenStream input, ChannelDefinitionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ChannelBehaviorDefinition";
       	}

       	@Override
       	protected ChannelDefinitionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleChannelBehaviorDefinition"
    // InternalChannelDefinition.g:65:1: entryRuleChannelBehaviorDefinition returns [EObject current=null] : iv_ruleChannelBehaviorDefinition= ruleChannelBehaviorDefinition EOF ;
    public final EObject entryRuleChannelBehaviorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelBehaviorDefinition = null;


        try {
            // InternalChannelDefinition.g:65:66: (iv_ruleChannelBehaviorDefinition= ruleChannelBehaviorDefinition EOF )
            // InternalChannelDefinition.g:66:2: iv_ruleChannelBehaviorDefinition= ruleChannelBehaviorDefinition EOF
            {
             newCompositeNode(grammarAccess.getChannelBehaviorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannelBehaviorDefinition=ruleChannelBehaviorDefinition();

            state._fsp--;

             current =iv_ruleChannelBehaviorDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChannelBehaviorDefinition"


    // $ANTLR start "ruleChannelBehaviorDefinition"
    // InternalChannelDefinition.g:72:1: ruleChannelBehaviorDefinition returns [EObject current=null] : (otherlv_0= 'Channel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_storageType_3_0= ruleEnumStorageType ) ) (otherlv_4= 'implementation:' ( (lv_implName_5_0= ruleEString ) ) )? ( (otherlv_6= '{' ( (lv_parameters_7_0= ruleBehavioralParameterDefinition ) )* otherlv_8= '}' ) | otherlv_9= ';' ) ) ;
    public final EObject ruleChannelBehaviorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_storageType_3_0 = null;

        AntlrDatatypeRuleToken lv_implName_5_0 = null;

        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalChannelDefinition.g:78:2: ( (otherlv_0= 'Channel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_storageType_3_0= ruleEnumStorageType ) ) (otherlv_4= 'implementation:' ( (lv_implName_5_0= ruleEString ) ) )? ( (otherlv_6= '{' ( (lv_parameters_7_0= ruleBehavioralParameterDefinition ) )* otherlv_8= '}' ) | otherlv_9= ';' ) ) )
            // InternalChannelDefinition.g:79:2: (otherlv_0= 'Channel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_storageType_3_0= ruleEnumStorageType ) ) (otherlv_4= 'implementation:' ( (lv_implName_5_0= ruleEString ) ) )? ( (otherlv_6= '{' ( (lv_parameters_7_0= ruleBehavioralParameterDefinition ) )* otherlv_8= '}' ) | otherlv_9= ';' ) )
            {
            // InternalChannelDefinition.g:79:2: (otherlv_0= 'Channel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_storageType_3_0= ruleEnumStorageType ) ) (otherlv_4= 'implementation:' ( (lv_implName_5_0= ruleEString ) ) )? ( (otherlv_6= '{' ( (lv_parameters_7_0= ruleBehavioralParameterDefinition ) )* otherlv_8= '}' ) | otherlv_9= ';' ) )
            // InternalChannelDefinition.g:80:3: otherlv_0= 'Channel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_storageType_3_0= ruleEnumStorageType ) ) (otherlv_4= 'implementation:' ( (lv_implName_5_0= ruleEString ) ) )? ( (otherlv_6= '{' ( (lv_parameters_7_0= ruleBehavioralParameterDefinition ) )* otherlv_8= '}' ) | otherlv_9= ';' )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChannelBehaviorDefinitionAccess().getChannelKeyword_0());
            		
            // InternalChannelDefinition.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalChannelDefinition.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalChannelDefinition.g:85:4: (lv_name_1_0= ruleEString )
            // InternalChannelDefinition.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChannelBehaviorDefinitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChannelBehaviorDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getChannelBehaviorDefinitionAccess().getColonKeyword_2());
            		
            // InternalChannelDefinition.g:107:3: ( (lv_storageType_3_0= ruleEnumStorageType ) )
            // InternalChannelDefinition.g:108:4: (lv_storageType_3_0= ruleEnumStorageType )
            {
            // InternalChannelDefinition.g:108:4: (lv_storageType_3_0= ruleEnumStorageType )
            // InternalChannelDefinition.g:109:5: lv_storageType_3_0= ruleEnumStorageType
            {

            					newCompositeNode(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeEnumStorageTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_storageType_3_0=ruleEnumStorageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChannelBehaviorDefinitionRule());
            					}
            					set(
            						current,
            						"storageType",
            						lv_storageType_3_0,
            						"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EnumStorageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChannelDefinition.g:126:3: (otherlv_4= 'implementation:' ( (lv_implName_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalChannelDefinition.g:127:4: otherlv_4= 'implementation:' ( (lv_implName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getChannelBehaviorDefinitionAccess().getImplementationKeyword_4_0());
                    			
                    // InternalChannelDefinition.g:131:4: ( (lv_implName_5_0= ruleEString ) )
                    // InternalChannelDefinition.g:132:5: (lv_implName_5_0= ruleEString )
                    {
                    // InternalChannelDefinition.g:132:5: (lv_implName_5_0= ruleEString )
                    // InternalChannelDefinition.g:133:6: lv_implName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_implName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChannelBehaviorDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"implName",
                    							lv_implName_5_0,
                    							"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalChannelDefinition.g:151:3: ( (otherlv_6= '{' ( (lv_parameters_7_0= ruleBehavioralParameterDefinition ) )* otherlv_8= '}' ) | otherlv_9= ';' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalChannelDefinition.g:152:4: (otherlv_6= '{' ( (lv_parameters_7_0= ruleBehavioralParameterDefinition ) )* otherlv_8= '}' )
                    {
                    // InternalChannelDefinition.g:152:4: (otherlv_6= '{' ( (lv_parameters_7_0= ruleBehavioralParameterDefinition ) )* otherlv_8= '}' )
                    // InternalChannelDefinition.g:153:5: otherlv_6= '{' ( (lv_parameters_7_0= ruleBehavioralParameterDefinition ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    					newLeafNode(otherlv_6, grammarAccess.getChannelBehaviorDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0());
                    				
                    // InternalChannelDefinition.g:157:5: ( (lv_parameters_7_0= ruleBehavioralParameterDefinition ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalChannelDefinition.g:158:6: (lv_parameters_7_0= ruleBehavioralParameterDefinition )
                    	    {
                    	    // InternalChannelDefinition.g:158:6: (lv_parameters_7_0= ruleBehavioralParameterDefinition )
                    	    // InternalChannelDefinition.g:159:7: lv_parameters_7_0= ruleBehavioralParameterDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersBehavioralParameterDefinitionParserRuleCall_5_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_7_0=ruleBehavioralParameterDefinition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChannelBehaviorDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_7_0,
                    	    								"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.BehavioralParameterDefinition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getChannelBehaviorDefinitionAccess().getRightCurlyBracketKeyword_5_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalChannelDefinition.g:182:4: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getChannelBehaviorDefinitionAccess().getSemicolonKeyword_5_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChannelBehaviorDefinition"


    // $ANTLR start "entryRuleBehavioralParameterDefinition"
    // InternalChannelDefinition.g:191:1: entryRuleBehavioralParameterDefinition returns [EObject current=null] : iv_ruleBehavioralParameterDefinition= ruleBehavioralParameterDefinition EOF ;
    public final EObject entryRuleBehavioralParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavioralParameterDefinition = null;


        try {
            // InternalChannelDefinition.g:191:70: (iv_ruleBehavioralParameterDefinition= ruleBehavioralParameterDefinition EOF )
            // InternalChannelDefinition.g:192:2: iv_ruleBehavioralParameterDefinition= ruleBehavioralParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getBehavioralParameterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehavioralParameterDefinition=ruleBehavioralParameterDefinition();

            state._fsp--;

             current =iv_ruleBehavioralParameterDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehavioralParameterDefinition"


    // $ANTLR start "ruleBehavioralParameterDefinition"
    // InternalChannelDefinition.g:198:1: ruleBehavioralParameterDefinition returns [EObject current=null] : ( ( (lv_isStatic_0_0= 'static' ) )? ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_valueType_3_0= ruleEnumValueType ) ) )? (otherlv_4= '=' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleBehavioralParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_valueType_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalChannelDefinition.g:204:2: ( ( ( (lv_isStatic_0_0= 'static' ) )? ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_valueType_3_0= ruleEnumValueType ) ) )? (otherlv_4= '=' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= ';' ) )
            // InternalChannelDefinition.g:205:2: ( ( (lv_isStatic_0_0= 'static' ) )? ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_valueType_3_0= ruleEnumValueType ) ) )? (otherlv_4= '=' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= ';' )
            {
            // InternalChannelDefinition.g:205:2: ( ( (lv_isStatic_0_0= 'static' ) )? ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_valueType_3_0= ruleEnumValueType ) ) )? (otherlv_4= '=' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= ';' )
            // InternalChannelDefinition.g:206:3: ( (lv_isStatic_0_0= 'static' ) )? ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_valueType_3_0= ruleEnumValueType ) ) )? (otherlv_4= '=' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= ';'
            {
            // InternalChannelDefinition.g:206:3: ( (lv_isStatic_0_0= 'static' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalChannelDefinition.g:207:4: (lv_isStatic_0_0= 'static' )
                    {
                    // InternalChannelDefinition.g:207:4: (lv_isStatic_0_0= 'static' )
                    // InternalChannelDefinition.g:208:5: lv_isStatic_0_0= 'static'
                    {
                    lv_isStatic_0_0=(Token)match(input,17,FOLLOW_3); 

                    					newLeafNode(lv_isStatic_0_0, grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticStaticKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBehavioralParameterDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isStatic", lv_isStatic_0_0 != null, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalChannelDefinition.g:220:3: ( (lv_name_1_0= ruleEString ) )
            // InternalChannelDefinition.g:221:4: (lv_name_1_0= ruleEString )
            {
            // InternalChannelDefinition.g:221:4: (lv_name_1_0= ruleEString )
            // InternalChannelDefinition.g:222:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBehavioralParameterDefinitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehavioralParameterDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChannelDefinition.g:239:3: (otherlv_2= ':' ( (lv_valueType_3_0= ruleEnumValueType ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalChannelDefinition.g:240:4: otherlv_2= ':' ( (lv_valueType_3_0= ruleEnumValueType ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getBehavioralParameterDefinitionAccess().getColonKeyword_2_0());
                    			
                    // InternalChannelDefinition.g:244:4: ( (lv_valueType_3_0= ruleEnumValueType ) )
                    // InternalChannelDefinition.g:245:5: (lv_valueType_3_0= ruleEnumValueType )
                    {
                    // InternalChannelDefinition.g:245:5: (lv_valueType_3_0= ruleEnumValueType )
                    // InternalChannelDefinition.g:246:6: lv_valueType_3_0= ruleEnumValueType
                    {

                    						newCompositeNode(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeEnumValueTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_valueType_3_0=ruleEnumValueType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehavioralParameterDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"valueType",
                    							lv_valueType_3_0,
                    							"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EnumValueType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalChannelDefinition.g:264:3: (otherlv_4= '=' ( (lv_value_5_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalChannelDefinition.g:265:4: otherlv_4= '=' ( (lv_value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehavioralParameterDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalChannelDefinition.g:269:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalChannelDefinition.g:270:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalChannelDefinition.g:270:5: (lv_value_5_0= ruleEString )
                    // InternalChannelDefinition.g:271:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBehavioralParameterDefinitionAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehavioralParameterDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBehavioralParameterDefinitionAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehavioralParameterDefinition"


    // $ANTLR start "entryRuleEString"
    // InternalChannelDefinition.g:297:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalChannelDefinition.g:297:47: (iv_ruleEString= ruleEString EOF )
            // InternalChannelDefinition.g:298:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalChannelDefinition.g:304:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalChannelDefinition.g:310:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalChannelDefinition.g:311:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalChannelDefinition.g:311:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalChannelDefinition.g:312:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalChannelDefinition.g:320:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleEnumStorageType"
    // InternalChannelDefinition.g:331:1: ruleEnumStorageType returns [Enumerator current=null] : ( (enumLiteral_0= 'DOUBLE_BUFFER' ) | (enumLiteral_1= 'FIFO' ) | (enumLiteral_2= 'LIFO' ) | (enumLiteral_3= 'EVENT_ONLY' ) | (enumLiteral_4= 'CUSTOM' ) ) ;
    public final Enumerator ruleEnumStorageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalChannelDefinition.g:337:2: ( ( (enumLiteral_0= 'DOUBLE_BUFFER' ) | (enumLiteral_1= 'FIFO' ) | (enumLiteral_2= 'LIFO' ) | (enumLiteral_3= 'EVENT_ONLY' ) | (enumLiteral_4= 'CUSTOM' ) ) )
            // InternalChannelDefinition.g:338:2: ( (enumLiteral_0= 'DOUBLE_BUFFER' ) | (enumLiteral_1= 'FIFO' ) | (enumLiteral_2= 'LIFO' ) | (enumLiteral_3= 'EVENT_ONLY' ) | (enumLiteral_4= 'CUSTOM' ) )
            {
            // InternalChannelDefinition.g:338:2: ( (enumLiteral_0= 'DOUBLE_BUFFER' ) | (enumLiteral_1= 'FIFO' ) | (enumLiteral_2= 'LIFO' ) | (enumLiteral_3= 'EVENT_ONLY' ) | (enumLiteral_4= 'CUSTOM' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalChannelDefinition.g:339:3: (enumLiteral_0= 'DOUBLE_BUFFER' )
                    {
                    // InternalChannelDefinition.g:339:3: (enumLiteral_0= 'DOUBLE_BUFFER' )
                    // InternalChannelDefinition.g:340:4: enumLiteral_0= 'DOUBLE_BUFFER'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getEnumStorageTypeAccess().getDOUBLE_BUFFEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumStorageTypeAccess().getDOUBLE_BUFFEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChannelDefinition.g:347:3: (enumLiteral_1= 'FIFO' )
                    {
                    // InternalChannelDefinition.g:347:3: (enumLiteral_1= 'FIFO' )
                    // InternalChannelDefinition.g:348:4: enumLiteral_1= 'FIFO'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getEnumStorageTypeAccess().getFIFOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumStorageTypeAccess().getFIFOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalChannelDefinition.g:355:3: (enumLiteral_2= 'LIFO' )
                    {
                    // InternalChannelDefinition.g:355:3: (enumLiteral_2= 'LIFO' )
                    // InternalChannelDefinition.g:356:4: enumLiteral_2= 'LIFO'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getEnumStorageTypeAccess().getLIFOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEnumStorageTypeAccess().getLIFOEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalChannelDefinition.g:363:3: (enumLiteral_3= 'EVENT_ONLY' )
                    {
                    // InternalChannelDefinition.g:363:3: (enumLiteral_3= 'EVENT_ONLY' )
                    // InternalChannelDefinition.g:364:4: enumLiteral_3= 'EVENT_ONLY'
                    {
                    enumLiteral_3=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getEnumStorageTypeAccess().getEVENT_ONLYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEnumStorageTypeAccess().getEVENT_ONLYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalChannelDefinition.g:371:3: (enumLiteral_4= 'CUSTOM' )
                    {
                    // InternalChannelDefinition.g:371:3: (enumLiteral_4= 'CUSTOM' )
                    // InternalChannelDefinition.g:372:4: enumLiteral_4= 'CUSTOM'
                    {
                    enumLiteral_4=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEnumStorageTypeAccess().getCUSTOMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEnumStorageTypeAccess().getCUSTOMEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumStorageType"


    // $ANTLR start "ruleEnumValueType"
    // InternalChannelDefinition.g:382:1: ruleEnumValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'INTEGER' ) | (enumLiteral_1= 'FLOAT' ) | (enumLiteral_2= 'STRING' ) ) ;
    public final Enumerator ruleEnumValueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalChannelDefinition.g:388:2: ( ( (enumLiteral_0= 'INTEGER' ) | (enumLiteral_1= 'FLOAT' ) | (enumLiteral_2= 'STRING' ) ) )
            // InternalChannelDefinition.g:389:2: ( (enumLiteral_0= 'INTEGER' ) | (enumLiteral_1= 'FLOAT' ) | (enumLiteral_2= 'STRING' ) )
            {
            // InternalChannelDefinition.g:389:2: ( (enumLiteral_0= 'INTEGER' ) | (enumLiteral_1= 'FLOAT' ) | (enumLiteral_2= 'STRING' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalChannelDefinition.g:390:3: (enumLiteral_0= 'INTEGER' )
                    {
                    // InternalChannelDefinition.g:390:3: (enumLiteral_0= 'INTEGER' )
                    // InternalChannelDefinition.g:391:4: enumLiteral_0= 'INTEGER'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEnumValueTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumValueTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChannelDefinition.g:398:3: (enumLiteral_1= 'FLOAT' )
                    {
                    // InternalChannelDefinition.g:398:3: (enumLiteral_1= 'FLOAT' )
                    // InternalChannelDefinition.g:399:4: enumLiteral_1= 'FLOAT'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getEnumValueTypeAccess().getFLOATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumValueTypeAccess().getFLOATEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalChannelDefinition.g:406:3: (enumLiteral_2= 'STRING' )
                    {
                    // InternalChannelDefinition.g:406:3: (enumLiteral_2= 'STRING' )
                    // InternalChannelDefinition.g:407:4: enumLiteral_2= 'STRING'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getEnumValueTypeAccess().getSTRINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEnumValueTypeAccess().getSTRINGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumValueType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000028030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000051000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});

}