package de.dlr.sc.virsat.model.ext.tml.structural.ide.contentassist.antlr.internal;

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
import de.dlr.sc.virsat.model.ext.tml.structural.services.DeclarationLangaugeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeclarationLangaugeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "':'", "'='", "'{'", "'value'", "'max'", "'min'", "'referenceFrame'", "'}'", "'unit'", "'['", "']'", "','", "'name'", "'-'", "'.'", "'const'"
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

    	public void setGrammarAccess(DeclarationLangaugeGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAttribute"
    // InternalDeclarationLangauge.g:53:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDeclarationLangauge.g:54:1: ( ruleAttribute EOF )
            // InternalDeclarationLangauge.g:55:1: ruleAttribute EOF
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
    // InternalDeclarationLangauge.g:62:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:66:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDeclarationLangauge.g:67:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDeclarationLangauge.g:67:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDeclarationLangauge.g:68:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDeclarationLangauge.g:69:3: ( rule__Attribute__Group__0 )
            // InternalDeclarationLangauge.g:69:4: rule__Attribute__Group__0
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
    // InternalDeclarationLangauge.g:78:1: entryRuleArrayDimension : ruleArrayDimension EOF ;
    public final void entryRuleArrayDimension() throws RecognitionException {
        try {
            // InternalDeclarationLangauge.g:79:1: ( ruleArrayDimension EOF )
            // InternalDeclarationLangauge.g:80:1: ruleArrayDimension EOF
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
    // InternalDeclarationLangauge.g:87:1: ruleArrayDimension : ( ( rule__ArrayDimension__Group__0 ) ) ;
    public final void ruleArrayDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:91:2: ( ( ( rule__ArrayDimension__Group__0 ) ) )
            // InternalDeclarationLangauge.g:92:2: ( ( rule__ArrayDimension__Group__0 ) )
            {
            // InternalDeclarationLangauge.g:92:2: ( ( rule__ArrayDimension__Group__0 ) )
            // InternalDeclarationLangauge.g:93:3: ( rule__ArrayDimension__Group__0 )
            {
             before(grammarAccess.getArrayDimensionAccess().getGroup()); 
            // InternalDeclarationLangauge.g:94:3: ( rule__ArrayDimension__Group__0 )
            // InternalDeclarationLangauge.g:94:4: rule__ArrayDimension__Group__0
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
    // InternalDeclarationLangauge.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDeclarationLangauge.g:104:1: ( ruleEString EOF )
            // InternalDeclarationLangauge.g:105:1: ruleEString EOF
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
    // InternalDeclarationLangauge.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDeclarationLangauge.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDeclarationLangauge.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalDeclarationLangauge.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDeclarationLangauge.g:119:3: ( rule__EString__Alternatives )
            // InternalDeclarationLangauge.g:119:4: rule__EString__Alternatives
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
    // InternalDeclarationLangauge.g:128:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDeclarationLangauge.g:129:1: ( ruleEInt EOF )
            // InternalDeclarationLangauge.g:130:1: ruleEInt EOF
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
    // InternalDeclarationLangauge.g:137:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:141:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDeclarationLangauge.g:142:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDeclarationLangauge.g:142:2: ( ( rule__EInt__Group__0 ) )
            // InternalDeclarationLangauge.g:143:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDeclarationLangauge.g:144:3: ( rule__EInt__Group__0 )
            // InternalDeclarationLangauge.g:144:4: rule__EInt__Group__0
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
    // InternalDeclarationLangauge.g:153:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalDeclarationLangauge.g:154:1: ( ruleFQN EOF )
            // InternalDeclarationLangauge.g:155:1: ruleFQN EOF
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
    // InternalDeclarationLangauge.g:162:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:166:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalDeclarationLangauge.g:167:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalDeclarationLangauge.g:167:2: ( ( rule__FQN__Group__0 ) )
            // InternalDeclarationLangauge.g:168:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalDeclarationLangauge.g:169:3: ( rule__FQN__Group__0 )
            // InternalDeclarationLangauge.g:169:4: rule__FQN__Group__0
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
    // InternalDeclarationLangauge.g:177:1: rule__Attribute__Alternatives_5 : ( ( ( rule__Attribute__Group_5_0__0 ) ) | ( ';' ) | ( ( rule__Attribute__UnorderedGroup_5_2 )? ) );
    public final void rule__Attribute__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:181:1: ( ( ( rule__Attribute__Group_5_0__0 ) ) | ( ';' ) | ( ( rule__Attribute__UnorderedGroup_5_2 )? ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
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
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
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
                    // InternalDeclarationLangauge.g:182:2: ( ( rule__Attribute__Group_5_0__0 ) )
                    {
                    // InternalDeclarationLangauge.g:182:2: ( ( rule__Attribute__Group_5_0__0 ) )
                    // InternalDeclarationLangauge.g:183:3: ( rule__Attribute__Group_5_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_0()); 
                    // InternalDeclarationLangauge.g:184:3: ( rule__Attribute__Group_5_0__0 )
                    // InternalDeclarationLangauge.g:184:4: rule__Attribute__Group_5_0__0
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
                    // InternalDeclarationLangauge.g:188:2: ( ';' )
                    {
                    // InternalDeclarationLangauge.g:188:2: ( ';' )
                    // InternalDeclarationLangauge.g:189:3: ';'
                    {
                     before(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDeclarationLangauge.g:194:2: ( ( rule__Attribute__UnorderedGroup_5_2 )? )
                    {
                    // InternalDeclarationLangauge.g:194:2: ( ( rule__Attribute__UnorderedGroup_5_2 )? )
                    // InternalDeclarationLangauge.g:195:3: ( rule__Attribute__UnorderedGroup_5_2 )?
                    {
                     before(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2()); 
                    // InternalDeclarationLangauge.g:196:3: ( rule__Attribute__UnorderedGroup_5_2 )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( LA1_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                        alt1=1;
                    }
                    else if ( LA1_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                        alt1=1;
                    }
                    else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                        alt1=1;
                    }
                    else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                        alt1=1;
                    }
                    else if ( LA1_0 >= 19 && LA1_0 <= 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalDeclarationLangauge.g:196:4: rule__Attribute__UnorderedGroup_5_2
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
    // InternalDeclarationLangauge.g:204:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:208:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDeclarationLangauge.g:209:2: ( RULE_STRING )
                    {
                    // InternalDeclarationLangauge.g:209:2: ( RULE_STRING )
                    // InternalDeclarationLangauge.g:210:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeclarationLangauge.g:215:2: ( RULE_ID )
                    {
                    // InternalDeclarationLangauge.g:215:2: ( RULE_ID )
                    // InternalDeclarationLangauge.g:216:3: RULE_ID
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalDeclarationLangauge.g:225:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:229:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDeclarationLangauge.g:230:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalDeclarationLangauge.g:237:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__IsConstAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:241:1: ( ( ( rule__Attribute__IsConstAssignment_0 )? ) )
            // InternalDeclarationLangauge.g:242:1: ( ( rule__Attribute__IsConstAssignment_0 )? )
            {
            // InternalDeclarationLangauge.g:242:1: ( ( rule__Attribute__IsConstAssignment_0 )? )
            // InternalDeclarationLangauge.g:243:2: ( rule__Attribute__IsConstAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getIsConstAssignment_0()); 
            // InternalDeclarationLangauge.g:244:2: ( rule__Attribute__IsConstAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDeclarationLangauge.g:244:3: rule__Attribute__IsConstAssignment_0
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
    // InternalDeclarationLangauge.g:252:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:256:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDeclarationLangauge.g:257:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeclarationLangauge.g:264:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:268:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDeclarationLangauge.g:269:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDeclarationLangauge.g:269:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDeclarationLangauge.g:270:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDeclarationLangauge.g:271:2: ( rule__Attribute__NameAssignment_1 )
            // InternalDeclarationLangauge.g:271:3: rule__Attribute__NameAssignment_1
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
    // InternalDeclarationLangauge.g:279:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:283:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDeclarationLangauge.g:284:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalDeclarationLangauge.g:291:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:295:1: ( ( ':' ) )
            // InternalDeclarationLangauge.g:296:1: ( ':' )
            {
            // InternalDeclarationLangauge.g:296:1: ( ':' )
            // InternalDeclarationLangauge.g:297:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:306:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:310:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalDeclarationLangauge.g:311:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeclarationLangauge.g:318:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeOfAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:322:1: ( ( ( rule__Attribute__TypeOfAssignment_3 ) ) )
            // InternalDeclarationLangauge.g:323:1: ( ( rule__Attribute__TypeOfAssignment_3 ) )
            {
            // InternalDeclarationLangauge.g:323:1: ( ( rule__Attribute__TypeOfAssignment_3 ) )
            // InternalDeclarationLangauge.g:324:2: ( rule__Attribute__TypeOfAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeOfAssignment_3()); 
            // InternalDeclarationLangauge.g:325:2: ( rule__Attribute__TypeOfAssignment_3 )
            // InternalDeclarationLangauge.g:325:3: rule__Attribute__TypeOfAssignment_3
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
    // InternalDeclarationLangauge.g:333:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:337:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalDeclarationLangauge.g:338:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeclarationLangauge.g:345:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__DimensionsAssignment_4 )* ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:349:1: ( ( ( rule__Attribute__DimensionsAssignment_4 )* ) )
            // InternalDeclarationLangauge.g:350:1: ( ( rule__Attribute__DimensionsAssignment_4 )* )
            {
            // InternalDeclarationLangauge.g:350:1: ( ( rule__Attribute__DimensionsAssignment_4 )* )
            // InternalDeclarationLangauge.g:351:2: ( rule__Attribute__DimensionsAssignment_4 )*
            {
             before(grammarAccess.getAttributeAccess().getDimensionsAssignment_4()); 
            // InternalDeclarationLangauge.g:352:2: ( rule__Attribute__DimensionsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDeclarationLangauge.g:352:3: rule__Attribute__DimensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Attribute__DimensionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalDeclarationLangauge.g:360:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:364:1: ( rule__Attribute__Group__5__Impl )
            // InternalDeclarationLangauge.g:365:2: rule__Attribute__Group__5__Impl
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
    // InternalDeclarationLangauge.g:371:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Alternatives_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:375:1: ( ( ( rule__Attribute__Alternatives_5 ) ) )
            // InternalDeclarationLangauge.g:376:1: ( ( rule__Attribute__Alternatives_5 ) )
            {
            // InternalDeclarationLangauge.g:376:1: ( ( rule__Attribute__Alternatives_5 ) )
            // InternalDeclarationLangauge.g:377:2: ( rule__Attribute__Alternatives_5 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_5()); 
            // InternalDeclarationLangauge.g:378:2: ( rule__Attribute__Alternatives_5 )
            // InternalDeclarationLangauge.g:378:3: rule__Attribute__Alternatives_5
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
    // InternalDeclarationLangauge.g:387:1: rule__Attribute__Group_5_0__0 : rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1 ;
    public final void rule__Attribute__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:391:1: ( rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1 )
            // InternalDeclarationLangauge.g:392:2: rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1
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
    // InternalDeclarationLangauge.g:399:1: rule__Attribute__Group_5_0__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:403:1: ( ( '=' ) )
            // InternalDeclarationLangauge.g:404:1: ( '=' )
            {
            // InternalDeclarationLangauge.g:404:1: ( '=' )
            // InternalDeclarationLangauge.g:405:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:414:1: rule__Attribute__Group_5_0__1 : rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2 ;
    public final void rule__Attribute__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:418:1: ( rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2 )
            // InternalDeclarationLangauge.g:419:2: rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeclarationLangauge.g:426:1: rule__Attribute__Group_5_0__1__Impl : ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) ) ;
    public final void rule__Attribute__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:430:1: ( ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) ) )
            // InternalDeclarationLangauge.g:431:1: ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) )
            {
            // InternalDeclarationLangauge.g:431:1: ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) )
            // InternalDeclarationLangauge.g:432:2: ( rule__Attribute__ValueLiteralAssignment_5_0_1 )
            {
             before(grammarAccess.getAttributeAccess().getValueLiteralAssignment_5_0_1()); 
            // InternalDeclarationLangauge.g:433:2: ( rule__Attribute__ValueLiteralAssignment_5_0_1 )
            // InternalDeclarationLangauge.g:433:3: rule__Attribute__ValueLiteralAssignment_5_0_1
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
    // InternalDeclarationLangauge.g:441:1: rule__Attribute__Group_5_0__2 : rule__Attribute__Group_5_0__2__Impl ;
    public final void rule__Attribute__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:445:1: ( rule__Attribute__Group_5_0__2__Impl )
            // InternalDeclarationLangauge.g:446:2: rule__Attribute__Group_5_0__2__Impl
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
    // InternalDeclarationLangauge.g:452:1: rule__Attribute__Group_5_0__2__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:456:1: ( ( ';' ) )
            // InternalDeclarationLangauge.g:457:1: ( ';' )
            {
            // InternalDeclarationLangauge.g:457:1: ( ';' )
            // InternalDeclarationLangauge.g:458:2: ';'
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
    // InternalDeclarationLangauge.g:468:1: rule__Attribute__Group_5_2_0__0 : rule__Attribute__Group_5_2_0__0__Impl rule__Attribute__Group_5_2_0__1 ;
    public final void rule__Attribute__Group_5_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:472:1: ( rule__Attribute__Group_5_2_0__0__Impl rule__Attribute__Group_5_2_0__1 )
            // InternalDeclarationLangauge.g:473:2: rule__Attribute__Group_5_2_0__0__Impl rule__Attribute__Group_5_2_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeclarationLangauge.g:480:1: rule__Attribute__Group_5_2_0__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:484:1: ( ( '{' ) )
            // InternalDeclarationLangauge.g:485:1: ( '{' )
            {
            // InternalDeclarationLangauge.g:485:1: ( '{' )
            // InternalDeclarationLangauge.g:486:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:495:1: rule__Attribute__Group_5_2_0__1 : rule__Attribute__Group_5_2_0__1__Impl ;
    public final void rule__Attribute__Group_5_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:499:1: ( rule__Attribute__Group_5_2_0__1__Impl )
            // InternalDeclarationLangauge.g:500:2: rule__Attribute__Group_5_2_0__1__Impl
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
    // InternalDeclarationLangauge.g:506:1: rule__Attribute__Group_5_2_0__1__Impl : ( ( rule__Attribute__Group_5_2_0_1__0 )? ) ;
    public final void rule__Attribute__Group_5_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:510:1: ( ( ( rule__Attribute__Group_5_2_0_1__0 )? ) )
            // InternalDeclarationLangauge.g:511:1: ( ( rule__Attribute__Group_5_2_0_1__0 )? )
            {
            // InternalDeclarationLangauge.g:511:1: ( ( rule__Attribute__Group_5_2_0_1__0 )? )
            // InternalDeclarationLangauge.g:512:2: ( rule__Attribute__Group_5_2_0_1__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2_0_1()); 
            // InternalDeclarationLangauge.g:513:2: ( rule__Attribute__Group_5_2_0_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeclarationLangauge.g:513:3: rule__Attribute__Group_5_2_0_1__0
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
    // InternalDeclarationLangauge.g:522:1: rule__Attribute__Group_5_2_0_1__0 : rule__Attribute__Group_5_2_0_1__0__Impl rule__Attribute__Group_5_2_0_1__1 ;
    public final void rule__Attribute__Group_5_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:526:1: ( rule__Attribute__Group_5_2_0_1__0__Impl rule__Attribute__Group_5_2_0_1__1 )
            // InternalDeclarationLangauge.g:527:2: rule__Attribute__Group_5_2_0_1__0__Impl rule__Attribute__Group_5_2_0_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeclarationLangauge.g:534:1: rule__Attribute__Group_5_2_0_1__0__Impl : ( 'value' ) ;
    public final void rule__Attribute__Group_5_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:538:1: ( ( 'value' ) )
            // InternalDeclarationLangauge.g:539:1: ( 'value' )
            {
            // InternalDeclarationLangauge.g:539:1: ( 'value' )
            // InternalDeclarationLangauge.g:540:2: 'value'
            {
             before(grammarAccess.getAttributeAccess().getValueKeyword_5_2_0_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:549:1: rule__Attribute__Group_5_2_0_1__1 : rule__Attribute__Group_5_2_0_1__1__Impl rule__Attribute__Group_5_2_0_1__2 ;
    public final void rule__Attribute__Group_5_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:553:1: ( rule__Attribute__Group_5_2_0_1__1__Impl rule__Attribute__Group_5_2_0_1__2 )
            // InternalDeclarationLangauge.g:554:2: rule__Attribute__Group_5_2_0_1__1__Impl rule__Attribute__Group_5_2_0_1__2
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
    // InternalDeclarationLangauge.g:561:1: rule__Attribute__Group_5_2_0_1__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:565:1: ( ( ':' ) )
            // InternalDeclarationLangauge.g:566:1: ( ':' )
            {
            // InternalDeclarationLangauge.g:566:1: ( ':' )
            // InternalDeclarationLangauge.g:567:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_0_1_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:576:1: rule__Attribute__Group_5_2_0_1__2 : rule__Attribute__Group_5_2_0_1__2__Impl rule__Attribute__Group_5_2_0_1__3 ;
    public final void rule__Attribute__Group_5_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:580:1: ( rule__Attribute__Group_5_2_0_1__2__Impl rule__Attribute__Group_5_2_0_1__3 )
            // InternalDeclarationLangauge.g:581:2: rule__Attribute__Group_5_2_0_1__2__Impl rule__Attribute__Group_5_2_0_1__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeclarationLangauge.g:588:1: rule__Attribute__Group_5_2_0_1__2__Impl : ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) ) ;
    public final void rule__Attribute__Group_5_2_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:592:1: ( ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) ) )
            // InternalDeclarationLangauge.g:593:1: ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) )
            {
            // InternalDeclarationLangauge.g:593:1: ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) )
            // InternalDeclarationLangauge.g:594:2: ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueLiteralAssignment_5_2_0_1_2()); 
            // InternalDeclarationLangauge.g:595:2: ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 )
            // InternalDeclarationLangauge.g:595:3: rule__Attribute__ValueLiteralAssignment_5_2_0_1_2
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
    // InternalDeclarationLangauge.g:603:1: rule__Attribute__Group_5_2_0_1__3 : rule__Attribute__Group_5_2_0_1__3__Impl ;
    public final void rule__Attribute__Group_5_2_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:607:1: ( rule__Attribute__Group_5_2_0_1__3__Impl )
            // InternalDeclarationLangauge.g:608:2: rule__Attribute__Group_5_2_0_1__3__Impl
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
    // InternalDeclarationLangauge.g:614:1: rule__Attribute__Group_5_2_0_1__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:618:1: ( ( ';' ) )
            // InternalDeclarationLangauge.g:619:1: ( ';' )
            {
            // InternalDeclarationLangauge.g:619:1: ( ';' )
            // InternalDeclarationLangauge.g:620:2: ';'
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
    // InternalDeclarationLangauge.g:630:1: rule__Attribute__Group_5_2_1__0 : rule__Attribute__Group_5_2_1__0__Impl rule__Attribute__Group_5_2_1__1 ;
    public final void rule__Attribute__Group_5_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:634:1: ( rule__Attribute__Group_5_2_1__0__Impl rule__Attribute__Group_5_2_1__1 )
            // InternalDeclarationLangauge.g:635:2: rule__Attribute__Group_5_2_1__0__Impl rule__Attribute__Group_5_2_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeclarationLangauge.g:642:1: rule__Attribute__Group_5_2_1__0__Impl : ( 'max' ) ;
    public final void rule__Attribute__Group_5_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:646:1: ( ( 'max' ) )
            // InternalDeclarationLangauge.g:647:1: ( 'max' )
            {
            // InternalDeclarationLangauge.g:647:1: ( 'max' )
            // InternalDeclarationLangauge.g:648:2: 'max'
            {
             before(grammarAccess.getAttributeAccess().getMaxKeyword_5_2_1_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:657:1: rule__Attribute__Group_5_2_1__1 : rule__Attribute__Group_5_2_1__1__Impl rule__Attribute__Group_5_2_1__2 ;
    public final void rule__Attribute__Group_5_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:661:1: ( rule__Attribute__Group_5_2_1__1__Impl rule__Attribute__Group_5_2_1__2 )
            // InternalDeclarationLangauge.g:662:2: rule__Attribute__Group_5_2_1__1__Impl rule__Attribute__Group_5_2_1__2
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
    // InternalDeclarationLangauge.g:669:1: rule__Attribute__Group_5_2_1__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:673:1: ( ( ':' ) )
            // InternalDeclarationLangauge.g:674:1: ( ':' )
            {
            // InternalDeclarationLangauge.g:674:1: ( ':' )
            // InternalDeclarationLangauge.g:675:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_1_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:684:1: rule__Attribute__Group_5_2_1__2 : rule__Attribute__Group_5_2_1__2__Impl rule__Attribute__Group_5_2_1__3 ;
    public final void rule__Attribute__Group_5_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:688:1: ( rule__Attribute__Group_5_2_1__2__Impl rule__Attribute__Group_5_2_1__3 )
            // InternalDeclarationLangauge.g:689:2: rule__Attribute__Group_5_2_1__2__Impl rule__Attribute__Group_5_2_1__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeclarationLangauge.g:696:1: rule__Attribute__Group_5_2_1__2__Impl : ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) ) ;
    public final void rule__Attribute__Group_5_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:700:1: ( ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) ) )
            // InternalDeclarationLangauge.g:701:1: ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) )
            {
            // InternalDeclarationLangauge.g:701:1: ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) )
            // InternalDeclarationLangauge.g:702:2: ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getMaxValueLiteralAssignment_5_2_1_2()); 
            // InternalDeclarationLangauge.g:703:2: ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 )
            // InternalDeclarationLangauge.g:703:3: rule__Attribute__MaxValueLiteralAssignment_5_2_1_2
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
    // InternalDeclarationLangauge.g:711:1: rule__Attribute__Group_5_2_1__3 : rule__Attribute__Group_5_2_1__3__Impl ;
    public final void rule__Attribute__Group_5_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:715:1: ( rule__Attribute__Group_5_2_1__3__Impl )
            // InternalDeclarationLangauge.g:716:2: rule__Attribute__Group_5_2_1__3__Impl
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
    // InternalDeclarationLangauge.g:722:1: rule__Attribute__Group_5_2_1__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:726:1: ( ( ';' ) )
            // InternalDeclarationLangauge.g:727:1: ( ';' )
            {
            // InternalDeclarationLangauge.g:727:1: ( ';' )
            // InternalDeclarationLangauge.g:728:2: ';'
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
    // InternalDeclarationLangauge.g:738:1: rule__Attribute__Group_5_2_2__0 : rule__Attribute__Group_5_2_2__0__Impl rule__Attribute__Group_5_2_2__1 ;
    public final void rule__Attribute__Group_5_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:742:1: ( rule__Attribute__Group_5_2_2__0__Impl rule__Attribute__Group_5_2_2__1 )
            // InternalDeclarationLangauge.g:743:2: rule__Attribute__Group_5_2_2__0__Impl rule__Attribute__Group_5_2_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeclarationLangauge.g:750:1: rule__Attribute__Group_5_2_2__0__Impl : ( 'min' ) ;
    public final void rule__Attribute__Group_5_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:754:1: ( ( 'min' ) )
            // InternalDeclarationLangauge.g:755:1: ( 'min' )
            {
            // InternalDeclarationLangauge.g:755:1: ( 'min' )
            // InternalDeclarationLangauge.g:756:2: 'min'
            {
             before(grammarAccess.getAttributeAccess().getMinKeyword_5_2_2_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:765:1: rule__Attribute__Group_5_2_2__1 : rule__Attribute__Group_5_2_2__1__Impl rule__Attribute__Group_5_2_2__2 ;
    public final void rule__Attribute__Group_5_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:769:1: ( rule__Attribute__Group_5_2_2__1__Impl rule__Attribute__Group_5_2_2__2 )
            // InternalDeclarationLangauge.g:770:2: rule__Attribute__Group_5_2_2__1__Impl rule__Attribute__Group_5_2_2__2
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
    // InternalDeclarationLangauge.g:777:1: rule__Attribute__Group_5_2_2__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:781:1: ( ( ':' ) )
            // InternalDeclarationLangauge.g:782:1: ( ':' )
            {
            // InternalDeclarationLangauge.g:782:1: ( ':' )
            // InternalDeclarationLangauge.g:783:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_2_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:792:1: rule__Attribute__Group_5_2_2__2 : rule__Attribute__Group_5_2_2__2__Impl rule__Attribute__Group_5_2_2__3 ;
    public final void rule__Attribute__Group_5_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:796:1: ( rule__Attribute__Group_5_2_2__2__Impl rule__Attribute__Group_5_2_2__3 )
            // InternalDeclarationLangauge.g:797:2: rule__Attribute__Group_5_2_2__2__Impl rule__Attribute__Group_5_2_2__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeclarationLangauge.g:804:1: rule__Attribute__Group_5_2_2__2__Impl : ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) ) ;
    public final void rule__Attribute__Group_5_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:808:1: ( ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) ) )
            // InternalDeclarationLangauge.g:809:1: ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) )
            {
            // InternalDeclarationLangauge.g:809:1: ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) )
            // InternalDeclarationLangauge.g:810:2: ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 )
            {
             before(grammarAccess.getAttributeAccess().getMinValueLiteralAssignment_5_2_2_2()); 
            // InternalDeclarationLangauge.g:811:2: ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 )
            // InternalDeclarationLangauge.g:811:3: rule__Attribute__MinValueLiteralAssignment_5_2_2_2
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
    // InternalDeclarationLangauge.g:819:1: rule__Attribute__Group_5_2_2__3 : rule__Attribute__Group_5_2_2__3__Impl ;
    public final void rule__Attribute__Group_5_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:823:1: ( rule__Attribute__Group_5_2_2__3__Impl )
            // InternalDeclarationLangauge.g:824:2: rule__Attribute__Group_5_2_2__3__Impl
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
    // InternalDeclarationLangauge.g:830:1: rule__Attribute__Group_5_2_2__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:834:1: ( ( ';' ) )
            // InternalDeclarationLangauge.g:835:1: ( ';' )
            {
            // InternalDeclarationLangauge.g:835:1: ( ';' )
            // InternalDeclarationLangauge.g:836:2: ';'
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
    // InternalDeclarationLangauge.g:846:1: rule__Attribute__Group_5_2_3__0 : rule__Attribute__Group_5_2_3__0__Impl rule__Attribute__Group_5_2_3__1 ;
    public final void rule__Attribute__Group_5_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:850:1: ( rule__Attribute__Group_5_2_3__0__Impl rule__Attribute__Group_5_2_3__1 )
            // InternalDeclarationLangauge.g:851:2: rule__Attribute__Group_5_2_3__0__Impl rule__Attribute__Group_5_2_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeclarationLangauge.g:858:1: rule__Attribute__Group_5_2_3__0__Impl : ( 'referenceFrame' ) ;
    public final void rule__Attribute__Group_5_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:862:1: ( ( 'referenceFrame' ) )
            // InternalDeclarationLangauge.g:863:1: ( 'referenceFrame' )
            {
            // InternalDeclarationLangauge.g:863:1: ( 'referenceFrame' )
            // InternalDeclarationLangauge.g:864:2: 'referenceFrame'
            {
             before(grammarAccess.getAttributeAccess().getReferenceFrameKeyword_5_2_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:873:1: rule__Attribute__Group_5_2_3__1 : rule__Attribute__Group_5_2_3__1__Impl rule__Attribute__Group_5_2_3__2 ;
    public final void rule__Attribute__Group_5_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:877:1: ( rule__Attribute__Group_5_2_3__1__Impl rule__Attribute__Group_5_2_3__2 )
            // InternalDeclarationLangauge.g:878:2: rule__Attribute__Group_5_2_3__1__Impl rule__Attribute__Group_5_2_3__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDeclarationLangauge.g:885:1: rule__Attribute__Group_5_2_3__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:889:1: ( ( ':' ) )
            // InternalDeclarationLangauge.g:890:1: ( ':' )
            {
            // InternalDeclarationLangauge.g:890:1: ( ':' )
            // InternalDeclarationLangauge.g:891:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_3_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:900:1: rule__Attribute__Group_5_2_3__2 : rule__Attribute__Group_5_2_3__2__Impl rule__Attribute__Group_5_2_3__3 ;
    public final void rule__Attribute__Group_5_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:904:1: ( rule__Attribute__Group_5_2_3__2__Impl rule__Attribute__Group_5_2_3__3 )
            // InternalDeclarationLangauge.g:905:2: rule__Attribute__Group_5_2_3__2__Impl rule__Attribute__Group_5_2_3__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeclarationLangauge.g:912:1: rule__Attribute__Group_5_2_3__2__Impl : ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) ) ;
    public final void rule__Attribute__Group_5_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:916:1: ( ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) ) )
            // InternalDeclarationLangauge.g:917:1: ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) )
            {
            // InternalDeclarationLangauge.g:917:1: ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) )
            // InternalDeclarationLangauge.g:918:2: ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 )
            {
             before(grammarAccess.getAttributeAccess().getReferenceFrameAssignment_5_2_3_2()); 
            // InternalDeclarationLangauge.g:919:2: ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 )
            // InternalDeclarationLangauge.g:919:3: rule__Attribute__ReferenceFrameAssignment_5_2_3_2
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
    // InternalDeclarationLangauge.g:927:1: rule__Attribute__Group_5_2_3__3 : rule__Attribute__Group_5_2_3__3__Impl ;
    public final void rule__Attribute__Group_5_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:931:1: ( rule__Attribute__Group_5_2_3__3__Impl )
            // InternalDeclarationLangauge.g:932:2: rule__Attribute__Group_5_2_3__3__Impl
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
    // InternalDeclarationLangauge.g:938:1: rule__Attribute__Group_5_2_3__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:942:1: ( ( ';' ) )
            // InternalDeclarationLangauge.g:943:1: ( ';' )
            {
            // InternalDeclarationLangauge.g:943:1: ( ';' )
            // InternalDeclarationLangauge.g:944:2: ';'
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
    // InternalDeclarationLangauge.g:954:1: rule__Attribute__Group_5_2_4__0 : rule__Attribute__Group_5_2_4__0__Impl rule__Attribute__Group_5_2_4__1 ;
    public final void rule__Attribute__Group_5_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:958:1: ( rule__Attribute__Group_5_2_4__0__Impl rule__Attribute__Group_5_2_4__1 )
            // InternalDeclarationLangauge.g:959:2: rule__Attribute__Group_5_2_4__0__Impl rule__Attribute__Group_5_2_4__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDeclarationLangauge.g:966:1: rule__Attribute__Group_5_2_4__0__Impl : ( ( rule__Attribute__Group_5_2_4_0__0 )? ) ;
    public final void rule__Attribute__Group_5_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:970:1: ( ( ( rule__Attribute__Group_5_2_4_0__0 )? ) )
            // InternalDeclarationLangauge.g:971:1: ( ( rule__Attribute__Group_5_2_4_0__0 )? )
            {
            // InternalDeclarationLangauge.g:971:1: ( ( rule__Attribute__Group_5_2_4_0__0 )? )
            // InternalDeclarationLangauge.g:972:2: ( rule__Attribute__Group_5_2_4_0__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2_4_0()); 
            // InternalDeclarationLangauge.g:973:2: ( rule__Attribute__Group_5_2_4_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeclarationLangauge.g:973:3: rule__Attribute__Group_5_2_4_0__0
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
    // InternalDeclarationLangauge.g:981:1: rule__Attribute__Group_5_2_4__1 : rule__Attribute__Group_5_2_4__1__Impl rule__Attribute__Group_5_2_4__2 ;
    public final void rule__Attribute__Group_5_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:985:1: ( rule__Attribute__Group_5_2_4__1__Impl rule__Attribute__Group_5_2_4__2 )
            // InternalDeclarationLangauge.g:986:2: rule__Attribute__Group_5_2_4__1__Impl rule__Attribute__Group_5_2_4__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeclarationLangauge.g:993:1: rule__Attribute__Group_5_2_4__1__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:997:1: ( ( '}' ) )
            // InternalDeclarationLangauge.g:998:1: ( '}' )
            {
            // InternalDeclarationLangauge.g:998:1: ( '}' )
            // InternalDeclarationLangauge.g:999:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:1008:1: rule__Attribute__Group_5_2_4__2 : rule__Attribute__Group_5_2_4__2__Impl ;
    public final void rule__Attribute__Group_5_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1012:1: ( rule__Attribute__Group_5_2_4__2__Impl )
            // InternalDeclarationLangauge.g:1013:2: rule__Attribute__Group_5_2_4__2__Impl
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
    // InternalDeclarationLangauge.g:1019:1: rule__Attribute__Group_5_2_4__2__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1023:1: ( ( ';' ) )
            // InternalDeclarationLangauge.g:1024:1: ( ';' )
            {
            // InternalDeclarationLangauge.g:1024:1: ( ';' )
            // InternalDeclarationLangauge.g:1025:2: ';'
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
    // InternalDeclarationLangauge.g:1035:1: rule__Attribute__Group_5_2_4_0__0 : rule__Attribute__Group_5_2_4_0__0__Impl rule__Attribute__Group_5_2_4_0__1 ;
    public final void rule__Attribute__Group_5_2_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1039:1: ( rule__Attribute__Group_5_2_4_0__0__Impl rule__Attribute__Group_5_2_4_0__1 )
            // InternalDeclarationLangauge.g:1040:2: rule__Attribute__Group_5_2_4_0__0__Impl rule__Attribute__Group_5_2_4_0__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeclarationLangauge.g:1047:1: rule__Attribute__Group_5_2_4_0__0__Impl : ( 'unit' ) ;
    public final void rule__Attribute__Group_5_2_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1051:1: ( ( 'unit' ) )
            // InternalDeclarationLangauge.g:1052:1: ( 'unit' )
            {
            // InternalDeclarationLangauge.g:1052:1: ( 'unit' )
            // InternalDeclarationLangauge.g:1053:2: 'unit'
            {
             before(grammarAccess.getAttributeAccess().getUnitKeyword_5_2_4_0_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:1062:1: rule__Attribute__Group_5_2_4_0__1 : rule__Attribute__Group_5_2_4_0__1__Impl rule__Attribute__Group_5_2_4_0__2 ;
    public final void rule__Attribute__Group_5_2_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1066:1: ( rule__Attribute__Group_5_2_4_0__1__Impl rule__Attribute__Group_5_2_4_0__2 )
            // InternalDeclarationLangauge.g:1067:2: rule__Attribute__Group_5_2_4_0__1__Impl rule__Attribute__Group_5_2_4_0__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDeclarationLangauge.g:1074:1: rule__Attribute__Group_5_2_4_0__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1078:1: ( ( ':' ) )
            // InternalDeclarationLangauge.g:1079:1: ( ':' )
            {
            // InternalDeclarationLangauge.g:1079:1: ( ':' )
            // InternalDeclarationLangauge.g:1080:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_4_0_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:1089:1: rule__Attribute__Group_5_2_4_0__2 : rule__Attribute__Group_5_2_4_0__2__Impl rule__Attribute__Group_5_2_4_0__3 ;
    public final void rule__Attribute__Group_5_2_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1093:1: ( rule__Attribute__Group_5_2_4_0__2__Impl rule__Attribute__Group_5_2_4_0__3 )
            // InternalDeclarationLangauge.g:1094:2: rule__Attribute__Group_5_2_4_0__2__Impl rule__Attribute__Group_5_2_4_0__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeclarationLangauge.g:1101:1: rule__Attribute__Group_5_2_4_0__2__Impl : ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) ) ;
    public final void rule__Attribute__Group_5_2_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1105:1: ( ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) ) )
            // InternalDeclarationLangauge.g:1106:1: ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) )
            {
            // InternalDeclarationLangauge.g:1106:1: ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) )
            // InternalDeclarationLangauge.g:1107:2: ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeUnitAssignment_5_2_4_0_2()); 
            // InternalDeclarationLangauge.g:1108:2: ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 )
            // InternalDeclarationLangauge.g:1108:3: rule__Attribute__TypeUnitAssignment_5_2_4_0_2
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
    // InternalDeclarationLangauge.g:1116:1: rule__Attribute__Group_5_2_4_0__3 : rule__Attribute__Group_5_2_4_0__3__Impl ;
    public final void rule__Attribute__Group_5_2_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1120:1: ( rule__Attribute__Group_5_2_4_0__3__Impl )
            // InternalDeclarationLangauge.g:1121:2: rule__Attribute__Group_5_2_4_0__3__Impl
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
    // InternalDeclarationLangauge.g:1127:1: rule__Attribute__Group_5_2_4_0__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1131:1: ( ( ';' ) )
            // InternalDeclarationLangauge.g:1132:1: ( ';' )
            {
            // InternalDeclarationLangauge.g:1132:1: ( ';' )
            // InternalDeclarationLangauge.g:1133:2: ';'
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
    // InternalDeclarationLangauge.g:1143:1: rule__ArrayDimension__Group__0 : rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1 ;
    public final void rule__ArrayDimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1147:1: ( rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1 )
            // InternalDeclarationLangauge.g:1148:2: rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDeclarationLangauge.g:1155:1: rule__ArrayDimension__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayDimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1159:1: ( ( '[' ) )
            // InternalDeclarationLangauge.g:1160:1: ( '[' )
            {
            // InternalDeclarationLangauge.g:1160:1: ( '[' )
            // InternalDeclarationLangauge.g:1161:2: '['
            {
             before(grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:1170:1: rule__ArrayDimension__Group__1 : rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2 ;
    public final void rule__ArrayDimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1174:1: ( rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2 )
            // InternalDeclarationLangauge.g:1175:2: rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalDeclarationLangauge.g:1182:1: rule__ArrayDimension__Group__1__Impl : ( ( rule__ArrayDimension__SizeAssignment_1 ) ) ;
    public final void rule__ArrayDimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1186:1: ( ( ( rule__ArrayDimension__SizeAssignment_1 ) ) )
            // InternalDeclarationLangauge.g:1187:1: ( ( rule__ArrayDimension__SizeAssignment_1 ) )
            {
            // InternalDeclarationLangauge.g:1187:1: ( ( rule__ArrayDimension__SizeAssignment_1 ) )
            // InternalDeclarationLangauge.g:1188:2: ( rule__ArrayDimension__SizeAssignment_1 )
            {
             before(grammarAccess.getArrayDimensionAccess().getSizeAssignment_1()); 
            // InternalDeclarationLangauge.g:1189:2: ( rule__ArrayDimension__SizeAssignment_1 )
            // InternalDeclarationLangauge.g:1189:3: rule__ArrayDimension__SizeAssignment_1
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
    // InternalDeclarationLangauge.g:1197:1: rule__ArrayDimension__Group__2 : rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3 ;
    public final void rule__ArrayDimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1201:1: ( rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3 )
            // InternalDeclarationLangauge.g:1202:2: rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalDeclarationLangauge.g:1209:1: rule__ArrayDimension__Group__2__Impl : ( ( rule__ArrayDimension__Group_2__0 )? ) ;
    public final void rule__ArrayDimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1213:1: ( ( ( rule__ArrayDimension__Group_2__0 )? ) )
            // InternalDeclarationLangauge.g:1214:1: ( ( rule__ArrayDimension__Group_2__0 )? )
            {
            // InternalDeclarationLangauge.g:1214:1: ( ( rule__ArrayDimension__Group_2__0 )? )
            // InternalDeclarationLangauge.g:1215:2: ( rule__ArrayDimension__Group_2__0 )?
            {
             before(grammarAccess.getArrayDimensionAccess().getGroup_2()); 
            // InternalDeclarationLangauge.g:1216:2: ( rule__ArrayDimension__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeclarationLangauge.g:1216:3: rule__ArrayDimension__Group_2__0
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
    // InternalDeclarationLangauge.g:1224:1: rule__ArrayDimension__Group__3 : rule__ArrayDimension__Group__3__Impl ;
    public final void rule__ArrayDimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1228:1: ( rule__ArrayDimension__Group__3__Impl )
            // InternalDeclarationLangauge.g:1229:2: rule__ArrayDimension__Group__3__Impl
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
    // InternalDeclarationLangauge.g:1235:1: rule__ArrayDimension__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayDimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1239:1: ( ( ']' ) )
            // InternalDeclarationLangauge.g:1240:1: ( ']' )
            {
            // InternalDeclarationLangauge.g:1240:1: ( ']' )
            // InternalDeclarationLangauge.g:1241:2: ']'
            {
             before(grammarAccess.getArrayDimensionAccess().getRightSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:1251:1: rule__ArrayDimension__Group_2__0 : rule__ArrayDimension__Group_2__0__Impl rule__ArrayDimension__Group_2__1 ;
    public final void rule__ArrayDimension__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1255:1: ( rule__ArrayDimension__Group_2__0__Impl rule__ArrayDimension__Group_2__1 )
            // InternalDeclarationLangauge.g:1256:2: rule__ArrayDimension__Group_2__0__Impl rule__ArrayDimension__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDeclarationLangauge.g:1263:1: rule__ArrayDimension__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayDimension__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1267:1: ( ( ',' ) )
            // InternalDeclarationLangauge.g:1268:1: ( ',' )
            {
            // InternalDeclarationLangauge.g:1268:1: ( ',' )
            // InternalDeclarationLangauge.g:1269:2: ','
            {
             before(grammarAccess.getArrayDimensionAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:1278:1: rule__ArrayDimension__Group_2__1 : rule__ArrayDimension__Group_2__1__Impl rule__ArrayDimension__Group_2__2 ;
    public final void rule__ArrayDimension__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1282:1: ( rule__ArrayDimension__Group_2__1__Impl rule__ArrayDimension__Group_2__2 )
            // InternalDeclarationLangauge.g:1283:2: rule__ArrayDimension__Group_2__1__Impl rule__ArrayDimension__Group_2__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDeclarationLangauge.g:1290:1: rule__ArrayDimension__Group_2__1__Impl : ( 'name' ) ;
    public final void rule__ArrayDimension__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1294:1: ( ( 'name' ) )
            // InternalDeclarationLangauge.g:1295:1: ( 'name' )
            {
            // InternalDeclarationLangauge.g:1295:1: ( 'name' )
            // InternalDeclarationLangauge.g:1296:2: 'name'
            {
             before(grammarAccess.getArrayDimensionAccess().getNameKeyword_2_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:1305:1: rule__ArrayDimension__Group_2__2 : rule__ArrayDimension__Group_2__2__Impl rule__ArrayDimension__Group_2__3 ;
    public final void rule__ArrayDimension__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1309:1: ( rule__ArrayDimension__Group_2__2__Impl rule__ArrayDimension__Group_2__3 )
            // InternalDeclarationLangauge.g:1310:2: rule__ArrayDimension__Group_2__2__Impl rule__ArrayDimension__Group_2__3
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
    // InternalDeclarationLangauge.g:1317:1: rule__ArrayDimension__Group_2__2__Impl : ( '=' ) ;
    public final void rule__ArrayDimension__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1321:1: ( ( '=' ) )
            // InternalDeclarationLangauge.g:1322:1: ( '=' )
            {
            // InternalDeclarationLangauge.g:1322:1: ( '=' )
            // InternalDeclarationLangauge.g:1323:2: '='
            {
             before(grammarAccess.getArrayDimensionAccess().getEqualsSignKeyword_2_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:1332:1: rule__ArrayDimension__Group_2__3 : rule__ArrayDimension__Group_2__3__Impl ;
    public final void rule__ArrayDimension__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1336:1: ( rule__ArrayDimension__Group_2__3__Impl )
            // InternalDeclarationLangauge.g:1337:2: rule__ArrayDimension__Group_2__3__Impl
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
    // InternalDeclarationLangauge.g:1343:1: rule__ArrayDimension__Group_2__3__Impl : ( ( rule__ArrayDimension__NameAssignment_2_3 ) ) ;
    public final void rule__ArrayDimension__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1347:1: ( ( ( rule__ArrayDimension__NameAssignment_2_3 ) ) )
            // InternalDeclarationLangauge.g:1348:1: ( ( rule__ArrayDimension__NameAssignment_2_3 ) )
            {
            // InternalDeclarationLangauge.g:1348:1: ( ( rule__ArrayDimension__NameAssignment_2_3 ) )
            // InternalDeclarationLangauge.g:1349:2: ( rule__ArrayDimension__NameAssignment_2_3 )
            {
             before(grammarAccess.getArrayDimensionAccess().getNameAssignment_2_3()); 
            // InternalDeclarationLangauge.g:1350:2: ( rule__ArrayDimension__NameAssignment_2_3 )
            // InternalDeclarationLangauge.g:1350:3: rule__ArrayDimension__NameAssignment_2_3
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
    // InternalDeclarationLangauge.g:1359:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1363:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDeclarationLangauge.g:1364:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDeclarationLangauge.g:1371:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1375:1: ( ( ( '-' )? ) )
            // InternalDeclarationLangauge.g:1376:1: ( ( '-' )? )
            {
            // InternalDeclarationLangauge.g:1376:1: ( ( '-' )? )
            // InternalDeclarationLangauge.g:1377:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDeclarationLangauge.g:1378:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeclarationLangauge.g:1378:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalDeclarationLangauge.g:1386:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1390:1: ( rule__EInt__Group__1__Impl )
            // InternalDeclarationLangauge.g:1391:2: rule__EInt__Group__1__Impl
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
    // InternalDeclarationLangauge.g:1397:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1401:1: ( ( RULE_INT ) )
            // InternalDeclarationLangauge.g:1402:1: ( RULE_INT )
            {
            // InternalDeclarationLangauge.g:1402:1: ( RULE_INT )
            // InternalDeclarationLangauge.g:1403:2: RULE_INT
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
    // InternalDeclarationLangauge.g:1413:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1417:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalDeclarationLangauge.g:1418:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDeclarationLangauge.g:1425:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1429:1: ( ( RULE_ID ) )
            // InternalDeclarationLangauge.g:1430:1: ( RULE_ID )
            {
            // InternalDeclarationLangauge.g:1430:1: ( RULE_ID )
            // InternalDeclarationLangauge.g:1431:2: RULE_ID
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
    // InternalDeclarationLangauge.g:1440:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1444:1: ( rule__FQN__Group__1__Impl )
            // InternalDeclarationLangauge.g:1445:2: rule__FQN__Group__1__Impl
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
    // InternalDeclarationLangauge.g:1451:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1455:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalDeclarationLangauge.g:1456:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalDeclarationLangauge.g:1456:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalDeclarationLangauge.g:1457:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalDeclarationLangauge.g:1458:2: ( rule__FQN__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDeclarationLangauge.g:1458:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDeclarationLangauge.g:1467:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1471:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalDeclarationLangauge.g:1472:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalDeclarationLangauge.g:1479:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1483:1: ( ( '.' ) )
            // InternalDeclarationLangauge.g:1484:1: ( '.' )
            {
            // InternalDeclarationLangauge.g:1484:1: ( '.' )
            // InternalDeclarationLangauge.g:1485:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:1494:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1498:1: ( rule__FQN__Group_1__1__Impl )
            // InternalDeclarationLangauge.g:1499:2: rule__FQN__Group_1__1__Impl
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
    // InternalDeclarationLangauge.g:1505:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1509:1: ( ( RULE_ID ) )
            // InternalDeclarationLangauge.g:1510:1: ( RULE_ID )
            {
            // InternalDeclarationLangauge.g:1510:1: ( RULE_ID )
            // InternalDeclarationLangauge.g:1511:2: RULE_ID
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


    // $ANTLR start "rule__Attribute__UnorderedGroup_5_2"
    // InternalDeclarationLangauge.g:1521:1: rule__Attribute__UnorderedGroup_5_2 : rule__Attribute__UnorderedGroup_5_2__0 {...}?;
    public final void rule__Attribute__UnorderedGroup_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
        	
        try {
            // InternalDeclarationLangauge.g:1526:1: ( rule__Attribute__UnorderedGroup_5_2__0 {...}?)
            // InternalDeclarationLangauge.g:1527:2: rule__Attribute__UnorderedGroup_5_2__0 {...}?
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
    // InternalDeclarationLangauge.g:1535:1: rule__Attribute__UnorderedGroup_5_2__Impl : ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) ) ;
    public final void rule__Attribute__UnorderedGroup_5_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalDeclarationLangauge.g:1540:1: ( ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) ) )
            // InternalDeclarationLangauge.g:1541:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) )
            {
            // InternalDeclarationLangauge.g:1541:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) )
            int alt11=5;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt11=2;
            }
            else if ( LA11_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt11=3;
            }
            else if ( LA11_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt11=4;
            }
            else if ( LA11_0 >= 19 && LA11_0 <= 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt11=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDeclarationLangauge.g:1542:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) )
                    {
                    // InternalDeclarationLangauge.g:1542:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) )
                    // InternalDeclarationLangauge.g:1543:4: {...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0)");
                    }
                    // InternalDeclarationLangauge.g:1543:107: ( ( ( rule__Attribute__Group_5_2_0__0 ) ) )
                    // InternalDeclarationLangauge.g:1544:5: ( ( rule__Attribute__Group_5_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalDeclarationLangauge.g:1550:5: ( ( rule__Attribute__Group_5_2_0__0 ) )
                    // InternalDeclarationLangauge.g:1551:6: ( rule__Attribute__Group_5_2_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_0()); 
                    // InternalDeclarationLangauge.g:1552:6: ( rule__Attribute__Group_5_2_0__0 )
                    // InternalDeclarationLangauge.g:1552:7: rule__Attribute__Group_5_2_0__0
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
                    // InternalDeclarationLangauge.g:1557:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) )
                    {
                    // InternalDeclarationLangauge.g:1557:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) )
                    // InternalDeclarationLangauge.g:1558:4: {...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1)");
                    }
                    // InternalDeclarationLangauge.g:1558:107: ( ( ( rule__Attribute__Group_5_2_1__0 ) ) )
                    // InternalDeclarationLangauge.g:1559:5: ( ( rule__Attribute__Group_5_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalDeclarationLangauge.g:1565:5: ( ( rule__Attribute__Group_5_2_1__0 ) )
                    // InternalDeclarationLangauge.g:1566:6: ( rule__Attribute__Group_5_2_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_1()); 
                    // InternalDeclarationLangauge.g:1567:6: ( rule__Attribute__Group_5_2_1__0 )
                    // InternalDeclarationLangauge.g:1567:7: rule__Attribute__Group_5_2_1__0
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
                    // InternalDeclarationLangauge.g:1572:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) )
                    {
                    // InternalDeclarationLangauge.g:1572:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) )
                    // InternalDeclarationLangauge.g:1573:4: {...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2)");
                    }
                    // InternalDeclarationLangauge.g:1573:107: ( ( ( rule__Attribute__Group_5_2_2__0 ) ) )
                    // InternalDeclarationLangauge.g:1574:5: ( ( rule__Attribute__Group_5_2_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2);
                    				

                    					selected = true;
                    				
                    // InternalDeclarationLangauge.g:1580:5: ( ( rule__Attribute__Group_5_2_2__0 ) )
                    // InternalDeclarationLangauge.g:1581:6: ( rule__Attribute__Group_5_2_2__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_2()); 
                    // InternalDeclarationLangauge.g:1582:6: ( rule__Attribute__Group_5_2_2__0 )
                    // InternalDeclarationLangauge.g:1582:7: rule__Attribute__Group_5_2_2__0
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
                    // InternalDeclarationLangauge.g:1587:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) )
                    {
                    // InternalDeclarationLangauge.g:1587:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) )
                    // InternalDeclarationLangauge.g:1588:4: {...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3)");
                    }
                    // InternalDeclarationLangauge.g:1588:107: ( ( ( rule__Attribute__Group_5_2_3__0 ) ) )
                    // InternalDeclarationLangauge.g:1589:5: ( ( rule__Attribute__Group_5_2_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3);
                    				

                    					selected = true;
                    				
                    // InternalDeclarationLangauge.g:1595:5: ( ( rule__Attribute__Group_5_2_3__0 ) )
                    // InternalDeclarationLangauge.g:1596:6: ( rule__Attribute__Group_5_2_3__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_3()); 
                    // InternalDeclarationLangauge.g:1597:6: ( rule__Attribute__Group_5_2_3__0 )
                    // InternalDeclarationLangauge.g:1597:7: rule__Attribute__Group_5_2_3__0
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
                    // InternalDeclarationLangauge.g:1602:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) )
                    {
                    // InternalDeclarationLangauge.g:1602:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) )
                    // InternalDeclarationLangauge.g:1603:4: {...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4)");
                    }
                    // InternalDeclarationLangauge.g:1603:107: ( ( ( rule__Attribute__Group_5_2_4__0 ) ) )
                    // InternalDeclarationLangauge.g:1604:5: ( ( rule__Attribute__Group_5_2_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4);
                    				

                    					selected = true;
                    				
                    // InternalDeclarationLangauge.g:1610:5: ( ( rule__Attribute__Group_5_2_4__0 ) )
                    // InternalDeclarationLangauge.g:1611:6: ( rule__Attribute__Group_5_2_4__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_4()); 
                    // InternalDeclarationLangauge.g:1612:6: ( rule__Attribute__Group_5_2_4__0 )
                    // InternalDeclarationLangauge.g:1612:7: rule__Attribute__Group_5_2_4__0
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
    // InternalDeclarationLangauge.g:1625:1: rule__Attribute__UnorderedGroup_5_2__0 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__1 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1629:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__1 )? )
            // InternalDeclarationLangauge.g:1630:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__1 )?
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalDeclarationLangauge.g:1631:2: ( rule__Attribute__UnorderedGroup_5_2__1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt12=1;
            }
            else if ( LA12_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt12=1;
            }
            else if ( LA12_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt12=1;
            }
            else if ( LA12_0 >= 19 && LA12_0 <= 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeclarationLangauge.g:1631:2: rule__Attribute__UnorderedGroup_5_2__1
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
    // InternalDeclarationLangauge.g:1637:1: rule__Attribute__UnorderedGroup_5_2__1 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__2 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1641:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__2 )? )
            // InternalDeclarationLangauge.g:1642:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__2 )?
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalDeclarationLangauge.g:1643:2: ( rule__Attribute__UnorderedGroup_5_2__2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt13=1;
            }
            else if ( LA13_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt13=1;
            }
            else if ( LA13_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt13=1;
            }
            else if ( LA13_0 >= 19 && LA13_0 <= 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeclarationLangauge.g:1643:2: rule__Attribute__UnorderedGroup_5_2__2
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
    // InternalDeclarationLangauge.g:1649:1: rule__Attribute__UnorderedGroup_5_2__2 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__3 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1653:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__3 )? )
            // InternalDeclarationLangauge.g:1654:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__3 )?
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalDeclarationLangauge.g:1655:2: ( rule__Attribute__UnorderedGroup_5_2__3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt14=1;
            }
            else if ( LA14_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt14=1;
            }
            else if ( LA14_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt14=1;
            }
            else if ( LA14_0 >= 19 && LA14_0 <= 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDeclarationLangauge.g:1655:2: rule__Attribute__UnorderedGroup_5_2__3
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
    // InternalDeclarationLangauge.g:1661:1: rule__Attribute__UnorderedGroup_5_2__3 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__4 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1665:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__4 )? )
            // InternalDeclarationLangauge.g:1666:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__4 )?
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalDeclarationLangauge.g:1667:2: ( rule__Attribute__UnorderedGroup_5_2__4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt15=1;
            }
            else if ( LA15_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt15=1;
            }
            else if ( LA15_0 >= 19 && LA15_0 <= 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDeclarationLangauge.g:1667:2: rule__Attribute__UnorderedGroup_5_2__4
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
    // InternalDeclarationLangauge.g:1673:1: rule__Attribute__UnorderedGroup_5_2__4 : rule__Attribute__UnorderedGroup_5_2__Impl ;
    public final void rule__Attribute__UnorderedGroup_5_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1677:1: ( rule__Attribute__UnorderedGroup_5_2__Impl )
            // InternalDeclarationLangauge.g:1678:2: rule__Attribute__UnorderedGroup_5_2__Impl
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


    // $ANTLR start "rule__Attribute__IsConstAssignment_0"
    // InternalDeclarationLangauge.g:1685:1: rule__Attribute__IsConstAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__Attribute__IsConstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1689:1: ( ( ( 'const' ) ) )
            // InternalDeclarationLangauge.g:1690:2: ( ( 'const' ) )
            {
            // InternalDeclarationLangauge.g:1690:2: ( ( 'const' ) )
            // InternalDeclarationLangauge.g:1691:3: ( 'const' )
            {
             before(grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0()); 
            // InternalDeclarationLangauge.g:1692:3: ( 'const' )
            // InternalDeclarationLangauge.g:1693:4: 'const'
            {
             before(grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDeclarationLangauge.g:1704:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1708:1: ( ( ruleEString ) )
            // InternalDeclarationLangauge.g:1709:2: ( ruleEString )
            {
            // InternalDeclarationLangauge.g:1709:2: ( ruleEString )
            // InternalDeclarationLangauge.g:1710:3: ruleEString
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
    // InternalDeclarationLangauge.g:1719:1: rule__Attribute__TypeOfAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__TypeOfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1723:1: ( ( ( ruleFQN ) ) )
            // InternalDeclarationLangauge.g:1724:2: ( ( ruleFQN ) )
            {
            // InternalDeclarationLangauge.g:1724:2: ( ( ruleFQN ) )
            // InternalDeclarationLangauge.g:1725:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getTypeOfITypeCrossReference_3_0()); 
            // InternalDeclarationLangauge.g:1726:3: ( ruleFQN )
            // InternalDeclarationLangauge.g:1727:4: ruleFQN
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
    // InternalDeclarationLangauge.g:1738:1: rule__Attribute__DimensionsAssignment_4 : ( ruleArrayDimension ) ;
    public final void rule__Attribute__DimensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1742:1: ( ( ruleArrayDimension ) )
            // InternalDeclarationLangauge.g:1743:2: ( ruleArrayDimension )
            {
            // InternalDeclarationLangauge.g:1743:2: ( ruleArrayDimension )
            // InternalDeclarationLangauge.g:1744:3: ruleArrayDimension
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
    // InternalDeclarationLangauge.g:1753:1: rule__Attribute__ValueLiteralAssignment_5_0_1 : ( ruleEString ) ;
    public final void rule__Attribute__ValueLiteralAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1757:1: ( ( ruleEString ) )
            // InternalDeclarationLangauge.g:1758:2: ( ruleEString )
            {
            // InternalDeclarationLangauge.g:1758:2: ( ruleEString )
            // InternalDeclarationLangauge.g:1759:3: ruleEString
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
    // InternalDeclarationLangauge.g:1768:1: rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 : ( ruleEString ) ;
    public final void rule__Attribute__ValueLiteralAssignment_5_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1772:1: ( ( ruleEString ) )
            // InternalDeclarationLangauge.g:1773:2: ( ruleEString )
            {
            // InternalDeclarationLangauge.g:1773:2: ( ruleEString )
            // InternalDeclarationLangauge.g:1774:3: ruleEString
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
    // InternalDeclarationLangauge.g:1783:1: rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 : ( ruleEString ) ;
    public final void rule__Attribute__MaxValueLiteralAssignment_5_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1787:1: ( ( ruleEString ) )
            // InternalDeclarationLangauge.g:1788:2: ( ruleEString )
            {
            // InternalDeclarationLangauge.g:1788:2: ( ruleEString )
            // InternalDeclarationLangauge.g:1789:3: ruleEString
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
    // InternalDeclarationLangauge.g:1798:1: rule__Attribute__MinValueLiteralAssignment_5_2_2_2 : ( ruleEString ) ;
    public final void rule__Attribute__MinValueLiteralAssignment_5_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1802:1: ( ( ruleEString ) )
            // InternalDeclarationLangauge.g:1803:2: ( ruleEString )
            {
            // InternalDeclarationLangauge.g:1803:2: ( ruleEString )
            // InternalDeclarationLangauge.g:1804:3: ruleEString
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
    // InternalDeclarationLangauge.g:1813:1: rule__Attribute__ReferenceFrameAssignment_5_2_3_2 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__ReferenceFrameAssignment_5_2_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1817:1: ( ( ( ruleFQN ) ) )
            // InternalDeclarationLangauge.g:1818:2: ( ( ruleFQN ) )
            {
            // InternalDeclarationLangauge.g:1818:2: ( ( ruleFQN ) )
            // InternalDeclarationLangauge.g:1819:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getReferenceFrameReferenceFrameDefinitionCrossReference_5_2_3_2_0()); 
            // InternalDeclarationLangauge.g:1820:3: ( ruleFQN )
            // InternalDeclarationLangauge.g:1821:4: ruleFQN
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
    // InternalDeclarationLangauge.g:1832:1: rule__Attribute__TypeUnitAssignment_5_2_4_0_2 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__TypeUnitAssignment_5_2_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1836:1: ( ( ( ruleFQN ) ) )
            // InternalDeclarationLangauge.g:1837:2: ( ( ruleFQN ) )
            {
            // InternalDeclarationLangauge.g:1837:2: ( ( ruleFQN ) )
            // InternalDeclarationLangauge.g:1838:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getTypeUnitUnitDefinitionCrossReference_5_2_4_0_2_0()); 
            // InternalDeclarationLangauge.g:1839:3: ( ruleFQN )
            // InternalDeclarationLangauge.g:1840:4: ruleFQN
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
    // InternalDeclarationLangauge.g:1851:1: rule__ArrayDimension__SizeAssignment_1 : ( ruleEInt ) ;
    public final void rule__ArrayDimension__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1855:1: ( ( ruleEInt ) )
            // InternalDeclarationLangauge.g:1856:2: ( ruleEInt )
            {
            // InternalDeclarationLangauge.g:1856:2: ( ruleEInt )
            // InternalDeclarationLangauge.g:1857:3: ruleEInt
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
    // InternalDeclarationLangauge.g:1866:1: rule__ArrayDimension__NameAssignment_2_3 : ( ruleEString ) ;
    public final void rule__ArrayDimension__NameAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeclarationLangauge.g:1870:1: ( ( ruleEString ) )
            // InternalDeclarationLangauge.g:1871:2: ( ruleEString )
            {
            // InternalDeclarationLangauge.g:1871:2: ( ruleEString )
            // InternalDeclarationLangauge.g:1872:3: ruleEString
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003F6800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001F4000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000001F4002L});

}
