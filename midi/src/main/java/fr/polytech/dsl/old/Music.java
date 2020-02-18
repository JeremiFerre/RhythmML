package fr.polytech.dsl.old;

import fr.polytech.dsl.old.exception.BadNumberOfBeatException;
import fr.polytech.dsl.old.exception.SectionDoesntExistException;
import fr.polytech.dsl.old.instrument.DrumElement;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import java.util.ArrayList;
import java.util.List;

import static fr.polytech.dsl.DrumerUtils.toTick;

public class Music {
    private List<SectionMidi> sectionMidis;
    private Sequence sequence;


    public Music() throws MidiUnavailableException {
        this.sectionMidis = new ArrayList<>();
    }

    public SectionMidi createSection(String name, int tempo, int nbBar, int nbBeatPerBar) throws InvalidMidiDataException, MidiUnavailableException {
        SectionMidi sectionMidi = new SectionMidi(name, tempo, nbBar, nbBeatPerBar);
        sectionMidis.add(sectionMidi);
        return sectionMidi;
    }

    public void addElements(String section, String track, DrumElement... drumElements) {
        SectionMidi sectionMidi = sectionMidis.stream().filter(v -> v.getName().equals(section)).findFirst().orElseThrow(SectionDoesntExistException::new);
        if(drumElements.length != sectionMidi.getNbBeatPerBar())
            throw new BadNumberOfBeatException("Nombre d'élement : "+drumElements.length + "\n Nombre de beat par mesure "+sectionMidi.getNbBeatPerBar());
        for (int bar = 0; bar < sectionMidi.getNbBar(); bar++) {
            for (int beat = 0; beat < drumElements.length; beat++) {
                int pos = toTick(bar, beat, 0, sectionMidi.getNbBeatPerBar(), 200);
                sectionMidi.addElementToTrack(track, drumElements[beat], pos, 90);
            }

        }
    }


    public void run() throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
        for (SectionMidi sectionMidi : sectionMidis) {
            sectionMidi.run();
        }
    }
}
