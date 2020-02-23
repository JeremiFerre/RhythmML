package fr.polytech.dsl.midi;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;
import org.jfugue.theory.Note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Track {
    private List<Note> notes;
    private List<String> notesStrings = new ArrayList<>();
    
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

    public Track(DrumElement ... de) {
        this.notes = new ArrayList<>();
        for (DrumElement d : de) {
            if(d.getNoteNumber()==-1){
                // SILENCE
                this.notes.add(new Note(d.getNote()));
            } else {
                this.notes.add(new Note(d.getNoteNumber()));
            }
        }
        this.instrument = "Battery";
        this.voice = 9;
    }
    
    public Track(List<DrumElement> ... deLists) {
        this.notes = new ArrayList<>();
        for (List<DrumElement> de : deLists) {
        	String str = "";
	        for (DrumElement d : de) {
	            if(d.getNoteNumber()==-1){
	                // SILENCE
	            	str += d.getNote();
	            } else {
	            	str += "[" + d.getNote() + "]";
	            }
	            str += "+";
	        }
	        str = str.substring(0, str.length() - 1);
	        this.notesStrings.add(str);
        }
        this.instrument = "Battery";
        this.voice = 9;
    }

    public List<String> getNotesStrings() {
        return notesStrings;
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
