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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Music'", "':'", "'sections'", "'tracks'", "'-'", "'patterns'", "'piano'", "'battery'", "'tempo='", "'signature='", "'bars='", "'battery:'", "'piano:'", "'$'", "'layer:'", "'('", "')'", "'x'", "'/'", "'bd'", "'ch'", "'cc'", "'oh'", "'rc'", "'sd'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'"
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
    public static final int T__42=42;
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
    // InternalGuardin.g:72:1: ruleMusic returns [EObject current=null] : ( () otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'sections' otherlv_5= ':' ( (lv_sections_6_0= ruleSection ) ) ( (lv_sections_7_0= ruleSection ) )* otherlv_8= 'tracks' otherlv_9= ':' (otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )* ) (otherlv_14= 'patterns' otherlv_15= ':' (otherlv_16= '-' otherlv_17= 'piano' otherlv_18= ':' otherlv_19= '-' ( (lv_patterns_20_0= rulePianoPattern ) ) (otherlv_21= '-' ( (lv_patterns_22_0= rulePianoPattern ) ) )* )? (otherlv_23= '-' otherlv_24= 'battery' otherlv_25= ':' otherlv_26= '-' ( (lv_patterns_27_0= ruleBatteryPattern ) ) (otherlv_28= '-' ( (lv_patterns_29_0= ruleBatteryPattern ) ) )* )? )? ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sections_6_0 = null;

        EObject lv_sections_7_0 = null;

        EObject lv_tracks_11_0 = null;

        EObject lv_tracks_13_0 = null;

        EObject lv_patterns_20_0 = null;

        EObject lv_patterns_22_0 = null;

        EObject lv_patterns_27_0 = null;

        EObject lv_patterns_29_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:78:2: ( ( () otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'sections' otherlv_5= ':' ( (lv_sections_6_0= ruleSection ) ) ( (lv_sections_7_0= ruleSection ) )* otherlv_8= 'tracks' otherlv_9= ':' (otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )* ) (otherlv_14= 'patterns' otherlv_15= ':' (otherlv_16= '-' otherlv_17= 'piano' otherlv_18= ':' otherlv_19= '-' ( (lv_patterns_20_0= rulePianoPattern ) ) (otherlv_21= '-' ( (lv_patterns_22_0= rulePianoPattern ) ) )* )? (otherlv_23= '-' otherlv_24= 'battery' otherlv_25= ':' otherlv_26= '-' ( (lv_patterns_27_0= ruleBatteryPattern ) ) (otherlv_28= '-' ( (lv_patterns_29_0= ruleBatteryPattern ) ) )* )? )? ) )
            // InternalGuardin.g:79:2: ( () otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'sections' otherlv_5= ':' ( (lv_sections_6_0= ruleSection ) ) ( (lv_sections_7_0= ruleSection ) )* otherlv_8= 'tracks' otherlv_9= ':' (otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )* ) (otherlv_14= 'patterns' otherlv_15= ':' (otherlv_16= '-' otherlv_17= 'piano' otherlv_18= ':' otherlv_19= '-' ( (lv_patterns_20_0= rulePianoPattern ) ) (otherlv_21= '-' ( (lv_patterns_22_0= rulePianoPattern ) ) )* )? (otherlv_23= '-' otherlv_24= 'battery' otherlv_25= ':' otherlv_26= '-' ( (lv_patterns_27_0= ruleBatteryPattern ) ) (otherlv_28= '-' ( (lv_patterns_29_0= ruleBatteryPattern ) ) )* )? )? )
            {
            // InternalGuardin.g:79:2: ( () otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'sections' otherlv_5= ':' ( (lv_sections_6_0= ruleSection ) ) ( (lv_sections_7_0= ruleSection ) )* otherlv_8= 'tracks' otherlv_9= ':' (otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )* ) (otherlv_14= 'patterns' otherlv_15= ':' (otherlv_16= '-' otherlv_17= 'piano' otherlv_18= ':' otherlv_19= '-' ( (lv_patterns_20_0= rulePianoPattern ) ) (otherlv_21= '-' ( (lv_patterns_22_0= rulePianoPattern ) ) )* )? (otherlv_23= '-' otherlv_24= 'battery' otherlv_25= ':' otherlv_26= '-' ( (lv_patterns_27_0= ruleBatteryPattern ) ) (otherlv_28= '-' ( (lv_patterns_29_0= ruleBatteryPattern ) ) )* )? )? )
            // InternalGuardin.g:80:3: () otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= 'sections' otherlv_5= ':' ( (lv_sections_6_0= ruleSection ) ) ( (lv_sections_7_0= ruleSection ) )* otherlv_8= 'tracks' otherlv_9= ':' (otherlv_10= '-' ( (lv_tracks_11_0= ruleTrack ) ) (otherlv_12= '-' ( (lv_tracks_13_0= ruleTrack ) ) )* ) (otherlv_14= 'patterns' otherlv_15= ':' (otherlv_16= '-' otherlv_17= 'piano' otherlv_18= ':' otherlv_19= '-' ( (lv_patterns_20_0= rulePianoPattern ) ) (otherlv_21= '-' ( (lv_patterns_22_0= rulePianoPattern ) ) )* )? (otherlv_23= '-' otherlv_24= 'battery' otherlv_25= ':' otherlv_26= '-' ( (lv_patterns_27_0= ruleBatteryPattern ) ) (otherlv_28= '-' ( (lv_patterns_29_0= ruleBatteryPattern ) ) )* )? )?
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

            // InternalGuardin.g:218:3: (otherlv_14= 'patterns' otherlv_15= ':' (otherlv_16= '-' otherlv_17= 'piano' otherlv_18= ':' otherlv_19= '-' ( (lv_patterns_20_0= rulePianoPattern ) ) (otherlv_21= '-' ( (lv_patterns_22_0= rulePianoPattern ) ) )* )? (otherlv_23= '-' otherlv_24= 'battery' otherlv_25= ':' otherlv_26= '-' ( (lv_patterns_27_0= ruleBatteryPattern ) ) (otherlv_28= '-' ( (lv_patterns_29_0= ruleBatteryPattern ) ) )* )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGuardin.g:219:4: otherlv_14= 'patterns' otherlv_15= ':' (otherlv_16= '-' otherlv_17= 'piano' otherlv_18= ':' otherlv_19= '-' ( (lv_patterns_20_0= rulePianoPattern ) ) (otherlv_21= '-' ( (lv_patterns_22_0= rulePianoPattern ) ) )* )? (otherlv_23= '-' otherlv_24= 'battery' otherlv_25= ':' otherlv_26= '-' ( (lv_patterns_27_0= ruleBatteryPattern ) ) (otherlv_28= '-' ( (lv_patterns_29_0= ruleBatteryPattern ) ) )* )?
                    {
                    otherlv_14=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getMusicAccess().getPatternsKeyword_11_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getMusicAccess().getColonKeyword_11_1());
                    			
                    // InternalGuardin.g:227:4: (otherlv_16= '-' otherlv_17= 'piano' otherlv_18= ':' otherlv_19= '-' ( (lv_patterns_20_0= rulePianoPattern ) ) (otherlv_21= '-' ( (lv_patterns_22_0= rulePianoPattern ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1==17) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalGuardin.g:228:5: otherlv_16= '-' otherlv_17= 'piano' otherlv_18= ':' otherlv_19= '-' ( (lv_patterns_20_0= rulePianoPattern ) ) (otherlv_21= '-' ( (lv_patterns_22_0= rulePianoPattern ) ) )*
                            {
                            otherlv_16=(Token)match(input,15,FOLLOW_11); 

                            					newLeafNode(otherlv_16, grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_2_0());
                            				
                            otherlv_17=(Token)match(input,17,FOLLOW_4); 

                            					newLeafNode(otherlv_17, grammarAccess.getMusicAccess().getPianoKeyword_11_2_1());
                            				
                            otherlv_18=(Token)match(input,12,FOLLOW_7); 

                            					newLeafNode(otherlv_18, grammarAccess.getMusicAccess().getColonKeyword_11_2_2());
                            				
                            otherlv_19=(Token)match(input,15,FOLLOW_3); 

                            					newLeafNode(otherlv_19, grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_2_3());
                            				
                            // InternalGuardin.g:244:5: ( (lv_patterns_20_0= rulePianoPattern ) )
                            // InternalGuardin.g:245:6: (lv_patterns_20_0= rulePianoPattern )
                            {
                            // InternalGuardin.g:245:6: (lv_patterns_20_0= rulePianoPattern )
                            // InternalGuardin.g:246:7: lv_patterns_20_0= rulePianoPattern
                            {

                            							newCompositeNode(grammarAccess.getMusicAccess().getPatternsPianoPatternParserRuleCall_11_2_4_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_patterns_20_0=rulePianoPattern();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMusicRule());
                            							}
                            							add(
                            								current,
                            								"patterns",
                            								lv_patterns_20_0,
                            								"fr.polytech.dsl.rhythm.Guardin.PianoPattern");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGuardin.g:263:5: (otherlv_21= '-' ( (lv_patterns_22_0= rulePianoPattern ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==15) ) {
                                    int LA3_1 = input.LA(2);

                                    if ( ((LA3_1>=RULE_STRING && LA3_1<=RULE_ID)) ) {
                                        alt3=1;
                                    }


                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalGuardin.g:264:6: otherlv_21= '-' ( (lv_patterns_22_0= rulePianoPattern ) )
                            	    {
                            	    otherlv_21=(Token)match(input,15,FOLLOW_3); 

                            	    						newLeafNode(otherlv_21, grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_2_5_0());
                            	    					
                            	    // InternalGuardin.g:268:6: ( (lv_patterns_22_0= rulePianoPattern ) )
                            	    // InternalGuardin.g:269:7: (lv_patterns_22_0= rulePianoPattern )
                            	    {
                            	    // InternalGuardin.g:269:7: (lv_patterns_22_0= rulePianoPattern )
                            	    // InternalGuardin.g:270:8: lv_patterns_22_0= rulePianoPattern
                            	    {

                            	    								newCompositeNode(grammarAccess.getMusicAccess().getPatternsPianoPatternParserRuleCall_11_2_5_1_0());
                            	    							
                            	    pushFollow(FOLLOW_10);
                            	    lv_patterns_22_0=rulePianoPattern();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMusicRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"patterns",
                            	    									lv_patterns_22_0,
                            	    									"fr.polytech.dsl.rhythm.Guardin.PianoPattern");
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
                            break;

                    }

                    // InternalGuardin.g:289:4: (otherlv_23= '-' otherlv_24= 'battery' otherlv_25= ':' otherlv_26= '-' ( (lv_patterns_27_0= ruleBatteryPattern ) ) (otherlv_28= '-' ( (lv_patterns_29_0= ruleBatteryPattern ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalGuardin.g:290:5: otherlv_23= '-' otherlv_24= 'battery' otherlv_25= ':' otherlv_26= '-' ( (lv_patterns_27_0= ruleBatteryPattern ) ) (otherlv_28= '-' ( (lv_patterns_29_0= ruleBatteryPattern ) ) )*
                            {
                            otherlv_23=(Token)match(input,15,FOLLOW_12); 

                            					newLeafNode(otherlv_23, grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_3_0());
                            				
                            otherlv_24=(Token)match(input,18,FOLLOW_4); 

                            					newLeafNode(otherlv_24, grammarAccess.getMusicAccess().getBatteryKeyword_11_3_1());
                            				
                            otherlv_25=(Token)match(input,12,FOLLOW_7); 

                            					newLeafNode(otherlv_25, grammarAccess.getMusicAccess().getColonKeyword_11_3_2());
                            				
                            otherlv_26=(Token)match(input,15,FOLLOW_3); 

                            					newLeafNode(otherlv_26, grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_3_3());
                            				
                            // InternalGuardin.g:306:5: ( (lv_patterns_27_0= ruleBatteryPattern ) )
                            // InternalGuardin.g:307:6: (lv_patterns_27_0= ruleBatteryPattern )
                            {
                            // InternalGuardin.g:307:6: (lv_patterns_27_0= ruleBatteryPattern )
                            // InternalGuardin.g:308:7: lv_patterns_27_0= ruleBatteryPattern
                            {

                            							newCompositeNode(grammarAccess.getMusicAccess().getPatternsBatteryPatternParserRuleCall_11_3_4_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_patterns_27_0=ruleBatteryPattern();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMusicRule());
                            							}
                            							add(
                            								current,
                            								"patterns",
                            								lv_patterns_27_0,
                            								"fr.polytech.dsl.rhythm.Guardin.BatteryPattern");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGuardin.g:325:5: (otherlv_28= '-' ( (lv_patterns_29_0= ruleBatteryPattern ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==15) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalGuardin.g:326:6: otherlv_28= '-' ( (lv_patterns_29_0= ruleBatteryPattern ) )
                            	    {
                            	    otherlv_28=(Token)match(input,15,FOLLOW_3); 

                            	    						newLeafNode(otherlv_28, grammarAccess.getMusicAccess().getHyphenMinusKeyword_11_3_5_0());
                            	    					
                            	    // InternalGuardin.g:330:6: ( (lv_patterns_29_0= ruleBatteryPattern ) )
                            	    // InternalGuardin.g:331:7: (lv_patterns_29_0= ruleBatteryPattern )
                            	    {
                            	    // InternalGuardin.g:331:7: (lv_patterns_29_0= ruleBatteryPattern )
                            	    // InternalGuardin.g:332:8: lv_patterns_29_0= ruleBatteryPattern
                            	    {

                            	    								newCompositeNode(grammarAccess.getMusicAccess().getPatternsBatteryPatternParserRuleCall_11_3_5_1_0());
                            	    							
                            	    pushFollow(FOLLOW_10);
                            	    lv_patterns_29_0=ruleBatteryPattern();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMusicRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"patterns",
                            	    									lv_patterns_29_0,
                            	    									"fr.polytech.dsl.rhythm.Guardin.BatteryPattern");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

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
    // $ANTLR end "ruleMusic"


    // $ANTLR start "entryRuleSection"
    // InternalGuardin.g:356:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalGuardin.g:356:48: (iv_ruleSection= ruleSection EOF )
            // InternalGuardin.g:357:2: iv_ruleSection= ruleSection EOF
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
    // InternalGuardin.g:363:1: ruleSection returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) ) ;
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
            // InternalGuardin.g:369:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) ) )
            // InternalGuardin.g:370:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:370:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) ) )
            // InternalGuardin.g:371:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'tempo=' ( (lv_tempo_4_0= ruleEInt ) ) otherlv_5= 'signature=' ( (lv_signature_6_0= ruleEInt ) ) otherlv_7= 'bars=' ( (lv_bars_8_0= ruleEInt ) )
            {
            // InternalGuardin.g:371:3: ()
            // InternalGuardin.g:372:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionAccess().getSectionAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:378:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGuardin.g:379:4: (lv_name_1_0= ruleEString )
            {
            // InternalGuardin.g:379:4: (lv_name_1_0= ruleEString )
            // InternalGuardin.g:380:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getTempoKeyword_3());
            		
            // InternalGuardin.g:405:3: ( (lv_tempo_4_0= ruleEInt ) )
            // InternalGuardin.g:406:4: (lv_tempo_4_0= ruleEInt )
            {
            // InternalGuardin.g:406:4: (lv_tempo_4_0= ruleEInt )
            // InternalGuardin.g:407:5: lv_tempo_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getTempoEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getSignatureKeyword_5());
            		
            // InternalGuardin.g:428:3: ( (lv_signature_6_0= ruleEInt ) )
            // InternalGuardin.g:429:4: (lv_signature_6_0= ruleEInt )
            {
            // InternalGuardin.g:429:4: (lv_signature_6_0= ruleEInt )
            // InternalGuardin.g:430:5: lv_signature_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getSignatureEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_7=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getBarsKeyword_7());
            		
            // InternalGuardin.g:451:3: ( (lv_bars_8_0= ruleEInt ) )
            // InternalGuardin.g:452:4: (lv_bars_8_0= ruleEInt )
            {
            // InternalGuardin.g:452:4: (lv_bars_8_0= ruleEInt )
            // InternalGuardin.g:453:5: lv_bars_8_0= ruleEInt
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
    // InternalGuardin.g:474:1: entryRuleTrack returns [EObject current=null] : iv_ruleTrack= ruleTrack EOF ;
    public final EObject entryRuleTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrack = null;


        try {
            // InternalGuardin.g:474:46: (iv_ruleTrack= ruleTrack EOF )
            // InternalGuardin.g:475:2: iv_ruleTrack= ruleTrack EOF
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
    // InternalGuardin.g:481:1: ruleTrack returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) ) ) ;
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
            // InternalGuardin.g:487:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) ) ) )
            // InternalGuardin.g:488:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) ) )
            {
            // InternalGuardin.g:488:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) ) )
            // InternalGuardin.g:489:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) )
            {
            // InternalGuardin.g:489:3: ()
            // InternalGuardin.g:490:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrackAccess().getTrackAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:496:3: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGuardin.g:497:4: ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalGuardin.g:497:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalGuardin.g:498:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalGuardin.g:498:5: (lv_name_1_0= ruleEString )
                    // InternalGuardin.g:499:6: lv_name_1_0= ruleEString
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

                    otherlv_2=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGuardin.g:521:3: ( (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) ) | (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGuardin.g:522:4: (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) )
                    {
                    // InternalGuardin.g:522:4: (otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) ) )
                    // InternalGuardin.g:523:5: otherlv_3= 'battery:' ( (lv_instrument_4_0= ruleBattery ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_18); 

                    					newLeafNode(otherlv_3, grammarAccess.getTrackAccess().getBatteryKeyword_2_0_0());
                    				
                    // InternalGuardin.g:527:5: ( (lv_instrument_4_0= ruleBattery ) )
                    // InternalGuardin.g:528:6: (lv_instrument_4_0= ruleBattery )
                    {
                    // InternalGuardin.g:528:6: (lv_instrument_4_0= ruleBattery )
                    // InternalGuardin.g:529:7: lv_instrument_4_0= ruleBattery
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
                    // InternalGuardin.g:548:4: (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) )
                    {
                    // InternalGuardin.g:548:4: (otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) ) )
                    // InternalGuardin.g:549:5: otherlv_5= 'piano:' ( (lv_instrument_6_0= rulePiano ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_18); 

                    					newLeafNode(otherlv_5, grammarAccess.getTrackAccess().getPianoKeyword_2_1_0());
                    				
                    // InternalGuardin.g:553:5: ( (lv_instrument_6_0= rulePiano ) )
                    // InternalGuardin.g:554:6: (lv_instrument_6_0= rulePiano )
                    {
                    // InternalGuardin.g:554:6: (lv_instrument_6_0= rulePiano )
                    // InternalGuardin.g:555:7: lv_instrument_6_0= rulePiano
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
    // InternalGuardin.g:578:1: entryRuleEmptyNote returns [EObject current=null] : iv_ruleEmptyNote= ruleEmptyNote EOF ;
    public final EObject entryRuleEmptyNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyNote = null;


        try {
            // InternalGuardin.g:578:50: (iv_ruleEmptyNote= ruleEmptyNote EOF )
            // InternalGuardin.g:579:2: iv_ruleEmptyNote= ruleEmptyNote EOF
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
    // InternalGuardin.g:585:1: ruleEmptyNote returns [EObject current=null] : ( () otherlv_1= '$' ) ;
    public final EObject ruleEmptyNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:591:2: ( ( () otherlv_1= '$' ) )
            // InternalGuardin.g:592:2: ( () otherlv_1= '$' )
            {
            // InternalGuardin.g:592:2: ( () otherlv_1= '$' )
            // InternalGuardin.g:593:3: () otherlv_1= '$'
            {
            // InternalGuardin.g:593:3: ()
            // InternalGuardin.g:594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyNoteAccess().getEmptyNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

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
    // InternalGuardin.g:608:1: entryRuleBattery returns [EObject current=null] : iv_ruleBattery= ruleBattery EOF ;
    public final EObject entryRuleBattery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBattery = null;


        try {
            // InternalGuardin.g:608:48: (iv_ruleBattery= ruleBattery EOF )
            // InternalGuardin.g:609:2: iv_ruleBattery= ruleBattery EOF
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
    // InternalGuardin.g:615:1: ruleBattery returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= ruleBatteryLayer ) )+ ) ;
    public final EObject ruleBattery() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_layers_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:621:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= ruleBatteryLayer ) )+ ) )
            // InternalGuardin.g:622:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= ruleBatteryLayer ) )+ )
            {
            // InternalGuardin.g:622:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= ruleBatteryLayer ) )+ )
            // InternalGuardin.g:623:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= ruleBatteryLayer ) )+
            {
            // InternalGuardin.g:623:3: ()
            // InternalGuardin.g:624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryAccess().getBatteryAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:630:3: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGuardin.g:631:4: ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalGuardin.g:631:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalGuardin.g:632:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalGuardin.g:632:5: (lv_name_1_0= ruleEString )
                    // InternalGuardin.g:633:6: lv_name_1_0= ruleEString
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

                    otherlv_2=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getBatteryAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGuardin.g:655:3: ( (lv_layers_3_0= ruleBatteryLayer ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGuardin.g:656:4: (lv_layers_3_0= ruleBatteryLayer )
            	    {
            	    // InternalGuardin.g:656:4: (lv_layers_3_0= ruleBatteryLayer )
            	    // InternalGuardin.g:657:5: lv_layers_3_0= ruleBatteryLayer
            	    {

            	    					newCompositeNode(grammarAccess.getBatteryAccess().getLayersBatteryLayerParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalGuardin.g:678:1: entryRuleBatteryLayer returns [EObject current=null] : iv_ruleBatteryLayer= ruleBatteryLayer EOF ;
    public final EObject entryRuleBatteryLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatteryLayer = null;


        try {
            // InternalGuardin.g:678:53: (iv_ruleBatteryLayer= ruleBatteryLayer EOF )
            // InternalGuardin.g:679:2: iv_ruleBatteryLayer= ruleBatteryLayer EOF
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
    // InternalGuardin.g:685:1: ruleBatteryLayer returns [EObject current=null] : ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote | ruleEString ) ) )+ ) ;
    public final EObject ruleBatteryLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_notes_2_1 = null;

        EObject lv_notes_2_2 = null;

        EObject lv_notes_2_3 = null;



        	enterRule();

        try {
            // InternalGuardin.g:691:2: ( ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote | ruleEString ) ) )+ ) )
            // InternalGuardin.g:692:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote | ruleEString ) ) )+ )
            {
            // InternalGuardin.g:692:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote | ruleEString ) ) )+ )
            // InternalGuardin.g:693:3: () otherlv_1= 'layer:' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote | ruleEString ) ) )+
            {
            // InternalGuardin.g:693:3: ()
            // InternalGuardin.g:694:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getBatteryLayerAccess().getLayerKeyword_1());
            		
            // InternalGuardin.g:704:3: ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote | ruleEString ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||LA13_0==24||LA13_0==26||(LA13_0>=30 && LA13_0<=35)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGuardin.g:705:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote | ruleEString ) )
            	    {
            	    // InternalGuardin.g:705:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote | ruleEString ) )
            	    // InternalGuardin.g:706:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote | ruleEString )
            	    {
            	    // InternalGuardin.g:706:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositeBatteryNote | ruleEString )
            	    int alt12=4;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	    case 31:
            	    case 32:
            	    case 33:
            	    case 34:
            	    case 35:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case RULE_STRING:
            	    case RULE_ID:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // InternalGuardin.g:707:6: lv_notes_2_1= ruleBatteryNote
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
            	            // InternalGuardin.g:723:6: lv_notes_2_2= ruleEmptyNote
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
            	            // InternalGuardin.g:739:6: lv_notes_2_3= ruleCompositeBatteryNote
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
            	        case 4 :
            	            // InternalGuardin.g:755:6: ruleEString
            	            {

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getBatteryLayerRule());
            	            						}
            	            					

            	            						newCompositeNode(grammarAccess.getBatteryLayerAccess().getNotesBatteryPatternCrossReference_2_0_3());
            	            					
            	            pushFollow(FOLLOW_21);
            	            ruleEString();

            	            state._fsp--;


            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

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
    // $ANTLR end "ruleBatteryLayer"


    // $ANTLR start "entryRuleBatteryNote"
    // InternalGuardin.g:774:1: entryRuleBatteryNote returns [EObject current=null] : iv_ruleBatteryNote= ruleBatteryNote EOF ;
    public final EObject entryRuleBatteryNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatteryNote = null;


        try {
            // InternalGuardin.g:774:52: (iv_ruleBatteryNote= ruleBatteryNote EOF )
            // InternalGuardin.g:775:2: iv_ruleBatteryNote= ruleBatteryNote EOF
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
    // InternalGuardin.g:781:1: ruleBatteryNote returns [EObject current=null] : ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) ) ;
    public final EObject ruleBatteryNote() throws RecognitionException {
        EObject current = null;

        Enumerator lv_noteType_1_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:787:2: ( ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) ) )
            // InternalGuardin.g:788:2: ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) )
            {
            // InternalGuardin.g:788:2: ( () ( (lv_noteType_1_0= ruleBatteryNoteType ) ) )
            // InternalGuardin.g:789:3: () ( (lv_noteType_1_0= ruleBatteryNoteType ) )
            {
            // InternalGuardin.g:789:3: ()
            // InternalGuardin.g:790:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryNoteAccess().getBatteryNoteAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:796:3: ( (lv_noteType_1_0= ruleBatteryNoteType ) )
            // InternalGuardin.g:797:4: (lv_noteType_1_0= ruleBatteryNoteType )
            {
            // InternalGuardin.g:797:4: (lv_noteType_1_0= ruleBatteryNoteType )
            // InternalGuardin.g:798:5: lv_noteType_1_0= ruleBatteryNoteType
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
    // InternalGuardin.g:819:1: entryRuleCompositeBatteryNote returns [EObject current=null] : iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF ;
    public final EObject entryRuleCompositeBatteryNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeBatteryNote = null;


        try {
            // InternalGuardin.g:819:61: (iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF )
            // InternalGuardin.g:820:2: iv_ruleCompositeBatteryNote= ruleCompositeBatteryNote EOF
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
    // InternalGuardin.g:826:1: ruleCompositeBatteryNote returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) ;
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
            // InternalGuardin.g:832:2: ( ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) )
            // InternalGuardin.g:833:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:833:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            // InternalGuardin.g:834:3: () otherlv_1= '(' ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) )
            {
            // InternalGuardin.g:834:3: ()
            // InternalGuardin.g:835:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeBatteryNoteAccess().getCompositeNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeBatteryNoteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGuardin.g:845:3: ( ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24||(LA15_0>=30 && LA15_0<=35)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGuardin.g:846:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) )
            	    {
            	    // InternalGuardin.g:846:4: ( (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote ) )
            	    // InternalGuardin.g:847:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote )
            	    {
            	    // InternalGuardin.g:847:5: (lv_notes_2_1= ruleBatteryNote | lv_notes_2_2= ruleEmptyNote )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( ((LA14_0>=30 && LA14_0<=35)) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==24) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalGuardin.g:848:6: lv_notes_2_1= ruleBatteryNote
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
            	            // InternalGuardin.g:864:6: lv_notes_2_2= ruleEmptyNote
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeBatteryNoteAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositeBatteryNoteAccess().getXKeyword_4());
            		
            // InternalGuardin.g:890:3: ( (lv_repeats_5_0= ruleEInt ) )
            // InternalGuardin.g:891:4: (lv_repeats_5_0= ruleEInt )
            {
            // InternalGuardin.g:891:4: (lv_repeats_5_0= ruleEInt )
            // InternalGuardin.g:892:5: lv_repeats_5_0= ruleEInt
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
    // InternalGuardin.g:913:1: entryRulePiano returns [EObject current=null] : iv_rulePiano= rulePiano EOF ;
    public final EObject entryRulePiano() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiano = null;


        try {
            // InternalGuardin.g:913:46: (iv_rulePiano= rulePiano EOF )
            // InternalGuardin.g:914:2: iv_rulePiano= rulePiano EOF
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
    // InternalGuardin.g:920:1: rulePiano returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= rulePianoLayer ) )+ ) ;
    public final EObject rulePiano() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_layers_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:926:2: ( ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= rulePianoLayer ) )+ ) )
            // InternalGuardin.g:927:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= rulePianoLayer ) )+ )
            {
            // InternalGuardin.g:927:2: ( () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= rulePianoLayer ) )+ )
            // InternalGuardin.g:928:3: () ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )? ( (lv_layers_3_0= rulePianoLayer ) )+
            {
            // InternalGuardin.g:928:3: ()
            // InternalGuardin.g:929:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoAccess().getPianoAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:935:3: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGuardin.g:936:4: ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalGuardin.g:936:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalGuardin.g:937:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalGuardin.g:937:5: (lv_name_1_0= ruleEString )
                    // InternalGuardin.g:938:6: lv_name_1_0= ruleEString
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

                    otherlv_2=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getPianoAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGuardin.g:960:3: ( (lv_layers_3_0= rulePianoLayer ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGuardin.g:961:4: (lv_layers_3_0= rulePianoLayer )
            	    {
            	    // InternalGuardin.g:961:4: (lv_layers_3_0= rulePianoLayer )
            	    // InternalGuardin.g:962:5: lv_layers_3_0= rulePianoLayer
            	    {

            	    					newCompositeNode(grammarAccess.getPianoAccess().getLayersPianoLayerParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
    // $ANTLR end "rulePiano"


    // $ANTLR start "entryRulePianoLayer"
    // InternalGuardin.g:983:1: entryRulePianoLayer returns [EObject current=null] : iv_rulePianoLayer= rulePianoLayer EOF ;
    public final EObject entryRulePianoLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePianoLayer = null;


        try {
            // InternalGuardin.g:983:51: (iv_rulePianoLayer= rulePianoLayer EOF )
            // InternalGuardin.g:984:2: iv_rulePianoLayer= rulePianoLayer EOF
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
    // InternalGuardin.g:990:1: rulePianoLayer returns [EObject current=null] : ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ ) ;
    public final EObject rulePianoLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_notes_2_1 = null;

        EObject lv_notes_2_2 = null;

        EObject lv_notes_2_3 = null;



        	enterRule();

        try {
            // InternalGuardin.g:996:2: ( ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ ) )
            // InternalGuardin.g:997:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ )
            {
            // InternalGuardin.g:997:2: ( () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+ )
            // InternalGuardin.g:998:3: () otherlv_1= 'layer:' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+
            {
            // InternalGuardin.g:998:3: ()
            // InternalGuardin.g:999:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getPianoLayerAccess().getLayerKeyword_1());
            		
            // InternalGuardin.g:1009:3: ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24||LA19_0==26||(LA19_0>=36 && LA19_0<=42)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGuardin.g:1010:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) )
            	    {
            	    // InternalGuardin.g:1010:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote ) )
            	    // InternalGuardin.g:1011:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote )
            	    {
            	    // InternalGuardin.g:1011:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote | lv_notes_2_3= ruleCompositePianoNote )
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	    case 37:
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 41:
            	    case 42:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // InternalGuardin.g:1012:6: lv_notes_2_1= rulePianoNote
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
            	            // InternalGuardin.g:1028:6: lv_notes_2_2= ruleEmptyNote
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
            	            // InternalGuardin.g:1044:6: lv_notes_2_3= ruleCompositePianoNote
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalGuardin.g:1066:1: entryRulePianoNote returns [EObject current=null] : iv_rulePianoNote= rulePianoNote EOF ;
    public final EObject entryRulePianoNote() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePianoNote = null;


        try {
            // InternalGuardin.g:1066:50: (iv_rulePianoNote= rulePianoNote EOF )
            // InternalGuardin.g:1067:2: iv_rulePianoNote= rulePianoNote EOF
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
    // InternalGuardin.g:1073:1: rulePianoNote returns [EObject current=null] : ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? ) ;
    public final EObject rulePianoNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_noteType_1_0 = null;

        AntlrDatatypeRuleToken lv_octaveOffset_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1079:2: ( ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? ) )
            // InternalGuardin.g:1080:2: ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? )
            {
            // InternalGuardin.g:1080:2: ( () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )? )
            // InternalGuardin.g:1081:3: () ( (lv_noteType_1_0= rulePianoNoteType ) ) (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )?
            {
            // InternalGuardin.g:1081:3: ()
            // InternalGuardin.g:1082:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoNoteAccess().getPianoNoteAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:1088:3: ( (lv_noteType_1_0= rulePianoNoteType ) )
            // InternalGuardin.g:1089:4: (lv_noteType_1_0= rulePianoNoteType )
            {
            // InternalGuardin.g:1089:4: (lv_noteType_1_0= rulePianoNoteType )
            // InternalGuardin.g:1090:5: lv_noteType_1_0= rulePianoNoteType
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

            // InternalGuardin.g:1107:3: (otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGuardin.g:1108:4: otherlv_2= '/' ( (lv_octaveOffset_3_0= ruleERelativeInt ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getPianoNoteAccess().getSolidusKeyword_2_0());
                    			
                    // InternalGuardin.g:1112:4: ( (lv_octaveOffset_3_0= ruleERelativeInt ) )
                    // InternalGuardin.g:1113:5: (lv_octaveOffset_3_0= ruleERelativeInt )
                    {
                    // InternalGuardin.g:1113:5: (lv_octaveOffset_3_0= ruleERelativeInt )
                    // InternalGuardin.g:1114:6: lv_octaveOffset_3_0= ruleERelativeInt
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
    // InternalGuardin.g:1136:1: entryRuleCompositePianoNote returns [EObject current=null] : iv_ruleCompositePianoNote= ruleCompositePianoNote EOF ;
    public final EObject entryRuleCompositePianoNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositePianoNote = null;


        try {
            // InternalGuardin.g:1136:59: (iv_ruleCompositePianoNote= ruleCompositePianoNote EOF )
            // InternalGuardin.g:1137:2: iv_ruleCompositePianoNote= ruleCompositePianoNote EOF
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
    // InternalGuardin.g:1143:1: ruleCompositePianoNote returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) ;
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
            // InternalGuardin.g:1149:2: ( ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) ) )
            // InternalGuardin.g:1150:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            {
            // InternalGuardin.g:1150:2: ( () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) ) )
            // InternalGuardin.g:1151:3: () otherlv_1= '(' ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+ otherlv_3= ')' otherlv_4= 'x' ( (lv_repeats_5_0= ruleEInt ) )
            {
            // InternalGuardin.g:1151:3: ()
            // InternalGuardin.g:1152:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositePianoNoteAccess().getCompositeNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositePianoNoteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGuardin.g:1162:3: ( ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24||(LA22_0>=36 && LA22_0<=42)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGuardin.g:1163:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) )
            	    {
            	    // InternalGuardin.g:1163:4: ( (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote ) )
            	    // InternalGuardin.g:1164:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote )
            	    {
            	    // InternalGuardin.g:1164:5: (lv_notes_2_1= rulePianoNote | lv_notes_2_2= ruleEmptyNote )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( ((LA21_0>=36 && LA21_0<=42)) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==24) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalGuardin.g:1165:6: lv_notes_2_1= rulePianoNote
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
            	            // InternalGuardin.g:1181:6: lv_notes_2_2= ruleEmptyNote
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositePianoNoteAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositePianoNoteAccess().getXKeyword_4());
            		
            // InternalGuardin.g:1207:3: ( (lv_repeats_5_0= ruleEInt ) )
            // InternalGuardin.g:1208:4: (lv_repeats_5_0= ruleEInt )
            {
            // InternalGuardin.g:1208:4: (lv_repeats_5_0= ruleEInt )
            // InternalGuardin.g:1209:5: lv_repeats_5_0= ruleEInt
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


    // $ANTLR start "entryRulePianoPattern"
    // InternalGuardin.g:1230:1: entryRulePianoPattern returns [EObject current=null] : iv_rulePianoPattern= rulePianoPattern EOF ;
    public final EObject entryRulePianoPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePianoPattern = null;


        try {
            // InternalGuardin.g:1230:53: (iv_rulePianoPattern= rulePianoPattern EOF )
            // InternalGuardin.g:1231:2: iv_rulePianoPattern= rulePianoPattern EOF
            {
             newCompositeNode(grammarAccess.getPianoPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePianoPattern=rulePianoPattern();

            state._fsp--;

             current =iv_rulePianoPattern; 
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
    // $ANTLR end "entryRulePianoPattern"


    // $ANTLR start "rulePianoPattern"
    // InternalGuardin.g:1237:1: rulePianoPattern returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_notes_3_0= ruleCompositePianoNote ) )+ ) ;
    public final EObject rulePianoPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_notes_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1243:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_notes_3_0= ruleCompositePianoNote ) )+ ) )
            // InternalGuardin.g:1244:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_notes_3_0= ruleCompositePianoNote ) )+ )
            {
            // InternalGuardin.g:1244:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_notes_3_0= ruleCompositePianoNote ) )+ )
            // InternalGuardin.g:1245:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_notes_3_0= ruleCompositePianoNote ) )+
            {
            // InternalGuardin.g:1245:3: ()
            // InternalGuardin.g:1246:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPianoPatternAccess().getPianoPatternAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:1252:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGuardin.g:1253:4: (lv_name_1_0= ruleEString )
            {
            // InternalGuardin.g:1253:4: (lv_name_1_0= ruleEString )
            // InternalGuardin.g:1254:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPianoPatternAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPianoPatternRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.polytech.dsl.rhythm.Guardin.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getPianoPatternAccess().getColonKeyword_2());
            		
            // InternalGuardin.g:1275:3: ( (lv_notes_3_0= ruleCompositePianoNote ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGuardin.g:1276:4: (lv_notes_3_0= ruleCompositePianoNote )
            	    {
            	    // InternalGuardin.g:1276:4: (lv_notes_3_0= ruleCompositePianoNote )
            	    // InternalGuardin.g:1277:5: lv_notes_3_0= ruleCompositePianoNote
            	    {

            	    					newCompositeNode(grammarAccess.getPianoPatternAccess().getNotesCompositePianoNoteParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_notes_3_0=ruleCompositePianoNote();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPianoPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"notes",
            	    						lv_notes_3_0,
            	    						"fr.polytech.dsl.rhythm.Guardin.CompositePianoNote");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // $ANTLR end "rulePianoPattern"


    // $ANTLR start "entryRuleBatteryPattern"
    // InternalGuardin.g:1298:1: entryRuleBatteryPattern returns [EObject current=null] : iv_ruleBatteryPattern= ruleBatteryPattern EOF ;
    public final EObject entryRuleBatteryPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatteryPattern = null;


        try {
            // InternalGuardin.g:1298:55: (iv_ruleBatteryPattern= ruleBatteryPattern EOF )
            // InternalGuardin.g:1299:2: iv_ruleBatteryPattern= ruleBatteryPattern EOF
            {
             newCompositeNode(grammarAccess.getBatteryPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBatteryPattern=ruleBatteryPattern();

            state._fsp--;

             current =iv_ruleBatteryPattern; 
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
    // $ANTLR end "entryRuleBatteryPattern"


    // $ANTLR start "ruleBatteryPattern"
    // InternalGuardin.g:1305:1: ruleBatteryPattern returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_notes_3_0= ruleCompositeBatteryNote ) )+ ) ;
    public final EObject ruleBatteryPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_notes_3_0 = null;



        	enterRule();

        try {
            // InternalGuardin.g:1311:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_notes_3_0= ruleCompositeBatteryNote ) )+ ) )
            // InternalGuardin.g:1312:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_notes_3_0= ruleCompositeBatteryNote ) )+ )
            {
            // InternalGuardin.g:1312:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_notes_3_0= ruleCompositeBatteryNote ) )+ )
            // InternalGuardin.g:1313:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_notes_3_0= ruleCompositeBatteryNote ) )+
            {
            // InternalGuardin.g:1313:3: ()
            // InternalGuardin.g:1314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBatteryPatternAccess().getBatteryPatternAction_0(),
            					current);
            			

            }

            // InternalGuardin.g:1320:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGuardin.g:1321:4: (lv_name_1_0= ruleEString )
            {
            // InternalGuardin.g:1321:4: (lv_name_1_0= ruleEString )
            // InternalGuardin.g:1322:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBatteryPatternAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBatteryPatternRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.polytech.dsl.rhythm.Guardin.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getBatteryPatternAccess().getColonKeyword_2());
            		
            // InternalGuardin.g:1343:3: ( (lv_notes_3_0= ruleCompositeBatteryNote ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGuardin.g:1344:4: (lv_notes_3_0= ruleCompositeBatteryNote )
            	    {
            	    // InternalGuardin.g:1344:4: (lv_notes_3_0= ruleCompositeBatteryNote )
            	    // InternalGuardin.g:1345:5: lv_notes_3_0= ruleCompositeBatteryNote
            	    {

            	    					newCompositeNode(grammarAccess.getBatteryPatternAccess().getNotesCompositeBatteryNoteParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_notes_3_0=ruleCompositeBatteryNote();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBatteryPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"notes",
            	    						lv_notes_3_0,
            	    						"fr.polytech.dsl.rhythm.Guardin.CompositeBatteryNote");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // $ANTLR end "ruleBatteryPattern"


    // $ANTLR start "entryRuleEInt"
    // InternalGuardin.g:1366:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGuardin.g:1366:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGuardin.g:1367:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalGuardin.g:1373:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGuardin.g:1379:2: (this_INT_0= RULE_INT )
            // InternalGuardin.g:1380:2: this_INT_0= RULE_INT
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
    // InternalGuardin.g:1390:1: entryRuleERelativeInt returns [String current=null] : iv_ruleERelativeInt= ruleERelativeInt EOF ;
    public final String entryRuleERelativeInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleERelativeInt = null;


        try {
            // InternalGuardin.g:1390:52: (iv_ruleERelativeInt= ruleERelativeInt EOF )
            // InternalGuardin.g:1391:2: iv_ruleERelativeInt= ruleERelativeInt EOF
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
    // InternalGuardin.g:1397:1: ruleERelativeInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleERelativeInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:1403:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGuardin.g:1404:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGuardin.g:1404:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGuardin.g:1405:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGuardin.g:1405:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGuardin.g:1406:4: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_14); 

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
    // InternalGuardin.g:1423:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGuardin.g:1423:47: (iv_ruleEString= ruleEString EOF )
            // InternalGuardin.g:1424:2: iv_ruleEString= ruleEString EOF
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
    // InternalGuardin.g:1430:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGuardin.g:1436:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGuardin.g:1437:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGuardin.g:1437:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalGuardin.g:1438:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1446:3: this_ID_1= RULE_ID
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
    // InternalGuardin.g:1457:1: ruleBatteryNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) ;
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
            // InternalGuardin.g:1463:2: ( ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) ) )
            // InternalGuardin.g:1464:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            {
            // InternalGuardin.g:1464:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'ch' ) | (enumLiteral_2= 'cc' ) | (enumLiteral_3= 'oh' ) | (enumLiteral_4= 'rc' ) | (enumLiteral_5= 'sd' ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt27=1;
                }
                break;
            case 31:
                {
                alt27=2;
                }
                break;
            case 32:
                {
                alt27=3;
                }
                break;
            case 33:
                {
                alt27=4;
                }
                break;
            case 34:
                {
                alt27=5;
                }
                break;
            case 35:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalGuardin.g:1465:3: (enumLiteral_0= 'bd' )
                    {
                    // InternalGuardin.g:1465:3: (enumLiteral_0= 'bd' )
                    // InternalGuardin.g:1466:4: enumLiteral_0= 'bd'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBatteryNoteTypeAccess().getBASS_DRUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1473:3: (enumLiteral_1= 'ch' )
                    {
                    // InternalGuardin.g:1473:3: (enumLiteral_1= 'ch' )
                    // InternalGuardin.g:1474:4: enumLiteral_1= 'ch'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBatteryNoteTypeAccess().getCLOSED_HIHATEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:1481:3: (enumLiteral_2= 'cc' )
                    {
                    // InternalGuardin.g:1481:3: (enumLiteral_2= 'cc' )
                    // InternalGuardin.g:1482:4: enumLiteral_2= 'cc'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBatteryNoteTypeAccess().getCRASH_CYMBALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1489:3: (enumLiteral_3= 'oh' )
                    {
                    // InternalGuardin.g:1489:3: (enumLiteral_3= 'oh' )
                    // InternalGuardin.g:1490:4: enumLiteral_3= 'oh'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBatteryNoteTypeAccess().getOPENED_HIHATEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1497:3: (enumLiteral_4= 'rc' )
                    {
                    // InternalGuardin.g:1497:3: (enumLiteral_4= 'rc' )
                    // InternalGuardin.g:1498:4: enumLiteral_4= 'rc'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBatteryNoteTypeAccess().getRIDE_CYMBALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1505:3: (enumLiteral_5= 'sd' )
                    {
                    // InternalGuardin.g:1505:3: (enumLiteral_5= 'sd' )
                    // InternalGuardin.g:1506:4: enumLiteral_5= 'sd'
                    {
                    enumLiteral_5=(Token)match(input,35,FOLLOW_2); 

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
    // InternalGuardin.g:1516:1: rulePianoNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) ) ;
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
            // InternalGuardin.g:1522:2: ( ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) ) )
            // InternalGuardin.g:1523:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) )
            {
            // InternalGuardin.g:1523:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) )
            int alt28=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt28=1;
                }
                break;
            case 37:
                {
                alt28=2;
                }
                break;
            case 38:
                {
                alt28=3;
                }
                break;
            case 39:
                {
                alt28=4;
                }
                break;
            case 40:
                {
                alt28=5;
                }
                break;
            case 41:
                {
                alt28=6;
                }
                break;
            case 42:
                {
                alt28=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalGuardin.g:1524:3: (enumLiteral_0= 'A' )
                    {
                    // InternalGuardin.g:1524:3: (enumLiteral_0= 'A' )
                    // InternalGuardin.g:1525:4: enumLiteral_0= 'A'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPianoNoteTypeAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuardin.g:1532:3: (enumLiteral_1= 'B' )
                    {
                    // InternalGuardin.g:1532:3: (enumLiteral_1= 'B' )
                    // InternalGuardin.g:1533:4: enumLiteral_1= 'B'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPianoNoteTypeAccess().getBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuardin.g:1540:3: (enumLiteral_2= 'C' )
                    {
                    // InternalGuardin.g:1540:3: (enumLiteral_2= 'C' )
                    // InternalGuardin.g:1541:4: enumLiteral_2= 'C'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPianoNoteTypeAccess().getCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuardin.g:1548:3: (enumLiteral_3= 'D' )
                    {
                    // InternalGuardin.g:1548:3: (enumLiteral_3= 'D' )
                    // InternalGuardin.g:1549:4: enumLiteral_3= 'D'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPianoNoteTypeAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGuardin.g:1556:3: (enumLiteral_4= 'E' )
                    {
                    // InternalGuardin.g:1556:3: (enumLiteral_4= 'E' )
                    // InternalGuardin.g:1557:4: enumLiteral_4= 'E'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPianoNoteTypeAccess().getEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGuardin.g:1564:3: (enumLiteral_5= 'F' )
                    {
                    // InternalGuardin.g:1564:3: (enumLiteral_5= 'F' )
                    // InternalGuardin.g:1565:4: enumLiteral_5= 'F'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPianoNoteTypeAccess().getFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGuardin.g:1572:3: (enumLiteral_6= 'G' )
                    {
                    // InternalGuardin.g:1572:3: (enumLiteral_6= 'G' )
                    // InternalGuardin.g:1573:4: enumLiteral_6= 'G'
                    {
                    enumLiteral_6=(Token)match(input,42,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000C00060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000060L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000062L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000FC5000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000FC5000062L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000FC1000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000FC9000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000007F005000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000007F005000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000007F001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000007F009000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000002L});

}