/**
 */
package fr.polytech.dsl.model.rhythm;

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
 *   <li>{@link fr.polytech.dsl.model.rhythm.Music#getTracks <em>Tracks</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.Music#getSections <em>Sections</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.Music#getSoundBankPath <em>Sound Bank Path</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getMusic()
 * @model
 * @generated
 */
public interface Music extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.polytech.dsl.model.rhythm.Track}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' containment reference list.
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getMusic_Tracks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Track> getTracks();

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link fr.polytech.dsl.model.rhythm.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getMusic_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Sound Bank Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound Bank Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Bank Path</em>' attribute.
	 * @see #setSoundBankPath(String)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getMusic_SoundBankPath()
	 * @model
	 * @generated
	 */
	String getSoundBankPath();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.Music#getSoundBankPath <em>Sound Bank Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Bank Path</em>' attribute.
	 * @see #getSoundBankPath()
	 * @generated
	 */
	void setSoundBankPath(String value);

} // Music
