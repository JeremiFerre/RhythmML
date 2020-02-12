/**
 */
package fr.polytech.dsl.rhythm.impl;

import fr.polytech.dsl.rhythm.BatteryNote;
import fr.polytech.dsl.rhythm.BatteryNoteType;
import fr.polytech.dsl.rhythm.RhythmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.rhythm.impl.BatteryNoteImpl#getNoteType <em>Note Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryNoteImpl extends MinimalEObjectImpl.Container implements BatteryNote {
	/**
	 * The default value of the '{@link #getNoteType() <em>Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteType()
	 * @generated
	 * @ordered
	 */
	protected static final BatteryNoteType NOTE_TYPE_EDEFAULT = BatteryNoteType.SNARE_DRUM;

	/**
	 * The cached value of the '{@link #getNoteType() <em>Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteType()
	 * @generated
	 * @ordered
	 */
	protected BatteryNoteType noteType = NOTE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmPackage.Literals.BATTERY_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryNoteType getNoteType() {
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteType(BatteryNoteType newNoteType) {
		BatteryNoteType oldNoteType = noteType;
		noteType = newNoteType == null ? NOTE_TYPE_EDEFAULT : newNoteType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.BATTERY_NOTE__NOTE_TYPE, oldNoteType,
					noteType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RhythmPackage.BATTERY_NOTE__NOTE_TYPE:
			return getNoteType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RhythmPackage.BATTERY_NOTE__NOTE_TYPE:
			setNoteType((BatteryNoteType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RhythmPackage.BATTERY_NOTE__NOTE_TYPE:
			setNoteType(NOTE_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RhythmPackage.BATTERY_NOTE__NOTE_TYPE:
			return noteType != NOTE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (noteType: ");
		result.append(noteType);
		result.append(')');
		return result.toString();
	}

} //BatteryNoteImpl
