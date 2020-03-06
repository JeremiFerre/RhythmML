CustomSoundBank basePath="/Users/jeremiferre/Documents/Personnel/SI5/S9-2/DSL/RhythmML/RhythmML/midi/soundBank"
Music BillieJean:
	sections:
		section1:
			tempo=100
			signature=8
			bars=8
		section2:
			tempo=100
			signature=8
			bars=8
		final:
			tempo=100
			signature=8
			bars=2
	tracks:
		- battery:
			begin_section section1
				layer: (bd $ sd $) x 16
				layer: (ch) x 64
			end_section
			begin_section section2
				layer: (bd $ sd $) x 16
				layer: (ch) x 64
			end_section
			begin_section final
				layer: (bd $ sd $) x 4
				layer: (ch) x 16
			end_section
		- ACOUSTIC_BASS:
			layer: ($ $ $ $) x 4 (A/-3 E/-3 G/-3 A/-3 G/-3 E/-3 D/-3 E/-3) x 16
		- PIANO:
			layer: ($) x 32 (A|4 $ $ B|4 $ $ $ $	C $ $ B|4 $ $ $ $) x 7
		- CHURCH_ORGAN:
			begin_section section1
				layer: ($) x 64
			end_section
			begin_section section2
				layer: ($ E E E E D C D		C E $ C D C E 	 $
						$ E E E E D C D		C E $ D $ C B/-1 A/-1) x 2
			end_section
			begin_section final
				layer: $ $ A../-1 B../-1 A../-1 $ $ $ A../-1 B../-1 A../-1 $ $ $ A../-1 B../-1 A../-1 $ $ $ A../-3
			end_section
			
			
			
			