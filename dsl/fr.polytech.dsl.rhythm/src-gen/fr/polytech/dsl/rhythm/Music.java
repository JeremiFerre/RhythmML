/**
 */
package fr.polytech.dsl.rhythm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Music</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.rhythm.Music#getTrack <em>Track</em>}</li>
 *   <li>{@link fr.polytech.dsl.rhythm.Music#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.rhythm.RhythmPackage#getMusic()
 * @model
 * @generated
 */
public interface Music extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Track</b></em>' containment reference list.
	 * The list contents are of type {@link fr.polytech.dsl.rhythm.Track}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track</em>' containment reference list.
	 * @see fr.polytech.dsl.rhythm.RhythmPackage#getMusic_Track()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Track> getTrack();

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link fr.polytech.dsl.rhythm.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see fr.polytech.dsl.rhythm.RhythmPackage#getMusic_Section()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSection();

} // Music
