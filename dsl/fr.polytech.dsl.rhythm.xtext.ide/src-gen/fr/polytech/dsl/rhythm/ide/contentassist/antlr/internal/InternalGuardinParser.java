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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Melody'", "'..'", "'...'", "'....'", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "'ACOUSTIC_BASS'", "'CHURCH_ORGAN'", "'CLAVINET'", "'GUITAR'", "'HARPSICHORD'", "'MUSIC_BOX'", "'OCARINA'", "'PIANO'", "'SYNTH_BASS_1'", "'VIOLIN'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'Music'", "'sections'", "'tracks'", "'CustomSoundBank'", "'basePath='", "'-'", "'tempo='", "'signature='", "'bars='", "'$'", "'battery'", "'begin_section'", "'end_section'", "'layer:'", "'('", "')'", "'x'", "'other:'", "'/'", "'|'"
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
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
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


    // $ANTLR start "entryRuleMelody"
    // InternalGuardin.g:303:1: entryRuleMelody : ruleMelody EOF ;
    public final void entryRuleMelody() throws RecognitionException {
        try {
            // InternalGuardin.g:304:1: ( ruleMelody EOF )
            // InternalGuardin.g:305:1: ruleMelody EOF
            {
             before(grammarAccess.getMelodyRule()); 
            pushFollow(FOLLOW_1);
            ruleMelody();

            state._fsp--;

             after(grammarAccess.getMelodyRule()); 
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
    // $ANTLR end "entryRuleMelody"


    // $ANTLR start "ruleMelody"
    // InternalGuardin.g:312:1: ruleMelody : ( ( rule__Melody__Group__0 ) ) ;
    public final void ruleMelody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:316:2: ( ( ( rule__Melody__Group__0 ) ) )
            // InternalGuardin.g:317:2: ( ( rule__Melody__Group__0 ) )
            {
            // InternalGuardin.g:317:2: ( ( rule__Melody__Group__0 ) )
            // InternalGuardin.g:318:3: ( rule__Melody__Group__0 )
            {
             before(grammarAccess.getMelodyAccess().getGroup()); 
            // InternalGuardin.g:319:3: ( rule__Melody__Group__0 )
            // InternalGuardin.g:319:4: rule__Melody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Melody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMelodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMelody"


    // $ANTLR start "entryRuleSectionMelodyLayer"
    // InternalGuardin.g:328:1: entryRuleSectionMelodyLayer : ruleSectionMelodyLayer EOF ;
    public final void entryRuleSectionMelodyLayer() throws RecognitionException {
        try {
            // InternalGuardin.g:329:1: ( ruleSectionMelodyLayer EOF )
            // InternalGuardin.g:330:1: ruleSectionMelodyLayer EOF
            {
             before(grammarAccess.getSectionMelodyLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleSectionMelodyLayer();

            state._fsp--;

             after(grammarAccess.getSectionMelodyLayerRule()); 
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
    // $ANTLR end "entryRuleSectionMelodyLayer"


    // $ANTLR start "ruleSectionMelodyLayer"
    // InternalGuardin.g:337:1: ruleSectionMelodyLayer : ( ( rule__SectionMelodyLayer__Group__0 ) ) ;
    public final void ruleSectionMelodyLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:341:2: ( ( ( rule__SectionMelodyLayer__Group__0 ) ) )
            // InternalGuardin.g:342:2: ( ( rule__SectionMelodyLayer__Group__0 ) )
            {
            // InternalGuardin.g:342:2: ( ( rule__SectionMelodyLayer__Group__0 ) )
            // InternalGuardin.g:343:3: ( rule__SectionMelodyLayer__Group__0 )
            {
             before(grammarAccess.getSectionMelodyLayerAccess().getGroup()); 
            // InternalGuardin.g:344:3: ( rule__SectionMelodyLayer__Group__0 )
            // InternalGuardin.g:344:4: rule__SectionMelodyLayer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SectionMelodyLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionMelodyLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSectionMelodyLayer"


    // $ANTLR start "entryRuleMelodyLayer"
    // InternalGuardin.g:353:1: entryRuleMelodyLayer : ruleMelodyLayer EOF ;
    public final void entryRuleMelodyLayer() throws RecognitionException {
        try {
            // InternalGuardin.g:354:1: ( ruleMelodyLayer EOF )
            // InternalGuardin.g:355:1: ruleMelodyLayer EOF
            {
             before(grammarAccess.getMelodyLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleMelodyLayer();

            state._fsp--;

             after(grammarAccess.getMelodyLayerRule()); 
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
    // $ANTLR end "entryRuleMelodyLayer"


    // $ANTLR start "ruleMelodyLayer"
    // InternalGuardin.g:362:1: ruleMelodyLayer : ( ( rule__MelodyLayer__Group__0 ) ) ;
    public final void ruleMelodyLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:366:2: ( ( ( rule__MelodyLayer__Group__0 ) ) )
            // InternalGuardin.g:367:2: ( ( rule__MelodyLayer__Group__0 ) )
            {
            // InternalGuardin.g:367:2: ( ( rule__MelodyLayer__Group__0 ) )
            // InternalGuardin.g:368:3: ( rule__MelodyLayer__Group__0 )
            {
             before(grammarAccess.getMelodyLayerAccess().getGroup()); 
            // InternalGuardin.g:369:3: ( rule__MelodyLayer__Group__0 )
            // InternalGuardin.g:369:4: rule__MelodyLayer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MelodyLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMelodyLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMelodyLayer"


    // $ANTLR start "entryRuleMelodyNote"
    // InternalGuardin.g:378:1: entryRuleMelodyNote : ruleMelodyNote EOF ;
    public final void entryRuleMelodyNote() throws RecognitionException {
        try {
            // InternalGuardin.g:379:1: ( ruleMelodyNote EOF )
            // InternalGuardin.g:380:1: ruleMelodyNote EOF
            {
             before(grammarAccess.getMelodyNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleMelodyNote();

            state._fsp--;

             after(grammarAccess.getMelodyNoteRule()); 
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
    // $ANTLR end "entryRuleMelodyNote"


    // $ANTLR start "ruleMelodyNote"
    // InternalGuardin.g:387:1: ruleMelodyNote : ( ( rule__MelodyNote__Group__0 ) ) ;
    public final void ruleMelodyNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:391:2: ( ( ( rule__MelodyNote__Group__0 ) ) )
            // InternalGuardin.g:392:2: ( ( rule__MelodyNote__Group__0 ) )
            {
            // InternalGuardin.g:392:2: ( ( rule__MelodyNote__Group__0 ) )
            // InternalGuardin.g:393:3: ( rule__MelodyNote__Group__0 )
            {
             before(grammarAccess.getMelodyNoteAccess().getGroup()); 
            // InternalGuardin.g:394:3: ( rule__MelodyNote__Group__0 )
            // InternalGuardin.g:394:4: rule__MelodyNote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MelodyNote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMelodyNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMelodyNote"


    // $ANTLR start "entryRuleCompositeMelodyNote"
    // InternalGuardin.g:403:1: entryRuleCompositeMelodyNote : ruleCompositeMelodyNote EOF ;
    public final void entryRuleCompositeMelodyNote() throws RecognitionException {
        try {
            // InternalGuardin.g:404:1: ( ruleCompositeMelodyNote EOF )
            // InternalGuardin.g:405:1: ruleCompositeMelodyNote EOF
            {
             before(grammarAccess.getCompositeMelodyNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeMelodyNote();

            state._fsp--;

             after(grammarAccess.getCompositeMelodyNoteRule()); 
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
    // $ANTLR end "entryRuleCompositeMelodyNote"


    // $ANTLR start "ruleCompositeMelodyNote"
    // InternalGuardin.g:412:1: ruleCompositeMelodyNote : ( ( rule__CompositeMelodyNote__Group__0 ) ) ;
    public final void ruleCompositeMelodyNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:416:2: ( ( ( rule__CompositeMelodyNote__Group__0 ) ) )
            // InternalGuardin.g:417:2: ( ( rule__CompositeMelodyNote__Group__0 ) )
            {
            // InternalGuardin.g:417:2: ( ( rule__CompositeMelodyNote__Group__0 ) )
            // InternalGuardin.g:418:3: ( rule__CompositeMelodyNote__Group__0 )
            {
             before(grammarAccess.getCompositeMelodyNoteAccess().getGroup()); 
            // InternalGuardin.g:419:3: ( rule__CompositeMelodyNote__Group__0 )
            // InternalGuardin.g:419:4: rule__CompositeMelodyNote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeMelodyNote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeMelodyNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeMelodyNote"


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


    // $ANTLR start "ruleDuration"
    // InternalGuardin.g:503:1: ruleDuration : ( ( rule__Duration__Alternatives ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:507:1: ( ( ( rule__Duration__Alternatives ) ) )
            // InternalGuardin.g:508:2: ( ( rule__Duration__Alternatives ) )
            {
            // InternalGuardin.g:508:2: ( ( rule__Duration__Alternatives ) )
            // InternalGuardin.g:509:3: ( rule__Duration__Alternatives )
            {
             before(grammarAccess.getDurationAccess().getAlternatives()); 
            // InternalGuardin.g:510:3: ( rule__Duration__Alternatives )
            // InternalGuardin.g:510:4: rule__Duration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "ruleBatteryNoteType"
    // InternalGuardin.g:519:1: ruleBatteryNoteType : ( ( rule__BatteryNoteType__Alternatives ) ) ;
    public final void ruleBatteryNoteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:523:1: ( ( ( rule__BatteryNoteType__Alternatives ) ) )
            // InternalGuardin.g:524:2: ( ( rule__BatteryNoteType__Alternatives ) )
            {
            // InternalGuardin.g:524:2: ( ( rule__BatteryNoteType__Alternatives ) )
            // InternalGuardin.g:525:3: ( rule__BatteryNoteType__Alternatives )
            {
             before(grammarAccess.getBatteryNoteTypeAccess().getAlternatives()); 
            // InternalGuardin.g:526:3: ( rule__BatteryNoteType__Alternatives )
            // InternalGuardin.g:526:4: rule__BatteryNoteType__Alternatives
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
    // InternalGuardin.g:535:1: ruleInstruments : ( ( rule__Instruments__Alternatives ) ) ;
    public final void ruleInstruments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:539:1: ( ( ( rule__Instruments__Alternatives ) ) )
            // InternalGuardin.g:540:2: ( ( rule__Instruments__Alternatives ) )
            {
            // InternalGuardin.g:540:2: ( ( rule__Instruments__Alternatives ) )
            // InternalGuardin.g:541:3: ( rule__Instruments__Alternatives )
            {
             before(grammarAccess.getInstrumentsAccess().getAlternatives()); 
            // InternalGuardin.g:542:3: ( rule__Instruments__Alternatives )
            // InternalGuardin.g:542:4: rule__Instruments__Alternatives
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


    // $ANTLR start "ruleMelodyNoteType"
    // InternalGuardin.g:551:1: ruleMelodyNoteType : ( ( rule__MelodyNoteType__Alternatives ) ) ;
    public final void ruleMelodyNoteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:555:1: ( ( ( rule__MelodyNoteType__Alternatives ) ) )
            // InternalGuardin.g:556:2: ( ( rule__MelodyNoteType__Alternatives ) )
            {
            // InternalGuardin.g:556:2: ( ( rule__MelodyNoteType__Alternatives ) )
            // InternalGuardin.g:557:3: ( rule__MelodyNoteType__Alternatives )
            {
             before(grammarAccess.getMelodyNoteTypeAccess().getAlternatives()); 
            // InternalGuardin.g:558:3: ( rule__MelodyNoteType__Alternatives )
            // InternalGuardin.g:558:4: rule__MelodyNoteType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MelodyNoteType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMelodyNoteTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMelodyNoteType"


    // $ANTLR start "rule__Instrument__Alternatives"
    // InternalGuardin.g:566:1: rule__Instrument__Alternatives : ( ( ruleBattery ) | ( ruleMelody ) );
    public final void rule__Instrument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:570:1: ( ( ruleBattery ) | ( ruleMelody ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==49) ) {
                alt1=1;
            }
            else if ( (LA1_0==12||(LA1_0>=22 && LA1_0<=31)||LA1_0==56) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGuardin.g:571:2: ( ruleBattery )
                    {
                    // InternalGuardin.g:571:2: ( ruleBattery )
                    // InternalGuardin.g:572:3: ruleBattery
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
                    // InternalGuardin.g:577:2: ( ruleMelody )
                    {
                    // InternalGuardin.g:577:2: ( ruleMelody )
                    // InternalGuardin.g:578:3: ruleMelody
                    {
                     before(grammarAccess.getInstrumentAccess().getMelodyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMelody();

                    state._fsp--;

                     after(grammarAccess.getInstrumentAccess().getMelodyParserRuleCall_1()); 

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
    // InternalGuardin.g:587:1: rule__Battery__Alternatives_2 : ( ( ':' ) | ( ( rule__Battery__Group_2_1__0 ) ) );
    public final void rule__Battery__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:591:1: ( ( ':' ) | ( ( rule__Battery__Group_2_1__0 ) ) )
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
                    // InternalGuardin.g:592:2: ( ':' )
                    {
                    // InternalGuardin.g:592:2: ( ':' )
                    // InternalGuardin.g:593:3: ':'
                    {
                     before(grammarAccess.getBatteryAccess().getColonKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBatteryAccess().getColonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:598:2: ( ( rule__Battery__Group_2_1__0 ) )
                    {
                    // InternalGuardin.g:598:2: ( ( rule__Battery__Group_2_1__0 ) )
                    // InternalGuardin.g:599:3: ( rule__Battery__Group_2_1__0 )
                    {
                     before(grammarAccess.getBatteryAccess().getGroup_2_1()); 
                    // InternalGuardin.g:600:3: ( rule__Battery__Group_2_1__0 )
                    // InternalGuardin.g:600:4: rule__Battery__Group_2_1__0
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
    // InternalGuardin.g:608:1: rule__Battery__Alternatives_3 : ( ( ( rule__Battery__SectionsAssignment_3_0 ) ) | ( ( rule__Battery__LayersAssignment_3_1 ) ) );
    public final void rule__Battery__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:612:1: ( ( ( rule__Battery__SectionsAssignment_3_0 ) ) | ( ( rule__Battery__LayersAssignment_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==50) ) {
                alt3=1;
            }
            else if ( (LA3_0==52) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuardin.g:613:2: ( ( rule__Battery__SectionsAssignment_3_0 ) )
                    {
                    // InternalGuardin.g:613:2: ( ( rule__Battery__SectionsAssignment_3_0 ) )
                    // InternalGuardin.g:614:3: ( rule__Battery__SectionsAssignment_3_0 )
                    {
                     before(grammarAccess.getBatteryAccess().getSectionsAssignment_3_0()); 
                    // InternalGuardin.g:615:3: ( rule__Battery__SectionsAssignment_3_0 )
                    // InternalGuardin.g:615:4: rule__Battery__SectionsAssignment_3_0
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
                    // InternalGuardin.g:619:2: ( ( rule__Battery__LayersAssignment_3_1 ) )
                    {
                    // InternalGuardin.g:619:2: ( ( rule__Battery__LayersAssignment_3_1 ) )
                    // InternalGuardin.g:620:3: ( rule__Battery__LayersAssignment_3_1 )
                    {
                     before(grammarAccess.getBatteryAccess().getLayersAssignment_3_1()); 
                    // InternalGuardin.g:621:3: ( rule__Battery__LayersAssignment_3_1 )
                    // InternalGuardin.g:621:4: rule__Battery__LayersAssignment_3_1
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
    // InternalGuardin.g:629:1: rule__BatteryLayer__NotesAlternatives_2_0 : ( ( ruleBatteryNote ) | ( ruleEmptyNote ) | ( ruleCompositeBatteryNote ) );
    public final void rule__BatteryLayer__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:633:1: ( ( ruleBatteryNote ) | ( ruleEmptyNote ) | ( ruleCompositeBatteryNote ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt4=1;
                }
                break;
            case 48:
                {
                alt4=2;
                }
                break;
            case 53:
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
                    // InternalGuardin.g:634:2: ( ruleBatteryNote )
                    {
                    // InternalGuardin.g:634:2: ( ruleBatteryNote )
                    // InternalGuardin.g:635:3: ruleBatteryNote
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
                    // InternalGuardin.g:640:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:640:2: ( ruleEmptyNote )
                    // InternalGuardin.g:641:3: ruleEmptyNote
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
                    // InternalGuardin.g:646:2: ( ruleCompositeBatteryNote )
                    {
                    // InternalGuardin.g:646:2: ( ruleCompositeBatteryNote )
                    // InternalGuardin.g:647:3: ruleCompositeBatteryNote
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
    // InternalGuardin.g:656:1: rule__CompositeBatteryNote__NotesAlternatives_2_0 : ( ( ruleBatteryNote ) | ( ruleEmptyNote ) );
    public final void rule__CompositeBatteryNote__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:660:1: ( ( ruleBatteryNote ) | ( ruleEmptyNote ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=21)) ) {
                alt5=1;
            }
            else if ( (LA5_0==48) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGuardin.g:661:2: ( ruleBatteryNote )
                    {
                    // InternalGuardin.g:661:2: ( ruleBatteryNote )
                    // InternalGuardin.g:662:3: ruleBatteryNote
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
                    // InternalGuardin.g:667:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:667:2: ( ruleEmptyNote )
                    // InternalGuardin.g:668:3: ruleEmptyNote
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


    // $ANTLR start "rule__Melody__Alternatives_1"
    // InternalGuardin.g:677:1: rule__Melody__Alternatives_1 : ( ( 'Melody' ) | ( ( rule__Melody__InstrumentAssignment_1_1 ) ) | ( ( rule__Melody__Group_1_2__0 ) ) );
    public final void rule__Melody__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:681:1: ( ( 'Melody' ) | ( ( rule__Melody__InstrumentAssignment_1_1 ) ) | ( ( rule__Melody__Group_1_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt6=2;
                }
                break;
            case 56:
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
                    // InternalGuardin.g:682:2: ( 'Melody' )
                    {
                    // InternalGuardin.g:682:2: ( 'Melody' )
                    // InternalGuardin.g:683:3: 'Melody'
                    {
                     before(grammarAccess.getMelodyAccess().getMelodyKeyword_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMelodyAccess().getMelodyKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:688:2: ( ( rule__Melody__InstrumentAssignment_1_1 ) )
                    {
                    // InternalGuardin.g:688:2: ( ( rule__Melody__InstrumentAssignment_1_1 ) )
                    // InternalGuardin.g:689:3: ( rule__Melody__InstrumentAssignment_1_1 )
                    {
                     before(grammarAccess.getMelodyAccess().getInstrumentAssignment_1_1()); 
                    // InternalGuardin.g:690:3: ( rule__Melody__InstrumentAssignment_1_1 )
                    // InternalGuardin.g:690:4: rule__Melody__InstrumentAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Melody__InstrumentAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMelodyAccess().getInstrumentAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:694:2: ( ( rule__Melody__Group_1_2__0 ) )
                    {
                    // InternalGuardin.g:694:2: ( ( rule__Melody__Group_1_2__0 ) )
                    // InternalGuardin.g:695:3: ( rule__Melody__Group_1_2__0 )
                    {
                     before(grammarAccess.getMelodyAccess().getGroup_1_2()); 
                    // InternalGuardin.g:696:3: ( rule__Melody__Group_1_2__0 )
                    // InternalGuardin.g:696:4: rule__Melody__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Melody__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMelodyAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Melody__Alternatives_1"


    // $ANTLR start "rule__Melody__Alternatives_2"
    // InternalGuardin.g:704:1: rule__Melody__Alternatives_2 : ( ( ':' ) | ( ( rule__Melody__Group_2_1__0 ) ) );
    public final void rule__Melody__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:708:1: ( ( ':' ) | ( ( rule__Melody__Group_2_1__0 ) ) )
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
                    // InternalGuardin.g:709:2: ( ':' )
                    {
                    // InternalGuardin.g:709:2: ( ':' )
                    // InternalGuardin.g:710:3: ':'
                    {
                     before(grammarAccess.getMelodyAccess().getColonKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMelodyAccess().getColonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:715:2: ( ( rule__Melody__Group_2_1__0 ) )
                    {
                    // InternalGuardin.g:715:2: ( ( rule__Melody__Group_2_1__0 ) )
                    // InternalGuardin.g:716:3: ( rule__Melody__Group_2_1__0 )
                    {
                     before(grammarAccess.getMelodyAccess().getGroup_2_1()); 
                    // InternalGuardin.g:717:3: ( rule__Melody__Group_2_1__0 )
                    // InternalGuardin.g:717:4: rule__Melody__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Melody__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMelodyAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Melody__Alternatives_2"


    // $ANTLR start "rule__Melody__Alternatives_3"
    // InternalGuardin.g:725:1: rule__Melody__Alternatives_3 : ( ( ( rule__Melody__SectionsAssignment_3_0 ) ) | ( ( rule__Melody__LayersAssignment_3_1 ) ) );
    public final void rule__Melody__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:729:1: ( ( ( rule__Melody__SectionsAssignment_3_0 ) ) | ( ( rule__Melody__LayersAssignment_3_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==50) ) {
                alt8=1;
            }
            else if ( (LA8_0==52) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGuardin.g:730:2: ( ( rule__Melody__SectionsAssignment_3_0 ) )
                    {
                    // InternalGuardin.g:730:2: ( ( rule__Melody__SectionsAssignment_3_0 ) )
                    // InternalGuardin.g:731:3: ( rule__Melody__SectionsAssignment_3_0 )
                    {
                     before(grammarAccess.getMelodyAccess().getSectionsAssignment_3_0()); 
                    // InternalGuardin.g:732:3: ( rule__Melody__SectionsAssignment_3_0 )
                    // InternalGuardin.g:732:4: rule__Melody__SectionsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Melody__SectionsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMelodyAccess().getSectionsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:736:2: ( ( rule__Melody__LayersAssignment_3_1 ) )
                    {
                    // InternalGuardin.g:736:2: ( ( rule__Melody__LayersAssignment_3_1 ) )
                    // InternalGuardin.g:737:3: ( rule__Melody__LayersAssignment_3_1 )
                    {
                     before(grammarAccess.getMelodyAccess().getLayersAssignment_3_1()); 
                    // InternalGuardin.g:738:3: ( rule__Melody__LayersAssignment_3_1 )
                    // InternalGuardin.g:738:4: rule__Melody__LayersAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Melody__LayersAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMelodyAccess().getLayersAssignment_3_1()); 

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
    // $ANTLR end "rule__Melody__Alternatives_3"


    // $ANTLR start "rule__MelodyLayer__NotesAlternatives_2_0"
    // InternalGuardin.g:746:1: rule__MelodyLayer__NotesAlternatives_2_0 : ( ( ruleMelodyNote ) | ( ruleEmptyNote ) | ( ruleCompositeMelodyNote ) );
    public final void rule__MelodyLayer__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:750:1: ( ( ruleMelodyNote ) | ( ruleEmptyNote ) | ( ruleCompositeMelodyNote ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt9=1;
                }
                break;
            case 48:
                {
                alt9=2;
                }
                break;
            case 53:
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
                    // InternalGuardin.g:751:2: ( ruleMelodyNote )
                    {
                    // InternalGuardin.g:751:2: ( ruleMelodyNote )
                    // InternalGuardin.g:752:3: ruleMelodyNote
                    {
                     before(grammarAccess.getMelodyLayerAccess().getNotesMelodyNoteParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMelodyNote();

                    state._fsp--;

                     after(grammarAccess.getMelodyLayerAccess().getNotesMelodyNoteParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:757:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:757:2: ( ruleEmptyNote )
                    // InternalGuardin.g:758:3: ruleEmptyNote
                    {
                     before(grammarAccess.getMelodyLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptyNote();

                    state._fsp--;

                     after(grammarAccess.getMelodyLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:763:2: ( ruleCompositeMelodyNote )
                    {
                    // InternalGuardin.g:763:2: ( ruleCompositeMelodyNote )
                    // InternalGuardin.g:764:3: ruleCompositeMelodyNote
                    {
                     before(grammarAccess.getMelodyLayerAccess().getNotesCompositeMelodyNoteParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeMelodyNote();

                    state._fsp--;

                     after(grammarAccess.getMelodyLayerAccess().getNotesCompositeMelodyNoteParserRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__MelodyLayer__NotesAlternatives_2_0"


    // $ANTLR start "rule__MelodyNote__Alternatives_3"
    // InternalGuardin.g:773:1: rule__MelodyNote__Alternatives_3 : ( ( ( rule__MelodyNote__Group_3_0__0 ) ) | ( ( rule__MelodyNote__Group_3_1__0 ) ) );
    public final void rule__MelodyNote__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:777:1: ( ( ( rule__MelodyNote__Group_3_0__0 ) ) | ( ( rule__MelodyNote__Group_3_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==57) ) {
                alt10=1;
            }
            else if ( (LA10_0==58) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGuardin.g:778:2: ( ( rule__MelodyNote__Group_3_0__0 ) )
                    {
                    // InternalGuardin.g:778:2: ( ( rule__MelodyNote__Group_3_0__0 ) )
                    // InternalGuardin.g:779:3: ( rule__MelodyNote__Group_3_0__0 )
                    {
                     before(grammarAccess.getMelodyNoteAccess().getGroup_3_0()); 
                    // InternalGuardin.g:780:3: ( rule__MelodyNote__Group_3_0__0 )
                    // InternalGuardin.g:780:4: rule__MelodyNote__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MelodyNote__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMelodyNoteAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:784:2: ( ( rule__MelodyNote__Group_3_1__0 ) )
                    {
                    // InternalGuardin.g:784:2: ( ( rule__MelodyNote__Group_3_1__0 ) )
                    // InternalGuardin.g:785:3: ( rule__MelodyNote__Group_3_1__0 )
                    {
                     before(grammarAccess.getMelodyNoteAccess().getGroup_3_1()); 
                    // InternalGuardin.g:786:3: ( rule__MelodyNote__Group_3_1__0 )
                    // InternalGuardin.g:786:4: rule__MelodyNote__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MelodyNote__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMelodyNoteAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__MelodyNote__Alternatives_3"


    // $ANTLR start "rule__CompositeMelodyNote__NotesAlternatives_2_0"
    // InternalGuardin.g:794:1: rule__CompositeMelodyNote__NotesAlternatives_2_0 : ( ( ruleMelodyNote ) | ( ruleEmptyNote ) );
    public final void rule__CompositeMelodyNote__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:798:1: ( ( ruleMelodyNote ) | ( ruleEmptyNote ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=32 && LA11_0<=38)) ) {
                alt11=1;
            }
            else if ( (LA11_0==48) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGuardin.g:799:2: ( ruleMelodyNote )
                    {
                    // InternalGuardin.g:799:2: ( ruleMelodyNote )
                    // InternalGuardin.g:800:3: ruleMelodyNote
                    {
                     before(grammarAccess.getCompositeMelodyNoteAccess().getNotesMelodyNoteParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMelodyNote();

                    state._fsp--;

                     after(grammarAccess.getCompositeMelodyNoteAccess().getNotesMelodyNoteParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:805:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:805:2: ( ruleEmptyNote )
                    // InternalGuardin.g:806:3: ruleEmptyNote
                    {
                     before(grammarAccess.getCompositeMelodyNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptyNote();

                    state._fsp--;

                     after(grammarAccess.getCompositeMelodyNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__CompositeMelodyNote__NotesAlternatives_2_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalGuardin.g:815:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:819:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalGuardin.g:820:2: ( RULE_STRING )
                    {
                    // InternalGuardin.g:820:2: ( RULE_STRING )
                    // InternalGuardin.g:821:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:826:2: ( RULE_ID )
                    {
                    // InternalGuardin.g:826:2: ( RULE_ID )
                    // InternalGuardin.g:827:3: RULE_ID
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


    // $ANTLR start "rule__Duration__Alternatives"
    // InternalGuardin.g:836:1: rule__Duration__Alternatives : ( ( ( '..' ) ) | ( ( '...' ) ) | ( ( '....' ) ) );
    public final void rule__Duration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:840:1: ( ( ( '..' ) ) | ( ( '...' ) ) | ( ( '....' ) ) )
            int alt13=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalGuardin.g:841:2: ( ( '..' ) )
                    {
                    // InternalGuardin.g:841:2: ( ( '..' ) )
                    // InternalGuardin.g:842:3: ( '..' )
                    {
                     before(grammarAccess.getDurationAccess().getEIGHTHEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:843:3: ( '..' )
                    // InternalGuardin.g:843:4: '..'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getEIGHTHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:847:2: ( ( '...' ) )
                    {
                    // InternalGuardin.g:847:2: ( ( '...' ) )
                    // InternalGuardin.g:848:3: ( '...' )
                    {
                     before(grammarAccess.getDurationAccess().getSIXTEENTHEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:849:3: ( '...' )
                    // InternalGuardin.g:849:4: '...'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getSIXTEENTHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:853:2: ( ( '....' ) )
                    {
                    // InternalGuardin.g:853:2: ( ( '....' ) )
                    // InternalGuardin.g:854:3: ( '....' )
                    {
                     before(grammarAccess.getDurationAccess().getTHIRTY_SECONDEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:855:3: ( '....' )
                    // InternalGuardin.g:855:4: '....'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getTHIRTY_SECONDEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Duration__Alternatives"


    // $ANTLR start "rule__BatteryNoteType__Alternatives"
    // InternalGuardin.g:863:1: rule__BatteryNoteType__Alternatives : ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) );
    public final void rule__BatteryNoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:867:1: ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt14=1;
                }
                break;
            case 17:
                {
                alt14=2;
                }
                break;
            case 18:
                {
                alt14=3;
                }
                break;
            case 19:
                {
                alt14=4;
                }
                break;
            case 20:
                {
                alt14=5;
                }
                break;
            case 21:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalGuardin.g:868:2: ( ( 'bd' ) )
                    {
                    // InternalGuardin.g:868:2: ( ( 'bd' ) )
                    // InternalGuardin.g:869:3: ( 'bd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:870:3: ( 'bd' )
                    // InternalGuardin.g:870:4: 'bd'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:874:2: ( ( 'ch' ) )
                    {
                    // InternalGuardin.g:874:2: ( ( 'ch' ) )
                    // InternalGuardin.g:875:3: ( 'ch' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:876:3: ( 'ch' )
                    // InternalGuardin.g:876:4: 'ch'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:880:2: ( ( 'cc' ) )
                    {
                    // InternalGuardin.g:880:2: ( ( 'cc' ) )
                    // InternalGuardin.g:881:3: ( 'cc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:882:3: ( 'cc' )
                    // InternalGuardin.g:882:4: 'cc'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:886:2: ( ( 'oh' ) )
                    {
                    // InternalGuardin.g:886:2: ( ( 'oh' ) )
                    // InternalGuardin.g:887:3: ( 'oh' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:888:3: ( 'oh' )
                    // InternalGuardin.g:888:4: 'oh'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:892:2: ( ( 'rc' ) )
                    {
                    // InternalGuardin.g:892:2: ( ( 'rc' ) )
                    // InternalGuardin.g:893:3: ( 'rc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:894:3: ( 'rc' )
                    // InternalGuardin.g:894:4: 'rc'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:898:2: ( ( 'sd' ) )
                    {
                    // InternalGuardin.g:898:2: ( ( 'sd' ) )
                    // InternalGuardin.g:899:3: ( 'sd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getSNARE_DRUMEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:900:3: ( 'sd' )
                    // InternalGuardin.g:900:4: 'sd'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalGuardin.g:908:1: rule__Instruments__Alternatives : ( ( ( 'ACOUSTIC_BASS' ) ) | ( ( 'CHURCH_ORGAN' ) ) | ( ( 'CLAVINET' ) ) | ( ( 'GUITAR' ) ) | ( ( 'HARPSICHORD' ) ) | ( ( 'MUSIC_BOX' ) ) | ( ( 'OCARINA' ) ) | ( ( 'PIANO' ) ) | ( ( 'SYNTH_BASS_1' ) ) | ( ( 'VIOLIN' ) ) );
    public final void rule__Instruments__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:912:1: ( ( ( 'ACOUSTIC_BASS' ) ) | ( ( 'CHURCH_ORGAN' ) ) | ( ( 'CLAVINET' ) ) | ( ( 'GUITAR' ) ) | ( ( 'HARPSICHORD' ) ) | ( ( 'MUSIC_BOX' ) ) | ( ( 'OCARINA' ) ) | ( ( 'PIANO' ) ) | ( ( 'SYNTH_BASS_1' ) ) | ( ( 'VIOLIN' ) ) )
            int alt15=10;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt15=1;
                }
                break;
            case 23:
                {
                alt15=2;
                }
                break;
            case 24:
                {
                alt15=3;
                }
                break;
            case 25:
                {
                alt15=4;
                }
                break;
            case 26:
                {
                alt15=5;
                }
                break;
            case 27:
                {
                alt15=6;
                }
                break;
            case 28:
                {
                alt15=7;
                }
                break;
            case 29:
                {
                alt15=8;
                }
                break;
            case 30:
                {
                alt15=9;
                }
                break;
            case 31:
                {
                alt15=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalGuardin.g:913:2: ( ( 'ACOUSTIC_BASS' ) )
                    {
                    // InternalGuardin.g:913:2: ( ( 'ACOUSTIC_BASS' ) )
                    // InternalGuardin.g:914:3: ( 'ACOUSTIC_BASS' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getACOUSTIC_BASSEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:915:3: ( 'ACOUSTIC_BASS' )
                    // InternalGuardin.g:915:4: 'ACOUSTIC_BASS'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getACOUSTIC_BASSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:919:2: ( ( 'CHURCH_ORGAN' ) )
                    {
                    // InternalGuardin.g:919:2: ( ( 'CHURCH_ORGAN' ) )
                    // InternalGuardin.g:920:3: ( 'CHURCH_ORGAN' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getCHURCH_ORGANEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:921:3: ( 'CHURCH_ORGAN' )
                    // InternalGuardin.g:921:4: 'CHURCH_ORGAN'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getCHURCH_ORGANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:925:2: ( ( 'CLAVINET' ) )
                    {
                    // InternalGuardin.g:925:2: ( ( 'CLAVINET' ) )
                    // InternalGuardin.g:926:3: ( 'CLAVINET' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getCLAVINETEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:927:3: ( 'CLAVINET' )
                    // InternalGuardin.g:927:4: 'CLAVINET'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getCLAVINETEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:931:2: ( ( 'GUITAR' ) )
                    {
                    // InternalGuardin.g:931:2: ( ( 'GUITAR' ) )
                    // InternalGuardin.g:932:3: ( 'GUITAR' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getGUITAREnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:933:3: ( 'GUITAR' )
                    // InternalGuardin.g:933:4: 'GUITAR'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getGUITAREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:937:2: ( ( 'HARPSICHORD' ) )
                    {
                    // InternalGuardin.g:937:2: ( ( 'HARPSICHORD' ) )
                    // InternalGuardin.g:938:3: ( 'HARPSICHORD' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getHARPSICHORDEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:939:3: ( 'HARPSICHORD' )
                    // InternalGuardin.g:939:4: 'HARPSICHORD'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getHARPSICHORDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:943:2: ( ( 'MUSIC_BOX' ) )
                    {
                    // InternalGuardin.g:943:2: ( ( 'MUSIC_BOX' ) )
                    // InternalGuardin.g:944:3: ( 'MUSIC_BOX' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getMUSIC_BOXEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:945:3: ( 'MUSIC_BOX' )
                    // InternalGuardin.g:945:4: 'MUSIC_BOX'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getMUSIC_BOXEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:949:2: ( ( 'OCARINA' ) )
                    {
                    // InternalGuardin.g:949:2: ( ( 'OCARINA' ) )
                    // InternalGuardin.g:950:3: ( 'OCARINA' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getOCARINAEnumLiteralDeclaration_6()); 
                    // InternalGuardin.g:951:3: ( 'OCARINA' )
                    // InternalGuardin.g:951:4: 'OCARINA'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getOCARINAEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGuardin.g:955:2: ( ( 'PIANO' ) )
                    {
                    // InternalGuardin.g:955:2: ( ( 'PIANO' ) )
                    // InternalGuardin.g:956:3: ( 'PIANO' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getPIANOEnumLiteralDeclaration_7()); 
                    // InternalGuardin.g:957:3: ( 'PIANO' )
                    // InternalGuardin.g:957:4: 'PIANO'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getPIANOEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGuardin.g:961:2: ( ( 'SYNTH_BASS_1' ) )
                    {
                    // InternalGuardin.g:961:2: ( ( 'SYNTH_BASS_1' ) )
                    // InternalGuardin.g:962:3: ( 'SYNTH_BASS_1' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getSYNTH_BASS_1EnumLiteralDeclaration_8()); 
                    // InternalGuardin.g:963:3: ( 'SYNTH_BASS_1' )
                    // InternalGuardin.g:963:4: 'SYNTH_BASS_1'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstrumentsAccess().getSYNTH_BASS_1EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGuardin.g:967:2: ( ( 'VIOLIN' ) )
                    {
                    // InternalGuardin.g:967:2: ( ( 'VIOLIN' ) )
                    // InternalGuardin.g:968:3: ( 'VIOLIN' )
                    {
                     before(grammarAccess.getInstrumentsAccess().getVIOLINEnumLiteralDeclaration_9()); 
                    // InternalGuardin.g:969:3: ( 'VIOLIN' )
                    // InternalGuardin.g:969:4: 'VIOLIN'
                    {
                    match(input,31,FOLLOW_2); 

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


    // $ANTLR start "rule__MelodyNoteType__Alternatives"
    // InternalGuardin.g:977:1: rule__MelodyNoteType__Alternatives : ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) );
    public final void rule__MelodyNoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:981:1: ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            case 35:
                {
                alt16=4;
                }
                break;
            case 36:
                {
                alt16=5;
                }
                break;
            case 37:
                {
                alt16=6;
                }
                break;
            case 38:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalGuardin.g:982:2: ( ( 'A' ) )
                    {
                    // InternalGuardin.g:982:2: ( ( 'A' ) )
                    // InternalGuardin.g:983:3: ( 'A' )
                    {
                     before(grammarAccess.getMelodyNoteTypeAccess().getAEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:984:3: ( 'A' )
                    // InternalGuardin.g:984:4: 'A'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getMelodyNoteTypeAccess().getAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:988:2: ( ( 'B' ) )
                    {
                    // InternalGuardin.g:988:2: ( ( 'B' ) )
                    // InternalGuardin.g:989:3: ( 'B' )
                    {
                     before(grammarAccess.getMelodyNoteTypeAccess().getBEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:990:3: ( 'B' )
                    // InternalGuardin.g:990:4: 'B'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getMelodyNoteTypeAccess().getBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:994:2: ( ( 'C' ) )
                    {
                    // InternalGuardin.g:994:2: ( ( 'C' ) )
                    // InternalGuardin.g:995:3: ( 'C' )
                    {
                     before(grammarAccess.getMelodyNoteTypeAccess().getCEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:996:3: ( 'C' )
                    // InternalGuardin.g:996:4: 'C'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getMelodyNoteTypeAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1000:2: ( ( 'D' ) )
                    {
                    // InternalGuardin.g:1000:2: ( ( 'D' ) )
                    // InternalGuardin.g:1001:3: ( 'D' )
                    {
                     before(grammarAccess.getMelodyNoteTypeAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:1002:3: ( 'D' )
                    // InternalGuardin.g:1002:4: 'D'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getMelodyNoteTypeAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1006:2: ( ( 'E' ) )
                    {
                    // InternalGuardin.g:1006:2: ( ( 'E' ) )
                    // InternalGuardin.g:1007:3: ( 'E' )
                    {
                     before(grammarAccess.getMelodyNoteTypeAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:1008:3: ( 'E' )
                    // InternalGuardin.g:1008:4: 'E'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getMelodyNoteTypeAccess().getEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1012:2: ( ( 'F' ) )
                    {
                    // InternalGuardin.g:1012:2: ( ( 'F' ) )
                    // InternalGuardin.g:1013:3: ( 'F' )
                    {
                     before(grammarAccess.getMelodyNoteTypeAccess().getFEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:1014:3: ( 'F' )
                    // InternalGuardin.g:1014:4: 'F'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getMelodyNoteTypeAccess().getFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:1018:2: ( ( 'G' ) )
                    {
                    // InternalGuardin.g:1018:2: ( ( 'G' ) )
                    // InternalGuardin.g:1019:3: ( 'G' )
                    {
                     before(grammarAccess.getMelodyNoteTypeAccess().getGEnumLiteralDeclaration_6()); 
                    // InternalGuardin.g:1020:3: ( 'G' )
                    // InternalGuardin.g:1020:4: 'G'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getMelodyNoteTypeAccess().getGEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__MelodyNoteType__Alternatives"


    // $ANTLR start "rule__Music__Group__0"
    // InternalGuardin.g:1028:1: rule__Music__Group__0 : rule__Music__Group__0__Impl rule__Music__Group__1 ;
    public final void rule__Music__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1032:1: ( rule__Music__Group__0__Impl rule__Music__Group__1 )
            // InternalGuardin.g:1033:2: rule__Music__Group__0__Impl rule__Music__Group__1
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
    // InternalGuardin.g:1040:1: rule__Music__Group__0__Impl : ( () ) ;
    public final void rule__Music__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1044:1: ( ( () ) )
            // InternalGuardin.g:1045:1: ( () )
            {
            // InternalGuardin.g:1045:1: ( () )
            // InternalGuardin.g:1046:2: ()
            {
             before(grammarAccess.getMusicAccess().getMusicAction_0()); 
            // InternalGuardin.g:1047:2: ()
            // InternalGuardin.g:1047:3: 
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
    // InternalGuardin.g:1055:1: rule__Music__Group__1 : rule__Music__Group__1__Impl rule__Music__Group__2 ;
    public final void rule__Music__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1059:1: ( rule__Music__Group__1__Impl rule__Music__Group__2 )
            // InternalGuardin.g:1060:2: rule__Music__Group__1__Impl rule__Music__Group__2
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
    // InternalGuardin.g:1067:1: rule__Music__Group__1__Impl : ( ( rule__Music__Group_1__0 )? ) ;
    public final void rule__Music__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1071:1: ( ( ( rule__Music__Group_1__0 )? ) )
            // InternalGuardin.g:1072:1: ( ( rule__Music__Group_1__0 )? )
            {
            // InternalGuardin.g:1072:1: ( ( rule__Music__Group_1__0 )? )
            // InternalGuardin.g:1073:2: ( rule__Music__Group_1__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_1()); 
            // InternalGuardin.g:1074:2: ( rule__Music__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGuardin.g:1074:3: rule__Music__Group_1__0
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
    // InternalGuardin.g:1082:1: rule__Music__Group__2 : rule__Music__Group__2__Impl rule__Music__Group__3 ;
    public final void rule__Music__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1086:1: ( rule__Music__Group__2__Impl rule__Music__Group__3 )
            // InternalGuardin.g:1087:2: rule__Music__Group__2__Impl rule__Music__Group__3
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
    // InternalGuardin.g:1094:1: rule__Music__Group__2__Impl : ( 'Music' ) ;
    public final void rule__Music__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1098:1: ( ( 'Music' ) )
            // InternalGuardin.g:1099:1: ( 'Music' )
            {
            // InternalGuardin.g:1099:1: ( 'Music' )
            // InternalGuardin.g:1100:2: 'Music'
            {
             before(grammarAccess.getMusicAccess().getMusicKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGuardin.g:1109:1: rule__Music__Group__3 : rule__Music__Group__3__Impl rule__Music__Group__4 ;
    public final void rule__Music__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1113:1: ( rule__Music__Group__3__Impl rule__Music__Group__4 )
            // InternalGuardin.g:1114:2: rule__Music__Group__3__Impl rule__Music__Group__4
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
    // InternalGuardin.g:1121:1: rule__Music__Group__3__Impl : ( ( rule__Music__NameAssignment_3 ) ) ;
    public final void rule__Music__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1125:1: ( ( ( rule__Music__NameAssignment_3 ) ) )
            // InternalGuardin.g:1126:1: ( ( rule__Music__NameAssignment_3 ) )
            {
            // InternalGuardin.g:1126:1: ( ( rule__Music__NameAssignment_3 ) )
            // InternalGuardin.g:1127:2: ( rule__Music__NameAssignment_3 )
            {
             before(grammarAccess.getMusicAccess().getNameAssignment_3()); 
            // InternalGuardin.g:1128:2: ( rule__Music__NameAssignment_3 )
            // InternalGuardin.g:1128:3: rule__Music__NameAssignment_3
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
    // InternalGuardin.g:1136:1: rule__Music__Group__4 : rule__Music__Group__4__Impl rule__Music__Group__5 ;
    public final void rule__Music__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1140:1: ( rule__Music__Group__4__Impl rule__Music__Group__5 )
            // InternalGuardin.g:1141:2: rule__Music__Group__4__Impl rule__Music__Group__5
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
    // InternalGuardin.g:1148:1: rule__Music__Group__4__Impl : ( ':' ) ;
    public final void rule__Music__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1152:1: ( ( ':' ) )
            // InternalGuardin.g:1153:1: ( ':' )
            {
            // InternalGuardin.g:1153:1: ( ':' )
            // InternalGuardin.g:1154:2: ':'
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
    // InternalGuardin.g:1163:1: rule__Music__Group__5 : rule__Music__Group__5__Impl rule__Music__Group__6 ;
    public final void rule__Music__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1167:1: ( rule__Music__Group__5__Impl rule__Music__Group__6 )
            // InternalGuardin.g:1168:2: rule__Music__Group__5__Impl rule__Music__Group__6
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
    // InternalGuardin.g:1175:1: rule__Music__Group__5__Impl : ( 'sections' ) ;
    public final void rule__Music__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1179:1: ( ( 'sections' ) )
            // InternalGuardin.g:1180:1: ( 'sections' )
            {
            // InternalGuardin.g:1180:1: ( 'sections' )
            // InternalGuardin.g:1181:2: 'sections'
            {
             before(grammarAccess.getMusicAccess().getSectionsKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalGuardin.g:1190:1: rule__Music__Group__6 : rule__Music__Group__6__Impl rule__Music__Group__7 ;
    public final void rule__Music__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1194:1: ( rule__Music__Group__6__Impl rule__Music__Group__7 )
            // InternalGuardin.g:1195:2: rule__Music__Group__6__Impl rule__Music__Group__7
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
    // InternalGuardin.g:1202:1: rule__Music__Group__6__Impl : ( ':' ) ;
    public final void rule__Music__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1206:1: ( ( ':' ) )
            // InternalGuardin.g:1207:1: ( ':' )
            {
            // InternalGuardin.g:1207:1: ( ':' )
            // InternalGuardin.g:1208:2: ':'
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
    // InternalGuardin.g:1217:1: rule__Music__Group__7 : rule__Music__Group__7__Impl rule__Music__Group__8 ;
    public final void rule__Music__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1221:1: ( rule__Music__Group__7__Impl rule__Music__Group__8 )
            // InternalGuardin.g:1222:2: rule__Music__Group__7__Impl rule__Music__Group__8
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
    // InternalGuardin.g:1229:1: rule__Music__Group__7__Impl : ( ( rule__Music__SectionsAssignment_7 ) ) ;
    public final void rule__Music__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1233:1: ( ( ( rule__Music__SectionsAssignment_7 ) ) )
            // InternalGuardin.g:1234:1: ( ( rule__Music__SectionsAssignment_7 ) )
            {
            // InternalGuardin.g:1234:1: ( ( rule__Music__SectionsAssignment_7 ) )
            // InternalGuardin.g:1235:2: ( rule__Music__SectionsAssignment_7 )
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_7()); 
            // InternalGuardin.g:1236:2: ( rule__Music__SectionsAssignment_7 )
            // InternalGuardin.g:1236:3: rule__Music__SectionsAssignment_7
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
    // InternalGuardin.g:1244:1: rule__Music__Group__8 : rule__Music__Group__8__Impl rule__Music__Group__9 ;
    public final void rule__Music__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1248:1: ( rule__Music__Group__8__Impl rule__Music__Group__9 )
            // InternalGuardin.g:1249:2: rule__Music__Group__8__Impl rule__Music__Group__9
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
    // InternalGuardin.g:1256:1: rule__Music__Group__8__Impl : ( ( rule__Music__SectionsAssignment_8 )* ) ;
    public final void rule__Music__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1260:1: ( ( ( rule__Music__SectionsAssignment_8 )* ) )
            // InternalGuardin.g:1261:1: ( ( rule__Music__SectionsAssignment_8 )* )
            {
            // InternalGuardin.g:1261:1: ( ( rule__Music__SectionsAssignment_8 )* )
            // InternalGuardin.g:1262:2: ( rule__Music__SectionsAssignment_8 )*
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_8()); 
            // InternalGuardin.g:1263:2: ( rule__Music__SectionsAssignment_8 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGuardin.g:1263:3: rule__Music__SectionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Music__SectionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalGuardin.g:1271:1: rule__Music__Group__9 : rule__Music__Group__9__Impl rule__Music__Group__10 ;
    public final void rule__Music__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1275:1: ( rule__Music__Group__9__Impl rule__Music__Group__10 )
            // InternalGuardin.g:1276:2: rule__Music__Group__9__Impl rule__Music__Group__10
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
    // InternalGuardin.g:1283:1: rule__Music__Group__9__Impl : ( 'tracks' ) ;
    public final void rule__Music__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1287:1: ( ( 'tracks' ) )
            // InternalGuardin.g:1288:1: ( 'tracks' )
            {
            // InternalGuardin.g:1288:1: ( 'tracks' )
            // InternalGuardin.g:1289:2: 'tracks'
            {
             before(grammarAccess.getMusicAccess().getTracksKeyword_9()); 
            match(input,41,FOLLOW_2); 
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
    // InternalGuardin.g:1298:1: rule__Music__Group__10 : rule__Music__Group__10__Impl rule__Music__Group__11 ;
    public final void rule__Music__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1302:1: ( rule__Music__Group__10__Impl rule__Music__Group__11 )
            // InternalGuardin.g:1303:2: rule__Music__Group__10__Impl rule__Music__Group__11
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
    // InternalGuardin.g:1310:1: rule__Music__Group__10__Impl : ( ':' ) ;
    public final void rule__Music__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1314:1: ( ( ':' ) )
            // InternalGuardin.g:1315:1: ( ':' )
            {
            // InternalGuardin.g:1315:1: ( ':' )
            // InternalGuardin.g:1316:2: ':'
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
    // InternalGuardin.g:1325:1: rule__Music__Group__11 : rule__Music__Group__11__Impl ;
    public final void rule__Music__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1329:1: ( rule__Music__Group__11__Impl )
            // InternalGuardin.g:1330:2: rule__Music__Group__11__Impl
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
    // InternalGuardin.g:1336:1: rule__Music__Group__11__Impl : ( ( rule__Music__Group_11__0 ) ) ;
    public final void rule__Music__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1340:1: ( ( ( rule__Music__Group_11__0 ) ) )
            // InternalGuardin.g:1341:1: ( ( rule__Music__Group_11__0 ) )
            {
            // InternalGuardin.g:1341:1: ( ( rule__Music__Group_11__0 ) )
            // InternalGuardin.g:1342:2: ( rule__Music__Group_11__0 )
            {
             before(grammarAccess.getMusicAccess().getGroup_11()); 
            // InternalGuardin.g:1343:2: ( rule__Music__Group_11__0 )
            // InternalGuardin.g:1343:3: rule__Music__Group_11__0
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
    // InternalGuardin.g:1352:1: rule__Music__Group_1__0 : rule__Music__Group_1__0__Impl rule__Music__Group_1__1 ;
    public final void rule__Music__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1356:1: ( rule__Music__Group_1__0__Impl rule__Music__Group_1__1 )
            // InternalGuardin.g:1357:2: rule__Music__Group_1__0__Impl rule__Music__Group_1__1
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
    // InternalGuardin.g:1364:1: rule__Music__Group_1__0__Impl : ( 'CustomSoundBank' ) ;
    public final void rule__Music__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1368:1: ( ( 'CustomSoundBank' ) )
            // InternalGuardin.g:1369:1: ( 'CustomSoundBank' )
            {
            // InternalGuardin.g:1369:1: ( 'CustomSoundBank' )
            // InternalGuardin.g:1370:2: 'CustomSoundBank'
            {
             before(grammarAccess.getMusicAccess().getCustomSoundBankKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalGuardin.g:1379:1: rule__Music__Group_1__1 : rule__Music__Group_1__1__Impl rule__Music__Group_1__2 ;
    public final void rule__Music__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1383:1: ( rule__Music__Group_1__1__Impl rule__Music__Group_1__2 )
            // InternalGuardin.g:1384:2: rule__Music__Group_1__1__Impl rule__Music__Group_1__2
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
    // InternalGuardin.g:1391:1: rule__Music__Group_1__1__Impl : ( 'basePath=' ) ;
    public final void rule__Music__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1395:1: ( ( 'basePath=' ) )
            // InternalGuardin.g:1396:1: ( 'basePath=' )
            {
            // InternalGuardin.g:1396:1: ( 'basePath=' )
            // InternalGuardin.g:1397:2: 'basePath='
            {
             before(grammarAccess.getMusicAccess().getBasePathKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalGuardin.g:1406:1: rule__Music__Group_1__2 : rule__Music__Group_1__2__Impl ;
    public final void rule__Music__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1410:1: ( rule__Music__Group_1__2__Impl )
            // InternalGuardin.g:1411:2: rule__Music__Group_1__2__Impl
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
    // InternalGuardin.g:1417:1: rule__Music__Group_1__2__Impl : ( ( rule__Music__SoundBankPathAssignment_1_2 ) ) ;
    public final void rule__Music__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1421:1: ( ( ( rule__Music__SoundBankPathAssignment_1_2 ) ) )
            // InternalGuardin.g:1422:1: ( ( rule__Music__SoundBankPathAssignment_1_2 ) )
            {
            // InternalGuardin.g:1422:1: ( ( rule__Music__SoundBankPathAssignment_1_2 ) )
            // InternalGuardin.g:1423:2: ( rule__Music__SoundBankPathAssignment_1_2 )
            {
             before(grammarAccess.getMusicAccess().getSoundBankPathAssignment_1_2()); 
            // InternalGuardin.g:1424:2: ( rule__Music__SoundBankPathAssignment_1_2 )
            // InternalGuardin.g:1424:3: rule__Music__SoundBankPathAssignment_1_2
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
    // InternalGuardin.g:1433:1: rule__Music__Group_11__0 : rule__Music__Group_11__0__Impl rule__Music__Group_11__1 ;
    public final void rule__Music__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1437:1: ( rule__Music__Group_11__0__Impl rule__Music__Group_11__1 )
            // InternalGuardin.g:1438:2: rule__Music__Group_11__0__Impl rule__Music__Group_11__1
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
    // InternalGuardin.g:1445:1: rule__Music__Group_11__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1449:1: ( ( '-' ) )
            // InternalGuardin.g:1450:1: ( '-' )
            {
            // InternalGuardin.g:1450:1: ( '-' )
            // InternalGuardin.g:1451:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalGuardin.g:1460:1: rule__Music__Group_11__1 : rule__Music__Group_11__1__Impl rule__Music__Group_11__2 ;
    public final void rule__Music__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1464:1: ( rule__Music__Group_11__1__Impl rule__Music__Group_11__2 )
            // InternalGuardin.g:1465:2: rule__Music__Group_11__1__Impl rule__Music__Group_11__2
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
    // InternalGuardin.g:1472:1: rule__Music__Group_11__1__Impl : ( ( rule__Music__TracksAssignment_11_1 ) ) ;
    public final void rule__Music__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1476:1: ( ( ( rule__Music__TracksAssignment_11_1 ) ) )
            // InternalGuardin.g:1477:1: ( ( rule__Music__TracksAssignment_11_1 ) )
            {
            // InternalGuardin.g:1477:1: ( ( rule__Music__TracksAssignment_11_1 ) )
            // InternalGuardin.g:1478:2: ( rule__Music__TracksAssignment_11_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_11_1()); 
            // InternalGuardin.g:1479:2: ( rule__Music__TracksAssignment_11_1 )
            // InternalGuardin.g:1479:3: rule__Music__TracksAssignment_11_1
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
    // InternalGuardin.g:1487:1: rule__Music__Group_11__2 : rule__Music__Group_11__2__Impl ;
    public final void rule__Music__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1491:1: ( rule__Music__Group_11__2__Impl )
            // InternalGuardin.g:1492:2: rule__Music__Group_11__2__Impl
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
    // InternalGuardin.g:1498:1: rule__Music__Group_11__2__Impl : ( ( rule__Music__Group_11_2__0 )* ) ;
    public final void rule__Music__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1502:1: ( ( ( rule__Music__Group_11_2__0 )* ) )
            // InternalGuardin.g:1503:1: ( ( rule__Music__Group_11_2__0 )* )
            {
            // InternalGuardin.g:1503:1: ( ( rule__Music__Group_11_2__0 )* )
            // InternalGuardin.g:1504:2: ( rule__Music__Group_11_2__0 )*
            {
             before(grammarAccess.getMusicAccess().getGroup_11_2()); 
            // InternalGuardin.g:1505:2: ( rule__Music__Group_11_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGuardin.g:1505:3: rule__Music__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Music__Group_11_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalGuardin.g:1514:1: rule__Music__Group_11_2__0 : rule__Music__Group_11_2__0__Impl rule__Music__Group_11_2__1 ;
    public final void rule__Music__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1518:1: ( rule__Music__Group_11_2__0__Impl rule__Music__Group_11_2__1 )
            // InternalGuardin.g:1519:2: rule__Music__Group_11_2__0__Impl rule__Music__Group_11_2__1
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
    // InternalGuardin.g:1526:1: rule__Music__Group_11_2__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1530:1: ( ( '-' ) )
            // InternalGuardin.g:1531:1: ( '-' )
            {
            // InternalGuardin.g:1531:1: ( '-' )
            // InternalGuardin.g:1532:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalGuardin.g:1541:1: rule__Music__Group_11_2__1 : rule__Music__Group_11_2__1__Impl ;
    public final void rule__Music__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1545:1: ( rule__Music__Group_11_2__1__Impl )
            // InternalGuardin.g:1546:2: rule__Music__Group_11_2__1__Impl
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
    // InternalGuardin.g:1552:1: rule__Music__Group_11_2__1__Impl : ( ( rule__Music__TracksAssignment_11_2_1 ) ) ;
    public final void rule__Music__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1556:1: ( ( ( rule__Music__TracksAssignment_11_2_1 ) ) )
            // InternalGuardin.g:1557:1: ( ( rule__Music__TracksAssignment_11_2_1 ) )
            {
            // InternalGuardin.g:1557:1: ( ( rule__Music__TracksAssignment_11_2_1 ) )
            // InternalGuardin.g:1558:2: ( rule__Music__TracksAssignment_11_2_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_11_2_1()); 
            // InternalGuardin.g:1559:2: ( rule__Music__TracksAssignment_11_2_1 )
            // InternalGuardin.g:1559:3: rule__Music__TracksAssignment_11_2_1
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
    // InternalGuardin.g:1568:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1572:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalGuardin.g:1573:2: rule__Section__Group__0__Impl rule__Section__Group__1
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
    // InternalGuardin.g:1580:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1584:1: ( ( () ) )
            // InternalGuardin.g:1585:1: ( () )
            {
            // InternalGuardin.g:1585:1: ( () )
            // InternalGuardin.g:1586:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalGuardin.g:1587:2: ()
            // InternalGuardin.g:1587:3: 
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
    // InternalGuardin.g:1595:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1599:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalGuardin.g:1600:2: rule__Section__Group__1__Impl rule__Section__Group__2
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
    // InternalGuardin.g:1607:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1611:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalGuardin.g:1612:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalGuardin.g:1612:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalGuardin.g:1613:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalGuardin.g:1614:2: ( rule__Section__NameAssignment_1 )
            // InternalGuardin.g:1614:3: rule__Section__NameAssignment_1
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
    // InternalGuardin.g:1622:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1626:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalGuardin.g:1627:2: rule__Section__Group__2__Impl rule__Section__Group__3
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
    // InternalGuardin.g:1634:1: rule__Section__Group__2__Impl : ( ':' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1638:1: ( ( ':' ) )
            // InternalGuardin.g:1639:1: ( ':' )
            {
            // InternalGuardin.g:1639:1: ( ':' )
            // InternalGuardin.g:1640:2: ':'
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
    // InternalGuardin.g:1649:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1653:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalGuardin.g:1654:2: rule__Section__Group__3__Impl rule__Section__Group__4
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
    // InternalGuardin.g:1661:1: rule__Section__Group__3__Impl : ( 'tempo=' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1665:1: ( ( 'tempo=' ) )
            // InternalGuardin.g:1666:1: ( 'tempo=' )
            {
            // InternalGuardin.g:1666:1: ( 'tempo=' )
            // InternalGuardin.g:1667:2: 'tempo='
            {
             before(grammarAccess.getSectionAccess().getTempoKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalGuardin.g:1676:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1680:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalGuardin.g:1681:2: rule__Section__Group__4__Impl rule__Section__Group__5
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
    // InternalGuardin.g:1688:1: rule__Section__Group__4__Impl : ( ( rule__Section__TempoAssignment_4 ) ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1692:1: ( ( ( rule__Section__TempoAssignment_4 ) ) )
            // InternalGuardin.g:1693:1: ( ( rule__Section__TempoAssignment_4 ) )
            {
            // InternalGuardin.g:1693:1: ( ( rule__Section__TempoAssignment_4 ) )
            // InternalGuardin.g:1694:2: ( rule__Section__TempoAssignment_4 )
            {
             before(grammarAccess.getSectionAccess().getTempoAssignment_4()); 
            // InternalGuardin.g:1695:2: ( rule__Section__TempoAssignment_4 )
            // InternalGuardin.g:1695:3: rule__Section__TempoAssignment_4
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
    // InternalGuardin.g:1703:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1707:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalGuardin.g:1708:2: rule__Section__Group__5__Impl rule__Section__Group__6
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
    // InternalGuardin.g:1715:1: rule__Section__Group__5__Impl : ( 'signature=' ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1719:1: ( ( 'signature=' ) )
            // InternalGuardin.g:1720:1: ( 'signature=' )
            {
            // InternalGuardin.g:1720:1: ( 'signature=' )
            // InternalGuardin.g:1721:2: 'signature='
            {
             before(grammarAccess.getSectionAccess().getSignatureKeyword_5()); 
            match(input,46,FOLLOW_2); 
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
    // InternalGuardin.g:1730:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1734:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalGuardin.g:1735:2: rule__Section__Group__6__Impl rule__Section__Group__7
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
    // InternalGuardin.g:1742:1: rule__Section__Group__6__Impl : ( ( rule__Section__SignatureAssignment_6 ) ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1746:1: ( ( ( rule__Section__SignatureAssignment_6 ) ) )
            // InternalGuardin.g:1747:1: ( ( rule__Section__SignatureAssignment_6 ) )
            {
            // InternalGuardin.g:1747:1: ( ( rule__Section__SignatureAssignment_6 ) )
            // InternalGuardin.g:1748:2: ( rule__Section__SignatureAssignment_6 )
            {
             before(grammarAccess.getSectionAccess().getSignatureAssignment_6()); 
            // InternalGuardin.g:1749:2: ( rule__Section__SignatureAssignment_6 )
            // InternalGuardin.g:1749:3: rule__Section__SignatureAssignment_6
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
    // InternalGuardin.g:1757:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1761:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalGuardin.g:1762:2: rule__Section__Group__7__Impl rule__Section__Group__8
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
    // InternalGuardin.g:1769:1: rule__Section__Group__7__Impl : ( 'bars=' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1773:1: ( ( 'bars=' ) )
            // InternalGuardin.g:1774:1: ( 'bars=' )
            {
            // InternalGuardin.g:1774:1: ( 'bars=' )
            // InternalGuardin.g:1775:2: 'bars='
            {
             before(grammarAccess.getSectionAccess().getBarsKeyword_7()); 
            match(input,47,FOLLOW_2); 
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
    // InternalGuardin.g:1784:1: rule__Section__Group__8 : rule__Section__Group__8__Impl ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1788:1: ( rule__Section__Group__8__Impl )
            // InternalGuardin.g:1789:2: rule__Section__Group__8__Impl
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
    // InternalGuardin.g:1795:1: rule__Section__Group__8__Impl : ( ( rule__Section__BarsAssignment_8 ) ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1799:1: ( ( ( rule__Section__BarsAssignment_8 ) ) )
            // InternalGuardin.g:1800:1: ( ( rule__Section__BarsAssignment_8 ) )
            {
            // InternalGuardin.g:1800:1: ( ( rule__Section__BarsAssignment_8 ) )
            // InternalGuardin.g:1801:2: ( rule__Section__BarsAssignment_8 )
            {
             before(grammarAccess.getSectionAccess().getBarsAssignment_8()); 
            // InternalGuardin.g:1802:2: ( rule__Section__BarsAssignment_8 )
            // InternalGuardin.g:1802:3: rule__Section__BarsAssignment_8
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
    // InternalGuardin.g:1811:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1815:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // InternalGuardin.g:1816:2: rule__Track__Group__0__Impl rule__Track__Group__1
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
    // InternalGuardin.g:1823:1: rule__Track__Group__0__Impl : ( () ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1827:1: ( ( () ) )
            // InternalGuardin.g:1828:1: ( () )
            {
            // InternalGuardin.g:1828:1: ( () )
            // InternalGuardin.g:1829:2: ()
            {
             before(grammarAccess.getTrackAccess().getTrackAction_0()); 
            // InternalGuardin.g:1830:2: ()
            // InternalGuardin.g:1830:3: 
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
    // InternalGuardin.g:1838:1: rule__Track__Group__1 : rule__Track__Group__1__Impl rule__Track__Group__2 ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1842:1: ( rule__Track__Group__1__Impl rule__Track__Group__2 )
            // InternalGuardin.g:1843:2: rule__Track__Group__1__Impl rule__Track__Group__2
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
    // InternalGuardin.g:1850:1: rule__Track__Group__1__Impl : ( ( rule__Track__Group_1__0 )? ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1854:1: ( ( ( rule__Track__Group_1__0 )? ) )
            // InternalGuardin.g:1855:1: ( ( rule__Track__Group_1__0 )? )
            {
            // InternalGuardin.g:1855:1: ( ( rule__Track__Group_1__0 )? )
            // InternalGuardin.g:1856:2: ( rule__Track__Group_1__0 )?
            {
             before(grammarAccess.getTrackAccess().getGroup_1()); 
            // InternalGuardin.g:1857:2: ( rule__Track__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGuardin.g:1857:3: rule__Track__Group_1__0
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
    // InternalGuardin.g:1865:1: rule__Track__Group__2 : rule__Track__Group__2__Impl ;
    public final void rule__Track__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1869:1: ( rule__Track__Group__2__Impl )
            // InternalGuardin.g:1870:2: rule__Track__Group__2__Impl
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
    // InternalGuardin.g:1876:1: rule__Track__Group__2__Impl : ( ( rule__Track__InstrumentAssignment_2 ) ) ;
    public final void rule__Track__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1880:1: ( ( ( rule__Track__InstrumentAssignment_2 ) ) )
            // InternalGuardin.g:1881:1: ( ( rule__Track__InstrumentAssignment_2 ) )
            {
            // InternalGuardin.g:1881:1: ( ( rule__Track__InstrumentAssignment_2 ) )
            // InternalGuardin.g:1882:2: ( rule__Track__InstrumentAssignment_2 )
            {
             before(grammarAccess.getTrackAccess().getInstrumentAssignment_2()); 
            // InternalGuardin.g:1883:2: ( rule__Track__InstrumentAssignment_2 )
            // InternalGuardin.g:1883:3: rule__Track__InstrumentAssignment_2
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
    // InternalGuardin.g:1892:1: rule__Track__Group_1__0 : rule__Track__Group_1__0__Impl rule__Track__Group_1__1 ;
    public final void rule__Track__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1896:1: ( rule__Track__Group_1__0__Impl rule__Track__Group_1__1 )
            // InternalGuardin.g:1897:2: rule__Track__Group_1__0__Impl rule__Track__Group_1__1
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
    // InternalGuardin.g:1904:1: rule__Track__Group_1__0__Impl : ( ( rule__Track__NameAssignment_1_0 ) ) ;
    public final void rule__Track__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1908:1: ( ( ( rule__Track__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:1909:1: ( ( rule__Track__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:1909:1: ( ( rule__Track__NameAssignment_1_0 ) )
            // InternalGuardin.g:1910:2: ( rule__Track__NameAssignment_1_0 )
            {
             before(grammarAccess.getTrackAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:1911:2: ( rule__Track__NameAssignment_1_0 )
            // InternalGuardin.g:1911:3: rule__Track__NameAssignment_1_0
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
    // InternalGuardin.g:1919:1: rule__Track__Group_1__1 : rule__Track__Group_1__1__Impl ;
    public final void rule__Track__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1923:1: ( rule__Track__Group_1__1__Impl )
            // InternalGuardin.g:1924:2: rule__Track__Group_1__1__Impl
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
    // InternalGuardin.g:1930:1: rule__Track__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Track__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1934:1: ( ( ':' ) )
            // InternalGuardin.g:1935:1: ( ':' )
            {
            // InternalGuardin.g:1935:1: ( ':' )
            // InternalGuardin.g:1936:2: ':'
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
    // InternalGuardin.g:1946:1: rule__EmptyNote__Group__0 : rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 ;
    public final void rule__EmptyNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1950:1: ( rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 )
            // InternalGuardin.g:1951:2: rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1
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
    // InternalGuardin.g:1958:1: rule__EmptyNote__Group__0__Impl : ( () ) ;
    public final void rule__EmptyNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1962:1: ( ( () ) )
            // InternalGuardin.g:1963:1: ( () )
            {
            // InternalGuardin.g:1963:1: ( () )
            // InternalGuardin.g:1964:2: ()
            {
             before(grammarAccess.getEmptyNoteAccess().getEmptyNoteAction_0()); 
            // InternalGuardin.g:1965:2: ()
            // InternalGuardin.g:1965:3: 
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
    // InternalGuardin.g:1973:1: rule__EmptyNote__Group__1 : rule__EmptyNote__Group__1__Impl ;
    public final void rule__EmptyNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1977:1: ( rule__EmptyNote__Group__1__Impl )
            // InternalGuardin.g:1978:2: rule__EmptyNote__Group__1__Impl
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
    // InternalGuardin.g:1984:1: rule__EmptyNote__Group__1__Impl : ( '$' ) ;
    public final void rule__EmptyNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1988:1: ( ( '$' ) )
            // InternalGuardin.g:1989:1: ( '$' )
            {
            // InternalGuardin.g:1989:1: ( '$' )
            // InternalGuardin.g:1990:2: '$'
            {
             before(grammarAccess.getEmptyNoteAccess().getDollarSignKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalGuardin.g:2000:1: rule__Battery__Group__0 : rule__Battery__Group__0__Impl rule__Battery__Group__1 ;
    public final void rule__Battery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2004:1: ( rule__Battery__Group__0__Impl rule__Battery__Group__1 )
            // InternalGuardin.g:2005:2: rule__Battery__Group__0__Impl rule__Battery__Group__1
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
    // InternalGuardin.g:2012:1: rule__Battery__Group__0__Impl : ( () ) ;
    public final void rule__Battery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2016:1: ( ( () ) )
            // InternalGuardin.g:2017:1: ( () )
            {
            // InternalGuardin.g:2017:1: ( () )
            // InternalGuardin.g:2018:2: ()
            {
             before(grammarAccess.getBatteryAccess().getBatteryAction_0()); 
            // InternalGuardin.g:2019:2: ()
            // InternalGuardin.g:2019:3: 
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
    // InternalGuardin.g:2027:1: rule__Battery__Group__1 : rule__Battery__Group__1__Impl rule__Battery__Group__2 ;
    public final void rule__Battery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2031:1: ( rule__Battery__Group__1__Impl rule__Battery__Group__2 )
            // InternalGuardin.g:2032:2: rule__Battery__Group__1__Impl rule__Battery__Group__2
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
    // InternalGuardin.g:2039:1: rule__Battery__Group__1__Impl : ( 'battery' ) ;
    public final void rule__Battery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2043:1: ( ( 'battery' ) )
            // InternalGuardin.g:2044:1: ( 'battery' )
            {
            // InternalGuardin.g:2044:1: ( 'battery' )
            // InternalGuardin.g:2045:2: 'battery'
            {
             before(grammarAccess.getBatteryAccess().getBatteryKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalGuardin.g:2054:1: rule__Battery__Group__2 : rule__Battery__Group__2__Impl rule__Battery__Group__3 ;
    public final void rule__Battery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2058:1: ( rule__Battery__Group__2__Impl rule__Battery__Group__3 )
            // InternalGuardin.g:2059:2: rule__Battery__Group__2__Impl rule__Battery__Group__3
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
    // InternalGuardin.g:2066:1: rule__Battery__Group__2__Impl : ( ( rule__Battery__Alternatives_2 ) ) ;
    public final void rule__Battery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2070:1: ( ( ( rule__Battery__Alternatives_2 ) ) )
            // InternalGuardin.g:2071:1: ( ( rule__Battery__Alternatives_2 ) )
            {
            // InternalGuardin.g:2071:1: ( ( rule__Battery__Alternatives_2 ) )
            // InternalGuardin.g:2072:2: ( rule__Battery__Alternatives_2 )
            {
             before(grammarAccess.getBatteryAccess().getAlternatives_2()); 
            // InternalGuardin.g:2073:2: ( rule__Battery__Alternatives_2 )
            // InternalGuardin.g:2073:3: rule__Battery__Alternatives_2
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
    // InternalGuardin.g:2081:1: rule__Battery__Group__3 : rule__Battery__Group__3__Impl ;
    public final void rule__Battery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2085:1: ( rule__Battery__Group__3__Impl )
            // InternalGuardin.g:2086:2: rule__Battery__Group__3__Impl
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
    // InternalGuardin.g:2092:1: rule__Battery__Group__3__Impl : ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) ) ;
    public final void rule__Battery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2096:1: ( ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) ) )
            // InternalGuardin.g:2097:1: ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) )
            {
            // InternalGuardin.g:2097:1: ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) )
            // InternalGuardin.g:2098:2: ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* )
            {
            // InternalGuardin.g:2098:2: ( ( rule__Battery__Alternatives_3 ) )
            // InternalGuardin.g:2099:3: ( rule__Battery__Alternatives_3 )
            {
             before(grammarAccess.getBatteryAccess().getAlternatives_3()); 
            // InternalGuardin.g:2100:3: ( rule__Battery__Alternatives_3 )
            // InternalGuardin.g:2100:4: rule__Battery__Alternatives_3
            {
            pushFollow(FOLLOW_21);
            rule__Battery__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getAlternatives_3()); 

            }

            // InternalGuardin.g:2103:2: ( ( rule__Battery__Alternatives_3 )* )
            // InternalGuardin.g:2104:3: ( rule__Battery__Alternatives_3 )*
            {
             before(grammarAccess.getBatteryAccess().getAlternatives_3()); 
            // InternalGuardin.g:2105:3: ( rule__Battery__Alternatives_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==50||LA21_0==52) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGuardin.g:2105:4: rule__Battery__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Battery__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalGuardin.g:2115:1: rule__Battery__Group_2_1__0 : rule__Battery__Group_2_1__0__Impl rule__Battery__Group_2_1__1 ;
    public final void rule__Battery__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2119:1: ( rule__Battery__Group_2_1__0__Impl rule__Battery__Group_2_1__1 )
            // InternalGuardin.g:2120:2: rule__Battery__Group_2_1__0__Impl rule__Battery__Group_2_1__1
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
    // InternalGuardin.g:2127:1: rule__Battery__Group_2_1__0__Impl : ( ( rule__Battery__NameAssignment_2_1_0 ) ) ;
    public final void rule__Battery__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2131:1: ( ( ( rule__Battery__NameAssignment_2_1_0 ) ) )
            // InternalGuardin.g:2132:1: ( ( rule__Battery__NameAssignment_2_1_0 ) )
            {
            // InternalGuardin.g:2132:1: ( ( rule__Battery__NameAssignment_2_1_0 ) )
            // InternalGuardin.g:2133:2: ( rule__Battery__NameAssignment_2_1_0 )
            {
             before(grammarAccess.getBatteryAccess().getNameAssignment_2_1_0()); 
            // InternalGuardin.g:2134:2: ( rule__Battery__NameAssignment_2_1_0 )
            // InternalGuardin.g:2134:3: rule__Battery__NameAssignment_2_1_0
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
    // InternalGuardin.g:2142:1: rule__Battery__Group_2_1__1 : rule__Battery__Group_2_1__1__Impl ;
    public final void rule__Battery__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2146:1: ( rule__Battery__Group_2_1__1__Impl )
            // InternalGuardin.g:2147:2: rule__Battery__Group_2_1__1__Impl
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
    // InternalGuardin.g:2153:1: rule__Battery__Group_2_1__1__Impl : ( ':' ) ;
    public final void rule__Battery__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2157:1: ( ( ':' ) )
            // InternalGuardin.g:2158:1: ( ':' )
            {
            // InternalGuardin.g:2158:1: ( ':' )
            // InternalGuardin.g:2159:2: ':'
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
    // InternalGuardin.g:2169:1: rule__SectionBatteryLayer__Group__0 : rule__SectionBatteryLayer__Group__0__Impl rule__SectionBatteryLayer__Group__1 ;
    public final void rule__SectionBatteryLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2173:1: ( rule__SectionBatteryLayer__Group__0__Impl rule__SectionBatteryLayer__Group__1 )
            // InternalGuardin.g:2174:2: rule__SectionBatteryLayer__Group__0__Impl rule__SectionBatteryLayer__Group__1
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
    // InternalGuardin.g:2181:1: rule__SectionBatteryLayer__Group__0__Impl : ( () ) ;
    public final void rule__SectionBatteryLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2185:1: ( ( () ) )
            // InternalGuardin.g:2186:1: ( () )
            {
            // InternalGuardin.g:2186:1: ( () )
            // InternalGuardin.g:2187:2: ()
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getSectionLayerAction_0()); 
            // InternalGuardin.g:2188:2: ()
            // InternalGuardin.g:2188:3: 
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
    // InternalGuardin.g:2196:1: rule__SectionBatteryLayer__Group__1 : rule__SectionBatteryLayer__Group__1__Impl rule__SectionBatteryLayer__Group__2 ;
    public final void rule__SectionBatteryLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2200:1: ( rule__SectionBatteryLayer__Group__1__Impl rule__SectionBatteryLayer__Group__2 )
            // InternalGuardin.g:2201:2: rule__SectionBatteryLayer__Group__1__Impl rule__SectionBatteryLayer__Group__2
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
    // InternalGuardin.g:2208:1: rule__SectionBatteryLayer__Group__1__Impl : ( 'begin_section' ) ;
    public final void rule__SectionBatteryLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2212:1: ( ( 'begin_section' ) )
            // InternalGuardin.g:2213:1: ( 'begin_section' )
            {
            // InternalGuardin.g:2213:1: ( 'begin_section' )
            // InternalGuardin.g:2214:2: 'begin_section'
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getBegin_sectionKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalGuardin.g:2223:1: rule__SectionBatteryLayer__Group__2 : rule__SectionBatteryLayer__Group__2__Impl rule__SectionBatteryLayer__Group__3 ;
    public final void rule__SectionBatteryLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2227:1: ( rule__SectionBatteryLayer__Group__2__Impl rule__SectionBatteryLayer__Group__3 )
            // InternalGuardin.g:2228:2: rule__SectionBatteryLayer__Group__2__Impl rule__SectionBatteryLayer__Group__3
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
    // InternalGuardin.g:2235:1: rule__SectionBatteryLayer__Group__2__Impl : ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) ) ;
    public final void rule__SectionBatteryLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2239:1: ( ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) ) )
            // InternalGuardin.g:2240:1: ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) )
            {
            // InternalGuardin.g:2240:1: ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) )
            // InternalGuardin.g:2241:2: ( rule__SectionBatteryLayer__SectionAssignment_2 )
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getSectionAssignment_2()); 
            // InternalGuardin.g:2242:2: ( rule__SectionBatteryLayer__SectionAssignment_2 )
            // InternalGuardin.g:2242:3: rule__SectionBatteryLayer__SectionAssignment_2
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
    // InternalGuardin.g:2250:1: rule__SectionBatteryLayer__Group__3 : rule__SectionBatteryLayer__Group__3__Impl rule__SectionBatteryLayer__Group__4 ;
    public final void rule__SectionBatteryLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2254:1: ( rule__SectionBatteryLayer__Group__3__Impl rule__SectionBatteryLayer__Group__4 )
            // InternalGuardin.g:2255:2: rule__SectionBatteryLayer__Group__3__Impl rule__SectionBatteryLayer__Group__4
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
    // InternalGuardin.g:2262:1: rule__SectionBatteryLayer__Group__3__Impl : ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) ) ;
    public final void rule__SectionBatteryLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2266:1: ( ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) ) )
            // InternalGuardin.g:2267:1: ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) )
            {
            // InternalGuardin.g:2267:1: ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) )
            // InternalGuardin.g:2268:2: ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* )
            {
            // InternalGuardin.g:2268:2: ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) )
            // InternalGuardin.g:2269:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2270:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )
            // InternalGuardin.g:2270:4: rule__SectionBatteryLayer__LayersAssignment_3
            {
            pushFollow(FOLLOW_21);
            rule__SectionBatteryLayer__LayersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionBatteryLayerAccess().getLayersAssignment_3()); 

            }

            // InternalGuardin.g:2273:2: ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* )
            // InternalGuardin.g:2274:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )*
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2275:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==52) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGuardin.g:2275:4: rule__SectionBatteryLayer__LayersAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SectionBatteryLayer__LayersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalGuardin.g:2284:1: rule__SectionBatteryLayer__Group__4 : rule__SectionBatteryLayer__Group__4__Impl ;
    public final void rule__SectionBatteryLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2288:1: ( rule__SectionBatteryLayer__Group__4__Impl )
            // InternalGuardin.g:2289:2: rule__SectionBatteryLayer__Group__4__Impl
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
    // InternalGuardin.g:2295:1: rule__SectionBatteryLayer__Group__4__Impl : ( 'end_section' ) ;
    public final void rule__SectionBatteryLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2299:1: ( ( 'end_section' ) )
            // InternalGuardin.g:2300:1: ( 'end_section' )
            {
            // InternalGuardin.g:2300:1: ( 'end_section' )
            // InternalGuardin.g:2301:2: 'end_section'
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getEnd_sectionKeyword_4()); 
            match(input,51,FOLLOW_2); 
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
    // InternalGuardin.g:2311:1: rule__BatteryLayer__Group__0 : rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1 ;
    public final void rule__BatteryLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2315:1: ( rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1 )
            // InternalGuardin.g:2316:2: rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1
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
    // InternalGuardin.g:2323:1: rule__BatteryLayer__Group__0__Impl : ( () ) ;
    public final void rule__BatteryLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2327:1: ( ( () ) )
            // InternalGuardin.g:2328:1: ( () )
            {
            // InternalGuardin.g:2328:1: ( () )
            // InternalGuardin.g:2329:2: ()
            {
             before(grammarAccess.getBatteryLayerAccess().getLayerAction_0()); 
            // InternalGuardin.g:2330:2: ()
            // InternalGuardin.g:2330:3: 
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
    // InternalGuardin.g:2338:1: rule__BatteryLayer__Group__1 : rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2 ;
    public final void rule__BatteryLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2342:1: ( rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2 )
            // InternalGuardin.g:2343:2: rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2
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
    // InternalGuardin.g:2350:1: rule__BatteryLayer__Group__1__Impl : ( 'layer:' ) ;
    public final void rule__BatteryLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2354:1: ( ( 'layer:' ) )
            // InternalGuardin.g:2355:1: ( 'layer:' )
            {
            // InternalGuardin.g:2355:1: ( 'layer:' )
            // InternalGuardin.g:2356:2: 'layer:'
            {
             before(grammarAccess.getBatteryLayerAccess().getLayerKeyword_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalGuardin.g:2365:1: rule__BatteryLayer__Group__2 : rule__BatteryLayer__Group__2__Impl ;
    public final void rule__BatteryLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2369:1: ( rule__BatteryLayer__Group__2__Impl )
            // InternalGuardin.g:2370:2: rule__BatteryLayer__Group__2__Impl
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
    // InternalGuardin.g:2376:1: rule__BatteryLayer__Group__2__Impl : ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) ) ;
    public final void rule__BatteryLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2380:1: ( ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2381:1: ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2381:1: ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2382:2: ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2382:2: ( ( rule__BatteryLayer__NotesAssignment_2 ) )
            // InternalGuardin.g:2383:3: ( rule__BatteryLayer__NotesAssignment_2 )
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2384:3: ( rule__BatteryLayer__NotesAssignment_2 )
            // InternalGuardin.g:2384:4: rule__BatteryLayer__NotesAssignment_2
            {
            pushFollow(FOLLOW_25);
            rule__BatteryLayer__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2387:2: ( ( rule__BatteryLayer__NotesAssignment_2 )* )
            // InternalGuardin.g:2388:3: ( rule__BatteryLayer__NotesAssignment_2 )*
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2389:3: ( rule__BatteryLayer__NotesAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=16 && LA23_0<=21)||LA23_0==48||LA23_0==53) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGuardin.g:2389:4: rule__BatteryLayer__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__BatteryLayer__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalGuardin.g:2399:1: rule__BatteryNote__Group__0 : rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 ;
    public final void rule__BatteryNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2403:1: ( rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 )
            // InternalGuardin.g:2404:2: rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1
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
    // InternalGuardin.g:2411:1: rule__BatteryNote__Group__0__Impl : ( () ) ;
    public final void rule__BatteryNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2415:1: ( ( () ) )
            // InternalGuardin.g:2416:1: ( () )
            {
            // InternalGuardin.g:2416:1: ( () )
            // InternalGuardin.g:2417:2: ()
            {
             before(grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0()); 
            // InternalGuardin.g:2418:2: ()
            // InternalGuardin.g:2418:3: 
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
    // InternalGuardin.g:2426:1: rule__BatteryNote__Group__1 : rule__BatteryNote__Group__1__Impl rule__BatteryNote__Group__2 ;
    public final void rule__BatteryNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2430:1: ( rule__BatteryNote__Group__1__Impl rule__BatteryNote__Group__2 )
            // InternalGuardin.g:2431:2: rule__BatteryNote__Group__1__Impl rule__BatteryNote__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__BatteryNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BatteryNote__Group__2();

            state._fsp--;


            }

        }
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
    // InternalGuardin.g:2438:1: rule__BatteryNote__Group__1__Impl : ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) ;
    public final void rule__BatteryNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2442:1: ( ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) )
            // InternalGuardin.g:2443:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            {
            // InternalGuardin.g:2443:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            // InternalGuardin.g:2444:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            {
             before(grammarAccess.getBatteryNoteAccess().getNoteTypeAssignment_1()); 
            // InternalGuardin.g:2445:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            // InternalGuardin.g:2445:3: rule__BatteryNote__NoteTypeAssignment_1
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


    // $ANTLR start "rule__BatteryNote__Group__2"
    // InternalGuardin.g:2453:1: rule__BatteryNote__Group__2 : rule__BatteryNote__Group__2__Impl ;
    public final void rule__BatteryNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2457:1: ( rule__BatteryNote__Group__2__Impl )
            // InternalGuardin.g:2458:2: rule__BatteryNote__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BatteryNote__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryNote__Group__2"


    // $ANTLR start "rule__BatteryNote__Group__2__Impl"
    // InternalGuardin.g:2464:1: rule__BatteryNote__Group__2__Impl : ( ( rule__BatteryNote__DurationAssignment_2 )? ) ;
    public final void rule__BatteryNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2468:1: ( ( ( rule__BatteryNote__DurationAssignment_2 )? ) )
            // InternalGuardin.g:2469:1: ( ( rule__BatteryNote__DurationAssignment_2 )? )
            {
            // InternalGuardin.g:2469:1: ( ( rule__BatteryNote__DurationAssignment_2 )? )
            // InternalGuardin.g:2470:2: ( rule__BatteryNote__DurationAssignment_2 )?
            {
             before(grammarAccess.getBatteryNoteAccess().getDurationAssignment_2()); 
            // InternalGuardin.g:2471:2: ( rule__BatteryNote__DurationAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=13 && LA24_0<=15)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGuardin.g:2471:3: rule__BatteryNote__DurationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BatteryNote__DurationAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBatteryNoteAccess().getDurationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryNote__Group__2__Impl"


    // $ANTLR start "rule__CompositeBatteryNote__Group__0"
    // InternalGuardin.g:2480:1: rule__CompositeBatteryNote__Group__0 : rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1 ;
    public final void rule__CompositeBatteryNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2484:1: ( rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1 )
            // InternalGuardin.g:2485:2: rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1
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
    // InternalGuardin.g:2492:1: rule__CompositeBatteryNote__Group__0__Impl : ( () ) ;
    public final void rule__CompositeBatteryNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2496:1: ( ( () ) )
            // InternalGuardin.g:2497:1: ( () )
            {
            // InternalGuardin.g:2497:1: ( () )
            // InternalGuardin.g:2498:2: ()
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getCompositeNoteAction_0()); 
            // InternalGuardin.g:2499:2: ()
            // InternalGuardin.g:2499:3: 
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
    // InternalGuardin.g:2507:1: rule__CompositeBatteryNote__Group__1 : rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2 ;
    public final void rule__CompositeBatteryNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2511:1: ( rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2 )
            // InternalGuardin.g:2512:2: rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalGuardin.g:2519:1: rule__CompositeBatteryNote__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositeBatteryNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2523:1: ( ( '(' ) )
            // InternalGuardin.g:2524:1: ( '(' )
            {
            // InternalGuardin.g:2524:1: ( '(' )
            // InternalGuardin.g:2525:2: '('
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getLeftParenthesisKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGuardin.g:2534:1: rule__CompositeBatteryNote__Group__2 : rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3 ;
    public final void rule__CompositeBatteryNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2538:1: ( rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3 )
            // InternalGuardin.g:2539:2: rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalGuardin.g:2546:1: rule__CompositeBatteryNote__Group__2__Impl : ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) ) ;
    public final void rule__CompositeBatteryNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2550:1: ( ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2551:1: ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2551:1: ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2552:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2552:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) )
            // InternalGuardin.g:2553:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2554:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )
            // InternalGuardin.g:2554:4: rule__CompositeBatteryNote__NotesAssignment_2
            {
            pushFollow(FOLLOW_30);
            rule__CompositeBatteryNote__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2557:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* )
            // InternalGuardin.g:2558:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )*
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2559:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=16 && LA25_0<=21)||LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGuardin.g:2559:4: rule__CompositeBatteryNote__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__CompositeBatteryNote__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalGuardin.g:2568:1: rule__CompositeBatteryNote__Group__3 : rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4 ;
    public final void rule__CompositeBatteryNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2572:1: ( rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4 )
            // InternalGuardin.g:2573:2: rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalGuardin.g:2580:1: rule__CompositeBatteryNote__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositeBatteryNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2584:1: ( ( ')' ) )
            // InternalGuardin.g:2585:1: ( ')' )
            {
            // InternalGuardin.g:2585:1: ( ')' )
            // InternalGuardin.g:2586:2: ')'
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getRightParenthesisKeyword_3()); 
            match(input,54,FOLLOW_2); 
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
    // InternalGuardin.g:2595:1: rule__CompositeBatteryNote__Group__4 : rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5 ;
    public final void rule__CompositeBatteryNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2599:1: ( rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5 )
            // InternalGuardin.g:2600:2: rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5
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
    // InternalGuardin.g:2607:1: rule__CompositeBatteryNote__Group__4__Impl : ( 'x' ) ;
    public final void rule__CompositeBatteryNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2611:1: ( ( 'x' ) )
            // InternalGuardin.g:2612:1: ( 'x' )
            {
            // InternalGuardin.g:2612:1: ( 'x' )
            // InternalGuardin.g:2613:2: 'x'
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getXKeyword_4()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGuardin.g:2622:1: rule__CompositeBatteryNote__Group__5 : rule__CompositeBatteryNote__Group__5__Impl ;
    public final void rule__CompositeBatteryNote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2626:1: ( rule__CompositeBatteryNote__Group__5__Impl )
            // InternalGuardin.g:2627:2: rule__CompositeBatteryNote__Group__5__Impl
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
    // InternalGuardin.g:2633:1: rule__CompositeBatteryNote__Group__5__Impl : ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) ) ;
    public final void rule__CompositeBatteryNote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2637:1: ( ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) ) )
            // InternalGuardin.g:2638:1: ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) )
            {
            // InternalGuardin.g:2638:1: ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) )
            // InternalGuardin.g:2639:2: ( rule__CompositeBatteryNote__RepeatsAssignment_5 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getRepeatsAssignment_5()); 
            // InternalGuardin.g:2640:2: ( rule__CompositeBatteryNote__RepeatsAssignment_5 )
            // InternalGuardin.g:2640:3: rule__CompositeBatteryNote__RepeatsAssignment_5
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


    // $ANTLR start "rule__Melody__Group__0"
    // InternalGuardin.g:2649:1: rule__Melody__Group__0 : rule__Melody__Group__0__Impl rule__Melody__Group__1 ;
    public final void rule__Melody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2653:1: ( rule__Melody__Group__0__Impl rule__Melody__Group__1 )
            // InternalGuardin.g:2654:2: rule__Melody__Group__0__Impl rule__Melody__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Melody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Melody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group__0"


    // $ANTLR start "rule__Melody__Group__0__Impl"
    // InternalGuardin.g:2661:1: rule__Melody__Group__0__Impl : ( () ) ;
    public final void rule__Melody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2665:1: ( ( () ) )
            // InternalGuardin.g:2666:1: ( () )
            {
            // InternalGuardin.g:2666:1: ( () )
            // InternalGuardin.g:2667:2: ()
            {
             before(grammarAccess.getMelodyAccess().getMelodyAction_0()); 
            // InternalGuardin.g:2668:2: ()
            // InternalGuardin.g:2668:3: 
            {
            }

             after(grammarAccess.getMelodyAccess().getMelodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group__0__Impl"


    // $ANTLR start "rule__Melody__Group__1"
    // InternalGuardin.g:2676:1: rule__Melody__Group__1 : rule__Melody__Group__1__Impl rule__Melody__Group__2 ;
    public final void rule__Melody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2680:1: ( rule__Melody__Group__1__Impl rule__Melody__Group__2 )
            // InternalGuardin.g:2681:2: rule__Melody__Group__1__Impl rule__Melody__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Melody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Melody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group__1"


    // $ANTLR start "rule__Melody__Group__1__Impl"
    // InternalGuardin.g:2688:1: rule__Melody__Group__1__Impl : ( ( rule__Melody__Alternatives_1 ) ) ;
    public final void rule__Melody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2692:1: ( ( ( rule__Melody__Alternatives_1 ) ) )
            // InternalGuardin.g:2693:1: ( ( rule__Melody__Alternatives_1 ) )
            {
            // InternalGuardin.g:2693:1: ( ( rule__Melody__Alternatives_1 ) )
            // InternalGuardin.g:2694:2: ( rule__Melody__Alternatives_1 )
            {
             before(grammarAccess.getMelodyAccess().getAlternatives_1()); 
            // InternalGuardin.g:2695:2: ( rule__Melody__Alternatives_1 )
            // InternalGuardin.g:2695:3: rule__Melody__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Melody__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMelodyAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group__1__Impl"


    // $ANTLR start "rule__Melody__Group__2"
    // InternalGuardin.g:2703:1: rule__Melody__Group__2 : rule__Melody__Group__2__Impl rule__Melody__Group__3 ;
    public final void rule__Melody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2707:1: ( rule__Melody__Group__2__Impl rule__Melody__Group__3 )
            // InternalGuardin.g:2708:2: rule__Melody__Group__2__Impl rule__Melody__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Melody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Melody__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group__2"


    // $ANTLR start "rule__Melody__Group__2__Impl"
    // InternalGuardin.g:2715:1: rule__Melody__Group__2__Impl : ( ( rule__Melody__Alternatives_2 ) ) ;
    public final void rule__Melody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2719:1: ( ( ( rule__Melody__Alternatives_2 ) ) )
            // InternalGuardin.g:2720:1: ( ( rule__Melody__Alternatives_2 ) )
            {
            // InternalGuardin.g:2720:1: ( ( rule__Melody__Alternatives_2 ) )
            // InternalGuardin.g:2721:2: ( rule__Melody__Alternatives_2 )
            {
             before(grammarAccess.getMelodyAccess().getAlternatives_2()); 
            // InternalGuardin.g:2722:2: ( rule__Melody__Alternatives_2 )
            // InternalGuardin.g:2722:3: rule__Melody__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Melody__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getMelodyAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group__2__Impl"


    // $ANTLR start "rule__Melody__Group__3"
    // InternalGuardin.g:2730:1: rule__Melody__Group__3 : rule__Melody__Group__3__Impl ;
    public final void rule__Melody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2734:1: ( rule__Melody__Group__3__Impl )
            // InternalGuardin.g:2735:2: rule__Melody__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Melody__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group__3"


    // $ANTLR start "rule__Melody__Group__3__Impl"
    // InternalGuardin.g:2741:1: rule__Melody__Group__3__Impl : ( ( ( rule__Melody__Alternatives_3 ) ) ( ( rule__Melody__Alternatives_3 )* ) ) ;
    public final void rule__Melody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2745:1: ( ( ( ( rule__Melody__Alternatives_3 ) ) ( ( rule__Melody__Alternatives_3 )* ) ) )
            // InternalGuardin.g:2746:1: ( ( ( rule__Melody__Alternatives_3 ) ) ( ( rule__Melody__Alternatives_3 )* ) )
            {
            // InternalGuardin.g:2746:1: ( ( ( rule__Melody__Alternatives_3 ) ) ( ( rule__Melody__Alternatives_3 )* ) )
            // InternalGuardin.g:2747:2: ( ( rule__Melody__Alternatives_3 ) ) ( ( rule__Melody__Alternatives_3 )* )
            {
            // InternalGuardin.g:2747:2: ( ( rule__Melody__Alternatives_3 ) )
            // InternalGuardin.g:2748:3: ( rule__Melody__Alternatives_3 )
            {
             before(grammarAccess.getMelodyAccess().getAlternatives_3()); 
            // InternalGuardin.g:2749:3: ( rule__Melody__Alternatives_3 )
            // InternalGuardin.g:2749:4: rule__Melody__Alternatives_3
            {
            pushFollow(FOLLOW_21);
            rule__Melody__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getMelodyAccess().getAlternatives_3()); 

            }

            // InternalGuardin.g:2752:2: ( ( rule__Melody__Alternatives_3 )* )
            // InternalGuardin.g:2753:3: ( rule__Melody__Alternatives_3 )*
            {
             before(grammarAccess.getMelodyAccess().getAlternatives_3()); 
            // InternalGuardin.g:2754:3: ( rule__Melody__Alternatives_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50||LA26_0==52) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGuardin.g:2754:4: rule__Melody__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Melody__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMelodyAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Melody__Group__3__Impl"


    // $ANTLR start "rule__Melody__Group_1_2__0"
    // InternalGuardin.g:2764:1: rule__Melody__Group_1_2__0 : rule__Melody__Group_1_2__0__Impl rule__Melody__Group_1_2__1 ;
    public final void rule__Melody__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2768:1: ( rule__Melody__Group_1_2__0__Impl rule__Melody__Group_1_2__1 )
            // InternalGuardin.g:2769:2: rule__Melody__Group_1_2__0__Impl rule__Melody__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Melody__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Melody__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group_1_2__0"


    // $ANTLR start "rule__Melody__Group_1_2__0__Impl"
    // InternalGuardin.g:2776:1: rule__Melody__Group_1_2__0__Impl : ( 'other:' ) ;
    public final void rule__Melody__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2780:1: ( ( 'other:' ) )
            // InternalGuardin.g:2781:1: ( 'other:' )
            {
            // InternalGuardin.g:2781:1: ( 'other:' )
            // InternalGuardin.g:2782:2: 'other:'
            {
             before(grammarAccess.getMelodyAccess().getOtherKeyword_1_2_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMelodyAccess().getOtherKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group_1_2__0__Impl"


    // $ANTLR start "rule__Melody__Group_1_2__1"
    // InternalGuardin.g:2791:1: rule__Melody__Group_1_2__1 : rule__Melody__Group_1_2__1__Impl ;
    public final void rule__Melody__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2795:1: ( rule__Melody__Group_1_2__1__Impl )
            // InternalGuardin.g:2796:2: rule__Melody__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Melody__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group_1_2__1"


    // $ANTLR start "rule__Melody__Group_1_2__1__Impl"
    // InternalGuardin.g:2802:1: rule__Melody__Group_1_2__1__Impl : ( ( rule__Melody__OtherAssignment_1_2_1 ) ) ;
    public final void rule__Melody__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2806:1: ( ( ( rule__Melody__OtherAssignment_1_2_1 ) ) )
            // InternalGuardin.g:2807:1: ( ( rule__Melody__OtherAssignment_1_2_1 ) )
            {
            // InternalGuardin.g:2807:1: ( ( rule__Melody__OtherAssignment_1_2_1 ) )
            // InternalGuardin.g:2808:2: ( rule__Melody__OtherAssignment_1_2_1 )
            {
             before(grammarAccess.getMelodyAccess().getOtherAssignment_1_2_1()); 
            // InternalGuardin.g:2809:2: ( rule__Melody__OtherAssignment_1_2_1 )
            // InternalGuardin.g:2809:3: rule__Melody__OtherAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Melody__OtherAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMelodyAccess().getOtherAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group_1_2__1__Impl"


    // $ANTLR start "rule__Melody__Group_2_1__0"
    // InternalGuardin.g:2818:1: rule__Melody__Group_2_1__0 : rule__Melody__Group_2_1__0__Impl rule__Melody__Group_2_1__1 ;
    public final void rule__Melody__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2822:1: ( rule__Melody__Group_2_1__0__Impl rule__Melody__Group_2_1__1 )
            // InternalGuardin.g:2823:2: rule__Melody__Group_2_1__0__Impl rule__Melody__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Melody__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Melody__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group_2_1__0"


    // $ANTLR start "rule__Melody__Group_2_1__0__Impl"
    // InternalGuardin.g:2830:1: rule__Melody__Group_2_1__0__Impl : ( ( rule__Melody__NameAssignment_2_1_0 ) ) ;
    public final void rule__Melody__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2834:1: ( ( ( rule__Melody__NameAssignment_2_1_0 ) ) )
            // InternalGuardin.g:2835:1: ( ( rule__Melody__NameAssignment_2_1_0 ) )
            {
            // InternalGuardin.g:2835:1: ( ( rule__Melody__NameAssignment_2_1_0 ) )
            // InternalGuardin.g:2836:2: ( rule__Melody__NameAssignment_2_1_0 )
            {
             before(grammarAccess.getMelodyAccess().getNameAssignment_2_1_0()); 
            // InternalGuardin.g:2837:2: ( rule__Melody__NameAssignment_2_1_0 )
            // InternalGuardin.g:2837:3: rule__Melody__NameAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Melody__NameAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMelodyAccess().getNameAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group_2_1__0__Impl"


    // $ANTLR start "rule__Melody__Group_2_1__1"
    // InternalGuardin.g:2845:1: rule__Melody__Group_2_1__1 : rule__Melody__Group_2_1__1__Impl ;
    public final void rule__Melody__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2849:1: ( rule__Melody__Group_2_1__1__Impl )
            // InternalGuardin.g:2850:2: rule__Melody__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Melody__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group_2_1__1"


    // $ANTLR start "rule__Melody__Group_2_1__1__Impl"
    // InternalGuardin.g:2856:1: rule__Melody__Group_2_1__1__Impl : ( ':' ) ;
    public final void rule__Melody__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2860:1: ( ( ':' ) )
            // InternalGuardin.g:2861:1: ( ':' )
            {
            // InternalGuardin.g:2861:1: ( ':' )
            // InternalGuardin.g:2862:2: ':'
            {
             before(grammarAccess.getMelodyAccess().getColonKeyword_2_1_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMelodyAccess().getColonKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group_2_1__1__Impl"


    // $ANTLR start "rule__SectionMelodyLayer__Group__0"
    // InternalGuardin.g:2872:1: rule__SectionMelodyLayer__Group__0 : rule__SectionMelodyLayer__Group__0__Impl rule__SectionMelodyLayer__Group__1 ;
    public final void rule__SectionMelodyLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2876:1: ( rule__SectionMelodyLayer__Group__0__Impl rule__SectionMelodyLayer__Group__1 )
            // InternalGuardin.g:2877:2: rule__SectionMelodyLayer__Group__0__Impl rule__SectionMelodyLayer__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SectionMelodyLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionMelodyLayer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionMelodyLayer__Group__0"


    // $ANTLR start "rule__SectionMelodyLayer__Group__0__Impl"
    // InternalGuardin.g:2884:1: rule__SectionMelodyLayer__Group__0__Impl : ( () ) ;
    public final void rule__SectionMelodyLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2888:1: ( ( () ) )
            // InternalGuardin.g:2889:1: ( () )
            {
            // InternalGuardin.g:2889:1: ( () )
            // InternalGuardin.g:2890:2: ()
            {
             before(grammarAccess.getSectionMelodyLayerAccess().getSectionLayerAction_0()); 
            // InternalGuardin.g:2891:2: ()
            // InternalGuardin.g:2891:3: 
            {
            }

             after(grammarAccess.getSectionMelodyLayerAccess().getSectionLayerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionMelodyLayer__Group__0__Impl"


    // $ANTLR start "rule__SectionMelodyLayer__Group__1"
    // InternalGuardin.g:2899:1: rule__SectionMelodyLayer__Group__1 : rule__SectionMelodyLayer__Group__1__Impl rule__SectionMelodyLayer__Group__2 ;
    public final void rule__SectionMelodyLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2903:1: ( rule__SectionMelodyLayer__Group__1__Impl rule__SectionMelodyLayer__Group__2 )
            // InternalGuardin.g:2904:2: rule__SectionMelodyLayer__Group__1__Impl rule__SectionMelodyLayer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SectionMelodyLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionMelodyLayer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionMelodyLayer__Group__1"


    // $ANTLR start "rule__SectionMelodyLayer__Group__1__Impl"
    // InternalGuardin.g:2911:1: rule__SectionMelodyLayer__Group__1__Impl : ( 'begin_section' ) ;
    public final void rule__SectionMelodyLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2915:1: ( ( 'begin_section' ) )
            // InternalGuardin.g:2916:1: ( 'begin_section' )
            {
            // InternalGuardin.g:2916:1: ( 'begin_section' )
            // InternalGuardin.g:2917:2: 'begin_section'
            {
             before(grammarAccess.getSectionMelodyLayerAccess().getBegin_sectionKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSectionMelodyLayerAccess().getBegin_sectionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionMelodyLayer__Group__1__Impl"


    // $ANTLR start "rule__SectionMelodyLayer__Group__2"
    // InternalGuardin.g:2926:1: rule__SectionMelodyLayer__Group__2 : rule__SectionMelodyLayer__Group__2__Impl rule__SectionMelodyLayer__Group__3 ;
    public final void rule__SectionMelodyLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2930:1: ( rule__SectionMelodyLayer__Group__2__Impl rule__SectionMelodyLayer__Group__3 )
            // InternalGuardin.g:2931:2: rule__SectionMelodyLayer__Group__2__Impl rule__SectionMelodyLayer__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SectionMelodyLayer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionMelodyLayer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionMelodyLayer__Group__2"


    // $ANTLR start "rule__SectionMelodyLayer__Group__2__Impl"
    // InternalGuardin.g:2938:1: rule__SectionMelodyLayer__Group__2__Impl : ( ( rule__SectionMelodyLayer__SectionAssignment_2 ) ) ;
    public final void rule__SectionMelodyLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2942:1: ( ( ( rule__SectionMelodyLayer__SectionAssignment_2 ) ) )
            // InternalGuardin.g:2943:1: ( ( rule__SectionMelodyLayer__SectionAssignment_2 ) )
            {
            // InternalGuardin.g:2943:1: ( ( rule__SectionMelodyLayer__SectionAssignment_2 ) )
            // InternalGuardin.g:2944:2: ( rule__SectionMelodyLayer__SectionAssignment_2 )
            {
             before(grammarAccess.getSectionMelodyLayerAccess().getSectionAssignment_2()); 
            // InternalGuardin.g:2945:2: ( rule__SectionMelodyLayer__SectionAssignment_2 )
            // InternalGuardin.g:2945:3: rule__SectionMelodyLayer__SectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SectionMelodyLayer__SectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionMelodyLayerAccess().getSectionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionMelodyLayer__Group__2__Impl"


    // $ANTLR start "rule__SectionMelodyLayer__Group__3"
    // InternalGuardin.g:2953:1: rule__SectionMelodyLayer__Group__3 : rule__SectionMelodyLayer__Group__3__Impl rule__SectionMelodyLayer__Group__4 ;
    public final void rule__SectionMelodyLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2957:1: ( rule__SectionMelodyLayer__Group__3__Impl rule__SectionMelodyLayer__Group__4 )
            // InternalGuardin.g:2958:2: rule__SectionMelodyLayer__Group__3__Impl rule__SectionMelodyLayer__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__SectionMelodyLayer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionMelodyLayer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionMelodyLayer__Group__3"


    // $ANTLR start "rule__SectionMelodyLayer__Group__3__Impl"
    // InternalGuardin.g:2965:1: rule__SectionMelodyLayer__Group__3__Impl : ( ( ( rule__SectionMelodyLayer__LayersAssignment_3 ) ) ( ( rule__SectionMelodyLayer__LayersAssignment_3 )* ) ) ;
    public final void rule__SectionMelodyLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2969:1: ( ( ( ( rule__SectionMelodyLayer__LayersAssignment_3 ) ) ( ( rule__SectionMelodyLayer__LayersAssignment_3 )* ) ) )
            // InternalGuardin.g:2970:1: ( ( ( rule__SectionMelodyLayer__LayersAssignment_3 ) ) ( ( rule__SectionMelodyLayer__LayersAssignment_3 )* ) )
            {
            // InternalGuardin.g:2970:1: ( ( ( rule__SectionMelodyLayer__LayersAssignment_3 ) ) ( ( rule__SectionMelodyLayer__LayersAssignment_3 )* ) )
            // InternalGuardin.g:2971:2: ( ( rule__SectionMelodyLayer__LayersAssignment_3 ) ) ( ( rule__SectionMelodyLayer__LayersAssignment_3 )* )
            {
            // InternalGuardin.g:2971:2: ( ( rule__SectionMelodyLayer__LayersAssignment_3 ) )
            // InternalGuardin.g:2972:3: ( rule__SectionMelodyLayer__LayersAssignment_3 )
            {
             before(grammarAccess.getSectionMelodyLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2973:3: ( rule__SectionMelodyLayer__LayersAssignment_3 )
            // InternalGuardin.g:2973:4: rule__SectionMelodyLayer__LayersAssignment_3
            {
            pushFollow(FOLLOW_21);
            rule__SectionMelodyLayer__LayersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionMelodyLayerAccess().getLayersAssignment_3()); 

            }

            // InternalGuardin.g:2976:2: ( ( rule__SectionMelodyLayer__LayersAssignment_3 )* )
            // InternalGuardin.g:2977:3: ( rule__SectionMelodyLayer__LayersAssignment_3 )*
            {
             before(grammarAccess.getSectionMelodyLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2978:3: ( rule__SectionMelodyLayer__LayersAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==52) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGuardin.g:2978:4: rule__SectionMelodyLayer__LayersAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SectionMelodyLayer__LayersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSectionMelodyLayerAccess().getLayersAssignment_3()); 

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
    // $ANTLR end "rule__SectionMelodyLayer__Group__3__Impl"


    // $ANTLR start "rule__SectionMelodyLayer__Group__4"
    // InternalGuardin.g:2987:1: rule__SectionMelodyLayer__Group__4 : rule__SectionMelodyLayer__Group__4__Impl ;
    public final void rule__SectionMelodyLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2991:1: ( rule__SectionMelodyLayer__Group__4__Impl )
            // InternalGuardin.g:2992:2: rule__SectionMelodyLayer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SectionMelodyLayer__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionMelodyLayer__Group__4"


    // $ANTLR start "rule__SectionMelodyLayer__Group__4__Impl"
    // InternalGuardin.g:2998:1: rule__SectionMelodyLayer__Group__4__Impl : ( 'end_section' ) ;
    public final void rule__SectionMelodyLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3002:1: ( ( 'end_section' ) )
            // InternalGuardin.g:3003:1: ( 'end_section' )
            {
            // InternalGuardin.g:3003:1: ( 'end_section' )
            // InternalGuardin.g:3004:2: 'end_section'
            {
             before(grammarAccess.getSectionMelodyLayerAccess().getEnd_sectionKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSectionMelodyLayerAccess().getEnd_sectionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionMelodyLayer__Group__4__Impl"


    // $ANTLR start "rule__MelodyLayer__Group__0"
    // InternalGuardin.g:3014:1: rule__MelodyLayer__Group__0 : rule__MelodyLayer__Group__0__Impl rule__MelodyLayer__Group__1 ;
    public final void rule__MelodyLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3018:1: ( rule__MelodyLayer__Group__0__Impl rule__MelodyLayer__Group__1 )
            // InternalGuardin.g:3019:2: rule__MelodyLayer__Group__0__Impl rule__MelodyLayer__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MelodyLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MelodyLayer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyLayer__Group__0"


    // $ANTLR start "rule__MelodyLayer__Group__0__Impl"
    // InternalGuardin.g:3026:1: rule__MelodyLayer__Group__0__Impl : ( () ) ;
    public final void rule__MelodyLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3030:1: ( ( () ) )
            // InternalGuardin.g:3031:1: ( () )
            {
            // InternalGuardin.g:3031:1: ( () )
            // InternalGuardin.g:3032:2: ()
            {
             before(grammarAccess.getMelodyLayerAccess().getLayerAction_0()); 
            // InternalGuardin.g:3033:2: ()
            // InternalGuardin.g:3033:3: 
            {
            }

             after(grammarAccess.getMelodyLayerAccess().getLayerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyLayer__Group__0__Impl"


    // $ANTLR start "rule__MelodyLayer__Group__1"
    // InternalGuardin.g:3041:1: rule__MelodyLayer__Group__1 : rule__MelodyLayer__Group__1__Impl rule__MelodyLayer__Group__2 ;
    public final void rule__MelodyLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3045:1: ( rule__MelodyLayer__Group__1__Impl rule__MelodyLayer__Group__2 )
            // InternalGuardin.g:3046:2: rule__MelodyLayer__Group__1__Impl rule__MelodyLayer__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__MelodyLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MelodyLayer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyLayer__Group__1"


    // $ANTLR start "rule__MelodyLayer__Group__1__Impl"
    // InternalGuardin.g:3053:1: rule__MelodyLayer__Group__1__Impl : ( 'layer:' ) ;
    public final void rule__MelodyLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3057:1: ( ( 'layer:' ) )
            // InternalGuardin.g:3058:1: ( 'layer:' )
            {
            // InternalGuardin.g:3058:1: ( 'layer:' )
            // InternalGuardin.g:3059:2: 'layer:'
            {
             before(grammarAccess.getMelodyLayerAccess().getLayerKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMelodyLayerAccess().getLayerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyLayer__Group__1__Impl"


    // $ANTLR start "rule__MelodyLayer__Group__2"
    // InternalGuardin.g:3068:1: rule__MelodyLayer__Group__2 : rule__MelodyLayer__Group__2__Impl ;
    public final void rule__MelodyLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3072:1: ( rule__MelodyLayer__Group__2__Impl )
            // InternalGuardin.g:3073:2: rule__MelodyLayer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MelodyLayer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyLayer__Group__2"


    // $ANTLR start "rule__MelodyLayer__Group__2__Impl"
    // InternalGuardin.g:3079:1: rule__MelodyLayer__Group__2__Impl : ( ( ( rule__MelodyLayer__NotesAssignment_2 ) ) ( ( rule__MelodyLayer__NotesAssignment_2 )* ) ) ;
    public final void rule__MelodyLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3083:1: ( ( ( ( rule__MelodyLayer__NotesAssignment_2 ) ) ( ( rule__MelodyLayer__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:3084:1: ( ( ( rule__MelodyLayer__NotesAssignment_2 ) ) ( ( rule__MelodyLayer__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:3084:1: ( ( ( rule__MelodyLayer__NotesAssignment_2 ) ) ( ( rule__MelodyLayer__NotesAssignment_2 )* ) )
            // InternalGuardin.g:3085:2: ( ( rule__MelodyLayer__NotesAssignment_2 ) ) ( ( rule__MelodyLayer__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:3085:2: ( ( rule__MelodyLayer__NotesAssignment_2 ) )
            // InternalGuardin.g:3086:3: ( rule__MelodyLayer__NotesAssignment_2 )
            {
             before(grammarAccess.getMelodyLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:3087:3: ( rule__MelodyLayer__NotesAssignment_2 )
            // InternalGuardin.g:3087:4: rule__MelodyLayer__NotesAssignment_2
            {
            pushFollow(FOLLOW_33);
            rule__MelodyLayer__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMelodyLayerAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:3090:2: ( ( rule__MelodyLayer__NotesAssignment_2 )* )
            // InternalGuardin.g:3091:3: ( rule__MelodyLayer__NotesAssignment_2 )*
            {
             before(grammarAccess.getMelodyLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:3092:3: ( rule__MelodyLayer__NotesAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=32 && LA28_0<=38)||LA28_0==48||LA28_0==53) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGuardin.g:3092:4: rule__MelodyLayer__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__MelodyLayer__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMelodyLayerAccess().getNotesAssignment_2()); 

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
    // $ANTLR end "rule__MelodyLayer__Group__2__Impl"


    // $ANTLR start "rule__MelodyNote__Group__0"
    // InternalGuardin.g:3102:1: rule__MelodyNote__Group__0 : rule__MelodyNote__Group__0__Impl rule__MelodyNote__Group__1 ;
    public final void rule__MelodyNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3106:1: ( rule__MelodyNote__Group__0__Impl rule__MelodyNote__Group__1 )
            // InternalGuardin.g:3107:2: rule__MelodyNote__Group__0__Impl rule__MelodyNote__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__MelodyNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MelodyNote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group__0"


    // $ANTLR start "rule__MelodyNote__Group__0__Impl"
    // InternalGuardin.g:3114:1: rule__MelodyNote__Group__0__Impl : ( () ) ;
    public final void rule__MelodyNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3118:1: ( ( () ) )
            // InternalGuardin.g:3119:1: ( () )
            {
            // InternalGuardin.g:3119:1: ( () )
            // InternalGuardin.g:3120:2: ()
            {
             before(grammarAccess.getMelodyNoteAccess().getMelodyNoteAction_0()); 
            // InternalGuardin.g:3121:2: ()
            // InternalGuardin.g:3121:3: 
            {
            }

             after(grammarAccess.getMelodyNoteAccess().getMelodyNoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group__0__Impl"


    // $ANTLR start "rule__MelodyNote__Group__1"
    // InternalGuardin.g:3129:1: rule__MelodyNote__Group__1 : rule__MelodyNote__Group__1__Impl rule__MelodyNote__Group__2 ;
    public final void rule__MelodyNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3133:1: ( rule__MelodyNote__Group__1__Impl rule__MelodyNote__Group__2 )
            // InternalGuardin.g:3134:2: rule__MelodyNote__Group__1__Impl rule__MelodyNote__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__MelodyNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MelodyNote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group__1"


    // $ANTLR start "rule__MelodyNote__Group__1__Impl"
    // InternalGuardin.g:3141:1: rule__MelodyNote__Group__1__Impl : ( ( rule__MelodyNote__NoteTypeAssignment_1 ) ) ;
    public final void rule__MelodyNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3145:1: ( ( ( rule__MelodyNote__NoteTypeAssignment_1 ) ) )
            // InternalGuardin.g:3146:1: ( ( rule__MelodyNote__NoteTypeAssignment_1 ) )
            {
            // InternalGuardin.g:3146:1: ( ( rule__MelodyNote__NoteTypeAssignment_1 ) )
            // InternalGuardin.g:3147:2: ( rule__MelodyNote__NoteTypeAssignment_1 )
            {
             before(grammarAccess.getMelodyNoteAccess().getNoteTypeAssignment_1()); 
            // InternalGuardin.g:3148:2: ( rule__MelodyNote__NoteTypeAssignment_1 )
            // InternalGuardin.g:3148:3: rule__MelodyNote__NoteTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MelodyNote__NoteTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMelodyNoteAccess().getNoteTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group__1__Impl"


    // $ANTLR start "rule__MelodyNote__Group__2"
    // InternalGuardin.g:3156:1: rule__MelodyNote__Group__2 : rule__MelodyNote__Group__2__Impl rule__MelodyNote__Group__3 ;
    public final void rule__MelodyNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3160:1: ( rule__MelodyNote__Group__2__Impl rule__MelodyNote__Group__3 )
            // InternalGuardin.g:3161:2: rule__MelodyNote__Group__2__Impl rule__MelodyNote__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__MelodyNote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MelodyNote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group__2"


    // $ANTLR start "rule__MelodyNote__Group__2__Impl"
    // InternalGuardin.g:3168:1: rule__MelodyNote__Group__2__Impl : ( ( rule__MelodyNote__DurationAssignment_2 )? ) ;
    public final void rule__MelodyNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3172:1: ( ( ( rule__MelodyNote__DurationAssignment_2 )? ) )
            // InternalGuardin.g:3173:1: ( ( rule__MelodyNote__DurationAssignment_2 )? )
            {
            // InternalGuardin.g:3173:1: ( ( rule__MelodyNote__DurationAssignment_2 )? )
            // InternalGuardin.g:3174:2: ( rule__MelodyNote__DurationAssignment_2 )?
            {
             before(grammarAccess.getMelodyNoteAccess().getDurationAssignment_2()); 
            // InternalGuardin.g:3175:2: ( rule__MelodyNote__DurationAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=13 && LA29_0<=15)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGuardin.g:3175:3: rule__MelodyNote__DurationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MelodyNote__DurationAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMelodyNoteAccess().getDurationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group__2__Impl"


    // $ANTLR start "rule__MelodyNote__Group__3"
    // InternalGuardin.g:3183:1: rule__MelodyNote__Group__3 : rule__MelodyNote__Group__3__Impl ;
    public final void rule__MelodyNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3187:1: ( rule__MelodyNote__Group__3__Impl )
            // InternalGuardin.g:3188:2: rule__MelodyNote__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MelodyNote__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group__3"


    // $ANTLR start "rule__MelodyNote__Group__3__Impl"
    // InternalGuardin.g:3194:1: rule__MelodyNote__Group__3__Impl : ( ( rule__MelodyNote__Alternatives_3 )? ) ;
    public final void rule__MelodyNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3198:1: ( ( ( rule__MelodyNote__Alternatives_3 )? ) )
            // InternalGuardin.g:3199:1: ( ( rule__MelodyNote__Alternatives_3 )? )
            {
            // InternalGuardin.g:3199:1: ( ( rule__MelodyNote__Alternatives_3 )? )
            // InternalGuardin.g:3200:2: ( rule__MelodyNote__Alternatives_3 )?
            {
             before(grammarAccess.getMelodyNoteAccess().getAlternatives_3()); 
            // InternalGuardin.g:3201:2: ( rule__MelodyNote__Alternatives_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=57 && LA30_0<=58)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGuardin.g:3201:3: rule__MelodyNote__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MelodyNote__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMelodyNoteAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group__3__Impl"


    // $ANTLR start "rule__MelodyNote__Group_3_0__0"
    // InternalGuardin.g:3210:1: rule__MelodyNote__Group_3_0__0 : rule__MelodyNote__Group_3_0__0__Impl rule__MelodyNote__Group_3_0__1 ;
    public final void rule__MelodyNote__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3214:1: ( rule__MelodyNote__Group_3_0__0__Impl rule__MelodyNote__Group_3_0__1 )
            // InternalGuardin.g:3215:2: rule__MelodyNote__Group_3_0__0__Impl rule__MelodyNote__Group_3_0__1
            {
            pushFollow(FOLLOW_36);
            rule__MelodyNote__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MelodyNote__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group_3_0__0"


    // $ANTLR start "rule__MelodyNote__Group_3_0__0__Impl"
    // InternalGuardin.g:3222:1: rule__MelodyNote__Group_3_0__0__Impl : ( '/' ) ;
    public final void rule__MelodyNote__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3226:1: ( ( '/' ) )
            // InternalGuardin.g:3227:1: ( '/' )
            {
            // InternalGuardin.g:3227:1: ( '/' )
            // InternalGuardin.g:3228:2: '/'
            {
             before(grammarAccess.getMelodyNoteAccess().getSolidusKeyword_3_0_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMelodyNoteAccess().getSolidusKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group_3_0__0__Impl"


    // $ANTLR start "rule__MelodyNote__Group_3_0__1"
    // InternalGuardin.g:3237:1: rule__MelodyNote__Group_3_0__1 : rule__MelodyNote__Group_3_0__1__Impl ;
    public final void rule__MelodyNote__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3241:1: ( rule__MelodyNote__Group_3_0__1__Impl )
            // InternalGuardin.g:3242:2: rule__MelodyNote__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MelodyNote__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group_3_0__1"


    // $ANTLR start "rule__MelodyNote__Group_3_0__1__Impl"
    // InternalGuardin.g:3248:1: rule__MelodyNote__Group_3_0__1__Impl : ( ( rule__MelodyNote__OctaveOffsetAssignment_3_0_1 ) ) ;
    public final void rule__MelodyNote__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3252:1: ( ( ( rule__MelodyNote__OctaveOffsetAssignment_3_0_1 ) ) )
            // InternalGuardin.g:3253:1: ( ( rule__MelodyNote__OctaveOffsetAssignment_3_0_1 ) )
            {
            // InternalGuardin.g:3253:1: ( ( rule__MelodyNote__OctaveOffsetAssignment_3_0_1 ) )
            // InternalGuardin.g:3254:2: ( rule__MelodyNote__OctaveOffsetAssignment_3_0_1 )
            {
             before(grammarAccess.getMelodyNoteAccess().getOctaveOffsetAssignment_3_0_1()); 
            // InternalGuardin.g:3255:2: ( rule__MelodyNote__OctaveOffsetAssignment_3_0_1 )
            // InternalGuardin.g:3255:3: rule__MelodyNote__OctaveOffsetAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MelodyNote__OctaveOffsetAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMelodyNoteAccess().getOctaveOffsetAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group_3_0__1__Impl"


    // $ANTLR start "rule__MelodyNote__Group_3_1__0"
    // InternalGuardin.g:3264:1: rule__MelodyNote__Group_3_1__0 : rule__MelodyNote__Group_3_1__0__Impl rule__MelodyNote__Group_3_1__1 ;
    public final void rule__MelodyNote__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3268:1: ( rule__MelodyNote__Group_3_1__0__Impl rule__MelodyNote__Group_3_1__1 )
            // InternalGuardin.g:3269:2: rule__MelodyNote__Group_3_1__0__Impl rule__MelodyNote__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
            rule__MelodyNote__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MelodyNote__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group_3_1__0"


    // $ANTLR start "rule__MelodyNote__Group_3_1__0__Impl"
    // InternalGuardin.g:3276:1: rule__MelodyNote__Group_3_1__0__Impl : ( '|' ) ;
    public final void rule__MelodyNote__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3280:1: ( ( '|' ) )
            // InternalGuardin.g:3281:1: ( '|' )
            {
            // InternalGuardin.g:3281:1: ( '|' )
            // InternalGuardin.g:3282:2: '|'
            {
             before(grammarAccess.getMelodyNoteAccess().getVerticalLineKeyword_3_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMelodyNoteAccess().getVerticalLineKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group_3_1__0__Impl"


    // $ANTLR start "rule__MelodyNote__Group_3_1__1"
    // InternalGuardin.g:3291:1: rule__MelodyNote__Group_3_1__1 : rule__MelodyNote__Group_3_1__1__Impl ;
    public final void rule__MelodyNote__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3295:1: ( rule__MelodyNote__Group_3_1__1__Impl )
            // InternalGuardin.g:3296:2: rule__MelodyNote__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MelodyNote__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group_3_1__1"


    // $ANTLR start "rule__MelodyNote__Group_3_1__1__Impl"
    // InternalGuardin.g:3302:1: rule__MelodyNote__Group_3_1__1__Impl : ( ( rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1 ) ) ;
    public final void rule__MelodyNote__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3306:1: ( ( ( rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1 ) ) )
            // InternalGuardin.g:3307:1: ( ( rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1 ) )
            {
            // InternalGuardin.g:3307:1: ( ( rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1 ) )
            // InternalGuardin.g:3308:2: ( rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1 )
            {
             before(grammarAccess.getMelodyNoteAccess().getOctaveAbsoluteAssignment_3_1_1()); 
            // InternalGuardin.g:3309:2: ( rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1 )
            // InternalGuardin.g:3309:3: rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMelodyNoteAccess().getOctaveAbsoluteAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__Group_3_1__1__Impl"


    // $ANTLR start "rule__CompositeMelodyNote__Group__0"
    // InternalGuardin.g:3318:1: rule__CompositeMelodyNote__Group__0 : rule__CompositeMelodyNote__Group__0__Impl rule__CompositeMelodyNote__Group__1 ;
    public final void rule__CompositeMelodyNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3322:1: ( rule__CompositeMelodyNote__Group__0__Impl rule__CompositeMelodyNote__Group__1 )
            // InternalGuardin.g:3323:2: rule__CompositeMelodyNote__Group__0__Impl rule__CompositeMelodyNote__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__CompositeMelodyNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeMelodyNote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__Group__0"


    // $ANTLR start "rule__CompositeMelodyNote__Group__0__Impl"
    // InternalGuardin.g:3330:1: rule__CompositeMelodyNote__Group__0__Impl : ( () ) ;
    public final void rule__CompositeMelodyNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3334:1: ( ( () ) )
            // InternalGuardin.g:3335:1: ( () )
            {
            // InternalGuardin.g:3335:1: ( () )
            // InternalGuardin.g:3336:2: ()
            {
             before(grammarAccess.getCompositeMelodyNoteAccess().getCompositeNoteAction_0()); 
            // InternalGuardin.g:3337:2: ()
            // InternalGuardin.g:3337:3: 
            {
            }

             after(grammarAccess.getCompositeMelodyNoteAccess().getCompositeNoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__Group__0__Impl"


    // $ANTLR start "rule__CompositeMelodyNote__Group__1"
    // InternalGuardin.g:3345:1: rule__CompositeMelodyNote__Group__1 : rule__CompositeMelodyNote__Group__1__Impl rule__CompositeMelodyNote__Group__2 ;
    public final void rule__CompositeMelodyNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3349:1: ( rule__CompositeMelodyNote__Group__1__Impl rule__CompositeMelodyNote__Group__2 )
            // InternalGuardin.g:3350:2: rule__CompositeMelodyNote__Group__1__Impl rule__CompositeMelodyNote__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__CompositeMelodyNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeMelodyNote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__Group__1"


    // $ANTLR start "rule__CompositeMelodyNote__Group__1__Impl"
    // InternalGuardin.g:3357:1: rule__CompositeMelodyNote__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositeMelodyNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3361:1: ( ( '(' ) )
            // InternalGuardin.g:3362:1: ( '(' )
            {
            // InternalGuardin.g:3362:1: ( '(' )
            // InternalGuardin.g:3363:2: '('
            {
             before(grammarAccess.getCompositeMelodyNoteAccess().getLeftParenthesisKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCompositeMelodyNoteAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__Group__1__Impl"


    // $ANTLR start "rule__CompositeMelodyNote__Group__2"
    // InternalGuardin.g:3372:1: rule__CompositeMelodyNote__Group__2 : rule__CompositeMelodyNote__Group__2__Impl rule__CompositeMelodyNote__Group__3 ;
    public final void rule__CompositeMelodyNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3376:1: ( rule__CompositeMelodyNote__Group__2__Impl rule__CompositeMelodyNote__Group__3 )
            // InternalGuardin.g:3377:2: rule__CompositeMelodyNote__Group__2__Impl rule__CompositeMelodyNote__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__CompositeMelodyNote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeMelodyNote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__Group__2"


    // $ANTLR start "rule__CompositeMelodyNote__Group__2__Impl"
    // InternalGuardin.g:3384:1: rule__CompositeMelodyNote__Group__2__Impl : ( ( ( rule__CompositeMelodyNote__NotesAssignment_2 ) ) ( ( rule__CompositeMelodyNote__NotesAssignment_2 )* ) ) ;
    public final void rule__CompositeMelodyNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3388:1: ( ( ( ( rule__CompositeMelodyNote__NotesAssignment_2 ) ) ( ( rule__CompositeMelodyNote__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:3389:1: ( ( ( rule__CompositeMelodyNote__NotesAssignment_2 ) ) ( ( rule__CompositeMelodyNote__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:3389:1: ( ( ( rule__CompositeMelodyNote__NotesAssignment_2 ) ) ( ( rule__CompositeMelodyNote__NotesAssignment_2 )* ) )
            // InternalGuardin.g:3390:2: ( ( rule__CompositeMelodyNote__NotesAssignment_2 ) ) ( ( rule__CompositeMelodyNote__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:3390:2: ( ( rule__CompositeMelodyNote__NotesAssignment_2 ) )
            // InternalGuardin.g:3391:3: ( rule__CompositeMelodyNote__NotesAssignment_2 )
            {
             before(grammarAccess.getCompositeMelodyNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:3392:3: ( rule__CompositeMelodyNote__NotesAssignment_2 )
            // InternalGuardin.g:3392:4: rule__CompositeMelodyNote__NotesAssignment_2
            {
            pushFollow(FOLLOW_38);
            rule__CompositeMelodyNote__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeMelodyNoteAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:3395:2: ( ( rule__CompositeMelodyNote__NotesAssignment_2 )* )
            // InternalGuardin.g:3396:3: ( rule__CompositeMelodyNote__NotesAssignment_2 )*
            {
             before(grammarAccess.getCompositeMelodyNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:3397:3: ( rule__CompositeMelodyNote__NotesAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=32 && LA31_0<=38)||LA31_0==48) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGuardin.g:3397:4: rule__CompositeMelodyNote__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__CompositeMelodyNote__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getCompositeMelodyNoteAccess().getNotesAssignment_2()); 

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
    // $ANTLR end "rule__CompositeMelodyNote__Group__2__Impl"


    // $ANTLR start "rule__CompositeMelodyNote__Group__3"
    // InternalGuardin.g:3406:1: rule__CompositeMelodyNote__Group__3 : rule__CompositeMelodyNote__Group__3__Impl rule__CompositeMelodyNote__Group__4 ;
    public final void rule__CompositeMelodyNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3410:1: ( rule__CompositeMelodyNote__Group__3__Impl rule__CompositeMelodyNote__Group__4 )
            // InternalGuardin.g:3411:2: rule__CompositeMelodyNote__Group__3__Impl rule__CompositeMelodyNote__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__CompositeMelodyNote__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeMelodyNote__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__Group__3"


    // $ANTLR start "rule__CompositeMelodyNote__Group__3__Impl"
    // InternalGuardin.g:3418:1: rule__CompositeMelodyNote__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositeMelodyNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3422:1: ( ( ')' ) )
            // InternalGuardin.g:3423:1: ( ')' )
            {
            // InternalGuardin.g:3423:1: ( ')' )
            // InternalGuardin.g:3424:2: ')'
            {
             before(grammarAccess.getCompositeMelodyNoteAccess().getRightParenthesisKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCompositeMelodyNoteAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__Group__3__Impl"


    // $ANTLR start "rule__CompositeMelodyNote__Group__4"
    // InternalGuardin.g:3433:1: rule__CompositeMelodyNote__Group__4 : rule__CompositeMelodyNote__Group__4__Impl rule__CompositeMelodyNote__Group__5 ;
    public final void rule__CompositeMelodyNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3437:1: ( rule__CompositeMelodyNote__Group__4__Impl rule__CompositeMelodyNote__Group__5 )
            // InternalGuardin.g:3438:2: rule__CompositeMelodyNote__Group__4__Impl rule__CompositeMelodyNote__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__CompositeMelodyNote__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeMelodyNote__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__Group__4"


    // $ANTLR start "rule__CompositeMelodyNote__Group__4__Impl"
    // InternalGuardin.g:3445:1: rule__CompositeMelodyNote__Group__4__Impl : ( 'x' ) ;
    public final void rule__CompositeMelodyNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3449:1: ( ( 'x' ) )
            // InternalGuardin.g:3450:1: ( 'x' )
            {
            // InternalGuardin.g:3450:1: ( 'x' )
            // InternalGuardin.g:3451:2: 'x'
            {
             before(grammarAccess.getCompositeMelodyNoteAccess().getXKeyword_4()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCompositeMelodyNoteAccess().getXKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__Group__4__Impl"


    // $ANTLR start "rule__CompositeMelodyNote__Group__5"
    // InternalGuardin.g:3460:1: rule__CompositeMelodyNote__Group__5 : rule__CompositeMelodyNote__Group__5__Impl ;
    public final void rule__CompositeMelodyNote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3464:1: ( rule__CompositeMelodyNote__Group__5__Impl )
            // InternalGuardin.g:3465:2: rule__CompositeMelodyNote__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeMelodyNote__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__Group__5"


    // $ANTLR start "rule__CompositeMelodyNote__Group__5__Impl"
    // InternalGuardin.g:3471:1: rule__CompositeMelodyNote__Group__5__Impl : ( ( rule__CompositeMelodyNote__RepeatsAssignment_5 ) ) ;
    public final void rule__CompositeMelodyNote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3475:1: ( ( ( rule__CompositeMelodyNote__RepeatsAssignment_5 ) ) )
            // InternalGuardin.g:3476:1: ( ( rule__CompositeMelodyNote__RepeatsAssignment_5 ) )
            {
            // InternalGuardin.g:3476:1: ( ( rule__CompositeMelodyNote__RepeatsAssignment_5 ) )
            // InternalGuardin.g:3477:2: ( rule__CompositeMelodyNote__RepeatsAssignment_5 )
            {
             before(grammarAccess.getCompositeMelodyNoteAccess().getRepeatsAssignment_5()); 
            // InternalGuardin.g:3478:2: ( rule__CompositeMelodyNote__RepeatsAssignment_5 )
            // InternalGuardin.g:3478:3: rule__CompositeMelodyNote__RepeatsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CompositeMelodyNote__RepeatsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCompositeMelodyNoteAccess().getRepeatsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__Group__5__Impl"


    // $ANTLR start "rule__ERelativeInt__Group__0"
    // InternalGuardin.g:3487:1: rule__ERelativeInt__Group__0 : rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1 ;
    public final void rule__ERelativeInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3491:1: ( rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1 )
            // InternalGuardin.g:3492:2: rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalGuardin.g:3499:1: rule__ERelativeInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ERelativeInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3503:1: ( ( ( '-' )? ) )
            // InternalGuardin.g:3504:1: ( ( '-' )? )
            {
            // InternalGuardin.g:3504:1: ( ( '-' )? )
            // InternalGuardin.g:3505:2: ( '-' )?
            {
             before(grammarAccess.getERelativeIntAccess().getHyphenMinusKeyword_0()); 
            // InternalGuardin.g:3506:2: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGuardin.g:3506:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalGuardin.g:3514:1: rule__ERelativeInt__Group__1 : rule__ERelativeInt__Group__1__Impl ;
    public final void rule__ERelativeInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3518:1: ( rule__ERelativeInt__Group__1__Impl )
            // InternalGuardin.g:3519:2: rule__ERelativeInt__Group__1__Impl
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
    // InternalGuardin.g:3525:1: rule__ERelativeInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ERelativeInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3529:1: ( ( RULE_INT ) )
            // InternalGuardin.g:3530:1: ( RULE_INT )
            {
            // InternalGuardin.g:3530:1: ( RULE_INT )
            // InternalGuardin.g:3531:2: RULE_INT
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
    // InternalGuardin.g:3541:1: rule__Music__SoundBankPathAssignment_1_2 : ( ruleEString ) ;
    public final void rule__Music__SoundBankPathAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3545:1: ( ( ruleEString ) )
            // InternalGuardin.g:3546:2: ( ruleEString )
            {
            // InternalGuardin.g:3546:2: ( ruleEString )
            // InternalGuardin.g:3547:3: ruleEString
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
    // InternalGuardin.g:3556:1: rule__Music__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Music__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3560:1: ( ( ruleEString ) )
            // InternalGuardin.g:3561:2: ( ruleEString )
            {
            // InternalGuardin.g:3561:2: ( ruleEString )
            // InternalGuardin.g:3562:3: ruleEString
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
    // InternalGuardin.g:3571:1: rule__Music__SectionsAssignment_7 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3575:1: ( ( ruleSection ) )
            // InternalGuardin.g:3576:2: ( ruleSection )
            {
            // InternalGuardin.g:3576:2: ( ruleSection )
            // InternalGuardin.g:3577:3: ruleSection
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
    // InternalGuardin.g:3586:1: rule__Music__SectionsAssignment_8 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3590:1: ( ( ruleSection ) )
            // InternalGuardin.g:3591:2: ( ruleSection )
            {
            // InternalGuardin.g:3591:2: ( ruleSection )
            // InternalGuardin.g:3592:3: ruleSection
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
    // InternalGuardin.g:3601:1: rule__Music__TracksAssignment_11_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3605:1: ( ( ruleTrack ) )
            // InternalGuardin.g:3606:2: ( ruleTrack )
            {
            // InternalGuardin.g:3606:2: ( ruleTrack )
            // InternalGuardin.g:3607:3: ruleTrack
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
    // InternalGuardin.g:3616:1: rule__Music__TracksAssignment_11_2_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3620:1: ( ( ruleTrack ) )
            // InternalGuardin.g:3621:2: ( ruleTrack )
            {
            // InternalGuardin.g:3621:2: ( ruleTrack )
            // InternalGuardin.g:3622:3: ruleTrack
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
    // InternalGuardin.g:3631:1: rule__Section__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3635:1: ( ( ruleEString ) )
            // InternalGuardin.g:3636:2: ( ruleEString )
            {
            // InternalGuardin.g:3636:2: ( ruleEString )
            // InternalGuardin.g:3637:3: ruleEString
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
    // InternalGuardin.g:3646:1: rule__Section__TempoAssignment_4 : ( ruleEInt ) ;
    public final void rule__Section__TempoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3650:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3651:2: ( ruleEInt )
            {
            // InternalGuardin.g:3651:2: ( ruleEInt )
            // InternalGuardin.g:3652:3: ruleEInt
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
    // InternalGuardin.g:3661:1: rule__Section__SignatureAssignment_6 : ( ruleEInt ) ;
    public final void rule__Section__SignatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3665:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3666:2: ( ruleEInt )
            {
            // InternalGuardin.g:3666:2: ( ruleEInt )
            // InternalGuardin.g:3667:3: ruleEInt
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
    // InternalGuardin.g:3676:1: rule__Section__BarsAssignment_8 : ( ruleEInt ) ;
    public final void rule__Section__BarsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3680:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3681:2: ( ruleEInt )
            {
            // InternalGuardin.g:3681:2: ( ruleEInt )
            // InternalGuardin.g:3682:3: ruleEInt
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
    // InternalGuardin.g:3691:1: rule__Track__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Track__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3695:1: ( ( ruleEString ) )
            // InternalGuardin.g:3696:2: ( ruleEString )
            {
            // InternalGuardin.g:3696:2: ( ruleEString )
            // InternalGuardin.g:3697:3: ruleEString
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
    // InternalGuardin.g:3706:1: rule__Track__InstrumentAssignment_2 : ( ruleInstrument ) ;
    public final void rule__Track__InstrumentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3710:1: ( ( ruleInstrument ) )
            // InternalGuardin.g:3711:2: ( ruleInstrument )
            {
            // InternalGuardin.g:3711:2: ( ruleInstrument )
            // InternalGuardin.g:3712:3: ruleInstrument
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
    // InternalGuardin.g:3721:1: rule__Battery__NameAssignment_2_1_0 : ( ruleEString ) ;
    public final void rule__Battery__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3725:1: ( ( ruleEString ) )
            // InternalGuardin.g:3726:2: ( ruleEString )
            {
            // InternalGuardin.g:3726:2: ( ruleEString )
            // InternalGuardin.g:3727:3: ruleEString
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
    // InternalGuardin.g:3736:1: rule__Battery__SectionsAssignment_3_0 : ( ruleSectionBatteryLayer ) ;
    public final void rule__Battery__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3740:1: ( ( ruleSectionBatteryLayer ) )
            // InternalGuardin.g:3741:2: ( ruleSectionBatteryLayer )
            {
            // InternalGuardin.g:3741:2: ( ruleSectionBatteryLayer )
            // InternalGuardin.g:3742:3: ruleSectionBatteryLayer
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
    // InternalGuardin.g:3751:1: rule__Battery__LayersAssignment_3_1 : ( ruleBatteryLayer ) ;
    public final void rule__Battery__LayersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3755:1: ( ( ruleBatteryLayer ) )
            // InternalGuardin.g:3756:2: ( ruleBatteryLayer )
            {
            // InternalGuardin.g:3756:2: ( ruleBatteryLayer )
            // InternalGuardin.g:3757:3: ruleBatteryLayer
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
    // InternalGuardin.g:3766:1: rule__SectionBatteryLayer__SectionAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__SectionBatteryLayer__SectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3770:1: ( ( ( ruleEString ) ) )
            // InternalGuardin.g:3771:2: ( ( ruleEString ) )
            {
            // InternalGuardin.g:3771:2: ( ( ruleEString ) )
            // InternalGuardin.g:3772:3: ( ruleEString )
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getSectionSectionCrossReference_2_0()); 
            // InternalGuardin.g:3773:3: ( ruleEString )
            // InternalGuardin.g:3774:4: ruleEString
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
    // InternalGuardin.g:3785:1: rule__SectionBatteryLayer__LayersAssignment_3 : ( ruleBatteryLayer ) ;
    public final void rule__SectionBatteryLayer__LayersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3789:1: ( ( ruleBatteryLayer ) )
            // InternalGuardin.g:3790:2: ( ruleBatteryLayer )
            {
            // InternalGuardin.g:3790:2: ( ruleBatteryLayer )
            // InternalGuardin.g:3791:3: ruleBatteryLayer
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
    // InternalGuardin.g:3800:1: rule__BatteryLayer__NotesAssignment_2 : ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) ) ;
    public final void rule__BatteryLayer__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3804:1: ( ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3805:2: ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3805:2: ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3806:3: ( rule__BatteryLayer__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3807:3: ( rule__BatteryLayer__NotesAlternatives_2_0 )
            // InternalGuardin.g:3807:4: rule__BatteryLayer__NotesAlternatives_2_0
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
    // InternalGuardin.g:3815:1: rule__BatteryNote__NoteTypeAssignment_1 : ( ruleBatteryNoteType ) ;
    public final void rule__BatteryNote__NoteTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3819:1: ( ( ruleBatteryNoteType ) )
            // InternalGuardin.g:3820:2: ( ruleBatteryNoteType )
            {
            // InternalGuardin.g:3820:2: ( ruleBatteryNoteType )
            // InternalGuardin.g:3821:3: ruleBatteryNoteType
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


    // $ANTLR start "rule__BatteryNote__DurationAssignment_2"
    // InternalGuardin.g:3830:1: rule__BatteryNote__DurationAssignment_2 : ( ruleDuration ) ;
    public final void rule__BatteryNote__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3834:1: ( ( ruleDuration ) )
            // InternalGuardin.g:3835:2: ( ruleDuration )
            {
            // InternalGuardin.g:3835:2: ( ruleDuration )
            // InternalGuardin.g:3836:3: ruleDuration
            {
             before(grammarAccess.getBatteryNoteAccess().getDurationDurationEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getBatteryNoteAccess().getDurationDurationEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatteryNote__DurationAssignment_2"


    // $ANTLR start "rule__CompositeBatteryNote__NotesAssignment_2"
    // InternalGuardin.g:3845:1: rule__CompositeBatteryNote__NotesAssignment_2 : ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) ) ;
    public final void rule__CompositeBatteryNote__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3849:1: ( ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3850:2: ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3850:2: ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3851:3: ( rule__CompositeBatteryNote__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3852:3: ( rule__CompositeBatteryNote__NotesAlternatives_2_0 )
            // InternalGuardin.g:3852:4: rule__CompositeBatteryNote__NotesAlternatives_2_0
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
    // InternalGuardin.g:3860:1: rule__CompositeBatteryNote__RepeatsAssignment_5 : ( ruleEInt ) ;
    public final void rule__CompositeBatteryNote__RepeatsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3864:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3865:2: ( ruleEInt )
            {
            // InternalGuardin.g:3865:2: ( ruleEInt )
            // InternalGuardin.g:3866:3: ruleEInt
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


    // $ANTLR start "rule__Melody__InstrumentAssignment_1_1"
    // InternalGuardin.g:3875:1: rule__Melody__InstrumentAssignment_1_1 : ( ruleInstruments ) ;
    public final void rule__Melody__InstrumentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3879:1: ( ( ruleInstruments ) )
            // InternalGuardin.g:3880:2: ( ruleInstruments )
            {
            // InternalGuardin.g:3880:2: ( ruleInstruments )
            // InternalGuardin.g:3881:3: ruleInstruments
            {
             before(grammarAccess.getMelodyAccess().getInstrumentInstrumentsEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruments();

            state._fsp--;

             after(grammarAccess.getMelodyAccess().getInstrumentInstrumentsEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__InstrumentAssignment_1_1"


    // $ANTLR start "rule__Melody__OtherAssignment_1_2_1"
    // InternalGuardin.g:3890:1: rule__Melody__OtherAssignment_1_2_1 : ( ruleEString ) ;
    public final void rule__Melody__OtherAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3894:1: ( ( ruleEString ) )
            // InternalGuardin.g:3895:2: ( ruleEString )
            {
            // InternalGuardin.g:3895:2: ( ruleEString )
            // InternalGuardin.g:3896:3: ruleEString
            {
             before(grammarAccess.getMelodyAccess().getOtherEStringParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMelodyAccess().getOtherEStringParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__OtherAssignment_1_2_1"


    // $ANTLR start "rule__Melody__NameAssignment_2_1_0"
    // InternalGuardin.g:3905:1: rule__Melody__NameAssignment_2_1_0 : ( ruleEString ) ;
    public final void rule__Melody__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3909:1: ( ( ruleEString ) )
            // InternalGuardin.g:3910:2: ( ruleEString )
            {
            // InternalGuardin.g:3910:2: ( ruleEString )
            // InternalGuardin.g:3911:3: ruleEString
            {
             before(grammarAccess.getMelodyAccess().getNameEStringParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMelodyAccess().getNameEStringParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__NameAssignment_2_1_0"


    // $ANTLR start "rule__Melody__SectionsAssignment_3_0"
    // InternalGuardin.g:3920:1: rule__Melody__SectionsAssignment_3_0 : ( ruleSectionMelodyLayer ) ;
    public final void rule__Melody__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3924:1: ( ( ruleSectionMelodyLayer ) )
            // InternalGuardin.g:3925:2: ( ruleSectionMelodyLayer )
            {
            // InternalGuardin.g:3925:2: ( ruleSectionMelodyLayer )
            // InternalGuardin.g:3926:3: ruleSectionMelodyLayer
            {
             before(grammarAccess.getMelodyAccess().getSectionsSectionMelodyLayerParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSectionMelodyLayer();

            state._fsp--;

             after(grammarAccess.getMelodyAccess().getSectionsSectionMelodyLayerParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__SectionsAssignment_3_0"


    // $ANTLR start "rule__Melody__LayersAssignment_3_1"
    // InternalGuardin.g:3935:1: rule__Melody__LayersAssignment_3_1 : ( ruleMelodyLayer ) ;
    public final void rule__Melody__LayersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3939:1: ( ( ruleMelodyLayer ) )
            // InternalGuardin.g:3940:2: ( ruleMelodyLayer )
            {
            // InternalGuardin.g:3940:2: ( ruleMelodyLayer )
            // InternalGuardin.g:3941:3: ruleMelodyLayer
            {
             before(grammarAccess.getMelodyAccess().getLayersMelodyLayerParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMelodyLayer();

            state._fsp--;

             after(grammarAccess.getMelodyAccess().getLayersMelodyLayerParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__LayersAssignment_3_1"


    // $ANTLR start "rule__SectionMelodyLayer__SectionAssignment_2"
    // InternalGuardin.g:3950:1: rule__SectionMelodyLayer__SectionAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__SectionMelodyLayer__SectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3954:1: ( ( ( ruleEString ) ) )
            // InternalGuardin.g:3955:2: ( ( ruleEString ) )
            {
            // InternalGuardin.g:3955:2: ( ( ruleEString ) )
            // InternalGuardin.g:3956:3: ( ruleEString )
            {
             before(grammarAccess.getSectionMelodyLayerAccess().getSectionSectionCrossReference_2_0()); 
            // InternalGuardin.g:3957:3: ( ruleEString )
            // InternalGuardin.g:3958:4: ruleEString
            {
             before(grammarAccess.getSectionMelodyLayerAccess().getSectionSectionEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionMelodyLayerAccess().getSectionSectionEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSectionMelodyLayerAccess().getSectionSectionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionMelodyLayer__SectionAssignment_2"


    // $ANTLR start "rule__SectionMelodyLayer__LayersAssignment_3"
    // InternalGuardin.g:3969:1: rule__SectionMelodyLayer__LayersAssignment_3 : ( ruleMelodyLayer ) ;
    public final void rule__SectionMelodyLayer__LayersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3973:1: ( ( ruleMelodyLayer ) )
            // InternalGuardin.g:3974:2: ( ruleMelodyLayer )
            {
            // InternalGuardin.g:3974:2: ( ruleMelodyLayer )
            // InternalGuardin.g:3975:3: ruleMelodyLayer
            {
             before(grammarAccess.getSectionMelodyLayerAccess().getLayersMelodyLayerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMelodyLayer();

            state._fsp--;

             after(grammarAccess.getSectionMelodyLayerAccess().getLayersMelodyLayerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionMelodyLayer__LayersAssignment_3"


    // $ANTLR start "rule__MelodyLayer__NotesAssignment_2"
    // InternalGuardin.g:3984:1: rule__MelodyLayer__NotesAssignment_2 : ( ( rule__MelodyLayer__NotesAlternatives_2_0 ) ) ;
    public final void rule__MelodyLayer__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3988:1: ( ( ( rule__MelodyLayer__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3989:2: ( ( rule__MelodyLayer__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3989:2: ( ( rule__MelodyLayer__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3990:3: ( rule__MelodyLayer__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getMelodyLayerAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3991:3: ( rule__MelodyLayer__NotesAlternatives_2_0 )
            // InternalGuardin.g:3991:4: rule__MelodyLayer__NotesAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MelodyLayer__NotesAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMelodyLayerAccess().getNotesAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyLayer__NotesAssignment_2"


    // $ANTLR start "rule__MelodyNote__NoteTypeAssignment_1"
    // InternalGuardin.g:3999:1: rule__MelodyNote__NoteTypeAssignment_1 : ( ruleMelodyNoteType ) ;
    public final void rule__MelodyNote__NoteTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:4003:1: ( ( ruleMelodyNoteType ) )
            // InternalGuardin.g:4004:2: ( ruleMelodyNoteType )
            {
            // InternalGuardin.g:4004:2: ( ruleMelodyNoteType )
            // InternalGuardin.g:4005:3: ruleMelodyNoteType
            {
             before(grammarAccess.getMelodyNoteAccess().getNoteTypeMelodyNoteTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMelodyNoteType();

            state._fsp--;

             after(grammarAccess.getMelodyNoteAccess().getNoteTypeMelodyNoteTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__NoteTypeAssignment_1"


    // $ANTLR start "rule__MelodyNote__DurationAssignment_2"
    // InternalGuardin.g:4014:1: rule__MelodyNote__DurationAssignment_2 : ( ruleDuration ) ;
    public final void rule__MelodyNote__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:4018:1: ( ( ruleDuration ) )
            // InternalGuardin.g:4019:2: ( ruleDuration )
            {
            // InternalGuardin.g:4019:2: ( ruleDuration )
            // InternalGuardin.g:4020:3: ruleDuration
            {
             before(grammarAccess.getMelodyNoteAccess().getDurationDurationEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getMelodyNoteAccess().getDurationDurationEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__DurationAssignment_2"


    // $ANTLR start "rule__MelodyNote__OctaveOffsetAssignment_3_0_1"
    // InternalGuardin.g:4029:1: rule__MelodyNote__OctaveOffsetAssignment_3_0_1 : ( ruleERelativeInt ) ;
    public final void rule__MelodyNote__OctaveOffsetAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:4033:1: ( ( ruleERelativeInt ) )
            // InternalGuardin.g:4034:2: ( ruleERelativeInt )
            {
            // InternalGuardin.g:4034:2: ( ruleERelativeInt )
            // InternalGuardin.g:4035:3: ruleERelativeInt
            {
             before(grammarAccess.getMelodyNoteAccess().getOctaveOffsetERelativeIntParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleERelativeInt();

            state._fsp--;

             after(grammarAccess.getMelodyNoteAccess().getOctaveOffsetERelativeIntParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__OctaveOffsetAssignment_3_0_1"


    // $ANTLR start "rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1"
    // InternalGuardin.g:4044:1: rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1 : ( ruleEInt ) ;
    public final void rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:4048:1: ( ( ruleEInt ) )
            // InternalGuardin.g:4049:2: ( ruleEInt )
            {
            // InternalGuardin.g:4049:2: ( ruleEInt )
            // InternalGuardin.g:4050:3: ruleEInt
            {
             before(grammarAccess.getMelodyNoteAccess().getOctaveAbsoluteEIntParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMelodyNoteAccess().getOctaveAbsoluteEIntParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MelodyNote__OctaveAbsoluteAssignment_3_1_1"


    // $ANTLR start "rule__CompositeMelodyNote__NotesAssignment_2"
    // InternalGuardin.g:4059:1: rule__CompositeMelodyNote__NotesAssignment_2 : ( ( rule__CompositeMelodyNote__NotesAlternatives_2_0 ) ) ;
    public final void rule__CompositeMelodyNote__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:4063:1: ( ( ( rule__CompositeMelodyNote__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:4064:2: ( ( rule__CompositeMelodyNote__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:4064:2: ( ( rule__CompositeMelodyNote__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:4065:3: ( rule__CompositeMelodyNote__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getCompositeMelodyNoteAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:4066:3: ( rule__CompositeMelodyNote__NotesAlternatives_2_0 )
            // InternalGuardin.g:4066:4: rule__CompositeMelodyNote__NotesAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeMelodyNote__NotesAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeMelodyNoteAccess().getNotesAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__NotesAssignment_2"


    // $ANTLR start "rule__CompositeMelodyNote__RepeatsAssignment_5"
    // InternalGuardin.g:4074:1: rule__CompositeMelodyNote__RepeatsAssignment_5 : ( ruleEInt ) ;
    public final void rule__CompositeMelodyNote__RepeatsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:4078:1: ( ( ruleEInt ) )
            // InternalGuardin.g:4079:2: ( ruleEInt )
            {
            // InternalGuardin.g:4079:2: ( ruleEInt )
            // InternalGuardin.g:4080:3: ruleEInt
            {
             before(grammarAccess.getCompositeMelodyNoteAccess().getRepeatsEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCompositeMelodyNoteAccess().getRepeatsEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeMelodyNote__RepeatsAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020000000060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x01020000FFC01060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0014000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00210000003F0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00210000003F0002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00010000003F0000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00010000003F0002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0021007F00000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0021007F00000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x060000000000E000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001007F00000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001007F00000002L});

}