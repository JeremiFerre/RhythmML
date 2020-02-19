/**
 */
package fr.polytech.dsl.model.rhythm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.CompositeNote#getNotes <em>Notes</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.CompositeNote#getRepeats <em>Repeats</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getCompositeNote()
 * @model
 * @generated
 */
public interface CompositeNote extends Note {
	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.polytech.dsl.model.rhythm.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getCompositeNote_Notes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNotes();

	/**
	 * Returns the value of the '<em><b>Repeats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeats</em>' attribute.
	 * @see #setRepeats(int)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getCompositeNote_Repeats()
	 * @model
	 * @generated
	 */
	int getRepeats();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.CompositeNote#getRepeats <em>Repeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeats</em>' attribute.
	 * @see #getRepeats()
	 * @generated
	 */
	void setRepeats(int value);

} // CompositeNote
