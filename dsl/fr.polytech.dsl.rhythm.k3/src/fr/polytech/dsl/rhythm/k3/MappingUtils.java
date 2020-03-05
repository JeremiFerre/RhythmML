package fr.polytech.dsl.rhythm.k3;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.polytech.dsl.midi.DrumElement;
import fr.polytech.dsl.midi.JFugueWrapper;
import fr.polytech.dsl.midi.SectionBuilder;
import fr.polytech.dsl.midi.Track;
import fr.polytech.dsl.model.rhythm.Battery;
import fr.polytech.dsl.model.rhythm.BatteryNote;
import fr.polytech.dsl.model.rhythm.CompositeNote;
import fr.polytech.dsl.model.rhythm.Instrument;
import fr.polytech.dsl.model.rhythm.Layer;
import fr.polytech.dsl.model.rhythm.Music;
import fr.polytech.dsl.model.rhythm.Note;
import fr.polytech.dsl.model.rhythm.Piano;
import fr.polytech.dsl.model.rhythm.PianoNote;
import fr.polytech.dsl.model.rhythm.SectionLayer;

public class MappingUtils {
	
	public static int notesNumber(EList<Note> notes) {
		int sum = 0;
		for (int i = 0; i < notes.size(); i++) {
			Note n = notes.get(i);
			if (n instanceof CompositeNote) {
				sum += ((CompositeNote) n).getRepeats() * ((CompositeNote) n).getNotes().size();
			} else {
				sum++;
			}
		}
		return sum;
	}
	
	public static void runMusic(Music music) throws IOException, MidiUnavailableException, InvalidMidiDataException {
		JFugueWrapper jFugueWrapper = new JFugueWrapper();
		if (music.getSoundBankPath() != null && !music.getSoundBankPath().equals("")) {
			jFugueWrapper.setBasePathLib(music.getSoundBankPath());
		}
		
		music.getSections().forEach(section -> 
			jFugueWrapper.addSection(new SectionBuilder()
				.setNbrNote(section.getBars() * section.getSignature())
				.setTempo(section.getTempo() * 2)
				.build())
		);
		
		AtomicInteger voice = new AtomicInteger(0);
		music.getTracks().forEach(track -> {
			if (track.getInstrument() instanceof Battery) {
				
				if (track.getInstrument().getSections().isEmpty()) {
					Layer layer = track.getInstrument().getLayers().get(0);
					int nbNotes = notesNumber(layer.getNotes());
					
					List<List<DrumElement>> elements = new ArrayList<>();
					AtomicInteger j = new AtomicInteger(0);
					track.getInstrument().getLayers().forEach(l -> {
						elements.add(new ArrayList<>());
						l.getNotes().forEach(note -> elements.get(j.get()).addAll(mapBatteryNote(note)));
						j.set(j.get() + 1);
					});
					
					List<List<DrumElement>> finalList = new ArrayList<>();
					for (int i = 0; i < nbNotes; i++) {
						finalList.add(new ArrayList<>());
						for (List<DrumElement> el : elements) {
							finalList.get(i).add(el.get(i));
						}
					}
					
					jFugueWrapper.addTrack(
						new Track(finalList.toArray(new List[] {}))
					);
				} else {					
					List<List<DrumElement>> elements = new ArrayList<>();
					List<List<Layer>> layersList = new ArrayList<>();
					for (int n = 0; n < track.getInstrument().getSections().get(0).getLayers().size(); n++) {
						layersList.add(new ArrayList<>());
						final int nFinal = n;
						track.getInstrument().getSections().forEach(s -> {
							layersList.get(nFinal).add(s.getLayers().get(nFinal));
						});
					}
					
					AtomicInteger j = new AtomicInteger(0);
					layersList.forEach(lGroup -> {
						elements.add(new ArrayList<>());
						lGroup.forEach(l -> {
							l.getNotes().forEach(note -> elements.get(j.get()).addAll(mapBatteryNote(note)));
						});
						j.set(j.get() + 1);
					});
					
					List<List<DrumElement>> finalList = new ArrayList<>();
					for (int i = 0; i < layersList.get(0).stream().mapToInt(l -> notesNumber(l.getNotes())).sum(); i++) {
						finalList.add(new ArrayList<>());
						for (List<DrumElement> el : elements) {
							finalList.get(i).add(el.get(i));
						}
					}
					
					jFugueWrapper.addTrack(
						new Track(finalList.toArray(new List[] {}))
					);
				}
			} else {
				if (track.getInstrument().getSections().isEmpty()) {
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
				} else {
					List<List<Layer>> layersList = new ArrayList<>();
					for (int n = 0; n < track.getInstrument().getSections().get(0).getLayers().size(); n++) {
						layersList.add(new ArrayList<>());
						final int nFinal = n;
						track.getInstrument().getSections().forEach(s -> {
							layersList.get(nFinal).add(s.getLayers().get(nFinal));
						});
					}
					
					layersList.forEach(layersTrack -> {
						List<Note> allTrackNotes = new ArrayList<>();
						layersTrack.forEach(l -> allTrackNotes.addAll(l.getNotes()));
						jFugueWrapper.addTrack(
								new Track(
									allTrackNotes.stream().map(MappingUtils::mapNote).collect(Collectors.joining(" ")),
									mapInstrument(track.getInstrument()),
									voice.get()
								)
							);
							voice.set(voice.get() + 1);
					});
				}
			}
		});
		
        jFugueWrapper.run();
	}
	
	public static String mapInstrument(Instrument instrument) {
		if (instrument instanceof Battery) {
			return "Battery";
		}
		
		if (instrument instanceof Piano) {
			Piano piano = ((Piano) instrument);
			if (piano.getOther() != null && !piano.getOther().equals("")) {
				return piano.getOther();
			}
			
			if (piano.getInstrument() != null) {
				return piano.getInstrument().toString();
			}
			
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
		String res = note.getNoteType().toString();
		if (note.getOctaveOffset() != 0) {
			res += (5 + note.getOctaveOffset());
		} else if (note.getOctaveAbsolute() != 5) {
			res += note.getOctaveAbsolute();
		}
		return res;
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
					drums.add(DrumElement.CRASH_CYMBAL_1);
					break;
				case OPENED_HIHAT:
					drums.add(DrumElement.OPEN_HI_HAT);
					break;
				case RIDE_CYMBAL:
					drums.add(DrumElement.RIDE_CYMBAL_2);
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
		} else {
			drums.add(DrumElement.SILENCE);
		}
		
		return drums;
	}
}