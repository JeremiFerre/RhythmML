package fr.polytech.dsl.midi;

import fr.polytech.dsl.midi.instrument.DrumElement;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

public class SectionMidi {
    private Sequence sequence;
    private Sequencer sequencer;
    private int tempo;
    private int nbBar;
    private int nbBeatPerBar;
    private String name;
    private List<TrackMidi> trackMidis;

    public SectionMidi(final String name,int tempo, int nbBar, int nbBeatPerBar) throws MidiUnavailableException, InvalidMidiDataException {
        this.name = name;
        this.tempo = tempo;
        this.nbBar = nbBar;
        this.nbBeatPerBar = nbBeatPerBar;
        this.sequence = new Sequence(Sequence.PPQ, 200);
        this.sequencer = MidiSystem.getSequencer();
        this.trackMidis = new ArrayList<>();
    }


    public void run() throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
        sequencer.open();
        sequencer.setSequence(sequence);
        sequencer.setTempoInBPM(tempo);
        sequencer.start();
        int durationOfTheTrackMS = nbBar * nbBeatPerBar * 60000 / tempo;
        System.out.println("sleeping " + (durationOfTheTrackMS) + "ms");
        Thread.sleep(durationOfTheTrackMS);
        System.out.println("stop sleeping");
        sequencer.stop();
        sequencer.close();
    }

    public void addElementToTrack(final String name, DrumElement drumElement, int pos, int velocity){
        TrackMidi trackMidi = new TrackMidi(name, this.sequence);
        trackMidi.addDrumHit(drumElement, pos, velocity);
        trackMidis.add(trackMidi);
    }
    public Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public Sequencer getSequencer() {
        return sequencer;
    }

    public void setSequencer(Sequencer sequencer) {
        this.sequencer = sequencer;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getNbBar() {
        return nbBar;
    }

    public void setNbBar(int nbBar) {
        this.nbBar = nbBar;
    }

    public int getNbBeatPerBar() {
        return nbBeatPerBar;
    }

    public void setNbBeatPerBar(int nbBeatPerBar) {
        this.nbBeatPerBar = nbBeatPerBar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
