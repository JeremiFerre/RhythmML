package fr.polytech.dsl.midi;

import org.jfugue.pattern.Pattern;

public class Section {
    private int tempo;
    private int bar;
    private int signature;
    private int voice;
    private String instrument;
    private String music;

    public Pattern generatePattern(){
        return new Pattern(music).setTempo(tempo).setInstrument(instrument).repeat(bar).setVoice(voice);
    }

    public Section(int tempo, int bar, int signature, int voice, String instrument, String music) {
        this.tempo = tempo;
        this.bar = bar;
        this.signature = signature;
        this.voice = voice;
        this.instrument = instrument;
        this.music = music;
    }

}
