/**
 */
package fr.polytech.dsl.model.rhythm.impl;

import fr.polytech.dsl.model.rhythm.BatteryNote;
import fr.polytech.dsl.model.rhythm.BatteryNoteType;
import fr.polytech.dsl.model.rhythm.Duration;
import fr.polytech.dsl.model.rhythm.RhythmPackage;

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
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.BatteryNoteImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.BatteryNoteImpl#getNoteType <em>Note Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryNoteImpl extends MinimalEObjectImpl.Container implements BatteryNote {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = Duration.QUARTER;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration = DURATION_EDEFAULT;

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
	public Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration) {
		Duration oldDuration = duration;
		duration = newDuration == null ? DURATION_EDEFAULT : newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.BATTERY_NOTE__DURATION, oldDuration,
					duration));
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
		case RhythmPackage.BATTERY_NOTE__DURATION:
			return getDuration();
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
		case RhythmPackage.BATTERY_NOTE__DURATION:
			setDuration((Duration) newValue);
			return;
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
		case RhythmPackage.BATTERY_NOTE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
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
		case RhythmPackage.BATTERY_NOTE__DURATION:
			return duration != DURATION_EDEFAULT;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", noteType: ");
		result.append(noteType);
		result.append(')');
		return result.toString();
	}

} //BatteryNoteImpl
