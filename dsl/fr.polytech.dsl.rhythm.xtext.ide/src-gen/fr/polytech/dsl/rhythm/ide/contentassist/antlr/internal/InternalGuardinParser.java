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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'Music'", "':'", "'sections'", "'tracks'", "'-'", "'tempo='", "'signature='", "'bars='", "'battery:'", "'piano:'", "'$'", "'layer:'", "'('", "')'", "'x'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleEmptyNote"
    // InternalGuardin.g:128:1: entryRuleEmptyNote : ruleEmptyNote EOF ;
    public final void entryRuleEmptyNote() throws RecognitionException {
        try {
            // InternalGuardin.g:129:1: ( ruleEmptyNote EOF )
            // InternalGuardin.g:130:1: ruleEmptyNote EOF
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
    // InternalGuardin.g:137:1: ruleEmptyNote : ( ( rule__EmptyNote__Group__0 ) ) ;
    public final void ruleEmptyNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:141:2: ( ( ( rule__EmptyNote__Group__0 ) ) )
            // InternalGuardin.g:142:2: ( ( rule__EmptyNote__Group__0 ) )
            {
            // InternalGuardin.g:142:2: ( ( rule__EmptyNote__Group__0 ) )
            // InternalGuardin.g:143:3: ( rule__EmptyNote__Group__0 )
            {
             before(grammarAccess.getEmptyNoteAccess().getGroup()); 
            // InternalGuardin.g:144:3: ( rule__EmptyNote__Group__0 )
            // InternalGuardin.g:144:4: rule__EmptyNote__Group__0
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
    // InternalGuardin.g:153:1: entryRuleBattery : ruleBattery EOF ;
    public final void entryRuleBattery() throws RecognitionException {
        try {
            // InternalGuardin.g:154:1: ( ruleBattery EOF )
            // InternalGuardin.g:155:1: ruleBattery EOF
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
    // InternalGuardin.g:162:1: ruleBattery : ( ( rule__Battery__Group__0 ) ) ;
    public final void ruleBattery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:166:2: ( ( ( rule__Battery__Group__0 ) ) )
            // InternalGuardin.g:167:2: ( ( rule__Battery__Group__0 ) )
            {
            // InternalGuardin.g:167:2: ( ( rule__Battery__Group__0 ) )
            // InternalGuardin.g:168:3: ( rule__Battery__Group__0 )
            {
             before(grammarAccess.getBatteryAccess().getGroup()); 
            // InternalGuardin.g:169:3: ( rule__Battery__Group__0 )
            // InternalGuardin.g:169:4: rule__Battery__Group__0
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


    // $ANTLR start "entryRuleBatteryLayer"
    // InternalGuardin.g:178:1: entryRuleBatteryLayer : ruleBatteryLayer EOF ;
    public final void entryRuleBatteryLayer() throws RecognitionException {
        try {
            // InternalGuardin.g:179:1: ( ruleBatteryLayer EOF )
            // InternalGuardin.g:180:1: ruleBatteryLayer EOF
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
    // InternalGuardin.g:187:1: ruleBatteryLayer : ( ( rule__BatteryLayer__Group__0 ) ) ;
    public final void ruleBatteryLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:191:2: ( ( ( rule__BatteryLayer__Group__0 ) ) )
            // InternalGuardin.g:192:2: ( ( rule__BatteryLayer__Group__0 ) )
            {
            // InternalGuardin.g:192:2: ( ( rule__BatteryLayer__Group__0 ) )
            // InternalGuardin.g:193:3: ( rule__BatteryLayer__Group__0 )
            {
             before(grammarAccess.getBatteryLayerAccess().getGroup()); 
            // InternalGuardin.g:194:3: ( rule__BatteryLayer__Group__0 )
            // InternalGuardin.g:194:4: rule__BatteryLayer__Group__0
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
    // InternalGuardin.g:203:1: entryRuleBatteryNote : ruleBatteryNote EOF ;
    public final void entryRuleBatteryNote() throws RecognitionException {
        try {
            // InternalGuardin.g:204:1: ( ruleBatteryNote EOF )
            // InternalGuardin.g:205:1: ruleBatteryNote EOF
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
    // InternalGuardin.g:212:1: ruleBatteryNote : ( ( rule__BatteryNote__Group__0 ) ) ;
    public final void ruleBatteryNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:216:2: ( ( ( rule__BatteryNote__Group__0 ) ) )
            // InternalGuardin.g:217:2: ( ( rule__BatteryNote__Group__0 ) )
            {
            // InternalGuardin.g:217:2: ( ( rule__BatteryNote__Group__0 ) )
            // InternalGuardin.g:218:3: ( rule__BatteryNote__Group__0 )
            {
             before(grammarAccess.getBatteryNoteAccess().getGroup()); 
            // InternalGuardin.g:219:3: ( rule__BatteryNote__Group__0 )
            // InternalGuardin.g:219:4: rule__BatteryNote__Group__0
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
    // InternalGuardin.g:228:1: entryRuleCompositeBatteryNote : ruleCompositeBatteryNote EOF ;
    public final void entryRuleCompositeBatteryNote() throws RecognitionException {
        try {
            // InternalGuardin.g:229:1: ( ruleCompositeBatteryNote EOF )
            // InternalGuardin.g:230:1: ruleCompositeBatteryNote EOF
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
    // InternalGuardin.g:237:1: ruleCompositeBatteryNote : ( ( rule__CompositeBatteryNote__Group__0 ) ) ;
    public final void ruleCompositeBatteryNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:241:2: ( ( ( rule__CompositeBatteryNote__Group__0 ) ) )
            // InternalGuardin.g:242:2: ( ( rule__CompositeBatteryNote__Group__0 ) )
            {
            // InternalGuardin.g:242:2: ( ( rule__CompositeBatteryNote__Group__0 ) )
            // InternalGuardin.g:243:3: ( rule__CompositeBatteryNote__Group__0 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getGroup()); 
            // InternalGuardin.g:244:3: ( rule__CompositeBatteryNote__Group__0 )
            // InternalGuardin.g:244:4: rule__CompositeBatteryNote__Group__0
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
    // InternalGuardin.g:253:1: entryRulePiano : rulePiano EOF ;
    public final void entryRulePiano() throws RecognitionException {
        try {
            // InternalGuardin.g:254:1: ( rulePiano EOF )
            // InternalGuardin.g:255:1: rulePiano EOF
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
    // InternalGuardin.g:262:1: rulePiano : ( ( rule__Piano__Group__0 ) ) ;
    public final void rulePiano() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:266:2: ( ( ( rule__Piano__Group__0 ) ) )
            // InternalGuardin.g:267:2: ( ( rule__Piano__Group__0 ) )
            {
            // InternalGuardin.g:267:2: ( ( rule__Piano__Group__0 ) )
            // InternalGuardin.g:268:3: ( rule__Piano__Group__0 )
            {
             before(grammarAccess.getPianoAccess().getGroup()); 
            // InternalGuardin.g:269:3: ( rule__Piano__Group__0 )
            // InternalGuardin.g:269:4: rule__Piano__Group__0
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


    // $ANTLR start "entryRulePianoLayer"
    // InternalGuardin.g:278:1: entryRulePianoLayer : rulePianoLayer EOF ;
    public final void entryRulePianoLayer() throws RecognitionException {
        try {
            // InternalGuardin.g:279:1: ( rulePianoLayer EOF )
            // InternalGuardin.g:280:1: rulePianoLayer EOF
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
    // InternalGuardin.g:287:1: rulePianoLayer : ( ( rule__PianoLayer__Group__0 ) ) ;
    public final void rulePianoLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:291:2: ( ( ( rule__PianoLayer__Group__0 ) ) )
            // InternalGuardin.g:292:2: ( ( rule__PianoLayer__Group__0 ) )
            {
            // InternalGuardin.g:292:2: ( ( rule__PianoLayer__Group__0 ) )
            // InternalGuardin.g:293:3: ( rule__PianoLayer__Group__0 )
            {
             before(grammarAccess.getPianoLayerAccess().getGroup()); 
            // InternalGuardin.g:294:3: ( rule__PianoLayer__Group__0 )
            // InternalGuardin.g:294:4: rule__PianoLayer__Group__0
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
    // InternalGuardin.g:303:1: entryRulePianoNote : rulePianoNote EOF ;
    public final void entryRulePianoNote() throws RecognitionException {
        try {
            // InternalGuardin.g:304:1: ( rulePianoNote EOF )
            // InternalGuardin.g:305:1: rulePianoNote EOF
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
    // InternalGuardin.g:312:1: rulePianoNote : ( ( rule__PianoNote__Group__0 ) ) ;
    public final void rulePianoNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:316:2: ( ( ( rule__PianoNote__Group__0 ) ) )
            // InternalGuardin.g:317:2: ( ( rule__PianoNote__Group__0 ) )
            {
            // InternalGuardin.g:317:2: ( ( rule__PianoNote__Group__0 ) )
            // InternalGuardin.g:318:3: ( rule__PianoNote__Group__0 )
            {
             before(grammarAccess.getPianoNoteAccess().getGroup()); 
            // InternalGuardin.g:319:3: ( rule__PianoNote__Group__0 )
            // InternalGuardin.g:319:4: rule__PianoNote__Group__0
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
    // InternalGuardin.g:328:1: entryRuleCompositePianoNote : ruleCompositePianoNote EOF ;
    public final void entryRuleCompositePianoNote() throws RecognitionException {
        try {
            // InternalGuardin.g:329:1: ( ruleCompositePianoNote EOF )
            // InternalGuardin.g:330:1: ruleCompositePianoNote EOF
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
    // InternalGuardin.g:337:1: ruleCompositePianoNote : ( ( rule__CompositePianoNote__Group__0 ) ) ;
    public final void ruleCompositePianoNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:341:2: ( ( ( rule__CompositePianoNote__Group__0 ) ) )
            // InternalGuardin.g:342:2: ( ( rule__CompositePianoNote__Group__0 ) )
            {
            // InternalGuardin.g:342:2: ( ( rule__CompositePianoNote__Group__0 ) )
            // InternalGuardin.g:343:3: ( rule__CompositePianoNote__Group__0 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getGroup()); 
            // InternalGuardin.g:344:3: ( rule__CompositePianoNote__Group__0 )
            // InternalGuardin.g:344:4: rule__CompositePianoNote__Group__0
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
    // InternalGuardin.g:353:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalGuardin.g:354:1: ( ruleEInt EOF )
            // InternalGuardin.g:355:1: ruleEInt EOF
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
    // InternalGuardin.g:362:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:366:2: ( ( RULE_INT ) )
            // InternalGuardin.g:367:2: ( RULE_INT )
            {
            // InternalGuardin.g:367:2: ( RULE_INT )
            // InternalGuardin.g:368:3: RULE_INT
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
    // InternalGuardin.g:378:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGuardin.g:379:1: ( ruleEString EOF )
            // InternalGuardin.g:380:1: ruleEString EOF
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
    // InternalGuardin.g:387:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:391:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalGuardin.g:392:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalGuardin.g:392:2: ( ( rule__EString__Alternatives ) )
            // InternalGuardin.g:393:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalGuardin.g:394:3: ( rule__EString__Alternatives )
            // InternalGuardin.g:394:4: rule__EString__Alternatives
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
    // InternalGuardin.g:403:1: ruleBatteryNoteType : ( ( rule__BatteryNoteType__Alternatives ) ) ;
    public final void ruleBatteryNoteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:407:1: ( ( ( rule__BatteryNoteType__Alternatives ) ) )
            // InternalGuardin.g:408:2: ( ( rule__BatteryNoteType__Alternatives ) )
            {
            // InternalGuardin.g:408:2: ( ( rule__BatteryNoteType__Alternatives ) )
            // InternalGuardin.g:409:3: ( rule__BatteryNoteType__Alternatives )
            {
             before(grammarAccess.getBatteryNoteTypeAccess().getAlternatives()); 
            // InternalGuardin.g:410:3: ( rule__BatteryNoteType__Alternatives )
            // InternalGuardin.g:410:4: rule__BatteryNoteType__Alternatives
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
    // InternalGuardin.g:419:1: rulePianoNoteType : ( ( rule__PianoNoteType__Alternatives ) ) ;
    public final void rulePianoNoteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:423:1: ( ( ( rule__PianoNoteType__Alternatives ) ) )
            // InternalGuardin.g:424:2: ( ( rule__PianoNoteType__Alternatives ) )
            {
            // InternalGuardin.g:424:2: ( ( rule__PianoNoteType__Alternatives ) )
            // InternalGuardin.g:425:3: ( rule__PianoNoteType__Alternatives )
            {
             before(grammarAccess.getPianoNoteTypeAccess().getAlternatives()); 
            // InternalGuardin.g:426:3: ( rule__PianoNoteType__Alternatives )
            // InternalGuardin.g:426:4: rule__PianoNoteType__Alternatives
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


    // $ANTLR start "rule__Track__Alternatives_2"
    // InternalGuardin.g:434:1: rule__Track__Alternatives_2 : ( ( ( rule__Track__Group_2_0__0 ) ) | ( ( rule__Track__Group_2_1__0 ) ) );
    public final void rule__Track__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:438:1: ( ( ( rule__Track__Group_2_0__0 ) ) | ( ( rule__Track__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGuardin.g:439:2: ( ( rule__Track__Group_2_0__0 ) )
                    {
                    // InternalGuardin.g:439:2: ( ( rule__Track__Group_2_0__0 ) )
                    // InternalGuardin.g:440:3: ( rule__Track__Group_2_0__0 )
                    {
                     before(grammarAccess.getTrackAccess().getGroup_2_0()); 
                    // InternalGuardin.g:441:3: ( rule__Track__Group_2_0__0 )
                    // InternalGuardin.g:441:4: rule__Track__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Track__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrackAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:445:2: ( ( rule__Track__Group_2_1__0 ) )
                    {
                    // InternalGuardin.g:445:2: ( ( rule__Track__Group_2_1__0 ) )
                    // InternalGuardin.g:446:3: ( rule__Track__Group_2_1__0 )
                    {
                     before(grammarAccess.getTrackAccess().getGroup_2_1()); 
                    // InternalGuardin.g:447:3: ( rule__Track__Group_2_1__0 )
                    // InternalGuardin.g:447:4: rule__Track__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Track__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrackAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Track__Alternatives_2"


    // $ANTLR start "rule__BatteryLayer__NotesAlternatives_2_0"
    // InternalGuardin.g:455:1: rule__BatteryLayer__NotesAlternatives_2_0 : ( ( ruleBatteryNote ) | ( ruleEmptyNote ) | ( ruleCompositeBatteryNote ) );
    public final void rule__BatteryLayer__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:459:1: ( ( ruleBatteryNote ) | ( ruleEmptyNote ) | ( ruleCompositeBatteryNote ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 36:
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
                    // InternalGuardin.g:460:2: ( ruleBatteryNote )
                    {
                    // InternalGuardin.g:460:2: ( ruleBatteryNote )
                    // InternalGuardin.g:461:3: ruleBatteryNote
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
                    // InternalGuardin.g:466:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:466:2: ( ruleEmptyNote )
                    // InternalGuardin.g:467:3: ruleEmptyNote
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
                    // InternalGuardin.g:472:2: ( ruleCompositeBatteryNote )
                    {
                    // InternalGuardin.g:472:2: ( ruleCompositeBatteryNote )
                    // InternalGuardin.g:473:3: ruleCompositeBatteryNote
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
    // InternalGuardin.g:482:1: rule__CompositeBatteryNote__NotesAlternatives_2_0 : ( ( ruleBatteryNote ) | ( ruleEmptyNote ) );
    public final void rule__CompositeBatteryNote__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:486:1: ( ( ruleBatteryNote ) | ( ruleEmptyNote ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=16)) ) {
                alt3=1;
            }
            else if ( (LA3_0==34) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuardin.g:487:2: ( ruleBatteryNote )
                    {
                    // InternalGuardin.g:487:2: ( ruleBatteryNote )
                    // InternalGuardin.g:488:3: ruleBatteryNote
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
                    // InternalGuardin.g:493:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:493:2: ( ruleEmptyNote )
                    // InternalGuardin.g:494:3: ruleEmptyNote
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


    // $ANTLR start "rule__PianoLayer__NotesAlternatives_2_0"
    // InternalGuardin.g:503:1: rule__PianoLayer__NotesAlternatives_2_0 : ( ( rulePianoNote ) | ( ruleEmptyNote ) | ( ruleCompositePianoNote ) );
    public final void rule__PianoLayer__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:507:1: ( ( rulePianoNote ) | ( ruleEmptyNote ) | ( ruleCompositePianoNote ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                {
                alt4=1;
                }
                break;
            case 34:
                {
                alt4=2;
                }
                break;
            case 36:
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
                    // InternalGuardin.g:508:2: ( rulePianoNote )
                    {
                    // InternalGuardin.g:508:2: ( rulePianoNote )
                    // InternalGuardin.g:509:3: rulePianoNote
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
                    // InternalGuardin.g:514:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:514:2: ( ruleEmptyNote )
                    // InternalGuardin.g:515:3: ruleEmptyNote
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
                    // InternalGuardin.g:520:2: ( ruleCompositePianoNote )
                    {
                    // InternalGuardin.g:520:2: ( ruleCompositePianoNote )
                    // InternalGuardin.g:521:3: ruleCompositePianoNote
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
    // InternalGuardin.g:530:1: rule__CompositePianoNote__NotesAlternatives_2_0 : ( ( rulePianoNote ) | ( ruleEmptyNote ) );
    public final void rule__CompositePianoNote__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:534:1: ( ( rulePianoNote ) | ( ruleEmptyNote ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=17 && LA5_0<=23)) ) {
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
                    // InternalGuardin.g:535:2: ( rulePianoNote )
                    {
                    // InternalGuardin.g:535:2: ( rulePianoNote )
                    // InternalGuardin.g:536:3: rulePianoNote
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
                    // InternalGuardin.g:541:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:541:2: ( ruleEmptyNote )
                    // InternalGuardin.g:542:3: ruleEmptyNote
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
    // InternalGuardin.g:551:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:555:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGuardin.g:556:2: ( RULE_STRING )
                    {
                    // InternalGuardin.g:556:2: ( RULE_STRING )
                    // InternalGuardin.g:557:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:562:2: ( RULE_ID )
                    {
                    // InternalGuardin.g:562:2: ( RULE_ID )
                    // InternalGuardin.g:563:3: RULE_ID
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
    // InternalGuardin.g:572:1: rule__BatteryNoteType__Alternatives : ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) );
    public final void rule__BatteryNoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:576:1: ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            case 15:
                {
                alt7=5;
                }
                break;
            case 16:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGuardin.g:577:2: ( ( 'bd' ) )
                    {
                    // InternalGuardin.g:577:2: ( ( 'bd' ) )
                    // InternalGuardin.g:578:3: ( 'bd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:579:3: ( 'bd' )
                    // InternalGuardin.g:579:4: 'bd'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:583:2: ( ( 'ch' ) )
                    {
                    // InternalGuardin.g:583:2: ( ( 'ch' ) )
                    // InternalGuardin.g:584:3: ( 'ch' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:585:3: ( 'ch' )
                    // InternalGuardin.g:585:4: 'ch'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:589:2: ( ( 'cc' ) )
                    {
                    // InternalGuardin.g:589:2: ( ( 'cc' ) )
                    // InternalGuardin.g:590:3: ( 'cc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:591:3: ( 'cc' )
                    // InternalGuardin.g:591:4: 'cc'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:595:2: ( ( 'oh' ) )
                    {
                    // InternalGuardin.g:595:2: ( ( 'oh' ) )
                    // InternalGuardin.g:596:3: ( 'oh' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:597:3: ( 'oh' )
                    // InternalGuardin.g:597:4: 'oh'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:601:2: ( ( 'rc' ) )
                    {
                    // InternalGuardin.g:601:2: ( ( 'rc' ) )
                    // InternalGuardin.g:602:3: ( 'rc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:603:3: ( 'rc' )
                    // InternalGuardin.g:603:4: 'rc'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:607:2: ( ( 'sd' ) )
                    {
                    // InternalGuardin.g:607:2: ( ( 'sd' ) )
                    // InternalGuardin.g:608:3: ( 'sd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getSNARE_DRUMEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:609:3: ( 'sd' )
                    // InternalGuardin.g:609:4: 'sd'
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


    // $ANTLR start "rule__PianoNoteType__Alternatives"
    // InternalGuardin.g:617:1: rule__PianoNoteType__Alternatives : ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) );
    public final void rule__PianoNoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:621:1: ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            case 21:
                {
                alt8=5;
                }
                break;
            case 22:
                {
                alt8=6;
                }
                break;
            case 23:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGuardin.g:622:2: ( ( 'A' ) )
                    {
                    // InternalGuardin.g:622:2: ( ( 'A' ) )
                    // InternalGuardin.g:623:3: ( 'A' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:624:3: ( 'A' )
                    // InternalGuardin.g:624:4: 'A'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:628:2: ( ( 'B' ) )
                    {
                    // InternalGuardin.g:628:2: ( ( 'B' ) )
                    // InternalGuardin.g:629:3: ( 'B' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:630:3: ( 'B' )
                    // InternalGuardin.g:630:4: 'B'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:634:2: ( ( 'C' ) )
                    {
                    // InternalGuardin.g:634:2: ( ( 'C' ) )
                    // InternalGuardin.g:635:3: ( 'C' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:636:3: ( 'C' )
                    // InternalGuardin.g:636:4: 'C'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:640:2: ( ( 'D' ) )
                    {
                    // InternalGuardin.g:640:2: ( ( 'D' ) )
                    // InternalGuardin.g:641:3: ( 'D' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:642:3: ( 'D' )
                    // InternalGuardin.g:642:4: 'D'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:646:2: ( ( 'E' ) )
                    {
                    // InternalGuardin.g:646:2: ( ( 'E' ) )
                    // InternalGuardin.g:647:3: ( 'E' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:648:3: ( 'E' )
                    // InternalGuardin.g:648:4: 'E'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:652:2: ( ( 'F' ) )
                    {
                    // InternalGuardin.g:652:2: ( ( 'F' ) )
                    // InternalGuardin.g:653:3: ( 'F' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:654:3: ( 'F' )
                    // InternalGuardin.g:654:4: 'F'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:658:2: ( ( 'G' ) )
                    {
                    // InternalGuardin.g:658:2: ( ( 'G' ) )
                    // InternalGuardin.g:659:3: ( 'G' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getGEnumLiteralDeclaration_6()); 
                    // InternalGuardin.g:660:3: ( 'G' )
                    // InternalGuardin.g:660:4: 'G'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalGuardin.g:668:1: rule__Music__Group__0 : rule__Music__Group__0__Impl rule__Music__Group__1 ;
    public final void rule__Music__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:672:1: ( rule__Music__Group__0__Impl rule__Music__Group__1 )
            // InternalGuardin.g:673:2: rule__Music__Group__0__Impl rule__Music__Group__1
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
    // InternalGuardin.g:680:1: rule__Music__Group__0__Impl : ( () ) ;
    public final void rule__Music__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:684:1: ( ( () ) )
            // InternalGuardin.g:685:1: ( () )
            {
            // InternalGuardin.g:685:1: ( () )
            // InternalGuardin.g:686:2: ()
            {
             before(grammarAccess.getMusicAccess().getMusicAction_0()); 
            // InternalGuardin.g:687:2: ()
            // InternalGuardin.g:687:3: 
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
    // InternalGuardin.g:695:1: rule__Music__Group__1 : rule__Music__Group__1__Impl rule__Music__Group__2 ;
    public final void rule__Music__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:699:1: ( rule__Music__Group__1__Impl rule__Music__Group__2 )
            // InternalGuardin.g:700:2: rule__Music__Group__1__Impl rule__Music__Group__2
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
    // InternalGuardin.g:707:1: rule__Music__Group__1__Impl : ( 'Music' ) ;
    public final void rule__Music__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:711:1: ( ( 'Music' ) )
            // InternalGuardin.g:712:1: ( 'Music' )
            {
            // InternalGuardin.g:712:1: ( 'Music' )
            // InternalGuardin.g:713:2: 'Music'
            {
             before(grammarAccess.getMusicAccess().getMusicKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGuardin.g:722:1: rule__Music__Group__2 : rule__Music__Group__2__Impl rule__Music__Group__3 ;
    public final void rule__Music__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:726:1: ( rule__Music__Group__2__Impl rule__Music__Group__3 )
            // InternalGuardin.g:727:2: rule__Music__Group__2__Impl rule__Music__Group__3
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
    // InternalGuardin.g:734:1: rule__Music__Group__2__Impl : ( ( rule__Music__NameAssignment_2 ) ) ;
    public final void rule__Music__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:738:1: ( ( ( rule__Music__NameAssignment_2 ) ) )
            // InternalGuardin.g:739:1: ( ( rule__Music__NameAssignment_2 ) )
            {
            // InternalGuardin.g:739:1: ( ( rule__Music__NameAssignment_2 ) )
            // InternalGuardin.g:740:2: ( rule__Music__NameAssignment_2 )
            {
             before(grammarAccess.getMusicAccess().getNameAssignment_2()); 
            // InternalGuardin.g:741:2: ( rule__Music__NameAssignment_2 )
            // InternalGuardin.g:741:3: rule__Music__NameAssignment_2
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
    // InternalGuardin.g:749:1: rule__Music__Group__3 : rule__Music__Group__3__Impl rule__Music__Group__4 ;
    public final void rule__Music__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:753:1: ( rule__Music__Group__3__Impl rule__Music__Group__4 )
            // InternalGuardin.g:754:2: rule__Music__Group__3__Impl rule__Music__Group__4
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
    // InternalGuardin.g:761:1: rule__Music__Group__3__Impl : ( ':' ) ;
    public final void rule__Music__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:765:1: ( ( ':' ) )
            // InternalGuardin.g:766:1: ( ':' )
            {
            // InternalGuardin.g:766:1: ( ':' )
            // InternalGuardin.g:767:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGuardin.g:776:1: rule__Music__Group__4 : rule__Music__Group__4__Impl rule__Music__Group__5 ;
    public final void rule__Music__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:780:1: ( rule__Music__Group__4__Impl rule__Music__Group__5 )
            // InternalGuardin.g:781:2: rule__Music__Group__4__Impl rule__Music__Group__5
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
    // InternalGuardin.g:788:1: rule__Music__Group__4__Impl : ( 'sections' ) ;
    public final void rule__Music__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:792:1: ( ( 'sections' ) )
            // InternalGuardin.g:793:1: ( 'sections' )
            {
            // InternalGuardin.g:793:1: ( 'sections' )
            // InternalGuardin.g:794:2: 'sections'
            {
             before(grammarAccess.getMusicAccess().getSectionsKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGuardin.g:803:1: rule__Music__Group__5 : rule__Music__Group__5__Impl rule__Music__Group__6 ;
    public final void rule__Music__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:807:1: ( rule__Music__Group__5__Impl rule__Music__Group__6 )
            // InternalGuardin.g:808:2: rule__Music__Group__5__Impl rule__Music__Group__6
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
    // InternalGuardin.g:815:1: rule__Music__Group__5__Impl : ( ':' ) ;
    public final void rule__Music__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:819:1: ( ( ':' ) )
            // InternalGuardin.g:820:1: ( ':' )
            {
            // InternalGuardin.g:820:1: ( ':' )
            // InternalGuardin.g:821:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGuardin.g:830:1: rule__Music__Group__6 : rule__Music__Group__6__Impl rule__Music__Group__7 ;
    public final void rule__Music__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:834:1: ( rule__Music__Group__6__Impl rule__Music__Group__7 )
            // InternalGuardin.g:835:2: rule__Music__Group__6__Impl rule__Music__Group__7
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
    // InternalGuardin.g:842:1: rule__Music__Group__6__Impl : ( ( rule__Music__SectionsAssignment_6 ) ) ;
    public final void rule__Music__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:846:1: ( ( ( rule__Music__SectionsAssignment_6 ) ) )
            // InternalGuardin.g:847:1: ( ( rule__Music__SectionsAssignment_6 ) )
            {
            // InternalGuardin.g:847:1: ( ( rule__Music__SectionsAssignment_6 ) )
            // InternalGuardin.g:848:2: ( rule__Music__SectionsAssignment_6 )
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_6()); 
            // InternalGuardin.g:849:2: ( rule__Music__SectionsAssignment_6 )
            // InternalGuardin.g:849:3: rule__Music__SectionsAssignment_6
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
    // InternalGuardin.g:857:1: rule__Music__Group__7 : rule__Music__Group__7__Impl rule__Music__Group__8 ;
    public final void rule__Music__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:861:1: ( rule__Music__Group__7__Impl rule__Music__Group__8 )
            // InternalGuardin.g:862:2: rule__Music__Group__7__Impl rule__Music__Group__8
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
    // InternalGuardin.g:869:1: rule__Music__Group__7__Impl : ( ( rule__Music__SectionsAssignment_7 )* ) ;
    public final void rule__Music__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:873:1: ( ( ( rule__Music__SectionsAssignment_7 )* ) )
            // InternalGuardin.g:874:1: ( ( rule__Music__SectionsAssignment_7 )* )
            {
            // InternalGuardin.g:874:1: ( ( rule__Music__SectionsAssignment_7 )* )
            // InternalGuardin.g:875:2: ( rule__Music__SectionsAssignment_7 )*
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_7()); 
            // InternalGuardin.g:876:2: ( rule__Music__SectionsAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGuardin.g:876:3: rule__Music__SectionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Music__SectionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalGuardin.g:884:1: rule__Music__Group__8 : rule__Music__Group__8__Impl rule__Music__Group__9 ;
    public final void rule__Music__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:888:1: ( rule__Music__Group__8__Impl rule__Music__Group__9 )
            // InternalGuardin.g:889:2: rule__Music__Group__8__Impl rule__Music__Group__9
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
    // InternalGuardin.g:896:1: rule__Music__Group__8__Impl : ( 'tracks' ) ;
    public final void rule__Music__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:900:1: ( ( 'tracks' ) )
            // InternalGuardin.g:901:1: ( 'tracks' )
            {
            // InternalGuardin.g:901:1: ( 'tracks' )
            // InternalGuardin.g:902:2: 'tracks'
            {
             before(grammarAccess.getMusicAccess().getTracksKeyword_8()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGuardin.g:911:1: rule__Music__Group__9 : rule__Music__Group__9__Impl rule__Music__Group__10 ;
    public final void rule__Music__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:915:1: ( rule__Music__Group__9__Impl rule__Music__Group__10 )
            // InternalGuardin.g:916:2: rule__Music__Group__9__Impl rule__Music__Group__10
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
    // InternalGuardin.g:923:1: rule__Music__Group__9__Impl : ( ':' ) ;
    public final void rule__Music__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:927:1: ( ( ':' ) )
            // InternalGuardin.g:928:1: ( ':' )
            {
            // InternalGuardin.g:928:1: ( ':' )
            // InternalGuardin.g:929:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_9()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGuardin.g:938:1: rule__Music__Group__10 : rule__Music__Group__10__Impl ;
    public final void rule__Music__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:942:1: ( rule__Music__Group__10__Impl )
            // InternalGuardin.g:943:2: rule__Music__Group__10__Impl
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
    // InternalGuardin.g:949:1: rule__Music__Group__10__Impl : ( ( rule__Music__Group_10__0 ) ) ;
    public final void rule__Music__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:953:1: ( ( ( rule__Music__Group_10__0 ) ) )
            // InternalGuardin.g:954:1: ( ( rule__Music__Group_10__0 ) )
            {
            // InternalGuardin.g:954:1: ( ( rule__Music__Group_10__0 ) )
            // InternalGuardin.g:955:2: ( rule__Music__Group_10__0 )
            {
             before(grammarAccess.getMusicAccess().getGroup_10()); 
            // InternalGuardin.g:956:2: ( rule__Music__Group_10__0 )
            // InternalGuardin.g:956:3: rule__Music__Group_10__0
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
    // InternalGuardin.g:965:1: rule__Music__Group_10__0 : rule__Music__Group_10__0__Impl rule__Music__Group_10__1 ;
    public final void rule__Music__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:969:1: ( rule__Music__Group_10__0__Impl rule__Music__Group_10__1 )
            // InternalGuardin.g:970:2: rule__Music__Group_10__0__Impl rule__Music__Group_10__1
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
    // InternalGuardin.g:977:1: rule__Music__Group_10__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:981:1: ( ( '-' ) )
            // InternalGuardin.g:982:1: ( '-' )
            {
            // InternalGuardin.g:982:1: ( '-' )
            // InternalGuardin.g:983:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_10_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGuardin.g:992:1: rule__Music__Group_10__1 : rule__Music__Group_10__1__Impl rule__Music__Group_10__2 ;
    public final void rule__Music__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:996:1: ( rule__Music__Group_10__1__Impl rule__Music__Group_10__2 )
            // InternalGuardin.g:997:2: rule__Music__Group_10__1__Impl rule__Music__Group_10__2
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
    // InternalGuardin.g:1004:1: rule__Music__Group_10__1__Impl : ( ( rule__Music__TracksAssignment_10_1 ) ) ;
    public final void rule__Music__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1008:1: ( ( ( rule__Music__TracksAssignment_10_1 ) ) )
            // InternalGuardin.g:1009:1: ( ( rule__Music__TracksAssignment_10_1 ) )
            {
            // InternalGuardin.g:1009:1: ( ( rule__Music__TracksAssignment_10_1 ) )
            // InternalGuardin.g:1010:2: ( rule__Music__TracksAssignment_10_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_10_1()); 
            // InternalGuardin.g:1011:2: ( rule__Music__TracksAssignment_10_1 )
            // InternalGuardin.g:1011:3: rule__Music__TracksAssignment_10_1
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
    // InternalGuardin.g:1019:1: rule__Music__Group_10__2 : rule__Music__Group_10__2__Impl ;
    public final void rule__Music__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1023:1: ( rule__Music__Group_10__2__Impl )
            // InternalGuardin.g:1024:2: rule__Music__Group_10__2__Impl
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
    // InternalGuardin.g:1030:1: rule__Music__Group_10__2__Impl : ( ( rule__Music__Group_10_2__0 )* ) ;
    public final void rule__Music__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1034:1: ( ( ( rule__Music__Group_10_2__0 )* ) )
            // InternalGuardin.g:1035:1: ( ( rule__Music__Group_10_2__0 )* )
            {
            // InternalGuardin.g:1035:1: ( ( rule__Music__Group_10_2__0 )* )
            // InternalGuardin.g:1036:2: ( rule__Music__Group_10_2__0 )*
            {
             before(grammarAccess.getMusicAccess().getGroup_10_2()); 
            // InternalGuardin.g:1037:2: ( rule__Music__Group_10_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGuardin.g:1037:3: rule__Music__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Music__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalGuardin.g:1046:1: rule__Music__Group_10_2__0 : rule__Music__Group_10_2__0__Impl rule__Music__Group_10_2__1 ;
    public final void rule__Music__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1050:1: ( rule__Music__Group_10_2__0__Impl rule__Music__Group_10_2__1 )
            // InternalGuardin.g:1051:2: rule__Music__Group_10_2__0__Impl rule__Music__Group_10_2__1
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
    // InternalGuardin.g:1058:1: rule__Music__Group_10_2__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1062:1: ( ( '-' ) )
            // InternalGuardin.g:1063:1: ( '-' )
            {
            // InternalGuardin.g:1063:1: ( '-' )
            // InternalGuardin.g:1064:2: '-'
            {
             before(grammarAccess.getMusicAccess().getHyphenMinusKeyword_10_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGuardin.g:1073:1: rule__Music__Group_10_2__1 : rule__Music__Group_10_2__1__Impl ;
    public final void rule__Music__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1077:1: ( rule__Music__Group_10_2__1__Impl )
            // InternalGuardin.g:1078:2: rule__Music__Group_10_2__1__Impl
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
    // InternalGuardin.g:1084:1: rule__Music__Group_10_2__1__Impl : ( ( rule__Music__TracksAssignment_10_2_1 ) ) ;
    public final void rule__Music__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1088:1: ( ( ( rule__Music__TracksAssignment_10_2_1 ) ) )
            // InternalGuardin.g:1089:1: ( ( rule__Music__TracksAssignment_10_2_1 ) )
            {
            // InternalGuardin.g:1089:1: ( ( rule__Music__TracksAssignment_10_2_1 ) )
            // InternalGuardin.g:1090:2: ( rule__Music__TracksAssignment_10_2_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_10_2_1()); 
            // InternalGuardin.g:1091:2: ( rule__Music__TracksAssignment_10_2_1 )
            // InternalGuardin.g:1091:3: rule__Music__TracksAssignment_10_2_1
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
    // InternalGuardin.g:1100:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1104:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalGuardin.g:1105:2: rule__Section__Group__0__Impl rule__Section__Group__1
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
    // InternalGuardin.g:1112:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1116:1: ( ( () ) )
            // InternalGuardin.g:1117:1: ( () )
            {
            // InternalGuardin.g:1117:1: ( () )
            // InternalGuardin.g:1118:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalGuardin.g:1119:2: ()
            // InternalGuardin.g:1119:3: 
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
    // InternalGuardin.g:1127:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1131:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalGuardin.g:1132:2: rule__Section__Group__1__Impl rule__Section__Group__2
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
    // InternalGuardin.g:1139:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1143:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalGuardin.g:1144:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalGuardin.g:1144:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalGuardin.g:1145:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalGuardin.g:1146:2: ( rule__Section__NameAssignment_1 )
            // InternalGuardin.g:1146:3: rule__Section__NameAssignment_1
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
    // InternalGuardin.g:1154:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1158:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalGuardin.g:1159:2: rule__Section__Group__2__Impl rule__Section__Group__3
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
    // InternalGuardin.g:1166:1: rule__Section__Group__2__Impl : ( ':' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1170:1: ( ( ':' ) )
            // InternalGuardin.g:1171:1: ( ':' )
            {
            // InternalGuardin.g:1171:1: ( ':' )
            // InternalGuardin.g:1172:2: ':'
            {
             before(grammarAccess.getSectionAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGuardin.g:1181:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1185:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalGuardin.g:1186:2: rule__Section__Group__3__Impl rule__Section__Group__4
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
    // InternalGuardin.g:1193:1: rule__Section__Group__3__Impl : ( 'tempo=' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1197:1: ( ( 'tempo=' ) )
            // InternalGuardin.g:1198:1: ( 'tempo=' )
            {
            // InternalGuardin.g:1198:1: ( 'tempo=' )
            // InternalGuardin.g:1199:2: 'tempo='
            {
             before(grammarAccess.getSectionAccess().getTempoKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGuardin.g:1208:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1212:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalGuardin.g:1213:2: rule__Section__Group__4__Impl rule__Section__Group__5
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
    // InternalGuardin.g:1220:1: rule__Section__Group__4__Impl : ( ( rule__Section__TempoAssignment_4 ) ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1224:1: ( ( ( rule__Section__TempoAssignment_4 ) ) )
            // InternalGuardin.g:1225:1: ( ( rule__Section__TempoAssignment_4 ) )
            {
            // InternalGuardin.g:1225:1: ( ( rule__Section__TempoAssignment_4 ) )
            // InternalGuardin.g:1226:2: ( rule__Section__TempoAssignment_4 )
            {
             before(grammarAccess.getSectionAccess().getTempoAssignment_4()); 
            // InternalGuardin.g:1227:2: ( rule__Section__TempoAssignment_4 )
            // InternalGuardin.g:1227:3: rule__Section__TempoAssignment_4
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
    // InternalGuardin.g:1235:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1239:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalGuardin.g:1240:2: rule__Section__Group__5__Impl rule__Section__Group__6
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
    // InternalGuardin.g:1247:1: rule__Section__Group__5__Impl : ( 'signature=' ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1251:1: ( ( 'signature=' ) )
            // InternalGuardin.g:1252:1: ( 'signature=' )
            {
            // InternalGuardin.g:1252:1: ( 'signature=' )
            // InternalGuardin.g:1253:2: 'signature='
            {
             before(grammarAccess.getSectionAccess().getSignatureKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGuardin.g:1262:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1266:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalGuardin.g:1267:2: rule__Section__Group__6__Impl rule__Section__Group__7
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
    // InternalGuardin.g:1274:1: rule__Section__Group__6__Impl : ( ( rule__Section__SignatureAssignment_6 ) ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1278:1: ( ( ( rule__Section__SignatureAssignment_6 ) ) )
            // InternalGuardin.g:1279:1: ( ( rule__Section__SignatureAssignment_6 ) )
            {
            // InternalGuardin.g:1279:1: ( ( rule__Section__SignatureAssignment_6 ) )
            // InternalGuardin.g:1280:2: ( rule__Section__SignatureAssignment_6 )
            {
             before(grammarAccess.getSectionAccess().getSignatureAssignment_6()); 
            // InternalGuardin.g:1281:2: ( rule__Section__SignatureAssignment_6 )
            // InternalGuardin.g:1281:3: rule__Section__SignatureAssignment_6
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
    // InternalGuardin.g:1289:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1293:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalGuardin.g:1294:2: rule__Section__Group__7__Impl rule__Section__Group__8
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
    // InternalGuardin.g:1301:1: rule__Section__Group__7__Impl : ( 'bars=' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1305:1: ( ( 'bars=' ) )
            // InternalGuardin.g:1306:1: ( 'bars=' )
            {
            // InternalGuardin.g:1306:1: ( 'bars=' )
            // InternalGuardin.g:1307:2: 'bars='
            {
             before(grammarAccess.getSectionAccess().getBarsKeyword_7()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGuardin.g:1316:1: rule__Section__Group__8 : rule__Section__Group__8__Impl ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1320:1: ( rule__Section__Group__8__Impl )
            // InternalGuardin.g:1321:2: rule__Section__Group__8__Impl
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
    // InternalGuardin.g:1327:1: rule__Section__Group__8__Impl : ( ( rule__Section__BarsAssignment_8 ) ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1331:1: ( ( ( rule__Section__BarsAssignment_8 ) ) )
            // InternalGuardin.g:1332:1: ( ( rule__Section__BarsAssignment_8 ) )
            {
            // InternalGuardin.g:1332:1: ( ( rule__Section__BarsAssignment_8 ) )
            // InternalGuardin.g:1333:2: ( rule__Section__BarsAssignment_8 )
            {
             before(grammarAccess.getSectionAccess().getBarsAssignment_8()); 
            // InternalGuardin.g:1334:2: ( rule__Section__BarsAssignment_8 )
            // InternalGuardin.g:1334:3: rule__Section__BarsAssignment_8
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
    // InternalGuardin.g:1343:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1347:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // InternalGuardin.g:1348:2: rule__Track__Group__0__Impl rule__Track__Group__1
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
    // InternalGuardin.g:1355:1: rule__Track__Group__0__Impl : ( () ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1359:1: ( ( () ) )
            // InternalGuardin.g:1360:1: ( () )
            {
            // InternalGuardin.g:1360:1: ( () )
            // InternalGuardin.g:1361:2: ()
            {
             before(grammarAccess.getTrackAccess().getTrackAction_0()); 
            // InternalGuardin.g:1362:2: ()
            // InternalGuardin.g:1362:3: 
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
    // InternalGuardin.g:1370:1: rule__Track__Group__1 : rule__Track__Group__1__Impl rule__Track__Group__2 ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1374:1: ( rule__Track__Group__1__Impl rule__Track__Group__2 )
            // InternalGuardin.g:1375:2: rule__Track__Group__1__Impl rule__Track__Group__2
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
    // InternalGuardin.g:1382:1: rule__Track__Group__1__Impl : ( ( rule__Track__Group_1__0 )? ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1386:1: ( ( ( rule__Track__Group_1__0 )? ) )
            // InternalGuardin.g:1387:1: ( ( rule__Track__Group_1__0 )? )
            {
            // InternalGuardin.g:1387:1: ( ( rule__Track__Group_1__0 )? )
            // InternalGuardin.g:1388:2: ( rule__Track__Group_1__0 )?
            {
             before(grammarAccess.getTrackAccess().getGroup_1()); 
            // InternalGuardin.g:1389:2: ( rule__Track__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGuardin.g:1389:3: rule__Track__Group_1__0
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
    // InternalGuardin.g:1397:1: rule__Track__Group__2 : rule__Track__Group__2__Impl ;
    public final void rule__Track__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1401:1: ( rule__Track__Group__2__Impl )
            // InternalGuardin.g:1402:2: rule__Track__Group__2__Impl
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
    // InternalGuardin.g:1408:1: rule__Track__Group__2__Impl : ( ( rule__Track__Alternatives_2 ) ) ;
    public final void rule__Track__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1412:1: ( ( ( rule__Track__Alternatives_2 ) ) )
            // InternalGuardin.g:1413:1: ( ( rule__Track__Alternatives_2 ) )
            {
            // InternalGuardin.g:1413:1: ( ( rule__Track__Alternatives_2 ) )
            // InternalGuardin.g:1414:2: ( rule__Track__Alternatives_2 )
            {
             before(grammarAccess.getTrackAccess().getAlternatives_2()); 
            // InternalGuardin.g:1415:2: ( rule__Track__Alternatives_2 )
            // InternalGuardin.g:1415:3: rule__Track__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Track__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalGuardin.g:1424:1: rule__Track__Group_1__0 : rule__Track__Group_1__0__Impl rule__Track__Group_1__1 ;
    public final void rule__Track__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1428:1: ( rule__Track__Group_1__0__Impl rule__Track__Group_1__1 )
            // InternalGuardin.g:1429:2: rule__Track__Group_1__0__Impl rule__Track__Group_1__1
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
    // InternalGuardin.g:1436:1: rule__Track__Group_1__0__Impl : ( ( rule__Track__NameAssignment_1_0 ) ) ;
    public final void rule__Track__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1440:1: ( ( ( rule__Track__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:1441:1: ( ( rule__Track__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:1441:1: ( ( rule__Track__NameAssignment_1_0 ) )
            // InternalGuardin.g:1442:2: ( rule__Track__NameAssignment_1_0 )
            {
             before(grammarAccess.getTrackAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:1443:2: ( rule__Track__NameAssignment_1_0 )
            // InternalGuardin.g:1443:3: rule__Track__NameAssignment_1_0
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
    // InternalGuardin.g:1451:1: rule__Track__Group_1__1 : rule__Track__Group_1__1__Impl ;
    public final void rule__Track__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1455:1: ( rule__Track__Group_1__1__Impl )
            // InternalGuardin.g:1456:2: rule__Track__Group_1__1__Impl
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
    // InternalGuardin.g:1462:1: rule__Track__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Track__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1466:1: ( ( ':' ) )
            // InternalGuardin.g:1467:1: ( ':' )
            {
            // InternalGuardin.g:1467:1: ( ':' )
            // InternalGuardin.g:1468:2: ':'
            {
             before(grammarAccess.getTrackAccess().getColonKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__Track__Group_2_0__0"
    // InternalGuardin.g:1478:1: rule__Track__Group_2_0__0 : rule__Track__Group_2_0__0__Impl rule__Track__Group_2_0__1 ;
    public final void rule__Track__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1482:1: ( rule__Track__Group_2_0__0__Impl rule__Track__Group_2_0__1 )
            // InternalGuardin.g:1483:2: rule__Track__Group_2_0__0__Impl rule__Track__Group_2_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Track__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group_2_0__0"


    // $ANTLR start "rule__Track__Group_2_0__0__Impl"
    // InternalGuardin.g:1490:1: rule__Track__Group_2_0__0__Impl : ( 'battery:' ) ;
    public final void rule__Track__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1494:1: ( ( 'battery:' ) )
            // InternalGuardin.g:1495:1: ( 'battery:' )
            {
            // InternalGuardin.g:1495:1: ( 'battery:' )
            // InternalGuardin.g:1496:2: 'battery:'
            {
             before(grammarAccess.getTrackAccess().getBatteryKeyword_2_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getBatteryKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group_2_0__0__Impl"


    // $ANTLR start "rule__Track__Group_2_0__1"
    // InternalGuardin.g:1505:1: rule__Track__Group_2_0__1 : rule__Track__Group_2_0__1__Impl ;
    public final void rule__Track__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1509:1: ( rule__Track__Group_2_0__1__Impl )
            // InternalGuardin.g:1510:2: rule__Track__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group_2_0__1"


    // $ANTLR start "rule__Track__Group_2_0__1__Impl"
    // InternalGuardin.g:1516:1: rule__Track__Group_2_0__1__Impl : ( ( rule__Track__InstrumentAssignment_2_0_1 ) ) ;
    public final void rule__Track__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1520:1: ( ( ( rule__Track__InstrumentAssignment_2_0_1 ) ) )
            // InternalGuardin.g:1521:1: ( ( rule__Track__InstrumentAssignment_2_0_1 ) )
            {
            // InternalGuardin.g:1521:1: ( ( rule__Track__InstrumentAssignment_2_0_1 ) )
            // InternalGuardin.g:1522:2: ( rule__Track__InstrumentAssignment_2_0_1 )
            {
             before(grammarAccess.getTrackAccess().getInstrumentAssignment_2_0_1()); 
            // InternalGuardin.g:1523:2: ( rule__Track__InstrumentAssignment_2_0_1 )
            // InternalGuardin.g:1523:3: rule__Track__InstrumentAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Track__InstrumentAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getInstrumentAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group_2_0__1__Impl"


    // $ANTLR start "rule__Track__Group_2_1__0"
    // InternalGuardin.g:1532:1: rule__Track__Group_2_1__0 : rule__Track__Group_2_1__0__Impl rule__Track__Group_2_1__1 ;
    public final void rule__Track__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1536:1: ( rule__Track__Group_2_1__0__Impl rule__Track__Group_2_1__1 )
            // InternalGuardin.g:1537:2: rule__Track__Group_2_1__0__Impl rule__Track__Group_2_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Track__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group_2_1__0"


    // $ANTLR start "rule__Track__Group_2_1__0__Impl"
    // InternalGuardin.g:1544:1: rule__Track__Group_2_1__0__Impl : ( 'piano:' ) ;
    public final void rule__Track__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1548:1: ( ( 'piano:' ) )
            // InternalGuardin.g:1549:1: ( 'piano:' )
            {
            // InternalGuardin.g:1549:1: ( 'piano:' )
            // InternalGuardin.g:1550:2: 'piano:'
            {
             before(grammarAccess.getTrackAccess().getPianoKeyword_2_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getPianoKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group_2_1__0__Impl"


    // $ANTLR start "rule__Track__Group_2_1__1"
    // InternalGuardin.g:1559:1: rule__Track__Group_2_1__1 : rule__Track__Group_2_1__1__Impl ;
    public final void rule__Track__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1563:1: ( rule__Track__Group_2_1__1__Impl )
            // InternalGuardin.g:1564:2: rule__Track__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group_2_1__1"


    // $ANTLR start "rule__Track__Group_2_1__1__Impl"
    // InternalGuardin.g:1570:1: rule__Track__Group_2_1__1__Impl : ( ( rule__Track__InstrumentAssignment_2_1_1 ) ) ;
    public final void rule__Track__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1574:1: ( ( ( rule__Track__InstrumentAssignment_2_1_1 ) ) )
            // InternalGuardin.g:1575:1: ( ( rule__Track__InstrumentAssignment_2_1_1 ) )
            {
            // InternalGuardin.g:1575:1: ( ( rule__Track__InstrumentAssignment_2_1_1 ) )
            // InternalGuardin.g:1576:2: ( rule__Track__InstrumentAssignment_2_1_1 )
            {
             before(grammarAccess.getTrackAccess().getInstrumentAssignment_2_1_1()); 
            // InternalGuardin.g:1577:2: ( rule__Track__InstrumentAssignment_2_1_1 )
            // InternalGuardin.g:1577:3: rule__Track__InstrumentAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Track__InstrumentAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getInstrumentAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group_2_1__1__Impl"


    // $ANTLR start "rule__EmptyNote__Group__0"
    // InternalGuardin.g:1586:1: rule__EmptyNote__Group__0 : rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 ;
    public final void rule__EmptyNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1590:1: ( rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 )
            // InternalGuardin.g:1591:2: rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1
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
    // InternalGuardin.g:1598:1: rule__EmptyNote__Group__0__Impl : ( () ) ;
    public final void rule__EmptyNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1602:1: ( ( () ) )
            // InternalGuardin.g:1603:1: ( () )
            {
            // InternalGuardin.g:1603:1: ( () )
            // InternalGuardin.g:1604:2: ()
            {
             before(grammarAccess.getEmptyNoteAccess().getEmptyNoteAction_0()); 
            // InternalGuardin.g:1605:2: ()
            // InternalGuardin.g:1605:3: 
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
    // InternalGuardin.g:1613:1: rule__EmptyNote__Group__1 : rule__EmptyNote__Group__1__Impl ;
    public final void rule__EmptyNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1617:1: ( rule__EmptyNote__Group__1__Impl )
            // InternalGuardin.g:1618:2: rule__EmptyNote__Group__1__Impl
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
    // InternalGuardin.g:1624:1: rule__EmptyNote__Group__1__Impl : ( '$' ) ;
    public final void rule__EmptyNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1628:1: ( ( '$' ) )
            // InternalGuardin.g:1629:1: ( '$' )
            {
            // InternalGuardin.g:1629:1: ( '$' )
            // InternalGuardin.g:1630:2: '$'
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
    // InternalGuardin.g:1640:1: rule__Battery__Group__0 : rule__Battery__Group__0__Impl rule__Battery__Group__1 ;
    public final void rule__Battery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1644:1: ( rule__Battery__Group__0__Impl rule__Battery__Group__1 )
            // InternalGuardin.g:1645:2: rule__Battery__Group__0__Impl rule__Battery__Group__1
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
    // InternalGuardin.g:1652:1: rule__Battery__Group__0__Impl : ( () ) ;
    public final void rule__Battery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1656:1: ( ( () ) )
            // InternalGuardin.g:1657:1: ( () )
            {
            // InternalGuardin.g:1657:1: ( () )
            // InternalGuardin.g:1658:2: ()
            {
             before(grammarAccess.getBatteryAccess().getBatteryAction_0()); 
            // InternalGuardin.g:1659:2: ()
            // InternalGuardin.g:1659:3: 
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
    // InternalGuardin.g:1667:1: rule__Battery__Group__1 : rule__Battery__Group__1__Impl rule__Battery__Group__2 ;
    public final void rule__Battery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1671:1: ( rule__Battery__Group__1__Impl rule__Battery__Group__2 )
            // InternalGuardin.g:1672:2: rule__Battery__Group__1__Impl rule__Battery__Group__2
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
    // InternalGuardin.g:1679:1: rule__Battery__Group__1__Impl : ( ( rule__Battery__Group_1__0 )? ) ;
    public final void rule__Battery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1683:1: ( ( ( rule__Battery__Group_1__0 )? ) )
            // InternalGuardin.g:1684:1: ( ( rule__Battery__Group_1__0 )? )
            {
            // InternalGuardin.g:1684:1: ( ( rule__Battery__Group_1__0 )? )
            // InternalGuardin.g:1685:2: ( rule__Battery__Group_1__0 )?
            {
             before(grammarAccess.getBatteryAccess().getGroup_1()); 
            // InternalGuardin.g:1686:2: ( rule__Battery__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGuardin.g:1686:3: rule__Battery__Group_1__0
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
    // InternalGuardin.g:1694:1: rule__Battery__Group__2 : rule__Battery__Group__2__Impl ;
    public final void rule__Battery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1698:1: ( rule__Battery__Group__2__Impl )
            // InternalGuardin.g:1699:2: rule__Battery__Group__2__Impl
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
    // InternalGuardin.g:1705:1: rule__Battery__Group__2__Impl : ( ( ( rule__Battery__LayersAssignment_2 ) ) ( ( rule__Battery__LayersAssignment_2 )* ) ) ;
    public final void rule__Battery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1709:1: ( ( ( ( rule__Battery__LayersAssignment_2 ) ) ( ( rule__Battery__LayersAssignment_2 )* ) ) )
            // InternalGuardin.g:1710:1: ( ( ( rule__Battery__LayersAssignment_2 ) ) ( ( rule__Battery__LayersAssignment_2 )* ) )
            {
            // InternalGuardin.g:1710:1: ( ( ( rule__Battery__LayersAssignment_2 ) ) ( ( rule__Battery__LayersAssignment_2 )* ) )
            // InternalGuardin.g:1711:2: ( ( rule__Battery__LayersAssignment_2 ) ) ( ( rule__Battery__LayersAssignment_2 )* )
            {
            // InternalGuardin.g:1711:2: ( ( rule__Battery__LayersAssignment_2 ) )
            // InternalGuardin.g:1712:3: ( rule__Battery__LayersAssignment_2 )
            {
             before(grammarAccess.getBatteryAccess().getLayersAssignment_2()); 
            // InternalGuardin.g:1713:3: ( rule__Battery__LayersAssignment_2 )
            // InternalGuardin.g:1713:4: rule__Battery__LayersAssignment_2
            {
            pushFollow(FOLLOW_18);
            rule__Battery__LayersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getLayersAssignment_2()); 

            }

            // InternalGuardin.g:1716:2: ( ( rule__Battery__LayersAssignment_2 )* )
            // InternalGuardin.g:1717:3: ( rule__Battery__LayersAssignment_2 )*
            {
             before(grammarAccess.getBatteryAccess().getLayersAssignment_2()); 
            // InternalGuardin.g:1718:3: ( rule__Battery__LayersAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGuardin.g:1718:4: rule__Battery__LayersAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Battery__LayersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBatteryAccess().getLayersAssignment_2()); 

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
    // InternalGuardin.g:1728:1: rule__Battery__Group_1__0 : rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1 ;
    public final void rule__Battery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1732:1: ( rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1 )
            // InternalGuardin.g:1733:2: rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1
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
    // InternalGuardin.g:1740:1: rule__Battery__Group_1__0__Impl : ( ( rule__Battery__NameAssignment_1_0 ) ) ;
    public final void rule__Battery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1744:1: ( ( ( rule__Battery__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:1745:1: ( ( rule__Battery__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:1745:1: ( ( rule__Battery__NameAssignment_1_0 ) )
            // InternalGuardin.g:1746:2: ( rule__Battery__NameAssignment_1_0 )
            {
             before(grammarAccess.getBatteryAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:1747:2: ( rule__Battery__NameAssignment_1_0 )
            // InternalGuardin.g:1747:3: rule__Battery__NameAssignment_1_0
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
    // InternalGuardin.g:1755:1: rule__Battery__Group_1__1 : rule__Battery__Group_1__1__Impl ;
    public final void rule__Battery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1759:1: ( rule__Battery__Group_1__1__Impl )
            // InternalGuardin.g:1760:2: rule__Battery__Group_1__1__Impl
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
    // InternalGuardin.g:1766:1: rule__Battery__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Battery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1770:1: ( ( ':' ) )
            // InternalGuardin.g:1771:1: ( ':' )
            {
            // InternalGuardin.g:1771:1: ( ':' )
            // InternalGuardin.g:1772:2: ':'
            {
             before(grammarAccess.getBatteryAccess().getColonKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__BatteryLayer__Group__0"
    // InternalGuardin.g:1782:1: rule__BatteryLayer__Group__0 : rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1 ;
    public final void rule__BatteryLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1786:1: ( rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1 )
            // InternalGuardin.g:1787:2: rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGuardin.g:1794:1: rule__BatteryLayer__Group__0__Impl : ( () ) ;
    public final void rule__BatteryLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1798:1: ( ( () ) )
            // InternalGuardin.g:1799:1: ( () )
            {
            // InternalGuardin.g:1799:1: ( () )
            // InternalGuardin.g:1800:2: ()
            {
             before(grammarAccess.getBatteryLayerAccess().getLayerAction_0()); 
            // InternalGuardin.g:1801:2: ()
            // InternalGuardin.g:1801:3: 
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
    // InternalGuardin.g:1809:1: rule__BatteryLayer__Group__1 : rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2 ;
    public final void rule__BatteryLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1813:1: ( rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2 )
            // InternalGuardin.g:1814:2: rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalGuardin.g:1821:1: rule__BatteryLayer__Group__1__Impl : ( 'layer:' ) ;
    public final void rule__BatteryLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1825:1: ( ( 'layer:' ) )
            // InternalGuardin.g:1826:1: ( 'layer:' )
            {
            // InternalGuardin.g:1826:1: ( 'layer:' )
            // InternalGuardin.g:1827:2: 'layer:'
            {
             before(grammarAccess.getBatteryLayerAccess().getLayerKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGuardin.g:1836:1: rule__BatteryLayer__Group__2 : rule__BatteryLayer__Group__2__Impl ;
    public final void rule__BatteryLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1840:1: ( rule__BatteryLayer__Group__2__Impl )
            // InternalGuardin.g:1841:2: rule__BatteryLayer__Group__2__Impl
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
    // InternalGuardin.g:1847:1: rule__BatteryLayer__Group__2__Impl : ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) ) ;
    public final void rule__BatteryLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1851:1: ( ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:1852:1: ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:1852:1: ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) )
            // InternalGuardin.g:1853:2: ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:1853:2: ( ( rule__BatteryLayer__NotesAssignment_2 ) )
            // InternalGuardin.g:1854:3: ( rule__BatteryLayer__NotesAssignment_2 )
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:1855:3: ( rule__BatteryLayer__NotesAssignment_2 )
            // InternalGuardin.g:1855:4: rule__BatteryLayer__NotesAssignment_2
            {
            pushFollow(FOLLOW_20);
            rule__BatteryLayer__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:1858:2: ( ( rule__BatteryLayer__NotesAssignment_2 )* )
            // InternalGuardin.g:1859:3: ( rule__BatteryLayer__NotesAssignment_2 )*
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:1860:3: ( rule__BatteryLayer__NotesAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=11 && LA14_0<=16)||LA14_0==34||LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGuardin.g:1860:4: rule__BatteryLayer__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__BatteryLayer__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalGuardin.g:1870:1: rule__BatteryNote__Group__0 : rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 ;
    public final void rule__BatteryNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1874:1: ( rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 )
            // InternalGuardin.g:1875:2: rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalGuardin.g:1882:1: rule__BatteryNote__Group__0__Impl : ( () ) ;
    public final void rule__BatteryNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1886:1: ( ( () ) )
            // InternalGuardin.g:1887:1: ( () )
            {
            // InternalGuardin.g:1887:1: ( () )
            // InternalGuardin.g:1888:2: ()
            {
             before(grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0()); 
            // InternalGuardin.g:1889:2: ()
            // InternalGuardin.g:1889:3: 
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
    // InternalGuardin.g:1897:1: rule__BatteryNote__Group__1 : rule__BatteryNote__Group__1__Impl ;
    public final void rule__BatteryNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1901:1: ( rule__BatteryNote__Group__1__Impl )
            // InternalGuardin.g:1902:2: rule__BatteryNote__Group__1__Impl
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
    // InternalGuardin.g:1908:1: rule__BatteryNote__Group__1__Impl : ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) ;
    public final void rule__BatteryNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1912:1: ( ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) )
            // InternalGuardin.g:1913:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            {
            // InternalGuardin.g:1913:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            // InternalGuardin.g:1914:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            {
             before(grammarAccess.getBatteryNoteAccess().getNoteTypeAssignment_1()); 
            // InternalGuardin.g:1915:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            // InternalGuardin.g:1915:3: rule__BatteryNote__NoteTypeAssignment_1
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
    // InternalGuardin.g:1924:1: rule__CompositeBatteryNote__Group__0 : rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1 ;
    public final void rule__CompositeBatteryNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1928:1: ( rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1 )
            // InternalGuardin.g:1929:2: rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalGuardin.g:1936:1: rule__CompositeBatteryNote__Group__0__Impl : ( () ) ;
    public final void rule__CompositeBatteryNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1940:1: ( ( () ) )
            // InternalGuardin.g:1941:1: ( () )
            {
            // InternalGuardin.g:1941:1: ( () )
            // InternalGuardin.g:1942:2: ()
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getCompositeNoteAction_0()); 
            // InternalGuardin.g:1943:2: ()
            // InternalGuardin.g:1943:3: 
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
    // InternalGuardin.g:1951:1: rule__CompositeBatteryNote__Group__1 : rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2 ;
    public final void rule__CompositeBatteryNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1955:1: ( rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2 )
            // InternalGuardin.g:1956:2: rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalGuardin.g:1963:1: rule__CompositeBatteryNote__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositeBatteryNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1967:1: ( ( '(' ) )
            // InternalGuardin.g:1968:1: ( '(' )
            {
            // InternalGuardin.g:1968:1: ( '(' )
            // InternalGuardin.g:1969:2: '('
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGuardin.g:1978:1: rule__CompositeBatteryNote__Group__2 : rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3 ;
    public final void rule__CompositeBatteryNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1982:1: ( rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3 )
            // InternalGuardin.g:1983:2: rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalGuardin.g:1990:1: rule__CompositeBatteryNote__Group__2__Impl : ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) ) ;
    public final void rule__CompositeBatteryNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1994:1: ( ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:1995:1: ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:1995:1: ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) )
            // InternalGuardin.g:1996:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:1996:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) )
            // InternalGuardin.g:1997:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:1998:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )
            // InternalGuardin.g:1998:4: rule__CompositeBatteryNote__NotesAssignment_2
            {
            pushFollow(FOLLOW_24);
            rule__CompositeBatteryNote__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2001:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* )
            // InternalGuardin.g:2002:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )*
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2003:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=11 && LA15_0<=16)||LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGuardin.g:2003:4: rule__CompositeBatteryNote__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__CompositeBatteryNote__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalGuardin.g:2012:1: rule__CompositeBatteryNote__Group__3 : rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4 ;
    public final void rule__CompositeBatteryNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2016:1: ( rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4 )
            // InternalGuardin.g:2017:2: rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalGuardin.g:2024:1: rule__CompositeBatteryNote__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositeBatteryNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2028:1: ( ( ')' ) )
            // InternalGuardin.g:2029:1: ( ')' )
            {
            // InternalGuardin.g:2029:1: ( ')' )
            // InternalGuardin.g:2030:2: ')'
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGuardin.g:2039:1: rule__CompositeBatteryNote__Group__4 : rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5 ;
    public final void rule__CompositeBatteryNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2043:1: ( rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5 )
            // InternalGuardin.g:2044:2: rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalGuardin.g:2051:1: rule__CompositeBatteryNote__Group__4__Impl : ( 'x' ) ;
    public final void rule__CompositeBatteryNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2055:1: ( ( 'x' ) )
            // InternalGuardin.g:2056:1: ( 'x' )
            {
            // InternalGuardin.g:2056:1: ( 'x' )
            // InternalGuardin.g:2057:2: 'x'
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getXKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGuardin.g:2066:1: rule__CompositeBatteryNote__Group__5 : rule__CompositeBatteryNote__Group__5__Impl ;
    public final void rule__CompositeBatteryNote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2070:1: ( rule__CompositeBatteryNote__Group__5__Impl )
            // InternalGuardin.g:2071:2: rule__CompositeBatteryNote__Group__5__Impl
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
    // InternalGuardin.g:2077:1: rule__CompositeBatteryNote__Group__5__Impl : ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) ) ;
    public final void rule__CompositeBatteryNote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2081:1: ( ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) ) )
            // InternalGuardin.g:2082:1: ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) )
            {
            // InternalGuardin.g:2082:1: ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) )
            // InternalGuardin.g:2083:2: ( rule__CompositeBatteryNote__RepeatsAssignment_5 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getRepeatsAssignment_5()); 
            // InternalGuardin.g:2084:2: ( rule__CompositeBatteryNote__RepeatsAssignment_5 )
            // InternalGuardin.g:2084:3: rule__CompositeBatteryNote__RepeatsAssignment_5
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
    // InternalGuardin.g:2093:1: rule__Piano__Group__0 : rule__Piano__Group__0__Impl rule__Piano__Group__1 ;
    public final void rule__Piano__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2097:1: ( rule__Piano__Group__0__Impl rule__Piano__Group__1 )
            // InternalGuardin.g:2098:2: rule__Piano__Group__0__Impl rule__Piano__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGuardin.g:2105:1: rule__Piano__Group__0__Impl : ( () ) ;
    public final void rule__Piano__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2109:1: ( ( () ) )
            // InternalGuardin.g:2110:1: ( () )
            {
            // InternalGuardin.g:2110:1: ( () )
            // InternalGuardin.g:2111:2: ()
            {
             before(grammarAccess.getPianoAccess().getPianoAction_0()); 
            // InternalGuardin.g:2112:2: ()
            // InternalGuardin.g:2112:3: 
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
    // InternalGuardin.g:2120:1: rule__Piano__Group__1 : rule__Piano__Group__1__Impl rule__Piano__Group__2 ;
    public final void rule__Piano__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2124:1: ( rule__Piano__Group__1__Impl rule__Piano__Group__2 )
            // InternalGuardin.g:2125:2: rule__Piano__Group__1__Impl rule__Piano__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGuardin.g:2132:1: rule__Piano__Group__1__Impl : ( ( rule__Piano__Group_1__0 )? ) ;
    public final void rule__Piano__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2136:1: ( ( ( rule__Piano__Group_1__0 )? ) )
            // InternalGuardin.g:2137:1: ( ( rule__Piano__Group_1__0 )? )
            {
            // InternalGuardin.g:2137:1: ( ( rule__Piano__Group_1__0 )? )
            // InternalGuardin.g:2138:2: ( rule__Piano__Group_1__0 )?
            {
             before(grammarAccess.getPianoAccess().getGroup_1()); 
            // InternalGuardin.g:2139:2: ( rule__Piano__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGuardin.g:2139:3: rule__Piano__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Piano__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPianoAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalGuardin.g:2147:1: rule__Piano__Group__2 : rule__Piano__Group__2__Impl ;
    public final void rule__Piano__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2151:1: ( rule__Piano__Group__2__Impl )
            // InternalGuardin.g:2152:2: rule__Piano__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Piano__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalGuardin.g:2158:1: rule__Piano__Group__2__Impl : ( ( ( rule__Piano__LayersAssignment_2 ) ) ( ( rule__Piano__LayersAssignment_2 )* ) ) ;
    public final void rule__Piano__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2162:1: ( ( ( ( rule__Piano__LayersAssignment_2 ) ) ( ( rule__Piano__LayersAssignment_2 )* ) ) )
            // InternalGuardin.g:2163:1: ( ( ( rule__Piano__LayersAssignment_2 ) ) ( ( rule__Piano__LayersAssignment_2 )* ) )
            {
            // InternalGuardin.g:2163:1: ( ( ( rule__Piano__LayersAssignment_2 ) ) ( ( rule__Piano__LayersAssignment_2 )* ) )
            // InternalGuardin.g:2164:2: ( ( rule__Piano__LayersAssignment_2 ) ) ( ( rule__Piano__LayersAssignment_2 )* )
            {
            // InternalGuardin.g:2164:2: ( ( rule__Piano__LayersAssignment_2 ) )
            // InternalGuardin.g:2165:3: ( rule__Piano__LayersAssignment_2 )
            {
             before(grammarAccess.getPianoAccess().getLayersAssignment_2()); 
            // InternalGuardin.g:2166:3: ( rule__Piano__LayersAssignment_2 )
            // InternalGuardin.g:2166:4: rule__Piano__LayersAssignment_2
            {
            pushFollow(FOLLOW_18);
            rule__Piano__LayersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPianoAccess().getLayersAssignment_2()); 

            }

            // InternalGuardin.g:2169:2: ( ( rule__Piano__LayersAssignment_2 )* )
            // InternalGuardin.g:2170:3: ( rule__Piano__LayersAssignment_2 )*
            {
             before(grammarAccess.getPianoAccess().getLayersAssignment_2()); 
            // InternalGuardin.g:2171:3: ( rule__Piano__LayersAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGuardin.g:2171:4: rule__Piano__LayersAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Piano__LayersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPianoAccess().getLayersAssignment_2()); 

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
    // $ANTLR end "rule__Piano__Group__2__Impl"


    // $ANTLR start "rule__Piano__Group_1__0"
    // InternalGuardin.g:2181:1: rule__Piano__Group_1__0 : rule__Piano__Group_1__0__Impl rule__Piano__Group_1__1 ;
    public final void rule__Piano__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2185:1: ( rule__Piano__Group_1__0__Impl rule__Piano__Group_1__1 )
            // InternalGuardin.g:2186:2: rule__Piano__Group_1__0__Impl rule__Piano__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Piano__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Piano__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_1__0"


    // $ANTLR start "rule__Piano__Group_1__0__Impl"
    // InternalGuardin.g:2193:1: rule__Piano__Group_1__0__Impl : ( ( rule__Piano__NameAssignment_1_0 ) ) ;
    public final void rule__Piano__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2197:1: ( ( ( rule__Piano__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:2198:1: ( ( rule__Piano__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:2198:1: ( ( rule__Piano__NameAssignment_1_0 ) )
            // InternalGuardin.g:2199:2: ( rule__Piano__NameAssignment_1_0 )
            {
             before(grammarAccess.getPianoAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:2200:2: ( rule__Piano__NameAssignment_1_0 )
            // InternalGuardin.g:2200:3: rule__Piano__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Piano__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPianoAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_1__0__Impl"


    // $ANTLR start "rule__Piano__Group_1__1"
    // InternalGuardin.g:2208:1: rule__Piano__Group_1__1 : rule__Piano__Group_1__1__Impl ;
    public final void rule__Piano__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2212:1: ( rule__Piano__Group_1__1__Impl )
            // InternalGuardin.g:2213:2: rule__Piano__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Piano__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_1__1"


    // $ANTLR start "rule__Piano__Group_1__1__Impl"
    // InternalGuardin.g:2219:1: rule__Piano__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Piano__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2223:1: ( ( ':' ) )
            // InternalGuardin.g:2224:1: ( ':' )
            {
            // InternalGuardin.g:2224:1: ( ':' )
            // InternalGuardin.g:2225:2: ':'
            {
             before(grammarAccess.getPianoAccess().getColonKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPianoAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__Group_1__1__Impl"


    // $ANTLR start "rule__PianoLayer__Group__0"
    // InternalGuardin.g:2235:1: rule__PianoLayer__Group__0 : rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1 ;
    public final void rule__PianoLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2239:1: ( rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1 )
            // InternalGuardin.g:2240:2: rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGuardin.g:2247:1: rule__PianoLayer__Group__0__Impl : ( () ) ;
    public final void rule__PianoLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2251:1: ( ( () ) )
            // InternalGuardin.g:2252:1: ( () )
            {
            // InternalGuardin.g:2252:1: ( () )
            // InternalGuardin.g:2253:2: ()
            {
             before(grammarAccess.getPianoLayerAccess().getLayerAction_0()); 
            // InternalGuardin.g:2254:2: ()
            // InternalGuardin.g:2254:3: 
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
    // InternalGuardin.g:2262:1: rule__PianoLayer__Group__1 : rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2 ;
    public final void rule__PianoLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2266:1: ( rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2 )
            // InternalGuardin.g:2267:2: rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalGuardin.g:2274:1: rule__PianoLayer__Group__1__Impl : ( 'layer:' ) ;
    public final void rule__PianoLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2278:1: ( ( 'layer:' ) )
            // InternalGuardin.g:2279:1: ( 'layer:' )
            {
            // InternalGuardin.g:2279:1: ( 'layer:' )
            // InternalGuardin.g:2280:2: 'layer:'
            {
             before(grammarAccess.getPianoLayerAccess().getLayerKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGuardin.g:2289:1: rule__PianoLayer__Group__2 : rule__PianoLayer__Group__2__Impl ;
    public final void rule__PianoLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2293:1: ( rule__PianoLayer__Group__2__Impl )
            // InternalGuardin.g:2294:2: rule__PianoLayer__Group__2__Impl
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
    // InternalGuardin.g:2300:1: rule__PianoLayer__Group__2__Impl : ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) ) ;
    public final void rule__PianoLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2304:1: ( ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2305:1: ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2305:1: ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2306:2: ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2306:2: ( ( rule__PianoLayer__NotesAssignment_2 ) )
            // InternalGuardin.g:2307:3: ( rule__PianoLayer__NotesAssignment_2 )
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2308:3: ( rule__PianoLayer__NotesAssignment_2 )
            // InternalGuardin.g:2308:4: rule__PianoLayer__NotesAssignment_2
            {
            pushFollow(FOLLOW_27);
            rule__PianoLayer__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2311:2: ( ( rule__PianoLayer__NotesAssignment_2 )* )
            // InternalGuardin.g:2312:3: ( rule__PianoLayer__NotesAssignment_2 )*
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2313:3: ( rule__PianoLayer__NotesAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=17 && LA18_0<=23)||LA18_0==34||LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGuardin.g:2313:4: rule__PianoLayer__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__PianoLayer__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalGuardin.g:2323:1: rule__PianoNote__Group__0 : rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1 ;
    public final void rule__PianoNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2327:1: ( rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1 )
            // InternalGuardin.g:2328:2: rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalGuardin.g:2335:1: rule__PianoNote__Group__0__Impl : ( () ) ;
    public final void rule__PianoNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2339:1: ( ( () ) )
            // InternalGuardin.g:2340:1: ( () )
            {
            // InternalGuardin.g:2340:1: ( () )
            // InternalGuardin.g:2341:2: ()
            {
             before(grammarAccess.getPianoNoteAccess().getPianoNoteAction_0()); 
            // InternalGuardin.g:2342:2: ()
            // InternalGuardin.g:2342:3: 
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
    // InternalGuardin.g:2350:1: rule__PianoNote__Group__1 : rule__PianoNote__Group__1__Impl ;
    public final void rule__PianoNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2354:1: ( rule__PianoNote__Group__1__Impl )
            // InternalGuardin.g:2355:2: rule__PianoNote__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PianoNote__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalGuardin.g:2361:1: rule__PianoNote__Group__1__Impl : ( ( rule__PianoNote__NoteTypeAssignment_1 ) ) ;
    public final void rule__PianoNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2365:1: ( ( ( rule__PianoNote__NoteTypeAssignment_1 ) ) )
            // InternalGuardin.g:2366:1: ( ( rule__PianoNote__NoteTypeAssignment_1 ) )
            {
            // InternalGuardin.g:2366:1: ( ( rule__PianoNote__NoteTypeAssignment_1 ) )
            // InternalGuardin.g:2367:2: ( rule__PianoNote__NoteTypeAssignment_1 )
            {
             before(grammarAccess.getPianoNoteAccess().getNoteTypeAssignment_1()); 
            // InternalGuardin.g:2368:2: ( rule__PianoNote__NoteTypeAssignment_1 )
            // InternalGuardin.g:2368:3: rule__PianoNote__NoteTypeAssignment_1
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


    // $ANTLR start "rule__CompositePianoNote__Group__0"
    // InternalGuardin.g:2377:1: rule__CompositePianoNote__Group__0 : rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1 ;
    public final void rule__CompositePianoNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2381:1: ( rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1 )
            // InternalGuardin.g:2382:2: rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalGuardin.g:2389:1: rule__CompositePianoNote__Group__0__Impl : ( () ) ;
    public final void rule__CompositePianoNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2393:1: ( ( () ) )
            // InternalGuardin.g:2394:1: ( () )
            {
            // InternalGuardin.g:2394:1: ( () )
            // InternalGuardin.g:2395:2: ()
            {
             before(grammarAccess.getCompositePianoNoteAccess().getCompositeNoteAction_0()); 
            // InternalGuardin.g:2396:2: ()
            // InternalGuardin.g:2396:3: 
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
    // InternalGuardin.g:2404:1: rule__CompositePianoNote__Group__1 : rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2 ;
    public final void rule__CompositePianoNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2408:1: ( rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2 )
            // InternalGuardin.g:2409:2: rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalGuardin.g:2416:1: rule__CompositePianoNote__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositePianoNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2420:1: ( ( '(' ) )
            // InternalGuardin.g:2421:1: ( '(' )
            {
            // InternalGuardin.g:2421:1: ( '(' )
            // InternalGuardin.g:2422:2: '('
            {
             before(grammarAccess.getCompositePianoNoteAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGuardin.g:2431:1: rule__CompositePianoNote__Group__2 : rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3 ;
    public final void rule__CompositePianoNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2435:1: ( rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3 )
            // InternalGuardin.g:2436:2: rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalGuardin.g:2443:1: rule__CompositePianoNote__Group__2__Impl : ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) ) ;
    public final void rule__CompositePianoNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2447:1: ( ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2448:1: ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2448:1: ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2449:2: ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2449:2: ( ( rule__CompositePianoNote__NotesAssignment_2 ) )
            // InternalGuardin.g:2450:3: ( rule__CompositePianoNote__NotesAssignment_2 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2451:3: ( rule__CompositePianoNote__NotesAssignment_2 )
            // InternalGuardin.g:2451:4: rule__CompositePianoNote__NotesAssignment_2
            {
            pushFollow(FOLLOW_30);
            rule__CompositePianoNote__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2454:2: ( ( rule__CompositePianoNote__NotesAssignment_2 )* )
            // InternalGuardin.g:2455:3: ( rule__CompositePianoNote__NotesAssignment_2 )*
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2456:3: ( rule__CompositePianoNote__NotesAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=17 && LA19_0<=23)||LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGuardin.g:2456:4: rule__CompositePianoNote__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__CompositePianoNote__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalGuardin.g:2465:1: rule__CompositePianoNote__Group__3 : rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4 ;
    public final void rule__CompositePianoNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2469:1: ( rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4 )
            // InternalGuardin.g:2470:2: rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalGuardin.g:2477:1: rule__CompositePianoNote__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositePianoNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2481:1: ( ( ')' ) )
            // InternalGuardin.g:2482:1: ( ')' )
            {
            // InternalGuardin.g:2482:1: ( ')' )
            // InternalGuardin.g:2483:2: ')'
            {
             before(grammarAccess.getCompositePianoNoteAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGuardin.g:2492:1: rule__CompositePianoNote__Group__4 : rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5 ;
    public final void rule__CompositePianoNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2496:1: ( rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5 )
            // InternalGuardin.g:2497:2: rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalGuardin.g:2504:1: rule__CompositePianoNote__Group__4__Impl : ( 'x' ) ;
    public final void rule__CompositePianoNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2508:1: ( ( 'x' ) )
            // InternalGuardin.g:2509:1: ( 'x' )
            {
            // InternalGuardin.g:2509:1: ( 'x' )
            // InternalGuardin.g:2510:2: 'x'
            {
             before(grammarAccess.getCompositePianoNoteAccess().getXKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGuardin.g:2519:1: rule__CompositePianoNote__Group__5 : rule__CompositePianoNote__Group__5__Impl ;
    public final void rule__CompositePianoNote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2523:1: ( rule__CompositePianoNote__Group__5__Impl )
            // InternalGuardin.g:2524:2: rule__CompositePianoNote__Group__5__Impl
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
    // InternalGuardin.g:2530:1: rule__CompositePianoNote__Group__5__Impl : ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) ) ;
    public final void rule__CompositePianoNote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2534:1: ( ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) ) )
            // InternalGuardin.g:2535:1: ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) )
            {
            // InternalGuardin.g:2535:1: ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) )
            // InternalGuardin.g:2536:2: ( rule__CompositePianoNote__RepeatsAssignment_5 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getRepeatsAssignment_5()); 
            // InternalGuardin.g:2537:2: ( rule__CompositePianoNote__RepeatsAssignment_5 )
            // InternalGuardin.g:2537:3: rule__CompositePianoNote__RepeatsAssignment_5
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


    // $ANTLR start "rule__Music__NameAssignment_2"
    // InternalGuardin.g:2546:1: rule__Music__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Music__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2550:1: ( ( ruleEString ) )
            // InternalGuardin.g:2551:2: ( ruleEString )
            {
            // InternalGuardin.g:2551:2: ( ruleEString )
            // InternalGuardin.g:2552:3: ruleEString
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
    // InternalGuardin.g:2561:1: rule__Music__SectionsAssignment_6 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2565:1: ( ( ruleSection ) )
            // InternalGuardin.g:2566:2: ( ruleSection )
            {
            // InternalGuardin.g:2566:2: ( ruleSection )
            // InternalGuardin.g:2567:3: ruleSection
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
    // InternalGuardin.g:2576:1: rule__Music__SectionsAssignment_7 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2580:1: ( ( ruleSection ) )
            // InternalGuardin.g:2581:2: ( ruleSection )
            {
            // InternalGuardin.g:2581:2: ( ruleSection )
            // InternalGuardin.g:2582:3: ruleSection
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
    // InternalGuardin.g:2591:1: rule__Music__TracksAssignment_10_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2595:1: ( ( ruleTrack ) )
            // InternalGuardin.g:2596:2: ( ruleTrack )
            {
            // InternalGuardin.g:2596:2: ( ruleTrack )
            // InternalGuardin.g:2597:3: ruleTrack
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
    // InternalGuardin.g:2606:1: rule__Music__TracksAssignment_10_2_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2610:1: ( ( ruleTrack ) )
            // InternalGuardin.g:2611:2: ( ruleTrack )
            {
            // InternalGuardin.g:2611:2: ( ruleTrack )
            // InternalGuardin.g:2612:3: ruleTrack
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
    // InternalGuardin.g:2621:1: rule__Section__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2625:1: ( ( ruleEString ) )
            // InternalGuardin.g:2626:2: ( ruleEString )
            {
            // InternalGuardin.g:2626:2: ( ruleEString )
            // InternalGuardin.g:2627:3: ruleEString
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
    // InternalGuardin.g:2636:1: rule__Section__TempoAssignment_4 : ( ruleEInt ) ;
    public final void rule__Section__TempoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2640:1: ( ( ruleEInt ) )
            // InternalGuardin.g:2641:2: ( ruleEInt )
            {
            // InternalGuardin.g:2641:2: ( ruleEInt )
            // InternalGuardin.g:2642:3: ruleEInt
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
    // InternalGuardin.g:2651:1: rule__Section__SignatureAssignment_6 : ( ruleEInt ) ;
    public final void rule__Section__SignatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2655:1: ( ( ruleEInt ) )
            // InternalGuardin.g:2656:2: ( ruleEInt )
            {
            // InternalGuardin.g:2656:2: ( ruleEInt )
            // InternalGuardin.g:2657:3: ruleEInt
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
    // InternalGuardin.g:2666:1: rule__Section__BarsAssignment_8 : ( ruleEInt ) ;
    public final void rule__Section__BarsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2670:1: ( ( ruleEInt ) )
            // InternalGuardin.g:2671:2: ( ruleEInt )
            {
            // InternalGuardin.g:2671:2: ( ruleEInt )
            // InternalGuardin.g:2672:3: ruleEInt
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
    // InternalGuardin.g:2681:1: rule__Track__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Track__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2685:1: ( ( ruleEString ) )
            // InternalGuardin.g:2686:2: ( ruleEString )
            {
            // InternalGuardin.g:2686:2: ( ruleEString )
            // InternalGuardin.g:2687:3: ruleEString
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


    // $ANTLR start "rule__Track__InstrumentAssignment_2_0_1"
    // InternalGuardin.g:2696:1: rule__Track__InstrumentAssignment_2_0_1 : ( ruleBattery ) ;
    public final void rule__Track__InstrumentAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2700:1: ( ( ruleBattery ) )
            // InternalGuardin.g:2701:2: ( ruleBattery )
            {
            // InternalGuardin.g:2701:2: ( ruleBattery )
            // InternalGuardin.g:2702:3: ruleBattery
            {
             before(grammarAccess.getTrackAccess().getInstrumentBatteryParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBattery();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getInstrumentBatteryParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__InstrumentAssignment_2_0_1"


    // $ANTLR start "rule__Track__InstrumentAssignment_2_1_1"
    // InternalGuardin.g:2711:1: rule__Track__InstrumentAssignment_2_1_1 : ( rulePiano ) ;
    public final void rule__Track__InstrumentAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2715:1: ( ( rulePiano ) )
            // InternalGuardin.g:2716:2: ( rulePiano )
            {
            // InternalGuardin.g:2716:2: ( rulePiano )
            // InternalGuardin.g:2717:3: rulePiano
            {
             before(grammarAccess.getTrackAccess().getInstrumentPianoParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePiano();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getInstrumentPianoParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__InstrumentAssignment_2_1_1"


    // $ANTLR start "rule__Battery__NameAssignment_1_0"
    // InternalGuardin.g:2726:1: rule__Battery__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Battery__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2730:1: ( ( ruleEString ) )
            // InternalGuardin.g:2731:2: ( ruleEString )
            {
            // InternalGuardin.g:2731:2: ( ruleEString )
            // InternalGuardin.g:2732:3: ruleEString
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


    // $ANTLR start "rule__Battery__LayersAssignment_2"
    // InternalGuardin.g:2741:1: rule__Battery__LayersAssignment_2 : ( ruleBatteryLayer ) ;
    public final void rule__Battery__LayersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2745:1: ( ( ruleBatteryLayer ) )
            // InternalGuardin.g:2746:2: ( ruleBatteryLayer )
            {
            // InternalGuardin.g:2746:2: ( ruleBatteryLayer )
            // InternalGuardin.g:2747:3: ruleBatteryLayer
            {
             before(grammarAccess.getBatteryAccess().getLayersBatteryLayerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBatteryLayer();

            state._fsp--;

             after(grammarAccess.getBatteryAccess().getLayersBatteryLayerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Battery__LayersAssignment_2"


    // $ANTLR start "rule__BatteryLayer__NotesAssignment_2"
    // InternalGuardin.g:2756:1: rule__BatteryLayer__NotesAssignment_2 : ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) ) ;
    public final void rule__BatteryLayer__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2760:1: ( ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:2761:2: ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:2761:2: ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:2762:3: ( rule__BatteryLayer__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:2763:3: ( rule__BatteryLayer__NotesAlternatives_2_0 )
            // InternalGuardin.g:2763:4: rule__BatteryLayer__NotesAlternatives_2_0
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
    // InternalGuardin.g:2771:1: rule__BatteryNote__NoteTypeAssignment_1 : ( ruleBatteryNoteType ) ;
    public final void rule__BatteryNote__NoteTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2775:1: ( ( ruleBatteryNoteType ) )
            // InternalGuardin.g:2776:2: ( ruleBatteryNoteType )
            {
            // InternalGuardin.g:2776:2: ( ruleBatteryNoteType )
            // InternalGuardin.g:2777:3: ruleBatteryNoteType
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
    // InternalGuardin.g:2786:1: rule__CompositeBatteryNote__NotesAssignment_2 : ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) ) ;
    public final void rule__CompositeBatteryNote__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2790:1: ( ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:2791:2: ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:2791:2: ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:2792:3: ( rule__CompositeBatteryNote__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:2793:3: ( rule__CompositeBatteryNote__NotesAlternatives_2_0 )
            // InternalGuardin.g:2793:4: rule__CompositeBatteryNote__NotesAlternatives_2_0
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
    // InternalGuardin.g:2801:1: rule__CompositeBatteryNote__RepeatsAssignment_5 : ( ruleEInt ) ;
    public final void rule__CompositeBatteryNote__RepeatsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2805:1: ( ( ruleEInt ) )
            // InternalGuardin.g:2806:2: ( ruleEInt )
            {
            // InternalGuardin.g:2806:2: ( ruleEInt )
            // InternalGuardin.g:2807:3: ruleEInt
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


    // $ANTLR start "rule__Piano__NameAssignment_1_0"
    // InternalGuardin.g:2816:1: rule__Piano__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Piano__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2820:1: ( ( ruleEString ) )
            // InternalGuardin.g:2821:2: ( ruleEString )
            {
            // InternalGuardin.g:2821:2: ( ruleEString )
            // InternalGuardin.g:2822:3: ruleEString
            {
             before(grammarAccess.getPianoAccess().getNameEStringParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPianoAccess().getNameEStringParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__NameAssignment_1_0"


    // $ANTLR start "rule__Piano__LayersAssignment_2"
    // InternalGuardin.g:2831:1: rule__Piano__LayersAssignment_2 : ( rulePianoLayer ) ;
    public final void rule__Piano__LayersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2835:1: ( ( rulePianoLayer ) )
            // InternalGuardin.g:2836:2: ( rulePianoLayer )
            {
            // InternalGuardin.g:2836:2: ( rulePianoLayer )
            // InternalGuardin.g:2837:3: rulePianoLayer
            {
             before(grammarAccess.getPianoAccess().getLayersPianoLayerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePianoLayer();

            state._fsp--;

             after(grammarAccess.getPianoAccess().getLayersPianoLayerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piano__LayersAssignment_2"


    // $ANTLR start "rule__PianoLayer__NotesAssignment_2"
    // InternalGuardin.g:2846:1: rule__PianoLayer__NotesAssignment_2 : ( ( rule__PianoLayer__NotesAlternatives_2_0 ) ) ;
    public final void rule__PianoLayer__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2850:1: ( ( ( rule__PianoLayer__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:2851:2: ( ( rule__PianoLayer__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:2851:2: ( ( rule__PianoLayer__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:2852:3: ( rule__PianoLayer__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:2853:3: ( rule__PianoLayer__NotesAlternatives_2_0 )
            // InternalGuardin.g:2853:4: rule__PianoLayer__NotesAlternatives_2_0
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
    // InternalGuardin.g:2861:1: rule__PianoNote__NoteTypeAssignment_1 : ( rulePianoNoteType ) ;
    public final void rule__PianoNote__NoteTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2865:1: ( ( rulePianoNoteType ) )
            // InternalGuardin.g:2866:2: ( rulePianoNoteType )
            {
            // InternalGuardin.g:2866:2: ( rulePianoNoteType )
            // InternalGuardin.g:2867:3: rulePianoNoteType
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


    // $ANTLR start "rule__CompositePianoNote__NotesAssignment_2"
    // InternalGuardin.g:2876:1: rule__CompositePianoNote__NotesAssignment_2 : ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) ) ;
    public final void rule__CompositePianoNote__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2880:1: ( ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:2881:2: ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:2881:2: ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:2882:3: ( rule__CompositePianoNote__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:2883:3: ( rule__CompositePianoNote__NotesAlternatives_2_0 )
            // InternalGuardin.g:2883:4: rule__CompositePianoNote__NotesAlternatives_2_0
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
    // InternalGuardin.g:2891:1: rule__CompositePianoNote__RepeatsAssignment_5 : ( ruleEInt ) ;
    public final void rule__CompositePianoNote__RepeatsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2895:1: ( ( ruleEInt ) )
            // InternalGuardin.g:2896:2: ( ruleEInt )
            {
            // InternalGuardin.g:2896:2: ( ruleEInt )
            // InternalGuardin.g:2897:3: ruleEInt
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000300000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000062L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000140001F800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000140001F802L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000040001F800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000040001F802L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001400FE0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001400FE0002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400FE0000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400FE0002L});

}