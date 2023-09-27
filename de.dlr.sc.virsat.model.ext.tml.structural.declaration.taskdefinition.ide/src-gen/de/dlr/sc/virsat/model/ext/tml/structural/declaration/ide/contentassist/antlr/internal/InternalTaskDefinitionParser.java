package de.dlr.sc.virsat.model.ext.tml.structural.declaration.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.services.TaskDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskDefinitionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Task'", "'{'", "'inputs'", "'}'", "'outputs'", "'parameters'", "':'", "'='", "'value'", "'max'", "'min'", "'referenceFrame'", "'unit'", "'['", "']'", "','", "'name'", "'-'", "'.'", "'const'"
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

    	public void setGrammarAccess(TaskDefinitionGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTaskDefinition"
    // InternalTaskDefinition.g:53:1: entryRuleTaskDefinition : ruleTaskDefinition EOF ;
    public final void entryRuleTaskDefinition() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:54:1: ( ruleTaskDefinition EOF )
            // InternalTaskDefinition.g:55:1: ruleTaskDefinition EOF
            {
             before(grammarAccess.getTaskDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskDefinition();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskDefinition"


    // $ANTLR start "ruleTaskDefinition"
    // InternalTaskDefinition.g:62:1: ruleTaskDefinition : ( ( rule__TaskDefinition__UnorderedGroup ) ) ;
    public final void ruleTaskDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:66:2: ( ( ( rule__TaskDefinition__UnorderedGroup ) ) )
            // InternalTaskDefinition.g:67:2: ( ( rule__TaskDefinition__UnorderedGroup ) )
            {
            // InternalTaskDefinition.g:67:2: ( ( rule__TaskDefinition__UnorderedGroup ) )
            // InternalTaskDefinition.g:68:3: ( rule__TaskDefinition__UnorderedGroup )
            {
             before(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup()); 
            // InternalTaskDefinition.g:69:3: ( rule__TaskDefinition__UnorderedGroup )
            // InternalTaskDefinition.g:69:4: rule__TaskDefinition__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskDefinition"


    // $ANTLR start "entryRuleTaskInputDefinition"
    // InternalTaskDefinition.g:78:1: entryRuleTaskInputDefinition : ruleTaskInputDefinition EOF ;
    public final void entryRuleTaskInputDefinition() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:79:1: ( ruleTaskInputDefinition EOF )
            // InternalTaskDefinition.g:80:1: ruleTaskInputDefinition EOF
            {
             before(grammarAccess.getTaskInputDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskInputDefinition();

            state._fsp--;

             after(grammarAccess.getTaskInputDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskInputDefinition"


    // $ANTLR start "ruleTaskInputDefinition"
    // InternalTaskDefinition.g:87:1: ruleTaskInputDefinition : ( ( rule__TaskInputDefinition__Group__0 ) ) ;
    public final void ruleTaskInputDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:91:2: ( ( ( rule__TaskInputDefinition__Group__0 ) ) )
            // InternalTaskDefinition.g:92:2: ( ( rule__TaskInputDefinition__Group__0 ) )
            {
            // InternalTaskDefinition.g:92:2: ( ( rule__TaskInputDefinition__Group__0 ) )
            // InternalTaskDefinition.g:93:3: ( rule__TaskInputDefinition__Group__0 )
            {
             before(grammarAccess.getTaskInputDefinitionAccess().getGroup()); 
            // InternalTaskDefinition.g:94:3: ( rule__TaskInputDefinition__Group__0 )
            // InternalTaskDefinition.g:94:4: rule__TaskInputDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskInputDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskInputDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskInputDefinition"


    // $ANTLR start "entryRuleTaskOutputDefinition"
    // InternalTaskDefinition.g:103:1: entryRuleTaskOutputDefinition : ruleTaskOutputDefinition EOF ;
    public final void entryRuleTaskOutputDefinition() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:104:1: ( ruleTaskOutputDefinition EOF )
            // InternalTaskDefinition.g:105:1: ruleTaskOutputDefinition EOF
            {
             before(grammarAccess.getTaskOutputDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskOutputDefinition();

            state._fsp--;

             after(grammarAccess.getTaskOutputDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskOutputDefinition"


    // $ANTLR start "ruleTaskOutputDefinition"
    // InternalTaskDefinition.g:112:1: ruleTaskOutputDefinition : ( ( rule__TaskOutputDefinition__Group__0 ) ) ;
    public final void ruleTaskOutputDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:116:2: ( ( ( rule__TaskOutputDefinition__Group__0 ) ) )
            // InternalTaskDefinition.g:117:2: ( ( rule__TaskOutputDefinition__Group__0 ) )
            {
            // InternalTaskDefinition.g:117:2: ( ( rule__TaskOutputDefinition__Group__0 ) )
            // InternalTaskDefinition.g:118:3: ( rule__TaskOutputDefinition__Group__0 )
            {
             before(grammarAccess.getTaskOutputDefinitionAccess().getGroup()); 
            // InternalTaskDefinition.g:119:3: ( rule__TaskOutputDefinition__Group__0 )
            // InternalTaskDefinition.g:119:4: rule__TaskOutputDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutputDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskOutputDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskOutputDefinition"


    // $ANTLR start "entryRuleAttribute"
    // InternalTaskDefinition.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:129:1: ( ruleAttribute EOF )
            // InternalTaskDefinition.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalTaskDefinition.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalTaskDefinition.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalTaskDefinition.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalTaskDefinition.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalTaskDefinition.g:144:3: ( rule__Attribute__Group__0 )
            // InternalTaskDefinition.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleArrayDimension"
    // InternalTaskDefinition.g:153:1: entryRuleArrayDimension : ruleArrayDimension EOF ;
    public final void entryRuleArrayDimension() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:154:1: ( ruleArrayDimension EOF )
            // InternalTaskDefinition.g:155:1: ruleArrayDimension EOF
            {
             before(grammarAccess.getArrayDimensionRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayDimension();

            state._fsp--;

             after(grammarAccess.getArrayDimensionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayDimension"


    // $ANTLR start "ruleArrayDimension"
    // InternalTaskDefinition.g:162:1: ruleArrayDimension : ( ( rule__ArrayDimension__Group__0 ) ) ;
    public final void ruleArrayDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:166:2: ( ( ( rule__ArrayDimension__Group__0 ) ) )
            // InternalTaskDefinition.g:167:2: ( ( rule__ArrayDimension__Group__0 ) )
            {
            // InternalTaskDefinition.g:167:2: ( ( rule__ArrayDimension__Group__0 ) )
            // InternalTaskDefinition.g:168:3: ( rule__ArrayDimension__Group__0 )
            {
             before(grammarAccess.getArrayDimensionAccess().getGroup()); 
            // InternalTaskDefinition.g:169:3: ( rule__ArrayDimension__Group__0 )
            // InternalTaskDefinition.g:169:4: rule__ArrayDimension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayDimensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayDimension"


    // $ANTLR start "entryRuleEString"
    // InternalTaskDefinition.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:179:1: ( ruleEString EOF )
            // InternalTaskDefinition.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTaskDefinition.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTaskDefinition.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTaskDefinition.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalTaskDefinition.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTaskDefinition.g:194:3: ( rule__EString__Alternatives )
            // InternalTaskDefinition.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalTaskDefinition.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:204:1: ( ruleEInt EOF )
            // InternalTaskDefinition.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTaskDefinition.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTaskDefinition.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTaskDefinition.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalTaskDefinition.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTaskDefinition.g:219:3: ( rule__EInt__Group__0 )
            // InternalTaskDefinition.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleFQN"
    // InternalTaskDefinition.g:228:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:229:1: ( ruleFQN EOF )
            // InternalTaskDefinition.g:230:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalTaskDefinition.g:237:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:241:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalTaskDefinition.g:242:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalTaskDefinition.g:242:2: ( ( rule__FQN__Group__0 ) )
            // InternalTaskDefinition.g:243:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalTaskDefinition.g:244:3: ( rule__FQN__Group__0 )
            // InternalTaskDefinition.g:244:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rule__Attribute__Alternatives_5"
    // InternalTaskDefinition.g:252:1: rule__Attribute__Alternatives_5 : ( ( ( rule__Attribute__Group_5_0__0 ) ) | ( ';' ) | ( ( rule__Attribute__UnorderedGroup_5_2 )? ) );
    public final void rule__Attribute__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:256:1: ( ( ( rule__Attribute__Group_5_0__0 ) ) | ( ';' ) | ( ( rule__Attribute__UnorderedGroup_5_2 )? ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case EOF:
            case RULE_STRING:
            case RULE_ID:
            case 13:
            case 15:
            case 21:
            case 22:
            case 23:
            case 24:
            case 31:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTaskDefinition.g:257:2: ( ( rule__Attribute__Group_5_0__0 ) )
                    {
                    // InternalTaskDefinition.g:257:2: ( ( rule__Attribute__Group_5_0__0 ) )
                    // InternalTaskDefinition.g:258:3: ( rule__Attribute__Group_5_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_0()); 
                    // InternalTaskDefinition.g:259:3: ( rule__Attribute__Group_5_0__0 )
                    // InternalTaskDefinition.g:259:4: rule__Attribute__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:263:2: ( ';' )
                    {
                    // InternalTaskDefinition.g:263:2: ( ';' )
                    // InternalTaskDefinition.g:264:3: ';'
                    {
                     before(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDefinition.g:269:2: ( ( rule__Attribute__UnorderedGroup_5_2 )? )
                    {
                    // InternalTaskDefinition.g:269:2: ( ( rule__Attribute__UnorderedGroup_5_2 )? )
                    // InternalTaskDefinition.g:270:3: ( rule__Attribute__UnorderedGroup_5_2 )?
                    {
                     before(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2()); 
                    // InternalTaskDefinition.g:271:3: ( rule__Attribute__UnorderedGroup_5_2 )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( LA1_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                        alt1=1;
                    }
                    else if ( LA1_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                        alt1=1;
                    }
                    else if ( LA1_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                        alt1=1;
                    }
                    else if ( LA1_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                        alt1=1;
                    }
                    else if ( LA1_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==15) ) {
                        int LA1_6 = input.LA(2);

                        if ( LA1_6 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                            alt1=1;
                        }
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalTaskDefinition.g:271:4: rule__Attribute__UnorderedGroup_5_2
                            {
                            pushFollow(FOLLOW_2);
                            rule__Attribute__UnorderedGroup_5_2();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Alternatives_5"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTaskDefinition.g:279:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:283:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalTaskDefinition.g:284:2: ( RULE_STRING )
                    {
                    // InternalTaskDefinition.g:284:2: ( RULE_STRING )
                    // InternalTaskDefinition.g:285:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:290:2: ( RULE_ID )
                    {
                    // InternalTaskDefinition.g:290:2: ( RULE_ID )
                    // InternalTaskDefinition.g:291:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TaskDefinition__Group_0__0"
    // InternalTaskDefinition.g:300:1: rule__TaskDefinition__Group_0__0 : rule__TaskDefinition__Group_0__0__Impl rule__TaskDefinition__Group_0__1 ;
    public final void rule__TaskDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:304:1: ( rule__TaskDefinition__Group_0__0__Impl rule__TaskDefinition__Group_0__1 )
            // InternalTaskDefinition.g:305:2: rule__TaskDefinition__Group_0__0__Impl rule__TaskDefinition__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__TaskDefinition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0__0"


    // $ANTLR start "rule__TaskDefinition__Group_0__0__Impl"
    // InternalTaskDefinition.g:312:1: rule__TaskDefinition__Group_0__0__Impl : ( 'Task' ) ;
    public final void rule__TaskDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:316:1: ( ( 'Task' ) )
            // InternalTaskDefinition.g:317:1: ( 'Task' )
            {
            // InternalTaskDefinition.g:317:1: ( 'Task' )
            // InternalTaskDefinition.g:318:2: 'Task'
            {
             before(grammarAccess.getTaskDefinitionAccess().getTaskKeyword_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getTaskKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_0__1"
    // InternalTaskDefinition.g:327:1: rule__TaskDefinition__Group_0__1 : rule__TaskDefinition__Group_0__1__Impl rule__TaskDefinition__Group_0__2 ;
    public final void rule__TaskDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:331:1: ( rule__TaskDefinition__Group_0__1__Impl rule__TaskDefinition__Group_0__2 )
            // InternalTaskDefinition.g:332:2: rule__TaskDefinition__Group_0__1__Impl rule__TaskDefinition__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__TaskDefinition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0__1"


    // $ANTLR start "rule__TaskDefinition__Group_0__1__Impl"
    // InternalTaskDefinition.g:339:1: rule__TaskDefinition__Group_0__1__Impl : ( ( rule__TaskDefinition__NameAssignment_0_1 ) ) ;
    public final void rule__TaskDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:343:1: ( ( ( rule__TaskDefinition__NameAssignment_0_1 ) ) )
            // InternalTaskDefinition.g:344:1: ( ( rule__TaskDefinition__NameAssignment_0_1 ) )
            {
            // InternalTaskDefinition.g:344:1: ( ( rule__TaskDefinition__NameAssignment_0_1 ) )
            // InternalTaskDefinition.g:345:2: ( rule__TaskDefinition__NameAssignment_0_1 )
            {
             before(grammarAccess.getTaskDefinitionAccess().getNameAssignment_0_1()); 
            // InternalTaskDefinition.g:346:2: ( rule__TaskDefinition__NameAssignment_0_1 )
            // InternalTaskDefinition.g:346:3: rule__TaskDefinition__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskDefinitionAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_0__2"
    // InternalTaskDefinition.g:354:1: rule__TaskDefinition__Group_0__2 : rule__TaskDefinition__Group_0__2__Impl rule__TaskDefinition__Group_0__3 ;
    public final void rule__TaskDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:358:1: ( rule__TaskDefinition__Group_0__2__Impl rule__TaskDefinition__Group_0__3 )
            // InternalTaskDefinition.g:359:2: rule__TaskDefinition__Group_0__2__Impl rule__TaskDefinition__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__TaskDefinition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0__2"


    // $ANTLR start "rule__TaskDefinition__Group_0__2__Impl"
    // InternalTaskDefinition.g:366:1: rule__TaskDefinition__Group_0__2__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:370:1: ( ( '{' ) )
            // InternalTaskDefinition.g:371:1: ( '{' )
            {
            // InternalTaskDefinition.g:371:1: ( '{' )
            // InternalTaskDefinition.g:372:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0__2__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_0__3"
    // InternalTaskDefinition.g:381:1: rule__TaskDefinition__Group_0__3 : rule__TaskDefinition__Group_0__3__Impl ;
    public final void rule__TaskDefinition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:385:1: ( rule__TaskDefinition__Group_0__3__Impl )
            // InternalTaskDefinition.g:386:2: rule__TaskDefinition__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0__3"


    // $ANTLR start "rule__TaskDefinition__Group_0__3__Impl"
    // InternalTaskDefinition.g:392:1: rule__TaskDefinition__Group_0__3__Impl : ( ( rule__TaskDefinition__Group_0_3__0 )? ) ;
    public final void rule__TaskDefinition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:396:1: ( ( ( rule__TaskDefinition__Group_0_3__0 )? ) )
            // InternalTaskDefinition.g:397:1: ( ( rule__TaskDefinition__Group_0_3__0 )? )
            {
            // InternalTaskDefinition.g:397:1: ( ( rule__TaskDefinition__Group_0_3__0 )? )
            // InternalTaskDefinition.g:398:2: ( rule__TaskDefinition__Group_0_3__0 )?
            {
             before(grammarAccess.getTaskDefinitionAccess().getGroup_0_3()); 
            // InternalTaskDefinition.g:399:2: ( rule__TaskDefinition__Group_0_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTaskDefinition.g:399:3: rule__TaskDefinition__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDefinition__Group_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskDefinitionAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0__3__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_0_3__0"
    // InternalTaskDefinition.g:408:1: rule__TaskDefinition__Group_0_3__0 : rule__TaskDefinition__Group_0_3__0__Impl rule__TaskDefinition__Group_0_3__1 ;
    public final void rule__TaskDefinition__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:412:1: ( rule__TaskDefinition__Group_0_3__0__Impl rule__TaskDefinition__Group_0_3__1 )
            // InternalTaskDefinition.g:413:2: rule__TaskDefinition__Group_0_3__0__Impl rule__TaskDefinition__Group_0_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TaskDefinition__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0_3__0"


    // $ANTLR start "rule__TaskDefinition__Group_0_3__0__Impl"
    // InternalTaskDefinition.g:420:1: rule__TaskDefinition__Group_0_3__0__Impl : ( 'inputs' ) ;
    public final void rule__TaskDefinition__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:424:1: ( ( 'inputs' ) )
            // InternalTaskDefinition.g:425:1: ( 'inputs' )
            {
            // InternalTaskDefinition.g:425:1: ( 'inputs' )
            // InternalTaskDefinition.g:426:2: 'inputs'
            {
             before(grammarAccess.getTaskDefinitionAccess().getInputsKeyword_0_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getInputsKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0_3__0__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_0_3__1"
    // InternalTaskDefinition.g:435:1: rule__TaskDefinition__Group_0_3__1 : rule__TaskDefinition__Group_0_3__1__Impl rule__TaskDefinition__Group_0_3__2 ;
    public final void rule__TaskDefinition__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:439:1: ( rule__TaskDefinition__Group_0_3__1__Impl rule__TaskDefinition__Group_0_3__2 )
            // InternalTaskDefinition.g:440:2: rule__TaskDefinition__Group_0_3__1__Impl rule__TaskDefinition__Group_0_3__2
            {
            pushFollow(FOLLOW_6);
            rule__TaskDefinition__Group_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0_3__1"


    // $ANTLR start "rule__TaskDefinition__Group_0_3__1__Impl"
    // InternalTaskDefinition.g:447:1: rule__TaskDefinition__Group_0_3__1__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:451:1: ( ( '{' ) )
            // InternalTaskDefinition.g:452:1: ( '{' )
            {
            // InternalTaskDefinition.g:452:1: ( '{' )
            // InternalTaskDefinition.g:453:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_0_3_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0_3__1__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_0_3__2"
    // InternalTaskDefinition.g:462:1: rule__TaskDefinition__Group_0_3__2 : rule__TaskDefinition__Group_0_3__2__Impl rule__TaskDefinition__Group_0_3__3 ;
    public final void rule__TaskDefinition__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:466:1: ( rule__TaskDefinition__Group_0_3__2__Impl rule__TaskDefinition__Group_0_3__3 )
            // InternalTaskDefinition.g:467:2: rule__TaskDefinition__Group_0_3__2__Impl rule__TaskDefinition__Group_0_3__3
            {
            pushFollow(FOLLOW_6);
            rule__TaskDefinition__Group_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_0_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0_3__2"


    // $ANTLR start "rule__TaskDefinition__Group_0_3__2__Impl"
    // InternalTaskDefinition.g:474:1: rule__TaskDefinition__Group_0_3__2__Impl : ( ( rule__TaskDefinition__InputsAssignment_0_3_2 )* ) ;
    public final void rule__TaskDefinition__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:478:1: ( ( ( rule__TaskDefinition__InputsAssignment_0_3_2 )* ) )
            // InternalTaskDefinition.g:479:1: ( ( rule__TaskDefinition__InputsAssignment_0_3_2 )* )
            {
            // InternalTaskDefinition.g:479:1: ( ( rule__TaskDefinition__InputsAssignment_0_3_2 )* )
            // InternalTaskDefinition.g:480:2: ( rule__TaskDefinition__InputsAssignment_0_3_2 )*
            {
             before(grammarAccess.getTaskDefinitionAccess().getInputsAssignment_0_3_2()); 
            // InternalTaskDefinition.g:481:2: ( rule__TaskDefinition__InputsAssignment_0_3_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTaskDefinition.g:481:3: rule__TaskDefinition__InputsAssignment_0_3_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TaskDefinition__InputsAssignment_0_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTaskDefinitionAccess().getInputsAssignment_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0_3__2__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_0_3__3"
    // InternalTaskDefinition.g:489:1: rule__TaskDefinition__Group_0_3__3 : rule__TaskDefinition__Group_0_3__3__Impl ;
    public final void rule__TaskDefinition__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:493:1: ( rule__TaskDefinition__Group_0_3__3__Impl )
            // InternalTaskDefinition.g:494:2: rule__TaskDefinition__Group_0_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_0_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0_3__3"


    // $ANTLR start "rule__TaskDefinition__Group_0_3__3__Impl"
    // InternalTaskDefinition.g:500:1: rule__TaskDefinition__Group_0_3__3__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:504:1: ( ( '}' ) )
            // InternalTaskDefinition.g:505:1: ( '}' )
            {
            // InternalTaskDefinition.g:505:1: ( '}' )
            // InternalTaskDefinition.g:506:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_0_3_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_0_3__3__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_1__0"
    // InternalTaskDefinition.g:516:1: rule__TaskDefinition__Group_1__0 : rule__TaskDefinition__Group_1__0__Impl rule__TaskDefinition__Group_1__1 ;
    public final void rule__TaskDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:520:1: ( rule__TaskDefinition__Group_1__0__Impl rule__TaskDefinition__Group_1__1 )
            // InternalTaskDefinition.g:521:2: rule__TaskDefinition__Group_1__0__Impl rule__TaskDefinition__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__TaskDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_1__0"


    // $ANTLR start "rule__TaskDefinition__Group_1__0__Impl"
    // InternalTaskDefinition.g:528:1: rule__TaskDefinition__Group_1__0__Impl : ( 'outputs' ) ;
    public final void rule__TaskDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:532:1: ( ( 'outputs' ) )
            // InternalTaskDefinition.g:533:1: ( 'outputs' )
            {
            // InternalTaskDefinition.g:533:1: ( 'outputs' )
            // InternalTaskDefinition.g:534:2: 'outputs'
            {
             before(grammarAccess.getTaskDefinitionAccess().getOutputsKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getOutputsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_1__1"
    // InternalTaskDefinition.g:543:1: rule__TaskDefinition__Group_1__1 : rule__TaskDefinition__Group_1__1__Impl rule__TaskDefinition__Group_1__2 ;
    public final void rule__TaskDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:547:1: ( rule__TaskDefinition__Group_1__1__Impl rule__TaskDefinition__Group_1__2 )
            // InternalTaskDefinition.g:548:2: rule__TaskDefinition__Group_1__1__Impl rule__TaskDefinition__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__TaskDefinition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_1__1"


    // $ANTLR start "rule__TaskDefinition__Group_1__1__Impl"
    // InternalTaskDefinition.g:555:1: rule__TaskDefinition__Group_1__1__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:559:1: ( ( '{' ) )
            // InternalTaskDefinition.g:560:1: ( '{' )
            {
            // InternalTaskDefinition.g:560:1: ( '{' )
            // InternalTaskDefinition.g:561:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_1__2"
    // InternalTaskDefinition.g:570:1: rule__TaskDefinition__Group_1__2 : rule__TaskDefinition__Group_1__2__Impl rule__TaskDefinition__Group_1__3 ;
    public final void rule__TaskDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:574:1: ( rule__TaskDefinition__Group_1__2__Impl rule__TaskDefinition__Group_1__3 )
            // InternalTaskDefinition.g:575:2: rule__TaskDefinition__Group_1__2__Impl rule__TaskDefinition__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__TaskDefinition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_1__2"


    // $ANTLR start "rule__TaskDefinition__Group_1__2__Impl"
    // InternalTaskDefinition.g:582:1: rule__TaskDefinition__Group_1__2__Impl : ( ( rule__TaskDefinition__OutputsAssignment_1_2 )* ) ;
    public final void rule__TaskDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:586:1: ( ( ( rule__TaskDefinition__OutputsAssignment_1_2 )* ) )
            // InternalTaskDefinition.g:587:1: ( ( rule__TaskDefinition__OutputsAssignment_1_2 )* )
            {
            // InternalTaskDefinition.g:587:1: ( ( rule__TaskDefinition__OutputsAssignment_1_2 )* )
            // InternalTaskDefinition.g:588:2: ( rule__TaskDefinition__OutputsAssignment_1_2 )*
            {
             before(grammarAccess.getTaskDefinitionAccess().getOutputsAssignment_1_2()); 
            // InternalTaskDefinition.g:589:2: ( rule__TaskDefinition__OutputsAssignment_1_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTaskDefinition.g:589:3: rule__TaskDefinition__OutputsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TaskDefinition__OutputsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTaskDefinitionAccess().getOutputsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_1__2__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_1__3"
    // InternalTaskDefinition.g:597:1: rule__TaskDefinition__Group_1__3 : rule__TaskDefinition__Group_1__3__Impl ;
    public final void rule__TaskDefinition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:601:1: ( rule__TaskDefinition__Group_1__3__Impl )
            // InternalTaskDefinition.g:602:2: rule__TaskDefinition__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_1__3"


    // $ANTLR start "rule__TaskDefinition__Group_1__3__Impl"
    // InternalTaskDefinition.g:608:1: rule__TaskDefinition__Group_1__3__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:612:1: ( ( '}' ) )
            // InternalTaskDefinition.g:613:1: ( '}' )
            {
            // InternalTaskDefinition.g:613:1: ( '}' )
            // InternalTaskDefinition.g:614:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_1__3__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_2__0"
    // InternalTaskDefinition.g:624:1: rule__TaskDefinition__Group_2__0 : rule__TaskDefinition__Group_2__0__Impl rule__TaskDefinition__Group_2__1 ;
    public final void rule__TaskDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:628:1: ( rule__TaskDefinition__Group_2__0__Impl rule__TaskDefinition__Group_2__1 )
            // InternalTaskDefinition.g:629:2: rule__TaskDefinition__Group_2__0__Impl rule__TaskDefinition__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__TaskDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2__0"


    // $ANTLR start "rule__TaskDefinition__Group_2__0__Impl"
    // InternalTaskDefinition.g:636:1: rule__TaskDefinition__Group_2__0__Impl : ( ( rule__TaskDefinition__Group_2_0__0 )? ) ;
    public final void rule__TaskDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:640:1: ( ( ( rule__TaskDefinition__Group_2_0__0 )? ) )
            // InternalTaskDefinition.g:641:1: ( ( rule__TaskDefinition__Group_2_0__0 )? )
            {
            // InternalTaskDefinition.g:641:1: ( ( rule__TaskDefinition__Group_2_0__0 )? )
            // InternalTaskDefinition.g:642:2: ( rule__TaskDefinition__Group_2_0__0 )?
            {
             before(grammarAccess.getTaskDefinitionAccess().getGroup_2_0()); 
            // InternalTaskDefinition.g:643:2: ( rule__TaskDefinition__Group_2_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTaskDefinition.g:643:3: rule__TaskDefinition__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDefinition__Group_2_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskDefinitionAccess().getGroup_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_2__1"
    // InternalTaskDefinition.g:651:1: rule__TaskDefinition__Group_2__1 : rule__TaskDefinition__Group_2__1__Impl ;
    public final void rule__TaskDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:655:1: ( rule__TaskDefinition__Group_2__1__Impl )
            // InternalTaskDefinition.g:656:2: rule__TaskDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2__1"


    // $ANTLR start "rule__TaskDefinition__Group_2__1__Impl"
    // InternalTaskDefinition.g:662:1: rule__TaskDefinition__Group_2__1__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:666:1: ( ( '}' ) )
            // InternalTaskDefinition.g:667:1: ( '}' )
            {
            // InternalTaskDefinition.g:667:1: ( '}' )
            // InternalTaskDefinition.g:668:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_2_0__0"
    // InternalTaskDefinition.g:678:1: rule__TaskDefinition__Group_2_0__0 : rule__TaskDefinition__Group_2_0__0__Impl rule__TaskDefinition__Group_2_0__1 ;
    public final void rule__TaskDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:682:1: ( rule__TaskDefinition__Group_2_0__0__Impl rule__TaskDefinition__Group_2_0__1 )
            // InternalTaskDefinition.g:683:2: rule__TaskDefinition__Group_2_0__0__Impl rule__TaskDefinition__Group_2_0__1
            {
            pushFollow(FOLLOW_4);
            rule__TaskDefinition__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2_0__0"


    // $ANTLR start "rule__TaskDefinition__Group_2_0__0__Impl"
    // InternalTaskDefinition.g:690:1: rule__TaskDefinition__Group_2_0__0__Impl : ( 'parameters' ) ;
    public final void rule__TaskDefinition__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:694:1: ( ( 'parameters' ) )
            // InternalTaskDefinition.g:695:1: ( 'parameters' )
            {
            // InternalTaskDefinition.g:695:1: ( 'parameters' )
            // InternalTaskDefinition.g:696:2: 'parameters'
            {
             before(grammarAccess.getTaskDefinitionAccess().getParametersKeyword_2_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getParametersKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2_0__0__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_2_0__1"
    // InternalTaskDefinition.g:705:1: rule__TaskDefinition__Group_2_0__1 : rule__TaskDefinition__Group_2_0__1__Impl rule__TaskDefinition__Group_2_0__2 ;
    public final void rule__TaskDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:709:1: ( rule__TaskDefinition__Group_2_0__1__Impl rule__TaskDefinition__Group_2_0__2 )
            // InternalTaskDefinition.g:710:2: rule__TaskDefinition__Group_2_0__1__Impl rule__TaskDefinition__Group_2_0__2
            {
            pushFollow(FOLLOW_9);
            rule__TaskDefinition__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2_0__1"


    // $ANTLR start "rule__TaskDefinition__Group_2_0__1__Impl"
    // InternalTaskDefinition.g:717:1: rule__TaskDefinition__Group_2_0__1__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:721:1: ( ( '{' ) )
            // InternalTaskDefinition.g:722:1: ( '{' )
            {
            // InternalTaskDefinition.g:722:1: ( '{' )
            // InternalTaskDefinition.g:723:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2_0__1__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_2_0__2"
    // InternalTaskDefinition.g:732:1: rule__TaskDefinition__Group_2_0__2 : rule__TaskDefinition__Group_2_0__2__Impl rule__TaskDefinition__Group_2_0__3 ;
    public final void rule__TaskDefinition__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:736:1: ( rule__TaskDefinition__Group_2_0__2__Impl rule__TaskDefinition__Group_2_0__3 )
            // InternalTaskDefinition.g:737:2: rule__TaskDefinition__Group_2_0__2__Impl rule__TaskDefinition__Group_2_0__3
            {
            pushFollow(FOLLOW_9);
            rule__TaskDefinition__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2_0__2"


    // $ANTLR start "rule__TaskDefinition__Group_2_0__2__Impl"
    // InternalTaskDefinition.g:744:1: rule__TaskDefinition__Group_2_0__2__Impl : ( ( rule__TaskDefinition__ParametersAssignment_2_0_2 )* ) ;
    public final void rule__TaskDefinition__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:748:1: ( ( ( rule__TaskDefinition__ParametersAssignment_2_0_2 )* ) )
            // InternalTaskDefinition.g:749:1: ( ( rule__TaskDefinition__ParametersAssignment_2_0_2 )* )
            {
            // InternalTaskDefinition.g:749:1: ( ( rule__TaskDefinition__ParametersAssignment_2_0_2 )* )
            // InternalTaskDefinition.g:750:2: ( rule__TaskDefinition__ParametersAssignment_2_0_2 )*
            {
             before(grammarAccess.getTaskDefinitionAccess().getParametersAssignment_2_0_2()); 
            // InternalTaskDefinition.g:751:2: ( rule__TaskDefinition__ParametersAssignment_2_0_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTaskDefinition.g:751:3: rule__TaskDefinition__ParametersAssignment_2_0_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TaskDefinition__ParametersAssignment_2_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTaskDefinitionAccess().getParametersAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2_0__2__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_2_0__3"
    // InternalTaskDefinition.g:759:1: rule__TaskDefinition__Group_2_0__3 : rule__TaskDefinition__Group_2_0__3__Impl ;
    public final void rule__TaskDefinition__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:763:1: ( rule__TaskDefinition__Group_2_0__3__Impl )
            // InternalTaskDefinition.g:764:2: rule__TaskDefinition__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_2_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2_0__3"


    // $ANTLR start "rule__TaskDefinition__Group_2_0__3__Impl"
    // InternalTaskDefinition.g:770:1: rule__TaskDefinition__Group_2_0__3__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:774:1: ( ( '}' ) )
            // InternalTaskDefinition.g:775:1: ( '}' )
            {
            // InternalTaskDefinition.g:775:1: ( '}' )
            // InternalTaskDefinition.g:776:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_2_0_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_2_0__3__Impl"


    // $ANTLR start "rule__TaskInputDefinition__Group__0"
    // InternalTaskDefinition.g:786:1: rule__TaskInputDefinition__Group__0 : rule__TaskInputDefinition__Group__0__Impl rule__TaskInputDefinition__Group__1 ;
    public final void rule__TaskInputDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:790:1: ( rule__TaskInputDefinition__Group__0__Impl rule__TaskInputDefinition__Group__1 )
            // InternalTaskDefinition.g:791:2: rule__TaskInputDefinition__Group__0__Impl rule__TaskInputDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TaskInputDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskInputDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__Group__0"


    // $ANTLR start "rule__TaskInputDefinition__Group__0__Impl"
    // InternalTaskDefinition.g:798:1: rule__TaskInputDefinition__Group__0__Impl : ( ( rule__TaskInputDefinition__NameAssignment_0 ) ) ;
    public final void rule__TaskInputDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:802:1: ( ( ( rule__TaskInputDefinition__NameAssignment_0 ) ) )
            // InternalTaskDefinition.g:803:1: ( ( rule__TaskInputDefinition__NameAssignment_0 ) )
            {
            // InternalTaskDefinition.g:803:1: ( ( rule__TaskInputDefinition__NameAssignment_0 ) )
            // InternalTaskDefinition.g:804:2: ( rule__TaskInputDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTaskInputDefinitionAccess().getNameAssignment_0()); 
            // InternalTaskDefinition.g:805:2: ( rule__TaskInputDefinition__NameAssignment_0 )
            // InternalTaskDefinition.g:805:3: rule__TaskInputDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TaskInputDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskInputDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__Group__0__Impl"


    // $ANTLR start "rule__TaskInputDefinition__Group__1"
    // InternalTaskDefinition.g:813:1: rule__TaskInputDefinition__Group__1 : rule__TaskInputDefinition__Group__1__Impl rule__TaskInputDefinition__Group__2 ;
    public final void rule__TaskInputDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:817:1: ( rule__TaskInputDefinition__Group__1__Impl rule__TaskInputDefinition__Group__2 )
            // InternalTaskDefinition.g:818:2: rule__TaskInputDefinition__Group__1__Impl rule__TaskInputDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__TaskInputDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskInputDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__Group__1"


    // $ANTLR start "rule__TaskInputDefinition__Group__1__Impl"
    // InternalTaskDefinition.g:825:1: rule__TaskInputDefinition__Group__1__Impl : ( ( rule__TaskInputDefinition__Group_1__0 )? ) ;
    public final void rule__TaskInputDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:829:1: ( ( ( rule__TaskInputDefinition__Group_1__0 )? ) )
            // InternalTaskDefinition.g:830:1: ( ( rule__TaskInputDefinition__Group_1__0 )? )
            {
            // InternalTaskDefinition.g:830:1: ( ( rule__TaskInputDefinition__Group_1__0 )? )
            // InternalTaskDefinition.g:831:2: ( rule__TaskInputDefinition__Group_1__0 )?
            {
             before(grammarAccess.getTaskInputDefinitionAccess().getGroup_1()); 
            // InternalTaskDefinition.g:832:2: ( rule__TaskInputDefinition__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDefinition.g:832:3: rule__TaskInputDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskInputDefinition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskInputDefinitionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__Group__1__Impl"


    // $ANTLR start "rule__TaskInputDefinition__Group__2"
    // InternalTaskDefinition.g:840:1: rule__TaskInputDefinition__Group__2 : rule__TaskInputDefinition__Group__2__Impl ;
    public final void rule__TaskInputDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:844:1: ( rule__TaskInputDefinition__Group__2__Impl )
            // InternalTaskDefinition.g:845:2: rule__TaskInputDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskInputDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__Group__2"


    // $ANTLR start "rule__TaskInputDefinition__Group__2__Impl"
    // InternalTaskDefinition.g:851:1: rule__TaskInputDefinition__Group__2__Impl : ( ';' ) ;
    public final void rule__TaskInputDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:855:1: ( ( ';' ) )
            // InternalTaskDefinition.g:856:1: ( ';' )
            {
            // InternalTaskDefinition.g:856:1: ( ';' )
            // InternalTaskDefinition.g:857:2: ';'
            {
             before(grammarAccess.getTaskInputDefinitionAccess().getSemicolonKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTaskInputDefinitionAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__Group__2__Impl"


    // $ANTLR start "rule__TaskInputDefinition__Group_1__0"
    // InternalTaskDefinition.g:867:1: rule__TaskInputDefinition__Group_1__0 : rule__TaskInputDefinition__Group_1__0__Impl rule__TaskInputDefinition__Group_1__1 ;
    public final void rule__TaskInputDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:871:1: ( rule__TaskInputDefinition__Group_1__0__Impl rule__TaskInputDefinition__Group_1__1 )
            // InternalTaskDefinition.g:872:2: rule__TaskInputDefinition__Group_1__0__Impl rule__TaskInputDefinition__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__TaskInputDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskInputDefinition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__Group_1__0"


    // $ANTLR start "rule__TaskInputDefinition__Group_1__0__Impl"
    // InternalTaskDefinition.g:879:1: rule__TaskInputDefinition__Group_1__0__Impl : ( ':' ) ;
    public final void rule__TaskInputDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:883:1: ( ( ':' ) )
            // InternalTaskDefinition.g:884:1: ( ':' )
            {
            // InternalTaskDefinition.g:884:1: ( ':' )
            // InternalTaskDefinition.g:885:2: ':'
            {
             before(grammarAccess.getTaskInputDefinitionAccess().getColonKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTaskInputDefinitionAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__TaskInputDefinition__Group_1__1"
    // InternalTaskDefinition.g:894:1: rule__TaskInputDefinition__Group_1__1 : rule__TaskInputDefinition__Group_1__1__Impl ;
    public final void rule__TaskInputDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:898:1: ( rule__TaskInputDefinition__Group_1__1__Impl )
            // InternalTaskDefinition.g:899:2: rule__TaskInputDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskInputDefinition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__Group_1__1"


    // $ANTLR start "rule__TaskInputDefinition__Group_1__1__Impl"
    // InternalTaskDefinition.g:905:1: rule__TaskInputDefinition__Group_1__1__Impl : ( ( rule__TaskInputDefinition__DataTypeAssignment_1_1 ) ) ;
    public final void rule__TaskInputDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:909:1: ( ( ( rule__TaskInputDefinition__DataTypeAssignment_1_1 ) ) )
            // InternalTaskDefinition.g:910:1: ( ( rule__TaskInputDefinition__DataTypeAssignment_1_1 ) )
            {
            // InternalTaskDefinition.g:910:1: ( ( rule__TaskInputDefinition__DataTypeAssignment_1_1 ) )
            // InternalTaskDefinition.g:911:2: ( rule__TaskInputDefinition__DataTypeAssignment_1_1 )
            {
             before(grammarAccess.getTaskInputDefinitionAccess().getDataTypeAssignment_1_1()); 
            // InternalTaskDefinition.g:912:2: ( rule__TaskInputDefinition__DataTypeAssignment_1_1 )
            // InternalTaskDefinition.g:912:3: rule__TaskInputDefinition__DataTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskInputDefinition__DataTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskInputDefinitionAccess().getDataTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__TaskOutputDefinition__Group__0"
    // InternalTaskDefinition.g:921:1: rule__TaskOutputDefinition__Group__0 : rule__TaskOutputDefinition__Group__0__Impl rule__TaskOutputDefinition__Group__1 ;
    public final void rule__TaskOutputDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:925:1: ( rule__TaskOutputDefinition__Group__0__Impl rule__TaskOutputDefinition__Group__1 )
            // InternalTaskDefinition.g:926:2: rule__TaskOutputDefinition__Group__0__Impl rule__TaskOutputDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TaskOutputDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskOutputDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__Group__0"


    // $ANTLR start "rule__TaskOutputDefinition__Group__0__Impl"
    // InternalTaskDefinition.g:933:1: rule__TaskOutputDefinition__Group__0__Impl : ( ( rule__TaskOutputDefinition__NameAssignment_0 ) ) ;
    public final void rule__TaskOutputDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:937:1: ( ( ( rule__TaskOutputDefinition__NameAssignment_0 ) ) )
            // InternalTaskDefinition.g:938:1: ( ( rule__TaskOutputDefinition__NameAssignment_0 ) )
            {
            // InternalTaskDefinition.g:938:1: ( ( rule__TaskOutputDefinition__NameAssignment_0 ) )
            // InternalTaskDefinition.g:939:2: ( rule__TaskOutputDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getTaskOutputDefinitionAccess().getNameAssignment_0()); 
            // InternalTaskDefinition.g:940:2: ( rule__TaskOutputDefinition__NameAssignment_0 )
            // InternalTaskDefinition.g:940:3: rule__TaskOutputDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutputDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskOutputDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__Group__0__Impl"


    // $ANTLR start "rule__TaskOutputDefinition__Group__1"
    // InternalTaskDefinition.g:948:1: rule__TaskOutputDefinition__Group__1 : rule__TaskOutputDefinition__Group__1__Impl rule__TaskOutputDefinition__Group__2 ;
    public final void rule__TaskOutputDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:952:1: ( rule__TaskOutputDefinition__Group__1__Impl rule__TaskOutputDefinition__Group__2 )
            // InternalTaskDefinition.g:953:2: rule__TaskOutputDefinition__Group__1__Impl rule__TaskOutputDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__TaskOutputDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskOutputDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__Group__1"


    // $ANTLR start "rule__TaskOutputDefinition__Group__1__Impl"
    // InternalTaskDefinition.g:960:1: rule__TaskOutputDefinition__Group__1__Impl : ( ( rule__TaskOutputDefinition__Group_1__0 )? ) ;
    public final void rule__TaskOutputDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:964:1: ( ( ( rule__TaskOutputDefinition__Group_1__0 )? ) )
            // InternalTaskDefinition.g:965:1: ( ( rule__TaskOutputDefinition__Group_1__0 )? )
            {
            // InternalTaskDefinition.g:965:1: ( ( rule__TaskOutputDefinition__Group_1__0 )? )
            // InternalTaskDefinition.g:966:2: ( rule__TaskOutputDefinition__Group_1__0 )?
            {
             before(grammarAccess.getTaskOutputDefinitionAccess().getGroup_1()); 
            // InternalTaskDefinition.g:967:2: ( rule__TaskOutputDefinition__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTaskDefinition.g:967:3: rule__TaskOutputDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskOutputDefinition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskOutputDefinitionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__Group__1__Impl"


    // $ANTLR start "rule__TaskOutputDefinition__Group__2"
    // InternalTaskDefinition.g:975:1: rule__TaskOutputDefinition__Group__2 : rule__TaskOutputDefinition__Group__2__Impl ;
    public final void rule__TaskOutputDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:979:1: ( rule__TaskOutputDefinition__Group__2__Impl )
            // InternalTaskDefinition.g:980:2: rule__TaskOutputDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutputDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__Group__2"


    // $ANTLR start "rule__TaskOutputDefinition__Group__2__Impl"
    // InternalTaskDefinition.g:986:1: rule__TaskOutputDefinition__Group__2__Impl : ( ';' ) ;
    public final void rule__TaskOutputDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:990:1: ( ( ';' ) )
            // InternalTaskDefinition.g:991:1: ( ';' )
            {
            // InternalTaskDefinition.g:991:1: ( ';' )
            // InternalTaskDefinition.g:992:2: ';'
            {
             before(grammarAccess.getTaskOutputDefinitionAccess().getSemicolonKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTaskOutputDefinitionAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__Group__2__Impl"


    // $ANTLR start "rule__TaskOutputDefinition__Group_1__0"
    // InternalTaskDefinition.g:1002:1: rule__TaskOutputDefinition__Group_1__0 : rule__TaskOutputDefinition__Group_1__0__Impl rule__TaskOutputDefinition__Group_1__1 ;
    public final void rule__TaskOutputDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1006:1: ( rule__TaskOutputDefinition__Group_1__0__Impl rule__TaskOutputDefinition__Group_1__1 )
            // InternalTaskDefinition.g:1007:2: rule__TaskOutputDefinition__Group_1__0__Impl rule__TaskOutputDefinition__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__TaskOutputDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskOutputDefinition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__Group_1__0"


    // $ANTLR start "rule__TaskOutputDefinition__Group_1__0__Impl"
    // InternalTaskDefinition.g:1014:1: rule__TaskOutputDefinition__Group_1__0__Impl : ( ':' ) ;
    public final void rule__TaskOutputDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1018:1: ( ( ':' ) )
            // InternalTaskDefinition.g:1019:1: ( ':' )
            {
            // InternalTaskDefinition.g:1019:1: ( ':' )
            // InternalTaskDefinition.g:1020:2: ':'
            {
             before(grammarAccess.getTaskOutputDefinitionAccess().getColonKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTaskOutputDefinitionAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__TaskOutputDefinition__Group_1__1"
    // InternalTaskDefinition.g:1029:1: rule__TaskOutputDefinition__Group_1__1 : rule__TaskOutputDefinition__Group_1__1__Impl ;
    public final void rule__TaskOutputDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1033:1: ( rule__TaskOutputDefinition__Group_1__1__Impl )
            // InternalTaskDefinition.g:1034:2: rule__TaskOutputDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutputDefinition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__Group_1__1"


    // $ANTLR start "rule__TaskOutputDefinition__Group_1__1__Impl"
    // InternalTaskDefinition.g:1040:1: rule__TaskOutputDefinition__Group_1__1__Impl : ( ( rule__TaskOutputDefinition__DataTypeAssignment_1_1 ) ) ;
    public final void rule__TaskOutputDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1044:1: ( ( ( rule__TaskOutputDefinition__DataTypeAssignment_1_1 ) ) )
            // InternalTaskDefinition.g:1045:1: ( ( rule__TaskOutputDefinition__DataTypeAssignment_1_1 ) )
            {
            // InternalTaskDefinition.g:1045:1: ( ( rule__TaskOutputDefinition__DataTypeAssignment_1_1 ) )
            // InternalTaskDefinition.g:1046:2: ( rule__TaskOutputDefinition__DataTypeAssignment_1_1 )
            {
             before(grammarAccess.getTaskOutputDefinitionAccess().getDataTypeAssignment_1_1()); 
            // InternalTaskDefinition.g:1047:2: ( rule__TaskOutputDefinition__DataTypeAssignment_1_1 )
            // InternalTaskDefinition.g:1047:3: rule__TaskOutputDefinition__DataTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutputDefinition__DataTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskOutputDefinitionAccess().getDataTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalTaskDefinition.g:1056:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1060:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalTaskDefinition.g:1061:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalTaskDefinition.g:1068:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__IsConstAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1072:1: ( ( ( rule__Attribute__IsConstAssignment_0 )? ) )
            // InternalTaskDefinition.g:1073:1: ( ( rule__Attribute__IsConstAssignment_0 )? )
            {
            // InternalTaskDefinition.g:1073:1: ( ( rule__Attribute__IsConstAssignment_0 )? )
            // InternalTaskDefinition.g:1074:2: ( rule__Attribute__IsConstAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getIsConstAssignment_0()); 
            // InternalTaskDefinition.g:1075:2: ( rule__Attribute__IsConstAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTaskDefinition.g:1075:3: rule__Attribute__IsConstAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IsConstAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIsConstAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalTaskDefinition.g:1083:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1087:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalTaskDefinition.g:1088:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalTaskDefinition.g:1095:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1099:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalTaskDefinition.g:1100:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalTaskDefinition.g:1100:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalTaskDefinition.g:1101:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalTaskDefinition.g:1102:2: ( rule__Attribute__NameAssignment_1 )
            // InternalTaskDefinition.g:1102:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalTaskDefinition.g:1110:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1114:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalTaskDefinition.g:1115:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalTaskDefinition.g:1122:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1126:1: ( ( ':' ) )
            // InternalTaskDefinition.g:1127:1: ( ':' )
            {
            // InternalTaskDefinition.g:1127:1: ( ':' )
            // InternalTaskDefinition.g:1128:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalTaskDefinition.g:1137:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1141:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalTaskDefinition.g:1142:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalTaskDefinition.g:1149:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeOfAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1153:1: ( ( ( rule__Attribute__TypeOfAssignment_3 ) ) )
            // InternalTaskDefinition.g:1154:1: ( ( rule__Attribute__TypeOfAssignment_3 ) )
            {
            // InternalTaskDefinition.g:1154:1: ( ( rule__Attribute__TypeOfAssignment_3 ) )
            // InternalTaskDefinition.g:1155:2: ( rule__Attribute__TypeOfAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeOfAssignment_3()); 
            // InternalTaskDefinition.g:1156:2: ( rule__Attribute__TypeOfAssignment_3 )
            // InternalTaskDefinition.g:1156:3: rule__Attribute__TypeOfAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeOfAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeOfAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalTaskDefinition.g:1164:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1168:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalTaskDefinition.g:1169:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalTaskDefinition.g:1176:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__DimensionsAssignment_4 )* ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1180:1: ( ( ( rule__Attribute__DimensionsAssignment_4 )* ) )
            // InternalTaskDefinition.g:1181:1: ( ( rule__Attribute__DimensionsAssignment_4 )* )
            {
            // InternalTaskDefinition.g:1181:1: ( ( rule__Attribute__DimensionsAssignment_4 )* )
            // InternalTaskDefinition.g:1182:2: ( rule__Attribute__DimensionsAssignment_4 )*
            {
             before(grammarAccess.getAttributeAccess().getDimensionsAssignment_4()); 
            // InternalTaskDefinition.g:1183:2: ( rule__Attribute__DimensionsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTaskDefinition.g:1183:3: rule__Attribute__DimensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Attribute__DimensionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getDimensionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalTaskDefinition.g:1191:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1195:1: ( rule__Attribute__Group__5__Impl )
            // InternalTaskDefinition.g:1196:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalTaskDefinition.g:1202:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Alternatives_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1206:1: ( ( ( rule__Attribute__Alternatives_5 ) ) )
            // InternalTaskDefinition.g:1207:1: ( ( rule__Attribute__Alternatives_5 ) )
            {
            // InternalTaskDefinition.g:1207:1: ( ( rule__Attribute__Alternatives_5 ) )
            // InternalTaskDefinition.g:1208:2: ( rule__Attribute__Alternatives_5 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_5()); 
            // InternalTaskDefinition.g:1209:2: ( rule__Attribute__Alternatives_5 )
            // InternalTaskDefinition.g:1209:3: rule__Attribute__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_5_0__0"
    // InternalTaskDefinition.g:1218:1: rule__Attribute__Group_5_0__0 : rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1 ;
    public final void rule__Attribute__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1222:1: ( rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1 )
            // InternalTaskDefinition.g:1223:2: rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_0__0"


    // $ANTLR start "rule__Attribute__Group_5_0__0__Impl"
    // InternalTaskDefinition.g:1230:1: rule__Attribute__Group_5_0__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1234:1: ( ( '=' ) )
            // InternalTaskDefinition.g:1235:1: ( '=' )
            {
            // InternalTaskDefinition.g:1235:1: ( '=' )
            // InternalTaskDefinition.g:1236:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_0__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_0__1"
    // InternalTaskDefinition.g:1245:1: rule__Attribute__Group_5_0__1 : rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2 ;
    public final void rule__Attribute__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1249:1: ( rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2 )
            // InternalTaskDefinition.g:1250:2: rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_0__1"


    // $ANTLR start "rule__Attribute__Group_5_0__1__Impl"
    // InternalTaskDefinition.g:1257:1: rule__Attribute__Group_5_0__1__Impl : ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) ) ;
    public final void rule__Attribute__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1261:1: ( ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) ) )
            // InternalTaskDefinition.g:1262:1: ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) )
            {
            // InternalTaskDefinition.g:1262:1: ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) )
            // InternalTaskDefinition.g:1263:2: ( rule__Attribute__ValueLiteralAssignment_5_0_1 )
            {
             before(grammarAccess.getAttributeAccess().getValueLiteralAssignment_5_0_1()); 
            // InternalTaskDefinition.g:1264:2: ( rule__Attribute__ValueLiteralAssignment_5_0_1 )
            // InternalTaskDefinition.g:1264:3: rule__Attribute__ValueLiteralAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ValueLiteralAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueLiteralAssignment_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_0__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_0__2"
    // InternalTaskDefinition.g:1272:1: rule__Attribute__Group_5_0__2 : rule__Attribute__Group_5_0__2__Impl ;
    public final void rule__Attribute__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1276:1: ( rule__Attribute__Group_5_0__2__Impl )
            // InternalTaskDefinition.g:1277:2: rule__Attribute__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_0__2"


    // $ANTLR start "rule__Attribute__Group_5_0__2__Impl"
    // InternalTaskDefinition.g:1283:1: rule__Attribute__Group_5_0__2__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1287:1: ( ( ';' ) )
            // InternalTaskDefinition.g:1288:1: ( ';' )
            {
            // InternalTaskDefinition.g:1288:1: ( ';' )
            // InternalTaskDefinition.g:1289:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_0_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_0__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_0__0"
    // InternalTaskDefinition.g:1299:1: rule__Attribute__Group_5_2_0__0 : rule__Attribute__Group_5_2_0__0__Impl rule__Attribute__Group_5_2_0__1 ;
    public final void rule__Attribute__Group_5_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1303:1: ( rule__Attribute__Group_5_2_0__0__Impl rule__Attribute__Group_5_2_0__1 )
            // InternalTaskDefinition.g:1304:2: rule__Attribute__Group_5_2_0__0__Impl rule__Attribute__Group_5_2_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group_5_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0__0"


    // $ANTLR start "rule__Attribute__Group_5_2_0__0__Impl"
    // InternalTaskDefinition.g:1311:1: rule__Attribute__Group_5_2_0__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1315:1: ( ( '{' ) )
            // InternalTaskDefinition.g:1316:1: ( '{' )
            {
            // InternalTaskDefinition.g:1316:1: ( '{' )
            // InternalTaskDefinition.g:1317:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_0__1"
    // InternalTaskDefinition.g:1326:1: rule__Attribute__Group_5_2_0__1 : rule__Attribute__Group_5_2_0__1__Impl ;
    public final void rule__Attribute__Group_5_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1330:1: ( rule__Attribute__Group_5_2_0__1__Impl )
            // InternalTaskDefinition.g:1331:2: rule__Attribute__Group_5_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0__1"


    // $ANTLR start "rule__Attribute__Group_5_2_0__1__Impl"
    // InternalTaskDefinition.g:1337:1: rule__Attribute__Group_5_2_0__1__Impl : ( ( rule__Attribute__Group_5_2_0_1__0 )? ) ;
    public final void rule__Attribute__Group_5_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1341:1: ( ( ( rule__Attribute__Group_5_2_0_1__0 )? ) )
            // InternalTaskDefinition.g:1342:1: ( ( rule__Attribute__Group_5_2_0_1__0 )? )
            {
            // InternalTaskDefinition.g:1342:1: ( ( rule__Attribute__Group_5_2_0_1__0 )? )
            // InternalTaskDefinition.g:1343:2: ( rule__Attribute__Group_5_2_0_1__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2_0_1()); 
            // InternalTaskDefinition.g:1344:2: ( rule__Attribute__Group_5_2_0_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTaskDefinition.g:1344:3: rule__Attribute__Group_5_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_2_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_0_1__0"
    // InternalTaskDefinition.g:1353:1: rule__Attribute__Group_5_2_0_1__0 : rule__Attribute__Group_5_2_0_1__0__Impl rule__Attribute__Group_5_2_0_1__1 ;
    public final void rule__Attribute__Group_5_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1357:1: ( rule__Attribute__Group_5_2_0_1__0__Impl rule__Attribute__Group_5_2_0_1__1 )
            // InternalTaskDefinition.g:1358:2: rule__Attribute__Group_5_2_0_1__0__Impl rule__Attribute__Group_5_2_0_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group_5_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0_1__0"


    // $ANTLR start "rule__Attribute__Group_5_2_0_1__0__Impl"
    // InternalTaskDefinition.g:1365:1: rule__Attribute__Group_5_2_0_1__0__Impl : ( 'value' ) ;
    public final void rule__Attribute__Group_5_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1369:1: ( ( 'value' ) )
            // InternalTaskDefinition.g:1370:1: ( 'value' )
            {
            // InternalTaskDefinition.g:1370:1: ( 'value' )
            // InternalTaskDefinition.g:1371:2: 'value'
            {
             before(grammarAccess.getAttributeAccess().getValueKeyword_5_2_0_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getValueKeyword_5_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_0_1__1"
    // InternalTaskDefinition.g:1380:1: rule__Attribute__Group_5_2_0_1__1 : rule__Attribute__Group_5_2_0_1__1__Impl rule__Attribute__Group_5_2_0_1__2 ;
    public final void rule__Attribute__Group_5_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1384:1: ( rule__Attribute__Group_5_2_0_1__1__Impl rule__Attribute__Group_5_2_0_1__2 )
            // InternalTaskDefinition.g:1385:2: rule__Attribute__Group_5_2_0_1__1__Impl rule__Attribute__Group_5_2_0_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_5_2_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0_1__1"


    // $ANTLR start "rule__Attribute__Group_5_2_0_1__1__Impl"
    // InternalTaskDefinition.g:1392:1: rule__Attribute__Group_5_2_0_1__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1396:1: ( ( ':' ) )
            // InternalTaskDefinition.g:1397:1: ( ':' )
            {
            // InternalTaskDefinition.g:1397:1: ( ':' )
            // InternalTaskDefinition.g:1398:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_0_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_5_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_0_1__2"
    // InternalTaskDefinition.g:1407:1: rule__Attribute__Group_5_2_0_1__2 : rule__Attribute__Group_5_2_0_1__2__Impl rule__Attribute__Group_5_2_0_1__3 ;
    public final void rule__Attribute__Group_5_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1411:1: ( rule__Attribute__Group_5_2_0_1__2__Impl rule__Attribute__Group_5_2_0_1__3 )
            // InternalTaskDefinition.g:1412:2: rule__Attribute__Group_5_2_0_1__2__Impl rule__Attribute__Group_5_2_0_1__3
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_5_2_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0_1__2"


    // $ANTLR start "rule__Attribute__Group_5_2_0_1__2__Impl"
    // InternalTaskDefinition.g:1419:1: rule__Attribute__Group_5_2_0_1__2__Impl : ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) ) ;
    public final void rule__Attribute__Group_5_2_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1423:1: ( ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) ) )
            // InternalTaskDefinition.g:1424:1: ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) )
            {
            // InternalTaskDefinition.g:1424:1: ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) )
            // InternalTaskDefinition.g:1425:2: ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueLiteralAssignment_5_2_0_1_2()); 
            // InternalTaskDefinition.g:1426:2: ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 )
            // InternalTaskDefinition.g:1426:3: rule__Attribute__ValueLiteralAssignment_5_2_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ValueLiteralAssignment_5_2_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueLiteralAssignment_5_2_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0_1__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_0_1__3"
    // InternalTaskDefinition.g:1434:1: rule__Attribute__Group_5_2_0_1__3 : rule__Attribute__Group_5_2_0_1__3__Impl ;
    public final void rule__Attribute__Group_5_2_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1438:1: ( rule__Attribute__Group_5_2_0_1__3__Impl )
            // InternalTaskDefinition.g:1439:2: rule__Attribute__Group_5_2_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0_1__3"


    // $ANTLR start "rule__Attribute__Group_5_2_0_1__3__Impl"
    // InternalTaskDefinition.g:1445:1: rule__Attribute__Group_5_2_0_1__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1449:1: ( ( ';' ) )
            // InternalTaskDefinition.g:1450:1: ( ';' )
            {
            // InternalTaskDefinition.g:1450:1: ( ';' )
            // InternalTaskDefinition.g:1451:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_0_1_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_0_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_1__0"
    // InternalTaskDefinition.g:1461:1: rule__Attribute__Group_5_2_1__0 : rule__Attribute__Group_5_2_1__0__Impl rule__Attribute__Group_5_2_1__1 ;
    public final void rule__Attribute__Group_5_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1465:1: ( rule__Attribute__Group_5_2_1__0__Impl rule__Attribute__Group_5_2_1__1 )
            // InternalTaskDefinition.g:1466:2: rule__Attribute__Group_5_2_1__0__Impl rule__Attribute__Group_5_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group_5_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_1__0"


    // $ANTLR start "rule__Attribute__Group_5_2_1__0__Impl"
    // InternalTaskDefinition.g:1473:1: rule__Attribute__Group_5_2_1__0__Impl : ( 'max' ) ;
    public final void rule__Attribute__Group_5_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1477:1: ( ( 'max' ) )
            // InternalTaskDefinition.g:1478:1: ( 'max' )
            {
            // InternalTaskDefinition.g:1478:1: ( 'max' )
            // InternalTaskDefinition.g:1479:2: 'max'
            {
             before(grammarAccess.getAttributeAccess().getMaxKeyword_5_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getMaxKeyword_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_1__1"
    // InternalTaskDefinition.g:1488:1: rule__Attribute__Group_5_2_1__1 : rule__Attribute__Group_5_2_1__1__Impl rule__Attribute__Group_5_2_1__2 ;
    public final void rule__Attribute__Group_5_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1492:1: ( rule__Attribute__Group_5_2_1__1__Impl rule__Attribute__Group_5_2_1__2 )
            // InternalTaskDefinition.g:1493:2: rule__Attribute__Group_5_2_1__1__Impl rule__Attribute__Group_5_2_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_5_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_1__1"


    // $ANTLR start "rule__Attribute__Group_5_2_1__1__Impl"
    // InternalTaskDefinition.g:1500:1: rule__Attribute__Group_5_2_1__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1504:1: ( ( ':' ) )
            // InternalTaskDefinition.g:1505:1: ( ':' )
            {
            // InternalTaskDefinition.g:1505:1: ( ':' )
            // InternalTaskDefinition.g:1506:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_5_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_1__2"
    // InternalTaskDefinition.g:1515:1: rule__Attribute__Group_5_2_1__2 : rule__Attribute__Group_5_2_1__2__Impl rule__Attribute__Group_5_2_1__3 ;
    public final void rule__Attribute__Group_5_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1519:1: ( rule__Attribute__Group_5_2_1__2__Impl rule__Attribute__Group_5_2_1__3 )
            // InternalTaskDefinition.g:1520:2: rule__Attribute__Group_5_2_1__2__Impl rule__Attribute__Group_5_2_1__3
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_5_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_1__2"


    // $ANTLR start "rule__Attribute__Group_5_2_1__2__Impl"
    // InternalTaskDefinition.g:1527:1: rule__Attribute__Group_5_2_1__2__Impl : ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) ) ;
    public final void rule__Attribute__Group_5_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1531:1: ( ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) ) )
            // InternalTaskDefinition.g:1532:1: ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) )
            {
            // InternalTaskDefinition.g:1532:1: ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) )
            // InternalTaskDefinition.g:1533:2: ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getMaxValueLiteralAssignment_5_2_1_2()); 
            // InternalTaskDefinition.g:1534:2: ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 )
            // InternalTaskDefinition.g:1534:3: rule__Attribute__MaxValueLiteralAssignment_5_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__MaxValueLiteralAssignment_5_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMaxValueLiteralAssignment_5_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_1__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_1__3"
    // InternalTaskDefinition.g:1542:1: rule__Attribute__Group_5_2_1__3 : rule__Attribute__Group_5_2_1__3__Impl ;
    public final void rule__Attribute__Group_5_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1546:1: ( rule__Attribute__Group_5_2_1__3__Impl )
            // InternalTaskDefinition.g:1547:2: rule__Attribute__Group_5_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_1__3"


    // $ANTLR start "rule__Attribute__Group_5_2_1__3__Impl"
    // InternalTaskDefinition.g:1553:1: rule__Attribute__Group_5_2_1__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1557:1: ( ( ';' ) )
            // InternalTaskDefinition.g:1558:1: ( ';' )
            {
            // InternalTaskDefinition.g:1558:1: ( ';' )
            // InternalTaskDefinition.g:1559:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_1_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_2__0"
    // InternalTaskDefinition.g:1569:1: rule__Attribute__Group_5_2_2__0 : rule__Attribute__Group_5_2_2__0__Impl rule__Attribute__Group_5_2_2__1 ;
    public final void rule__Attribute__Group_5_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1573:1: ( rule__Attribute__Group_5_2_2__0__Impl rule__Attribute__Group_5_2_2__1 )
            // InternalTaskDefinition.g:1574:2: rule__Attribute__Group_5_2_2__0__Impl rule__Attribute__Group_5_2_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group_5_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_2__0"


    // $ANTLR start "rule__Attribute__Group_5_2_2__0__Impl"
    // InternalTaskDefinition.g:1581:1: rule__Attribute__Group_5_2_2__0__Impl : ( 'min' ) ;
    public final void rule__Attribute__Group_5_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1585:1: ( ( 'min' ) )
            // InternalTaskDefinition.g:1586:1: ( 'min' )
            {
            // InternalTaskDefinition.g:1586:1: ( 'min' )
            // InternalTaskDefinition.g:1587:2: 'min'
            {
             before(grammarAccess.getAttributeAccess().getMinKeyword_5_2_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getMinKeyword_5_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_2__1"
    // InternalTaskDefinition.g:1596:1: rule__Attribute__Group_5_2_2__1 : rule__Attribute__Group_5_2_2__1__Impl rule__Attribute__Group_5_2_2__2 ;
    public final void rule__Attribute__Group_5_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1600:1: ( rule__Attribute__Group_5_2_2__1__Impl rule__Attribute__Group_5_2_2__2 )
            // InternalTaskDefinition.g:1601:2: rule__Attribute__Group_5_2_2__1__Impl rule__Attribute__Group_5_2_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_5_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_2__1"


    // $ANTLR start "rule__Attribute__Group_5_2_2__1__Impl"
    // InternalTaskDefinition.g:1608:1: rule__Attribute__Group_5_2_2__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1612:1: ( ( ':' ) )
            // InternalTaskDefinition.g:1613:1: ( ':' )
            {
            // InternalTaskDefinition.g:1613:1: ( ':' )
            // InternalTaskDefinition.g:1614:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_2_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_5_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_2__2"
    // InternalTaskDefinition.g:1623:1: rule__Attribute__Group_5_2_2__2 : rule__Attribute__Group_5_2_2__2__Impl rule__Attribute__Group_5_2_2__3 ;
    public final void rule__Attribute__Group_5_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1627:1: ( rule__Attribute__Group_5_2_2__2__Impl rule__Attribute__Group_5_2_2__3 )
            // InternalTaskDefinition.g:1628:2: rule__Attribute__Group_5_2_2__2__Impl rule__Attribute__Group_5_2_2__3
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_5_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_2__2"


    // $ANTLR start "rule__Attribute__Group_5_2_2__2__Impl"
    // InternalTaskDefinition.g:1635:1: rule__Attribute__Group_5_2_2__2__Impl : ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) ) ;
    public final void rule__Attribute__Group_5_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1639:1: ( ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) ) )
            // InternalTaskDefinition.g:1640:1: ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) )
            {
            // InternalTaskDefinition.g:1640:1: ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) )
            // InternalTaskDefinition.g:1641:2: ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 )
            {
             before(grammarAccess.getAttributeAccess().getMinValueLiteralAssignment_5_2_2_2()); 
            // InternalTaskDefinition.g:1642:2: ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 )
            // InternalTaskDefinition.g:1642:3: rule__Attribute__MinValueLiteralAssignment_5_2_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__MinValueLiteralAssignment_5_2_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMinValueLiteralAssignment_5_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_2__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_2__3"
    // InternalTaskDefinition.g:1650:1: rule__Attribute__Group_5_2_2__3 : rule__Attribute__Group_5_2_2__3__Impl ;
    public final void rule__Attribute__Group_5_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1654:1: ( rule__Attribute__Group_5_2_2__3__Impl )
            // InternalTaskDefinition.g:1655:2: rule__Attribute__Group_5_2_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_2__3"


    // $ANTLR start "rule__Attribute__Group_5_2_2__3__Impl"
    // InternalTaskDefinition.g:1661:1: rule__Attribute__Group_5_2_2__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1665:1: ( ( ';' ) )
            // InternalTaskDefinition.g:1666:1: ( ';' )
            {
            // InternalTaskDefinition.g:1666:1: ( ';' )
            // InternalTaskDefinition.g:1667:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_2_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_2__3__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_3__0"
    // InternalTaskDefinition.g:1677:1: rule__Attribute__Group_5_2_3__0 : rule__Attribute__Group_5_2_3__0__Impl rule__Attribute__Group_5_2_3__1 ;
    public final void rule__Attribute__Group_5_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1681:1: ( rule__Attribute__Group_5_2_3__0__Impl rule__Attribute__Group_5_2_3__1 )
            // InternalTaskDefinition.g:1682:2: rule__Attribute__Group_5_2_3__0__Impl rule__Attribute__Group_5_2_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group_5_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_3__0"


    // $ANTLR start "rule__Attribute__Group_5_2_3__0__Impl"
    // InternalTaskDefinition.g:1689:1: rule__Attribute__Group_5_2_3__0__Impl : ( 'referenceFrame' ) ;
    public final void rule__Attribute__Group_5_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1693:1: ( ( 'referenceFrame' ) )
            // InternalTaskDefinition.g:1694:1: ( 'referenceFrame' )
            {
            // InternalTaskDefinition.g:1694:1: ( 'referenceFrame' )
            // InternalTaskDefinition.g:1695:2: 'referenceFrame'
            {
             before(grammarAccess.getAttributeAccess().getReferenceFrameKeyword_5_2_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getReferenceFrameKeyword_5_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_3__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_3__1"
    // InternalTaskDefinition.g:1704:1: rule__Attribute__Group_5_2_3__1 : rule__Attribute__Group_5_2_3__1__Impl rule__Attribute__Group_5_2_3__2 ;
    public final void rule__Attribute__Group_5_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1708:1: ( rule__Attribute__Group_5_2_3__1__Impl rule__Attribute__Group_5_2_3__2 )
            // InternalTaskDefinition.g:1709:2: rule__Attribute__Group_5_2_3__1__Impl rule__Attribute__Group_5_2_3__2
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group_5_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_3__1"


    // $ANTLR start "rule__Attribute__Group_5_2_3__1__Impl"
    // InternalTaskDefinition.g:1716:1: rule__Attribute__Group_5_2_3__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1720:1: ( ( ':' ) )
            // InternalTaskDefinition.g:1721:1: ( ':' )
            {
            // InternalTaskDefinition.g:1721:1: ( ':' )
            // InternalTaskDefinition.g:1722:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_3_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_5_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_3__2"
    // InternalTaskDefinition.g:1731:1: rule__Attribute__Group_5_2_3__2 : rule__Attribute__Group_5_2_3__2__Impl rule__Attribute__Group_5_2_3__3 ;
    public final void rule__Attribute__Group_5_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1735:1: ( rule__Attribute__Group_5_2_3__2__Impl rule__Attribute__Group_5_2_3__3 )
            // InternalTaskDefinition.g:1736:2: rule__Attribute__Group_5_2_3__2__Impl rule__Attribute__Group_5_2_3__3
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_5_2_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_3__2"


    // $ANTLR start "rule__Attribute__Group_5_2_3__2__Impl"
    // InternalTaskDefinition.g:1743:1: rule__Attribute__Group_5_2_3__2__Impl : ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) ) ;
    public final void rule__Attribute__Group_5_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1747:1: ( ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) ) )
            // InternalTaskDefinition.g:1748:1: ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) )
            {
            // InternalTaskDefinition.g:1748:1: ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) )
            // InternalTaskDefinition.g:1749:2: ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 )
            {
             before(grammarAccess.getAttributeAccess().getReferenceFrameAssignment_5_2_3_2()); 
            // InternalTaskDefinition.g:1750:2: ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 )
            // InternalTaskDefinition.g:1750:3: rule__Attribute__ReferenceFrameAssignment_5_2_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ReferenceFrameAssignment_5_2_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getReferenceFrameAssignment_5_2_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_3__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_3__3"
    // InternalTaskDefinition.g:1758:1: rule__Attribute__Group_5_2_3__3 : rule__Attribute__Group_5_2_3__3__Impl ;
    public final void rule__Attribute__Group_5_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1762:1: ( rule__Attribute__Group_5_2_3__3__Impl )
            // InternalTaskDefinition.g:1763:2: rule__Attribute__Group_5_2_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_3__3"


    // $ANTLR start "rule__Attribute__Group_5_2_3__3__Impl"
    // InternalTaskDefinition.g:1769:1: rule__Attribute__Group_5_2_3__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1773:1: ( ( ';' ) )
            // InternalTaskDefinition.g:1774:1: ( ';' )
            {
            // InternalTaskDefinition.g:1774:1: ( ';' )
            // InternalTaskDefinition.g:1775:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_3_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_3__3__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_4__0"
    // InternalTaskDefinition.g:1785:1: rule__Attribute__Group_5_2_4__0 : rule__Attribute__Group_5_2_4__0__Impl rule__Attribute__Group_5_2_4__1 ;
    public final void rule__Attribute__Group_5_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1789:1: ( rule__Attribute__Group_5_2_4__0__Impl rule__Attribute__Group_5_2_4__1 )
            // InternalTaskDefinition.g:1790:2: rule__Attribute__Group_5_2_4__0__Impl rule__Attribute__Group_5_2_4__1
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group_5_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4__0"


    // $ANTLR start "rule__Attribute__Group_5_2_4__0__Impl"
    // InternalTaskDefinition.g:1797:1: rule__Attribute__Group_5_2_4__0__Impl : ( ( rule__Attribute__Group_5_2_4_0__0 )? ) ;
    public final void rule__Attribute__Group_5_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1801:1: ( ( ( rule__Attribute__Group_5_2_4_0__0 )? ) )
            // InternalTaskDefinition.g:1802:1: ( ( rule__Attribute__Group_5_2_4_0__0 )? )
            {
            // InternalTaskDefinition.g:1802:1: ( ( rule__Attribute__Group_5_2_4_0__0 )? )
            // InternalTaskDefinition.g:1803:2: ( rule__Attribute__Group_5_2_4_0__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2_4_0()); 
            // InternalTaskDefinition.g:1804:2: ( rule__Attribute__Group_5_2_4_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTaskDefinition.g:1804:3: rule__Attribute__Group_5_2_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_2_4_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_4__1"
    // InternalTaskDefinition.g:1812:1: rule__Attribute__Group_5_2_4__1 : rule__Attribute__Group_5_2_4__1__Impl rule__Attribute__Group_5_2_4__2 ;
    public final void rule__Attribute__Group_5_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1816:1: ( rule__Attribute__Group_5_2_4__1__Impl rule__Attribute__Group_5_2_4__2 )
            // InternalTaskDefinition.g:1817:2: rule__Attribute__Group_5_2_4__1__Impl rule__Attribute__Group_5_2_4__2
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_5_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4__1"


    // $ANTLR start "rule__Attribute__Group_5_2_4__1__Impl"
    // InternalTaskDefinition.g:1824:1: rule__Attribute__Group_5_2_4__1__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1828:1: ( ( '}' ) )
            // InternalTaskDefinition.g:1829:1: ( '}' )
            {
            // InternalTaskDefinition.g:1829:1: ( '}' )
            // InternalTaskDefinition.g:1830:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_4__2"
    // InternalTaskDefinition.g:1839:1: rule__Attribute__Group_5_2_4__2 : rule__Attribute__Group_5_2_4__2__Impl ;
    public final void rule__Attribute__Group_5_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1843:1: ( rule__Attribute__Group_5_2_4__2__Impl )
            // InternalTaskDefinition.g:1844:2: rule__Attribute__Group_5_2_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4__2"


    // $ANTLR start "rule__Attribute__Group_5_2_4__2__Impl"
    // InternalTaskDefinition.g:1850:1: rule__Attribute__Group_5_2_4__2__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1854:1: ( ( ';' ) )
            // InternalTaskDefinition.g:1855:1: ( ';' )
            {
            // InternalTaskDefinition.g:1855:1: ( ';' )
            // InternalTaskDefinition.g:1856:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_4_0__0"
    // InternalTaskDefinition.g:1866:1: rule__Attribute__Group_5_2_4_0__0 : rule__Attribute__Group_5_2_4_0__0__Impl rule__Attribute__Group_5_2_4_0__1 ;
    public final void rule__Attribute__Group_5_2_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1870:1: ( rule__Attribute__Group_5_2_4_0__0__Impl rule__Attribute__Group_5_2_4_0__1 )
            // InternalTaskDefinition.g:1871:2: rule__Attribute__Group_5_2_4_0__0__Impl rule__Attribute__Group_5_2_4_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group_5_2_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4_0__0"


    // $ANTLR start "rule__Attribute__Group_5_2_4_0__0__Impl"
    // InternalTaskDefinition.g:1878:1: rule__Attribute__Group_5_2_4_0__0__Impl : ( 'unit' ) ;
    public final void rule__Attribute__Group_5_2_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1882:1: ( ( 'unit' ) )
            // InternalTaskDefinition.g:1883:1: ( 'unit' )
            {
            // InternalTaskDefinition.g:1883:1: ( 'unit' )
            // InternalTaskDefinition.g:1884:2: 'unit'
            {
             before(grammarAccess.getAttributeAccess().getUnitKeyword_5_2_4_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getUnitKeyword_5_2_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4_0__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_4_0__1"
    // InternalTaskDefinition.g:1893:1: rule__Attribute__Group_5_2_4_0__1 : rule__Attribute__Group_5_2_4_0__1__Impl rule__Attribute__Group_5_2_4_0__2 ;
    public final void rule__Attribute__Group_5_2_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1897:1: ( rule__Attribute__Group_5_2_4_0__1__Impl rule__Attribute__Group_5_2_4_0__2 )
            // InternalTaskDefinition.g:1898:2: rule__Attribute__Group_5_2_4_0__1__Impl rule__Attribute__Group_5_2_4_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group_5_2_4_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_4_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4_0__1"


    // $ANTLR start "rule__Attribute__Group_5_2_4_0__1__Impl"
    // InternalTaskDefinition.g:1905:1: rule__Attribute__Group_5_2_4_0__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1909:1: ( ( ':' ) )
            // InternalTaskDefinition.g:1910:1: ( ':' )
            {
            // InternalTaskDefinition.g:1910:1: ( ':' )
            // InternalTaskDefinition.g:1911:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_4_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_5_2_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4_0__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_4_0__2"
    // InternalTaskDefinition.g:1920:1: rule__Attribute__Group_5_2_4_0__2 : rule__Attribute__Group_5_2_4_0__2__Impl rule__Attribute__Group_5_2_4_0__3 ;
    public final void rule__Attribute__Group_5_2_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1924:1: ( rule__Attribute__Group_5_2_4_0__2__Impl rule__Attribute__Group_5_2_4_0__3 )
            // InternalTaskDefinition.g:1925:2: rule__Attribute__Group_5_2_4_0__2__Impl rule__Attribute__Group_5_2_4_0__3
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_5_2_4_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_4_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4_0__2"


    // $ANTLR start "rule__Attribute__Group_5_2_4_0__2__Impl"
    // InternalTaskDefinition.g:1932:1: rule__Attribute__Group_5_2_4_0__2__Impl : ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) ) ;
    public final void rule__Attribute__Group_5_2_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1936:1: ( ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) ) )
            // InternalTaskDefinition.g:1937:1: ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) )
            {
            // InternalTaskDefinition.g:1937:1: ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) )
            // InternalTaskDefinition.g:1938:2: ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeUnitAssignment_5_2_4_0_2()); 
            // InternalTaskDefinition.g:1939:2: ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 )
            // InternalTaskDefinition.g:1939:3: rule__Attribute__TypeUnitAssignment_5_2_4_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeUnitAssignment_5_2_4_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeUnitAssignment_5_2_4_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4_0__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2_4_0__3"
    // InternalTaskDefinition.g:1947:1: rule__Attribute__Group_5_2_4_0__3 : rule__Attribute__Group_5_2_4_0__3__Impl ;
    public final void rule__Attribute__Group_5_2_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1951:1: ( rule__Attribute__Group_5_2_4_0__3__Impl )
            // InternalTaskDefinition.g:1952:2: rule__Attribute__Group_5_2_4_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2_4_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4_0__3"


    // $ANTLR start "rule__Attribute__Group_5_2_4_0__3__Impl"
    // InternalTaskDefinition.g:1958:1: rule__Attribute__Group_5_2_4_0__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1962:1: ( ( ';' ) )
            // InternalTaskDefinition.g:1963:1: ( ';' )
            {
            // InternalTaskDefinition.g:1963:1: ( ';' )
            // InternalTaskDefinition.g:1964:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_0_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2_4_0__3__Impl"


    // $ANTLR start "rule__ArrayDimension__Group__0"
    // InternalTaskDefinition.g:1974:1: rule__ArrayDimension__Group__0 : rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1 ;
    public final void rule__ArrayDimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1978:1: ( rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1 )
            // InternalTaskDefinition.g:1979:2: rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ArrayDimension__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__0"


    // $ANTLR start "rule__ArrayDimension__Group__0__Impl"
    // InternalTaskDefinition.g:1986:1: rule__ArrayDimension__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayDimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1990:1: ( ( '[' ) )
            // InternalTaskDefinition.g:1991:1: ( '[' )
            {
            // InternalTaskDefinition.g:1991:1: ( '[' )
            // InternalTaskDefinition.g:1992:2: '['
            {
             before(grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__0__Impl"


    // $ANTLR start "rule__ArrayDimension__Group__1"
    // InternalTaskDefinition.g:2001:1: rule__ArrayDimension__Group__1 : rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2 ;
    public final void rule__ArrayDimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2005:1: ( rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2 )
            // InternalTaskDefinition.g:2006:2: rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ArrayDimension__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__1"


    // $ANTLR start "rule__ArrayDimension__Group__1__Impl"
    // InternalTaskDefinition.g:2013:1: rule__ArrayDimension__Group__1__Impl : ( ( rule__ArrayDimension__SizeAssignment_1 ) ) ;
    public final void rule__ArrayDimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2017:1: ( ( ( rule__ArrayDimension__SizeAssignment_1 ) ) )
            // InternalTaskDefinition.g:2018:1: ( ( rule__ArrayDimension__SizeAssignment_1 ) )
            {
            // InternalTaskDefinition.g:2018:1: ( ( rule__ArrayDimension__SizeAssignment_1 ) )
            // InternalTaskDefinition.g:2021:2: ( rule__ArrayDimension__SizeAssignment_1 )
            {
             before(grammarAccess.getArrayDimensionAccess().getSizeAssignment_1()); 
            // InternalTaskDefinition.g:2020:2: ( rule__ArrayDimension__SizeAssignment_1 )
            // InternalTaskDefinition.g:2020:3: rule__ArrayDimension__SizeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayDimension__SizeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayDimensionAccess().getSizeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__1__Impl"


    // $ANTLR start "rule__ArrayDimension__Group__2"
    // InternalTaskDefinition.g:2028:1: rule__ArrayDimension__Group__2 : rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3 ;
    public final void rule__ArrayDimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2032:1: ( rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3 )
            // InternalTaskDefinition.g:2033:2: rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ArrayDimension__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__2"


    // $ANTLR start "rule__ArrayDimension__Group__2__Impl"
    // InternalTaskDefinition.g:2040:1: rule__ArrayDimension__Group__2__Impl : ( ( rule__ArrayDimension__Group_2__0 )? ) ;
    public final void rule__ArrayDimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2044:1: ( ( ( rule__ArrayDimension__Group_2__0 )? ) )
            // InternalTaskDefinition.g:2045:1: ( ( rule__ArrayDimension__Group_2__0 )? )
            {
            // InternalTaskDefinition.g:2045:1: ( ( rule__ArrayDimension__Group_2__0 )? )
            // InternalTaskDefinition.g:2046:2: ( rule__ArrayDimension__Group_2__0 )?
            {
             before(grammarAccess.getArrayDimensionAccess().getGroup_2()); 
            // InternalTaskDefinition.g:2047:2: ( rule__ArrayDimension__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTaskDefinition.g:2047:3: rule__ArrayDimension__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayDimension__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayDimensionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__2__Impl"


    // $ANTLR start "rule__ArrayDimension__Group__3"
    // InternalTaskDefinition.g:2055:1: rule__ArrayDimension__Group__3 : rule__ArrayDimension__Group__3__Impl ;
    public final void rule__ArrayDimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2059:1: ( rule__ArrayDimension__Group__3__Impl )
            // InternalTaskDefinition.g:2060:2: rule__ArrayDimension__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__3"


    // $ANTLR start "rule__ArrayDimension__Group__3__Impl"
    // InternalTaskDefinition.g:2066:1: rule__ArrayDimension__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayDimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2070:1: ( ( ']' ) )
            // InternalTaskDefinition.g:2071:1: ( ']' )
            {
            // InternalTaskDefinition.g:2071:1: ( ']' )
            // InternalTaskDefinition.g:2072:2: ']'
            {
             before(grammarAccess.getArrayDimensionAccess().getRightSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArrayDimensionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__3__Impl"


    // $ANTLR start "rule__ArrayDimension__Group_2__0"
    // InternalTaskDefinition.g:2082:1: rule__ArrayDimension__Group_2__0 : rule__ArrayDimension__Group_2__0__Impl rule__ArrayDimension__Group_2__1 ;
    public final void rule__ArrayDimension__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2086:1: ( rule__ArrayDimension__Group_2__0__Impl rule__ArrayDimension__Group_2__1 )
            // InternalTaskDefinition.g:2087:2: rule__ArrayDimension__Group_2__0__Impl rule__ArrayDimension__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__ArrayDimension__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group_2__0"


    // $ANTLR start "rule__ArrayDimension__Group_2__0__Impl"
    // InternalTaskDefinition.g:2094:1: rule__ArrayDimension__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayDimension__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2098:1: ( ( ',' ) )
            // InternalTaskDefinition.g:2099:1: ( ',' )
            {
            // InternalTaskDefinition.g:2099:1: ( ',' )
            // InternalTaskDefinition.g:2100:2: ','
            {
             before(grammarAccess.getArrayDimensionAccess().getCommaKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArrayDimensionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayDimension__Group_2__1"
    // InternalTaskDefinition.g:2109:1: rule__ArrayDimension__Group_2__1 : rule__ArrayDimension__Group_2__1__Impl rule__ArrayDimension__Group_2__2 ;
    public final void rule__ArrayDimension__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2113:1: ( rule__ArrayDimension__Group_2__1__Impl rule__ArrayDimension__Group_2__2 )
            // InternalTaskDefinition.g:2114:2: rule__ArrayDimension__Group_2__1__Impl rule__ArrayDimension__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__ArrayDimension__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group_2__1"


    // $ANTLR start "rule__ArrayDimension__Group_2__1__Impl"
    // InternalTaskDefinition.g:2121:1: rule__ArrayDimension__Group_2__1__Impl : ( 'name' ) ;
    public final void rule__ArrayDimension__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2125:1: ( ( 'name' ) )
            // InternalTaskDefinition.g:2126:1: ( 'name' )
            {
            // InternalTaskDefinition.g:2126:1: ( 'name' )
            // InternalTaskDefinition.g:2127:2: 'name'
            {
             before(grammarAccess.getArrayDimensionAccess().getNameKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getArrayDimensionAccess().getNameKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group_2__1__Impl"


    // $ANTLR start "rule__ArrayDimension__Group_2__2"
    // InternalTaskDefinition.g:2136:1: rule__ArrayDimension__Group_2__2 : rule__ArrayDimension__Group_2__2__Impl rule__ArrayDimension__Group_2__3 ;
    public final void rule__ArrayDimension__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2140:1: ( rule__ArrayDimension__Group_2__2__Impl rule__ArrayDimension__Group_2__3 )
            // InternalTaskDefinition.g:2141:2: rule__ArrayDimension__Group_2__2__Impl rule__ArrayDimension__Group_2__3
            {
            pushFollow(FOLLOW_3);
            rule__ArrayDimension__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group_2__2"


    // $ANTLR start "rule__ArrayDimension__Group_2__2__Impl"
    // InternalTaskDefinition.g:2148:1: rule__ArrayDimension__Group_2__2__Impl : ( '=' ) ;
    public final void rule__ArrayDimension__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2152:1: ( ( '=' ) )
            // InternalTaskDefinition.g:2153:1: ( '=' )
            {
            // InternalTaskDefinition.g:2153:1: ( '=' )
            // InternalTaskDefinition.g:2154:2: '='
            {
             before(grammarAccess.getArrayDimensionAccess().getEqualsSignKeyword_2_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArrayDimensionAccess().getEqualsSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group_2__2__Impl"


    // $ANTLR start "rule__ArrayDimension__Group_2__3"
    // InternalTaskDefinition.g:2163:1: rule__ArrayDimension__Group_2__3 : rule__ArrayDimension__Group_2__3__Impl ;
    public final void rule__ArrayDimension__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2167:1: ( rule__ArrayDimension__Group_2__3__Impl )
            // InternalTaskDefinition.g:2168:2: rule__ArrayDimension__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group_2__3"


    // $ANTLR start "rule__ArrayDimension__Group_2__3__Impl"
    // InternalTaskDefinition.g:2174:1: rule__ArrayDimension__Group_2__3__Impl : ( ( rule__ArrayDimension__NameAssignment_2_3 ) ) ;
    public final void rule__ArrayDimension__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2178:1: ( ( ( rule__ArrayDimension__NameAssignment_2_3 ) ) )
            // InternalTaskDefinition.g:2179:1: ( ( rule__ArrayDimension__NameAssignment_2_3 ) )
            {
            // InternalTaskDefinition.g:2179:1: ( ( rule__ArrayDimension__NameAssignment_2_3 ) )
            // InternalTaskDefinition.g:2180:2: ( rule__ArrayDimension__NameAssignment_2_3 )
            {
             before(grammarAccess.getArrayDimensionAccess().getNameAssignment_2_3()); 
            // InternalTaskDefinition.g:2181:2: ( rule__ArrayDimension__NameAssignment_2_3 )
            // InternalTaskDefinition.g:2181:3: rule__ArrayDimension__NameAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__ArrayDimension__NameAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getArrayDimensionAccess().getNameAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group_2__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalTaskDefinition.g:2190:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2194:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTaskDefinition.g:2195:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalTaskDefinition.g:2202:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2206:1: ( ( ( '-' )? ) )
            // InternalTaskDefinition.g:2207:1: ( ( '-' )? )
            {
            // InternalTaskDefinition.g:2207:1: ( ( '-' )? )
            // InternalTaskDefinition.g:2208:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTaskDefinition.g:2209:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTaskDefinition.g:2209:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalTaskDefinition.g:2217:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2221:1: ( rule__EInt__Group__1__Impl )
            // InternalTaskDefinition.g:2222:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalTaskDefinition.g:2228:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2232:1: ( ( RULE_INT ) )
            // InternalTaskDefinition.g:2233:1: ( RULE_INT )
            {
            // InternalTaskDefinition.g:2233:1: ( RULE_INT )
            // InternalTaskDefinition.g:2234:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalTaskDefinition.g:2244:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2248:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalTaskDefinition.g:2249:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalTaskDefinition.g:2256:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2260:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:2261:1: ( RULE_ID )
            {
            // InternalTaskDefinition.g:2261:1: ( RULE_ID )
            // InternalTaskDefinition.g:2262:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalTaskDefinition.g:2271:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2275:1: ( rule__FQN__Group__1__Impl )
            // InternalTaskDefinition.g:2276:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalTaskDefinition.g:2282:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2286:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalTaskDefinition.g:2287:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalTaskDefinition.g:2287:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalTaskDefinition.g:2288:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalTaskDefinition.g:2289:2: ( rule__FQN__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTaskDefinition.g:2289:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalTaskDefinition.g:2298:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2302:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalTaskDefinition.g:2303:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalTaskDefinition.g:2310:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2314:1: ( ( '.' ) )
            // InternalTaskDefinition.g:2315:1: ( '.' )
            {
            // InternalTaskDefinition.g:2315:1: ( '.' )
            // InternalTaskDefinition.g:2316:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalTaskDefinition.g:2325:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2329:1: ( rule__FQN__Group_1__1__Impl )
            // InternalTaskDefinition.g:2330:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalTaskDefinition.g:2336:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2340:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:2341:1: ( RULE_ID )
            {
            // InternalTaskDefinition.g:2341:1: ( RULE_ID )
            // InternalTaskDefinition.g:2342:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__TaskDefinition__UnorderedGroup"
    // InternalTaskDefinition.g:2352:1: rule__TaskDefinition__UnorderedGroup : rule__TaskDefinition__UnorderedGroup__0 {...}?;
    public final void rule__TaskDefinition__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
        	
        try {
            // InternalTaskDefinition.g:2357:1: ( rule__TaskDefinition__UnorderedGroup__0 {...}?)
            // InternalTaskDefinition.g:2358:2: rule__TaskDefinition__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__TaskDefinition__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__UnorderedGroup"


    // $ANTLR start "rule__TaskDefinition__UnorderedGroup__Impl"
    // InternalTaskDefinition.g:2366:1: rule__TaskDefinition__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__TaskDefinition__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TaskDefinition__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__TaskDefinition__Group_2__0 ) ) ) ) ) ;
    public final void rule__TaskDefinition__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTaskDefinition.g:2371:1: ( ( ({...}? => ( ( ( rule__TaskDefinition__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TaskDefinition__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__TaskDefinition__Group_2__0 ) ) ) ) ) )
            // InternalTaskDefinition.g:2372:3: ( ({...}? => ( ( ( rule__TaskDefinition__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TaskDefinition__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__TaskDefinition__Group_2__0 ) ) ) ) )
            {
            // InternalTaskDefinition.g:2372:3: ( ({...}? => ( ( ( rule__TaskDefinition__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TaskDefinition__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__TaskDefinition__Group_2__0 ) ) ) ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1) ) {
                alt18=2;
            }
            else if ( ( LA18_0 == 15 || LA18_0 == 17 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2) ) {
                alt18=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalTaskDefinition.g:2373:3: ({...}? => ( ( ( rule__TaskDefinition__Group_0__0 ) ) ) )
                    {
                    // InternalTaskDefinition.g:2373:3: ({...}? => ( ( ( rule__TaskDefinition__Group_0__0 ) ) ) )
                    // InternalTaskDefinition.g:2374:4: {...}? => ( ( ( rule__TaskDefinition__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__TaskDefinition__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalTaskDefinition.g:2374:108: ( ( ( rule__TaskDefinition__Group_0__0 ) ) )
                    // InternalTaskDefinition.g:2375:5: ( ( rule__TaskDefinition__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTaskDefinition.g:2381:5: ( ( rule__TaskDefinition__Group_0__0 ) )
                    // InternalTaskDefinition.g:2382:6: ( rule__TaskDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getTaskDefinitionAccess().getGroup_0()); 
                    // InternalTaskDefinition.g:2383:6: ( rule__TaskDefinition__Group_0__0 )
                    // InternalTaskDefinition.g:2383:7: rule__TaskDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDefinition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskDefinitionAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:2388:3: ({...}? => ( ( ( rule__TaskDefinition__Group_1__0 ) ) ) )
                    {
                    // InternalTaskDefinition.g:2388:3: ({...}? => ( ( ( rule__TaskDefinition__Group_1__0 ) ) ) )
                    // InternalTaskDefinition.g:2389:4: {...}? => ( ( ( rule__TaskDefinition__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__TaskDefinition__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalTaskDefinition.g:2389:108: ( ( ( rule__TaskDefinition__Group_1__0 ) ) )
                    // InternalTaskDefinition.g:2390:5: ( ( rule__TaskDefinition__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTaskDefinition.g:2396:5: ( ( rule__TaskDefinition__Group_1__0 ) )
                    // InternalTaskDefinition.g:2397:6: ( rule__TaskDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getTaskDefinitionAccess().getGroup_1()); 
                    // InternalTaskDefinition.g:2398:6: ( rule__TaskDefinition__Group_1__0 )
                    // InternalTaskDefinition.g:2398:7: rule__TaskDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDefinition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskDefinitionAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDefinition.g:2403:3: ({...}? => ( ( ( rule__TaskDefinition__Group_2__0 ) ) ) )
                    {
                    // InternalTaskDefinition.g:2403:3: ({...}? => ( ( ( rule__TaskDefinition__Group_2__0 ) ) ) )
                    // InternalTaskDefinition.g:2404:4: {...}? => ( ( ( rule__TaskDefinition__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__TaskDefinition__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalTaskDefinition.g:2404:108: ( ( ( rule__TaskDefinition__Group_2__0 ) ) )
                    // InternalTaskDefinition.g:2405:5: ( ( rule__TaskDefinition__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalTaskDefinition.g:2411:5: ( ( rule__TaskDefinition__Group_2__0 ) )
                    // InternalTaskDefinition.g:2412:6: ( rule__TaskDefinition__Group_2__0 )
                    {
                     before(grammarAccess.getTaskDefinitionAccess().getGroup_2()); 
                    // InternalTaskDefinition.g:2413:6: ( rule__TaskDefinition__Group_2__0 )
                    // InternalTaskDefinition.g:2413:7: rule__TaskDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDefinition__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskDefinitionAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__UnorderedGroup__Impl"


    // $ANTLR start "rule__TaskDefinition__UnorderedGroup__0"
    // InternalTaskDefinition.g:2426:1: rule__TaskDefinition__UnorderedGroup__0 : rule__TaskDefinition__UnorderedGroup__Impl ( rule__TaskDefinition__UnorderedGroup__1 )? ;
    public final void rule__TaskDefinition__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2430:1: ( rule__TaskDefinition__UnorderedGroup__Impl ( rule__TaskDefinition__UnorderedGroup__1 )? )
            // InternalTaskDefinition.g:2431:2: rule__TaskDefinition__UnorderedGroup__Impl ( rule__TaskDefinition__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_26);
            rule__TaskDefinition__UnorderedGroup__Impl();

            state._fsp--;

            // InternalTaskDefinition.g:2432:2: ( rule__TaskDefinition__UnorderedGroup__1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1) ) {
                alt19=1;
            }
            else if ( ( LA19_0 == 15 || LA19_0 == 17 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTaskDefinition.g:2432:2: rule__TaskDefinition__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDefinition__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__UnorderedGroup__0"


    // $ANTLR start "rule__TaskDefinition__UnorderedGroup__1"
    // InternalTaskDefinition.g:2438:1: rule__TaskDefinition__UnorderedGroup__1 : rule__TaskDefinition__UnorderedGroup__Impl ( rule__TaskDefinition__UnorderedGroup__2 )? ;
    public final void rule__TaskDefinition__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2442:1: ( rule__TaskDefinition__UnorderedGroup__Impl ( rule__TaskDefinition__UnorderedGroup__2 )? )
            // InternalTaskDefinition.g:2443:2: rule__TaskDefinition__UnorderedGroup__Impl ( rule__TaskDefinition__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_26);
            rule__TaskDefinition__UnorderedGroup__Impl();

            state._fsp--;

            // InternalTaskDefinition.g:2444:2: ( rule__TaskDefinition__UnorderedGroup__2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 1) ) {
                alt20=1;
            }
            else if ( ( LA20_0 == 15 || LA20_0 == 17 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskDefinitionAccess().getUnorderedGroup(), 2) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTaskDefinition.g:2444:2: rule__TaskDefinition__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDefinition__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__UnorderedGroup__1"


    // $ANTLR start "rule__TaskDefinition__UnorderedGroup__2"
    // InternalTaskDefinition.g:2450:1: rule__TaskDefinition__UnorderedGroup__2 : rule__TaskDefinition__UnorderedGroup__Impl ;
    public final void rule__TaskDefinition__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2454:1: ( rule__TaskDefinition__UnorderedGroup__Impl )
            // InternalTaskDefinition.g:2455:2: rule__TaskDefinition__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__UnorderedGroup__2"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_2"
    // InternalTaskDefinition.g:2462:1: rule__Attribute__UnorderedGroup_5_2 : rule__Attribute__UnorderedGroup_5_2__0 {...}?;
    public final void rule__Attribute__UnorderedGroup_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
        	
        try {
            // InternalTaskDefinition.g:2467:1: ( rule__Attribute__UnorderedGroup_5_2__0 {...}?)
            // InternalTaskDefinition.g:2468:2: rule__Attribute__UnorderedGroup_5_2__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__UnorderedGroup_5_2__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2()) ) {
                throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_2"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_2__Impl"
    // InternalTaskDefinition.g:2476:1: rule__Attribute__UnorderedGroup_5_2__Impl : ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) ) ;
    public final void rule__Attribute__UnorderedGroup_5_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTaskDefinition.g:2481:1: ( ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) ) )
            // InternalTaskDefinition.g:2482:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) )
            {
            // InternalTaskDefinition.g:2482:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) )
            int alt21=5;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt21=2;
            }
            else if ( LA21_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt21=3;
            }
            else if ( LA21_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt21=4;
            }
            else if ( ( LA21_0 == 15 || LA21_0 == 24 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt21=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTaskDefinition.g:2483:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) )
                    {
                    // InternalTaskDefinition.g:2483:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) )
                    // InternalTaskDefinition.g:2484:4: {...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0)");
                    }
                    // InternalTaskDefinition.g:2484:107: ( ( ( rule__Attribute__Group_5_2_0__0 ) ) )
                    // InternalTaskDefinition.g:2485:5: ( ( rule__Attribute__Group_5_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTaskDefinition.g:2491:5: ( ( rule__Attribute__Group_5_2_0__0 ) )
                    // InternalTaskDefinition.g:2492:6: ( rule__Attribute__Group_5_2_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_0()); 
                    // InternalTaskDefinition.g:2493:6: ( rule__Attribute__Group_5_2_0__0 )
                    // InternalTaskDefinition.g:2493:7: rule__Attribute__Group_5_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_5_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:2498:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) )
                    {
                    // InternalTaskDefinition.g:2498:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) )
                    // InternalTaskDefinition.g:2499:4: {...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1)");
                    }
                    // InternalTaskDefinition.g:2499:107: ( ( ( rule__Attribute__Group_5_2_1__0 ) ) )
                    // InternalTaskDefinition.g:2500:5: ( ( rule__Attribute__Group_5_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTaskDefinition.g:2506:5: ( ( rule__Attribute__Group_5_2_1__0 ) )
                    // InternalTaskDefinition.g:2507:6: ( rule__Attribute__Group_5_2_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_1()); 
                    // InternalTaskDefinition.g:2508:6: ( rule__Attribute__Group_5_2_1__0 )
                    // InternalTaskDefinition.g:2508:7: rule__Attribute__Group_5_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_5_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDefinition.g:2513:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) )
                    {
                    // InternalTaskDefinition.g:2513:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) )
                    // InternalTaskDefinition.g:2514:4: {...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2)");
                    }
                    // InternalTaskDefinition.g:2514:107: ( ( ( rule__Attribute__Group_5_2_2__0 ) ) )
                    // InternalTaskDefinition.g:2515:5: ( ( rule__Attribute__Group_5_2_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2);
                    				

                    					selected = true;
                    				
                    // InternalTaskDefinition.g:2521:5: ( ( rule__Attribute__Group_5_2_2__0 ) )
                    // InternalTaskDefinition.g:2522:6: ( rule__Attribute__Group_5_2_2__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_2()); 
                    // InternalTaskDefinition.g:2523:6: ( rule__Attribute__Group_5_2_2__0 )
                    // InternalTaskDefinition.g:2523:7: rule__Attribute__Group_5_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_5_2_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDefinition.g:2528:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) )
                    {
                    // InternalTaskDefinition.g:2528:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) )
                    // InternalTaskDefinition.g:2529:4: {...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3)");
                    }
                    // InternalTaskDefinition.g:2529:107: ( ( ( rule__Attribute__Group_5_2_3__0 ) ) )
                    // InternalTaskDefinition.g:2530:5: ( ( rule__Attribute__Group_5_2_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3);
                    				

                    					selected = true;
                    				
                    // InternalTaskDefinition.g:2536:5: ( ( rule__Attribute__Group_5_2_3__0 ) )
                    // InternalTaskDefinition.g:2537:6: ( rule__Attribute__Group_5_2_3__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_3()); 
                    // InternalTaskDefinition.g:2538:6: ( rule__Attribute__Group_5_2_3__0 )
                    // InternalTaskDefinition.g:2538:7: rule__Attribute__Group_5_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_5_2_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDefinition.g:2543:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) )
                    {
                    // InternalTaskDefinition.g:2543:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) )
                    // InternalTaskDefinition.g:2544:4: {...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4)");
                    }
                    // InternalTaskDefinition.g:2544:107: ( ( ( rule__Attribute__Group_5_2_4__0 ) ) )
                    // InternalTaskDefinition.g:2545:5: ( ( rule__Attribute__Group_5_2_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4);
                    				

                    					selected = true;
                    				
                    // InternalTaskDefinition.g:2551:5: ( ( rule__Attribute__Group_5_2_4__0 ) )
                    // InternalTaskDefinition.g:2552:6: ( rule__Attribute__Group_5_2_4__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_4()); 
                    // InternalTaskDefinition.g:2553:6: ( rule__Attribute__Group_5_2_4__0 )
                    // InternalTaskDefinition.g:2553:7: rule__Attribute__Group_5_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5_2_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_5_2_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_2__Impl"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_2__0"
    // InternalTaskDefinition.g:2566:1: rule__Attribute__UnorderedGroup_5_2__0 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__1 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2570:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__1 )? )
            // InternalTaskDefinition.g:2571:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__1 )?
            {
            pushFollow(FOLLOW_27);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalTaskDefinition.g:2572:2: ( rule__Attribute__UnorderedGroup_5_2__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt22=1;
            }
            else if ( LA22_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt22=1;
            }
            else if ( LA22_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt22=1;
            }
            else if ( (LA22_0==15) ) {
                int LA22_6 = input.LA(2);

                if ( LA22_6 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalTaskDefinition.g:2572:2: rule__Attribute__UnorderedGroup_5_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__UnorderedGroup_5_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_2__0"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_2__1"
    // InternalTaskDefinition.g:2578:1: rule__Attribute__UnorderedGroup_5_2__1 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__2 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2582:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__2 )? )
            // InternalTaskDefinition.g:2583:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__2 )?
            {
            pushFollow(FOLLOW_27);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalTaskDefinition.g:2584:2: ( rule__Attribute__UnorderedGroup_5_2__2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt23=1;
            }
            else if ( LA23_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt23=1;
            }
            else if ( LA23_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt23=1;
            }
            else if ( (LA23_0==15) ) {
                int LA23_6 = input.LA(2);

                if ( LA23_6 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalTaskDefinition.g:2584:2: rule__Attribute__UnorderedGroup_5_2__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__UnorderedGroup_5_2__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_2__1"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_2__2"
    // InternalTaskDefinition.g:2590:1: rule__Attribute__UnorderedGroup_5_2__2 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__3 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2594:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__3 )? )
            // InternalTaskDefinition.g:2595:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__3 )?
            {
            pushFollow(FOLLOW_27);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalTaskDefinition.g:2596:2: ( rule__Attribute__UnorderedGroup_5_2__3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt24=1;
            }
            else if ( LA24_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt24=1;
            }
            else if ( (LA24_0==15) ) {
                int LA24_6 = input.LA(2);

                if ( LA24_6 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalTaskDefinition.g:2596:2: rule__Attribute__UnorderedGroup_5_2__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__UnorderedGroup_5_2__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_2__2"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_2__3"
    // InternalTaskDefinition.g:2602:1: rule__Attribute__UnorderedGroup_5_2__3 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__4 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2606:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__4 )? )
            // InternalTaskDefinition.g:2607:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__4 )?
            {
            pushFollow(FOLLOW_27);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalTaskDefinition.g:2608:2: ( rule__Attribute__UnorderedGroup_5_2__4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt25=1;
            }
            else if ( LA25_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt25=1;
            }
            else if ( LA25_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt25=1;
            }
            else if ( (LA25_0==15) ) {
                int LA25_6 = input.LA(2);

                if ( LA25_6 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalTaskDefinition.g:2608:2: rule__Attribute__UnorderedGroup_5_2__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__UnorderedGroup_5_2__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_2__3"


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_2__4"
    // InternalTaskDefinition.g:2614:1: rule__Attribute__UnorderedGroup_5_2__4 : rule__Attribute__UnorderedGroup_5_2__Impl ;
    public final void rule__Attribute__UnorderedGroup_5_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2618:1: ( rule__Attribute__UnorderedGroup_5_2__Impl )
            // InternalTaskDefinition.g:2619:2: rule__Attribute__UnorderedGroup_5_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_5_2__4"


    // $ANTLR start "rule__TaskDefinition__NameAssignment_0_1"
    // InternalTaskDefinition.g:2626:1: rule__TaskDefinition__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__TaskDefinition__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2630:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:2631:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:2631:2: ( ruleEString )
            // InternalTaskDefinition.g:2632:3: ruleEString
            {
             before(grammarAccess.getTaskDefinitionAccess().getNameEStringParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionAccess().getNameEStringParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__NameAssignment_0_1"


    // $ANTLR start "rule__TaskDefinition__InputsAssignment_0_3_2"
    // InternalTaskDefinition.g:2641:1: rule__TaskDefinition__InputsAssignment_0_3_2 : ( ruleTaskInputDefinition ) ;
    public final void rule__TaskDefinition__InputsAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2645:1: ( ( ruleTaskInputDefinition ) )
            // InternalTaskDefinition.g:2646:2: ( ruleTaskInputDefinition )
            {
            // InternalTaskDefinition.g:2646:2: ( ruleTaskInputDefinition )
            // InternalTaskDefinition.g:2647:3: ruleTaskInputDefinition
            {
             before(grammarAccess.getTaskDefinitionAccess().getInputsTaskInputDefinitionParserRuleCall_0_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskInputDefinition();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionAccess().getInputsTaskInputDefinitionParserRuleCall_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__InputsAssignment_0_3_2"


    // $ANTLR start "rule__TaskDefinition__OutputsAssignment_1_2"
    // InternalTaskDefinition.g:2656:1: rule__TaskDefinition__OutputsAssignment_1_2 : ( ruleTaskOutputDefinition ) ;
    public final void rule__TaskDefinition__OutputsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2660:1: ( ( ruleTaskOutputDefinition ) )
            // InternalTaskDefinition.g:2661:2: ( ruleTaskOutputDefinition )
            {
            // InternalTaskDefinition.g:2661:2: ( ruleTaskOutputDefinition )
            // InternalTaskDefinition.g:2662:3: ruleTaskOutputDefinition
            {
             before(grammarAccess.getTaskDefinitionAccess().getOutputsTaskOutputDefinitionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskOutputDefinition();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionAccess().getOutputsTaskOutputDefinitionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__OutputsAssignment_1_2"


    // $ANTLR start "rule__TaskDefinition__ParametersAssignment_2_0_2"
    // InternalTaskDefinition.g:2671:1: rule__TaskDefinition__ParametersAssignment_2_0_2 : ( ruleAttribute ) ;
    public final void rule__TaskDefinition__ParametersAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2675:1: ( ( ruleAttribute ) )
            // InternalTaskDefinition.g:2676:2: ( ruleAttribute )
            {
            // InternalTaskDefinition.g:2676:2: ( ruleAttribute )
            // InternalTaskDefinition.g:2677:3: ruleAttribute
            {
             before(grammarAccess.getTaskDefinitionAccess().getParametersAttributeParserRuleCall_2_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionAccess().getParametersAttributeParserRuleCall_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__ParametersAssignment_2_0_2"


    // $ANTLR start "rule__TaskInputDefinition__NameAssignment_0"
    // InternalTaskDefinition.g:2686:1: rule__TaskInputDefinition__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__TaskInputDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2690:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:2691:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:2691:2: ( ruleEString )
            // InternalTaskDefinition.g:2692:3: ruleEString
            {
             before(grammarAccess.getTaskInputDefinitionAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskInputDefinitionAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__NameAssignment_0"


    // $ANTLR start "rule__TaskInputDefinition__DataTypeAssignment_1_1"
    // InternalTaskDefinition.g:2701:1: rule__TaskInputDefinition__DataTypeAssignment_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__TaskInputDefinition__DataTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2705:1: ( ( ( ruleFQN ) ) )
            // InternalTaskDefinition.g:2706:2: ( ( ruleFQN ) )
            {
            // InternalTaskDefinition.g:2706:2: ( ( ruleFQN ) )
            // InternalTaskDefinition.g:2707:3: ( ruleFQN )
            {
             before(grammarAccess.getTaskInputDefinitionAccess().getDataTypeDataTypeCrossReference_1_1_0()); 
            // InternalTaskDefinition.g:2708:3: ( ruleFQN )
            // InternalTaskDefinition.g:2709:4: ruleFQN
            {
             before(grammarAccess.getTaskInputDefinitionAccess().getDataTypeDataTypeFQNParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getTaskInputDefinitionAccess().getDataTypeDataTypeFQNParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTaskInputDefinitionAccess().getDataTypeDataTypeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInputDefinition__DataTypeAssignment_1_1"


    // $ANTLR start "rule__TaskOutputDefinition__NameAssignment_0"
    // InternalTaskDefinition.g:2720:1: rule__TaskOutputDefinition__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__TaskOutputDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2724:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:2725:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:2725:2: ( ruleEString )
            // InternalTaskDefinition.g:2726:3: ruleEString
            {
             before(grammarAccess.getTaskOutputDefinitionAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskOutputDefinitionAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__NameAssignment_0"


    // $ANTLR start "rule__TaskOutputDefinition__DataTypeAssignment_1_1"
    // InternalTaskDefinition.g:2735:1: rule__TaskOutputDefinition__DataTypeAssignment_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__TaskOutputDefinition__DataTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2739:1: ( ( ( ruleFQN ) ) )
            // InternalTaskDefinition.g:2740:2: ( ( ruleFQN ) )
            {
            // InternalTaskDefinition.g:2740:2: ( ( ruleFQN ) )
            // InternalTaskDefinition.g:2741:3: ( ruleFQN )
            {
             before(grammarAccess.getTaskOutputDefinitionAccess().getDataTypeDataTypeCrossReference_1_1_0()); 
            // InternalTaskDefinition.g:2742:3: ( ruleFQN )
            // InternalTaskDefinition.g:2743:4: ruleFQN
            {
             before(grammarAccess.getTaskOutputDefinitionAccess().getDataTypeDataTypeFQNParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getTaskOutputDefinitionAccess().getDataTypeDataTypeFQNParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTaskOutputDefinitionAccess().getDataTypeDataTypeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutputDefinition__DataTypeAssignment_1_1"


    // $ANTLR start "rule__Attribute__IsConstAssignment_0"
    // InternalTaskDefinition.g:2754:1: rule__Attribute__IsConstAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__Attribute__IsConstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2758:1: ( ( ( 'const' ) ) )
            // InternalTaskDefinition.g:2759:2: ( ( 'const' ) )
            {
            // InternalTaskDefinition.g:2759:2: ( ( 'const' ) )
            // InternalTaskDefinition.g:2760:3: ( 'const' )
            {
             before(grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0()); 
            // InternalTaskDefinition.g:2761:3: ( 'const' )
            // InternalTaskDefinition.g:2762:4: 'const'
            {
             before(grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IsConstAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalTaskDefinition.g:2773:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2777:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:2778:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:2778:2: ( ruleEString )
            // InternalTaskDefinition.g:2779:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeOfAssignment_3"
    // InternalTaskDefinition.g:2788:1: rule__Attribute__TypeOfAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__TypeOfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2792:1: ( ( ( ruleFQN ) ) )
            // InternalTaskDefinition.g:2793:2: ( ( ruleFQN ) )
            {
            // InternalTaskDefinition.g:2793:2: ( ( ruleFQN ) )
            // InternalTaskDefinition.g:2794:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getTypeOfITypeCrossReference_3_0()); 
            // InternalTaskDefinition.g:2795:3: ( ruleFQN )
            // InternalTaskDefinition.g:2796:4: ruleFQN
            {
             before(grammarAccess.getAttributeAccess().getTypeOfITypeFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeOfITypeFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeOfITypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeOfAssignment_3"


    // $ANTLR start "rule__Attribute__DimensionsAssignment_4"
    // InternalTaskDefinition.g:2807:1: rule__Attribute__DimensionsAssignment_4 : ( ruleArrayDimension ) ;
    public final void rule__Attribute__DimensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2811:1: ( ( ruleArrayDimension ) )
            // InternalTaskDefinition.g:2812:2: ( ruleArrayDimension )
            {
            // InternalTaskDefinition.g:2812:2: ( ruleArrayDimension )
            // InternalTaskDefinition.g:2813:3: ruleArrayDimension
            {
             before(grammarAccess.getAttributeAccess().getDimensionsArrayDimensionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArrayDimension();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDimensionsArrayDimensionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DimensionsAssignment_4"


    // $ANTLR start "rule__Attribute__ValueLiteralAssignment_5_0_1"
    // InternalTaskDefinition.g:2822:1: rule__Attribute__ValueLiteralAssignment_5_0_1 : ( ruleEString ) ;
    public final void rule__Attribute__ValueLiteralAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2826:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:2827:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:2827:2: ( ruleEString )
            // InternalTaskDefinition.g:2828:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueLiteralAssignment_5_0_1"


    // $ANTLR start "rule__Attribute__ValueLiteralAssignment_5_2_0_1_2"
    // InternalTaskDefinition.g:2837:1: rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 : ( ruleEString ) ;
    public final void rule__Attribute__ValueLiteralAssignment_5_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2841:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:2842:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:2842:2: ( ruleEString )
            // InternalTaskDefinition.g:2843:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_2_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getValueLiteralEStringParserRuleCall_5_2_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueLiteralAssignment_5_2_0_1_2"


    // $ANTLR start "rule__Attribute__MaxValueLiteralAssignment_5_2_1_2"
    // InternalTaskDefinition.g:2852:1: rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 : ( ruleEString ) ;
    public final void rule__Attribute__MaxValueLiteralAssignment_5_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2856:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:2857:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:2857:2: ( ruleEString )
            // InternalTaskDefinition.g:2858:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getMaxValueLiteralEStringParserRuleCall_5_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getMaxValueLiteralEStringParserRuleCall_5_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__MaxValueLiteralAssignment_5_2_1_2"


    // $ANTLR start "rule__Attribute__MinValueLiteralAssignment_5_2_2_2"
    // InternalTaskDefinition.g:2867:1: rule__Attribute__MinValueLiteralAssignment_5_2_2_2 : ( ruleEString ) ;
    public final void rule__Attribute__MinValueLiteralAssignment_5_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2871:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:2872:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:2872:2: ( ruleEString )
            // InternalTaskDefinition.g:2873:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getMinValueLiteralEStringParserRuleCall_5_2_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getMinValueLiteralEStringParserRuleCall_5_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__MinValueLiteralAssignment_5_2_2_2"


    // $ANTLR start "rule__Attribute__ReferenceFrameAssignment_5_2_3_2"
    // InternalTaskDefinition.g:2882:1: rule__Attribute__ReferenceFrameAssignment_5_2_3_2 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__ReferenceFrameAssignment_5_2_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2886:1: ( ( ( ruleFQN ) ) )
            // InternalTaskDefinition.g:2887:2: ( ( ruleFQN ) )
            {
            // InternalTaskDefinition.g:2887:2: ( ( ruleFQN ) )
            // InternalTaskDefinition.g:2888:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getReferenceFrameReferenceFrameDefinitionCrossReference_5_2_3_2_0()); 
            // InternalTaskDefinition.g:2889:3: ( ruleFQN )
            // InternalTaskDefinition.g:2890:4: ruleFQN
            {
             before(grammarAccess.getAttributeAccess().getReferenceFrameReferenceFrameDefinitionFQNParserRuleCall_5_2_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getReferenceFrameReferenceFrameDefinitionFQNParserRuleCall_5_2_3_2_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getReferenceFrameReferenceFrameDefinitionCrossReference_5_2_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ReferenceFrameAssignment_5_2_3_2"


    // $ANTLR start "rule__Attribute__TypeUnitAssignment_5_2_4_0_2"
    // InternalTaskDefinition.g:2901:1: rule__Attribute__TypeUnitAssignment_5_2_4_0_2 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__TypeUnitAssignment_5_2_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2905:1: ( ( ( ruleFQN ) ) )
            // InternalTaskDefinition.g:2906:2: ( ( ruleFQN ) )
            {
            // InternalTaskDefinition.g:2906:2: ( ( ruleFQN ) )
            // InternalTaskDefinition.g:2907:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getTypeUnitUnitDefinitionCrossReference_5_2_4_0_2_0()); 
            // InternalTaskDefinition.g:2908:3: ( ruleFQN )
            // InternalTaskDefinition.g:2909:4: ruleFQN
            {
             before(grammarAccess.getAttributeAccess().getTypeUnitUnitDefinitionFQNParserRuleCall_5_2_4_0_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeUnitUnitDefinitionFQNParserRuleCall_5_2_4_0_2_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeUnitUnitDefinitionCrossReference_5_2_4_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeUnitAssignment_5_2_4_0_2"


    // $ANTLR start "rule__ArrayDimension__SizeAssignment_1"
    // InternalTaskDefinition.g:2920:1: rule__ArrayDimension__SizeAssignment_1 : ( ruleEInt ) ;
    public final void rule__ArrayDimension__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2924:1: ( ( ruleEInt ) )
            // InternalTaskDefinition.g:2925:2: ( ruleEInt )
            {
            // InternalTaskDefinition.g:2925:2: ( ruleEInt )
            // InternalTaskDefinition.g:2926:3: ruleEInt
            {
             before(grammarAccess.getArrayDimensionAccess().getSizeEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getArrayDimensionAccess().getSizeEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__SizeAssignment_1"


    // $ANTLR start "rule__ArrayDimension__NameAssignment_2_3"
    // InternalTaskDefinition.g:2935:1: rule__ArrayDimension__NameAssignment_2_3 : ( ruleEString ) ;
    public final void rule__ArrayDimension__NameAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2939:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:2940:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:2940:2: ( ruleEString )
            // InternalTaskDefinition.g:2941:3: ruleEString
            {
             before(grammarAccess.getArrayDimensionAccess().getNameEStringParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArrayDimensionAccess().getNameEStringParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__NameAssignment_2_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080008030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003E8A800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001E0A000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000039002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001E0A002L});

}
