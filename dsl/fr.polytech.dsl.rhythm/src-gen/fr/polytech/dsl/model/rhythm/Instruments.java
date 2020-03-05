/**
 */
package fr.polytech.dsl.model.rhythm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instruments</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getInstruments()
 * @model
 * @generated
 */
public enum Instruments implements Enumerator {
	/**
	 * The '<em><b>PIANO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIANO_VALUE
	 * @generated
	 * @ordered
	 */
	PIANO(0, "PIANO", "PIANO"),

	/**
	 * The '<em><b>GUITAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUITAR_VALUE
	 * @generated
	 * @ordered
	 */
	GUITAR(1, "GUITAR", "GUITAR"),

	/**
	 * The '<em><b>HARPSICHORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARPSICHORD_VALUE
	 * @generated
	 * @ordered
	 */
	HARPSICHORD(2, "HARPSICHORD", "HARPSICHORD"),

	/**
	 * The '<em><b>CLAVINET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAVINET_VALUE
	 * @generated
	 * @ordered
	 */
	CLAVINET(3, "CLAVINET", "CLAVINET"),

	/**
	 * The '<em><b>VIOLIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIOLIN_VALUE
	 * @generated
	 * @ordered
	 */
	VIOLIN(4, "VIOLIN", "VIOLIN"),

	/**
	 * The '<em><b>SYNTH BASS 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNTH_BASS_1_VALUE
	 * @generated
	 * @ordered
	 */
	SYNTH_BASS_1(5, "SYNTH_BASS_1", "SYNTH_BASS_1"),

	/**
	 * The '<em><b>OCARINA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCARINA_VALUE
	 * @generated
	 * @ordered
	 */
	OCARINA(6, "OCARINA", "OCARINA"),

	/**
	 * The '<em><b>ACOUSTIC BASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACOUSTIC_BASS_VALUE
	 * @generated
	 * @ordered
	 */
	ACOUSTIC_BASS(7, "ACOUSTIC_BASS", "ACOUSTIC_BASS"),

	/**
	 * The '<em><b>CHURCH ORGAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHURCH_ORGAN_VALUE
	 * @generated
	 * @ordered
	 */
	CHURCH_ORGAN(8, "CHURCH_ORGAN", "CHURCH_ORGAN"),

	/**
	 * The '<em><b>MUSIC BOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUSIC_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	MUSIC_BOX(9, "MUSIC_BOX", "MUSIC_BOX");

	/**
	 * The '<em><b>PIANO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIANO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIANO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIANO_VALUE = 0;

	/**
	 * The '<em><b>GUITAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GUITAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUITAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GUITAR_VALUE = 1;

	/**
	 * The '<em><b>HARPSICHORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HARPSICHORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARPSICHORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HARPSICHORD_VALUE = 2;

	/**
	 * The '<em><b>CLAVINET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLAVINET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLAVINET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLAVINET_VALUE = 3;

	/**
	 * The '<em><b>VIOLIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIOLIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIOLIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIOLIN_VALUE = 4;

	/**
	 * The '<em><b>SYNTH BASS 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYNTH BASS 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNTH_BASS_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYNTH_BASS_1_VALUE = 5;

	/**
	 * The '<em><b>OCARINA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCARINA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCARINA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCARINA_VALUE = 6;

	/**
	 * The '<em><b>ACOUSTIC BASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACOUSTIC BASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACOUSTIC_BASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACOUSTIC_BASS_VALUE = 7;

	/**
	 * The '<em><b>CHURCH ORGAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHURCH ORGAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHURCH_ORGAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHURCH_ORGAN_VALUE = 8;

	/**
	 * The '<em><b>MUSIC BOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MUSIC BOX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUSIC_BOX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MUSIC_BOX_VALUE = 9;

	/**
	 * An array of all the '<em><b>Instruments</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Instruments[] VALUES_ARRAY = new Instruments[] { PIANO, GUITAR, HARPSICHORD, CLAVINET, VIOLIN,
			SYNTH_BASS_1, OCARINA, ACOUSTIC_BASS, CHURCH_ORGAN, MUSIC_BOX, };

	/**
	 * A public read-only list of all the '<em><b>Instruments</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Instruments> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instruments</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Instruments get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Instruments result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instruments</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Instruments getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Instruments result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instruments</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Instruments get(int value) {
		switch (value) {
		case PIANO_VALUE:
			return PIANO;
		case GUITAR_VALUE:
			return GUITAR;
		case HARPSICHORD_VALUE:
			return HARPSICHORD;
		case CLAVINET_VALUE:
			return CLAVINET;
		case VIOLIN_VALUE:
			return VIOLIN;
		case SYNTH_BASS_1_VALUE:
			return SYNTH_BASS_1;
		case OCARINA_VALUE:
			return OCARINA;
		case ACOUSTIC_BASS_VALUE:
			return ACOUSTIC_BASS;
		case CHURCH_ORGAN_VALUE:
			return CHURCH_ORGAN;
		case MUSIC_BOX_VALUE:
			return MUSIC_BOX;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Instruments(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Instruments
