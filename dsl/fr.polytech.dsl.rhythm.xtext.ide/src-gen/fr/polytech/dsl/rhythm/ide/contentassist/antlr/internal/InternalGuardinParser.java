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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'piano'", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "'ACOUSTIC_BASS'", "'CHURCH_ORGAN'", "'CLAVINET'", "'GUITAR'", "'HARPSICHORD'", "'MUSIC_BOX'", "'OCARINA'", "'PIANO'", "'SYNTH_BASS_1'", "'VIOLIN'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'Music'", "'sections'", "'tracks'", "'CustomSoundBank'", "'basePath='", "'-'", "'tempo='", "'signature='", "'bars='", "'$'", "'battery'", "'begin_section'", "'end_section'", "'layer:'", "'('", "')'", "'x'", "'other:'", "'/'", "'|'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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


    // $ANTLR start "entryRuleInstrument"
    // InternalGuardin.g:128:1: entryRuleInstrument : ruleInstrument EOF ;
    public final void entryRuleInstrument() throws RecognitionException {
        try {
            // InternalGuardin.g:129:1: ( ruleInstrument EOF )
            // InternalGuardin.g:130:1: ruleInstrument EOF
            {
             before(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_1);
            ruleInstrument();

            state._fsp--;

             after(grammarAccess.getInstrumentRule()); 
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
    // $ANTLR end "entryRuleInstrument"


    // $ANTLR start "ruleInstrument"
    // InternalGuardin.g:137:1: ruleInstrument : ( ( rule__Instrument__Alternatives ) ) ;
    public final void ruleInstrument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:141:2: ( ( ( rule__Instrument__Alternatives ) ) )
            // InternalGuardin.g:142:2: ( ( rule__Instrument__Alternatives ) )
            {
            // InternalGuardin.g:142:2: ( ( rule__Instrument__Alternatives ) )
            // InternalGuardin.g:143:3: ( rule__Instrument__Alternatives )
            {
             before(grammarAccess.getInstrumentAccess().getAlternatives()); 
            // InternalGuardin.g:144:3: ( rule__Instrument__Alternatives )
            // InternalGuardin.g:144:4: rule__Instrument__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instrument__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstrumentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstrument"


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


    // $ANTLR start "entryRuleBattery"
    // InternalGuardin.g:178:1: entryRuleBattery : ruleBattery EOF ;
    public final void entryRuleBattery() throws RecognitionException {
        try {
            // InternalGuardin.g:179:1: ( ruleBattery EOF )
            // InternalGuardin.g:180:1: ruleBattery EOF
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
    // InternalGuardin.g:187:1: ruleBattery : ( ( rule__Battery__Group__0 ) ) ;
    public final void ruleBattery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:191:2: ( ( ( rule__Battery__Group__0 ) ) )
            // InternalGuardin.g:192:2: ( ( rule__Battery__Group__0 ) )
            {
            // InternalGuardin.g:192:2: ( ( rule__Battery__Group__0 ) )
            // InternalGuardin.g:193:3: ( rule__Battery__Group__0 )
            {
             before(grammarAccess.getBatteryAccess().getGroup()); 
            // InternalGuardin.g:194:3: ( rule__Battery__Group__0 )
            // InternalGuardin.g:194:4: rule__Battery__Group__0
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


    // $ANTLR start "entryRuleSectionBatteryLayer"
    // InternalGuardin.g:203:1: entryRuleSectionBatteryLayer : ruleSectionBatteryLayer EOF ;
    public final void entryRuleSectionBatteryLayer() throws RecognitionException {
        try {
            // InternalGuardin.g:204:1: ( ruleSectionBatteryLayer EOF )
            // InternalGuardin.g:205:1: ruleSectionBatteryLayer EOF
            {
             before(grammarAccess.getSectionBatteryLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleSectionBatteryLayer();

            state._fsp--;

             after(grammarAccess.getSectionBatteryLayerRule()); 
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
    // $ANTLR end "entryRuleSectionBatteryLayer"


    // $ANTLR start "ruleSectionBatteryLayer"
    // InternalGuardin.g:212:1: ruleSectionBatteryLayer : ( ( rule__SectionBatteryLayer__Group__0 ) ) ;
    public final void ruleSectionBatteryLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:216:2: ( ( ( rule__SectionBatteryLayer__Group__0 ) ) )
            // InternalGuardin.g:217:2: ( ( rule__SectionBatteryLayer__Group__0 ) )
            {
            // InternalGuardin.g:217:2: ( ( rule__SectionBatteryLayer__Group__0 ) )
            // InternalGuardin.g:218:3: ( rule__SectionBatteryLayer__Group__0 )
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getGroup()); 
            // InternalGuardin.g:219:3: ( rule__SectionBatteryLayer__Group__0 )
            // InternalGuardin.g:219:4: rule__SectionBatteryLayer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SectionBatteryLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionBatteryLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSectionBatteryLayer"


    // $ANTLR start "entryRuleBatteryLayer"
    // InternalGuardin.g:228:1: entryRuleBatteryLayer : ruleBatteryLayer EOF ;
    public final void entryRuleBatteryLayer() throws RecognitionException {
        try {
            // InternalGuardin.g:229:1: ( ruleBatteryLayer EOF )
            // InternalGuardin.g:230:1: ruleBatteryLayer EOF
            {
             before(grammarAccess.getBatteryLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleBatteryLayer();

            state._fsp--;

             after(grammarAccess.getBatteryLayerRule()); 
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
    // $ANTLR end "entryRuleBatteryLayer"


    // $ANTLR start "ruleBatteryLayer"
    // InternalGuardin.g:237:1: ruleBatteryLayer : ( ( rule__BatteryLayer__Group__0 ) ) ;
    public final void ruleBatteryLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:241:2: ( ( ( rule__BatteryLayer__Group__0 ) ) )
            // InternalGuardin.g:242:2: ( ( rule__BatteryLayer__Group__0 ) )
            {
            // InternalGuardin.g:242:2: ( ( rule__BatteryLayer__Group__0 ) )
            // InternalGuardin.g:243:3: ( rule__BatteryLayer__Group__0 )
            {
             before(grammarAccess.getBatteryLayerAccess().getGroup()); 
            // InternalGuardin.g:244:3: ( rule__BatteryLayer__Group__0 )
            // InternalGuardin.g:244:4: rule__BatteryLayer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BatteryLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBatteryLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBatteryLayer"


    // $ANTLR start "entryRuleBatteryNote"
    // InternalGuardin.g:253:1: entryRuleBatteryNote : ruleBatteryNote EOF ;
    public final void entryRuleBatteryNote() throws RecognitionException {
        try {
            // InternalGuardin.g:254:1: ( ruleBatteryNote EOF )
            // InternalGuardin.g:255:1: ruleBatteryNote EOF
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
    // InternalGuardin.g:262:1: ruleBatteryNote : ( ( rule__BatteryNote__Group__0 ) ) ;
    public final void ruleBatteryNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:266:2: ( ( ( rule__BatteryNote__Group__0 ) ) )
            // InternalGuardin.g:267:2: ( ( rule__BatteryNote__Group__0 ) )
            {
            // InternalGuardin.g:267:2: ( ( rule__BatteryNote__Group__0 ) )
            // InternalGuardin.g:268:3: ( rule__BatteryNote__Group__0 )
            {
             before(grammarAccess.getBatteryNoteAccess().getGroup()); 
            // InternalGuardin.g:269:3: ( rule__BatteryNote__Group__0 )
            // InternalGuardin.g:269:4: rule__BatteryNote__Group__0
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


    // $ANTLR start "entryRuleCompositeBatteryNote"
    // InternalGuardin.g:278:1: entryRuleCompositeBatteryNote : ruleCompositeBatteryNote EOF ;
    public final void entryRuleCompositeBatteryNote() throws RecognitionException {
        try {
            // InternalGuardin.g:279:1: ( ruleCompositeBatteryNote EOF )
            // InternalGuardin.g:280:1: ruleCompositeBatteryNote EOF
            {
             before(grammarAccess.getCompositeBatteryNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeBatteryNote();

            state._fsp--;

             after(grammarAccess.getCompositeBatteryNoteRule()); 
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
    // $ANTLR end "entryRuleCompositeBatteryNote"


    // $ANTLR start "ruleCompositeBatteryNote"
    // InternalGuardin.g:287:1: ruleCompositeBatteryNote : ( ( rule__CompositeBatteryNote__Group__0 ) ) ;
    public final void ruleCompositeBatteryNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:291:2: ( ( ( rule__CompositeBatteryNote__Group__0 ) ) )
            // InternalGuardin.g:292:2: ( ( rule__CompositeBatteryNote__Group__0 ) )
            {
            // InternalGuardin.g:292:2: ( ( rule__CompositeBatteryNote__Group__0 ) )
            // InternalGuardin.g:293:3: ( rule__CompositeBatteryNote__Group__0 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getGroup()); 
            // InternalGuardin.g:294:3: ( rule__CompositeBatteryNote__Group__0 )
            // InternalGuardin.g:294:4: rule__CompositeBatteryNote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeBatteryNote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeBatteryNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeBatteryNote"


    // $ANTLR start "entryRulePiano"
    // InternalGuardin.g:303:1: entryRulePiano : rulePiano EOF ;
    public final void entryRulePiano() throws RecognitionException {
        try {
            // InternalGuardin.g:304:1: ( rulePiano EOF )
            // InternalGuardin.g:305:1: rulePiano EOF
            {
             before(grammarAccess.getPianoRule()); 
            pushFollow(FOLLOW_1);
            rulePiano();

            state._fsp--;

             after(grammarAccess.getPianoRule()); 
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
    // $ANTLR end "entryRulePiano"


    // $ANTLR start "rulePiano"
    // InternalGuardin.g:312:1: rulePiano : ( ( rule__Piano__Group__0 ) ) ;
    public final void rulePiano() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:316:2: ( ( ( rule__Piano__Group__0 ) ) )
            // InternalGuardin.g:317:2: ( ( rule__Piano__Group__0 ) )
            {
            // InternalGuardin.g:317:2: ( ( rule__Piano__Group__0 ) )
            // InternalGuardin.g:318:3: ( rule__Piano__Group__0 )
            {
             before(grammarAccess.getPianoAccess().getGroup()); 
            // InternalGuardin.g:319:3: ( rule__Piano__Group__0 )
            // InternalGuardin.g:319:4: rule__Piano__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Piano__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPianoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePiano"


    // $ANTLR start "entryRuleSectionPianoLayer"
    // InternalGuardin.g:328:1: entryRuleSectionPianoLayer : ruleSectionPianoLayer EOF ;
    public final void entryRuleSectionPianoLayer() throws RecognitionException {
        try {
            // InternalGuardin.g:329:1: ( ruleSectionPianoLayer EOF )
            // InternalGuardin.g:330:1: ruleSectionPianoLayer EOF
            {
             before(grammarAccess.getSectionPianoLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleSectionPianoLayer();

            state._fsp--;

             after(grammarAccess.getSectionPianoLayerRule()); 
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
    // $ANTLR end "entryRuleSectionPianoLayer"


    // $ANTLR start "ruleSectionPianoLayer"
    // InternalGuardin.g:337:1: ruleSectionPianoLayer : ( ( rule__SectionPianoLayer__Group__0 ) ) ;
    public final void ruleSectionPianoLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:341:2: ( ( ( rule__SectionPianoLayer__Group__0 ) ) )
            // InternalGuardin.g:342:2: ( ( rule__SectionPianoLayer__Group__0 ) )
            {
            // InternalGuardin.g:342:2: ( ( rule__SectionPianoLayer__Group__0 ) )
            // InternalGuardin.g:343:3: ( rule__SectionPianoLayer__Group__0 )
            {
             before(grammarAccess.getSectionPianoLayerAccess().getGroup()); 
            // InternalGuardin.g:344:3: ( rule__SectionPianoLayer__Group__0 )
            // InternalGuardin.g:344:4: rule__SectionPianoLayer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SectionPianoLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionPianoLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSectionPianoLayer"


    // $ANTLR start "entryRulePianoLayer"
    // InternalGuardin.g:353:1: entryRulePianoLayer : rulePianoLayer EOF ;
    public final void entryRulePianoLayer() throws RecognitionException {
        try {
            // InternalGuardin.g:354:1: ( rulePianoLayer EOF )
            // InternalGuardin.g:355:1: rulePianoLayer EOF
            {
             before(grammarAccess.getPianoLayerRule()); 
            pushFollow(FOLLOW_1);
            rulePianoLayer();

            state._fsp--;

             after(grammarAccess.getPianoLayerRule()); 
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
    // $ANTLR end "entryRulePianoLayer"


    // $ANTLR start "rulePianoLayer"
    // InternalGuardin.g:362:1: rulePianoLayer : ( ( rule__PianoLayer__Group__0 ) ) ;
    public final void rulePianoLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:366:2: ( ( ( rule__PianoLayer__Group__0 ) ) )
            // InternalGuardin.g:367:2: ( ( rule__PianoLayer__Group__0 ) )
            {
            // InternalGuardin.g:367:2: ( ( rule__PianoLayer__Group__0 ) )
            // InternalGuardin.g:368:3: ( rule__PianoLayer__Group__0 )
            {
             before(grammarAccess.getPianoLayerAccess().getGroup()); 
            // InternalGuardin.g:369:3: ( rule__PianoLayer__Group__0 )
            // InternalGuardin.g:369:4: rule__PianoLayer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PianoLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPianoLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePianoLayer"


    // $ANTLR start "entryRulePianoNote"
    // InternalGuardin.g:378:1: entryRulePianoNote : rulePianoNote EOF ;
    public final void entryRulePianoNote() throws RecognitionException {
        try {
            // InternalGuardin.g:379:1: ( rulePianoNote EOF )
            // InternalGuardin.g:380:1: rulePianoNote EOF
            {
             before(grammarAccess.getPianoNoteRule()); 
            pushFollow(FOLLOW_1);
            rulePianoNote();

            state._fsp--;

             after(grammarAccess.getPianoNoteRule()); 
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
    // $ANTLR end "entryRulePianoNote"


    // $ANTLR start "rulePianoNote"
    // InternalGuardin.g:387:1: rulePianoNote : ( ( rule__PianoNote__Group__0 ) ) ;
    public final void rulePianoNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:391:2: ( ( ( rule__PianoNote__Group__0 ) ) )
            // InternalGuardin.g:392:2: ( ( rule__PianoNote__Group__0 ) )
            {
            // InternalGuardin.g:392:2: ( ( rule__PianoNote__Group__0 ) )
            // InternalGuardin.g:393:3: ( rule__PianoNote__Group__0 )
            {
             before(grammarAccess.getPianoNoteAccess().getGroup()); 
            // InternalGuardin.g:394:3: ( rule__PianoNote__Group__0 )
            // InternalGuardin.g:394:4: rule__PianoNote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PianoNote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPianoNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePianoNote"


    // $ANTLR start "entryRuleCompositePianoNote"
    // InternalGuardin.g:403:1: entryRuleCompositePianoNote : ruleCompositePianoNote EOF ;
    public final void entryRuleCompositePianoNote() throws RecognitionException {
        try {
            // InternalGuardin.g:404:1: ( ruleCompositePianoNote EOF )
            // InternalGuardin.g:405:1: ruleCompositePianoNote EOF
            {
             before(grammarAccess.getCompositePianoNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositePianoNote();

            state._fsp--;

             after(grammarAccess.getCompositePianoNoteRule()); 
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
    // $ANTLR end "entryRuleCompositePianoNote"


    // $ANTLR start "ruleCompositePianoNote"
    // InternalGuardin.g:412:1: ruleCompositePianoNote : ( ( rule__CompositePianoNote__Group__0 ) ) ;
    public final void ruleCompositePianoNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:416:2: ( ( ( rule__CompositePianoNote__Group__0 ) ) )
            // InternalGuardin.g:417:2: ( ( rule__CompositePianoNote__Group__0 ) )
            {
            // InternalGuardin.g:417:2: ( ( rule__CompositePianoNote__Group__0 ) )
            // InternalGuardin.g:418:3: ( rule__CompositePianoNote__Group__0 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getGroup()); 
            // InternalGuardin.g:419:3: ( rule__CompositePianoNote__Group__0 )
            // InternalGuardin.g:419:4: rule__CompositePianoNote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositePianoNote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositePianoNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositePianoNote"


    // $ANTLR start "entryRuleEInt"
    // InternalGuardin.g:428:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalGuardin.g:429:1: ( ruleEInt EOF )
            // InternalGuardin.g:430:1: ruleEInt EOF
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
    // InternalGuardin.g:437:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:441:2: ( ( RULE_INT ) )
            // InternalGuardin.g:442:2: ( RULE_INT )
            {
            // InternalGuardin.g:442:2: ( RULE_INT )
            // InternalGuardin.g:443:3: RULE_INT
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


    // $ANTLR start "entryRuleERelativeInt"
    // InternalGuardin.g:453:1: entryRuleERelativeInt : ruleERelativeInt EOF ;
    public final void entryRuleERelativeInt() throws RecognitionException {
        try {
            // InternalGuardin.g:454:1: ( ruleERelativeInt EOF )
            // InternalGuardin.g:455:1: ruleERelativeInt EOF
            {
             before(grammarAccess.getERelativeIntRule()); 
            pushFollow(FOLLOW_1);
            ruleERelativeInt();

            state._fsp--;

             after(grammarAccess.getERelativeIntRule()); 
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
    // $ANTLR end "entryRuleERelativeInt"


    // $ANTLR start "ruleERelativeInt"
    // InternalGuardin.g:462:1: ruleERelativeInt : ( ( rule__ERelativeInt__Group__0 ) ) ;
    public final void ruleERelativeInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:466:2: ( ( ( rule__ERelativeInt__Group__0 ) ) )
            // InternalGuardin.g:467:2: ( ( rule__ERelativeInt__Group__0 ) )
            {
            // InternalGuardin.g:467:2: ( ( rule__ERelativeInt__Group__0 ) )
            // InternalGuardin.g:468:3: ( rule__ERelativeInt__Group__0 )
            {
             before(grammarAccess.getERelativeIntAccess().getGroup()); 
            // InternalGuardin.g:469:3: ( rule__ERelativeInt__Group__0 )
            // InternalGuardin.g:469:4: rule__ERelativeInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ERelativeInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getERelativeIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleERelativeInt"


    // $ANTLR start "entryRuleEString"
    // InternalGuardin.g:478:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGuardin.g:479:1: ( ruleEString EOF )
            // InternalGuardin.g:480:1: ruleEString EOF
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
    // InternalGuardin.g:487:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:491:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalGuardin.g:492:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalGuardin.g:492:2: ( ( rule__EString__Alternatives ) )
            // InternalGuardin.g:493:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalGuardin.g:494:3: ( rule__EString__Alternatives )
            // InternalGuardin.g:494:4: rule__EString__Alternatives
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
    // InternalGuardin.g:503:1: ruleBatteryNoteType : ( ( rule__BatteryNoteType__Alternatives ) ) ;
    public final void ruleBatteryNoteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:507:1: ( ( ( rule__BatteryNoteType__Alternatives ) ) )
            // InternalGuardin.g:508:2: ( ( rule__BatteryNoteType__Alternatives ) )
            {
            // InternalGuardin.g:508:2: ( ( rule__BatteryNoteType__Alternatives ) )
            // InternalGuardin.g:509:3: ( rule__BatteryNoteType__Alternatives )
            {
             before(grammarAccess.getBatteryNoteTypeAccess().getAlternatives()); 
            // InternalGuardin.g:510:3: ( rule__BatteryNoteType__Alternatives )
            // InternalGuardin.g:510:4: rule__BatteryNoteType__Alternatives
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


    // $ANTLR start "ruleInstruments"
    // InternalGuardin.g:519:1: ruleInstruments : ( ( rule__Instruments__Alternatives ) ) ;
    public final void ruleInstruments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:523:1: ( ( ( rule__Instruments__Alternatives ) ) )
            // InternalGuardin.g:524:2: ( ( rule__Instruments__Alternatives ) )
            {
            // InternalGuardin.g:524:2: ( ( rule__Instruments__Alternatives ) )
            // InternalGuardin.g:525:3: ( rule__Instruments__Alternatives )
            {
             before(grammarAccess.getInstrumentsAccess().getAlternatives()); 
            // InternalGuardin.g:526:3: ( rule__Instruments__Alternatives )
            // InternalGuardin.g:526:4: rule__Instruments__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruments__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstrumentsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruments"


    // $ANTLR start "rulePianoNoteType"
    // InternalGuardin.g:535:1: rulePianoNoteType : ( ( rule__PianoNoteType__Alternatives ) ) ;
    public final void rulePianoNoteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:539:1: ( ( ( rule__PianoNoteType__Alternatives ) ) )
            // InternalGuardin.g:540:2: ( ( rule__PianoNoteType__Alternatives ) )
            {
            // InternalGuardin.g:540:2: ( ( rule__PianoNoteType__Alternatives ) )
            // InternalGuardin.g:541:3: ( rule__PianoNoteType__Alternatives )
            {
             before(grammarAccess.getPianoNoteTypeAccess().getAlternatives()); 
            // InternalGuardin.g:542:3: ( rule__PianoNoteType__Alternatives )
            // InternalGuardin.g:542:4: rule__PianoNoteType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PianoNoteType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPianoNoteTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePianoNoteType"


    // $ANTLR start "rule__Instrument__Alternatives"
    // InternalGuardin.g:550:1: rule__Instrument__Alternatives : ( ( ruleBattery ) | ( rulePiano ) );
    public final void rule__Instrument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:554:1: ( ( ruleBattery ) | ( rulePiano ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==46) ) {
                alt1=1;
            }
            else if ( (LA1_0==12||(LA1_0>=19 && LA1_0<=28)||LA1_0==53) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGuardin.g:555:2: ( ruleBattery )
                    {
                    // InternalGuardin.g:555:2: ( ruleBattery )
                    // InternalGuardin.g:556:3: ruleBattery
                    {
                     before(grammarAccess.getInstrumentAccess().getBatteryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBattery();

                    state._fsp--;

                     after(grammarAccess.getInstrumentAccess().getBatteryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:561:2: ( rulePiano )
                    {
                    // InternalGuardin.g:561:2: ( rulePiano )
                    // InternalGuardin.g:562:3: rulePiano
                    {
                     before(grammarAccess.getInstrumentAccess().getPianoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePiano();

                    state._fsp--;

                     after(grammarAccess.getInstrumentAccess().getPianoParserRuleCall_1()); 

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
    // $ANTLR end "rule__Instrument__Alternatives"


    // $ANTLR start "rule__Battery__Alternatives_2"
    // InternalGuardin.g:571:1: rule__Battery__Alternatives_2 : ( ( ':' ) | ( ( rule__Battery__Group_2_1__0 ) ) );
    public final void rule__Battery__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:575:1: ( ( ':' ) | ( ( rule__Battery__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGuardin.g:576:2: ( ':' )
                    {
                    // InternalGuardin.g:576:2: ( ':' )
                    // InternalGuardin.g:577:3: ':'
                    {
                     before(grammarAccess.getBatteryAccess().getColonKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBatteryAccess().getColonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:582:2: ( ( rule__Battery__Group_2_1__0 ) )
                    {
                    // InternalGuardin.g:582:2: ( ( rule__Battery__Group_2_1__0 ) )
                    // InternalGuardin.g:583:3: ( rule__Battery__Group_2_1__0 )
                    {
                     before(grammarAccess.getBatteryAccess().getGroup_2_1()); 
                    // InternalGuardin.g:584:3: ( rule__Battery__Group_2_1__0 )
                    // InternalGuardin.g:584:4: rule__Battery__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Battery__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBatteryAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Battery__Alternatives_2"


    // $ANTLR start "rule__Battery__Alternatives_3"
    // InternalGuardin.g:592:1: rule__Battery__Alternatives_3 : ( ( ( rule__Battery__SectionsAssignment_3_0 ) ) | ( ( rule__Battery__LayersAssignment_3_1 ) ) );
    public final void rule__Battery__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:596:1: ( ( ( rule__Battery__SectionsAssignment_3_0 ) ) | ( ( rule__Battery__LayersAssignment_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==47) ) {
                alt3=1;
            }
            else if ( (LA3_0==49) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuardin.g:597:2: ( ( rule__Battery__SectionsAssignment_3_0 ) )
                    {
                    // InternalGuardin.g:597:2: ( ( rule__Battery__SectionsAssignment_3_0 ) )
                    // InternalGuardin.g:598:3: ( rule__Battery__SectionsAssignment_3_0 )
                    {
                     before(grammarAccess.getBatteryAccess().getSectionsAssignment_3_0()); 
                    // InternalGuardin.g:599:3: ( rule__Battery__SectionsAssignment_3_0 )
                    // InternalGuardin.g:599:4: rule__Battery__SectionsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Battery__SectionsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBatteryAccess().getSectionsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:603:2: ( ( rule__Battery__LayersAssignment_3_1 ) )
                    {
                    // InternalGuardin.g:603:2: ( ( rule__Battery__LayersAssignment_3_1 ) )
                    // InternalGuardin.g:604:3: ( rule__Battery__LayersAssignment_3_1 )
                    {
                     before(grammarAccess.getBatteryAccess().getLayersAssignment_3_1()); 
                    // InternalGuardin.g:605:3: ( rule__Battery__LayersAssignment_3_1 )
                    // InternalGuardin.g:605:4: rule__Battery__LayersAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Battery__LayersAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBatteryAccess().getLayersAssignment_3_1()); 

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
    // $ANTLR end "rule__Battery__Alternatives_3"


    // $ANTLR start "rule__BatteryLayer__NotesAlternatives_2_0"
    // InternalGuardin.g:613:1: rule__BatteryLayer__NotesAlternatives_2_0 : ( ( ruleBatteryNote ) | ( ruleEmptyNote ) | ( ruleCompositeBatteryNote ) );
    public final void rule__BatteryLayer__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:617:1: ( ( ruleBatteryNote ) | ( ruleEmptyNote ) | ( ruleCompositeBatteryNote ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt4=1;
                }
                break;
            case 45:
                {
                alt4=2;
                }
                break;
            case 50:
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
                    // InternalGuardin.g:618:2: ( ruleBatteryNote )
                    {
                    // InternalGuardin.g:618:2: ( ruleBatteryNote )
                    // InternalGuardin.g:619:3: ruleBatteryNote
                    {
                     before(grammarAccess.getBatteryLayerAccess().getNotesBatteryNoteParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBatteryNote();

                    state._fsp--;

                     after(grammarAccess.getBatteryLayerAccess().getNotesBatteryNoteParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:624:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:624:2: ( ruleEmptyNote )
                    // InternalGuardin.g:625:3: ruleEmptyNote
                    {
                     before(grammarAccess.getBatteryLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptyNote();

                    state._fsp--;

                     after(grammarAccess.getBatteryLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:630:2: ( ruleCompositeBatteryNote )
                    {
                    // InternalGuardin.g:630:2: ( ruleCompositeBatteryNote )
                    // InternalGuardin.g:631:3: ruleCompositeBatteryNote
                    {
                     before(grammarAccess.getBatteryLayerAccess().getNotesCompositeBatteryNoteParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeBatteryNote();

                    state._fsp--;

                     after(grammarAccess.getBatteryLayerAccess().getNotesCompositeBatteryNoteParserRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__BatteryLayer__NotesAlternatives_2_0"


    // $ANTLR start "rule__CompositeBatteryNote__NotesAlternatives_2_0"
    // InternalGuardin.g:640:1: rule__CompositeBatteryNote__NotesAlternatives_2_0 : ( ( ruleBatteryNote ) | ( ruleEmptyNote ) );
    public final void rule__CompositeBatteryNote__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:644:1: ( ( ruleBatteryNote ) | ( ruleEmptyNote ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=13 && LA5_0<=18)) ) {
                alt5=1;
            }
            else if ( (LA5_0==45) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGuardin.g:645:2: ( ruleBatteryNote )
                    {
                    // InternalGuardin.g:645:2: ( ruleBatteryNote )
                    // InternalGuardin.g:646:3: ruleBatteryNote
                    {
                     before(grammarAccess.getCompositeBatteryNoteAccess().getNotesBatteryNoteParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBatteryNote();

                    state._fsp--;

                     after(grammarAccess.getCompositeBatteryNoteAccess().getNotesBatteryNoteParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:651:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:651:2: ( ruleEmptyNote )
                    // InternalGuardin.g:652:3: ruleEmptyNote
                    {
                     before(grammarAccess.getCompositeBatteryNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptyNote();

                    state._fsp--;

                     after(grammarAccess.getCompositeBatteryNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__CompositeBatteryNote__NotesAlternatives_2_0"


    // $ANTLR start "rule__Piano__Alternatives_1"
    // InternalGuardin.g:661:1: rule__Piano__Alternatives_1 : ( ( 'piano' ) | ( ( rule__Piano__InstrumentAssignment_1_1 ) ) | ( ( rule__Piano__Group_1_2__0 ) ) );
    public final void rule__Piano__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:665:1: ( ( 'piano' ) | ( ( rule__Piano__InstrumentAssignment_1_1 ) ) | ( ( rule__Piano__Group_1_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                {
                alt6=2;
                }
                break;
            case 53:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGuardin.g:666:2: ( 'piano' )
                    {
                    // InternalGuardin.g:666:2: ( 'piano' )
                    // InternalGuardin.g:667:3: 'piano'
                    {
                     before(grammarAccess.getPianoAccess().getPianoKeyword_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPianoAccess().getPianoKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:672:2: ( ( rule__Piano__InstrumentAssignment_1_1 ) )
                    {
                    // InternalGuardin.g:672:2: ( ( rule__Piano__InstrumentAssignment_1_1 ) )
                    // InternalGuardin.g:673:3: ( rule__Piano__InstrumentAssignment_1_1 )
                    {
                     before(grammarAccess.getPianoAccess().getInstrumentAssignment_1_1()); 
                    // InternalGuardin.g:674:3: ( rule__Piano__InstrumentAssignment_1_1 )
                    // InternalGuardin.g:674:4: rule__Piano__InstrumentAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Piano__InstrumentAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPianoAccess().getInstrumentAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:678:2: ( ( rule__Piano__Group_1_2__0 ) )
                    {
                    // InternalGuardin.g:678:2: ( ( rule__Piano__Group_1_2__0 ) )
                    // InternalGuardin.g:679:3: ( rule__Piano__Group_1_2__0 )
                    {
                     before(grammarAccess.getPianoAccess().getGroup_1_2()); 
                    // InternalGuardin.g:680:3: ( rule__Piano__Group_1_2__0 )
                    // InternalGuardin.g:680:4: rule__Piano__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Piano__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPianoAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Piano__Alternatives_1"


    // $ANTLR start "rule__Piano__Alternatives_2"
    // InternalGuardin.g:688:1: rule__Piano__Alternatives_2 : ( ( ':' ) | ( ( rule__Piano__Group_2_1__0 ) ) );
    public final void rule__Piano__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:692:1: ( ( ':' ) | ( ( rule__Piano__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGuardin.g:693:2: ( ':' )
                    {
                    // InternalGuardin.g:693:2: ( ':' )
                    // InternalGuardin.g:694:3: ':'
                    {
                     before(grammarAccess.getPianoAccess().getColonKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPianoAccess().getColonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:699:2: ( ( rule__Piano__Group_2_1__0 ) )
                    {
                    // InternalGuardin.g:699:2: ( ( rule__Piano__Group_2_1__0 ) )
                    // InternalGuardin.g:700:3: ( rule__Piano__Group_2_1__0 )
                    {
                     before(grammarAccess.getPianoAccess().getGroup_2_1()); 
                    // InternalGuardin.g:701:3: ( rule__Piano__Group_2_1__0 )
                    // InternalGuardin.g:701:4: rule__Piano__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Piano__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPianoAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Piano__Alternatives_2"


    // $ANTLR start "rule__Piano__Alternatives_3"
    // InternalGuardin.g:709:1: rule__Piano__Alternatives_3 : ( ( ( rule__Piano__SectionsAssignment_3_0 ) ) | ( ( rule__Piano__LayersAssignment_3_1 ) ) );
    public final void rule__Piano__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:713:1: ( ( ( rule__Piano__SectionsAssignment_3_0 ) ) | ( ( rule__Piano__LayersAssignment_3_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==47) ) {
                alt8=1;
            }
            else if ( (LA8_0==49) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGuardin.g:714:2: ( ( rule__Piano__SectionsAssignment_3_0 ) )
                    {
                    // InternalGuardin.g:714:2: ( ( rule__Piano__SectionsAssignment_3_0 ) )
                    // InternalGuardin.g:715:3: ( rule__Piano__SectionsAssignment_3_0 )
                    {
                     before(grammarAccess.getPianoAccess().getSectionsAssignment_3_0()); 
                    // InternalGuardin.g:716:3: ( rule__Piano__SectionsAssignment_3_0 )
                    // InternalGuardin.g:716:4: rule__Piano__SectionsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Piano__SectionsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPianoAccess().getSectionsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:720:2: ( ( rule__Piano__LayersAssignment_3_1 ) )
                    {
                    // InternalGuardin.g:720:2: ( ( rule__Piano__LayersAssignment_3_1 ) )
                    // InternalGuardin.g:721:3: ( rule__Piano__LayersAssignment_3_1 )
                    {
                     before(grammarAccess.getPianoAccess().getLayersAssignment_3_1()); 
                    // InternalGuardin.g:722:3: ( rule__Piano__LayersAssignment_3_1 )
                    // InternalGuardin.g:722:4: rule__Piano__LayersAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Piano__LayersAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPianoAccess().getLayersAssignment_3_1()); 

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
    // $ANTLR end "rule__Piano__Alternatives_3"


    // $ANTLR start "rule__PianoLayer__NotesAlternatives_2_0"
    // InternalGuardin.g:730:1: rule__PianoLayer__NotesAlternatives_2_0 : ( ( rulePianoNote ) | ( ruleEmptyNote ) | ( ruleCompositePianoNote ) );
    public final void rule__PianoLayer__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:734:1: ( ( rulePianoNote ) | ( ruleEmptyNote ) | ( ruleCompositePianoNote ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt9=1;
                }
                break;
            case 45:
                {
                alt9=2;
                }
                break;
            case 50:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGuardin.g:735:2: ( rulePianoNote )
                    {
                    // InternalGuardin.g:735:2: ( rulePianoNote )
                    // InternalGuardin.g:736:3: rulePianoNote
                    {
                     before(grammarAccess.getPianoLayerAccess().getNotesPianoNoteParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePianoNote();

                    state._fsp--;

                     after(grammarAccess.getPianoLayerAccess().getNotesPianoNoteParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:741:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:741:2: ( ruleEmptyNote )
                    // InternalGuardin.g:742:3: ruleEmptyNote
                    {
                     before(grammarAccess.getPianoLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptyNote();

                    state._fsp--;

                     after(grammarAccess.getPianoLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:747:2: ( ruleCompositePianoNote )
                    {
                    // InternalGuardin.g:747:2: ( ruleCompositePianoNote )
                    // InternalGuardin.g:748:3: ruleCompositePianoNote
                    {
                     before(grammarAccess.getPianoLayerAccess().getNotesCompositePianoNoteParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositePianoNote();

                    state._fsp--;

                     after(grammarAccess.getPianoLayerAccess().getNotesCompositePianoNoteParserRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__PianoLayer__NotesAlternatives_2_0"


    // $ANTLR start "rule__PianoNote__Alternatives_2"
    // InternalGuardin.g:757:1: rule__PianoNote__Alternatives_2 : ( ( ( rule__PianoNote__Group_2_0__0 ) ) | ( ( rule__PianoNote__Group_2_1__0 ) ) );
    public final void rule__PianoNote__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:761:1: ( ( ( rule__PianoNote__Group_2_0__0 ) ) | ( ( rule__PianoNote__Group_2_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==54) ) {
                alt10=1;
            }
            else if ( (LA10_0==55) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGuardin.g:762:2: ( ( rule__PianoNote__Group_2_0__0 ) )
                    {
                    // InternalGuardin.g:762:2: ( ( rule__PianoNote__Group_2_0__0 ) )
                    // InternalGuardin.g:763:3: ( rule__PianoNote__Group_2_0__0 )
                    {
                     before(grammarAccess.getPianoNoteAccess().getGroup_2_0()); 
                    // InternalGuardin.g:764:3: ( rule__PianoNote__Group_2_0__0 )
                    // InternalGuardin.g:764:4: rule__PianoNote__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PianoNote__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPianoNoteAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:768:2: ( ( rule__PianoNote__Group_2_1__0 ) )
                    {
                    // InternalGuardin.g:768:2: ( ( rule__PianoNote__Group_2_1__0 ) )
                    // InternalGuardin.g:769:3: ( rule__PianoNote__Group_2_1__0 )
                    {
                     before(grammarAccess.getPianoNoteAccess().getGroup_2_1()); 
                    // InternalGuardin.g:770:3: ( rule__PianoNote__Group_2_1__0 )
                    // InternalGuardin.g:770:4: rule__PianoNote__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PianoNote__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPianoNoteAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__PianoNote__Alternatives_2"


    // $ANTLR start "rule__CompositePianoNote__NotesAlternatives_2_0"
    // InternalGuardin.g:778:1: rule__CompositePianoNote__NotesAlternatives_2_0 : ( ( rulePianoNote ) | ( ruleEmptyNote ) );
    public final void rule__CompositePianoNote__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:782:1: ( ( rulePianoNote ) | ( ruleEmptyNote ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=29 && LA11_0<=35)) ) {
                alt11=1;
            }
            else if ( (LA11_0==45) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGuardin.g:783:2: ( rulePianoNote )
                    {
                    // InternalGuardin.g:783:2: ( rulePianoNote )
                    // InternalGuardin.g:784:3: rulePianoNote
                    {
                     before(grammarAccess.getCompositePianoNoteAccess().getNotesPianoNoteParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePianoNote();

                    state._fsp--;

                     after(grammarAccess.getCompositePianoNoteAccess().getNotesPianoNoteParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:789:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:789:2: ( ruleEmptyNote )
                    // InternalGuardin.g:790:3: ruleEmptyNote
                    {
                     before(grammarAccess.getCompositePianoNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptyNote();

                    state._fsp--;

                     after(grammarAccess.getCompositePianoNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__CompositePianoNote__NotesAlternatives_2_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalGuardin.g:799:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:803:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGuardin.g:804:2: ( RULE_STRING )
                    {
                    // InternalGuardin.g:804:2: ( RULE_STRING )
                    // InternalGuardin.g:805:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:810:2: ( RULE_ID )
                    {
                    // InternalGuardin.g:810:2: ( RULE_ID )
                    // InternalGuardin.g:811:3: RULE_ID
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
    // InternalGuardin.g:820:1: rule__BatteryNoteType__Alternatives : ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) );
    public final void rule__BatteryNoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:824:1: ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt13=1;
                }
                break;
            case 14:
                {
                alt13=2;
                }
                break;
            case 15:
                {
                alt13=3;
                }
                break;
            case 16:
                {
                alt13=4;
                }
                break;
            case 17:
                {
                alt13=5;
                }
                break;
            case 18:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalGuardin.g:825:2: ( ( 'bd' ) )
                    {
                    // InternalGuardin.g:825:2: ( ( 'bd' ) )
                    // InternalGuardin.g:826:3: ( 'bd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:827:3: ( 'bd' )
                    // InternalGuardin.g:827:4: 'bd'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:831:2: ( ( 'ch' ) )
                    {
                    // InternalGuardin.g:831:2: ( ( 'ch' ) )
                    // InternalGuardin.g:832:3: ( 'ch' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:833:3: ( 'ch' )
                    // InternalGuardin.g:833:4: 'ch'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:837:2: ( ( 'cc' ) )
                    {
                    // InternalGuardin.g:837:2: ( ( 'cc' ) )
                    // InternalGuardin.g:838:3: ( 'cc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:839:3: ( 'cc' )
                    // InternalGuardin.g:839:4: 'cc'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:843:2: ( ( 'oh' ) )
                    {
                    // InternalGuardin.g:843:2: ( ( 'oh' ) )
                    // InternalGuardin.g:844:3: ( 'oh' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:845:3: ( 'oh' )
                    // InternalGuardin.g:845:4: 'oh'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:849:2: ( ( 'rc' ) )
                    {
                    // InternalGuardin.g:849:2: ( ( 'rc' ) )
                    // InternalGuardin.g:850:3: ( 'rc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:851:3: ( 'rc' )
                    // InternalGuardin.g:851:4: 'rc'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:855:2: ( ( 'sd' ) )
                    {
                    // InternalGuardin.g:855:2: ( ( 'sd' ) )
                    // InternalGuardin.g:856:3: ( 'sd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getSNARE_DRUMEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:857:3: ( 'sd' )
                    // InternalGuardin.g:857:4: 'sd'
                    {
                    match(input,18,FOLLOW_2); 

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


    // $ANTLR start "rule__Instruments__Alternatives"
    // InternalGuardin.g:865:1: rule__Instruments__Alternatives : ( ( ( 'ACOUSTIC_BASS' ) ) | ( ( 'CHURCH_ORGAN' ) ) | ( ( 'CLAVINET' ) ) | ( ( 'GUITAR' ) ) | ( ( 'HARPSICHORD' ) ) | ( ( 'MUSIC_BOX' ) ) | ( ( 'OCARINA' ) ) | ( ( 'PIANO' ) ) | ( ( 'SYNTH_BASS_1' ) ) | ( ( 'VIOLIN' ) ) );
    public final void rule__Instruments__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:869:1: ( ( ( 'ACOUSTIC_BASS' ) ) | ( ( 'CHURCH_ORGAN' ) ) | ( ( 'CLAVINET' ) ) | ( ( 'GUITAR' ) ) | ( ( 'HARPSICHORD' ) ) | ( ( 'MUSIC_BOX' ) ) | ( ( 'OCARINA' ) ) | ( ( 'PIANO' ) ) | ( ( 'SYNTH_BASS_1' ) ) | ( ( 'VIOLIN' ) ) )
            int alt14=10;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 21:
                {
                alt14=3;
                }
                break;
            case 22:
                {
                alt14=4;
                }
                break;
            case 23:
                {
                alt14=5;
                }
                break;
            case 24:
                {
                alt14=6;
                }
                break;
            case 25:
                {
                alt14=7;
                }
                break;
            case 26:
                {
                alt14=8;
                }
                break;
            case 27:
                {
                alt14=9;
                }
                break;
            case 28:
                {
                alt14=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalGuardin.g:870:2: ( ( 'ACOUSTIC_BASS' ) )
                    {
                    // InternalGuardin.g:870:2: ( ( 'ACOUSTIC_BASS' ) )
                    // InternalGuardin.g:871:3: ( 'ACOUSTIC_BASS' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getACOUSTIC_BASSEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:872:3: ( 'ACOUSTIC_BASS' )
                    // InternalGuardin.g:872:4: 'ACOUSTIC_BASS'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getACOUSTIC_BASSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:876:2: ( ( 'CHURCH_ORGAN' ) )
                    {
                    // InternalGuardin.g:876:2: ( ( 'CHURCH_ORGAN' ) )
                    // InternalGuardin.g:877:3: ( 'CHURCH_ORGAN' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getCHURCH_ORGANEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:878:3: ( 'CHURCH_ORGAN' )
                    // InternalGuardin.g:878:4: 'CHURCH_ORGAN'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getCHURCH_ORGANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:882:2: ( ( 'CLAVINET' ) )
                    {
                    // InternalGuardin.g:882:2: ( ( 'CLAVINET' ) )
                    // InternalGuardin.g:883:3: ( 'CLAVINET' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getCLAVINETEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:884:3: ( 'CLAVINET' )
                    // InternalGuardin.g:884:4: 'CLAVINET'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getCLAVINETEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:888:2: ( ( 'GUITAR' ) )
                    {
                    // InternalGuardin.g:888:2: ( ( 'GUITAR' ) )
                    // InternalGuardin.g:889:3: ( 'GUITAR' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getGUITAREnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:890:3: ( 'GUITAR' )
                    // InternalGuardin.g:890:4: 'GUITAR'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getGUITAREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:894:2: ( ( 'HARPSICHORD' ) )
                    {
                    // InternalGuardin.g:894:2: ( ( 'HARPSICHORD' ) )
                    // InternalGuardin.g:895:3: ( 'HARPSICHORD' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getHARPSICHORDEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:896:3: ( 'HARPSICHORD' )
                    // InternalGuardin.g:896:4: 'HARPSICHORD'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getHARPSICHORDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:900:2: ( ( 'MUSIC_BOX' ) )
                    {
                    // InternalGuardin.g:900:2: ( ( 'MUSIC_BOX' ) )
                    // InternalGuardin.g:901:3: ( 'MUSIC_BOX' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getMUSIC_BOXEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:902:3: ( 'MUSIC_BOX' )
                    // InternalGuardin.g:902:4: 'MUSIC_BOX'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getMUSIC_BOXEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:906:2: ( ( 'OCARINA' ) )
                    {
                    // InternalGuardin.g:906:2: ( ( 'OCARINA' ) )
                    // InternalGuardin.g:907:3: ( 'OCARINA' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getOCARINAEnumLiteralDeclaration_6()); 
                    // InternalGuardin.g:908:3: ( 'OCARINA' )
                    // InternalGuardin.g:908:4: 'OCARINA'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getOCARINAEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGuardin.g:912:2: ( ( 'PIANO' ) )
                    {
                    // InternalGuardin.g:912:2: ( ( 'PIANO' ) )
                    // InternalGuardin.g:913:3: ( 'PIANO' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getPIANOEnumLiteralDeclaration_7()); 
                    // InternalGuardin.g:914:3: ( 'PIANO' )
                    // InternalGuardin.g:914:4: 'PIANO'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getPIANOEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGuardin.g:918:2: ( ( 'SYNTH_BASS_1' ) )
                    {
                    // InternalGuardin.g:918:2: ( ( 'SYNTH_BASS_1' ) )
                    // InternalGuardin.g:919:3: ( 'SYNTH_BASS_1' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getSYNTH_BASS_1EnumLiteralDeclaration_8()); 
                    // InternalGuardin.g:920:3: ( 'SYNTH_BASS_1' )
                    // InternalGuardin.g:920:4: 'SYNTH_BASS_1'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getSYNTH_BASS_1EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGuardin.g:924:2: ( ( 'VIOLIN' ) )
                    {
                    // InternalGuardin.g:924:2: ( ( 'VIOLIN' ) )
                    // InternalGuardin.g:925:3: ( 'VIOLIN' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getVIOLINEnumLiteralDeclaration_9()); 
                    // InternalGuardin.g:926:3: ( 'VIOLIN' )
                    // InternalGuardin.g:926:4: 'VIOLIN'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getVIOLINEnumLiteralDeclaration_9()); 

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
    // $ANTLR end "rule__Instruments__Alternatives"


    // $ANTLR start "rule__PianoNoteType__Alternatives"
    // InternalGuardin.g:934:1: rule__PianoNoteType__Alternatives : ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) );
    public final void rule__PianoNoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:938:1: ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            case 33:
                {
                alt15=5;
                }
                break;
            case 34:
                {
                alt15=6;
                }
                break;
            case 35:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalGuardin.g:939:2: ( ( 'A' ) )
                    {
                    // InternalGuardin.g:939:2: ( ( 'A' ) )
                    // InternalGuardin.g:940:3: ( 'A' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:941:3: ( 'A' )
                    // InternalGuardin.g:941:4: 'A'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:945:2: ( ( 'B' ) )
                    {
                    // InternalGuardin.g:945:2: ( ( 'B' ) )
                    // InternalGuardin.g:946:3: ( 'B' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:947:3: ( 'B' )
                    // InternalGuardin.g:947:4: 'B'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:951:2: ( ( 'C' ) )
                    {
                    // InternalGuardin.g:951:2: ( ( 'C' ) )
                    // InternalGuardin.g:952:3: ( 'C' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:953:3: ( 'C' )
                    // InternalGuardin.g:953:4: 'C'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:957:2: ( ( 'D' ) )
                    {
                    // InternalGuardin.g:957:2: ( ( 'D' ) )
                    // InternalGuardin.g:958:3: ( 'D' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:959:3: ( 'D' )
                    // InternalGuardin.g:959:4: 'D'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:963:2: ( ( 'E' ) )
                    {
                    // InternalGuardin.g:963:2: ( ( 'E' ) )
                    // InternalGuardin.g:964:3: ( 'E' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:965:3: ( 'E' )
                    // InternalGuardin.g:965:4: 'E'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:969:2: ( ( 'F' ) )
                    {
                    // InternalGuardin.g:969:2: ( ( 'F' ) )
                    // InternalGuardin.g:970:3: ( 'F' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:971:3: ( 'F' )
                    // InternalGuardin.g:971:4: 'F'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:975:2: ( ( 'G' ) )
                    {
                    // InternalGuardin.g:975:2: ( ( 'G' ) )
                    // InternalGuardin.g:976:3: ( 'G' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getGEnumLiteralDeclaration_6()); 
                    // InternalGuardin.g:977:3: ( 'G' )
                    // InternalGuardin.g:977:4: 'G'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getGEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__PianoNoteType__Alternatives"


    // $ANTLR start "rule__Music__Group__0"
    // InternalGuardin.g:985:1: rule__Music__Group__0 : rule__Music__Group__0__Impl rule__Music__Group__1 ;
    public final void rule__Music__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:989:1: ( rule__Music__Group__0__Impl rule__Music__Group__1 )
            // InternalGuardin.g:990:2: rule__Music__Group__0__Impl rule__Music__Group__1
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
    // InternalGuardin.g:997:1: rule__Music__Group__0__Impl : ( () ) ;
    public final void rule__Music__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1001:1: ( ( () ) )
            // InternalGuardin.g:1002:1: ( () )
            {
            // InternalGuardin.g:1002:1: ( () )
            // InternalGuardin.g:1003:2: ()
            {
             before(grammarAccess.getMusicAccess().getMusicAction_0()); 
            // InternalGuardin.g:1004:2: ()
            // InternalGuardin.g:1004:3: 
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
    // InternalGuardin.g:1012:1: rule__Music__Group__1 : rule__Music__Group__1__Impl rule__Music__Group__2 ;
    public final void rule__Music__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1016:1: ( rule__Music__Group__1__Impl rule__Music__Group__2 )
            // InternalGuardin.g:1017:2: rule__Music__Group__1__Impl rule__Music__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGuardin.g:1024:1: rule__Music__Group__1__Impl : ( ( rule__Music__Group_1__0 )? ) ;
    public final void rule__Music__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1028:1: ( ( ( rule__Music__Group_1__0 )? ) )
            // InternalGuardin.g:1029:1: ( ( rule__Music__Group_1__0 )? )
            {
            // InternalGuardin.g:1029:1: ( ( rule__Music__Group_1__0 )? )
            // InternalGuardin.g:1030:2: ( rule__Music__Group_1__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_1()); 
            // InternalGuardin.g:1031:2: ( rule__Music__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGuardin.g:1031:3: rule__Music__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalGuardin.g:1039:1: rule__Music__Group__2 : rule__Music__Group__2__Impl rule__Music__Group__3 ;
    public final void rule__Music__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1043:1: ( rule__Music__Group__2__Impl rule__Music__Group__3 )
            // InternalGuardin.g:1044:2: rule__Music__Group__2__Impl rule__Music__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalGuardin.g:1051:1: rule__Music__Group__2__Impl : ( 'Music' ) ;
    public final void rule__Music__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1055:1: ( ( 'Music' ) )
            // InternalGuardin.g:1056:1: ( 'Music' )
            {
            // InternalGuardin.g:1056:1: ( 'Music' )
            // InternalGuardin.g:1057:2: 'Music'
            {
             before(grammarAccess.getMusicAccess().getMusicKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getMusicKeyword_2()); 

            }


            }

        }
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
    // InternalGuardin.g:1066:1: rule__Music__Group__3 : rule__Music__Group__3__Impl rule__Music__Group__4 ;
    public final void rule__Music__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1070:1: ( rule__Music__Group__3__Impl rule__Music__Group__4 )
            // InternalGuardin.g:1071:2: rule__Music__Group__3__Impl rule__Music__Group__4
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
    // InternalGuardin.g:1078:1: rule__Music__Group__3__Impl : ( ( rule__Music__NameAssignment_3 ) ) ;
    public final void rule__Music__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1082:1: ( ( ( rule__Music__NameAssignment_3 ) ) )
            // InternalGuardin.g:1083:1: ( ( rule__Music__NameAssignment_3 ) )
            {
            // InternalGuardin.g:1083:1: ( ( rule__Music__NameAssignment_3 ) )
            // InternalGuardin.g:1084:2: ( rule__Music__NameAssignment_3 )
            {
             before(grammarAccess.getMusicAccess().getNameAssignment_3()); 
            // InternalGuardin.g:1085:2: ( rule__Music__NameAssignment_3 )
            // InternalGuardin.g:1085:3: rule__Music__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Music__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalGuardin.g:1093:1: rule__Music__Group__4 : rule__Music__Group__4__Impl rule__Music__Group__5 ;
    public final void rule__Music__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1097:1: ( rule__Music__Group__4__Impl rule__Music__Group__5 )
            // InternalGuardin.g:1098:2: rule__Music__Group__4__Impl rule__Music__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalGuardin.g:1105:1: rule__Music__Group__4__Impl : ( ':' ) ;
    public final void rule__Music__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1109:1: ( ( ':' ) )
            // InternalGuardin.g:1110:1: ( ':' )
            {
            // InternalGuardin.g:1110:1: ( ':' )
            // InternalGuardin.g:1111:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getColonKeyword_4()); 

            }


            }

        }
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
    // InternalGuardin.g:1120:1: rule__Music__Group__5 : rule__Music__Group__5__Impl rule__Music__Group__6 ;
    public final void rule__Music__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1124:1: ( rule__Music__Group__5__Impl rule__Music__Group__6 )
            // InternalGuardin.g:1125:2: rule__Music__Group__5__Impl rule__Music__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalGuardin.g:1132:1: rule__Music__Group__5__Impl : ( 'sections' ) ;
    public final void rule__Music__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1136:1: ( ( 'sections' ) )
            // InternalGuardin.g:1137:1: ( 'sections' )
            {
            // InternalGuardin.g:1137:1: ( 'sections' )
            // InternalGuardin.g:1138:2: 'sections'
            {
             before(grammarAccess.getMusicAccess().getSectionsKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getSectionsKeyword_5()); 

            }


            }

        }
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
    // InternalGuardin.g:1147:1: rule__Music__Group__6 : rule__Music__Group__6__Impl rule__Music__Group__7 ;
    public final void rule__Music__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1151:1: ( rule__Music__Group__6__Impl rule__Music__Group__7 )
            // InternalGuardin.g:1152:2: rule__Music__Group__6__Impl rule__Music__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalGuardin.g:1159:1: rule__Music__Group__6__Impl : ( ':' ) ;
    public final void rule__Music__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1163:1: ( ( ':' ) )
            // InternalGuardin.g:1164:1: ( ':' )
            {
            // InternalGuardin.g:1164:1: ( ':' )
            // InternalGuardin.g:1165:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_6()); 
            match(input,11,FOLLOW_2); 
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
    // InternalGuardin.g:1174:1: rule__Music__Group__7 : rule__Music__Group__7__Impl rule__Music__Group__8 ;
    public final void rule__Music__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1178:1: ( rule__Music__Group__7__Impl rule__Music__Group__8 )
            // InternalGuardin.g:1179:2: rule__Music__Group__7__Impl rule__Music__Group__8
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
    // InternalGuardin.g:1186:1: rule__Music__Group__7__Impl : ( ( rule__Music__SectionsAssignment_7 ) ) ;
    public final void rule__Music__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1190:1: ( ( ( rule__Music__SectionsAssignment_7 ) ) )
            // InternalGuardin.g:1191:1: ( ( rule__Music__SectionsAssignment_7 ) )
            {
            // InternalGuardin.g:1191:1: ( ( rule__Music__SectionsAssignment_7 ) )
            // InternalGuardin.g:1192:2: ( rule__Music__SectionsAssignment_7 )
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_7()); 
            // InternalGuardin.g:1193:2: ( rule__Music__SectionsAssignment_7 )
            // InternalGuardin.g:1193:3: rule__Music__SectionsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Music__SectionsAssignment_7();

            state._fsp--;


            }

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
    // InternalGuardin.g:1201:1: rule__Music__Group__8 : rule__Music__Group__8__Impl rule__Music__Group__9 ;
    public final void rule__Music__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1205:1: ( rule__Music__Group__8__Impl rule__Music__Group__9 )
            // InternalGuardin.g:1206:2: rule__Music__Group__8__Impl rule__Music__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalGuardin.g:1213:1: rule__Music__Group__8__Impl : ( ( rule__Music__SectionsAssignment_8 )* ) ;
    public final void rule__Music__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1217:1: ( ( ( rule__Music__SectionsAssignment_8 )* ) )
            // InternalGuardin.g:1218:1: ( ( rule__Music__SectionsAssignment_8 )* )
            {
            // InternalGuardin.g:1218:1: ( ( rule__Music__SectionsAssignment_8 )* )
            // InternalGuardin.g:1219:2: ( rule__Music__SectionsAssignment_8 )*
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_8()); 
            // InternalGuardin.g:1220:2: ( rule__Music__SectionsAssignment_8 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGuardin.g:1220:3: rule__Music__SectionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Music__SectionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getSectionsAssignment_8()); 

            }


            }

        }
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
    // InternalGuardin.g:1228:1: rule__Music__Group__9 : rule__Music__Group__9__Impl rule__Music__Group__10 ;
    public final void rule__Music__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1232:1: ( rule__Music__Group__9__Impl rule__Music__Group__10 )
            // InternalGuardin.g:1233:2: rule__Music__Group__9__Impl rule__Music__Group__10
            {
            pushFollow(FOLLOW_5);
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
    // InternalGuardin.g:1240:1: rule__Music__Group__9__Impl : ( 'tracks' ) ;
    public final void rule__Music__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1244:1: ( ( 'tracks' ) )
            // InternalGuardin.g:1245:1: ( 'tracks' )
            {
            // InternalGuardin.g:1245:1: ( 'tracks' )
            // InternalGuardin.g:1246:2: 'tracks'
            {
             before(grammarAccess.getMusicAccess().getTracksKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getTracksKeyword_9()); 

            }


            }

        }
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
    // InternalGuardin.g:1255:1: rule__Music__Group__10 : rule__Music__Group__10__Impl rule__Music__Group__11 ;
    public final void rule__Music__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1259:1: ( rule__Music__Group__10__Impl rule__Music__Group__11 )
            // InternalGuardin.g:1260:2: rule__Music__Group__10__Impl rule__Music__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Music__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__11();

            state._fsp--;


            }

        }
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
    // InternalGuardin.g:1267:1: rule__Music__Group__10__Impl : ( ':' ) ;
    public final void rule__Music__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1271:1: ( ( ':' ) )
            // InternalGuardin.g:1272:1: ( ':' )
            {
            // InternalGuardin.g:1272:1: ( ':' )
            // InternalGuardin.g:1273:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_10()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getColonKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__Music__Group__11"
    // InternalGuardin.g:1282:1: rule__Music__Group__11 : rule__Music__Group__11__Impl ;
    public final void rule__Music__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1286:1: ( rule__Music__Group__11__Impl )
            // InternalGuardin.g:1287:2: rule__Music__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__11"


    // $ANTLR start "rule__Music__Group__11__Impl"
    // InternalGuardin.g:1293:1: rule__Music__Group__11__Impl : ( ( rule__Music__Group_11__0 ) ) ;
    public final void rule__Music__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1297:1: ( ( ( rule__Music__Group_11__0 ) ) )
            // InternalGuardin.g:1298:1: ( ( rule__Music__Group_11__0 ) )
            {
            // InternalGuardin.g:1298:1: ( ( rule__Music__Group_11__0 ) )
            // InternalGuardin.g:1299:2: ( rule__Music__Group_11__0 )
            {
             before(grammarAccess.getMusicAccess().getGroup_11()); 
            // InternalGuardin.g:1300:2: ( rule__Music__Group_11__0 )
            // InternalGuardin.g:1300:3: rule__Music__Group_11__0
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_11__0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group__11__Impl"


    // $ANTLR start "rule__Music__Group_1__0"
    // InternalGuardin.g:1309:1: rule__Music__Group_1__0 : rule__Music__Group_1__0__Impl rule__Music__Group_1__1 ;
    public final void rule__Music__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1313:1: ( rule__Music__Group_1__0__Impl rule__Music__Group_1__1 )
            // InternalGuardin.g:1314:2: rule__Music__Group_1__0__Impl rule__Music__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Music__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_1__0"


    // $ANTLR start "rule__Music__Group_1__0__Impl"
    // InternalGuardin.g:1321:1: rule__Music__Group_1__0__Impl : ( 'CustomSoundBank' ) ;
    public final void rule__Music__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1325:1: ( ( 'CustomSoundBank' ) )
            // InternalGuardin.g:1326:1: ( 'CustomSoundBank' )
            {
            // InternalGuardin.g:1326:1: ( 'CustomSoundBank' )
            // InternalGuardin.g:1327:2: 'CustomSoundBank'
            {
             before(grammarAccess.getMusicAccess().getCustomSoundBankKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getCustomSoundBankKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_1__0__Impl"


    // $ANTLR start "rule__Music__Group_1__1"
    // InternalGuardin.g:1336:1: rule__Music__Group_1__1 : rule__Music__Group_1__1__Impl rule__Music__Group_1__2 ;
    public final void rule__Music__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1340:1: ( rule__Music__Group_1__1__Impl rule__Music__Group_1__2 )
            // InternalGuardin.g:1341:2: rule__Music__Group_1__1__Impl rule__Music__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Music__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_1__1"


    // $ANTLR start "rule__Music__Group_1__1__Impl"
    // InternalGuardin.g:1348:1: rule__Music__Group_1__1__Impl : ( 'basePath=' ) ;
    public final void rule__Music__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1352:1: ( ( 'basePath=' ) )
            // InternalGuardin.g:1353:1: ( 'basePath=' )
            {
            // InternalGuardin.g:1353:1: ( 'basePath=' )
            // InternalGuardin.g:1354:2: 'basePath='
            {
             before(grammarAccess.getMusicAccess().getBasePathKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getBasePathKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_1__1__Impl"


    // $ANTLR start "rule__Music__Group_1__2"
    // InternalGuardin.g:1363:1: rule__Music__Group_1__2 : rule__Music__Group_1__2__Impl ;
    public final void rule__Music__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1367:1: ( rule__Music__Group_1__2__Impl )
            // InternalGuardin.g:1368:2: rule__Music__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_1__2"


    // $ANTLR start "rule__Music__Group_1__2__Impl"
    // InternalGuardin.g:1374:1: rule__Music__Group_1__2__Impl : ( ( rule__Music__SoundBankPathAssignment_1_2 ) ) ;
    public final void rule__Music__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1378:1: ( ( ( rule__Music__SoundBankPathAssignment_1_2 ) ) )
            // InternalGuardin.g:1379:1: ( ( rule__Music__SoundBankPathAssignment_1_2 ) )
            {
            // InternalGuardin.g:1379:1: ( ( rule__Music__SoundBankPathAssignment_1_2 ) )
            // InternalGuardin.g:1380:2: ( rule__Music__SoundBankPathAssignment_1_2 )
            {
             before(grammarAccess.getMusicAccess().getSoundBankPathAssignment_1_2()); 
            // InternalGuardin.g:1381:2: ( rule__Music__SoundBankPathAssignment_1_2 )
            // InternalGuardin.g:1381:3: rule__Music__SoundBankPathAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Music__SoundBankPathAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getSoundBankPathAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_1__2__Impl"


    // $ANTLR start "rule__Music__Group_11__0"
    // InternalGuardin.g:1390:1: rule__Music__Group_11__0 : rule__Music__Group_11__0__Impl rule__Music__Group_11__1 ;
    public final void rule__Music__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1394:1: ( rule__Music__Group_11__0__Impl rule__Music__Group_11__1 )
            // InternalGuardin.g:1395:2: rule__Music__Group_11__0__Impl rule__Music__Group_11__1
            {
            pushFollow(FOLLOW_11);
            rule__Music__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_11__0"


    // $ANTLR start "rule__Music__Group_11__0__Impl"
    // InternalGuardin.g:1402:1: rule__Music__Group_11__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1406:1: ( ( '-' ) )
            // InternalGuardin.g:1407:1: ( '-' )
            {
            // InternalGuardin.g:1407:1: ( '-' )
            // InternalGuardin.g:1408:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_11__0__Impl"


    // $ANTLR start "rule__Music__Group_11__1"
    // InternalGuardin.g:1417:1: rule__Music__Group_11__1 : rule__Music__Group_11__1__Impl rule__Music__Group_11__2 ;
    public final void rule__Music__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1421:1: ( rule__Music__Group_11__1__Impl rule__Music__Group_11__2 )
            // InternalGuardin.g:1422:2: rule__Music__Group_11__1__Impl rule__Music__Group_11__2
            {
            pushFollow(FOLLOW_9);
            rule__Music__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_11__1"


    // $ANTLR start "rule__Music__Group_11__1__Impl"
    // InternalGuardin.g:1429:1: rule__Music__Group_11__1__Impl : ( ( rule__Music__TracksAssignment_11_1 ) ) ;
    public final void rule__Music__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1433:1: ( ( ( rule__Music__TracksAssignment_11_1 ) ) )
            // InternalGuardin.g:1434:1: ( ( rule__Music__TracksAssignment_11_1 ) )
            {
            // InternalGuardin.g:1434:1: ( ( rule__Music__TracksAssignment_11_1 ) )
            // InternalGuardin.g:1435:2: ( rule__Music__TracksAssignment_11_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_11_1()); 
            // InternalGuardin.g:1436:2: ( rule__Music__TracksAssignment_11_1 )
            // InternalGuardin.g:1436:3: rule__Music__TracksAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__TracksAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getTracksAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_11__1__Impl"


    // $ANTLR start "rule__Music__Group_11__2"
    // InternalGuardin.g:1444:1: rule__Music__Group_11__2 : rule__Music__Group_11__2__Impl ;
    public final void rule__Music__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1448:1: ( rule__Music__Group_11__2__Impl )
            // InternalGuardin.g:1449:2: rule__Music__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_11__2"


    // $ANTLR start "rule__Music__Group_11__2__Impl"
    // InternalGuardin.g:1455:1: rule__Music__Group_11__2__Impl : ( ( rule__Music__Group_11_2__0 )* ) ;
    public final void rule__Music__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1459:1: ( ( ( rule__Music__Group_11_2__0 )* ) )
            // InternalGuardin.g:1460:1: ( ( rule__Music__Group_11_2__0 )* )
            {
            // InternalGuardin.g:1460:1: ( ( rule__Music__Group_11_2__0 )* )
            // InternalGuardin.g:1461:2: ( rule__Music__Group_11_2__0 )*
            {
             before(grammarAccess.getMusicAccess().getGroup_11_2()); 
            // InternalGuardin.g:1462:2: ( rule__Music__Group_11_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGuardin.g:1462:3: rule__Music__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Music__Group_11_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getGroup_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_11__2__Impl"


    // $ANTLR start "rule__Music__Group_11_2__0"
    // InternalGuardin.g:1471:1: rule__Music__Group_11_2__0 : rule__Music__Group_11_2__0__Impl rule__Music__Group_11_2__1 ;
    public final void rule__Music__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1475:1: ( rule__Music__Group_11_2__0__Impl rule__Music__Group_11_2__1 )
            // InternalGuardin.g:1476:2: rule__Music__Group_11_2__0__Impl rule__Music__Group_11_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Music__Group_11_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_11_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_11_2__0"


    // $ANTLR start "rule__Music__Group_11_2__0__Impl"
    // InternalGuardin.g:1483:1: rule__Music__Group_11_2__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1487:1: ( ( '-' ) )
            // InternalGuardin.g:1488:1: ( '-' )
            {
            // InternalGuardin.g:1488:1: ( '-' )
            // InternalGuardin.g:1489:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_11_2__0__Impl"


    // $ANTLR start "rule__Music__Group_11_2__1"
    // InternalGuardin.g:1498:1: rule__Music__Group_11_2__1 : rule__Music__Group_11_2__1__Impl ;
    public final void rule__Music__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1502:1: ( rule__Music__Group_11_2__1__Impl )
            // InternalGuardin.g:1503:2: rule__Music__Group_11_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_11_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_11_2__1"


    // $ANTLR start "rule__Music__Group_11_2__1__Impl"
    // InternalGuardin.g:1509:1: rule__Music__Group_11_2__1__Impl : ( ( rule__Music__TracksAssignment_11_2_1 ) ) ;
    public final void rule__Music__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1513:1: ( ( ( rule__Music__TracksAssignment_11_2_1 ) ) )
            // InternalGuardin.g:1514:1: ( ( rule__Music__TracksAssignment_11_2_1 ) )
            {
            // InternalGuardin.g:1514:1: ( ( rule__Music__TracksAssignment_11_2_1 ) )
            // InternalGuardin.g:1515:2: ( rule__Music__TracksAssignment_11_2_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_11_2_1()); 
            // InternalGuardin.g:1516:2: ( rule__Music__TracksAssignment_11_2_1 )
            // InternalGuardin.g:1516:3: rule__Music__TracksAssignment_11_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__TracksAssignment_11_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getTracksAssignment_11_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_11_2__1__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalGuardin.g:1525:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1529:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalGuardin.g:1530:2: rule__Section__Group__0__Impl rule__Section__Group__1
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
    // InternalGuardin.g:1537:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1541:1: ( ( () ) )
            // InternalGuardin.g:1542:1: ( () )
            {
            // InternalGuardin.g:1542:1: ( () )
            // InternalGuardin.g:1543:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalGuardin.g:1544:2: ()
            // InternalGuardin.g:1544:3: 
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
    // InternalGuardin.g:1552:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1556:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalGuardin.g:1557:2: rule__Section__Group__1__Impl rule__Section__Group__2
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
    // InternalGuardin.g:1564:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1568:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalGuardin.g:1569:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalGuardin.g:1569:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalGuardin.g:1570:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalGuardin.g:1571:2: ( rule__Section__NameAssignment_1 )
            // InternalGuardin.g:1571:3: rule__Section__NameAssignment_1
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
    // InternalGuardin.g:1579:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1583:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalGuardin.g:1584:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGuardin.g:1591:1: rule__Section__Group__2__Impl : ( ':' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1595:1: ( ( ':' ) )
            // InternalGuardin.g:1596:1: ( ':' )
            {
            // InternalGuardin.g:1596:1: ( ':' )
            // InternalGuardin.g:1597:2: ':'
            {
             before(grammarAccess.getSectionAccess().getColonKeyword_2()); 
            match(input,11,FOLLOW_2); 
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
    // InternalGuardin.g:1606:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1610:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalGuardin.g:1611:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalGuardin.g:1618:1: rule__Section__Group__3__Impl : ( 'tempo=' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1622:1: ( ( 'tempo=' ) )
            // InternalGuardin.g:1623:1: ( 'tempo=' )
            {
            // InternalGuardin.g:1623:1: ( 'tempo=' )
            // InternalGuardin.g:1624:2: 'tempo='
            {
             before(grammarAccess.getSectionAccess().getTempoKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalGuardin.g:1633:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1637:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalGuardin.g:1638:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalGuardin.g:1645:1: rule__Section__Group__4__Impl : ( ( rule__Section__TempoAssignment_4 ) ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1649:1: ( ( ( rule__Section__TempoAssignment_4 ) ) )
            // InternalGuardin.g:1650:1: ( ( rule__Section__TempoAssignment_4 ) )
            {
            // InternalGuardin.g:1650:1: ( ( rule__Section__TempoAssignment_4 ) )
            // InternalGuardin.g:1651:2: ( rule__Section__TempoAssignment_4 )
            {
             before(grammarAccess.getSectionAccess().getTempoAssignment_4()); 
            // InternalGuardin.g:1652:2: ( rule__Section__TempoAssignment_4 )
            // InternalGuardin.g:1652:3: rule__Section__TempoAssignment_4
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
    // InternalGuardin.g:1660:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1664:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalGuardin.g:1665:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalGuardin.g:1672:1: rule__Section__Group__5__Impl : ( 'signature=' ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1676:1: ( ( 'signature=' ) )
            // InternalGuardin.g:1677:1: ( 'signature=' )
            {
            // InternalGuardin.g:1677:1: ( 'signature=' )
            // InternalGuardin.g:1678:2: 'signature='
            {
             before(grammarAccess.getSectionAccess().getSignatureKeyword_5()); 
            match(input,43,FOLLOW_2); 
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
    // InternalGuardin.g:1687:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1691:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalGuardin.g:1692:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalGuardin.g:1699:1: rule__Section__Group__6__Impl : ( ( rule__Section__SignatureAssignment_6 ) ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1703:1: ( ( ( rule__Section__SignatureAssignment_6 ) ) )
            // InternalGuardin.g:1704:1: ( ( rule__Section__SignatureAssignment_6 ) )
            {
            // InternalGuardin.g:1704:1: ( ( rule__Section__SignatureAssignment_6 ) )
            // InternalGuardin.g:1705:2: ( rule__Section__SignatureAssignment_6 )
            {
             before(grammarAccess.getSectionAccess().getSignatureAssignment_6()); 
            // InternalGuardin.g:1706:2: ( rule__Section__SignatureAssignment_6 )
            // InternalGuardin.g:1706:3: rule__Section__SignatureAssignment_6
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
    // InternalGuardin.g:1714:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1718:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalGuardin.g:1719:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalGuardin.g:1726:1: rule__Section__Group__7__Impl : ( 'bars=' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1730:1: ( ( 'bars=' ) )
            // InternalGuardin.g:1731:1: ( 'bars=' )
            {
            // InternalGuardin.g:1731:1: ( 'bars=' )
            // InternalGuardin.g:1732:2: 'bars='
            {
             before(grammarAccess.getSectionAccess().getBarsKeyword_7()); 
            match(input,44,FOLLOW_2); 
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
    // InternalGuardin.g:1741:1: rule__Section__Group__8 : rule__Section__Group__8__Impl ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1745:1: ( rule__Section__Group__8__Impl )
            // InternalGuardin.g:1746:2: rule__Section__Group__8__Impl
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
    // InternalGuardin.g:1752:1: rule__Section__Group__8__Impl : ( ( rule__Section__BarsAssignment_8 ) ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1756:1: ( ( ( rule__Section__BarsAssignment_8 ) ) )
            // InternalGuardin.g:1757:1: ( ( rule__Section__BarsAssignment_8 ) )
            {
            // InternalGuardin.g:1757:1: ( ( rule__Section__BarsAssignment_8 ) )
            // InternalGuardin.g:1758:2: ( rule__Section__BarsAssignment_8 )
            {
             before(grammarAccess.getSectionAccess().getBarsAssignment_8()); 
            // InternalGuardin.g:1759:2: ( rule__Section__BarsAssignment_8 )
            // InternalGuardin.g:1759:3: rule__Section__BarsAssignment_8
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
    // InternalGuardin.g:1768:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1772:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // InternalGuardin.g:1773:2: rule__Track__Group__0__Impl rule__Track__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGuardin.g:1780:1: rule__Track__Group__0__Impl : ( () ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1784:1: ( ( () ) )
            // InternalGuardin.g:1785:1: ( () )
            {
            // InternalGuardin.g:1785:1: ( () )
            // InternalGuardin.g:1786:2: ()
            {
             before(grammarAccess.getTrackAccess().getTrackAction_0()); 
            // InternalGuardin.g:1787:2: ()
            // InternalGuardin.g:1787:3: 
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
    // InternalGuardin.g:1795:1: rule__Track__Group__1 : rule__Track__Group__1__Impl rule__Track__Group__2 ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1799:1: ( rule__Track__Group__1__Impl rule__Track__Group__2 )
            // InternalGuardin.g:1800:2: rule__Track__Group__1__Impl rule__Track__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalGuardin.g:1807:1: rule__Track__Group__1__Impl : ( ( rule__Track__Group_1__0 )? ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1811:1: ( ( ( rule__Track__Group_1__0 )? ) )
            // InternalGuardin.g:1812:1: ( ( rule__Track__Group_1__0 )? )
            {
            // InternalGuardin.g:1812:1: ( ( rule__Track__Group_1__0 )? )
            // InternalGuardin.g:1813:2: ( rule__Track__Group_1__0 )?
            {
             before(grammarAccess.getTrackAccess().getGroup_1()); 
            // InternalGuardin.g:1814:2: ( rule__Track__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGuardin.g:1814:3: rule__Track__Group_1__0
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
    // InternalGuardin.g:1822:1: rule__Track__Group__2 : rule__Track__Group__2__Impl ;
    public final void rule__Track__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1826:1: ( rule__Track__Group__2__Impl )
            // InternalGuardin.g:1827:2: rule__Track__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalGuardin.g:1833:1: rule__Track__Group__2__Impl : ( ( rule__Track__InstrumentAssignment_2 ) ) ;
    public final void rule__Track__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1837:1: ( ( ( rule__Track__InstrumentAssignment_2 ) ) )
            // InternalGuardin.g:1838:1: ( ( rule__Track__InstrumentAssignment_2 ) )
            {
            // InternalGuardin.g:1838:1: ( ( rule__Track__InstrumentAssignment_2 ) )
            // InternalGuardin.g:1839:2: ( rule__Track__InstrumentAssignment_2 )
            {
             before(grammarAccess.getTrackAccess().getInstrumentAssignment_2()); 
            // InternalGuardin.g:1840:2: ( rule__Track__InstrumentAssignment_2 )
            // InternalGuardin.g:1840:3: rule__Track__InstrumentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Track__InstrumentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getInstrumentAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Track__Group_1__0"
    // InternalGuardin.g:1849:1: rule__Track__Group_1__0 : rule__Track__Group_1__0__Impl rule__Track__Group_1__1 ;
    public final void rule__Track__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1853:1: ( rule__Track__Group_1__0__Impl rule__Track__Group_1__1 )
            // InternalGuardin.g:1854:2: rule__Track__Group_1__0__Impl rule__Track__Group_1__1
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
    // InternalGuardin.g:1861:1: rule__Track__Group_1__0__Impl : ( ( rule__Track__NameAssignment_1_0 ) ) ;
    public final void rule__Track__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1865:1: ( ( ( rule__Track__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:1866:1: ( ( rule__Track__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:1866:1: ( ( rule__Track__NameAssignment_1_0 ) )
            // InternalGuardin.g:1867:2: ( rule__Track__NameAssignment_1_0 )
            {
             before(grammarAccess.getTrackAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:1868:2: ( rule__Track__NameAssignment_1_0 )
            // InternalGuardin.g:1868:3: rule__Track__NameAssignment_1_0
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
    // InternalGuardin.g:1876:1: rule__Track__Group_1__1 : rule__Track__Group_1__1__Impl ;
    public final void rule__Track__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1880:1: ( rule__Track__Group_1__1__Impl )
            // InternalGuardin.g:1881:2: rule__Track__Group_1__1__Impl
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
    // InternalGuardin.g:1887:1: rule__Track__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Track__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1891:1: ( ( ':' ) )
            // InternalGuardin.g:1892:1: ( ':' )
            {
            // InternalGuardin.g:1892:1: ( ':' )
            // InternalGuardin.g:1893:2: ':'
            {
             before(grammarAccess.getTrackAccess().getColonKeyword_1_1()); 
            match(input,11,FOLLOW_2); 
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


    // $ANTLR start "rule__EmptyNote__Group__0"
    // InternalGuardin.g:1903:1: rule__EmptyNote__Group__0 : rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 ;
    public final void rule__EmptyNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1907:1: ( rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 )
            // InternalGuardin.g:1908:2: rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGuardin.g:1915:1: rule__EmptyNote__Group__0__Impl : ( () ) ;
    public final void rule__EmptyNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1919:1: ( ( () ) )
            // InternalGuardin.g:1920:1: ( () )
            {
            // InternalGuardin.g:1920:1: ( () )
            // InternalGuardin.g:1921:2: ()
            {
             before(grammarAccess.getEmptyNoteAccess().getEmptyNoteAction_0()); 
            // InternalGuardin.g:1922:2: ()
            // InternalGuardin.g:1922:3: 
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
    // InternalGuardin.g:1930:1: rule__EmptyNote__Group__1 : rule__EmptyNote__Group__1__Impl ;
    public final void rule__EmptyNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1934:1: ( rule__EmptyNote__Group__1__Impl )
            // InternalGuardin.g:1935:2: rule__EmptyNote__Group__1__Impl
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
    // InternalGuardin.g:1941:1: rule__EmptyNote__Group__1__Impl : ( '$' ) ;
    public final void rule__EmptyNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1945:1: ( ( '$' ) )
            // InternalGuardin.g:1946:1: ( '$' )
            {
            // InternalGuardin.g:1946:1: ( '$' )
            // InternalGuardin.g:1947:2: '$'
            {
             before(grammarAccess.getEmptyNoteAccess().getDollarSignKeyword_1()); 
            match(input,45,FOLLOW_2); 
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


    // $ANTLR start "rule__Battery__Group__0"
    // InternalGuardin.g:1957:1: rule__Battery__Group__0 : rule__Battery__Group__0__Impl rule__Battery__Group__1 ;
    public final void rule__Battery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1961:1: ( rule__Battery__Group__0__Impl rule__Battery__Group__1 )
            // InternalGuardin.g:1962:2: rule__Battery__Group__0__Impl rule__Battery__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGuardin.g:1969:1: rule__Battery__Group__0__Impl : ( () ) ;
    public final void rule__Battery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1973:1: ( ( () ) )
            // InternalGuardin.g:1974:1: ( () )
            {
            // InternalGuardin.g:1974:1: ( () )
            // InternalGuardin.g:1975:2: ()
            {
             before(grammarAccess.getBatteryAccess().getBatteryAction_0()); 
            // InternalGuardin.g:1976:2: ()
            // InternalGuardin.g:1976:3: 
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
    // InternalGuardin.g:1984:1: rule__Battery__Group__1 : rule__Battery__Group__1__Impl rule__Battery__Group__2 ;
    public final void rule__Battery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1988:1: ( rule__Battery__Group__1__Impl rule__Battery__Group__2 )
            // InternalGuardin.g:1989:2: rule__Battery__Group__1__Impl rule__Battery__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalGuardin.g:1996:1: rule__Battery__Group__1__Impl : ( 'battery' ) ;
    public final void rule__Battery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2000:1: ( ( 'battery' ) )
            // InternalGuardin.g:2001:1: ( 'battery' )
            {
            // InternalGuardin.g:2001:1: ( 'battery' )
            // InternalGuardin.g:2002:2: 'battery'
            {
             before(grammarAccess.getBatteryAccess().getBatteryKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBatteryAccess().getBatteryKeyword_1()); 

            }


            }

        }
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
    // InternalGuardin.g:2011:1: rule__Battery__Group__2 : rule__Battery__Group__2__Impl rule__Battery__Group__3 ;
    public final void rule__Battery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2015:1: ( rule__Battery__Group__2__Impl rule__Battery__Group__3 )
            // InternalGuardin.g:2016:2: rule__Battery__Group__2__Impl rule__Battery__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Battery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Battery__Group__3();

            state._fsp--;


            }

        }
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
    // InternalGuardin.g:2023:1: rule__Battery__Group__2__Impl : ( ( rule__Battery__Alternatives_2 ) ) ;
    public final void rule__Battery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2027:1: ( ( ( rule__Battery__Alternatives_2 ) ) )
            // InternalGuardin.g:2028:1: ( ( rule__Battery__Alternatives_2 ) )
            {
            // InternalGuardin.g:2028:1: ( ( rule__Battery__Alternatives_2 ) )
            // InternalGuardin.g:2029:2: ( rule__Battery__Alternatives_2 )
            {
             before(grammarAccess.getBatteryAccess().getAlternatives_2()); 
            // InternalGuardin.g:2030:2: ( rule__Battery__Alternatives_2 )
            // InternalGuardin.g:2030:3: rule__Battery__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Battery__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getAlternatives_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Battery__Group__3"
    // InternalGuardin.g:2038:1: rule__Battery__Group__3 : rule__Battery__Group__3__Impl ;
    public final void rule__Battery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2042:1: ( rule__Battery__Group__3__Impl )
            // InternalGuardin.g:2043:2: rule__Battery__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Battery__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__Group__3"


    // $ANTLR start "rule__Battery__Group__3__Impl"
    // InternalGuardin.g:2049:1: rule__Battery__Group__3__Impl : ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) ) ;
    public final void rule__Battery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2053:1: ( ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) ) )
            // InternalGuardin.g:2054:1: ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) )
            {
            // InternalGuardin.g:2054:1: ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) )
            // InternalGuardin.g:2055:2: ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* )
            {
            // InternalGuardin.g:2055:2: ( ( rule__Battery__Alternatives_3 ) )
            // InternalGuardin.g:2056:3: ( rule__Battery__Alternatives_3 )
            {
             before(grammarAccess.getBatteryAccess().getAlternatives_3()); 
            // InternalGuardin.g:2057:3: ( rule__Battery__Alternatives_3 )
            // InternalGuardin.g:2057:4: rule__Battery__Alternatives_3
            {
            pushFollow(FOLLOW_21);
            rule__Battery__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getAlternatives_3()); 

            }

            // InternalGuardin.g:2060:2: ( ( rule__Battery__Alternatives_3 )* )
            // InternalGuardin.g:2061:3: ( rule__Battery__Alternatives_3 )*
            {
             before(grammarAccess.getBatteryAccess().getAlternatives_3()); 
            // InternalGuardin.g:2062:3: ( rule__Battery__Alternatives_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==47||LA20_0==49) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGuardin.g:2062:4: rule__Battery__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Battery__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBatteryAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Battery__Group__3__Impl"


    // $ANTLR start "rule__Battery__Group_2_1__0"
    // InternalGuardin.g:2072:1: rule__Battery__Group_2_1__0 : rule__Battery__Group_2_1__0__Impl rule__Battery__Group_2_1__1 ;
    public final void rule__Battery__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2076:1: ( rule__Battery__Group_2_1__0__Impl rule__Battery__Group_2_1__1 )
            // InternalGuardin.g:2077:2: rule__Battery__Group_2_1__0__Impl rule__Battery__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Battery__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Battery__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__Group_2_1__0"


    // $ANTLR start "rule__Battery__Group_2_1__0__Impl"
    // InternalGuardin.g:2084:1: rule__Battery__Group_2_1__0__Impl : ( ( rule__Battery__NameAssignment_2_1_0 ) ) ;
    public final void rule__Battery__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2088:1: ( ( ( rule__Battery__NameAssignment_2_1_0 ) ) )
            // InternalGuardin.g:2089:1: ( ( rule__Battery__NameAssignment_2_1_0 ) )
            {
            // InternalGuardin.g:2089:1: ( ( rule__Battery__NameAssignment_2_1_0 ) )
            // InternalGuardin.g:2090:2: ( rule__Battery__NameAssignment_2_1_0 )
            {
             before(grammarAccess.getBatteryAccess().getNameAssignment_2_1_0()); 
            // InternalGuardin.g:2091:2: ( rule__Battery__NameAssignment_2_1_0 )
            // InternalGuardin.g:2091:3: rule__Battery__NameAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Battery__NameAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getNameAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__Group_2_1__0__Impl"


    // $ANTLR start "rule__Battery__Group_2_1__1"
    // InternalGuardin.g:2099:1: rule__Battery__Group_2_1__1 : rule__Battery__Group_2_1__1__Impl ;
    public final void rule__Battery__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2103:1: ( rule__Battery__Group_2_1__1__Impl )
            // InternalGuardin.g:2104:2: rule__Battery__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Battery__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__Group_2_1__1"


    // $ANTLR start "rule__Battery__Group_2_1__1__Impl"
    // InternalGuardin.g:2110:1: rule__Battery__Group_2_1__1__Impl : ( ':' ) ;
    public final void rule__Battery__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2114:1: ( ( ':' ) )
            // InternalGuardin.g:2115:1: ( ':' )
            {
            // InternalGuardin.g:2115:1: ( ':' )
            // InternalGuardin.g:2116:2: ':'
            {
             before(grammarAccess.getBatteryAccess().getColonKeyword_2_1_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBatteryAccess().getColonKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__Group_2_1__1__Impl"


    // $ANTLR start "rule__SectionBatteryLayer__Group__0"
    // InternalGuardin.g:2126:1: rule__SectionBatteryLayer__Group__0 : rule__SectionBatteryLayer__Group__0__Impl rule__SectionBatteryLayer__Group__1 ;
    public final void rule__SectionBatteryLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2130:1: ( rule__SectionBatteryLayer__Group__0__Impl rule__SectionBatteryLayer__Group__1 )
            // InternalGuardin.g:2131:2: rule__SectionBatteryLayer__Group__0__Impl rule__SectionBatteryLayer__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SectionBatteryLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionBatteryLayer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionBatteryLayer__Group__0"


    // $ANTLR start "rule__SectionBatteryLayer__Group__0__Impl"
    // InternalGuardin.g:2138:1: rule__SectionBatteryLayer__Group__0__Impl : ( () ) ;
    public final void rule__SectionBatteryLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2142:1: ( ( () ) )
            // InternalGuardin.g:2143:1: ( () )
            {
            // InternalGuardin.g:2143:1: ( () )
            // InternalGuardin.g:2144:2: ()
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getSectionLayerAction_0()); 
            // InternalGuardin.g:2145:2: ()
            // InternalGuardin.g:2145:3: 
            {
            }

             after(grammarAccess.getSectionBatteryLayerAccess().getSectionLayerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionBatteryLayer__Group__0__Impl"


    // $ANTLR start "rule__SectionBatteryLayer__Group__1"
    // InternalGuardin.g:2153:1: rule__SectionBatteryLayer__Group__1 : rule__SectionBatteryLayer__Group__1__Impl rule__SectionBatteryLayer__Group__2 ;
    public final void rule__SectionBatteryLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2157:1: ( rule__SectionBatteryLayer__Group__1__Impl rule__SectionBatteryLayer__Group__2 )
            // InternalGuardin.g:2158:2: rule__SectionBatteryLayer__Group__1__Impl rule__SectionBatteryLayer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SectionBatteryLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionBatteryLayer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionBatteryLayer__Group__1"


    // $ANTLR start "rule__SectionBatteryLayer__Group__1__Impl"
    // InternalGuardin.g:2165:1: rule__SectionBatteryLayer__Group__1__Impl : ( 'begin_section' ) ;
    public final void rule__SectionBatteryLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2169:1: ( ( 'begin_section' ) )
            // InternalGuardin.g:2170:1: ( 'begin_section' )
            {
            // InternalGuardin.g:2170:1: ( 'begin_section' )
            // InternalGuardin.g:2171:2: 'begin_section'
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getBegin_sectionKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSectionBatteryLayerAccess().getBegin_sectionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionBatteryLayer__Group__1__Impl"


    // $ANTLR start "rule__SectionBatteryLayer__Group__2"
    // InternalGuardin.g:2180:1: rule__SectionBatteryLayer__Group__2 : rule__SectionBatteryLayer__Group__2__Impl rule__SectionBatteryLayer__Group__3 ;
    public final void rule__SectionBatteryLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2184:1: ( rule__SectionBatteryLayer__Group__2__Impl rule__SectionBatteryLayer__Group__3 )
            // InternalGuardin.g:2185:2: rule__SectionBatteryLayer__Group__2__Impl rule__SectionBatteryLayer__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SectionBatteryLayer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionBatteryLayer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionBatteryLayer__Group__2"


    // $ANTLR start "rule__SectionBatteryLayer__Group__2__Impl"
    // InternalGuardin.g:2192:1: rule__SectionBatteryLayer__Group__2__Impl : ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) ) ;
    public final void rule__SectionBatteryLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2196:1: ( ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) ) )
            // InternalGuardin.g:2197:1: ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) )
            {
            // InternalGuardin.g:2197:1: ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) )
            // InternalGuardin.g:2198:2: ( rule__SectionBatteryLayer__SectionAssignment_2 )
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getSectionAssignment_2()); 
            // InternalGuardin.g:2199:2: ( rule__SectionBatteryLayer__SectionAssignment_2 )
            // InternalGuardin.g:2199:3: rule__SectionBatteryLayer__SectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SectionBatteryLayer__SectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionBatteryLayerAccess().getSectionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionBatteryLayer__Group__2__Impl"


    // $ANTLR start "rule__SectionBatteryLayer__Group__3"
    // InternalGuardin.g:2207:1: rule__SectionBatteryLayer__Group__3 : rule__SectionBatteryLayer__Group__3__Impl rule__SectionBatteryLayer__Group__4 ;
    public final void rule__SectionBatteryLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2211:1: ( rule__SectionBatteryLayer__Group__3__Impl rule__SectionBatteryLayer__Group__4 )
            // InternalGuardin.g:2212:2: rule__SectionBatteryLayer__Group__3__Impl rule__SectionBatteryLayer__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__SectionBatteryLayer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionBatteryLayer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionBatteryLayer__Group__3"


    // $ANTLR start "rule__SectionBatteryLayer__Group__3__Impl"
    // InternalGuardin.g:2219:1: rule__SectionBatteryLayer__Group__3__Impl : ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) ) ;
    public final void rule__SectionBatteryLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2223:1: ( ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) ) )
            // InternalGuardin.g:2224:1: ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) )
            {
            // InternalGuardin.g:2224:1: ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) )
            // InternalGuardin.g:2225:2: ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* )
            {
            // InternalGuardin.g:2225:2: ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) )
            // InternalGuardin.g:2226:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2227:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )
            // InternalGuardin.g:2227:4: rule__SectionBatteryLayer__LayersAssignment_3
            {
            pushFollow(FOLLOW_21);
            rule__SectionBatteryLayer__LayersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionBatteryLayerAccess().getLayersAssignment_3()); 

            }

            // InternalGuardin.g:2230:2: ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* )
            // InternalGuardin.g:2231:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )*
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2232:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==49) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGuardin.g:2232:4: rule__SectionBatteryLayer__LayersAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SectionBatteryLayer__LayersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSectionBatteryLayerAccess().getLayersAssignment_3()); 

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
    // $ANTLR end "rule__SectionBatteryLayer__Group__3__Impl"


    // $ANTLR start "rule__SectionBatteryLayer__Group__4"
    // InternalGuardin.g:2241:1: rule__SectionBatteryLayer__Group__4 : rule__SectionBatteryLayer__Group__4__Impl ;
    public final void rule__SectionBatteryLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2245:1: ( rule__SectionBatteryLayer__Group__4__Impl )
            // InternalGuardin.g:2246:2: rule__SectionBatteryLayer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SectionBatteryLayer__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionBatteryLayer__Group__4"


    // $ANTLR start "rule__SectionBatteryLayer__Group__4__Impl"
    // InternalGuardin.g:2252:1: rule__SectionBatteryLayer__Group__4__Impl : ( 'end_section' ) ;
    public final void rule__SectionBatteryLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2256:1: ( ( 'end_section' ) )
            // InternalGuardin.g:2257:1: ( 'end_section' )
            {
            // InternalGuardin.g:2257:1: ( 'end_section' )
            // InternalGuardin.g:2258:2: 'end_section'
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getEnd_sectionKeyword_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSectionBatteryLayerAccess().getEnd_sectionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionBatteryLayer__Group__4__Impl"


    // $ANTLR start "rule__BatteryLayer__Group__0"
    // InternalGuardin.g:2268:1: rule__BatteryLayer__Group__0 : rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1 ;
    public final void rule__BatteryLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2272:1: ( rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1 )
            // InternalGuardin.g:2273:2: rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__BatteryLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BatteryLayer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryLayer__Group__0"


    // $ANTLR start "rule__BatteryLayer__Group__0__Impl"
    // InternalGuardin.g:2280:1: rule__BatteryLayer__Group__0__Impl : ( () ) ;
    public final void rule__BatteryLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2284:1: ( ( () ) )
            // InternalGuardin.g:2285:1: ( () )
            {
            // InternalGuardin.g:2285:1: ( () )
            // InternalGuardin.g:2286:2: ()
            {
             before(grammarAccess.getBatteryLayerAccess().getLayerAction_0()); 
            // InternalGuardin.g:2287:2: ()
            // InternalGuardin.g:2287:3: 
            {
            }

             after(grammarAccess.getBatteryLayerAccess().getLayerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryLayer__Group__0__Impl"


    // $ANTLR start "rule__BatteryLayer__Group__1"
    // InternalGuardin.g:2295:1: rule__BatteryLayer__Group__1 : rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2 ;
    public final void rule__BatteryLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2299:1: ( rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2 )
            // InternalGuardin.g:2300:2: rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__BatteryLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BatteryLayer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryLayer__Group__1"


    // $ANTLR start "rule__BatteryLayer__Group__1__Impl"
    // InternalGuardin.g:2307:1: rule__BatteryLayer__Group__1__Impl : ( 'layer:' ) ;
    public final void rule__BatteryLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2311:1: ( ( 'layer:' ) )
            // InternalGuardin.g:2312:1: ( 'layer:' )
            {
            // InternalGuardin.g:2312:1: ( 'layer:' )
            // InternalGuardin.g:2313:2: 'layer:'
            {
             before(grammarAccess.getBatteryLayerAccess().getLayerKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBatteryLayerAccess().getLayerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryLayer__Group__1__Impl"


    // $ANTLR start "rule__BatteryLayer__Group__2"
    // InternalGuardin.g:2322:1: rule__BatteryLayer__Group__2 : rule__BatteryLayer__Group__2__Impl ;
    public final void rule__BatteryLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2326:1: ( rule__BatteryLayer__Group__2__Impl )
            // InternalGuardin.g:2327:2: rule__BatteryLayer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BatteryLayer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryLayer__Group__2"


    // $ANTLR start "rule__BatteryLayer__Group__2__Impl"
    // InternalGuardin.g:2333:1: rule__BatteryLayer__Group__2__Impl : ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) ) ;
    public final void rule__BatteryLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2337:1: ( ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2338:1: ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2338:1: ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2339:2: ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2339:2: ( ( rule__BatteryLayer__NotesAssignment_2 ) )
            // InternalGuardin.g:2340:3: ( rule__BatteryLayer__NotesAssignment_2 )
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2341:3: ( rule__BatteryLayer__NotesAssignment_2 )
            // InternalGuardin.g:2341:4: rule__BatteryLayer__NotesAssignment_2
            {
            pushFollow(FOLLOW_25);
            rule__BatteryLayer__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2344:2: ( ( rule__BatteryLayer__NotesAssignment_2 )* )
            // InternalGuardin.g:2345:3: ( rule__BatteryLayer__NotesAssignment_2 )*
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2346:3: ( rule__BatteryLayer__NotesAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=13 && LA22_0<=18)||LA22_0==45||LA22_0==50) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGuardin.g:2346:4: rule__BatteryLayer__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__BatteryLayer__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 

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
    // $ANTLR end "rule__BatteryLayer__Group__2__Impl"


    // $ANTLR start "rule__BatteryNote__Group__0"
    // InternalGuardin.g:2356:1: rule__BatteryNote__Group__0 : rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 ;
    public final void rule__BatteryNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2360:1: ( rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 )
            // InternalGuardin.g:2361:2: rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalGuardin.g:2368:1: rule__BatteryNote__Group__0__Impl : ( () ) ;
    public final void rule__BatteryNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2372:1: ( ( () ) )
            // InternalGuardin.g:2373:1: ( () )
            {
            // InternalGuardin.g:2373:1: ( () )
            // InternalGuardin.g:2374:2: ()
            {
             before(grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0()); 
            // InternalGuardin.g:2375:2: ()
            // InternalGuardin.g:2375:3: 
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
    // InternalGuardin.g:2383:1: rule__BatteryNote__Group__1 : rule__BatteryNote__Group__1__Impl ;
    public final void rule__BatteryNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2387:1: ( rule__BatteryNote__Group__1__Impl )
            // InternalGuardin.g:2388:2: rule__BatteryNote__Group__1__Impl
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
    // InternalGuardin.g:2394:1: rule__BatteryNote__Group__1__Impl : ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) ;
    public final void rule__BatteryNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2398:1: ( ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) )
            // InternalGuardin.g:2399:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            {
            // InternalGuardin.g:2399:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            // InternalGuardin.g:2400:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            {
             before(grammarAccess.getBatteryNoteAccess().getNoteTypeAssignment_1()); 
            // InternalGuardin.g:2401:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            // InternalGuardin.g:2401:3: rule__BatteryNote__NoteTypeAssignment_1
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


    // $ANTLR start "rule__CompositeBatteryNote__Group__0"
    // InternalGuardin.g:2410:1: rule__CompositeBatteryNote__Group__0 : rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1 ;
    public final void rule__CompositeBatteryNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2414:1: ( rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1 )
            // InternalGuardin.g:2415:2: rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__CompositeBatteryNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeBatteryNote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__Group__0"


    // $ANTLR start "rule__CompositeBatteryNote__Group__0__Impl"
    // InternalGuardin.g:2422:1: rule__CompositeBatteryNote__Group__0__Impl : ( () ) ;
    public final void rule__CompositeBatteryNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2426:1: ( ( () ) )
            // InternalGuardin.g:2427:1: ( () )
            {
            // InternalGuardin.g:2427:1: ( () )
            // InternalGuardin.g:2428:2: ()
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getCompositeNoteAction_0()); 
            // InternalGuardin.g:2429:2: ()
            // InternalGuardin.g:2429:3: 
            {
            }

             after(grammarAccess.getCompositeBatteryNoteAccess().getCompositeNoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__Group__0__Impl"


    // $ANTLR start "rule__CompositeBatteryNote__Group__1"
    // InternalGuardin.g:2437:1: rule__CompositeBatteryNote__Group__1 : rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2 ;
    public final void rule__CompositeBatteryNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2441:1: ( rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2 )
            // InternalGuardin.g:2442:2: rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__CompositeBatteryNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeBatteryNote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__Group__1"


    // $ANTLR start "rule__CompositeBatteryNote__Group__1__Impl"
    // InternalGuardin.g:2449:1: rule__CompositeBatteryNote__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositeBatteryNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2453:1: ( ( '(' ) )
            // InternalGuardin.g:2454:1: ( '(' )
            {
            // InternalGuardin.g:2454:1: ( '(' )
            // InternalGuardin.g:2455:2: '('
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getLeftParenthesisKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCompositeBatteryNoteAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__Group__1__Impl"


    // $ANTLR start "rule__CompositeBatteryNote__Group__2"
    // InternalGuardin.g:2464:1: rule__CompositeBatteryNote__Group__2 : rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3 ;
    public final void rule__CompositeBatteryNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2468:1: ( rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3 )
            // InternalGuardin.g:2469:2: rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__CompositeBatteryNote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeBatteryNote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__Group__2"


    // $ANTLR start "rule__CompositeBatteryNote__Group__2__Impl"
    // InternalGuardin.g:2476:1: rule__CompositeBatteryNote__Group__2__Impl : ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) ) ;
    public final void rule__CompositeBatteryNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2480:1: ( ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2481:1: ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2481:1: ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2482:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2482:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) )
            // InternalGuardin.g:2483:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2484:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )
            // InternalGuardin.g:2484:4: rule__CompositeBatteryNote__NotesAssignment_2
            {
            pushFollow(FOLLOW_29);
            rule__CompositeBatteryNote__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2487:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* )
            // InternalGuardin.g:2488:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )*
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2489:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=13 && LA23_0<=18)||LA23_0==45) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGuardin.g:2489:4: rule__CompositeBatteryNote__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__CompositeBatteryNote__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 

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
    // $ANTLR end "rule__CompositeBatteryNote__Group__2__Impl"


    // $ANTLR start "rule__CompositeBatteryNote__Group__3"
    // InternalGuardin.g:2498:1: rule__CompositeBatteryNote__Group__3 : rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4 ;
    public final void rule__CompositeBatteryNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2502:1: ( rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4 )
            // InternalGuardin.g:2503:2: rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__CompositeBatteryNote__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeBatteryNote__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__Group__3"


    // $ANTLR start "rule__CompositeBatteryNote__Group__3__Impl"
    // InternalGuardin.g:2510:1: rule__CompositeBatteryNote__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositeBatteryNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2514:1: ( ( ')' ) )
            // InternalGuardin.g:2515:1: ( ')' )
            {
            // InternalGuardin.g:2515:1: ( ')' )
            // InternalGuardin.g:2516:2: ')'
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getRightParenthesisKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCompositeBatteryNoteAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__Group__3__Impl"


    // $ANTLR start "rule__CompositeBatteryNote__Group__4"
    // InternalGuardin.g:2525:1: rule__CompositeBatteryNote__Group__4 : rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5 ;
    public final void rule__CompositeBatteryNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2529:1: ( rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5 )
            // InternalGuardin.g:2530:2: rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__CompositeBatteryNote__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeBatteryNote__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__Group__4"


    // $ANTLR start "rule__CompositeBatteryNote__Group__4__Impl"
    // InternalGuardin.g:2537:1: rule__CompositeBatteryNote__Group__4__Impl : ( 'x' ) ;
    public final void rule__CompositeBatteryNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2541:1: ( ( 'x' ) )
            // InternalGuardin.g:2542:1: ( 'x' )
            {
            // InternalGuardin.g:2542:1: ( 'x' )
            // InternalGuardin.g:2543:2: 'x'
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getXKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCompositeBatteryNoteAccess().getXKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__Group__4__Impl"


    // $ANTLR start "rule__CompositeBatteryNote__Group__5"
    // InternalGuardin.g:2552:1: rule__CompositeBatteryNote__Group__5 : rule__CompositeBatteryNote__Group__5__Impl ;
    public final void rule__CompositeBatteryNote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2556:1: ( rule__CompositeBatteryNote__Group__5__Impl )
            // InternalGuardin.g:2557:2: rule__CompositeBatteryNote__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeBatteryNote__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__Group__5"


    // $ANTLR start "rule__CompositeBatteryNote__Group__5__Impl"
    // InternalGuardin.g:2563:1: rule__CompositeBatteryNote__Group__5__Impl : ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) ) ;
    public final void rule__CompositeBatteryNote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2567:1: ( ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) ) )
            // InternalGuardin.g:2568:1: ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) )
            {
            // InternalGuardin.g:2568:1: ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) )
            // InternalGuardin.g:2569:2: ( rule__CompositeBatteryNote__RepeatsAssignment_5 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getRepeatsAssignment_5()); 
            // InternalGuardin.g:2570:2: ( rule__CompositeBatteryNote__RepeatsAssignment_5 )
            // InternalGuardin.g:2570:3: rule__CompositeBatteryNote__RepeatsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CompositeBatteryNote__RepeatsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCompositeBatteryNoteAccess().getRepeatsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__Group__5__Impl"


    // $ANTLR start "rule__Piano__Group__0"
    // InternalGuardin.g:2579:1: rule__Piano__Group__0 : rule__Piano__Group__0__Impl rule__Piano__Group__1 ;
    public final void rule__Piano__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2583:1: ( rule__Piano__Group__0__Impl rule__Piano__Group__1 )
            // InternalGuardin.g:2584:2: rule__Piano__Group__0__Impl rule__Piano__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Piano__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piano__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group__0"


    // $ANTLR start "rule__Piano__Group__0__Impl"
    // InternalGuardin.g:2591:1: rule__Piano__Group__0__Impl : ( () ) ;
    public final void rule__Piano__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2595:1: ( ( () ) )
            // InternalGuardin.g:2596:1: ( () )
            {
            // InternalGuardin.g:2596:1: ( () )
            // InternalGuardin.g:2597:2: ()
            {
             before(grammarAccess.getPianoAccess().getPianoAction_0()); 
            // InternalGuardin.g:2598:2: ()
            // InternalGuardin.g:2598:3: 
            {
            }

             after(grammarAccess.getPianoAccess().getPianoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group__0__Impl"


    // $ANTLR start "rule__Piano__Group__1"
    // InternalGuardin.g:2606:1: rule__Piano__Group__1 : rule__Piano__Group__1__Impl rule__Piano__Group__2 ;
    public final void rule__Piano__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2610:1: ( rule__Piano__Group__1__Impl rule__Piano__Group__2 )
            // InternalGuardin.g:2611:2: rule__Piano__Group__1__Impl rule__Piano__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Piano__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piano__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group__1"


    // $ANTLR start "rule__Piano__Group__1__Impl"
    // InternalGuardin.g:2618:1: rule__Piano__Group__1__Impl : ( ( rule__Piano__Alternatives_1 ) ) ;
    public final void rule__Piano__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2622:1: ( ( ( rule__Piano__Alternatives_1 ) ) )
            // InternalGuardin.g:2623:1: ( ( rule__Piano__Alternatives_1 ) )
            {
            // InternalGuardin.g:2623:1: ( ( rule__Piano__Alternatives_1 ) )
            // InternalGuardin.g:2624:2: ( rule__Piano__Alternatives_1 )
            {
             before(grammarAccess.getPianoAccess().getAlternatives_1()); 
            // InternalGuardin.g:2625:2: ( rule__Piano__Alternatives_1 )
            // InternalGuardin.g:2625:3: rule__Piano__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Piano__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPianoAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group__1__Impl"


    // $ANTLR start "rule__Piano__Group__2"
    // InternalGuardin.g:2633:1: rule__Piano__Group__2 : rule__Piano__Group__2__Impl rule__Piano__Group__3 ;
    public final void rule__Piano__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2637:1: ( rule__Piano__Group__2__Impl rule__Piano__Group__3 )
            // InternalGuardin.g:2638:2: rule__Piano__Group__2__Impl rule__Piano__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Piano__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piano__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group__2"


    // $ANTLR start "rule__Piano__Group__2__Impl"
    // InternalGuardin.g:2645:1: rule__Piano__Group__2__Impl : ( ( rule__Piano__Alternatives_2 ) ) ;
    public final void rule__Piano__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2649:1: ( ( ( rule__Piano__Alternatives_2 ) ) )
            // InternalGuardin.g:2650:1: ( ( rule__Piano__Alternatives_2 ) )
            {
            // InternalGuardin.g:2650:1: ( ( rule__Piano__Alternatives_2 ) )
            // InternalGuardin.g:2651:2: ( rule__Piano__Alternatives_2 )
            {
             before(grammarAccess.getPianoAccess().getAlternatives_2()); 
            // InternalGuardin.g:2652:2: ( rule__Piano__Alternatives_2 )
            // InternalGuardin.g:2652:3: rule__Piano__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Piano__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getPianoAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group__2__Impl"


    // $ANTLR start "rule__Piano__Group__3"
    // InternalGuardin.g:2660:1: rule__Piano__Group__3 : rule__Piano__Group__3__Impl ;
    public final void rule__Piano__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2664:1: ( rule__Piano__Group__3__Impl )
            // InternalGuardin.g:2665:2: rule__Piano__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Piano__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group__3"


    // $ANTLR start "rule__Piano__Group__3__Impl"
    // InternalGuardin.g:2671:1: rule__Piano__Group__3__Impl : ( ( ( rule__Piano__Alternatives_3 ) ) ( ( rule__Piano__Alternatives_3 )* ) ) ;
    public final void rule__Piano__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2675:1: ( ( ( ( rule__Piano__Alternatives_3 ) ) ( ( rule__Piano__Alternatives_3 )* ) ) )
            // InternalGuardin.g:2676:1: ( ( ( rule__Piano__Alternatives_3 ) ) ( ( rule__Piano__Alternatives_3 )* ) )
            {
            // InternalGuardin.g:2676:1: ( ( ( rule__Piano__Alternatives_3 ) ) ( ( rule__Piano__Alternatives_3 )* ) )
            // InternalGuardin.g:2677:2: ( ( rule__Piano__Alternatives_3 ) ) ( ( rule__Piano__Alternatives_3 )* )
            {
            // InternalGuardin.g:2677:2: ( ( rule__Piano__Alternatives_3 ) )
            // InternalGuardin.g:2678:3: ( rule__Piano__Alternatives_3 )
            {
             before(grammarAccess.getPianoAccess().getAlternatives_3()); 
            // InternalGuardin.g:2679:3: ( rule__Piano__Alternatives_3 )
            // InternalGuardin.g:2679:4: rule__Piano__Alternatives_3
            {
            pushFollow(FOLLOW_21);
            rule__Piano__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPianoAccess().getAlternatives_3()); 

            }

            // InternalGuardin.g:2682:2: ( ( rule__Piano__Alternatives_3 )* )
            // InternalGuardin.g:2683:3: ( rule__Piano__Alternatives_3 )*
            {
             before(grammarAccess.getPianoAccess().getAlternatives_3()); 
            // InternalGuardin.g:2684:3: ( rule__Piano__Alternatives_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==47||LA24_0==49) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGuardin.g:2684:4: rule__Piano__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Piano__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getPianoAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Piano__Group__3__Impl"


    // $ANTLR start "rule__Piano__Group_1_2__0"
    // InternalGuardin.g:2694:1: rule__Piano__Group_1_2__0 : rule__Piano__Group_1_2__0__Impl rule__Piano__Group_1_2__1 ;
    public final void rule__Piano__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2698:1: ( rule__Piano__Group_1_2__0__Impl rule__Piano__Group_1_2__1 )
            // InternalGuardin.g:2699:2: rule__Piano__Group_1_2__0__Impl rule__Piano__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Piano__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piano__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_1_2__0"


    // $ANTLR start "rule__Piano__Group_1_2__0__Impl"
    // InternalGuardin.g:2706:1: rule__Piano__Group_1_2__0__Impl : ( 'other:' ) ;
    public final void rule__Piano__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2710:1: ( ( 'other:' ) )
            // InternalGuardin.g:2711:1: ( 'other:' )
            {
            // InternalGuardin.g:2711:1: ( 'other:' )
            // InternalGuardin.g:2712:2: 'other:'
            {
             before(grammarAccess.getPianoAccess().getOtherKeyword_1_2_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPianoAccess().getOtherKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_1_2__0__Impl"


    // $ANTLR start "rule__Piano__Group_1_2__1"
    // InternalGuardin.g:2721:1: rule__Piano__Group_1_2__1 : rule__Piano__Group_1_2__1__Impl ;
    public final void rule__Piano__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2725:1: ( rule__Piano__Group_1_2__1__Impl )
            // InternalGuardin.g:2726:2: rule__Piano__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Piano__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_1_2__1"


    // $ANTLR start "rule__Piano__Group_1_2__1__Impl"
    // InternalGuardin.g:2732:1: rule__Piano__Group_1_2__1__Impl : ( ( rule__Piano__OtherAssignment_1_2_1 ) ) ;
    public final void rule__Piano__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2736:1: ( ( ( rule__Piano__OtherAssignment_1_2_1 ) ) )
            // InternalGuardin.g:2737:1: ( ( rule__Piano__OtherAssignment_1_2_1 ) )
            {
            // InternalGuardin.g:2737:1: ( ( rule__Piano__OtherAssignment_1_2_1 ) )
            // InternalGuardin.g:2738:2: ( rule__Piano__OtherAssignment_1_2_1 )
            {
             before(grammarAccess.getPianoAccess().getOtherAssignment_1_2_1()); 
            // InternalGuardin.g:2739:2: ( rule__Piano__OtherAssignment_1_2_1 )
            // InternalGuardin.g:2739:3: rule__Piano__OtherAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Piano__OtherAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPianoAccess().getOtherAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_1_2__1__Impl"


    // $ANTLR start "rule__Piano__Group_2_1__0"
    // InternalGuardin.g:2748:1: rule__Piano__Group_2_1__0 : rule__Piano__Group_2_1__0__Impl rule__Piano__Group_2_1__1 ;
    public final void rule__Piano__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2752:1: ( rule__Piano__Group_2_1__0__Impl rule__Piano__Group_2_1__1 )
            // InternalGuardin.g:2753:2: rule__Piano__Group_2_1__0__Impl rule__Piano__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Piano__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piano__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_2_1__0"


    // $ANTLR start "rule__Piano__Group_2_1__0__Impl"
    // InternalGuardin.g:2760:1: rule__Piano__Group_2_1__0__Impl : ( ( rule__Piano__NameAssignment_2_1_0 ) ) ;
    public final void rule__Piano__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2764:1: ( ( ( rule__Piano__NameAssignment_2_1_0 ) ) )
            // InternalGuardin.g:2765:1: ( ( rule__Piano__NameAssignment_2_1_0 ) )
            {
            // InternalGuardin.g:2765:1: ( ( rule__Piano__NameAssignment_2_1_0 ) )
            // InternalGuardin.g:2766:2: ( rule__Piano__NameAssignment_2_1_0 )
            {
             before(grammarAccess.getPianoAccess().getNameAssignment_2_1_0()); 
            // InternalGuardin.g:2767:2: ( rule__Piano__NameAssignment_2_1_0 )
            // InternalGuardin.g:2767:3: rule__Piano__NameAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Piano__NameAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPianoAccess().getNameAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_2_1__0__Impl"


    // $ANTLR start "rule__Piano__Group_2_1__1"
    // InternalGuardin.g:2775:1: rule__Piano__Group_2_1__1 : rule__Piano__Group_2_1__1__Impl ;
    public final void rule__Piano__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2779:1: ( rule__Piano__Group_2_1__1__Impl )
            // InternalGuardin.g:2780:2: rule__Piano__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Piano__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_2_1__1"


    // $ANTLR start "rule__Piano__Group_2_1__1__Impl"
    // InternalGuardin.g:2786:1: rule__Piano__Group_2_1__1__Impl : ( ':' ) ;
    public final void rule__Piano__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2790:1: ( ( ':' ) )
            // InternalGuardin.g:2791:1: ( ':' )
            {
            // InternalGuardin.g:2791:1: ( ':' )
            // InternalGuardin.g:2792:2: ':'
            {
             before(grammarAccess.getPianoAccess().getColonKeyword_2_1_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPianoAccess().getColonKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_2_1__1__Impl"


    // $ANTLR start "rule__SectionPianoLayer__Group__0"
    // InternalGuardin.g:2802:1: rule__SectionPianoLayer__Group__0 : rule__SectionPianoLayer__Group__0__Impl rule__SectionPianoLayer__Group__1 ;
    public final void rule__SectionPianoLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2806:1: ( rule__SectionPianoLayer__Group__0__Impl rule__SectionPianoLayer__Group__1 )
            // InternalGuardin.g:2807:2: rule__SectionPianoLayer__Group__0__Impl rule__SectionPianoLayer__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SectionPianoLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionPianoLayer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionPianoLayer__Group__0"


    // $ANTLR start "rule__SectionPianoLayer__Group__0__Impl"
    // InternalGuardin.g:2814:1: rule__SectionPianoLayer__Group__0__Impl : ( () ) ;
    public final void rule__SectionPianoLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2818:1: ( ( () ) )
            // InternalGuardin.g:2819:1: ( () )
            {
            // InternalGuardin.g:2819:1: ( () )
            // InternalGuardin.g:2820:2: ()
            {
             before(grammarAccess.getSectionPianoLayerAccess().getSectionLayerAction_0()); 
            // InternalGuardin.g:2821:2: ()
            // InternalGuardin.g:2821:3: 
            {
            }

             after(grammarAccess.getSectionPianoLayerAccess().getSectionLayerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionPianoLayer__Group__0__Impl"


    // $ANTLR start "rule__SectionPianoLayer__Group__1"
    // InternalGuardin.g:2829:1: rule__SectionPianoLayer__Group__1 : rule__SectionPianoLayer__Group__1__Impl rule__SectionPianoLayer__Group__2 ;
    public final void rule__SectionPianoLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2833:1: ( rule__SectionPianoLayer__Group__1__Impl rule__SectionPianoLayer__Group__2 )
            // InternalGuardin.g:2834:2: rule__SectionPianoLayer__Group__1__Impl rule__SectionPianoLayer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SectionPianoLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionPianoLayer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionPianoLayer__Group__1"


    // $ANTLR start "rule__SectionPianoLayer__Group__1__Impl"
    // InternalGuardin.g:2841:1: rule__SectionPianoLayer__Group__1__Impl : ( 'begin_section' ) ;
    public final void rule__SectionPianoLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2845:1: ( ( 'begin_section' ) )
            // InternalGuardin.g:2846:1: ( 'begin_section' )
            {
            // InternalGuardin.g:2846:1: ( 'begin_section' )
            // InternalGuardin.g:2847:2: 'begin_section'
            {
             before(grammarAccess.getSectionPianoLayerAccess().getBegin_sectionKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSectionPianoLayerAccess().getBegin_sectionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionPianoLayer__Group__1__Impl"


    // $ANTLR start "rule__SectionPianoLayer__Group__2"
    // InternalGuardin.g:2856:1: rule__SectionPianoLayer__Group__2 : rule__SectionPianoLayer__Group__2__Impl rule__SectionPianoLayer__Group__3 ;
    public final void rule__SectionPianoLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2860:1: ( rule__SectionPianoLayer__Group__2__Impl rule__SectionPianoLayer__Group__3 )
            // InternalGuardin.g:2861:2: rule__SectionPianoLayer__Group__2__Impl rule__SectionPianoLayer__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SectionPianoLayer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionPianoLayer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionPianoLayer__Group__2"


    // $ANTLR start "rule__SectionPianoLayer__Group__2__Impl"
    // InternalGuardin.g:2868:1: rule__SectionPianoLayer__Group__2__Impl : ( ( rule__SectionPianoLayer__SectionAssignment_2 ) ) ;
    public final void rule__SectionPianoLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2872:1: ( ( ( rule__SectionPianoLayer__SectionAssignment_2 ) ) )
            // InternalGuardin.g:2873:1: ( ( rule__SectionPianoLayer__SectionAssignment_2 ) )
            {
            // InternalGuardin.g:2873:1: ( ( rule__SectionPianoLayer__SectionAssignment_2 ) )
            // InternalGuardin.g:2874:2: ( rule__SectionPianoLayer__SectionAssignment_2 )
            {
             before(grammarAccess.getSectionPianoLayerAccess().getSectionAssignment_2()); 
            // InternalGuardin.g:2875:2: ( rule__SectionPianoLayer__SectionAssignment_2 )
            // InternalGuardin.g:2875:3: rule__SectionPianoLayer__SectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SectionPianoLayer__SectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionPianoLayerAccess().getSectionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionPianoLayer__Group__2__Impl"


    // $ANTLR start "rule__SectionPianoLayer__Group__3"
    // InternalGuardin.g:2883:1: rule__SectionPianoLayer__Group__3 : rule__SectionPianoLayer__Group__3__Impl rule__SectionPianoLayer__Group__4 ;
    public final void rule__SectionPianoLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2887:1: ( rule__SectionPianoLayer__Group__3__Impl rule__SectionPianoLayer__Group__4 )
            // InternalGuardin.g:2888:2: rule__SectionPianoLayer__Group__3__Impl rule__SectionPianoLayer__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__SectionPianoLayer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionPianoLayer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionPianoLayer__Group__3"


    // $ANTLR start "rule__SectionPianoLayer__Group__3__Impl"
    // InternalGuardin.g:2895:1: rule__SectionPianoLayer__Group__3__Impl : ( ( ( rule__SectionPianoLayer__LayersAssignment_3 ) ) ( ( rule__SectionPianoLayer__LayersAssignment_3 )* ) ) ;
    public final void rule__SectionPianoLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2899:1: ( ( ( ( rule__SectionPianoLayer__LayersAssignment_3 ) ) ( ( rule__SectionPianoLayer__LayersAssignment_3 )* ) ) )
            // InternalGuardin.g:2900:1: ( ( ( rule__SectionPianoLayer__LayersAssignment_3 ) ) ( ( rule__SectionPianoLayer__LayersAssignment_3 )* ) )
            {
            // InternalGuardin.g:2900:1: ( ( ( rule__SectionPianoLayer__LayersAssignment_3 ) ) ( ( rule__SectionPianoLayer__LayersAssignment_3 )* ) )
            // InternalGuardin.g:2901:2: ( ( rule__SectionPianoLayer__LayersAssignment_3 ) ) ( ( rule__SectionPianoLayer__LayersAssignment_3 )* )
            {
            // InternalGuardin.g:2901:2: ( ( rule__SectionPianoLayer__LayersAssignment_3 ) )
            // InternalGuardin.g:2902:3: ( rule__SectionPianoLayer__LayersAssignment_3 )
            {
             before(grammarAccess.getSectionPianoLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2903:3: ( rule__SectionPianoLayer__LayersAssignment_3 )
            // InternalGuardin.g:2903:4: rule__SectionPianoLayer__LayersAssignment_3
            {
            pushFollow(FOLLOW_21);
            rule__SectionPianoLayer__LayersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionPianoLayerAccess().getLayersAssignment_3()); 

            }

            // InternalGuardin.g:2906:2: ( ( rule__SectionPianoLayer__LayersAssignment_3 )* )
            // InternalGuardin.g:2907:3: ( rule__SectionPianoLayer__LayersAssignment_3 )*
            {
             before(grammarAccess.getSectionPianoLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2908:3: ( rule__SectionPianoLayer__LayersAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGuardin.g:2908:4: rule__SectionPianoLayer__LayersAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SectionPianoLayer__LayersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getSectionPianoLayerAccess().getLayersAssignment_3()); 

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
    // $ANTLR end "rule__SectionPianoLayer__Group__3__Impl"


    // $ANTLR start "rule__SectionPianoLayer__Group__4"
    // InternalGuardin.g:2917:1: rule__SectionPianoLayer__Group__4 : rule__SectionPianoLayer__Group__4__Impl ;
    public final void rule__SectionPianoLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2921:1: ( rule__SectionPianoLayer__Group__4__Impl )
            // InternalGuardin.g:2922:2: rule__SectionPianoLayer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SectionPianoLayer__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionPianoLayer__Group__4"


    // $ANTLR start "rule__SectionPianoLayer__Group__4__Impl"
    // InternalGuardin.g:2928:1: rule__SectionPianoLayer__Group__4__Impl : ( 'end_section' ) ;
    public final void rule__SectionPianoLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2932:1: ( ( 'end_section' ) )
            // InternalGuardin.g:2933:1: ( 'end_section' )
            {
            // InternalGuardin.g:2933:1: ( 'end_section' )
            // InternalGuardin.g:2934:2: 'end_section'
            {
             before(grammarAccess.getSectionPianoLayerAccess().getEnd_sectionKeyword_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSectionPianoLayerAccess().getEnd_sectionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionPianoLayer__Group__4__Impl"


    // $ANTLR start "rule__PianoLayer__Group__0"
    // InternalGuardin.g:2944:1: rule__PianoLayer__Group__0 : rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1 ;
    public final void rule__PianoLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2948:1: ( rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1 )
            // InternalGuardin.g:2949:2: rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__PianoLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PianoLayer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoLayer__Group__0"


    // $ANTLR start "rule__PianoLayer__Group__0__Impl"
    // InternalGuardin.g:2956:1: rule__PianoLayer__Group__0__Impl : ( () ) ;
    public final void rule__PianoLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2960:1: ( ( () ) )
            // InternalGuardin.g:2961:1: ( () )
            {
            // InternalGuardin.g:2961:1: ( () )
            // InternalGuardin.g:2962:2: ()
            {
             before(grammarAccess.getPianoLayerAccess().getLayerAction_0()); 
            // InternalGuardin.g:2963:2: ()
            // InternalGuardin.g:2963:3: 
            {
            }

             after(grammarAccess.getPianoLayerAccess().getLayerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoLayer__Group__0__Impl"


    // $ANTLR start "rule__PianoLayer__Group__1"
    // InternalGuardin.g:2971:1: rule__PianoLayer__Group__1 : rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2 ;
    public final void rule__PianoLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2975:1: ( rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2 )
            // InternalGuardin.g:2976:2: rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__PianoLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PianoLayer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoLayer__Group__1"


    // $ANTLR start "rule__PianoLayer__Group__1__Impl"
    // InternalGuardin.g:2983:1: rule__PianoLayer__Group__1__Impl : ( 'layer:' ) ;
    public final void rule__PianoLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2987:1: ( ( 'layer:' ) )
            // InternalGuardin.g:2988:1: ( 'layer:' )
            {
            // InternalGuardin.g:2988:1: ( 'layer:' )
            // InternalGuardin.g:2989:2: 'layer:'
            {
             before(grammarAccess.getPianoLayerAccess().getLayerKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPianoLayerAccess().getLayerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoLayer__Group__1__Impl"


    // $ANTLR start "rule__PianoLayer__Group__2"
    // InternalGuardin.g:2998:1: rule__PianoLayer__Group__2 : rule__PianoLayer__Group__2__Impl ;
    public final void rule__PianoLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3002:1: ( rule__PianoLayer__Group__2__Impl )
            // InternalGuardin.g:3003:2: rule__PianoLayer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PianoLayer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoLayer__Group__2"


    // $ANTLR start "rule__PianoLayer__Group__2__Impl"
    // InternalGuardin.g:3009:1: rule__PianoLayer__Group__2__Impl : ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) ) ;
    public final void rule__PianoLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3013:1: ( ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:3014:1: ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:3014:1: ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) )
            // InternalGuardin.g:3015:2: ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:3015:2: ( ( rule__PianoLayer__NotesAssignment_2 ) )
            // InternalGuardin.g:3016:3: ( rule__PianoLayer__NotesAssignment_2 )
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:3017:3: ( rule__PianoLayer__NotesAssignment_2 )
            // InternalGuardin.g:3017:4: rule__PianoLayer__NotesAssignment_2
            {
            pushFollow(FOLLOW_32);
            rule__PianoLayer__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:3020:2: ( ( rule__PianoLayer__NotesAssignment_2 )* )
            // InternalGuardin.g:3021:3: ( rule__PianoLayer__NotesAssignment_2 )*
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:3022:3: ( rule__PianoLayer__NotesAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=29 && LA26_0<=35)||LA26_0==45||LA26_0==50) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGuardin.g:3022:4: rule__PianoLayer__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__PianoLayer__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 

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
    // $ANTLR end "rule__PianoLayer__Group__2__Impl"


    // $ANTLR start "rule__PianoNote__Group__0"
    // InternalGuardin.g:3032:1: rule__PianoNote__Group__0 : rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1 ;
    public final void rule__PianoNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3036:1: ( rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1 )
            // InternalGuardin.g:3037:2: rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__PianoNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PianoNote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group__0"


    // $ANTLR start "rule__PianoNote__Group__0__Impl"
    // InternalGuardin.g:3044:1: rule__PianoNote__Group__0__Impl : ( () ) ;
    public final void rule__PianoNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3048:1: ( ( () ) )
            // InternalGuardin.g:3049:1: ( () )
            {
            // InternalGuardin.g:3049:1: ( () )
            // InternalGuardin.g:3050:2: ()
            {
             before(grammarAccess.getPianoNoteAccess().getPianoNoteAction_0()); 
            // InternalGuardin.g:3051:2: ()
            // InternalGuardin.g:3051:3: 
            {
            }

             after(grammarAccess.getPianoNoteAccess().getPianoNoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group__0__Impl"


    // $ANTLR start "rule__PianoNote__Group__1"
    // InternalGuardin.g:3059:1: rule__PianoNote__Group__1 : rule__PianoNote__Group__1__Impl rule__PianoNote__Group__2 ;
    public final void rule__PianoNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3063:1: ( rule__PianoNote__Group__1__Impl rule__PianoNote__Group__2 )
            // InternalGuardin.g:3064:2: rule__PianoNote__Group__1__Impl rule__PianoNote__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__PianoNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PianoNote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group__1"


    // $ANTLR start "rule__PianoNote__Group__1__Impl"
    // InternalGuardin.g:3071:1: rule__PianoNote__Group__1__Impl : ( ( rule__PianoNote__NoteTypeAssignment_1 ) ) ;
    public final void rule__PianoNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3075:1: ( ( ( rule__PianoNote__NoteTypeAssignment_1 ) ) )
            // InternalGuardin.g:3076:1: ( ( rule__PianoNote__NoteTypeAssignment_1 ) )
            {
            // InternalGuardin.g:3076:1: ( ( rule__PianoNote__NoteTypeAssignment_1 ) )
            // InternalGuardin.g:3077:2: ( rule__PianoNote__NoteTypeAssignment_1 )
            {
             before(grammarAccess.getPianoNoteAccess().getNoteTypeAssignment_1()); 
            // InternalGuardin.g:3078:2: ( rule__PianoNote__NoteTypeAssignment_1 )
            // InternalGuardin.g:3078:3: rule__PianoNote__NoteTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PianoNote__NoteTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPianoNoteAccess().getNoteTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group__1__Impl"


    // $ANTLR start "rule__PianoNote__Group__2"
    // InternalGuardin.g:3086:1: rule__PianoNote__Group__2 : rule__PianoNote__Group__2__Impl ;
    public final void rule__PianoNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3090:1: ( rule__PianoNote__Group__2__Impl )
            // InternalGuardin.g:3091:2: rule__PianoNote__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PianoNote__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group__2"


    // $ANTLR start "rule__PianoNote__Group__2__Impl"
    // InternalGuardin.g:3097:1: rule__PianoNote__Group__2__Impl : ( ( rule__PianoNote__Alternatives_2 )? ) ;
    public final void rule__PianoNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3101:1: ( ( ( rule__PianoNote__Alternatives_2 )? ) )
            // InternalGuardin.g:3102:1: ( ( rule__PianoNote__Alternatives_2 )? )
            {
            // InternalGuardin.g:3102:1: ( ( rule__PianoNote__Alternatives_2 )? )
            // InternalGuardin.g:3103:2: ( rule__PianoNote__Alternatives_2 )?
            {
             before(grammarAccess.getPianoNoteAccess().getAlternatives_2()); 
            // InternalGuardin.g:3104:2: ( rule__PianoNote__Alternatives_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=54 && LA27_0<=55)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGuardin.g:3104:3: rule__PianoNote__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PianoNote__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPianoNoteAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group__2__Impl"


    // $ANTLR start "rule__PianoNote__Group_2_0__0"
    // InternalGuardin.g:3113:1: rule__PianoNote__Group_2_0__0 : rule__PianoNote__Group_2_0__0__Impl rule__PianoNote__Group_2_0__1 ;
    public final void rule__PianoNote__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3117:1: ( rule__PianoNote__Group_2_0__0__Impl rule__PianoNote__Group_2_0__1 )
            // InternalGuardin.g:3118:2: rule__PianoNote__Group_2_0__0__Impl rule__PianoNote__Group_2_0__1
            {
            pushFollow(FOLLOW_35);
            rule__PianoNote__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PianoNote__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2_0__0"


    // $ANTLR start "rule__PianoNote__Group_2_0__0__Impl"
    // InternalGuardin.g:3125:1: rule__PianoNote__Group_2_0__0__Impl : ( '/' ) ;
    public final void rule__PianoNote__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3129:1: ( ( '/' ) )
            // InternalGuardin.g:3130:1: ( '/' )
            {
            // InternalGuardin.g:3130:1: ( '/' )
            // InternalGuardin.g:3131:2: '/'
            {
             before(grammarAccess.getPianoNoteAccess().getSolidusKeyword_2_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPianoNoteAccess().getSolidusKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2_0__0__Impl"


    // $ANTLR start "rule__PianoNote__Group_2_0__1"
    // InternalGuardin.g:3140:1: rule__PianoNote__Group_2_0__1 : rule__PianoNote__Group_2_0__1__Impl ;
    public final void rule__PianoNote__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3144:1: ( rule__PianoNote__Group_2_0__1__Impl )
            // InternalGuardin.g:3145:2: rule__PianoNote__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PianoNote__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2_0__1"


    // $ANTLR start "rule__PianoNote__Group_2_0__1__Impl"
    // InternalGuardin.g:3151:1: rule__PianoNote__Group_2_0__1__Impl : ( ( rule__PianoNote__OctaveOffsetAssignment_2_0_1 ) ) ;
    public final void rule__PianoNote__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3155:1: ( ( ( rule__PianoNote__OctaveOffsetAssignment_2_0_1 ) ) )
            // InternalGuardin.g:3156:1: ( ( rule__PianoNote__OctaveOffsetAssignment_2_0_1 ) )
            {
            // InternalGuardin.g:3156:1: ( ( rule__PianoNote__OctaveOffsetAssignment_2_0_1 ) )
            // InternalGuardin.g:3157:2: ( rule__PianoNote__OctaveOffsetAssignment_2_0_1 )
            {
             before(grammarAccess.getPianoNoteAccess().getOctaveOffsetAssignment_2_0_1()); 
            // InternalGuardin.g:3158:2: ( rule__PianoNote__OctaveOffsetAssignment_2_0_1 )
            // InternalGuardin.g:3158:3: rule__PianoNote__OctaveOffsetAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PianoNote__OctaveOffsetAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPianoNoteAccess().getOctaveOffsetAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2_0__1__Impl"


    // $ANTLR start "rule__PianoNote__Group_2_1__0"
    // InternalGuardin.g:3167:1: rule__PianoNote__Group_2_1__0 : rule__PianoNote__Group_2_1__0__Impl rule__PianoNote__Group_2_1__1 ;
    public final void rule__PianoNote__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3171:1: ( rule__PianoNote__Group_2_1__0__Impl rule__PianoNote__Group_2_1__1 )
            // InternalGuardin.g:3172:2: rule__PianoNote__Group_2_1__0__Impl rule__PianoNote__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__PianoNote__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PianoNote__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2_1__0"


    // $ANTLR start "rule__PianoNote__Group_2_1__0__Impl"
    // InternalGuardin.g:3179:1: rule__PianoNote__Group_2_1__0__Impl : ( '|' ) ;
    public final void rule__PianoNote__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3183:1: ( ( '|' ) )
            // InternalGuardin.g:3184:1: ( '|' )
            {
            // InternalGuardin.g:3184:1: ( '|' )
            // InternalGuardin.g:3185:2: '|'
            {
             before(grammarAccess.getPianoNoteAccess().getVerticalLineKeyword_2_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPianoNoteAccess().getVerticalLineKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2_1__0__Impl"


    // $ANTLR start "rule__PianoNote__Group_2_1__1"
    // InternalGuardin.g:3194:1: rule__PianoNote__Group_2_1__1 : rule__PianoNote__Group_2_1__1__Impl ;
    public final void rule__PianoNote__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3198:1: ( rule__PianoNote__Group_2_1__1__Impl )
            // InternalGuardin.g:3199:2: rule__PianoNote__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PianoNote__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2_1__1"


    // $ANTLR start "rule__PianoNote__Group_2_1__1__Impl"
    // InternalGuardin.g:3205:1: rule__PianoNote__Group_2_1__1__Impl : ( ( rule__PianoNote__OctaveAbsoluteAssignment_2_1_1 ) ) ;
    public final void rule__PianoNote__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3209:1: ( ( ( rule__PianoNote__OctaveAbsoluteAssignment_2_1_1 ) ) )
            // InternalGuardin.g:3210:1: ( ( rule__PianoNote__OctaveAbsoluteAssignment_2_1_1 ) )
            {
            // InternalGuardin.g:3210:1: ( ( rule__PianoNote__OctaveAbsoluteAssignment_2_1_1 ) )
            // InternalGuardin.g:3211:2: ( rule__PianoNote__OctaveAbsoluteAssignment_2_1_1 )
            {
             before(grammarAccess.getPianoNoteAccess().getOctaveAbsoluteAssignment_2_1_1()); 
            // InternalGuardin.g:3212:2: ( rule__PianoNote__OctaveAbsoluteAssignment_2_1_1 )
            // InternalGuardin.g:3212:3: rule__PianoNote__OctaveAbsoluteAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PianoNote__OctaveAbsoluteAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPianoNoteAccess().getOctaveAbsoluteAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2_1__1__Impl"


    // $ANTLR start "rule__CompositePianoNote__Group__0"
    // InternalGuardin.g:3221:1: rule__CompositePianoNote__Group__0 : rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1 ;
    public final void rule__CompositePianoNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3225:1: ( rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1 )
            // InternalGuardin.g:3226:2: rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__CompositePianoNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositePianoNote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__Group__0"


    // $ANTLR start "rule__CompositePianoNote__Group__0__Impl"
    // InternalGuardin.g:3233:1: rule__CompositePianoNote__Group__0__Impl : ( () ) ;
    public final void rule__CompositePianoNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3237:1: ( ( () ) )
            // InternalGuardin.g:3238:1: ( () )
            {
            // InternalGuardin.g:3238:1: ( () )
            // InternalGuardin.g:3239:2: ()
            {
             before(grammarAccess.getCompositePianoNoteAccess().getCompositeNoteAction_0()); 
            // InternalGuardin.g:3240:2: ()
            // InternalGuardin.g:3240:3: 
            {
            }

             after(grammarAccess.getCompositePianoNoteAccess().getCompositeNoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__Group__0__Impl"


    // $ANTLR start "rule__CompositePianoNote__Group__1"
    // InternalGuardin.g:3248:1: rule__CompositePianoNote__Group__1 : rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2 ;
    public final void rule__CompositePianoNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3252:1: ( rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2 )
            // InternalGuardin.g:3253:2: rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__CompositePianoNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositePianoNote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__Group__1"


    // $ANTLR start "rule__CompositePianoNote__Group__1__Impl"
    // InternalGuardin.g:3260:1: rule__CompositePianoNote__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositePianoNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3264:1: ( ( '(' ) )
            // InternalGuardin.g:3265:1: ( '(' )
            {
            // InternalGuardin.g:3265:1: ( '(' )
            // InternalGuardin.g:3266:2: '('
            {
             before(grammarAccess.getCompositePianoNoteAccess().getLeftParenthesisKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCompositePianoNoteAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__Group__1__Impl"


    // $ANTLR start "rule__CompositePianoNote__Group__2"
    // InternalGuardin.g:3275:1: rule__CompositePianoNote__Group__2 : rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3 ;
    public final void rule__CompositePianoNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3279:1: ( rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3 )
            // InternalGuardin.g:3280:2: rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__CompositePianoNote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositePianoNote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__Group__2"


    // $ANTLR start "rule__CompositePianoNote__Group__2__Impl"
    // InternalGuardin.g:3287:1: rule__CompositePianoNote__Group__2__Impl : ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) ) ;
    public final void rule__CompositePianoNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3291:1: ( ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:3292:1: ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:3292:1: ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) )
            // InternalGuardin.g:3293:2: ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:3293:2: ( ( rule__CompositePianoNote__NotesAssignment_2 ) )
            // InternalGuardin.g:3294:3: ( rule__CompositePianoNote__NotesAssignment_2 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:3295:3: ( rule__CompositePianoNote__NotesAssignment_2 )
            // InternalGuardin.g:3295:4: rule__CompositePianoNote__NotesAssignment_2
            {
            pushFollow(FOLLOW_37);
            rule__CompositePianoNote__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:3298:2: ( ( rule__CompositePianoNote__NotesAssignment_2 )* )
            // InternalGuardin.g:3299:3: ( rule__CompositePianoNote__NotesAssignment_2 )*
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:3300:3: ( rule__CompositePianoNote__NotesAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=29 && LA28_0<=35)||LA28_0==45) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGuardin.g:3300:4: rule__CompositePianoNote__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__CompositePianoNote__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 

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
    // $ANTLR end "rule__CompositePianoNote__Group__2__Impl"


    // $ANTLR start "rule__CompositePianoNote__Group__3"
    // InternalGuardin.g:3309:1: rule__CompositePianoNote__Group__3 : rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4 ;
    public final void rule__CompositePianoNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3313:1: ( rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4 )
            // InternalGuardin.g:3314:2: rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__CompositePianoNote__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositePianoNote__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__Group__3"


    // $ANTLR start "rule__CompositePianoNote__Group__3__Impl"
    // InternalGuardin.g:3321:1: rule__CompositePianoNote__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositePianoNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3325:1: ( ( ')' ) )
            // InternalGuardin.g:3326:1: ( ')' )
            {
            // InternalGuardin.g:3326:1: ( ')' )
            // InternalGuardin.g:3327:2: ')'
            {
             before(grammarAccess.getCompositePianoNoteAccess().getRightParenthesisKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCompositePianoNoteAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__Group__3__Impl"


    // $ANTLR start "rule__CompositePianoNote__Group__4"
    // InternalGuardin.g:3336:1: rule__CompositePianoNote__Group__4 : rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5 ;
    public final void rule__CompositePianoNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3340:1: ( rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5 )
            // InternalGuardin.g:3341:2: rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__CompositePianoNote__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositePianoNote__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__Group__4"


    // $ANTLR start "rule__CompositePianoNote__Group__4__Impl"
    // InternalGuardin.g:3348:1: rule__CompositePianoNote__Group__4__Impl : ( 'x' ) ;
    public final void rule__CompositePianoNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3352:1: ( ( 'x' ) )
            // InternalGuardin.g:3353:1: ( 'x' )
            {
            // InternalGuardin.g:3353:1: ( 'x' )
            // InternalGuardin.g:3354:2: 'x'
            {
             before(grammarAccess.getCompositePianoNoteAccess().getXKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCompositePianoNoteAccess().getXKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__Group__4__Impl"


    // $ANTLR start "rule__CompositePianoNote__Group__5"
    // InternalGuardin.g:3363:1: rule__CompositePianoNote__Group__5 : rule__CompositePianoNote__Group__5__Impl ;
    public final void rule__CompositePianoNote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3367:1: ( rule__CompositePianoNote__Group__5__Impl )
            // InternalGuardin.g:3368:2: rule__CompositePianoNote__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositePianoNote__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__Group__5"


    // $ANTLR start "rule__CompositePianoNote__Group__5__Impl"
    // InternalGuardin.g:3374:1: rule__CompositePianoNote__Group__5__Impl : ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) ) ;
    public final void rule__CompositePianoNote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3378:1: ( ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) ) )
            // InternalGuardin.g:3379:1: ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) )
            {
            // InternalGuardin.g:3379:1: ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) )
            // InternalGuardin.g:3380:2: ( rule__CompositePianoNote__RepeatsAssignment_5 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getRepeatsAssignment_5()); 
            // InternalGuardin.g:3381:2: ( rule__CompositePianoNote__RepeatsAssignment_5 )
            // InternalGuardin.g:3381:3: rule__CompositePianoNote__RepeatsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CompositePianoNote__RepeatsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCompositePianoNoteAccess().getRepeatsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__Group__5__Impl"


    // $ANTLR start "rule__ERelativeInt__Group__0"
    // InternalGuardin.g:3390:1: rule__ERelativeInt__Group__0 : rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1 ;
    public final void rule__ERelativeInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3394:1: ( rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1 )
            // InternalGuardin.g:3395:2: rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ERelativeInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERelativeInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERelativeInt__Group__0"


    // $ANTLR start "rule__ERelativeInt__Group__0__Impl"
    // InternalGuardin.g:3402:1: rule__ERelativeInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ERelativeInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3406:1: ( ( ( '-' )? ) )
            // InternalGuardin.g:3407:1: ( ( '-' )? )
            {
            // InternalGuardin.g:3407:1: ( ( '-' )? )
            // InternalGuardin.g:3408:2: ( '-' )?
            {
             before(grammarAccess.getERelativeIntAccess().getHyphenMinusKeyword_0()); 
            // InternalGuardin.g:3409:2: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGuardin.g:3409:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getERelativeIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERelativeInt__Group__0__Impl"


    // $ANTLR start "rule__ERelativeInt__Group__1"
    // InternalGuardin.g:3417:1: rule__ERelativeInt__Group__1 : rule__ERelativeInt__Group__1__Impl ;
    public final void rule__ERelativeInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3421:1: ( rule__ERelativeInt__Group__1__Impl )
            // InternalGuardin.g:3422:2: rule__ERelativeInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERelativeInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERelativeInt__Group__1"


    // $ANTLR start "rule__ERelativeInt__Group__1__Impl"
    // InternalGuardin.g:3428:1: rule__ERelativeInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ERelativeInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3432:1: ( ( RULE_INT ) )
            // InternalGuardin.g:3433:1: ( RULE_INT )
            {
            // InternalGuardin.g:3433:1: ( RULE_INT )
            // InternalGuardin.g:3434:2: RULE_INT
            {
             before(grammarAccess.getERelativeIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getERelativeIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERelativeInt__Group__1__Impl"


    // $ANTLR start "rule__Music__SoundBankPathAssignment_1_2"
    // InternalGuardin.g:3444:1: rule__Music__SoundBankPathAssignment_1_2 : ( ruleEString ) ;
    public final void rule__Music__SoundBankPathAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3448:1: ( ( ruleEString ) )
            // InternalGuardin.g:3449:2: ( ruleEString )
            {
            // InternalGuardin.g:3449:2: ( ruleEString )
            // InternalGuardin.g:3450:3: ruleEString
            {
             before(grammarAccess.getMusicAccess().getSoundBankPathEStringParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getSoundBankPathEStringParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__SoundBankPathAssignment_1_2"


    // $ANTLR start "rule__Music__NameAssignment_3"
    // InternalGuardin.g:3459:1: rule__Music__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Music__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3463:1: ( ( ruleEString ) )
            // InternalGuardin.g:3464:2: ( ruleEString )
            {
            // InternalGuardin.g:3464:2: ( ruleEString )
            // InternalGuardin.g:3465:3: ruleEString
            {
             before(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__NameAssignment_3"


    // $ANTLR start "rule__Music__SectionsAssignment_7"
    // InternalGuardin.g:3474:1: rule__Music__SectionsAssignment_7 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3478:1: ( ( ruleSection ) )
            // InternalGuardin.g:3479:2: ( ruleSection )
            {
            // InternalGuardin.g:3479:2: ( ruleSection )
            // InternalGuardin.g:3480:3: ruleSection
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


    // $ANTLR start "rule__Music__SectionsAssignment_8"
    // InternalGuardin.g:3489:1: rule__Music__SectionsAssignment_8 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3493:1: ( ( ruleSection ) )
            // InternalGuardin.g:3494:2: ( ruleSection )
            {
            // InternalGuardin.g:3494:2: ( ruleSection )
            // InternalGuardin.g:3495:3: ruleSection
            {
             before(grammarAccess.getMusicAccess().getSectionsSectionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getSectionsSectionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__SectionsAssignment_8"


    // $ANTLR start "rule__Music__TracksAssignment_11_1"
    // InternalGuardin.g:3504:1: rule__Music__TracksAssignment_11_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3508:1: ( ( ruleTrack ) )
            // InternalGuardin.g:3509:2: ( ruleTrack )
            {
            // InternalGuardin.g:3509:2: ( ruleTrack )
            // InternalGuardin.g:3510:3: ruleTrack
            {
             before(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__TracksAssignment_11_1"


    // $ANTLR start "rule__Music__TracksAssignment_11_2_1"
    // InternalGuardin.g:3519:1: rule__Music__TracksAssignment_11_2_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3523:1: ( ( ruleTrack ) )
            // InternalGuardin.g:3524:2: ( ruleTrack )
            {
            // InternalGuardin.g:3524:2: ( ruleTrack )
            // InternalGuardin.g:3525:3: ruleTrack
            {
             before(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_11_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_11_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__TracksAssignment_11_2_1"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalGuardin.g:3534:1: rule__Section__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3538:1: ( ( ruleEString ) )
            // InternalGuardin.g:3539:2: ( ruleEString )
            {
            // InternalGuardin.g:3539:2: ( ruleEString )
            // InternalGuardin.g:3540:3: ruleEString
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
    // InternalGuardin.g:3549:1: rule__Section__TempoAssignment_4 : ( ruleEInt ) ;
    public final void rule__Section__TempoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3553:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3554:2: ( ruleEInt )
            {
            // InternalGuardin.g:3554:2: ( ruleEInt )
            // InternalGuardin.g:3555:3: ruleEInt
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
    // InternalGuardin.g:3564:1: rule__Section__SignatureAssignment_6 : ( ruleEInt ) ;
    public final void rule__Section__SignatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3568:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3569:2: ( ruleEInt )
            {
            // InternalGuardin.g:3569:2: ( ruleEInt )
            // InternalGuardin.g:3570:3: ruleEInt
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
    // InternalGuardin.g:3579:1: rule__Section__BarsAssignment_8 : ( ruleEInt ) ;
    public final void rule__Section__BarsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3583:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3584:2: ( ruleEInt )
            {
            // InternalGuardin.g:3584:2: ( ruleEInt )
            // InternalGuardin.g:3585:3: ruleEInt
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
    // InternalGuardin.g:3594:1: rule__Track__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Track__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3598:1: ( ( ruleEString ) )
            // InternalGuardin.g:3599:2: ( ruleEString )
            {
            // InternalGuardin.g:3599:2: ( ruleEString )
            // InternalGuardin.g:3600:3: ruleEString
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


    // $ANTLR start "rule__Track__InstrumentAssignment_2"
    // InternalGuardin.g:3609:1: rule__Track__InstrumentAssignment_2 : ( ruleInstrument ) ;
    public final void rule__Track__InstrumentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3613:1: ( ( ruleInstrument ) )
            // InternalGuardin.g:3614:2: ( ruleInstrument )
            {
            // InternalGuardin.g:3614:2: ( ruleInstrument )
            // InternalGuardin.g:3615:3: ruleInstrument
            {
             before(grammarAccess.getTrackAccess().getInstrumentInstrumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstrument();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getInstrumentInstrumentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__InstrumentAssignment_2"


    // $ANTLR start "rule__Battery__NameAssignment_2_1_0"
    // InternalGuardin.g:3624:1: rule__Battery__NameAssignment_2_1_0 : ( ruleEString ) ;
    public final void rule__Battery__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3628:1: ( ( ruleEString ) )
            // InternalGuardin.g:3629:2: ( ruleEString )
            {
            // InternalGuardin.g:3629:2: ( ruleEString )
            // InternalGuardin.g:3630:3: ruleEString
            {
             before(grammarAccess.getBatteryAccess().getNameEStringParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBatteryAccess().getNameEStringParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__NameAssignment_2_1_0"


    // $ANTLR start "rule__Battery__SectionsAssignment_3_0"
    // InternalGuardin.g:3639:1: rule__Battery__SectionsAssignment_3_0 : ( ruleSectionBatteryLayer ) ;
    public final void rule__Battery__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3643:1: ( ( ruleSectionBatteryLayer ) )
            // InternalGuardin.g:3644:2: ( ruleSectionBatteryLayer )
            {
            // InternalGuardin.g:3644:2: ( ruleSectionBatteryLayer )
            // InternalGuardin.g:3645:3: ruleSectionBatteryLayer
            {
             before(grammarAccess.getBatteryAccess().getSectionsSectionBatteryLayerParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSectionBatteryLayer();

            state._fsp--;

             after(grammarAccess.getBatteryAccess().getSectionsSectionBatteryLayerParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__SectionsAssignment_3_0"


    // $ANTLR start "rule__Battery__LayersAssignment_3_1"
    // InternalGuardin.g:3654:1: rule__Battery__LayersAssignment_3_1 : ( ruleBatteryLayer ) ;
    public final void rule__Battery__LayersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3658:1: ( ( ruleBatteryLayer ) )
            // InternalGuardin.g:3659:2: ( ruleBatteryLayer )
            {
            // InternalGuardin.g:3659:2: ( ruleBatteryLayer )
            // InternalGuardin.g:3660:3: ruleBatteryLayer
            {
             before(grammarAccess.getBatteryAccess().getLayersBatteryLayerParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBatteryLayer();

            state._fsp--;

             after(grammarAccess.getBatteryAccess().getLayersBatteryLayerParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__LayersAssignment_3_1"


    // $ANTLR start "rule__SectionBatteryLayer__SectionAssignment_2"
    // InternalGuardin.g:3669:1: rule__SectionBatteryLayer__SectionAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__SectionBatteryLayer__SectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3673:1: ( ( ( ruleEString ) ) )
            // InternalGuardin.g:3674:2: ( ( ruleEString ) )
            {
            // InternalGuardin.g:3674:2: ( ( ruleEString ) )
            // InternalGuardin.g:3675:3: ( ruleEString )
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getSectionSectionCrossReference_2_0()); 
            // InternalGuardin.g:3676:3: ( ruleEString )
            // InternalGuardin.g:3677:4: ruleEString
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getSectionSectionEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionBatteryLayerAccess().getSectionSectionEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSectionBatteryLayerAccess().getSectionSectionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionBatteryLayer__SectionAssignment_2"


    // $ANTLR start "rule__SectionBatteryLayer__LayersAssignment_3"
    // InternalGuardin.g:3688:1: rule__SectionBatteryLayer__LayersAssignment_3 : ( ruleBatteryLayer ) ;
    public final void rule__SectionBatteryLayer__LayersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3692:1: ( ( ruleBatteryLayer ) )
            // InternalGuardin.g:3693:2: ( ruleBatteryLayer )
            {
            // InternalGuardin.g:3693:2: ( ruleBatteryLayer )
            // InternalGuardin.g:3694:3: ruleBatteryLayer
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getLayersBatteryLayerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBatteryLayer();

            state._fsp--;

             after(grammarAccess.getSectionBatteryLayerAccess().getLayersBatteryLayerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionBatteryLayer__LayersAssignment_3"


    // $ANTLR start "rule__BatteryLayer__NotesAssignment_2"
    // InternalGuardin.g:3703:1: rule__BatteryLayer__NotesAssignment_2 : ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) ) ;
    public final void rule__BatteryLayer__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3707:1: ( ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3708:2: ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3708:2: ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3709:3: ( rule__BatteryLayer__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3710:3: ( rule__BatteryLayer__NotesAlternatives_2_0 )
            // InternalGuardin.g:3710:4: rule__BatteryLayer__NotesAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__BatteryLayer__NotesAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBatteryLayerAccess().getNotesAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryLayer__NotesAssignment_2"


    // $ANTLR start "rule__BatteryNote__NoteTypeAssignment_1"
    // InternalGuardin.g:3718:1: rule__BatteryNote__NoteTypeAssignment_1 : ( ruleBatteryNoteType ) ;
    public final void rule__BatteryNote__NoteTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3722:1: ( ( ruleBatteryNoteType ) )
            // InternalGuardin.g:3723:2: ( ruleBatteryNoteType )
            {
            // InternalGuardin.g:3723:2: ( ruleBatteryNoteType )
            // InternalGuardin.g:3724:3: ruleBatteryNoteType
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


    // $ANTLR start "rule__CompositeBatteryNote__NotesAssignment_2"
    // InternalGuardin.g:3733:1: rule__CompositeBatteryNote__NotesAssignment_2 : ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) ) ;
    public final void rule__CompositeBatteryNote__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3737:1: ( ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3738:2: ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3738:2: ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3739:3: ( rule__CompositeBatteryNote__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3740:3: ( rule__CompositeBatteryNote__NotesAlternatives_2_0 )
            // InternalGuardin.g:3740:4: rule__CompositeBatteryNote__NotesAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeBatteryNote__NotesAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeBatteryNoteAccess().getNotesAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__NotesAssignment_2"


    // $ANTLR start "rule__CompositeBatteryNote__RepeatsAssignment_5"
    // InternalGuardin.g:3748:1: rule__CompositeBatteryNote__RepeatsAssignment_5 : ( ruleEInt ) ;
    public final void rule__CompositeBatteryNote__RepeatsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3752:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3753:2: ( ruleEInt )
            {
            // InternalGuardin.g:3753:2: ( ruleEInt )
            // InternalGuardin.g:3754:3: ruleEInt
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getRepeatsEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCompositeBatteryNoteAccess().getRepeatsEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeBatteryNote__RepeatsAssignment_5"


    // $ANTLR start "rule__Piano__InstrumentAssignment_1_1"
    // InternalGuardin.g:3763:1: rule__Piano__InstrumentAssignment_1_1 : ( ruleInstruments ) ;
    public final void rule__Piano__InstrumentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3767:1: ( ( ruleInstruments ) )
            // InternalGuardin.g:3768:2: ( ruleInstruments )
            {
            // InternalGuardin.g:3768:2: ( ruleInstruments )
            // InternalGuardin.g:3769:3: ruleInstruments
            {
             before(grammarAccess.getPianoAccess().getInstrumentInstrumentsEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruments();

            state._fsp--;

             after(grammarAccess.getPianoAccess().getInstrumentInstrumentsEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__InstrumentAssignment_1_1"


    // $ANTLR start "rule__Piano__OtherAssignment_1_2_1"
    // InternalGuardin.g:3778:1: rule__Piano__OtherAssignment_1_2_1 : ( ruleEString ) ;
    public final void rule__Piano__OtherAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3782:1: ( ( ruleEString ) )
            // InternalGuardin.g:3783:2: ( ruleEString )
            {
            // InternalGuardin.g:3783:2: ( ruleEString )
            // InternalGuardin.g:3784:3: ruleEString
            {
             before(grammarAccess.getPianoAccess().getOtherEStringParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPianoAccess().getOtherEStringParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__OtherAssignment_1_2_1"


    // $ANTLR start "rule__Piano__NameAssignment_2_1_0"
    // InternalGuardin.g:3793:1: rule__Piano__NameAssignment_2_1_0 : ( ruleEString ) ;
    public final void rule__Piano__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3797:1: ( ( ruleEString ) )
            // InternalGuardin.g:3798:2: ( ruleEString )
            {
            // InternalGuardin.g:3798:2: ( ruleEString )
            // InternalGuardin.g:3799:3: ruleEString
            {
             before(grammarAccess.getPianoAccess().getNameEStringParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPianoAccess().getNameEStringParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__NameAssignment_2_1_0"


    // $ANTLR start "rule__Piano__SectionsAssignment_3_0"
    // InternalGuardin.g:3808:1: rule__Piano__SectionsAssignment_3_0 : ( ruleSectionPianoLayer ) ;
    public final void rule__Piano__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3812:1: ( ( ruleSectionPianoLayer ) )
            // InternalGuardin.g:3813:2: ( ruleSectionPianoLayer )
            {
            // InternalGuardin.g:3813:2: ( ruleSectionPianoLayer )
            // InternalGuardin.g:3814:3: ruleSectionPianoLayer
            {
             before(grammarAccess.getPianoAccess().getSectionsSectionPianoLayerParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSectionPianoLayer();

            state._fsp--;

             after(grammarAccess.getPianoAccess().getSectionsSectionPianoLayerParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__SectionsAssignment_3_0"


    // $ANTLR start "rule__Piano__LayersAssignment_3_1"
    // InternalGuardin.g:3823:1: rule__Piano__LayersAssignment_3_1 : ( rulePianoLayer ) ;
    public final void rule__Piano__LayersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3827:1: ( ( rulePianoLayer ) )
            // InternalGuardin.g:3828:2: ( rulePianoLayer )
            {
            // InternalGuardin.g:3828:2: ( rulePianoLayer )
            // InternalGuardin.g:3829:3: rulePianoLayer
            {
             before(grammarAccess.getPianoAccess().getLayersPianoLayerParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePianoLayer();

            state._fsp--;

             after(grammarAccess.getPianoAccess().getLayersPianoLayerParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__LayersAssignment_3_1"


    // $ANTLR start "rule__SectionPianoLayer__SectionAssignment_2"
    // InternalGuardin.g:3838:1: rule__SectionPianoLayer__SectionAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__SectionPianoLayer__SectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3842:1: ( ( ( ruleEString ) ) )
            // InternalGuardin.g:3843:2: ( ( ruleEString ) )
            {
            // InternalGuardin.g:3843:2: ( ( ruleEString ) )
            // InternalGuardin.g:3844:3: ( ruleEString )
            {
             before(grammarAccess.getSectionPianoLayerAccess().getSectionSectionCrossReference_2_0()); 
            // InternalGuardin.g:3845:3: ( ruleEString )
            // InternalGuardin.g:3846:4: ruleEString
            {
             before(grammarAccess.getSectionPianoLayerAccess().getSectionSectionEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionPianoLayerAccess().getSectionSectionEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSectionPianoLayerAccess().getSectionSectionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionPianoLayer__SectionAssignment_2"


    // $ANTLR start "rule__SectionPianoLayer__LayersAssignment_3"
    // InternalGuardin.g:3857:1: rule__SectionPianoLayer__LayersAssignment_3 : ( rulePianoLayer ) ;
    public final void rule__SectionPianoLayer__LayersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3861:1: ( ( rulePianoLayer ) )
            // InternalGuardin.g:3862:2: ( rulePianoLayer )
            {
            // InternalGuardin.g:3862:2: ( rulePianoLayer )
            // InternalGuardin.g:3863:3: rulePianoLayer
            {
             before(grammarAccess.getSectionPianoLayerAccess().getLayersPianoLayerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePianoLayer();

            state._fsp--;

             after(grammarAccess.getSectionPianoLayerAccess().getLayersPianoLayerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionPianoLayer__LayersAssignment_3"


    // $ANTLR start "rule__PianoLayer__NotesAssignment_2"
    // InternalGuardin.g:3872:1: rule__PianoLayer__NotesAssignment_2 : ( ( rule__PianoLayer__NotesAlternatives_2_0 ) ) ;
    public final void rule__PianoLayer__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3876:1: ( ( ( rule__PianoLayer__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3877:2: ( ( rule__PianoLayer__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3877:2: ( ( rule__PianoLayer__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3878:3: ( rule__PianoLayer__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3879:3: ( rule__PianoLayer__NotesAlternatives_2_0 )
            // InternalGuardin.g:3879:4: rule__PianoLayer__NotesAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PianoLayer__NotesAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPianoLayerAccess().getNotesAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoLayer__NotesAssignment_2"


    // $ANTLR start "rule__PianoNote__NoteTypeAssignment_1"
    // InternalGuardin.g:3887:1: rule__PianoNote__NoteTypeAssignment_1 : ( rulePianoNoteType ) ;
    public final void rule__PianoNote__NoteTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3891:1: ( ( rulePianoNoteType ) )
            // InternalGuardin.g:3892:2: ( rulePianoNoteType )
            {
            // InternalGuardin.g:3892:2: ( rulePianoNoteType )
            // InternalGuardin.g:3893:3: rulePianoNoteType
            {
             before(grammarAccess.getPianoNoteAccess().getNoteTypePianoNoteTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePianoNoteType();

            state._fsp--;

             after(grammarAccess.getPianoNoteAccess().getNoteTypePianoNoteTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__NoteTypeAssignment_1"


    // $ANTLR start "rule__PianoNote__OctaveOffsetAssignment_2_0_1"
    // InternalGuardin.g:3902:1: rule__PianoNote__OctaveOffsetAssignment_2_0_1 : ( ruleERelativeInt ) ;
    public final void rule__PianoNote__OctaveOffsetAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3906:1: ( ( ruleERelativeInt ) )
            // InternalGuardin.g:3907:2: ( ruleERelativeInt )
            {
            // InternalGuardin.g:3907:2: ( ruleERelativeInt )
            // InternalGuardin.g:3908:3: ruleERelativeInt
            {
             before(grammarAccess.getPianoNoteAccess().getOctaveOffsetERelativeIntParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleERelativeInt();

            state._fsp--;

             after(grammarAccess.getPianoNoteAccess().getOctaveOffsetERelativeIntParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__OctaveOffsetAssignment_2_0_1"


    // $ANTLR start "rule__PianoNote__OctaveAbsoluteAssignment_2_1_1"
    // InternalGuardin.g:3917:1: rule__PianoNote__OctaveAbsoluteAssignment_2_1_1 : ( ruleEInt ) ;
    public final void rule__PianoNote__OctaveAbsoluteAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3921:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3922:2: ( ruleEInt )
            {
            // InternalGuardin.g:3922:2: ( ruleEInt )
            // InternalGuardin.g:3923:3: ruleEInt
            {
             before(grammarAccess.getPianoNoteAccess().getOctaveAbsoluteEIntParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPianoNoteAccess().getOctaveAbsoluteEIntParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__OctaveAbsoluteAssignment_2_1_1"


    // $ANTLR start "rule__CompositePianoNote__NotesAssignment_2"
    // InternalGuardin.g:3932:1: rule__CompositePianoNote__NotesAssignment_2 : ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) ) ;
    public final void rule__CompositePianoNote__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3936:1: ( ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3937:2: ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3937:2: ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3938:3: ( rule__CompositePianoNote__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3939:3: ( rule__CompositePianoNote__NotesAlternatives_2_0 )
            // InternalGuardin.g:3939:4: rule__CompositePianoNote__NotesAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositePianoNote__NotesAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositePianoNoteAccess().getNotesAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__NotesAssignment_2"


    // $ANTLR start "rule__CompositePianoNote__RepeatsAssignment_5"
    // InternalGuardin.g:3947:1: rule__CompositePianoNote__RepeatsAssignment_5 : ( ruleEInt ) ;
    public final void rule__CompositePianoNote__RepeatsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3951:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3952:2: ( ruleEInt )
            {
            // InternalGuardin.g:3952:2: ( ruleEInt )
            // InternalGuardin.g:3953:3: ruleEInt
            {
             before(grammarAccess.getCompositePianoNoteAccess().getRepeatsEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCompositePianoNoteAccess().getRepeatsEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositePianoNote__RepeatsAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x002040001FF81060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002800000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000420000007E000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000420000007E002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000020000007E000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000020000007E002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004200FE0000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004200FE0000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000FE0000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200FE0000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200FE0000002L});

}