CustomSoundBank basePath="/Users/jeremiferre/Documents/Personnel/SI5/S9-2/DSL/RhythmML/RhythmML/midi/soundBank"
Music BillieJean:
	sections:
		section1:
			tempo=200
			signature=8
			bars=8
		section2:
			tempo=200
			signature=8
			bars=8
	tracks:
		- battery:
			debut_section section1
				layer: (bd $ sd $) x 16
				layer: (ch) x 64
			fin_section
			debut_section section2
				layer: (bd $ sd $) x 16
				layer: (ch) x 64
			fin_section
		- piano:
			layer: ($ $ $ $) x 4 (A E G A G E D E) x 14
		- piano:
			layer: ($) x 32 (A/-1 $ $ B/-1 $ $ $ $ C $ $ B/-1 $ $ $ $) x 6
		- piano:
			layer: ($) x 64 ($ E/1 E/1 E/1 E/1 D/1 C/1 D/1 C/1 E/1 $ C/1 D/1 C/1 E/1 $
							$ E/1 E/1 E/1 E/1 D/1 C/1 D/1 C/1 E/1 E/1 D/1 D/1 C/1 B A) x 2