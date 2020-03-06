/**
 */
package fr.polytech.dsl.model.rhythm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Melody Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.MelodyNote#getNoteType <em>Note Type</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.MelodyNote#getOctaveOffset <em>Octave Offset</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.MelodyNote#getOctaveAbsolute <em>Octave Absolute</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getMelodyNote()
 * @model
 * @generated
 */
public interface MelodyNote extends Note {
	/**
	 * Returns the value of the '<em><b>Note Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.polytech.dsl.model.rhythm.MelodyNoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Type</em>' attribute.
	 * @see fr.polytech.dsl.model.rhythm.MelodyNoteType
	 * @see #setNoteType(MelodyNoteType)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getMelodyNote_NoteType()
	 * @model
	 * @generated
	 */
	MelodyNoteType getNoteType();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.MelodyNote#getNoteType <em>Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Type</em>' attribute.
	 * @see fr.polytech.dsl.model.rhythm.MelodyNoteType
	 * @see #getNoteType()
	 * @generated
	 */
	void setNoteType(MelodyNoteType value);

	/**
	 * Returns the value of the '<em><b>Octave Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Octave Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Octave Offset</em>' attribute.
	 * @see #setOctaveOffset(int)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getMelodyNote_OctaveOffset()
	 * @model
	 * @generated
	 */
	int getOctaveOffset();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.MelodyNote#getOctaveOffset <em>Octave Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Octave Offset</em>' attribute.
	 * @see #getOctaveOffset()
	 * @generated
	 */
	void setOctaveOffset(int value);

	/**
	 * Returns the value of the '<em><b>Octave Absolute</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Octave Absolute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Octave Absolute</em>' attribute.
	 * @see #setOctaveAbsolute(int)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getMelodyNote_OctaveAbsolute()
	 * @model default="5"
	 * @generated
	 */
	int getOctaveAbsolute();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.MelodyNote#getOctaveAbsolute <em>Octave Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Octave Absolute</em>' attribute.
	 * @see #getOctaveAbsolute()
	 * @generated
	 */
	void setOctaveAbsolute(int value);

} // MelodyNote
