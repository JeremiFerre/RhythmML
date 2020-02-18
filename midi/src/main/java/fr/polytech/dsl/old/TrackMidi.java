package fr.polytech.dsl.old;

import fr.polytech.dsl.old.instrument.DrumElement;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.Sequence;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class TrackMidi {
    private Track track;
    private String name;

    public TrackMidi(final String name, Sequence sequence) {
        this.track = sequence.createTrack();
        this.name = name;
    }

    /**
     * create a MIDI message in the current Track
     * @param track
     * @param type
     * @param chan
     * @param de
     * @param tick
     * @param velocity
     */
    public void createEvent(int type, int chan, DrumElement de, long tick, int velocity) {
        ShortMessage message = new ShortMessage();

        try {
            message.setMessage(type, chan, de.noteNumber, velocity);
            MidiEvent event = new MidiEvent(message, tick);
            track.add(event);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    /**
     * add a note on a drum element at a specific beat(tick)
     *
     * @param note the {@link DrumElement} id
     * @param tick the beat where the kick appends
     */
    public void addDrumHit(DrumElement de, long tick, int velocity) {
        final int NOTEON = 144;
        final int NOTEOFF = 128;

        this.createEvent(NOTEON, 9, de, tick, velocity);
        this.createEvent(NOTEOFF, 9, de, tick + 1, velocity);
    }

    public String getName() {
        return name;
    }
}
