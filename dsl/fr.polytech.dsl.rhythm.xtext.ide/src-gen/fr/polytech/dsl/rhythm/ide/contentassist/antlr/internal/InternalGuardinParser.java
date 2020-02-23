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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'Music'", "':'", "'sections'", "'tracks'", "'-'", "'tempo='", "'signature='", "'bars='", "'battery:'", "'piano:'", "'$'", "'layer:'", "'('", "')'", "'x'", "'/'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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


    // $ANTLR start "entryRuleERelativeInt"
    // InternalGuardin.g:378:1: entryRuleERelativeInt : ruleERelativeInt EOF ;
    public final void entryRuleERelativeInt() throws RecognitionException {
        try {
            // InternalGuardin.g:379:1: ( ruleERelativeInt EOF )
            // InternalGuardin.g:380:1: ruleERelativeInt EOF
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
    // InternalGuardin.g:387:1: ruleERelativeInt : ( ( rule__ERelativeInt__Group__0 ) ) ;
    public final void ruleERelativeInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:391:2: ( ( ( rule__ERelativeInt__Group__0 ) ) )
            // InternalGuardin.g:392:2: ( ( rule__ERelativeInt__Group__0 ) )
            {
            // InternalGuardin.g:392:2: ( ( rule__ERelativeInt__Group__0 ) )
            // InternalGuardin.g:393:3: ( rule__ERelativeInt__Group__0 )
            {
             before(grammarAccess.getERelativeIntAccess().getGroup()); 
            // InternalGuardin.g:394:3: ( rule__ERelativeInt__Group__0 )
            // InternalGuardin.g:394:4: rule__ERelativeInt__Group__0
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
    // InternalGuardin.g:403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGuardin.g:404:1: ( ruleEString EOF )
            // InternalGuardin.g:405:1: ruleEString EOF
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
    // InternalGuardin.g:412:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:416:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalGuardin.g:417:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalGuardin.g:417:2: ( ( rule__EString__Alternatives ) )
            // InternalGuardin.g:418:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalGuardin.g:419:3: ( rule__EString__Alternatives )
            // InternalGuardin.g:419:4: rule__EString__Alternatives
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
    // InternalGuardin.g:428:1: ruleBatteryNoteType : ( ( rule__BatteryNoteType__Alternatives ) ) ;
    public final void ruleBatteryNoteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:432:1: ( ( ( rule__BatteryNoteType__Alternatives ) ) )
            // InternalGuardin.g:433:2: ( ( rule__BatteryNoteType__Alternatives ) )
            {
            // InternalGuardin.g:433:2: ( ( rule__BatteryNoteType__Alternatives ) )
            // InternalGuardin.g:434:3: ( rule__BatteryNoteType__Alternatives )
            {
             before(grammarAccess.getBatteryNoteTypeAccess().getAlternatives()); 
            // InternalGuardin.g:435:3: ( rule__BatteryNoteType__Alternatives )
            // InternalGuardin.g:435:4: rule__BatteryNoteType__Alternatives
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
    // InternalGuardin.g:444:1: rulePianoNoteType : ( ( rule__PianoNoteType__Alternatives ) ) ;
    public final void rulePianoNoteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:448:1: ( ( ( rule__PianoNoteType__Alternatives ) ) )
            // InternalGuardin.g:449:2: ( ( rule__PianoNoteType__Alternatives ) )
            {
            // InternalGuardin.g:449:2: ( ( rule__PianoNoteType__Alternatives ) )
            // InternalGuardin.g:450:3: ( rule__PianoNoteType__Alternatives )
            {
             before(grammarAccess.getPianoNoteTypeAccess().getAlternatives()); 
            // InternalGuardin.g:451:3: ( rule__PianoNoteType__Alternatives )
            // InternalGuardin.g:451:4: rule__PianoNoteType__Alternatives
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
    // InternalGuardin.g:459:1: rule__Track__Alternatives_2 : ( ( ( rule__Track__Group_2_0__0 ) ) | ( ( rule__Track__Group_2_1__0 ) ) );
    public final void rule__Track__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:463:1: ( ( ( rule__Track__Group_2_0__0 ) ) | ( ( rule__Track__Group_2_1__0 ) ) )
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
                    // InternalGuardin.g:464:2: ( ( rule__Track__Group_2_0__0 ) )
                    {
                    // InternalGuardin.g:464:2: ( ( rule__Track__Group_2_0__0 ) )
                    // InternalGuardin.g:465:3: ( rule__Track__Group_2_0__0 )
                    {
                     before(grammarAccess.getTrackAccess().getGroup_2_0()); 
                    // InternalGuardin.g:466:3: ( rule__Track__Group_2_0__0 )
                    // InternalGuardin.g:466:4: rule__Track__Group_2_0__0
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
                    // InternalGuardin.g:470:2: ( ( rule__Track__Group_2_1__0 ) )
                    {
                    // InternalGuardin.g:470:2: ( ( rule__Track__Group_2_1__0 ) )
                    // InternalGuardin.g:471:3: ( rule__Track__Group_2_1__0 )
                    {
                     before(grammarAccess.getTrackAccess().getGroup_2_1()); 
                    // InternalGuardin.g:472:3: ( rule__Track__Group_2_1__0 )
                    // InternalGuardin.g:472:4: rule__Track__Group_2_1__0
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
    // InternalGuardin.g:480:1: rule__BatteryLayer__NotesAlternatives_2_0 : ( ( ruleBatteryNote ) | ( ruleEmptyNote ) | ( ruleCompositeBatteryNote ) );
    public final void rule__BatteryLayer__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:484:1: ( ( ruleBatteryNote ) | ( ruleEmptyNote ) | ( ruleCompositeBatteryNote ) )
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
                    // InternalGuardin.g:485:2: ( ruleBatteryNote )
                    {
                    // InternalGuardin.g:485:2: ( ruleBatteryNote )
                    // InternalGuardin.g:486:3: ruleBatteryNote
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
                    // InternalGuardin.g:491:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:491:2: ( ruleEmptyNote )
                    // InternalGuardin.g:492:3: ruleEmptyNote
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
                    // InternalGuardin.g:497:2: ( ruleCompositeBatteryNote )
                    {
                    // InternalGuardin.g:497:2: ( ruleCompositeBatteryNote )
                    // InternalGuardin.g:498:3: ruleCompositeBatteryNote
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
    // InternalGuardin.g:507:1: rule__CompositeBatteryNote__NotesAlternatives_2_0 : ( ( ruleBatteryNote ) | ( ruleEmptyNote ) );
    public final void rule__CompositeBatteryNote__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:511:1: ( ( ruleBatteryNote ) | ( ruleEmptyNote ) )
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
                    // InternalGuardin.g:512:2: ( ruleBatteryNote )
                    {
                    // InternalGuardin.g:512:2: ( ruleBatteryNote )
                    // InternalGuardin.g:513:3: ruleBatteryNote
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
                    // InternalGuardin.g:518:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:518:2: ( ruleEmptyNote )
                    // InternalGuardin.g:519:3: ruleEmptyNote
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
    // InternalGuardin.g:528:1: rule__PianoLayer__NotesAlternatives_2_0 : ( ( rulePianoNote ) | ( ruleEmptyNote ) | ( ruleCompositePianoNote ) );
    public final void rule__PianoLayer__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:532:1: ( ( rulePianoNote ) | ( ruleEmptyNote ) | ( ruleCompositePianoNote ) )
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
                    // InternalGuardin.g:533:2: ( rulePianoNote )
                    {
                    // InternalGuardin.g:533:2: ( rulePianoNote )
                    // InternalGuardin.g:534:3: rulePianoNote
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
                    // InternalGuardin.g:539:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:539:2: ( ruleEmptyNote )
                    // InternalGuardin.g:540:3: ruleEmptyNote
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
                    // InternalGuardin.g:545:2: ( ruleCompositePianoNote )
                    {
                    // InternalGuardin.g:545:2: ( ruleCompositePianoNote )
                    // InternalGuardin.g:546:3: ruleCompositePianoNote
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
    // InternalGuardin.g:555:1: rule__CompositePianoNote__NotesAlternatives_2_0 : ( ( rulePianoNote ) | ( ruleEmptyNote ) );
    public final void rule__CompositePianoNote__NotesAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:559:1: ( ( rulePianoNote ) | ( ruleEmptyNote ) )
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
                    // InternalGuardin.g:560:2: ( rulePianoNote )
                    {
                    // InternalGuardin.g:560:2: ( rulePianoNote )
                    // InternalGuardin.g:561:3: rulePianoNote
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
                    // InternalGuardin.g:566:2: ( ruleEmptyNote )
                    {
                    // InternalGuardin.g:566:2: ( ruleEmptyNote )
                    // InternalGuardin.g:567:3: ruleEmptyNote
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
    // InternalGuardin.g:576:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:580:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalGuardin.g:581:2: ( RULE_STRING )
                    {
                    // InternalGuardin.g:581:2: ( RULE_STRING )
                    // InternalGuardin.g:582:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:587:2: ( RULE_ID )
                    {
                    // InternalGuardin.g:587:2: ( RULE_ID )
                    // InternalGuardin.g:588:3: RULE_ID
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
    // InternalGuardin.g:597:1: rule__BatteryNoteType__Alternatives : ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) );
    public final void rule__BatteryNoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:601:1: ( ( ( 'bd' ) ) | ( ( 'ch' ) ) | ( ( 'cc' ) ) | ( ( 'oh' ) ) | ( ( 'rc' ) ) | ( ( 'sd' ) ) )
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
                    // InternalGuardin.g:602:2: ( ( 'bd' ) )
                    {
                    // InternalGuardin.g:602:2: ( ( 'bd' ) )
                    // InternalGuardin.g:603:3: ( 'bd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:604:3: ( 'bd' )
                    // InternalGuardin.g:604:4: 'bd'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:608:2: ( ( 'ch' ) )
                    {
                    // InternalGuardin.g:608:2: ( ( 'ch' ) )
                    // InternalGuardin.g:609:3: ( 'ch' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:610:3: ( 'ch' )
                    // InternalGuardin.g:610:4: 'ch'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:614:2: ( ( 'cc' ) )
                    {
                    // InternalGuardin.g:614:2: ( ( 'cc' ) )
                    // InternalGuardin.g:615:3: ( 'cc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:616:3: ( 'cc' )
                    // InternalGuardin.g:616:4: 'cc'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:620:2: ( ( 'oh' ) )
                    {
                    // InternalGuardin.g:620:2: ( ( 'oh' ) )
                    // InternalGuardin.g:621:3: ( 'oh' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:622:3: ( 'oh' )
                    // InternalGuardin.g:622:4: 'oh'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:626:2: ( ( 'rc' ) )
                    {
                    // InternalGuardin.g:626:2: ( ( 'rc' ) )
                    // InternalGuardin.g:627:3: ( 'rc' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:628:3: ( 'rc' )
                    // InternalGuardin.g:628:4: 'rc'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:632:2: ( ( 'sd' ) )
                    {
                    // InternalGuardin.g:632:2: ( ( 'sd' ) )
                    // InternalGuardin.g:633:3: ( 'sd' )
                    {
                     before(grammarAccess.getBatteryNoteTypeAccess().getSNARE_DRUMEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:634:3: ( 'sd' )
                    // InternalGuardin.g:634:4: 'sd'
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
    // InternalGuardin.g:642:1: rule__PianoNoteType__Alternatives : ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) );
    public final void rule__PianoNoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:646:1: ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) )
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
                    // InternalGuardin.g:647:2: ( ( 'A' ) )
                    {
                    // InternalGuardin.g:647:2: ( ( 'A' ) )
                    // InternalGuardin.g:648:3: ( 'A' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0()); 
                    // InternalGuardin.g:649:3: ( 'A' )
                    // InternalGuardin.g:649:4: 'A'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:653:2: ( ( 'B' ) )
                    {
                    // InternalGuardin.g:653:2: ( ( 'B' ) )
                    // InternalGuardin.g:654:3: ( 'B' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1()); 
                    // InternalGuardin.g:655:3: ( 'B' )
                    // InternalGuardin.g:655:4: 'B'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:659:2: ( ( 'C' ) )
                    {
                    // InternalGuardin.g:659:2: ( ( 'C' ) )
                    // InternalGuardin.g:660:3: ( 'C' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2()); 
                    // InternalGuardin.g:661:3: ( 'C' )
                    // InternalGuardin.g:661:4: 'C'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:665:2: ( ( 'D' ) )
                    {
                    // InternalGuardin.g:665:2: ( ( 'D' ) )
                    // InternalGuardin.g:666:3: ( 'D' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalGuardin.g:667:3: ( 'D' )
                    // InternalGuardin.g:667:4: 'D'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:671:2: ( ( 'E' ) )
                    {
                    // InternalGuardin.g:671:2: ( ( 'E' ) )
                    // InternalGuardin.g:672:3: ( 'E' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalGuardin.g:673:3: ( 'E' )
                    // InternalGuardin.g:673:4: 'E'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:677:2: ( ( 'F' ) )
                    {
                    // InternalGuardin.g:677:2: ( ( 'F' ) )
                    // InternalGuardin.g:678:3: ( 'F' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5()); 
                    // InternalGuardin.g:679:3: ( 'F' )
                    // InternalGuardin.g:679:4: 'F'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:683:2: ( ( 'G' ) )
                    {
                    // InternalGuardin.g:683:2: ( ( 'G' ) )
                    // InternalGuardin.g:684:3: ( 'G' )
                    {
                     before(grammarAccess.getPianoNoteTypeAccess().getGEnumLiteralDeclaration_6()); 
                    // InternalGuardin.g:685:3: ( 'G' )
                    // InternalGuardin.g:685:4: 'G'
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
    // InternalGuardin.g:693:1: rule__Music__Group__0 : rule__Music__Group__0__Impl rule__Music__Group__1 ;
    public final void rule__Music__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:697:1: ( rule__Music__Group__0__Impl rule__Music__Group__1 )
            // InternalGuardin.g:698:2: rule__Music__Group__0__Impl rule__Music__Group__1
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
    // InternalGuardin.g:705:1: rule__Music__Group__0__Impl : ( () ) ;
    public final void rule__Music__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:709:1: ( ( () ) )
            // InternalGuardin.g:710:1: ( () )
            {
            // InternalGuardin.g:710:1: ( () )
            // InternalGuardin.g:711:2: ()
            {
             before(grammarAccess.getMusicAccess().getMusicAction_0()); 
            // InternalGuardin.g:712:2: ()
            // InternalGuardin.g:712:3: 
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
    // InternalGuardin.g:720:1: rule__Music__Group__1 : rule__Music__Group__1__Impl rule__Music__Group__2 ;
    public final void rule__Music__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:724:1: ( rule__Music__Group__1__Impl rule__Music__Group__2 )
            // InternalGuardin.g:725:2: rule__Music__Group__1__Impl rule__Music__Group__2
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
    // InternalGuardin.g:732:1: rule__Music__Group__1__Impl : ( 'Music' ) ;
    public final void rule__Music__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:736:1: ( ( 'Music' ) )
            // InternalGuardin.g:737:1: ( 'Music' )
            {
            // InternalGuardin.g:737:1: ( 'Music' )
            // InternalGuardin.g:738:2: 'Music'
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
    // InternalGuardin.g:747:1: rule__Music__Group__2 : rule__Music__Group__2__Impl rule__Music__Group__3 ;
    public final void rule__Music__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:751:1: ( rule__Music__Group__2__Impl rule__Music__Group__3 )
            // InternalGuardin.g:752:2: rule__Music__Group__2__Impl rule__Music__Group__3
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
    // InternalGuardin.g:759:1: rule__Music__Group__2__Impl : ( ( rule__Music__NameAssignment_2 ) ) ;
    public final void rule__Music__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:763:1: ( ( ( rule__Music__NameAssignment_2 ) ) )
            // InternalGuardin.g:764:1: ( ( rule__Music__NameAssignment_2 ) )
            {
            // InternalGuardin.g:764:1: ( ( rule__Music__NameAssignment_2 ) )
            // InternalGuardin.g:765:2: ( rule__Music__NameAssignment_2 )
            {
             before(grammarAccess.getMusicAccess().getNameAssignment_2()); 
            // InternalGuardin.g:766:2: ( rule__Music__NameAssignment_2 )
            // InternalGuardin.g:766:3: rule__Music__NameAssignment_2
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
    // InternalGuardin.g:774:1: rule__Music__Group__3 : rule__Music__Group__3__Impl rule__Music__Group__4 ;
    public final void rule__Music__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:778:1: ( rule__Music__Group__3__Impl rule__Music__Group__4 )
            // InternalGuardin.g:779:2: rule__Music__Group__3__Impl rule__Music__Group__4
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
    // InternalGuardin.g:786:1: rule__Music__Group__3__Impl : ( ':' ) ;
    public final void rule__Music__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:790:1: ( ( ':' ) )
            // InternalGuardin.g:791:1: ( ':' )
            {
            // InternalGuardin.g:791:1: ( ':' )
            // InternalGuardin.g:792:2: ':'
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
    // InternalGuardin.g:801:1: rule__Music__Group__4 : rule__Music__Group__4__Impl rule__Music__Group__5 ;
    public final void rule__Music__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:805:1: ( rule__Music__Group__4__Impl rule__Music__Group__5 )
            // InternalGuardin.g:806:2: rule__Music__Group__4__Impl rule__Music__Group__5
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
    // InternalGuardin.g:813:1: rule__Music__Group__4__Impl : ( 'sections' ) ;
    public final void rule__Music__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:817:1: ( ( 'sections' ) )
            // InternalGuardin.g:818:1: ( 'sections' )
            {
            // InternalGuardin.g:818:1: ( 'sections' )
            // InternalGuardin.g:819:2: 'sections'
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
    // InternalGuardin.g:828:1: rule__Music__Group__5 : rule__Music__Group__5__Impl rule__Music__Group__6 ;
    public final void rule__Music__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:832:1: ( rule__Music__Group__5__Impl rule__Music__Group__6 )
            // InternalGuardin.g:833:2: rule__Music__Group__5__Impl rule__Music__Group__6
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
    // InternalGuardin.g:840:1: rule__Music__Group__5__Impl : ( ':' ) ;
    public final void rule__Music__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:844:1: ( ( ':' ) )
            // InternalGuardin.g:845:1: ( ':' )
            {
            // InternalGuardin.g:845:1: ( ':' )
            // InternalGuardin.g:846:2: ':'
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
    // InternalGuardin.g:855:1: rule__Music__Group__6 : rule__Music__Group__6__Impl rule__Music__Group__7 ;
    public final void rule__Music__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:859:1: ( rule__Music__Group__6__Impl rule__Music__Group__7 )
            // InternalGuardin.g:860:2: rule__Music__Group__6__Impl rule__Music__Group__7
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
    // InternalGuardin.g:867:1: rule__Music__Group__6__Impl : ( ( rule__Music__SectionsAssignment_6 ) ) ;
    public final void rule__Music__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:871:1: ( ( ( rule__Music__SectionsAssignment_6 ) ) )
            // InternalGuardin.g:872:1: ( ( rule__Music__SectionsAssignment_6 ) )
            {
            // InternalGuardin.g:872:1: ( ( rule__Music__SectionsAssignment_6 ) )
            // InternalGuardin.g:873:2: ( rule__Music__SectionsAssignment_6 )
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_6()); 
            // InternalGuardin.g:874:2: ( rule__Music__SectionsAssignment_6 )
            // InternalGuardin.g:874:3: rule__Music__SectionsAssignment_6
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
    // InternalGuardin.g:882:1: rule__Music__Group__7 : rule__Music__Group__7__Impl rule__Music__Group__8 ;
    public final void rule__Music__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:886:1: ( rule__Music__Group__7__Impl rule__Music__Group__8 )
            // InternalGuardin.g:887:2: rule__Music__Group__7__Impl rule__Music__Group__8
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
    // InternalGuardin.g:894:1: rule__Music__Group__7__Impl : ( ( rule__Music__SectionsAssignment_7 )* ) ;
    public final void rule__Music__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:898:1: ( ( ( rule__Music__SectionsAssignment_7 )* ) )
            // InternalGuardin.g:899:1: ( ( rule__Music__SectionsAssignment_7 )* )
            {
            // InternalGuardin.g:899:1: ( ( rule__Music__SectionsAssignment_7 )* )
            // InternalGuardin.g:900:2: ( rule__Music__SectionsAssignment_7 )*
            {
             before(grammarAccess.getMusicAccess().getSectionsAssignment_7()); 
            // InternalGuardin.g:901:2: ( rule__Music__SectionsAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGuardin.g:901:3: rule__Music__SectionsAssignment_7
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
    // InternalGuardin.g:909:1: rule__Music__Group__8 : rule__Music__Group__8__Impl rule__Music__Group__9 ;
    public final void rule__Music__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:913:1: ( rule__Music__Group__8__Impl rule__Music__Group__9 )
            // InternalGuardin.g:914:2: rule__Music__Group__8__Impl rule__Music__Group__9
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
    // InternalGuardin.g:921:1: rule__Music__Group__8__Impl : ( 'tracks' ) ;
    public final void rule__Music__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:925:1: ( ( 'tracks' ) )
            // InternalGuardin.g:926:1: ( 'tracks' )
            {
            // InternalGuardin.g:926:1: ( 'tracks' )
            // InternalGuardin.g:927:2: 'tracks'
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
    // InternalGuardin.g:936:1: rule__Music__Group__9 : rule__Music__Group__9__Impl rule__Music__Group__10 ;
    public final void rule__Music__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:940:1: ( rule__Music__Group__9__Impl rule__Music__Group__10 )
            // InternalGuardin.g:941:2: rule__Music__Group__9__Impl rule__Music__Group__10
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
    // InternalGuardin.g:948:1: rule__Music__Group__9__Impl : ( ':' ) ;
    public final void rule__Music__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:952:1: ( ( ':' ) )
            // InternalGuardin.g:953:1: ( ':' )
            {
            // InternalGuardin.g:953:1: ( ':' )
            // InternalGuardin.g:954:2: ':'
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
    // InternalGuardin.g:963:1: rule__Music__Group__10 : rule__Music__Group__10__Impl ;
    public final void rule__Music__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:967:1: ( rule__Music__Group__10__Impl )
            // InternalGuardin.g:968:2: rule__Music__Group__10__Impl
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
    // InternalGuardin.g:974:1: rule__Music__Group__10__Impl : ( ( rule__Music__Group_10__0 ) ) ;
    public final void rule__Music__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:978:1: ( ( ( rule__Music__Group_10__0 ) ) )
            // InternalGuardin.g:979:1: ( ( rule__Music__Group_10__0 ) )
            {
            // InternalGuardin.g:979:1: ( ( rule__Music__Group_10__0 ) )
            // InternalGuardin.g:980:2: ( rule__Music__Group_10__0 )
            {
             before(grammarAccess.getMusicAccess().getGroup_10()); 
            // InternalGuardin.g:981:2: ( rule__Music__Group_10__0 )
            // InternalGuardin.g:981:3: rule__Music__Group_10__0
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
    // InternalGuardin.g:990:1: rule__Music__Group_10__0 : rule__Music__Group_10__0__Impl rule__Music__Group_10__1 ;
    public final void rule__Music__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:994:1: ( rule__Music__Group_10__0__Impl rule__Music__Group_10__1 )
            // InternalGuardin.g:995:2: rule__Music__Group_10__0__Impl rule__Music__Group_10__1
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
    // InternalGuardin.g:1002:1: rule__Music__Group_10__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1006:1: ( ( '-' ) )
            // InternalGuardin.g:1007:1: ( '-' )
            {
            // InternalGuardin.g:1007:1: ( '-' )
            // InternalGuardin.g:1008:2: '-'
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
    // InternalGuardin.g:1017:1: rule__Music__Group_10__1 : rule__Music__Group_10__1__Impl rule__Music__Group_10__2 ;
    public final void rule__Music__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1021:1: ( rule__Music__Group_10__1__Impl rule__Music__Group_10__2 )
            // InternalGuardin.g:1022:2: rule__Music__Group_10__1__Impl rule__Music__Group_10__2
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
    // InternalGuardin.g:1029:1: rule__Music__Group_10__1__Impl : ( ( rule__Music__TracksAssignment_10_1 ) ) ;
    public final void rule__Music__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1033:1: ( ( ( rule__Music__TracksAssignment_10_1 ) ) )
            // InternalGuardin.g:1034:1: ( ( rule__Music__TracksAssignment_10_1 ) )
            {
            // InternalGuardin.g:1034:1: ( ( rule__Music__TracksAssignment_10_1 ) )
            // InternalGuardin.g:1035:2: ( rule__Music__TracksAssignment_10_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_10_1()); 
            // InternalGuardin.g:1036:2: ( rule__Music__TracksAssignment_10_1 )
            // InternalGuardin.g:1036:3: rule__Music__TracksAssignment_10_1
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
    // InternalGuardin.g:1044:1: rule__Music__Group_10__2 : rule__Music__Group_10__2__Impl ;
    public final void rule__Music__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1048:1: ( rule__Music__Group_10__2__Impl )
            // InternalGuardin.g:1049:2: rule__Music__Group_10__2__Impl
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
    // InternalGuardin.g:1055:1: rule__Music__Group_10__2__Impl : ( ( rule__Music__Group_10_2__0 )* ) ;
    public final void rule__Music__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1059:1: ( ( ( rule__Music__Group_10_2__0 )* ) )
            // InternalGuardin.g:1060:1: ( ( rule__Music__Group_10_2__0 )* )
            {
            // InternalGuardin.g:1060:1: ( ( rule__Music__Group_10_2__0 )* )
            // InternalGuardin.g:1061:2: ( rule__Music__Group_10_2__0 )*
            {
             before(grammarAccess.getMusicAccess().getGroup_10_2()); 
            // InternalGuardin.g:1062:2: ( rule__Music__Group_10_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGuardin.g:1062:3: rule__Music__Group_10_2__0
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
    // InternalGuardin.g:1071:1: rule__Music__Group_10_2__0 : rule__Music__Group_10_2__0__Impl rule__Music__Group_10_2__1 ;
    public final void rule__Music__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1075:1: ( rule__Music__Group_10_2__0__Impl rule__Music__Group_10_2__1 )
            // InternalGuardin.g:1076:2: rule__Music__Group_10_2__0__Impl rule__Music__Group_10_2__1
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
    // InternalGuardin.g:1083:1: rule__Music__Group_10_2__0__Impl : ( '-' ) ;
    public final void rule__Music__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1087:1: ( ( '-' ) )
            // InternalGuardin.g:1088:1: ( '-' )
            {
            // InternalGuardin.g:1088:1: ( '-' )
            // InternalGuardin.g:1089:2: '-'
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
    // InternalGuardin.g:1098:1: rule__Music__Group_10_2__1 : rule__Music__Group_10_2__1__Impl ;
    public final void rule__Music__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1102:1: ( rule__Music__Group_10_2__1__Impl )
            // InternalGuardin.g:1103:2: rule__Music__Group_10_2__1__Impl
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
    // InternalGuardin.g:1109:1: rule__Music__Group_10_2__1__Impl : ( ( rule__Music__TracksAssignment_10_2_1 ) ) ;
    public final void rule__Music__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1113:1: ( ( ( rule__Music__TracksAssignment_10_2_1 ) ) )
            // InternalGuardin.g:1114:1: ( ( rule__Music__TracksAssignment_10_2_1 ) )
            {
            // InternalGuardin.g:1114:1: ( ( rule__Music__TracksAssignment_10_2_1 ) )
            // InternalGuardin.g:1115:2: ( rule__Music__TracksAssignment_10_2_1 )
            {
             before(grammarAccess.getMusicAccess().getTracksAssignment_10_2_1()); 
            // InternalGuardin.g:1116:2: ( rule__Music__TracksAssignment_10_2_1 )
            // InternalGuardin.g:1116:3: rule__Music__TracksAssignment_10_2_1
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
    // InternalGuardin.g:1125:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1129:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalGuardin.g:1130:2: rule__Section__Group__0__Impl rule__Section__Group__1
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
    // InternalGuardin.g:1137:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1141:1: ( ( () ) )
            // InternalGuardin.g:1142:1: ( () )
            {
            // InternalGuardin.g:1142:1: ( () )
            // InternalGuardin.g:1143:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalGuardin.g:1144:2: ()
            // InternalGuardin.g:1144:3: 
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
    // InternalGuardin.g:1152:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1156:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalGuardin.g:1157:2: rule__Section__Group__1__Impl rule__Section__Group__2
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
    // InternalGuardin.g:1164:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1168:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalGuardin.g:1169:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalGuardin.g:1169:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalGuardin.g:1170:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalGuardin.g:1171:2: ( rule__Section__NameAssignment_1 )
            // InternalGuardin.g:1171:3: rule__Section__NameAssignment_1
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
    // InternalGuardin.g:1179:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1183:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalGuardin.g:1184:2: rule__Section__Group__2__Impl rule__Section__Group__3
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
    // InternalGuardin.g:1191:1: rule__Section__Group__2__Impl : ( ':' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1195:1: ( ( ':' ) )
            // InternalGuardin.g:1196:1: ( ':' )
            {
            // InternalGuardin.g:1196:1: ( ':' )
            // InternalGuardin.g:1197:2: ':'
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
    // InternalGuardin.g:1206:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1210:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalGuardin.g:1211:2: rule__Section__Group__3__Impl rule__Section__Group__4
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
    // InternalGuardin.g:1218:1: rule__Section__Group__3__Impl : ( 'tempo=' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1222:1: ( ( 'tempo=' ) )
            // InternalGuardin.g:1223:1: ( 'tempo=' )
            {
            // InternalGuardin.g:1223:1: ( 'tempo=' )
            // InternalGuardin.g:1224:2: 'tempo='
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
    // InternalGuardin.g:1233:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1237:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalGuardin.g:1238:2: rule__Section__Group__4__Impl rule__Section__Group__5
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
    // InternalGuardin.g:1245:1: rule__Section__Group__4__Impl : ( ( rule__Section__TempoAssignment_4 ) ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1249:1: ( ( ( rule__Section__TempoAssignment_4 ) ) )
            // InternalGuardin.g:1250:1: ( ( rule__Section__TempoAssignment_4 ) )
            {
            // InternalGuardin.g:1250:1: ( ( rule__Section__TempoAssignment_4 ) )
            // InternalGuardin.g:1251:2: ( rule__Section__TempoAssignment_4 )
            {
             before(grammarAccess.getSectionAccess().getTempoAssignment_4()); 
            // InternalGuardin.g:1252:2: ( rule__Section__TempoAssignment_4 )
            // InternalGuardin.g:1252:3: rule__Section__TempoAssignment_4
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
    // InternalGuardin.g:1260:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1264:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalGuardin.g:1265:2: rule__Section__Group__5__Impl rule__Section__Group__6
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
    // InternalGuardin.g:1272:1: rule__Section__Group__5__Impl : ( 'signature=' ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1276:1: ( ( 'signature=' ) )
            // InternalGuardin.g:1277:1: ( 'signature=' )
            {
            // InternalGuardin.g:1277:1: ( 'signature=' )
            // InternalGuardin.g:1278:2: 'signature='
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
    // InternalGuardin.g:1287:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1291:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalGuardin.g:1292:2: rule__Section__Group__6__Impl rule__Section__Group__7
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
    // InternalGuardin.g:1299:1: rule__Section__Group__6__Impl : ( ( rule__Section__SignatureAssignment_6 ) ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1303:1: ( ( ( rule__Section__SignatureAssignment_6 ) ) )
            // InternalGuardin.g:1304:1: ( ( rule__Section__SignatureAssignment_6 ) )
            {
            // InternalGuardin.g:1304:1: ( ( rule__Section__SignatureAssignment_6 ) )
            // InternalGuardin.g:1305:2: ( rule__Section__SignatureAssignment_6 )
            {
             before(grammarAccess.getSectionAccess().getSignatureAssignment_6()); 
            // InternalGuardin.g:1306:2: ( rule__Section__SignatureAssignment_6 )
            // InternalGuardin.g:1306:3: rule__Section__SignatureAssignment_6
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
    // InternalGuardin.g:1314:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1318:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalGuardin.g:1319:2: rule__Section__Group__7__Impl rule__Section__Group__8
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
    // InternalGuardin.g:1326:1: rule__Section__Group__7__Impl : ( 'bars=' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1330:1: ( ( 'bars=' ) )
            // InternalGuardin.g:1331:1: ( 'bars=' )
            {
            // InternalGuardin.g:1331:1: ( 'bars=' )
            // InternalGuardin.g:1332:2: 'bars='
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
    // InternalGuardin.g:1341:1: rule__Section__Group__8 : rule__Section__Group__8__Impl ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1345:1: ( rule__Section__Group__8__Impl )
            // InternalGuardin.g:1346:2: rule__Section__Group__8__Impl
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
    // InternalGuardin.g:1352:1: rule__Section__Group__8__Impl : ( ( rule__Section__BarsAssignment_8 ) ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1356:1: ( ( ( rule__Section__BarsAssignment_8 ) ) )
            // InternalGuardin.g:1357:1: ( ( rule__Section__BarsAssignment_8 ) )
            {
            // InternalGuardin.g:1357:1: ( ( rule__Section__BarsAssignment_8 ) )
            // InternalGuardin.g:1358:2: ( rule__Section__BarsAssignment_8 )
            {
             before(grammarAccess.getSectionAccess().getBarsAssignment_8()); 
            // InternalGuardin.g:1359:2: ( rule__Section__BarsAssignment_8 )
            // InternalGuardin.g:1359:3: rule__Section__BarsAssignment_8
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
    // InternalGuardin.g:1368:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1372:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // InternalGuardin.g:1373:2: rule__Track__Group__0__Impl rule__Track__Group__1
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
    // InternalGuardin.g:1380:1: rule__Track__Group__0__Impl : ( () ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1384:1: ( ( () ) )
            // InternalGuardin.g:1385:1: ( () )
            {
            // InternalGuardin.g:1385:1: ( () )
            // InternalGuardin.g:1386:2: ()
            {
             before(grammarAccess.getTrackAccess().getTrackAction_0()); 
            // InternalGuardin.g:1387:2: ()
            // InternalGuardin.g:1387:3: 
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
    // InternalGuardin.g:1395:1: rule__Track__Group__1 : rule__Track__Group__1__Impl rule__Track__Group__2 ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1399:1: ( rule__Track__Group__1__Impl rule__Track__Group__2 )
            // InternalGuardin.g:1400:2: rule__Track__Group__1__Impl rule__Track__Group__2
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
    // InternalGuardin.g:1407:1: rule__Track__Group__1__Impl : ( ( rule__Track__Group_1__0 )? ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1411:1: ( ( ( rule__Track__Group_1__0 )? ) )
            // InternalGuardin.g:1412:1: ( ( rule__Track__Group_1__0 )? )
            {
            // InternalGuardin.g:1412:1: ( ( rule__Track__Group_1__0 )? )
            // InternalGuardin.g:1413:2: ( rule__Track__Group_1__0 )?
            {
             before(grammarAccess.getTrackAccess().getGroup_1()); 
            // InternalGuardin.g:1414:2: ( rule__Track__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGuardin.g:1414:3: rule__Track__Group_1__0
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
    // InternalGuardin.g:1422:1: rule__Track__Group__2 : rule__Track__Group__2__Impl ;
    public final void rule__Track__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1426:1: ( rule__Track__Group__2__Impl )
            // InternalGuardin.g:1427:2: rule__Track__Group__2__Impl
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
    // InternalGuardin.g:1433:1: rule__Track__Group__2__Impl : ( ( rule__Track__Alternatives_2 ) ) ;
    public final void rule__Track__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1437:1: ( ( ( rule__Track__Alternatives_2 ) ) )
            // InternalGuardin.g:1438:1: ( ( rule__Track__Alternatives_2 ) )
            {
            // InternalGuardin.g:1438:1: ( ( rule__Track__Alternatives_2 ) )
            // InternalGuardin.g:1439:2: ( rule__Track__Alternatives_2 )
            {
             before(grammarAccess.getTrackAccess().getAlternatives_2()); 
            // InternalGuardin.g:1440:2: ( rule__Track__Alternatives_2 )
            // InternalGuardin.g:1440:3: rule__Track__Alternatives_2
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
    // InternalGuardin.g:1449:1: rule__Track__Group_1__0 : rule__Track__Group_1__0__Impl rule__Track__Group_1__1 ;
    public final void rule__Track__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1453:1: ( rule__Track__Group_1__0__Impl rule__Track__Group_1__1 )
            // InternalGuardin.g:1454:2: rule__Track__Group_1__0__Impl rule__Track__Group_1__1
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
    // InternalGuardin.g:1461:1: rule__Track__Group_1__0__Impl : ( ( rule__Track__NameAssignment_1_0 ) ) ;
    public final void rule__Track__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1465:1: ( ( ( rule__Track__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:1466:1: ( ( rule__Track__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:1466:1: ( ( rule__Track__NameAssignment_1_0 ) )
            // InternalGuardin.g:1467:2: ( rule__Track__NameAssignment_1_0 )
            {
             before(grammarAccess.getTrackAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:1468:2: ( rule__Track__NameAssignment_1_0 )
            // InternalGuardin.g:1468:3: rule__Track__NameAssignment_1_0
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
    // InternalGuardin.g:1476:1: rule__Track__Group_1__1 : rule__Track__Group_1__1__Impl ;
    public final void rule__Track__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1480:1: ( rule__Track__Group_1__1__Impl )
            // InternalGuardin.g:1481:2: rule__Track__Group_1__1__Impl
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
    // InternalGuardin.g:1487:1: rule__Track__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Track__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1491:1: ( ( ':' ) )
            // InternalGuardin.g:1492:1: ( ':' )
            {
            // InternalGuardin.g:1492:1: ( ':' )
            // InternalGuardin.g:1493:2: ':'
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
    // InternalGuardin.g:1503:1: rule__Track__Group_2_0__0 : rule__Track__Group_2_0__0__Impl rule__Track__Group_2_0__1 ;
    public final void rule__Track__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1507:1: ( rule__Track__Group_2_0__0__Impl rule__Track__Group_2_0__1 )
            // InternalGuardin.g:1508:2: rule__Track__Group_2_0__0__Impl rule__Track__Group_2_0__1
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
    // InternalGuardin.g:1515:1: rule__Track__Group_2_0__0__Impl : ( 'battery:' ) ;
    public final void rule__Track__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1519:1: ( ( 'battery:' ) )
            // InternalGuardin.g:1520:1: ( 'battery:' )
            {
            // InternalGuardin.g:1520:1: ( 'battery:' )
            // InternalGuardin.g:1521:2: 'battery:'
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
    // InternalGuardin.g:1530:1: rule__Track__Group_2_0__1 : rule__Track__Group_2_0__1__Impl ;
    public final void rule__Track__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1534:1: ( rule__Track__Group_2_0__1__Impl )
            // InternalGuardin.g:1535:2: rule__Track__Group_2_0__1__Impl
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
    // InternalGuardin.g:1541:1: rule__Track__Group_2_0__1__Impl : ( ( rule__Track__InstrumentAssignment_2_0_1 ) ) ;
    public final void rule__Track__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1545:1: ( ( ( rule__Track__InstrumentAssignment_2_0_1 ) ) )
            // InternalGuardin.g:1546:1: ( ( rule__Track__InstrumentAssignment_2_0_1 ) )
            {
            // InternalGuardin.g:1546:1: ( ( rule__Track__InstrumentAssignment_2_0_1 ) )
            // InternalGuardin.g:1547:2: ( rule__Track__InstrumentAssignment_2_0_1 )
            {
             before(grammarAccess.getTrackAccess().getInstrumentAssignment_2_0_1()); 
            // InternalGuardin.g:1548:2: ( rule__Track__InstrumentAssignment_2_0_1 )
            // InternalGuardin.g:1548:3: rule__Track__InstrumentAssignment_2_0_1
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
    // InternalGuardin.g:1557:1: rule__Track__Group_2_1__0 : rule__Track__Group_2_1__0__Impl rule__Track__Group_2_1__1 ;
    public final void rule__Track__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1561:1: ( rule__Track__Group_2_1__0__Impl rule__Track__Group_2_1__1 )
            // InternalGuardin.g:1562:2: rule__Track__Group_2_1__0__Impl rule__Track__Group_2_1__1
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
    // InternalGuardin.g:1569:1: rule__Track__Group_2_1__0__Impl : ( 'piano:' ) ;
    public final void rule__Track__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1573:1: ( ( 'piano:' ) )
            // InternalGuardin.g:1574:1: ( 'piano:' )
            {
            // InternalGuardin.g:1574:1: ( 'piano:' )
            // InternalGuardin.g:1575:2: 'piano:'
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
    // InternalGuardin.g:1584:1: rule__Track__Group_2_1__1 : rule__Track__Group_2_1__1__Impl ;
    public final void rule__Track__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1588:1: ( rule__Track__Group_2_1__1__Impl )
            // InternalGuardin.g:1589:2: rule__Track__Group_2_1__1__Impl
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
    // InternalGuardin.g:1595:1: rule__Track__Group_2_1__1__Impl : ( ( rule__Track__InstrumentAssignment_2_1_1 ) ) ;
    public final void rule__Track__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1599:1: ( ( ( rule__Track__InstrumentAssignment_2_1_1 ) ) )
            // InternalGuardin.g:1600:1: ( ( rule__Track__InstrumentAssignment_2_1_1 ) )
            {
            // InternalGuardin.g:1600:1: ( ( rule__Track__InstrumentAssignment_2_1_1 ) )
            // InternalGuardin.g:1601:2: ( rule__Track__InstrumentAssignment_2_1_1 )
            {
             before(grammarAccess.getTrackAccess().getInstrumentAssignment_2_1_1()); 
            // InternalGuardin.g:1602:2: ( rule__Track__InstrumentAssignment_2_1_1 )
            // InternalGuardin.g:1602:3: rule__Track__InstrumentAssignment_2_1_1
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
    // InternalGuardin.g:1611:1: rule__EmptyNote__Group__0 : rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 ;
    public final void rule__EmptyNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1615:1: ( rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1 )
            // InternalGuardin.g:1616:2: rule__EmptyNote__Group__0__Impl rule__EmptyNote__Group__1
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
    // InternalGuardin.g:1623:1: rule__EmptyNote__Group__0__Impl : ( () ) ;
    public final void rule__EmptyNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1627:1: ( ( () ) )
            // InternalGuardin.g:1628:1: ( () )
            {
            // InternalGuardin.g:1628:1: ( () )
            // InternalGuardin.g:1629:2: ()
            {
             before(grammarAccess.getEmptyNoteAccess().getEmptyNoteAction_0()); 
            // InternalGuardin.g:1630:2: ()
            // InternalGuardin.g:1630:3: 
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
    // InternalGuardin.g:1638:1: rule__EmptyNote__Group__1 : rule__EmptyNote__Group__1__Impl ;
    public final void rule__EmptyNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1642:1: ( rule__EmptyNote__Group__1__Impl )
            // InternalGuardin.g:1643:2: rule__EmptyNote__Group__1__Impl
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
    // InternalGuardin.g:1649:1: rule__EmptyNote__Group__1__Impl : ( '$' ) ;
    public final void rule__EmptyNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1653:1: ( ( '$' ) )
            // InternalGuardin.g:1654:1: ( '$' )
            {
            // InternalGuardin.g:1654:1: ( '$' )
            // InternalGuardin.g:1655:2: '$'
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
    // InternalGuardin.g:1665:1: rule__Battery__Group__0 : rule__Battery__Group__0__Impl rule__Battery__Group__1 ;
    public final void rule__Battery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1669:1: ( rule__Battery__Group__0__Impl rule__Battery__Group__1 )
            // InternalGuardin.g:1670:2: rule__Battery__Group__0__Impl rule__Battery__Group__1
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
    // InternalGuardin.g:1677:1: rule__Battery__Group__0__Impl : ( () ) ;
    public final void rule__Battery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1681:1: ( ( () ) )
            // InternalGuardin.g:1682:1: ( () )
            {
            // InternalGuardin.g:1682:1: ( () )
            // InternalGuardin.g:1683:2: ()
            {
             before(grammarAccess.getBatteryAccess().getBatteryAction_0()); 
            // InternalGuardin.g:1684:2: ()
            // InternalGuardin.g:1684:3: 
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
    // InternalGuardin.g:1692:1: rule__Battery__Group__1 : rule__Battery__Group__1__Impl rule__Battery__Group__2 ;
    public final void rule__Battery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1696:1: ( rule__Battery__Group__1__Impl rule__Battery__Group__2 )
            // InternalGuardin.g:1697:2: rule__Battery__Group__1__Impl rule__Battery__Group__2
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
    // InternalGuardin.g:1704:1: rule__Battery__Group__1__Impl : ( ( rule__Battery__Group_1__0 )? ) ;
    public final void rule__Battery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1708:1: ( ( ( rule__Battery__Group_1__0 )? ) )
            // InternalGuardin.g:1709:1: ( ( rule__Battery__Group_1__0 )? )
            {
            // InternalGuardin.g:1709:1: ( ( rule__Battery__Group_1__0 )? )
            // InternalGuardin.g:1710:2: ( rule__Battery__Group_1__0 )?
            {
             before(grammarAccess.getBatteryAccess().getGroup_1()); 
            // InternalGuardin.g:1711:2: ( rule__Battery__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGuardin.g:1711:3: rule__Battery__Group_1__0
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
    // InternalGuardin.g:1719:1: rule__Battery__Group__2 : rule__Battery__Group__2__Impl ;
    public final void rule__Battery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1723:1: ( rule__Battery__Group__2__Impl )
            // InternalGuardin.g:1724:2: rule__Battery__Group__2__Impl
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
    // InternalGuardin.g:1730:1: rule__Battery__Group__2__Impl : ( ( ( rule__Battery__LayersAssignment_2 ) ) ( ( rule__Battery__LayersAssignment_2 )* ) ) ;
    public final void rule__Battery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1734:1: ( ( ( ( rule__Battery__LayersAssignment_2 ) ) ( ( rule__Battery__LayersAssignment_2 )* ) ) )
            // InternalGuardin.g:1735:1: ( ( ( rule__Battery__LayersAssignment_2 ) ) ( ( rule__Battery__LayersAssignment_2 )* ) )
            {
            // InternalGuardin.g:1735:1: ( ( ( rule__Battery__LayersAssignment_2 ) ) ( ( rule__Battery__LayersAssignment_2 )* ) )
            // InternalGuardin.g:1736:2: ( ( rule__Battery__LayersAssignment_2 ) ) ( ( rule__Battery__LayersAssignment_2 )* )
            {
            // InternalGuardin.g:1736:2: ( ( rule__Battery__LayersAssignment_2 ) )
            // InternalGuardin.g:1737:3: ( rule__Battery__LayersAssignment_2 )
            {
             before(grammarAccess.getBatteryAccess().getLayersAssignment_2()); 
            // InternalGuardin.g:1738:3: ( rule__Battery__LayersAssignment_2 )
            // InternalGuardin.g:1738:4: rule__Battery__LayersAssignment_2
            {
            pushFollow(FOLLOW_18);
            rule__Battery__LayersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBatteryAccess().getLayersAssignment_2()); 

            }

            // InternalGuardin.g:1741:2: ( ( rule__Battery__LayersAssignment_2 )* )
            // InternalGuardin.g:1742:3: ( rule__Battery__LayersAssignment_2 )*
            {
             before(grammarAccess.getBatteryAccess().getLayersAssignment_2()); 
            // InternalGuardin.g:1743:3: ( rule__Battery__LayersAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGuardin.g:1743:4: rule__Battery__LayersAssignment_2
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
    // InternalGuardin.g:1753:1: rule__Battery__Group_1__0 : rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1 ;
    public final void rule__Battery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1757:1: ( rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1 )
            // InternalGuardin.g:1758:2: rule__Battery__Group_1__0__Impl rule__Battery__Group_1__1
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
    // InternalGuardin.g:1765:1: rule__Battery__Group_1__0__Impl : ( ( rule__Battery__NameAssignment_1_0 ) ) ;
    public final void rule__Battery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1769:1: ( ( ( rule__Battery__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:1770:1: ( ( rule__Battery__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:1770:1: ( ( rule__Battery__NameAssignment_1_0 ) )
            // InternalGuardin.g:1771:2: ( rule__Battery__NameAssignment_1_0 )
            {
             before(grammarAccess.getBatteryAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:1772:2: ( rule__Battery__NameAssignment_1_0 )
            // InternalGuardin.g:1772:3: rule__Battery__NameAssignment_1_0
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
    // InternalGuardin.g:1780:1: rule__Battery__Group_1__1 : rule__Battery__Group_1__1__Impl ;
    public final void rule__Battery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1784:1: ( rule__Battery__Group_1__1__Impl )
            // InternalGuardin.g:1785:2: rule__Battery__Group_1__1__Impl
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
    // InternalGuardin.g:1791:1: rule__Battery__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Battery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1795:1: ( ( ':' ) )
            // InternalGuardin.g:1796:1: ( ':' )
            {
            // InternalGuardin.g:1796:1: ( ':' )
            // InternalGuardin.g:1797:2: ':'
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
    // InternalGuardin.g:1807:1: rule__BatteryLayer__Group__0 : rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1 ;
    public final void rule__BatteryLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1811:1: ( rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1 )
            // InternalGuardin.g:1812:2: rule__BatteryLayer__Group__0__Impl rule__BatteryLayer__Group__1
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
    // InternalGuardin.g:1819:1: rule__BatteryLayer__Group__0__Impl : ( () ) ;
    public final void rule__BatteryLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1823:1: ( ( () ) )
            // InternalGuardin.g:1824:1: ( () )
            {
            // InternalGuardin.g:1824:1: ( () )
            // InternalGuardin.g:1825:2: ()
            {
             before(grammarAccess.getBatteryLayerAccess().getLayerAction_0()); 
            // InternalGuardin.g:1826:2: ()
            // InternalGuardin.g:1826:3: 
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
    // InternalGuardin.g:1834:1: rule__BatteryLayer__Group__1 : rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2 ;
    public final void rule__BatteryLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1838:1: ( rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2 )
            // InternalGuardin.g:1839:2: rule__BatteryLayer__Group__1__Impl rule__BatteryLayer__Group__2
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
    // InternalGuardin.g:1846:1: rule__BatteryLayer__Group__1__Impl : ( 'layer:' ) ;
    public final void rule__BatteryLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1850:1: ( ( 'layer:' ) )
            // InternalGuardin.g:1851:1: ( 'layer:' )
            {
            // InternalGuardin.g:1851:1: ( 'layer:' )
            // InternalGuardin.g:1852:2: 'layer:'
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
    // InternalGuardin.g:1861:1: rule__BatteryLayer__Group__2 : rule__BatteryLayer__Group__2__Impl ;
    public final void rule__BatteryLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1865:1: ( rule__BatteryLayer__Group__2__Impl )
            // InternalGuardin.g:1866:2: rule__BatteryLayer__Group__2__Impl
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
    // InternalGuardin.g:1872:1: rule__BatteryLayer__Group__2__Impl : ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) ) ;
    public final void rule__BatteryLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1876:1: ( ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:1877:1: ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:1877:1: ( ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* ) )
            // InternalGuardin.g:1878:2: ( ( rule__BatteryLayer__NotesAssignment_2 ) ) ( ( rule__BatteryLayer__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:1878:2: ( ( rule__BatteryLayer__NotesAssignment_2 ) )
            // InternalGuardin.g:1879:3: ( rule__BatteryLayer__NotesAssignment_2 )
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:1880:3: ( rule__BatteryLayer__NotesAssignment_2 )
            // InternalGuardin.g:1880:4: rule__BatteryLayer__NotesAssignment_2
            {
            pushFollow(FOLLOW_20);
            rule__BatteryLayer__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:1883:2: ( ( rule__BatteryLayer__NotesAssignment_2 )* )
            // InternalGuardin.g:1884:3: ( rule__BatteryLayer__NotesAssignment_2 )*
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:1885:3: ( rule__BatteryLayer__NotesAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=11 && LA14_0<=16)||LA14_0==34||LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGuardin.g:1885:4: rule__BatteryLayer__NotesAssignment_2
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
    // InternalGuardin.g:1895:1: rule__BatteryNote__Group__0 : rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 ;
    public final void rule__BatteryNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1899:1: ( rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1 )
            // InternalGuardin.g:1900:2: rule__BatteryNote__Group__0__Impl rule__BatteryNote__Group__1
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
    // InternalGuardin.g:1907:1: rule__BatteryNote__Group__0__Impl : ( () ) ;
    public final void rule__BatteryNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1911:1: ( ( () ) )
            // InternalGuardin.g:1912:1: ( () )
            {
            // InternalGuardin.g:1912:1: ( () )
            // InternalGuardin.g:1913:2: ()
            {
             before(grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0()); 
            // InternalGuardin.g:1914:2: ()
            // InternalGuardin.g:1914:3: 
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
    // InternalGuardin.g:1922:1: rule__BatteryNote__Group__1 : rule__BatteryNote__Group__1__Impl ;
    public final void rule__BatteryNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1926:1: ( rule__BatteryNote__Group__1__Impl )
            // InternalGuardin.g:1927:2: rule__BatteryNote__Group__1__Impl
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
    // InternalGuardin.g:1933:1: rule__BatteryNote__Group__1__Impl : ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) ;
    public final void rule__BatteryNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1937:1: ( ( ( rule__BatteryNote__NoteTypeAssignment_1 ) ) )
            // InternalGuardin.g:1938:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            {
            // InternalGuardin.g:1938:1: ( ( rule__BatteryNote__NoteTypeAssignment_1 ) )
            // InternalGuardin.g:1939:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            {
             before(grammarAccess.getBatteryNoteAccess().getNoteTypeAssignment_1()); 
            // InternalGuardin.g:1940:2: ( rule__BatteryNote__NoteTypeAssignment_1 )
            // InternalGuardin.g:1940:3: rule__BatteryNote__NoteTypeAssignment_1
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
    // InternalGuardin.g:1949:1: rule__CompositeBatteryNote__Group__0 : rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1 ;
    public final void rule__CompositeBatteryNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1953:1: ( rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1 )
            // InternalGuardin.g:1954:2: rule__CompositeBatteryNote__Group__0__Impl rule__CompositeBatteryNote__Group__1
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
    // InternalGuardin.g:1961:1: rule__CompositeBatteryNote__Group__0__Impl : ( () ) ;
    public final void rule__CompositeBatteryNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1965:1: ( ( () ) )
            // InternalGuardin.g:1966:1: ( () )
            {
            // InternalGuardin.g:1966:1: ( () )
            // InternalGuardin.g:1967:2: ()
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getCompositeNoteAction_0()); 
            // InternalGuardin.g:1968:2: ()
            // InternalGuardin.g:1968:3: 
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
    // InternalGuardin.g:1976:1: rule__CompositeBatteryNote__Group__1 : rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2 ;
    public final void rule__CompositeBatteryNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1980:1: ( rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2 )
            // InternalGuardin.g:1981:2: rule__CompositeBatteryNote__Group__1__Impl rule__CompositeBatteryNote__Group__2
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
    // InternalGuardin.g:1988:1: rule__CompositeBatteryNote__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositeBatteryNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:1992:1: ( ( '(' ) )
            // InternalGuardin.g:1993:1: ( '(' )
            {
            // InternalGuardin.g:1993:1: ( '(' )
            // InternalGuardin.g:1994:2: '('
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
    // InternalGuardin.g:2003:1: rule__CompositeBatteryNote__Group__2 : rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3 ;
    public final void rule__CompositeBatteryNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2007:1: ( rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3 )
            // InternalGuardin.g:2008:2: rule__CompositeBatteryNote__Group__2__Impl rule__CompositeBatteryNote__Group__3
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
    // InternalGuardin.g:2015:1: rule__CompositeBatteryNote__Group__2__Impl : ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) ) ;
    public final void rule__CompositeBatteryNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2019:1: ( ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2020:1: ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2020:1: ( ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2021:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) ) ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2021:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 ) )
            // InternalGuardin.g:2022:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2023:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )
            // InternalGuardin.g:2023:4: rule__CompositeBatteryNote__NotesAssignment_2
            {
            pushFollow(FOLLOW_24);
            rule__CompositeBatteryNote__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2026:2: ( ( rule__CompositeBatteryNote__NotesAssignment_2 )* )
            // InternalGuardin.g:2027:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )*
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2028:3: ( rule__CompositeBatteryNote__NotesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=11 && LA15_0<=16)||LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGuardin.g:2028:4: rule__CompositeBatteryNote__NotesAssignment_2
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
    // InternalGuardin.g:2037:1: rule__CompositeBatteryNote__Group__3 : rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4 ;
    public final void rule__CompositeBatteryNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2041:1: ( rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4 )
            // InternalGuardin.g:2042:2: rule__CompositeBatteryNote__Group__3__Impl rule__CompositeBatteryNote__Group__4
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
    // InternalGuardin.g:2049:1: rule__CompositeBatteryNote__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositeBatteryNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2053:1: ( ( ')' ) )
            // InternalGuardin.g:2054:1: ( ')' )
            {
            // InternalGuardin.g:2054:1: ( ')' )
            // InternalGuardin.g:2055:2: ')'
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
    // InternalGuardin.g:2064:1: rule__CompositeBatteryNote__Group__4 : rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5 ;
    public final void rule__CompositeBatteryNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2068:1: ( rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5 )
            // InternalGuardin.g:2069:2: rule__CompositeBatteryNote__Group__4__Impl rule__CompositeBatteryNote__Group__5
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
    // InternalGuardin.g:2076:1: rule__CompositeBatteryNote__Group__4__Impl : ( 'x' ) ;
    public final void rule__CompositeBatteryNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2080:1: ( ( 'x' ) )
            // InternalGuardin.g:2081:1: ( 'x' )
            {
            // InternalGuardin.g:2081:1: ( 'x' )
            // InternalGuardin.g:2082:2: 'x'
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
    // InternalGuardin.g:2091:1: rule__CompositeBatteryNote__Group__5 : rule__CompositeBatteryNote__Group__5__Impl ;
    public final void rule__CompositeBatteryNote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2095:1: ( rule__CompositeBatteryNote__Group__5__Impl )
            // InternalGuardin.g:2096:2: rule__CompositeBatteryNote__Group__5__Impl
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
    // InternalGuardin.g:2102:1: rule__CompositeBatteryNote__Group__5__Impl : ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) ) ;
    public final void rule__CompositeBatteryNote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2106:1: ( ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) ) )
            // InternalGuardin.g:2107:1: ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) )
            {
            // InternalGuardin.g:2107:1: ( ( rule__CompositeBatteryNote__RepeatsAssignment_5 ) )
            // InternalGuardin.g:2108:2: ( rule__CompositeBatteryNote__RepeatsAssignment_5 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getRepeatsAssignment_5()); 
            // InternalGuardin.g:2109:2: ( rule__CompositeBatteryNote__RepeatsAssignment_5 )
            // InternalGuardin.g:2109:3: rule__CompositeBatteryNote__RepeatsAssignment_5
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
    // InternalGuardin.g:2118:1: rule__Piano__Group__0 : rule__Piano__Group__0__Impl rule__Piano__Group__1 ;
    public final void rule__Piano__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2122:1: ( rule__Piano__Group__0__Impl rule__Piano__Group__1 )
            // InternalGuardin.g:2123:2: rule__Piano__Group__0__Impl rule__Piano__Group__1
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
    // InternalGuardin.g:2130:1: rule__Piano__Group__0__Impl : ( () ) ;
    public final void rule__Piano__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2134:1: ( ( () ) )
            // InternalGuardin.g:2135:1: ( () )
            {
            // InternalGuardin.g:2135:1: ( () )
            // InternalGuardin.g:2136:2: ()
            {
             before(grammarAccess.getPianoAccess().getPianoAction_0()); 
            // InternalGuardin.g:2137:2: ()
            // InternalGuardin.g:2137:3: 
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
    // InternalGuardin.g:2145:1: rule__Piano__Group__1 : rule__Piano__Group__1__Impl rule__Piano__Group__2 ;
    public final void rule__Piano__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2149:1: ( rule__Piano__Group__1__Impl rule__Piano__Group__2 )
            // InternalGuardin.g:2150:2: rule__Piano__Group__1__Impl rule__Piano__Group__2
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
    // InternalGuardin.g:2157:1: rule__Piano__Group__1__Impl : ( ( rule__Piano__Group_1__0 )? ) ;
    public final void rule__Piano__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2161:1: ( ( ( rule__Piano__Group_1__0 )? ) )
            // InternalGuardin.g:2162:1: ( ( rule__Piano__Group_1__0 )? )
            {
            // InternalGuardin.g:2162:1: ( ( rule__Piano__Group_1__0 )? )
            // InternalGuardin.g:2163:2: ( rule__Piano__Group_1__0 )?
            {
             before(grammarAccess.getPianoAccess().getGroup_1()); 
            // InternalGuardin.g:2164:2: ( rule__Piano__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGuardin.g:2164:3: rule__Piano__Group_1__0
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
    // InternalGuardin.g:2172:1: rule__Piano__Group__2 : rule__Piano__Group__2__Impl ;
    public final void rule__Piano__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2176:1: ( rule__Piano__Group__2__Impl )
            // InternalGuardin.g:2177:2: rule__Piano__Group__2__Impl
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
    // InternalGuardin.g:2183:1: rule__Piano__Group__2__Impl : ( ( ( rule__Piano__LayersAssignment_2 ) ) ( ( rule__Piano__LayersAssignment_2 )* ) ) ;
    public final void rule__Piano__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2187:1: ( ( ( ( rule__Piano__LayersAssignment_2 ) ) ( ( rule__Piano__LayersAssignment_2 )* ) ) )
            // InternalGuardin.g:2188:1: ( ( ( rule__Piano__LayersAssignment_2 ) ) ( ( rule__Piano__LayersAssignment_2 )* ) )
            {
            // InternalGuardin.g:2188:1: ( ( ( rule__Piano__LayersAssignment_2 ) ) ( ( rule__Piano__LayersAssignment_2 )* ) )
            // InternalGuardin.g:2189:2: ( ( rule__Piano__LayersAssignment_2 ) ) ( ( rule__Piano__LayersAssignment_2 )* )
            {
            // InternalGuardin.g:2189:2: ( ( rule__Piano__LayersAssignment_2 ) )
            // InternalGuardin.g:2190:3: ( rule__Piano__LayersAssignment_2 )
            {
             before(grammarAccess.getPianoAccess().getLayersAssignment_2()); 
            // InternalGuardin.g:2191:3: ( rule__Piano__LayersAssignment_2 )
            // InternalGuardin.g:2191:4: rule__Piano__LayersAssignment_2
            {
            pushFollow(FOLLOW_18);
            rule__Piano__LayersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPianoAccess().getLayersAssignment_2()); 

            }

            // InternalGuardin.g:2194:2: ( ( rule__Piano__LayersAssignment_2 )* )
            // InternalGuardin.g:2195:3: ( rule__Piano__LayersAssignment_2 )*
            {
             before(grammarAccess.getPianoAccess().getLayersAssignment_2()); 
            // InternalGuardin.g:2196:3: ( rule__Piano__LayersAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGuardin.g:2196:4: rule__Piano__LayersAssignment_2
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
    // InternalGuardin.g:2206:1: rule__Piano__Group_1__0 : rule__Piano__Group_1__0__Impl rule__Piano__Group_1__1 ;
    public final void rule__Piano__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2210:1: ( rule__Piano__Group_1__0__Impl rule__Piano__Group_1__1 )
            // InternalGuardin.g:2211:2: rule__Piano__Group_1__0__Impl rule__Piano__Group_1__1
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
    // InternalGuardin.g:2218:1: rule__Piano__Group_1__0__Impl : ( ( rule__Piano__NameAssignment_1_0 ) ) ;
    public final void rule__Piano__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2222:1: ( ( ( rule__Piano__NameAssignment_1_0 ) ) )
            // InternalGuardin.g:2223:1: ( ( rule__Piano__NameAssignment_1_0 ) )
            {
            // InternalGuardin.g:2223:1: ( ( rule__Piano__NameAssignment_1_0 ) )
            // InternalGuardin.g:2224:2: ( rule__Piano__NameAssignment_1_0 )
            {
             before(grammarAccess.getPianoAccess().getNameAssignment_1_0()); 
            // InternalGuardin.g:2225:2: ( rule__Piano__NameAssignment_1_0 )
            // InternalGuardin.g:2225:3: rule__Piano__NameAssignment_1_0
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
    // InternalGuardin.g:2233:1: rule__Piano__Group_1__1 : rule__Piano__Group_1__1__Impl ;
    public final void rule__Piano__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2237:1: ( rule__Piano__Group_1__1__Impl )
            // InternalGuardin.g:2238:2: rule__Piano__Group_1__1__Impl
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
    // InternalGuardin.g:2244:1: rule__Piano__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Piano__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2248:1: ( ( ':' ) )
            // InternalGuardin.g:2249:1: ( ':' )
            {
            // InternalGuardin.g:2249:1: ( ':' )
            // InternalGuardin.g:2250:2: ':'
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
    // InternalGuardin.g:2260:1: rule__PianoLayer__Group__0 : rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1 ;
    public final void rule__PianoLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2264:1: ( rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1 )
            // InternalGuardin.g:2265:2: rule__PianoLayer__Group__0__Impl rule__PianoLayer__Group__1
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
    // InternalGuardin.g:2272:1: rule__PianoLayer__Group__0__Impl : ( () ) ;
    public final void rule__PianoLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2276:1: ( ( () ) )
            // InternalGuardin.g:2277:1: ( () )
            {
            // InternalGuardin.g:2277:1: ( () )
            // InternalGuardin.g:2278:2: ()
            {
             before(grammarAccess.getPianoLayerAccess().getLayerAction_0()); 
            // InternalGuardin.g:2279:2: ()
            // InternalGuardin.g:2279:3: 
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
    // InternalGuardin.g:2287:1: rule__PianoLayer__Group__1 : rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2 ;
    public final void rule__PianoLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2291:1: ( rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2 )
            // InternalGuardin.g:2292:2: rule__PianoLayer__Group__1__Impl rule__PianoLayer__Group__2
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
    // InternalGuardin.g:2299:1: rule__PianoLayer__Group__1__Impl : ( 'layer:' ) ;
    public final void rule__PianoLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2303:1: ( ( 'layer:' ) )
            // InternalGuardin.g:2304:1: ( 'layer:' )
            {
            // InternalGuardin.g:2304:1: ( 'layer:' )
            // InternalGuardin.g:2305:2: 'layer:'
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
    // InternalGuardin.g:2314:1: rule__PianoLayer__Group__2 : rule__PianoLayer__Group__2__Impl ;
    public final void rule__PianoLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2318:1: ( rule__PianoLayer__Group__2__Impl )
            // InternalGuardin.g:2319:2: rule__PianoLayer__Group__2__Impl
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
    // InternalGuardin.g:2325:1: rule__PianoLayer__Group__2__Impl : ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) ) ;
    public final void rule__PianoLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2329:1: ( ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2330:1: ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2330:1: ( ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2331:2: ( ( rule__PianoLayer__NotesAssignment_2 ) ) ( ( rule__PianoLayer__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2331:2: ( ( rule__PianoLayer__NotesAssignment_2 ) )
            // InternalGuardin.g:2332:3: ( rule__PianoLayer__NotesAssignment_2 )
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2333:3: ( rule__PianoLayer__NotesAssignment_2 )
            // InternalGuardin.g:2333:4: rule__PianoLayer__NotesAssignment_2
            {
            pushFollow(FOLLOW_27);
            rule__PianoLayer__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2336:2: ( ( rule__PianoLayer__NotesAssignment_2 )* )
            // InternalGuardin.g:2337:3: ( rule__PianoLayer__NotesAssignment_2 )*
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2338:3: ( rule__PianoLayer__NotesAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=17 && LA18_0<=23)||LA18_0==34||LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGuardin.g:2338:4: rule__PianoLayer__NotesAssignment_2
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
    // InternalGuardin.g:2348:1: rule__PianoNote__Group__0 : rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1 ;
    public final void rule__PianoNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2352:1: ( rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1 )
            // InternalGuardin.g:2353:2: rule__PianoNote__Group__0__Impl rule__PianoNote__Group__1
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
    // InternalGuardin.g:2360:1: rule__PianoNote__Group__0__Impl : ( () ) ;
    public final void rule__PianoNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2364:1: ( ( () ) )
            // InternalGuardin.g:2365:1: ( () )
            {
            // InternalGuardin.g:2365:1: ( () )
            // InternalGuardin.g:2366:2: ()
            {
             before(grammarAccess.getPianoNoteAccess().getPianoNoteAction_0()); 
            // InternalGuardin.g:2367:2: ()
            // InternalGuardin.g:2367:3: 
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
    // InternalGuardin.g:2375:1: rule__PianoNote__Group__1 : rule__PianoNote__Group__1__Impl rule__PianoNote__Group__2 ;
    public final void rule__PianoNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2379:1: ( rule__PianoNote__Group__1__Impl rule__PianoNote__Group__2 )
            // InternalGuardin.g:2380:2: rule__PianoNote__Group__1__Impl rule__PianoNote__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalGuardin.g:2387:1: rule__PianoNote__Group__1__Impl : ( ( rule__PianoNote__NoteTypeAssignment_1 ) ) ;
    public final void rule__PianoNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2391:1: ( ( ( rule__PianoNote__NoteTypeAssignment_1 ) ) )
            // InternalGuardin.g:2392:1: ( ( rule__PianoNote__NoteTypeAssignment_1 ) )
            {
            // InternalGuardin.g:2392:1: ( ( rule__PianoNote__NoteTypeAssignment_1 ) )
            // InternalGuardin.g:2393:2: ( rule__PianoNote__NoteTypeAssignment_1 )
            {
             before(grammarAccess.getPianoNoteAccess().getNoteTypeAssignment_1()); 
            // InternalGuardin.g:2394:2: ( rule__PianoNote__NoteTypeAssignment_1 )
            // InternalGuardin.g:2394:3: rule__PianoNote__NoteTypeAssignment_1
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
    // InternalGuardin.g:2402:1: rule__PianoNote__Group__2 : rule__PianoNote__Group__2__Impl ;
    public final void rule__PianoNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2406:1: ( rule__PianoNote__Group__2__Impl )
            // InternalGuardin.g:2407:2: rule__PianoNote__Group__2__Impl
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
    // InternalGuardin.g:2413:1: rule__PianoNote__Group__2__Impl : ( ( rule__PianoNote__Group_2__0 )? ) ;
    public final void rule__PianoNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2417:1: ( ( ( rule__PianoNote__Group_2__0 )? ) )
            // InternalGuardin.g:2418:1: ( ( rule__PianoNote__Group_2__0 )? )
            {
            // InternalGuardin.g:2418:1: ( ( rule__PianoNote__Group_2__0 )? )
            // InternalGuardin.g:2419:2: ( rule__PianoNote__Group_2__0 )?
            {
             before(grammarAccess.getPianoNoteAccess().getGroup_2()); 
            // InternalGuardin.g:2420:2: ( rule__PianoNote__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGuardin.g:2420:3: rule__PianoNote__Group_2__0
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
    // InternalGuardin.g:2429:1: rule__PianoNote__Group_2__0 : rule__PianoNote__Group_2__0__Impl rule__PianoNote__Group_2__1 ;
    public final void rule__PianoNote__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2433:1: ( rule__PianoNote__Group_2__0__Impl rule__PianoNote__Group_2__1 )
            // InternalGuardin.g:2434:2: rule__PianoNote__Group_2__0__Impl rule__PianoNote__Group_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalGuardin.g:2441:1: rule__PianoNote__Group_2__0__Impl : ( '/' ) ;
    public final void rule__PianoNote__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2445:1: ( ( '/' ) )
            // InternalGuardin.g:2446:1: ( '/' )
            {
            // InternalGuardin.g:2446:1: ( '/' )
            // InternalGuardin.g:2447:2: '/'
            {
             before(grammarAccess.getPianoNoteAccess().getSolidusKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGuardin.g:2456:1: rule__PianoNote__Group_2__1 : rule__PianoNote__Group_2__1__Impl ;
    public final void rule__PianoNote__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2460:1: ( rule__PianoNote__Group_2__1__Impl )
            // InternalGuardin.g:2461:2: rule__PianoNote__Group_2__1__Impl
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
    // InternalGuardin.g:2467:1: rule__PianoNote__Group_2__1__Impl : ( ( rule__PianoNote__OctaveOffsetAssignment_2_1 ) ) ;
    public final void rule__PianoNote__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2471:1: ( ( ( rule__PianoNote__OctaveOffsetAssignment_2_1 ) ) )
            // InternalGuardin.g:2472:1: ( ( rule__PianoNote__OctaveOffsetAssignment_2_1 ) )
            {
            // InternalGuardin.g:2472:1: ( ( rule__PianoNote__OctaveOffsetAssignment_2_1 ) )
            // InternalGuardin.g:2473:2: ( rule__PianoNote__OctaveOffsetAssignment_2_1 )
            {
             before(grammarAccess.getPianoNoteAccess().getOctaveOffsetAssignment_2_1()); 
            // InternalGuardin.g:2474:2: ( rule__PianoNote__OctaveOffsetAssignment_2_1 )
            // InternalGuardin.g:2474:3: rule__PianoNote__OctaveOffsetAssignment_2_1
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
    // InternalGuardin.g:2483:1: rule__CompositePianoNote__Group__0 : rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1 ;
    public final void rule__CompositePianoNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2487:1: ( rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1 )
            // InternalGuardin.g:2488:2: rule__CompositePianoNote__Group__0__Impl rule__CompositePianoNote__Group__1
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
    // InternalGuardin.g:2495:1: rule__CompositePianoNote__Group__0__Impl : ( () ) ;
    public final void rule__CompositePianoNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2499:1: ( ( () ) )
            // InternalGuardin.g:2500:1: ( () )
            {
            // InternalGuardin.g:2500:1: ( () )
            // InternalGuardin.g:2501:2: ()
            {
             before(grammarAccess.getCompositePianoNoteAccess().getCompositeNoteAction_0()); 
            // InternalGuardin.g:2502:2: ()
            // InternalGuardin.g:2502:3: 
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
    // InternalGuardin.g:2510:1: rule__CompositePianoNote__Group__1 : rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2 ;
    public final void rule__CompositePianoNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2514:1: ( rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2 )
            // InternalGuardin.g:2515:2: rule__CompositePianoNote__Group__1__Impl rule__CompositePianoNote__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalGuardin.g:2522:1: rule__CompositePianoNote__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositePianoNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2526:1: ( ( '(' ) )
            // InternalGuardin.g:2527:1: ( '(' )
            {
            // InternalGuardin.g:2527:1: ( '(' )
            // InternalGuardin.g:2528:2: '('
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
    // InternalGuardin.g:2537:1: rule__CompositePianoNote__Group__2 : rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3 ;
    public final void rule__CompositePianoNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2541:1: ( rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3 )
            // InternalGuardin.g:2542:2: rule__CompositePianoNote__Group__2__Impl rule__CompositePianoNote__Group__3
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
    // InternalGuardin.g:2549:1: rule__CompositePianoNote__Group__2__Impl : ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) ) ;
    public final void rule__CompositePianoNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2553:1: ( ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) ) )
            // InternalGuardin.g:2554:1: ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) )
            {
            // InternalGuardin.g:2554:1: ( ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* ) )
            // InternalGuardin.g:2555:2: ( ( rule__CompositePianoNote__NotesAssignment_2 ) ) ( ( rule__CompositePianoNote__NotesAssignment_2 )* )
            {
            // InternalGuardin.g:2555:2: ( ( rule__CompositePianoNote__NotesAssignment_2 ) )
            // InternalGuardin.g:2556:3: ( rule__CompositePianoNote__NotesAssignment_2 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2557:3: ( rule__CompositePianoNote__NotesAssignment_2 )
            // InternalGuardin.g:2557:4: rule__CompositePianoNote__NotesAssignment_2
            {
            pushFollow(FOLLOW_32);
            rule__CompositePianoNote__NotesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 

            }

            // InternalGuardin.g:2560:2: ( ( rule__CompositePianoNote__NotesAssignment_2 )* )
            // InternalGuardin.g:2561:3: ( rule__CompositePianoNote__NotesAssignment_2 )*
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2()); 
            // InternalGuardin.g:2562:3: ( rule__CompositePianoNote__NotesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=17 && LA20_0<=23)||LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGuardin.g:2562:4: rule__CompositePianoNote__NotesAssignment_2
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__CompositePianoNote__NotesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalGuardin.g:2571:1: rule__CompositePianoNote__Group__3 : rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4 ;
    public final void rule__CompositePianoNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2575:1: ( rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4 )
            // InternalGuardin.g:2576:2: rule__CompositePianoNote__Group__3__Impl rule__CompositePianoNote__Group__4
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
    // InternalGuardin.g:2583:1: rule__CompositePianoNote__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositePianoNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2587:1: ( ( ')' ) )
            // InternalGuardin.g:2588:1: ( ')' )
            {
            // InternalGuardin.g:2588:1: ( ')' )
            // InternalGuardin.g:2589:2: ')'
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
    // InternalGuardin.g:2598:1: rule__CompositePianoNote__Group__4 : rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5 ;
    public final void rule__CompositePianoNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2602:1: ( rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5 )
            // InternalGuardin.g:2603:2: rule__CompositePianoNote__Group__4__Impl rule__CompositePianoNote__Group__5
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
    // InternalGuardin.g:2610:1: rule__CompositePianoNote__Group__4__Impl : ( 'x' ) ;
    public final void rule__CompositePianoNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2614:1: ( ( 'x' ) )
            // InternalGuardin.g:2615:1: ( 'x' )
            {
            // InternalGuardin.g:2615:1: ( 'x' )
            // InternalGuardin.g:2616:2: 'x'
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
    // InternalGuardin.g:2625:1: rule__CompositePianoNote__Group__5 : rule__CompositePianoNote__Group__5__Impl ;
    public final void rule__CompositePianoNote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2629:1: ( rule__CompositePianoNote__Group__5__Impl )
            // InternalGuardin.g:2630:2: rule__CompositePianoNote__Group__5__Impl
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
    // InternalGuardin.g:2636:1: rule__CompositePianoNote__Group__5__Impl : ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) ) ;
    public final void rule__CompositePianoNote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2640:1: ( ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) ) )
            // InternalGuardin.g:2641:1: ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) )
            {
            // InternalGuardin.g:2641:1: ( ( rule__CompositePianoNote__RepeatsAssignment_5 ) )
            // InternalGuardin.g:2642:2: ( rule__CompositePianoNote__RepeatsAssignment_5 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getRepeatsAssignment_5()); 
            // InternalGuardin.g:2643:2: ( rule__CompositePianoNote__RepeatsAssignment_5 )
            // InternalGuardin.g:2643:3: rule__CompositePianoNote__RepeatsAssignment_5
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
    // InternalGuardin.g:2652:1: rule__ERelativeInt__Group__0 : rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1 ;
    public final void rule__ERelativeInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2656:1: ( rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1 )
            // InternalGuardin.g:2657:2: rule__ERelativeInt__Group__0__Impl rule__ERelativeInt__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalGuardin.g:2664:1: rule__ERelativeInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ERelativeInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2668:1: ( ( ( '-' )? ) )
            // InternalGuardin.g:2669:1: ( ( '-' )? )
            {
            // InternalGuardin.g:2669:1: ( ( '-' )? )
            // InternalGuardin.g:2670:2: ( '-' )?
            {
             before(grammarAccess.getERelativeIntAccess().getHyphenMinusKeyword_0()); 
            // InternalGuardin.g:2671:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGuardin.g:2671:3: '-'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalGuardin.g:2679:1: rule__ERelativeInt__Group__1 : rule__ERelativeInt__Group__1__Impl ;
    public final void rule__ERelativeInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2683:1: ( rule__ERelativeInt__Group__1__Impl )
            // InternalGuardin.g:2684:2: rule__ERelativeInt__Group__1__Impl
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
    // InternalGuardin.g:2690:1: rule__ERelativeInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ERelativeInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2694:1: ( ( RULE_INT ) )
            // InternalGuardin.g:2695:1: ( RULE_INT )
            {
            // InternalGuardin.g:2695:1: ( RULE_INT )
            // InternalGuardin.g:2696:2: RULE_INT
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


    // $ANTLR start "rule__Music__NameAssignment_2"
    // InternalGuardin.g:2706:1: rule__Music__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Music__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2710:1: ( ( ruleEString ) )
            // InternalGuardin.g:2711:2: ( ruleEString )
            {
            // InternalGuardin.g:2711:2: ( ruleEString )
            // InternalGuardin.g:2712:3: ruleEString
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
    // InternalGuardin.g:2721:1: rule__Music__SectionsAssignment_6 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2725:1: ( ( ruleSection ) )
            // InternalGuardin.g:2726:2: ( ruleSection )
            {
            // InternalGuardin.g:2726:2: ( ruleSection )
            // InternalGuardin.g:2727:3: ruleSection
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
    // InternalGuardin.g:2736:1: rule__Music__SectionsAssignment_7 : ( ruleSection ) ;
    public final void rule__Music__SectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2740:1: ( ( ruleSection ) )
            // InternalGuardin.g:2741:2: ( ruleSection )
            {
            // InternalGuardin.g:2741:2: ( ruleSection )
            // InternalGuardin.g:2742:3: ruleSection
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
    // InternalGuardin.g:2751:1: rule__Music__TracksAssignment_10_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2755:1: ( ( ruleTrack ) )
            // InternalGuardin.g:2756:2: ( ruleTrack )
            {
            // InternalGuardin.g:2756:2: ( ruleTrack )
            // InternalGuardin.g:2757:3: ruleTrack
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
    // InternalGuardin.g:2766:1: rule__Music__TracksAssignment_10_2_1 : ( ruleTrack ) ;
    public final void rule__Music__TracksAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2770:1: ( ( ruleTrack ) )
            // InternalGuardin.g:2771:2: ( ruleTrack )
            {
            // InternalGuardin.g:2771:2: ( ruleTrack )
            // InternalGuardin.g:2772:3: ruleTrack
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
    // InternalGuardin.g:2781:1: rule__Section__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2785:1: ( ( ruleEString ) )
            // InternalGuardin.g:2786:2: ( ruleEString )
            {
            // InternalGuardin.g:2786:2: ( ruleEString )
            // InternalGuardin.g:2787:3: ruleEString
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
    // InternalGuardin.g:2796:1: rule__Section__TempoAssignment_4 : ( ruleEInt ) ;
    public final void rule__Section__TempoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2800:1: ( ( ruleEInt ) )
            // InternalGuardin.g:2801:2: ( ruleEInt )
            {
            // InternalGuardin.g:2801:2: ( ruleEInt )
            // InternalGuardin.g:2802:3: ruleEInt
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
    // InternalGuardin.g:2811:1: rule__Section__SignatureAssignment_6 : ( ruleEInt ) ;
    public final void rule__Section__SignatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2815:1: ( ( ruleEInt ) )
            // InternalGuardin.g:2816:2: ( ruleEInt )
            {
            // InternalGuardin.g:2816:2: ( ruleEInt )
            // InternalGuardin.g:2817:3: ruleEInt
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
    // InternalGuardin.g:2826:1: rule__Section__BarsAssignment_8 : ( ruleEInt ) ;
    public final void rule__Section__BarsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2830:1: ( ( ruleEInt ) )
            // InternalGuardin.g:2831:2: ( ruleEInt )
            {
            // InternalGuardin.g:2831:2: ( ruleEInt )
            // InternalGuardin.g:2832:3: ruleEInt
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
    // InternalGuardin.g:2841:1: rule__Track__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Track__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2845:1: ( ( ruleEString ) )
            // InternalGuardin.g:2846:2: ( ruleEString )
            {
            // InternalGuardin.g:2846:2: ( ruleEString )
            // InternalGuardin.g:2847:3: ruleEString
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
    // InternalGuardin.g:2856:1: rule__Track__InstrumentAssignment_2_0_1 : ( ruleBattery ) ;
    public final void rule__Track__InstrumentAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2860:1: ( ( ruleBattery ) )
            // InternalGuardin.g:2861:2: ( ruleBattery )
            {
            // InternalGuardin.g:2861:2: ( ruleBattery )
            // InternalGuardin.g:2862:3: ruleBattery
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
    // InternalGuardin.g:2871:1: rule__Track__InstrumentAssignment_2_1_1 : ( rulePiano ) ;
    public final void rule__Track__InstrumentAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2875:1: ( ( rulePiano ) )
            // InternalGuardin.g:2876:2: ( rulePiano )
            {
            // InternalGuardin.g:2876:2: ( rulePiano )
            // InternalGuardin.g:2877:3: rulePiano
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
    // InternalGuardin.g:2886:1: rule__Battery__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Battery__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2890:1: ( ( ruleEString ) )
            // InternalGuardin.g:2891:2: ( ruleEString )
            {
            // InternalGuardin.g:2891:2: ( ruleEString )
            // InternalGuardin.g:2892:3: ruleEString
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
    // InternalGuardin.g:2901:1: rule__Battery__LayersAssignment_2 : ( ruleBatteryLayer ) ;
    public final void rule__Battery__LayersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2905:1: ( ( ruleBatteryLayer ) )
            // InternalGuardin.g:2906:2: ( ruleBatteryLayer )
            {
            // InternalGuardin.g:2906:2: ( ruleBatteryLayer )
            // InternalGuardin.g:2907:3: ruleBatteryLayer
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
    // InternalGuardin.g:2916:1: rule__BatteryLayer__NotesAssignment_2 : ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) ) ;
    public final void rule__BatteryLayer__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2920:1: ( ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:2921:2: ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:2921:2: ( ( rule__BatteryLayer__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:2922:3: ( rule__BatteryLayer__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getBatteryLayerAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:2923:3: ( rule__BatteryLayer__NotesAlternatives_2_0 )
            // InternalGuardin.g:2923:4: rule__BatteryLayer__NotesAlternatives_2_0
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
    // InternalGuardin.g:2931:1: rule__BatteryNote__NoteTypeAssignment_1 : ( ruleBatteryNoteType ) ;
    public final void rule__BatteryNote__NoteTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2935:1: ( ( ruleBatteryNoteType ) )
            // InternalGuardin.g:2936:2: ( ruleBatteryNoteType )
            {
            // InternalGuardin.g:2936:2: ( ruleBatteryNoteType )
            // InternalGuardin.g:2937:3: ruleBatteryNoteType
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
    // InternalGuardin.g:2946:1: rule__CompositeBatteryNote__NotesAssignment_2 : ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) ) ;
    public final void rule__CompositeBatteryNote__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2950:1: ( ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:2951:2: ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:2951:2: ( ( rule__CompositeBatteryNote__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:2952:3: ( rule__CompositeBatteryNote__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getCompositeBatteryNoteAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:2953:3: ( rule__CompositeBatteryNote__NotesAlternatives_2_0 )
            // InternalGuardin.g:2953:4: rule__CompositeBatteryNote__NotesAlternatives_2_0
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
    // InternalGuardin.g:2961:1: rule__CompositeBatteryNote__RepeatsAssignment_5 : ( ruleEInt ) ;
    public final void rule__CompositeBatteryNote__RepeatsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2965:1: ( ( ruleEInt ) )
            // InternalGuardin.g:2966:2: ( ruleEInt )
            {
            // InternalGuardin.g:2966:2: ( ruleEInt )
            // InternalGuardin.g:2967:3: ruleEInt
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
    // InternalGuardin.g:2976:1: rule__Piano__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Piano__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2980:1: ( ( ruleEString ) )
            // InternalGuardin.g:2981:2: ( ruleEString )
            {
            // InternalGuardin.g:2981:2: ( ruleEString )
            // InternalGuardin.g:2982:3: ruleEString
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
    // InternalGuardin.g:2991:1: rule__Piano__LayersAssignment_2 : ( rulePianoLayer ) ;
    public final void rule__Piano__LayersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:2995:1: ( ( rulePianoLayer ) )
            // InternalGuardin.g:2996:2: ( rulePianoLayer )
            {
            // InternalGuardin.g:2996:2: ( rulePianoLayer )
            // InternalGuardin.g:2997:3: rulePianoLayer
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
    // InternalGuardin.g:3006:1: rule__PianoLayer__NotesAssignment_2 : ( ( rule__PianoLayer__NotesAlternatives_2_0 ) ) ;
    public final void rule__PianoLayer__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3010:1: ( ( ( rule__PianoLayer__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3011:2: ( ( rule__PianoLayer__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3011:2: ( ( rule__PianoLayer__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3012:3: ( rule__PianoLayer__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getPianoLayerAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3013:3: ( rule__PianoLayer__NotesAlternatives_2_0 )
            // InternalGuardin.g:3013:4: rule__PianoLayer__NotesAlternatives_2_0
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
    // InternalGuardin.g:3021:1: rule__PianoNote__NoteTypeAssignment_1 : ( rulePianoNoteType ) ;
    public final void rule__PianoNote__NoteTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3025:1: ( ( rulePianoNoteType ) )
            // InternalGuardin.g:3026:2: ( rulePianoNoteType )
            {
            // InternalGuardin.g:3026:2: ( rulePianoNoteType )
            // InternalGuardin.g:3027:3: rulePianoNoteType
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
    // InternalGuardin.g:3036:1: rule__PianoNote__OctaveOffsetAssignment_2_1 : ( ruleERelativeInt ) ;
    public final void rule__PianoNote__OctaveOffsetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3040:1: ( ( ruleERelativeInt ) )
            // InternalGuardin.g:3041:2: ( ruleERelativeInt )
            {
            // InternalGuardin.g:3041:2: ( ruleERelativeInt )
            // InternalGuardin.g:3042:3: ruleERelativeInt
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
    // InternalGuardin.g:3051:1: rule__CompositePianoNote__NotesAssignment_2 : ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) ) ;
    public final void rule__CompositePianoNote__NotesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3055:1: ( ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) ) )
            // InternalGuardin.g:3056:2: ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) )
            {
            // InternalGuardin.g:3056:2: ( ( rule__CompositePianoNote__NotesAlternatives_2_0 ) )
            // InternalGuardin.g:3057:3: ( rule__CompositePianoNote__NotesAlternatives_2_0 )
            {
             before(grammarAccess.getCompositePianoNoteAccess().getNotesAlternatives_2_0()); 
            // InternalGuardin.g:3058:3: ( rule__CompositePianoNote__NotesAlternatives_2_0 )
            // InternalGuardin.g:3058:4: rule__CompositePianoNote__NotesAlternatives_2_0
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
    // InternalGuardin.g:3066:1: rule__CompositePianoNote__RepeatsAssignment_5 : ( ruleEInt ) ;
    public final void rule__CompositePianoNote__RepeatsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuardin.g:3070:1: ( ( ruleEInt ) )
            // InternalGuardin.g:3071:2: ( ruleEInt )
            {
            // InternalGuardin.g:3071:2: ( ruleEInt )
            // InternalGuardin.g:3072:3: ruleEInt
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
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400FE0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400FE0002L});

}