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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Music'", "':'", "'sections'", "'tracks'", "'-'", "'tempo='", "'signature='", "'bars='", "'battery:'", "'piano:'", "'$'", "'layer:'", "'('", "')'", "'x'", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'"
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
    // InternalGuardin.g:347:1: ruleTrack returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) ) ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_instrument_4_0 = null;

        EObject lv_instrument_6_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:353:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) ) ) )
            // InternalGuardin.g:354:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) ) )
            {
            // InternalGuardin.g:354:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) ) )
            // InternalGuardin.g:355:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) )
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

            // InternalGuardin.g:387:3: ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGuardin.g:388:4: (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) )
                    {
                    // InternalGuardin.g:388:4: (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) )
                    // InternalGuardin.g:389:5: otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_15); 

                    					newLeafNode(otherlv_3, grammarAccess.getTrackAccess().getBatteryKeyword_2_0_0());
                    				
                    // InternalGuardin.g:393:5: ( (lv_instrument_4_0= ruleBattery ) )
                    // InternalGuardin.g:394:6: (lv_instrument_4_0= ruleBattery )
                    {
                    // InternalGuardin.g:394:6: (lv_instrument_4_0= ruleBattery )
                    // InternalGuardin.g:395:7: lv_instrument_4_0= ruleBattery
                    {

                    							newCompositeNode(grammarAccess.getTrackAccess().getInstrumentBatteryParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_instrument_4_0=ruleBattery();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTrackRule());
                    							}
                    							set(
                    								current,
                    								"instrument",
                    								lv_instrument_4_0,
                    								"fr.polytech.dsl.rhythm.Guardin.Battery");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:414:4: (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) )
                    {
                    // InternalGuardin.g:414:4: (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) )
                    // InternalGuardin.g:415:5: otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_15); 

                    					newLeafNode(otherlv_5, grammarAccess.getTrackAccess().getPianoKeyword_2_1_0());
                    				
                    // InternalGuardin.g:419:5: ( (lv_instrument_6_0= rulePiano ) )
                    // InternalGuardin.g:420:6: (lv_instrument_6_0= rulePiano )
                    {
                    // InternalGuardin.g:420:6: (lv_instrument_6_0= rulePiano )
                    // InternalGuardin.g:421:7: lv_instrument_6_0= rulePiano
                    {

                    							newCompositeNode(grammarAccess.getTrackAccess().getInstrumentPianoParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_instrument_6_0=rulePiano();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTrackRule());
                    							}
                    							set(
                    								current,
                    								"instrument",
                    								lv_instrument_6_0,
                    								"fr.polytech.dsl.rhythm.Guardin.Piano");
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
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRuleEmptyNote"
    // InternalGuardin.g:444:1: entryRuleEmptyNote returns [EObject current=null] : iv_ruleEmptyNote= ruleEmptyNote EOF ;
    public final EObject entryRuleEmptyNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyNote = null;


        try {
            // InternalGuardin.g:444:50: (iv_ruleEmptyNote= ruleEmptyNote EOF )
            // InternalGuardin.g:445:2: iv_ruleEmptyNote= ruleEmptyNote EOF
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
    // InternalGuardin.g:451:1: ruleEmptyNote returns [EObject current=null] : ( () otherlv_1= '$' ) ;
    public final EObject ruleEmptyNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:457:2: ( ( () otherlv_1= '$' ) )
            // InternalGuardin.g:458:2: ( () otherlv_1= '$' )
            {
            // InternalGuardin.g:458:2: ( () otherlv_1= '$' )
            // InternalGuardin.g:459:3: () otherlv_1= '$'
            {
            // InternalGuardin.g:459:3: ()
            // InternalGuardin.g:460:4: 
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
    // InternalGuardin.g:474:1: entryRuleBattery returns [EObject current=null] : iv_ruleBattery= ruleBattery EOF ;
    public final EObject entryRuleBattery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBattery = null;


        try {
            // InternalGuardin.g:474:48: (iv_ruleBattery= ruleBattery EOF )
            // InternalGuardin.g:475:2: iv_ruleBattery= ruleBattery EOF
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
    // InternalGuardin.g:481:1: ruleBattery returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= ruleBatteryLayer ) )+ ) ;
    public final EObject ruleBattery() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_layers_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:487:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= ruleBatteryLayer ) )+ ) )
            // InternalGuardin.g:488:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= ruleBatteryLayer ) )+ )
            {
            // InternalGuardin.g:488:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= ruleBatteryLayer ) )+ )
            // InternalGuardin.g:489:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= ruleBatteryLayer ) )+
            {
            // InternalGuardin.g:489:3: ()
            // InternalGuardin.g:490:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryAccess().getBatteryAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:496:3: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGuardin.g:497:4: ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalGuardin.g:497:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalGuardin.g:498:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalGuardin.g:498:5: (lv_name_1_0= ruleEString )
                    // InternalGuardin.g:499:6: lv_name_1_0= ruleEString
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

            // InternalGuardin.g:521:3: ( (lv_layers_3_0= ruleBatteryLayer ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGuardin.g:522:4: (lv_layers_3_0= ruleBatteryLayer )
            	    {
            	    // InternalGuardin.g:522:4: (lv_layers_3_0= ruleBatteryLayer )
            	    // InternalGuardin.g:523:5: lv_layers_3_0= ruleBatteryLayer
            	    {

            	    					newCompositeNode(grammarAccess.getBatteryAccess().getLayersBatteryLayerParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_layers_3_0=ruleBatteryLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBatteryRule());
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


    // $ANTLR start "entryRuleBatteryLayer"
    // InternalGuardin.g:544:1: entryRuleBatteryLayer returns [EObject current=null] : iv_ruleBatteryLayer= ruleBatteryLayer EOF ;
    public final EObject entryRuleBatteryLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatteryLayer = null;


        try {
            // InternalGuardin.g:544:53: (iv_ruleBatteryLayer= ruleBatteryLayer EOF )
            // InternalGuardin.g:545:2: iv_ruleBatteryLayer= ruleBatteryLayer EOF
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
    // InternalGuardin.g:551:1: ruleBatteryLayer returns [EObject current=null] : ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ ) ;
    public final EObject ruleBatteryLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_notes_2_1 = null;

        EObject lv_notes_2_2 = null;

        EObject lv_notes_2_3 = null;



        	enterRule();

        try {
            // InternalGuardin.g:557:2: ( ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ ) )
            // InternalGuardin.g:558:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ )
            {
            // InternalGuardin.g:558:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ )
            // InternalGuardin.g:559:3: () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+
            {
            // InternalGuardin.g:559:3: ()
            // InternalGuardin.g:560:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getBatteryLayerAccess().getLayerKeyword_1());
            		
            // InternalGuardin.g:570:3: ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21||LA8_0==23||(LA8_0>=26 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGuardin.g:571:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) )
            	    {
            	    // InternalGuardin.g:571:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) )
            	    // InternalGuardin.g:572:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote )
            	    {
            	    // InternalGuardin.g:572:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote )
            	    int alt7=3;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	    case 27:
            	    case 28:
            	    case 29:
            	    case 30:
            	    case 31:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // InternalGuardin.g:573:6: lv_notes_2_1= ruleBatteryNote
            	            {

            	            						newCompositeNode(grammarAccess.getBatteryLayerAccess().getNotesBatteryNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_18);
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
            	            // InternalGuardin.g:589:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getBatteryLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_18);
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
            	            // InternalGuardin.g:605:6: lv_notes_2_3= ruleCompositeBatteryNote
            	            {

            	            						newCompositeNode(grammarAccess.getBatteryLayerAccess().getNotesCompositeBatteryNoteParserRuleCall_2_0_2());
            	            					
            	            pushFollow(FOLLOW_18);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // InternalGuardin.g:627:1: entryRuleBatteryNote returns [EObject current=null] : iv_ruleBatteryNote= ruleBatteryNote EOF ;
    public final EObject entryRuleBatteryNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatteryNote = null;


        try {
            // InternalGuardin.g:627:52: (iv_ruleBatteryNote= ruleBatteryNote EOF )
            // InternalGuardin.g:628:2: iv_ruleBatteryNote= ruleBatteryNote EOF
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
    // InternalGuardin.g:634:1: ruleBatteryNote returns [EObject current=null] : ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) ) ;
    public final EObject ruleBatteryNote() throws RecognitionException {
        EObject current = null;

        Enumerator lv_noteType_1_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:640:2: ( ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) ) )
            // InternalGuardin.g:641:2: ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) )
            {
            // InternalGuardin.g:641:2: ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) )
            // InternalGuardin.g:642:3: () ( (lv_noteType_1_0= ruleBatteryNoteType ) )
            {
            // InternalGuardin.g:642:3: ()
            // InternalGuardin.g:643:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:649:3: ( (lv_noteType_1_0= ruleBatteryNoteType ) )
            // InternalGuardin.g:650:4: (lv_noteType_1_0= ruleBatteryNoteType )
            {
            // InternalGuardin.g:650:4: (lv_noteType_1_0= ruleBatteryNoteType )
            // InternalGuardin.g:651:5: lv_noteType_1_0= ruleBatteryNoteType
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
    // InternalGuardin.g:672:1: entryRuleCompositeBatteryNote returns [EObject current=null] : iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF ;
    public final EObject entryRuleCompositeBatteryNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeBatteryNote = null;


        try {
            // InternalGuardin.g:672:61: (iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF )
            // InternalGuardin.g:673:2: iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF
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
    // InternalGuardin.g:679:1: ruleCompositeBatteryNote returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) ;
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
            // InternalGuardin.g:685:2: ( ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) )
            // InternalGuardin.g:686:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:686:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            // InternalGuardin.g:687:3: () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) )
            {
            // InternalGuardin.g:687:3: ()
            // InternalGuardin.g:688:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeBatteryNoteAccess().getCompositeNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeBatteryNoteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGuardin.g:698:3: ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21||(LA10_0>=26 && LA10_0<=31)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGuardin.g:699:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) )
            	    {
            	    // InternalGuardin.g:699:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) )
            	    // InternalGuardin.g:700:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote )
            	    {
            	    // InternalGuardin.g:700:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>=26 && LA9_0<=31)) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==21) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalGuardin.g:701:6: lv_notes_2_1= ruleBatteryNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositeBatteryNoteAccess().getNotesBatteryNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_20);
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
            	            // InternalGuardin.g:717:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositeBatteryNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_20);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeBatteryNoteAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositeBatteryNoteAccess().getXKeyword_4());
            		
            // InternalGuardin.g:743:3: ( (lv_repeats_5_0= ruleEInt ) )
            // InternalGuardin.g:744:4: (lv_repeats_5_0= ruleEInt )
            {
            // InternalGuardin.g:744:4: (lv_repeats_5_0= ruleEInt )
            // InternalGuardin.g:745:5: lv_repeats_5_0= ruleEInt
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
    // InternalGuardin.g:766:1: entryRulePiano returns [EObject current=null] : iv_rulePiano= rulePiano EOF ;
    public final EObject entryRulePiano() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiano = null;


        try {
            // InternalGuardin.g:766:46: (iv_rulePiano= rulePiano EOF )
            // InternalGuardin.g:767:2: iv_rulePiano= rulePiano EOF
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
    // InternalGuardin.g:773:1: rulePiano returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= rulePianoLayer ) )+ ) ;
    public final EObject rulePiano() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_layers_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:779:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= rulePianoLayer ) )+ ) )
            // InternalGuardin.g:780:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= rulePianoLayer ) )+ )
            {
            // InternalGuardin.g:780:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= rulePianoLayer ) )+ )
            // InternalGuardin.g:781:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= rulePianoLayer ) )+
            {
            // InternalGuardin.g:781:3: ()
            // InternalGuardin.g:782:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoAccess().getPianoAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:788:3: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGuardin.g:789:4: ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalGuardin.g:789:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalGuardin.g:790:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalGuardin.g:790:5: (lv_name_1_0= ruleEString )
                    // InternalGuardin.g:791:6: lv_name_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPianoAccess().getNameEStringParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPianoRule());
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

                    				newLeafNode(otherlv_2, grammarAccess.getPianoAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGuardin.g:813:3: ( (lv_layers_3_0= rulePianoLayer ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGuardin.g:814:4: (lv_layers_3_0= rulePianoLayer )
            	    {
            	    // InternalGuardin.g:814:4: (lv_layers_3_0= rulePianoLayer )
            	    // InternalGuardin.g:815:5: lv_layers_3_0= rulePianoLayer
            	    {

            	    					newCompositeNode(grammarAccess.getPianoAccess().getLayersPianoLayerParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_layers_3_0=rulePianoLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPianoRule());
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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


    // $ANTLR start "entryRulePianoLayer"
    // InternalGuardin.g:836:1: entryRulePianoLayer returns [EObject current=null] : iv_rulePianoLayer= rulePianoLayer EOF ;
    public final EObject entryRulePianoLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePianoLayer = null;


        try {
            // InternalGuardin.g:836:51: (iv_rulePianoLayer= rulePianoLayer EOF )
            // InternalGuardin.g:837:2: iv_rulePianoLayer= rulePianoLayer EOF
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
    // InternalGuardin.g:843:1: rulePianoLayer returns [EObject current=null] : ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ ) ;
    public final EObject rulePianoLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_notes_2_1 = null;

        EObject lv_notes_2_2 = null;

        EObject lv_notes_2_3 = null;



        	enterRule();

        try {
            // InternalGuardin.g:849:2: ( ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ ) )
            // InternalGuardin.g:850:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ )
            {
            // InternalGuardin.g:850:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ )
            // InternalGuardin.g:851:3: () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+
            {
            // InternalGuardin.g:851:3: ()
            // InternalGuardin.g:852:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getPianoLayerAccess().getLayerKeyword_1());
            		
            // InternalGuardin.g:862:3: ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21||LA14_0==23||(LA14_0>=32 && LA14_0<=38)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGuardin.g:863:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) )
            	    {
            	    // InternalGuardin.g:863:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) )
            	    // InternalGuardin.g:864:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote )
            	    {
            	    // InternalGuardin.g:864:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote )
            	    int alt13=3;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	    case 33:
            	    case 34:
            	    case 35:
            	    case 36:
            	    case 37:
            	    case 38:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 23:
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
            	            // InternalGuardin.g:865:6: lv_notes_2_1= rulePianoNote
            	            {

            	            						newCompositeNode(grammarAccess.getPianoLayerAccess().getNotesPianoNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_23);
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
            	            // InternalGuardin.g:881:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getPianoLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_23);
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
            	            // InternalGuardin.g:897:6: lv_notes_2_3= ruleCompositePianoNote
            	            {

            	            						newCompositeNode(grammarAccess.getPianoLayerAccess().getNotesCompositePianoNoteParserRuleCall_2_0_2());
            	            					
            	            pushFollow(FOLLOW_23);
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
    // $ANTLR end "rulePianoLayer"


    // $ANTLR start "entryRulePianoNote"
    // InternalGuardin.g:919:1: entryRulePianoNote returns [EObject current=null] : iv_rulePianoNote= rulePianoNote EOF ;
    public final EObject entryRulePianoNote() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePianoNote = null;


        try {
            // InternalGuardin.g:919:50: (iv_rulePianoNote= rulePianoNote EOF )
            // InternalGuardin.g:920:2: iv_rulePianoNote= rulePianoNote EOF
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
    // InternalGuardin.g:926:1: rulePianoNote returns [EObject current=null] : ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) ) ;
    public final EObject rulePianoNote() throws RecognitionException {
        EObject current = null;

        Enumerator lv_noteType_1_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:932:2: ( ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) ) )
            // InternalGuardin.g:933:2: ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) )
            {
            // InternalGuardin.g:933:2: ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) )
            // InternalGuardin.g:934:3: () ( (lv_noteType_1_0= rulePianoNoteType ) )
            {
            // InternalGuardin.g:934:3: ()
            // InternalGuardin.g:935:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoNoteAccess().getPianoNoteAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:941:3: ( (lv_noteType_1_0= rulePianoNoteType ) )
            // InternalGuardin.g:942:4: (lv_noteType_1_0= rulePianoNoteType )
            {
            // InternalGuardin.g:942:4: (lv_noteType_1_0= rulePianoNoteType )
            // InternalGuardin.g:943:5: lv_noteType_1_0= rulePianoNoteType
            {

            					newCompositeNode(grammarAccess.getPianoNoteAccess().getNoteTypePianoNoteTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalGuardin.g:964:1: entryRuleCompositePianoNote returns [EObject current=null] : iv_ruleCompositePianoNote= ruleCompositePianoNote EOF ;
    public final EObject entryRuleCompositePianoNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositePianoNote = null;


        try {
            // InternalGuardin.g:964:59: (iv_ruleCompositePianoNote= ruleCompositePianoNote EOF )
            // InternalGuardin.g:965:2: iv_ruleCompositePianoNote= ruleCompositePianoNote EOF
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
    // InternalGuardin.g:971:1: ruleCompositePianoNote returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) ;
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
            // InternalGuardin.g:977:2: ( ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) )
            // InternalGuardin.g:978:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:978:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            // InternalGuardin.g:979:3: () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) )
            {
            // InternalGuardin.g:979:3: ()
            // InternalGuardin.g:980:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositePianoNoteAccess().getCompositeNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositePianoNoteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGuardin.g:990:3: ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21||(LA16_0>=32 && LA16_0<=38)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGuardin.g:991:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) )
            	    {
            	    // InternalGuardin.g:991:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) )
            	    // InternalGuardin.g:992:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote )
            	    {
            	    // InternalGuardin.g:992:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( ((LA15_0>=32 && LA15_0<=38)) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==21) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalGuardin.g:993:6: lv_notes_2_1= rulePianoNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositePianoNoteAccess().getNotesPianoNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_25);
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
            	            // InternalGuardin.g:1009:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositePianoNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_25);
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositePianoNoteAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositePianoNoteAccess().getXKeyword_4());
            		
            // InternalGuardin.g:1035:3: ( (lv_repeats_5_0= ruleEInt ) )
            // InternalGuardin.g:1036:4: (lv_repeats_5_0= ruleEInt )
            {
            // InternalGuardin.g:1036:4: (lv_repeats_5_0= ruleEInt )
            // InternalGuardin.g:1037:5: lv_repeats_5_0= ruleEInt
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
    // InternalGuardin.g:1058:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGuardin.g:1058:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGuardin.g:1059:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalGuardin.g:1065:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGuardin.g:1071:2: (this_INT_0= RULE_INT )
            // InternalGuardin.g:1072:2: this_INT_0= RULE_INT
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
    // InternalGuardin.g:1082:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGuardin.g:1082:47: (iv_ruleEString= ruleEString EOF )
            // InternalGuardin.g:1083:2: iv_ruleEString= ruleEString EOF
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
    // InternalGuardin.g:1089:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:1095:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGuardin.g:1096:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGuardin.g:1096:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGuardin.g:1097:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1105:3: this_ID_1= RULE_ID
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
    // InternalGuardin.g:1116:1: ruleBatteryNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) ;
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
            // InternalGuardin.g:1122:2: ( ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) )
            // InternalGuardin.g:1123:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            {
            // InternalGuardin.g:1123:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt18=1;
                }
                break;
            case 27:
                {
                alt18=2;
                }
                break;
            case 28:
                {
                alt18=3;
                }
                break;
            case 29:
                {
                alt18=4;
                }
                break;
            case 30:
                {
                alt18=5;
                }
                break;
            case 31:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalGuardin.g:1124:3: (enumLiteral_0= 'bd' )
                    {
                    // InternalGuardin.g:1124:3: (enumLiteral_0= 'bd' )
                    // InternalGuardin.g:1125:4: enumLiteral_0= 'bd'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1132:3: (enumLiteral_1= 'ch' )
                    {
                    // InternalGuardin.g:1132:3: (enumLiteral_1= 'ch' )
                    // InternalGuardin.g:1133:4: enumLiteral_1= 'ch'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:1140:3: (enumLiteral_2= 'cc' )
                    {
                    // InternalGuardin.g:1140:3: (enumLiteral_2= 'cc' )
                    // InternalGuardin.g:1141:4: enumLiteral_2= 'cc'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1148:3: (enumLiteral_3= 'oh' )
                    {
                    // InternalGuardin.g:1148:3: (enumLiteral_3= 'oh' )
                    // InternalGuardin.g:1149:4: enumLiteral_3= 'oh'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1156:3: (enumLiteral_4= 'rc' )
                    {
                    // InternalGuardin.g:1156:3: (enumLiteral_4= 'rc' )
                    // InternalGuardin.g:1157:4: enumLiteral_4= 'rc'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1164:3: (enumLiteral_5= 'sd' )
                    {
                    // InternalGuardin.g:1164:3: (enumLiteral_5= 'sd' )
                    // InternalGuardin.g:1165:4: enumLiteral_5= 'sd'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalGuardin.g:1175:1: rulePianoNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) ) ;
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
            // InternalGuardin.g:1181:2: ( ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) ) )
            // InternalGuardin.g:1182:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) )
            {
            // InternalGuardin.g:1182:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) )
            int alt19=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 33:
                {
                alt19=2;
                }
                break;
            case 34:
                {
                alt19=3;
                }
                break;
            case 35:
                {
                alt19=4;
                }
                break;
            case 36:
                {
                alt19=5;
                }
                break;
            case 37:
                {
                alt19=6;
                }
                break;
            case 38:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGuardin.g:1183:3: (enumLiteral_0= 'A' )
                    {
                    // InternalGuardin.g:1183:3: (enumLiteral_0= 'A' )
                    // InternalGuardin.g:1184:4: enumLiteral_0= 'A'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1191:3: (enumLiteral_1= 'B' )
                    {
                    // InternalGuardin.g:1191:3: (enumLiteral_1= 'B' )
                    // InternalGuardin.g:1192:4: enumLiteral_1= 'B'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:1199:3: (enumLiteral_2= 'C' )
                    {
                    // InternalGuardin.g:1199:3: (enumLiteral_2= 'C' )
                    // InternalGuardin.g:1200:4: enumLiteral_2= 'C'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1207:3: (enumLiteral_3= 'D' )
                    {
                    // InternalGuardin.g:1207:3: (enumLiteral_3= 'D' )
                    // InternalGuardin.g:1208:4: enumLiteral_3= 'D'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1215:3: (enumLiteral_4= 'E' )
                    {
                    // InternalGuardin.g:1215:3: (enumLiteral_4= 'E' )
                    // InternalGuardin.g:1216:4: enumLiteral_4= 'E'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1223:3: (enumLiteral_5= 'F' )
                    {
                    // InternalGuardin.g:1223:3: (enumLiteral_5= 'F' )
                    // InternalGuardin.g:1224:4: enumLiteral_5= 'F'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:1231:3: (enumLiteral_6= 'G' )
                    {
                    // InternalGuardin.g:1231:3: (enumLiteral_6= 'G' )
                    // InternalGuardin.g:1232:4: enumLiteral_6= 'G'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400062L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000FCA00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000FCA00002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000FC200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000FD200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007F00A00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007F00A00002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000007F00200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000007F01200000L});

}