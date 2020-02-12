package fr.polytech.dsl.rhythm.checker;

import java.util.ArrayList;
import java.util.List;

import fr.polytech.dsl.rhythm.Music;

public class GuardinChecker {

	private final Music music;
	
	public GuardinChecker(Music music) {
		this.music = music;
	}
	
	public int totalBeats() {
		return music.getSections().stream().mapToInt(section -> section.getBars() * section.getSignature()).sum();
	}
	
	public boolean verify() {
		return music.getTracks()
				.stream()
				.allMatch(track -> {
					System.out.println(this.totalBeats());
					System.out.println(track.getInstrument().getNotes().size());
					return track.getInstrument().getNotes().size() == this.totalBeats();
				});
	}
}
