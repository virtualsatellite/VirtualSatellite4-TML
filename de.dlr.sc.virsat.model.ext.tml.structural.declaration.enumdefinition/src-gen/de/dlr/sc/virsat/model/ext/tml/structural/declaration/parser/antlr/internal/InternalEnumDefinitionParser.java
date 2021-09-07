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
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.services.EnumDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnumDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Enum'", "'{'", "','", "'}'", "'='", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEnumDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEnumDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEnumDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEnumDefinition.g"; }



     	private EnumDefinitionGrammarAccess grammarAccess;

        public InternalEnumDefinitionParser(TokenStream input, EnumDefinitionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Enumeration";
       	}

       	@Override
       	protected EnumDefinitionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEnumeration"
    // InternalEnumDefinition.g:64:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalEnumDefinition.g:64:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalEnumDefinition.g:65:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalEnumDefinition.g:71:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_literals_3_0 = null;

        EObject lv_literals_5_0 = null;



        	enterRule();

        try {
            // InternalEnumDefinition.g:77:2: ( (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) )* )? otherlv_6= '}' ) )
            // InternalEnumDefinition.g:78:2: (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) )* )? otherlv_6= '}' )
            {
            // InternalEnumDefinition.g:78:2: (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) )* )? otherlv_6= '}' )
            // InternalEnumDefinition.g:79:3: otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
            		
            // InternalEnumDefinition.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEnumDefinition.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalEnumDefinition.g:84:4: (lv_name_1_0= ruleEString )
            // InternalEnumDefinition.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinition.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEnumDefinition.g:106:3: ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEnumDefinition.g:107:4: ( (lv_literals_3_0= ruleEnumerationLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) )*
                    {
                    // InternalEnumDefinition.g:107:4: ( (lv_literals_3_0= ruleEnumerationLiteral ) )
                    // InternalEnumDefinition.g:108:5: (lv_literals_3_0= ruleEnumerationLiteral )
                    {
                    // InternalEnumDefinition.g:108:5: (lv_literals_3_0= ruleEnumerationLiteral )
                    // InternalEnumDefinition.g:109:6: lv_literals_3_0= ruleEnumerationLiteral
                    {

                    						newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_literals_3_0=ruleEnumerationLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    						}
                    						add(
                    							current,
                    							"literals",
                    							lv_literals_3_0,
                    							"de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinition.EnumerationLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEnumDefinition.g:126:4: (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEnumDefinition.g:127:5: otherlv_4= ',' ( (lv_literals_5_0= ruleEnumerationLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalEnumDefinition.g:131:5: ( (lv_literals_5_0= ruleEnumerationLiteral ) )
                    	    // InternalEnumDefinition.g:132:6: (lv_literals_5_0= ruleEnumerationLiteral )
                    	    {
                    	    // InternalEnumDefinition.g:132:6: (lv_literals_5_0= ruleEnumerationLiteral )
                    	    // InternalEnumDefinition.g:133:7: lv_literals_5_0= ruleEnumerationLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_literals_5_0=ruleEnumerationLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"literals",
                    	    								lv_literals_5_0,
                    	    								"de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinition.EnumerationLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEString"
    // InternalEnumDefinition.g:160:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEnumDefinition.g:160:47: (iv_ruleEString= ruleEString EOF )
            // InternalEnumDefinition.g:161:2: iv_ruleEString= ruleEString EOF
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
    // InternalEnumDefinition.g:167:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEnumDefinition.g:173:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEnumDefinition.g:174:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEnumDefinition.g:174:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEnumDefinition.g:175:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEnumDefinition.g:183:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalEnumDefinition.g:194:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalEnumDefinition.g:194:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalEnumDefinition.g:195:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
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
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalEnumDefinition.g:201:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '=' ( (lv_keyNum_2_0= ruleEInt ) ) )? ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_keyNum_2_0 = null;



        	enterRule();

        try {
            // InternalEnumDefinition.g:207:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '=' ( (lv_keyNum_2_0= ruleEInt ) ) )? ) )
            // InternalEnumDefinition.g:208:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '=' ( (lv_keyNum_2_0= ruleEInt ) ) )? )
            {
            // InternalEnumDefinition.g:208:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '=' ( (lv_keyNum_2_0= ruleEInt ) ) )? )
            // InternalEnumDefinition.g:209:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '=' ( (lv_keyNum_2_0= ruleEInt ) ) )?
            {
            // InternalEnumDefinition.g:209:3: ( (lv_name_0_0= ruleEString ) )
            // InternalEnumDefinition.g:210:4: (lv_name_0_0= ruleEString )
            {
            // InternalEnumDefinition.g:210:4: (lv_name_0_0= ruleEString )
            // InternalEnumDefinition.g:211:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinition.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEnumDefinition.g:228:3: (otherlv_1= '=' ( (lv_keyNum_2_0= ruleEInt ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEnumDefinition.g:229:4: otherlv_1= '=' ( (lv_keyNum_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalEnumDefinition.g:233:4: ( (lv_keyNum_2_0= ruleEInt ) )
                    // InternalEnumDefinition.g:234:5: (lv_keyNum_2_0= ruleEInt )
                    {
                    // InternalEnumDefinition.g:234:5: (lv_keyNum_2_0= ruleEInt )
                    // InternalEnumDefinition.g:235:6: lv_keyNum_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getKeyNumEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_keyNum_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
                    						}
                    						set(
                    							current,
                    							"keyNum",
                    							lv_keyNum_2_0,
                    							"de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinition.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleEInt"
    // InternalEnumDefinition.g:257:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalEnumDefinition.g:257:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalEnumDefinition.g:258:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalEnumDefinition.g:264:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalEnumDefinition.g:270:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalEnumDefinition.g:271:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalEnumDefinition.g:271:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalEnumDefinition.g:272:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalEnumDefinition.g:272:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEnumDefinition.g:273:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_9); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});

}