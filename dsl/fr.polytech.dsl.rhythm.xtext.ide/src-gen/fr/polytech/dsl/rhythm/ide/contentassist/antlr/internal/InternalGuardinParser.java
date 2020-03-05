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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'Music'", "'sections'", "'tracks'", "'CustomSoundBank'", "'basePath='", "'-'", "'tempo='", "'signature='", "'bars='", "'$'", "'battery'", "'debut_section'", "'fin_section'", "'layer:'", "'('", "')'", "'x'", "'piano'", "'/'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


    // $ANTLR start "rulePianoNoteType"
    // InternalGuardin.g:519:1: rulePianoNoteType : ( ( rule__PianoNoteType__Alternatives ) ) ;
    public final void rulePianoNoteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:523:1: ( ( ( rule__PianoNoteType__Alternatives ) ) )
            // InternalGuardin.g:524:2: ( ( rule__PianoNoteType__Alternatives ) )
            {
            // InternalGuardin.g:524:2: ( ( rule__PianoNoteType__Alternatives ) )
            // InternalGuardin.g:525:3: ( rule__PianoNoteType__Alternatives )
            {
             before(grammarAccess.getPianoNoteTypeAccess().getAlternatives()); 
            // InternalGuardin.g:526:3: ( rule__PianoNoteType__Alternatives )
            // InternalGuardin.g:526:4: rule__PianoNoteType__Alternatives
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
    // InternalGuardin.g:534:1: rule__Instrument__Alternatives : ( ( ruleBattery ) | ( rulePiano ) );
    public final void rule__Instrument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:538:1: ( ( ruleBattery ) | ( rulePiano ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==35) ) {
                alt1=1;
            }
            else if ( (LA1_0==42) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGuardin.g:539:2: ( ruleBattery )
                    {
                    // InternalGuardin.g:539:2: ( ruleBattery )
                    // InternalGuardin.g:540:3: ruleBattery
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
                    // InternalGuardin.g:545:2: ( rulePiano )
                    {
                    // InternalGuardin.g:545:2: ( rulePiano )
                    // InternalGuardin.g:546:3: rulePiano
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
    // InternalGuardin.g:555:1: rule__Battery__Alternatives_2 : ( ( ':' ) | ( ( rule__Battery__Group_2_1__0 ) ) );
    public final void rule__Battery__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:559:1: ( ( ':' ) | ( ( rule__Battery__Group_2_1__0 ) ) )
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
                    // InternalGuardin.g:560:2: ( ':' )
                    {
                    // InternalGuardin.g:560:2: ( ':' )
                    // InternalGuardin.g:561:3: ':'
                    {
                     before(grammarAccess.getBatteryAccess().getColonKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBatteryAccess().getColonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:566:2: ( ( rule__Battery__Group_2_1__0 ) )
                    {
                    // InternalGuardin.g:566:2: ( ( rule__Battery__Group_2_1__0 ) )
                    // InternalGuardin.g:567:3: ( rule__Battery__Group_2_1__0 )
                    {
                     before(grammarAccess.getBatteryAccess().getGroup_2_1()); 
                    // InternalGuardin.g:568:3: ( rule__Battery__Group_2_1__0 )
                    // InternalGuardin.g:568:4: rule__Battery__Group_2_1__0
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
    // InternalGuardin.g:576:1: rule__Battery__Alternatives_3 : ( ( ( rule__Battery__SectionsAssignment_3_0 ) ) | ( ( rule__Battery__LayersAssignment_3_1 ) ) );
    public final void rule__Battery__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:580:1: ( ( ( rule__Battery__SectionsAssignment_3_0 ) ) | ( ( rule__Battery__LayersAssignment_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuardin.g:581:2: ( ( rule__Battery__SectionsAssignment_3_0 ) )
                    {
                    // InternalGuardin.g:581:2: ( ( rule__Battery__SectionsAssignment_3_0 ) )
                    // InternalGuardin.g:582:3: ( rule__Battery__SectionsAssignment_3_0 )
                    {
                     before(grammarAccess.getBatteryAccess().getSectionsAssignment_3_0()); 
                    // InternalGuardin.g:583:3: ( rule__Battery__SectionsAssignment_3_0 )
                    // InternalGuardin.g:583:4: rule__Battery__SectionsAssignment_3_0
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
                    // InternalGuardin.g:587:2: ( ( rule__Battery__LayersAssignment_3_1 ) )
                    {
                    // InternalGuardin.g:587:2: ( ( rule__Battery__LayersAssignment_3_1 ) )
                    // InternalGuardin.g:588:3: ( rule__Battery__LayersAssignment_3_1 )
                    {
                     before(grammarAccess.getBatteryAccess().getLayersAssignment_3_1()); 
                    // InternalGuardin.g:589:3: ( rule__Battery__LayersAssignment_3_1 )
                    // InternalGuardin.g:589:4: rule__Battery__LayersAssignment_3_1
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
    // InternalGuardin.g:597:1: rule__BatteryLayer__NotesAlternatives_2_0 : ( ( ruleBatteryNote ) | ( ruleEmptyNote ) | ( ruleCompositeBatteryNote ) );
    public final void rule__BatteryLayer__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:601:1: ( ( ruleBatteryNote ) | ( ruleEmptyNote ) | ( ruleCompositeBatteryNote ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt4=1;
                }
                break;
            case 34:
                {
                alt4=2;
                }
                break;
            case 39:
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
                    // InternalGuardin.g:602:2: ( ruleBatteryNote )
                    {
                    // InternalGuardin.g:602:2: ( ruleBatteryNote )
                    // InternalGuardin.g:603:3: ruleBatteryNote
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
                    // InternalGuardin.g:608:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:608:2: ( ruleEmptyNote )
                    // InternalGuardin.g:609:3: ruleEmptyNote
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
                    // InternalGuardin.g:614:2: ( ruleCompositeBatteryNote )
                    {
                    // InternalGuardin.g:614:2: ( ruleCompositeBatteryNote )
                    // InternalGuardin.g:615:3: ruleCompositeBatteryNote
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
    // InternalGuardin.g:624:1: rule__CompositeBatteryNote__NotesAlternatives_2_0 : ( ( ruleBatteryNote ) | ( ruleEmptyNote ) );
    public final void rule__CompositeBatteryNote__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:628:1: ( ( ruleBatteryNote ) | ( ruleEmptyNote ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=12 && LA5_0<=17)) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGuardin.g:629:2: ( ruleBatteryNote )
                    {
                    // InternalGuardin.g:629:2: ( ruleBatteryNote )
                    // InternalGuardin.g:630:3: ruleBatteryNote
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
                    // InternalGuardin.g:635:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:635:2: ( ruleEmptyNote )
                    // InternalGuardin.g:636:3: ruleEmptyNote
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


    // $ANTLR start "rule__Piano__Alternatives_2"
    // InternalGuardin.g:645:1: rule__Piano__Alternatives_2 : ( ( ':' ) | ( ( rule__Piano__Group_2_1__0 ) ) );
    public final void rule__Piano__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:649:1: ( ( ':' ) | ( ( rule__Piano__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGuardin.g:650:2: ( ':' )
                    {
                    // InternalGuardin.g:650:2: ( ':' )
                    // InternalGuardin.g:651:3: ':'
                    {
                     before(grammarAccess.getPianoAccess().getColonKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPianoAccess().getColonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:656:2: ( ( rule__Piano__Group_2_1__0 ) )
                    {
                    // InternalGuardin.g:656:2: ( ( rule__Piano__Group_2_1__0 ) )
                    // InternalGuardin.g:657:3: ( rule__Piano__Group_2_1__0 )
                    {
                     before(grammarAccess.getPianoAccess().getGroup_2_1()); 
                    // InternalGuardin.g:658:3: ( rule__Piano__Group_2_1__0 )
                    // InternalGuardin.g:658:4: rule__Piano__Group_2_1__0
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
    // InternalGuardin.g:666:1: rule__Piano__Alternatives_3 : ( ( ( rule__Piano__SectionsAssignment_3_0 ) ) | ( ( rule__Piano__LayersAssignment_3_1 ) ) );
    public final void rule__Piano__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:670:1: ( ( ( rule__Piano__SectionsAssignment_3_0 ) ) | ( ( rule__Piano__LayersAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGuardin.g:671:2: ( ( rule__Piano__SectionsAssignment_3_0 ) )
                    {
                    // InternalGuardin.g:671:2: ( ( rule__Piano__SectionsAssignment_3_0 ) )
                    // InternalGuardin.g:672:3: ( rule__Piano__SectionsAssignment_3_0 )
                    {
                     before(grammarAccess.getPianoAccess().getSectionsAssignment_3_0()); 
                    // InternalGuardin.g:673:3: ( rule__Piano__SectionsAssignment_3_0 )
                    // InternalGuardin.g:673:4: rule__Piano__SectionsAssignment_3_0
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
                    // InternalGuardin.g:677:2: ( ( rule__Piano__LayersAssignment_3_1 ) )
                    {
                    // InternalGuardin.g:677:2: ( ( rule__Piano__LayersAssignment_3_1 ) )
                    // InternalGuardin.g:678:3: ( rule__Piano__LayersAssignment_3_1 )
                    {
                     before(grammarAccess.getPianoAccess().getLayersAssignment_3_1()); 
                    // InternalGuardin.g:679:3: ( rule__Piano__LayersAssignment_3_1 )
                    // InternalGuardin.g:679:4: rule__Piano__LayersAssignment_3_1
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
    // InternalGuardin.g:687:1: rule__PianoLayer__NotesAlternatives_2_0 : ( ( rulePianoNote ) | ( ruleEmptyNote ) | ( ruleCompositePianoNote ) );
    public final void rule__PianoLayer__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:691:1: ( ( rulePianoNote ) | ( ruleEmptyNote ) | ( ruleCompositePianoNote ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 39:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGuardin.g:692:2: ( rulePianoNote )
                    {
                    // InternalGuardin.g:692:2: ( rulePianoNote )
                    // InternalGuardin.g:693:3: rulePianoNote
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
                    // InternalGuardin.g:698:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:698:2: ( ruleEmptyNote )
                    // InternalGuardin.g:699:3: ruleEmptyNote
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
                    // InternalGuardin.g:704:2: ( ruleCompositePianoNote )
                    {
                    // InternalGuardin.g:704:2: ( ruleCompositePianoNote )
                    // InternalGuardin.g:705:3: ruleCompositePianoNote
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


    // $ANTLR start "rule__CompositePianoNote__NotesAlternatives_2_0"
    // InternalGuardin.g:714:1: rule__CompositePianoNote__NotesAlternatives_2_0 : ( ( rulePianoNote ) | ( ruleEmptyNote ) );
    public final void rule__CompositePianoNote__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:718:1: ( ( rulePianoNote ) | ( ruleEmptyNote ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=18 && LA9_0<=24)) ) {
                alt9=1;
            }
            else if ( (LA9_0==34) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGuardin.g:719:2: ( rulePianoNote )
                    {
                    // InternalGuardin.g:719:2: ( rulePianoNote )
                    // InternalGuardin.g:720:3: rulePianoNote
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
                    // InternalGuardin.g:725:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:725:2: ( ruleEmptyNote )
                    // InternalGuardin.g:726:3: ruleEmptyNote
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
    // InternalGuardin.g:735:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:739:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGuardin.g:740:2: ( RULE_STRING )
                    {
                    // InternalGuardin.g:740:2: ( RULE_STRING )
                    // InternalGuardin.g:741:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:746:2: ( RULE_ID )
                    {
                    // InternalGuardin.g:746:2: ( RULE_ID )
                    // InternalGuardin.g:747:3: RULE_ID
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
    // InternalGuardin.g:756:1: rule__BatteryNoteType__Alternatives : ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) );
    public final void rule__BatteryNoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:760:1: ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt11=1;
                }
                break;
            case 13:
                {
                alt11=2;
                }
                break;
            case 14:
                {
                alt11=3;
                }
                break;
            case 15:
                {
                alt11=4;
                }
                break;
            case 16:
                {
                alt11=5;
                }
                break;
            case 17:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGuardin.g:761:2: ( ( 'bd' ) )
                    {
                    // InternalGuardin.g:761:2: ( ( 'bd' ) )
                    // InternalGuardin.g:762:3: ( 'bd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:763:3: ( 'bd' )
                    // InternalGuardin.g:763:4: 'bd'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:767:2: ( ( 'ch' ) )
                    {
                    // InternalGuardin.g:767:2: ( ( 'ch' ) )
                    // InternalGuardin.g:768:3: ( 'ch' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:769:3: ( 'ch' )
                    // InternalGuardin.g:769:4: 'ch'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:773:2: ( ( 'cc' ) )
                    {
                    // InternalGuardin.g:773:2: ( ( 'cc' ) )
                    // InternalGuardin.g:774:3: ( 'cc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:775:3: ( 'cc' )
                    // InternalGuardin.g:775:4: 'cc'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:779:2: ( ( 'oh' ) )
                    {
                    // InternalGuardin.g:779:2: ( ( 'oh' ) )
                    // InternalGuardin.g:780:3: ( 'oh' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:781:3: ( 'oh' )
                    // InternalGuardin.g:781:4: 'oh'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:785:2: ( ( 'rc' ) )
                    {
                    // InternalGuardin.g:785:2: ( ( 'rc' ) )
                    // InternalGuardin.g:786:3: ( 'rc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:787:3: ( 'rc' )
                    // InternalGuardin.g:787:4: 'rc'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:791:2: ( ( 'sd' ) )
                    {
                    // InternalGuardin.g:791:2: ( ( 'sd' ) )
                    // InternalGuardin.g:792:3: ( 'sd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getSNARE_DRUMEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:793:3: ( 'sd' )
                    // InternalGuardin.g:793:4: 'sd'
                    {
                    match(input,17,FOLLOW_2); 

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


    // $ANTLR start "rule__PianoNoteType__Alternatives"
    // InternalGuardin.g:801:1: rule__PianoNoteType__Alternatives : ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) );
    public final void rule__PianoNoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:805:1: ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt12=1;
                }
                break;
            case 19:
                {
                alt12=2;
                }
                break;
            case 20:
                {
                alt12=3;
                }
                break;
            case 21:
                {
                alt12=4;
                }
                break;
            case 22:
                {
                alt12=5;
                }
                break;
            case 23:
                {
                alt12=6;
                }
                break;
            case 24:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalGuardin.g:806:2: ( ( 'A' ) )
                    {
                    // InternalGuardin.g:806:2: ( ( 'A' ) )
                    // InternalGuardin.g:807:3: ( 'A' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:808:3: ( 'A' )
                    // InternalGuardin.g:808:4: 'A'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:812:2: ( ( 'B' ) )
                    {
                    // InternalGuardin.g:812:2: ( ( 'B' ) )
                    // InternalGuardin.g:813:3: ( 'B' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:814:3: ( 'B' )
                    // InternalGuardin.g:814:4: 'B'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:818:2: ( ( 'C' ) )
                    {
                    // InternalGuardin.g:818:2: ( ( 'C' ) )
                    // InternalGuardin.g:819:3: ( 'C' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:820:3: ( 'C' )
                    // InternalGuardin.g:820:4: 'C'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:824:2: ( ( 'D' ) )
                    {
                    // InternalGuardin.g:824:2: ( ( 'D' ) )
                    // InternalGuardin.g:825:3: ( 'D' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:826:3: ( 'D' )
                    // InternalGuardin.g:826:4: 'D'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:830:2: ( ( 'E' ) )
                    {
                    // InternalGuardin.g:830:2: ( ( 'E' ) )
                    // InternalGuardin.g:831:3: ( 'E' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:832:3: ( 'E' )
                    // InternalGuardin.g:832:4: 'E'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:836:2: ( ( 'F' ) )
                    {
                    // InternalGuardin.g:836:2: ( ( 'F' ) )
                    // InternalGuardin.g:837:3: ( 'F' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:838:3: ( 'F' )
                    // InternalGuardin.g:838:4: 'F'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:842:2: ( ( 'G' ) )
                    {
                    // InternalGuardin.g:842:2: ( ( 'G' ) )
                    // InternalGuardin.g:843:3: ( 'G' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getGEnumLiteralDeclaration_6()); 
                    // InternalGuardin.g:844:3: ( 'G' )
                    // InternalGuardin.g:844:4: 'G'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalGuardin.g:852:1: rule__Music__Group__0 : rule__Music__Group__0__Impl rule__Music__Group__1 ;
    public final void rule__Music__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:856:1: ( rule__Music__Group__0__Impl rule__Music__Group__1 )
            // InternalGuardin.g:857:2: rule__Music__Group__0__Impl rule__Music__Group__1
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
    // InternalGuardin.g:864:1: rule__Music__Group__0__Impl : ( () ) ;
    public final void rule__Music__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:868:1: ( ( () ) )
            // InternalGuardin.g:869:1: ( () )
            {
            // InternalGuardin.g:869:1: ( () )
            // InternalGuardin.g:870:2: ()
            {
             before(grammarAccess.getMusicAccess().getMusicAction_0()); 
            // InternalGuardin.g:871:2: ()
            // InternalGuardin.g:871:3: 
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
    // InternalGuardin.g:879:1: rule__Music__Group__1 : rule__Music__Group__1__Impl rule__Music__Group__2 ;
    public final void rule__Music__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:883:1: ( rule__Music__Group__1__Impl rule__Music__Group__2 )
            // InternalGuardin.g:884:2: rule__Music__Group__1__Impl rule__Music__Group__2
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
    // InternalGuardin.g:891:1: rule__Music__Group__1__Impl : ( ( rule__Music__Group_1__0 )? ) ;
    public final void rule__Music__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:895:1: ( ( ( rule__Music__Group_1__0 )? ) )
            // InternalGuardin.g:896:1: ( ( rule__Music__Group_1__0 )? )
            {
            // InternalGuardin.g:896:1: ( ( rule__Music__Group_1__0 )? )
            // InternalGuardin.g:897:2: ( rule__Music__Group_1__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_1()); 
            // InternalGuardin.g:898:2: ( rule__Music__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGuardin.g:898:3: rule__Music__Group_1__0
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
    // InternalGuardin.g:906:1: rule__Music__Group__2 : rule__Music__Group__2__Impl rule__Music__Group__3 ;
    public final void rule__Music__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:910:1: ( rule__Music__Group__2__Impl rule__Music__Group__3 )
            // InternalGuardin.g:911:2: rule__Music__Group__2__Impl rule__Music__Group__3
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
    // InternalGuardin.g:918:1: rule__Music__Group__2__Impl : ( 'Music' ) ;
    public final void rule__Music__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:922:1: ( ( 'Music' ) )
            // InternalGuardin.g:923:1: ( 'Music' )
            {
            // InternalGuardin.g:923:1: ( 'Music' )
            // InternalGuardin.g:924:2: 'Music'
            {
             before(grammarAccess.getMusicAccess().getMusicKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGuardin.g:933:1: rule__Music__Group__3 : rule__Music__Group__3__Impl rule__Music__Group__4 ;
    public final void rule__Music__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:937:1: ( rule__Music__Group__3__Impl rule__Music__Group__4 )
            // InternalGuardin.g:938:2: rule__Music__Group__3__Impl rule__Music__Group__4
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
    // InternalGuardin.g:945:1: rule__Music__Group__3__Impl : ( ( rule__Music__NameAssignment_3 ) ) ;
    public final void rule__Music__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:949:1: ( ( ( rule__Music__NameAssignment_3 ) ) )
            // InternalGuardin.g:950:1: ( ( rule__Music__NameAssignment_3 ) )
            {
            // InternalGuardin.g:950:1: ( ( rule__Music__NameAssignment_3 ) )
            // InternalGuardin.g:951:2: ( rule__Music__NameAssignment_3 )
            {
             before(grammarAccess.getMusicAccess().getNameAssignment_3()); 
            // InternalGuardin.g:952:2: ( rule__Music__NameAssignment_3 )
            // InternalGuardin.g:952:3: rule__Music__NameAssignment_3
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
    // InternalGuardin.g:960:1: rule__Music__Group__4 : rule__Music__Group__4__Impl rule__Music__Group__5 ;
    public final void rule__Music__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:964:1: ( rule__Music__Group__4__Impl rule__Music__Group__5 )
            // InternalGuardin.g:965:2: rule__Music__Group__4__Impl rule__Music__Group__5
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
    // InternalGuardin.g:972:1: rule__Music__Group__4__Impl : ( ':' ) ;
    public final void rule__Music__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:976:1: ( ( ':' ) )
            // InternalGuardin.g:977:1: ( ':' )
            {
            // InternalGuardin.g:977:1: ( ':' )
            // InternalGuardin.g:978:2: ':'
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
    // InternalGuardin.g:987:1: rule__Music__Group__5 : rule__Music__Group__5__Impl rule__Music__Group__6 ;
    public final void rule__Music__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:991:1: ( rule__Music__Group__5__Impl rule__Music__Group__6 )
            // InternalGuardin.g:992:2: rule__Music__Group__5__Impl rule__Music__Group__6
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
    // InternalGuardin.g:999:1: rule__Music__Group__5__Impl : ( 'sections' ) ;
    public final void rule__Music__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1003:1: ( ( 'sections' ) )
            // InternalGuardin.g:1004:1: ( 'sections' )
            {
            // InternalGuardin.g:1004:1: ( 'sections' )
            // InternalGuardin.g:1005:2: 'sections'
            {
             before(grammarAccess.getMusicAccess().getSectionsKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGuardin.g:1014:1: rule__Music__Group__6 : rule__Music__Group__6__Impl rule__Music__Group__7 ;
    public final void rule__Music__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1018:1: ( rule__Music__Group__6__Impl rule__Music__Group__7 )
            // InternalGuardin.g:1019:2: rule__Music__Group__6__Impl rule__Music__Group__7
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
    // InternalGuardin.g:1026:1: rule__Music__Group__6__Impl : ( ':' ) ;
    public final void rule__Music__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1030:1: ( ( ':' ) )
            // InternalGuardin.g:1031:1: ( ':' )
            {
            // InternalGuardin.g:1031:1: ( ':' )
            // InternalGuardin.g:1032:2: ':'
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
    // InternalGuardin.g:1041:1: rule__Music__Group__7 : rule__Music__Group__7__Impl rule__Music__Group__8 ;
    public final void rule__Music__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1045:1: ( rule__Music__Group__7__Impl rule__Music__Group__8 )
            // InternalGuardin.g:1046:2: rule__Music__Group__7__Impl rule__Music__Group__8
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
    // InternalGuardin.g:1053:1: rule__Music__Group__7__Impl : ( ( rule__Music__SectionsAssignment_7 ) ) ;
    public final void rule__Music__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1057:1: ( ( ( rule__Music__SectionsAssignment_7 ) ) )
            // InternalGuardin.g:1058:1: ( ( rule__Music__SectionsAssignment_7 ) )
            {
            // InternalGuardin.g:1058:1: ( ( rule__Music__SectionsAssignment_7 ) )
            // InternalGuardin.g:1059:2: ( rule__Music__SectionsAssignment_7 )
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_7()); 
            // InternalGuardin.g:1060:2: ( rule__Music__SectionsAssignment_7 )
            // InternalGuardin.g:1060:3: rule__Music__SectionsAssignment_7
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
    // InternalGuardin.g:1068:1: rule__Music__Group__8 : rule__Music__Group__8__Impl rule__Music__Group__9 ;
    public final void rule__Music__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1072:1: ( rule__Music__Group__8__Impl rule__Music__Group__9 )
            // InternalGuardin.g:1073:2: rule__Music__Group__8__Impl rule__Music__Group__9
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
    // InternalGuardin.g:1080:1: rule__Music__Group__8__Impl : ( ( rule__Music__SectionsAssignment_8 )* ) ;
    public final void rule__Music__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1084:1: ( ( ( rule__Music__SectionsAssignment_8 )* ) )
            // InternalGuardin.g:1085:1: ( ( rule__Music__SectionsAssignment_8 )* )
            {
            // InternalGuardin.g:1085:1: ( ( rule__Music__SectionsAssignment_8 )* )
            // InternalGuardin.g:1086:2: ( rule__Music__SectionsAssignment_8 )*
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_8()); 
            // InternalGuardin.g:1087:2: ( rule__Music__SectionsAssignment_8 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGuardin.g:1087:3: rule__Music__SectionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Music__SectionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalGuardin.g:1095:1: rule__Music__Group__9 : rule__Music__Group__9__Impl rule__Music__Group__10 ;
    public final void rule__Music__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1099:1: ( rule__Music__Group__9__Impl rule__Music__Group__10 )
            // InternalGuardin.g:1100:2: rule__Music__Group__9__Impl rule__Music__Group__10
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
    // InternalGuardin.g:1107:1: rule__Music__Group__9__Impl : ( 'tracks' ) ;
    public final void rule__Music__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1111:1: ( ( 'tracks' ) )
            // InternalGuardin.g:1112:1: ( 'tracks' )
            {
            // InternalGuardin.g:1112:1: ( 'tracks' )
            // InternalGuardin.g:1113:2: 'tracks'
            {
             before(grammarAccess.getMusicAccess().getTracksKeyword_9()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGuardin.g:1122:1: rule__Music__Group__10 : rule__Music__Group__10__Impl rule__Music__Group__11 ;
    public final void rule__Music__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1126:1: ( rule__Music__Group__10__Impl rule__Music__Group__11 )
            // InternalGuardin.g:1127:2: rule__Music__Group__10__Impl rule__Music__Group__11
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
    // InternalGuardin.g:1134:1: rule__Music__Group__10__Impl : ( ':' ) ;
    public final void rule__Music__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1138:1: ( ( ':' ) )
            // InternalGuardin.g:1139:1: ( ':' )
            {
            // InternalGuardin.g:1139:1: ( ':' )
            // InternalGuardin.g:1140:2: ':'
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
    // InternalGuardin.g:1149:1: rule__Music__Group__11 : rule__Music__Group__11__Impl ;
    public final void rule__Music__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1153:1: ( rule__Music__Group__11__Impl )
            // InternalGuardin.g:1154:2: rule__Music__Group__11__Impl
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
    // InternalGuardin.g:1160:1: rule__Music__Group__11__Impl : ( ( rule__Music__Group_11__0 ) ) ;
    public final void rule__Music__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1164:1: ( ( ( rule__Music__Group_11__0 ) ) )
            // InternalGuardin.g:1165:1: ( ( rule__Music__Group_11__0 ) )
            {
            // InternalGuardin.g:1165:1: ( ( rule__Music__Group_11__0 ) )
            // InternalGuardin.g:1166:2: ( rule__Music__Group_11__0 )
            {
             before(grammarAccess.getMusicAccess().getGroup_11()); 
            // InternalGuardin.g:1167:2: ( rule__Music__Group_11__0 )
            // InternalGuardin.g:1167:3: rule__Music__Group_11__0
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
    // InternalGuardin.g:1176:1: rule__Music__Group_1__0 : rule__Music__Group_1__0__Impl rule__Music__Group_1__1 ;
    public final void rule__Music__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1180:1: ( rule__Music__Group_1__0__Impl rule__Music__Group_1__1 )
            // InternalGuardin.g:1181:2: rule__Music__Group_1__0__Impl rule__Music__Group_1__1
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
    // InternalGuardin.g:1188:1: rule__Music__Group_1__0__Impl : ( 'CustomSoundBank' ) ;
    public final void rule__Music__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1192:1: ( ( 'CustomSoundBank' ) )
            // InternalGuardin.g:1193:1: ( 'CustomSoundBank' )
            {
            // InternalGuardin.g:1193:1: ( 'CustomSoundBank' )
            // InternalGuardin.g:1194:2: 'CustomSoundBank'
            {
             before(grammarAccess.getMusicAccess().getCustomSoundBankKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGuardin.g:1203:1: rule__Music__Group_1__1 : rule__Music__Group_1__1__Impl rule__Music__Group_1__2 ;
    public final void rule__Music__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1207:1: ( rule__Music__Group_1__1__Impl rule__Music__Group_1__2 )
            // InternalGuardin.g:1208:2: rule__Music__Group_1__1__Impl rule__Music__Group_1__2
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
    // InternalGuardin.g:1215:1: rule__Music__Group_1__1__Impl : ( 'basePath=' ) ;
    public final void rule__Music__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1219:1: ( ( 'basePath=' ) )
            // InternalGuardin.g:1220:1: ( 'basePath=' )
            {
            // InternalGuardin.g:1220:1: ( 'basePath=' )
            // InternalGuardin.g:1221:2: 'basePath='
            {
             before(grammarAccess.getMusicAccess().getBasePathKeyword_1_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGuardin.g:1230:1: rule__Music__Group_1__2 : rule__Music__Group_1__2__Impl ;
    public final void rule__Music__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1234:1: ( rule__Music__Group_1__2__Impl )
            // InternalGuardin.g:1235:2: rule__Music__Group_1__2__Impl
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
    // InternalGuardin.g:1241:1: rule__Music__Group_1__2__Impl : ( ( rule__Music__SoundBankPathAssignment_1_2 ) ) ;
    public final void rule__Music__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1245:1: ( ( ( rule__Music__SoundBankPathAssignment_1_2 ) ) )
            // InternalGuardin.g:1246:1: ( ( rule__Music__SoundBankPathAssignment_1_2 ) )
            {
            // InternalGuardin.g:1246:1: ( ( rule__Music__SoundBankPathAssignment_1_2 ) )
            // InternalGuardin.g:1247:2: ( rule__Music__SoundBankPathAssignment_1_2 )
            {
             before(grammarAccess.getMusicAccess().getSoundBankPathAssignment_1_2()); 
            // InternalGuardin.g:1248:2: ( rule__Music__SoundBankPathAssignment_1_2 )
            // InternalGuardin.g:1248:3: rule__Music__SoundBankPathAssignment_1_2
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
    // InternalGuardin.g:1257:1: rule__Music__Group_11__0 : rule__Music__Group_11__0__Impl rule__Music__Group_11__1 ;
    public final void rule__Music__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1261:1: ( rule__Music__Group_11__0__Impl rule__Music__Group_11__1 )
            // InternalGuardin.g:1262:2: rule__Music__Group_11__0__Impl rule__Music__Group_11__1
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
    // InternalGuardin.g:1269:1: rule__Music__Group_11__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1273:1: ( ( '-' ) )
            // InternalGuardin.g:1274:1: ( '-' )
            {
            // InternalGuardin.g:1274:1: ( '-' )
            // InternalGuardin.g:1275:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGuardin.g:1284:1: rule__Music__Group_11__1 : rule__Music__Group_11__1__Impl rule__Music__Group_11__2 ;
    public final void rule__Music__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1288:1: ( rule__Music__Group_11__1__Impl rule__Music__Group_11__2 )
            // InternalGuardin.g:1289:2: rule__Music__Group_11__1__Impl rule__Music__Group_11__2
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
    // InternalGuardin.g:1296:1: rule__Music__Group_11__1__Impl : ( ( rule__Music__TracksAssignment_11_1 ) ) ;
    public final void rule__Music__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1300:1: ( ( ( rule__Music__TracksAssignment_11_1 ) ) )
            // InternalGuardin.g:1301:1: ( ( rule__Music__TracksAssignment_11_1 ) )
            {
            // InternalGuardin.g:1301:1: ( ( rule__Music__TracksAssignment_11_1 ) )
            // InternalGuardin.g:1302:2: ( rule__Music__TracksAssignment_11_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_11_1()); 
            // InternalGuardin.g:1303:2: ( rule__Music__TracksAssignment_11_1 )
            // InternalGuardin.g:1303:3: rule__Music__TracksAssignment_11_1
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
    // InternalGuardin.g:1311:1: rule__Music__Group_11__2 : rule__Music__Group_11__2__Impl ;
    public final void rule__Music__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1315:1: ( rule__Music__Group_11__2__Impl )
            // InternalGuardin.g:1316:2: rule__Music__Group_11__2__Impl
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
    // InternalGuardin.g:1322:1: rule__Music__Group_11__2__Impl : ( ( rule__Music__Group_11_2__0 )* ) ;
    public final void rule__Music__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1326:1: ( ( ( rule__Music__Group_11_2__0 )* ) )
            // InternalGuardin.g:1327:1: ( ( rule__Music__Group_11_2__0 )* )
            {
            // InternalGuardin.g:1327:1: ( ( rule__Music__Group_11_2__0 )* )
            // InternalGuardin.g:1328:2: ( rule__Music__Group_11_2__0 )*
            {
             before(grammarAccess.getMusicAccess().getGroup_11_2()); 
            // InternalGuardin.g:1329:2: ( rule__Music__Group_11_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGuardin.g:1329:3: rule__Music__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Music__Group_11_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalGuardin.g:1338:1: rule__Music__Group_11_2__0 : rule__Music__Group_11_2__0__Impl rule__Music__Group_11_2__1 ;
    public final void rule__Music__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1342:1: ( rule__Music__Group_11_2__0__Impl rule__Music__Group_11_2__1 )
            // InternalGuardin.g:1343:2: rule__Music__Group_11_2__0__Impl rule__Music__Group_11_2__1
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
    // InternalGuardin.g:1350:1: rule__Music__Group_11_2__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1354:1: ( ( '-' ) )
            // InternalGuardin.g:1355:1: ( '-' )
            {
            // InternalGuardin.g:1355:1: ( '-' )
            // InternalGuardin.g:1356:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGuardin.g:1365:1: rule__Music__Group_11_2__1 : rule__Music__Group_11_2__1__Impl ;
    public final void rule__Music__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1369:1: ( rule__Music__Group_11_2__1__Impl )
            // InternalGuardin.g:1370:2: rule__Music__Group_11_2__1__Impl
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
    // InternalGuardin.g:1376:1: rule__Music__Group_11_2__1__Impl : ( ( rule__Music__TracksAssignment_11_2_1 ) ) ;
    public final void rule__Music__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1380:1: ( ( ( rule__Music__TracksAssignment_11_2_1 ) ) )
            // InternalGuardin.g:1381:1: ( ( rule__Music__TracksAssignment_11_2_1 ) )
            {
            // InternalGuardin.g:1381:1: ( ( rule__Music__TracksAssignment_11_2_1 ) )
            // InternalGuardin.g:1382:2: ( rule__Music__TracksAssignment_11_2_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_11_2_1()); 
            // InternalGuardin.g:1383:2: ( rule__Music__TracksAssignment_11_2_1 )
            // InternalGuardin.g:1383:3: rule__Music__TracksAssignment_11_2_1
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
    // InternalGuardin.g:1392:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1396:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalGuardin.g:1397:2: rule__Section__Group__0__Impl rule__Section__Group__1
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
    // InternalGuardin.g:1404:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1408:1: ( ( () ) )
            // InternalGuardin.g:1409:1: ( () )
            {
            // InternalGuardin.g:1409:1: ( () )
            // InternalGuardin.g:1410:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalGuardin.g:1411:2: ()
            // InternalGuardin.g:1411:3: 
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
    // InternalGuardin.g:1419:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1423:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalGuardin.g:1424:2: rule__Section__Group__1__Impl rule__Section__Group__2
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
    // InternalGuardin.g:1431:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1435:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalGuardin.g:1436:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalGuardin.g:1436:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalGuardin.g:1437:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalGuardin.g:1438:2: ( rule__Section__NameAssignment_1 )
            // InternalGuardin.g:1438:3: rule__Section__NameAssignment_1
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
    // InternalGuardin.g:1446:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1450:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalGuardin.g:1451:2: rule__Section__Group__2__Impl rule__Section__Group__3
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
    // InternalGuardin.g:1458:1: rule__Section__Group__2__Impl : ( ':' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1462:1: ( ( ':' ) )
            // InternalGuardin.g:1463:1: ( ':' )
            {
            // InternalGuardin.g:1463:1: ( ':' )
            // InternalGuardin.g:1464:2: ':'
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
    // InternalGuardin.g:1473:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1477:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalGuardin.g:1478:2: rule__Section__Group__3__Impl rule__Section__Group__4
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
    // InternalGuardin.g:1485:1: rule__Section__Group__3__Impl : ( 'tempo=' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1489:1: ( ( 'tempo=' ) )
            // InternalGuardin.g:1490:1: ( 'tempo=' )
            {
            // InternalGuardin.g:1490:1: ( 'tempo=' )
            // InternalGuardin.g:1491:2: 'tempo='
            {
             before(grammarAccess.getSectionAccess().getTempoKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGuardin.g:1500:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1504:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalGuardin.g:1505:2: rule__Section__Group__4__Impl rule__Section__Group__5
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
    // InternalGuardin.g:1512:1: rule__Section__Group__4__Impl : ( ( rule__Section__TempoAssignment_4 ) ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1516:1: ( ( ( rule__Section__TempoAssignment_4 ) ) )
            // InternalGuardin.g:1517:1: ( ( rule__Section__TempoAssignment_4 ) )
            {
            // InternalGuardin.g:1517:1: ( ( rule__Section__TempoAssignment_4 ) )
            // InternalGuardin.g:1518:2: ( rule__Section__TempoAssignment_4 )
            {
             before(grammarAccess.getSectionAccess().getTempoAssignment_4()); 
            // InternalGuardin.g:1519:2: ( rule__Section__TempoAssignment_4 )
            // InternalGuardin.g:1519:3: rule__Section__TempoAssignment_4
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
    // InternalGuardin.g:1527:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1531:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalGuardin.g:1532:2: rule__Section__Group__5__Impl rule__Section__Group__6
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
    // InternalGuardin.g:1539:1: rule__Section__Group__5__Impl : ( 'signature=' ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1543:1: ( ( 'signature=' ) )
            // InternalGuardin.g:1544:1: ( 'signature=' )
            {
            // InternalGuardin.g:1544:1: ( 'signature=' )
            // InternalGuardin.g:1545:2: 'signature='
            {
             before(grammarAccess.getSectionAccess().getSignatureKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGuardin.g:1554:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1558:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalGuardin.g:1559:2: rule__Section__Group__6__Impl rule__Section__Group__7
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
    // InternalGuardin.g:1566:1: rule__Section__Group__6__Impl : ( ( rule__Section__SignatureAssignment_6 ) ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1570:1: ( ( ( rule__Section__SignatureAssignment_6 ) ) )
            // InternalGuardin.g:1571:1: ( ( rule__Section__SignatureAssignment_6 ) )
            {
            // InternalGuardin.g:1571:1: ( ( rule__Section__SignatureAssignment_6 ) )
            // InternalGuardin.g:1572:2: ( rule__Section__SignatureAssignment_6 )
            {
             before(grammarAccess.getSectionAccess().getSignatureAssignment_6()); 
            // InternalGuardin.g:1573:2: ( rule__Section__SignatureAssignment_6 )
            // InternalGuardin.g:1573:3: rule__Section__SignatureAssignment_6
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
    // InternalGuardin.g:1581:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1585:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalGuardin.g:1586:2: rule__Section__Group__7__Impl rule__Section__Group__8
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
    // InternalGuardin.g:1593:1: rule__Section__Group__7__Impl : ( 'bars=' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1597:1: ( ( 'bars=' ) )
            // InternalGuardin.g:1598:1: ( 'bars=' )
            {
            // InternalGuardin.g:1598:1: ( 'bars=' )
            // InternalGuardin.g:1599:2: 'bars='
            {
             before(grammarAccess.getSectionAccess().getBarsKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalGuardin.g:1608:1: rule__Section__Group__8 : rule__Section__Group__8__Impl ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1612:1: ( rule__Section__Group__8__Impl )
            // InternalGuardin.g:1613:2: rule__Section__Group__8__Impl
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
    // InternalGuardin.g:1619:1: rule__Section__Group__8__Impl : ( ( rule__Section__BarsAssignment_8 ) ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1623:1: ( ( ( rule__Section__BarsAssignment_8 ) ) )
            // InternalGuardin.g:1624:1: ( ( rule__Section__BarsAssignment_8 ) )
            {
            // InternalGuardin.g:1624:1: ( ( rule__Section__BarsAssignment_8 ) )
            // InternalGuardin.g:1625:2: ( rule__Section__BarsAssignment_8 )
            {
             before(grammarAccess.getSectionAccess().getBarsAssignment_8()); 
            // InternalGuardin.g:1626:2: ( rule__Section__BarsAssignment_8 )
            // InternalGuardin.g:1626:3: rule__Section__BarsAssignment_8
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
    // InternalGuardin.g:1635:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1639:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // InternalGuardin.g:1640:2: rule__Track__Group__0__Impl rule__Track__Group__1
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
    // InternalGuardin.g:1647:1: rule__Track__Group__0__Impl : ( () ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1651:1: ( ( () ) )
            // InternalGuardin.g:1652:1: ( () )
            {
            // InternalGuardin.g:1652:1: ( () )
            // InternalGuardin.g:1653:2: ()
            {
             before(grammarAccess.getTrackAccess().getTrackAction_0()); 
            // InternalGuardin.g:1654:2: ()
            // InternalGuardin.g:1654:3: 
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
    // InternalGuardin.g:1662:1: rule__Track__Group__1 : rule__Track__Group__1__Impl rule__Track__Group__2 ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1666:1: ( rule__Track__Group__1__Impl rule__Track__Group__2 )
            // InternalGuardin.g:1667:2: rule__Track__Group__1__Impl rule__Track__Group__2
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
    // InternalGuardin.g:1674:1: rule__Track__Group__1__Impl : ( ( rule__Track__Group_1__0 )? ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1678:1: ( ( ( rule__Track__Group_1__0 )? ) )
            // InternalGuardin.g:1679:1: ( ( rule__Track__Group_1__0 )? )
            {
            // InternalGuardin.g:1679:1: ( ( rule__Track__Group_1__0 )? )
            // InternalGuardin.g:1680:2: ( rule__Track__Group_1__0 )?
            {
             before(grammarAccess.getTrackAccess().getGroup_1()); 
            // InternalGuardin.g:1681:2: ( rule__Track__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGuardin.g:1681:3: rule__Track__Group_1__0
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
    // InternalGuardin.g:1689:1: rule__Track__Group__2 : rule__Track__Group__2__Impl ;
    public final void rule__Track__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1693:1: ( rule__Track__Group__2__Impl )
            // InternalGuardin.g:1694:2: rule__Track__Group__2__Impl
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
    // InternalGuardin.g:1700:1: rule__Track__Group__2__Impl : ( ( rule__Track__InstrumentAssignment_2 ) ) ;
    public final void rule__Track__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1704:1: ( ( ( rule__Track__InstrumentAssignment_2 ) ) )
            // InternalGuardin.g:1705:1: ( ( rule__Track__InstrumentAssignment_2 ) )
            {
            // InternalGuardin.g:1705:1: ( ( rule__Track__InstrumentAssignment_2 ) )
            // InternalGuardin.g:1706:2: ( rule__Track__InstrumentAssignment_2 )
            {
             before(grammarAccess.getTrackAccess().getInstrumentAssignment_2()); 
            // InternalGuardin.g:1707:2: ( rule__Track__InstrumentAssignment_2 )
            // InternalGuardin.g:1707:3: rule__Track__InstrumentAssignment_2
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
    // InternalGuardin.g:1716:1: rule__Track__Group_1__0 : rule__Track__Group_1__0__Impl rule__Track__Group_1__1 ;
    public final void rule__Track__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1720:1: ( rule__Track__Group_1__0__Impl rule__Track__Group_1__1 )
            // InternalGuardin.g:1721:2: rule__Track__Group_1__0__Impl rule__Track__Group_1__1
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
    // InternalGuardin.g:1728:1: rule__Track__Group_1__0__Impl : ( ( rule__Track__NameAssignment_1_0 ) ) ;
    public final void rule__Track__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1732:1: ( ( ( rule__Track__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:1733:1: ( ( rule__Track__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:1733:1: ( ( rule__Track__NameAssignment_1_0 ) )
            // InternalGuardin.g:1734:2: ( rule__Track__NameAssignment_1_0 )
            {
             before(grammarAccess.getTrackAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:1735:2: ( rule__Track__NameAssignment_1_0 )
            // InternalGuardin.g:1735:3: rule__Track__NameAssignment_1_0
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
    // InternalGuardin.g:1743:1: rule__Track__Group_1__1 : rule__Track__Group_1__1__Impl ;
    public final void rule__Track__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1747:1: ( rule__Track__Group_1__1__Impl )
            // InternalGuardin.g:1748:2: rule__Track__Group_1__1__Impl
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
    // InternalGuardin.g:1754:1: rule__Track__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Track__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1758:1: ( ( ':' ) )
            // InternalGuardin.g:1759:1: ( ':' )
            {
            // InternalGuardin.g:1759:1: ( ':' )
            // InternalGuardin.g:1760:2: ':'
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
    // InternalGuardin.g:1770:1: rule__EmptyNote__Group__0 : rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 ;
    public final void rule__EmptyNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1774:1: ( rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 )
            // InternalGuardin.g:1775:2: rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1
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
    // InternalGuardin.g:1782:1: rule__EmptyNote__Group__0__Impl : ( () ) ;
    public final void rule__EmptyNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1786:1: ( ( () ) )
            // InternalGuardin.g:1787:1: ( () )
            {
            // InternalGuardin.g:1787:1: ( () )
            // InternalGuardin.g:1788:2: ()
            {
             before(grammarAccess.getEmptyNoteAccess().getEmptyNoteAction_0()); 
            // InternalGuardin.g:1789:2: ()
            // InternalGuardin.g:1789:3: 
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
    // InternalGuardin.g:1797:1: rule__EmptyNote__Group__1 : rule__EmptyNote__Group__1__Impl ;
    public final void rule__EmptyNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1801:1: ( rule__EmptyNote__Group__1__Impl )
            // InternalGuardin.g:1802:2: rule__EmptyNote__Group__1__Impl
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
    // InternalGuardin.g:1808:1: rule__EmptyNote__Group__1__Impl : ( '$' ) ;
    public final void rule__EmptyNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1812:1: ( ( '$' ) )
            // InternalGuardin.g:1813:1: ( '$' )
            {
            // InternalGuardin.g:1813:1: ( '$' )
            // InternalGuardin.g:1814:2: '$'
            {
             before(grammarAccess.getEmptyNoteAccess().getDollarSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGuardin.g:1824:1: rule__Battery__Group__0 : rule__Battery__Group__0__Impl rule__Battery__Group__1 ;
    public final void rule__Battery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1828:1: ( rule__Battery__Group__0__Impl rule__Battery__Group__1 )
            // InternalGuardin.g:1829:2: rule__Battery__Group__0__Impl rule__Battery__Group__1
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
    // InternalGuardin.g:1836:1: rule__Battery__Group__0__Impl : ( () ) ;
    public final void rule__Battery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1840:1: ( ( () ) )
            // InternalGuardin.g:1841:1: ( () )
            {
            // InternalGuardin.g:1841:1: ( () )
            // InternalGuardin.g:1842:2: ()
            {
             before(grammarAccess.getBatteryAccess().getBatteryAction_0()); 
            // InternalGuardin.g:1843:2: ()
            // InternalGuardin.g:1843:3: 
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
    // InternalGuardin.g:1851:1: rule__Battery__Group__1 : rule__Battery__Group__1__Impl rule__Battery__Group__2 ;
    public final void rule__Battery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1855:1: ( rule__Battery__Group__1__Impl rule__Battery__Group__2 )
            // InternalGuardin.g:1856:2: rule__Battery__Group__1__Impl rule__Battery__Group__2
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
    // InternalGuardin.g:1863:1: rule__Battery__Group__1__Impl : ( 'battery' ) ;
    public final void rule__Battery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1867:1: ( ( 'battery' ) )
            // InternalGuardin.g:1868:1: ( 'battery' )
            {
            // InternalGuardin.g:1868:1: ( 'battery' )
            // InternalGuardin.g:1869:2: 'battery'
            {
             before(grammarAccess.getBatteryAccess().getBatteryKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGuardin.g:1878:1: rule__Battery__Group__2 : rule__Battery__Group__2__Impl rule__Battery__Group__3 ;
    public final void rule__Battery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1882:1: ( rule__Battery__Group__2__Impl rule__Battery__Group__3 )
            // InternalGuardin.g:1883:2: rule__Battery__Group__2__Impl rule__Battery__Group__3
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
    // InternalGuardin.g:1890:1: rule__Battery__Group__2__Impl : ( ( rule__Battery__Alternatives_2 ) ) ;
    public final void rule__Battery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1894:1: ( ( ( rule__Battery__Alternatives_2 ) ) )
            // InternalGuardin.g:1895:1: ( ( rule__Battery__Alternatives_2 ) )
            {
            // InternalGuardin.g:1895:1: ( ( rule__Battery__Alternatives_2 ) )
            // InternalGuardin.g:1896:2: ( rule__Battery__Alternatives_2 )
            {
             before(grammarAccess.getBatteryAccess().getAlternatives_2()); 
            // InternalGuardin.g:1897:2: ( rule__Battery__Alternatives_2 )
            // InternalGuardin.g:1897:3: rule__Battery__Alternatives_2
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
    // InternalGuardin.g:1905:1: rule__Battery__Group__3 : rule__Battery__Group__3__Impl ;
    public final void rule__Battery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1909:1: ( rule__Battery__Group__3__Impl )
            // InternalGuardin.g:1910:2: rule__Battery__Group__3__Impl
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
    // InternalGuardin.g:1916:1: rule__Battery__Group__3__Impl : ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) ) ;
    public final void rule__Battery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1920:1: ( ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) ) )
            // InternalGuardin.g:1921:1: ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) )
            {
            // InternalGuardin.g:1921:1: ( ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* ) )
            // InternalGuardin.g:1922:2: ( ( rule__Battery__Alternatives_3 ) ) ( ( rule__Battery__Alternatives_3 )* )
            {
            // InternalGuardin.g:1922:2: ( ( rule__Battery__Alternatives_3 ) )
            // InternalGuardin.g:1923:3: ( rule__Battery__Alternatives_3 )
            {
             before(grammarAccess.getBatteryAccess().getAlternatives_3()); 
            // InternalGuardin.g:1924:3: ( rule__Battery__Alternatives_3 )
            // InternalGuardin.g:1924:4: rule__Battery__Alternatives_3
            {
            pushFollow(FOLLOW_21);
            rule__Battery__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getAlternatives_3()); 

            }

            // InternalGuardin.g:1927:2: ( ( rule__Battery__Alternatives_3 )* )
            // InternalGuardin.g:1928:3: ( rule__Battery__Alternatives_3 )*
            {
             before(grammarAccess.getBatteryAccess().getAlternatives_3()); 
            // InternalGuardin.g:1929:3: ( rule__Battery__Alternatives_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36||LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGuardin.g:1929:4: rule__Battery__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Battery__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalGuardin.g:1939:1: rule__Battery__Group_2_1__0 : rule__Battery__Group_2_1__0__Impl rule__Battery__Group_2_1__1 ;
    public final void rule__Battery__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1943:1: ( rule__Battery__Group_2_1__0__Impl rule__Battery__Group_2_1__1 )
            // InternalGuardin.g:1944:2: rule__Battery__Group_2_1__0__Impl rule__Battery__Group_2_1__1
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
    // InternalGuardin.g:1951:1: rule__Battery__Group_2_1__0__Impl : ( ( rule__Battery__NameAssignment_2_1_0 ) ) ;
    public final void rule__Battery__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1955:1: ( ( ( rule__Battery__NameAssignment_2_1_0 ) ) )
            // InternalGuardin.g:1956:1: ( ( rule__Battery__NameAssignment_2_1_0 ) )
            {
            // InternalGuardin.g:1956:1: ( ( rule__Battery__NameAssignment_2_1_0 ) )
            // InternalGuardin.g:1957:2: ( rule__Battery__NameAssignment_2_1_0 )
            {
             before(grammarAccess.getBatteryAccess().getNameAssignment_2_1_0()); 
            // InternalGuardin.g:1958:2: ( rule__Battery__NameAssignment_2_1_0 )
            // InternalGuardin.g:1958:3: rule__Battery__NameAssignment_2_1_0
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
    // InternalGuardin.g:1966:1: rule__Battery__Group_2_1__1 : rule__Battery__Group_2_1__1__Impl ;
    public final void rule__Battery__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1970:1: ( rule__Battery__Group_2_1__1__Impl )
            // InternalGuardin.g:1971:2: rule__Battery__Group_2_1__1__Impl
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
    // InternalGuardin.g:1977:1: rule__Battery__Group_2_1__1__Impl : ( ':' ) ;
    public final void rule__Battery__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1981:1: ( ( ':' ) )
            // InternalGuardin.g:1982:1: ( ':' )
            {
            // InternalGuardin.g:1982:1: ( ':' )
            // InternalGuardin.g:1983:2: ':'
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
    // InternalGuardin.g:1993:1: rule__SectionBatteryLayer__Group__0 : rule__SectionBatteryLayer__Group__0__Impl rule__SectionBatteryLayer__Group__1 ;
    public final void rule__SectionBatteryLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1997:1: ( rule__SectionBatteryLayer__Group__0__Impl rule__SectionBatteryLayer__Group__1 )
            // InternalGuardin.g:1998:2: rule__SectionBatteryLayer__Group__0__Impl rule__SectionBatteryLayer__Group__1
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
    // InternalGuardin.g:2005:1: rule__SectionBatteryLayer__Group__0__Impl : ( () ) ;
    public final void rule__SectionBatteryLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2009:1: ( ( () ) )
            // InternalGuardin.g:2010:1: ( () )
            {
            // InternalGuardin.g:2010:1: ( () )
            // InternalGuardin.g:2011:2: ()
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getSectionLayerAction_0()); 
            // InternalGuardin.g:2012:2: ()
            // InternalGuardin.g:2012:3: 
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
    // InternalGuardin.g:2020:1: rule__SectionBatteryLayer__Group__1 : rule__SectionBatteryLayer__Group__1__Impl rule__SectionBatteryLayer__Group__2 ;
    public final void rule__SectionBatteryLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2024:1: ( rule__SectionBatteryLayer__Group__1__Impl rule__SectionBatteryLayer__Group__2 )
            // InternalGuardin.g:2025:2: rule__SectionBatteryLayer__Group__1__Impl rule__SectionBatteryLayer__Group__2
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
    // InternalGuardin.g:2032:1: rule__SectionBatteryLayer__Group__1__Impl : ( 'debut_section' ) ;
    public final void rule__SectionBatteryLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2036:1: ( ( 'debut_section' ) )
            // InternalGuardin.g:2037:1: ( 'debut_section' )
            {
            // InternalGuardin.g:2037:1: ( 'debut_section' )
            // InternalGuardin.g:2038:2: 'debut_section'
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getDebut_sectionKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSectionBatteryLayerAccess().getDebut_sectionKeyword_1()); 

            }


            }

        }
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
    // InternalGuardin.g:2047:1: rule__SectionBatteryLayer__Group__2 : rule__SectionBatteryLayer__Group__2__Impl rule__SectionBatteryLayer__Group__3 ;
    public final void rule__SectionBatteryLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2051:1: ( rule__SectionBatteryLayer__Group__2__Impl rule__SectionBatteryLayer__Group__3 )
            // InternalGuardin.g:2052:2: rule__SectionBatteryLayer__Group__2__Impl rule__SectionBatteryLayer__Group__3
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
    // InternalGuardin.g:2059:1: rule__SectionBatteryLayer__Group__2__Impl : ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) ) ;
    public final void rule__SectionBatteryLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2063:1: ( ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) ) )
            // InternalGuardin.g:2064:1: ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) )
            {
            // InternalGuardin.g:2064:1: ( ( rule__SectionBatteryLayer__SectionAssignment_2 ) )
            // InternalGuardin.g:2065:2: ( rule__SectionBatteryLayer__SectionAssignment_2 )
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getSectionAssignment_2()); 
            // InternalGuardin.g:2066:2: ( rule__SectionBatteryLayer__SectionAssignment_2 )
            // InternalGuardin.g:2066:3: rule__SectionBatteryLayer__SectionAssignment_2
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
    // InternalGuardin.g:2074:1: rule__SectionBatteryLayer__Group__3 : rule__SectionBatteryLayer__Group__3__Impl rule__SectionBatteryLayer__Group__4 ;
    public final void rule__SectionBatteryLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2078:1: ( rule__SectionBatteryLayer__Group__3__Impl rule__SectionBatteryLayer__Group__4 )
            // InternalGuardin.g:2079:2: rule__SectionBatteryLayer__Group__3__Impl rule__SectionBatteryLayer__Group__4
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
    // InternalGuardin.g:2086:1: rule__SectionBatteryLayer__Group__3__Impl : ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) ) ;
    public final void rule__SectionBatteryLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2090:1: ( ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) ) )
            // InternalGuardin.g:2091:1: ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) )
            {
            // InternalGuardin.g:2091:1: ( ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* ) )
            // InternalGuardin.g:2092:2: ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) ) ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* )
            {
            // InternalGuardin.g:2092:2: ( ( rule__SectionBatteryLayer__LayersAssignment_3 ) )
            // InternalGuardin.g:2093:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2094:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )
            // InternalGuardin.g:2094:4: rule__SectionBatteryLayer__LayersAssignment_3
            {
            pushFollow(FOLLOW_21);
            rule__SectionBatteryLayer__LayersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionBatteryLayerAccess().getLayersAssignment_3()); 

            }

            // InternalGuardin.g:2097:2: ( ( rule__SectionBatteryLayer__LayersAssignment_3 )* )
            // InternalGuardin.g:2098:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )*
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2099:3: ( rule__SectionBatteryLayer__LayersAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGuardin.g:2099:4: rule__SectionBatteryLayer__LayersAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SectionBatteryLayer__LayersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalGuardin.g:2108:1: rule__SectionBatteryLayer__Group__4 : rule__SectionBatteryLayer__Group__4__Impl ;
    public final void rule__SectionBatteryLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2112:1: ( rule__SectionBatteryLayer__Group__4__Impl )
            // InternalGuardin.g:2113:2: rule__SectionBatteryLayer__Group__4__Impl
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
    // InternalGuardin.g:2119:1: rule__SectionBatteryLayer__Group__4__Impl : ( 'fin_section' ) ;
    public final void rule__SectionBatteryLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2123:1: ( ( 'fin_section' ) )
            // InternalGuardin.g:2124:1: ( 'fin_section' )
            {
            // InternalGuardin.g:2124:1: ( 'fin_section' )
            // InternalGuardin.g:2125:2: 'fin_section'
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getFin_sectionKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSectionBatteryLayerAccess().getFin_sectionKeyword_4()); 

            }


            }

        }
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
    // InternalGuardin.g:2135:1: rule__BatteryLayer__Group__0 : rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1 ;
    public final void rule__BatteryLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2139:1: ( rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1 )
            // InternalGuardin.g:2140:2: rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1
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
    // InternalGuardin.g:2147:1: rule__BatteryLayer__Group__0__Impl : ( () ) ;
    public final void rule__BatteryLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2151:1: ( ( () ) )
            // InternalGuardin.g:2152:1: ( () )
            {
            // InternalGuardin.g:2152:1: ( () )
            // InternalGuardin.g:2153:2: ()
            {
             before(grammarAccess.getBatteryLayerAccess().getLayerAction_0()); 
            // InternalGuardin.g:2154:2: ()
            // InternalGuardin.g:2154:3: 
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
    // InternalGuardin.g:2162:1: rule__BatteryLayer__Group__1 : rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2 ;
    public final void rule__BatteryLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2166:1: ( rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2 )
            // InternalGuardin.g:2167:2: rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2
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
    // InternalGuardin.g:2174:1: rule__BatteryLayer__Group__1__Impl : ( 'layer:' ) ;
    public final void rule__BatteryLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2178:1: ( ( 'layer:' ) )
            // InternalGuardin.g:2179:1: ( 'layer:' )
            {
            // InternalGuardin.g:2179:1: ( 'layer:' )
            // InternalGuardin.g:2180:2: 'layer:'
            {
             before(grammarAccess.getBatteryLayerAccess().getLayerKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGuardin.g:2189:1: rule__BatteryLayer__Group__2 : rule__BatteryLayer__Group__2__Impl ;
    public final void rule__BatteryLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2193:1: ( rule__BatteryLayer__Group__2__Impl )
            // InternalGuardin.g:2194:2: rule__BatteryLayer__Group__2__Impl
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
    // InternalGuardin.g:2200:1: rule__BatteryLayer__Group__2__Impl : ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) ) ;
    public final void rule__BatteryLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2204:1: ( ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2205:1: ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2205:1: ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2206:2: ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2206:2: ( ( rule__BatteryLayer__NotesAssignment_2 ) )
            // InternalGuardin.g:2207:3: ( rule__BatteryLayer__NotesAssignment_2 )
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2208:3: ( rule__BatteryLayer__NotesAssignment_2 )
            // InternalGuardin.g:2208:4: rule__BatteryLayer__NotesAssignment_2
            {
            pushFollow(FOLLOW_25);
            rule__BatteryLayer__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2211:2: ( ( rule__BatteryLayer__NotesAssignment_2 )* )
            // InternalGuardin.g:2212:3: ( rule__BatteryLayer__NotesAssignment_2 )*
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2213:3: ( rule__BatteryLayer__NotesAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=12 && LA19_0<=17)||LA19_0==34||LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGuardin.g:2213:4: rule__BatteryLayer__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__BatteryLayer__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalGuardin.g:2223:1: rule__BatteryNote__Group__0 : rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 ;
    public final void rule__BatteryNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2227:1: ( rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 )
            // InternalGuardin.g:2228:2: rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1
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
    // InternalGuardin.g:2235:1: rule__BatteryNote__Group__0__Impl : ( () ) ;
    public final void rule__BatteryNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2239:1: ( ( () ) )
            // InternalGuardin.g:2240:1: ( () )
            {
            // InternalGuardin.g:2240:1: ( () )
            // InternalGuardin.g:2241:2: ()
            {
             before(grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0()); 
            // InternalGuardin.g:2242:2: ()
            // InternalGuardin.g:2242:3: 
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
    // InternalGuardin.g:2250:1: rule__BatteryNote__Group__1 : rule__BatteryNote__Group__1__Impl ;
    public final void rule__BatteryNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2254:1: ( rule__BatteryNote__Group__1__Impl )
            // InternalGuardin.g:2255:2: rule__BatteryNote__Group__1__Impl
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
    // InternalGuardin.g:2261:1: rule__BatteryNote__Group__1__Impl : ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) ;
    public final void rule__BatteryNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2265:1: ( ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) )
            // InternalGuardin.g:2266:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            {
            // InternalGuardin.g:2266:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            // InternalGuardin.g:2267:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            {
             before(grammarAccess.getBatteryNoteAccess().getNoteTypeAssignment_1()); 
            // InternalGuardin.g:2268:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            // InternalGuardin.g:2268:3: rule__BatteryNote__NoteTypeAssignment_1
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
    // InternalGuardin.g:2277:1: rule__CompositeBatteryNote__Group__0 : rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1 ;
    public final void rule__CompositeBatteryNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2281:1: ( rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1 )
            // InternalGuardin.g:2282:2: rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1
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
    // InternalGuardin.g:2289:1: rule__CompositeBatteryNote__Group__0__Impl : ( () ) ;
    public final void rule__CompositeBatteryNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2293:1: ( ( () ) )
            // InternalGuardin.g:2294:1: ( () )
            {
            // InternalGuardin.g:2294:1: ( () )
            // InternalGuardin.g:2295:2: ()
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getCompositeNoteAction_0()); 
            // InternalGuardin.g:2296:2: ()
            // InternalGuardin.g:2296:3: 
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
    // InternalGuardin.g:2304:1: rule__CompositeBatteryNote__Group__1 : rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2 ;
    public final void rule__CompositeBatteryNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2308:1: ( rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2 )
            // InternalGuardin.g:2309:2: rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2
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
    // InternalGuardin.g:2316:1: rule__CompositeBatteryNote__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositeBatteryNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2320:1: ( ( '(' ) )
            // InternalGuardin.g:2321:1: ( '(' )
            {
            // InternalGuardin.g:2321:1: ( '(' )
            // InternalGuardin.g:2322:2: '('
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGuardin.g:2331:1: rule__CompositeBatteryNote__Group__2 : rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3 ;
    public final void rule__CompositeBatteryNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2335:1: ( rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3 )
            // InternalGuardin.g:2336:2: rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3
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
    // InternalGuardin.g:2343:1: rule__CompositeBatteryNote__Group__2__Impl : ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) ) ;
    public final void rule__CompositeBatteryNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2347:1: ( ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2348:1: ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2348:1: ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2349:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2349:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) )
            // InternalGuardin.g:2350:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2351:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )
            // InternalGuardin.g:2351:4: rule__CompositeBatteryNote__NotesAssignment_2
            {
            pushFollow(FOLLOW_29);
            rule__CompositeBatteryNote__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2354:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* )
            // InternalGuardin.g:2355:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )*
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2356:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=12 && LA20_0<=17)||LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGuardin.g:2356:4: rule__CompositeBatteryNote__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__CompositeBatteryNote__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalGuardin.g:2365:1: rule__CompositeBatteryNote__Group__3 : rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4 ;
    public final void rule__CompositeBatteryNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2369:1: ( rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4 )
            // InternalGuardin.g:2370:2: rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4
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
    // InternalGuardin.g:2377:1: rule__CompositeBatteryNote__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositeBatteryNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2381:1: ( ( ')' ) )
            // InternalGuardin.g:2382:1: ( ')' )
            {
            // InternalGuardin.g:2382:1: ( ')' )
            // InternalGuardin.g:2383:2: ')'
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalGuardin.g:2392:1: rule__CompositeBatteryNote__Group__4 : rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5 ;
    public final void rule__CompositeBatteryNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2396:1: ( rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5 )
            // InternalGuardin.g:2397:2: rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5
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
    // InternalGuardin.g:2404:1: rule__CompositeBatteryNote__Group__4__Impl : ( 'x' ) ;
    public final void rule__CompositeBatteryNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2408:1: ( ( 'x' ) )
            // InternalGuardin.g:2409:1: ( 'x' )
            {
            // InternalGuardin.g:2409:1: ( 'x' )
            // InternalGuardin.g:2410:2: 'x'
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getXKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalGuardin.g:2419:1: rule__CompositeBatteryNote__Group__5 : rule__CompositeBatteryNote__Group__5__Impl ;
    public final void rule__CompositeBatteryNote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2423:1: ( rule__CompositeBatteryNote__Group__5__Impl )
            // InternalGuardin.g:2424:2: rule__CompositeBatteryNote__Group__5__Impl
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
    // InternalGuardin.g:2430:1: rule__CompositeBatteryNote__Group__5__Impl : ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) ) ;
    public final void rule__CompositeBatteryNote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2434:1: ( ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) ) )
            // InternalGuardin.g:2435:1: ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) )
            {
            // InternalGuardin.g:2435:1: ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) )
            // InternalGuardin.g:2436:2: ( rule__CompositeBatteryNote__RepeatsAssignment_5 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getRepeatsAssignment_5()); 
            // InternalGuardin.g:2437:2: ( rule__CompositeBatteryNote__RepeatsAssignment_5 )
            // InternalGuardin.g:2437:3: rule__CompositeBatteryNote__RepeatsAssignment_5
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
    // InternalGuardin.g:2446:1: rule__Piano__Group__0 : rule__Piano__Group__0__Impl rule__Piano__Group__1 ;
    public final void rule__Piano__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2450:1: ( rule__Piano__Group__0__Impl rule__Piano__Group__1 )
            // InternalGuardin.g:2451:2: rule__Piano__Group__0__Impl rule__Piano__Group__1
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
    // InternalGuardin.g:2458:1: rule__Piano__Group__0__Impl : ( () ) ;
    public final void rule__Piano__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2462:1: ( ( () ) )
            // InternalGuardin.g:2463:1: ( () )
            {
            // InternalGuardin.g:2463:1: ( () )
            // InternalGuardin.g:2464:2: ()
            {
             before(grammarAccess.getPianoAccess().getPianoAction_0()); 
            // InternalGuardin.g:2465:2: ()
            // InternalGuardin.g:2465:3: 
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
    // InternalGuardin.g:2473:1: rule__Piano__Group__1 : rule__Piano__Group__1__Impl rule__Piano__Group__2 ;
    public final void rule__Piano__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2477:1: ( rule__Piano__Group__1__Impl rule__Piano__Group__2 )
            // InternalGuardin.g:2478:2: rule__Piano__Group__1__Impl rule__Piano__Group__2
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
    // InternalGuardin.g:2485:1: rule__Piano__Group__1__Impl : ( 'piano' ) ;
    public final void rule__Piano__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2489:1: ( ( 'piano' ) )
            // InternalGuardin.g:2490:1: ( 'piano' )
            {
            // InternalGuardin.g:2490:1: ( 'piano' )
            // InternalGuardin.g:2491:2: 'piano'
            {
             before(grammarAccess.getPianoAccess().getPianoKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPianoAccess().getPianoKeyword_1()); 

            }


            }

        }
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
    // InternalGuardin.g:2500:1: rule__Piano__Group__2 : rule__Piano__Group__2__Impl rule__Piano__Group__3 ;
    public final void rule__Piano__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2504:1: ( rule__Piano__Group__2__Impl rule__Piano__Group__3 )
            // InternalGuardin.g:2505:2: rule__Piano__Group__2__Impl rule__Piano__Group__3
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
    // InternalGuardin.g:2512:1: rule__Piano__Group__2__Impl : ( ( rule__Piano__Alternatives_2 ) ) ;
    public final void rule__Piano__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2516:1: ( ( ( rule__Piano__Alternatives_2 ) ) )
            // InternalGuardin.g:2517:1: ( ( rule__Piano__Alternatives_2 ) )
            {
            // InternalGuardin.g:2517:1: ( ( rule__Piano__Alternatives_2 ) )
            // InternalGuardin.g:2518:2: ( rule__Piano__Alternatives_2 )
            {
             before(grammarAccess.getPianoAccess().getAlternatives_2()); 
            // InternalGuardin.g:2519:2: ( rule__Piano__Alternatives_2 )
            // InternalGuardin.g:2519:3: rule__Piano__Alternatives_2
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
    // InternalGuardin.g:2527:1: rule__Piano__Group__3 : rule__Piano__Group__3__Impl ;
    public final void rule__Piano__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2531:1: ( rule__Piano__Group__3__Impl )
            // InternalGuardin.g:2532:2: rule__Piano__Group__3__Impl
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
    // InternalGuardin.g:2538:1: rule__Piano__Group__3__Impl : ( ( ( rule__Piano__Alternatives_3 ) ) ( ( rule__Piano__Alternatives_3 )* ) ) ;
    public final void rule__Piano__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2542:1: ( ( ( ( rule__Piano__Alternatives_3 ) ) ( ( rule__Piano__Alternatives_3 )* ) ) )
            // InternalGuardin.g:2543:1: ( ( ( rule__Piano__Alternatives_3 ) ) ( ( rule__Piano__Alternatives_3 )* ) )
            {
            // InternalGuardin.g:2543:1: ( ( ( rule__Piano__Alternatives_3 ) ) ( ( rule__Piano__Alternatives_3 )* ) )
            // InternalGuardin.g:2544:2: ( ( rule__Piano__Alternatives_3 ) ) ( ( rule__Piano__Alternatives_3 )* )
            {
            // InternalGuardin.g:2544:2: ( ( rule__Piano__Alternatives_3 ) )
            // InternalGuardin.g:2545:3: ( rule__Piano__Alternatives_3 )
            {
             before(grammarAccess.getPianoAccess().getAlternatives_3()); 
            // InternalGuardin.g:2546:3: ( rule__Piano__Alternatives_3 )
            // InternalGuardin.g:2546:4: rule__Piano__Alternatives_3
            {
            pushFollow(FOLLOW_21);
            rule__Piano__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPianoAccess().getAlternatives_3()); 

            }

            // InternalGuardin.g:2549:2: ( ( rule__Piano__Alternatives_3 )* )
            // InternalGuardin.g:2550:3: ( rule__Piano__Alternatives_3 )*
            {
             before(grammarAccess.getPianoAccess().getAlternatives_3()); 
            // InternalGuardin.g:2551:3: ( rule__Piano__Alternatives_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36||LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGuardin.g:2551:4: rule__Piano__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Piano__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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


    // $ANTLR start "rule__Piano__Group_2_1__0"
    // InternalGuardin.g:2561:1: rule__Piano__Group_2_1__0 : rule__Piano__Group_2_1__0__Impl rule__Piano__Group_2_1__1 ;
    public final void rule__Piano__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2565:1: ( rule__Piano__Group_2_1__0__Impl rule__Piano__Group_2_1__1 )
            // InternalGuardin.g:2566:2: rule__Piano__Group_2_1__0__Impl rule__Piano__Group_2_1__1
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
    // InternalGuardin.g:2573:1: rule__Piano__Group_2_1__0__Impl : ( ( rule__Piano__NameAssignment_2_1_0 ) ) ;
    public final void rule__Piano__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2577:1: ( ( ( rule__Piano__NameAssignment_2_1_0 ) ) )
            // InternalGuardin.g:2578:1: ( ( rule__Piano__NameAssignment_2_1_0 ) )
            {
            // InternalGuardin.g:2578:1: ( ( rule__Piano__NameAssignment_2_1_0 ) )
            // InternalGuardin.g:2579:2: ( rule__Piano__NameAssignment_2_1_0 )
            {
             before(grammarAccess.getPianoAccess().getNameAssignment_2_1_0()); 
            // InternalGuardin.g:2580:2: ( rule__Piano__NameAssignment_2_1_0 )
            // InternalGuardin.g:2580:3: rule__Piano__NameAssignment_2_1_0
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
    // InternalGuardin.g:2588:1: rule__Piano__Group_2_1__1 : rule__Piano__Group_2_1__1__Impl ;
    public final void rule__Piano__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2592:1: ( rule__Piano__Group_2_1__1__Impl )
            // InternalGuardin.g:2593:2: rule__Piano__Group_2_1__1__Impl
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
    // InternalGuardin.g:2599:1: rule__Piano__Group_2_1__1__Impl : ( ':' ) ;
    public final void rule__Piano__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2603:1: ( ( ':' ) )
            // InternalGuardin.g:2604:1: ( ':' )
            {
            // InternalGuardin.g:2604:1: ( ':' )
            // InternalGuardin.g:2605:2: ':'
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
    // InternalGuardin.g:2615:1: rule__SectionPianoLayer__Group__0 : rule__SectionPianoLayer__Group__0__Impl rule__SectionPianoLayer__Group__1 ;
    public final void rule__SectionPianoLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2619:1: ( rule__SectionPianoLayer__Group__0__Impl rule__SectionPianoLayer__Group__1 )
            // InternalGuardin.g:2620:2: rule__SectionPianoLayer__Group__0__Impl rule__SectionPianoLayer__Group__1
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
    // InternalGuardin.g:2627:1: rule__SectionPianoLayer__Group__0__Impl : ( () ) ;
    public final void rule__SectionPianoLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2631:1: ( ( () ) )
            // InternalGuardin.g:2632:1: ( () )
            {
            // InternalGuardin.g:2632:1: ( () )
            // InternalGuardin.g:2633:2: ()
            {
             before(grammarAccess.getSectionPianoLayerAccess().getSectionLayerAction_0()); 
            // InternalGuardin.g:2634:2: ()
            // InternalGuardin.g:2634:3: 
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
    // InternalGuardin.g:2642:1: rule__SectionPianoLayer__Group__1 : rule__SectionPianoLayer__Group__1__Impl rule__SectionPianoLayer__Group__2 ;
    public final void rule__SectionPianoLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2646:1: ( rule__SectionPianoLayer__Group__1__Impl rule__SectionPianoLayer__Group__2 )
            // InternalGuardin.g:2647:2: rule__SectionPianoLayer__Group__1__Impl rule__SectionPianoLayer__Group__2
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
    // InternalGuardin.g:2654:1: rule__SectionPianoLayer__Group__1__Impl : ( 'debut_section' ) ;
    public final void rule__SectionPianoLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2658:1: ( ( 'debut_section' ) )
            // InternalGuardin.g:2659:1: ( 'debut_section' )
            {
            // InternalGuardin.g:2659:1: ( 'debut_section' )
            // InternalGuardin.g:2660:2: 'debut_section'
            {
             before(grammarAccess.getSectionPianoLayerAccess().getDebut_sectionKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSectionPianoLayerAccess().getDebut_sectionKeyword_1()); 

            }


            }

        }
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
    // InternalGuardin.g:2669:1: rule__SectionPianoLayer__Group__2 : rule__SectionPianoLayer__Group__2__Impl rule__SectionPianoLayer__Group__3 ;
    public final void rule__SectionPianoLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2673:1: ( rule__SectionPianoLayer__Group__2__Impl rule__SectionPianoLayer__Group__3 )
            // InternalGuardin.g:2674:2: rule__SectionPianoLayer__Group__2__Impl rule__SectionPianoLayer__Group__3
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
    // InternalGuardin.g:2681:1: rule__SectionPianoLayer__Group__2__Impl : ( ( rule__SectionPianoLayer__SectionAssignment_2 ) ) ;
    public final void rule__SectionPianoLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2685:1: ( ( ( rule__SectionPianoLayer__SectionAssignment_2 ) ) )
            // InternalGuardin.g:2686:1: ( ( rule__SectionPianoLayer__SectionAssignment_2 ) )
            {
            // InternalGuardin.g:2686:1: ( ( rule__SectionPianoLayer__SectionAssignment_2 ) )
            // InternalGuardin.g:2687:2: ( rule__SectionPianoLayer__SectionAssignment_2 )
            {
             before(grammarAccess.getSectionPianoLayerAccess().getSectionAssignment_2()); 
            // InternalGuardin.g:2688:2: ( rule__SectionPianoLayer__SectionAssignment_2 )
            // InternalGuardin.g:2688:3: rule__SectionPianoLayer__SectionAssignment_2
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
    // InternalGuardin.g:2696:1: rule__SectionPianoLayer__Group__3 : rule__SectionPianoLayer__Group__3__Impl rule__SectionPianoLayer__Group__4 ;
    public final void rule__SectionPianoLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2700:1: ( rule__SectionPianoLayer__Group__3__Impl rule__SectionPianoLayer__Group__4 )
            // InternalGuardin.g:2701:2: rule__SectionPianoLayer__Group__3__Impl rule__SectionPianoLayer__Group__4
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
    // InternalGuardin.g:2708:1: rule__SectionPianoLayer__Group__3__Impl : ( ( ( rule__SectionPianoLayer__LayersAssignment_3 ) ) ( ( rule__SectionPianoLayer__LayersAssignment_3 )* ) ) ;
    public final void rule__SectionPianoLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2712:1: ( ( ( ( rule__SectionPianoLayer__LayersAssignment_3 ) ) ( ( rule__SectionPianoLayer__LayersAssignment_3 )* ) ) )
            // InternalGuardin.g:2713:1: ( ( ( rule__SectionPianoLayer__LayersAssignment_3 ) ) ( ( rule__SectionPianoLayer__LayersAssignment_3 )* ) )
            {
            // InternalGuardin.g:2713:1: ( ( ( rule__SectionPianoLayer__LayersAssignment_3 ) ) ( ( rule__SectionPianoLayer__LayersAssignment_3 )* ) )
            // InternalGuardin.g:2714:2: ( ( rule__SectionPianoLayer__LayersAssignment_3 ) ) ( ( rule__SectionPianoLayer__LayersAssignment_3 )* )
            {
            // InternalGuardin.g:2714:2: ( ( rule__SectionPianoLayer__LayersAssignment_3 ) )
            // InternalGuardin.g:2715:3: ( rule__SectionPianoLayer__LayersAssignment_3 )
            {
             before(grammarAccess.getSectionPianoLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2716:3: ( rule__SectionPianoLayer__LayersAssignment_3 )
            // InternalGuardin.g:2716:4: rule__SectionPianoLayer__LayersAssignment_3
            {
            pushFollow(FOLLOW_21);
            rule__SectionPianoLayer__LayersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionPianoLayerAccess().getLayersAssignment_3()); 

            }

            // InternalGuardin.g:2719:2: ( ( rule__SectionPianoLayer__LayersAssignment_3 )* )
            // InternalGuardin.g:2720:3: ( rule__SectionPianoLayer__LayersAssignment_3 )*
            {
             before(grammarAccess.getSectionPianoLayerAccess().getLayersAssignment_3()); 
            // InternalGuardin.g:2721:3: ( rule__SectionPianoLayer__LayersAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGuardin.g:2721:4: rule__SectionPianoLayer__LayersAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SectionPianoLayer__LayersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalGuardin.g:2730:1: rule__SectionPianoLayer__Group__4 : rule__SectionPianoLayer__Group__4__Impl ;
    public final void rule__SectionPianoLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2734:1: ( rule__SectionPianoLayer__Group__4__Impl )
            // InternalGuardin.g:2735:2: rule__SectionPianoLayer__Group__4__Impl
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
    // InternalGuardin.g:2741:1: rule__SectionPianoLayer__Group__4__Impl : ( 'fin_section' ) ;
    public final void rule__SectionPianoLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2745:1: ( ( 'fin_section' ) )
            // InternalGuardin.g:2746:1: ( 'fin_section' )
            {
            // InternalGuardin.g:2746:1: ( 'fin_section' )
            // InternalGuardin.g:2747:2: 'fin_section'
            {
             before(grammarAccess.getSectionPianoLayerAccess().getFin_sectionKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSectionPianoLayerAccess().getFin_sectionKeyword_4()); 

            }


            }

        }
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
    // InternalGuardin.g:2757:1: rule__PianoLayer__Group__0 : rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1 ;
    public final void rule__PianoLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2761:1: ( rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1 )
            // InternalGuardin.g:2762:2: rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1
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
    // InternalGuardin.g:2769:1: rule__PianoLayer__Group__0__Impl : ( () ) ;
    public final void rule__PianoLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2773:1: ( ( () ) )
            // InternalGuardin.g:2774:1: ( () )
            {
            // InternalGuardin.g:2774:1: ( () )
            // InternalGuardin.g:2775:2: ()
            {
             before(grammarAccess.getPianoLayerAccess().getLayerAction_0()); 
            // InternalGuardin.g:2776:2: ()
            // InternalGuardin.g:2776:3: 
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
    // InternalGuardin.g:2784:1: rule__PianoLayer__Group__1 : rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2 ;
    public final void rule__PianoLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2788:1: ( rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2 )
            // InternalGuardin.g:2789:2: rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2
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
    // InternalGuardin.g:2796:1: rule__PianoLayer__Group__1__Impl : ( 'layer:' ) ;
    public final void rule__PianoLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2800:1: ( ( 'layer:' ) )
            // InternalGuardin.g:2801:1: ( 'layer:' )
            {
            // InternalGuardin.g:2801:1: ( 'layer:' )
            // InternalGuardin.g:2802:2: 'layer:'
            {
             before(grammarAccess.getPianoLayerAccess().getLayerKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGuardin.g:2811:1: rule__PianoLayer__Group__2 : rule__PianoLayer__Group__2__Impl ;
    public final void rule__PianoLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2815:1: ( rule__PianoLayer__Group__2__Impl )
            // InternalGuardin.g:2816:2: rule__PianoLayer__Group__2__Impl
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
    // InternalGuardin.g:2822:1: rule__PianoLayer__Group__2__Impl : ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) ) ;
    public final void rule__PianoLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2826:1: ( ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2827:1: ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2827:1: ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2828:2: ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2828:2: ( ( rule__PianoLayer__NotesAssignment_2 ) )
            // InternalGuardin.g:2829:3: ( rule__PianoLayer__NotesAssignment_2 )
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2830:3: ( rule__PianoLayer__NotesAssignment_2 )
            // InternalGuardin.g:2830:4: rule__PianoLayer__NotesAssignment_2
            {
            pushFollow(FOLLOW_32);
            rule__PianoLayer__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2833:2: ( ( rule__PianoLayer__NotesAssignment_2 )* )
            // InternalGuardin.g:2834:3: ( rule__PianoLayer__NotesAssignment_2 )*
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2835:3: ( rule__PianoLayer__NotesAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=18 && LA23_0<=24)||LA23_0==34||LA23_0==39) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGuardin.g:2835:4: rule__PianoLayer__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__PianoLayer__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalGuardin.g:2845:1: rule__PianoNote__Group__0 : rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1 ;
    public final void rule__PianoNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2849:1: ( rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1 )
            // InternalGuardin.g:2850:2: rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1
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
    // InternalGuardin.g:2857:1: rule__PianoNote__Group__0__Impl : ( () ) ;
    public final void rule__PianoNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2861:1: ( ( () ) )
            // InternalGuardin.g:2862:1: ( () )
            {
            // InternalGuardin.g:2862:1: ( () )
            // InternalGuardin.g:2863:2: ()
            {
             before(grammarAccess.getPianoNoteAccess().getPianoNoteAction_0()); 
            // InternalGuardin.g:2864:2: ()
            // InternalGuardin.g:2864:3: 
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
    // InternalGuardin.g:2872:1: rule__PianoNote__Group__1 : rule__PianoNote__Group__1__Impl rule__PianoNote__Group__2 ;
    public final void rule__PianoNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2876:1: ( rule__PianoNote__Group__1__Impl rule__PianoNote__Group__2 )
            // InternalGuardin.g:2877:2: rule__PianoNote__Group__1__Impl rule__PianoNote__Group__2
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
    // InternalGuardin.g:2884:1: rule__PianoNote__Group__1__Impl : ( ( rule__PianoNote__NoteTypeAssignment_1 ) ) ;
    public final void rule__PianoNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2888:1: ( ( ( rule__PianoNote__NoteTypeAssignment_1 ) ) )
            // InternalGuardin.g:2889:1: ( ( rule__PianoNote__NoteTypeAssignment_1 ) )
            {
            // InternalGuardin.g:2889:1: ( ( rule__PianoNote__NoteTypeAssignment_1 ) )
            // InternalGuardin.g:2890:2: ( rule__PianoNote__NoteTypeAssignment_1 )
            {
             before(grammarAccess.getPianoNoteAccess().getNoteTypeAssignment_1()); 
            // InternalGuardin.g:2891:2: ( rule__PianoNote__NoteTypeAssignment_1 )
            // InternalGuardin.g:2891:3: rule__PianoNote__NoteTypeAssignment_1
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
    // InternalGuardin.g:2899:1: rule__PianoNote__Group__2 : rule__PianoNote__Group__2__Impl ;
    public final void rule__PianoNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2903:1: ( rule__PianoNote__Group__2__Impl )
            // InternalGuardin.g:2904:2: rule__PianoNote__Group__2__Impl
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
    // InternalGuardin.g:2910:1: rule__PianoNote__Group__2__Impl : ( ( rule__PianoNote__Group_2__0 )? ) ;
    public final void rule__PianoNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2914:1: ( ( ( rule__PianoNote__Group_2__0 )? ) )
            // InternalGuardin.g:2915:1: ( ( rule__PianoNote__Group_2__0 )? )
            {
            // InternalGuardin.g:2915:1: ( ( rule__PianoNote__Group_2__0 )? )
            // InternalGuardin.g:2916:2: ( rule__PianoNote__Group_2__0 )?
            {
             before(grammarAccess.getPianoNoteAccess().getGroup_2()); 
            // InternalGuardin.g:2917:2: ( rule__PianoNote__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGuardin.g:2917:3: rule__PianoNote__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PianoNote__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPianoNoteAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__PianoNote__Group_2__0"
    // InternalGuardin.g:2926:1: rule__PianoNote__Group_2__0 : rule__PianoNote__Group_2__0__Impl rule__PianoNote__Group_2__1 ;
    public final void rule__PianoNote__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2930:1: ( rule__PianoNote__Group_2__0__Impl rule__PianoNote__Group_2__1 )
            // InternalGuardin.g:2931:2: rule__PianoNote__Group_2__0__Impl rule__PianoNote__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__PianoNote__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PianoNote__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2__0"


    // $ANTLR start "rule__PianoNote__Group_2__0__Impl"
    // InternalGuardin.g:2938:1: rule__PianoNote__Group_2__0__Impl : ( '/' ) ;
    public final void rule__PianoNote__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2942:1: ( ( '/' ) )
            // InternalGuardin.g:2943:1: ( '/' )
            {
            // InternalGuardin.g:2943:1: ( '/' )
            // InternalGuardin.g:2944:2: '/'
            {
             before(grammarAccess.getPianoNoteAccess().getSolidusKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPianoNoteAccess().getSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2__0__Impl"


    // $ANTLR start "rule__PianoNote__Group_2__1"
    // InternalGuardin.g:2953:1: rule__PianoNote__Group_2__1 : rule__PianoNote__Group_2__1__Impl ;
    public final void rule__PianoNote__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2957:1: ( rule__PianoNote__Group_2__1__Impl )
            // InternalGuardin.g:2958:2: rule__PianoNote__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PianoNote__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2__1"


    // $ANTLR start "rule__PianoNote__Group_2__1__Impl"
    // InternalGuardin.g:2964:1: rule__PianoNote__Group_2__1__Impl : ( ( rule__PianoNote__OctaveOffsetAssignment_2_1 ) ) ;
    public final void rule__PianoNote__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2968:1: ( ( ( rule__PianoNote__OctaveOffsetAssignment_2_1 ) ) )
            // InternalGuardin.g:2969:1: ( ( rule__PianoNote__OctaveOffsetAssignment_2_1 ) )
            {
            // InternalGuardin.g:2969:1: ( ( rule__PianoNote__OctaveOffsetAssignment_2_1 ) )
            // InternalGuardin.g:2970:2: ( rule__PianoNote__OctaveOffsetAssignment_2_1 )
            {
             before(grammarAccess.getPianoNoteAccess().getOctaveOffsetAssignment_2_1()); 
            // InternalGuardin.g:2971:2: ( rule__PianoNote__OctaveOffsetAssignment_2_1 )
            // InternalGuardin.g:2971:3: rule__PianoNote__OctaveOffsetAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PianoNote__OctaveOffsetAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPianoNoteAccess().getOctaveOffsetAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__Group_2__1__Impl"


    // $ANTLR start "rule__CompositePianoNote__Group__0"
    // InternalGuardin.g:2980:1: rule__CompositePianoNote__Group__0 : rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1 ;
    public final void rule__CompositePianoNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2984:1: ( rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1 )
            // InternalGuardin.g:2985:2: rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1
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
    // InternalGuardin.g:2992:1: rule__CompositePianoNote__Group__0__Impl : ( () ) ;
    public final void rule__CompositePianoNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2996:1: ( ( () ) )
            // InternalGuardin.g:2997:1: ( () )
            {
            // InternalGuardin.g:2997:1: ( () )
            // InternalGuardin.g:2998:2: ()
            {
             before(grammarAccess.getCompositePianoNoteAccess().getCompositeNoteAction_0()); 
            // InternalGuardin.g:2999:2: ()
            // InternalGuardin.g:2999:3: 
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
    // InternalGuardin.g:3007:1: rule__CompositePianoNote__Group__1 : rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2 ;
    public final void rule__CompositePianoNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3011:1: ( rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2 )
            // InternalGuardin.g:3012:2: rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2
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
    // InternalGuardin.g:3019:1: rule__CompositePianoNote__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositePianoNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3023:1: ( ( '(' ) )
            // InternalGuardin.g:3024:1: ( '(' )
            {
            // InternalGuardin.g:3024:1: ( '(' )
            // InternalGuardin.g:3025:2: '('
            {
             before(grammarAccess.getCompositePianoNoteAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGuardin.g:3034:1: rule__CompositePianoNote__Group__2 : rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3 ;
    public final void rule__CompositePianoNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3038:1: ( rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3 )
            // InternalGuardin.g:3039:2: rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3
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
    // InternalGuardin.g:3046:1: rule__CompositePianoNote__Group__2__Impl : ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) ) ;
    public final void rule__CompositePianoNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3050:1: ( ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:3051:1: ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:3051:1: ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) )
            // InternalGuardin.g:3052:2: ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:3052:2: ( ( rule__CompositePianoNote__NotesAssignment_2 ) )
            // InternalGuardin.g:3053:3: ( rule__CompositePianoNote__NotesAssignment_2 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:3054:3: ( rule__CompositePianoNote__NotesAssignment_2 )
            // InternalGuardin.g:3054:4: rule__CompositePianoNote__NotesAssignment_2
            {
            pushFollow(FOLLOW_37);
            rule__CompositePianoNote__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:3057:2: ( ( rule__CompositePianoNote__NotesAssignment_2 )* )
            // InternalGuardin.g:3058:3: ( rule__CompositePianoNote__NotesAssignment_2 )*
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:3059:3: ( rule__CompositePianoNote__NotesAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=18 && LA25_0<=24)||LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGuardin.g:3059:4: rule__CompositePianoNote__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__CompositePianoNote__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalGuardin.g:3068:1: rule__CompositePianoNote__Group__3 : rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4 ;
    public final void rule__CompositePianoNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3072:1: ( rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4 )
            // InternalGuardin.g:3073:2: rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4
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
    // InternalGuardin.g:3080:1: rule__CompositePianoNote__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositePianoNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3084:1: ( ( ')' ) )
            // InternalGuardin.g:3085:1: ( ')' )
            {
            // InternalGuardin.g:3085:1: ( ')' )
            // InternalGuardin.g:3086:2: ')'
            {
             before(grammarAccess.getCompositePianoNoteAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalGuardin.g:3095:1: rule__CompositePianoNote__Group__4 : rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5 ;
    public final void rule__CompositePianoNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3099:1: ( rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5 )
            // InternalGuardin.g:3100:2: rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5
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
    // InternalGuardin.g:3107:1: rule__CompositePianoNote__Group__4__Impl : ( 'x' ) ;
    public final void rule__CompositePianoNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3111:1: ( ( 'x' ) )
            // InternalGuardin.g:3112:1: ( 'x' )
            {
            // InternalGuardin.g:3112:1: ( 'x' )
            // InternalGuardin.g:3113:2: 'x'
            {
             before(grammarAccess.getCompositePianoNoteAccess().getXKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalGuardin.g:3122:1: rule__CompositePianoNote__Group__5 : rule__CompositePianoNote__Group__5__Impl ;
    public final void rule__CompositePianoNote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3126:1: ( rule__CompositePianoNote__Group__5__Impl )
            // InternalGuardin.g:3127:2: rule__CompositePianoNote__Group__5__Impl
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
    // InternalGuardin.g:3133:1: rule__CompositePianoNote__Group__5__Impl : ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) ) ;
    public final void rule__CompositePianoNote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3137:1: ( ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) ) )
            // InternalGuardin.g:3138:1: ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) )
            {
            // InternalGuardin.g:3138:1: ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) )
            // InternalGuardin.g:3139:2: ( rule__CompositePianoNote__RepeatsAssignment_5 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getRepeatsAssignment_5()); 
            // InternalGuardin.g:3140:2: ( rule__CompositePianoNote__RepeatsAssignment_5 )
            // InternalGuardin.g:3140:3: rule__CompositePianoNote__RepeatsAssignment_5
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
    // InternalGuardin.g:3149:1: rule__ERelativeInt__Group__0 : rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1 ;
    public final void rule__ERelativeInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3153:1: ( rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1 )
            // InternalGuardin.g:3154:2: rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1
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
    // InternalGuardin.g:3161:1: rule__ERelativeInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ERelativeInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3165:1: ( ( ( '-' )? ) )
            // InternalGuardin.g:3166:1: ( ( '-' )? )
            {
            // InternalGuardin.g:3166:1: ( ( '-' )? )
            // InternalGuardin.g:3167:2: ( '-' )?
            {
             before(grammarAccess.getERelativeIntAccess().getHyphenMinusKeyword_0()); 
            // InternalGuardin.g:3168:2: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGuardin.g:3168:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalGuardin.g:3176:1: rule__ERelativeInt__Group__1 : rule__ERelativeInt__Group__1__Impl ;
    public final void rule__ERelativeInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3180:1: ( rule__ERelativeInt__Group__1__Impl )
            // InternalGuardin.g:3181:2: rule__ERelativeInt__Group__1__Impl
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
    // InternalGuardin.g:3187:1: rule__ERelativeInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ERelativeInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3191:1: ( ( RULE_INT ) )
            // InternalGuardin.g:3192:1: ( RULE_INT )
            {
            // InternalGuardin.g:3192:1: ( RULE_INT )
            // InternalGuardin.g:3193:2: RULE_INT
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
    // InternalGuardin.g:3203:1: rule__Music__SoundBankPathAssignment_1_2 : ( ruleEString ) ;
    public final void rule__Music__SoundBankPathAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3207:1: ( ( ruleEString ) )
            // InternalGuardin.g:3208:2: ( ruleEString )
            {
            // InternalGuardin.g:3208:2: ( ruleEString )
            // InternalGuardin.g:3209:3: ruleEString
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
    // InternalGuardin.g:3218:1: rule__Music__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Music__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3222:1: ( ( ruleEString ) )
            // InternalGuardin.g:3223:2: ( ruleEString )
            {
            // InternalGuardin.g:3223:2: ( ruleEString )
            // InternalGuardin.g:3224:3: ruleEString
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
    // InternalGuardin.g:3233:1: rule__Music__SectionsAssignment_7 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3237:1: ( ( ruleSection ) )
            // InternalGuardin.g:3238:2: ( ruleSection )
            {
            // InternalGuardin.g:3238:2: ( ruleSection )
            // InternalGuardin.g:3239:3: ruleSection
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
    // InternalGuardin.g:3248:1: rule__Music__SectionsAssignment_8 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3252:1: ( ( ruleSection ) )
            // InternalGuardin.g:3253:2: ( ruleSection )
            {
            // InternalGuardin.g:3253:2: ( ruleSection )
            // InternalGuardin.g:3254:3: ruleSection
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
    // InternalGuardin.g:3263:1: rule__Music__TracksAssignment_11_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3267:1: ( ( ruleTrack ) )
            // InternalGuardin.g:3268:2: ( ruleTrack )
            {
            // InternalGuardin.g:3268:2: ( ruleTrack )
            // InternalGuardin.g:3269:3: ruleTrack
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
    // InternalGuardin.g:3278:1: rule__Music__TracksAssignment_11_2_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3282:1: ( ( ruleTrack ) )
            // InternalGuardin.g:3283:2: ( ruleTrack )
            {
            // InternalGuardin.g:3283:2: ( ruleTrack )
            // InternalGuardin.g:3284:3: ruleTrack
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
    // InternalGuardin.g:3293:1: rule__Section__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3297:1: ( ( ruleEString ) )
            // InternalGuardin.g:3298:2: ( ruleEString )
            {
            // InternalGuardin.g:3298:2: ( ruleEString )
            // InternalGuardin.g:3299:3: ruleEString
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
    // InternalGuardin.g:3308:1: rule__Section__TempoAssignment_4 : ( ruleEInt ) ;
    public final void rule__Section__TempoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3312:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3313:2: ( ruleEInt )
            {
            // InternalGuardin.g:3313:2: ( ruleEInt )
            // InternalGuardin.g:3314:3: ruleEInt
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
    // InternalGuardin.g:3323:1: rule__Section__SignatureAssignment_6 : ( ruleEInt ) ;
    public final void rule__Section__SignatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3327:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3328:2: ( ruleEInt )
            {
            // InternalGuardin.g:3328:2: ( ruleEInt )
            // InternalGuardin.g:3329:3: ruleEInt
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
    // InternalGuardin.g:3338:1: rule__Section__BarsAssignment_8 : ( ruleEInt ) ;
    public final void rule__Section__BarsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3342:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3343:2: ( ruleEInt )
            {
            // InternalGuardin.g:3343:2: ( ruleEInt )
            // InternalGuardin.g:3344:3: ruleEInt
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
    // InternalGuardin.g:3353:1: rule__Track__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Track__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3357:1: ( ( ruleEString ) )
            // InternalGuardin.g:3358:2: ( ruleEString )
            {
            // InternalGuardin.g:3358:2: ( ruleEString )
            // InternalGuardin.g:3359:3: ruleEString
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
    // InternalGuardin.g:3368:1: rule__Track__InstrumentAssignment_2 : ( ruleInstrument ) ;
    public final void rule__Track__InstrumentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3372:1: ( ( ruleInstrument ) )
            // InternalGuardin.g:3373:2: ( ruleInstrument )
            {
            // InternalGuardin.g:3373:2: ( ruleInstrument )
            // InternalGuardin.g:3374:3: ruleInstrument
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
    // InternalGuardin.g:3383:1: rule__Battery__NameAssignment_2_1_0 : ( ruleEString ) ;
    public final void rule__Battery__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3387:1: ( ( ruleEString ) )
            // InternalGuardin.g:3388:2: ( ruleEString )
            {
            // InternalGuardin.g:3388:2: ( ruleEString )
            // InternalGuardin.g:3389:3: ruleEString
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
    // InternalGuardin.g:3398:1: rule__Battery__SectionsAssignment_3_0 : ( ruleSectionBatteryLayer ) ;
    public final void rule__Battery__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3402:1: ( ( ruleSectionBatteryLayer ) )
            // InternalGuardin.g:3403:2: ( ruleSectionBatteryLayer )
            {
            // InternalGuardin.g:3403:2: ( ruleSectionBatteryLayer )
            // InternalGuardin.g:3404:3: ruleSectionBatteryLayer
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
    // InternalGuardin.g:3413:1: rule__Battery__LayersAssignment_3_1 : ( ruleBatteryLayer ) ;
    public final void rule__Battery__LayersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3417:1: ( ( ruleBatteryLayer ) )
            // InternalGuardin.g:3418:2: ( ruleBatteryLayer )
            {
            // InternalGuardin.g:3418:2: ( ruleBatteryLayer )
            // InternalGuardin.g:3419:3: ruleBatteryLayer
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
    // InternalGuardin.g:3428:1: rule__SectionBatteryLayer__SectionAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__SectionBatteryLayer__SectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3432:1: ( ( ( ruleEString ) ) )
            // InternalGuardin.g:3433:2: ( ( ruleEString ) )
            {
            // InternalGuardin.g:3433:2: ( ( ruleEString ) )
            // InternalGuardin.g:3434:3: ( ruleEString )
            {
             before(grammarAccess.getSectionBatteryLayerAccess().getSectionSectionCrossReference_2_0()); 
            // InternalGuardin.g:3435:3: ( ruleEString )
            // InternalGuardin.g:3436:4: ruleEString
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
    // InternalGuardin.g:3447:1: rule__SectionBatteryLayer__LayersAssignment_3 : ( ruleBatteryLayer ) ;
    public final void rule__SectionBatteryLayer__LayersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3451:1: ( ( ruleBatteryLayer ) )
            // InternalGuardin.g:3452:2: ( ruleBatteryLayer )
            {
            // InternalGuardin.g:3452:2: ( ruleBatteryLayer )
            // InternalGuardin.g:3453:3: ruleBatteryLayer
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
    // InternalGuardin.g:3462:1: rule__BatteryLayer__NotesAssignment_2 : ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) ) ;
    public final void rule__BatteryLayer__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3466:1: ( ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3467:2: ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3467:2: ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3468:3: ( rule__BatteryLayer__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3469:3: ( rule__BatteryLayer__NotesAlternatives_2_0 )
            // InternalGuardin.g:3469:4: rule__BatteryLayer__NotesAlternatives_2_0
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
    // InternalGuardin.g:3477:1: rule__BatteryNote__NoteTypeAssignment_1 : ( ruleBatteryNoteType ) ;
    public final void rule__BatteryNote__NoteTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3481:1: ( ( ruleBatteryNoteType ) )
            // InternalGuardin.g:3482:2: ( ruleBatteryNoteType )
            {
            // InternalGuardin.g:3482:2: ( ruleBatteryNoteType )
            // InternalGuardin.g:3483:3: ruleBatteryNoteType
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
    // InternalGuardin.g:3492:1: rule__CompositeBatteryNote__NotesAssignment_2 : ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) ) ;
    public final void rule__CompositeBatteryNote__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3496:1: ( ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3497:2: ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3497:2: ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3498:3: ( rule__CompositeBatteryNote__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3499:3: ( rule__CompositeBatteryNote__NotesAlternatives_2_0 )
            // InternalGuardin.g:3499:4: rule__CompositeBatteryNote__NotesAlternatives_2_0
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
    // InternalGuardin.g:3507:1: rule__CompositeBatteryNote__RepeatsAssignment_5 : ( ruleEInt ) ;
    public final void rule__CompositeBatteryNote__RepeatsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3511:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3512:2: ( ruleEInt )
            {
            // InternalGuardin.g:3512:2: ( ruleEInt )
            // InternalGuardin.g:3513:3: ruleEInt
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


    // $ANTLR start "rule__Piano__NameAssignment_2_1_0"
    // InternalGuardin.g:3522:1: rule__Piano__NameAssignment_2_1_0 : ( ruleEString ) ;
    public final void rule__Piano__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3526:1: ( ( ruleEString ) )
            // InternalGuardin.g:3527:2: ( ruleEString )
            {
            // InternalGuardin.g:3527:2: ( ruleEString )
            // InternalGuardin.g:3528:3: ruleEString
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
    // InternalGuardin.g:3537:1: rule__Piano__SectionsAssignment_3_0 : ( ruleSectionPianoLayer ) ;
    public final void rule__Piano__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3541:1: ( ( ruleSectionPianoLayer ) )
            // InternalGuardin.g:3542:2: ( ruleSectionPianoLayer )
            {
            // InternalGuardin.g:3542:2: ( ruleSectionPianoLayer )
            // InternalGuardin.g:3543:3: ruleSectionPianoLayer
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
    // InternalGuardin.g:3552:1: rule__Piano__LayersAssignment_3_1 : ( rulePianoLayer ) ;
    public final void rule__Piano__LayersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3556:1: ( ( rulePianoLayer ) )
            // InternalGuardin.g:3557:2: ( rulePianoLayer )
            {
            // InternalGuardin.g:3557:2: ( rulePianoLayer )
            // InternalGuardin.g:3558:3: rulePianoLayer
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
    // InternalGuardin.g:3567:1: rule__SectionPianoLayer__SectionAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__SectionPianoLayer__SectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3571:1: ( ( ( ruleEString ) ) )
            // InternalGuardin.g:3572:2: ( ( ruleEString ) )
            {
            // InternalGuardin.g:3572:2: ( ( ruleEString ) )
            // InternalGuardin.g:3573:3: ( ruleEString )
            {
             before(grammarAccess.getSectionPianoLayerAccess().getSectionSectionCrossReference_2_0()); 
            // InternalGuardin.g:3574:3: ( ruleEString )
            // InternalGuardin.g:3575:4: ruleEString
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
    // InternalGuardin.g:3586:1: rule__SectionPianoLayer__LayersAssignment_3 : ( rulePianoLayer ) ;
    public final void rule__SectionPianoLayer__LayersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3590:1: ( ( rulePianoLayer ) )
            // InternalGuardin.g:3591:2: ( rulePianoLayer )
            {
            // InternalGuardin.g:3591:2: ( rulePianoLayer )
            // InternalGuardin.g:3592:3: rulePianoLayer
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
    // InternalGuardin.g:3601:1: rule__PianoLayer__NotesAssignment_2 : ( ( rule__PianoLayer__NotesAlternatives_2_0 ) ) ;
    public final void rule__PianoLayer__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3605:1: ( ( ( rule__PianoLayer__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3606:2: ( ( rule__PianoLayer__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3606:2: ( ( rule__PianoLayer__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3607:3: ( rule__PianoLayer__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3608:3: ( rule__PianoLayer__NotesAlternatives_2_0 )
            // InternalGuardin.g:3608:4: rule__PianoLayer__NotesAlternatives_2_0
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
    // InternalGuardin.g:3616:1: rule__PianoNote__NoteTypeAssignment_1 : ( rulePianoNoteType ) ;
    public final void rule__PianoNote__NoteTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3620:1: ( ( rulePianoNoteType ) )
            // InternalGuardin.g:3621:2: ( rulePianoNoteType )
            {
            // InternalGuardin.g:3621:2: ( rulePianoNoteType )
            // InternalGuardin.g:3622:3: rulePianoNoteType
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


    // $ANTLR start "rule__PianoNote__OctaveOffsetAssignment_2_1"
    // InternalGuardin.g:3631:1: rule__PianoNote__OctaveOffsetAssignment_2_1 : ( ruleERelativeInt ) ;
    public final void rule__PianoNote__OctaveOffsetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3635:1: ( ( ruleERelativeInt ) )
            // InternalGuardin.g:3636:2: ( ruleERelativeInt )
            {
            // InternalGuardin.g:3636:2: ( ruleERelativeInt )
            // InternalGuardin.g:3637:3: ruleERelativeInt
            {
             before(grammarAccess.getPianoNoteAccess().getOctaveOffsetERelativeIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleERelativeInt();

            state._fsp--;

             after(grammarAccess.getPianoNoteAccess().getOctaveOffsetERelativeIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PianoNote__OctaveOffsetAssignment_2_1"


    // $ANTLR start "rule__CompositePianoNote__NotesAssignment_2"
    // InternalGuardin.g:3646:1: rule__CompositePianoNote__NotesAssignment_2 : ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) ) ;
    public final void rule__CompositePianoNote__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3650:1: ( ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3651:2: ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3651:2: ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3652:3: ( rule__CompositePianoNote__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3653:3: ( rule__CompositePianoNote__NotesAlternatives_2_0 )
            // InternalGuardin.g:3653:4: rule__CompositePianoNote__NotesAlternatives_2_0
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
    // InternalGuardin.g:3661:1: rule__CompositePianoNote__RepeatsAssignment_5 : ( ruleEInt ) ;
    public final void rule__CompositePianoNote__RepeatsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3665:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3666:2: ( ruleEInt )
            {
            // InternalGuardin.g:3666:2: ( ruleEInt )
            // InternalGuardin.g:3667:3: ruleEInt
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040800000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000840003F000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000840003F002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000040003F000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000040003F002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008401FC0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008401FC0002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000401FC0000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000401FC0002L});

}