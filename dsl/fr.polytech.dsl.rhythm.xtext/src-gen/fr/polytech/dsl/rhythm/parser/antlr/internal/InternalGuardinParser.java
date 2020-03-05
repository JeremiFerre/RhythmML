package fr.polytech.dsl.rhythm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.polytech.dsl.rhythm.services.GuardinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuardinParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CustomSoundBank'", "'basePath='", "'Music'", "':'", "'sections'", "'tracks'", "'-'", "'tempo='", "'signature='", "'bars='", "'$'", "'battery'", "'begin_section'", "'end_section'", "'layer:'", "'('", "')'", "'x'", "'piano'", "'other:'", "'/'", "'|'", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "'ACOUSTIC_BASS'", "'CHURCH_ORGAN'", "'CLAVINET'", "'GUITAR'", "'HARPSICHORD'", "'MUSIC_BOX'", "'OCARINA'", "'PIANO'", "'SYNTH_BASS_1'", "'VIOLIN'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'"
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

        public InternalGuardinParser(TokenStream input, GuardinGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Music";
       	}

       	@Override
       	protected GuardinGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMusic"
    // InternalGuardin.g:65:1: entryRuleMusic returns [EObject current=null] : iv_ruleMusic= ruleMusic EOF ;
    public final EObject entryRuleMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusic = null;


        try {
            // InternalGuardin.g:65:46: (iv_ruleMusic= ruleMusic EOF )
            // InternalGuardin.g:66:2: iv_ruleMusic= ruleMusic EOF
            {
             newCompositeNode(grammarAccess.getMusicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMusic=ruleMusic();

            state._fsp--;

             current =iv_ruleMusic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMusic"


    // $ANTLR start "ruleMusic"
    // InternalGuardin.g:72:1: ruleMusic returns [EObject current=null] : ( () (otherlv_1= 'CustomSoundBank' otherlv_2= 'basePath=' ( (lv_soundBankPath_3_0= ruleEString ) ) )? otherlv_4= 'Music' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' otherlv_7= 'sections' otherlv_8= ':' ( (lv_sections_9_0= ruleSection ) ) ( (lv_sections_10_0= ruleSection ) )* otherlv_11= 'tracks' otherlv_12= ':' (otherlv_13= '-' ( (lv_tracks_14_0= ruleTrack ) ) (otherlv_15= '-' ( (lv_tracks_16_0= ruleTrack ) ) )* ) ) ;
    public final EObject ruleMusic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_soundBankPath_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_sections_9_0 = null;

        EObject lv_sections_10_0 = null;

        EObject lv_tracks_14_0 = null;

        EObject lv_tracks_16_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:78:2: ( ( () (otherlv_1= 'CustomSoundBank' otherlv_2= 'basePath=' ( (lv_soundBankPath_3_0= ruleEString ) ) )? otherlv_4= 'Music' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' otherlv_7= 'sections' otherlv_8= ':' ( (lv_sections_9_0= ruleSection ) ) ( (lv_sections_10_0= ruleSection ) )* otherlv_11= 'tracks' otherlv_12= ':' (otherlv_13= '-' ( (lv_tracks_14_0= ruleTrack ) ) (otherlv_15= '-' ( (lv_tracks_16_0= ruleTrack ) ) )* ) ) )
            // InternalGuardin.g:79:2: ( () (otherlv_1= 'CustomSoundBank' otherlv_2= 'basePath=' ( (lv_soundBankPath_3_0= ruleEString ) ) )? otherlv_4= 'Music' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' otherlv_7= 'sections' otherlv_8= ':' ( (lv_sections_9_0= ruleSection ) ) ( (lv_sections_10_0= ruleSection ) )* otherlv_11= 'tracks' otherlv_12= ':' (otherlv_13= '-' ( (lv_tracks_14_0= ruleTrack ) ) (otherlv_15= '-' ( (lv_tracks_16_0= ruleTrack ) ) )* ) )
            {
            // InternalGuardin.g:79:2: ( () (otherlv_1= 'CustomSoundBank' otherlv_2= 'basePath=' ( (lv_soundBankPath_3_0= ruleEString ) ) )? otherlv_4= 'Music' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' otherlv_7= 'sections' otherlv_8= ':' ( (lv_sections_9_0= ruleSection ) ) ( (lv_sections_10_0= ruleSection ) )* otherlv_11= 'tracks' otherlv_12= ':' (otherlv_13= '-' ( (lv_tracks_14_0= ruleTrack ) ) (otherlv_15= '-' ( (lv_tracks_16_0= ruleTrack ) ) )* ) )
            // InternalGuardin.g:80:3: () (otherlv_1= 'CustomSoundBank' otherlv_2= 'basePath=' ( (lv_soundBankPath_3_0= ruleEString ) ) )? otherlv_4= 'Music' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' otherlv_7= 'sections' otherlv_8= ':' ( (lv_sections_9_0= ruleSection ) ) ( (lv_sections_10_0= ruleSection ) )* otherlv_11= 'tracks' otherlv_12= ':' (otherlv_13= '-' ( (lv_tracks_14_0= ruleTrack ) ) (otherlv_15= '-' ( (lv_tracks_16_0= ruleTrack ) ) )* )
            {
            // InternalGuardin.g:80:3: ()
            // InternalGuardin.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMusicAccess().getMusicAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:87:3: (otherlv_1= 'CustomSoundBank' otherlv_2= 'basePath=' ( (lv_soundBankPath_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGuardin.g:88:4: otherlv_1= 'CustomSoundBank' otherlv_2= 'basePath=' ( (lv_soundBankPath_3_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getMusicAccess().getCustomSoundBankKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getMusicAccess().getBasePathKeyword_1_1());
                    			
                    // InternalGuardin.g:96:4: ( (lv_soundBankPath_3_0= ruleEString ) )
                    // InternalGuardin.g:97:5: (lv_soundBankPath_3_0= ruleEString )
                    {
                    // InternalGuardin.g:97:5: (lv_soundBankPath_3_0= ruleEString )
                    // InternalGuardin.g:98:6: lv_soundBankPath_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMusicAccess().getSoundBankPathEStringParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_soundBankPath_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMusicRule());
                    						}
                    						set(
                    							current,
                    							"soundBankPath",
                    							lv_soundBankPath_3_0,
                    							"fr.polytech.dsl.rhythm.Guardin.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMusicAccess().getMusicKeyword_2());
            		
            // InternalGuardin.g:120:3: ( (lv_name_5_0= ruleEString ) )
            // InternalGuardin.g:121:4: (lv_name_5_0= ruleEString )
            {
            // InternalGuardin.g:121:4: (lv_name_5_0= ruleEString )
            // InternalGuardin.g:122:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"fr.polytech.dsl.rhythm.Guardin.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMusicAccess().getColonKeyword_4());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getMusicAccess().getSectionsKeyword_5());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getMusicAccess().getColonKeyword_6());
            		
            // InternalGuardin.g:151:3: ( (lv_sections_9_0= ruleSection ) )
            // InternalGuardin.g:152:4: (lv_sections_9_0= ruleSection )
            {
            // InternalGuardin.g:152:4: (lv_sections_9_0= ruleSection )
            // InternalGuardin.g:153:5: lv_sections_9_0= ruleSection
            {

            					newCompositeNode(grammarAccess.getMusicAccess().getSectionsSectionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_sections_9_0=ruleSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_9_0,
            						"fr.polytech.dsl.rhythm.Guardin.Section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGuardin.g:170:3: ( (lv_sections_10_0= ruleSection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGuardin.g:171:4: (lv_sections_10_0= ruleSection )
            	    {
            	    // InternalGuardin.g:171:4: (lv_sections_10_0= ruleSection )
            	    // InternalGuardin.g:172:5: lv_sections_10_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getMusicAccess().getSectionsSectionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_sections_10_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMusicRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_10_0,
            	    						"fr.polytech.dsl.rhythm.Guardin.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getMusicAccess().getTracksKeyword_9());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getMusicAccess().getColonKeyword_10());
            		
            // InternalGuardin.g:197:3: (otherlv_13= '-' ( (lv_tracks_14_0= ruleTrack ) ) (otherlv_15= '-' ( (lv_tracks_16_0= ruleTrack ) ) )* )
            // InternalGuardin.g:198:4: otherlv_13= '-' ( (lv_tracks_14_0= ruleTrack ) ) (otherlv_15= '-' ( (lv_tracks_16_0= ruleTrack ) ) )*
            {
            otherlv_13=(Token)match(input,17,FOLLOW_10); 

            				newLeafNode(otherlv_13, grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_0());
            			
            // InternalGuardin.g:202:4: ( (lv_tracks_14_0= ruleTrack ) )
            // InternalGuardin.g:203:5: (lv_tracks_14_0= ruleTrack )
            {
            // InternalGuardin.g:203:5: (lv_tracks_14_0= ruleTrack )
            // InternalGuardin.g:204:6: lv_tracks_14_0= ruleTrack
            {

            						newCompositeNode(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_11_1_0());
            					
            pushFollow(FOLLOW_11);
            lv_tracks_14_0=ruleTrack();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMusicRule());
            						}
            						add(
            							current,
            							"tracks",
            							lv_tracks_14_0,
            							"fr.polytech.dsl.rhythm.Guardin.Track");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalGuardin.g:221:4: (otherlv_15= '-' ( (lv_tracks_16_0= ruleTrack ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGuardin.g:222:5: otherlv_15= '-' ( (lv_tracks_16_0= ruleTrack ) )
            	    {
            	    otherlv_15=(Token)match(input,17,FOLLOW_10); 

            	    					newLeafNode(otherlv_15, grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_2_0());
            	    				
            	    // InternalGuardin.g:226:5: ( (lv_tracks_16_0= ruleTrack ) )
            	    // InternalGuardin.g:227:6: (lv_tracks_16_0= ruleTrack )
            	    {
            	    // InternalGuardin.g:227:6: (lv_tracks_16_0= ruleTrack )
            	    // InternalGuardin.g:228:7: lv_tracks_16_0= ruleTrack
            	    {

            	    							newCompositeNode(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_11_2_1_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_tracks_16_0=ruleTrack();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMusicRule());
            	    							}
            	    							add(
            	    								current,
            	    								"tracks",
            	    								lv_tracks_16_0,
            	    								"fr.polytech.dsl.rhythm.Guardin.Track");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMusic"


    // $ANTLR start "entryRuleSection"
    // InternalGuardin.g:251:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalGuardin.g:251:48: (iv_ruleSection= ruleSection EOF )
            // InternalGuardin.g:252:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalGuardin.g:258:1: ruleSection returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_tempo_4_0 = null;

        AntlrDatatypeRuleToken lv_signature_6_0 = null;

        AntlrDatatypeRuleToken lv_bars_8_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:264:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) ) )
            // InternalGuardin.g:265:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:265:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) )
            // InternalGuardin.g:266:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) )
            {
            // InternalGuardin.g:266:3: ()
            // InternalGuardin.g:267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionAccess().getSectionAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:273:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGuardin.g:274:4: (lv_name_1_0= ruleEString )
            {
            // InternalGuardin.g:274:4: (lv_name_1_0= ruleEString )
            // InternalGuardin.g:275:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.polytech.dsl.rhythm.Guardin.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getTempoKeyword_3());
            		
            // InternalGuardin.g:300:3: ( (lv_tempo_4_0= ruleEInt ) )
            // InternalGuardin.g:301:4: (lv_tempo_4_0= ruleEInt )
            {
            // InternalGuardin.g:301:4: (lv_tempo_4_0= ruleEInt )
            // InternalGuardin.g:302:5: lv_tempo_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getTempoEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_tempo_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					set(
            						current,
            						"tempo",
            						lv_tempo_4_0,
            						"fr.polytech.dsl.rhythm.Guardin.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getSignatureKeyword_5());
            		
            // InternalGuardin.g:323:3: ( (lv_signature_6_0= ruleEInt ) )
            // InternalGuardin.g:324:4: (lv_signature_6_0= ruleEInt )
            {
            // InternalGuardin.g:324:4: (lv_signature_6_0= ruleEInt )
            // InternalGuardin.g:325:5: lv_signature_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getSignatureEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_signature_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					set(
            						current,
            						"signature",
            						lv_signature_6_0,
            						"fr.polytech.dsl.rhythm.Guardin.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getBarsKeyword_7());
            		
            // InternalGuardin.g:346:3: ( (lv_bars_8_0= ruleEInt ) )
            // InternalGuardin.g:347:4: (lv_bars_8_0= ruleEInt )
            {
            // InternalGuardin.g:347:4: (lv_bars_8_0= ruleEInt )
            // InternalGuardin.g:348:5: lv_bars_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getBarsEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_bars_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					set(
            						current,
            						"bars",
            						lv_bars_8_0,
            						"fr.polytech.dsl.rhythm.Guardin.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleTrack"
    // InternalGuardin.g:369:1: entryRuleTrack returns [EObject current=null] : iv_ruleTrack= ruleTrack EOF ;
    public final EObject entryRuleTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrack = null;


        try {
            // InternalGuardin.g:369:46: (iv_ruleTrack= ruleTrack EOF )
            // InternalGuardin.g:370:2: iv_ruleTrack= ruleTrack EOF
            {
             newCompositeNode(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrack=ruleTrack();

            state._fsp--;

             current =iv_ruleTrack; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // InternalGuardin.g:376:1: ruleTrack returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_instrument_3_0= ruleInstrument ) ) ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_instrument_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:382:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_instrument_3_0= ruleInstrument ) ) ) )
            // InternalGuardin.g:383:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_instrument_3_0= ruleInstrument ) ) )
            {
            // InternalGuardin.g:383:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_instrument_3_0= ruleInstrument ) ) )
            // InternalGuardin.g:384:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_instrument_3_0= ruleInstrument ) )
            {
            // InternalGuardin.g:384:3: ()
            // InternalGuardin.g:385:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrackAccess().getTrackAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:391:3: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGuardin.g:392:4: ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalGuardin.g:392:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalGuardin.g:393:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalGuardin.g:393:5: (lv_name_1_0= ruleEString )
                    // InternalGuardin.g:394:6: lv_name_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTrackAccess().getNameEStringParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrackRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"fr.polytech.dsl.rhythm.Guardin.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGuardin.g:416:3: ( (lv_instrument_3_0= ruleInstrument ) )
            // InternalGuardin.g:417:4: (lv_instrument_3_0= ruleInstrument )
            {
            // InternalGuardin.g:417:4: (lv_instrument_3_0= ruleInstrument )
            // InternalGuardin.g:418:5: lv_instrument_3_0= ruleInstrument
            {

            					newCompositeNode(grammarAccess.getTrackAccess().getInstrumentInstrumentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_instrument_3_0=ruleInstrument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrackRule());
            					}
            					set(
            						current,
            						"instrument",
            						lv_instrument_3_0,
            						"fr.polytech.dsl.rhythm.Guardin.Instrument");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRuleInstrument"
    // InternalGuardin.g:439:1: entryRuleInstrument returns [EObject current=null] : iv_ruleInstrument= ruleInstrument EOF ;
    public final EObject entryRuleInstrument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstrument = null;


        try {
            // InternalGuardin.g:439:51: (iv_ruleInstrument= ruleInstrument EOF )
            // InternalGuardin.g:440:2: iv_ruleInstrument= ruleInstrument EOF
            {
             newCompositeNode(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstrument=ruleInstrument();

            state._fsp--;

             current =iv_ruleInstrument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstrument"


    // $ANTLR start "ruleInstrument"
    // InternalGuardin.g:446:1: ruleInstrument returns [EObject current=null] : (this_Battery_0= ruleBattery | this_Piano_1= rulePiano ) ;
    public final EObject ruleInstrument() throws RecognitionException {
        EObject current = null;

        EObject this_Battery_0 = null;

        EObject this_Piano_1 = null;



        	enterRule();

        try {
            // InternalGuardin.g:452:2: ( (this_Battery_0= ruleBattery | this_Piano_1= rulePiano ) )
            // InternalGuardin.g:453:2: (this_Battery_0= ruleBattery | this_Piano_1= rulePiano )
            {
            // InternalGuardin.g:453:2: (this_Battery_0= ruleBattery | this_Piano_1= rulePiano )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=29 && LA5_0<=30)||(LA5_0>=39 && LA5_0<=48)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGuardin.g:454:3: this_Battery_0= ruleBattery
                    {

                    			newCompositeNode(grammarAccess.getInstrumentAccess().getBatteryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Battery_0=ruleBattery();

                    state._fsp--;


                    			current = this_Battery_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:463:3: this_Piano_1= rulePiano
                    {

                    			newCompositeNode(grammarAccess.getInstrumentAccess().getPianoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Piano_1=rulePiano();

                    state._fsp--;


                    			current = this_Piano_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstrument"


    // $ANTLR start "entryRuleEmptyNote"
    // InternalGuardin.g:475:1: entryRuleEmptyNote returns [EObject current=null] : iv_ruleEmptyNote= ruleEmptyNote EOF ;
    public final EObject entryRuleEmptyNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyNote = null;


        try {
            // InternalGuardin.g:475:50: (iv_ruleEmptyNote= ruleEmptyNote EOF )
            // InternalGuardin.g:476:2: iv_ruleEmptyNote= ruleEmptyNote EOF
            {
             newCompositeNode(grammarAccess.getEmptyNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyNote=ruleEmptyNote();

            state._fsp--;

             current =iv_ruleEmptyNote; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyNote"


    // $ANTLR start "ruleEmptyNote"
    // InternalGuardin.g:482:1: ruleEmptyNote returns [EObject current=null] : ( () otherlv_1= '$' ) ;
    public final EObject ruleEmptyNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:488:2: ( ( () otherlv_1= '$' ) )
            // InternalGuardin.g:489:2: ( () otherlv_1= '$' )
            {
            // InternalGuardin.g:489:2: ( () otherlv_1= '$' )
            // InternalGuardin.g:490:3: () otherlv_1= '$'
            {
            // InternalGuardin.g:490:3: ()
            // InternalGuardin.g:491:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyNoteAccess().getEmptyNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptyNoteAccess().getDollarSignKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyNote"


    // $ANTLR start "entryRuleBattery"
    // InternalGuardin.g:505:1: entryRuleBattery returns [EObject current=null] : iv_ruleBattery= ruleBattery EOF ;
    public final EObject entryRuleBattery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBattery = null;


        try {
            // InternalGuardin.g:505:48: (iv_ruleBattery= ruleBattery EOF )
            // InternalGuardin.g:506:2: iv_ruleBattery= ruleBattery EOF
            {
             newCompositeNode(grammarAccess.getBatteryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBattery=ruleBattery();

            state._fsp--;

             current =iv_ruleBattery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBattery"


    // $ANTLR start "ruleBattery"
    // InternalGuardin.g:512:1: ruleBattery returns [EObject current=null] : ( () otherlv_1= 'battery' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+ ) ;
    public final EObject ruleBattery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_sections_5_0 = null;

        EObject lv_layers_6_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:518:2: ( ( () otherlv_1= 'battery' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+ ) )
            // InternalGuardin.g:519:2: ( () otherlv_1= 'battery' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+ )
            {
            // InternalGuardin.g:519:2: ( () otherlv_1= 'battery' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+ )
            // InternalGuardin.g:520:3: () otherlv_1= 'battery' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+
            {
            // InternalGuardin.g:520:3: ()
            // InternalGuardin.g:521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryAccess().getBatteryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getBatteryAccess().getBatteryKeyword_1());
            		
            // InternalGuardin.g:531:3: (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
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
                    // InternalGuardin.g:532:4: otherlv_2= ':'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getBatteryAccess().getColonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:537:4: ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' )
                    {
                    // InternalGuardin.g:537:4: ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' )
                    // InternalGuardin.g:538:5: ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':'
                    {
                    // InternalGuardin.g:538:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalGuardin.g:539:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalGuardin.g:539:6: (lv_name_3_0= ruleEString )
                    // InternalGuardin.g:540:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getBatteryAccess().getNameEStringParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getBatteryRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"fr.polytech.dsl.rhythm.Guardin.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_17); 

                    					newLeafNode(otherlv_4, grammarAccess.getBatteryAccess().getColonKeyword_2_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalGuardin.g:563:3: ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }
                else if ( (LA7_0==25) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGuardin.g:564:4: ( (lv_sections_5_0= ruleSectionBatteryLayer ) )
            	    {
            	    // InternalGuardin.g:564:4: ( (lv_sections_5_0= ruleSectionBatteryLayer ) )
            	    // InternalGuardin.g:565:5: (lv_sections_5_0= ruleSectionBatteryLayer )
            	    {
            	    // InternalGuardin.g:565:5: (lv_sections_5_0= ruleSectionBatteryLayer )
            	    // InternalGuardin.g:566:6: lv_sections_5_0= ruleSectionBatteryLayer
            	    {

            	    						newCompositeNode(grammarAccess.getBatteryAccess().getSectionsSectionBatteryLayerParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_sections_5_0=ruleSectionBatteryLayer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBatteryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_5_0,
            	    							"fr.polytech.dsl.rhythm.Guardin.SectionBatteryLayer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGuardin.g:584:4: ( (lv_layers_6_0= ruleBatteryLayer ) )
            	    {
            	    // InternalGuardin.g:584:4: ( (lv_layers_6_0= ruleBatteryLayer ) )
            	    // InternalGuardin.g:585:5: (lv_layers_6_0= ruleBatteryLayer )
            	    {
            	    // InternalGuardin.g:585:5: (lv_layers_6_0= ruleBatteryLayer )
            	    // InternalGuardin.g:586:6: lv_layers_6_0= ruleBatteryLayer
            	    {

            	    						newCompositeNode(grammarAccess.getBatteryAccess().getLayersBatteryLayerParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_layers_6_0=ruleBatteryLayer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBatteryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"layers",
            	    							lv_layers_6_0,
            	    							"fr.polytech.dsl.rhythm.Guardin.BatteryLayer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBattery"


    // $ANTLR start "entryRuleSectionBatteryLayer"
    // InternalGuardin.g:608:1: entryRuleSectionBatteryLayer returns [EObject current=null] : iv_ruleSectionBatteryLayer= ruleSectionBatteryLayer EOF ;
    public final EObject entryRuleSectionBatteryLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionBatteryLayer = null;


        try {
            // InternalGuardin.g:608:60: (iv_ruleSectionBatteryLayer= ruleSectionBatteryLayer EOF )
            // InternalGuardin.g:609:2: iv_ruleSectionBatteryLayer= ruleSectionBatteryLayer EOF
            {
             newCompositeNode(grammarAccess.getSectionBatteryLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionBatteryLayer=ruleSectionBatteryLayer();

            state._fsp--;

             current =iv_ruleSectionBatteryLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionBatteryLayer"


    // $ANTLR start "ruleSectionBatteryLayer"
    // InternalGuardin.g:615:1: ruleSectionBatteryLayer returns [EObject current=null] : ( () otherlv_1= 'begin_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'end_section' ) ;
    public final EObject ruleSectionBatteryLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_layers_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:621:2: ( ( () otherlv_1= 'begin_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'end_section' ) )
            // InternalGuardin.g:622:2: ( () otherlv_1= 'begin_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'end_section' )
            {
            // InternalGuardin.g:622:2: ( () otherlv_1= 'begin_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'end_section' )
            // InternalGuardin.g:623:3: () otherlv_1= 'begin_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'end_section'
            {
            // InternalGuardin.g:623:3: ()
            // InternalGuardin.g:624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionBatteryLayerAccess().getSectionLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionBatteryLayerAccess().getBegin_sectionKeyword_1());
            		
            // InternalGuardin.g:634:3: ( ( ruleEString ) )
            // InternalGuardin.g:635:4: ( ruleEString )
            {
            // InternalGuardin.g:635:4: ( ruleEString )
            // InternalGuardin.g:636:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionBatteryLayerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSectionBatteryLayerAccess().getSectionSectionCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGuardin.g:650:3: ( (lv_layers_3_0= ruleBatteryLayer ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGuardin.g:651:4: (lv_layers_3_0= ruleBatteryLayer )
            	    {
            	    // InternalGuardin.g:651:4: (lv_layers_3_0= ruleBatteryLayer )
            	    // InternalGuardin.g:652:5: lv_layers_3_0= ruleBatteryLayer
            	    {

            	    					newCompositeNode(grammarAccess.getSectionBatteryLayerAccess().getLayersBatteryLayerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_layers_3_0=ruleBatteryLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionBatteryLayerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layers",
            	    						lv_layers_3_0,
            	    						"fr.polytech.dsl.rhythm.Guardin.BatteryLayer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSectionBatteryLayerAccess().getEnd_sectionKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionBatteryLayer"


    // $ANTLR start "entryRuleBatteryLayer"
    // InternalGuardin.g:677:1: entryRuleBatteryLayer returns [EObject current=null] : iv_ruleBatteryLayer= ruleBatteryLayer EOF ;
    public final EObject entryRuleBatteryLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatteryLayer = null;


        try {
            // InternalGuardin.g:677:53: (iv_ruleBatteryLayer= ruleBatteryLayer EOF )
            // InternalGuardin.g:678:2: iv_ruleBatteryLayer= ruleBatteryLayer EOF
            {
             newCompositeNode(grammarAccess.getBatteryLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBatteryLayer=ruleBatteryLayer();

            state._fsp--;

             current =iv_ruleBatteryLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBatteryLayer"


    // $ANTLR start "ruleBatteryLayer"
    // InternalGuardin.g:684:1: ruleBatteryLayer returns [EObject current=null] : ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ ) ;
    public final EObject ruleBatteryLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_notes_2_1 = null;

        EObject lv_notes_2_2 = null;

        EObject lv_notes_2_3 = null;



        	enterRule();

        try {
            // InternalGuardin.g:690:2: ( ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ ) )
            // InternalGuardin.g:691:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ )
            {
            // InternalGuardin.g:691:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ )
            // InternalGuardin.g:692:3: () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+
            {
            // InternalGuardin.g:692:3: ()
            // InternalGuardin.g:693:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getBatteryLayerAccess().getLayerKeyword_1());
            		
            // InternalGuardin.g:703:3: ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21||LA10_0==26||(LA10_0>=33 && LA10_0<=38)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGuardin.g:704:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) )
            	    {
            	    // InternalGuardin.g:704:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) )
            	    // InternalGuardin.g:705:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote )
            	    {
            	    // InternalGuardin.g:705:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote )
            	    int alt9=3;
            	    switch ( input.LA(1) ) {
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
            	    case 21:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 26:
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
            	            // InternalGuardin.g:706:6: lv_notes_2_1= ruleBatteryNote
            	            {

            	            						newCompositeNode(grammarAccess.getBatteryLayerAccess().getNotesBatteryNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_21);
            	            lv_notes_2_1=ruleBatteryNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBatteryLayerRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_2_1,
            	            							"fr.polytech.dsl.rhythm.Guardin.BatteryNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalGuardin.g:722:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getBatteryLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_21);
            	            lv_notes_2_2=ruleEmptyNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBatteryLayerRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_2_2,
            	            							"fr.polytech.dsl.rhythm.Guardin.EmptyNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalGuardin.g:738:6: lv_notes_2_3= ruleCompositeBatteryNote
            	            {

            	            						newCompositeNode(grammarAccess.getBatteryLayerAccess().getNotesCompositeBatteryNoteParserRuleCall_2_0_2());
            	            					
            	            pushFollow(FOLLOW_21);
            	            lv_notes_2_3=ruleCompositeBatteryNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBatteryLayerRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_2_3,
            	            							"fr.polytech.dsl.rhythm.Guardin.CompositeBatteryNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBatteryLayer"


    // $ANTLR start "entryRuleBatteryNote"
    // InternalGuardin.g:760:1: entryRuleBatteryNote returns [EObject current=null] : iv_ruleBatteryNote= ruleBatteryNote EOF ;
    public final EObject entryRuleBatteryNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatteryNote = null;


        try {
            // InternalGuardin.g:760:52: (iv_ruleBatteryNote= ruleBatteryNote EOF )
            // InternalGuardin.g:761:2: iv_ruleBatteryNote= ruleBatteryNote EOF
            {
             newCompositeNode(grammarAccess.getBatteryNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBatteryNote=ruleBatteryNote();

            state._fsp--;

             current =iv_ruleBatteryNote; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBatteryNote"


    // $ANTLR start "ruleBatteryNote"
    // InternalGuardin.g:767:1: ruleBatteryNote returns [EObject current=null] : ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) ) ;
    public final EObject ruleBatteryNote() throws RecognitionException {
        EObject current = null;

        Enumerator lv_noteType_1_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:773:2: ( ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) ) )
            // InternalGuardin.g:774:2: ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) )
            {
            // InternalGuardin.g:774:2: ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) )
            // InternalGuardin.g:775:3: () ( (lv_noteType_1_0= ruleBatteryNoteType ) )
            {
            // InternalGuardin.g:775:3: ()
            // InternalGuardin.g:776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:782:3: ( (lv_noteType_1_0= ruleBatteryNoteType ) )
            // InternalGuardin.g:783:4: (lv_noteType_1_0= ruleBatteryNoteType )
            {
            // InternalGuardin.g:783:4: (lv_noteType_1_0= ruleBatteryNoteType )
            // InternalGuardin.g:784:5: lv_noteType_1_0= ruleBatteryNoteType
            {

            					newCompositeNode(grammarAccess.getBatteryNoteAccess().getNoteTypeBatteryNoteTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_noteType_1_0=ruleBatteryNoteType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBatteryNoteRule());
            					}
            					set(
            						current,
            						"noteType",
            						lv_noteType_1_0,
            						"fr.polytech.dsl.rhythm.Guardin.BatteryNoteType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBatteryNote"


    // $ANTLR start "entryRuleCompositeBatteryNote"
    // InternalGuardin.g:805:1: entryRuleCompositeBatteryNote returns [EObject current=null] : iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF ;
    public final EObject entryRuleCompositeBatteryNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeBatteryNote = null;


        try {
            // InternalGuardin.g:805:61: (iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF )
            // InternalGuardin.g:806:2: iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF
            {
             newCompositeNode(grammarAccess.getCompositeBatteryNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeBatteryNote=ruleCompositeBatteryNote();

            state._fsp--;

             current =iv_ruleCompositeBatteryNote; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeBatteryNote"


    // $ANTLR start "ruleCompositeBatteryNote"
    // InternalGuardin.g:812:1: ruleCompositeBatteryNote returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) ;
    public final EObject ruleCompositeBatteryNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_notes_2_1 = null;

        EObject lv_notes_2_2 = null;

        AntlrDatatypeRuleToken lv_repeats_5_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:818:2: ( ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) )
            // InternalGuardin.g:819:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:819:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            // InternalGuardin.g:820:3: () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) )
            {
            // InternalGuardin.g:820:3: ()
            // InternalGuardin.g:821:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeBatteryNoteAccess().getCompositeNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeBatteryNoteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGuardin.g:831:3: ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21||(LA12_0>=33 && LA12_0<=38)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGuardin.g:832:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) )
            	    {
            	    // InternalGuardin.g:832:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) )
            	    // InternalGuardin.g:833:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote )
            	    {
            	    // InternalGuardin.g:833:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( ((LA11_0>=33 && LA11_0<=38)) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==21) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalGuardin.g:834:6: lv_notes_2_1= ruleBatteryNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositeBatteryNoteAccess().getNotesBatteryNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_23);
            	            lv_notes_2_1=ruleBatteryNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getCompositeBatteryNoteRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_2_1,
            	            							"fr.polytech.dsl.rhythm.Guardin.BatteryNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalGuardin.g:850:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositeBatteryNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_23);
            	            lv_notes_2_2=ruleEmptyNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getCompositeBatteryNoteRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_2_2,
            	            							"fr.polytech.dsl.rhythm.Guardin.EmptyNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeBatteryNoteAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositeBatteryNoteAccess().getXKeyword_4());
            		
            // InternalGuardin.g:876:3: ( (lv_repeats_5_0= ruleEInt ) )
            // InternalGuardin.g:877:4: (lv_repeats_5_0= ruleEInt )
            {
            // InternalGuardin.g:877:4: (lv_repeats_5_0= ruleEInt )
            // InternalGuardin.g:878:5: lv_repeats_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCompositeBatteryNoteAccess().getRepeatsEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_repeats_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeBatteryNoteRule());
            					}
            					set(
            						current,
            						"repeats",
            						lv_repeats_5_0,
            						"fr.polytech.dsl.rhythm.Guardin.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeBatteryNote"


    // $ANTLR start "entryRulePiano"
    // InternalGuardin.g:899:1: entryRulePiano returns [EObject current=null] : iv_rulePiano= rulePiano EOF ;
    public final EObject entryRulePiano() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiano = null;


        try {
            // InternalGuardin.g:899:46: (iv_rulePiano= rulePiano EOF )
            // InternalGuardin.g:900:2: iv_rulePiano= rulePiano EOF
            {
             newCompositeNode(grammarAccess.getPianoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePiano=rulePiano();

            state._fsp--;

             current =iv_rulePiano; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePiano"


    // $ANTLR start "rulePiano"
    // InternalGuardin.g:906:1: rulePiano returns [EObject current=null] : ( () (otherlv_1= 'piano' | ( (lv_instrument_2_0= ruleInstruments ) ) | (otherlv_3= 'other:' ( (lv_other_4_0= ruleEString ) ) ) ) (otherlv_5= ':' | ( ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ) ) ( ( (lv_sections_8_0= ruleSectionPianoLayer ) ) | ( (lv_layers_9_0= rulePianoLayer ) ) )+ ) ;
    public final EObject rulePiano() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_instrument_2_0 = null;

        AntlrDatatypeRuleToken lv_other_4_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_sections_8_0 = null;

        EObject lv_layers_9_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:912:2: ( ( () (otherlv_1= 'piano' | ( (lv_instrument_2_0= ruleInstruments ) ) | (otherlv_3= 'other:' ( (lv_other_4_0= ruleEString ) ) ) ) (otherlv_5= ':' | ( ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ) ) ( ( (lv_sections_8_0= ruleSectionPianoLayer ) ) | ( (lv_layers_9_0= rulePianoLayer ) ) )+ ) )
            // InternalGuardin.g:913:2: ( () (otherlv_1= 'piano' | ( (lv_instrument_2_0= ruleInstruments ) ) | (otherlv_3= 'other:' ( (lv_other_4_0= ruleEString ) ) ) ) (otherlv_5= ':' | ( ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ) ) ( ( (lv_sections_8_0= ruleSectionPianoLayer ) ) | ( (lv_layers_9_0= rulePianoLayer ) ) )+ )
            {
            // InternalGuardin.g:913:2: ( () (otherlv_1= 'piano' | ( (lv_instrument_2_0= ruleInstruments ) ) | (otherlv_3= 'other:' ( (lv_other_4_0= ruleEString ) ) ) ) (otherlv_5= ':' | ( ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ) ) ( ( (lv_sections_8_0= ruleSectionPianoLayer ) ) | ( (lv_layers_9_0= rulePianoLayer ) ) )+ )
            // InternalGuardin.g:914:3: () (otherlv_1= 'piano' | ( (lv_instrument_2_0= ruleInstruments ) ) | (otherlv_3= 'other:' ( (lv_other_4_0= ruleEString ) ) ) ) (otherlv_5= ':' | ( ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ) ) ( ( (lv_sections_8_0= ruleSectionPianoLayer ) ) | ( (lv_layers_9_0= rulePianoLayer ) ) )+
            {
            // InternalGuardin.g:914:3: ()
            // InternalGuardin.g:915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoAccess().getPianoAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:921:3: (otherlv_1= 'piano' | ( (lv_instrument_2_0= ruleInstruments ) ) | (otherlv_3= 'other:' ( (lv_other_4_0= ruleEString ) ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt13=2;
                }
                break;
            case 30:
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
                    // InternalGuardin.g:922:4: otherlv_1= 'piano'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getPianoAccess().getPianoKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:927:4: ( (lv_instrument_2_0= ruleInstruments ) )
                    {
                    // InternalGuardin.g:927:4: ( (lv_instrument_2_0= ruleInstruments ) )
                    // InternalGuardin.g:928:5: (lv_instrument_2_0= ruleInstruments )
                    {
                    // InternalGuardin.g:928:5: (lv_instrument_2_0= ruleInstruments )
                    // InternalGuardin.g:929:6: lv_instrument_2_0= ruleInstruments
                    {

                    						newCompositeNode(grammarAccess.getPianoAccess().getInstrumentInstrumentsEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_instrument_2_0=ruleInstruments();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPianoRule());
                    						}
                    						set(
                    							current,
                    							"instrument",
                    							lv_instrument_2_0,
                    							"fr.polytech.dsl.rhythm.Guardin.Instruments");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:947:4: (otherlv_3= 'other:' ( (lv_other_4_0= ruleEString ) ) )
                    {
                    // InternalGuardin.g:947:4: (otherlv_3= 'other:' ( (lv_other_4_0= ruleEString ) ) )
                    // InternalGuardin.g:948:5: otherlv_3= 'other:' ( (lv_other_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getPianoAccess().getOtherKeyword_1_2_0());
                    				
                    // InternalGuardin.g:952:5: ( (lv_other_4_0= ruleEString ) )
                    // InternalGuardin.g:953:6: (lv_other_4_0= ruleEString )
                    {
                    // InternalGuardin.g:953:6: (lv_other_4_0= ruleEString )
                    // InternalGuardin.g:954:7: lv_other_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPianoAccess().getOtherEStringParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_other_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPianoRule());
                    							}
                    							set(
                    								current,
                    								"other",
                    								lv_other_4_0,
                    								"fr.polytech.dsl.rhythm.Guardin.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalGuardin.g:973:3: (otherlv_5= ':' | ( ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGuardin.g:974:4: otherlv_5= ':'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getPianoAccess().getColonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:979:4: ( ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' )
                    {
                    // InternalGuardin.g:979:4: ( ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' )
                    // InternalGuardin.g:980:5: ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':'
                    {
                    // InternalGuardin.g:980:5: ( (lv_name_6_0= ruleEString ) )
                    // InternalGuardin.g:981:6: (lv_name_6_0= ruleEString )
                    {
                    // InternalGuardin.g:981:6: (lv_name_6_0= ruleEString )
                    // InternalGuardin.g:982:7: lv_name_6_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPianoAccess().getNameEStringParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_name_6_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPianoRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_6_0,
                    								"fr.polytech.dsl.rhythm.Guardin.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_17); 

                    					newLeafNode(otherlv_7, grammarAccess.getPianoAccess().getColonKeyword_2_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalGuardin.g:1005:3: ( ( (lv_sections_8_0= ruleSectionPianoLayer ) ) | ( (lv_layers_9_0= rulePianoLayer ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }
                else if ( (LA15_0==25) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGuardin.g:1006:4: ( (lv_sections_8_0= ruleSectionPianoLayer ) )
            	    {
            	    // InternalGuardin.g:1006:4: ( (lv_sections_8_0= ruleSectionPianoLayer ) )
            	    // InternalGuardin.g:1007:5: (lv_sections_8_0= ruleSectionPianoLayer )
            	    {
            	    // InternalGuardin.g:1007:5: (lv_sections_8_0= ruleSectionPianoLayer )
            	    // InternalGuardin.g:1008:6: lv_sections_8_0= ruleSectionPianoLayer
            	    {

            	    						newCompositeNode(grammarAccess.getPianoAccess().getSectionsSectionPianoLayerParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_sections_8_0=ruleSectionPianoLayer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPianoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_8_0,
            	    							"fr.polytech.dsl.rhythm.Guardin.SectionPianoLayer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGuardin.g:1026:4: ( (lv_layers_9_0= rulePianoLayer ) )
            	    {
            	    // InternalGuardin.g:1026:4: ( (lv_layers_9_0= rulePianoLayer ) )
            	    // InternalGuardin.g:1027:5: (lv_layers_9_0= rulePianoLayer )
            	    {
            	    // InternalGuardin.g:1027:5: (lv_layers_9_0= rulePianoLayer )
            	    // InternalGuardin.g:1028:6: lv_layers_9_0= rulePianoLayer
            	    {

            	    						newCompositeNode(grammarAccess.getPianoAccess().getLayersPianoLayerParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_layers_9_0=rulePianoLayer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPianoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"layers",
            	    							lv_layers_9_0,
            	    							"fr.polytech.dsl.rhythm.Guardin.PianoLayer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePiano"


    // $ANTLR start "entryRuleSectionPianoLayer"
    // InternalGuardin.g:1050:1: entryRuleSectionPianoLayer returns [EObject current=null] : iv_ruleSectionPianoLayer= ruleSectionPianoLayer EOF ;
    public final EObject entryRuleSectionPianoLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionPianoLayer = null;


        try {
            // InternalGuardin.g:1050:58: (iv_ruleSectionPianoLayer= ruleSectionPianoLayer EOF )
            // InternalGuardin.g:1051:2: iv_ruleSectionPianoLayer= ruleSectionPianoLayer EOF
            {
             newCompositeNode(grammarAccess.getSectionPianoLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionPianoLayer=ruleSectionPianoLayer();

            state._fsp--;

             current =iv_ruleSectionPianoLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionPianoLayer"


    // $ANTLR start "ruleSectionPianoLayer"
    // InternalGuardin.g:1057:1: ruleSectionPianoLayer returns [EObject current=null] : ( () otherlv_1= 'begin_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'end_section' ) ;
    public final EObject ruleSectionPianoLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_layers_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1063:2: ( ( () otherlv_1= 'begin_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'end_section' ) )
            // InternalGuardin.g:1064:2: ( () otherlv_1= 'begin_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'end_section' )
            {
            // InternalGuardin.g:1064:2: ( () otherlv_1= 'begin_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'end_section' )
            // InternalGuardin.g:1065:3: () otherlv_1= 'begin_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'end_section'
            {
            // InternalGuardin.g:1065:3: ()
            // InternalGuardin.g:1066:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionPianoLayerAccess().getSectionLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionPianoLayerAccess().getBegin_sectionKeyword_1());
            		
            // InternalGuardin.g:1076:3: ( ( ruleEString ) )
            // InternalGuardin.g:1077:4: ( ruleEString )
            {
            // InternalGuardin.g:1077:4: ( ruleEString )
            // InternalGuardin.g:1078:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionPianoLayerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSectionPianoLayerAccess().getSectionSectionCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGuardin.g:1092:3: ( (lv_layers_3_0= rulePianoLayer ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGuardin.g:1093:4: (lv_layers_3_0= rulePianoLayer )
            	    {
            	    // InternalGuardin.g:1093:4: (lv_layers_3_0= rulePianoLayer )
            	    // InternalGuardin.g:1094:5: lv_layers_3_0= rulePianoLayer
            	    {

            	    					newCompositeNode(grammarAccess.getSectionPianoLayerAccess().getLayersPianoLayerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_layers_3_0=rulePianoLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionPianoLayerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layers",
            	    						lv_layers_3_0,
            	    						"fr.polytech.dsl.rhythm.Guardin.PianoLayer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSectionPianoLayerAccess().getEnd_sectionKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionPianoLayer"


    // $ANTLR start "entryRulePianoLayer"
    // InternalGuardin.g:1119:1: entryRulePianoLayer returns [EObject current=null] : iv_rulePianoLayer= rulePianoLayer EOF ;
    public final EObject entryRulePianoLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePianoLayer = null;


        try {
            // InternalGuardin.g:1119:51: (iv_rulePianoLayer= rulePianoLayer EOF )
            // InternalGuardin.g:1120:2: iv_rulePianoLayer= rulePianoLayer EOF
            {
             newCompositeNode(grammarAccess.getPianoLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePianoLayer=rulePianoLayer();

            state._fsp--;

             current =iv_rulePianoLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePianoLayer"


    // $ANTLR start "rulePianoLayer"
    // InternalGuardin.g:1126:1: rulePianoLayer returns [EObject current=null] : ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ ) ;
    public final EObject rulePianoLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_notes_2_1 = null;

        EObject lv_notes_2_2 = null;

        EObject lv_notes_2_3 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1132:2: ( ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ ) )
            // InternalGuardin.g:1133:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ )
            {
            // InternalGuardin.g:1133:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ )
            // InternalGuardin.g:1134:3: () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+
            {
            // InternalGuardin.g:1134:3: ()
            // InternalGuardin.g:1135:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getPianoLayerAccess().getLayerKeyword_1());
            		
            // InternalGuardin.g:1145:3: ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21||LA18_0==26||(LA18_0>=49 && LA18_0<=55)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGuardin.g:1146:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) )
            	    {
            	    // InternalGuardin.g:1146:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) )
            	    // InternalGuardin.g:1147:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote )
            	    {
            	    // InternalGuardin.g:1147:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote )
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case 49:
            	    case 50:
            	    case 51:
            	    case 52:
            	    case 53:
            	    case 54:
            	    case 55:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // InternalGuardin.g:1148:6: lv_notes_2_1= rulePianoNote
            	            {

            	            						newCompositeNode(grammarAccess.getPianoLayerAccess().getNotesPianoNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_26);
            	            lv_notes_2_1=rulePianoNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPianoLayerRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_2_1,
            	            							"fr.polytech.dsl.rhythm.Guardin.PianoNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalGuardin.g:1164:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getPianoLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_26);
            	            lv_notes_2_2=ruleEmptyNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPianoLayerRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_2_2,
            	            							"fr.polytech.dsl.rhythm.Guardin.EmptyNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalGuardin.g:1180:6: lv_notes_2_3= ruleCompositePianoNote
            	            {

            	            						newCompositeNode(grammarAccess.getPianoLayerAccess().getNotesCompositePianoNoteParserRuleCall_2_0_2());
            	            					
            	            pushFollow(FOLLOW_26);
            	            lv_notes_2_3=ruleCompositePianoNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPianoLayerRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_2_3,
            	            							"fr.polytech.dsl.rhythm.Guardin.CompositePianoNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePianoLayer"


    // $ANTLR start "entryRulePianoNote"
    // InternalGuardin.g:1202:1: entryRulePianoNote returns [EObject current=null] : iv_rulePianoNote= rulePianoNote EOF ;
    public final EObject entryRulePianoNote() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePianoNote = null;


        try {
            // InternalGuardin.g:1202:50: (iv_rulePianoNote= rulePianoNote EOF )
            // InternalGuardin.g:1203:2: iv_rulePianoNote= rulePianoNote EOF
            {
             newCompositeNode(grammarAccess.getPianoNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePianoNote=rulePianoNote();

            state._fsp--;

             current =iv_rulePianoNote; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePianoNote"


    // $ANTLR start "rulePianoNote"
    // InternalGuardin.g:1209:1: rulePianoNote returns [EObject current=null] : ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) ( (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) ) | (otherlv_4= '|' ( (lv_octaveAbsolute_5_0= ruleEInt ) ) ) )? ) ;
    public final EObject rulePianoNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_noteType_1_0 = null;

        AntlrDatatypeRuleToken lv_octaveOffset_3_0 = null;

        AntlrDatatypeRuleToken lv_octaveAbsolute_5_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1215:2: ( ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) ( (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) ) | (otherlv_4= '|' ( (lv_octaveAbsolute_5_0= ruleEInt ) ) ) )? ) )
            // InternalGuardin.g:1216:2: ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) ( (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) ) | (otherlv_4= '|' ( (lv_octaveAbsolute_5_0= ruleEInt ) ) ) )? )
            {
            // InternalGuardin.g:1216:2: ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) ( (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) ) | (otherlv_4= '|' ( (lv_octaveAbsolute_5_0= ruleEInt ) ) ) )? )
            // InternalGuardin.g:1217:3: () ( (lv_noteType_1_0= rulePianoNoteType ) ) ( (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) ) | (otherlv_4= '|' ( (lv_octaveAbsolute_5_0= ruleEInt ) ) ) )?
            {
            // InternalGuardin.g:1217:3: ()
            // InternalGuardin.g:1218:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoNoteAccess().getPianoNoteAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:1224:3: ( (lv_noteType_1_0= rulePianoNoteType ) )
            // InternalGuardin.g:1225:4: (lv_noteType_1_0= rulePianoNoteType )
            {
            // InternalGuardin.g:1225:4: (lv_noteType_1_0= rulePianoNoteType )
            // InternalGuardin.g:1226:5: lv_noteType_1_0= rulePianoNoteType
            {

            					newCompositeNode(grammarAccess.getPianoNoteAccess().getNoteTypePianoNoteTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_noteType_1_0=rulePianoNoteType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPianoNoteRule());
            					}
            					set(
            						current,
            						"noteType",
            						lv_noteType_1_0,
            						"fr.polytech.dsl.rhythm.Guardin.PianoNoteType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGuardin.g:1243:3: ( (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) ) | (otherlv_4= '|' ( (lv_octaveAbsolute_5_0= ruleEInt ) ) ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==32) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalGuardin.g:1244:4: (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )
                    {
                    // InternalGuardin.g:1244:4: (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )
                    // InternalGuardin.g:1245:5: otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_28); 

                    					newLeafNode(otherlv_2, grammarAccess.getPianoNoteAccess().getSolidusKeyword_2_0_0());
                    				
                    // InternalGuardin.g:1249:5: ( (lv_octaveOffset_3_0= ruleERelativeInt ) )
                    // InternalGuardin.g:1250:6: (lv_octaveOffset_3_0= ruleERelativeInt )
                    {
                    // InternalGuardin.g:1250:6: (lv_octaveOffset_3_0= ruleERelativeInt )
                    // InternalGuardin.g:1251:7: lv_octaveOffset_3_0= ruleERelativeInt
                    {

                    							newCompositeNode(grammarAccess.getPianoNoteAccess().getOctaveOffsetERelativeIntParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_octaveOffset_3_0=ruleERelativeInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPianoNoteRule());
                    							}
                    							set(
                    								current,
                    								"octaveOffset",
                    								lv_octaveOffset_3_0,
                    								"fr.polytech.dsl.rhythm.Guardin.ERelativeInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1270:4: (otherlv_4= '|' ( (lv_octaveAbsolute_5_0= ruleEInt ) ) )
                    {
                    // InternalGuardin.g:1270:4: (otherlv_4= '|' ( (lv_octaveAbsolute_5_0= ruleEInt ) ) )
                    // InternalGuardin.g:1271:5: otherlv_4= '|' ( (lv_octaveAbsolute_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_13); 

                    					newLeafNode(otherlv_4, grammarAccess.getPianoNoteAccess().getVerticalLineKeyword_2_1_0());
                    				
                    // InternalGuardin.g:1275:5: ( (lv_octaveAbsolute_5_0= ruleEInt ) )
                    // InternalGuardin.g:1276:6: (lv_octaveAbsolute_5_0= ruleEInt )
                    {
                    // InternalGuardin.g:1276:6: (lv_octaveAbsolute_5_0= ruleEInt )
                    // InternalGuardin.g:1277:7: lv_octaveAbsolute_5_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getPianoNoteAccess().getOctaveAbsoluteEIntParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_octaveAbsolute_5_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPianoNoteRule());
                    							}
                    							set(
                    								current,
                    								"octaveAbsolute",
                    								lv_octaveAbsolute_5_0,
                    								"fr.polytech.dsl.rhythm.Guardin.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePianoNote"


    // $ANTLR start "entryRuleCompositePianoNote"
    // InternalGuardin.g:1300:1: entryRuleCompositePianoNote returns [EObject current=null] : iv_ruleCompositePianoNote= ruleCompositePianoNote EOF ;
    public final EObject entryRuleCompositePianoNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositePianoNote = null;


        try {
            // InternalGuardin.g:1300:59: (iv_ruleCompositePianoNote= ruleCompositePianoNote EOF )
            // InternalGuardin.g:1301:2: iv_ruleCompositePianoNote= ruleCompositePianoNote EOF
            {
             newCompositeNode(grammarAccess.getCompositePianoNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositePianoNote=ruleCompositePianoNote();

            state._fsp--;

             current =iv_ruleCompositePianoNote; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositePianoNote"


    // $ANTLR start "ruleCompositePianoNote"
    // InternalGuardin.g:1307:1: ruleCompositePianoNote returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) ;
    public final EObject ruleCompositePianoNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_notes_2_1 = null;

        EObject lv_notes_2_2 = null;

        AntlrDatatypeRuleToken lv_repeats_5_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1313:2: ( ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) )
            // InternalGuardin.g:1314:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:1314:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            // InternalGuardin.g:1315:3: () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) )
            {
            // InternalGuardin.g:1315:3: ()
            // InternalGuardin.g:1316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositePianoNoteAccess().getCompositeNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositePianoNoteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGuardin.g:1326:3: ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21||(LA21_0>=49 && LA21_0<=55)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGuardin.g:1327:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) )
            	    {
            	    // InternalGuardin.g:1327:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) )
            	    // InternalGuardin.g:1328:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote )
            	    {
            	    // InternalGuardin.g:1328:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>=49 && LA20_0<=55)) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==21) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalGuardin.g:1329:6: lv_notes_2_1= rulePianoNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositePianoNoteAccess().getNotesPianoNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_30);
            	            lv_notes_2_1=rulePianoNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getCompositePianoNoteRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_2_1,
            	            							"fr.polytech.dsl.rhythm.Guardin.PianoNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalGuardin.g:1345:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositePianoNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_30);
            	            lv_notes_2_2=ruleEmptyNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getCompositePianoNoteRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_2_2,
            	            							"fr.polytech.dsl.rhythm.Guardin.EmptyNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositePianoNoteAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositePianoNoteAccess().getXKeyword_4());
            		
            // InternalGuardin.g:1371:3: ( (lv_repeats_5_0= ruleEInt ) )
            // InternalGuardin.g:1372:4: (lv_repeats_5_0= ruleEInt )
            {
            // InternalGuardin.g:1372:4: (lv_repeats_5_0= ruleEInt )
            // InternalGuardin.g:1373:5: lv_repeats_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCompositePianoNoteAccess().getRepeatsEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_repeats_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositePianoNoteRule());
            					}
            					set(
            						current,
            						"repeats",
            						lv_repeats_5_0,
            						"fr.polytech.dsl.rhythm.Guardin.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositePianoNote"


    // $ANTLR start "entryRuleEInt"
    // InternalGuardin.g:1394:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGuardin.g:1394:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGuardin.g:1395:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalGuardin.g:1401:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGuardin.g:1407:2: (this_INT_0= RULE_INT )
            // InternalGuardin.g:1408:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleERelativeInt"
    // InternalGuardin.g:1418:1: entryRuleERelativeInt returns [String current=null] : iv_ruleERelativeInt= ruleERelativeInt EOF ;
    public final String entryRuleERelativeInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleERelativeInt = null;


        try {
            // InternalGuardin.g:1418:52: (iv_ruleERelativeInt= ruleERelativeInt EOF )
            // InternalGuardin.g:1419:2: iv_ruleERelativeInt= ruleERelativeInt EOF
            {
             newCompositeNode(grammarAccess.getERelativeIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERelativeInt=ruleERelativeInt();

            state._fsp--;

             current =iv_ruleERelativeInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERelativeInt"


    // $ANTLR start "ruleERelativeInt"
    // InternalGuardin.g:1425:1: ruleERelativeInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleERelativeInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:1431:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGuardin.g:1432:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGuardin.g:1432:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGuardin.g:1433:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGuardin.g:1433:3: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGuardin.g:1434:4: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getERelativeIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getERelativeIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERelativeInt"


    // $ANTLR start "entryRuleEString"
    // InternalGuardin.g:1451:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGuardin.g:1451:47: (iv_ruleEString= ruleEString EOF )
            // InternalGuardin.g:1452:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGuardin.g:1458:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:1464:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGuardin.g:1465:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGuardin.g:1465:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGuardin.g:1466:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1474:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleBatteryNoteType"
    // InternalGuardin.g:1485:1: ruleBatteryNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) ;
    public final Enumerator ruleBatteryNoteType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalGuardin.g:1491:2: ( ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) )
            // InternalGuardin.g:1492:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            {
            // InternalGuardin.g:1492:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt24=1;
                }
                break;
            case 34:
                {
                alt24=2;
                }
                break;
            case 35:
                {
                alt24=3;
                }
                break;
            case 36:
                {
                alt24=4;
                }
                break;
            case 37:
                {
                alt24=5;
                }
                break;
            case 38:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalGuardin.g:1493:3: (enumLiteral_0= 'bd' )
                    {
                    // InternalGuardin.g:1493:3: (enumLiteral_0= 'bd' )
                    // InternalGuardin.g:1494:4: enumLiteral_0= 'bd'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1501:3: (enumLiteral_1= 'ch' )
                    {
                    // InternalGuardin.g:1501:3: (enumLiteral_1= 'ch' )
                    // InternalGuardin.g:1502:4: enumLiteral_1= 'ch'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:1509:3: (enumLiteral_2= 'cc' )
                    {
                    // InternalGuardin.g:1509:3: (enumLiteral_2= 'cc' )
                    // InternalGuardin.g:1510:4: enumLiteral_2= 'cc'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1517:3: (enumLiteral_3= 'oh' )
                    {
                    // InternalGuardin.g:1517:3: (enumLiteral_3= 'oh' )
                    // InternalGuardin.g:1518:4: enumLiteral_3= 'oh'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1525:3: (enumLiteral_4= 'rc' )
                    {
                    // InternalGuardin.g:1525:3: (enumLiteral_4= 'rc' )
                    // InternalGuardin.g:1526:4: enumLiteral_4= 'rc'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1533:3: (enumLiteral_5= 'sd' )
                    {
                    // InternalGuardin.g:1533:3: (enumLiteral_5= 'sd' )
                    // InternalGuardin.g:1534:4: enumLiteral_5= 'sd'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getSNARE_DRUMEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBatteryNoteTypeAccess().getSNARE_DRUMEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBatteryNoteType"


    // $ANTLR start "ruleInstruments"
    // InternalGuardin.g:1544:1: ruleInstruments returns [Enumerator current=null] : ( (enumLiteral_0= 'ACOUSTIC_BASS' ) | (enumLiteral_1= 'CHURCH_ORGAN' ) | (enumLiteral_2= 'CLAVINET' ) | (enumLiteral_3= 'GUITAR' ) | (enumLiteral_4= 'HARPSICHORD' ) | (enumLiteral_5= 'MUSIC_BOX' ) | (enumLiteral_6= 'OCARINA' ) | (enumLiteral_7= 'PIANO' ) | (enumLiteral_8= 'SYNTH_BASS_1' ) | (enumLiteral_9= 'VIOLIN' ) ) ;
    public final Enumerator ruleInstruments() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalGuardin.g:1550:2: ( ( (enumLiteral_0= 'ACOUSTIC_BASS' ) | (enumLiteral_1= 'CHURCH_ORGAN' ) | (enumLiteral_2= 'CLAVINET' ) | (enumLiteral_3= 'GUITAR' ) | (enumLiteral_4= 'HARPSICHORD' ) | (enumLiteral_5= 'MUSIC_BOX' ) | (enumLiteral_6= 'OCARINA' ) | (enumLiteral_7= 'PIANO' ) | (enumLiteral_8= 'SYNTH_BASS_1' ) | (enumLiteral_9= 'VIOLIN' ) ) )
            // InternalGuardin.g:1551:2: ( (enumLiteral_0= 'ACOUSTIC_BASS' ) | (enumLiteral_1= 'CHURCH_ORGAN' ) | (enumLiteral_2= 'CLAVINET' ) | (enumLiteral_3= 'GUITAR' ) | (enumLiteral_4= 'HARPSICHORD' ) | (enumLiteral_5= 'MUSIC_BOX' ) | (enumLiteral_6= 'OCARINA' ) | (enumLiteral_7= 'PIANO' ) | (enumLiteral_8= 'SYNTH_BASS_1' ) | (enumLiteral_9= 'VIOLIN' ) )
            {
            // InternalGuardin.g:1551:2: ( (enumLiteral_0= 'ACOUSTIC_BASS' ) | (enumLiteral_1= 'CHURCH_ORGAN' ) | (enumLiteral_2= 'CLAVINET' ) | (enumLiteral_3= 'GUITAR' ) | (enumLiteral_4= 'HARPSICHORD' ) | (enumLiteral_5= 'MUSIC_BOX' ) | (enumLiteral_6= 'OCARINA' ) | (enumLiteral_7= 'PIANO' ) | (enumLiteral_8= 'SYNTH_BASS_1' ) | (enumLiteral_9= 'VIOLIN' ) )
            int alt25=10;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt25=1;
                }
                break;
            case 40:
                {
                alt25=2;
                }
                break;
            case 41:
                {
                alt25=3;
                }
                break;
            case 42:
                {
                alt25=4;
                }
                break;
            case 43:
                {
                alt25=5;
                }
                break;
            case 44:
                {
                alt25=6;
                }
                break;
            case 45:
                {
                alt25=7;
                }
                break;
            case 46:
                {
                alt25=8;
                }
                break;
            case 47:
                {
                alt25=9;
                }
                break;
            case 48:
                {
                alt25=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalGuardin.g:1552:3: (enumLiteral_0= 'ACOUSTIC_BASS' )
                    {
                    // InternalGuardin.g:1552:3: (enumLiteral_0= 'ACOUSTIC_BASS' )
                    // InternalGuardin.g:1553:4: enumLiteral_0= 'ACOUSTIC_BASS'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getInstrumentsAccess().getACOUSTIC_BASSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInstrumentsAccess().getACOUSTIC_BASSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1560:3: (enumLiteral_1= 'CHURCH_ORGAN' )
                    {
                    // InternalGuardin.g:1560:3: (enumLiteral_1= 'CHURCH_ORGAN' )
                    // InternalGuardin.g:1561:4: enumLiteral_1= 'CHURCH_ORGAN'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getInstrumentsAccess().getCHURCH_ORGANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInstrumentsAccess().getCHURCH_ORGANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:1568:3: (enumLiteral_2= 'CLAVINET' )
                    {
                    // InternalGuardin.g:1568:3: (enumLiteral_2= 'CLAVINET' )
                    // InternalGuardin.g:1569:4: enumLiteral_2= 'CLAVINET'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getInstrumentsAccess().getCLAVINETEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getInstrumentsAccess().getCLAVINETEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1576:3: (enumLiteral_3= 'GUITAR' )
                    {
                    // InternalGuardin.g:1576:3: (enumLiteral_3= 'GUITAR' )
                    // InternalGuardin.g:1577:4: enumLiteral_3= 'GUITAR'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getInstrumentsAccess().getGUITAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getInstrumentsAccess().getGUITAREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1584:3: (enumLiteral_4= 'HARPSICHORD' )
                    {
                    // InternalGuardin.g:1584:3: (enumLiteral_4= 'HARPSICHORD' )
                    // InternalGuardin.g:1585:4: enumLiteral_4= 'HARPSICHORD'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getInstrumentsAccess().getHARPSICHORDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getInstrumentsAccess().getHARPSICHORDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1592:3: (enumLiteral_5= 'MUSIC_BOX' )
                    {
                    // InternalGuardin.g:1592:3: (enumLiteral_5= 'MUSIC_BOX' )
                    // InternalGuardin.g:1593:4: enumLiteral_5= 'MUSIC_BOX'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getInstrumentsAccess().getMUSIC_BOXEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getInstrumentsAccess().getMUSIC_BOXEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:1600:3: (enumLiteral_6= 'OCARINA' )
                    {
                    // InternalGuardin.g:1600:3: (enumLiteral_6= 'OCARINA' )
                    // InternalGuardin.g:1601:4: enumLiteral_6= 'OCARINA'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getInstrumentsAccess().getOCARINAEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getInstrumentsAccess().getOCARINAEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalGuardin.g:1608:3: (enumLiteral_7= 'PIANO' )
                    {
                    // InternalGuardin.g:1608:3: (enumLiteral_7= 'PIANO' )
                    // InternalGuardin.g:1609:4: enumLiteral_7= 'PIANO'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getInstrumentsAccess().getPIANOEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getInstrumentsAccess().getPIANOEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalGuardin.g:1616:3: (enumLiteral_8= 'SYNTH_BASS_1' )
                    {
                    // InternalGuardin.g:1616:3: (enumLiteral_8= 'SYNTH_BASS_1' )
                    // InternalGuardin.g:1617:4: enumLiteral_8= 'SYNTH_BASS_1'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getInstrumentsAccess().getSYNTH_BASS_1EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getInstrumentsAccess().getSYNTH_BASS_1EnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalGuardin.g:1624:3: (enumLiteral_9= 'VIOLIN' )
                    {
                    // InternalGuardin.g:1624:3: (enumLiteral_9= 'VIOLIN' )
                    // InternalGuardin.g:1625:4: enumLiteral_9= 'VIOLIN'
                    {
                    enumLiteral_9=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getInstrumentsAccess().getVIOLINEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getInstrumentsAccess().getVIOLINEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruments"


    // $ANTLR start "rulePianoNoteType"
    // InternalGuardin.g:1635:1: rulePianoNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) ) ;
    public final Enumerator rulePianoNoteType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalGuardin.g:1641:2: ( ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) ) )
            // InternalGuardin.g:1642:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) )
            {
            // InternalGuardin.g:1642:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) )
            int alt26=7;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt26=1;
                }
                break;
            case 50:
                {
                alt26=2;
                }
                break;
            case 51:
                {
                alt26=3;
                }
                break;
            case 52:
                {
                alt26=4;
                }
                break;
            case 53:
                {
                alt26=5;
                }
                break;
            case 54:
                {
                alt26=6;
                }
                break;
            case 55:
                {
                alt26=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalGuardin.g:1643:3: (enumLiteral_0= 'A' )
                    {
                    // InternalGuardin.g:1643:3: (enumLiteral_0= 'A' )
                    // InternalGuardin.g:1644:4: enumLiteral_0= 'A'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1651:3: (enumLiteral_1= 'B' )
                    {
                    // InternalGuardin.g:1651:3: (enumLiteral_1= 'B' )
                    // InternalGuardin.g:1652:4: enumLiteral_1= 'B'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:1659:3: (enumLiteral_2= 'C' )
                    {
                    // InternalGuardin.g:1659:3: (enumLiteral_2= 'C' )
                    // InternalGuardin.g:1660:4: enumLiteral_2= 'C'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1667:3: (enumLiteral_3= 'D' )
                    {
                    // InternalGuardin.g:1667:3: (enumLiteral_3= 'D' )
                    // InternalGuardin.g:1668:4: enumLiteral_3= 'D'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1675:3: (enumLiteral_4= 'E' )
                    {
                    // InternalGuardin.g:1675:3: (enumLiteral_4= 'E' )
                    // InternalGuardin.g:1676:4: enumLiteral_4= 'E'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1683:3: (enumLiteral_5= 'F' )
                    {
                    // InternalGuardin.g:1683:3: (enumLiteral_5= 'F' )
                    // InternalGuardin.g:1684:4: enumLiteral_5= 'F'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:1691:3: (enumLiteral_6= 'G' )
                    {
                    // InternalGuardin.g:1691:3: (enumLiteral_6= 'G' )
                    // InternalGuardin.g:1692:4: enumLiteral_6= 'G'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPianoNoteTypeAccess().getGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePianoNoteType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001FF8060400060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000007E04200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000007E04200002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007E00200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007E08200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00FE000004200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00FE000004200002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00FE000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00FE000008200000L});

}