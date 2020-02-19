/**
 */
package fr.polytech.dsl.model.rhythm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.BatteryNote#getNoteType <em>Note Type</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getBatteryNote()
 * @model
 * @generated
 */
public interface BatteryNote extends Note {
	/**
	 * Returns the value of the '<em><b>Note Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.polytech.dsl.model.rhythm.BatteryNoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Type</em>' attribute.
	 * @see fr.polytech.dsl.model.rhythm.BatteryNoteType
	 * @see #setNoteType(BatteryNoteType)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getBatteryNote_NoteType()
	 * @model
	 * @generated
	 */
	BatteryNoteType getNoteType();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.BatteryNote#getNoteType <em>Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Type</em>' attribute.
	 * @see fr.polytech.dsl.model.rhythm.BatteryNoteType
	 * @see #getNoteType()
	 * @generated
	 */
	void setNoteType(BatteryNoteType value);

} // BatteryNote
