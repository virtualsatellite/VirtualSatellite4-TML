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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatatypeDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'abstract'", "'telemetry'", "'DataType'", "'extends'", "'{'", "'}'", "'external'", "'const'", "':'", "'='", "';'", "'value'", "'max'", "'min'", "'referenceFrame'", "'unit'", "'['", "','", "'name'", "']'", "'-'", "'.'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDatatypeDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDatatypeDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDatatypeDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDatatypeDefinition.g"; }



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




    // $ANTLR start "entryRuleStartRule"
    // InternalDatatypeDefinition.g:64:1: entryRuleStartRule returns [EObject current=null] : iv_ruleStartRule= ruleStartRule EOF ;
    public final EObject entryRuleStartRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartRule = null;


        try {
            // InternalDatatypeDefinition.g:64:50: (iv_ruleStartRule= ruleStartRule EOF )
            // InternalDatatypeDefinition.g:65:2: iv_ruleStartRule= ruleStartRule EOF
            {
             newCompositeNode(grammarAccess.getStartRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartRule=ruleStartRule();

            state._fsp--;

             current =iv_ruleStartRule; 
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
    // $ANTLR end "entryRuleStartRule"


    // $ANTLR start "ruleStartRule"
    // InternalDatatypeDefinition.g:71:1: ruleStartRule returns [EObject current=null] : (this_DataType_0= ruleDataType | this_ExternalType_1= ruleExternalType ) ;
    public final EObject ruleStartRule() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_ExternalType_1 = null;



        	enterRule();

        try {
            // InternalDatatypeDefinition.g:77:2: ( (this_DataType_0= ruleDataType | this_ExternalType_1= ruleExternalType ) )
            // InternalDatatypeDefinition.g:78:2: (this_DataType_0= ruleDataType | this_ExternalType_1= ruleExternalType )
            {
            // InternalDatatypeDefinition.g:78:2: (this_DataType_0= ruleDataType | this_ExternalType_1= ruleExternalType )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=13)) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDatatypeDefinition.g:79:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getStartRuleAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDatatypeDefinition.g:88:3: this_ExternalType_1= ruleExternalType
                    {

                    			newCompositeNode(grammarAccess.getStartRuleAccess().getExternalTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalType_1=ruleExternalType();

                    state._fsp--;


                    			current = this_ExternalType_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleStartRule"


    // $ANTLR start "entryRuleDataType"
    // InternalDatatypeDefinition.g:100:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDatatypeDefinition.g:100:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDatatypeDefinition.g:101:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDatatypeDefinition.g:107:1: ruleDataType returns [EObject current=null] : ( ( (lv_abstractType_0_0= 'abstract' ) )? ( (lv_isTMType_1_0= 'telemetry' ) )? otherlv_2= 'DataType' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleFQN ) ) )? otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= '}' ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_abstractType_0_0=null;
        Token lv_isTMType_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalDatatypeDefinition.g:113:2: ( ( ( (lv_abstractType_0_0= 'abstract' ) )? ( (lv_isTMType_1_0= 'telemetry' ) )? otherlv_2= 'DataType' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleFQN ) ) )? otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= '}' ) )
            // InternalDatatypeDefinition.g:114:2: ( ( (lv_abstractType_0_0= 'abstract' ) )? ( (lv_isTMType_1_0= 'telemetry' ) )? otherlv_2= 'DataType' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleFQN ) ) )? otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= '}' )
            {
            // InternalDatatypeDefinition.g:114:2: ( ( (lv_abstractType_0_0= 'abstract' ) )? ( (lv_isTMType_1_0= 'telemetry' ) )? otherlv_2= 'DataType' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleFQN ) ) )? otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= '}' )
            // InternalDatatypeDefinition.g:115:3: ( (lv_abstractType_0_0= 'abstract' ) )? ( (lv_isTMType_1_0= 'telemetry' ) )? otherlv_2= 'DataType' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleFQN ) ) )? otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= '}'
            {
            // InternalDatatypeDefinition.g:115:3: ( (lv_abstractType_0_0= 'abstract' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDatatypeDefinition.g:116:4: (lv_abstractType_0_0= 'abstract' )
                    {
                    // InternalDatatypeDefinition.g:116:4: (lv_abstractType_0_0= 'abstract' )
                    // InternalDatatypeDefinition.g:117:5: lv_abstractType_0_0= 'abstract'
                    {
                    lv_abstractType_0_0=(Token)match(input,11,FOLLOW_3); 

                    					newLeafNode(lv_abstractType_0_0, grammarAccess.getDataTypeAccess().getAbstractTypeAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "abstractType", lv_abstractType_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalDatatypeDefinition.g:129:3: ( (lv_isTMType_1_0= 'telemetry' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDatatypeDefinition.g:130:4: (lv_isTMType_1_0= 'telemetry' )
                    {
                    // InternalDatatypeDefinition.g:130:4: (lv_isTMType_1_0= 'telemetry' )
                    // InternalDatatypeDefinition.g:131:5: lv_isTMType_1_0= 'telemetry'
                    {
                    lv_isTMType_1_0=(Token)match(input,12,FOLLOW_4); 

                    					newLeafNode(lv_isTMType_1_0, grammarAccess.getDataTypeAccess().getIsTMTypeTelemetryKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "isTMType", lv_isTMType_1_0 != null, "telemetry");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getDataTypeKeyword_2());
            		
            // InternalDatatypeDefinition.g:147:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDatatypeDefinition.g:148:4: (lv_name_3_0= ruleEString )
            {
            // InternalDatatypeDefinition.g:148:4: (lv_name_3_0= ruleEString )
            // InternalDatatypeDefinition.g:149:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataTypeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatatypeDefinition.g:166:3: (otherlv_4= 'extends' ( ( ruleFQN ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDatatypeDefinition.g:167:4: otherlv_4= 'extends' ( ( ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getExtendsKeyword_4_0());
                    			
                    // InternalDatatypeDefinition.g:171:4: ( ( ruleFQN ) )
                    // InternalDatatypeDefinition.g:172:5: ( ruleFQN )
                    {
                    // InternalDatatypeDefinition.g:172:5: ( ruleFQN )
                    // InternalDatatypeDefinition.g:173:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataTypeAccess().getSuperTypeDataTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDatatypeDefinition.g:192:3: ( (lv_attributes_7_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDatatypeDefinition.g:193:4: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // InternalDatatypeDefinition.g:193:4: (lv_attributes_7_0= ruleAttribute )
            	    // InternalDatatypeDefinition.g:194:5: lv_attributes_7_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getDataTypeAccess().getAttributesAttributeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_7_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_7_0,
            	    						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleExternalType"
    // InternalDatatypeDefinition.g:219:1: entryRuleExternalType returns [EObject current=null] : iv_ruleExternalType= ruleExternalType EOF ;
    public final EObject entryRuleExternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalType = null;


        try {
            // InternalDatatypeDefinition.g:219:53: (iv_ruleExternalType= ruleExternalType EOF )
            // InternalDatatypeDefinition.g:220:2: iv_ruleExternalType= ruleExternalType EOF
            {
             newCompositeNode(grammarAccess.getExternalTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalType=ruleExternalType();

            state._fsp--;

             current =iv_ruleExternalType; 
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
    // $ANTLR end "entryRuleExternalType"


    // $ANTLR start "ruleExternalType"
    // InternalDatatypeDefinition.g:226:1: ruleExternalType returns [EObject current=null] : (otherlv_0= 'external' ( (lv_abstractType_1_0= 'abstract' ) )? ( (lv_isTMType_2_0= 'telemetry' ) )? otherlv_3= 'DataType' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'extends' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) ;
    public final EObject ruleExternalType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_abstractType_1_0=null;
        Token lv_isTMType_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_attributes_8_0 = null;



        	enterRule();

        try {
            // InternalDatatypeDefinition.g:232:2: ( (otherlv_0= 'external' ( (lv_abstractType_1_0= 'abstract' ) )? ( (lv_isTMType_2_0= 'telemetry' ) )? otherlv_3= 'DataType' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'extends' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) )
            // InternalDatatypeDefinition.g:233:2: (otherlv_0= 'external' ( (lv_abstractType_1_0= 'abstract' ) )? ( (lv_isTMType_2_0= 'telemetry' ) )? otherlv_3= 'DataType' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'extends' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            {
            // InternalDatatypeDefinition.g:233:2: (otherlv_0= 'external' ( (lv_abstractType_1_0= 'abstract' ) )? ( (lv_isTMType_2_0= 'telemetry' ) )? otherlv_3= 'DataType' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'extends' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            // InternalDatatypeDefinition.g:234:3: otherlv_0= 'external' ( (lv_abstractType_1_0= 'abstract' ) )? ( (lv_isTMType_2_0= 'telemetry' ) )? otherlv_3= 'DataType' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'extends' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalTypeAccess().getExternalKeyword_0());
            		
            // InternalDatatypeDefinition.g:238:3: ( (lv_abstractType_1_0= 'abstract' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDatatypeDefinition.g:239:4: (lv_abstractType_1_0= 'abstract' )
                    {
                    // InternalDatatypeDefinition.g:239:4: (lv_abstractType_1_0= 'abstract' )
                    // InternalDatatypeDefinition.g:240:5: lv_abstractType_1_0= 'abstract'
                    {
                    lv_abstractType_1_0=(Token)match(input,11,FOLLOW_3); 

                    					newLeafNode(lv_abstractType_1_0, grammarAccess.getExternalTypeAccess().getAbstractTypeAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExternalTypeRule());
                    					}
                    					setWithLastConsumed(current, "abstractType", lv_abstractType_1_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalDatatypeDefinition.g:252:3: ( (lv_isTMType_2_0= 'telemetry' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDatatypeDefinition.g:253:4: (lv_isTMType_2_0= 'telemetry' )
                    {
                    // InternalDatatypeDefinition.g:253:4: (lv_isTMType_2_0= 'telemetry' )
                    // InternalDatatypeDefinition.g:254:5: lv_isTMType_2_0= 'telemetry'
                    {
                    lv_isTMType_2_0=(Token)match(input,12,FOLLOW_4); 

                    					newLeafNode(lv_isTMType_2_0, grammarAccess.getExternalTypeAccess().getIsTMTypeTelemetryKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExternalTypeRule());
                    					}
                    					setWithLastConsumed(current, "isTMType", lv_isTMType_2_0 != null, "telemetry");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalTypeAccess().getDataTypeKeyword_3());
            		
            // InternalDatatypeDefinition.g:270:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDatatypeDefinition.g:271:4: (lv_name_4_0= ruleEString )
            {
            // InternalDatatypeDefinition.g:271:4: (lv_name_4_0= ruleEString )
            // InternalDatatypeDefinition.g:272:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalTypeAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatatypeDefinition.g:289:3: (otherlv_5= 'extends' ( ( ruleFQN ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDatatypeDefinition.g:290:4: otherlv_5= 'extends' ( ( ruleFQN ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getExternalTypeAccess().getExtendsKeyword_5_0());
                    			
                    // InternalDatatypeDefinition.g:294:4: ( ( ruleFQN ) )
                    // InternalDatatypeDefinition.g:295:5: ( ruleFQN )
                    {
                    // InternalDatatypeDefinition.g:295:5: ( ruleFQN )
                    // InternalDatatypeDefinition.g:296:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExternalTypeAccess().getSuperTypeDataTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalTypeAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDatatypeDefinition.g:315:3: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDatatypeDefinition.g:316:4: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // InternalDatatypeDefinition.g:316:4: (lv_attributes_8_0= ruleAttribute )
            	    // InternalDatatypeDefinition.g:317:5: lv_attributes_8_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getExternalTypeAccess().getAttributesAttributeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_8_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExternalTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_8_0,
            	    						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getExternalTypeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleExternalType"


    // $ANTLR start "entryRuleAttribute"
    // InternalDatatypeDefinition.g:342:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDatatypeDefinition.g:342:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDatatypeDefinition.g:343:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDatatypeDefinition.g:349:1: ruleAttribute returns [EObject current=null] : ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_0_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dimensions_4_0 = null;

        AntlrDatatypeRuleToken lv_valueLiteral_6_0 = null;

        AntlrDatatypeRuleToken lv_valueLiteral_13_0 = null;

        AntlrDatatypeRuleToken lv_maxValueLiteral_17_0 = null;

        AntlrDatatypeRuleToken lv_minValueLiteral_21_0 = null;



        	enterRule();

        try {
            // InternalDatatypeDefinition.g:355:2: ( ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) ) )
            // InternalDatatypeDefinition.g:356:2: ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) )
            {
            // InternalDatatypeDefinition.g:356:2: ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) )
            // InternalDatatypeDefinition.g:357:3: ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalDatatypeDefinition.g:357:3: ( (lv_isConst_0_0= 'const' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDatatypeDefinition.g:358:4: (lv_isConst_0_0= 'const' )
                    {
                    // InternalDatatypeDefinition.g:358:4: (lv_isConst_0_0= 'const' )
                    // InternalDatatypeDefinition.g:359:5: lv_isConst_0_0= 'const'
                    {
                    lv_isConst_0_0=(Token)match(input,18,FOLLOW_5); 

                    					newLeafNode(lv_isConst_0_0, grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isConst", lv_isConst_0_0 != null, "const");
                    				

                    }


                    }
                    break;

            }

            // InternalDatatypeDefinition.g:371:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDatatypeDefinition.g:372:4: (lv_name_1_0= ruleEString )
            {
            // InternalDatatypeDefinition.g:372:4: (lv_name_1_0= ruleEString )
            // InternalDatatypeDefinition.g:373:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalDatatypeDefinition.g:394:3: ( ( ruleFQN ) )
            // InternalDatatypeDefinition.g:395:4: ( ruleFQN )
            {
            // InternalDatatypeDefinition.g:395:4: ( ruleFQN )
            // InternalDatatypeDefinition.g:396:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeOfITypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatatypeDefinition.g:410:3: ( (lv_dimensions_4_0= ruleArrayDimension ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDatatypeDefinition.g:411:4: (lv_dimensions_4_0= ruleArrayDimension )
            	    {
            	    // InternalDatatypeDefinition.g:411:4: (lv_dimensions_4_0= ruleArrayDimension )
            	    // InternalDatatypeDefinition.g:412:5: lv_dimensions_4_0= ruleArrayDimension
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeAccess().getDimensionsArrayDimensionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_dimensions_4_0=ruleArrayDimension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dimensions",
            	    						lv_dimensions_4_0,
            	    						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.ArrayDimension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalDatatypeDefinition.g:429:3: ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt16=1;
                }
                break;
            case 21:
                {
                alt16=2;
                }
                break;
            case EOF:
            case RULE_STRING:
            case RULE_ID:
            case 15:
            case 16:
            case 18:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDatatypeDefinition.g:430:4: (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' )
                    {
                    // InternalDatatypeDefinition.g:430:4: (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' )
                    // InternalDatatypeDefinition.g:431:5: otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_5); 

                    					newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0_0());
                    				
                    // InternalDatatypeDefinition.g:435:5: ( (lv_valueLiteral_6_0= ruleEString ) )
                    // InternalDatatypeDefinition.g:436:6: (lv_valueLiteral_6_0= ruleEString )
                    {
                    // InternalDatatypeDefinition.g:436:6: (lv_valueLiteral_6_0= ruleEString )
                    // InternalDatatypeDefinition.g:437:7: lv_valueLiteral_6_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_0_1_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_valueLiteral_6_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    							}
                    							set(
                    								current,
                    								"valueLiteral",
                    								lv_valueLiteral_6_0,
                    								"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDatatypeDefinition.g:460:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDatatypeDefinition.g:465:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )?
                    {
                    // InternalDatatypeDefinition.g:465:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==15||(LA15_0>=23 && LA15_0<=26)) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==16) ) {
                        int LA15_2 = input.LA(2);

                        if ( (LA15_2==21) ) {
                            alt15=1;
                        }
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDatatypeDefinition.g:466:5: ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) )
                            {
                            // InternalDatatypeDefinition.g:466:5: ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) )
                            // InternalDatatypeDefinition.g:467:6: ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?)
                            {
                             
                            					  getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            					
                            // InternalDatatypeDefinition.g:470:6: ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?)
                            // InternalDatatypeDefinition.g:471:7: ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?
                            {
                            // InternalDatatypeDefinition.g:471:7: ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+
                            int cnt14=0;
                            loop14:
                            do {
                                int alt14=6;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==16) ) {
                                    int LA14_1 = input.LA(2);

                                    if ( LA14_1 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                                        alt14=5;
                                    }


                                }
                                else if ( LA14_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                                    alt14=1;
                                }
                                else if ( LA14_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                                    alt14=2;
                                }
                                else if ( LA14_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                                    alt14=3;
                                }
                                else if ( LA14_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                                    alt14=4;
                                }
                                else if ( LA14_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                                    alt14=5;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalDatatypeDefinition.g:472:5: ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) )
                            	    {
                            	    // InternalDatatypeDefinition.g:472:5: ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) )
                            	    // InternalDatatypeDefinition.g:473:6: {...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0)");
                            	    }
                            	    // InternalDatatypeDefinition.g:473:109: ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) )
                            	    // InternalDatatypeDefinition.g:474:7: ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0);
                            	    						
                            	    // InternalDatatypeDefinition.g:477:10: ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) )
                            	    // InternalDatatypeDefinition.g:477:11: {...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalDatatypeDefinition.g:477:20: (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? )
                            	    // InternalDatatypeDefinition.g:477:21: otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )?
                            	    {
                            	    otherlv_10=(Token)match(input,15,FOLLOW_14); 

                            	    										newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0());
                            	    									
                            	    // InternalDatatypeDefinition.g:481:10: (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )?
                            	    int alt12=2;
                            	    int LA12_0 = input.LA(1);

                            	    if ( (LA12_0==22) ) {
                            	        alt12=1;
                            	    }
                            	    switch (alt12) {
                            	        case 1 :
                            	            // InternalDatatypeDefinition.g:482:11: otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';'
                            	            {
                            	            otherlv_11=(Token)match(input,22,FOLLOW_11); 

                            	            											newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getValueKeyword_5_2_0_1_0());
                            	            										
                            	            otherlv_12=(Token)match(input,19,FOLLOW_5); 

                            	            											newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getColonKeyword_5_2_0_1_1());
                            	            										
                            	            // InternalDatatypeDefinition.g:490:11: ( (lv_valueLiteral_13_0= ruleEString ) )
                            	            // InternalDatatypeDefinition.g:491:12: (lv_valueLiteral_13_0= ruleEString )
                            	            {
                            	            // InternalDatatypeDefinition.g:491:12: (lv_valueLiteral_13_0= ruleEString )
                            	            // InternalDatatypeDefinition.g:492:13: lv_valueLiteral_13_0= ruleEString
                            	            {

                            	            													newCompositeNode(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_2_0_1_2_0());
                            	            												
                            	            pushFollow(FOLLOW_13);
                            	            lv_valueLiteral_13_0=ruleEString();

                            	            state._fsp--;


                            	            													if (current==null) {
                            	            														current = createModelElementForParent(grammarAccess.getAttributeRule());
                            	            													}
                            	            													set(
                            	            														current,
                            	            														"valueLiteral",
                            	            														lv_valueLiteral_13_0,
                            	            														"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
                            	            													afterParserOrEnumRuleCall();
                            	            												

                            	            }


                            	            }

                            	            otherlv_14=(Token)match(input,21,FOLLOW_15); 

                            	            											newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_0_1_3());
                            	            										

                            	            }
                            	            break;

                            	    }


                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalDatatypeDefinition.g:520:5: ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) )
                            	    {
                            	    // InternalDatatypeDefinition.g:520:5: ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) )
                            	    // InternalDatatypeDefinition.g:521:6: {...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1)");
                            	    }
                            	    // InternalDatatypeDefinition.g:521:109: ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) )
                            	    // InternalDatatypeDefinition.g:522:7: ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1);
                            	    						
                            	    // InternalDatatypeDefinition.g:525:10: ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) )
                            	    // InternalDatatypeDefinition.g:525:11: {...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalDatatypeDefinition.g:525:20: (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' )
                            	    // InternalDatatypeDefinition.g:525:21: otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';'
                            	    {
                            	    otherlv_15=(Token)match(input,23,FOLLOW_11); 

                            	    										newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getMaxKeyword_5_2_1_0());
                            	    									
                            	    otherlv_16=(Token)match(input,19,FOLLOW_5); 

                            	    										newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getColonKeyword_5_2_1_1());
                            	    									
                            	    // InternalDatatypeDefinition.g:533:10: ( (lv_maxValueLiteral_17_0= ruleEString ) )
                            	    // InternalDatatypeDefinition.g:534:11: (lv_maxValueLiteral_17_0= ruleEString )
                            	    {
                            	    // InternalDatatypeDefinition.g:534:11: (lv_maxValueLiteral_17_0= ruleEString )
                            	    // InternalDatatypeDefinition.g:535:12: lv_maxValueLiteral_17_0= ruleEString
                            	    {

                            	    												newCompositeNode(grammarAccess.getAttributeAccess().getMaxValueLiteralEStringParserRuleCall_5_2_1_2_0());
                            	    											
                            	    pushFollow(FOLLOW_13);
                            	    lv_maxValueLiteral_17_0=ruleEString();

                            	    state._fsp--;


                            	    												if (current==null) {
                            	    													current = createModelElementForParent(grammarAccess.getAttributeRule());
                            	    												}
                            	    												set(
                            	    													current,
                            	    													"maxValueLiteral",
                            	    													lv_maxValueLiteral_17_0,
                            	    													"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
                            	    												afterParserOrEnumRuleCall();
                            	    											

                            	    }


                            	    }

                            	    otherlv_18=(Token)match(input,21,FOLLOW_15); 

                            	    										newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_1_3());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 3 :
                            	    // InternalDatatypeDefinition.g:562:5: ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) )
                            	    {
                            	    // InternalDatatypeDefinition.g:562:5: ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) )
                            	    // InternalDatatypeDefinition.g:563:6: {...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2)");
                            	    }
                            	    // InternalDatatypeDefinition.g:563:109: ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) )
                            	    // InternalDatatypeDefinition.g:564:7: ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2);
                            	    						
                            	    // InternalDatatypeDefinition.g:567:10: ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) )
                            	    // InternalDatatypeDefinition.g:567:11: {...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalDatatypeDefinition.g:567:20: (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' )
                            	    // InternalDatatypeDefinition.g:567:21: otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';'
                            	    {
                            	    otherlv_19=(Token)match(input,24,FOLLOW_11); 

                            	    										newLeafNode(otherlv_19, grammarAccess.getAttributeAccess().getMinKeyword_5_2_2_0());
                            	    									
                            	    otherlv_20=(Token)match(input,19,FOLLOW_5); 

                            	    										newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getColonKeyword_5_2_2_1());
                            	    									
                            	    // InternalDatatypeDefinition.g:575:10: ( (lv_minValueLiteral_21_0= ruleEString ) )
                            	    // InternalDatatypeDefinition.g:576:11: (lv_minValueLiteral_21_0= ruleEString )
                            	    {
                            	    // InternalDatatypeDefinition.g:576:11: (lv_minValueLiteral_21_0= ruleEString )
                            	    // InternalDatatypeDefinition.g:577:12: lv_minValueLiteral_21_0= ruleEString
                            	    {

                            	    												newCompositeNode(grammarAccess.getAttributeAccess().getMinValueLiteralEStringParserRuleCall_5_2_2_2_0());
                            	    											
                            	    pushFollow(FOLLOW_13);
                            	    lv_minValueLiteral_21_0=ruleEString();

                            	    state._fsp--;


                            	    												if (current==null) {
                            	    													current = createModelElementForParent(grammarAccess.getAttributeRule());
                            	    												}
                            	    												set(
                            	    													current,
                            	    													"minValueLiteral",
                            	    													lv_minValueLiteral_21_0,
                            	    													"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
                            	    												afterParserOrEnumRuleCall();
                            	    											

                            	    }


                            	    }

                            	    otherlv_22=(Token)match(input,21,FOLLOW_15); 

                            	    										newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_2_3());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 4 :
                            	    // InternalDatatypeDefinition.g:604:5: ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) )
                            	    {
                            	    // InternalDatatypeDefinition.g:604:5: ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) )
                            	    // InternalDatatypeDefinition.g:605:6: {...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3)");
                            	    }
                            	    // InternalDatatypeDefinition.g:605:109: ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) )
                            	    // InternalDatatypeDefinition.g:606:7: ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3);
                            	    						
                            	    // InternalDatatypeDefinition.g:609:10: ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) )
                            	    // InternalDatatypeDefinition.g:609:11: {...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalDatatypeDefinition.g:609:20: (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' )
                            	    // InternalDatatypeDefinition.g:609:21: otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';'
                            	    {
                            	    otherlv_23=(Token)match(input,25,FOLLOW_11); 

                            	    										newLeafNode(otherlv_23, grammarAccess.getAttributeAccess().getReferenceFrameKeyword_5_2_3_0());
                            	    									
                            	    otherlv_24=(Token)match(input,19,FOLLOW_7); 

                            	    										newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getColonKeyword_5_2_3_1());
                            	    									
                            	    // InternalDatatypeDefinition.g:617:10: ( ( ruleFQN ) )
                            	    // InternalDatatypeDefinition.g:618:11: ( ruleFQN )
                            	    {
                            	    // InternalDatatypeDefinition.g:618:11: ( ruleFQN )
                            	    // InternalDatatypeDefinition.g:619:12: ruleFQN
                            	    {

                            	    												if (current==null) {
                            	    													current = createModelElement(grammarAccess.getAttributeRule());
                            	    												}
                            	    											

                            	    												newCompositeNode(grammarAccess.getAttributeAccess().getReferenceFrameReferenceFrameDefinitionCrossReference_5_2_3_2_0());
                            	    											
                            	    pushFollow(FOLLOW_13);
                            	    ruleFQN();

                            	    state._fsp--;


                            	    												afterParserOrEnumRuleCall();
                            	    											

                            	    }


                            	    }

                            	    otherlv_26=(Token)match(input,21,FOLLOW_15); 

                            	    										newLeafNode(otherlv_26, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_3_3());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 5 :
                            	    // InternalDatatypeDefinition.g:643:5: ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) )
                            	    {
                            	    // InternalDatatypeDefinition.g:643:5: ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) )
                            	    // InternalDatatypeDefinition.g:644:6: {...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4)");
                            	    }
                            	    // InternalDatatypeDefinition.g:644:109: ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) )
                            	    // InternalDatatypeDefinition.g:645:7: ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4);
                            	    						
                            	    // InternalDatatypeDefinition.g:648:10: ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) )
                            	    // InternalDatatypeDefinition.g:648:11: {...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalDatatypeDefinition.g:648:20: ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' )
                            	    // InternalDatatypeDefinition.g:648:21: (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';'
                            	    {
                            	    // InternalDatatypeDefinition.g:648:21: (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )?
                            	    int alt13=2;
                            	    int LA13_0 = input.LA(1);

                            	    if ( (LA13_0==26) ) {
                            	        alt13=1;
                            	    }
                            	    switch (alt13) {
                            	        case 1 :
                            	            // InternalDatatypeDefinition.g:649:11: otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';'
                            	            {
                            	            otherlv_27=(Token)match(input,26,FOLLOW_11); 

                            	            											newLeafNode(otherlv_27, grammarAccess.getAttributeAccess().getUnitKeyword_5_2_4_0_0());
                            	            										
                            	            otherlv_28=(Token)match(input,19,FOLLOW_7); 

                            	            											newLeafNode(otherlv_28, grammarAccess.getAttributeAccess().getColonKeyword_5_2_4_0_1());
                            	            										
                            	            // InternalDatatypeDefinition.g:657:11: ( ( ruleFQN ) )
                            	            // InternalDatatypeDefinition.g:658:12: ( ruleFQN )
                            	            {
                            	            // InternalDatatypeDefinition.g:658:12: ( ruleFQN )
                            	            // InternalDatatypeDefinition.g:659:13: ruleFQN
                            	            {

                            	            													if (current==null) {
                            	            														current = createModelElement(grammarAccess.getAttributeRule());
                            	            													}
                            	            												

                            	            													newCompositeNode(grammarAccess.getAttributeAccess().getTypeUnitUnitDefinitionCrossReference_5_2_4_0_2_0());
                            	            												
                            	            pushFollow(FOLLOW_13);
                            	            ruleFQN();

                            	            state._fsp--;


                            	            													afterParserOrEnumRuleCall();
                            	            												

                            	            }


                            	            }

                            	            otherlv_30=(Token)match(input,21,FOLLOW_16); 

                            	            											newLeafNode(otherlv_30, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_0_3());
                            	            										

                            	            }
                            	            break;

                            	    }

                            	    otherlv_31=(Token)match(input,16,FOLLOW_13); 

                            	    										newLeafNode(otherlv_31, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1());
                            	    									
                            	    otherlv_32=(Token)match(input,21,FOLLOW_15); 

                            	    										newLeafNode(otherlv_32, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_2());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt14 >= 1 ) break loop14;
                                        EarlyExitException eee =
                                            new EarlyExitException(14, input);
                                        throw eee;
                                }
                                cnt14++;
                            } while (true);

                            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2()) ) {
                                throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canLeave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2())");
                            }

                            }


                            }

                             
                            					  getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            					

                            }
                            break;

                    }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleArrayDimension"
    // InternalDatatypeDefinition.g:705:1: entryRuleArrayDimension returns [EObject current=null] : iv_ruleArrayDimension= ruleArrayDimension EOF ;
    public final EObject entryRuleArrayDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimension = null;


        try {
            // InternalDatatypeDefinition.g:705:55: (iv_ruleArrayDimension= ruleArrayDimension EOF )
            // InternalDatatypeDefinition.g:706:2: iv_ruleArrayDimension= ruleArrayDimension EOF
            {
             newCompositeNode(grammarAccess.getArrayDimensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayDimension=ruleArrayDimension();

            state._fsp--;

             current =iv_ruleArrayDimension; 
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
    // $ANTLR end "entryRuleArrayDimension"


    // $ANTLR start "ruleArrayDimension"
    // InternalDatatypeDefinition.g:712:1: ruleArrayDimension returns [EObject current=null] : (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' ) ;
    public final EObject ruleArrayDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_size_1_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalDatatypeDefinition.g:718:2: ( (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' ) )
            // InternalDatatypeDefinition.g:719:2: (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' )
            {
            // InternalDatatypeDefinition.g:719:2: (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' )
            // InternalDatatypeDefinition.g:720:3: otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalDatatypeDefinition.g:724:3: ( (lv_size_1_0= ruleEInt ) )
            // InternalDatatypeDefinition.g:725:4: (lv_size_1_0= ruleEInt )
            {
            // InternalDatatypeDefinition.g:725:4: (lv_size_1_0= ruleEInt )
            // InternalDatatypeDefinition.g:726:5: lv_size_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getArrayDimensionAccess().getSizeEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_size_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayDimensionRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_1_0,
            						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatatypeDefinition.g:743:3: (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDatatypeDefinition.g:744:4: otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getArrayDimensionAccess().getCommaKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,29,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getArrayDimensionAccess().getNameKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalDatatypeDefinition.g:756:4: ( (lv_name_5_0= ruleEString ) )
                    // InternalDatatypeDefinition.g:757:5: (lv_name_5_0= ruleEString )
                    {
                    // InternalDatatypeDefinition.g:757:5: (lv_name_5_0= ruleEString )
                    // InternalDatatypeDefinition.g:758:6: lv_name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getArrayDimensionAccess().getNameEStringParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayDimensionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getArrayDimensionAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleArrayDimension"


    // $ANTLR start "entryRuleEString"
    // InternalDatatypeDefinition.g:784:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDatatypeDefinition.g:784:47: (iv_ruleEString= ruleEString EOF )
            // InternalDatatypeDefinition.g:785:2: iv_ruleEString= ruleEString EOF
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
    // InternalDatatypeDefinition.g:791:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDatatypeDefinition.g:797:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDatatypeDefinition.g:798:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDatatypeDefinition.g:798:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDatatypeDefinition.g:799:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDatatypeDefinition.g:807:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEInt"
    // InternalDatatypeDefinition.g:818:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDatatypeDefinition.g:818:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDatatypeDefinition.g:819:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDatatypeDefinition.g:825:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDatatypeDefinition.g:831:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDatatypeDefinition.g:832:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDatatypeDefinition.g:832:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDatatypeDefinition.g:833:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDatatypeDefinition.g:833:3: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDatatypeDefinition.g:834:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleFQN"
    // InternalDatatypeDefinition.g:851:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalDatatypeDefinition.g:851:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalDatatypeDefinition.g:852:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalDatatypeDefinition.g:858:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDatatypeDefinition.g:864:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDatatypeDefinition.g:865:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDatatypeDefinition.g:865:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDatatypeDefinition.g:866:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalDatatypeDefinition.g:873:3: (kw= '.' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDatatypeDefinition.g:874:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "ruleFQN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000050030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000FB18002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007C18002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007818002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000002L});

}
