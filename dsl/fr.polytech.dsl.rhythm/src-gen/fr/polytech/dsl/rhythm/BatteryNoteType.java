/**
 */
package fr.polytech.dsl.rhythm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Battery Note Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.polytech.dsl.rhythm.RhythmPackage#getBatteryNoteType()
 * @model
 * @generated
 */
public enum BatteryNoteType implements Enumerator {
	/**
	 * The '<em><b>SNARE DRUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNARE_DRUM_VALUE
	 * @generated
	 * @ordered
	 */
	SNARE_DRUM(0, "SNARE_DRUM", "SNARE_DRUM"),

	/**
	 * The '<em><b>BASS DRUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASS_DRUM_VALUE
	 * @generated
	 * @ordered
	 */
	BASS_DRUM(1, "BASS_DRUM", "BASS_DRUM"),

	/**
	 * The '<em><b>CLOSED HIHAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_HIHAT_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_HIHAT(2, "CLOSED_HIHAT", "CLOSED_HIHAT"),

	/**
	 * The '<em><b>OPENED HIHAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENED_HIHAT_VALUE
	 * @generated
	 * @ordered
	 */
	OPENED_HIHAT(3, "OPENED_HIHAT", "OPENED_HIHAT"),

	/**
	 * The '<em><b>CRASH CYMBAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRASH_CYMBAL_VALUE
	 * @generated
	 * @ordered
	 */
	CRASH_CYMBAL(4, "CRASH_CYMBAL", "CRASH_CYMBAL"),

	/**
	 * The '<em><b>RIDE CYMBAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIDE_CYMBAL_VALUE
	 * @generated
	 * @ordered
	 */
	RIDE_CYMBAL(5, "RIDE_CYMBAL", "RIDE_CYMBAL");

	/**
	 * The '<em><b>SNARE DRUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SNARE DRUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SNARE_DRUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SNARE_DRUM_VALUE = 0;

	/**
	 * The '<em><b>BASS DRUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BASS DRUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASS_DRUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASS_DRUM_VALUE = 1;

	/**
	 * The '<em><b>CLOSED HIHAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOSED HIHAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSED_HIHAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_HIHAT_VALUE = 2;

	/**
	 * The '<em><b>OPENED HIHAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPENED HIHAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPENED_HIHAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENED_HIHAT_VALUE = 3;

	/**
	 * The '<em><b>CRASH CYMBAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CRASH CYMBAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRASH_CYMBAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRASH_CYMBAL_VALUE = 4;

	/**
	 * The '<em><b>RIDE CYMBAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIDE CYMBAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIDE_CYMBAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIDE_CYMBAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Battery Note Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BatteryNoteType[] VALUES_ARRAY = new BatteryNoteType[] { SNARE_DRUM, BASS_DRUM, CLOSED_HIHAT,
			OPENED_HIHAT, CRASH_CYMBAL, RIDE_CYMBAL, };

	/**
	 * A public read-only list of all the '<em><b>Battery Note Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BatteryNoteType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Battery Note Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BatteryNoteType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BatteryNoteType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Battery Note Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BatteryNoteType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BatteryNoteType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Battery Note Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BatteryNoteType get(int value) {
		switch (value) {
		case SNARE_DRUM_VALUE:
			return SNARE_DRUM;
		case BASS_DRUM_VALUE:
			return BASS_DRUM;
		case CLOSED_HIHAT_VALUE:
			return CLOSED_HIHAT;
		case OPENED_HIHAT_VALUE:
			return OPENED_HIHAT;
		case CRASH_CYMBAL_VALUE:
			return CRASH_CYMBAL;
		case RIDE_CYMBAL_VALUE:
			return RIDE_CYMBAL;
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
	private BatteryNoteType(int value, String name, String literal) {
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

} //BatteryNoteType
