/**
 */
package fr.polytech.dsl.model.rhythm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.Layer#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends EObject {
	/**
	 * Returns the value of the '<em><b>Notes</b></em>' reference list.
	 * The list contents are of type {@link fr.polytech.dsl.model.rhythm.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' reference list.
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getLayer_Notes()
	 * @model
	 * @generated
	 */
	EList<Note> getNotes();

} // Layer
