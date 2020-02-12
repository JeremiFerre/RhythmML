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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "'Music'", "':'", "'sections'", "'tracks'", "'-'", "'tempo='", "'signature='", "'bars='", "'instrument'", "'$'"
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
    public static final int T__26=26;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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


    // $ANTLR start "entryRuleEmptyNote"
    // InternalGuardin.g:153:1: entryRuleEmptyNote : ruleEmptyNote EOF ;
    public final void entryRuleEmptyNote() throws RecognitionException {
        try {
            // InternalGuardin.g:154:1: ( ruleEmptyNote EOF )
            // InternalGuardin.g:155:1: ruleEmptyNote EOF
            {
             before(grammarAccess.getEmptyNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleEmptyNote();

            state._fsp--;

             after(grammarAccess.getEmptyNoteRule()); 
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
    // $ANTLR end "entryRuleEmptyNote"


    // $ANTLR start "ruleEmptyNote"
    // InternalGuardin.g:162:1: ruleEmptyNote : ( ( rule__EmptyNote__Group__0 ) ) ;
    public final void ruleEmptyNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:166:2: ( ( ( rule__EmptyNote__Group__0 ) ) )
            // InternalGuardin.g:167:2: ( ( rule__EmptyNote__Group__0 ) )
            {
            // InternalGuardin.g:167:2: ( ( rule__EmptyNote__Group__0 ) )
            // InternalGuardin.g:168:3: ( rule__EmptyNote__Group__0 )
            {
             before(grammarAccess.getEmptyNoteAccess().getGroup()); 
            // InternalGuardin.g:169:3: ( rule__EmptyNote__Group__0 )
            // InternalGuardin.g:169:4: rule__EmptyNote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmptyNote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmptyNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptyNote"


    // $ANTLR start "entryRuleBatteryNote"
    // InternalGuardin.g:178:1: entryRuleBatteryNote : ruleBatteryNote EOF ;
    public final void entryRuleBatteryNote() throws RecognitionException {
        try {
            // InternalGuardin.g:179:1: ( ruleBatteryNote EOF )
            // InternalGuardin.g:180:1: ruleBatteryNote EOF
            {
             before(grammarAccess.getBatteryNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleBatteryNote();

            state._fsp--;

             after(grammarAccess.getBatteryNoteRule()); 
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
    // $ANTLR end "entryRuleBatteryNote"


    // $ANTLR start "ruleBatteryNote"
    // InternalGuardin.g:187:1: ruleBatteryNote : ( ( rule__BatteryNote__Group__0 ) ) ;
    public final void ruleBatteryNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:191:2: ( ( ( rule__BatteryNote__Group__0 ) ) )
            // InternalGuardin.g:192:2: ( ( rule__BatteryNote__Group__0 ) )
            {
            // InternalGuardin.g:192:2: ( ( rule__BatteryNote__Group__0 ) )
            // InternalGuardin.g:193:3: ( rule__BatteryNote__Group__0 )
            {
             before(grammarAccess.getBatteryNoteAccess().getGroup()); 
            // InternalGuardin.g:194:3: ( rule__BatteryNote__Group__0 )
            // InternalGuardin.g:194:4: rule__BatteryNote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BatteryNote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBatteryNoteAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEInt"
    // InternalGuardin.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalGuardin.g:204:1: ( ruleEInt EOF )
            // InternalGuardin.g:205:1: ruleEInt EOF
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
    // InternalGuardin.g:212:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:216:2: ( ( RULE_INT ) )
            // InternalGuardin.g:217:2: ( RULE_INT )
            {
            // InternalGuardin.g:217:2: ( RULE_INT )
            // InternalGuardin.g:218:3: RULE_INT
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
    // InternalGuardin.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGuardin.g:229:1: ( ruleEString EOF )
            // InternalGuardin.g:230:1: ruleEString EOF
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
    // InternalGuardin.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalGuardin.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalGuardin.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalGuardin.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalGuardin.g:244:3: ( rule__EString__Alternatives )
            // InternalGuardin.g:244:4: rule__EString__Alternatives
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


    // $ANTLR start "ruleBatteryNoteType"
    // InternalGuardin.g:253:1: ruleBatteryNoteType : ( ( rule__BatteryNoteType__Alternatives ) ) ;
    public final void ruleBatteryNoteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:257:1: ( ( ( rule__BatteryNoteType__Alternatives ) ) )
            // InternalGuardin.g:258:2: ( ( rule__BatteryNoteType__Alternatives ) )
            {
            // InternalGuardin.g:258:2: ( ( rule__BatteryNoteType__Alternatives ) )
            // InternalGuardin.g:259:3: ( rule__BatteryNoteType__Alternatives )
            {
             before(grammarAccess.getBatteryNoteTypeAccess().getAlternatives()); 
            // InternalGuardin.g:260:3: ( rule__BatteryNoteType__Alternatives )
            // InternalGuardin.g:260:4: rule__BatteryNoteType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BatteryNoteType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBatteryNoteTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBatteryNoteType"


    // $ANTLR start "rule__Battery__NotesAlternatives_2_0"
    // InternalGuardin.g:268:1: rule__Battery__NotesAlternatives_2_0 : ( ( ruleBatteryNote ) | ( ruleEmptyNote ) );
    public final void rule__Battery__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:272:1: ( ( ruleBatteryNote ) | ( ruleEmptyNote ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=16)) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGuardin.g:273:2: ( ruleBatteryNote )
                    {
                    // InternalGuardin.g:273:2: ( ruleBatteryNote )
                    // InternalGuardin.g:274:3: ruleBatteryNote
                    {
                     before(grammarAccess.getBatteryAccess().getNotesBatteryNoteParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBatteryNote();

                    state._fsp--;

                     after(grammarAccess.getBatteryAccess().getNotesBatteryNoteParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:279:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:279:2: ( ruleEmptyNote )
                    // InternalGuardin.g:280:3: ruleEmptyNote
                    {
                     before(grammarAccess.getBatteryAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptyNote();

                    state._fsp--;

                     after(grammarAccess.getBatteryAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Battery__NotesAlternatives_2_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalGuardin.g:289:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:293:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalGuardin.g:294:2: ( RULE_STRING )
                    {
                    // InternalGuardin.g:294:2: ( RULE_STRING )
                    // InternalGuardin.g:295:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:300:2: ( RULE_ID )
                    {
                    // InternalGuardin.g:300:2: ( RULE_ID )
                    // InternalGuardin.g:301:3: RULE_ID
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


    // $ANTLR start "rule__BatteryNoteType__Alternatives"
    // InternalGuardin.g:310:1: rule__BatteryNoteType__Alternatives : ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) );
    public final void rule__BatteryNoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:314:1: ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGuardin.g:315:2: ( ( 'bd' ) )
                    {
                    // InternalGuardin.g:315:2: ( ( 'bd' ) )
                    // InternalGuardin.g:316:3: ( 'bd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:317:3: ( 'bd' )
                    // InternalGuardin.g:317:4: 'bd'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:321:2: ( ( 'ch' ) )
                    {
                    // InternalGuardin.g:321:2: ( ( 'ch' ) )
                    // InternalGuardin.g:322:3: ( 'ch' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:323:3: ( 'ch' )
                    // InternalGuardin.g:323:4: 'ch'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:327:2: ( ( 'cc' ) )
                    {
                    // InternalGuardin.g:327:2: ( ( 'cc' ) )
                    // InternalGuardin.g:328:3: ( 'cc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:329:3: ( 'cc' )
                    // InternalGuardin.g:329:4: 'cc'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:333:2: ( ( 'oh' ) )
                    {
                    // InternalGuardin.g:333:2: ( ( 'oh' ) )
                    // InternalGuardin.g:334:3: ( 'oh' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:335:3: ( 'oh' )
                    // InternalGuardin.g:335:4: 'oh'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:339:2: ( ( 'rc' ) )
                    {
                    // InternalGuardin.g:339:2: ( ( 'rc' ) )
                    // InternalGuardin.g:340:3: ( 'rc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:341:3: ( 'rc' )
                    // InternalGuardin.g:341:4: 'rc'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:345:2: ( ( 'sd' ) )
                    {
                    // InternalGuardin.g:345:2: ( ( 'sd' ) )
                    // InternalGuardin.g:346:3: ( 'sd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getSNARE_DRUMEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:347:3: ( 'sd' )
                    // InternalGuardin.g:347:4: 'sd'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getSNARE_DRUMEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__BatteryNoteType__Alternatives"


    // $ANTLR start "rule__Music__Group__0"
    // InternalGuardin.g:355:1: rule__Music__Group__0 : rule__Music__Group__0__Impl rule__Music__Group__1 ;
    public final void rule__Music__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:359:1: ( rule__Music__Group__0__Impl rule__Music__Group__1 )
            // InternalGuardin.g:360:2: rule__Music__Group__0__Impl rule__Music__Group__1
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
    // InternalGuardin.g:367:1: rule__Music__Group__0__Impl : ( () ) ;
    public final void rule__Music__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:371:1: ( ( () ) )
            // InternalGuardin.g:372:1: ( () )
            {
            // InternalGuardin.g:372:1: ( () )
            // InternalGuardin.g:373:2: ()
            {
             before(grammarAccess.getMusicAccess().getMusicAction_0()); 
            // InternalGuardin.g:374:2: ()
            // InternalGuardin.g:374:3: 
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
    // InternalGuardin.g:382:1: rule__Music__Group__1 : rule__Music__Group__1__Impl rule__Music__Group__2 ;
    public final void rule__Music__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:386:1: ( rule__Music__Group__1__Impl rule__Music__Group__2 )
            // InternalGuardin.g:387:2: rule__Music__Group__1__Impl rule__Music__Group__2
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
    // InternalGuardin.g:394:1: rule__Music__Group__1__Impl : ( 'Music' ) ;
    public final void rule__Music__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:398:1: ( ( 'Music' ) )
            // InternalGuardin.g:399:1: ( 'Music' )
            {
            // InternalGuardin.g:399:1: ( 'Music' )
            // InternalGuardin.g:400:2: 'Music'
            {
             before(grammarAccess.getMusicAccess().getMusicKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getMusicKeyword_1()); 

            }


            }

        }
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
    // InternalGuardin.g:409:1: rule__Music__Group__2 : rule__Music__Group__2__Impl rule__Music__Group__3 ;
    public final void rule__Music__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:413:1: ( rule__Music__Group__2__Impl rule__Music__Group__3 )
            // InternalGuardin.g:414:2: rule__Music__Group__2__Impl rule__Music__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalGuardin.g:421:1: rule__Music__Group__2__Impl : ( ( rule__Music__NameAssignment_2 ) ) ;
    public final void rule__Music__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:425:1: ( ( ( rule__Music__NameAssignment_2 ) ) )
            // InternalGuardin.g:426:1: ( ( rule__Music__NameAssignment_2 ) )
            {
            // InternalGuardin.g:426:1: ( ( rule__Music__NameAssignment_2 ) )
            // InternalGuardin.g:427:2: ( rule__Music__NameAssignment_2 )
            {
             before(grammarAccess.getMusicAccess().getNameAssignment_2()); 
            // InternalGuardin.g:428:2: ( rule__Music__NameAssignment_2 )
            // InternalGuardin.g:428:3: rule__Music__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Music__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalGuardin.g:436:1: rule__Music__Group__3 : rule__Music__Group__3__Impl rule__Music__Group__4 ;
    public final void rule__Music__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:440:1: ( rule__Music__Group__3__Impl rule__Music__Group__4 )
            // InternalGuardin.g:441:2: rule__Music__Group__3__Impl rule__Music__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalGuardin.g:448:1: rule__Music__Group__3__Impl : ( ':' ) ;
    public final void rule__Music__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:452:1: ( ( ':' ) )
            // InternalGuardin.g:453:1: ( ':' )
            {
            // InternalGuardin.g:453:1: ( ':' )
            // InternalGuardin.g:454:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalGuardin.g:463:1: rule__Music__Group__4 : rule__Music__Group__4__Impl rule__Music__Group__5 ;
    public final void rule__Music__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:467:1: ( rule__Music__Group__4__Impl rule__Music__Group__5 )
            // InternalGuardin.g:468:2: rule__Music__Group__4__Impl rule__Music__Group__5
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
    // InternalGuardin.g:475:1: rule__Music__Group__4__Impl : ( 'sections' ) ;
    public final void rule__Music__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:479:1: ( ( 'sections' ) )
            // InternalGuardin.g:480:1: ( 'sections' )
            {
            // InternalGuardin.g:480:1: ( 'sections' )
            // InternalGuardin.g:481:2: 'sections'
            {
             before(grammarAccess.getMusicAccess().getSectionsKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getSectionsKeyword_4()); 

            }


            }

        }
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
    // InternalGuardin.g:490:1: rule__Music__Group__5 : rule__Music__Group__5__Impl rule__Music__Group__6 ;
    public final void rule__Music__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:494:1: ( rule__Music__Group__5__Impl rule__Music__Group__6 )
            // InternalGuardin.g:495:2: rule__Music__Group__5__Impl rule__Music__Group__6
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
    // InternalGuardin.g:502:1: rule__Music__Group__5__Impl : ( ':' ) ;
    public final void rule__Music__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:506:1: ( ( ':' ) )
            // InternalGuardin.g:507:1: ( ':' )
            {
            // InternalGuardin.g:507:1: ( ':' )
            // InternalGuardin.g:508:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getColonKeyword_5()); 

            }


            }

        }
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
    // InternalGuardin.g:517:1: rule__Music__Group__6 : rule__Music__Group__6__Impl rule__Music__Group__7 ;
    public final void rule__Music__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:521:1: ( rule__Music__Group__6__Impl rule__Music__Group__7 )
            // InternalGuardin.g:522:2: rule__Music__Group__6__Impl rule__Music__Group__7
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
    // InternalGuardin.g:529:1: rule__Music__Group__6__Impl : ( ( rule__Music__SectionsAssignment_6 ) ) ;
    public final void rule__Music__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:533:1: ( ( ( rule__Music__SectionsAssignment_6 ) ) )
            // InternalGuardin.g:534:1: ( ( rule__Music__SectionsAssignment_6 ) )
            {
            // InternalGuardin.g:534:1: ( ( rule__Music__SectionsAssignment_6 ) )
            // InternalGuardin.g:535:2: ( rule__Music__SectionsAssignment_6 )
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_6()); 
            // InternalGuardin.g:536:2: ( rule__Music__SectionsAssignment_6 )
            // InternalGuardin.g:536:3: rule__Music__SectionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Music__SectionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getSectionsAssignment_6()); 

            }


            }

        }
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
    // InternalGuardin.g:544:1: rule__Music__Group__7 : rule__Music__Group__7__Impl rule__Music__Group__8 ;
    public final void rule__Music__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:548:1: ( rule__Music__Group__7__Impl rule__Music__Group__8 )
            // InternalGuardin.g:549:2: rule__Music__Group__7__Impl rule__Music__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Music__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__8();

            state._fsp--;


            }

        }
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
    // InternalGuardin.g:556:1: rule__Music__Group__7__Impl : ( ( rule__Music__SectionsAssignment_7 )* ) ;
    public final void rule__Music__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:560:1: ( ( ( rule__Music__SectionsAssignment_7 )* ) )
            // InternalGuardin.g:561:1: ( ( rule__Music__SectionsAssignment_7 )* )
            {
            // InternalGuardin.g:561:1: ( ( rule__Music__SectionsAssignment_7 )* )
            // InternalGuardin.g:562:2: ( rule__Music__SectionsAssignment_7 )*
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_7()); 
            // InternalGuardin.g:563:2: ( rule__Music__SectionsAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGuardin.g:563:3: rule__Music__SectionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Music__SectionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getSectionsAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Music__Group__8"
    // InternalGuardin.g:571:1: rule__Music__Group__8 : rule__Music__Group__8__Impl rule__Music__Group__9 ;
    public final void rule__Music__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:575:1: ( rule__Music__Group__8__Impl rule__Music__Group__9 )
            // InternalGuardin.g:576:2: rule__Music__Group__8__Impl rule__Music__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__8"


    // $ANTLR start "rule__Music__Group__8__Impl"
    // InternalGuardin.g:583:1: rule__Music__Group__8__Impl : ( 'tracks' ) ;
    public final void rule__Music__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:587:1: ( ( 'tracks' ) )
            // InternalGuardin.g:588:1: ( 'tracks' )
            {
            // InternalGuardin.g:588:1: ( 'tracks' )
            // InternalGuardin.g:589:2: 'tracks'
            {
             before(grammarAccess.getMusicAccess().getTracksKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getTracksKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__8__Impl"


    // $ANTLR start "rule__Music__Group__9"
    // InternalGuardin.g:598:1: rule__Music__Group__9 : rule__Music__Group__9__Impl rule__Music__Group__10 ;
    public final void rule__Music__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:602:1: ( rule__Music__Group__9__Impl rule__Music__Group__10 )
            // InternalGuardin.g:603:2: rule__Music__Group__9__Impl rule__Music__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Music__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__9"


    // $ANTLR start "rule__Music__Group__9__Impl"
    // InternalGuardin.g:610:1: rule__Music__Group__9__Impl : ( ':' ) ;
    public final void rule__Music__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:614:1: ( ( ':' ) )
            // InternalGuardin.g:615:1: ( ':' )
            {
            // InternalGuardin.g:615:1: ( ':' )
            // InternalGuardin.g:616:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__9__Impl"


    // $ANTLR start "rule__Music__Group__10"
    // InternalGuardin.g:625:1: rule__Music__Group__10 : rule__Music__Group__10__Impl ;
    public final void rule__Music__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:629:1: ( rule__Music__Group__10__Impl )
            // InternalGuardin.g:630:2: rule__Music__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__10"


    // $ANTLR start "rule__Music__Group__10__Impl"
    // InternalGuardin.g:636:1: rule__Music__Group__10__Impl : ( ( rule__Music__Group_10__0 ) ) ;
    public final void rule__Music__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:640:1: ( ( ( rule__Music__Group_10__0 ) ) )
            // InternalGuardin.g:641:1: ( ( rule__Music__Group_10__0 ) )
            {
            // InternalGuardin.g:641:1: ( ( rule__Music__Group_10__0 ) )
            // InternalGuardin.g:642:2: ( rule__Music__Group_10__0 )
            {
             before(grammarAccess.getMusicAccess().getGroup_10()); 
            // InternalGuardin.g:643:2: ( rule__Music__Group_10__0 )
            // InternalGuardin.g:643:3: rule__Music__Group_10__0
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_10__0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__10__Impl"


    // $ANTLR start "rule__Music__Group_10__0"
    // InternalGuardin.g:652:1: rule__Music__Group_10__0 : rule__Music__Group_10__0__Impl rule__Music__Group_10__1 ;
    public final void rule__Music__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:656:1: ( rule__Music__Group_10__0__Impl rule__Music__Group_10__1 )
            // InternalGuardin.g:657:2: rule__Music__Group_10__0__Impl rule__Music__Group_10__1
            {
            pushFollow(FOLLOW_10);
            rule__Music__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_10__0"


    // $ANTLR start "rule__Music__Group_10__0__Impl"
    // InternalGuardin.g:664:1: rule__Music__Group_10__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:668:1: ( ( '-' ) )
            // InternalGuardin.g:669:1: ( '-' )
            {
            // InternalGuardin.g:669:1: ( '-' )
            // InternalGuardin.g:670:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_10_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getHyphenMinusKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_10__0__Impl"


    // $ANTLR start "rule__Music__Group_10__1"
    // InternalGuardin.g:679:1: rule__Music__Group_10__1 : rule__Music__Group_10__1__Impl rule__Music__Group_10__2 ;
    public final void rule__Music__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:683:1: ( rule__Music__Group_10__1__Impl rule__Music__Group_10__2 )
            // InternalGuardin.g:684:2: rule__Music__Group_10__1__Impl rule__Music__Group_10__2
            {
            pushFollow(FOLLOW_9);
            rule__Music__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_10__1"


    // $ANTLR start "rule__Music__Group_10__1__Impl"
    // InternalGuardin.g:691:1: rule__Music__Group_10__1__Impl : ( ( rule__Music__TracksAssignment_10_1 ) ) ;
    public final void rule__Music__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:695:1: ( ( ( rule__Music__TracksAssignment_10_1 ) ) )
            // InternalGuardin.g:696:1: ( ( rule__Music__TracksAssignment_10_1 ) )
            {
            // InternalGuardin.g:696:1: ( ( rule__Music__TracksAssignment_10_1 ) )
            // InternalGuardin.g:697:2: ( rule__Music__TracksAssignment_10_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_10_1()); 
            // InternalGuardin.g:698:2: ( rule__Music__TracksAssignment_10_1 )
            // InternalGuardin.g:698:3: rule__Music__TracksAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__TracksAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getTracksAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_10__1__Impl"


    // $ANTLR start "rule__Music__Group_10__2"
    // InternalGuardin.g:706:1: rule__Music__Group_10__2 : rule__Music__Group_10__2__Impl ;
    public final void rule__Music__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:710:1: ( rule__Music__Group_10__2__Impl )
            // InternalGuardin.g:711:2: rule__Music__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_10__2"


    // $ANTLR start "rule__Music__Group_10__2__Impl"
    // InternalGuardin.g:717:1: rule__Music__Group_10__2__Impl : ( ( rule__Music__Group_10_2__0 )* ) ;
    public final void rule__Music__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:721:1: ( ( ( rule__Music__Group_10_2__0 )* ) )
            // InternalGuardin.g:722:1: ( ( rule__Music__Group_10_2__0 )* )
            {
            // InternalGuardin.g:722:1: ( ( rule__Music__Group_10_2__0 )* )
            // InternalGuardin.g:723:2: ( rule__Music__Group_10_2__0 )*
            {
             before(grammarAccess.getMusicAccess().getGroup_10_2()); 
            // InternalGuardin.g:724:2: ( rule__Music__Group_10_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGuardin.g:724:3: rule__Music__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Music__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_10__2__Impl"


    // $ANTLR start "rule__Music__Group_10_2__0"
    // InternalGuardin.g:733:1: rule__Music__Group_10_2__0 : rule__Music__Group_10_2__0__Impl rule__Music__Group_10_2__1 ;
    public final void rule__Music__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:737:1: ( rule__Music__Group_10_2__0__Impl rule__Music__Group_10_2__1 )
            // InternalGuardin.g:738:2: rule__Music__Group_10_2__0__Impl rule__Music__Group_10_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Music__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_10_2__0"


    // $ANTLR start "rule__Music__Group_10_2__0__Impl"
    // InternalGuardin.g:745:1: rule__Music__Group_10_2__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:749:1: ( ( '-' ) )
            // InternalGuardin.g:750:1: ( '-' )
            {
            // InternalGuardin.g:750:1: ( '-' )
            // InternalGuardin.g:751:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_10_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getHyphenMinusKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_10_2__0__Impl"


    // $ANTLR start "rule__Music__Group_10_2__1"
    // InternalGuardin.g:760:1: rule__Music__Group_10_2__1 : rule__Music__Group_10_2__1__Impl ;
    public final void rule__Music__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:764:1: ( rule__Music__Group_10_2__1__Impl )
            // InternalGuardin.g:765:2: rule__Music__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_10_2__1"


    // $ANTLR start "rule__Music__Group_10_2__1__Impl"
    // InternalGuardin.g:771:1: rule__Music__Group_10_2__1__Impl : ( ( rule__Music__TracksAssignment_10_2_1 ) ) ;
    public final void rule__Music__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:775:1: ( ( ( rule__Music__TracksAssignment_10_2_1 ) ) )
            // InternalGuardin.g:776:1: ( ( rule__Music__TracksAssignment_10_2_1 ) )
            {
            // InternalGuardin.g:776:1: ( ( rule__Music__TracksAssignment_10_2_1 ) )
            // InternalGuardin.g:777:2: ( rule__Music__TracksAssignment_10_2_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_10_2_1()); 
            // InternalGuardin.g:778:2: ( rule__Music__TracksAssignment_10_2_1 )
            // InternalGuardin.g:778:3: rule__Music__TracksAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__TracksAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getTracksAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_10_2__1__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalGuardin.g:787:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:791:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalGuardin.g:792:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGuardin.g:799:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:803:1: ( ( () ) )
            // InternalGuardin.g:804:1: ( () )
            {
            // InternalGuardin.g:804:1: ( () )
            // InternalGuardin.g:805:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalGuardin.g:806:2: ()
            // InternalGuardin.g:806:3: 
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
    // InternalGuardin.g:814:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:818:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalGuardin.g:819:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalGuardin.g:826:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:830:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalGuardin.g:831:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalGuardin.g:831:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalGuardin.g:832:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalGuardin.g:833:2: ( rule__Section__NameAssignment_1 )
            // InternalGuardin.g:833:3: rule__Section__NameAssignment_1
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
    // InternalGuardin.g:841:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:845:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalGuardin.g:846:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalGuardin.g:853:1: rule__Section__Group__2__Impl : ( ':' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:857:1: ( ( ':' ) )
            // InternalGuardin.g:858:1: ( ':' )
            {
            // InternalGuardin.g:858:1: ( ':' )
            // InternalGuardin.g:859:2: ':'
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
    // InternalGuardin.g:868:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:872:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalGuardin.g:873:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalGuardin.g:880:1: rule__Section__Group__3__Impl : ( 'tempo=' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:884:1: ( ( 'tempo=' ) )
            // InternalGuardin.g:885:1: ( 'tempo=' )
            {
            // InternalGuardin.g:885:1: ( 'tempo=' )
            // InternalGuardin.g:886:2: 'tempo='
            {
             before(grammarAccess.getSectionAccess().getTempoKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGuardin.g:895:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:899:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalGuardin.g:900:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalGuardin.g:907:1: rule__Section__Group__4__Impl : ( ( rule__Section__TempoAssignment_4 ) ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:911:1: ( ( ( rule__Section__TempoAssignment_4 ) ) )
            // InternalGuardin.g:912:1: ( ( rule__Section__TempoAssignment_4 ) )
            {
            // InternalGuardin.g:912:1: ( ( rule__Section__TempoAssignment_4 ) )
            // InternalGuardin.g:913:2: ( rule__Section__TempoAssignment_4 )
            {
             before(grammarAccess.getSectionAccess().getTempoAssignment_4()); 
            // InternalGuardin.g:914:2: ( rule__Section__TempoAssignment_4 )
            // InternalGuardin.g:914:3: rule__Section__TempoAssignment_4
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
    // InternalGuardin.g:922:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:926:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalGuardin.g:927:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalGuardin.g:934:1: rule__Section__Group__5__Impl : ( 'signature=' ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:938:1: ( ( 'signature=' ) )
            // InternalGuardin.g:939:1: ( 'signature=' )
            {
            // InternalGuardin.g:939:1: ( 'signature=' )
            // InternalGuardin.g:940:2: 'signature='
            {
             before(grammarAccess.getSectionAccess().getSignatureKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGuardin.g:949:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:953:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalGuardin.g:954:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalGuardin.g:961:1: rule__Section__Group__6__Impl : ( ( rule__Section__SignatureAssignment_6 ) ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:965:1: ( ( ( rule__Section__SignatureAssignment_6 ) ) )
            // InternalGuardin.g:966:1: ( ( rule__Section__SignatureAssignment_6 ) )
            {
            // InternalGuardin.g:966:1: ( ( rule__Section__SignatureAssignment_6 ) )
            // InternalGuardin.g:967:2: ( rule__Section__SignatureAssignment_6 )
            {
             before(grammarAccess.getSectionAccess().getSignatureAssignment_6()); 
            // InternalGuardin.g:968:2: ( rule__Section__SignatureAssignment_6 )
            // InternalGuardin.g:968:3: rule__Section__SignatureAssignment_6
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
    // InternalGuardin.g:976:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:980:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalGuardin.g:981:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalGuardin.g:988:1: rule__Section__Group__7__Impl : ( 'bars=' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:992:1: ( ( 'bars=' ) )
            // InternalGuardin.g:993:1: ( 'bars=' )
            {
            // InternalGuardin.g:993:1: ( 'bars=' )
            // InternalGuardin.g:994:2: 'bars='
            {
             before(grammarAccess.getSectionAccess().getBarsKeyword_7()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGuardin.g:1003:1: rule__Section__Group__8 : rule__Section__Group__8__Impl ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1007:1: ( rule__Section__Group__8__Impl )
            // InternalGuardin.g:1008:2: rule__Section__Group__8__Impl
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
    // InternalGuardin.g:1014:1: rule__Section__Group__8__Impl : ( ( rule__Section__BarsAssignment_8 ) ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1018:1: ( ( ( rule__Section__BarsAssignment_8 ) ) )
            // InternalGuardin.g:1019:1: ( ( rule__Section__BarsAssignment_8 ) )
            {
            // InternalGuardin.g:1019:1: ( ( rule__Section__BarsAssignment_8 ) )
            // InternalGuardin.g:1020:2: ( rule__Section__BarsAssignment_8 )
            {
             before(grammarAccess.getSectionAccess().getBarsAssignment_8()); 
            // InternalGuardin.g:1021:2: ( rule__Section__BarsAssignment_8 )
            // InternalGuardin.g:1021:3: rule__Section__BarsAssignment_8
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
    // InternalGuardin.g:1030:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1034:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // InternalGuardin.g:1035:2: rule__Track__Group__0__Impl rule__Track__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGuardin.g:1042:1: rule__Track__Group__0__Impl : ( () ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1046:1: ( ( () ) )
            // InternalGuardin.g:1047:1: ( () )
            {
            // InternalGuardin.g:1047:1: ( () )
            // InternalGuardin.g:1048:2: ()
            {
             before(grammarAccess.getTrackAccess().getTrackAction_0()); 
            // InternalGuardin.g:1049:2: ()
            // InternalGuardin.g:1049:3: 
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
    // InternalGuardin.g:1057:1: rule__Track__Group__1 : rule__Track__Group__1__Impl rule__Track__Group__2 ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1061:1: ( rule__Track__Group__1__Impl rule__Track__Group__2 )
            // InternalGuardin.g:1062:2: rule__Track__Group__1__Impl rule__Track__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGuardin.g:1069:1: rule__Track__Group__1__Impl : ( ( rule__Track__Group_1__0 )? ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1073:1: ( ( ( rule__Track__Group_1__0 )? ) )
            // InternalGuardin.g:1074:1: ( ( rule__Track__Group_1__0 )? )
            {
            // InternalGuardin.g:1074:1: ( ( rule__Track__Group_1__0 )? )
            // InternalGuardin.g:1075:2: ( rule__Track__Group_1__0 )?
            {
             before(grammarAccess.getTrackAccess().getGroup_1()); 
            // InternalGuardin.g:1076:2: ( rule__Track__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGuardin.g:1076:3: rule__Track__Group_1__0
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
    // InternalGuardin.g:1084:1: rule__Track__Group__2 : rule__Track__Group__2__Impl rule__Track__Group__3 ;
    public final void rule__Track__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1088:1: ( rule__Track__Group__2__Impl rule__Track__Group__3 )
            // InternalGuardin.g:1089:2: rule__Track__Group__2__Impl rule__Track__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalGuardin.g:1096:1: rule__Track__Group__2__Impl : ( 'instrument' ) ;
    public final void rule__Track__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1100:1: ( ( 'instrument' ) )
            // InternalGuardin.g:1101:1: ( 'instrument' )
            {
            // InternalGuardin.g:1101:1: ( 'instrument' )
            // InternalGuardin.g:1102:2: 'instrument'
            {
             before(grammarAccess.getTrackAccess().getInstrumentKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGuardin.g:1111:1: rule__Track__Group__3 : rule__Track__Group__3__Impl rule__Track__Group__4 ;
    public final void rule__Track__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1115:1: ( rule__Track__Group__3__Impl rule__Track__Group__4 )
            // InternalGuardin.g:1116:2: rule__Track__Group__3__Impl rule__Track__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalGuardin.g:1123:1: rule__Track__Group__3__Impl : ( ':' ) ;
    public final void rule__Track__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1127:1: ( ( ':' ) )
            // InternalGuardin.g:1128:1: ( ':' )
            {
            // InternalGuardin.g:1128:1: ( ':' )
            // InternalGuardin.g:1129:2: ':'
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
    // InternalGuardin.g:1138:1: rule__Track__Group__4 : rule__Track__Group__4__Impl ;
    public final void rule__Track__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1142:1: ( rule__Track__Group__4__Impl )
            // InternalGuardin.g:1143:2: rule__Track__Group__4__Impl
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
    // InternalGuardin.g:1149:1: rule__Track__Group__4__Impl : ( ( rule__Track__InstrumentAssignment_4 ) ) ;
    public final void rule__Track__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1153:1: ( ( ( rule__Track__InstrumentAssignment_4 ) ) )
            // InternalGuardin.g:1154:1: ( ( rule__Track__InstrumentAssignment_4 ) )
            {
            // InternalGuardin.g:1154:1: ( ( rule__Track__InstrumentAssignment_4 ) )
            // InternalGuardin.g:1155:2: ( rule__Track__InstrumentAssignment_4 )
            {
             before(grammarAccess.getTrackAccess().getInstrumentAssignment_4()); 
            // InternalGuardin.g:1156:2: ( rule__Track__InstrumentAssignment_4 )
            // InternalGuardin.g:1156:3: rule__Track__InstrumentAssignment_4
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
    // InternalGuardin.g:1165:1: rule__Track__Group_1__0 : rule__Track__Group_1__0__Impl rule__Track__Group_1__1 ;
    public final void rule__Track__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1169:1: ( rule__Track__Group_1__0__Impl rule__Track__Group_1__1 )
            // InternalGuardin.g:1170:2: rule__Track__Group_1__0__Impl rule__Track__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGuardin.g:1177:1: rule__Track__Group_1__0__Impl : ( ( rule__Track__NameAssignment_1_0 ) ) ;
    public final void rule__Track__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1181:1: ( ( ( rule__Track__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:1182:1: ( ( rule__Track__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:1182:1: ( ( rule__Track__NameAssignment_1_0 ) )
            // InternalGuardin.g:1183:2: ( rule__Track__NameAssignment_1_0 )
            {
             before(grammarAccess.getTrackAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:1184:2: ( rule__Track__NameAssignment_1_0 )
            // InternalGuardin.g:1184:3: rule__Track__NameAssignment_1_0
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
    // InternalGuardin.g:1192:1: rule__Track__Group_1__1 : rule__Track__Group_1__1__Impl ;
    public final void rule__Track__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1196:1: ( rule__Track__Group_1__1__Impl )
            // InternalGuardin.g:1197:2: rule__Track__Group_1__1__Impl
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
    // InternalGuardin.g:1203:1: rule__Track__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Track__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1207:1: ( ( ':' ) )
            // InternalGuardin.g:1208:1: ( ':' )
            {
            // InternalGuardin.g:1208:1: ( ':' )
            // InternalGuardin.g:1209:2: ':'
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
    // InternalGuardin.g:1219:1: rule__Battery__Group__0 : rule__Battery__Group__0__Impl rule__Battery__Group__1 ;
    public final void rule__Battery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1223:1: ( rule__Battery__Group__0__Impl rule__Battery__Group__1 )
            // InternalGuardin.g:1224:2: rule__Battery__Group__0__Impl rule__Battery__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGuardin.g:1231:1: rule__Battery__Group__0__Impl : ( () ) ;
    public final void rule__Battery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1235:1: ( ( () ) )
            // InternalGuardin.g:1236:1: ( () )
            {
            // InternalGuardin.g:1236:1: ( () )
            // InternalGuardin.g:1237:2: ()
            {
             before(grammarAccess.getBatteryAccess().getBatteryAction_0()); 
            // InternalGuardin.g:1238:2: ()
            // InternalGuardin.g:1238:3: 
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
    // InternalGuardin.g:1246:1: rule__Battery__Group__1 : rule__Battery__Group__1__Impl rule__Battery__Group__2 ;
    public final void rule__Battery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1250:1: ( rule__Battery__Group__1__Impl rule__Battery__Group__2 )
            // InternalGuardin.g:1251:2: rule__Battery__Group__1__Impl rule__Battery__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGuardin.g:1258:1: rule__Battery__Group__1__Impl : ( ( rule__Battery__Group_1__0 )? ) ;
    public final void rule__Battery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1262:1: ( ( ( rule__Battery__Group_1__0 )? ) )
            // InternalGuardin.g:1263:1: ( ( rule__Battery__Group_1__0 )? )
            {
            // InternalGuardin.g:1263:1: ( ( rule__Battery__Group_1__0 )? )
            // InternalGuardin.g:1264:2: ( rule__Battery__Group_1__0 )?
            {
             before(grammarAccess.getBatteryAccess().getGroup_1()); 
            // InternalGuardin.g:1265:2: ( rule__Battery__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGuardin.g:1265:3: rule__Battery__Group_1__0
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
    // InternalGuardin.g:1273:1: rule__Battery__Group__2 : rule__Battery__Group__2__Impl ;
    public final void rule__Battery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1277:1: ( rule__Battery__Group__2__Impl )
            // InternalGuardin.g:1278:2: rule__Battery__Group__2__Impl
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
    // InternalGuardin.g:1284:1: rule__Battery__Group__2__Impl : ( ( ( rule__Battery__NotesAssignment_2 ) ) ( ( rule__Battery__NotesAssignment_2 )* ) ) ;
    public final void rule__Battery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1288:1: ( ( ( ( rule__Battery__NotesAssignment_2 ) ) ( ( rule__Battery__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:1289:1: ( ( ( rule__Battery__NotesAssignment_2 ) ) ( ( rule__Battery__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:1289:1: ( ( ( rule__Battery__NotesAssignment_2 ) ) ( ( rule__Battery__NotesAssignment_2 )* ) )
            // InternalGuardin.g:1290:2: ( ( rule__Battery__NotesAssignment_2 ) ) ( ( rule__Battery__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:1290:2: ( ( rule__Battery__NotesAssignment_2 ) )
            // InternalGuardin.g:1291:3: ( rule__Battery__NotesAssignment_2 )
            {
             before(grammarAccess.getBatteryAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:1292:3: ( rule__Battery__NotesAssignment_2 )
            // InternalGuardin.g:1292:4: rule__Battery__NotesAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Battery__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:1295:2: ( ( rule__Battery__NotesAssignment_2 )* )
            // InternalGuardin.g:1296:3: ( rule__Battery__NotesAssignment_2 )*
            {
             before(grammarAccess.getBatteryAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:1297:3: ( rule__Battery__NotesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=11 && LA8_0<=16)||LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGuardin.g:1297:4: rule__Battery__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Battery__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalGuardin.g:1307:1: rule__Battery__Group_1__0 : rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1 ;
    public final void rule__Battery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1311:1: ( rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1 )
            // InternalGuardin.g:1312:2: rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGuardin.g:1319:1: rule__Battery__Group_1__0__Impl : ( ( rule__Battery__NameAssignment_1_0 ) ) ;
    public final void rule__Battery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1323:1: ( ( ( rule__Battery__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:1324:1: ( ( rule__Battery__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:1324:1: ( ( rule__Battery__NameAssignment_1_0 ) )
            // InternalGuardin.g:1325:2: ( rule__Battery__NameAssignment_1_0 )
            {
             before(grammarAccess.getBatteryAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:1326:2: ( rule__Battery__NameAssignment_1_0 )
            // InternalGuardin.g:1326:3: rule__Battery__NameAssignment_1_0
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
    // InternalGuardin.g:1334:1: rule__Battery__Group_1__1 : rule__Battery__Group_1__1__Impl ;
    public final void rule__Battery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1338:1: ( rule__Battery__Group_1__1__Impl )
            // InternalGuardin.g:1339:2: rule__Battery__Group_1__1__Impl
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
    // InternalGuardin.g:1345:1: rule__Battery__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Battery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1349:1: ( ( ':' ) )
            // InternalGuardin.g:1350:1: ( ':' )
            {
            // InternalGuardin.g:1350:1: ( ':' )
            // InternalGuardin.g:1351:2: ':'
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


    // $ANTLR start "rule__EmptyNote__Group__0"
    // InternalGuardin.g:1361:1: rule__EmptyNote__Group__0 : rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 ;
    public final void rule__EmptyNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1365:1: ( rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 )
            // InternalGuardin.g:1366:2: rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EmptyNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyNote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyNote__Group__0"


    // $ANTLR start "rule__EmptyNote__Group__0__Impl"
    // InternalGuardin.g:1373:1: rule__EmptyNote__Group__0__Impl : ( () ) ;
    public final void rule__EmptyNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1377:1: ( ( () ) )
            // InternalGuardin.g:1378:1: ( () )
            {
            // InternalGuardin.g:1378:1: ( () )
            // InternalGuardin.g:1379:2: ()
            {
             before(grammarAccess.getEmptyNoteAccess().getEmptyNoteAction_0()); 
            // InternalGuardin.g:1380:2: ()
            // InternalGuardin.g:1380:3: 
            {
            }

             after(grammarAccess.getEmptyNoteAccess().getEmptyNoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyNote__Group__0__Impl"


    // $ANTLR start "rule__EmptyNote__Group__1"
    // InternalGuardin.g:1388:1: rule__EmptyNote__Group__1 : rule__EmptyNote__Group__1__Impl ;
    public final void rule__EmptyNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1392:1: ( rule__EmptyNote__Group__1__Impl )
            // InternalGuardin.g:1393:2: rule__EmptyNote__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptyNote__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyNote__Group__1"


    // $ANTLR start "rule__EmptyNote__Group__1__Impl"
    // InternalGuardin.g:1399:1: rule__EmptyNote__Group__1__Impl : ( '$' ) ;
    public final void rule__EmptyNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1403:1: ( ( '$' ) )
            // InternalGuardin.g:1404:1: ( '$' )
            {
            // InternalGuardin.g:1404:1: ( '$' )
            // InternalGuardin.g:1405:2: '$'
            {
             before(grammarAccess.getEmptyNoteAccess().getDollarSignKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEmptyNoteAccess().getDollarSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyNote__Group__1__Impl"


    // $ANTLR start "rule__BatteryNote__Group__0"
    // InternalGuardin.g:1415:1: rule__BatteryNote__Group__0 : rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 ;
    public final void rule__BatteryNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1419:1: ( rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 )
            // InternalGuardin.g:1420:2: rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__BatteryNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BatteryNote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryNote__Group__0"


    // $ANTLR start "rule__BatteryNote__Group__0__Impl"
    // InternalGuardin.g:1427:1: rule__BatteryNote__Group__0__Impl : ( () ) ;
    public final void rule__BatteryNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1431:1: ( ( () ) )
            // InternalGuardin.g:1432:1: ( () )
            {
            // InternalGuardin.g:1432:1: ( () )
            // InternalGuardin.g:1433:2: ()
            {
             before(grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0()); 
            // InternalGuardin.g:1434:2: ()
            // InternalGuardin.g:1434:3: 
            {
            }

             after(grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryNote__Group__0__Impl"


    // $ANTLR start "rule__BatteryNote__Group__1"
    // InternalGuardin.g:1442:1: rule__BatteryNote__Group__1 : rule__BatteryNote__Group__1__Impl ;
    public final void rule__BatteryNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1446:1: ( rule__BatteryNote__Group__1__Impl )
            // InternalGuardin.g:1447:2: rule__BatteryNote__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BatteryNote__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryNote__Group__1"


    // $ANTLR start "rule__BatteryNote__Group__1__Impl"
    // InternalGuardin.g:1453:1: rule__BatteryNote__Group__1__Impl : ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) ;
    public final void rule__BatteryNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1457:1: ( ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) )
            // InternalGuardin.g:1458:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            {
            // InternalGuardin.g:1458:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            // InternalGuardin.g:1459:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            {
             before(grammarAccess.getBatteryNoteAccess().getNoteTypeAssignment_1()); 
            // InternalGuardin.g:1460:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            // InternalGuardin.g:1460:3: rule__BatteryNote__NoteTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BatteryNote__NoteTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBatteryNoteAccess().getNoteTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryNote__Group__1__Impl"


    // $ANTLR start "rule__Music__NameAssignment_2"
    // InternalGuardin.g:1469:1: rule__Music__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Music__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1473:1: ( ( ruleEString ) )
            // InternalGuardin.g:1474:2: ( ruleEString )
            {
            // InternalGuardin.g:1474:2: ( ruleEString )
            // InternalGuardin.g:1475:3: ruleEString
            {
             before(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__NameAssignment_2"


    // $ANTLR start "rule__Music__SectionsAssignment_6"
    // InternalGuardin.g:1484:1: rule__Music__SectionsAssignment_6 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1488:1: ( ( ruleSection ) )
            // InternalGuardin.g:1489:2: ( ruleSection )
            {
            // InternalGuardin.g:1489:2: ( ruleSection )
            // InternalGuardin.g:1490:3: ruleSection
            {
             before(grammarAccess.getMusicAccess().getSectionsSectionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getSectionsSectionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__SectionsAssignment_6"


    // $ANTLR start "rule__Music__SectionsAssignment_7"
    // InternalGuardin.g:1499:1: rule__Music__SectionsAssignment_7 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1503:1: ( ( ruleSection ) )
            // InternalGuardin.g:1504:2: ( ruleSection )
            {
            // InternalGuardin.g:1504:2: ( ruleSection )
            // InternalGuardin.g:1505:3: ruleSection
            {
             before(grammarAccess.getMusicAccess().getSectionsSectionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getSectionsSectionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__SectionsAssignment_7"


    // $ANTLR start "rule__Music__TracksAssignment_10_1"
    // InternalGuardin.g:1514:1: rule__Music__TracksAssignment_10_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1518:1: ( ( ruleTrack ) )
            // InternalGuardin.g:1519:2: ( ruleTrack )
            {
            // InternalGuardin.g:1519:2: ( ruleTrack )
            // InternalGuardin.g:1520:3: ruleTrack
            {
             before(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__TracksAssignment_10_1"


    // $ANTLR start "rule__Music__TracksAssignment_10_2_1"
    // InternalGuardin.g:1529:1: rule__Music__TracksAssignment_10_2_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1533:1: ( ( ruleTrack ) )
            // InternalGuardin.g:1534:2: ( ruleTrack )
            {
            // InternalGuardin.g:1534:2: ( ruleTrack )
            // InternalGuardin.g:1535:3: ruleTrack
            {
             before(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_10_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__TracksAssignment_10_2_1"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalGuardin.g:1544:1: rule__Section__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1548:1: ( ( ruleEString ) )
            // InternalGuardin.g:1549:2: ( ruleEString )
            {
            // InternalGuardin.g:1549:2: ( ruleEString )
            // InternalGuardin.g:1550:3: ruleEString
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
    // InternalGuardin.g:1559:1: rule__Section__TempoAssignment_4 : ( ruleEInt ) ;
    public final void rule__Section__TempoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1563:1: ( ( ruleEInt ) )
            // InternalGuardin.g:1564:2: ( ruleEInt )
            {
            // InternalGuardin.g:1564:2: ( ruleEInt )
            // InternalGuardin.g:1565:3: ruleEInt
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
    // InternalGuardin.g:1574:1: rule__Section__SignatureAssignment_6 : ( ruleEInt ) ;
    public final void rule__Section__SignatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1578:1: ( ( ruleEInt ) )
            // InternalGuardin.g:1579:2: ( ruleEInt )
            {
            // InternalGuardin.g:1579:2: ( ruleEInt )
            // InternalGuardin.g:1580:3: ruleEInt
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
    // InternalGuardin.g:1589:1: rule__Section__BarsAssignment_8 : ( ruleEInt ) ;
    public final void rule__Section__BarsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1593:1: ( ( ruleEInt ) )
            // InternalGuardin.g:1594:2: ( ruleEInt )
            {
            // InternalGuardin.g:1594:2: ( ruleEInt )
            // InternalGuardin.g:1595:3: ruleEInt
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
    // InternalGuardin.g:1604:1: rule__Track__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Track__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1608:1: ( ( ruleEString ) )
            // InternalGuardin.g:1609:2: ( ruleEString )
            {
            // InternalGuardin.g:1609:2: ( ruleEString )
            // InternalGuardin.g:1610:3: ruleEString
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
    // InternalGuardin.g:1619:1: rule__Track__InstrumentAssignment_4 : ( ruleBattery ) ;
    public final void rule__Track__InstrumentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1623:1: ( ( ruleBattery ) )
            // InternalGuardin.g:1624:2: ( ruleBattery )
            {
            // InternalGuardin.g:1624:2: ( ruleBattery )
            // InternalGuardin.g:1625:3: ruleBattery
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
    // InternalGuardin.g:1634:1: rule__Battery__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Battery__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1638:1: ( ( ruleEString ) )
            // InternalGuardin.g:1639:2: ( ruleEString )
            {
            // InternalGuardin.g:1639:2: ( ruleEString )
            // InternalGuardin.g:1640:3: ruleEString
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
    // InternalGuardin.g:1649:1: rule__Battery__NotesAssignment_2 : ( ( rule__Battery__NotesAlternatives_2_0 ) ) ;
    public final void rule__Battery__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1653:1: ( ( ( rule__Battery__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:1654:2: ( ( rule__Battery__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:1654:2: ( ( rule__Battery__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:1655:3: ( rule__Battery__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getBatteryAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:1656:3: ( rule__Battery__NotesAlternatives_2_0 )
            // InternalGuardin.g:1656:4: rule__Battery__NotesAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Battery__NotesAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getNotesAlternatives_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__BatteryNote__NoteTypeAssignment_1"
    // InternalGuardin.g:1664:1: rule__BatteryNote__NoteTypeAssignment_1 : ( ruleBatteryNoteType ) ;
    public final void rule__BatteryNote__NoteTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1668:1: ( ( ruleBatteryNoteType ) )
            // InternalGuardin.g:1669:2: ( ruleBatteryNoteType )
            {
            // InternalGuardin.g:1669:2: ( ruleBatteryNoteType )
            // InternalGuardin.g:1670:3: ruleBatteryNoteType
            {
             before(grammarAccess.getBatteryNoteAccess().getNoteTypeBatteryNoteTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBatteryNoteType();

            state._fsp--;

             after(grammarAccess.getBatteryNoteAccess().getNoteTypeBatteryNoteTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryNote__NoteTypeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000401F860L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000401F862L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000001F800L});

}