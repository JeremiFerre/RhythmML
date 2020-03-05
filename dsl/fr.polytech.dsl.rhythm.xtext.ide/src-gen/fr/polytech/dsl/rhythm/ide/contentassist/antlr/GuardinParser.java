/*
 * generated by Xtext 2.14.0
 */
package fr.polytech.dsl.rhythm.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.polytech.dsl.rhythm.ide.contentassist.antlr.internal.InternalGuardinParser;
import fr.polytech.dsl.rhythm.services.GuardinGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class GuardinParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GuardinGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GuardinGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getInstrumentAccess().getAlternatives(), "rule__Instrument__Alternatives");
			builder.put(grammarAccess.getBatteryAccess().getAlternatives_2(), "rule__Battery__Alternatives_2");
			builder.put(grammarAccess.getBatteryAccess().getAlternatives_3(), "rule__Battery__Alternatives_3");
			builder.put(grammarAccess.getBatteryLayerAccess().getNotesAlternatives_2_0(), "rule__BatteryLayer__NotesAlternatives_2_0");
			builder.put(grammarAccess.getCompositeBatteryNoteAccess().getNotesAlternatives_2_0(), "rule__CompositeBatteryNote__NotesAlternatives_2_0");
			builder.put(grammarAccess.getPianoAccess().getAlternatives_2(), "rule__Piano__Alternatives_2");
			builder.put(grammarAccess.getPianoAccess().getAlternatives_3(), "rule__Piano__Alternatives_3");
			builder.put(grammarAccess.getPianoLayerAccess().getNotesAlternatives_2_0(), "rule__PianoLayer__NotesAlternatives_2_0");
			builder.put(grammarAccess.getCompositePianoNoteAccess().getNotesAlternatives_2_0(), "rule__CompositePianoNote__NotesAlternatives_2_0");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getBatteryNoteTypeAccess().getAlternatives(), "rule__BatteryNoteType__Alternatives");
			builder.put(grammarAccess.getPianoNoteTypeAccess().getAlternatives(), "rule__PianoNoteType__Alternatives");
			builder.put(grammarAccess.getMusicAccess().getGroup(), "rule__Music__Group__0");
			builder.put(grammarAccess.getMusicAccess().getGroup_10(), "rule__Music__Group_10__0");
			builder.put(grammarAccess.getMusicAccess().getGroup_10_2(), "rule__Music__Group_10_2__0");
			builder.put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
			builder.put(grammarAccess.getTrackAccess().getGroup(), "rule__Track__Group__0");
			builder.put(grammarAccess.getTrackAccess().getGroup_1(), "rule__Track__Group_1__0");
			builder.put(grammarAccess.getEmptyNoteAccess().getGroup(), "rule__EmptyNote__Group__0");
			builder.put(grammarAccess.getBatteryAccess().getGroup(), "rule__Battery__Group__0");
			builder.put(grammarAccess.getBatteryAccess().getGroup_2_1(), "rule__Battery__Group_2_1__0");
			builder.put(grammarAccess.getSectionBatteryLayerAccess().getGroup(), "rule__SectionBatteryLayer__Group__0");
			builder.put(grammarAccess.getBatteryLayerAccess().getGroup(), "rule__BatteryLayer__Group__0");
			builder.put(grammarAccess.getBatteryNoteAccess().getGroup(), "rule__BatteryNote__Group__0");
			builder.put(grammarAccess.getCompositeBatteryNoteAccess().getGroup(), "rule__CompositeBatteryNote__Group__0");
			builder.put(grammarAccess.getPianoAccess().getGroup(), "rule__Piano__Group__0");
			builder.put(grammarAccess.getPianoAccess().getGroup_2_1(), "rule__Piano__Group_2_1__0");
			builder.put(grammarAccess.getSectionPianoLayerAccess().getGroup(), "rule__SectionPianoLayer__Group__0");
			builder.put(grammarAccess.getPianoLayerAccess().getGroup(), "rule__PianoLayer__Group__0");
			builder.put(grammarAccess.getPianoNoteAccess().getGroup(), "rule__PianoNote__Group__0");
			builder.put(grammarAccess.getPianoNoteAccess().getGroup_2(), "rule__PianoNote__Group_2__0");
			builder.put(grammarAccess.getCompositePianoNoteAccess().getGroup(), "rule__CompositePianoNote__Group__0");
			builder.put(grammarAccess.getERelativeIntAccess().getGroup(), "rule__ERelativeInt__Group__0");
			builder.put(grammarAccess.getMusicAccess().getNameAssignment_2(), "rule__Music__NameAssignment_2");
			builder.put(grammarAccess.getMusicAccess().getSectionsAssignment_6(), "rule__Music__SectionsAssignment_6");
			builder.put(grammarAccess.getMusicAccess().getSectionsAssignment_7(), "rule__Music__SectionsAssignment_7");
			builder.put(grammarAccess.getMusicAccess().getTracksAssignment_10_1(), "rule__Music__TracksAssignment_10_1");
			builder.put(grammarAccess.getMusicAccess().getTracksAssignment_10_2_1(), "rule__Music__TracksAssignment_10_2_1");
			builder.put(grammarAccess.getSectionAccess().getNameAssignment_1(), "rule__Section__NameAssignment_1");
			builder.put(grammarAccess.getSectionAccess().getTempoAssignment_4(), "rule__Section__TempoAssignment_4");
			builder.put(grammarAccess.getSectionAccess().getSignatureAssignment_6(), "rule__Section__SignatureAssignment_6");
			builder.put(grammarAccess.getSectionAccess().getBarsAssignment_8(), "rule__Section__BarsAssignment_8");
			builder.put(grammarAccess.getTrackAccess().getNameAssignment_1_0(), "rule__Track__NameAssignment_1_0");
			builder.put(grammarAccess.getTrackAccess().getInstrumentAssignment_2(), "rule__Track__InstrumentAssignment_2");
			builder.put(grammarAccess.getBatteryAccess().getNameAssignment_2_1_0(), "rule__Battery__NameAssignment_2_1_0");
			builder.put(grammarAccess.getBatteryAccess().getSectionsAssignment_3_0(), "rule__Battery__SectionsAssignment_3_0");
			builder.put(grammarAccess.getBatteryAccess().getLayersAssignment_3_1(), "rule__Battery__LayersAssignment_3_1");
			builder.put(grammarAccess.getSectionBatteryLayerAccess().getSectionAssignment_2(), "rule__SectionBatteryLayer__SectionAssignment_2");
			builder.put(grammarAccess.getSectionBatteryLayerAccess().getLayersAssignment_3(), "rule__SectionBatteryLayer__LayersAssignment_3");
			builder.put(grammarAccess.getBatteryLayerAccess().getNotesAssignment_2(), "rule__BatteryLayer__NotesAssignment_2");
			builder.put(grammarAccess.getBatteryNoteAccess().getNoteTypeAssignment_1(), "rule__BatteryNote__NoteTypeAssignment_1");
			builder.put(grammarAccess.getCompositeBatteryNoteAccess().getNotesAssignment_2(), "rule__CompositeBatteryNote__NotesAssignment_2");
			builder.put(grammarAccess.getCompositeBatteryNoteAccess().getRepeatsAssignment_5(), "rule__CompositeBatteryNote__RepeatsAssignment_5");
			builder.put(grammarAccess.getPianoAccess().getNameAssignment_2_1_0(), "rule__Piano__NameAssignment_2_1_0");
			builder.put(grammarAccess.getPianoAccess().getSectionsAssignment_3_0(), "rule__Piano__SectionsAssignment_3_0");
			builder.put(grammarAccess.getPianoAccess().getLayersAssignment_3_1(), "rule__Piano__LayersAssignment_3_1");
			builder.put(grammarAccess.getSectionPianoLayerAccess().getSectionAssignment_2(), "rule__SectionPianoLayer__SectionAssignment_2");
			builder.put(grammarAccess.getSectionPianoLayerAccess().getLayersAssignment_3(), "rule__SectionPianoLayer__LayersAssignment_3");
			builder.put(grammarAccess.getPianoLayerAccess().getNotesAssignment_2(), "rule__PianoLayer__NotesAssignment_2");
			builder.put(grammarAccess.getPianoNoteAccess().getNoteTypeAssignment_1(), "rule__PianoNote__NoteTypeAssignment_1");
			builder.put(grammarAccess.getPianoNoteAccess().getOctaveOffsetAssignment_2_1(), "rule__PianoNote__OctaveOffsetAssignment_2_1");
			builder.put(grammarAccess.getCompositePianoNoteAccess().getNotesAssignment_2(), "rule__CompositePianoNote__NotesAssignment_2");
			builder.put(grammarAccess.getCompositePianoNoteAccess().getRepeatsAssignment_5(), "rule__CompositePianoNote__RepeatsAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GuardinGrammarAccess grammarAccess;

	@Override
	protected InternalGuardinParser createParser() {
		InternalGuardinParser result = new InternalGuardinParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GuardinGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GuardinGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
