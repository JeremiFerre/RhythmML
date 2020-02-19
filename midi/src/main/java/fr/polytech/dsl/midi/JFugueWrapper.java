package fr.polytech.dsl.midi;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import java.util.ArrayList;
import java.util.List;

public class JFugueWrapper {
    private List<Section> sections;
    private List<Track> tracks;
    private Player player;

    public JFugueWrapper() {
        this.player = new Player();
        this.sections = new ArrayList<>();
        this.tracks = new ArrayList<>();
    }

    public void run() {

        List<Pattern> collect = new ArrayList<>();
        for (Section section : sections) {
            for (Track track : tracks) {
                collect.add(new PatternProducerDSL(section, track).getPattern());
            }
        }
        Pattern[] objects = new Pattern[collect.size()];
        objects = collect.toArray(objects);
        player.play(objects);
    }

    public void addTrack(Track track) {
        this.tracks.add(track);
    }

    public void addSection(Section section) {
        sections.add(section);
    }
}
