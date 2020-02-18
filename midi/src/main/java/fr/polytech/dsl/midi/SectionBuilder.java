package fr.polytech.dsl.midi;

public class SectionBuilder {
    private int tempo;
    private int bar;
    private int signature;
    private int voice;
    private String instrument;
    private String music;

    public SectionBuilder setTempo(int tempo) {
        this.tempo = tempo;
        return this;
    }

    public SectionBuilder setBar(int bar) {
        this.bar = bar;
        return this;
    }

    public SectionBuilder setSignature(int signature) {
        this.signature = signature;
        return this;
    }

    public SectionBuilder setVoice(int voice) {
        this.voice = voice;
        return this;
    }

    public SectionBuilder setInstrument(String instrument) {
        this.instrument = instrument;
        return this;
    }

    public SectionBuilder setMusic(String music) {
        this.music = music;
        return this;
    }

    public Section build() {
        return new Section(tempo, bar, signature, voice, instrument, music);
    }
}