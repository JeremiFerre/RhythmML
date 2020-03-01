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
			layer: batteryFL
			layer: (ch) x 128
		- piano:
			layer: pianosilence (A E G A G E D E) x 14
		- piano:
			layer: (pianosilence) x 2 (A/-1 $ $ B/-1 $ $ $ $ C $ $ B/-1 $ $ $ $) x 6
		- piano:
			layer: (pianosilence) x 4 ($ quadrupleE D/1 C/1 D/1 C/1 E/1 $ C/1 D/1 C/1 E/1 $
							$ quadrupleE D/1 C/1 D/1 C/1 E/1 E/1 D/1 D/1 C/1 B A) x 2
	patterns:
		- piano :
			- pianosilence: ($) x 16
			- quadrupleE: (E/1) x 4
		- battery :
			- batteryFL: (bd $ sd $) x 32

			
		