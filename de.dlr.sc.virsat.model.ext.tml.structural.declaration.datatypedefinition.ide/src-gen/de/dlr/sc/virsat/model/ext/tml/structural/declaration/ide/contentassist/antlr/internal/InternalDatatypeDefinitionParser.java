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
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.services.DatatypeDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatatypeDefinitionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'DataType'", "'{'", "'}'", "'extends'", "'external'", "':'", "'='", "'value'", "'max'", "'min'", "'referenceFrame'", "'unit'", "'['", "']'", "','", "'name'", "'-'", "'.'", "'abstract'", "'telemetry'", "'const'"
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

    	public void setGrammarAccess(DatatypeDefinitionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleStartRule"
    // InternalDatatypeDefinition.g:53:1: entryRuleStartRule : ruleStartRule EOF ;
    public final void entryRuleStartRule() throws RecognitionException {
        try {
            // InternalDatatypeDefinition.g:54:1: ( ruleStartRule EOF )
            // InternalDatatypeDefinition.g:55:1: ruleStartRule EOF
            {
             before(grammarAccess.getStartRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleStartRule();

            state._fsp--;

             after(grammarAccess.getStartRuleRule()); 
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
    // $ANTLR end "entryRuleStartRule"


    // $ANTLR start "ruleStartRule"
    // InternalDatatypeDefinition.g:62:1: ruleStartRule : ( ( rule__StartRule__Alternatives ) ) ;
    public final void ruleStartRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:66:2: ( ( ( rule__StartRule__Alternatives ) ) )
            // InternalDatatypeDefinition.g:67:2: ( ( rule__StartRule__Alternatives ) )
            {
            // InternalDatatypeDefinition.g:67:2: ( ( rule__StartRule__Alternatives ) )
            // InternalDatatypeDefinition.g:68:3: ( rule__StartRule__Alternatives )
            {
             before(grammarAccess.getStartRuleAccess().getAlternatives()); 
            // InternalDatatypeDefinition.g:69:3: ( rule__StartRule__Alternatives )
            // InternalDatatypeDefinition.g:69:4: rule__StartRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StartRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStartRuleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStartRule"


    // $ANTLR start "entryRuleDataType"
    // InternalDatatypeDefinition.g:78:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDatatypeDefinition.g:79:1: ( ruleDataType EOF )
            // InternalDatatypeDefinition.g:80:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDatatypeDefinition.g:87:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:91:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalDatatypeDefinition.g:92:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalDatatypeDefinition.g:92:2: ( ( rule__DataType__Group__0 ) )
            // InternalDatatypeDefinition.g:93:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalDatatypeDefinition.g:94:3: ( rule__DataType__Group__0 )
            // InternalDatatypeDefinition.g:94:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleExternalType"
    // InternalDatatypeDefinition.g:103:1: entryRuleExternalType : ruleExternalType EOF ;
    public final void entryRuleExternalType() throws RecognitionException {
        try {
            // InternalDatatypeDefinition.g:104:1: ( ruleExternalType EOF )
            // InternalDatatypeDefinition.g:105:1: ruleExternalType EOF
            {
             before(grammarAccess.getExternalTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalType();

            state._fsp--;

             after(grammarAccess.getExternalTypeRule()); 
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
    // $ANTLR end "entryRuleExternalType"


    // $ANTLR start "ruleExternalType"
    // InternalDatatypeDefinition.g:112:1: ruleExternalType : ( ( rule__ExternalType__Group__0 ) ) ;
    public final void ruleExternalType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:116:2: ( ( ( rule__ExternalType__Group__0 ) ) )
            // InternalDatatypeDefinition.g:117:2: ( ( rule__ExternalType__Group__0 ) )
            {
            // InternalDatatypeDefinition.g:117:2: ( ( rule__ExternalType__Group__0 ) )
            // InternalDatatypeDefinition.g:118:3: ( rule__ExternalType__Group__0 )
            {
             before(grammarAccess.getExternalTypeAccess().getGroup()); 
            // InternalDatatypeDefinition.g:119:3: ( rule__ExternalType__Group__0 )
            // InternalDatatypeDefinition.g:119:4: rule__ExternalType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleExternalType"


    // $ANTLR start "entryRuleAttribute"
    // InternalDatatypeDefinition.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDatatypeDefinition.g:129:1: ( ruleAttribute EOF )
            // InternalDatatypeDefinition.g:130:1: ruleAttribute EOF
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
    // InternalDatatypeDefinition.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDatatypeDefinition.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDatatypeDefinition.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDatatypeDefinition.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDatatypeDefinition.g:144:3: ( rule__Attribute__Group__0 )
            // InternalDatatypeDefinition.g:144:4: rule__Attribute__Group__0
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
    // InternalDatatypeDefinition.g:153:1: entryRuleArrayDimension : ruleArrayDimension EOF ;
    public final void entryRuleArrayDimension() throws RecognitionException {
        try {
            // InternalDatatypeDefinition.g:154:1: ( ruleArrayDimension EOF )
            // InternalDatatypeDefinition.g:155:1: ruleArrayDimension EOF
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
    // InternalDatatypeDefinition.g:162:1: ruleArrayDimension : ( ( rule__ArrayDimension__Group__0 ) ) ;
    public final void ruleArrayDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:166:2: ( ( ( rule__ArrayDimension__Group__0 ) ) )
            // InternalDatatypeDefinition.g:167:2: ( ( rule__ArrayDimension__Group__0 ) )
            {
            // InternalDatatypeDefinition.g:167:2: ( ( rule__ArrayDimension__Group__0 ) )
            // InternalDatatypeDefinition.g:168:3: ( rule__ArrayDimension__Group__0 )
            {
             before(grammarAccess.getArrayDimensionAccess().getGroup()); 
            // InternalDatatypeDefinition.g:169:3: ( rule__ArrayDimension__Group__0 )
            // InternalDatatypeDefinition.g:169:4: rule__ArrayDimension__Group__0
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
    // InternalDatatypeDefinition.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDatatypeDefinition.g:179:1: ( ruleEString EOF )
            // InternalDatatypeDefinition.g:180:1: ruleEString EOF
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
    // InternalDatatypeDefinition.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDatatypeDefinition.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDatatypeDefinition.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalDatatypeDefinition.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDatatypeDefinition.g:194:3: ( rule__EString__Alternatives )
            // InternalDatatypeDefinition.g:194:4: rule__EString__Alternatives
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
    // InternalDatatypeDefinition.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDatatypeDefinition.g:204:1: ( ruleEInt EOF )
            // InternalDatatypeDefinition.g:205:1: ruleEInt EOF
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
    // InternalDatatypeDefinition.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDatatypeDefinition.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDatatypeDefinition.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalDatatypeDefinition.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDatatypeDefinition.g:219:3: ( rule__EInt__Group__0 )
            // InternalDatatypeDefinition.g:219:4: rule__EInt__Group__0
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
    // InternalDatatypeDefinition.g:228:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalDatatypeDefinition.g:229:1: ( ruleFQN EOF )
            // InternalDatatypeDefinition.g:230:1: ruleFQN EOF
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
    // InternalDatatypeDefinition.g:237:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:241:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalDatatypeDefinition.g:242:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalDatatypeDefinition.g:242:2: ( ( rule__FQN__Group__0 ) )
            // InternalDatatypeDefinition.g:243:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalDatatypeDefinition.g:244:3: ( rule__FQN__Group__0 )
            // InternalDatatypeDefinition.g:244:4: rule__FQN__Group__0
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


    // $ANTLR start "rule__StartRule__Alternatives"
    // InternalDatatypeDefinition.g:252:1: rule__StartRule__Alternatives : ( ( ruleDataType ) | ( ruleExternalType ) );
    public final void rule__StartRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:256:1: ( ( ruleDataType ) | ( ruleExternalType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12||(LA1_0>=30 && LA1_0<=31)) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDatatypeDefinition.g:257:2: ( ruleDataType )
                    {
                    // InternalDatatypeDefinition.g:257:2: ( ruleDataType )
                    // InternalDatatypeDefinition.g:258:3: ruleDataType
                    {
                     before(grammarAccess.getStartRuleAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getStartRuleAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDatatypeDefinition.g:263:2: ( ruleExternalType )
                    {
                    // InternalDatatypeDefinition.g:263:2: ( ruleExternalType )
                    // InternalDatatypeDefinition.g:264:3: ruleExternalType
                    {
                     before(grammarAccess.getStartRuleAccess().getExternalTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalType();

                    state._fsp--;

                     after(grammarAccess.getStartRuleAccess().getExternalTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__StartRule__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives_5"
    // InternalDatatypeDefinition.g:273:1: rule__Attribute__Alternatives_5 : ( ( ( rule__Attribute__Group_5_0__0 ) ) | ( ';' ) | ( ( rule__Attribute__UnorderedGroup_5_2 )? ) );
    public final void rule__Attribute__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:277:1: ( ( ( rule__Attribute__Group_5_0__0 ) ) | ( ';' ) | ( ( rule__Attribute__UnorderedGroup_5_2 )? ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 11:
                {
                alt3=2;
                }
                break;
            case EOF:
            case RULE_STRING:
            case RULE_ID:
            case 13:
            case 14:
            case 20:
            case 21:
            case 22:
            case 23:
            case 32:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDatatypeDefinition.g:278:2: ( ( rule__Attribute__Group_5_0__0 ) )
                    {
                    // InternalDatatypeDefinition.g:278:2: ( ( rule__Attribute__Group_5_0__0 ) )
                    // InternalDatatypeDefinition.g:279:3: ( rule__Attribute__Group_5_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_0()); 
                    // InternalDatatypeDefinition.g:280:3: ( rule__Attribute__Group_5_0__0 )
                    // InternalDatatypeDefinition.g:280:4: rule__Attribute__Group_5_0__0
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
                    // InternalDatatypeDefinition.g:284:2: ( ';' )
                    {
                    // InternalDatatypeDefinition.g:284:2: ( ';' )
                    // InternalDatatypeDefinition.g:285:3: ';'
                    {
                     before(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getSemicolonKeyword_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDatatypeDefinition.g:290:2: ( ( rule__Attribute__UnorderedGroup_5_2 )? )
                    {
                    // InternalDatatypeDefinition.g:290:2: ( ( rule__Attribute__UnorderedGroup_5_2 )? )
                    // InternalDatatypeDefinition.g:291:3: ( rule__Attribute__UnorderedGroup_5_2 )?
                    {
                     before(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2()); 
                    // InternalDatatypeDefinition.g:292:3: ( rule__Attribute__UnorderedGroup_5_2 )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( LA2_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                        alt2=1;
                    }
                    else if ( LA2_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                        alt2=1;
                    }
                    else if ( LA2_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                        alt2=1;
                    }
                    else if ( LA2_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                        alt2=1;
                    }
                    else if ( LA2_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==14) ) {
                        int LA2_6 = input.LA(2);

                        if ( LA2_6 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                            alt2=1;
                        }
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalDatatypeDefinition.g:292:4: rule__Attribute__UnorderedGroup_5_2
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
    // InternalDatatypeDefinition.g:300:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:304:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDatatypeDefinition.g:305:2: ( RULE_STRING )
                    {
                    // InternalDatatypeDefinition.g:305:2: ( RULE_STRING )
                    // InternalDatatypeDefinition.g:306:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDatatypeDefinition.g:311:2: ( RULE_ID )
                    {
                    // InternalDatatypeDefinition.g:311:2: ( RULE_ID )
                    // InternalDatatypeDefinition.g:312:3: RULE_ID
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


    // $ANTLR start "rule__DataType__Group__0"
    // InternalDatatypeDefinition.g:321:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:325:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDatatypeDefinition.g:326:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalDatatypeDefinition.g:333:1: rule__DataType__Group__0__Impl : ( ( rule__DataType__AbstractTypeAssignment_0 )? ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:337:1: ( ( ( rule__DataType__AbstractTypeAssignment_0 )? ) )
            // InternalDatatypeDefinition.g:338:1: ( ( rule__DataType__AbstractTypeAssignment_0 )? )
            {
            // InternalDatatypeDefinition.g:338:1: ( ( rule__DataType__AbstractTypeAssignment_0 )? )
            // InternalDatatypeDefinition.g:339:2: ( rule__DataType__AbstractTypeAssignment_0 )?
            {
             before(grammarAccess.getDataTypeAccess().getAbstractTypeAssignment_0()); 
            // InternalDatatypeDefinition.g:340:2: ( rule__DataType__AbstractTypeAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDatatypeDefinition.g:340:3: rule__DataType__AbstractTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__AbstractTypeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getAbstractTypeAssignment_0()); 

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
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalDatatypeDefinition.g:348:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:352:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalDatatypeDefinition.g:353:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__2();

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalDatatypeDefinition.g:360:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__IsTMTypeAssignment_1 )? ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:364:1: ( ( ( rule__DataType__IsTMTypeAssignment_1 )? ) )
            // InternalDatatypeDefinition.g:365:1: ( ( rule__DataType__IsTMTypeAssignment_1 )? )
            {
            // InternalDatatypeDefinition.g:365:1: ( ( rule__DataType__IsTMTypeAssignment_1 )? )
            // InternalDatatypeDefinition.g:366:2: ( rule__DataType__IsTMTypeAssignment_1 )?
            {
             before(grammarAccess.getDataTypeAccess().getIsTMTypeAssignment_1()); 
            // InternalDatatypeDefinition.g:367:2: ( rule__DataType__IsTMTypeAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDatatypeDefinition.g:367:3: rule__DataType__IsTMTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__IsTMTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getIsTMTypeAssignment_1()); 

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
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__2"
    // InternalDatatypeDefinition.g:375:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:379:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // InternalDatatypeDefinition.g:380:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__3();

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
    // $ANTLR end "rule__DataType__Group__2"


    // $ANTLR start "rule__DataType__Group__2__Impl"
    // InternalDatatypeDefinition.g:387:1: rule__DataType__Group__2__Impl : ( 'DataType' ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:391:1: ( ( 'DataType' ) )
            // InternalDatatypeDefinition.g:392:1: ( 'DataType' )
            {
            // InternalDatatypeDefinition.g:392:1: ( 'DataType' )
            // InternalDatatypeDefinition.g:393:2: 'DataType'
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDataTypeKeyword_2()); 

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
    // $ANTLR end "rule__DataType__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group__3"
    // InternalDatatypeDefinition.g:402:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:406:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // InternalDatatypeDefinition.g:407:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__DataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__4();

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
    // $ANTLR end "rule__DataType__Group__3"


    // $ANTLR start "rule__DataType__Group__3__Impl"
    // InternalDatatypeDefinition.g:414:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__NameAssignment_3 ) ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:418:1: ( ( ( rule__DataType__NameAssignment_3 ) ) )
            // InternalDatatypeDefinition.g:419:1: ( ( rule__DataType__NameAssignment_3 ) )
            {
            // InternalDatatypeDefinition.g:419:1: ( ( rule__DataType__NameAssignment_3 ) )
            // InternalDatatypeDefinition.g:420:2: ( rule__DataType__NameAssignment_3 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_3()); 
            // InternalDatatypeDefinition.g:421:2: ( rule__DataType__NameAssignment_3 )
            // InternalDatatypeDefinition.g:421:3: rule__DataType__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__DataType__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group__4"
    // InternalDatatypeDefinition.g:429:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl rule__DataType__Group__5 ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:433:1: ( rule__DataType__Group__4__Impl rule__DataType__Group__5 )
            // InternalDatatypeDefinition.g:434:2: rule__DataType__Group__4__Impl rule__DataType__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__DataType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__5();

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
    // $ANTLR end "rule__DataType__Group__4"


    // $ANTLR start "rule__DataType__Group__4__Impl"
    // InternalDatatypeDefinition.g:441:1: rule__DataType__Group__4__Impl : ( ( rule__DataType__Group_4__0 )? ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:445:1: ( ( ( rule__DataType__Group_4__0 )? ) )
            // InternalDatatypeDefinition.g:446:1: ( ( rule__DataType__Group_4__0 )? )
            {
            // InternalDatatypeDefinition.g:446:1: ( ( rule__DataType__Group_4__0 )? )
            // InternalDatatypeDefinition.g:447:2: ( rule__DataType__Group_4__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_4()); 
            // InternalDatatypeDefinition.g:448:2: ( rule__DataType__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDatatypeDefinition.g:448:3: rule__DataType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__DataType__Group__4__Impl"


    // $ANTLR start "rule__DataType__Group__5"
    // InternalDatatypeDefinition.g:456:1: rule__DataType__Group__5 : rule__DataType__Group__5__Impl rule__DataType__Group__6 ;
    public final void rule__DataType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:460:1: ( rule__DataType__Group__5__Impl rule__DataType__Group__6 )
            // InternalDatatypeDefinition.g:461:2: rule__DataType__Group__5__Impl rule__DataType__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__DataType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__6();

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
    // $ANTLR end "rule__DataType__Group__5"


    // $ANTLR start "rule__DataType__Group__5__Impl"
    // InternalDatatypeDefinition.g:468:1: rule__DataType__Group__5__Impl : ( '{' ) ;
    public final void rule__DataType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:472:1: ( ( '{' ) )
            // InternalDatatypeDefinition.g:473:1: ( '{' )
            {
            // InternalDatatypeDefinition.g:473:1: ( '{' )
            // InternalDatatypeDefinition.g:474:2: '{'
            {
             before(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__DataType__Group__5__Impl"


    // $ANTLR start "rule__DataType__Group__6"
    // InternalDatatypeDefinition.g:483:1: rule__DataType__Group__6 : rule__DataType__Group__6__Impl rule__DataType__Group__7 ;
    public final void rule__DataType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:487:1: ( rule__DataType__Group__6__Impl rule__DataType__Group__7 )
            // InternalDatatypeDefinition.g:488:2: rule__DataType__Group__6__Impl rule__DataType__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__DataType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__7();

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
    // $ANTLR end "rule__DataType__Group__6"


    // $ANTLR start "rule__DataType__Group__6__Impl"
    // InternalDatatypeDefinition.g:495:1: rule__DataType__Group__6__Impl : ( ( rule__DataType__AttributesAssignment_6 )* ) ;
    public final void rule__DataType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:499:1: ( ( ( rule__DataType__AttributesAssignment_6 )* ) )
            // InternalDatatypeDefinition.g:500:1: ( ( rule__DataType__AttributesAssignment_6 )* )
            {
            // InternalDatatypeDefinition.g:500:1: ( ( rule__DataType__AttributesAssignment_6 )* )
            // InternalDatatypeDefinition.g:501:2: ( rule__DataType__AttributesAssignment_6 )*
            {
             before(grammarAccess.getDataTypeAccess().getAttributesAssignment_6()); 
            // InternalDatatypeDefinition.g:502:2: ( rule__DataType__AttributesAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDatatypeDefinition.g:502:3: rule__DataType__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DataType__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDataTypeAccess().getAttributesAssignment_6()); 

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
    // $ANTLR end "rule__DataType__Group__6__Impl"


    // $ANTLR start "rule__DataType__Group__7"
    // InternalDatatypeDefinition.g:510:1: rule__DataType__Group__7 : rule__DataType__Group__7__Impl ;
    public final void rule__DataType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:514:1: ( rule__DataType__Group__7__Impl )
            // InternalDatatypeDefinition.g:515:2: rule__DataType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__7__Impl();

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
    // $ANTLR end "rule__DataType__Group__7"


    // $ANTLR start "rule__DataType__Group__7__Impl"
    // InternalDatatypeDefinition.g:521:1: rule__DataType__Group__7__Impl : ( '}' ) ;
    public final void rule__DataType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:525:1: ( ( '}' ) )
            // InternalDatatypeDefinition.g:526:1: ( '}' )
            {
            // InternalDatatypeDefinition.g:526:1: ( '}' )
            // InternalDatatypeDefinition.g:527:2: '}'
            {
             before(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__DataType__Group__7__Impl"


    // $ANTLR start "rule__DataType__Group_4__0"
    // InternalDatatypeDefinition.g:537:1: rule__DataType__Group_4__0 : rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 ;
    public final void rule__DataType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:541:1: ( rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 )
            // InternalDatatypeDefinition.g:542:2: rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__DataType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_4__1();

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
    // $ANTLR end "rule__DataType__Group_4__0"


    // $ANTLR start "rule__DataType__Group_4__0__Impl"
    // InternalDatatypeDefinition.g:549:1: rule__DataType__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__DataType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:553:1: ( ( 'extends' ) )
            // InternalDatatypeDefinition.g:554:1: ( 'extends' )
            {
            // InternalDatatypeDefinition.g:554:1: ( 'extends' )
            // InternalDatatypeDefinition.g:555:2: 'extends'
            {
             before(grammarAccess.getDataTypeAccess().getExtendsKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getExtendsKeyword_4_0()); 

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
    // $ANTLR end "rule__DataType__Group_4__0__Impl"


    // $ANTLR start "rule__DataType__Group_4__1"
    // InternalDatatypeDefinition.g:564:1: rule__DataType__Group_4__1 : rule__DataType__Group_4__1__Impl ;
    public final void rule__DataType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:568:1: ( rule__DataType__Group_4__1__Impl )
            // InternalDatatypeDefinition.g:569:2: rule__DataType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_4__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_4__1"


    // $ANTLR start "rule__DataType__Group_4__1__Impl"
    // InternalDatatypeDefinition.g:575:1: rule__DataType__Group_4__1__Impl : ( ( rule__DataType__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__DataType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:579:1: ( ( ( rule__DataType__SuperTypeAssignment_4_1 ) ) )
            // InternalDatatypeDefinition.g:580:1: ( ( rule__DataType__SuperTypeAssignment_4_1 ) )
            {
            // InternalDatatypeDefinition.g:580:1: ( ( rule__DataType__SuperTypeAssignment_4_1 ) )
            // InternalDatatypeDefinition.g:581:2: ( rule__DataType__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getDataTypeAccess().getSuperTypeAssignment_4_1()); 
            // InternalDatatypeDefinition.g:582:2: ( rule__DataType__SuperTypeAssignment_4_1 )
            // InternalDatatypeDefinition.g:582:3: rule__DataType__SuperTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__SuperTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getSuperTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__DataType__Group_4__1__Impl"


    // $ANTLR start "rule__ExternalType__Group__0"
    // InternalDatatypeDefinition.g:591:1: rule__ExternalType__Group__0 : rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1 ;
    public final void rule__ExternalType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:595:1: ( rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1 )
            // InternalDatatypeDefinition.g:596:2: rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ExternalType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalType__Group__1();

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
    // $ANTLR end "rule__ExternalType__Group__0"


    // $ANTLR start "rule__ExternalType__Group__0__Impl"
    // InternalDatatypeDefinition.g:603:1: rule__ExternalType__Group__0__Impl : ( 'external' ) ;
    public final void rule__ExternalType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:607:1: ( ( 'external' ) )
            // InternalDatatypeDefinition.g:608:1: ( 'external' )
            {
            // InternalDatatypeDefinition.g:608:1: ( 'external' )
            // InternalDatatypeDefinition.g:609:2: 'external'
            {
             before(grammarAccess.getExternalTypeAccess().getExternalKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExternalTypeAccess().getExternalKeyword_0()); 

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
    // $ANTLR end "rule__ExternalType__Group__0__Impl"


    // $ANTLR start "rule__ExternalType__Group__1"
    // InternalDatatypeDefinition.g:618:1: rule__ExternalType__Group__1 : rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2 ;
    public final void rule__ExternalType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:622:1: ( rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2 )
            // InternalDatatypeDefinition.g:623:2: rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ExternalType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalType__Group__2();

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
    // $ANTLR end "rule__ExternalType__Group__1"


    // $ANTLR start "rule__ExternalType__Group__1__Impl"
    // InternalDatatypeDefinition.g:630:1: rule__ExternalType__Group__1__Impl : ( ( rule__ExternalType__AbstractTypeAssignment_1 )? ) ;
    public final void rule__ExternalType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:634:1: ( ( ( rule__ExternalType__AbstractTypeAssignment_1 )? ) )
            // InternalDatatypeDefinition.g:635:1: ( ( rule__ExternalType__AbstractTypeAssignment_1 )? )
            {
            // InternalDatatypeDefinition.g:635:1: ( ( rule__ExternalType__AbstractTypeAssignment_1 )? )
            // InternalDatatypeDefinition.g:636:2: ( rule__ExternalType__AbstractTypeAssignment_1 )?
            {
             before(grammarAccess.getExternalTypeAccess().getAbstractTypeAssignment_1()); 
            // InternalDatatypeDefinition.g:637:2: ( rule__ExternalType__AbstractTypeAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDatatypeDefinition.g:637:3: rule__ExternalType__AbstractTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalType__AbstractTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalTypeAccess().getAbstractTypeAssignment_1()); 

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
    // $ANTLR end "rule__ExternalType__Group__1__Impl"


    // $ANTLR start "rule__ExternalType__Group__2"
    // InternalDatatypeDefinition.g:645:1: rule__ExternalType__Group__2 : rule__ExternalType__Group__2__Impl rule__ExternalType__Group__3 ;
    public final void rule__ExternalType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:649:1: ( rule__ExternalType__Group__2__Impl rule__ExternalType__Group__3 )
            // InternalDatatypeDefinition.g:650:2: rule__ExternalType__Group__2__Impl rule__ExternalType__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ExternalType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalType__Group__3();

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
    // $ANTLR end "rule__ExternalType__Group__2"


    // $ANTLR start "rule__ExternalType__Group__2__Impl"
    // InternalDatatypeDefinition.g:657:1: rule__ExternalType__Group__2__Impl : ( ( rule__ExternalType__IsTMTypeAssignment_2 )? ) ;
    public final void rule__ExternalType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:661:1: ( ( ( rule__ExternalType__IsTMTypeAssignment_2 )? ) )
            // InternalDatatypeDefinition.g:662:1: ( ( rule__ExternalType__IsTMTypeAssignment_2 )? )
            {
            // InternalDatatypeDefinition.g:662:1: ( ( rule__ExternalType__IsTMTypeAssignment_2 )? )
            // InternalDatatypeDefinition.g:663:2: ( rule__ExternalType__IsTMTypeAssignment_2 )?
            {
             before(grammarAccess.getExternalTypeAccess().getIsTMTypeAssignment_2()); 
            // InternalDatatypeDefinition.g:664:2: ( rule__ExternalType__IsTMTypeAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDatatypeDefinition.g:664:3: rule__ExternalType__IsTMTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalType__IsTMTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalTypeAccess().getIsTMTypeAssignment_2()); 

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
    // $ANTLR end "rule__ExternalType__Group__2__Impl"


    // $ANTLR start "rule__ExternalType__Group__3"
    // InternalDatatypeDefinition.g:672:1: rule__ExternalType__Group__3 : rule__ExternalType__Group__3__Impl rule__ExternalType__Group__4 ;
    public final void rule__ExternalType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:676:1: ( rule__ExternalType__Group__3__Impl rule__ExternalType__Group__4 )
            // InternalDatatypeDefinition.g:677:2: rule__ExternalType__Group__3__Impl rule__ExternalType__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ExternalType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalType__Group__4();

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
    // $ANTLR end "rule__ExternalType__Group__3"


    // $ANTLR start "rule__ExternalType__Group__3__Impl"
    // InternalDatatypeDefinition.g:684:1: rule__ExternalType__Group__3__Impl : ( 'DataType' ) ;
    public final void rule__ExternalType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:688:1: ( ( 'DataType' ) )
            // InternalDatatypeDefinition.g:689:1: ( 'DataType' )
            {
            // InternalDatatypeDefinition.g:689:1: ( 'DataType' )
            // InternalDatatypeDefinition.g:690:2: 'DataType'
            {
             before(grammarAccess.getExternalTypeAccess().getDataTypeKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExternalTypeAccess().getDataTypeKeyword_3()); 

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
    // $ANTLR end "rule__ExternalType__Group__3__Impl"


    // $ANTLR start "rule__ExternalType__Group__4"
    // InternalDatatypeDefinition.g:699:1: rule__ExternalType__Group__4 : rule__ExternalType__Group__4__Impl rule__ExternalType__Group__5 ;
    public final void rule__ExternalType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:703:1: ( rule__ExternalType__Group__4__Impl rule__ExternalType__Group__5 )
            // InternalDatatypeDefinition.g:704:2: rule__ExternalType__Group__4__Impl rule__ExternalType__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ExternalType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalType__Group__5();

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
    // $ANTLR end "rule__ExternalType__Group__4"


    // $ANTLR start "rule__ExternalType__Group__4__Impl"
    // InternalDatatypeDefinition.g:711:1: rule__ExternalType__Group__4__Impl : ( ( rule__ExternalType__NameAssignment_4 ) ) ;
    public final void rule__ExternalType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:715:1: ( ( ( rule__ExternalType__NameAssignment_4 ) ) )
            // InternalDatatypeDefinition.g:716:1: ( ( rule__ExternalType__NameAssignment_4 ) )
            {
            // InternalDatatypeDefinition.g:716:1: ( ( rule__ExternalType__NameAssignment_4 ) )
            // InternalDatatypeDefinition.g:717:2: ( rule__ExternalType__NameAssignment_4 )
            {
             before(grammarAccess.getExternalTypeAccess().getNameAssignment_4()); 
            // InternalDatatypeDefinition.g:718:2: ( rule__ExternalType__NameAssignment_4 )
            // InternalDatatypeDefinition.g:718:3: rule__ExternalType__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ExternalType__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExternalTypeAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__ExternalType__Group__4__Impl"


    // $ANTLR start "rule__ExternalType__Group__5"
    // InternalDatatypeDefinition.g:726:1: rule__ExternalType__Group__5 : rule__ExternalType__Group__5__Impl rule__ExternalType__Group__6 ;
    public final void rule__ExternalType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:730:1: ( rule__ExternalType__Group__5__Impl rule__ExternalType__Group__6 )
            // InternalDatatypeDefinition.g:731:2: rule__ExternalType__Group__5__Impl rule__ExternalType__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__ExternalType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalType__Group__6();

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
    // $ANTLR end "rule__ExternalType__Group__5"


    // $ANTLR start "rule__ExternalType__Group__5__Impl"
    // InternalDatatypeDefinition.g:738:1: rule__ExternalType__Group__5__Impl : ( ( rule__ExternalType__Group_5__0 )? ) ;
    public final void rule__ExternalType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:742:1: ( ( ( rule__ExternalType__Group_5__0 )? ) )
            // InternalDatatypeDefinition.g:743:1: ( ( rule__ExternalType__Group_5__0 )? )
            {
            // InternalDatatypeDefinition.g:743:1: ( ( rule__ExternalType__Group_5__0 )? )
            // InternalDatatypeDefinition.g:744:2: ( rule__ExternalType__Group_5__0 )?
            {
             before(grammarAccess.getExternalTypeAccess().getGroup_5()); 
            // InternalDatatypeDefinition.g:745:2: ( rule__ExternalType__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDatatypeDefinition.g:745:3: rule__ExternalType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalTypeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ExternalType__Group__5__Impl"


    // $ANTLR start "rule__ExternalType__Group__6"
    // InternalDatatypeDefinition.g:753:1: rule__ExternalType__Group__6 : rule__ExternalType__Group__6__Impl rule__ExternalType__Group__7 ;
    public final void rule__ExternalType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:757:1: ( rule__ExternalType__Group__6__Impl rule__ExternalType__Group__7 )
            // InternalDatatypeDefinition.g:758:2: rule__ExternalType__Group__6__Impl rule__ExternalType__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ExternalType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalType__Group__7();

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
    // $ANTLR end "rule__ExternalType__Group__6"


    // $ANTLR start "rule__ExternalType__Group__6__Impl"
    // InternalDatatypeDefinition.g:765:1: rule__ExternalType__Group__6__Impl : ( '{' ) ;
    public final void rule__ExternalType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:769:1: ( ( '{' ) )
            // InternalDatatypeDefinition.g:770:1: ( '{' )
            {
            // InternalDatatypeDefinition.g:770:1: ( '{' )
            // InternalDatatypeDefinition.g:771:2: '{'
            {
             before(grammarAccess.getExternalTypeAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExternalTypeAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ExternalType__Group__6__Impl"


    // $ANTLR start "rule__ExternalType__Group__7"
    // InternalDatatypeDefinition.g:780:1: rule__ExternalType__Group__7 : rule__ExternalType__Group__7__Impl rule__ExternalType__Group__8 ;
    public final void rule__ExternalType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:784:1: ( rule__ExternalType__Group__7__Impl rule__ExternalType__Group__8 )
            // InternalDatatypeDefinition.g:785:2: rule__ExternalType__Group__7__Impl rule__ExternalType__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ExternalType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalType__Group__8();

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
    // $ANTLR end "rule__ExternalType__Group__7"


    // $ANTLR start "rule__ExternalType__Group__7__Impl"
    // InternalDatatypeDefinition.g:792:1: rule__ExternalType__Group__7__Impl : ( ( rule__ExternalType__AttributesAssignment_7 )* ) ;
    public final void rule__ExternalType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:796:1: ( ( ( rule__ExternalType__AttributesAssignment_7 )* ) )
            // InternalDatatypeDefinition.g:797:1: ( ( rule__ExternalType__AttributesAssignment_7 )* )
            {
            // InternalDatatypeDefinition.g:797:1: ( ( rule__ExternalType__AttributesAssignment_7 )* )
            // InternalDatatypeDefinition.g:798:2: ( rule__ExternalType__AttributesAssignment_7 )*
            {
             before(grammarAccess.getExternalTypeAccess().getAttributesAssignment_7()); 
            // InternalDatatypeDefinition.g:799:2: ( rule__ExternalType__AttributesAssignment_7 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDatatypeDefinition.g:799:3: rule__ExternalType__AttributesAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ExternalType__AttributesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExternalTypeAccess().getAttributesAssignment_7()); 

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
    // $ANTLR end "rule__ExternalType__Group__7__Impl"


    // $ANTLR start "rule__ExternalType__Group__8"
    // InternalDatatypeDefinition.g:807:1: rule__ExternalType__Group__8 : rule__ExternalType__Group__8__Impl ;
    public final void rule__ExternalType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:811:1: ( rule__ExternalType__Group__8__Impl )
            // InternalDatatypeDefinition.g:812:2: rule__ExternalType__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalType__Group__8__Impl();

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
    // $ANTLR end "rule__ExternalType__Group__8"


    // $ANTLR start "rule__ExternalType__Group__8__Impl"
    // InternalDatatypeDefinition.g:818:1: rule__ExternalType__Group__8__Impl : ( '}' ) ;
    public final void rule__ExternalType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:822:1: ( ( '}' ) )
            // InternalDatatypeDefinition.g:823:1: ( '}' )
            {
            // InternalDatatypeDefinition.g:823:1: ( '}' )
            // InternalDatatypeDefinition.g:824:2: '}'
            {
             before(grammarAccess.getExternalTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExternalTypeAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__ExternalType__Group__8__Impl"


    // $ANTLR start "rule__ExternalType__Group_5__0"
    // InternalDatatypeDefinition.g:834:1: rule__ExternalType__Group_5__0 : rule__ExternalType__Group_5__0__Impl rule__ExternalType__Group_5__1 ;
    public final void rule__ExternalType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:838:1: ( rule__ExternalType__Group_5__0__Impl rule__ExternalType__Group_5__1 )
            // InternalDatatypeDefinition.g:839:2: rule__ExternalType__Group_5__0__Impl rule__ExternalType__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__ExternalType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalType__Group_5__1();

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
    // $ANTLR end "rule__ExternalType__Group_5__0"


    // $ANTLR start "rule__ExternalType__Group_5__0__Impl"
    // InternalDatatypeDefinition.g:846:1: rule__ExternalType__Group_5__0__Impl : ( 'extends' ) ;
    public final void rule__ExternalType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:850:1: ( ( 'extends' ) )
            // InternalDatatypeDefinition.g:851:1: ( 'extends' )
            {
            // InternalDatatypeDefinition.g:851:1: ( 'extends' )
            // InternalDatatypeDefinition.g:852:2: 'extends'
            {
             before(grammarAccess.getExternalTypeAccess().getExtendsKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExternalTypeAccess().getExtendsKeyword_5_0()); 

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
    // $ANTLR end "rule__ExternalType__Group_5__0__Impl"


    // $ANTLR start "rule__ExternalType__Group_5__1"
    // InternalDatatypeDefinition.g:861:1: rule__ExternalType__Group_5__1 : rule__ExternalType__Group_5__1__Impl ;
    public final void rule__ExternalType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:865:1: ( rule__ExternalType__Group_5__1__Impl )
            // InternalDatatypeDefinition.g:866:2: rule__ExternalType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalType__Group_5__1__Impl();

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
    // $ANTLR end "rule__ExternalType__Group_5__1"


    // $ANTLR start "rule__ExternalType__Group_5__1__Impl"
    // InternalDatatypeDefinition.g:872:1: rule__ExternalType__Group_5__1__Impl : ( ( rule__ExternalType__SuperTypeAssignment_5_1 ) ) ;
    public final void rule__ExternalType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:876:1: ( ( ( rule__ExternalType__SuperTypeAssignment_5_1 ) ) )
            // InternalDatatypeDefinition.g:877:1: ( ( rule__ExternalType__SuperTypeAssignment_5_1 ) )
            {
            // InternalDatatypeDefinition.g:877:1: ( ( rule__ExternalType__SuperTypeAssignment_5_1 ) )
            // InternalDatatypeDefinition.g:878:2: ( rule__ExternalType__SuperTypeAssignment_5_1 )
            {
             before(grammarAccess.getExternalTypeAccess().getSuperTypeAssignment_5_1()); 
            // InternalDatatypeDefinition.g:879:2: ( rule__ExternalType__SuperTypeAssignment_5_1 )
            // InternalDatatypeDefinition.g:879:3: rule__ExternalType__SuperTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalType__SuperTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalTypeAccess().getSuperTypeAssignment_5_1()); 

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
    // $ANTLR end "rule__ExternalType__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalDatatypeDefinition.g:888:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:892:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDatatypeDefinition.g:893:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDatatypeDefinition.g:900:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__IsConstAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:904:1: ( ( ( rule__Attribute__IsConstAssignment_0 )? ) )
            // InternalDatatypeDefinition.g:905:1: ( ( rule__Attribute__IsConstAssignment_0 )? )
            {
            // InternalDatatypeDefinition.g:905:1: ( ( rule__Attribute__IsConstAssignment_0 )? )
            // InternalDatatypeDefinition.g:906:2: ( rule__Attribute__IsConstAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getIsConstAssignment_0()); 
            // InternalDatatypeDefinition.g:907:2: ( rule__Attribute__IsConstAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDatatypeDefinition.g:907:3: rule__Attribute__IsConstAssignment_0
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
    // InternalDatatypeDefinition.g:915:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:919:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDatatypeDefinition.g:920:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalDatatypeDefinition.g:927:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:931:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDatatypeDefinition.g:932:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDatatypeDefinition.g:932:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDatatypeDefinition.g:933:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDatatypeDefinition.g:934:2: ( rule__Attribute__NameAssignment_1 )
            // InternalDatatypeDefinition.g:934:3: rule__Attribute__NameAssignment_1
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
    // InternalDatatypeDefinition.g:942:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:946:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDatatypeDefinition.g:947:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDatatypeDefinition.g:954:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:958:1: ( ( ':' ) )
            // InternalDatatypeDefinition.g:959:1: ( ':' )
            {
            // InternalDatatypeDefinition.g:959:1: ( ':' )
            // InternalDatatypeDefinition.g:960:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:969:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:973:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalDatatypeDefinition.g:974:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalDatatypeDefinition.g:981:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeOfAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:985:1: ( ( ( rule__Attribute__TypeOfAssignment_3 ) ) )
            // InternalDatatypeDefinition.g:986:1: ( ( rule__Attribute__TypeOfAssignment_3 ) )
            {
            // InternalDatatypeDefinition.g:986:1: ( ( rule__Attribute__TypeOfAssignment_3 ) )
            // InternalDatatypeDefinition.g:987:2: ( rule__Attribute__TypeOfAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeOfAssignment_3()); 
            // InternalDatatypeDefinition.g:988:2: ( rule__Attribute__TypeOfAssignment_3 )
            // InternalDatatypeDefinition.g:988:3: rule__Attribute__TypeOfAssignment_3
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
    // InternalDatatypeDefinition.g:996:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1000:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalDatatypeDefinition.g:1001:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalDatatypeDefinition.g:1008:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__DimensionsAssignment_4 )* ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1012:1: ( ( ( rule__Attribute__DimensionsAssignment_4 )* ) )
            // InternalDatatypeDefinition.g:1013:1: ( ( rule__Attribute__DimensionsAssignment_4 )* )
            {
            // InternalDatatypeDefinition.g:1013:1: ( ( rule__Attribute__DimensionsAssignment_4 )* )
            // InternalDatatypeDefinition.g:1014:2: ( rule__Attribute__DimensionsAssignment_4 )*
            {
             before(grammarAccess.getAttributeAccess().getDimensionsAssignment_4()); 
            // InternalDatatypeDefinition.g:1015:2: ( rule__Attribute__DimensionsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDatatypeDefinition.g:1015:3: rule__Attribute__DimensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Attribute__DimensionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDatatypeDefinition.g:1023:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1027:1: ( rule__Attribute__Group__5__Impl )
            // InternalDatatypeDefinition.g:1028:2: rule__Attribute__Group__5__Impl
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
    // InternalDatatypeDefinition.g:1034:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Alternatives_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1038:1: ( ( ( rule__Attribute__Alternatives_5 ) ) )
            // InternalDatatypeDefinition.g:1039:1: ( ( rule__Attribute__Alternatives_5 ) )
            {
            // InternalDatatypeDefinition.g:1039:1: ( ( rule__Attribute__Alternatives_5 ) )
            // InternalDatatypeDefinition.g:1040:2: ( rule__Attribute__Alternatives_5 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_5()); 
            // InternalDatatypeDefinition.g:1041:2: ( rule__Attribute__Alternatives_5 )
            // InternalDatatypeDefinition.g:1041:3: rule__Attribute__Alternatives_5
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
    // InternalDatatypeDefinition.g:1050:1: rule__Attribute__Group_5_0__0 : rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1 ;
    public final void rule__Attribute__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1054:1: ( rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1 )
            // InternalDatatypeDefinition.g:1055:2: rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDatatypeDefinition.g:1062:1: rule__Attribute__Group_5_0__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1066:1: ( ( '=' ) )
            // InternalDatatypeDefinition.g:1067:1: ( '=' )
            {
            // InternalDatatypeDefinition.g:1067:1: ( '=' )
            // InternalDatatypeDefinition.g:1068:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1077:1: rule__Attribute__Group_5_0__1 : rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2 ;
    public final void rule__Attribute__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1081:1: ( rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2 )
            // InternalDatatypeDefinition.g:1082:2: rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDatatypeDefinition.g:1089:1: rule__Attribute__Group_5_0__1__Impl : ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) ) ;
    public final void rule__Attribute__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1093:1: ( ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) ) )
            // InternalDatatypeDefinition.g:1094:1: ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) )
            {
            // InternalDatatypeDefinition.g:1094:1: ( ( rule__Attribute__ValueLiteralAssignment_5_0_1 ) )
            // InternalDatatypeDefinition.g:1095:2: ( rule__Attribute__ValueLiteralAssignment_5_0_1 )
            {
             before(grammarAccess.getAttributeAccess().getValueLiteralAssignment_5_0_1()); 
            // InternalDatatypeDefinition.g:1096:2: ( rule__Attribute__ValueLiteralAssignment_5_0_1 )
            // InternalDatatypeDefinition.g:1096:3: rule__Attribute__ValueLiteralAssignment_5_0_1
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
    // InternalDatatypeDefinition.g:1104:1: rule__Attribute__Group_5_0__2 : rule__Attribute__Group_5_0__2__Impl ;
    public final void rule__Attribute__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1108:1: ( rule__Attribute__Group_5_0__2__Impl )
            // InternalDatatypeDefinition.g:1109:2: rule__Attribute__Group_5_0__2__Impl
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
    // InternalDatatypeDefinition.g:1115:1: rule__Attribute__Group_5_0__2__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1119:1: ( ( ';' ) )
            // InternalDatatypeDefinition.g:1120:1: ( ';' )
            {
            // InternalDatatypeDefinition.g:1120:1: ( ';' )
            // InternalDatatypeDefinition.g:1121:2: ';'
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
    // InternalDatatypeDefinition.g:1131:1: rule__Attribute__Group_5_2_0__0 : rule__Attribute__Group_5_2_0__0__Impl rule__Attribute__Group_5_2_0__1 ;
    public final void rule__Attribute__Group_5_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1135:1: ( rule__Attribute__Group_5_2_0__0__Impl rule__Attribute__Group_5_2_0__1 )
            // InternalDatatypeDefinition.g:1136:2: rule__Attribute__Group_5_2_0__0__Impl rule__Attribute__Group_5_2_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDatatypeDefinition.g:1143:1: rule__Attribute__Group_5_2_0__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1147:1: ( ( '{' ) )
            // InternalDatatypeDefinition.g:1148:1: ( '{' )
            {
            // InternalDatatypeDefinition.g:1148:1: ( '{' )
            // InternalDatatypeDefinition.g:1149:2: '{'
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
    // InternalDatatypeDefinition.g:1158:1: rule__Attribute__Group_5_2_0__1 : rule__Attribute__Group_5_2_0__1__Impl ;
    public final void rule__Attribute__Group_5_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1162:1: ( rule__Attribute__Group_5_2_0__1__Impl )
            // InternalDatatypeDefinition.g:1163:2: rule__Attribute__Group_5_2_0__1__Impl
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
    // InternalDatatypeDefinition.g:1169:1: rule__Attribute__Group_5_2_0__1__Impl : ( ( rule__Attribute__Group_5_2_0_1__0 )? ) ;
    public final void rule__Attribute__Group_5_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1173:1: ( ( ( rule__Attribute__Group_5_2_0_1__0 )? ) )
            // InternalDatatypeDefinition.g:1174:1: ( ( rule__Attribute__Group_5_2_0_1__0 )? )
            {
            // InternalDatatypeDefinition.g:1174:1: ( ( rule__Attribute__Group_5_2_0_1__0 )? )
            // InternalDatatypeDefinition.g:1175:2: ( rule__Attribute__Group_5_2_0_1__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2_0_1()); 
            // InternalDatatypeDefinition.g:1176:2: ( rule__Attribute__Group_5_2_0_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDatatypeDefinition.g:1176:3: rule__Attribute__Group_5_2_0_1__0
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
    // InternalDatatypeDefinition.g:1185:1: rule__Attribute__Group_5_2_0_1__0 : rule__Attribute__Group_5_2_0_1__0__Impl rule__Attribute__Group_5_2_0_1__1 ;
    public final void rule__Attribute__Group_5_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1189:1: ( rule__Attribute__Group_5_2_0_1__0__Impl rule__Attribute__Group_5_2_0_1__1 )
            // InternalDatatypeDefinition.g:1190:2: rule__Attribute__Group_5_2_0_1__0__Impl rule__Attribute__Group_5_2_0_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDatatypeDefinition.g:1197:1: rule__Attribute__Group_5_2_0_1__0__Impl : ( 'value' ) ;
    public final void rule__Attribute__Group_5_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1201:1: ( ( 'value' ) )
            // InternalDatatypeDefinition.g:1202:1: ( 'value' )
            {
            // InternalDatatypeDefinition.g:1202:1: ( 'value' )
            // InternalDatatypeDefinition.g:1203:2: 'value'
            {
             before(grammarAccess.getAttributeAccess().getValueKeyword_5_2_0_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1212:1: rule__Attribute__Group_5_2_0_1__1 : rule__Attribute__Group_5_2_0_1__1__Impl rule__Attribute__Group_5_2_0_1__2 ;
    public final void rule__Attribute__Group_5_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1216:1: ( rule__Attribute__Group_5_2_0_1__1__Impl rule__Attribute__Group_5_2_0_1__2 )
            // InternalDatatypeDefinition.g:1217:2: rule__Attribute__Group_5_2_0_1__1__Impl rule__Attribute__Group_5_2_0_1__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDatatypeDefinition.g:1224:1: rule__Attribute__Group_5_2_0_1__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1228:1: ( ( ':' ) )
            // InternalDatatypeDefinition.g:1229:1: ( ':' )
            {
            // InternalDatatypeDefinition.g:1229:1: ( ':' )
            // InternalDatatypeDefinition.g:1230:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_0_1_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1239:1: rule__Attribute__Group_5_2_0_1__2 : rule__Attribute__Group_5_2_0_1__2__Impl rule__Attribute__Group_5_2_0_1__3 ;
    public final void rule__Attribute__Group_5_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1243:1: ( rule__Attribute__Group_5_2_0_1__2__Impl rule__Attribute__Group_5_2_0_1__3 )
            // InternalDatatypeDefinition.g:1244:2: rule__Attribute__Group_5_2_0_1__2__Impl rule__Attribute__Group_5_2_0_1__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDatatypeDefinition.g:1251:1: rule__Attribute__Group_5_2_0_1__2__Impl : ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) ) ;
    public final void rule__Attribute__Group_5_2_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1255:1: ( ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) ) )
            // InternalDatatypeDefinition.g:1256:1: ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) )
            {
            // InternalDatatypeDefinition.g:1256:1: ( ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 ) )
            // InternalDatatypeDefinition.g:1257:2: ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueLiteralAssignment_5_2_0_1_2()); 
            // InternalDatatypeDefinition.g:1258:2: ( rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 )
            // InternalDatatypeDefinition.g:1258:3: rule__Attribute__ValueLiteralAssignment_5_2_0_1_2
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
    // InternalDatatypeDefinition.g:1266:1: rule__Attribute__Group_5_2_0_1__3 : rule__Attribute__Group_5_2_0_1__3__Impl ;
    public final void rule__Attribute__Group_5_2_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1270:1: ( rule__Attribute__Group_5_2_0_1__3__Impl )
            // InternalDatatypeDefinition.g:1271:2: rule__Attribute__Group_5_2_0_1__3__Impl
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
    // InternalDatatypeDefinition.g:1277:1: rule__Attribute__Group_5_2_0_1__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1281:1: ( ( ';' ) )
            // InternalDatatypeDefinition.g:1282:1: ( ';' )
            {
            // InternalDatatypeDefinition.g:1282:1: ( ';' )
            // InternalDatatypeDefinition.g:1283:2: ';'
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
    // InternalDatatypeDefinition.g:1293:1: rule__Attribute__Group_5_2_1__0 : rule__Attribute__Group_5_2_1__0__Impl rule__Attribute__Group_5_2_1__1 ;
    public final void rule__Attribute__Group_5_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1297:1: ( rule__Attribute__Group_5_2_1__0__Impl rule__Attribute__Group_5_2_1__1 )
            // InternalDatatypeDefinition.g:1298:2: rule__Attribute__Group_5_2_1__0__Impl rule__Attribute__Group_5_2_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDatatypeDefinition.g:1305:1: rule__Attribute__Group_5_2_1__0__Impl : ( 'max' ) ;
    public final void rule__Attribute__Group_5_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1309:1: ( ( 'max' ) )
            // InternalDatatypeDefinition.g:1310:1: ( 'max' )
            {
            // InternalDatatypeDefinition.g:1310:1: ( 'max' )
            // InternalDatatypeDefinition.g:1311:2: 'max'
            {
             before(grammarAccess.getAttributeAccess().getMaxKeyword_5_2_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1320:1: rule__Attribute__Group_5_2_1__1 : rule__Attribute__Group_5_2_1__1__Impl rule__Attribute__Group_5_2_1__2 ;
    public final void rule__Attribute__Group_5_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1324:1: ( rule__Attribute__Group_5_2_1__1__Impl rule__Attribute__Group_5_2_1__2 )
            // InternalDatatypeDefinition.g:1325:2: rule__Attribute__Group_5_2_1__1__Impl rule__Attribute__Group_5_2_1__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDatatypeDefinition.g:1332:1: rule__Attribute__Group_5_2_1__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1336:1: ( ( ':' ) )
            // InternalDatatypeDefinition.g:1337:1: ( ':' )
            {
            // InternalDatatypeDefinition.g:1337:1: ( ':' )
            // InternalDatatypeDefinition.g:1338:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_1_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1347:1: rule__Attribute__Group_5_2_1__2 : rule__Attribute__Group_5_2_1__2__Impl rule__Attribute__Group_5_2_1__3 ;
    public final void rule__Attribute__Group_5_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1351:1: ( rule__Attribute__Group_5_2_1__2__Impl rule__Attribute__Group_5_2_1__3 )
            // InternalDatatypeDefinition.g:1352:2: rule__Attribute__Group_5_2_1__2__Impl rule__Attribute__Group_5_2_1__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDatatypeDefinition.g:1359:1: rule__Attribute__Group_5_2_1__2__Impl : ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) ) ;
    public final void rule__Attribute__Group_5_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1363:1: ( ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) ) )
            // InternalDatatypeDefinition.g:1364:1: ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) )
            {
            // InternalDatatypeDefinition.g:1364:1: ( ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 ) )
            // InternalDatatypeDefinition.g:1365:2: ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getMaxValueLiteralAssignment_5_2_1_2()); 
            // InternalDatatypeDefinition.g:1366:2: ( rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 )
            // InternalDatatypeDefinition.g:1366:3: rule__Attribute__MaxValueLiteralAssignment_5_2_1_2
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
    // InternalDatatypeDefinition.g:1374:1: rule__Attribute__Group_5_2_1__3 : rule__Attribute__Group_5_2_1__3__Impl ;
    public final void rule__Attribute__Group_5_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1378:1: ( rule__Attribute__Group_5_2_1__3__Impl )
            // InternalDatatypeDefinition.g:1379:2: rule__Attribute__Group_5_2_1__3__Impl
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
    // InternalDatatypeDefinition.g:1385:1: rule__Attribute__Group_5_2_1__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1389:1: ( ( ';' ) )
            // InternalDatatypeDefinition.g:1390:1: ( ';' )
            {
            // InternalDatatypeDefinition.g:1390:1: ( ';' )
            // InternalDatatypeDefinition.g:1391:2: ';'
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
    // InternalDatatypeDefinition.g:1401:1: rule__Attribute__Group_5_2_2__0 : rule__Attribute__Group_5_2_2__0__Impl rule__Attribute__Group_5_2_2__1 ;
    public final void rule__Attribute__Group_5_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1405:1: ( rule__Attribute__Group_5_2_2__0__Impl rule__Attribute__Group_5_2_2__1 )
            // InternalDatatypeDefinition.g:1406:2: rule__Attribute__Group_5_2_2__0__Impl rule__Attribute__Group_5_2_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDatatypeDefinition.g:1413:1: rule__Attribute__Group_5_2_2__0__Impl : ( 'min' ) ;
    public final void rule__Attribute__Group_5_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1417:1: ( ( 'min' ) )
            // InternalDatatypeDefinition.g:1418:1: ( 'min' )
            {
            // InternalDatatypeDefinition.g:1418:1: ( 'min' )
            // InternalDatatypeDefinition.g:1419:2: 'min'
            {
             before(grammarAccess.getAttributeAccess().getMinKeyword_5_2_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1428:1: rule__Attribute__Group_5_2_2__1 : rule__Attribute__Group_5_2_2__1__Impl rule__Attribute__Group_5_2_2__2 ;
    public final void rule__Attribute__Group_5_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1432:1: ( rule__Attribute__Group_5_2_2__1__Impl rule__Attribute__Group_5_2_2__2 )
            // InternalDatatypeDefinition.g:1433:2: rule__Attribute__Group_5_2_2__1__Impl rule__Attribute__Group_5_2_2__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDatatypeDefinition.g:1440:1: rule__Attribute__Group_5_2_2__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1444:1: ( ( ':' ) )
            // InternalDatatypeDefinition.g:1445:1: ( ':' )
            {
            // InternalDatatypeDefinition.g:1445:1: ( ':' )
            // InternalDatatypeDefinition.g:1446:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_2_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1455:1: rule__Attribute__Group_5_2_2__2 : rule__Attribute__Group_5_2_2__2__Impl rule__Attribute__Group_5_2_2__3 ;
    public final void rule__Attribute__Group_5_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1459:1: ( rule__Attribute__Group_5_2_2__2__Impl rule__Attribute__Group_5_2_2__3 )
            // InternalDatatypeDefinition.g:1460:2: rule__Attribute__Group_5_2_2__2__Impl rule__Attribute__Group_5_2_2__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDatatypeDefinition.g:1467:1: rule__Attribute__Group_5_2_2__2__Impl : ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) ) ;
    public final void rule__Attribute__Group_5_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1471:1: ( ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) ) )
            // InternalDatatypeDefinition.g:1472:1: ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) )
            {
            // InternalDatatypeDefinition.g:1472:1: ( ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 ) )
            // InternalDatatypeDefinition.g:1473:2: ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 )
            {
             before(grammarAccess.getAttributeAccess().getMinValueLiteralAssignment_5_2_2_2()); 
            // InternalDatatypeDefinition.g:1474:2: ( rule__Attribute__MinValueLiteralAssignment_5_2_2_2 )
            // InternalDatatypeDefinition.g:1474:3: rule__Attribute__MinValueLiteralAssignment_5_2_2_2
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
    // InternalDatatypeDefinition.g:1482:1: rule__Attribute__Group_5_2_2__3 : rule__Attribute__Group_5_2_2__3__Impl ;
    public final void rule__Attribute__Group_5_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1486:1: ( rule__Attribute__Group_5_2_2__3__Impl )
            // InternalDatatypeDefinition.g:1487:2: rule__Attribute__Group_5_2_2__3__Impl
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
    // InternalDatatypeDefinition.g:1493:1: rule__Attribute__Group_5_2_2__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1497:1: ( ( ';' ) )
            // InternalDatatypeDefinition.g:1498:1: ( ';' )
            {
            // InternalDatatypeDefinition.g:1498:1: ( ';' )
            // InternalDatatypeDefinition.g:1499:2: ';'
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
    // InternalDatatypeDefinition.g:1509:1: rule__Attribute__Group_5_2_3__0 : rule__Attribute__Group_5_2_3__0__Impl rule__Attribute__Group_5_2_3__1 ;
    public final void rule__Attribute__Group_5_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1513:1: ( rule__Attribute__Group_5_2_3__0__Impl rule__Attribute__Group_5_2_3__1 )
            // InternalDatatypeDefinition.g:1514:2: rule__Attribute__Group_5_2_3__0__Impl rule__Attribute__Group_5_2_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDatatypeDefinition.g:1521:1: rule__Attribute__Group_5_2_3__0__Impl : ( 'referenceFrame' ) ;
    public final void rule__Attribute__Group_5_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1525:1: ( ( 'referenceFrame' ) )
            // InternalDatatypeDefinition.g:1526:1: ( 'referenceFrame' )
            {
            // InternalDatatypeDefinition.g:1526:1: ( 'referenceFrame' )
            // InternalDatatypeDefinition.g:1527:2: 'referenceFrame'
            {
             before(grammarAccess.getAttributeAccess().getReferenceFrameKeyword_5_2_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1536:1: rule__Attribute__Group_5_2_3__1 : rule__Attribute__Group_5_2_3__1__Impl rule__Attribute__Group_5_2_3__2 ;
    public final void rule__Attribute__Group_5_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1540:1: ( rule__Attribute__Group_5_2_3__1__Impl rule__Attribute__Group_5_2_3__2 )
            // InternalDatatypeDefinition.g:1541:2: rule__Attribute__Group_5_2_3__1__Impl rule__Attribute__Group_5_2_3__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDatatypeDefinition.g:1548:1: rule__Attribute__Group_5_2_3__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1552:1: ( ( ':' ) )
            // InternalDatatypeDefinition.g:1553:1: ( ':' )
            {
            // InternalDatatypeDefinition.g:1553:1: ( ':' )
            // InternalDatatypeDefinition.g:1554:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_3_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1563:1: rule__Attribute__Group_5_2_3__2 : rule__Attribute__Group_5_2_3__2__Impl rule__Attribute__Group_5_2_3__3 ;
    public final void rule__Attribute__Group_5_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1567:1: ( rule__Attribute__Group_5_2_3__2__Impl rule__Attribute__Group_5_2_3__3 )
            // InternalDatatypeDefinition.g:1568:2: rule__Attribute__Group_5_2_3__2__Impl rule__Attribute__Group_5_2_3__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDatatypeDefinition.g:1575:1: rule__Attribute__Group_5_2_3__2__Impl : ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) ) ;
    public final void rule__Attribute__Group_5_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1579:1: ( ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) ) )
            // InternalDatatypeDefinition.g:1580:1: ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) )
            {
            // InternalDatatypeDefinition.g:1580:1: ( ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 ) )
            // InternalDatatypeDefinition.g:1581:2: ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 )
            {
             before(grammarAccess.getAttributeAccess().getReferenceFrameAssignment_5_2_3_2()); 
            // InternalDatatypeDefinition.g:1582:2: ( rule__Attribute__ReferenceFrameAssignment_5_2_3_2 )
            // InternalDatatypeDefinition.g:1582:3: rule__Attribute__ReferenceFrameAssignment_5_2_3_2
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
    // InternalDatatypeDefinition.g:1590:1: rule__Attribute__Group_5_2_3__3 : rule__Attribute__Group_5_2_3__3__Impl ;
    public final void rule__Attribute__Group_5_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1594:1: ( rule__Attribute__Group_5_2_3__3__Impl )
            // InternalDatatypeDefinition.g:1595:2: rule__Attribute__Group_5_2_3__3__Impl
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
    // InternalDatatypeDefinition.g:1601:1: rule__Attribute__Group_5_2_3__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1605:1: ( ( ';' ) )
            // InternalDatatypeDefinition.g:1606:1: ( ';' )
            {
            // InternalDatatypeDefinition.g:1606:1: ( ';' )
            // InternalDatatypeDefinition.g:1607:2: ';'
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
    // InternalDatatypeDefinition.g:1617:1: rule__Attribute__Group_5_2_4__0 : rule__Attribute__Group_5_2_4__0__Impl rule__Attribute__Group_5_2_4__1 ;
    public final void rule__Attribute__Group_5_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1621:1: ( rule__Attribute__Group_5_2_4__0__Impl rule__Attribute__Group_5_2_4__1 )
            // InternalDatatypeDefinition.g:1622:2: rule__Attribute__Group_5_2_4__0__Impl rule__Attribute__Group_5_2_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDatatypeDefinition.g:1629:1: rule__Attribute__Group_5_2_4__0__Impl : ( ( rule__Attribute__Group_5_2_4_0__0 )? ) ;
    public final void rule__Attribute__Group_5_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1633:1: ( ( ( rule__Attribute__Group_5_2_4_0__0 )? ) )
            // InternalDatatypeDefinition.g:1634:1: ( ( rule__Attribute__Group_5_2_4_0__0 )? )
            {
            // InternalDatatypeDefinition.g:1634:1: ( ( rule__Attribute__Group_5_2_4_0__0 )? )
            // InternalDatatypeDefinition.g:1635:2: ( rule__Attribute__Group_5_2_4_0__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2_4_0()); 
            // InternalDatatypeDefinition.g:1636:2: ( rule__Attribute__Group_5_2_4_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDatatypeDefinition.g:1636:3: rule__Attribute__Group_5_2_4_0__0
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
    // InternalDatatypeDefinition.g:1644:1: rule__Attribute__Group_5_2_4__1 : rule__Attribute__Group_5_2_4__1__Impl rule__Attribute__Group_5_2_4__2 ;
    public final void rule__Attribute__Group_5_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1648:1: ( rule__Attribute__Group_5_2_4__1__Impl rule__Attribute__Group_5_2_4__2 )
            // InternalDatatypeDefinition.g:1649:2: rule__Attribute__Group_5_2_4__1__Impl rule__Attribute__Group_5_2_4__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDatatypeDefinition.g:1656:1: rule__Attribute__Group_5_2_4__1__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1660:1: ( ( '}' ) )
            // InternalDatatypeDefinition.g:1661:1: ( '}' )
            {
            // InternalDatatypeDefinition.g:1661:1: ( '}' )
            // InternalDatatypeDefinition.g:1662:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1671:1: rule__Attribute__Group_5_2_4__2 : rule__Attribute__Group_5_2_4__2__Impl ;
    public final void rule__Attribute__Group_5_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1675:1: ( rule__Attribute__Group_5_2_4__2__Impl )
            // InternalDatatypeDefinition.g:1676:2: rule__Attribute__Group_5_2_4__2__Impl
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
    // InternalDatatypeDefinition.g:1682:1: rule__Attribute__Group_5_2_4__2__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1686:1: ( ( ';' ) )
            // InternalDatatypeDefinition.g:1687:1: ( ';' )
            {
            // InternalDatatypeDefinition.g:1687:1: ( ';' )
            // InternalDatatypeDefinition.g:1688:2: ';'
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
    // InternalDatatypeDefinition.g:1698:1: rule__Attribute__Group_5_2_4_0__0 : rule__Attribute__Group_5_2_4_0__0__Impl rule__Attribute__Group_5_2_4_0__1 ;
    public final void rule__Attribute__Group_5_2_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1702:1: ( rule__Attribute__Group_5_2_4_0__0__Impl rule__Attribute__Group_5_2_4_0__1 )
            // InternalDatatypeDefinition.g:1703:2: rule__Attribute__Group_5_2_4_0__0__Impl rule__Attribute__Group_5_2_4_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDatatypeDefinition.g:1710:1: rule__Attribute__Group_5_2_4_0__0__Impl : ( 'unit' ) ;
    public final void rule__Attribute__Group_5_2_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1714:1: ( ( 'unit' ) )
            // InternalDatatypeDefinition.g:1715:1: ( 'unit' )
            {
            // InternalDatatypeDefinition.g:1715:1: ( 'unit' )
            // InternalDatatypeDefinition.g:1716:2: 'unit'
            {
             before(grammarAccess.getAttributeAccess().getUnitKeyword_5_2_4_0_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1725:1: rule__Attribute__Group_5_2_4_0__1 : rule__Attribute__Group_5_2_4_0__1__Impl rule__Attribute__Group_5_2_4_0__2 ;
    public final void rule__Attribute__Group_5_2_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1729:1: ( rule__Attribute__Group_5_2_4_0__1__Impl rule__Attribute__Group_5_2_4_0__2 )
            // InternalDatatypeDefinition.g:1730:2: rule__Attribute__Group_5_2_4_0__1__Impl rule__Attribute__Group_5_2_4_0__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDatatypeDefinition.g:1737:1: rule__Attribute__Group_5_2_4_0__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5_2_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1741:1: ( ( ':' ) )
            // InternalDatatypeDefinition.g:1742:1: ( ':' )
            {
            // InternalDatatypeDefinition.g:1742:1: ( ':' )
            // InternalDatatypeDefinition.g:1743:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5_2_4_0_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1752:1: rule__Attribute__Group_5_2_4_0__2 : rule__Attribute__Group_5_2_4_0__2__Impl rule__Attribute__Group_5_2_4_0__3 ;
    public final void rule__Attribute__Group_5_2_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1756:1: ( rule__Attribute__Group_5_2_4_0__2__Impl rule__Attribute__Group_5_2_4_0__3 )
            // InternalDatatypeDefinition.g:1757:2: rule__Attribute__Group_5_2_4_0__2__Impl rule__Attribute__Group_5_2_4_0__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDatatypeDefinition.g:1764:1: rule__Attribute__Group_5_2_4_0__2__Impl : ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) ) ;
    public final void rule__Attribute__Group_5_2_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1768:1: ( ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) ) )
            // InternalDatatypeDefinition.g:1769:1: ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) )
            {
            // InternalDatatypeDefinition.g:1769:1: ( ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 ) )
            // InternalDatatypeDefinition.g:1770:2: ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeUnitAssignment_5_2_4_0_2()); 
            // InternalDatatypeDefinition.g:1771:2: ( rule__Attribute__TypeUnitAssignment_5_2_4_0_2 )
            // InternalDatatypeDefinition.g:1771:3: rule__Attribute__TypeUnitAssignment_5_2_4_0_2
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
    // InternalDatatypeDefinition.g:1779:1: rule__Attribute__Group_5_2_4_0__3 : rule__Attribute__Group_5_2_4_0__3__Impl ;
    public final void rule__Attribute__Group_5_2_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1783:1: ( rule__Attribute__Group_5_2_4_0__3__Impl )
            // InternalDatatypeDefinition.g:1784:2: rule__Attribute__Group_5_2_4_0__3__Impl
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
    // InternalDatatypeDefinition.g:1790:1: rule__Attribute__Group_5_2_4_0__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group_5_2_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1794:1: ( ( ';' ) )
            // InternalDatatypeDefinition.g:1795:1: ( ';' )
            {
            // InternalDatatypeDefinition.g:1795:1: ( ';' )
            // InternalDatatypeDefinition.g:1796:2: ';'
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
    // InternalDatatypeDefinition.g:1806:1: rule__ArrayDimension__Group__0 : rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1 ;
    public final void rule__ArrayDimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1810:1: ( rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1 )
            // InternalDatatypeDefinition.g:1811:2: rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDatatypeDefinition.g:1818:1: rule__ArrayDimension__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayDimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1822:1: ( ( '[' ) )
            // InternalDatatypeDefinition.g:1823:1: ( '[' )
            {
            // InternalDatatypeDefinition.g:1823:1: ( '[' )
            // InternalDatatypeDefinition.g:1824:2: '['
            {
             before(grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1833:1: rule__ArrayDimension__Group__1 : rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2 ;
    public final void rule__ArrayDimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1837:1: ( rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2 )
            // InternalDatatypeDefinition.g:1838:2: rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalDatatypeDefinition.g:1845:1: rule__ArrayDimension__Group__1__Impl : ( ( rule__ArrayDimension__SizeAssignment_1 ) ) ;
    public final void rule__ArrayDimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1849:1: ( ( ( rule__ArrayDimension__SizeAssignment_1 ) ) )
            // InternalDatatypeDefinition.g:1850:1: ( ( rule__ArrayDimension__SizeAssignment_1 ) )
            {
            // InternalDatatypeDefinition.g:1850:1: ( ( rule__ArrayDimension__SizeAssignment_1 ) )
            // InternalDatatypeDefinition.g:1851:2: ( rule__ArrayDimension__SizeAssignment_1 )
            {
             before(grammarAccess.getArrayDimensionAccess().getSizeAssignment_1()); 
            // InternalDatatypeDefinition.g:1852:2: ( rule__ArrayDimension__SizeAssignment_1 )
            // InternalDatatypeDefinition.g:1852:3: rule__ArrayDimension__SizeAssignment_1
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
    // InternalDatatypeDefinition.g:1860:1: rule__ArrayDimension__Group__2 : rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3 ;
    public final void rule__ArrayDimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1864:1: ( rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3 )
            // InternalDatatypeDefinition.g:1865:2: rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDatatypeDefinition.g:1872:1: rule__ArrayDimension__Group__2__Impl : ( ( rule__ArrayDimension__Group_2__0 )? ) ;
    public final void rule__ArrayDimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1876:1: ( ( ( rule__ArrayDimension__Group_2__0 )? ) )
            // InternalDatatypeDefinition.g:1877:1: ( ( rule__ArrayDimension__Group_2__0 )? )
            {
            // InternalDatatypeDefinition.g:1877:1: ( ( rule__ArrayDimension__Group_2__0 )? )
            // InternalDatatypeDefinition.g:1878:2: ( rule__ArrayDimension__Group_2__0 )?
            {
             before(grammarAccess.getArrayDimensionAccess().getGroup_2()); 
            // InternalDatatypeDefinition.g:1879:2: ( rule__ArrayDimension__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDatatypeDefinition.g:1879:3: rule__ArrayDimension__Group_2__0
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
    // InternalDatatypeDefinition.g:1887:1: rule__ArrayDimension__Group__3 : rule__ArrayDimension__Group__3__Impl ;
    public final void rule__ArrayDimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1891:1: ( rule__ArrayDimension__Group__3__Impl )
            // InternalDatatypeDefinition.g:1892:2: rule__ArrayDimension__Group__3__Impl
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
    // InternalDatatypeDefinition.g:1898:1: rule__ArrayDimension__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayDimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1902:1: ( ( ']' ) )
            // InternalDatatypeDefinition.g:1903:1: ( ']' )
            {
            // InternalDatatypeDefinition.g:1903:1: ( ']' )
            // InternalDatatypeDefinition.g:1904:2: ']'
            {
             before(grammarAccess.getArrayDimensionAccess().getRightSquareBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1914:1: rule__ArrayDimension__Group_2__0 : rule__ArrayDimension__Group_2__0__Impl rule__ArrayDimension__Group_2__1 ;
    public final void rule__ArrayDimension__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1918:1: ( rule__ArrayDimension__Group_2__0__Impl rule__ArrayDimension__Group_2__1 )
            // InternalDatatypeDefinition.g:1919:2: rule__ArrayDimension__Group_2__0__Impl rule__ArrayDimension__Group_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDatatypeDefinition.g:1926:1: rule__ArrayDimension__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayDimension__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1930:1: ( ( ',' ) )
            // InternalDatatypeDefinition.g:1931:1: ( ',' )
            {
            // InternalDatatypeDefinition.g:1931:1: ( ',' )
            // InternalDatatypeDefinition.g:1932:2: ','
            {
             before(grammarAccess.getArrayDimensionAccess().getCommaKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1941:1: rule__ArrayDimension__Group_2__1 : rule__ArrayDimension__Group_2__1__Impl rule__ArrayDimension__Group_2__2 ;
    public final void rule__ArrayDimension__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1945:1: ( rule__ArrayDimension__Group_2__1__Impl rule__ArrayDimension__Group_2__2 )
            // InternalDatatypeDefinition.g:1946:2: rule__ArrayDimension__Group_2__1__Impl rule__ArrayDimension__Group_2__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalDatatypeDefinition.g:1953:1: rule__ArrayDimension__Group_2__1__Impl : ( 'name' ) ;
    public final void rule__ArrayDimension__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1957:1: ( ( 'name' ) )
            // InternalDatatypeDefinition.g:1958:1: ( 'name' )
            {
            // InternalDatatypeDefinition.g:1958:1: ( 'name' )
            // InternalDatatypeDefinition.g:1959:2: 'name'
            {
             before(grammarAccess.getArrayDimensionAccess().getNameKeyword_2_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1968:1: rule__ArrayDimension__Group_2__2 : rule__ArrayDimension__Group_2__2__Impl rule__ArrayDimension__Group_2__3 ;
    public final void rule__ArrayDimension__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1972:1: ( rule__ArrayDimension__Group_2__2__Impl rule__ArrayDimension__Group_2__3 )
            // InternalDatatypeDefinition.g:1973:2: rule__ArrayDimension__Group_2__2__Impl rule__ArrayDimension__Group_2__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalDatatypeDefinition.g:1980:1: rule__ArrayDimension__Group_2__2__Impl : ( '=' ) ;
    public final void rule__ArrayDimension__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1984:1: ( ( '=' ) )
            // InternalDatatypeDefinition.g:1985:1: ( '=' )
            {
            // InternalDatatypeDefinition.g:1985:1: ( '=' )
            // InternalDatatypeDefinition.g:1986:2: '='
            {
             before(grammarAccess.getArrayDimensionAccess().getEqualsSignKeyword_2_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:1995:1: rule__ArrayDimension__Group_2__3 : rule__ArrayDimension__Group_2__3__Impl ;
    public final void rule__ArrayDimension__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:1999:1: ( rule__ArrayDimension__Group_2__3__Impl )
            // InternalDatatypeDefinition.g:2000:2: rule__ArrayDimension__Group_2__3__Impl
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
    // InternalDatatypeDefinition.g:2006:1: rule__ArrayDimension__Group_2__3__Impl : ( ( rule__ArrayDimension__NameAssignment_2_3 ) ) ;
    public final void rule__ArrayDimension__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2010:1: ( ( ( rule__ArrayDimension__NameAssignment_2_3 ) ) )
            // InternalDatatypeDefinition.g:2011:1: ( ( rule__ArrayDimension__NameAssignment_2_3 ) )
            {
            // InternalDatatypeDefinition.g:2011:1: ( ( rule__ArrayDimension__NameAssignment_2_3 ) )
            // InternalDatatypeDefinition.g:2012:2: ( rule__ArrayDimension__NameAssignment_2_3 )
            {
             before(grammarAccess.getArrayDimensionAccess().getNameAssignment_2_3()); 
            // InternalDatatypeDefinition.g:2013:2: ( rule__ArrayDimension__NameAssignment_2_3 )
            // InternalDatatypeDefinition.g:2013:3: rule__ArrayDimension__NameAssignment_2_3
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
    // InternalDatatypeDefinition.g:2022:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2026:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDatatypeDefinition.g:2027:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDatatypeDefinition.g:2034:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2038:1: ( ( ( '-' )? ) )
            // InternalDatatypeDefinition.g:2039:1: ( ( '-' )? )
            {
            // InternalDatatypeDefinition.g:2039:1: ( ( '-' )? )
            // InternalDatatypeDefinition.g:2040:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDatatypeDefinition.g:2041:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDatatypeDefinition.g:2041:3: '-'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalDatatypeDefinition.g:2049:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2053:1: ( rule__EInt__Group__1__Impl )
            // InternalDatatypeDefinition.g:2054:2: rule__EInt__Group__1__Impl
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
    // InternalDatatypeDefinition.g:2060:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2064:1: ( ( RULE_INT ) )
            // InternalDatatypeDefinition.g:2065:1: ( RULE_INT )
            {
            // InternalDatatypeDefinition.g:2065:1: ( RULE_INT )
            // InternalDatatypeDefinition.g:2066:2: RULE_INT
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
    // InternalDatatypeDefinition.g:2076:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2080:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalDatatypeDefinition.g:2081:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDatatypeDefinition.g:2088:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2092:1: ( ( RULE_ID ) )
            // InternalDatatypeDefinition.g:2093:1: ( RULE_ID )
            {
            // InternalDatatypeDefinition.g:2093:1: ( RULE_ID )
            // InternalDatatypeDefinition.g:2094:2: RULE_ID
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
    // InternalDatatypeDefinition.g:2103:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2107:1: ( rule__FQN__Group__1__Impl )
            // InternalDatatypeDefinition.g:2108:2: rule__FQN__Group__1__Impl
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
    // InternalDatatypeDefinition.g:2114:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2118:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalDatatypeDefinition.g:2119:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalDatatypeDefinition.g:2119:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalDatatypeDefinition.g:2120:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalDatatypeDefinition.g:2121:2: ( rule__FQN__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDatatypeDefinition.g:2121:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalDatatypeDefinition.g:2130:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2134:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalDatatypeDefinition.g:2135:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDatatypeDefinition.g:2142:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2146:1: ( ( '.' ) )
            // InternalDatatypeDefinition.g:2147:1: ( '.' )
            {
            // InternalDatatypeDefinition.g:2147:1: ( '.' )
            // InternalDatatypeDefinition.g:2148:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:2157:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2161:1: ( rule__FQN__Group_1__1__Impl )
            // InternalDatatypeDefinition.g:2162:2: rule__FQN__Group_1__1__Impl
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
    // InternalDatatypeDefinition.g:2168:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2172:1: ( ( RULE_ID ) )
            // InternalDatatypeDefinition.g:2173:1: ( RULE_ID )
            {
            // InternalDatatypeDefinition.g:2173:1: ( RULE_ID )
            // InternalDatatypeDefinition.g:2174:2: RULE_ID
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
    // InternalDatatypeDefinition.g:2184:1: rule__Attribute__UnorderedGroup_5_2 : rule__Attribute__UnorderedGroup_5_2__0 {...}?;
    public final void rule__Attribute__UnorderedGroup_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2());
        	
        try {
            // InternalDatatypeDefinition.g:2189:1: ( rule__Attribute__UnorderedGroup_5_2__0 {...}?)
            // InternalDatatypeDefinition.g:2190:2: rule__Attribute__UnorderedGroup_5_2__0 {...}?
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
    // InternalDatatypeDefinition.g:2198:1: rule__Attribute__UnorderedGroup_5_2__Impl : ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) ) ;
    public final void rule__Attribute__UnorderedGroup_5_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalDatatypeDefinition.g:2203:1: ( ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) ) )
            // InternalDatatypeDefinition.g:2204:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) )
            {
            // InternalDatatypeDefinition.g:2204:3: ( ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) ) )
            int alt20=5;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt20=2;
            }
            else if ( LA20_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt20=3;
            }
            else if ( LA20_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt20=4;
            }
            else if ( ( LA20_0 == 14 || LA20_0 == 23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt20=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalDatatypeDefinition.g:2205:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) )
                    {
                    // InternalDatatypeDefinition.g:2205:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) ) )
                    // InternalDatatypeDefinition.g:2206:4: {...}? => ( ( ( rule__Attribute__Group_5_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0)");
                    }
                    // InternalDatatypeDefinition.g:2206:107: ( ( ( rule__Attribute__Group_5_2_0__0 ) ) )
                    // InternalDatatypeDefinition.g:2207:5: ( ( rule__Attribute__Group_5_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalDatatypeDefinition.g:2213:5: ( ( rule__Attribute__Group_5_2_0__0 ) )
                    // InternalDatatypeDefinition.g:2214:6: ( rule__Attribute__Group_5_2_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_0()); 
                    // InternalDatatypeDefinition.g:2215:6: ( rule__Attribute__Group_5_2_0__0 )
                    // InternalDatatypeDefinition.g:2215:7: rule__Attribute__Group_5_2_0__0
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
                    // InternalDatatypeDefinition.g:2220:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) )
                    {
                    // InternalDatatypeDefinition.g:2220:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) ) )
                    // InternalDatatypeDefinition.g:2221:4: {...}? => ( ( ( rule__Attribute__Group_5_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1)");
                    }
                    // InternalDatatypeDefinition.g:2221:107: ( ( ( rule__Attribute__Group_5_2_1__0 ) ) )
                    // InternalDatatypeDefinition.g:2222:5: ( ( rule__Attribute__Group_5_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalDatatypeDefinition.g:2228:5: ( ( rule__Attribute__Group_5_2_1__0 ) )
                    // InternalDatatypeDefinition.g:2229:6: ( rule__Attribute__Group_5_2_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_1()); 
                    // InternalDatatypeDefinition.g:2230:6: ( rule__Attribute__Group_5_2_1__0 )
                    // InternalDatatypeDefinition.g:2230:7: rule__Attribute__Group_5_2_1__0
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
                    // InternalDatatypeDefinition.g:2235:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) )
                    {
                    // InternalDatatypeDefinition.g:2235:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) ) )
                    // InternalDatatypeDefinition.g:2236:4: {...}? => ( ( ( rule__Attribute__Group_5_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2)");
                    }
                    // InternalDatatypeDefinition.g:2236:107: ( ( ( rule__Attribute__Group_5_2_2__0 ) ) )
                    // InternalDatatypeDefinition.g:2237:5: ( ( rule__Attribute__Group_5_2_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2);
                    				

                    					selected = true;
                    				
                    // InternalDatatypeDefinition.g:2243:5: ( ( rule__Attribute__Group_5_2_2__0 ) )
                    // InternalDatatypeDefinition.g:2244:6: ( rule__Attribute__Group_5_2_2__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_2()); 
                    // InternalDatatypeDefinition.g:2245:6: ( rule__Attribute__Group_5_2_2__0 )
                    // InternalDatatypeDefinition.g:2245:7: rule__Attribute__Group_5_2_2__0
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
                    // InternalDatatypeDefinition.g:2250:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) )
                    {
                    // InternalDatatypeDefinition.g:2250:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) ) )
                    // InternalDatatypeDefinition.g:2251:4: {...}? => ( ( ( rule__Attribute__Group_5_2_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3)");
                    }
                    // InternalDatatypeDefinition.g:2251:107: ( ( ( rule__Attribute__Group_5_2_3__0 ) ) )
                    // InternalDatatypeDefinition.g:2252:5: ( ( rule__Attribute__Group_5_2_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3);
                    				

                    					selected = true;
                    				
                    // InternalDatatypeDefinition.g:2258:5: ( ( rule__Attribute__Group_5_2_3__0 ) )
                    // InternalDatatypeDefinition.g:2259:6: ( rule__Attribute__Group_5_2_3__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_3()); 
                    // InternalDatatypeDefinition.g:2260:6: ( rule__Attribute__Group_5_2_3__0 )
                    // InternalDatatypeDefinition.g:2260:7: rule__Attribute__Group_5_2_3__0
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
                    // InternalDatatypeDefinition.g:2265:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) )
                    {
                    // InternalDatatypeDefinition.g:2265:3: ({...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) ) )
                    // InternalDatatypeDefinition.g:2266:4: {...}? => ( ( ( rule__Attribute__Group_5_2_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_5_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4)");
                    }
                    // InternalDatatypeDefinition.g:2266:107: ( ( ( rule__Attribute__Group_5_2_4__0 ) ) )
                    // InternalDatatypeDefinition.g:2267:5: ( ( rule__Attribute__Group_5_2_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4);
                    				

                    					selected = true;
                    				
                    // InternalDatatypeDefinition.g:2273:5: ( ( rule__Attribute__Group_5_2_4__0 ) )
                    // InternalDatatypeDefinition.g:2274:6: ( rule__Attribute__Group_5_2_4__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_2_4()); 
                    // InternalDatatypeDefinition.g:2275:6: ( rule__Attribute__Group_5_2_4__0 )
                    // InternalDatatypeDefinition.g:2275:7: rule__Attribute__Group_5_2_4__0
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
    // InternalDatatypeDefinition.g:2288:1: rule__Attribute__UnorderedGroup_5_2__0 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__1 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2292:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__1 )? )
            // InternalDatatypeDefinition.g:2293:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__1 )?
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalDatatypeDefinition.g:2294:2: ( rule__Attribute__UnorderedGroup_5_2__1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt21=1;
            }
            else if ( LA21_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt21=1;
            }
            else if ( LA21_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt21=1;
            }
            else if ( (LA21_0==14) ) {
                int LA21_6 = input.LA(2);

                if ( LA21_6 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalDatatypeDefinition.g:2294:2: rule__Attribute__UnorderedGroup_5_2__1
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
    // InternalDatatypeDefinition.g:2300:1: rule__Attribute__UnorderedGroup_5_2__1 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__2 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2304:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__2 )? )
            // InternalDatatypeDefinition.g:2305:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__2 )?
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalDatatypeDefinition.g:2306:2: ( rule__Attribute__UnorderedGroup_5_2__2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt22=1;
            }
            else if ( LA22_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt22=1;
            }
            else if ( LA22_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt22=1;
            }
            else if ( (LA22_0==14) ) {
                int LA22_6 = input.LA(2);

                if ( LA22_6 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalDatatypeDefinition.g:2306:2: rule__Attribute__UnorderedGroup_5_2__2
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
    // InternalDatatypeDefinition.g:2312:1: rule__Attribute__UnorderedGroup_5_2__2 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__3 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2316:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__3 )? )
            // InternalDatatypeDefinition.g:2317:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__3 )?
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalDatatypeDefinition.g:2318:2: ( rule__Attribute__UnorderedGroup_5_2__3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt23=1;
            }
            else if ( LA23_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt23=1;
            }
            else if ( LA23_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt23=1;
            }
            else if ( (LA23_0==14) ) {
                int LA23_6 = input.LA(2);

                if ( LA23_6 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalDatatypeDefinition.g:2318:2: rule__Attribute__UnorderedGroup_5_2__3
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
    // InternalDatatypeDefinition.g:2324:1: rule__Attribute__UnorderedGroup_5_2__3 : rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__4 )? ;
    public final void rule__Attribute__UnorderedGroup_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2328:1: ( rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__4 )? )
            // InternalDatatypeDefinition.g:2329:2: rule__Attribute__UnorderedGroup_5_2__Impl ( rule__Attribute__UnorderedGroup_5_2__4 )?
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__UnorderedGroup_5_2__Impl();

            state._fsp--;

            // InternalDatatypeDefinition.g:2330:2: ( rule__Attribute__UnorderedGroup_5_2__4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 3) ) {
                alt24=1;
            }
            else if ( LA24_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                alt24=1;
            }
            else if ( (LA24_0==14) ) {
                int LA24_6 = input.LA(2);

                if ( LA24_6 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_5_2(), 4) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalDatatypeDefinition.g:2330:2: rule__Attribute__UnorderedGroup_5_2__4
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
    // InternalDatatypeDefinition.g:2336:1: rule__Attribute__UnorderedGroup_5_2__4 : rule__Attribute__UnorderedGroup_5_2__Impl ;
    public final void rule__Attribute__UnorderedGroup_5_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2340:1: ( rule__Attribute__UnorderedGroup_5_2__Impl )
            // InternalDatatypeDefinition.g:2341:2: rule__Attribute__UnorderedGroup_5_2__Impl
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


    // $ANTLR start "rule__DataType__AbstractTypeAssignment_0"
    // InternalDatatypeDefinition.g:2348:1: rule__DataType__AbstractTypeAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__DataType__AbstractTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2352:1: ( ( ( 'abstract' ) ) )
            // InternalDatatypeDefinition.g:2353:2: ( ( 'abstract' ) )
            {
            // InternalDatatypeDefinition.g:2353:2: ( ( 'abstract' ) )
            // InternalDatatypeDefinition.g:2354:3: ( 'abstract' )
            {
             before(grammarAccess.getDataTypeAccess().getAbstractTypeAbstractKeyword_0_0()); 
            // InternalDatatypeDefinition.g:2355:3: ( 'abstract' )
            // InternalDatatypeDefinition.g:2356:4: 'abstract'
            {
             before(grammarAccess.getDataTypeAccess().getAbstractTypeAbstractKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getAbstractTypeAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getAbstractTypeAbstractKeyword_0_0()); 

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
    // $ANTLR end "rule__DataType__AbstractTypeAssignment_0"


    // $ANTLR start "rule__DataType__IsTMTypeAssignment_1"
    // InternalDatatypeDefinition.g:2367:1: rule__DataType__IsTMTypeAssignment_1 : ( ( 'telemetry' ) ) ;
    public final void rule__DataType__IsTMTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2371:1: ( ( ( 'telemetry' ) ) )
            // InternalDatatypeDefinition.g:2372:2: ( ( 'telemetry' ) )
            {
            // InternalDatatypeDefinition.g:2372:2: ( ( 'telemetry' ) )
            // InternalDatatypeDefinition.g:2373:3: ( 'telemetry' )
            {
             before(grammarAccess.getDataTypeAccess().getIsTMTypeTelemetryKeyword_1_0()); 
            // InternalDatatypeDefinition.g:2374:3: ( 'telemetry' )
            // InternalDatatypeDefinition.g:2375:4: 'telemetry'
            {
             before(grammarAccess.getDataTypeAccess().getIsTMTypeTelemetryKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getIsTMTypeTelemetryKeyword_1_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getIsTMTypeTelemetryKeyword_1_0()); 

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
    // $ANTLR end "rule__DataType__IsTMTypeAssignment_1"


    // $ANTLR start "rule__DataType__NameAssignment_3"
    // InternalDatatypeDefinition.g:2386:1: rule__DataType__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__DataType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2390:1: ( ( ruleEString ) )
            // InternalDatatypeDefinition.g:2391:2: ( ruleEString )
            {
            // InternalDatatypeDefinition.g:2391:2: ( ruleEString )
            // InternalDatatypeDefinition.g:2392:3: ruleEString
            {
             before(grammarAccess.getDataTypeAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DataType__NameAssignment_3"


    // $ANTLR start "rule__DataType__SuperTypeAssignment_4_1"
    // InternalDatatypeDefinition.g:2401:1: rule__DataType__SuperTypeAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__DataType__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2405:1: ( ( ( ruleFQN ) ) )
            // InternalDatatypeDefinition.g:2406:2: ( ( ruleFQN ) )
            {
            // InternalDatatypeDefinition.g:2406:2: ( ( ruleFQN ) )
            // InternalDatatypeDefinition.g:2407:3: ( ruleFQN )
            {
             before(grammarAccess.getDataTypeAccess().getSuperTypeDataTypeCrossReference_4_1_0()); 
            // InternalDatatypeDefinition.g:2408:3: ( ruleFQN )
            // InternalDatatypeDefinition.g:2409:4: ruleFQN
            {
             before(grammarAccess.getDataTypeAccess().getSuperTypeDataTypeFQNParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getSuperTypeDataTypeFQNParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getDataTypeAccess().getSuperTypeDataTypeCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__DataType__SuperTypeAssignment_4_1"


    // $ANTLR start "rule__DataType__AttributesAssignment_6"
    // InternalDatatypeDefinition.g:2420:1: rule__DataType__AttributesAssignment_6 : ( ruleAttribute ) ;
    public final void rule__DataType__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2424:1: ( ( ruleAttribute ) )
            // InternalDatatypeDefinition.g:2425:2: ( ruleAttribute )
            {
            // InternalDatatypeDefinition.g:2425:2: ( ruleAttribute )
            // InternalDatatypeDefinition.g:2426:3: ruleAttribute
            {
             before(grammarAccess.getDataTypeAccess().getAttributesAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getAttributesAttributeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__DataType__AttributesAssignment_6"


    // $ANTLR start "rule__ExternalType__AbstractTypeAssignment_1"
    // InternalDatatypeDefinition.g:2435:1: rule__ExternalType__AbstractTypeAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__ExternalType__AbstractTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2439:1: ( ( ( 'abstract' ) ) )
            // InternalDatatypeDefinition.g:2440:2: ( ( 'abstract' ) )
            {
            // InternalDatatypeDefinition.g:2440:2: ( ( 'abstract' ) )
            // InternalDatatypeDefinition.g:2441:3: ( 'abstract' )
            {
             before(grammarAccess.getExternalTypeAccess().getAbstractTypeAbstractKeyword_1_0()); 
            // InternalDatatypeDefinition.g:2442:3: ( 'abstract' )
            // InternalDatatypeDefinition.g:2443:4: 'abstract'
            {
             before(grammarAccess.getExternalTypeAccess().getAbstractTypeAbstractKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExternalTypeAccess().getAbstractTypeAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getExternalTypeAccess().getAbstractTypeAbstractKeyword_1_0()); 

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
    // $ANTLR end "rule__ExternalType__AbstractTypeAssignment_1"


    // $ANTLR start "rule__ExternalType__IsTMTypeAssignment_2"
    // InternalDatatypeDefinition.g:2454:1: rule__ExternalType__IsTMTypeAssignment_2 : ( ( 'telemetry' ) ) ;
    public final void rule__ExternalType__IsTMTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2458:1: ( ( ( 'telemetry' ) ) )
            // InternalDatatypeDefinition.g:2459:2: ( ( 'telemetry' ) )
            {
            // InternalDatatypeDefinition.g:2459:2: ( ( 'telemetry' ) )
            // InternalDatatypeDefinition.g:2460:3: ( 'telemetry' )
            {
             before(grammarAccess.getExternalTypeAccess().getIsTMTypeTelemetryKeyword_2_0()); 
            // InternalDatatypeDefinition.g:2461:3: ( 'telemetry' )
            // InternalDatatypeDefinition.g:2462:4: 'telemetry'
            {
             before(grammarAccess.getExternalTypeAccess().getIsTMTypeTelemetryKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExternalTypeAccess().getIsTMTypeTelemetryKeyword_2_0()); 

            }

             after(grammarAccess.getExternalTypeAccess().getIsTMTypeTelemetryKeyword_2_0()); 

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
    // $ANTLR end "rule__ExternalType__IsTMTypeAssignment_2"


    // $ANTLR start "rule__ExternalType__NameAssignment_4"
    // InternalDatatypeDefinition.g:2473:1: rule__ExternalType__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__ExternalType__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2477:1: ( ( ruleEString ) )
            // InternalDatatypeDefinition.g:2478:2: ( ruleEString )
            {
            // InternalDatatypeDefinition.g:2478:2: ( ruleEString )
            // InternalDatatypeDefinition.g:2479:3: ruleEString
            {
             before(grammarAccess.getExternalTypeAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalTypeAccess().getNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ExternalType__NameAssignment_4"


    // $ANTLR start "rule__ExternalType__SuperTypeAssignment_5_1"
    // InternalDatatypeDefinition.g:2488:1: rule__ExternalType__SuperTypeAssignment_5_1 : ( ( ruleFQN ) ) ;
    public final void rule__ExternalType__SuperTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2492:1: ( ( ( ruleFQN ) ) )
            // InternalDatatypeDefinition.g:2493:2: ( ( ruleFQN ) )
            {
            // InternalDatatypeDefinition.g:2493:2: ( ( ruleFQN ) )
            // InternalDatatypeDefinition.g:2494:3: ( ruleFQN )
            {
             before(grammarAccess.getExternalTypeAccess().getSuperTypeDataTypeCrossReference_5_1_0()); 
            // InternalDatatypeDefinition.g:2495:3: ( ruleFQN )
            // InternalDatatypeDefinition.g:2496:4: ruleFQN
            {
             before(grammarAccess.getExternalTypeAccess().getSuperTypeDataTypeFQNParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getExternalTypeAccess().getSuperTypeDataTypeFQNParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getExternalTypeAccess().getSuperTypeDataTypeCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__ExternalType__SuperTypeAssignment_5_1"


    // $ANTLR start "rule__ExternalType__AttributesAssignment_7"
    // InternalDatatypeDefinition.g:2507:1: rule__ExternalType__AttributesAssignment_7 : ( ruleAttribute ) ;
    public final void rule__ExternalType__AttributesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2511:1: ( ( ruleAttribute ) )
            // InternalDatatypeDefinition.g:2512:2: ( ruleAttribute )
            {
            // InternalDatatypeDefinition.g:2512:2: ( ruleAttribute )
            // InternalDatatypeDefinition.g:2513:3: ruleAttribute
            {
             before(grammarAccess.getExternalTypeAccess().getAttributesAttributeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getExternalTypeAccess().getAttributesAttributeParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ExternalType__AttributesAssignment_7"


    // $ANTLR start "rule__Attribute__IsConstAssignment_0"
    // InternalDatatypeDefinition.g:2522:1: rule__Attribute__IsConstAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__Attribute__IsConstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2526:1: ( ( ( 'const' ) ) )
            // InternalDatatypeDefinition.g:2527:2: ( ( 'const' ) )
            {
            // InternalDatatypeDefinition.g:2527:2: ( ( 'const' ) )
            // InternalDatatypeDefinition.g:2528:3: ( 'const' )
            {
             before(grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0()); 
            // InternalDatatypeDefinition.g:2529:3: ( 'const' )
            // InternalDatatypeDefinition.g:2530:4: 'const'
            {
             before(grammarAccess.getAttributeAccess().getIsConstConstKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDatatypeDefinition.g:2541:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2545:1: ( ( ruleEString ) )
            // InternalDatatypeDefinition.g:2546:2: ( ruleEString )
            {
            // InternalDatatypeDefinition.g:2546:2: ( ruleEString )
            // InternalDatatypeDefinition.g:2547:3: ruleEString
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
    // InternalDatatypeDefinition.g:2556:1: rule__Attribute__TypeOfAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__TypeOfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2560:1: ( ( ( ruleFQN ) ) )
            // InternalDatatypeDefinition.g:2561:2: ( ( ruleFQN ) )
            {
            // InternalDatatypeDefinition.g:2561:2: ( ( ruleFQN ) )
            // InternalDatatypeDefinition.g:2562:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getTypeOfITypeCrossReference_3_0()); 
            // InternalDatatypeDefinition.g:2563:3: ( ruleFQN )
            // InternalDatatypeDefinition.g:2564:4: ruleFQN
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
    // InternalDatatypeDefinition.g:2575:1: rule__Attribute__DimensionsAssignment_4 : ( ruleArrayDimension ) ;
    public final void rule__Attribute__DimensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2579:1: ( ( ruleArrayDimension ) )
            // InternalDatatypeDefinition.g:2580:2: ( ruleArrayDimension )
            {
            // InternalDatatypeDefinition.g:2580:2: ( ruleArrayDimension )
            // InternalDatatypeDefinition.g:2581:3: ruleArrayDimension
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
    // InternalDatatypeDefinition.g:2590:1: rule__Attribute__ValueLiteralAssignment_5_0_1 : ( ruleEString ) ;
    public final void rule__Attribute__ValueLiteralAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2594:1: ( ( ruleEString ) )
            // InternalDatatypeDefinition.g:2595:2: ( ruleEString )
            {
            // InternalDatatypeDefinition.g:2595:2: ( ruleEString )
            // InternalDatatypeDefinition.g:2596:3: ruleEString
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
    // InternalDatatypeDefinition.g:2605:1: rule__Attribute__ValueLiteralAssignment_5_2_0_1_2 : ( ruleEString ) ;
    public final void rule__Attribute__ValueLiteralAssignment_5_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2609:1: ( ( ruleEString ) )
            // InternalDatatypeDefinition.g:2610:2: ( ruleEString )
            {
            // InternalDatatypeDefinition.g:2610:2: ( ruleEString )
            // InternalDatatypeDefinition.g:2611:3: ruleEString
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
    // InternalDatatypeDefinition.g:2620:1: rule__Attribute__MaxValueLiteralAssignment_5_2_1_2 : ( ruleEString ) ;
    public final void rule__Attribute__MaxValueLiteralAssignment_5_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2624:1: ( ( ruleEString ) )
            // InternalDatatypeDefinition.g:2625:2: ( ruleEString )
            {
            // InternalDatatypeDefinition.g:2625:2: ( ruleEString )
            // InternalDatatypeDefinition.g:2626:3: ruleEString
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
    // InternalDatatypeDefinition.g:2635:1: rule__Attribute__MinValueLiteralAssignment_5_2_2_2 : ( ruleEString ) ;
    public final void rule__Attribute__MinValueLiteralAssignment_5_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2639:1: ( ( ruleEString ) )
            // InternalDatatypeDefinition.g:2640:2: ( ruleEString )
            {
            // InternalDatatypeDefinition.g:2640:2: ( ruleEString )
            // InternalDatatypeDefinition.g:2641:3: ruleEString
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
    // InternalDatatypeDefinition.g:2650:1: rule__Attribute__ReferenceFrameAssignment_5_2_3_2 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__ReferenceFrameAssignment_5_2_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2654:1: ( ( ( ruleFQN ) ) )
            // InternalDatatypeDefinition.g:2655:2: ( ( ruleFQN ) )
            {
            // InternalDatatypeDefinition.g:2655:2: ( ( ruleFQN ) )
            // InternalDatatypeDefinition.g:2656:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getReferenceFrameReferenceFrameDefinitionCrossReference_5_2_3_2_0()); 
            // InternalDatatypeDefinition.g:2657:3: ( ruleFQN )
            // InternalDatatypeDefinition.g:2658:4: ruleFQN
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
    // InternalDatatypeDefinition.g:2669:1: rule__Attribute__TypeUnitAssignment_5_2_4_0_2 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__TypeUnitAssignment_5_2_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2673:1: ( ( ( ruleFQN ) ) )
            // InternalDatatypeDefinition.g:2674:2: ( ( ruleFQN ) )
            {
            // InternalDatatypeDefinition.g:2674:2: ( ( ruleFQN ) )
            // InternalDatatypeDefinition.g:2675:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getTypeUnitUnitDefinitionCrossReference_5_2_4_0_2_0()); 
            // InternalDatatypeDefinition.g:2676:3: ( ruleFQN )
            // InternalDatatypeDefinition.g:2677:4: ruleFQN
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
    // InternalDatatypeDefinition.g:2688:1: rule__ArrayDimension__SizeAssignment_1 : ( ruleEInt ) ;
    public final void rule__ArrayDimension__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2692:1: ( ( ruleEInt ) )
            // InternalDatatypeDefinition.g:2693:2: ( ruleEInt )
            {
            // InternalDatatypeDefinition.g:2693:2: ( ruleEInt )
            // InternalDatatypeDefinition.g:2694:3: ruleEInt
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
    // InternalDatatypeDefinition.g:2703:1: rule__ArrayDimension__NameAssignment_2_3 : ( ruleEString ) ;
    public final void rule__ArrayDimension__NameAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatatypeDefinition.g:2707:1: ( ( ruleEString ) )
            // InternalDatatypeDefinition.g:2708:2: ( ruleEString )
            {
            // InternalDatatypeDefinition.g:2708:2: ( ruleEString )
            // InternalDatatypeDefinition.g:2709:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100004030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000C0001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001F46800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000F06000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000F06002L});

}
