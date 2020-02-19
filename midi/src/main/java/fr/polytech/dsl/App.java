package fr.polytech.dsl;

import fr.polytech.dsl.midi.*;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;
import org.jfugue.theory.Note;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws MidiUnavailableException {

        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        System.out.println(Arrays.toString(synthesizer.getAvailableInstruments()));
        JFugueWrapper jFugueWrapper = new JFugueWrapper();
        Section section = new SectionBuilder()
                .setNbrNote(27)
                .setTempo(120)
                .build();
        jFugueWrapper.addSection(section);
        Track ocarina = new Track("A B C D A B C D", "Ocarina", 0);
        Track piano = new Track("R R R R F G F G", "Piano", 1);
        List<String> s = Arrays.stream("[BASS_DRUM]i Ri Ri Rs [BASS_DRUM]s [BASS_DRUM]i Ri Ri Ri [BASS_DRUM]i Ri Ri Rs [BASS_DRUM]s [BASS_DRUM]i [BASS_DRUM]i Ri Ri L1 Ri Ri [ACOUSTIC_SNARE]i Ri Ri Ri [ACOUSTIC_SNARE]i Ri Ri Ri [ACOUSTIC_SNARE]i Ri Ri Ri [ACOUSTIC_SNARE]i Ri L2 [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs [PEDAL_HI_HAT]s Rs L3 Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri [CRASH_CYMBAL_1]s Rs".split(" "))
                .filter(v -> v.contains("[")).collect(Collectors.toList());
        String s3 = s.stream().reduce((s1, s2) -> s1 + " " + s2).get();
        jFugueWrapper.addTrack(ocarina);
        jFugueWrapper.addTrack(piano);
        new Player().play(new Note(35).getPattern().setVoice(9)); //
        new Player().play(new Note(42).getPattern().setVoice(9)); //
    }
}
