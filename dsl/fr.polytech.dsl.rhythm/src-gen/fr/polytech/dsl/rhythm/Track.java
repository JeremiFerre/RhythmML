/**
 */
package fr.polytech.dsl.rhythm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.rhythm.Track#getInstrument <em>Instrument</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.rhythm.RhythmPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instrument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrument</em>' containment reference.
	 * @see #setInstrument(Instrument)
	 * @see fr.polytech.dsl.rhythm.RhythmPackage#getTrack_Instrument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Instrument getInstrument();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.rhythm.Track#getInstrument <em>Instrument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument</em>' containment reference.
	 * @see #getInstrument()
	 * @generated
	 */
	void setInstrument(Instrument value);

} // Track
