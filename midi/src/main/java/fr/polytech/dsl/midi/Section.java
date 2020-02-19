package fr.polytech.dsl.midi;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;

public class Section {
    private int tempo;
    private int nbrNote;

    public Section(int tempo, int nbrNote) {
        this.tempo = tempo;
        this.nbrNote = nbrNote;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getNbrNote() {
        return nbrNote;
    }

    public void setNbrNote(int nbrNote) {
        this.nbrNote = nbrNote;
    }


}
