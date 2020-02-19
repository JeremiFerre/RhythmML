package fr.polytech.dsl.midi;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;
import org.jfugue.theory.Note;

import java.util.List;

public class PatternProducerDSL implements PatternProducer {
    private Section section;
    private Track track;


    public Section getSection() {

        return section;
    }

    public Track getTrack() {
        return track;
    }

    public PatternProducerDSL(Section section, Track track) {
        this.section = section;
        this.track = track;
    }

    @Override
    public Pattern getPattern() {

        Pattern pattern = new Pattern();
        for (int i = 0; i < section.getNbrNote(); i++) {
            Note note = track.getNotes().remove(0);
            pattern.add(note);
        }
        pattern.setTempo(section.getTempo()).setVoice(track.getVoice());
        if (!track.getInstrument().equals("Battery")) {
        	pattern.setInstrument(track.getInstrument());
        }
        return pattern;
    }
}
