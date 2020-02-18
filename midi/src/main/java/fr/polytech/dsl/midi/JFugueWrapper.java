package fr.polytech.dsl.midi;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class JFugueWrapper {
    private List<Section> sections;
    private Player player;

    public JFugueWrapper() {
        this.player = new Player();
        this.sections = new ArrayList<>();
    }

    public void run() {
        List<Pattern> collect = sections.stream().map(Section::generatePattern).collect(Collectors.toList());
        Pattern[] objects = new Pattern[collect.size()];
        objects = collect.toArray(objects);
        player.play(objects);
    }

    public void addSection(Section section) {
        sections.add(section);
    }
}
