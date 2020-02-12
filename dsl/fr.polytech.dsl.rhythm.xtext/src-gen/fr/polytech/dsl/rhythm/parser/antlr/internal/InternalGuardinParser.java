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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Music'", "':'", "'sections'", "'tracks'", "'-'", "'tempo='", "'signature='", "'bars='", "'instrument'", "'$'", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'"
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
    // InternalGuardin.g:72:1: ruleMusic returns [EObject current=null] : ( () otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'sections' otherlv_5= ':' ( (lv_sections_6_0= ruleSection ) ) ( (lv_sections_7_0= ruleSection ) )* otherlv_8= 'tracks' otherlv_9= ':' (otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )* ) ) ;
    public final EObject ruleMusic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sections_6_0 = null;

        EObject lv_sections_7_0 = null;

        EObject lv_tracks_11_0 = null;

        EObject lv_tracks_13_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:78:2: ( ( () otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'sections' otherlv_5= ':' ( (lv_sections_6_0= ruleSection ) ) ( (lv_sections_7_0= ruleSection ) )* otherlv_8= 'tracks' otherlv_9= ':' (otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )* ) ) )
            // InternalGuardin.g:79:2: ( () otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'sections' otherlv_5= ':' ( (lv_sections_6_0= ruleSection ) ) ( (lv_sections_7_0= ruleSection ) )* otherlv_8= 'tracks' otherlv_9= ':' (otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )* ) )
            {
            // InternalGuardin.g:79:2: ( () otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'sections' otherlv_5= ':' ( (lv_sections_6_0= ruleSection ) ) ( (lv_sections_7_0= ruleSection ) )* otherlv_8= 'tracks' otherlv_9= ':' (otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )* ) )
            // InternalGuardin.g:80:3: () otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'sections' otherlv_5= ':' ( (lv_sections_6_0= ruleSection ) ) ( (lv_sections_7_0= ruleSection ) )* otherlv_8= 'tracks' otherlv_9= ':' (otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )* )
            {
            // InternalGuardin.g:80:3: ()
            // InternalGuardin.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMusicAccess().getMusicAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMusicAccess().getMusicKeyword_1());
            		
            // InternalGuardin.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGuardin.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalGuardin.g:92:4: (lv_name_2_0= ruleEString )
            // InternalGuardin.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.polytech.dsl.rhythm.Guardin.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMusicAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMusicAccess().getSectionsKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMusicAccess().getColonKeyword_5());
            		
            // InternalGuardin.g:122:3: ( (lv_sections_6_0= ruleSection ) )
            // InternalGuardin.g:123:4: (lv_sections_6_0= ruleSection )
            {
            // InternalGuardin.g:123:4: (lv_sections_6_0= ruleSection )
            // InternalGuardin.g:124:5: lv_sections_6_0= ruleSection
            {

            					newCompositeNode(grammarAccess.getMusicAccess().getSectionsSectionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_sections_6_0=ruleSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_6_0,
            						"fr.polytech.dsl.rhythm.Guardin.Section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGuardin.g:141:3: ( (lv_sections_7_0= ruleSection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGuardin.g:142:4: (lv_sections_7_0= ruleSection )
            	    {
            	    // InternalGuardin.g:142:4: (lv_sections_7_0= ruleSection )
            	    // InternalGuardin.g:143:5: lv_sections_7_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getMusicAccess().getSectionsSectionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_sections_7_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMusicRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_7_0,
            	    						"fr.polytech.dsl.rhythm.Guardin.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getMusicAccess().getTracksKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getMusicAccess().getColonKeyword_9());
            		
            // InternalGuardin.g:168:3: (otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )* )
            // InternalGuardin.g:169:4: otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )*
            {
            otherlv_10=(Token)match(input,15,FOLLOW_8); 

            				newLeafNode(otherlv_10, grammarAccess.getMusicAccess().getHyphenMinusKeyword_10_0());
            			
            // InternalGuardin.g:173:4: ( (lv_tracks_11_0= ruleTrack ) )
            // InternalGuardin.g:174:5: (lv_tracks_11_0= ruleTrack )
            {
            // InternalGuardin.g:174:5: (lv_tracks_11_0= ruleTrack )
            // InternalGuardin.g:175:6: lv_tracks_11_0= ruleTrack
            {

            						newCompositeNode(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_10_1_0());
            					
            pushFollow(FOLLOW_9);
            lv_tracks_11_0=ruleTrack();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMusicRule());
            						}
            						add(
            							current,
            							"tracks",
            							lv_tracks_11_0,
            							"fr.polytech.dsl.rhythm.Guardin.Track");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalGuardin.g:192:4: (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGuardin.g:193:5: otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_8); 

            	    					newLeafNode(otherlv_12, grammarAccess.getMusicAccess().getHyphenMinusKeyword_10_2_0());
            	    				
            	    // InternalGuardin.g:197:5: ( (lv_tracks_13_0= ruleTrack ) )
            	    // InternalGuardin.g:198:6: (lv_tracks_13_0= ruleTrack )
            	    {
            	    // InternalGuardin.g:198:6: (lv_tracks_13_0= ruleTrack )
            	    // InternalGuardin.g:199:7: lv_tracks_13_0= ruleTrack
            	    {

            	    							newCompositeNode(grammarAccess.getMusicAccess().getTracksTrackParserRuleCall_10_2_1_0());
            	    						
            	    pushFollow(FOLLOW_9);
            	    lv_tracks_13_0=ruleTrack();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMusicRule());
            	    							}
            	    							add(
            	    								current,
            	    								"tracks",
            	    								lv_tracks_13_0,
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
    // InternalGuardin.g:222:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalGuardin.g:222:48: (iv_ruleSection= ruleSection EOF )
            // InternalGuardin.g:223:2: iv_ruleSection= ruleSection EOF
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
    // InternalGuardin.g:229:1: ruleSection returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) ) ;
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
            // InternalGuardin.g:235:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) ) )
            // InternalGuardin.g:236:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:236:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) )
            // InternalGuardin.g:237:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) )
            {
            // InternalGuardin.g:237:3: ()
            // InternalGuardin.g:238:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionAccess().getSectionAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:244:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGuardin.g:245:4: (lv_name_1_0= ruleEString )
            {
            // InternalGuardin.g:245:4: (lv_name_1_0= ruleEString )
            // InternalGuardin.g:246:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getTempoKeyword_3());
            		
            // InternalGuardin.g:271:3: ( (lv_tempo_4_0= ruleEInt ) )
            // InternalGuardin.g:272:4: (lv_tempo_4_0= ruleEInt )
            {
            // InternalGuardin.g:272:4: (lv_tempo_4_0= ruleEInt )
            // InternalGuardin.g:273:5: lv_tempo_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getTempoEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getSignatureKeyword_5());
            		
            // InternalGuardin.g:294:3: ( (lv_signature_6_0= ruleEInt ) )
            // InternalGuardin.g:295:4: (lv_signature_6_0= ruleEInt )
            {
            // InternalGuardin.g:295:4: (lv_signature_6_0= ruleEInt )
            // InternalGuardin.g:296:5: lv_signature_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getSignatureEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_7=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getBarsKeyword_7());
            		
            // InternalGuardin.g:317:3: ( (lv_bars_8_0= ruleEInt ) )
            // InternalGuardin.g:318:4: (lv_bars_8_0= ruleEInt )
            {
            // InternalGuardin.g:318:4: (lv_bars_8_0= ruleEInt )
            // InternalGuardin.g:319:5: lv_bars_8_0= ruleEInt
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
    // InternalGuardin.g:340:1: entryRuleTrack returns [EObject current=null] : iv_ruleTrack= ruleTrack EOF ;
    public final EObject entryRuleTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrack = null;


        try {
            // InternalGuardin.g:340:46: (iv_ruleTrack= ruleTrack EOF )
            // InternalGuardin.g:341:2: iv_ruleTrack= ruleTrack EOF
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
    // InternalGuardin.g:347:1: ruleTrack returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? otherlv_3= 'instrument' otherlv_4= ':' ( (lv_instrument_5_0= ruleBattery ) ) ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_instrument_5_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:353:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? otherlv_3= 'instrument' otherlv_4= ':' ( (lv_instrument_5_0= ruleBattery ) ) ) )
            // InternalGuardin.g:354:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? otherlv_3= 'instrument' otherlv_4= ':' ( (lv_instrument_5_0= ruleBattery ) ) )
            {
            // InternalGuardin.g:354:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? otherlv_3= 'instrument' otherlv_4= ':' ( (lv_instrument_5_0= ruleBattery ) ) )
            // InternalGuardin.g:355:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? otherlv_3= 'instrument' otherlv_4= ':' ( (lv_instrument_5_0= ruleBattery ) )
            {
            // InternalGuardin.g:355:3: ()
            // InternalGuardin.g:356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrackAccess().getTrackAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:362:3: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuardin.g:363:4: ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalGuardin.g:363:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalGuardin.g:364:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalGuardin.g:364:5: (lv_name_1_0= ruleEString )
                    // InternalGuardin.g:365:6: lv_name_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTrackAccess().getNameEStringParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
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

                    otherlv_2=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getTrackAccess().getInstrumentKeyword_2());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getTrackAccess().getColonKeyword_3());
            		
            // InternalGuardin.g:395:3: ( (lv_instrument_5_0= ruleBattery ) )
            // InternalGuardin.g:396:4: (lv_instrument_5_0= ruleBattery )
            {
            // InternalGuardin.g:396:4: (lv_instrument_5_0= ruleBattery )
            // InternalGuardin.g:397:5: lv_instrument_5_0= ruleBattery
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
    // InternalGuardin.g:418:1: entryRuleBattery returns [EObject current=null] : iv_ruleBattery= ruleBattery EOF ;
    public final EObject entryRuleBattery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBattery = null;


        try {
            // InternalGuardin.g:418:48: (iv_ruleBattery= ruleBattery EOF )
            // InternalGuardin.g:419:2: iv_ruleBattery= ruleBattery EOF
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
    // InternalGuardin.g:425:1: ruleBattery returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( ( (lv_notes_3_1= ruleBatteryNote | lv_notes_3_2= ruleEmptyNote ) ) )+ ) ;
    public final EObject ruleBattery() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_notes_3_1 = null;

        EObject lv_notes_3_2 = null;



        	enterRule();

        try {
            // InternalGuardin.g:431:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( ( (lv_notes_3_1= ruleBatteryNote | lv_notes_3_2= ruleEmptyNote ) ) )+ ) )
            // InternalGuardin.g:432:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( ( (lv_notes_3_1= ruleBatteryNote | lv_notes_3_2= ruleEmptyNote ) ) )+ )
            {
            // InternalGuardin.g:432:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( ( (lv_notes_3_1= ruleBatteryNote | lv_notes_3_2= ruleEmptyNote ) ) )+ )
            // InternalGuardin.g:433:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( ( (lv_notes_3_1= ruleBatteryNote | lv_notes_3_2= ruleEmptyNote ) ) )+
            {
            // InternalGuardin.g:433:3: ()
            // InternalGuardin.g:434:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryAccess().getBatteryAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:440:3: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGuardin.g:441:4: ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalGuardin.g:441:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalGuardin.g:442:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalGuardin.g:442:5: (lv_name_1_0= ruleEString )
                    // InternalGuardin.g:443:6: lv_name_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBatteryAccess().getNameEStringParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
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

                    otherlv_2=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getBatteryAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGuardin.g:465:3: ( ( (lv_notes_3_1= ruleBatteryNote | lv_notes_3_2= ruleEmptyNote ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=20 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGuardin.g:466:4: ( (lv_notes_3_1= ruleBatteryNote | lv_notes_3_2= ruleEmptyNote ) )
            	    {
            	    // InternalGuardin.g:466:4: ( (lv_notes_3_1= ruleBatteryNote | lv_notes_3_2= ruleEmptyNote ) )
            	    // InternalGuardin.g:467:5: (lv_notes_3_1= ruleBatteryNote | lv_notes_3_2= ruleEmptyNote )
            	    {
            	    // InternalGuardin.g:467:5: (lv_notes_3_1= ruleBatteryNote | lv_notes_3_2= ruleEmptyNote )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( ((LA5_0>=21 && LA5_0<=26)) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==20) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalGuardin.g:468:6: lv_notes_3_1= ruleBatteryNote
            	            {

            	            						newCompositeNode(grammarAccess.getBatteryAccess().getNotesBatteryNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_16);
            	            lv_notes_3_1=ruleBatteryNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBatteryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_3_1,
            	            							"fr.polytech.dsl.rhythm.Guardin.BatteryNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalGuardin.g:484:6: lv_notes_3_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getBatteryAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_16);
            	            lv_notes_3_2=ruleEmptyNote();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBatteryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"notes",
            	            							lv_notes_3_2,
            	            							"fr.polytech.dsl.rhythm.Guardin.EmptyNote");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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


    // $ANTLR start "entryRuleEmptyNote"
    // InternalGuardin.g:506:1: entryRuleEmptyNote returns [EObject current=null] : iv_ruleEmptyNote= ruleEmptyNote EOF ;
    public final EObject entryRuleEmptyNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyNote = null;


        try {
            // InternalGuardin.g:506:50: (iv_ruleEmptyNote= ruleEmptyNote EOF )
            // InternalGuardin.g:507:2: iv_ruleEmptyNote= ruleEmptyNote EOF
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
    // InternalGuardin.g:513:1: ruleEmptyNote returns [EObject current=null] : ( () otherlv_1= '$' ) ;
    public final EObject ruleEmptyNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:519:2: ( ( () otherlv_1= '$' ) )
            // InternalGuardin.g:520:2: ( () otherlv_1= '$' )
            {
            // InternalGuardin.g:520:2: ( () otherlv_1= '$' )
            // InternalGuardin.g:521:3: () otherlv_1= '$'
            {
            // InternalGuardin.g:521:3: ()
            // InternalGuardin.g:522:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyNoteAccess().getEmptyNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBatteryNote"
    // InternalGuardin.g:536:1: entryRuleBatteryNote returns [EObject current=null] : iv_ruleBatteryNote= ruleBatteryNote EOF ;
    public final EObject entryRuleBatteryNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatteryNote = null;


        try {
            // InternalGuardin.g:536:52: (iv_ruleBatteryNote= ruleBatteryNote EOF )
            // InternalGuardin.g:537:2: iv_ruleBatteryNote= ruleBatteryNote EOF
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
    // InternalGuardin.g:543:1: ruleBatteryNote returns [EObject current=null] : ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) ) ;
    public final EObject ruleBatteryNote() throws RecognitionException {
        EObject current = null;

        Enumerator lv_noteType_1_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:549:2: ( ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) ) )
            // InternalGuardin.g:550:2: ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) )
            {
            // InternalGuardin.g:550:2: ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) )
            // InternalGuardin.g:551:3: () ( (lv_noteType_1_0= ruleBatteryNoteType ) )
            {
            // InternalGuardin.g:551:3: ()
            // InternalGuardin.g:552:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:558:3: ( (lv_noteType_1_0= ruleBatteryNoteType ) )
            // InternalGuardin.g:559:4: (lv_noteType_1_0= ruleBatteryNoteType )
            {
            // InternalGuardin.g:559:4: (lv_noteType_1_0= ruleBatteryNoteType )
            // InternalGuardin.g:560:5: lv_noteType_1_0= ruleBatteryNoteType
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


    // $ANTLR start "entryRuleEInt"
    // InternalGuardin.g:581:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGuardin.g:581:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGuardin.g:582:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalGuardin.g:588:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGuardin.g:594:2: (this_INT_0= RULE_INT )
            // InternalGuardin.g:595:2: this_INT_0= RULE_INT
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
    // InternalGuardin.g:605:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGuardin.g:605:47: (iv_ruleEString= ruleEString EOF )
            // InternalGuardin.g:606:2: iv_ruleEString= ruleEString EOF
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
    // InternalGuardin.g:612:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:618:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGuardin.g:619:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGuardin.g:619:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGuardin.g:620:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:628:3: this_ID_1= RULE_ID
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
    // InternalGuardin.g:639:1: ruleBatteryNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) ;
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
            // InternalGuardin.g:645:2: ( ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) )
            // InternalGuardin.g:646:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            {
            // InternalGuardin.g:646:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 26:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGuardin.g:647:3: (enumLiteral_0= 'bd' )
                    {
                    // InternalGuardin.g:647:3: (enumLiteral_0= 'bd' )
                    // InternalGuardin.g:648:4: enumLiteral_0= 'bd'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:655:3: (enumLiteral_1= 'ch' )
                    {
                    // InternalGuardin.g:655:3: (enumLiteral_1= 'ch' )
                    // InternalGuardin.g:656:4: enumLiteral_1= 'ch'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:663:3: (enumLiteral_2= 'cc' )
                    {
                    // InternalGuardin.g:663:3: (enumLiteral_2= 'cc' )
                    // InternalGuardin.g:664:4: enumLiteral_2= 'cc'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:671:3: (enumLiteral_3= 'oh' )
                    {
                    // InternalGuardin.g:671:3: (enumLiteral_3= 'oh' )
                    // InternalGuardin.g:672:4: enumLiteral_3= 'oh'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:679:3: (enumLiteral_4= 'rc' )
                    {
                    // InternalGuardin.g:679:3: (enumLiteral_4= 'rc' )
                    // InternalGuardin.g:680:4: enumLiteral_4= 'rc'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:687:3: (enumLiteral_5= 'sd' )
                    {
                    // InternalGuardin.g:687:3: (enumLiteral_5= 'sd' )
                    // InternalGuardin.g:688:4: enumLiteral_5= 'sd'
                    {
                    enumLiteral_5=(Token)match(input,26,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007F00060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007F00062L});

}