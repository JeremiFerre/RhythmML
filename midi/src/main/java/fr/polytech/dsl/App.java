package fr.polytech.dsl;

import fr.polytech.dsl.midi.*;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;
import org.jfugue.theory.Note;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws MidiUnavailableException, IOException, InvalidMidiDataException {

        JFugueWrapper jFugueWrapper = new JFugueWrapper();
        Section section = new SectionBuilder()
                .setNbrNote(8)
                .setTempo(120)
                .build();
        jFugueWrapper.addSection(section);
        Track piano = new Track("A B C D A B C D", "Piano", 1);
        Track drum = new Track(DrumElement.ACOUSTIC_BASS_DRUM, DrumElement.BASS_DRUM, DrumElement.CHINESE_CYMBAL,
                DrumElement.ACOUSTIC_BASS_DRUM, DrumElement.BASS_DRUM, DrumElement.CHINESE_CYMBAL, DrumElement.BASS_DRUM, DrumElement.SIDE_STICK);
       jFugueWrapper.addTrack(piano);
        jFugueWrapper.addTrack(drum);
       jFugueWrapper.setBasePathLib("./soundBank");
        jFugueWrapper.run();
    }
}
