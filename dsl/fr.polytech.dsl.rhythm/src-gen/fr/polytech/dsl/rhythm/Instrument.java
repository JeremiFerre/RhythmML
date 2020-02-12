/**
 */
package fr.polytech.dsl.rhythm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instrument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.rhythm.Instrument#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.rhythm.RhythmPackage#getInstrument()
 * @model abstract="true"
 * @generated
 */
public interface Instrument extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.polytech.dsl.rhythm.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see fr.polytech.dsl.rhythm.RhythmPackage#getInstrument_Notes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNotes();

} // Instrument
