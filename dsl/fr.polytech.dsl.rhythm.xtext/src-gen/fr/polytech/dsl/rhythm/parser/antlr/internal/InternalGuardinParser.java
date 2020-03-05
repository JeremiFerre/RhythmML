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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CustomSoundBank'", "'basePath='", "'Music'", "':'", "'sections'", "'tracks'", "'-'", "'tempo='", "'signature='", "'bars='", "'$'", "'battery'", "'debut_section'", "'fin_section'", "'layer:'", "'('", "')'", "'x'", "'piano'", "'/'", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'"
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
            else if ( (LA5_0==29) ) {
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
    // InternalGuardin.g:615:1: ruleSectionBatteryLayer returns [EObject current=null] : ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'fin_section' ) ;
    public final EObject ruleSectionBatteryLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_layers_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:621:2: ( ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'fin_section' ) )
            // InternalGuardin.g:622:2: ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'fin_section' )
            {
            // InternalGuardin.g:622:2: ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'fin_section' )
            // InternalGuardin.g:623:3: () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'fin_section'
            {
            // InternalGuardin.g:623:3: ()
            // InternalGuardin.g:624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionBatteryLayerAccess().getSectionLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionBatteryLayerAccess().getDebut_sectionKeyword_1());
            		
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

            			newLeafNode(otherlv_4, grammarAccess.getSectionBatteryLayerAccess().getFin_sectionKeyword_4());
            		

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

                if ( (LA10_0==21||LA10_0==26||(LA10_0>=31 && LA10_0<=36)) ) {
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
            	    case 31:
            	    case 32:
            	    case 33:
            	    case 34:
            	    case 35:
            	    case 36:
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

                if ( (LA12_0==21||(LA12_0>=31 && LA12_0<=36)) ) {
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

            	    if ( ((LA11_0>=31 && LA11_0<=36)) ) {
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
    // InternalGuardin.g:906:1: rulePiano returns [EObject current=null] : ( () otherlv_1= 'piano' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+ ) ;
    public final EObject rulePiano() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_sections_5_0 = null;

        EObject lv_layers_6_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:912:2: ( ( () otherlv_1= 'piano' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+ ) )
            // InternalGuardin.g:913:2: ( () otherlv_1= 'piano' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+ )
            {
            // InternalGuardin.g:913:2: ( () otherlv_1= 'piano' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+ )
            // InternalGuardin.g:914:3: () otherlv_1= 'piano' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+
            {
            // InternalGuardin.g:914:3: ()
            // InternalGuardin.g:915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoAccess().getPianoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPianoAccess().getPianoKeyword_1());
            		
            // InternalGuardin.g:925:3: (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGuardin.g:926:4: otherlv_2= ':'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getPianoAccess().getColonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:931:4: ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' )
                    {
                    // InternalGuardin.g:931:4: ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' )
                    // InternalGuardin.g:932:5: ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':'
                    {
                    // InternalGuardin.g:932:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalGuardin.g:933:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalGuardin.g:933:6: (lv_name_3_0= ruleEString )
                    // InternalGuardin.g:934:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPianoAccess().getNameEStringParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPianoRule());
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

                    					newLeafNode(otherlv_4, grammarAccess.getPianoAccess().getColonKeyword_2_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalGuardin.g:957:3: ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }
                else if ( (LA14_0==25) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGuardin.g:958:4: ( (lv_sections_5_0= ruleSectionPianoLayer ) )
            	    {
            	    // InternalGuardin.g:958:4: ( (lv_sections_5_0= ruleSectionPianoLayer ) )
            	    // InternalGuardin.g:959:5: (lv_sections_5_0= ruleSectionPianoLayer )
            	    {
            	    // InternalGuardin.g:959:5: (lv_sections_5_0= ruleSectionPianoLayer )
            	    // InternalGuardin.g:960:6: lv_sections_5_0= ruleSectionPianoLayer
            	    {

            	    						newCompositeNode(grammarAccess.getPianoAccess().getSectionsSectionPianoLayerParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_sections_5_0=ruleSectionPianoLayer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPianoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_5_0,
            	    							"fr.polytech.dsl.rhythm.Guardin.SectionPianoLayer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGuardin.g:978:4: ( (lv_layers_6_0= rulePianoLayer ) )
            	    {
            	    // InternalGuardin.g:978:4: ( (lv_layers_6_0= rulePianoLayer ) )
            	    // InternalGuardin.g:979:5: (lv_layers_6_0= rulePianoLayer )
            	    {
            	    // InternalGuardin.g:979:5: (lv_layers_6_0= rulePianoLayer )
            	    // InternalGuardin.g:980:6: lv_layers_6_0= rulePianoLayer
            	    {

            	    						newCompositeNode(grammarAccess.getPianoAccess().getLayersPianoLayerParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_layers_6_0=rulePianoLayer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPianoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"layers",
            	    							lv_layers_6_0,
            	    							"fr.polytech.dsl.rhythm.Guardin.PianoLayer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // InternalGuardin.g:1002:1: entryRuleSectionPianoLayer returns [EObject current=null] : iv_ruleSectionPianoLayer= ruleSectionPianoLayer EOF ;
    public final EObject entryRuleSectionPianoLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionPianoLayer = null;


        try {
            // InternalGuardin.g:1002:58: (iv_ruleSectionPianoLayer= ruleSectionPianoLayer EOF )
            // InternalGuardin.g:1003:2: iv_ruleSectionPianoLayer= ruleSectionPianoLayer EOF
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
    // InternalGuardin.g:1009:1: ruleSectionPianoLayer returns [EObject current=null] : ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'fin_section' ) ;
    public final EObject ruleSectionPianoLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_layers_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1015:2: ( ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'fin_section' ) )
            // InternalGuardin.g:1016:2: ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'fin_section' )
            {
            // InternalGuardin.g:1016:2: ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'fin_section' )
            // InternalGuardin.g:1017:3: () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'fin_section'
            {
            // InternalGuardin.g:1017:3: ()
            // InternalGuardin.g:1018:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionPianoLayerAccess().getSectionLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionPianoLayerAccess().getDebut_sectionKeyword_1());
            		
            // InternalGuardin.g:1028:3: ( ( ruleEString ) )
            // InternalGuardin.g:1029:4: ( ruleEString )
            {
            // InternalGuardin.g:1029:4: ( ruleEString )
            // InternalGuardin.g:1030:5: ruleEString
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

            // InternalGuardin.g:1044:3: ( (lv_layers_3_0= rulePianoLayer ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGuardin.g:1045:4: (lv_layers_3_0= rulePianoLayer )
            	    {
            	    // InternalGuardin.g:1045:4: (lv_layers_3_0= rulePianoLayer )
            	    // InternalGuardin.g:1046:5: lv_layers_3_0= rulePianoLayer
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSectionPianoLayerAccess().getFin_sectionKeyword_4());
            		

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
    // InternalGuardin.g:1071:1: entryRulePianoLayer returns [EObject current=null] : iv_rulePianoLayer= rulePianoLayer EOF ;
    public final EObject entryRulePianoLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePianoLayer = null;


        try {
            // InternalGuardin.g:1071:51: (iv_rulePianoLayer= rulePianoLayer EOF )
            // InternalGuardin.g:1072:2: iv_rulePianoLayer= rulePianoLayer EOF
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
    // InternalGuardin.g:1078:1: rulePianoLayer returns [EObject current=null] : ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ ) ;
    public final EObject rulePianoLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_notes_2_1 = null;

        EObject lv_notes_2_2 = null;

        EObject lv_notes_2_3 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1084:2: ( ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ ) )
            // InternalGuardin.g:1085:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ )
            {
            // InternalGuardin.g:1085:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ )
            // InternalGuardin.g:1086:3: () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+
            {
            // InternalGuardin.g:1086:3: ()
            // InternalGuardin.g:1087:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getPianoLayerAccess().getLayerKeyword_1());
            		
            // InternalGuardin.g:1097:3: ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21||LA17_0==26||(LA17_0>=37 && LA17_0<=43)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGuardin.g:1098:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) )
            	    {
            	    // InternalGuardin.g:1098:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) )
            	    // InternalGuardin.g:1099:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote )
            	    {
            	    // InternalGuardin.g:1099:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote )
            	    int alt16=3;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 43:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // InternalGuardin.g:1100:6: lv_notes_2_1= rulePianoNote
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
            	            // InternalGuardin.g:1116:6: lv_notes_2_2= ruleEmptyNote
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
            	            // InternalGuardin.g:1132:6: lv_notes_2_3= ruleCompositePianoNote
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // InternalGuardin.g:1154:1: entryRulePianoNote returns [EObject current=null] : iv_rulePianoNote= rulePianoNote EOF ;
    public final EObject entryRulePianoNote() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePianoNote = null;


        try {
            // InternalGuardin.g:1154:50: (iv_rulePianoNote= rulePianoNote EOF )
            // InternalGuardin.g:1155:2: iv_rulePianoNote= rulePianoNote EOF
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
    // InternalGuardin.g:1161:1: rulePianoNote returns [EObject current=null] : ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? ) ;
    public final EObject rulePianoNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_noteType_1_0 = null;

        AntlrDatatypeRuleToken lv_octaveOffset_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1167:2: ( ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? ) )
            // InternalGuardin.g:1168:2: ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? )
            {
            // InternalGuardin.g:1168:2: ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? )
            // InternalGuardin.g:1169:3: () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )?
            {
            // InternalGuardin.g:1169:3: ()
            // InternalGuardin.g:1170:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoNoteAccess().getPianoNoteAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:1176:3: ( (lv_noteType_1_0= rulePianoNoteType ) )
            // InternalGuardin.g:1177:4: (lv_noteType_1_0= rulePianoNoteType )
            {
            // InternalGuardin.g:1177:4: (lv_noteType_1_0= rulePianoNoteType )
            // InternalGuardin.g:1178:5: lv_noteType_1_0= rulePianoNoteType
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

            // InternalGuardin.g:1195:3: (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGuardin.g:1196:4: otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getPianoNoteAccess().getSolidusKeyword_2_0());
                    			
                    // InternalGuardin.g:1200:4: ( (lv_octaveOffset_3_0= ruleERelativeInt ) )
                    // InternalGuardin.g:1201:5: (lv_octaveOffset_3_0= ruleERelativeInt )
                    {
                    // InternalGuardin.g:1201:5: (lv_octaveOffset_3_0= ruleERelativeInt )
                    // InternalGuardin.g:1202:6: lv_octaveOffset_3_0= ruleERelativeInt
                    {

                    						newCompositeNode(grammarAccess.getPianoNoteAccess().getOctaveOffsetERelativeIntParserRuleCall_2_1_0());
                    					
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
    // InternalGuardin.g:1224:1: entryRuleCompositePianoNote returns [EObject current=null] : iv_ruleCompositePianoNote= ruleCompositePianoNote EOF ;
    public final EObject entryRuleCompositePianoNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositePianoNote = null;


        try {
            // InternalGuardin.g:1224:59: (iv_ruleCompositePianoNote= ruleCompositePianoNote EOF )
            // InternalGuardin.g:1225:2: iv_ruleCompositePianoNote= ruleCompositePianoNote EOF
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
    // InternalGuardin.g:1231:1: ruleCompositePianoNote returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) ;
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
            // InternalGuardin.g:1237:2: ( ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) )
            // InternalGuardin.g:1238:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:1238:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            // InternalGuardin.g:1239:3: () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) )
            {
            // InternalGuardin.g:1239:3: ()
            // InternalGuardin.g:1240:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositePianoNoteAccess().getCompositeNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositePianoNoteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGuardin.g:1250:3: ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21||(LA20_0>=37 && LA20_0<=43)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGuardin.g:1251:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) )
            	    {
            	    // InternalGuardin.g:1251:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) )
            	    // InternalGuardin.g:1252:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote )
            	    {
            	    // InternalGuardin.g:1252:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( ((LA19_0>=37 && LA19_0<=43)) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==21) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalGuardin.g:1253:6: lv_notes_2_1= rulePianoNote
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
            	            // InternalGuardin.g:1269:6: lv_notes_2_2= ruleEmptyNote
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositePianoNoteAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositePianoNoteAccess().getXKeyword_4());
            		
            // InternalGuardin.g:1295:3: ( (lv_repeats_5_0= ruleEInt ) )
            // InternalGuardin.g:1296:4: (lv_repeats_5_0= ruleEInt )
            {
            // InternalGuardin.g:1296:4: (lv_repeats_5_0= ruleEInt )
            // InternalGuardin.g:1297:5: lv_repeats_5_0= ruleEInt
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
    // InternalGuardin.g:1318:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGuardin.g:1318:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGuardin.g:1319:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalGuardin.g:1325:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGuardin.g:1331:2: (this_INT_0= RULE_INT )
            // InternalGuardin.g:1332:2: this_INT_0= RULE_INT
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
    // InternalGuardin.g:1342:1: entryRuleERelativeInt returns [String current=null] : iv_ruleERelativeInt= ruleERelativeInt EOF ;
    public final String entryRuleERelativeInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleERelativeInt = null;


        try {
            // InternalGuardin.g:1342:52: (iv_ruleERelativeInt= ruleERelativeInt EOF )
            // InternalGuardin.g:1343:2: iv_ruleERelativeInt= ruleERelativeInt EOF
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
    // InternalGuardin.g:1349:1: ruleERelativeInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleERelativeInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:1355:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGuardin.g:1356:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGuardin.g:1356:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGuardin.g:1357:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGuardin.g:1357:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGuardin.g:1358:4: kw= '-'
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
    // InternalGuardin.g:1375:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGuardin.g:1375:47: (iv_ruleEString= ruleEString EOF )
            // InternalGuardin.g:1376:2: iv_ruleEString= ruleEString EOF
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
    // InternalGuardin.g:1382:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:1388:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGuardin.g:1389:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGuardin.g:1389:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGuardin.g:1390:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1398:3: this_ID_1= RULE_ID
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
    // InternalGuardin.g:1409:1: ruleBatteryNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) ;
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
            // InternalGuardin.g:1415:2: ( ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) )
            // InternalGuardin.g:1416:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            {
            // InternalGuardin.g:1416:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt23=1;
                }
                break;
            case 32:
                {
                alt23=2;
                }
                break;
            case 33:
                {
                alt23=3;
                }
                break;
            case 34:
                {
                alt23=4;
                }
                break;
            case 35:
                {
                alt23=5;
                }
                break;
            case 36:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalGuardin.g:1417:3: (enumLiteral_0= 'bd' )
                    {
                    // InternalGuardin.g:1417:3: (enumLiteral_0= 'bd' )
                    // InternalGuardin.g:1418:4: enumLiteral_0= 'bd'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1425:3: (enumLiteral_1= 'ch' )
                    {
                    // InternalGuardin.g:1425:3: (enumLiteral_1= 'ch' )
                    // InternalGuardin.g:1426:4: enumLiteral_1= 'ch'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:1433:3: (enumLiteral_2= 'cc' )
                    {
                    // InternalGuardin.g:1433:3: (enumLiteral_2= 'cc' )
                    // InternalGuardin.g:1434:4: enumLiteral_2= 'cc'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1441:3: (enumLiteral_3= 'oh' )
                    {
                    // InternalGuardin.g:1441:3: (enumLiteral_3= 'oh' )
                    // InternalGuardin.g:1442:4: enumLiteral_3= 'oh'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1449:3: (enumLiteral_4= 'rc' )
                    {
                    // InternalGuardin.g:1449:3: (enumLiteral_4= 'rc' )
                    // InternalGuardin.g:1450:4: enumLiteral_4= 'rc'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1457:3: (enumLiteral_5= 'sd' )
                    {
                    // InternalGuardin.g:1457:3: (enumLiteral_5= 'sd' )
                    // InternalGuardin.g:1458:4: enumLiteral_5= 'sd'
                    {
                    enumLiteral_5=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "rulePianoNoteType"
    // InternalGuardin.g:1468:1: rulePianoNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) ) ;
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
            // InternalGuardin.g:1474:2: ( ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) ) )
            // InternalGuardin.g:1475:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) )
            {
            // InternalGuardin.g:1475:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) )
            int alt24=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            case 39:
                {
                alt24=3;
                }
                break;
            case 40:
                {
                alt24=4;
                }
                break;
            case 41:
                {
                alt24=5;
                }
                break;
            case 42:
                {
                alt24=6;
                }
                break;
            case 43:
                {
                alt24=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalGuardin.g:1476:3: (enumLiteral_0= 'A' )
                    {
                    // InternalGuardin.g:1476:3: (enumLiteral_0= 'A' )
                    // InternalGuardin.g:1477:4: enumLiteral_0= 'A'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1484:3: (enumLiteral_1= 'B' )
                    {
                    // InternalGuardin.g:1484:3: (enumLiteral_1= 'B' )
                    // InternalGuardin.g:1485:4: enumLiteral_1= 'B'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:1492:3: (enumLiteral_2= 'C' )
                    {
                    // InternalGuardin.g:1492:3: (enumLiteral_2= 'C' )
                    // InternalGuardin.g:1493:4: enumLiteral_2= 'C'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1500:3: (enumLiteral_3= 'D' )
                    {
                    // InternalGuardin.g:1500:3: (enumLiteral_3= 'D' )
                    // InternalGuardin.g:1501:4: enumLiteral_3= 'D'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1508:3: (enumLiteral_4= 'E' )
                    {
                    // InternalGuardin.g:1508:3: (enumLiteral_4= 'E' )
                    // InternalGuardin.g:1509:4: enumLiteral_4= 'E'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1516:3: (enumLiteral_5= 'F' )
                    {
                    // InternalGuardin.g:1516:3: (enumLiteral_5= 'F' )
                    // InternalGuardin.g:1517:4: enumLiteral_5= 'F'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:1524:3: (enumLiteral_6= 'G' )
                    {
                    // InternalGuardin.g:1524:3: (enumLiteral_6= 'G' )
                    // InternalGuardin.g:1525:4: enumLiteral_6= 'G'
                    {
                    enumLiteral_6=(Token)match(input,43,FOLLOW_2); 

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020400060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001F84200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001F84200002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001F80200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001F88200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000FE004200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000FE004200002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000FE000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000FE008200000L});

}