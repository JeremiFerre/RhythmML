/**
 */
package fr.polytech.dsl.rhythm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piano</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.rhythm.Piano#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.rhythm.RhythmPackage#getPiano()
 * @model
 * @generated
 */
public interface Piano extends Instrument {
	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute list.
	 * The list contents are of type {@link fr.polytech.dsl.rhythm.PianoNote}.
	 * The literals are from the enumeration {@link fr.polytech.dsl.rhythm.PianoNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute list.
	 * @see fr.polytech.dsl.rhythm.PianoNote
	 * @see fr.polytech.dsl.rhythm.RhythmPackage#getPiano_Notes()
	 * @model required="true"
	 * @generated
	 */
	EList<PianoNote> getNotes();

} // Piano
