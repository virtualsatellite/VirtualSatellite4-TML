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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Task'", "'{'", "'inputs'", "'}'", "'outputs'", "'parameters'", "':'", "';'", "'const'", "'='", "'value'", "'max'", "'min'", "'referenceFrame'", "'unit'", "'['", "','", "'name'", "']'", "'-'", "'.'"
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


        public InternalTaskDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTaskDefinition.g"; }



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




    // $ANTLR start "entryRuleTaskDefinition"
    // InternalTaskDefinition.g:64:1: entryRuleTaskDefinition returns [EObject current=null] : iv_ruleTaskDefinition= ruleTaskDefinition EOF ;
    public final EObject entryRuleTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinition = null;


        try {
            // InternalTaskDefinition.g:64:55: (iv_ruleTaskDefinition= ruleTaskDefinition EOF )
            // InternalTaskDefinition.g:65:2: iv_ruleTaskDefinition= ruleTaskDefinition EOF
            {
             newCompositeNode(grammarAccess.getTaskDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskDefinition=ruleTaskDefinition();

            state._fsp--;

             current =iv_ruleTaskDefinition; 
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
    // $ANTLR end "entryRuleTaskDefinition"


    // $ANTLR start "ruleTaskDefinition"
    // InternalTaskDefinition.g:71:1: ruleTaskDefinition returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleTaskDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_inputs_6_0 = null;

        EObject lv_outputs_10_0 = null;

        EObject lv_parameters_14_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalTaskDefinition.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalTaskDefinition.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) ) )+ {...}?) ) )
            // InternalTaskDefinition.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalTaskDefinition.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) ) )+ {...}?) )
            // InternalTaskDefinition.g:80:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
            			
            // InternalTaskDefinition.g:83:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) ) )+ {...}?)
            // InternalTaskDefinition.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) ) )+ {...}?
            {
            // InternalTaskDefinition.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=4;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1) ) {
                    alt6=2;
                }
                else if ( ( LA6_0 == 14 || LA6_0 == 16 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2) ) {
                    alt6=3;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTaskDefinition.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) )
            	    {
            	    // InternalTaskDefinition.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) ) )
            	    // InternalTaskDefinition.g:86:4: {...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTaskDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalTaskDefinition.g:86:108: ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) ) )
            	    // InternalTaskDefinition.g:87:5: ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalTaskDefinition.g:90:8: ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? ) )
            	    // InternalTaskDefinition.g:90:9: {...}? => (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskDefinition", "true");
            	    }
            	    // InternalTaskDefinition.g:90:18: (otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )? )
            	    // InternalTaskDefinition.g:90:19: otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )?
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getTaskDefinitionAccess().getTaskKeyword_0_0());
            	    							
            	    // InternalTaskDefinition.g:94:8: ( (lv_name_2_0= ruleEString ) )
            	    // InternalTaskDefinition.g:95:9: (lv_name_2_0= ruleEString )
            	    {
            	    // InternalTaskDefinition.g:95:9: (lv_name_2_0= ruleEString )
            	    // InternalTaskDefinition.g:96:10: lv_name_2_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getTaskDefinitionAccess().getNameEStringParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_name_2_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalTaskDefinition.g:117:8: (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalTaskDefinition.g:118:9: otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleTaskInputDefinition ) )* otherlv_7= '}'
            	            {
            	            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            	            									newLeafNode(otherlv_4, grammarAccess.getTaskDefinitionAccess().getInputsKeyword_0_3_0());
            	            								
            	            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            	            									newLeafNode(otherlv_5, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_0_3_1());
            	            								
            	            // InternalTaskDefinition.g:126:9: ( (lv_inputs_6_0= ruleTaskInputDefinition ) )*
            	            loop1:
            	            do {
            	                int alt1=2;
            	                int LA1_0 = input.LA(1);

            	                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
            	                    alt1=1;
            	                }


            	                switch (alt1) {
            	            	case 1 :
            	            	    // InternalTaskDefinition.g:127:10: (lv_inputs_6_0= ruleTaskInputDefinition )
            	            	    {
            	            	    // InternalTaskDefinition.g:127:10: (lv_inputs_6_0= ruleTaskInputDefinition )
            	            	    // InternalTaskDefinition.g:128:11: lv_inputs_6_0= ruleTaskInputDefinition
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getTaskDefinitionAccess().getInputsTaskInputDefinitionParserRuleCall_0_3_2_0());
            	            	    										
            	            	    pushFollow(FOLLOW_6);
            	            	    lv_inputs_6_0=ruleTaskInputDefinition();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"inputs",
            	            	    												lv_inputs_6_0,
            	            	    												"de.dlr.sc.virsat.model.ext.tml.structural.declaration.TaskDefinition.TaskInputDefinition");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop1;
            	                }
            	            } while (true);

            	            otherlv_7=(Token)match(input,14,FOLLOW_7); 

            	            									newLeafNode(otherlv_7, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_0_3_3());
            	            								

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTaskDefinition.g:156:3: ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalTaskDefinition.g:156:3: ({...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) ) )
            	    // InternalTaskDefinition.g:157:4: {...}? => ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTaskDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalTaskDefinition.g:157:108: ( ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) ) )
            	    // InternalTaskDefinition.g:158:5: ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalTaskDefinition.g:161:8: ({...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' ) )
            	    // InternalTaskDefinition.g:161:9: {...}? => (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskDefinition", "true");
            	    }
            	    // InternalTaskDefinition.g:161:18: (otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}' )
            	    // InternalTaskDefinition.g:161:19: otherlv_8= 'outputs' otherlv_9= '{' ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )* otherlv_11= '}'
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_4); 

            	    								newLeafNode(otherlv_8, grammarAccess.getTaskDefinitionAccess().getOutputsKeyword_1_0());
            	    							
            	    otherlv_9=(Token)match(input,12,FOLLOW_6); 

            	    								newLeafNode(otherlv_9, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_1_1());
            	    							
            	    // InternalTaskDefinition.g:169:8: ( (lv_outputs_10_0= ruleTaskOutputDefinition ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalTaskDefinition.g:170:9: (lv_outputs_10_0= ruleTaskOutputDefinition )
            	    	    {
            	    	    // InternalTaskDefinition.g:170:9: (lv_outputs_10_0= ruleTaskOutputDefinition )
            	    	    // InternalTaskDefinition.g:171:10: lv_outputs_10_0= ruleTaskOutputDefinition
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getTaskDefinitionAccess().getOutputsTaskOutputDefinitionParserRuleCall_1_2_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_outputs_10_0=ruleTaskOutputDefinition();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"outputs",
            	    	    											lv_outputs_10_0,
            	    	    											"de.dlr.sc.virsat.model.ext.tml.structural.declaration.TaskDefinition.TaskOutputDefinition");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,14,FOLLOW_7); 

            	    								newLeafNode(otherlv_11, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_1_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTaskDefinition.g:198:3: ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) )
            	    {
            	    // InternalTaskDefinition.g:198:3: ({...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) ) )
            	    // InternalTaskDefinition.g:199:4: {...}? => ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTaskDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalTaskDefinition.g:199:108: ( ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) ) )
            	    // InternalTaskDefinition.g:200:5: ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalTaskDefinition.g:203:8: ({...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            	    // InternalTaskDefinition.g:203:9: {...}? => ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskDefinition", "true");
            	    }
            	    // InternalTaskDefinition.g:203:18: ( (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}' )
            	    // InternalTaskDefinition.g:203:19: (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )? otherlv_16= '}'
            	    {
            	    // InternalTaskDefinition.g:203:19: (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==16) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalTaskDefinition.g:204:9: otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleAttribute ) )* otherlv_15= '}'
            	            {
            	            otherlv_12=(Token)match(input,16,FOLLOW_4); 

            	            									newLeafNode(otherlv_12, grammarAccess.getTaskDefinitionAccess().getParametersKeyword_2_0_0());
            	            								
            	            otherlv_13=(Token)match(input,12,FOLLOW_8); 

            	            									newLeafNode(otherlv_13, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1());
            	            								
            	            // InternalTaskDefinition.g:212:9: ( (lv_parameters_14_0= ruleAttribute ) )*
            	            loop4:
            	            do {
            	                int alt4=2;
            	                int LA4_0 = input.LA(1);

            	                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==19) ) {
            	                    alt4=1;
            	                }


            	                switch (alt4) {
            	            	case 1 :
            	            	    // InternalTaskDefinition.g:213:10: (lv_parameters_14_0= ruleAttribute )
            	            	    {
            	            	    // InternalTaskDefinition.g:213:10: (lv_parameters_14_0= ruleAttribute )
            	            	    // InternalTaskDefinition.g:214:11: lv_parameters_14_0= ruleAttribute
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getTaskDefinitionAccess().getParametersAttributeParserRuleCall_2_0_2_0());
            	            	    										
            	            	    pushFollow(FOLLOW_8);
            	            	    lv_parameters_14_0=ruleAttribute();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"parameters",
            	            	    												lv_parameters_14_0,
            	            	    												"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.Attribute");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop4;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,14,FOLLOW_9); 

            	            									newLeafNode(otherlv_15, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_2_0_3());
            	            								

            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,14,FOLLOW_7); 

            	    								newLeafNode(otherlv_16, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_2_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleTaskDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleTaskDefinition"


    // $ANTLR start "entryRuleTaskInputDefinition"
    // InternalTaskDefinition.g:257:1: entryRuleTaskInputDefinition returns [EObject current=null] : iv_ruleTaskInputDefinition= ruleTaskInputDefinition EOF ;
    public final EObject entryRuleTaskInputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskInputDefinition = null;


        try {
            // InternalTaskDefinition.g:257:60: (iv_ruleTaskInputDefinition= ruleTaskInputDefinition EOF )
            // InternalTaskDefinition.g:258:2: iv_ruleTaskInputDefinition= ruleTaskInputDefinition EOF
            {
             newCompositeNode(grammarAccess.getTaskInputDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskInputDefinition=ruleTaskInputDefinition();

            state._fsp--;

             current =iv_ruleTaskInputDefinition; 
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
    // $ANTLR end "entryRuleTaskInputDefinition"


    // $ANTLR start "ruleTaskInputDefinition"
    // InternalTaskDefinition.g:264:1: ruleTaskInputDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( ( ruleFQN ) ) )? otherlv_3= ';' ) ;
    public final EObject ruleTaskInputDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:270:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( ( ruleFQN ) ) )? otherlv_3= ';' ) )
            // InternalTaskDefinition.g:271:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( ( ruleFQN ) ) )? otherlv_3= ';' )
            {
            // InternalTaskDefinition.g:271:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( ( ruleFQN ) ) )? otherlv_3= ';' )
            // InternalTaskDefinition.g:272:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( ( ruleFQN ) ) )? otherlv_3= ';'
            {
            // InternalTaskDefinition.g:272:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTaskDefinition.g:273:4: (lv_name_0_0= ruleEString )
            {
            // InternalTaskDefinition.g:273:4: (lv_name_0_0= ruleEString )
            // InternalTaskDefinition.g:274:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskInputDefinitionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskInputDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaskDefinition.g:291:3: (otherlv_1= ':' ( ( ruleFQN ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTaskDefinition.g:292:4: otherlv_1= ':' ( ( ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getTaskInputDefinitionAccess().getColonKeyword_1_0());
                    			
                    // InternalTaskDefinition.g:296:4: ( ( ruleFQN ) )
                    // InternalTaskDefinition.g:297:5: ( ruleFQN )
                    {
                    // InternalTaskDefinition.g:297:5: ( ruleFQN )
                    // InternalTaskDefinition.g:298:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskInputDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskInputDefinitionAccess().getDataTypeDataTypeCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskInputDefinitionAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleTaskInputDefinition"


    // $ANTLR start "entryRuleTaskOutputDefinition"
    // InternalTaskDefinition.g:321:1: entryRuleTaskOutputDefinition returns [EObject current=null] : iv_ruleTaskOutputDefinition= ruleTaskOutputDefinition EOF ;
    public final EObject entryRuleTaskOutputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskOutputDefinition = null;


        try {
            // InternalTaskDefinition.g:321:61: (iv_ruleTaskOutputDefinition= ruleTaskOutputDefinition EOF )
            // InternalTaskDefinition.g:322:2: iv_ruleTaskOutputDefinition= ruleTaskOutputDefinition EOF
            {
             newCompositeNode(grammarAccess.getTaskOutputDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskOutputDefinition=ruleTaskOutputDefinition();

            state._fsp--;

             current =iv_ruleTaskOutputDefinition; 
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
    // $ANTLR end "entryRuleTaskOutputDefinition"


    // $ANTLR start "ruleTaskOutputDefinition"
    // InternalTaskDefinition.g:328:1: ruleTaskOutputDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( ( ruleFQN ) ) )? otherlv_3= ';' ) ;
    public final EObject ruleTaskOutputDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:334:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( ( ruleFQN ) ) )? otherlv_3= ';' ) )
            // InternalTaskDefinition.g:335:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( ( ruleFQN ) ) )? otherlv_3= ';' )
            {
            // InternalTaskDefinition.g:335:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( ( ruleFQN ) ) )? otherlv_3= ';' )
            // InternalTaskDefinition.g:336:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( ( ruleFQN ) ) )? otherlv_3= ';'
            {
            // InternalTaskDefinition.g:336:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTaskDefinition.g:337:4: (lv_name_0_0= ruleEString )
            {
            // InternalTaskDefinition.g:337:4: (lv_name_0_0= ruleEString )
            // InternalTaskDefinition.g:338:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskOutputDefinitionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskOutputDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.dlr.sc.virsat.model.ext.tml.structural.DeclarationLangauge.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaskDefinition.g:355:3: (otherlv_1= ':' ( ( ruleFQN ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDefinition.g:356:4: otherlv_1= ':' ( ( ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getTaskOutputDefinitionAccess().getColonKeyword_1_0());
                    			
                    // InternalTaskDefinition.g:360:4: ( ( ruleFQN ) )
                    // InternalTaskDefinition.g:361:5: ( ruleFQN )
                    {
                    // InternalTaskDefinition.g:361:5: ( ruleFQN )
                    // InternalTaskDefinition.g:362:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskOutputDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskOutputDefinitionAccess().getDataTypeDataTypeCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskOutputDefinitionAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleTaskOutputDefinition"


    // $ANTLR start "entryRuleAttribute"
    // InternalTaskDefinition.g:385:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTaskDefinition.g:385:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTaskDefinition.g:386:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTaskDefinition.g:392:1: ruleAttribute returns [EObject current=null] : ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) ) ;
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
            // InternalTaskDefinition.g:398:2: ( ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) ) )
            // InternalTaskDefinition.g:399:2: ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) )
            {
            // InternalTaskDefinition.g:399:2: ( ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? ) )
            // InternalTaskDefinition.g:400:3: ( (lv_isConst_0_0= 'const' ) )? ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_dimensions_4_0= ruleArrayDimension ) )* ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalTaskDefinition.g:400:3: ( (lv_isConst_0_0= 'const' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDefinition.g:401:4: (lv_isConst_0_0= 'const' )
                    {
                    // InternalTaskDefinition.g:401:4: (lv_isConst_0_0= 'const' )
                    // InternalTaskDefinition.g:402:5: lv_isConst_0_0= 'const'
                    {
                    lv_isConst_0_0=(Token)match(input,19,FOLLOW_3); 

                    					newLeafNode(lv_isConst_0_0, grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isConst", lv_isConst_0_0 != null, "const");
                    				

                    }


                    }
                    break;

            }

            // InternalTaskDefinition.g:414:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTaskDefinition.g:415:4: (lv_name_1_0= ruleEString )
            {
            // InternalTaskDefinition.g:415:4: (lv_name_1_0= ruleEString )
            // InternalTaskDefinition.g:416:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalTaskDefinition.g:437:3: ( ( ruleFQN ) )
            // InternalTaskDefinition.g:438:4: ( ruleFQN )
            {
            // InternalTaskDefinition.g:438:4: ( ruleFQN )
            // InternalTaskDefinition.g:439:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeOfITypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_14);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaskDefinition.g:453:3: ( (lv_dimensions_4_0= ruleArrayDimension ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTaskDefinition.g:454:4: (lv_dimensions_4_0= ruleArrayDimension )
            	    {
            	    // InternalTaskDefinition.g:454:4: (lv_dimensions_4_0= ruleArrayDimension )
            	    // InternalTaskDefinition.g:455:5: lv_dimensions_4_0= ruleArrayDimension
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeAccess().getDimensionsArrayDimensionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop10;
                }
            } while (true);

            // InternalTaskDefinition.g:472:3: ( (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' ) | otherlv_8= ';' | ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )? )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt15=1;
                }
                break;
            case 18:
                {
                alt15=2;
                }
                break;
            case EOF:
            case RULE_STRING:
            case RULE_ID:
            case 12:
            case 14:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalTaskDefinition.g:473:4: (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' )
                    {
                    // InternalTaskDefinition.g:473:4: (otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';' )
                    // InternalTaskDefinition.g:474:5: otherlv_5= '=' ( (lv_valueLiteral_6_0= ruleEString ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0_0());
                    				
                    // InternalTaskDefinition.g:478:5: ( (lv_valueLiteral_6_0= ruleEString ) )
                    // InternalTaskDefinition.g:479:6: (lv_valueLiteral_6_0= ruleEString )
                    {
                    // InternalTaskDefinition.g:479:6: (lv_valueLiteral_6_0= ruleEString )
                    // InternalTaskDefinition.g:480:7: lv_valueLiteral_6_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_0_1_0());
                    						
                    pushFollow(FOLLOW_12);
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

                    otherlv_7=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:503:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalTaskDefinition.g:508:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )?
                    {
                    // InternalTaskDefinition.g:508:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==12||(LA14_0>=22 && LA14_0<=25)) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==14) ) {
                        int LA14_2 = input.LA(2);

                        if ( (LA14_2==18) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalTaskDefinition.g:509:5: ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) )
                            {
                            // InternalTaskDefinition.g:509:5: ( ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) )
                            // InternalTaskDefinition.g:510:6: ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?)
                            {
                             
                            					  getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            					
                            // InternalTaskDefinition.g:513:6: ( ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?)
                            // InternalTaskDefinition.g:514:7: ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?
                            {
                            // InternalTaskDefinition.g:514:7: ( ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+
                            int cnt13=0;
                            loop13:
                            do {
                                int alt13=6;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==14) ) {
                                    int LA13_1 = input.LA(2);

                                    if ( LA13_1 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                                        alt13=5;
                                    }


                                }
                                else if ( LA13_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                                    alt13=1;
                                }
                                else if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                                    alt13=2;
                                }
                                else if ( LA13_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                                    alt13=3;
                                }
                                else if ( LA13_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                                    alt13=4;
                                }
                                else if ( LA13_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                                    alt13=5;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalTaskDefinition.g:515:5: ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) )
                            	    {
                            	    // InternalTaskDefinition.g:515:5: ({...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) ) )
                            	    // InternalTaskDefinition.g:516:6: {...}? => ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0)");
                            	    }
                            	    // InternalTaskDefinition.g:516:109: ( ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) ) )
                            	    // InternalTaskDefinition.g:517:7: ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0);
                            	    						
                            	    // InternalTaskDefinition.g:520:10: ({...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? ) )
                            	    // InternalTaskDefinition.g:520:11: {...}? => (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalTaskDefinition.g:520:20: (otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )? )
                            	    // InternalTaskDefinition.g:520:21: otherlv_10= '{' (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )?
                            	    {
                            	    otherlv_10=(Token)match(input,12,FOLLOW_15); 

                            	    										newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0());
                            	    									
                            	    // InternalTaskDefinition.g:524:10: (otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';' )?
                            	    int alt11=2;
                            	    int LA11_0 = input.LA(1);

                            	    if ( (LA11_0==21) ) {
                            	        alt11=1;
                            	    }
                            	    switch (alt11) {
                            	        case 1 :
                            	            // InternalTaskDefinition.g:525:11: otherlv_11= 'value' otherlv_12= ':' ( (lv_valueLiteral_13_0= ruleEString ) ) otherlv_14= ';'
                            	            {
                            	            otherlv_11=(Token)match(input,21,FOLLOW_13); 

                            	            											newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getValueKeyword_5_2_0_1_0());
                            	            										
                            	            otherlv_12=(Token)match(input,17,FOLLOW_3); 

                            	            											newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getColonKeyword_5_2_0_1_1());
                            	            										
                            	            // InternalTaskDefinition.g:533:11: ( (lv_valueLiteral_13_0= ruleEString ) )
                            	            // InternalTaskDefinition.g:534:12: (lv_valueLiteral_13_0= ruleEString )
                            	            {
                            	            // InternalTaskDefinition.g:534:12: (lv_valueLiteral_13_0= ruleEString )
                            	            // InternalTaskDefinition.g:535:13: lv_valueLiteral_13_0= ruleEString
                            	            {

                            	            													newCompositeNode(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_2_0_1_2_0());
                            	            												
                            	            pushFollow(FOLLOW_12);
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

                            	            otherlv_14=(Token)match(input,18,FOLLOW_16); 

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
                            	    // InternalTaskDefinition.g:563:5: ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) )
                            	    {
                            	    // InternalTaskDefinition.g:563:5: ({...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) ) )
                            	    // InternalTaskDefinition.g:564:6: {...}? => ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1)");
                            	    }
                            	    // InternalTaskDefinition.g:564:109: ( ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) ) )
                            	    // InternalTaskDefinition.g:565:7: ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1);
                            	    						
                            	    // InternalTaskDefinition.g:568:10: ({...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' ) )
                            	    // InternalTaskDefinition.g:568:11: {...}? => (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalTaskDefinition.g:568:20: (otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';' )
                            	    // InternalTaskDefinition.g:568:21: otherlv_15= 'max' otherlv_16= ':' ( (lv_maxValueLiteral_17_0= ruleEString ) ) otherlv_18= ';'
                            	    {
                            	    otherlv_15=(Token)match(input,22,FOLLOW_13); 

                            	    										newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getMaxKeyword_5_2_1_0());
                            	    									
                            	    otherlv_16=(Token)match(input,17,FOLLOW_3); 

                            	    										newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getColonKeyword_5_2_1_1());
                            	    									
                            	    // InternalTaskDefinition.g:576:10: ( (lv_maxValueLiteral_17_0= ruleEString ) )
                            	    // InternalTaskDefinition.g:577:11: (lv_maxValueLiteral_17_0= ruleEString )
                            	    {
                            	    // InternalTaskDefinition.g:577:11: (lv_maxValueLiteral_17_0= ruleEString )
                            	    // InternalTaskDefinition.g:578:12: lv_maxValueLiteral_17_0= ruleEString
                            	    {

                            	    												newCompositeNode(grammarAccess.getAttributeAccess().getMaxValueLiteralEStringParserRuleCall_5_2_1_2_0());
                            	    											
                            	    pushFollow(FOLLOW_12);
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

                            	    otherlv_18=(Token)match(input,18,FOLLOW_16); 

                            	    										newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_1_3());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 3 :
                            	    // InternalTaskDefinition.g:605:5: ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) )
                            	    {
                            	    // InternalTaskDefinition.g:605:5: ({...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) ) )
                            	    // InternalTaskDefinition.g:606:6: {...}? => ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2)");
                            	    }
                            	    // InternalTaskDefinition.g:606:109: ( ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) ) )
                            	    // InternalTaskDefinition.g:607:7: ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2);
                            	    						
                            	    // InternalTaskDefinition.g:610:10: ({...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' ) )
                            	    // InternalTaskDefinition.g:610:11: {...}? => (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalTaskDefinition.g:610:20: (otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';' )
                            	    // InternalTaskDefinition.g:610:21: otherlv_19= 'min' otherlv_20= ':' ( (lv_minValueLiteral_21_0= ruleEString ) ) otherlv_22= ';'
                            	    {
                            	    otherlv_19=(Token)match(input,23,FOLLOW_13); 

                            	    										newLeafNode(otherlv_19, grammarAccess.getAttributeAccess().getMinKeyword_5_2_2_0());
                            	    									
                            	    otherlv_20=(Token)match(input,17,FOLLOW_3); 

                            	    										newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getColonKeyword_5_2_2_1());
                            	    									
                            	    // InternalTaskDefinition.g:618:10: ( (lv_minValueLiteral_21_0= ruleEString ) )
                            	    // InternalTaskDefinition.g:619:11: (lv_minValueLiteral_21_0= ruleEString )
                            	    {
                            	    // InternalTaskDefinition.g:619:11: (lv_minValueLiteral_21_0= ruleEString )
                            	    // InternalTaskDefinition.g:620:12: lv_minValueLiteral_21_0= ruleEString
                            	    {

                            	    												newCompositeNode(grammarAccess.getAttributeAccess().getMinValueLiteralEStringParserRuleCall_5_2_2_2_0());
                            	    											
                            	    pushFollow(FOLLOW_12);
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

                            	    otherlv_22=(Token)match(input,18,FOLLOW_16); 

                            	    										newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_2_3());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 4 :
                            	    // InternalTaskDefinition.g:647:5: ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) )
                            	    {
                            	    // InternalTaskDefinition.g:647:5: ({...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) ) )
                            	    // InternalTaskDefinition.g:648:6: {...}? => ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3)");
                            	    }
                            	    // InternalTaskDefinition.g:648:109: ( ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) ) )
                            	    // InternalTaskDefinition.g:649:7: ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3);
                            	    						
                            	    // InternalTaskDefinition.g:652:10: ({...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' ) )
                            	    // InternalTaskDefinition.g:652:11: {...}? => (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalTaskDefinition.g:652:20: (otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';' )
                            	    // InternalTaskDefinition.g:652:21: otherlv_23= 'referenceFrame' otherlv_24= ':' ( ( ruleFQN ) ) otherlv_26= ';'
                            	    {
                            	    otherlv_23=(Token)match(input,24,FOLLOW_13); 

                            	    										newLeafNode(otherlv_23, grammarAccess.getAttributeAccess().getReferenceFrameKeyword_5_2_3_0());
                            	    									
                            	    otherlv_24=(Token)match(input,17,FOLLOW_11); 

                            	    										newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getColonKeyword_5_2_3_1());
                            	    									
                            	    // InternalTaskDefinition.g:660:10: ( ( ruleFQN ) )
                            	    // InternalTaskDefinition.g:661:11: ( ruleFQN )
                            	    {
                            	    // InternalTaskDefinition.g:661:11: ( ruleFQN )
                            	    // InternalTaskDefinition.g:662:12: ruleFQN
                            	    {

                            	    												if (current==null) {
                            	    													current = createModelElement(grammarAccess.getAttributeRule());
                            	    												}
                            	    											

                            	    												newCompositeNode(grammarAccess.getAttributeAccess().getReferenceFrameReferenceFrameDefinitionCrossReference_5_2_3_2_0());
                            	    											
                            	    pushFollow(FOLLOW_12);
                            	    ruleFQN();

                            	    state._fsp--;


                            	    												afterParserOrEnumRuleCall();
                            	    											

                            	    }


                            	    }

                            	    otherlv_26=(Token)match(input,18,FOLLOW_16); 

                            	    										newLeafNode(otherlv_26, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_3_3());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 5 :
                            	    // InternalTaskDefinition.g:686:5: ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) )
                            	    {
                            	    // InternalTaskDefinition.g:686:5: ({...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) ) )
                            	    // InternalTaskDefinition.g:687:6: {...}? => ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4)");
                            	    }
                            	    // InternalTaskDefinition.g:687:109: ( ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) ) )
                            	    // InternalTaskDefinition.g:688:7: ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4);
                            	    						
                            	    // InternalTaskDefinition.g:691:10: ({...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' ) )
                            	    // InternalTaskDefinition.g:691:11: {...}? => ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
                            	    }
                            	    // InternalTaskDefinition.g:691:20: ( (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';' )
                            	    // InternalTaskDefinition.g:691:21: (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )? otherlv_31= '}' otherlv_32= ';'
                            	    {
                            	    // InternalTaskDefinition.g:691:21: (otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';' )?
                            	    int alt12=2;
                            	    int LA12_0 = input.LA(1);

                            	    if ( (LA12_0==25) ) {
                            	        alt12=1;
                            	    }
                            	    switch (alt12) {
                            	        case 1 :
                            	            // InternalTaskDefinition.g:692:11: otherlv_27= 'unit' otherlv_28= ':' ( ( ruleFQN ) ) otherlv_30= ';'
                            	            {
                            	            otherlv_27=(Token)match(input,25,FOLLOW_13); 

                            	            											newLeafNode(otherlv_27, grammarAccess.getAttributeAccess().getUnitKeyword_5_2_4_0_0());
                            	            										
                            	            otherlv_28=(Token)match(input,17,FOLLOW_11); 

                            	            											newLeafNode(otherlv_28, grammarAccess.getAttributeAccess().getColonKeyword_5_2_4_0_1());
                            	            										
                            	            // InternalTaskDefinition.g:700:11: ( ( ruleFQN ) )
                            	            // InternalTaskDefinition.g:701:12: ( ruleFQN )
                            	            {
                            	            // InternalTaskDefinition.g:701:12: ( ruleFQN )
                            	            // InternalTaskDefinition.g:702:13: ruleFQN
                            	            {

                            	            													if (current==null) {
                            	            														current = createModelElement(grammarAccess.getAttributeRule());
                            	            													}
                            	            												

                            	            													newCompositeNode(grammarAccess.getAttributeAccess().getTypeUnitUnitDefinitionCrossReference_5_2_4_0_2_0());
                            	            												
                            	            pushFollow(FOLLOW_12);
                            	            ruleFQN();

                            	            state._fsp--;


                            	            													afterParserOrEnumRuleCall();
                            	            												

                            	            }


                            	            }

                            	            otherlv_30=(Token)match(input,18,FOLLOW_9); 

                            	            											newLeafNode(otherlv_30, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_0_3());
                            	            										

                            	            }
                            	            break;

                            	    }

                            	    otherlv_31=(Token)match(input,14,FOLLOW_12); 

                            	    										newLeafNode(otherlv_31, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1());
                            	    									
                            	    otherlv_32=(Token)match(input,18,FOLLOW_16); 

                            	    										newLeafNode(otherlv_32, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_2());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt13 >= 1 ) break loop13;
                                        EarlyExitException eee =
                                            new EarlyExitException(13, input);
                                        throw eee;
                                }
                                cnt13++;
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
    // InternalTaskDefinition.g:748:1: entryRuleArrayDimension returns [EObject current=null] : iv_ruleArrayDimension= ruleArrayDimension EOF ;
    public final EObject entryRuleArrayDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimension = null;


        try {
            // InternalTaskDefinition.g:748:55: (iv_ruleArrayDimension= ruleArrayDimension EOF )
            // InternalTaskDefinition.g:749:2: iv_ruleArrayDimension= ruleArrayDimension EOF
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
    // InternalTaskDefinition.g:755:1: ruleArrayDimension returns [EObject current=null] : (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' ) ;
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
            // InternalTaskDefinition.g:761:2: ( (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' ) )
            // InternalTaskDefinition.g:762:2: (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' )
            {
            // InternalTaskDefinition.g:762:2: (otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']' )
            // InternalTaskDefinition.g:763:3: otherlv_0= '[' ( (lv_size_1_0= ruleEInt ) ) (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalTaskDefinition.g:767:3: ( (lv_size_1_0= ruleEInt ) )
            // InternalTaskDefinition.g:768:4: (lv_size_1_0= ruleEInt )
            {
            // InternalTaskDefinition.g:768:4: (lv_size_1_0= ruleEInt )
            // InternalTaskDefinition.g:769:5: lv_size_1_0= ruleEInt
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

            // InternalTaskDefinition.g:786:3: (otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTaskDefinition.g:787:4: otherlv_2= ',' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getArrayDimensionAccess().getCommaKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getArrayDimensionAccess().getNameKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalTaskDefinition.g:799:4: ( (lv_name_5_0= ruleEString ) )
                    // InternalTaskDefinition.g:800:5: (lv_name_5_0= ruleEString )
                    {
                    // InternalTaskDefinition.g:800:5: (lv_name_5_0= ruleEString )
                    // InternalTaskDefinition.g:801:6: lv_name_5_0= ruleEString
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

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalTaskDefinition.g:827:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTaskDefinition.g:827:47: (iv_ruleEString= ruleEString EOF )
            // InternalTaskDefinition.g:828:2: iv_ruleEString= ruleEString EOF
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
    // InternalTaskDefinition.g:834:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:840:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTaskDefinition.g:841:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTaskDefinition.g:841:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalTaskDefinition.g:842:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:850:3: this_ID_1= RULE_ID
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
    // InternalTaskDefinition.g:861:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTaskDefinition.g:861:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTaskDefinition.g:862:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalTaskDefinition.g:868:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:874:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTaskDefinition.g:875:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTaskDefinition.g:875:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTaskDefinition.g:876:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTaskDefinition.g:876:3: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTaskDefinition.g:877:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_22); 

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
    // InternalTaskDefinition.g:894:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalTaskDefinition.g:894:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalTaskDefinition.g:895:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalTaskDefinition.g:901:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:907:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalTaskDefinition.g:908:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalTaskDefinition.g:908:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalTaskDefinition.g:909:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalTaskDefinition.g:916:3: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTaskDefinition.g:917:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000084030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007D45002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003E05002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003C05002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});

}
