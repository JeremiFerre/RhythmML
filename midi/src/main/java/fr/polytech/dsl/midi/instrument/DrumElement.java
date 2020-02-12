package fr.polytech.dsl.midi.instrument;

/**
	 * Partial list of Drum elements to ease the reading
	 */
	public enum DrumElement {
		AcousticBassDrum(35), BassDrum1(36), SideStick(37), AcousticSnare(38), HandClap(39), ElectricSnare(40),
		LowFloorTom(41), ClosedHiHat(42), OpenHiHat(46);

		/*
		 * "High floor tom", "Pedal hi-hat", "Low tom", "Open hi-hat", "Low-mid tom",
		 * "Hi-mid tom", "Crash cymbal 1", "High tom", "Ride cymbal 1",
		 * "Chinese cymbal", "Ride bell", "Tambourine", "Splash cymbal", "Cowbell",
		 * "Crash cymbal 2", "Vibraslap", "Ride cymbal 2", "Hi bongo", "Low bongo",
		 * "Mute hi conga", "Open hi conga", "Low conga", "High timbale", "Low timbale",
		 * "High agogo", "Low agogo", "Cabasa", "Maracas", "Short whistle",
		 * "Long whistle", "Short guiro", "Long guiro", "Claves", "Hi wood block",
		 * "Low wood block", "Mute cuica", "Open cuica", "Mute triangle",
		 * "Open triangle" };
		 */
		public int noteNumber;

		private DrumElement(int noteNumber) {
			this.noteNumber = noteNumber;
		}
	}