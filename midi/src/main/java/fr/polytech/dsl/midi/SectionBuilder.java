package fr.polytech.dsl.midi;

public class SectionBuilder {
    private int tempo;
    private int nbrNote;
    private int voice;

    public SectionBuilder setTempo(int tempo) {
        this.tempo = tempo;
        return this;
    }


    public SectionBuilder setNbrNote(int nbrNote) {
        this.nbrNote = nbrNote;
        return this;
    }

    public Section build() {
        return new Section(tempo, nbrNote);
    }
}