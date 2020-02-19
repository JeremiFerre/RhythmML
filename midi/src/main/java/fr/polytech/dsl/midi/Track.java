package fr.polytech.dsl.midi;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;
import org.jfugue.theory.Note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Track {
    private List<Note> notes;
    private String instrument;
    private int voice;

    public Track(String notes, String instrument, int voice) {
        this.notes = new ArrayList<>();
        for (String s : notes.split(" ")) {
            this.notes.add(new Note(s));
        }
        this.instrument = instrument;
        this.voice = voice;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public boolean isEmpty(){
        return notes.isEmpty();
    }

    public int getVoice() {
        return voice;
    }
}
