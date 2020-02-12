/**
 */
package fr.polytech.dsl.rhythm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.rhythm.Section#getTempo <em>Tempo</em>}</li>
 *   <li>{@link fr.polytech.dsl.rhythm.Section#getSignature <em>Signature</em>}</li>
 *   <li>{@link fr.polytech.dsl.rhythm.Section#getBars <em>Bars</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.rhythm.RhythmPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tempo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tempo</em>' attribute.
	 * @see #setTempo(int)
	 * @see fr.polytech.dsl.rhythm.RhythmPackage#getSection_Tempo()
	 * @model required="true"
	 * @generated
	 */
	int getTempo();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.rhythm.Section#getTempo <em>Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tempo</em>' attribute.
	 * @see #getTempo()
	 * @generated
	 */
	void setTempo(int value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(int)
	 * @see fr.polytech.dsl.rhythm.RhythmPackage#getSection_Signature()
	 * @model required="true"
	 * @generated
	 */
	int getSignature();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.rhythm.Section#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(int value);

	/**
	 * Returns the value of the '<em><b>Bars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bars</em>' attribute.
	 * @see #setBars(int)
	 * @see fr.polytech.dsl.rhythm.RhythmPackage#getSection_Bars()
	 * @model required="true"
	 * @generated
	 */
	int getBars();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.rhythm.Section#getBars <em>Bars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bars</em>' attribute.
	 * @see #getBars()
	 * @generated
	 */
	void setBars(int value);

} // Section
