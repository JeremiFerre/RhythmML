package fr.polytech.dsl.midi;

import fr.polytech.dsl.midi.instrument.DrumElement;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        while (true){
            if(sequencer.getTickPosition()==sequencer.getTickLength()){
                Thread.sleep(500);
                break;
            }
    }
        System.out.println("stop sleeping");
        sequencer.stop();
        sequencer.close();
    }

    public void addElementToTrack(final String name, DrumElement drumElement, int pos, int velocity){
        Optional<TrackMidi> trackMidi = this.trackMidis.stream().filter(v -> v.getName().equals(name)).findFirst();
        // if trackmidi doesn't exist, create it
        if(!trackMidi.isPresent()){
            trackMidi = Optional.of(new TrackMidi(name, this.sequence));
            trackMidis.add(trackMidi.get());
        }
        trackMidi.get().addDrumHit(drumElement, pos, velocity);
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
