CustomSoundBank basePath='/Users/alexisgardin/Documents/COURS/SI5/DSL/RhythmML/midi/soundBank'
Music JohnnyBeGood:
	sections:
		intro:
			tempo=170
			signature=4
			bars=4
		pause:
			tempo=170
			signature=4
			bars=1
		main:
			tempo=170
			signature=8
			bars=8
	tracks:
		- battery:
			begin_section intro
				layer: ($ $ $ $) x 4
				layer: ($ $ $ $) x 4
				layer: ($ $ $ $) x 4
			end_section
			begin_section pause
				layer: $ $ $ $
				layer: $ $ $ $
				layer: $ $ $ $
			end_section
			begin_section main
				layer: (rc rc rc rc) x 16
				layer: (bd $  $  $) x 16
				layer: ($  $  sd $) x 16
			end_section
		- GUITAR:
			begin_section intro
				layer: E G A C    C C C C    C C B A    G D E C
			end_section
			begin_section pause
				layer: $ $ $ $
			end_section
			begin_section main
				layer: (C C D D C C D D) x 2 (A A B B A A B B) x 2 (E E G G E E G G) x 2 (G G A A G G A A) x 2
			end_section