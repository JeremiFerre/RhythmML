package fr.polytech.dsl.midi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jfugue.pattern.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

}
