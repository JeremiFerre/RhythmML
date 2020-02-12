package fr.polytech.dsl;

import fr.polytech.dsl.midi.Music;
import fr.polytech.dsl.midi.instrument.DrumElement;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
        Music music =new Music();
        music.createSection("Test",80, 4, 4);
        music.addElements("Test", "Wesh", DrumElement.ClosedHiHat, DrumElement.HandClap, DrumElement.OpenHiHat, DrumElement.HandClap);
        music.addElements("Test", "Wesh2", DrumElement.SideStick, DrumElement.SideStick, DrumElement.SideStick, DrumElement.SideStick);

        music.run();
    }
}
