/*
 * generated by Xtext 2.14.0
 */
package fr.polytech.dsl.rhythm.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GuardinGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MusicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.dsl.rhythm.Guardin.Music");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMusicAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSectionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSectionSectionParserRuleCall_3_0 = (RuleCall)cSectionAssignment_3.eContents().get(0);
		private final Assignment cSectionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSectionSectionParserRuleCall_4_0 = (RuleCall)cSectionAssignment_4.eContents().get(0);
		private final Keyword cTracksKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cHyphenMinusKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cTrackAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cTrackTrackParserRuleCall_7_1_0 = (RuleCall)cTrackAssignment_7_1.eContents().get(0);
		private final Group cGroup_7_2 = (Group)cGroup_7.eContents().get(2);
		private final Keyword cHyphenMinusKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Assignment cTrackAssignment_7_2_1 = (Assignment)cGroup_7_2.eContents().get(1);
		private final RuleCall cTrackTrackParserRuleCall_7_2_1_0 = (RuleCall)cTrackAssignment_7_2_1.eContents().get(0);
		
		//Music:
		//	{Music} name=EString ":"
		//	section+=Section
		//	section+=Section*
		//	"tracks" ":" ("-" track+=Track ("-" track+=Track)*);
		@Override public ParserRule getRule() { return rule; }
		
		//{Music} name=EString ":" section+=Section section+=Section* "tracks" ":" ("-" track+=Track ("-" track+=Track)*)
		public Group getGroup() { return cGroup; }
		
		//{Music}
		public Action getMusicAction_0() { return cMusicAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//section+=Section
		public Assignment getSectionAssignment_3() { return cSectionAssignment_3; }
		
		//Section
		public RuleCall getSectionSectionParserRuleCall_3_0() { return cSectionSectionParserRuleCall_3_0; }
		
		//section+=Section*
		public Assignment getSectionAssignment_4() { return cSectionAssignment_4; }
		
		//Section
		public RuleCall getSectionSectionParserRuleCall_4_0() { return cSectionSectionParserRuleCall_4_0; }
		
		//"tracks"
		public Keyword getTracksKeyword_5() { return cTracksKeyword_5; }
		
		//":"
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//"-" track+=Track ("-" track+=Track)*
		public Group getGroup_7() { return cGroup_7; }
		
		//"-"
		public Keyword getHyphenMinusKeyword_7_0() { return cHyphenMinusKeyword_7_0; }
		
		//track+=Track
		public Assignment getTrackAssignment_7_1() { return cTrackAssignment_7_1; }
		
		//Track
		public RuleCall getTrackTrackParserRuleCall_7_1_0() { return cTrackTrackParserRuleCall_7_1_0; }
		
		//("-" track+=Track)*
		public Group getGroup_7_2() { return cGroup_7_2; }
		
		//"-"
		public Keyword getHyphenMinusKeyword_7_2_0() { return cHyphenMinusKeyword_7_2_0; }
		
		//track+=Track
		public Assignment getTrackAssignment_7_2_1() { return cTrackAssignment_7_2_1; }
		
		//Track
		public RuleCall getTrackTrackParserRuleCall_7_2_1_0() { return cTrackTrackParserRuleCall_7_2_1_0; }
	}
	public class SectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.dsl.rhythm.Guardin.Section");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTempoKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTempoAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTempoEIntParserRuleCall_4_0 = (RuleCall)cTempoAssignment_4.eContents().get(0);
		private final Keyword cSignatureKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cSignatureAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSignatureEIntParserRuleCall_6_0 = (RuleCall)cSignatureAssignment_6.eContents().get(0);
		private final Keyword cBarsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBarsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBarsEIntParserRuleCall_8_0 = (RuleCall)cBarsAssignment_8.eContents().get(0);
		
		//Section:
		//	{Section} name=EString ":"
		//	"tempo=" tempo=EInt
		//	"signature=" signature=EInt
		//	"bars=" bars=EInt;
		@Override public ParserRule getRule() { return rule; }
		
		//{Section} name=EString ":" "tempo=" tempo=EInt "signature=" signature=EInt "bars=" bars=EInt
		public Group getGroup() { return cGroup; }
		
		//{Section}
		public Action getSectionAction_0() { return cSectionAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//"tempo="
		public Keyword getTempoKeyword_3() { return cTempoKeyword_3; }
		
		//tempo=EInt
		public Assignment getTempoAssignment_4() { return cTempoAssignment_4; }
		
		//EInt
		public RuleCall getTempoEIntParserRuleCall_4_0() { return cTempoEIntParserRuleCall_4_0; }
		
		//"signature="
		public Keyword getSignatureKeyword_5() { return cSignatureKeyword_5; }
		
		//signature=EInt
		public Assignment getSignatureAssignment_6() { return cSignatureAssignment_6; }
		
		//EInt
		public RuleCall getSignatureEIntParserRuleCall_6_0() { return cSignatureEIntParserRuleCall_6_0; }
		
		//"bars="
		public Keyword getBarsKeyword_7() { return cBarsKeyword_7; }
		
		//bars=EInt
		public Assignment getBarsAssignment_8() { return cBarsAssignment_8; }
		
		//EInt
		public RuleCall getBarsEIntParserRuleCall_8_0() { return cBarsEIntParserRuleCall_8_0; }
	}
	public class TrackElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.dsl.rhythm.Guardin.Track");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTrackAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cInstrumentKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInstrumentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInstrumentBatteryParserRuleCall_4_0 = (RuleCall)cInstrumentAssignment_4.eContents().get(0);
		
		//Track:
		//	{Track} (name=EString ":")?
		//	"instrument" ":" instrument=Battery;
		@Override public ParserRule getRule() { return rule; }
		
		//{Track} (name=EString ":")? "instrument" ":" instrument=Battery
		public Group getGroup() { return cGroup; }
		
		//{Track}
		public Action getTrackAction_0() { return cTrackAction_0; }
		
		//(name=EString ":")?
		public Group getGroup_1() { return cGroup_1; }
		
		//name=EString
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0_0() { return cNameEStringParserRuleCall_1_0_0; }
		
		//":"
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//"instrument"
		public Keyword getInstrumentKeyword_2() { return cInstrumentKeyword_2; }
		
		//":"
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//instrument=Battery
		public Assignment getInstrumentAssignment_4() { return cInstrumentAssignment_4; }
		
		//Battery
		public RuleCall getInstrumentBatteryParserRuleCall_4_0() { return cInstrumentBatteryParserRuleCall_4_0; }
	}
	public class BatteryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.dsl.rhythm.Guardin.Battery");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBatteryAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cNotesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNotesBatteryNoteEnumRuleCall_2_0 = (RuleCall)cNotesAssignment_2.eContents().get(0);
		
		//Battery:
		//	{Battery} (name=EString ":")?
		//	notes+=BatteryNote+;
		@Override public ParserRule getRule() { return rule; }
		
		//{Battery} (name=EString ":")? notes+=BatteryNote+
		public Group getGroup() { return cGroup; }
		
		//{Battery}
		public Action getBatteryAction_0() { return cBatteryAction_0; }
		
		//(name=EString ":")?
		public Group getGroup_1() { return cGroup_1; }
		
		//name=EString
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0_0() { return cNameEStringParserRuleCall_1_0_0; }
		
		//":"
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//notes+=BatteryNote+
		public Assignment getNotesAssignment_2() { return cNotesAssignment_2; }
		
		//BatteryNote
		public RuleCall getNotesBatteryNoteEnumRuleCall_2_0() { return cNotesBatteryNoteEnumRuleCall_2_0; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.dsl.rhythm.Guardin.EInt");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EInt ecore::EInt:
		//	INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.dsl.rhythm.Guardin.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	public class BatteryNoteElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.dsl.rhythm.Guardin.BatteryNote");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cEMPTYEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cEMPTYDollarSignKeyword_0_0 = (Keyword)cEMPTYEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBASS_DRUMEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBASS_DRUMBdKeyword_1_0 = (Keyword)cBASS_DRUMEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCLOSED_HIHATEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCLOSED_HIHATChKeyword_2_0 = (Keyword)cCLOSED_HIHATEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cCRASH_CYMBALEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cCRASH_CYMBALCcKeyword_3_0 = (Keyword)cCRASH_CYMBALEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cOPENED_HIHATEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cOPENED_HIHATOhKeyword_4_0 = (Keyword)cOPENED_HIHATEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cRIDE_CYMBALEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cRIDE_CYMBALRcKeyword_5_0 = (Keyword)cRIDE_CYMBALEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cSNARE_DRUMEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cSNARE_DRUMSdKeyword_6_0 = (Keyword)cSNARE_DRUMEnumLiteralDeclaration_6.eContents().get(0);
		
		//enum BatteryNote:
		//	EMPTY="$" | BASS_DRUM="bd" | CLOSED_HIHAT="ch" | CRASH_CYMBAL="cc" | OPENED_HIHAT="oh" | RIDE_CYMBAL="rc" |
		//	SNARE_DRUM="sd";
		public EnumRule getRule() { return rule; }
		
		//EMPTY="$" | BASS_DRUM="bd" | CLOSED_HIHAT="ch" | CRASH_CYMBAL="cc" | OPENED_HIHAT="oh" | RIDE_CYMBAL="rc" |
		//SNARE_DRUM="sd"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EMPTY="$"
		public EnumLiteralDeclaration getEMPTYEnumLiteralDeclaration_0() { return cEMPTYEnumLiteralDeclaration_0; }
		
		//"$"
		public Keyword getEMPTYDollarSignKeyword_0_0() { return cEMPTYDollarSignKeyword_0_0; }
		
		//BASS_DRUM="bd"
		public EnumLiteralDeclaration getBASS_DRUMEnumLiteralDeclaration_1() { return cBASS_DRUMEnumLiteralDeclaration_1; }
		
		//"bd"
		public Keyword getBASS_DRUMBdKeyword_1_0() { return cBASS_DRUMBdKeyword_1_0; }
		
		//CLOSED_HIHAT="ch"
		public EnumLiteralDeclaration getCLOSED_HIHATEnumLiteralDeclaration_2() { return cCLOSED_HIHATEnumLiteralDeclaration_2; }
		
		//"ch"
		public Keyword getCLOSED_HIHATChKeyword_2_0() { return cCLOSED_HIHATChKeyword_2_0; }
		
		//CRASH_CYMBAL="cc"
		public EnumLiteralDeclaration getCRASH_CYMBALEnumLiteralDeclaration_3() { return cCRASH_CYMBALEnumLiteralDeclaration_3; }
		
		//"cc"
		public Keyword getCRASH_CYMBALCcKeyword_3_0() { return cCRASH_CYMBALCcKeyword_3_0; }
		
		//OPENED_HIHAT="oh"
		public EnumLiteralDeclaration getOPENED_HIHATEnumLiteralDeclaration_4() { return cOPENED_HIHATEnumLiteralDeclaration_4; }
		
		//"oh"
		public Keyword getOPENED_HIHATOhKeyword_4_0() { return cOPENED_HIHATOhKeyword_4_0; }
		
		//RIDE_CYMBAL="rc"
		public EnumLiteralDeclaration getRIDE_CYMBALEnumLiteralDeclaration_5() { return cRIDE_CYMBALEnumLiteralDeclaration_5; }
		
		//"rc"
		public Keyword getRIDE_CYMBALRcKeyword_5_0() { return cRIDE_CYMBALRcKeyword_5_0; }
		
		//SNARE_DRUM="sd"
		public EnumLiteralDeclaration getSNARE_DRUMEnumLiteralDeclaration_6() { return cSNARE_DRUMEnumLiteralDeclaration_6; }
		
		//"sd"
		public Keyword getSNARE_DRUMSdKeyword_6_0() { return cSNARE_DRUMSdKeyword_6_0; }
	}
	
	private final MusicElements pMusic;
	private final SectionElements pSection;
	private final TrackElements pTrack;
	private final BatteryElements pBattery;
	private final BatteryNoteElements eBatteryNote;
	private final EIntElements pEInt;
	private final EStringElements pEString;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GuardinGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMusic = new MusicElements();
		this.pSection = new SectionElements();
		this.pTrack = new TrackElements();
		this.pBattery = new BatteryElements();
		this.eBatteryNote = new BatteryNoteElements();
		this.pEInt = new EIntElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.polytech.dsl.rhythm.Guardin".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Music:
	//	{Music} name=EString ":"
	//	section+=Section
	//	section+=Section*
	//	"tracks" ":" ("-" track+=Track ("-" track+=Track)*);
	public MusicElements getMusicAccess() {
		return pMusic;
	}
	
	public ParserRule getMusicRule() {
		return getMusicAccess().getRule();
	}
	
	//Section:
	//	{Section} name=EString ":"
	//	"tempo=" tempo=EInt
	//	"signature=" signature=EInt
	//	"bars=" bars=EInt;
	public SectionElements getSectionAccess() {
		return pSection;
	}
	
	public ParserRule getSectionRule() {
		return getSectionAccess().getRule();
	}
	
	//Track:
	//	{Track} (name=EString ":")?
	//	"instrument" ":" instrument=Battery;
	public TrackElements getTrackAccess() {
		return pTrack;
	}
	
	public ParserRule getTrackRule() {
		return getTrackAccess().getRule();
	}
	
	//Battery:
	//	{Battery} (name=EString ":")?
	//	notes+=BatteryNote+;
	public BatteryElements getBatteryAccess() {
		return pBattery;
	}
	
	public ParserRule getBatteryRule() {
		return getBatteryAccess().getRule();
	}
	
	//enum BatteryNote:
	//	EMPTY="$" | BASS_DRUM="bd" | CLOSED_HIHAT="ch" | CRASH_CYMBAL="cc" | OPENED_HIHAT="oh" | RIDE_CYMBAL="rc" |
	//	SNARE_DRUM="sd";
	public BatteryNoteElements getBatteryNoteAccess() {
		return eBatteryNote;
	}
	
	public EnumRule getBatteryNoteRule() {
		return getBatteryNoteAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
