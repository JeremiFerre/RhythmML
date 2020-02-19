package fr.polytech.dsl.rhythm.k3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import fr.polytech.dsl.midi.DrumElement;
import fr.polytech.dsl.midi.JFugueWrapper;
import fr.polytech.dsl.midi.SectionBuilder;
import fr.polytech.dsl.midi.Track;
import fr.polytech.dsl.model.rhythm.Battery;
import fr.polytech.dsl.model.rhythm.BatteryNote;
import fr.polytech.dsl.model.rhythm.CompositeNote;
import fr.polytech.dsl.model.rhythm.Instrument;
import fr.polytech.dsl.model.rhythm.Music;
import fr.polytech.dsl.model.rhythm.Note;
import fr.polytech.dsl.model.rhythm.Piano;
import fr.polytech.dsl.model.rhythm.PianoNote;

public class MappingUtils {
	
	public static void runMusic(Music music) {
		JFugueWrapper jFugueWrapper = new JFugueWrapper();
		
		music.getSections().forEach(section -> 
			jFugueWrapper.addSection(new SectionBuilder()
				.setNbrNote(section.getBars() * section.getSignature())
				.setTempo(section.getTempo())
				.build())
		);
		
		AtomicInteger voice = new AtomicInteger(0);
		music.getTracks().forEach(track -> {
			track.getInstrument().getLayers().forEach(layer -> {
				if (track.getInstrument() instanceof Battery) {
					List<DrumElement> elements = new ArrayList<>();
					layer.getNotes().forEach(note -> elements.addAll(mapBatteryNote(note)));
					jFugueWrapper.addTrack(
						new Track(elements.toArray(new DrumElement[] {}))
					);
				} else {
					jFugueWrapper.addTrack(
						new Track(
							layer.getNotes().stream().map(MappingUtils::mapNote).collect(Collectors.joining(" ")),
							mapInstrument(track.getInstrument()),
							voice.get()
						)
					);
					voice.set(voice.get() + 1);
				}
				
			});
		});
		
        jFugueWrapper.run();
	}
	
	public static String mapInstrument(Instrument instrument) {
		if (instrument instanceof Battery) {
			return "Battery";
		}
		
		if (instrument instanceof Piano) {
			return "Piano";
		}
		
		return "";
	}
	
	public static String mapNote(Note note) {
		if (note instanceof CompositeNote) {
			List<Note> notes = new ArrayList<>();
			IntStream.range(0, ((CompositeNote) note).getRepeats()).forEach(i -> notes.addAll(((CompositeNote) note).getNotes()));
			
			return notes.stream().map(n -> mapNote(n)).collect(Collectors.joining(" "));
		}
		
		if (note instanceof PianoNote) {
			return mapPianoNote((PianoNote) note);
		}
		
		return "R";
	}
	
	public static String mapPianoNote(PianoNote note) {
		return note.getNoteType().toString();
	}
	
	public static List<DrumElement> mapBatteryNote(Note note) {
		List<DrumElement> drums = new ArrayList<>();
		if (note instanceof BatteryNote) {
			switch (((BatteryNote) note).getNoteType()) {
				case BASS_DRUM:
					drums.add(DrumElement.BASS_DRUM);
					break;
				case CLOSED_HIHAT:
					drums.add(DrumElement.CLOSED_HI_HAT);
					break;
				case CRASH_CYMBAL:
					drums.add(DrumElement.CRASH_CYMBAL_);
					break;
				case OPENED_HIHAT:
					drums.add(DrumElement.OPEN_HI_HAT);
					break;
				case RIDE_CYMBAL:
					drums.add(DrumElement.RIDE_CYMBAL_);
					break;
				case SNARE_DRUM:
					drums.add(DrumElement.ELECTRIC_SNARE);
					break;
				default:
					drums.add(DrumElement.SILENCE);
					break;
			}
		} else if (note instanceof CompositeNote) {
			List<Note> notes = new ArrayList<>();
			IntStream.range(0, ((CompositeNote) note).getRepeats()).forEach(i -> notes.addAll(((CompositeNote) note).getNotes()));
			
			notes.stream().forEach(n -> drums.addAll(mapBatteryNote(n)));
		}
		
		return drums;
	}
}