/**
 */
package fr.polytech.dsl.model.rhythm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Duration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getDuration()
 * @model
 * @generated
 */
public enum Duration implements Enumerator {
	/**
	 * The '<em><b>WHOLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	WHOLE(0, "WHOLE", "WHOLE"),

	/**
	 * The '<em><b>HALF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_VALUE
	 * @generated
	 * @ordered
	 */
	HALF(1, "HALF", "HALF"),

	/**
	 * The '<em><b>QUARTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUARTER_VALUE
	 * @generated
	 * @ordered
	 */
	QUARTER(2, "QUARTER", "QUARTER"),

	/**
	 * The '<em><b>EIGHTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHTH_VALUE
	 * @generated
	 * @ordered
	 */
	EIGHTH(3, "EIGHTH", "EIGHTH"),

	/**
	 * The '<em><b>SIXTEENTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIXTEENTH_VALUE
	 * @generated
	 * @ordered
	 */
	SIXTEENTH(4, "SIXTEENTH", "SIXTEENTH"),

	/**
	 * The '<em><b>THIRTY SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRTY_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	THIRTY_SECOND(5, "THIRTY_SECOND", "THIRTY_SECOND");

	/**
	 * The '<em><b>WHOLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHOLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHOLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHOLE_VALUE = 0;

	/**
	 * The '<em><b>HALF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALF_VALUE = 1;

	/**
	 * The '<em><b>QUARTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUARTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUARTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUARTER_VALUE = 2;

	/**
	 * The '<em><b>EIGHTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EIGHTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EIGHTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EIGHTH_VALUE = 3;

	/**
	 * The '<em><b>SIXTEENTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIXTEENTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIXTEENTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIXTEENTH_VALUE = 4;

	/**
	 * The '<em><b>THIRTY SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THIRTY SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THIRTY_SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THIRTY_SECOND_VALUE = 5;

	/**
	 * An array of all the '<em><b>Duration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Duration[] VALUES_ARRAY = new Duration[] { WHOLE, HALF, QUARTER, EIGHTH, SIXTEENTH,
			THIRTY_SECOND, };

	/**
	 * A public read-only list of all the '<em><b>Duration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Duration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Duration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Duration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Duration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Duration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Duration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Duration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Duration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Duration get(int value) {
		switch (value) {
		case WHOLE_VALUE:
			return WHOLE;
		case HALF_VALUE:
			return HALF;
		case QUARTER_VALUE:
			return QUARTER;
		case EIGHTH_VALUE:
			return EIGHTH;
		case SIXTEENTH_VALUE:
			return SIXTEENTH;
		case THIRTY_SECOND_VALUE:
			return THIRTY_SECOND;
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
	private Duration(int value, String name, String literal) {
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

} //Duration
