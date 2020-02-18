package fr.polytech.dsl;

import fr.polytech.dsl.midi.JFugueWrapper;
import fr.polytech.dsl.midi.Section;
import fr.polytech.dsl.midi.SectionBuilder;
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
        Section section =  new SectionBuilder()
                .setBar(4)
                .setSignature(4)
                .setTempo(120)
                .setInstrument("Ocarina")
                .setVoice(0) //TRACK
                .setMusic("A B C D")
                .build();
        jFugueWrapper.addSection(section);
        jFugueWrapper.run();
    }
}
