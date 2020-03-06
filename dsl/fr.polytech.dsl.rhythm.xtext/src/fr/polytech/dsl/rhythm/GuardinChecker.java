package fr.polytech.dsl.rhythm;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import fr.polytech.dsl.model.rhythm.CompositeNote;
import fr.polytech.dsl.model.rhythm.Music;
import fr.polytech.dsl.model.rhythm.Note;
import fr.polytech.dsl.model.rhythm.SectionLayer;

public class GuardinChecker {

	private final Music music;
	
	public GuardinChecker(Music music) {
		this.music = music;
	}
	
	public int totalBeats() {
		return music.getSections().stream().mapToInt(section -> section.getBars() * section.getSignature()).sum();
	}
	
	public double noteBeats(Note note) {
		switch (note.getDuration()) {
		case EIGHTH:
			return 0.5;
		case SIXTEENTH:
			return 0.25;
		case THIRTY_SECOND:
			return 0.125;
		default:
			return 1;
		}
	}
	
	public int notesNumber(EList<Note> notes) {
		double sum = 0;
		for (int i = 0; i < notes.size(); i++) {
			Note n = notes.get(i);
			if (n instanceof CompositeNote) {
				CompositeNote cn = ((CompositeNote) n);
				sum += cn.getNotes().stream().mapToDouble(note -> noteBeats(note)).sum() * cn.getRepeats();
			} else {
				sum += noteBeats(n);
			}
		}
		return (int) sum;
	}
	
	public boolean sameLayersCount(List<SectionLayer> sectionLayers) {
		if (sectionLayers.isEmpty()) return false;
		return sectionLayers.stream().allMatch(s -> s.getLayers().size() == sectionLayers.get(0).getLayers().size());
	}
	
	public boolean verify() {
		return music.getTracks()
				.stream()
				.allMatch(track -> {
					System.out.println(this.totalBeats());
					if (track.getInstrument().getSections().isEmpty()) {
						return track.getInstrument().getLayers().stream().allMatch(layer -> notesNumber(layer.getNotes()) == this.totalBeats());
					} else {
						return sameLayersCount(track.getInstrument().getSections())
								&&
								track.getInstrument()
								.getSections()
								.stream()
								.allMatch(sec -> sec.getLayers()
													.stream()
													.allMatch(layer -> notesNumber(layer.getNotes()) == sec.getSection().getBars() * sec.getSection().getSignature()));
					}
				});
	}
}
