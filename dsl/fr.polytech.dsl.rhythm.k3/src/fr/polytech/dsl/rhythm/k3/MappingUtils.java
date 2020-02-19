package fr.polytech.dsl.rhythm.k3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
				jFugueWrapper.addTrack(
					new Track(
						layer.getNotes().stream().map(MappingUtils::mapNote).collect(Collectors.joining(" ")),
						mapInstrument(track.getInstrument()),
						voice.get()
					)
				);
				voice.set(voice.get() + 1);
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
		
		if (note instanceof BatteryNote) {
			return "R"; // TODO
		}
		
		return "R";
	}
	
	public static String mapPianoNote(PianoNote note) {
		return note.getNoteType().toString();
	}
}