/**
 */
package fr.polytech.dsl.model.rhythm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.Note#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getNote()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Note extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"QUARTER"</code>.
	 * The literals are from the enumeration {@link fr.polytech.dsl.model.rhythm.Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see fr.polytech.dsl.model.rhythm.Duration
	 * @see #setDuration(Duration)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getNote_Duration()
	 * @model default="QUARTER"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.Note#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see fr.polytech.dsl.model.rhythm.Duration
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

} // Note
