package fr.polytech.dsl;

import fr.polytech.dsl.midi.JFugueWrapper;
import fr.polytech.dsl.midi.Section;
import fr.polytech.dsl.old.Music;
import fr.polytech.dsl.old.instrument.DrumElement;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        JFugueWrapper jFugueWrapper = new JFugueWrapper();
        Section section =  Section.builder()
                .bar(4)
                .signature(4)
                .tempo(120)
                .instrument("Ocarina")
                .voice(0) //TRACK
                .music("A B C D")
                .build();
        jFugueWrapper.addSection(section);
        jFugueWrapper.run();
    }
}
