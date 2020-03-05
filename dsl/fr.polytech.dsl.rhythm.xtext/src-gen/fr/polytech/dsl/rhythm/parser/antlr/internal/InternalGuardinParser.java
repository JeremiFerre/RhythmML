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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Music'", "':'", "'sections'", "'tracks'", "'-'", "'tempo='", "'signature='", "'bars='", "'$'", "'battery'", "'debut_section'", "'fin_section'", "'layer:'", "'('", "')'", "'x'", "'piano'", "'/'", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'"
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
    public static final int T__40=40;
    public static final int T__41=41;
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
    // InternalGuardin.g:347:1: ruleTrack returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_instrument_3_0= ruleInstrument ) ) ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_instrument_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:353:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_instrument_3_0= ruleInstrument ) ) ) )
            // InternalGuardin.g:354:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_instrument_3_0= ruleInstrument ) ) )
            {
            // InternalGuardin.g:354:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_instrument_3_0= ruleInstrument ) ) )
            // InternalGuardin.g:355:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_instrument_3_0= ruleInstrument ) )
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

                    otherlv_2=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGuardin.g:387:3: ( (lv_instrument_3_0= ruleInstrument ) )
            // InternalGuardin.g:388:4: (lv_instrument_3_0= ruleInstrument )
            {
            // InternalGuardin.g:388:4: (lv_instrument_3_0= ruleInstrument )
            // InternalGuardin.g:389:5: lv_instrument_3_0= ruleInstrument
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
    // InternalGuardin.g:410:1: entryRuleInstrument returns [EObject current=null] : iv_ruleInstrument= ruleInstrument EOF ;
    public final EObject entryRuleInstrument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstrument = null;


        try {
            // InternalGuardin.g:410:51: (iv_ruleInstrument= ruleInstrument EOF )
            // InternalGuardin.g:411:2: iv_ruleInstrument= ruleInstrument EOF
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
    // InternalGuardin.g:417:1: ruleInstrument returns [EObject current=null] : (this_Battery_0= ruleBattery | this_Piano_1= rulePiano ) ;
    public final EObject ruleInstrument() throws RecognitionException {
        EObject current = null;

        EObject this_Battery_0 = null;

        EObject this_Piano_1 = null;



        	enterRule();

        try {
            // InternalGuardin.g:423:2: ( (this_Battery_0= ruleBattery | this_Piano_1= rulePiano ) )
            // InternalGuardin.g:424:2: (this_Battery_0= ruleBattery | this_Piano_1= rulePiano )
            {
            // InternalGuardin.g:424:2: (this_Battery_0= ruleBattery | this_Piano_1= rulePiano )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGuardin.g:425:3: this_Battery_0= ruleBattery
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
                    // InternalGuardin.g:434:3: this_Piano_1= rulePiano
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
    // InternalGuardin.g:446:1: entryRuleEmptyNote returns [EObject current=null] : iv_ruleEmptyNote= ruleEmptyNote EOF ;
    public final EObject entryRuleEmptyNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyNote = null;


        try {
            // InternalGuardin.g:446:50: (iv_ruleEmptyNote= ruleEmptyNote EOF )
            // InternalGuardin.g:447:2: iv_ruleEmptyNote= ruleEmptyNote EOF
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
    // InternalGuardin.g:453:1: ruleEmptyNote returns [EObject current=null] : ( () otherlv_1= '$' ) ;
    public final EObject ruleEmptyNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:459:2: ( ( () otherlv_1= '$' ) )
            // InternalGuardin.g:460:2: ( () otherlv_1= '$' )
            {
            // InternalGuardin.g:460:2: ( () otherlv_1= '$' )
            // InternalGuardin.g:461:3: () otherlv_1= '$'
            {
            // InternalGuardin.g:461:3: ()
            // InternalGuardin.g:462:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyNoteAccess().getEmptyNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

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
    // InternalGuardin.g:476:1: entryRuleBattery returns [EObject current=null] : iv_ruleBattery= ruleBattery EOF ;
    public final EObject entryRuleBattery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBattery = null;


        try {
            // InternalGuardin.g:476:48: (iv_ruleBattery= ruleBattery EOF )
            // InternalGuardin.g:477:2: iv_ruleBattery= ruleBattery EOF
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
    // InternalGuardin.g:483:1: ruleBattery returns [EObject current=null] : ( () otherlv_1= 'battery' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+ ) ;
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
            // InternalGuardin.g:489:2: ( ( () otherlv_1= 'battery' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+ ) )
            // InternalGuardin.g:490:2: ( () otherlv_1= 'battery' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+ )
            {
            // InternalGuardin.g:490:2: ( () otherlv_1= 'battery' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+ )
            // InternalGuardin.g:491:3: () otherlv_1= 'battery' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+
            {
            // InternalGuardin.g:491:3: ()
            // InternalGuardin.g:492:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryAccess().getBatteryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getBatteryAccess().getBatteryKeyword_1());
            		
            // InternalGuardin.g:502:3: (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGuardin.g:503:4: otherlv_2= ':'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getBatteryAccess().getColonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:508:4: ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' )
                    {
                    // InternalGuardin.g:508:4: ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' )
                    // InternalGuardin.g:509:5: ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':'
                    {
                    // InternalGuardin.g:509:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalGuardin.g:510:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalGuardin.g:510:6: (lv_name_3_0= ruleEString )
                    // InternalGuardin.g:511:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getBatteryAccess().getNameEStringParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_4);
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

                    otherlv_4=(Token)match(input,12,FOLLOW_15); 

                    					newLeafNode(otherlv_4, grammarAccess.getBatteryAccess().getColonKeyword_2_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalGuardin.g:534:3: ( ( (lv_sections_5_0= ruleSectionBatteryLayer ) ) | ( (lv_layers_6_0= ruleBatteryLayer ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }
                else if ( (LA6_0==23) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGuardin.g:535:4: ( (lv_sections_5_0= ruleSectionBatteryLayer ) )
            	    {
            	    // InternalGuardin.g:535:4: ( (lv_sections_5_0= ruleSectionBatteryLayer ) )
            	    // InternalGuardin.g:536:5: (lv_sections_5_0= ruleSectionBatteryLayer )
            	    {
            	    // InternalGuardin.g:536:5: (lv_sections_5_0= ruleSectionBatteryLayer )
            	    // InternalGuardin.g:537:6: lv_sections_5_0= ruleSectionBatteryLayer
            	    {

            	    						newCompositeNode(grammarAccess.getBatteryAccess().getSectionsSectionBatteryLayerParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    // InternalGuardin.g:555:4: ( (lv_layers_6_0= ruleBatteryLayer ) )
            	    {
            	    // InternalGuardin.g:555:4: ( (lv_layers_6_0= ruleBatteryLayer ) )
            	    // InternalGuardin.g:556:5: (lv_layers_6_0= ruleBatteryLayer )
            	    {
            	    // InternalGuardin.g:556:5: (lv_layers_6_0= ruleBatteryLayer )
            	    // InternalGuardin.g:557:6: lv_layers_6_0= ruleBatteryLayer
            	    {

            	    						newCompositeNode(grammarAccess.getBatteryAccess().getLayersBatteryLayerParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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


    // $ANTLR start "entryRuleSectionBatteryLayer"
    // InternalGuardin.g:579:1: entryRuleSectionBatteryLayer returns [EObject current=null] : iv_ruleSectionBatteryLayer= ruleSectionBatteryLayer EOF ;
    public final EObject entryRuleSectionBatteryLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionBatteryLayer = null;


        try {
            // InternalGuardin.g:579:60: (iv_ruleSectionBatteryLayer= ruleSectionBatteryLayer EOF )
            // InternalGuardin.g:580:2: iv_ruleSectionBatteryLayer= ruleSectionBatteryLayer EOF
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
    // InternalGuardin.g:586:1: ruleSectionBatteryLayer returns [EObject current=null] : ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'fin_section' ) ;
    public final EObject ruleSectionBatteryLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_layers_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:592:2: ( ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'fin_section' ) )
            // InternalGuardin.g:593:2: ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'fin_section' )
            {
            // InternalGuardin.g:593:2: ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'fin_section' )
            // InternalGuardin.g:594:3: () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= ruleBatteryLayer ) )+ otherlv_4= 'fin_section'
            {
            // InternalGuardin.g:594:3: ()
            // InternalGuardin.g:595:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionBatteryLayerAccess().getSectionLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionBatteryLayerAccess().getDebut_sectionKeyword_1());
            		
            // InternalGuardin.g:605:3: ( ( ruleEString ) )
            // InternalGuardin.g:606:4: ( ruleEString )
            {
            // InternalGuardin.g:606:4: ( ruleEString )
            // InternalGuardin.g:607:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionBatteryLayerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSectionBatteryLayerAccess().getSectionSectionCrossReference_2_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGuardin.g:621:3: ( (lv_layers_3_0= ruleBatteryLayer ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGuardin.g:622:4: (lv_layers_3_0= ruleBatteryLayer )
            	    {
            	    // InternalGuardin.g:622:4: (lv_layers_3_0= ruleBatteryLayer )
            	    // InternalGuardin.g:623:5: lv_layers_3_0= ruleBatteryLayer
            	    {

            	    					newCompositeNode(grammarAccess.getSectionBatteryLayerAccess().getLayersBatteryLayerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalGuardin.g:648:1: entryRuleBatteryLayer returns [EObject current=null] : iv_ruleBatteryLayer= ruleBatteryLayer EOF ;
    public final EObject entryRuleBatteryLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatteryLayer = null;


        try {
            // InternalGuardin.g:648:53: (iv_ruleBatteryLayer= ruleBatteryLayer EOF )
            // InternalGuardin.g:649:2: iv_ruleBatteryLayer= ruleBatteryLayer EOF
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
    // InternalGuardin.g:655:1: ruleBatteryLayer returns [EObject current=null] : ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ ) ;
    public final EObject ruleBatteryLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_notes_2_1 = null;

        EObject lv_notes_2_2 = null;

        EObject lv_notes_2_3 = null;



        	enterRule();

        try {
            // InternalGuardin.g:661:2: ( ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ ) )
            // InternalGuardin.g:662:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ )
            {
            // InternalGuardin.g:662:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+ )
            // InternalGuardin.g:663:3: () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+
            {
            // InternalGuardin.g:663:3: ()
            // InternalGuardin.g:664:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getBatteryLayerAccess().getLayerKeyword_1());
            		
            // InternalGuardin.g:674:3: ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19||LA9_0==24||(LA9_0>=29 && LA9_0<=34)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGuardin.g:675:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) )
            	    {
            	    // InternalGuardin.g:675:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote ) )
            	    // InternalGuardin.g:676:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote )
            	    {
            	    // InternalGuardin.g:676:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote )
            	    int alt8=3;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	    case 30:
            	    case 31:
            	    case 32:
            	    case 33:
            	    case 34:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case 24:
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
            	            // InternalGuardin.g:677:6: lv_notes_2_1= ruleBatteryNote
            	            {

            	            						newCompositeNode(grammarAccess.getBatteryLayerAccess().getNotesBatteryNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_19);
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
            	            // InternalGuardin.g:693:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getBatteryLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_19);
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
            	            // InternalGuardin.g:709:6: lv_notes_2_3= ruleCompositeBatteryNote
            	            {

            	            						newCompositeNode(grammarAccess.getBatteryLayerAccess().getNotesCompositeBatteryNoteParserRuleCall_2_0_2());
            	            					
            	            pushFollow(FOLLOW_19);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // InternalGuardin.g:731:1: entryRuleBatteryNote returns [EObject current=null] : iv_ruleBatteryNote= ruleBatteryNote EOF ;
    public final EObject entryRuleBatteryNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatteryNote = null;


        try {
            // InternalGuardin.g:731:52: (iv_ruleBatteryNote= ruleBatteryNote EOF )
            // InternalGuardin.g:732:2: iv_ruleBatteryNote= ruleBatteryNote EOF
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
    // InternalGuardin.g:738:1: ruleBatteryNote returns [EObject current=null] : ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) ) ;
    public final EObject ruleBatteryNote() throws RecognitionException {
        EObject current = null;

        Enumerator lv_noteType_1_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:744:2: ( ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) ) )
            // InternalGuardin.g:745:2: ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) )
            {
            // InternalGuardin.g:745:2: ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) )
            // InternalGuardin.g:746:3: () ( (lv_noteType_1_0= ruleBatteryNoteType ) )
            {
            // InternalGuardin.g:746:3: ()
            // InternalGuardin.g:747:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:753:3: ( (lv_noteType_1_0= ruleBatteryNoteType ) )
            // InternalGuardin.g:754:4: (lv_noteType_1_0= ruleBatteryNoteType )
            {
            // InternalGuardin.g:754:4: (lv_noteType_1_0= ruleBatteryNoteType )
            // InternalGuardin.g:755:5: lv_noteType_1_0= ruleBatteryNoteType
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
    // InternalGuardin.g:776:1: entryRuleCompositeBatteryNote returns [EObject current=null] : iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF ;
    public final EObject entryRuleCompositeBatteryNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeBatteryNote = null;


        try {
            // InternalGuardin.g:776:61: (iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF )
            // InternalGuardin.g:777:2: iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF
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
    // InternalGuardin.g:783:1: ruleCompositeBatteryNote returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) ;
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
            // InternalGuardin.g:789:2: ( ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) )
            // InternalGuardin.g:790:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:790:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            // InternalGuardin.g:791:3: () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) )
            {
            // InternalGuardin.g:791:3: ()
            // InternalGuardin.g:792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeBatteryNoteAccess().getCompositeNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeBatteryNoteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGuardin.g:802:3: ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19||(LA11_0>=29 && LA11_0<=34)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGuardin.g:803:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) )
            	    {
            	    // InternalGuardin.g:803:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) )
            	    // InternalGuardin.g:804:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote )
            	    {
            	    // InternalGuardin.g:804:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( ((LA10_0>=29 && LA10_0<=34)) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==19) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalGuardin.g:805:6: lv_notes_2_1= ruleBatteryNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositeBatteryNoteAccess().getNotesBatteryNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_21);
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
            	            // InternalGuardin.g:821:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositeBatteryNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_21);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeBatteryNoteAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositeBatteryNoteAccess().getXKeyword_4());
            		
            // InternalGuardin.g:847:3: ( (lv_repeats_5_0= ruleEInt ) )
            // InternalGuardin.g:848:4: (lv_repeats_5_0= ruleEInt )
            {
            // InternalGuardin.g:848:4: (lv_repeats_5_0= ruleEInt )
            // InternalGuardin.g:849:5: lv_repeats_5_0= ruleEInt
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
    // InternalGuardin.g:870:1: entryRulePiano returns [EObject current=null] : iv_rulePiano= rulePiano EOF ;
    public final EObject entryRulePiano() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiano = null;


        try {
            // InternalGuardin.g:870:46: (iv_rulePiano= rulePiano EOF )
            // InternalGuardin.g:871:2: iv_rulePiano= rulePiano EOF
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
    // InternalGuardin.g:877:1: rulePiano returns [EObject current=null] : ( () otherlv_1= 'piano' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+ ) ;
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
            // InternalGuardin.g:883:2: ( ( () otherlv_1= 'piano' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+ ) )
            // InternalGuardin.g:884:2: ( () otherlv_1= 'piano' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+ )
            {
            // InternalGuardin.g:884:2: ( () otherlv_1= 'piano' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+ )
            // InternalGuardin.g:885:3: () otherlv_1= 'piano' (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) ) ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+
            {
            // InternalGuardin.g:885:3: ()
            // InternalGuardin.g:886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoAccess().getPianoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPianoAccess().getPianoKeyword_1());
            		
            // InternalGuardin.g:896:3: (otherlv_2= ':' | ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGuardin.g:897:4: otherlv_2= ':'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getPianoAccess().getColonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:902:4: ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' )
                    {
                    // InternalGuardin.g:902:4: ( ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' )
                    // InternalGuardin.g:903:5: ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':'
                    {
                    // InternalGuardin.g:903:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalGuardin.g:904:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalGuardin.g:904:6: (lv_name_3_0= ruleEString )
                    // InternalGuardin.g:905:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPianoAccess().getNameEStringParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_4);
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

                    otherlv_4=(Token)match(input,12,FOLLOW_15); 

                    					newLeafNode(otherlv_4, grammarAccess.getPianoAccess().getColonKeyword_2_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalGuardin.g:928:3: ( ( (lv_sections_5_0= ruleSectionPianoLayer ) ) | ( (lv_layers_6_0= rulePianoLayer ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }
                else if ( (LA13_0==23) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGuardin.g:929:4: ( (lv_sections_5_0= ruleSectionPianoLayer ) )
            	    {
            	    // InternalGuardin.g:929:4: ( (lv_sections_5_0= ruleSectionPianoLayer ) )
            	    // InternalGuardin.g:930:5: (lv_sections_5_0= ruleSectionPianoLayer )
            	    {
            	    // InternalGuardin.g:930:5: (lv_sections_5_0= ruleSectionPianoLayer )
            	    // InternalGuardin.g:931:6: lv_sections_5_0= ruleSectionPianoLayer
            	    {

            	    						newCompositeNode(grammarAccess.getPianoAccess().getSectionsSectionPianoLayerParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    // InternalGuardin.g:949:4: ( (lv_layers_6_0= rulePianoLayer ) )
            	    {
            	    // InternalGuardin.g:949:4: ( (lv_layers_6_0= rulePianoLayer ) )
            	    // InternalGuardin.g:950:5: (lv_layers_6_0= rulePianoLayer )
            	    {
            	    // InternalGuardin.g:950:5: (lv_layers_6_0= rulePianoLayer )
            	    // InternalGuardin.g:951:6: lv_layers_6_0= rulePianoLayer
            	    {

            	    						newCompositeNode(grammarAccess.getPianoAccess().getLayersPianoLayerParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // InternalGuardin.g:973:1: entryRuleSectionPianoLayer returns [EObject current=null] : iv_ruleSectionPianoLayer= ruleSectionPianoLayer EOF ;
    public final EObject entryRuleSectionPianoLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionPianoLayer = null;


        try {
            // InternalGuardin.g:973:58: (iv_ruleSectionPianoLayer= ruleSectionPianoLayer EOF )
            // InternalGuardin.g:974:2: iv_ruleSectionPianoLayer= ruleSectionPianoLayer EOF
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
    // InternalGuardin.g:980:1: ruleSectionPianoLayer returns [EObject current=null] : ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'fin_section' ) ;
    public final EObject ruleSectionPianoLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_layers_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:986:2: ( ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'fin_section' ) )
            // InternalGuardin.g:987:2: ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'fin_section' )
            {
            // InternalGuardin.g:987:2: ( () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'fin_section' )
            // InternalGuardin.g:988:3: () otherlv_1= 'debut_section' ( ( ruleEString ) ) ( (lv_layers_3_0= rulePianoLayer ) )+ otherlv_4= 'fin_section'
            {
            // InternalGuardin.g:988:3: ()
            // InternalGuardin.g:989:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionPianoLayerAccess().getSectionLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionPianoLayerAccess().getDebut_sectionKeyword_1());
            		
            // InternalGuardin.g:999:3: ( ( ruleEString ) )
            // InternalGuardin.g:1000:4: ( ruleEString )
            {
            // InternalGuardin.g:1000:4: ( ruleEString )
            // InternalGuardin.g:1001:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionPianoLayerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSectionPianoLayerAccess().getSectionSectionCrossReference_2_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGuardin.g:1015:3: ( (lv_layers_3_0= rulePianoLayer ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGuardin.g:1016:4: (lv_layers_3_0= rulePianoLayer )
            	    {
            	    // InternalGuardin.g:1016:4: (lv_layers_3_0= rulePianoLayer )
            	    // InternalGuardin.g:1017:5: lv_layers_3_0= rulePianoLayer
            	    {

            	    					newCompositeNode(grammarAccess.getSectionPianoLayerAccess().getLayersPianoLayerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalGuardin.g:1042:1: entryRulePianoLayer returns [EObject current=null] : iv_rulePianoLayer= rulePianoLayer EOF ;
    public final EObject entryRulePianoLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePianoLayer = null;


        try {
            // InternalGuardin.g:1042:51: (iv_rulePianoLayer= rulePianoLayer EOF )
            // InternalGuardin.g:1043:2: iv_rulePianoLayer= rulePianoLayer EOF
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
    // InternalGuardin.g:1049:1: rulePianoLayer returns [EObject current=null] : ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ ) ;
    public final EObject rulePianoLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_notes_2_1 = null;

        EObject lv_notes_2_2 = null;

        EObject lv_notes_2_3 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1055:2: ( ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ ) )
            // InternalGuardin.g:1056:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ )
            {
            // InternalGuardin.g:1056:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ )
            // InternalGuardin.g:1057:3: () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+
            {
            // InternalGuardin.g:1057:3: ()
            // InternalGuardin.g:1058:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getPianoLayerAccess().getLayerKeyword_1());
            		
            // InternalGuardin.g:1068:3: ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19||LA16_0==24||(LA16_0>=35 && LA16_0<=41)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGuardin.g:1069:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) )
            	    {
            	    // InternalGuardin.g:1069:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) )
            	    // InternalGuardin.g:1070:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote )
            	    {
            	    // InternalGuardin.g:1070:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote )
            	    int alt15=3;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	    case 36:
            	    case 37:
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 41:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // InternalGuardin.g:1071:6: lv_notes_2_1= rulePianoNote
            	            {

            	            						newCompositeNode(grammarAccess.getPianoLayerAccess().getNotesPianoNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_24);
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
            	            // InternalGuardin.g:1087:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getPianoLayerAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_24);
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
            	            // InternalGuardin.g:1103:6: lv_notes_2_3= ruleCompositePianoNote
            	            {

            	            						newCompositeNode(grammarAccess.getPianoLayerAccess().getNotesCompositePianoNoteParserRuleCall_2_0_2());
            	            					
            	            pushFollow(FOLLOW_24);
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // InternalGuardin.g:1125:1: entryRulePianoNote returns [EObject current=null] : iv_rulePianoNote= rulePianoNote EOF ;
    public final EObject entryRulePianoNote() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePianoNote = null;


        try {
            // InternalGuardin.g:1125:50: (iv_rulePianoNote= rulePianoNote EOF )
            // InternalGuardin.g:1126:2: iv_rulePianoNote= rulePianoNote EOF
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
    // InternalGuardin.g:1132:1: rulePianoNote returns [EObject current=null] : ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? ) ;
    public final EObject rulePianoNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_noteType_1_0 = null;

        AntlrDatatypeRuleToken lv_octaveOffset_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1138:2: ( ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? ) )
            // InternalGuardin.g:1139:2: ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? )
            {
            // InternalGuardin.g:1139:2: ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? )
            // InternalGuardin.g:1140:3: () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )?
            {
            // InternalGuardin.g:1140:3: ()
            // InternalGuardin.g:1141:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoNoteAccess().getPianoNoteAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:1147:3: ( (lv_noteType_1_0= rulePianoNoteType ) )
            // InternalGuardin.g:1148:4: (lv_noteType_1_0= rulePianoNoteType )
            {
            // InternalGuardin.g:1148:4: (lv_noteType_1_0= rulePianoNoteType )
            // InternalGuardin.g:1149:5: lv_noteType_1_0= rulePianoNoteType
            {

            					newCompositeNode(grammarAccess.getPianoNoteAccess().getNoteTypePianoNoteTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalGuardin.g:1166:3: (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGuardin.g:1167:4: otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getPianoNoteAccess().getSolidusKeyword_2_0());
                    			
                    // InternalGuardin.g:1171:4: ( (lv_octaveOffset_3_0= ruleERelativeInt ) )
                    // InternalGuardin.g:1172:5: (lv_octaveOffset_3_0= ruleERelativeInt )
                    {
                    // InternalGuardin.g:1172:5: (lv_octaveOffset_3_0= ruleERelativeInt )
                    // InternalGuardin.g:1173:6: lv_octaveOffset_3_0= ruleERelativeInt
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
    // InternalGuardin.g:1195:1: entryRuleCompositePianoNote returns [EObject current=null] : iv_ruleCompositePianoNote= ruleCompositePianoNote EOF ;
    public final EObject entryRuleCompositePianoNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositePianoNote = null;


        try {
            // InternalGuardin.g:1195:59: (iv_ruleCompositePianoNote= ruleCompositePianoNote EOF )
            // InternalGuardin.g:1196:2: iv_ruleCompositePianoNote= ruleCompositePianoNote EOF
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
    // InternalGuardin.g:1202:1: ruleCompositePianoNote returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) ;
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
            // InternalGuardin.g:1208:2: ( ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) )
            // InternalGuardin.g:1209:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:1209:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            // InternalGuardin.g:1210:3: () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) )
            {
            // InternalGuardin.g:1210:3: ()
            // InternalGuardin.g:1211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositePianoNoteAccess().getCompositeNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositePianoNoteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGuardin.g:1221:3: ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19||(LA19_0>=35 && LA19_0<=41)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGuardin.g:1222:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) )
            	    {
            	    // InternalGuardin.g:1222:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) )
            	    // InternalGuardin.g:1223:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote )
            	    {
            	    // InternalGuardin.g:1223:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( ((LA18_0>=35 && LA18_0<=41)) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==19) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalGuardin.g:1224:6: lv_notes_2_1= rulePianoNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositePianoNoteAccess().getNotesPianoNoteParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_28);
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
            	            // InternalGuardin.g:1240:6: lv_notes_2_2= ruleEmptyNote
            	            {

            	            						newCompositeNode(grammarAccess.getCompositePianoNoteAccess().getNotesEmptyNoteParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_28);
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositePianoNoteAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositePianoNoteAccess().getXKeyword_4());
            		
            // InternalGuardin.g:1266:3: ( (lv_repeats_5_0= ruleEInt ) )
            // InternalGuardin.g:1267:4: (lv_repeats_5_0= ruleEInt )
            {
            // InternalGuardin.g:1267:4: (lv_repeats_5_0= ruleEInt )
            // InternalGuardin.g:1268:5: lv_repeats_5_0= ruleEInt
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
    // InternalGuardin.g:1289:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGuardin.g:1289:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGuardin.g:1290:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalGuardin.g:1296:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGuardin.g:1302:2: (this_INT_0= RULE_INT )
            // InternalGuardin.g:1303:2: this_INT_0= RULE_INT
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
    // InternalGuardin.g:1313:1: entryRuleERelativeInt returns [String current=null] : iv_ruleERelativeInt= ruleERelativeInt EOF ;
    public final String entryRuleERelativeInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleERelativeInt = null;


        try {
            // InternalGuardin.g:1313:52: (iv_ruleERelativeInt= ruleERelativeInt EOF )
            // InternalGuardin.g:1314:2: iv_ruleERelativeInt= ruleERelativeInt EOF
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
    // InternalGuardin.g:1320:1: ruleERelativeInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleERelativeInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:1326:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGuardin.g:1327:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGuardin.g:1327:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGuardin.g:1328:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGuardin.g:1328:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGuardin.g:1329:4: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_11); 

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
    // InternalGuardin.g:1346:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGuardin.g:1346:47: (iv_ruleEString= ruleEString EOF )
            // InternalGuardin.g:1347:2: iv_ruleEString= ruleEString EOF
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
    // InternalGuardin.g:1353:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:1359:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGuardin.g:1360:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGuardin.g:1360:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGuardin.g:1361:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1369:3: this_ID_1= RULE_ID
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
    // InternalGuardin.g:1380:1: ruleBatteryNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) ;
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
            // InternalGuardin.g:1386:2: ( ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) )
            // InternalGuardin.g:1387:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            {
            // InternalGuardin.g:1387:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt22=1;
                }
                break;
            case 30:
                {
                alt22=2;
                }
                break;
            case 31:
                {
                alt22=3;
                }
                break;
            case 32:
                {
                alt22=4;
                }
                break;
            case 33:
                {
                alt22=5;
                }
                break;
            case 34:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGuardin.g:1388:3: (enumLiteral_0= 'bd' )
                    {
                    // InternalGuardin.g:1388:3: (enumLiteral_0= 'bd' )
                    // InternalGuardin.g:1389:4: enumLiteral_0= 'bd'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1396:3: (enumLiteral_1= 'ch' )
                    {
                    // InternalGuardin.g:1396:3: (enumLiteral_1= 'ch' )
                    // InternalGuardin.g:1397:4: enumLiteral_1= 'ch'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:1404:3: (enumLiteral_2= 'cc' )
                    {
                    // InternalGuardin.g:1404:3: (enumLiteral_2= 'cc' )
                    // InternalGuardin.g:1405:4: enumLiteral_2= 'cc'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1412:3: (enumLiteral_3= 'oh' )
                    {
                    // InternalGuardin.g:1412:3: (enumLiteral_3= 'oh' )
                    // InternalGuardin.g:1413:4: enumLiteral_3= 'oh'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1420:3: (enumLiteral_4= 'rc' )
                    {
                    // InternalGuardin.g:1420:3: (enumLiteral_4= 'rc' )
                    // InternalGuardin.g:1421:4: enumLiteral_4= 'rc'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1428:3: (enumLiteral_5= 'sd' )
                    {
                    // InternalGuardin.g:1428:3: (enumLiteral_5= 'sd' )
                    // InternalGuardin.g:1429:4: enumLiteral_5= 'sd'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_2); 

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
    // InternalGuardin.g:1439:1: rulePianoNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) ) ;
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
            // InternalGuardin.g:1445:2: ( ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) ) )
            // InternalGuardin.g:1446:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) )
            {
            // InternalGuardin.g:1446:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 37:
                {
                alt23=3;
                }
                break;
            case 38:
                {
                alt23=4;
                }
                break;
            case 39:
                {
                alt23=5;
                }
                break;
            case 40:
                {
                alt23=6;
                }
                break;
            case 41:
                {
                alt23=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalGuardin.g:1447:3: (enumLiteral_0= 'A' )
                    {
                    // InternalGuardin.g:1447:3: (enumLiteral_0= 'A' )
                    // InternalGuardin.g:1448:4: enumLiteral_0= 'A'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1455:3: (enumLiteral_1= 'B' )
                    {
                    // InternalGuardin.g:1455:3: (enumLiteral_1= 'B' )
                    // InternalGuardin.g:1456:4: enumLiteral_1= 'B'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:1463:3: (enumLiteral_2= 'C' )
                    {
                    // InternalGuardin.g:1463:3: (enumLiteral_2= 'C' )
                    // InternalGuardin.g:1464:4: enumLiteral_2= 'C'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1471:3: (enumLiteral_3= 'D' )
                    {
                    // InternalGuardin.g:1471:3: (enumLiteral_3= 'D' )
                    // InternalGuardin.g:1472:4: enumLiteral_3= 'D'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1479:3: (enumLiteral_4= 'E' )
                    {
                    // InternalGuardin.g:1479:3: (enumLiteral_4= 'E' )
                    // InternalGuardin.g:1480:4: enumLiteral_4= 'E'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1487:3: (enumLiteral_5= 'F' )
                    {
                    // InternalGuardin.g:1487:3: (enumLiteral_5= 'F' )
                    // InternalGuardin.g:1488:4: enumLiteral_5= 'F'
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:1495:3: (enumLiteral_6= 'G' )
                    {
                    // InternalGuardin.g:1495:3: (enumLiteral_6= 'G' )
                    // InternalGuardin.g:1496:4: enumLiteral_6= 'G'
                    {
                    enumLiteral_6=(Token)match(input,41,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008100060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000007E1080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000007E1080002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000007E0080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000007E2080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000003F801080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000003F801080002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000003F800080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000003F802080000L});

}