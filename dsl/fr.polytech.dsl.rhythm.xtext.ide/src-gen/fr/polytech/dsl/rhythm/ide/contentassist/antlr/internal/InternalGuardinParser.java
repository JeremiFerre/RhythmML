package fr.polytech.dsl.rhythm.ide.contentassist.antlr.internal;

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
import fr.polytech.dsl.rhythm.services.GuardinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuardinParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'$'", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "':'", "'tracks'", "'-'", "'tempo='", "'signature='", "'bars='", "'instrument'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGuardinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuardinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuardinParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGuardin.g"; }


    	private GuardinGrammarAccess grammarAccess;

    	public void setGrammarAccess(GuardinGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMusic"
    // InternalGuardin.g:53:1: entryRuleMusic : ruleMusic EOF ;
    public final void entryRuleMusic() throws RecognitionException {
        try {
            // InternalGuardin.g:54:1: ( ruleMusic EOF )
            // InternalGuardin.g:55:1: ruleMusic EOF
            {
             before(grammarAccess.getMusicRule()); 
            pushFollow(FOLLOW_1);
            ruleMusic();

            state._fsp--;

             after(grammarAccess.getMusicRule()); 
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
    // $ANTLR end "entryRuleMusic"


    // $ANTLR start "ruleMusic"
    // InternalGuardin.g:62:1: ruleMusic : ( ( rule__Music__Group__0 ) ) ;
    public final void ruleMusic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:66:2: ( ( ( rule__Music__Group__0 ) ) )
            // InternalGuardin.g:67:2: ( ( rule__Music__Group__0 ) )
            {
            // InternalGuardin.g:67:2: ( ( rule__Music__Group__0 ) )
            // InternalGuardin.g:68:3: ( rule__Music__Group__0 )
            {
             before(grammarAccess.getMusicAccess().getGroup()); 
            // InternalGuardin.g:69:3: ( rule__Music__Group__0 )
            // InternalGuardin.g:69:4: rule__Music__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMusic"


    // $ANTLR start "entryRuleSection"
    // InternalGuardin.g:78:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalGuardin.g:79:1: ( ruleSection EOF )
            // InternalGuardin.g:80:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalGuardin.g:87:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:91:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalGuardin.g:92:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalGuardin.g:92:2: ( ( rule__Section__Group__0 ) )
            // InternalGuardin.g:93:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalGuardin.g:94:3: ( rule__Section__Group__0 )
            // InternalGuardin.g:94:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleTrack"
    // InternalGuardin.g:103:1: entryRuleTrack : ruleTrack EOF ;
    public final void entryRuleTrack() throws RecognitionException {
        try {
            // InternalGuardin.g:104:1: ( ruleTrack EOF )
            // InternalGuardin.g:105:1: ruleTrack EOF
            {
             before(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_1);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getTrackRule()); 
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
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // InternalGuardin.g:112:1: ruleTrack : ( ( rule__Track__Group__0 ) ) ;
    public final void ruleTrack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:116:2: ( ( ( rule__Track__Group__0 ) ) )
            // InternalGuardin.g:117:2: ( ( rule__Track__Group__0 ) )
            {
            // InternalGuardin.g:117:2: ( ( rule__Track__Group__0 ) )
            // InternalGuardin.g:118:3: ( rule__Track__Group__0 )
            {
             before(grammarAccess.getTrackAccess().getGroup()); 
            // InternalGuardin.g:119:3: ( rule__Track__Group__0 )
            // InternalGuardin.g:119:4: rule__Track__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRuleBattery"
    // InternalGuardin.g:128:1: entryRuleBattery : ruleBattery EOF ;
    public final void entryRuleBattery() throws RecognitionException {
        try {
            // InternalGuardin.g:129:1: ( ruleBattery EOF )
            // InternalGuardin.g:130:1: ruleBattery EOF
            {
             before(grammarAccess.getBatteryRule()); 
            pushFollow(FOLLOW_1);
            ruleBattery();

            state._fsp--;

             after(grammarAccess.getBatteryRule()); 
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
    // $ANTLR end "entryRuleBattery"


    // $ANTLR start "ruleBattery"
    // InternalGuardin.g:137:1: ruleBattery : ( ( rule__Battery__Group__0 ) ) ;
    public final void ruleBattery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:141:2: ( ( ( rule__Battery__Group__0 ) ) )
            // InternalGuardin.g:142:2: ( ( rule__Battery__Group__0 ) )
            {
            // InternalGuardin.g:142:2: ( ( rule__Battery__Group__0 ) )
            // InternalGuardin.g:143:3: ( rule__Battery__Group__0 )
            {
             before(grammarAccess.getBatteryAccess().getGroup()); 
            // InternalGuardin.g:144:3: ( rule__Battery__Group__0 )
            // InternalGuardin.g:144:4: rule__Battery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Battery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBattery"


    // $ANTLR start "entryRuleEInt"
    // InternalGuardin.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalGuardin.g:154:1: ( ruleEInt EOF )
            // InternalGuardin.g:155:1: ruleEInt EOF
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
    // InternalGuardin.g:162:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:166:2: ( ( RULE_INT ) )
            // InternalGuardin.g:167:2: ( RULE_INT )
            {
            // InternalGuardin.g:167:2: ( RULE_INT )
            // InternalGuardin.g:168:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEString"
    // InternalGuardin.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGuardin.g:179:1: ( ruleEString EOF )
            // InternalGuardin.g:180:1: ruleEString EOF
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
    // InternalGuardin.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalGuardin.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalGuardin.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalGuardin.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalGuardin.g:194:3: ( rule__EString__Alternatives )
            // InternalGuardin.g:194:4: rule__EString__Alternatives
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


    // $ANTLR start "ruleBatteryNote"
    // InternalGuardin.g:203:1: ruleBatteryNote : ( ( rule__BatteryNote__Alternatives ) ) ;
    public final void ruleBatteryNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:207:1: ( ( ( rule__BatteryNote__Alternatives ) ) )
            // InternalGuardin.g:208:2: ( ( rule__BatteryNote__Alternatives ) )
            {
            // InternalGuardin.g:208:2: ( ( rule__BatteryNote__Alternatives ) )
            // InternalGuardin.g:209:3: ( rule__BatteryNote__Alternatives )
            {
             before(grammarAccess.getBatteryNoteAccess().getAlternatives()); 
            // InternalGuardin.g:210:3: ( rule__BatteryNote__Alternatives )
            // InternalGuardin.g:210:4: rule__BatteryNote__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BatteryNote__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBatteryNoteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBatteryNote"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalGuardin.g:218:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:222:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalGuardin.g:223:2: ( RULE_STRING )
                    {
                    // InternalGuardin.g:223:2: ( RULE_STRING )
                    // InternalGuardin.g:224:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:229:2: ( RULE_ID )
                    {
                    // InternalGuardin.g:229:2: ( RULE_ID )
                    // InternalGuardin.g:230:3: RULE_ID
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


    // $ANTLR start "rule__BatteryNote__Alternatives"
    // InternalGuardin.g:239:1: rule__BatteryNote__Alternatives : ( ( ( '$' ) ) | ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) );
    public final void rule__BatteryNote__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:243:1: ( ( ( '$' ) ) | ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGuardin.g:244:2: ( ( '$' ) )
                    {
                    // InternalGuardin.g:244:2: ( ( '$' ) )
                    // InternalGuardin.g:245:3: ( '$' )
                    {
                     before(grammarAccess.getBatteryNoteAccess().getEMPTYEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:246:3: ( '$' )
                    // InternalGuardin.g:246:4: '$'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteAccess().getEMPTYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:250:2: ( ( 'bd' ) )
                    {
                    // InternalGuardin.g:250:2: ( ( 'bd' ) )
                    // InternalGuardin.g:251:3: ( 'bd' )
                    {
                     before(grammarAccess.getBatteryNoteAccess().getBASS_DRUMEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:252:3: ( 'bd' )
                    // InternalGuardin.g:252:4: 'bd'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteAccess().getBASS_DRUMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:256:2: ( ( 'ch' ) )
                    {
                    // InternalGuardin.g:256:2: ( ( 'ch' ) )
                    // InternalGuardin.g:257:3: ( 'ch' )
                    {
                     before(grammarAccess.getBatteryNoteAccess().getCLOSED_HIHATEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:258:3: ( 'ch' )
                    // InternalGuardin.g:258:4: 'ch'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteAccess().getCLOSED_HIHATEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:262:2: ( ( 'cc' ) )
                    {
                    // InternalGuardin.g:262:2: ( ( 'cc' ) )
                    // InternalGuardin.g:263:3: ( 'cc' )
                    {
                     before(grammarAccess.getBatteryNoteAccess().getCRASH_CYMBALEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:264:3: ( 'cc' )
                    // InternalGuardin.g:264:4: 'cc'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteAccess().getCRASH_CYMBALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:268:2: ( ( 'oh' ) )
                    {
                    // InternalGuardin.g:268:2: ( ( 'oh' ) )
                    // InternalGuardin.g:269:3: ( 'oh' )
                    {
                     before(grammarAccess.getBatteryNoteAccess().getOPENED_HIHATEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:270:3: ( 'oh' )
                    // InternalGuardin.g:270:4: 'oh'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteAccess().getOPENED_HIHATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:274:2: ( ( 'rc' ) )
                    {
                    // InternalGuardin.g:274:2: ( ( 'rc' ) )
                    // InternalGuardin.g:275:3: ( 'rc' )
                    {
                     before(grammarAccess.getBatteryNoteAccess().getRIDE_CYMBALEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:276:3: ( 'rc' )
                    // InternalGuardin.g:276:4: 'rc'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteAccess().getRIDE_CYMBALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:280:2: ( ( 'sd' ) )
                    {
                    // InternalGuardin.g:280:2: ( ( 'sd' ) )
                    // InternalGuardin.g:281:3: ( 'sd' )
                    {
                     before(grammarAccess.getBatteryNoteAccess().getSNARE_DRUMEnumLiteralDeclaration_6()); 
                    // InternalGuardin.g:282:3: ( 'sd' )
                    // InternalGuardin.g:282:4: 'sd'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteAccess().getSNARE_DRUMEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__BatteryNote__Alternatives"


    // $ANTLR start "rule__Music__Group__0"
    // InternalGuardin.g:290:1: rule__Music__Group__0 : rule__Music__Group__0__Impl rule__Music__Group__1 ;
    public final void rule__Music__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:294:1: ( rule__Music__Group__0__Impl rule__Music__Group__1 )
            // InternalGuardin.g:295:2: rule__Music__Group__0__Impl rule__Music__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Music__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__1();

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
    // $ANTLR end "rule__Music__Group__0"


    // $ANTLR start "rule__Music__Group__0__Impl"
    // InternalGuardin.g:302:1: rule__Music__Group__0__Impl : ( () ) ;
    public final void rule__Music__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:306:1: ( ( () ) )
            // InternalGuardin.g:307:1: ( () )
            {
            // InternalGuardin.g:307:1: ( () )
            // InternalGuardin.g:308:2: ()
            {
             before(grammarAccess.getMusicAccess().getMusicAction_0()); 
            // InternalGuardin.g:309:2: ()
            // InternalGuardin.g:309:3: 
            {
            }

             after(grammarAccess.getMusicAccess().getMusicAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__0__Impl"


    // $ANTLR start "rule__Music__Group__1"
    // InternalGuardin.g:317:1: rule__Music__Group__1 : rule__Music__Group__1__Impl rule__Music__Group__2 ;
    public final void rule__Music__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:321:1: ( rule__Music__Group__1__Impl rule__Music__Group__2 )
            // InternalGuardin.g:322:2: rule__Music__Group__1__Impl rule__Music__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Music__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__2();

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
    // $ANTLR end "rule__Music__Group__1"


    // $ANTLR start "rule__Music__Group__1__Impl"
    // InternalGuardin.g:329:1: rule__Music__Group__1__Impl : ( ( rule__Music__NameAssignment_1 ) ) ;
    public final void rule__Music__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:333:1: ( ( ( rule__Music__NameAssignment_1 ) ) )
            // InternalGuardin.g:334:1: ( ( rule__Music__NameAssignment_1 ) )
            {
            // InternalGuardin.g:334:1: ( ( rule__Music__NameAssignment_1 ) )
            // InternalGuardin.g:335:2: ( rule__Music__NameAssignment_1 )
            {
             before(grammarAccess.getMusicAccess().getNameAssignment_1()); 
            // InternalGuardin.g:336:2: ( rule__Music__NameAssignment_1 )
            // InternalGuardin.g:336:3: rule__Music__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__1__Impl"


    // $ANTLR start "rule__Music__Group__2"
    // InternalGuardin.g:344:1: rule__Music__Group__2 : rule__Music__Group__2__Impl rule__Music__Group__3 ;
    public final void rule__Music__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:348:1: ( rule__Music__Group__2__Impl rule__Music__Group__3 )
            // InternalGuardin.g:349:2: rule__Music__Group__2__Impl rule__Music__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Music__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__3();

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
    // $ANTLR end "rule__Music__Group__2"


    // $ANTLR start "rule__Music__Group__2__Impl"
    // InternalGuardin.g:356:1: rule__Music__Group__2__Impl : ( ':' ) ;
    public final void rule__Music__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:360:1: ( ( ':' ) )
            // InternalGuardin.g:361:1: ( ':' )
            {
            // InternalGuardin.g:361:1: ( ':' )
            // InternalGuardin.g:362:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__2__Impl"


    // $ANTLR start "rule__Music__Group__3"
    // InternalGuardin.g:371:1: rule__Music__Group__3 : rule__Music__Group__3__Impl rule__Music__Group__4 ;
    public final void rule__Music__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:375:1: ( rule__Music__Group__3__Impl rule__Music__Group__4 )
            // InternalGuardin.g:376:2: rule__Music__Group__3__Impl rule__Music__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__4();

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
    // $ANTLR end "rule__Music__Group__3"


    // $ANTLR start "rule__Music__Group__3__Impl"
    // InternalGuardin.g:383:1: rule__Music__Group__3__Impl : ( ( rule__Music__SectionAssignment_3 ) ) ;
    public final void rule__Music__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:387:1: ( ( ( rule__Music__SectionAssignment_3 ) ) )
            // InternalGuardin.g:388:1: ( ( rule__Music__SectionAssignment_3 ) )
            {
            // InternalGuardin.g:388:1: ( ( rule__Music__SectionAssignment_3 ) )
            // InternalGuardin.g:389:2: ( rule__Music__SectionAssignment_3 )
            {
             before(grammarAccess.getMusicAccess().getSectionAssignment_3()); 
            // InternalGuardin.g:390:2: ( rule__Music__SectionAssignment_3 )
            // InternalGuardin.g:390:3: rule__Music__SectionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Music__SectionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getSectionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__3__Impl"


    // $ANTLR start "rule__Music__Group__4"
    // InternalGuardin.g:398:1: rule__Music__Group__4 : rule__Music__Group__4__Impl rule__Music__Group__5 ;
    public final void rule__Music__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:402:1: ( rule__Music__Group__4__Impl rule__Music__Group__5 )
            // InternalGuardin.g:403:2: rule__Music__Group__4__Impl rule__Music__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__5();

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
    // $ANTLR end "rule__Music__Group__4"


    // $ANTLR start "rule__Music__Group__4__Impl"
    // InternalGuardin.g:410:1: rule__Music__Group__4__Impl : ( ( rule__Music__SectionAssignment_4 )* ) ;
    public final void rule__Music__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:414:1: ( ( ( rule__Music__SectionAssignment_4 )* ) )
            // InternalGuardin.g:415:1: ( ( rule__Music__SectionAssignment_4 )* )
            {
            // InternalGuardin.g:415:1: ( ( rule__Music__SectionAssignment_4 )* )
            // InternalGuardin.g:416:2: ( rule__Music__SectionAssignment_4 )*
            {
             before(grammarAccess.getMusicAccess().getSectionAssignment_4()); 
            // InternalGuardin.g:417:2: ( rule__Music__SectionAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGuardin.g:417:3: rule__Music__SectionAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Music__SectionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getSectionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__4__Impl"


    // $ANTLR start "rule__Music__Group__5"
    // InternalGuardin.g:425:1: rule__Music__Group__5 : rule__Music__Group__5__Impl rule__Music__Group__6 ;
    public final void rule__Music__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:429:1: ( rule__Music__Group__5__Impl rule__Music__Group__6 )
            // InternalGuardin.g:430:2: rule__Music__Group__5__Impl rule__Music__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Music__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__6();

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
    // $ANTLR end "rule__Music__Group__5"


    // $ANTLR start "rule__Music__Group__5__Impl"
    // InternalGuardin.g:437:1: rule__Music__Group__5__Impl : ( 'tracks' ) ;
    public final void rule__Music__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:441:1: ( ( 'tracks' ) )
            // InternalGuardin.g:442:1: ( 'tracks' )
            {
            // InternalGuardin.g:442:1: ( 'tracks' )
            // InternalGuardin.g:443:2: 'tracks'
            {
             before(grammarAccess.getMusicAccess().getTracksKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getTracksKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__5__Impl"


    // $ANTLR start "rule__Music__Group__6"
    // InternalGuardin.g:452:1: rule__Music__Group__6 : rule__Music__Group__6__Impl rule__Music__Group__7 ;
    public final void rule__Music__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:456:1: ( rule__Music__Group__6__Impl rule__Music__Group__7 )
            // InternalGuardin.g:457:2: rule__Music__Group__6__Impl rule__Music__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Music__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__7();

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
    // $ANTLR end "rule__Music__Group__6"


    // $ANTLR start "rule__Music__Group__6__Impl"
    // InternalGuardin.g:464:1: rule__Music__Group__6__Impl : ( ':' ) ;
    public final void rule__Music__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:468:1: ( ( ':' ) )
            // InternalGuardin.g:469:1: ( ':' )
            {
            // InternalGuardin.g:469:1: ( ':' )
            // InternalGuardin.g:470:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__6__Impl"


    // $ANTLR start "rule__Music__Group__7"
    // InternalGuardin.g:479:1: rule__Music__Group__7 : rule__Music__Group__7__Impl ;
    public final void rule__Music__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:483:1: ( rule__Music__Group__7__Impl )
            // InternalGuardin.g:484:2: rule__Music__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group__7__Impl();

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
    // $ANTLR end "rule__Music__Group__7"


    // $ANTLR start "rule__Music__Group__7__Impl"
    // InternalGuardin.g:490:1: rule__Music__Group__7__Impl : ( ( rule__Music__Group_7__0 ) ) ;
    public final void rule__Music__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:494:1: ( ( ( rule__Music__Group_7__0 ) ) )
            // InternalGuardin.g:495:1: ( ( rule__Music__Group_7__0 ) )
            {
            // InternalGuardin.g:495:1: ( ( rule__Music__Group_7__0 ) )
            // InternalGuardin.g:496:2: ( rule__Music__Group_7__0 )
            {
             before(grammarAccess.getMusicAccess().getGroup_7()); 
            // InternalGuardin.g:497:2: ( rule__Music__Group_7__0 )
            // InternalGuardin.g:497:3: rule__Music__Group_7__0
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__7__Impl"


    // $ANTLR start "rule__Music__Group_7__0"
    // InternalGuardin.g:506:1: rule__Music__Group_7__0 : rule__Music__Group_7__0__Impl rule__Music__Group_7__1 ;
    public final void rule__Music__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:510:1: ( rule__Music__Group_7__0__Impl rule__Music__Group_7__1 )
            // InternalGuardin.g:511:2: rule__Music__Group_7__0__Impl rule__Music__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Music__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_7__1();

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
    // $ANTLR end "rule__Music__Group_7__0"


    // $ANTLR start "rule__Music__Group_7__0__Impl"
    // InternalGuardin.g:518:1: rule__Music__Group_7__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:522:1: ( ( '-' ) )
            // InternalGuardin.g:523:1: ( '-' )
            {
            // InternalGuardin.g:523:1: ( '-' )
            // InternalGuardin.g:524:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getHyphenMinusKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_7__0__Impl"


    // $ANTLR start "rule__Music__Group_7__1"
    // InternalGuardin.g:533:1: rule__Music__Group_7__1 : rule__Music__Group_7__1__Impl rule__Music__Group_7__2 ;
    public final void rule__Music__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:537:1: ( rule__Music__Group_7__1__Impl rule__Music__Group_7__2 )
            // InternalGuardin.g:538:2: rule__Music__Group_7__1__Impl rule__Music__Group_7__2
            {
            pushFollow(FOLLOW_7);
            rule__Music__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_7__2();

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
    // $ANTLR end "rule__Music__Group_7__1"


    // $ANTLR start "rule__Music__Group_7__1__Impl"
    // InternalGuardin.g:545:1: rule__Music__Group_7__1__Impl : ( ( rule__Music__TrackAssignment_7_1 ) ) ;
    public final void rule__Music__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:549:1: ( ( ( rule__Music__TrackAssignment_7_1 ) ) )
            // InternalGuardin.g:550:1: ( ( rule__Music__TrackAssignment_7_1 ) )
            {
            // InternalGuardin.g:550:1: ( ( rule__Music__TrackAssignment_7_1 ) )
            // InternalGuardin.g:551:2: ( rule__Music__TrackAssignment_7_1 )
            {
             before(grammarAccess.getMusicAccess().getTrackAssignment_7_1()); 
            // InternalGuardin.g:552:2: ( rule__Music__TrackAssignment_7_1 )
            // InternalGuardin.g:552:3: rule__Music__TrackAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__TrackAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getTrackAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_7__1__Impl"


    // $ANTLR start "rule__Music__Group_7__2"
    // InternalGuardin.g:560:1: rule__Music__Group_7__2 : rule__Music__Group_7__2__Impl ;
    public final void rule__Music__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:564:1: ( rule__Music__Group_7__2__Impl )
            // InternalGuardin.g:565:2: rule__Music__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_7__2__Impl();

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
    // $ANTLR end "rule__Music__Group_7__2"


    // $ANTLR start "rule__Music__Group_7__2__Impl"
    // InternalGuardin.g:571:1: rule__Music__Group_7__2__Impl : ( ( rule__Music__Group_7_2__0 )* ) ;
    public final void rule__Music__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:575:1: ( ( ( rule__Music__Group_7_2__0 )* ) )
            // InternalGuardin.g:576:1: ( ( rule__Music__Group_7_2__0 )* )
            {
            // InternalGuardin.g:576:1: ( ( rule__Music__Group_7_2__0 )* )
            // InternalGuardin.g:577:2: ( rule__Music__Group_7_2__0 )*
            {
             before(grammarAccess.getMusicAccess().getGroup_7_2()); 
            // InternalGuardin.g:578:2: ( rule__Music__Group_7_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGuardin.g:578:3: rule__Music__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Music__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_7__2__Impl"


    // $ANTLR start "rule__Music__Group_7_2__0"
    // InternalGuardin.g:587:1: rule__Music__Group_7_2__0 : rule__Music__Group_7_2__0__Impl rule__Music__Group_7_2__1 ;
    public final void rule__Music__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:591:1: ( rule__Music__Group_7_2__0__Impl rule__Music__Group_7_2__1 )
            // InternalGuardin.g:592:2: rule__Music__Group_7_2__0__Impl rule__Music__Group_7_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Music__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_7_2__1();

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
    // $ANTLR end "rule__Music__Group_7_2__0"


    // $ANTLR start "rule__Music__Group_7_2__0__Impl"
    // InternalGuardin.g:599:1: rule__Music__Group_7_2__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:603:1: ( ( '-' ) )
            // InternalGuardin.g:604:1: ( '-' )
            {
            // InternalGuardin.g:604:1: ( '-' )
            // InternalGuardin.g:605:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_7_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getHyphenMinusKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_7_2__0__Impl"


    // $ANTLR start "rule__Music__Group_7_2__1"
    // InternalGuardin.g:614:1: rule__Music__Group_7_2__1 : rule__Music__Group_7_2__1__Impl ;
    public final void rule__Music__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:618:1: ( rule__Music__Group_7_2__1__Impl )
            // InternalGuardin.g:619:2: rule__Music__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_7_2__1__Impl();

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
    // $ANTLR end "rule__Music__Group_7_2__1"


    // $ANTLR start "rule__Music__Group_7_2__1__Impl"
    // InternalGuardin.g:625:1: rule__Music__Group_7_2__1__Impl : ( ( rule__Music__TrackAssignment_7_2_1 ) ) ;
    public final void rule__Music__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:629:1: ( ( ( rule__Music__TrackAssignment_7_2_1 ) ) )
            // InternalGuardin.g:630:1: ( ( rule__Music__TrackAssignment_7_2_1 ) )
            {
            // InternalGuardin.g:630:1: ( ( rule__Music__TrackAssignment_7_2_1 ) )
            // InternalGuardin.g:631:2: ( rule__Music__TrackAssignment_7_2_1 )
            {
             before(grammarAccess.getMusicAccess().getTrackAssignment_7_2_1()); 
            // InternalGuardin.g:632:2: ( rule__Music__TrackAssignment_7_2_1 )
            // InternalGuardin.g:632:3: rule__Music__TrackAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__TrackAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getTrackAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_7_2__1__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalGuardin.g:641:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:645:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalGuardin.g:646:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

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
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalGuardin.g:653:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:657:1: ( ( () ) )
            // InternalGuardin.g:658:1: ( () )
            {
            // InternalGuardin.g:658:1: ( () )
            // InternalGuardin.g:659:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalGuardin.g:660:2: ()
            // InternalGuardin.g:660:3: 
            {
            }

             after(grammarAccess.getSectionAccess().getSectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalGuardin.g:668:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:672:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalGuardin.g:673:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

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
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalGuardin.g:680:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:684:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalGuardin.g:685:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalGuardin.g:685:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalGuardin.g:686:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalGuardin.g:687:2: ( rule__Section__NameAssignment_1 )
            // InternalGuardin.g:687:3: rule__Section__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalGuardin.g:695:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:699:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalGuardin.g:700:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

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
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalGuardin.g:707:1: rule__Section__Group__2__Impl : ( ':' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:711:1: ( ( ':' ) )
            // InternalGuardin.g:712:1: ( ':' )
            {
            // InternalGuardin.g:712:1: ( ':' )
            // InternalGuardin.g:713:2: ':'
            {
             before(grammarAccess.getSectionAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalGuardin.g:722:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:726:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalGuardin.g:727:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

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
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalGuardin.g:734:1: rule__Section__Group__3__Impl : ( 'tempo=' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:738:1: ( ( 'tempo=' ) )
            // InternalGuardin.g:739:1: ( 'tempo=' )
            {
            // InternalGuardin.g:739:1: ( 'tempo=' )
            // InternalGuardin.g:740:2: 'tempo='
            {
             before(grammarAccess.getSectionAccess().getTempoKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getTempoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalGuardin.g:749:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:753:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalGuardin.g:754:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Section__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__5();

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
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalGuardin.g:761:1: rule__Section__Group__4__Impl : ( ( rule__Section__TempoAssignment_4 ) ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:765:1: ( ( ( rule__Section__TempoAssignment_4 ) ) )
            // InternalGuardin.g:766:1: ( ( rule__Section__TempoAssignment_4 ) )
            {
            // InternalGuardin.g:766:1: ( ( rule__Section__TempoAssignment_4 ) )
            // InternalGuardin.g:767:2: ( rule__Section__TempoAssignment_4 )
            {
             before(grammarAccess.getSectionAccess().getTempoAssignment_4()); 
            // InternalGuardin.g:768:2: ( rule__Section__TempoAssignment_4 )
            // InternalGuardin.g:768:3: rule__Section__TempoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Section__TempoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getTempoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group__5"
    // InternalGuardin.g:776:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:780:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalGuardin.g:781:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__6();

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
    // $ANTLR end "rule__Section__Group__5"


    // $ANTLR start "rule__Section__Group__5__Impl"
    // InternalGuardin.g:788:1: rule__Section__Group__5__Impl : ( 'signature=' ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:792:1: ( ( 'signature=' ) )
            // InternalGuardin.g:793:1: ( 'signature=' )
            {
            // InternalGuardin.g:793:1: ( 'signature=' )
            // InternalGuardin.g:794:2: 'signature='
            {
             before(grammarAccess.getSectionAccess().getSignatureKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSignatureKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5__Impl"


    // $ANTLR start "rule__Section__Group__6"
    // InternalGuardin.g:803:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:807:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalGuardin.g:808:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Section__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__7();

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
    // $ANTLR end "rule__Section__Group__6"


    // $ANTLR start "rule__Section__Group__6__Impl"
    // InternalGuardin.g:815:1: rule__Section__Group__6__Impl : ( ( rule__Section__SignatureAssignment_6 ) ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:819:1: ( ( ( rule__Section__SignatureAssignment_6 ) ) )
            // InternalGuardin.g:820:1: ( ( rule__Section__SignatureAssignment_6 ) )
            {
            // InternalGuardin.g:820:1: ( ( rule__Section__SignatureAssignment_6 ) )
            // InternalGuardin.g:821:2: ( rule__Section__SignatureAssignment_6 )
            {
             before(grammarAccess.getSectionAccess().getSignatureAssignment_6()); 
            // InternalGuardin.g:822:2: ( rule__Section__SignatureAssignment_6 )
            // InternalGuardin.g:822:3: rule__Section__SignatureAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Section__SignatureAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getSignatureAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__6__Impl"


    // $ANTLR start "rule__Section__Group__7"
    // InternalGuardin.g:830:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:834:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalGuardin.g:835:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__8();

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
    // $ANTLR end "rule__Section__Group__7"


    // $ANTLR start "rule__Section__Group__7__Impl"
    // InternalGuardin.g:842:1: rule__Section__Group__7__Impl : ( 'bars=' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:846:1: ( ( 'bars=' ) )
            // InternalGuardin.g:847:1: ( 'bars=' )
            {
            // InternalGuardin.g:847:1: ( 'bars=' )
            // InternalGuardin.g:848:2: 'bars='
            {
             before(grammarAccess.getSectionAccess().getBarsKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getBarsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__7__Impl"


    // $ANTLR start "rule__Section__Group__8"
    // InternalGuardin.g:857:1: rule__Section__Group__8 : rule__Section__Group__8__Impl ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:861:1: ( rule__Section__Group__8__Impl )
            // InternalGuardin.g:862:2: rule__Section__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__8__Impl();

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
    // $ANTLR end "rule__Section__Group__8"


    // $ANTLR start "rule__Section__Group__8__Impl"
    // InternalGuardin.g:868:1: rule__Section__Group__8__Impl : ( ( rule__Section__BarsAssignment_8 ) ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:872:1: ( ( ( rule__Section__BarsAssignment_8 ) ) )
            // InternalGuardin.g:873:1: ( ( rule__Section__BarsAssignment_8 ) )
            {
            // InternalGuardin.g:873:1: ( ( rule__Section__BarsAssignment_8 ) )
            // InternalGuardin.g:874:2: ( rule__Section__BarsAssignment_8 )
            {
             before(grammarAccess.getSectionAccess().getBarsAssignment_8()); 
            // InternalGuardin.g:875:2: ( rule__Section__BarsAssignment_8 )
            // InternalGuardin.g:875:3: rule__Section__BarsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Section__BarsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getBarsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__8__Impl"


    // $ANTLR start "rule__Track__Group__0"
    // InternalGuardin.g:884:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:888:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // InternalGuardin.g:889:2: rule__Track__Group__0__Impl rule__Track__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Track__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__1();

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
    // $ANTLR end "rule__Track__Group__0"


    // $ANTLR start "rule__Track__Group__0__Impl"
    // InternalGuardin.g:896:1: rule__Track__Group__0__Impl : ( () ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:900:1: ( ( () ) )
            // InternalGuardin.g:901:1: ( () )
            {
            // InternalGuardin.g:901:1: ( () )
            // InternalGuardin.g:902:2: ()
            {
             before(grammarAccess.getTrackAccess().getTrackAction_0()); 
            // InternalGuardin.g:903:2: ()
            // InternalGuardin.g:903:3: 
            {
            }

             after(grammarAccess.getTrackAccess().getTrackAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__0__Impl"


    // $ANTLR start "rule__Track__Group__1"
    // InternalGuardin.g:911:1: rule__Track__Group__1 : rule__Track__Group__1__Impl rule__Track__Group__2 ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:915:1: ( rule__Track__Group__1__Impl rule__Track__Group__2 )
            // InternalGuardin.g:916:2: rule__Track__Group__1__Impl rule__Track__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Track__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__2();

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
    // $ANTLR end "rule__Track__Group__1"


    // $ANTLR start "rule__Track__Group__1__Impl"
    // InternalGuardin.g:923:1: rule__Track__Group__1__Impl : ( ( rule__Track__Group_1__0 )? ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:927:1: ( ( ( rule__Track__Group_1__0 )? ) )
            // InternalGuardin.g:928:1: ( ( rule__Track__Group_1__0 )? )
            {
            // InternalGuardin.g:928:1: ( ( rule__Track__Group_1__0 )? )
            // InternalGuardin.g:929:2: ( rule__Track__Group_1__0 )?
            {
             before(grammarAccess.getTrackAccess().getGroup_1()); 
            // InternalGuardin.g:930:2: ( rule__Track__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGuardin.g:930:3: rule__Track__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Track__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrackAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__1__Impl"


    // $ANTLR start "rule__Track__Group__2"
    // InternalGuardin.g:938:1: rule__Track__Group__2 : rule__Track__Group__2__Impl rule__Track__Group__3 ;
    public final void rule__Track__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:942:1: ( rule__Track__Group__2__Impl rule__Track__Group__3 )
            // InternalGuardin.g:943:2: rule__Track__Group__2__Impl rule__Track__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Track__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__3();

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
    // $ANTLR end "rule__Track__Group__2"


    // $ANTLR start "rule__Track__Group__2__Impl"
    // InternalGuardin.g:950:1: rule__Track__Group__2__Impl : ( 'instrument' ) ;
    public final void rule__Track__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:954:1: ( ( 'instrument' ) )
            // InternalGuardin.g:955:1: ( 'instrument' )
            {
            // InternalGuardin.g:955:1: ( 'instrument' )
            // InternalGuardin.g:956:2: 'instrument'
            {
             before(grammarAccess.getTrackAccess().getInstrumentKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getInstrumentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__2__Impl"


    // $ANTLR start "rule__Track__Group__3"
    // InternalGuardin.g:965:1: rule__Track__Group__3 : rule__Track__Group__3__Impl rule__Track__Group__4 ;
    public final void rule__Track__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:969:1: ( rule__Track__Group__3__Impl rule__Track__Group__4 )
            // InternalGuardin.g:970:2: rule__Track__Group__3__Impl rule__Track__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Track__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__4();

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
    // $ANTLR end "rule__Track__Group__3"


    // $ANTLR start "rule__Track__Group__3__Impl"
    // InternalGuardin.g:977:1: rule__Track__Group__3__Impl : ( ':' ) ;
    public final void rule__Track__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:981:1: ( ( ':' ) )
            // InternalGuardin.g:982:1: ( ':' )
            {
            // InternalGuardin.g:982:1: ( ':' )
            // InternalGuardin.g:983:2: ':'
            {
             before(grammarAccess.getTrackAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__3__Impl"


    // $ANTLR start "rule__Track__Group__4"
    // InternalGuardin.g:992:1: rule__Track__Group__4 : rule__Track__Group__4__Impl ;
    public final void rule__Track__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:996:1: ( rule__Track__Group__4__Impl )
            // InternalGuardin.g:997:2: rule__Track__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group__4__Impl();

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
    // $ANTLR end "rule__Track__Group__4"


    // $ANTLR start "rule__Track__Group__4__Impl"
    // InternalGuardin.g:1003:1: rule__Track__Group__4__Impl : ( ( rule__Track__InstrumentAssignment_4 ) ) ;
    public final void rule__Track__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1007:1: ( ( ( rule__Track__InstrumentAssignment_4 ) ) )
            // InternalGuardin.g:1008:1: ( ( rule__Track__InstrumentAssignment_4 ) )
            {
            // InternalGuardin.g:1008:1: ( ( rule__Track__InstrumentAssignment_4 ) )
            // InternalGuardin.g:1009:2: ( rule__Track__InstrumentAssignment_4 )
            {
             before(grammarAccess.getTrackAccess().getInstrumentAssignment_4()); 
            // InternalGuardin.g:1010:2: ( rule__Track__InstrumentAssignment_4 )
            // InternalGuardin.g:1010:3: rule__Track__InstrumentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Track__InstrumentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getInstrumentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__4__Impl"


    // $ANTLR start "rule__Track__Group_1__0"
    // InternalGuardin.g:1019:1: rule__Track__Group_1__0 : rule__Track__Group_1__0__Impl rule__Track__Group_1__1 ;
    public final void rule__Track__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1023:1: ( rule__Track__Group_1__0__Impl rule__Track__Group_1__1 )
            // InternalGuardin.g:1024:2: rule__Track__Group_1__0__Impl rule__Track__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Track__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group_1__1();

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
    // $ANTLR end "rule__Track__Group_1__0"


    // $ANTLR start "rule__Track__Group_1__0__Impl"
    // InternalGuardin.g:1031:1: rule__Track__Group_1__0__Impl : ( ( rule__Track__NameAssignment_1_0 ) ) ;
    public final void rule__Track__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1035:1: ( ( ( rule__Track__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:1036:1: ( ( rule__Track__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:1036:1: ( ( rule__Track__NameAssignment_1_0 ) )
            // InternalGuardin.g:1037:2: ( rule__Track__NameAssignment_1_0 )
            {
             before(grammarAccess.getTrackAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:1038:2: ( rule__Track__NameAssignment_1_0 )
            // InternalGuardin.g:1038:3: rule__Track__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Track__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group_1__0__Impl"


    // $ANTLR start "rule__Track__Group_1__1"
    // InternalGuardin.g:1046:1: rule__Track__Group_1__1 : rule__Track__Group_1__1__Impl ;
    public final void rule__Track__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1050:1: ( rule__Track__Group_1__1__Impl )
            // InternalGuardin.g:1051:2: rule__Track__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group_1__1__Impl();

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
    // $ANTLR end "rule__Track__Group_1__1"


    // $ANTLR start "rule__Track__Group_1__1__Impl"
    // InternalGuardin.g:1057:1: rule__Track__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Track__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1061:1: ( ( ':' ) )
            // InternalGuardin.g:1062:1: ( ':' )
            {
            // InternalGuardin.g:1062:1: ( ':' )
            // InternalGuardin.g:1063:2: ':'
            {
             before(grammarAccess.getTrackAccess().getColonKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group_1__1__Impl"


    // $ANTLR start "rule__Battery__Group__0"
    // InternalGuardin.g:1073:1: rule__Battery__Group__0 : rule__Battery__Group__0__Impl rule__Battery__Group__1 ;
    public final void rule__Battery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1077:1: ( rule__Battery__Group__0__Impl rule__Battery__Group__1 )
            // InternalGuardin.g:1078:2: rule__Battery__Group__0__Impl rule__Battery__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Battery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Battery__Group__1();

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
    // $ANTLR end "rule__Battery__Group__0"


    // $ANTLR start "rule__Battery__Group__0__Impl"
    // InternalGuardin.g:1085:1: rule__Battery__Group__0__Impl : ( () ) ;
    public final void rule__Battery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1089:1: ( ( () ) )
            // InternalGuardin.g:1090:1: ( () )
            {
            // InternalGuardin.g:1090:1: ( () )
            // InternalGuardin.g:1091:2: ()
            {
             before(grammarAccess.getBatteryAccess().getBatteryAction_0()); 
            // InternalGuardin.g:1092:2: ()
            // InternalGuardin.g:1092:3: 
            {
            }

             after(grammarAccess.getBatteryAccess().getBatteryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__Group__0__Impl"


    // $ANTLR start "rule__Battery__Group__1"
    // InternalGuardin.g:1100:1: rule__Battery__Group__1 : rule__Battery__Group__1__Impl rule__Battery__Group__2 ;
    public final void rule__Battery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1104:1: ( rule__Battery__Group__1__Impl rule__Battery__Group__2 )
            // InternalGuardin.g:1105:2: rule__Battery__Group__1__Impl rule__Battery__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Battery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Battery__Group__2();

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
    // $ANTLR end "rule__Battery__Group__1"


    // $ANTLR start "rule__Battery__Group__1__Impl"
    // InternalGuardin.g:1112:1: rule__Battery__Group__1__Impl : ( ( rule__Battery__Group_1__0 )? ) ;
    public final void rule__Battery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1116:1: ( ( ( rule__Battery__Group_1__0 )? ) )
            // InternalGuardin.g:1117:1: ( ( rule__Battery__Group_1__0 )? )
            {
            // InternalGuardin.g:1117:1: ( ( rule__Battery__Group_1__0 )? )
            // InternalGuardin.g:1118:2: ( rule__Battery__Group_1__0 )?
            {
             before(grammarAccess.getBatteryAccess().getGroup_1()); 
            // InternalGuardin.g:1119:2: ( rule__Battery__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGuardin.g:1119:3: rule__Battery__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Battery__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBatteryAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__Group__1__Impl"


    // $ANTLR start "rule__Battery__Group__2"
    // InternalGuardin.g:1127:1: rule__Battery__Group__2 : rule__Battery__Group__2__Impl ;
    public final void rule__Battery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1131:1: ( rule__Battery__Group__2__Impl )
            // InternalGuardin.g:1132:2: rule__Battery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Battery__Group__2__Impl();

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
    // $ANTLR end "rule__Battery__Group__2"


    // $ANTLR start "rule__Battery__Group__2__Impl"
    // InternalGuardin.g:1138:1: rule__Battery__Group__2__Impl : ( ( ( rule__Battery__NotesAssignment_2 ) ) ( ( rule__Battery__NotesAssignment_2 )* ) ) ;
    public final void rule__Battery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1142:1: ( ( ( ( rule__Battery__NotesAssignment_2 ) ) ( ( rule__Battery__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:1143:1: ( ( ( rule__Battery__NotesAssignment_2 ) ) ( ( rule__Battery__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:1143:1: ( ( ( rule__Battery__NotesAssignment_2 ) ) ( ( rule__Battery__NotesAssignment_2 )* ) )
            // InternalGuardin.g:1144:2: ( ( rule__Battery__NotesAssignment_2 ) ) ( ( rule__Battery__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:1144:2: ( ( rule__Battery__NotesAssignment_2 ) )
            // InternalGuardin.g:1145:3: ( rule__Battery__NotesAssignment_2 )
            {
             before(grammarAccess.getBatteryAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:1146:3: ( rule__Battery__NotesAssignment_2 )
            // InternalGuardin.g:1146:4: rule__Battery__NotesAssignment_2
            {
            pushFollow(FOLLOW_15);
            rule__Battery__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:1149:2: ( ( rule__Battery__NotesAssignment_2 )* )
            // InternalGuardin.g:1150:3: ( rule__Battery__NotesAssignment_2 )*
            {
             before(grammarAccess.getBatteryAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:1151:3: ( rule__Battery__NotesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGuardin.g:1151:4: rule__Battery__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Battery__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBatteryAccess().getNotesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__Group__2__Impl"


    // $ANTLR start "rule__Battery__Group_1__0"
    // InternalGuardin.g:1161:1: rule__Battery__Group_1__0 : rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1 ;
    public final void rule__Battery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1165:1: ( rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1 )
            // InternalGuardin.g:1166:2: rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Battery__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Battery__Group_1__1();

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
    // $ANTLR end "rule__Battery__Group_1__0"


    // $ANTLR start "rule__Battery__Group_1__0__Impl"
    // InternalGuardin.g:1173:1: rule__Battery__Group_1__0__Impl : ( ( rule__Battery__NameAssignment_1_0 ) ) ;
    public final void rule__Battery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1177:1: ( ( ( rule__Battery__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:1178:1: ( ( rule__Battery__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:1178:1: ( ( rule__Battery__NameAssignment_1_0 ) )
            // InternalGuardin.g:1179:2: ( rule__Battery__NameAssignment_1_0 )
            {
             before(grammarAccess.getBatteryAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:1180:2: ( rule__Battery__NameAssignment_1_0 )
            // InternalGuardin.g:1180:3: rule__Battery__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Battery__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__Group_1__0__Impl"


    // $ANTLR start "rule__Battery__Group_1__1"
    // InternalGuardin.g:1188:1: rule__Battery__Group_1__1 : rule__Battery__Group_1__1__Impl ;
    public final void rule__Battery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1192:1: ( rule__Battery__Group_1__1__Impl )
            // InternalGuardin.g:1193:2: rule__Battery__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Battery__Group_1__1__Impl();

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
    // $ANTLR end "rule__Battery__Group_1__1"


    // $ANTLR start "rule__Battery__Group_1__1__Impl"
    // InternalGuardin.g:1199:1: rule__Battery__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Battery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1203:1: ( ( ':' ) )
            // InternalGuardin.g:1204:1: ( ':' )
            {
            // InternalGuardin.g:1204:1: ( ':' )
            // InternalGuardin.g:1205:2: ':'
            {
             before(grammarAccess.getBatteryAccess().getColonKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBatteryAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__Group_1__1__Impl"


    // $ANTLR start "rule__Music__NameAssignment_1"
    // InternalGuardin.g:1215:1: rule__Music__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Music__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1219:1: ( ( ruleEString ) )
            // InternalGuardin.g:1220:2: ( ruleEString )
            {
            // InternalGuardin.g:1220:2: ( ruleEString )
            // InternalGuardin.g:1221:3: ruleEString
            {
             before(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__NameAssignment_1"


    // $ANTLR start "rule__Music__SectionAssignment_3"
    // InternalGuardin.g:1230:1: rule__Music__SectionAssignment_3 : ( ruleSection ) ;
    public final void rule__Music__SectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1234:1: ( ( ruleSection ) )
            // InternalGuardin.g:1235:2: ( ruleSection )
            {
            // InternalGuardin.g:1235:2: ( ruleSection )
            // InternalGuardin.g:1236:3: ruleSection
            {
             before(grammarAccess.getMusicAccess().getSectionSectionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getSectionSectionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__SectionAssignment_3"


    // $ANTLR start "rule__Music__SectionAssignment_4"
    // InternalGuardin.g:1245:1: rule__Music__SectionAssignment_4 : ( ruleSection ) ;
    public final void rule__Music__SectionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1249:1: ( ( ruleSection ) )
            // InternalGuardin.g:1250:2: ( ruleSection )
            {
            // InternalGuardin.g:1250:2: ( ruleSection )
            // InternalGuardin.g:1251:3: ruleSection
            {
             before(grammarAccess.getMusicAccess().getSectionSectionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getSectionSectionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__SectionAssignment_4"


    // $ANTLR start "rule__Music__TrackAssignment_7_1"
    // InternalGuardin.g:1260:1: rule__Music__TrackAssignment_7_1 : ( ruleTrack ) ;
    public final void rule__Music__TrackAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1264:1: ( ( ruleTrack ) )
            // InternalGuardin.g:1265:2: ( ruleTrack )
            {
            // InternalGuardin.g:1265:2: ( ruleTrack )
            // InternalGuardin.g:1266:3: ruleTrack
            {
             before(grammarAccess.getMusicAccess().getTrackTrackParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getTrackTrackParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__TrackAssignment_7_1"


    // $ANTLR start "rule__Music__TrackAssignment_7_2_1"
    // InternalGuardin.g:1275:1: rule__Music__TrackAssignment_7_2_1 : ( ruleTrack ) ;
    public final void rule__Music__TrackAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1279:1: ( ( ruleTrack ) )
            // InternalGuardin.g:1280:2: ( ruleTrack )
            {
            // InternalGuardin.g:1280:2: ( ruleTrack )
            // InternalGuardin.g:1281:3: ruleTrack
            {
             before(grammarAccess.getMusicAccess().getTrackTrackParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getTrackTrackParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__TrackAssignment_7_2_1"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalGuardin.g:1290:1: rule__Section__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1294:1: ( ( ruleEString ) )
            // InternalGuardin.g:1295:2: ( ruleEString )
            {
            // InternalGuardin.g:1295:2: ( ruleEString )
            // InternalGuardin.g:1296:3: ruleEString
            {
             before(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NameAssignment_1"


    // $ANTLR start "rule__Section__TempoAssignment_4"
    // InternalGuardin.g:1305:1: rule__Section__TempoAssignment_4 : ( ruleEInt ) ;
    public final void rule__Section__TempoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1309:1: ( ( ruleEInt ) )
            // InternalGuardin.g:1310:2: ( ruleEInt )
            {
            // InternalGuardin.g:1310:2: ( ruleEInt )
            // InternalGuardin.g:1311:3: ruleEInt
            {
             before(grammarAccess.getSectionAccess().getTempoEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getTempoEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__TempoAssignment_4"


    // $ANTLR start "rule__Section__SignatureAssignment_6"
    // InternalGuardin.g:1320:1: rule__Section__SignatureAssignment_6 : ( ruleEInt ) ;
    public final void rule__Section__SignatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1324:1: ( ( ruleEInt ) )
            // InternalGuardin.g:1325:2: ( ruleEInt )
            {
            // InternalGuardin.g:1325:2: ( ruleEInt )
            // InternalGuardin.g:1326:3: ruleEInt
            {
             before(grammarAccess.getSectionAccess().getSignatureEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getSignatureEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__SignatureAssignment_6"


    // $ANTLR start "rule__Section__BarsAssignment_8"
    // InternalGuardin.g:1335:1: rule__Section__BarsAssignment_8 : ( ruleEInt ) ;
    public final void rule__Section__BarsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1339:1: ( ( ruleEInt ) )
            // InternalGuardin.g:1340:2: ( ruleEInt )
            {
            // InternalGuardin.g:1340:2: ( ruleEInt )
            // InternalGuardin.g:1341:3: ruleEInt
            {
             before(grammarAccess.getSectionAccess().getBarsEIntParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getBarsEIntParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__BarsAssignment_8"


    // $ANTLR start "rule__Track__NameAssignment_1_0"
    // InternalGuardin.g:1350:1: rule__Track__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Track__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1354:1: ( ( ruleEString ) )
            // InternalGuardin.g:1355:2: ( ruleEString )
            {
            // InternalGuardin.g:1355:2: ( ruleEString )
            // InternalGuardin.g:1356:3: ruleEString
            {
             before(grammarAccess.getTrackAccess().getNameEStringParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getNameEStringParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__NameAssignment_1_0"


    // $ANTLR start "rule__Track__InstrumentAssignment_4"
    // InternalGuardin.g:1365:1: rule__Track__InstrumentAssignment_4 : ( ruleBattery ) ;
    public final void rule__Track__InstrumentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1369:1: ( ( ruleBattery ) )
            // InternalGuardin.g:1370:2: ( ruleBattery )
            {
            // InternalGuardin.g:1370:2: ( ruleBattery )
            // InternalGuardin.g:1371:3: ruleBattery
            {
             before(grammarAccess.getTrackAccess().getInstrumentBatteryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBattery();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getInstrumentBatteryParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__InstrumentAssignment_4"


    // $ANTLR start "rule__Battery__NameAssignment_1_0"
    // InternalGuardin.g:1380:1: rule__Battery__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Battery__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1384:1: ( ( ruleEString ) )
            // InternalGuardin.g:1385:2: ( ruleEString )
            {
            // InternalGuardin.g:1385:2: ( ruleEString )
            // InternalGuardin.g:1386:3: ruleEString
            {
             before(grammarAccess.getBatteryAccess().getNameEStringParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBatteryAccess().getNameEStringParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__NameAssignment_1_0"


    // $ANTLR start "rule__Battery__NotesAssignment_2"
    // InternalGuardin.g:1395:1: rule__Battery__NotesAssignment_2 : ( ruleBatteryNote ) ;
    public final void rule__Battery__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1399:1: ( ( ruleBatteryNote ) )
            // InternalGuardin.g:1400:2: ( ruleBatteryNote )
            {
            // InternalGuardin.g:1400:2: ( ruleBatteryNote )
            // InternalGuardin.g:1401:3: ruleBatteryNote
            {
             before(grammarAccess.getBatteryAccess().getNotesBatteryNoteEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBatteryNote();

            state._fsp--;

             after(grammarAccess.getBatteryAccess().getNotesBatteryNoteEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__NotesAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000003F860L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000003F862L});

}