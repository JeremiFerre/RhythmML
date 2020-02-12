/**
 */
package fr.polytech.dsl.rhythm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.rhythm.Battery#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.rhythm.RhythmPackage#getBattery()
 * @model
 * @generated
 */
public interface Battery extends Instrument {
	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute list.
	 * The list contents are of type {@link fr.polytech.dsl.rhythm.BatteryNote}.
	 * The literals are from the enumeration {@link fr.polytech.dsl.rhythm.BatteryNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute list.
	 * @see fr.polytech.dsl.rhythm.BatteryNote
	 * @see fr.polytech.dsl.rhythm.RhythmPackage#getBattery_Notes()
	 * @model required="true"
	 * @generated
	 */
	EList<BatteryNote> getNotes();

} // Battery
