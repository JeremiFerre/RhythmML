package fr.polytech.dsl.old;

import fr.polytech.dsl.midi.DrumElement;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

/**
 * Hello world!
 *
 */
public class AppOld
{
    public static void main( String[] args ) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
        Music music =new Music();
        music.createSection("Test",80, 8, 4);
        music.addElements("Test", "Wesh", DrumElement.ElectricSnare, DrumElement.HandClap, DrumElement.OpenHiHat, DrumElement.HandClap);
        music.addElements("Test", "Wesh2", DrumElement.SideStick, DrumElement.SideStick, DrumElement.SideStick, DrumElement.SideStick);

        music.run();
    }
}
