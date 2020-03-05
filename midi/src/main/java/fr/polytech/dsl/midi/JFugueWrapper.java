package fr.polytech.dsl.midi;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.player.SequencerManager;
import org.jfugue.player.SynthesizerManager;

import javax.sound.midi.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JFugueWrapper {
    private List<Section> sections;
    private List<Track> tracks;
    private Player player;
    private Sequencer sequencer;
    private Synthesizer synthesizer;
    private String basePathLib;

    public JFugueWrapper() {
        player = new Player();
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

    /**
     * load a new soundBank
     *
     * @param soundBankPath
     * @throws FileNotFoundException
     * @throws InvalidMidiDataException
     * @throws IOException
     * @throws MidiUnavailableException
     */
    public void loadSoundbank(String soundBankPath)
            throws FileNotFoundException, InvalidMidiDataException, IOException, MidiUnavailableException {
        FileInputStream fis = new FileInputStream(new File(soundBankPath));
        BufferedInputStream bis = new BufferedInputStream(fis);
        Soundbank soundfont = MidiSystem.getSoundbank(bis);
        synthesizer.loadAllInstruments(soundfont);
        sequencer.getTransmitter().setReceiver(synthesizer.getReceiver());

    }

    public void setBasePathLib(String basePathLib) throws IOException, MidiUnavailableException, InvalidMidiDataException {
        this.basePathLib = basePathLib;


        player = new Player();
        this.synthesizer = SynthesizerManager.getInstance().getSynthesizer();
        this.sequencer = SequencerManager.getInstance().getSequencer();
        synthesizer.open();
        List<String> allSf2Files;
        try (Stream<Path> paths = Files.walk(Paths.get(basePathLib))) {
            allSf2Files = paths
                    .filter(Files::isRegularFile).filter(v -> v.toString().endsWith("sf2")).map(v -> v.toString()).collect(Collectors.toList());
        }
        for (String file : allSf2Files) {
            loadSoundbank(file);
        }
    }
}
