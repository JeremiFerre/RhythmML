/**
 */
package fr.polytech.dsl.model.rhythm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.Pattern#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getPattern()
 * @model abstract="true"
 * @generated
 */
public interface Pattern extends Note {
	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(CompositeNote)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getPattern_Notes()
	 * @model containment="true"
	 * @generated
	 */
	CompositeNote getNotes();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.Pattern#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(CompositeNote value);

} // Pattern
