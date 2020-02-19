/**
 */
package fr.polytech.dsl.model.rhythm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piano Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.PianoNote#getNoteType <em>Note Type</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getPianoNote()
 * @model
 * @generated
 */
public interface PianoNote extends Note {
	/**
	 * Returns the value of the '<em><b>Note Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.polytech.dsl.model.rhythm.PianoNoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Type</em>' attribute.
	 * @see fr.polytech.dsl.model.rhythm.PianoNoteType
	 * @see #setNoteType(PianoNoteType)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getPianoNote_NoteType()
	 * @model
	 * @generated
	 */
	PianoNoteType getNoteType();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.PianoNote#getNoteType <em>Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Type</em>' attribute.
	 * @see fr.polytech.dsl.model.rhythm.PianoNoteType
	 * @see #getNoteType()
	 * @generated
	 */
	void setNoteType(PianoNoteType value);

} // PianoNote
