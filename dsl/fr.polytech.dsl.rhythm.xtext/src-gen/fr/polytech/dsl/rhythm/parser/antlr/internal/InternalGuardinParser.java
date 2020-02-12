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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'tracks'", "'-'", "'tempo='", "'signature='", "'bars='", "'instrument'", "'$'", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'"
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
    // InternalGuardin.g:72:1: ruleMusic returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_section_3_0= ruleSection ) ) ( (lv_section_4_0= ruleSection ) )* otherlv_5= 'tracks' otherlv_6= ':' (otherlv_7= '-' ( (lv_track_8_0= ruleTrack ) ) (otherlv_9= '-' ( (lv_track_10_0= ruleTrack ) ) )* ) ) ;
    public final EObject ruleMusic() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_section_3_0 = null;

        EObject lv_section_4_0 = null;

        EObject lv_track_8_0 = null;

        EObject lv_track_10_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:78:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_section_3_0= ruleSection ) ) ( (lv_section_4_0= ruleSection ) )* otherlv_5= 'tracks' otherlv_6= ':' (otherlv_7= '-' ( (lv_track_8_0= ruleTrack ) ) (otherlv_9= '-' ( (lv_track_10_0= ruleTrack ) ) )* ) ) )
            // InternalGuardin.g:79:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_section_3_0= ruleSection ) ) ( (lv_section_4_0= ruleSection ) )* otherlv_5= 'tracks' otherlv_6= ':' (otherlv_7= '-' ( (lv_track_8_0= ruleTrack ) ) (otherlv_9= '-' ( (lv_track_10_0= ruleTrack ) ) )* ) )
            {
            // InternalGuardin.g:79:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_section_3_0= ruleSection ) ) ( (lv_section_4_0= ruleSection ) )* otherlv_5= 'tracks' otherlv_6= ':' (otherlv_7= '-' ( (lv_track_8_0= ruleTrack ) ) (otherlv_9= '-' ( (lv_track_10_0= ruleTrack ) ) )* ) )
            // InternalGuardin.g:80:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_section_3_0= ruleSection ) ) ( (lv_section_4_0= ruleSection ) )* otherlv_5= 'tracks' otherlv_6= ':' (otherlv_7= '-' ( (lv_track_8_0= ruleTrack ) ) (otherlv_9= '-' ( (lv_track_10_0= ruleTrack ) ) )* )
            {
            // InternalGuardin.g:80:3: ()
            // InternalGuardin.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMusicAccess().getMusicAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:87:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGuardin.g:88:4: (lv_name_1_0= ruleEString )
            {
            // InternalGuardin.g:88:4: (lv_name_1_0= ruleEString )
            // InternalGuardin.g:89:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.polytech.dsl.rhythm.Guardin.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMusicAccess().getColonKeyword_2());
            		
            // InternalGuardin.g:110:3: ( (lv_section_3_0= ruleSection ) )
            // InternalGuardin.g:111:4: (lv_section_3_0= ruleSection )
            {
            // InternalGuardin.g:111:4: (lv_section_3_0= ruleSection )
            // InternalGuardin.g:112:5: lv_section_3_0= ruleSection
            {

            					newCompositeNode(grammarAccess.getMusicAccess().getSectionSectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_section_3_0=ruleSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicRule());
            					}
            					add(
            						current,
            						"section",
            						lv_section_3_0,
            						"fr.polytech.dsl.rhythm.Guardin.Section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGuardin.g:129:3: ( (lv_section_4_0= ruleSection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGuardin.g:130:4: (lv_section_4_0= ruleSection )
            	    {
            	    // InternalGuardin.g:130:4: (lv_section_4_0= ruleSection )
            	    // InternalGuardin.g:131:5: lv_section_4_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getMusicAccess().getSectionSectionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_section_4_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMusicRule());
            	    					}
            	    					add(
            	    						current,
            	    						"section",
            	    						lv_section_4_0,
            	    						"fr.polytech.dsl.rhythm.Guardin.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMusicAccess().getTracksKeyword_5());
            		
            otherlv_6=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getMusicAccess().getColonKeyword_6());
            		
            // InternalGuardin.g:156:3: (otherlv_7= '-' ( (lv_track_8_0= ruleTrack ) ) (otherlv_9= '-' ( (lv_track_10_0= ruleTrack ) ) )* )
            // InternalGuardin.g:157:4: otherlv_7= '-' ( (lv_track_8_0= ruleTrack ) ) (otherlv_9= '-' ( (lv_track_10_0= ruleTrack ) ) )*
            {
            otherlv_7=(Token)match(input,13,FOLLOW_7); 

            				newLeafNode(otherlv_7, grammarAccess.getMusicAccess().getHyphenMinusKeyword_7_0());
            			
            // InternalGuardin.g:161:4: ( (lv_track_8_0= ruleTrack ) )
            // InternalGuardin.g:162:5: (lv_track_8_0= ruleTrack )
            {
            // InternalGuardin.g:162:5: (lv_track_8_0= ruleTrack )
            // InternalGuardin.g:163:6: lv_track_8_0= ruleTrack
            {

            						newCompositeNode(grammarAccess.getMusicAccess().getTrackTrackParserRuleCall_7_1_0());
            					
            pushFollow(FOLLOW_8);
            lv_track_8_0=ruleTrack();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMusicRule());
            						}
            						add(
            							current,
            							"track",
            							lv_track_8_0,
            							"fr.polytech.dsl.rhythm.Guardin.Track");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalGuardin.g:180:4: (otherlv_9= '-' ( (lv_track_10_0= ruleTrack ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGuardin.g:181:5: otherlv_9= '-' ( (lv_track_10_0= ruleTrack ) )
            	    {
            	    otherlv_9=(Token)match(input,13,FOLLOW_7); 

            	    					newLeafNode(otherlv_9, grammarAccess.getMusicAccess().getHyphenMinusKeyword_7_2_0());
            	    				
            	    // InternalGuardin.g:185:5: ( (lv_track_10_0= ruleTrack ) )
            	    // InternalGuardin.g:186:6: (lv_track_10_0= ruleTrack )
            	    {
            	    // InternalGuardin.g:186:6: (lv_track_10_0= ruleTrack )
            	    // InternalGuardin.g:187:7: lv_track_10_0= ruleTrack
            	    {

            	    							newCompositeNode(grammarAccess.getMusicAccess().getTrackTrackParserRuleCall_7_2_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_track_10_0=ruleTrack();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMusicRule());
            	    							}
            	    							add(
            	    								current,
            	    								"track",
            	    								lv_track_10_0,
            	    								"fr.polytech.dsl.rhythm.Guardin.Track");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalGuardin.g:210:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalGuardin.g:210:48: (iv_ruleSection= ruleSection EOF )
            // InternalGuardin.g:211:2: iv_ruleSection= ruleSection EOF
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
    // InternalGuardin.g:217:1: ruleSection returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) ) ;
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
            // InternalGuardin.g:223:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) ) )
            // InternalGuardin.g:224:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:224:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) )
            // InternalGuardin.g:225:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) )
            {
            // InternalGuardin.g:225:3: ()
            // InternalGuardin.g:226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionAccess().getSectionAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:232:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGuardin.g:233:4: (lv_name_1_0= ruleEString )
            {
            // InternalGuardin.g:233:4: (lv_name_1_0= ruleEString )
            // InternalGuardin.g:234:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getTempoKeyword_3());
            		
            // InternalGuardin.g:259:3: ( (lv_tempo_4_0= ruleEInt ) )
            // InternalGuardin.g:260:4: (lv_tempo_4_0= ruleEInt )
            {
            // InternalGuardin.g:260:4: (lv_tempo_4_0= ruleEInt )
            // InternalGuardin.g:261:5: lv_tempo_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getTempoEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getSignatureKeyword_5());
            		
            // InternalGuardin.g:282:3: ( (lv_signature_6_0= ruleEInt ) )
            // InternalGuardin.g:283:4: (lv_signature_6_0= ruleEInt )
            {
            // InternalGuardin.g:283:4: (lv_signature_6_0= ruleEInt )
            // InternalGuardin.g:284:5: lv_signature_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getSignatureEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getBarsKeyword_7());
            		
            // InternalGuardin.g:305:3: ( (lv_bars_8_0= ruleEInt ) )
            // InternalGuardin.g:306:4: (lv_bars_8_0= ruleEInt )
            {
            // InternalGuardin.g:306:4: (lv_bars_8_0= ruleEInt )
            // InternalGuardin.g:307:5: lv_bars_8_0= ruleEInt
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
    // InternalGuardin.g:328:1: entryRuleTrack returns [EObject current=null] : iv_ruleTrack= ruleTrack EOF ;
    public final EObject entryRuleTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrack = null;


        try {
            // InternalGuardin.g:328:46: (iv_ruleTrack= ruleTrack EOF )
            // InternalGuardin.g:329:2: iv_ruleTrack= ruleTrack EOF
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
    // InternalGuardin.g:335:1: ruleTrack returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? otherlv_3= 'instrument' otherlv_4= ':' ( (lv_instrument_5_0= ruleBattery ) ) ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_instrument_5_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:341:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? otherlv_3= 'instrument' otherlv_4= ':' ( (lv_instrument_5_0= ruleBattery ) ) ) )
            // InternalGuardin.g:342:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? otherlv_3= 'instrument' otherlv_4= ':' ( (lv_instrument_5_0= ruleBattery ) ) )
            {
            // InternalGuardin.g:342:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? otherlv_3= 'instrument' otherlv_4= ':' ( (lv_instrument_5_0= ruleBattery ) ) )
            // InternalGuardin.g:343:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? otherlv_3= 'instrument' otherlv_4= ':' ( (lv_instrument_5_0= ruleBattery ) )
            {
            // InternalGuardin.g:343:3: ()
            // InternalGuardin.g:344:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrackAccess().getTrackAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:350:3: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuardin.g:351:4: ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalGuardin.g:351:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalGuardin.g:352:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalGuardin.g:352:5: (lv_name_1_0= ruleEString )
                    // InternalGuardin.g:353:6: lv_name_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTrackAccess().getNameEStringParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
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

                    otherlv_2=(Token)match(input,11,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTrackAccess().getInstrumentKeyword_2());
            		
            otherlv_4=(Token)match(input,11,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getTrackAccess().getColonKeyword_3());
            		
            // InternalGuardin.g:383:3: ( (lv_instrument_5_0= ruleBattery ) )
            // InternalGuardin.g:384:4: (lv_instrument_5_0= ruleBattery )
            {
            // InternalGuardin.g:384:4: (lv_instrument_5_0= ruleBattery )
            // InternalGuardin.g:385:5: lv_instrument_5_0= ruleBattery
            {

            					newCompositeNode(grammarAccess.getTrackAccess().getInstrumentBatteryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_instrument_5_0=ruleBattery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrackRule());
            					}
            					set(
            						current,
            						"instrument",
            						lv_instrument_5_0,
            						"fr.polytech.dsl.rhythm.Guardin.Battery");
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


    // $ANTLR start "entryRuleBattery"
    // InternalGuardin.g:406:1: entryRuleBattery returns [EObject current=null] : iv_ruleBattery= ruleBattery EOF ;
    public final EObject entryRuleBattery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBattery = null;


        try {
            // InternalGuardin.g:406:48: (iv_ruleBattery= ruleBattery EOF )
            // InternalGuardin.g:407:2: iv_ruleBattery= ruleBattery EOF
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
    // InternalGuardin.g:413:1: ruleBattery returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_notes_3_0= ruleBatteryNote ) )+ ) ;
    public final EObject ruleBattery() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_notes_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:419:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_notes_3_0= ruleBatteryNote ) )+ ) )
            // InternalGuardin.g:420:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_notes_3_0= ruleBatteryNote ) )+ )
            {
            // InternalGuardin.g:420:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_notes_3_0= ruleBatteryNote ) )+ )
            // InternalGuardin.g:421:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_notes_3_0= ruleBatteryNote ) )+
            {
            // InternalGuardin.g:421:3: ()
            // InternalGuardin.g:422:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryAccess().getBatteryAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:428:3: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGuardin.g:429:4: ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalGuardin.g:429:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalGuardin.g:430:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalGuardin.g:430:5: (lv_name_1_0= ruleEString )
                    // InternalGuardin.g:431:6: lv_name_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBatteryAccess().getNameEStringParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBatteryRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"fr.polytech.dsl.rhythm.Guardin.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,11,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getBatteryAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGuardin.g:453:3: ( (lv_notes_3_0= ruleBatteryNote ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=18 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGuardin.g:454:4: (lv_notes_3_0= ruleBatteryNote )
            	    {
            	    // InternalGuardin.g:454:4: (lv_notes_3_0= ruleBatteryNote )
            	    // InternalGuardin.g:455:5: lv_notes_3_0= ruleBatteryNote
            	    {

            	    					newCompositeNode(grammarAccess.getBatteryAccess().getNotesBatteryNoteEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_notes_3_0=ruleBatteryNote();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBatteryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"notes",
            	    						lv_notes_3_0,
            	    						"fr.polytech.dsl.rhythm.Guardin.BatteryNote");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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


    // $ANTLR start "entryRuleEInt"
    // InternalGuardin.g:476:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGuardin.g:476:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGuardin.g:477:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalGuardin.g:483:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGuardin.g:489:2: (this_INT_0= RULE_INT )
            // InternalGuardin.g:490:2: this_INT_0= RULE_INT
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


    // $ANTLR start "entryRuleEString"
    // InternalGuardin.g:500:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGuardin.g:500:47: (iv_ruleEString= ruleEString EOF )
            // InternalGuardin.g:501:2: iv_ruleEString= ruleEString EOF
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
    // InternalGuardin.g:507:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:513:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGuardin.g:514:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGuardin.g:514:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalGuardin.g:515:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:523:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleBatteryNote"
    // InternalGuardin.g:534:1: ruleBatteryNote returns [Enumerator current=null] : ( (enumLiteral_0= '$' ) | (enumLiteral_1= 'bd' ) | (enumLiteral_2= 'ch' ) | (enumLiteral_3= 'cc' ) | (enumLiteral_4= 'oh' ) | (enumLiteral_5= 'rc' ) | (enumLiteral_6= 'sd' ) ) ;
    public final Enumerator ruleBatteryNote() throws RecognitionException {
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
            // InternalGuardin.g:540:2: ( ( (enumLiteral_0= '$' ) | (enumLiteral_1= 'bd' ) | (enumLiteral_2= 'ch' ) | (enumLiteral_3= 'cc' ) | (enumLiteral_4= 'oh' ) | (enumLiteral_5= 'rc' ) | (enumLiteral_6= 'sd' ) ) )
            // InternalGuardin.g:541:2: ( (enumLiteral_0= '$' ) | (enumLiteral_1= 'bd' ) | (enumLiteral_2= 'ch' ) | (enumLiteral_3= 'cc' ) | (enumLiteral_4= 'oh' ) | (enumLiteral_5= 'rc' ) | (enumLiteral_6= 'sd' ) )
            {
            // InternalGuardin.g:541:2: ( (enumLiteral_0= '$' ) | (enumLiteral_1= 'bd' ) | (enumLiteral_2= 'ch' ) | (enumLiteral_3= 'cc' ) | (enumLiteral_4= 'oh' ) | (enumLiteral_5= 'rc' ) | (enumLiteral_6= 'sd' ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            case 22:
                {
                alt7=5;
                }
                break;
            case 23:
                {
                alt7=6;
                }
                break;
            case 24:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGuardin.g:542:3: (enumLiteral_0= '$' )
                    {
                    // InternalGuardin.g:542:3: (enumLiteral_0= '$' )
                    // InternalGuardin.g:543:4: enumLiteral_0= '$'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteAccess().getEMPTYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBatteryNoteAccess().getEMPTYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:550:3: (enumLiteral_1= 'bd' )
                    {
                    // InternalGuardin.g:550:3: (enumLiteral_1= 'bd' )
                    // InternalGuardin.g:551:4: enumLiteral_1= 'bd'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteAccess().getBASS_DRUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBatteryNoteAccess().getBASS_DRUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:558:3: (enumLiteral_2= 'ch' )
                    {
                    // InternalGuardin.g:558:3: (enumLiteral_2= 'ch' )
                    // InternalGuardin.g:559:4: enumLiteral_2= 'ch'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteAccess().getCLOSED_HIHATEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBatteryNoteAccess().getCLOSED_HIHATEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:566:3: (enumLiteral_3= 'cc' )
                    {
                    // InternalGuardin.g:566:3: (enumLiteral_3= 'cc' )
                    // InternalGuardin.g:567:4: enumLiteral_3= 'cc'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteAccess().getCRASH_CYMBALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBatteryNoteAccess().getCRASH_CYMBALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:574:3: (enumLiteral_4= 'oh' )
                    {
                    // InternalGuardin.g:574:3: (enumLiteral_4= 'oh' )
                    // InternalGuardin.g:575:4: enumLiteral_4= 'oh'
                    {
                    enumLiteral_4=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteAccess().getOPENED_HIHATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBatteryNoteAccess().getOPENED_HIHATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:582:3: (enumLiteral_5= 'rc' )
                    {
                    // InternalGuardin.g:582:3: (enumLiteral_5= 'rc' )
                    // InternalGuardin.g:583:4: enumLiteral_5= 'rc'
                    {
                    enumLiteral_5=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteAccess().getRIDE_CYMBALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBatteryNoteAccess().getRIDE_CYMBALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:590:3: (enumLiteral_6= 'sd' )
                    {
                    // InternalGuardin.g:590:3: (enumLiteral_6= 'sd' )
                    // InternalGuardin.g:591:4: enumLiteral_6= 'sd'
                    {
                    enumLiteral_6=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteAccess().getSNARE_DRUMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBatteryNoteAccess().getSNARE_DRUMEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleBatteryNote"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001FC0060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001FC0062L});

}