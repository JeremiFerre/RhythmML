package fr.polytech.dsl;

import fr.polytech.dsl.midi.JFugueWrapper;
import fr.polytech.dsl.midi.Section;
import fr.polytech.dsl.midi.SectionBuilder;
import fr.polytech.dsl.midi.Track;
import fr.polytech.dsl.old.Music;
import fr.polytech.dsl.old.instrument.DrumElement;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        JFugueWrapper jFugueWrapper = new JFugueWrapper();
        Section section =  new SectionBuilder()
                .setNbrNote(8)
                .setTempo(120)
                .build();
        jFugueWrapper.addSection(section);
        Track ocarina = new Track("A B C D A B C D", "Ocarina", 0);
        Track piano = new Track("R R R R F G F G", "Piano", 1);
        jFugueWrapper.addTrack(ocarina);
        jFugueWrapper.addTrack(piano);
        jFugueWrapper.run();
    }
}
