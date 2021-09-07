package de.dlr.sc.virsat.model.ext.tml.structural.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dlr.sc.virsat.model.ext.tml.structural.services.DeclarationLangaugeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeclarationLangaugeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'const'", "':'", "'='", "';'", "'{'", "'value'", "'max'", "'min'", "'referenceFrame'", "'unit'", "'}'", "'['", "','", "'name'", "']'", "'-'", "'.'"
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
    public static final int T__27=27;
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


        public InternalDeclarationLangaugeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDeclarationLangaugeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDeclarationLangaugeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDeclarationLangauge.g"; }



     	private DeclarationLangaugeGrammarAccess grammarAccess;

        public InternalDeclarationLangaugeParser(TokenStream input, DeclarationLangaugeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Attribute";
       	}

       	@Override
       	protected DeclarationLangaugeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAttribute"
    // InternalDeclarationLangauge.g:64:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDeclarationLangauge.g:64:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDeclarationLangauge.g:65:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalDeclarationLangauge.g:71:1: ruleAttribute returns [EObject current=null] : ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) ) ;
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
            // InternalDeclarationLangauge.g:77:2: ( ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) ) )
            // InternalDeclarationLangauge.g:78:2: ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) )
            {
            // InternalDeclarationLangauge.g:78:2: ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) )
            // InternalDeclarationLangauge.g:79:3: ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalDeclarationLangauge.g:79:3: ( (lv_isConst_0_0= 'const' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDeclarationLangauge.g:80:4: (lv_isConst_0_0= 'const' )
                    {
                    // InternalDeclarationLangauge.g:80:4: (lv_isConst_0_0= 'const' )
                    // InternalDeclarationLangauge.g:81:5: lv_isConst_0_0= 'const'
                    {
                    lv_isConst_0_0=(Token)match(input,11,FOLLOW_3); 

                    					newLeafNode(lv_isConst_0_0, grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isConst", lv_isConst_0_0 != null, "const");
                    				

                    }


                    }
                    break;

            }

            // InternalDeclarationLangauge.g:93:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDeclarationLangauge.g:94:4: (lv_name_1_0= ruleEString )
            {
            // InternalDeclarationLangauge.g:94:4: (lv_name_1_0= ruleEString )
            // InternalDeclarationLangauge.g:95:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalDeclarationLangauge.g:116:3: ( ( ruleFQN ) )
            // InternalDeclarationLangauge.g:117:4: ( ruleFQN )
            {
            // InternalDeclarationLangauge.g:117:4: ( ruleFQN )
            // InternalDeclarationLangauge.g:118:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeOfITypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeclarationLangauge.g:132:3: ( (lv_dimensions_4_0= ruleArrayDimension ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDeclarationLangauge.g:133:4: (lv_dimensions_4_0= ruleArrayDimension )
            	    {
            	    // InternalDeclarationLangauge.g:133:4: (lv_dimensions_4_0= ruleArrayDimension )
            	    // InternalDeclarationLangauge.g:134:5: lv_dimensions_4_0= ruleArrayDimension
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeAccess().getDimensionsArrayDimensionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break loop2;
                }
            } while (true);

            // InternalDeclarationLangauge.g:151:3: ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case EOF:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDeclarationLangauge.g:152:4: (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' )
                    {
                    // InternalDeclarationLangauge.g:152:4: (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' )
                    // InternalDeclarationLangauge.g:153:5: otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0_0());
                    				
                    // InternalDeclarationLangauge.g:157:5: ( (lv_valueLiteral_6_0= ruleEString ) )
                    // InternalDeclarationLangauge.g:158:6: (lv_valueLiteral_6_0= ruleEString )
                    {
                    // InternalDeclarationLangauge.g:158:6: (lv_valueLiteral_6_0= ruleEString )
                    // InternalDeclarationLangauge.g:159:7: lv_valueLiteral_6_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_0_1_0());
                    						
                    pushFollow(FOLLOW_7);
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

                    otherlv_7=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDeclarationLangauge.g:182:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDeclarationLangauge.g:187:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )?
                    {
                    // InternalDeclarationLangauge.g:187:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15||(LA6_0>=17 && LA6_0<=21)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDeclarationLangauge.g:188:5: ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) )
                            {
                            // InternalDeclarationLangauge.g:188:5: ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) )
                            // InternalDeclarationLangauge.g:189:6: ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?)
                            {
                             
                            					  getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            					
                            // InternalDeclarationLangauge.g:192:6: ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?)
                            // InternalDeclarationLangauge.g:193:7: ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?
                            {
                            // InternalDeclarationLangauge.g:193:7: ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+
                            int cnt5=0;
                            loop5:
                            do {
                                int alt5=6;
                                int LA5_0 = input.LA(1);

                                if ( LA5_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                                    alt5=1;
                                }
                                else if ( LA5_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                                    alt5=2;
                                }
                                else if ( LA5_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                                    alt5=3;
                                }
                                else if ( LA5_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                                    alt5=4;
                                }
                                else if ( LA5_0 >= 20 && LA5_0 <= 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                                    alt5=5;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalDeclarationLangauge.g:194:5: ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) )
                            	    {
                            	    // InternalDeclarationLangauge.g:194:5: ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) )
                            	    // InternalDeclarationLangauge.g:195:6: {...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0)");
                            	    }
                            	    // InternalDeclarationLangauge.g:195:109: ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) )
                            	    // InternalDeclarationLangauge.g:196:7: ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0);
                            	    						
                            	    // InternalDeclarationLangauge.g:199:10: ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) )
                            	    // InternalDeclarationLangauge.g:199:11: {...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalDeclarationLangauge.g:199:20: (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? )
                            	    // InternalDeclarationLangauge.g:199:21: otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )?
                            	    {
                            	    otherlv_10=(Token)match(input,15,FOLLOW_8); 

                            	    										newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0());
                            	    									
                            	    // InternalDeclarationLangauge.g:203:10: (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )?
                            	    int alt3=2;
                            	    int LA3_0 = input.LA(1);

                            	    if ( (LA3_0==16) ) {
                            	        alt3=1;
                            	    }
                            	    switch (alt3) {
                            	        case 1 :
                            	            // InternalDeclarationLangauge.g:204:11: otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';'
                            	            {
                            	            otherlv_11=(Token)match(input,16,FOLLOW_4); 

                            	            											newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getValueKeyword_5_2_0_1_0());
                            	            										
                            	            otherlv_12=(Token)match(input,12,FOLLOW_3); 

                            	            											newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getColonKeyword_5_2_0_1_1());
                            	            										
                            	            // InternalDeclarationLangauge.g:212:11: ( (lv_valueLiteral_13_0= ruleEString ) )
                            	            // InternalDeclarationLangauge.g:213:12: (lv_valueLiteral_13_0= ruleEString )
                            	            {
                            	            // InternalDeclarationLangauge.g:213:12: (lv_valueLiteral_13_0= ruleEString )
                            	            // InternalDeclarationLangauge.g:214:13: lv_valueLiteral_13_0= ruleEString
                            	            {

                            	            													newCompositeNode(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_2_0_1_2_0());
                            	            												
                            	            pushFollow(FOLLOW_7);
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

                            	            otherlv_14=(Token)match(input,14,FOLLOW_9); 

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
                            	    // InternalDeclarationLangauge.g:242:5: ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) )
                            	    {
                            	    // InternalDeclarationLangauge.g:242:5: ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) )
                            	    // InternalDeclarationLangauge.g:243:6: {...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1)");
                            	    }
                            	    // InternalDeclarationLangauge.g:243:109: ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) )
                            	    // InternalDeclarationLangauge.g:244:7: ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1);
                            	    						
                            	    // InternalDeclarationLangauge.g:247:10: ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) )
                            	    // InternalDeclarationLangauge.g:247:11: {...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalDeclarationLangauge.g:247:20: (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' )
                            	    // InternalDeclarationLangauge.g:247:21: otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';'
                            	    {
                            	    otherlv_15=(Token)match(input,17,FOLLOW_4); 

                            	    										newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getMaxKeyword_5_2_1_0());
                            	    									
                            	    otherlv_16=(Token)match(input,12,FOLLOW_3); 

                            	    										newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getColonKeyword_5_2_1_1());
                            	    									
                            	    // InternalDeclarationLangauge.g:255:10: ( (lv_maxValueLiteral_17_0= ruleEString ) )
                            	    // InternalDeclarationLangauge.g:256:11: (lv_maxValueLiteral_17_0= ruleEString )
                            	    {
                            	    // InternalDeclarationLangauge.g:256:11: (lv_maxValueLiteral_17_0= ruleEString )
                            	    // InternalDeclarationLangauge.g:257:12: lv_maxValueLiteral_17_0= ruleEString
                            	    {

                            	    												newCompositeNode(grammarAccess.getAttributeAccess().getMaxValueLiteralEStringParserRuleCall_5_2_1_2_0());
                            	    											
                            	    pushFollow(FOLLOW_7);
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

                            	    otherlv_18=(Token)match(input,14,FOLLOW_9); 

                            	    										newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_1_3());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 3 :
                            	    // InternalDeclarationLangauge.g:284:5: ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) )
                            	    {
                            	    // InternalDeclarationLangauge.g:284:5: ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) )
                            	    // InternalDeclarationLangauge.g:285:6: {...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2)");
                            	    }
                            	    // InternalDeclarationLangauge.g:285:109: ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) )
                            	    // InternalDeclarationLangauge.g:286:7: ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2);
                            	    						
                            	    // InternalDeclarationLangauge.g:289:10: ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) )
                            	    // InternalDeclarationLangauge.g:289:11: {...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalDeclarationLangauge.g:289:20: (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' )
                            	    // InternalDeclarationLangauge.g:289:21: otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';'
                            	    {
                            	    otherlv_19=(Token)match(input,18,FOLLOW_4); 

                            	    										newLeafNode(otherlv_19, grammarAccess.getAttributeAccess().getMinKeyword_5_2_2_0());
                            	    									
                            	    otherlv_20=(Token)match(input,12,FOLLOW_3); 

                            	    										newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getColonKeyword_5_2_2_1());
                            	    									
                            	    // InternalDeclarationLangauge.g:297:10: ( (lv_minValueLiteral_21_0= ruleEString ) )
                            	    // InternalDeclarationLangauge.g:298:11: (lv_minValueLiteral_21_0= ruleEString )
                            	    {
                            	    // InternalDeclarationLangauge.g:298:11: (lv_minValueLiteral_21_0= ruleEString )
                            	    // InternalDeclarationLangauge.g:299:12: lv_minValueLiteral_21_0= ruleEString
                            	    {

                            	    												newCompositeNode(grammarAccess.getAttributeAccess().getMinValueLiteralEStringParserRuleCall_5_2_2_2_0());
                            	    											
                            	    pushFollow(FOLLOW_7);
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

                            	    otherlv_22=(Token)match(input,14,FOLLOW_9); 

                            	    										newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_2_3());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 4 :
                            	    // InternalDeclarationLangauge.g:326:5: ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) )
                            	    {
                            	    // InternalDeclarationLangauge.g:326:5: ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) )
                            	    // InternalDeclarationLangauge.g:327:6: {...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3)");
                            	    }
                            	    // InternalDeclarationLangauge.g:327:109: ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) )
                            	    // InternalDeclarationLangauge.g:328:7: ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3);
                            	    						
                            	    // InternalDeclarationLangauge.g:331:10: ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) )
                            	    // InternalDeclarationLangauge.g:331:11: {...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalDeclarationLangauge.g:331:20: (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' )
                            	    // InternalDeclarationLangauge.g:331:21: otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';'
                            	    {
                            	    otherlv_23=(Token)match(input,19,FOLLOW_4); 

                            	    										newLeafNode(otherlv_23, grammarAccess.getAttributeAccess().getReferenceFrameKeyword_5_2_3_0());
                            	    									
                            	    otherlv_24=(Token)match(input,12,FOLLOW_5); 

                            	    										newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getColonKeyword_5_2_3_1());
                            	    									
                            	    // InternalDeclarationLangauge.g:339:10: ( ( ruleFQN ) )
                            	    // InternalDeclarationLangauge.g:340:11: ( ruleFQN )
                            	    {
                            	    // InternalDeclarationLangauge.g:340:11: ( ruleFQN )
                            	    // InternalDeclarationLangauge.g:341:12: ruleFQN
                            	    {

                            	    												if (current==null) {
                            	    													current = createModelElement(grammarAccess.getAttributeRule());
                            	    												}
                            	    											

                            	    												newCompositeNode(grammarAccess.getAttributeAccess().getReferenceFrameReferenceFrameDefinitionCrossReference_5_2_3_2_0());
                            	    											
                            	    pushFollow(FOLLOW_7);
                            	    ruleFQN();

                            	    state._fsp--;


                            	    												afterParserOrEnumRuleCall();
                            	    											

                            	    }


                            	    }

                            	    otherlv_26=(Token)match(input,14,FOLLOW_9); 

                            	    										newLeafNode(otherlv_26, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_3_3());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 5 :
                            	    // InternalDeclarationLangauge.g:365:5: ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) )
                            	    {
                            	    // InternalDeclarationLangauge.g:365:5: ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) )
                            	    // InternalDeclarationLangauge.g:366:6: {...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4)");
                            	    }
                            	    // InternalDeclarationLangauge.g:366:109: ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) )
                            	    // InternalDeclarationLangauge.g:367:7: ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4);
                            	    						
                            	    // InternalDeclarationLangauge.g:370:10: ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) )
                            	    // InternalDeclarationLangauge.g:370:11: {...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalDeclarationLangauge.g:370:20: ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' )
                            	    // InternalDeclarationLangauge.g:370:21: (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';'
                            	    {
                            	    // InternalDeclarationLangauge.g:370:21: (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )?
                            	    int alt4=2;
                            	    int LA4_0 = input.LA(1);

                            	    if ( (LA4_0==20) ) {
                            	        alt4=1;
                            	    }
                            	    switch (alt4) {
                            	        case 1 :
                            	            // InternalDeclarationLangauge.g:371:11: otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';'
                            	            {
                            	            otherlv_27=(Token)match(input,20,FOLLOW_4); 

                            	            											newLeafNode(otherlv_27, grammarAccess.getAttributeAccess().getUnitKeyword_5_2_4_0_0());
                            	            										
                            	            otherlv_28=(Token)match(input,12,FOLLOW_5); 

                            	            											newLeafNode(otherlv_28, grammarAccess.getAttributeAccess().getColonKeyword_5_2_4_0_1());
                            	            										
                            	            // InternalDeclarationLangauge.g:379:11: ( ( ruleFQN ) )
                            	            // InternalDeclarationLangauge.g:380:12: ( ruleFQN )
                            	            {
                            	            // InternalDeclarationLangauge.g:380:12: ( ruleFQN )
                            	            // InternalDeclarationLangauge.g:381:13: ruleFQN
                            	            {

                            	            													if (current==null) {
                            	            														current = createModelElement(grammarAccess.getAttributeRule());
                            	            													}
                            	            												

                            	            													newCompositeNode(grammarAccess.getAttributeAccess().getTypeUnitUnitDefinitionCrossReference_5_2_4_0_2_0());
                            	            												
                            	            pushFollow(FOLLOW_7);
                            	            ruleFQN();

                            	            state._fsp--;


                            	            													afterParserOrEnumRuleCall();
                            	            												

                            	            }


                            	            }

                            	            otherlv_30=(Token)match(input,14,FOLLOW_10); 

                            	            											newLeafNode(otherlv_30, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_0_3());
                            	            										

                            	            }
                            	            break;

                            	    }

                            	    otherlv_31=(Token)match(input,21,FOLLOW_7); 

                            	    										newLeafNode(otherlv_31, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1());
                            	    									
                            	    otherlv_32=(Token)match(input,14,FOLLOW_9); 

                            	    										newLeafNode(otherlv_32, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_2());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt5 >= 1 ) break loop5;
                                        EarlyExitException eee =
                                            new EarlyExitException(5, input);
                                        throw eee;
                                }
                                cnt5++;
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
    // InternalDeclarationLangauge.g:427:1: entryRuleArrayDimension returns [EObject current=null] : iv_ruleArrayDimension= ruleArrayDimension EOF ;
    public final EObject entryRuleArrayDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimension = null;


        try {
            // InternalDeclarationLangauge.g:427:55: (iv_ruleArrayDimension= ruleArrayDimension EOF )
            // InternalDeclarationLangauge.g:428:2: iv_ruleArrayDimension= ruleArrayDimension EOF
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
    // InternalDeclarationLangauge.g:434:1: ruleArrayDimension returns [EObject current=null] : (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' ) ;
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
            // InternalDeclarationLangauge.g:440:2: ( (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' ) )
            // InternalDeclarationLangauge.g:441:2: (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' )
            {
            // InternalDeclarationLangauge.g:441:2: (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' )
            // InternalDeclarationLangauge.g:442:3: otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalDeclarationLangauge.g:446:3: ( (lv_size_1_0= ruleEInt ) )
            // InternalDeclarationLangauge.g:447:4: (lv_size_1_0= ruleEInt )
            {
            // InternalDeclarationLangauge.g:447:4: (lv_size_1_0= ruleEInt )
            // InternalDeclarationLangauge.g:448:5: lv_size_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getArrayDimensionAccess().getSizeEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalDeclarationLangauge.g:465:3: (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeclarationLangauge.g:466:4: otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getArrayDimensionAccess().getCommaKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getArrayDimensionAccess().getNameKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalDeclarationLangauge.g:478:4: ( (lv_name_5_0= ruleEString ) )
                    // InternalDeclarationLangauge.g:479:5: (lv_name_5_0= ruleEString )
                    {
                    // InternalDeclarationLangauge.g:479:5: (lv_name_5_0= ruleEString )
                    // InternalDeclarationLangauge.g:480:6: lv_name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getArrayDimensionAccess().getNameEStringParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_15);
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

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

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
    // InternalDeclarationLangauge.g:506:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDeclarationLangauge.g:506:47: (iv_ruleEString= ruleEString EOF )
            // InternalDeclarationLangauge.g:507:2: iv_ruleEString= ruleEString EOF
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
    // InternalDeclarationLangauge.g:513:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDeclarationLangauge.g:519:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDeclarationLangauge.g:520:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDeclarationLangauge.g:520:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeclarationLangauge.g:521:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeclarationLangauge.g:529:3: this_ID_1= RULE_ID
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
    // InternalDeclarationLangauge.g:540:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDeclarationLangauge.g:540:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDeclarationLangauge.g:541:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDeclarationLangauge.g:547:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDeclarationLangauge.g:553:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDeclarationLangauge.g:554:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDeclarationLangauge.g:554:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDeclarationLangauge.g:555:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDeclarationLangauge.g:555:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeclarationLangauge.g:556:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_16); 

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
    // InternalDeclarationLangauge.g:573:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalDeclarationLangauge.g:573:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalDeclarationLangauge.g:574:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalDeclarationLangauge.g:580:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDeclarationLangauge.g:586:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDeclarationLangauge.g:587:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDeclarationLangauge.g:587:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDeclarationLangauge.g:588:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalDeclarationLangauge.g:595:3: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDeclarationLangauge.g:596:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007EE002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003F8002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003E8002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});

}
