/**
 */
package fr.polytech.dsl.model.rhythm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piano</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.Piano#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.Piano#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getPiano()
 * @model
 * @generated
 */
public interface Piano extends Instrument {

	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' attribute.
	 * The default value is <code>"PIANO"</code>.
	 * The literals are from the enumeration {@link fr.polytech.dsl.model.rhythm.Instruments}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instrument</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrument</em>' attribute.
	 * @see fr.polytech.dsl.model.rhythm.Instruments
	 * @see #setInstrument(Instruments)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getPiano_Instrument()
	 * @model default="PIANO"
	 * @generated
	 */
	Instruments getInstrument();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.Piano#getInstrument <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument</em>' attribute.
	 * @see fr.polytech.dsl.model.rhythm.Instruments
	 * @see #getInstrument()
	 * @generated
	 */
	void setInstrument(Instruments value);

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(String)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getPiano_Other()
	 * @model
	 * @generated
	 */
	String getOther();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.Piano#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(String value);
} // Piano
