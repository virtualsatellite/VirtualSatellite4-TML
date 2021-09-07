package de.dlr.sc.virsat.model.ext.tml.behavioral.ide.contentassist.antlr.internal;

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
import de.dlr.sc.virsat.model.ext.tml.behavioral.services.ChannelDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChannelDefinitionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'DOUBLE_BUFFER'", "'FIFO'", "'LIFO'", "'EVENT_ONLY'", "'CUSTOM'", "'INTEGER'", "'FLOAT'", "'STRING'", "'Channel'", "':'", "'implementation:'", "'{'", "'}'", "'='", "'static'"
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

    	public void setGrammarAccess(ChannelDefinitionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleChannelBehaviorDefinition"
    // InternalChannelDefinition.g:53:1: entryRuleChannelBehaviorDefinition : ruleChannelBehaviorDefinition EOF ;
    public final void entryRuleChannelBehaviorDefinition() throws RecognitionException {
        try {
            // InternalChannelDefinition.g:54:1: ( ruleChannelBehaviorDefinition EOF )
            // InternalChannelDefinition.g:55:1: ruleChannelBehaviorDefinition EOF
            {
             before(grammarAccess.getChannelBehaviorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleChannelBehaviorDefinition();

            state._fsp--;

             after(grammarAccess.getChannelBehaviorDefinitionRule()); 
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
    // $ANTLR end "entryRuleChannelBehaviorDefinition"


    // $ANTLR start "ruleChannelBehaviorDefinition"
    // InternalChannelDefinition.g:62:1: ruleChannelBehaviorDefinition : ( ( rule__ChannelBehaviorDefinition__Group__0 ) ) ;
    public final void ruleChannelBehaviorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:66:2: ( ( ( rule__ChannelBehaviorDefinition__Group__0 ) ) )
            // InternalChannelDefinition.g:67:2: ( ( rule__ChannelBehaviorDefinition__Group__0 ) )
            {
            // InternalChannelDefinition.g:67:2: ( ( rule__ChannelBehaviorDefinition__Group__0 ) )
            // InternalChannelDefinition.g:68:3: ( rule__ChannelBehaviorDefinition__Group__0 )
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup()); 
            // InternalChannelDefinition.g:69:3: ( rule__ChannelBehaviorDefinition__Group__0 )
            // InternalChannelDefinition.g:69:4: rule__ChannelBehaviorDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleChannelBehaviorDefinition"


    // $ANTLR start "entryRuleBehavioralParameterDefinition"
    // InternalChannelDefinition.g:78:1: entryRuleBehavioralParameterDefinition : ruleBehavioralParameterDefinition EOF ;
    public final void entryRuleBehavioralParameterDefinition() throws RecognitionException {
        try {
            // InternalChannelDefinition.g:79:1: ( ruleBehavioralParameterDefinition EOF )
            // InternalChannelDefinition.g:80:1: ruleBehavioralParameterDefinition EOF
            {
             before(grammarAccess.getBehavioralParameterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleBehavioralParameterDefinition();

            state._fsp--;

             after(grammarAccess.getBehavioralParameterDefinitionRule()); 
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
    // $ANTLR end "entryRuleBehavioralParameterDefinition"


    // $ANTLR start "ruleBehavioralParameterDefinition"
    // InternalChannelDefinition.g:87:1: ruleBehavioralParameterDefinition : ( ( rule__BehavioralParameterDefinition__Group__0 ) ) ;
    public final void ruleBehavioralParameterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:91:2: ( ( ( rule__BehavioralParameterDefinition__Group__0 ) ) )
            // InternalChannelDefinition.g:92:2: ( ( rule__BehavioralParameterDefinition__Group__0 ) )
            {
            // InternalChannelDefinition.g:92:2: ( ( rule__BehavioralParameterDefinition__Group__0 ) )
            // InternalChannelDefinition.g:93:3: ( rule__BehavioralParameterDefinition__Group__0 )
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup()); 
            // InternalChannelDefinition.g:94:3: ( rule__BehavioralParameterDefinition__Group__0 )
            // InternalChannelDefinition.g:94:4: rule__BehavioralParameterDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleBehavioralParameterDefinition"


    // $ANTLR start "entryRuleEString"
    // InternalChannelDefinition.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalChannelDefinition.g:104:1: ( ruleEString EOF )
            // InternalChannelDefinition.g:105:1: ruleEString EOF
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
    // InternalChannelDefinition.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalChannelDefinition.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalChannelDefinition.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalChannelDefinition.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalChannelDefinition.g:119:3: ( rule__EString__Alternatives )
            // InternalChannelDefinition.g:119:4: rule__EString__Alternatives
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


    // $ANTLR start "ruleEnumStorageType"
    // InternalChannelDefinition.g:128:1: ruleEnumStorageType : ( ( rule__EnumStorageType__Alternatives ) ) ;
    public final void ruleEnumStorageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:132:1: ( ( ( rule__EnumStorageType__Alternatives ) ) )
            // InternalChannelDefinition.g:133:2: ( ( rule__EnumStorageType__Alternatives ) )
            {
            // InternalChannelDefinition.g:133:2: ( ( rule__EnumStorageType__Alternatives ) )
            // InternalChannelDefinition.g:134:3: ( rule__EnumStorageType__Alternatives )
            {
             before(grammarAccess.getEnumStorageTypeAccess().getAlternatives()); 
            // InternalChannelDefinition.g:135:3: ( rule__EnumStorageType__Alternatives )
            // InternalChannelDefinition.g:135:4: rule__EnumStorageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnumStorageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumStorageTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEnumStorageType"


    // $ANTLR start "ruleEnumValueType"
    // InternalChannelDefinition.g:144:1: ruleEnumValueType : ( ( rule__EnumValueType__Alternatives ) ) ;
    public final void ruleEnumValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:148:1: ( ( ( rule__EnumValueType__Alternatives ) ) )
            // InternalChannelDefinition.g:149:2: ( ( rule__EnumValueType__Alternatives ) )
            {
            // InternalChannelDefinition.g:149:2: ( ( rule__EnumValueType__Alternatives ) )
            // InternalChannelDefinition.g:150:3: ( rule__EnumValueType__Alternatives )
            {
             before(grammarAccess.getEnumValueTypeAccess().getAlternatives()); 
            // InternalChannelDefinition.g:151:3: ( rule__EnumValueType__Alternatives )
            // InternalChannelDefinition.g:151:4: rule__EnumValueType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnumValueType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEnumValueType"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Alternatives_5"
    // InternalChannelDefinition.g:159:1: rule__ChannelBehaviorDefinition__Alternatives_5 : ( ( ( rule__ChannelBehaviorDefinition__Group_5_0__0 ) ) | ( ';' ) );
    public final void rule__ChannelBehaviorDefinition__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:163:1: ( ( ( rule__ChannelBehaviorDefinition__Group_5_0__0 ) ) | ( ';' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalChannelDefinition.g:164:2: ( ( rule__ChannelBehaviorDefinition__Group_5_0__0 ) )
                    {
                    // InternalChannelDefinition.g:164:2: ( ( rule__ChannelBehaviorDefinition__Group_5_0__0 ) )
                    // InternalChannelDefinition.g:165:3: ( rule__ChannelBehaviorDefinition__Group_5_0__0 )
                    {
                     before(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_5_0()); 
                    // InternalChannelDefinition.g:166:3: ( rule__ChannelBehaviorDefinition__Group_5_0__0 )
                    // InternalChannelDefinition.g:166:4: rule__ChannelBehaviorDefinition__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChannelBehaviorDefinition__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChannelDefinition.g:170:2: ( ';' )
                    {
                    // InternalChannelDefinition.g:170:2: ( ';' )
                    // InternalChannelDefinition.g:171:3: ';'
                    {
                     before(grammarAccess.getChannelBehaviorDefinitionAccess().getSemicolonKeyword_5_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getChannelBehaviorDefinitionAccess().getSemicolonKeyword_5_1()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Alternatives_5"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalChannelDefinition.g:180:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:184:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalChannelDefinition.g:185:2: ( RULE_STRING )
                    {
                    // InternalChannelDefinition.g:185:2: ( RULE_STRING )
                    // InternalChannelDefinition.g:186:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChannelDefinition.g:191:2: ( RULE_ID )
                    {
                    // InternalChannelDefinition.g:191:2: ( RULE_ID )
                    // InternalChannelDefinition.g:192:3: RULE_ID
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


    // $ANTLR start "rule__EnumStorageType__Alternatives"
    // InternalChannelDefinition.g:201:1: rule__EnumStorageType__Alternatives : ( ( ( 'DOUBLE_BUFFER' ) ) | ( ( 'FIFO' ) ) | ( ( 'LIFO' ) ) | ( ( 'EVENT_ONLY' ) ) | ( ( 'CUSTOM' ) ) );
    public final void rule__EnumStorageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:205:1: ( ( ( 'DOUBLE_BUFFER' ) ) | ( ( 'FIFO' ) ) | ( ( 'LIFO' ) ) | ( ( 'EVENT_ONLY' ) ) | ( ( 'CUSTOM' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalChannelDefinition.g:206:2: ( ( 'DOUBLE_BUFFER' ) )
                    {
                    // InternalChannelDefinition.g:206:2: ( ( 'DOUBLE_BUFFER' ) )
                    // InternalChannelDefinition.g:207:3: ( 'DOUBLE_BUFFER' )
                    {
                     before(grammarAccess.getEnumStorageTypeAccess().getDOUBLE_BUFFEREnumLiteralDeclaration_0()); 
                    // InternalChannelDefinition.g:208:3: ( 'DOUBLE_BUFFER' )
                    // InternalChannelDefinition.g:208:4: 'DOUBLE_BUFFER'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumStorageTypeAccess().getDOUBLE_BUFFEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChannelDefinition.g:212:2: ( ( 'FIFO' ) )
                    {
                    // InternalChannelDefinition.g:212:2: ( ( 'FIFO' ) )
                    // InternalChannelDefinition.g:213:3: ( 'FIFO' )
                    {
                     before(grammarAccess.getEnumStorageTypeAccess().getFIFOEnumLiteralDeclaration_1()); 
                    // InternalChannelDefinition.g:214:3: ( 'FIFO' )
                    // InternalChannelDefinition.g:214:4: 'FIFO'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumStorageTypeAccess().getFIFOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChannelDefinition.g:218:2: ( ( 'LIFO' ) )
                    {
                    // InternalChannelDefinition.g:218:2: ( ( 'LIFO' ) )
                    // InternalChannelDefinition.g:219:3: ( 'LIFO' )
                    {
                     before(grammarAccess.getEnumStorageTypeAccess().getLIFOEnumLiteralDeclaration_2()); 
                    // InternalChannelDefinition.g:220:3: ( 'LIFO' )
                    // InternalChannelDefinition.g:220:4: 'LIFO'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumStorageTypeAccess().getLIFOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChannelDefinition.g:224:2: ( ( 'EVENT_ONLY' ) )
                    {
                    // InternalChannelDefinition.g:224:2: ( ( 'EVENT_ONLY' ) )
                    // InternalChannelDefinition.g:225:3: ( 'EVENT_ONLY' )
                    {
                     before(grammarAccess.getEnumStorageTypeAccess().getEVENT_ONLYEnumLiteralDeclaration_3()); 
                    // InternalChannelDefinition.g:226:3: ( 'EVENT_ONLY' )
                    // InternalChannelDefinition.g:226:4: 'EVENT_ONLY'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumStorageTypeAccess().getEVENT_ONLYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChannelDefinition.g:230:2: ( ( 'CUSTOM' ) )
                    {
                    // InternalChannelDefinition.g:230:2: ( ( 'CUSTOM' ) )
                    // InternalChannelDefinition.g:231:3: ( 'CUSTOM' )
                    {
                     before(grammarAccess.getEnumStorageTypeAccess().getCUSTOMEnumLiteralDeclaration_4()); 
                    // InternalChannelDefinition.g:232:3: ( 'CUSTOM' )
                    // InternalChannelDefinition.g:232:4: 'CUSTOM'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumStorageTypeAccess().getCUSTOMEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__EnumStorageType__Alternatives"


    // $ANTLR start "rule__EnumValueType__Alternatives"
    // InternalChannelDefinition.g:240:1: rule__EnumValueType__Alternatives : ( ( ( 'INTEGER' ) ) | ( ( 'FLOAT' ) ) | ( ( 'STRING' ) ) );
    public final void rule__EnumValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:244:1: ( ( ( 'INTEGER' ) ) | ( ( 'FLOAT' ) ) | ( ( 'STRING' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalChannelDefinition.g:245:2: ( ( 'INTEGER' ) )
                    {
                    // InternalChannelDefinition.g:245:2: ( ( 'INTEGER' ) )
                    // InternalChannelDefinition.g:246:3: ( 'INTEGER' )
                    {
                     before(grammarAccess.getEnumValueTypeAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    // InternalChannelDefinition.g:247:3: ( 'INTEGER' )
                    // InternalChannelDefinition.g:247:4: 'INTEGER'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumValueTypeAccess().getINTEGEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChannelDefinition.g:251:2: ( ( 'FLOAT' ) )
                    {
                    // InternalChannelDefinition.g:251:2: ( ( 'FLOAT' ) )
                    // InternalChannelDefinition.g:252:3: ( 'FLOAT' )
                    {
                     before(grammarAccess.getEnumValueTypeAccess().getFLOATEnumLiteralDeclaration_1()); 
                    // InternalChannelDefinition.g:253:3: ( 'FLOAT' )
                    // InternalChannelDefinition.g:253:4: 'FLOAT'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumValueTypeAccess().getFLOATEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChannelDefinition.g:257:2: ( ( 'STRING' ) )
                    {
                    // InternalChannelDefinition.g:257:2: ( ( 'STRING' ) )
                    // InternalChannelDefinition.g:258:3: ( 'STRING' )
                    {
                     before(grammarAccess.getEnumValueTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 
                    // InternalChannelDefinition.g:259:3: ( 'STRING' )
                    // InternalChannelDefinition.g:259:4: 'STRING'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumValueTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__EnumValueType__Alternatives"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__0"
    // InternalChannelDefinition.g:267:1: rule__ChannelBehaviorDefinition__Group__0 : rule__ChannelBehaviorDefinition__Group__0__Impl rule__ChannelBehaviorDefinition__Group__1 ;
    public final void rule__ChannelBehaviorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:271:1: ( rule__ChannelBehaviorDefinition__Group__0__Impl rule__ChannelBehaviorDefinition__Group__1 )
            // InternalChannelDefinition.g:272:2: rule__ChannelBehaviorDefinition__Group__0__Impl rule__ChannelBehaviorDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ChannelBehaviorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group__1();

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__0"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__0__Impl"
    // InternalChannelDefinition.g:279:1: rule__ChannelBehaviorDefinition__Group__0__Impl : ( 'Channel' ) ;
    public final void rule__ChannelBehaviorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:283:1: ( ( 'Channel' ) )
            // InternalChannelDefinition.g:284:1: ( 'Channel' )
            {
            // InternalChannelDefinition.g:284:1: ( 'Channel' )
            // InternalChannelDefinition.g:285:2: 'Channel'
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getChannelKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChannelBehaviorDefinitionAccess().getChannelKeyword_0()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__0__Impl"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__1"
    // InternalChannelDefinition.g:294:1: rule__ChannelBehaviorDefinition__Group__1 : rule__ChannelBehaviorDefinition__Group__1__Impl rule__ChannelBehaviorDefinition__Group__2 ;
    public final void rule__ChannelBehaviorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:298:1: ( rule__ChannelBehaviorDefinition__Group__1__Impl rule__ChannelBehaviorDefinition__Group__2 )
            // InternalChannelDefinition.g:299:2: rule__ChannelBehaviorDefinition__Group__1__Impl rule__ChannelBehaviorDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ChannelBehaviorDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group__2();

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__1"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__1__Impl"
    // InternalChannelDefinition.g:306:1: rule__ChannelBehaviorDefinition__Group__1__Impl : ( ( rule__ChannelBehaviorDefinition__NameAssignment_1 ) ) ;
    public final void rule__ChannelBehaviorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:310:1: ( ( ( rule__ChannelBehaviorDefinition__NameAssignment_1 ) ) )
            // InternalChannelDefinition.g:311:1: ( ( rule__ChannelBehaviorDefinition__NameAssignment_1 ) )
            {
            // InternalChannelDefinition.g:311:1: ( ( rule__ChannelBehaviorDefinition__NameAssignment_1 ) )
            // InternalChannelDefinition.g:312:2: ( rule__ChannelBehaviorDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getNameAssignment_1()); 
            // InternalChannelDefinition.g:313:2: ( rule__ChannelBehaviorDefinition__NameAssignment_1 )
            // InternalChannelDefinition.g:313:3: rule__ChannelBehaviorDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChannelBehaviorDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__1__Impl"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__2"
    // InternalChannelDefinition.g:321:1: rule__ChannelBehaviorDefinition__Group__2 : rule__ChannelBehaviorDefinition__Group__2__Impl rule__ChannelBehaviorDefinition__Group__3 ;
    public final void rule__ChannelBehaviorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:325:1: ( rule__ChannelBehaviorDefinition__Group__2__Impl rule__ChannelBehaviorDefinition__Group__3 )
            // InternalChannelDefinition.g:326:2: rule__ChannelBehaviorDefinition__Group__2__Impl rule__ChannelBehaviorDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ChannelBehaviorDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group__3();

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__2"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__2__Impl"
    // InternalChannelDefinition.g:333:1: rule__ChannelBehaviorDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__ChannelBehaviorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:337:1: ( ( ':' ) )
            // InternalChannelDefinition.g:338:1: ( ':' )
            {
            // InternalChannelDefinition.g:338:1: ( ':' )
            // InternalChannelDefinition.g:339:2: ':'
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getChannelBehaviorDefinitionAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__2__Impl"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__3"
    // InternalChannelDefinition.g:348:1: rule__ChannelBehaviorDefinition__Group__3 : rule__ChannelBehaviorDefinition__Group__3__Impl rule__ChannelBehaviorDefinition__Group__4 ;
    public final void rule__ChannelBehaviorDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:352:1: ( rule__ChannelBehaviorDefinition__Group__3__Impl rule__ChannelBehaviorDefinition__Group__4 )
            // InternalChannelDefinition.g:353:2: rule__ChannelBehaviorDefinition__Group__3__Impl rule__ChannelBehaviorDefinition__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ChannelBehaviorDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group__4();

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__3"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__3__Impl"
    // InternalChannelDefinition.g:360:1: rule__ChannelBehaviorDefinition__Group__3__Impl : ( ( rule__ChannelBehaviorDefinition__StorageTypeAssignment_3 ) ) ;
    public final void rule__ChannelBehaviorDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:364:1: ( ( ( rule__ChannelBehaviorDefinition__StorageTypeAssignment_3 ) ) )
            // InternalChannelDefinition.g:365:1: ( ( rule__ChannelBehaviorDefinition__StorageTypeAssignment_3 ) )
            {
            // InternalChannelDefinition.g:365:1: ( ( rule__ChannelBehaviorDefinition__StorageTypeAssignment_3 ) )
            // InternalChannelDefinition.g:366:2: ( rule__ChannelBehaviorDefinition__StorageTypeAssignment_3 )
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeAssignment_3()); 
            // InternalChannelDefinition.g:367:2: ( rule__ChannelBehaviorDefinition__StorageTypeAssignment_3 )
            // InternalChannelDefinition.g:367:3: rule__ChannelBehaviorDefinition__StorageTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__StorageTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeAssignment_3()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__3__Impl"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__4"
    // InternalChannelDefinition.g:375:1: rule__ChannelBehaviorDefinition__Group__4 : rule__ChannelBehaviorDefinition__Group__4__Impl rule__ChannelBehaviorDefinition__Group__5 ;
    public final void rule__ChannelBehaviorDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:379:1: ( rule__ChannelBehaviorDefinition__Group__4__Impl rule__ChannelBehaviorDefinition__Group__5 )
            // InternalChannelDefinition.g:380:2: rule__ChannelBehaviorDefinition__Group__4__Impl rule__ChannelBehaviorDefinition__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ChannelBehaviorDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group__5();

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__4"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__4__Impl"
    // InternalChannelDefinition.g:387:1: rule__ChannelBehaviorDefinition__Group__4__Impl : ( ( rule__ChannelBehaviorDefinition__Group_4__0 )? ) ;
    public final void rule__ChannelBehaviorDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:391:1: ( ( ( rule__ChannelBehaviorDefinition__Group_4__0 )? ) )
            // InternalChannelDefinition.g:392:1: ( ( rule__ChannelBehaviorDefinition__Group_4__0 )? )
            {
            // InternalChannelDefinition.g:392:1: ( ( rule__ChannelBehaviorDefinition__Group_4__0 )? )
            // InternalChannelDefinition.g:393:2: ( rule__ChannelBehaviorDefinition__Group_4__0 )?
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_4()); 
            // InternalChannelDefinition.g:394:2: ( rule__ChannelBehaviorDefinition__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalChannelDefinition.g:394:3: rule__ChannelBehaviorDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChannelBehaviorDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__4__Impl"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__5"
    // InternalChannelDefinition.g:402:1: rule__ChannelBehaviorDefinition__Group__5 : rule__ChannelBehaviorDefinition__Group__5__Impl ;
    public final void rule__ChannelBehaviorDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:406:1: ( rule__ChannelBehaviorDefinition__Group__5__Impl )
            // InternalChannelDefinition.g:407:2: rule__ChannelBehaviorDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__5"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group__5__Impl"
    // InternalChannelDefinition.g:413:1: rule__ChannelBehaviorDefinition__Group__5__Impl : ( ( rule__ChannelBehaviorDefinition__Alternatives_5 ) ) ;
    public final void rule__ChannelBehaviorDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:417:1: ( ( ( rule__ChannelBehaviorDefinition__Alternatives_5 ) ) )
            // InternalChannelDefinition.g:418:1: ( ( rule__ChannelBehaviorDefinition__Alternatives_5 ) )
            {
            // InternalChannelDefinition.g:418:1: ( ( rule__ChannelBehaviorDefinition__Alternatives_5 ) )
            // InternalChannelDefinition.g:419:2: ( rule__ChannelBehaviorDefinition__Alternatives_5 )
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getAlternatives_5()); 
            // InternalChannelDefinition.g:420:2: ( rule__ChannelBehaviorDefinition__Alternatives_5 )
            // InternalChannelDefinition.g:420:3: rule__ChannelBehaviorDefinition__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getChannelBehaviorDefinitionAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group__5__Impl"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group_4__0"
    // InternalChannelDefinition.g:429:1: rule__ChannelBehaviorDefinition__Group_4__0 : rule__ChannelBehaviorDefinition__Group_4__0__Impl rule__ChannelBehaviorDefinition__Group_4__1 ;
    public final void rule__ChannelBehaviorDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:433:1: ( rule__ChannelBehaviorDefinition__Group_4__0__Impl rule__ChannelBehaviorDefinition__Group_4__1 )
            // InternalChannelDefinition.g:434:2: rule__ChannelBehaviorDefinition__Group_4__0__Impl rule__ChannelBehaviorDefinition__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ChannelBehaviorDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group_4__1();

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group_4__0"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group_4__0__Impl"
    // InternalChannelDefinition.g:441:1: rule__ChannelBehaviorDefinition__Group_4__0__Impl : ( 'implementation:' ) ;
    public final void rule__ChannelBehaviorDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:445:1: ( ( 'implementation:' ) )
            // InternalChannelDefinition.g:446:1: ( 'implementation:' )
            {
            // InternalChannelDefinition.g:446:1: ( 'implementation:' )
            // InternalChannelDefinition.g:447:2: 'implementation:'
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getImplementationKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getChannelBehaviorDefinitionAccess().getImplementationKeyword_4_0()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group_4__1"
    // InternalChannelDefinition.g:456:1: rule__ChannelBehaviorDefinition__Group_4__1 : rule__ChannelBehaviorDefinition__Group_4__1__Impl ;
    public final void rule__ChannelBehaviorDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:460:1: ( rule__ChannelBehaviorDefinition__Group_4__1__Impl )
            // InternalChannelDefinition.g:461:2: rule__ChannelBehaviorDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group_4__1"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group_4__1__Impl"
    // InternalChannelDefinition.g:467:1: rule__ChannelBehaviorDefinition__Group_4__1__Impl : ( ( rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1 ) ) ;
    public final void rule__ChannelBehaviorDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:471:1: ( ( ( rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1 ) ) )
            // InternalChannelDefinition.g:472:1: ( ( rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1 ) )
            {
            // InternalChannelDefinition.g:472:1: ( ( rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1 ) )
            // InternalChannelDefinition.g:473:2: ( rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1 )
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameAssignment_4_1()); 
            // InternalChannelDefinition.g:474:2: ( rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1 )
            // InternalChannelDefinition.g:474:3: rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameAssignment_4_1()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group_5_0__0"
    // InternalChannelDefinition.g:483:1: rule__ChannelBehaviorDefinition__Group_5_0__0 : rule__ChannelBehaviorDefinition__Group_5_0__0__Impl rule__ChannelBehaviorDefinition__Group_5_0__1 ;
    public final void rule__ChannelBehaviorDefinition__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:487:1: ( rule__ChannelBehaviorDefinition__Group_5_0__0__Impl rule__ChannelBehaviorDefinition__Group_5_0__1 )
            // InternalChannelDefinition.g:488:2: rule__ChannelBehaviorDefinition__Group_5_0__0__Impl rule__ChannelBehaviorDefinition__Group_5_0__1
            {
            pushFollow(FOLLOW_7);
            rule__ChannelBehaviorDefinition__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group_5_0__1();

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group_5_0__0"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group_5_0__0__Impl"
    // InternalChannelDefinition.g:495:1: rule__ChannelBehaviorDefinition__Group_5_0__0__Impl : ( '{' ) ;
    public final void rule__ChannelBehaviorDefinition__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:499:1: ( ( '{' ) )
            // InternalChannelDefinition.g:500:1: ( '{' )
            {
            // InternalChannelDefinition.g:500:1: ( '{' )
            // InternalChannelDefinition.g:501:2: '{'
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChannelBehaviorDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group_5_0__0__Impl"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group_5_0__1"
    // InternalChannelDefinition.g:510:1: rule__ChannelBehaviorDefinition__Group_5_0__1 : rule__ChannelBehaviorDefinition__Group_5_0__1__Impl rule__ChannelBehaviorDefinition__Group_5_0__2 ;
    public final void rule__ChannelBehaviorDefinition__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:514:1: ( rule__ChannelBehaviorDefinition__Group_5_0__1__Impl rule__ChannelBehaviorDefinition__Group_5_0__2 )
            // InternalChannelDefinition.g:515:2: rule__ChannelBehaviorDefinition__Group_5_0__1__Impl rule__ChannelBehaviorDefinition__Group_5_0__2
            {
            pushFollow(FOLLOW_7);
            rule__ChannelBehaviorDefinition__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group_5_0__2();

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group_5_0__1"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group_5_0__1__Impl"
    // InternalChannelDefinition.g:522:1: rule__ChannelBehaviorDefinition__Group_5_0__1__Impl : ( ( rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1 )* ) ;
    public final void rule__ChannelBehaviorDefinition__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:526:1: ( ( ( rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1 )* ) )
            // InternalChannelDefinition.g:527:1: ( ( rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1 )* )
            {
            // InternalChannelDefinition.g:527:1: ( ( rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1 )* )
            // InternalChannelDefinition.g:528:2: ( rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1 )*
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersAssignment_5_0_1()); 
            // InternalChannelDefinition.g:529:2: ( rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalChannelDefinition.g:529:3: rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersAssignment_5_0_1()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group_5_0__1__Impl"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group_5_0__2"
    // InternalChannelDefinition.g:537:1: rule__ChannelBehaviorDefinition__Group_5_0__2 : rule__ChannelBehaviorDefinition__Group_5_0__2__Impl ;
    public final void rule__ChannelBehaviorDefinition__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:541:1: ( rule__ChannelBehaviorDefinition__Group_5_0__2__Impl )
            // InternalChannelDefinition.g:542:2: rule__ChannelBehaviorDefinition__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChannelBehaviorDefinition__Group_5_0__2__Impl();

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group_5_0__2"


    // $ANTLR start "rule__ChannelBehaviorDefinition__Group_5_0__2__Impl"
    // InternalChannelDefinition.g:548:1: rule__ChannelBehaviorDefinition__Group_5_0__2__Impl : ( '}' ) ;
    public final void rule__ChannelBehaviorDefinition__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:552:1: ( ( '}' ) )
            // InternalChannelDefinition.g:553:1: ( '}' )
            {
            // InternalChannelDefinition.g:553:1: ( '}' )
            // InternalChannelDefinition.g:554:2: '}'
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getRightCurlyBracketKeyword_5_0_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getChannelBehaviorDefinitionAccess().getRightCurlyBracketKeyword_5_0_2()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__Group_5_0__2__Impl"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group__0"
    // InternalChannelDefinition.g:564:1: rule__BehavioralParameterDefinition__Group__0 : rule__BehavioralParameterDefinition__Group__0__Impl rule__BehavioralParameterDefinition__Group__1 ;
    public final void rule__BehavioralParameterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:568:1: ( rule__BehavioralParameterDefinition__Group__0__Impl rule__BehavioralParameterDefinition__Group__1 )
            // InternalChannelDefinition.g:569:2: rule__BehavioralParameterDefinition__Group__0__Impl rule__BehavioralParameterDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BehavioralParameterDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__Group__1();

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group__0"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group__0__Impl"
    // InternalChannelDefinition.g:576:1: rule__BehavioralParameterDefinition__Group__0__Impl : ( ( rule__BehavioralParameterDefinition__IsStaticAssignment_0 )? ) ;
    public final void rule__BehavioralParameterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:580:1: ( ( ( rule__BehavioralParameterDefinition__IsStaticAssignment_0 )? ) )
            // InternalChannelDefinition.g:581:1: ( ( rule__BehavioralParameterDefinition__IsStaticAssignment_0 )? )
            {
            // InternalChannelDefinition.g:581:1: ( ( rule__BehavioralParameterDefinition__IsStaticAssignment_0 )? )
            // InternalChannelDefinition.g:582:2: ( rule__BehavioralParameterDefinition__IsStaticAssignment_0 )?
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticAssignment_0()); 
            // InternalChannelDefinition.g:583:2: ( rule__BehavioralParameterDefinition__IsStaticAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalChannelDefinition.g:583:3: rule__BehavioralParameterDefinition__IsStaticAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehavioralParameterDefinition__IsStaticAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticAssignment_0()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group__0__Impl"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group__1"
    // InternalChannelDefinition.g:591:1: rule__BehavioralParameterDefinition__Group__1 : rule__BehavioralParameterDefinition__Group__1__Impl rule__BehavioralParameterDefinition__Group__2 ;
    public final void rule__BehavioralParameterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:595:1: ( rule__BehavioralParameterDefinition__Group__1__Impl rule__BehavioralParameterDefinition__Group__2 )
            // InternalChannelDefinition.g:596:2: rule__BehavioralParameterDefinition__Group__1__Impl rule__BehavioralParameterDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__BehavioralParameterDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__Group__2();

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group__1"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group__1__Impl"
    // InternalChannelDefinition.g:603:1: rule__BehavioralParameterDefinition__Group__1__Impl : ( ( rule__BehavioralParameterDefinition__NameAssignment_1 ) ) ;
    public final void rule__BehavioralParameterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:607:1: ( ( ( rule__BehavioralParameterDefinition__NameAssignment_1 ) ) )
            // InternalChannelDefinition.g:608:1: ( ( rule__BehavioralParameterDefinition__NameAssignment_1 ) )
            {
            // InternalChannelDefinition.g:608:1: ( ( rule__BehavioralParameterDefinition__NameAssignment_1 ) )
            // InternalChannelDefinition.g:609:2: ( rule__BehavioralParameterDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getNameAssignment_1()); 
            // InternalChannelDefinition.g:610:2: ( rule__BehavioralParameterDefinition__NameAssignment_1 )
            // InternalChannelDefinition.g:610:3: rule__BehavioralParameterDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBehavioralParameterDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group__1__Impl"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group__2"
    // InternalChannelDefinition.g:618:1: rule__BehavioralParameterDefinition__Group__2 : rule__BehavioralParameterDefinition__Group__2__Impl rule__BehavioralParameterDefinition__Group__3 ;
    public final void rule__BehavioralParameterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:622:1: ( rule__BehavioralParameterDefinition__Group__2__Impl rule__BehavioralParameterDefinition__Group__3 )
            // InternalChannelDefinition.g:623:2: rule__BehavioralParameterDefinition__Group__2__Impl rule__BehavioralParameterDefinition__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__BehavioralParameterDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__Group__3();

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group__2"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group__2__Impl"
    // InternalChannelDefinition.g:630:1: rule__BehavioralParameterDefinition__Group__2__Impl : ( ( rule__BehavioralParameterDefinition__Group_2__0 )? ) ;
    public final void rule__BehavioralParameterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:634:1: ( ( ( rule__BehavioralParameterDefinition__Group_2__0 )? ) )
            // InternalChannelDefinition.g:635:1: ( ( rule__BehavioralParameterDefinition__Group_2__0 )? )
            {
            // InternalChannelDefinition.g:635:1: ( ( rule__BehavioralParameterDefinition__Group_2__0 )? )
            // InternalChannelDefinition.g:636:2: ( rule__BehavioralParameterDefinition__Group_2__0 )?
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_2()); 
            // InternalChannelDefinition.g:637:2: ( rule__BehavioralParameterDefinition__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalChannelDefinition.g:637:3: rule__BehavioralParameterDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehavioralParameterDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group__2__Impl"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group__3"
    // InternalChannelDefinition.g:645:1: rule__BehavioralParameterDefinition__Group__3 : rule__BehavioralParameterDefinition__Group__3__Impl rule__BehavioralParameterDefinition__Group__4 ;
    public final void rule__BehavioralParameterDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:649:1: ( rule__BehavioralParameterDefinition__Group__3__Impl rule__BehavioralParameterDefinition__Group__4 )
            // InternalChannelDefinition.g:650:2: rule__BehavioralParameterDefinition__Group__3__Impl rule__BehavioralParameterDefinition__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__BehavioralParameterDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__Group__4();

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group__3"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group__3__Impl"
    // InternalChannelDefinition.g:657:1: rule__BehavioralParameterDefinition__Group__3__Impl : ( ( rule__BehavioralParameterDefinition__Group_3__0 )? ) ;
    public final void rule__BehavioralParameterDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:661:1: ( ( ( rule__BehavioralParameterDefinition__Group_3__0 )? ) )
            // InternalChannelDefinition.g:662:1: ( ( rule__BehavioralParameterDefinition__Group_3__0 )? )
            {
            // InternalChannelDefinition.g:662:1: ( ( rule__BehavioralParameterDefinition__Group_3__0 )? )
            // InternalChannelDefinition.g:663:2: ( rule__BehavioralParameterDefinition__Group_3__0 )?
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_3()); 
            // InternalChannelDefinition.g:664:2: ( rule__BehavioralParameterDefinition__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalChannelDefinition.g:664:3: rule__BehavioralParameterDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehavioralParameterDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group__3__Impl"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group__4"
    // InternalChannelDefinition.g:672:1: rule__BehavioralParameterDefinition__Group__4 : rule__BehavioralParameterDefinition__Group__4__Impl ;
    public final void rule__BehavioralParameterDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:676:1: ( rule__BehavioralParameterDefinition__Group__4__Impl )
            // InternalChannelDefinition.g:677:2: rule__BehavioralParameterDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group__4"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group__4__Impl"
    // InternalChannelDefinition.g:683:1: rule__BehavioralParameterDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__BehavioralParameterDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:687:1: ( ( ';' ) )
            // InternalChannelDefinition.g:688:1: ( ';' )
            {
            // InternalChannelDefinition.g:688:1: ( ';' )
            // InternalChannelDefinition.g:689:2: ';'
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getSemicolonKeyword_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBehavioralParameterDefinitionAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group__4__Impl"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group_2__0"
    // InternalChannelDefinition.g:699:1: rule__BehavioralParameterDefinition__Group_2__0 : rule__BehavioralParameterDefinition__Group_2__0__Impl rule__BehavioralParameterDefinition__Group_2__1 ;
    public final void rule__BehavioralParameterDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:703:1: ( rule__BehavioralParameterDefinition__Group_2__0__Impl rule__BehavioralParameterDefinition__Group_2__1 )
            // InternalChannelDefinition.g:704:2: rule__BehavioralParameterDefinition__Group_2__0__Impl rule__BehavioralParameterDefinition__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__BehavioralParameterDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__Group_2__1();

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group_2__0"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group_2__0__Impl"
    // InternalChannelDefinition.g:711:1: rule__BehavioralParameterDefinition__Group_2__0__Impl : ( ':' ) ;
    public final void rule__BehavioralParameterDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:715:1: ( ( ':' ) )
            // InternalChannelDefinition.g:716:1: ( ':' )
            {
            // InternalChannelDefinition.g:716:1: ( ':' )
            // InternalChannelDefinition.g:717:2: ':'
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getColonKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBehavioralParameterDefinitionAccess().getColonKeyword_2_0()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group_2__1"
    // InternalChannelDefinition.g:726:1: rule__BehavioralParameterDefinition__Group_2__1 : rule__BehavioralParameterDefinition__Group_2__1__Impl ;
    public final void rule__BehavioralParameterDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:730:1: ( rule__BehavioralParameterDefinition__Group_2__1__Impl )
            // InternalChannelDefinition.g:731:2: rule__BehavioralParameterDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__Group_2__1__Impl();

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group_2__1"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group_2__1__Impl"
    // InternalChannelDefinition.g:737:1: rule__BehavioralParameterDefinition__Group_2__1__Impl : ( ( rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1 ) ) ;
    public final void rule__BehavioralParameterDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:741:1: ( ( ( rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1 ) ) )
            // InternalChannelDefinition.g:742:1: ( ( rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1 ) )
            {
            // InternalChannelDefinition.g:742:1: ( ( rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1 ) )
            // InternalChannelDefinition.g:743:2: ( rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1 )
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeAssignment_2_1()); 
            // InternalChannelDefinition.g:744:2: ( rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1 )
            // InternalChannelDefinition.g:744:3: rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group_3__0"
    // InternalChannelDefinition.g:753:1: rule__BehavioralParameterDefinition__Group_3__0 : rule__BehavioralParameterDefinition__Group_3__0__Impl rule__BehavioralParameterDefinition__Group_3__1 ;
    public final void rule__BehavioralParameterDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:757:1: ( rule__BehavioralParameterDefinition__Group_3__0__Impl rule__BehavioralParameterDefinition__Group_3__1 )
            // InternalChannelDefinition.g:758:2: rule__BehavioralParameterDefinition__Group_3__0__Impl rule__BehavioralParameterDefinition__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__BehavioralParameterDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__Group_3__1();

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group_3__0"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group_3__0__Impl"
    // InternalChannelDefinition.g:765:1: rule__BehavioralParameterDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__BehavioralParameterDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:769:1: ( ( '=' ) )
            // InternalChannelDefinition.g:770:1: ( '=' )
            {
            // InternalChannelDefinition.g:770:1: ( '=' )
            // InternalChannelDefinition.g:771:2: '='
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBehavioralParameterDefinitionAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group_3__1"
    // InternalChannelDefinition.g:780:1: rule__BehavioralParameterDefinition__Group_3__1 : rule__BehavioralParameterDefinition__Group_3__1__Impl ;
    public final void rule__BehavioralParameterDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:784:1: ( rule__BehavioralParameterDefinition__Group_3__1__Impl )
            // InternalChannelDefinition.g:785:2: rule__BehavioralParameterDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__Group_3__1__Impl();

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group_3__1"


    // $ANTLR start "rule__BehavioralParameterDefinition__Group_3__1__Impl"
    // InternalChannelDefinition.g:791:1: rule__BehavioralParameterDefinition__Group_3__1__Impl : ( ( rule__BehavioralParameterDefinition__ValueAssignment_3_1 ) ) ;
    public final void rule__BehavioralParameterDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:795:1: ( ( ( rule__BehavioralParameterDefinition__ValueAssignment_3_1 ) ) )
            // InternalChannelDefinition.g:796:1: ( ( rule__BehavioralParameterDefinition__ValueAssignment_3_1 ) )
            {
            // InternalChannelDefinition.g:796:1: ( ( rule__BehavioralParameterDefinition__ValueAssignment_3_1 ) )
            // InternalChannelDefinition.g:797:2: ( rule__BehavioralParameterDefinition__ValueAssignment_3_1 )
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getValueAssignment_3_1()); 
            // InternalChannelDefinition.g:798:2: ( rule__BehavioralParameterDefinition__ValueAssignment_3_1 )
            // InternalChannelDefinition.g:798:3: rule__BehavioralParameterDefinition__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BehavioralParameterDefinition__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBehavioralParameterDefinitionAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__ChannelBehaviorDefinition__NameAssignment_1"
    // InternalChannelDefinition.g:807:1: rule__ChannelBehaviorDefinition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ChannelBehaviorDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:811:1: ( ( ruleEString ) )
            // InternalChannelDefinition.g:812:2: ( ruleEString )
            {
            // InternalChannelDefinition.g:812:2: ( ruleEString )
            // InternalChannelDefinition.g:813:3: ruleEString
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChannelBehaviorDefinitionAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__NameAssignment_1"


    // $ANTLR start "rule__ChannelBehaviorDefinition__StorageTypeAssignment_3"
    // InternalChannelDefinition.g:822:1: rule__ChannelBehaviorDefinition__StorageTypeAssignment_3 : ( ruleEnumStorageType ) ;
    public final void rule__ChannelBehaviorDefinition__StorageTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:826:1: ( ( ruleEnumStorageType ) )
            // InternalChannelDefinition.g:827:2: ( ruleEnumStorageType )
            {
            // InternalChannelDefinition.g:827:2: ( ruleEnumStorageType )
            // InternalChannelDefinition.g:828:3: ruleEnumStorageType
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeEnumStorageTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumStorageType();

            state._fsp--;

             after(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeEnumStorageTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__StorageTypeAssignment_3"


    // $ANTLR start "rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1"
    // InternalChannelDefinition.g:837:1: rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:841:1: ( ( ruleEString ) )
            // InternalChannelDefinition.g:842:2: ( ruleEString )
            {
            // InternalChannelDefinition.g:842:2: ( ruleEString )
            // InternalChannelDefinition.g:843:3: ruleEString
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1"


    // $ANTLR start "rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1"
    // InternalChannelDefinition.g:852:1: rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1 : ( ruleBehavioralParameterDefinition ) ;
    public final void rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:856:1: ( ( ruleBehavioralParameterDefinition ) )
            // InternalChannelDefinition.g:857:2: ( ruleBehavioralParameterDefinition )
            {
            // InternalChannelDefinition.g:857:2: ( ruleBehavioralParameterDefinition )
            // InternalChannelDefinition.g:858:3: ruleBehavioralParameterDefinition
            {
             before(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersBehavioralParameterDefinitionParserRuleCall_5_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehavioralParameterDefinition();

            state._fsp--;

             after(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersBehavioralParameterDefinitionParserRuleCall_5_0_1_0()); 

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
    // $ANTLR end "rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1"


    // $ANTLR start "rule__BehavioralParameterDefinition__IsStaticAssignment_0"
    // InternalChannelDefinition.g:867:1: rule__BehavioralParameterDefinition__IsStaticAssignment_0 : ( ( 'static' ) ) ;
    public final void rule__BehavioralParameterDefinition__IsStaticAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:871:1: ( ( ( 'static' ) ) )
            // InternalChannelDefinition.g:872:2: ( ( 'static' ) )
            {
            // InternalChannelDefinition.g:872:2: ( ( 'static' ) )
            // InternalChannelDefinition.g:873:3: ( 'static' )
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticStaticKeyword_0_0()); 
            // InternalChannelDefinition.g:874:3: ( 'static' )
            // InternalChannelDefinition.g:875:4: 'static'
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticStaticKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticStaticKeyword_0_0()); 

            }

             after(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticStaticKeyword_0_0()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__IsStaticAssignment_0"


    // $ANTLR start "rule__BehavioralParameterDefinition__NameAssignment_1"
    // InternalChannelDefinition.g:886:1: rule__BehavioralParameterDefinition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BehavioralParameterDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:890:1: ( ( ruleEString ) )
            // InternalChannelDefinition.g:891:2: ( ruleEString )
            {
            // InternalChannelDefinition.g:891:2: ( ruleEString )
            // InternalChannelDefinition.g:892:3: ruleEString
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBehavioralParameterDefinitionAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__NameAssignment_1"


    // $ANTLR start "rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1"
    // InternalChannelDefinition.g:901:1: rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1 : ( ruleEnumValueType ) ;
    public final void rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:905:1: ( ( ruleEnumValueType ) )
            // InternalChannelDefinition.g:906:2: ( ruleEnumValueType )
            {
            // InternalChannelDefinition.g:906:2: ( ruleEnumValueType )
            // InternalChannelDefinition.g:907:3: ruleEnumValueType
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeEnumValueTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumValueType();

            state._fsp--;

             after(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeEnumValueTypeEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1"


    // $ANTLR start "rule__BehavioralParameterDefinition__ValueAssignment_3_1"
    // InternalChannelDefinition.g:916:1: rule__BehavioralParameterDefinition__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__BehavioralParameterDefinition__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChannelDefinition.g:920:1: ( ( ruleEString ) )
            // InternalChannelDefinition.g:921:2: ( ruleEString )
            {
            // InternalChannelDefinition.g:921:2: ( ruleEString )
            // InternalChannelDefinition.g:922:3: ruleEString
            {
             before(grammarAccess.getBehavioralParameterDefinitionAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBehavioralParameterDefinitionAccess().getValueEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__BehavioralParameterDefinition__ValueAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C00800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000005000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002200800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E0000L});

}