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
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.services.EnumDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnumDefinitionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Enum'", "'{'", "'}'", "','", "'='", "'-'"
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

    	public void setGrammarAccess(EnumDefinitionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEnumeration"
    // InternalEnumDefinition.g:53:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalEnumDefinition.g:54:1: ( ruleEnumeration EOF )
            // InternalEnumDefinition.g:55:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalEnumDefinition.g:62:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:66:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalEnumDefinition.g:67:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalEnumDefinition.g:67:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalEnumDefinition.g:68:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalEnumDefinition.g:69:3: ( rule__Enumeration__Group__0 )
            // InternalEnumDefinition.g:69:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEString"
    // InternalEnumDefinition.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEnumDefinition.g:79:1: ( ruleEString EOF )
            // InternalEnumDefinition.g:80:1: ruleEString EOF
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
    // InternalEnumDefinition.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEnumDefinition.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalEnumDefinition.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalEnumDefinition.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalEnumDefinition.g:94:3: ( rule__EString__Alternatives )
            // InternalEnumDefinition.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalEnumDefinition.g:103:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalEnumDefinition.g:104:1: ( ruleEnumerationLiteral EOF )
            // InternalEnumDefinition.g:105:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
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
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalEnumDefinition.g:112:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:116:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalEnumDefinition.g:117:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalEnumDefinition.g:117:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalEnumDefinition.g:118:3: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // InternalEnumDefinition.g:119:3: ( rule__EnumerationLiteral__Group__0 )
            // InternalEnumDefinition.g:119:4: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleEInt"
    // InternalEnumDefinition.g:128:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalEnumDefinition.g:129:1: ( ruleEInt EOF )
            // InternalEnumDefinition.g:130:1: ruleEInt EOF
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
    // InternalEnumDefinition.g:137:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:141:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalEnumDefinition.g:142:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalEnumDefinition.g:142:2: ( ( rule__EInt__Group__0 ) )
            // InternalEnumDefinition.g:143:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalEnumDefinition.g:144:3: ( rule__EInt__Group__0 )
            // InternalEnumDefinition.g:144:4: rule__EInt__Group__0
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEnumDefinition.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEnumDefinition.g:157:2: ( RULE_STRING )
                    {
                    // InternalEnumDefinition.g:157:2: ( RULE_STRING )
                    // InternalEnumDefinition.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEnumDefinition.g:163:2: ( RULE_ID )
                    {
                    // InternalEnumDefinition.g:163:2: ( RULE_ID )
                    // InternalEnumDefinition.g:164:3: RULE_ID
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


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalEnumDefinition.g:173:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:177:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalEnumDefinition.g:178:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

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
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalEnumDefinition.g:185:1: rule__Enumeration__Group__0__Impl : ( 'Enum' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:189:1: ( ( 'Enum' ) )
            // InternalEnumDefinition.g:190:1: ( 'Enum' )
            {
            // InternalEnumDefinition.g:190:1: ( 'Enum' )
            // InternalEnumDefinition.g:191:2: 'Enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalEnumDefinition.g:200:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:204:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalEnumDefinition.g:205:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

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
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalEnumDefinition.g:212:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:216:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalEnumDefinition.g:217:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalEnumDefinition.g:217:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalEnumDefinition.g:218:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalEnumDefinition.g:219:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalEnumDefinition.g:219:3: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalEnumDefinition.g:227:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:231:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalEnumDefinition.g:232:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

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
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalEnumDefinition.g:239:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:243:1: ( ( '{' ) )
            // InternalEnumDefinition.g:244:1: ( '{' )
            {
            // InternalEnumDefinition.g:244:1: ( '{' )
            // InternalEnumDefinition.g:245:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalEnumDefinition.g:254:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:258:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalEnumDefinition.g:259:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

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
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalEnumDefinition.g:266:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__Group_3__0 )? ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:270:1: ( ( ( rule__Enumeration__Group_3__0 )? ) )
            // InternalEnumDefinition.g:271:1: ( ( rule__Enumeration__Group_3__0 )? )
            {
            // InternalEnumDefinition.g:271:1: ( ( rule__Enumeration__Group_3__0 )? )
            // InternalEnumDefinition.g:272:2: ( rule__Enumeration__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationAccess().getGroup_3()); 
            // InternalEnumDefinition.g:273:2: ( rule__Enumeration__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEnumDefinition.g:273:3: rule__Enumeration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Enumeration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalEnumDefinition.g:281:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:285:1: ( rule__Enumeration__Group__4__Impl )
            // InternalEnumDefinition.g:286:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4__Impl();

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
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalEnumDefinition.g:292:1: rule__Enumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:296:1: ( ( '}' ) )
            // InternalEnumDefinition.g:297:1: ( '}' )
            {
            // InternalEnumDefinition.g:297:1: ( '}' )
            // InternalEnumDefinition.g:298:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group_3__0"
    // InternalEnumDefinition.g:308:1: rule__Enumeration__Group_3__0 : rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1 ;
    public final void rule__Enumeration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:312:1: ( rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1 )
            // InternalEnumDefinition.g:313:2: rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Enumeration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_3__1();

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
    // $ANTLR end "rule__Enumeration__Group_3__0"


    // $ANTLR start "rule__Enumeration__Group_3__0__Impl"
    // InternalEnumDefinition.g:320:1: rule__Enumeration__Group_3__0__Impl : ( ( rule__Enumeration__LiteralsAssignment_3_0 ) ) ;
    public final void rule__Enumeration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:324:1: ( ( ( rule__Enumeration__LiteralsAssignment_3_0 ) ) )
            // InternalEnumDefinition.g:325:1: ( ( rule__Enumeration__LiteralsAssignment_3_0 ) )
            {
            // InternalEnumDefinition.g:325:1: ( ( rule__Enumeration__LiteralsAssignment_3_0 ) )
            // InternalEnumDefinition.g:326:2: ( rule__Enumeration__LiteralsAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3_0()); 
            // InternalEnumDefinition.g:327:2: ( rule__Enumeration__LiteralsAssignment_3_0 )
            // InternalEnumDefinition.g:327:3: rule__Enumeration__LiteralsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__LiteralsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_3__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_3__1"
    // InternalEnumDefinition.g:335:1: rule__Enumeration__Group_3__1 : rule__Enumeration__Group_3__1__Impl ;
    public final void rule__Enumeration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:339:1: ( rule__Enumeration__Group_3__1__Impl )
            // InternalEnumDefinition.g:340:2: rule__Enumeration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_3__1__Impl();

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
    // $ANTLR end "rule__Enumeration__Group_3__1"


    // $ANTLR start "rule__Enumeration__Group_3__1__Impl"
    // InternalEnumDefinition.g:346:1: rule__Enumeration__Group_3__1__Impl : ( ( rule__Enumeration__Group_3_1__0 )* ) ;
    public final void rule__Enumeration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:350:1: ( ( ( rule__Enumeration__Group_3_1__0 )* ) )
            // InternalEnumDefinition.g:351:1: ( ( rule__Enumeration__Group_3_1__0 )* )
            {
            // InternalEnumDefinition.g:351:1: ( ( rule__Enumeration__Group_3_1__0 )* )
            // InternalEnumDefinition.g:352:2: ( rule__Enumeration__Group_3_1__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_3_1()); 
            // InternalEnumDefinition.g:353:2: ( rule__Enumeration__Group_3_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEnumDefinition.g:353:3: rule__Enumeration__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Enumeration__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_3__1__Impl"


    // $ANTLR start "rule__Enumeration__Group_3_1__0"
    // InternalEnumDefinition.g:362:1: rule__Enumeration__Group_3_1__0 : rule__Enumeration__Group_3_1__0__Impl rule__Enumeration__Group_3_1__1 ;
    public final void rule__Enumeration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:366:1: ( rule__Enumeration__Group_3_1__0__Impl rule__Enumeration__Group_3_1__1 )
            // InternalEnumDefinition.g:367:2: rule__Enumeration__Group_3_1__0__Impl rule__Enumeration__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Enumeration__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_3_1__1();

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
    // $ANTLR end "rule__Enumeration__Group_3_1__0"


    // $ANTLR start "rule__Enumeration__Group_3_1__0__Impl"
    // InternalEnumDefinition.g:374:1: rule__Enumeration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:378:1: ( ( ',' ) )
            // InternalEnumDefinition.g:379:1: ( ',' )
            {
            // InternalEnumDefinition.g:379:1: ( ',' )
            // InternalEnumDefinition.g:380:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_3_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_3_1__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_3_1__1"
    // InternalEnumDefinition.g:389:1: rule__Enumeration__Group_3_1__1 : rule__Enumeration__Group_3_1__1__Impl ;
    public final void rule__Enumeration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:393:1: ( rule__Enumeration__Group_3_1__1__Impl )
            // InternalEnumDefinition.g:394:2: rule__Enumeration__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Enumeration__Group_3_1__1"


    // $ANTLR start "rule__Enumeration__Group_3_1__1__Impl"
    // InternalEnumDefinition.g:400:1: rule__Enumeration__Group_3_1__1__Impl : ( ( rule__Enumeration__LiteralsAssignment_3_1_1 ) ) ;
    public final void rule__Enumeration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:404:1: ( ( ( rule__Enumeration__LiteralsAssignment_3_1_1 ) ) )
            // InternalEnumDefinition.g:405:1: ( ( rule__Enumeration__LiteralsAssignment_3_1_1 ) )
            {
            // InternalEnumDefinition.g:405:1: ( ( rule__Enumeration__LiteralsAssignment_3_1_1 ) )
            // InternalEnumDefinition.g:406:2: ( rule__Enumeration__LiteralsAssignment_3_1_1 )
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3_1_1()); 
            // InternalEnumDefinition.g:407:2: ( rule__Enumeration__LiteralsAssignment_3_1_1 )
            // InternalEnumDefinition.g:407:3: rule__Enumeration__LiteralsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__LiteralsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_3_1__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__0"
    // InternalEnumDefinition.g:416:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:420:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalEnumDefinition.g:421:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__1();

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
    // $ANTLR end "rule__EnumerationLiteral__Group__0"


    // $ANTLR start "rule__EnumerationLiteral__Group__0__Impl"
    // InternalEnumDefinition.g:428:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:432:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // InternalEnumDefinition.g:433:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // InternalEnumDefinition.g:433:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // InternalEnumDefinition.g:434:2: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // InternalEnumDefinition.g:435:2: ( rule__EnumerationLiteral__NameAssignment_0 )
            // InternalEnumDefinition.g:435:3: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__1"
    // InternalEnumDefinition.g:443:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:447:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // InternalEnumDefinition.g:448:2: rule__EnumerationLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__EnumerationLiteral__Group__1"


    // $ANTLR start "rule__EnumerationLiteral__Group__1__Impl"
    // InternalEnumDefinition.g:454:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__Group_1__0 )? ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:458:1: ( ( ( rule__EnumerationLiteral__Group_1__0 )? ) )
            // InternalEnumDefinition.g:459:1: ( ( rule__EnumerationLiteral__Group_1__0 )? )
            {
            // InternalEnumDefinition.g:459:1: ( ( rule__EnumerationLiteral__Group_1__0 )? )
            // InternalEnumDefinition.g:460:2: ( rule__EnumerationLiteral__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // InternalEnumDefinition.g:461:2: ( rule__EnumerationLiteral__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEnumDefinition.g:461:3: rule__EnumerationLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationLiteral__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__0"
    // InternalEnumDefinition.g:470:1: rule__EnumerationLiteral__Group_1__0 : rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:474:1: ( rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 )
            // InternalEnumDefinition.g:475:2: rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__EnumerationLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group_1__1();

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
    // $ANTLR end "rule__EnumerationLiteral__Group_1__0"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__0__Impl"
    // InternalEnumDefinition.g:482:1: rule__EnumerationLiteral__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:486:1: ( ( '=' ) )
            // InternalEnumDefinition.g:487:1: ( '=' )
            {
            // InternalEnumDefinition.g:487:1: ( '=' )
            // InternalEnumDefinition.g:488:2: '='
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__1"
    // InternalEnumDefinition.g:497:1: rule__EnumerationLiteral__Group_1__1 : rule__EnumerationLiteral__Group_1__1__Impl ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:501:1: ( rule__EnumerationLiteral__Group_1__1__Impl )
            // InternalEnumDefinition.g:502:2: rule__EnumerationLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group_1__1__Impl();

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
    // $ANTLR end "rule__EnumerationLiteral__Group_1__1"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__1__Impl"
    // InternalEnumDefinition.g:508:1: rule__EnumerationLiteral__Group_1__1__Impl : ( ( rule__EnumerationLiteral__KeyNumAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:512:1: ( ( ( rule__EnumerationLiteral__KeyNumAssignment_1_1 ) ) )
            // InternalEnumDefinition.g:513:1: ( ( rule__EnumerationLiteral__KeyNumAssignment_1_1 ) )
            {
            // InternalEnumDefinition.g:513:1: ( ( rule__EnumerationLiteral__KeyNumAssignment_1_1 ) )
            // InternalEnumDefinition.g:514:2: ( rule__EnumerationLiteral__KeyNumAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getKeyNumAssignment_1_1()); 
            // InternalEnumDefinition.g:515:2: ( rule__EnumerationLiteral__KeyNumAssignment_1_1 )
            // InternalEnumDefinition.g:515:3: rule__EnumerationLiteral__KeyNumAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__KeyNumAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getKeyNumAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalEnumDefinition.g:524:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:528:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalEnumDefinition.g:529:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalEnumDefinition.g:536:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:540:1: ( ( ( '-' )? ) )
            // InternalEnumDefinition.g:541:1: ( ( '-' )? )
            {
            // InternalEnumDefinition.g:541:1: ( ( '-' )? )
            // InternalEnumDefinition.g:542:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalEnumDefinition.g:543:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEnumDefinition.g:543:3: '-'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalEnumDefinition.g:551:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:555:1: ( rule__EInt__Group__1__Impl )
            // InternalEnumDefinition.g:556:2: rule__EInt__Group__1__Impl
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
    // InternalEnumDefinition.g:562:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:566:1: ( ( RULE_INT ) )
            // InternalEnumDefinition.g:567:1: ( RULE_INT )
            {
            // InternalEnumDefinition.g:567:1: ( RULE_INT )
            // InternalEnumDefinition.g:568:2: RULE_INT
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


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalEnumDefinition.g:578:1: rule__Enumeration__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:582:1: ( ( ruleEString ) )
            // InternalEnumDefinition.g:583:2: ( ruleEString )
            {
            // InternalEnumDefinition.g:583:2: ( ruleEString )
            // InternalEnumDefinition.g:584:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_3_0"
    // InternalEnumDefinition.g:593:1: rule__Enumeration__LiteralsAssignment_3_0 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:597:1: ( ( ruleEnumerationLiteral ) )
            // InternalEnumDefinition.g:598:2: ( ruleEnumerationLiteral )
            {
            // InternalEnumDefinition.g:598:2: ( ruleEnumerationLiteral )
            // InternalEnumDefinition.g:599:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_3_0"


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_3_1_1"
    // InternalEnumDefinition.g:608:1: rule__Enumeration__LiteralsAssignment_3_1_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:612:1: ( ( ruleEnumerationLiteral ) )
            // InternalEnumDefinition.g:613:2: ( ruleEnumerationLiteral )
            {
            // InternalEnumDefinition.g:613:2: ( ruleEnumerationLiteral )
            // InternalEnumDefinition.g:614:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_3_1_1"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment_0"
    // InternalEnumDefinition.g:623:1: rule__EnumerationLiteral__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:627:1: ( ( ruleEString ) )
            // InternalEnumDefinition.g:628:2: ( ruleEString )
            {
            // InternalEnumDefinition.g:628:2: ( ruleEString )
            // InternalEnumDefinition.g:629:3: ruleEString
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment_0"


    // $ANTLR start "rule__EnumerationLiteral__KeyNumAssignment_1_1"
    // InternalEnumDefinition.g:638:1: rule__EnumerationLiteral__KeyNumAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationLiteral__KeyNumAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumDefinition.g:642:1: ( ( ruleEInt ) )
            // InternalEnumDefinition.g:643:2: ( ruleEInt )
            {
            // InternalEnumDefinition.g:643:2: ( ruleEInt )
            // InternalEnumDefinition.g:644:3: ruleEInt
            {
             before(grammarAccess.getEnumerationLiteralAccess().getKeyNumEIntParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralAccess().getKeyNumEIntParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__KeyNumAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010040L});

}