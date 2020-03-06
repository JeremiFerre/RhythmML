/**
 */
package fr.polytech.dsl.model.rhythm.impl;

import fr.polytech.dsl.model.rhythm.Duration;
import fr.polytech.dsl.model.rhythm.MelodyNote;
import fr.polytech.dsl.model.rhythm.MelodyNoteType;
import fr.polytech.dsl.model.rhythm.RhythmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Melody Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.MelodyNoteImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.MelodyNoteImpl#getNoteType <em>Note Type</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.MelodyNoteImpl#getOctaveOffset <em>Octave Offset</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.MelodyNoteImpl#getOctaveAbsolute <em>Octave Absolute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MelodyNoteImpl extends MinimalEObjectImpl.Container implements MelodyNote {
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
	protected static final MelodyNoteType NOTE_TYPE_EDEFAULT = MelodyNoteType.C;

	/**
	 * The cached value of the '{@link #getNoteType() <em>Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteType()
	 * @generated
	 * @ordered
	 */
	protected MelodyNoteType noteType = NOTE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOctaveOffset() <em>Octave Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctaveOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OCTAVE_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOctaveOffset() <em>Octave Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctaveOffset()
	 * @generated
	 * @ordered
	 */
	protected int octaveOffset = OCTAVE_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOctaveAbsolute() <em>Octave Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctaveAbsolute()
	 * @generated
	 * @ordered
	 */
	protected static final int OCTAVE_ABSOLUTE_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getOctaveAbsolute() <em>Octave Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctaveAbsolute()
	 * @generated
	 * @ordered
	 */
	protected int octaveAbsolute = OCTAVE_ABSOLUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MelodyNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmPackage.Literals.MELODY_NOTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.MELODY_NOTE__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MelodyNoteType getNoteType() {
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteType(MelodyNoteType newNoteType) {
		MelodyNoteType oldNoteType = noteType;
		noteType = newNoteType == null ? NOTE_TYPE_EDEFAULT : newNoteType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.MELODY_NOTE__NOTE_TYPE, oldNoteType,
					noteType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOctaveOffset() {
		return octaveOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOctaveOffset(int newOctaveOffset) {
		int oldOctaveOffset = octaveOffset;
		octaveOffset = newOctaveOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.MELODY_NOTE__OCTAVE_OFFSET,
					oldOctaveOffset, octaveOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOctaveAbsolute() {
		return octaveAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOctaveAbsolute(int newOctaveAbsolute) {
		int oldOctaveAbsolute = octaveAbsolute;
		octaveAbsolute = newOctaveAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.MELODY_NOTE__OCTAVE_ABSOLUTE,
					oldOctaveAbsolute, octaveAbsolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RhythmPackage.MELODY_NOTE__DURATION:
			return getDuration();
		case RhythmPackage.MELODY_NOTE__NOTE_TYPE:
			return getNoteType();
		case RhythmPackage.MELODY_NOTE__OCTAVE_OFFSET:
			return getOctaveOffset();
		case RhythmPackage.MELODY_NOTE__OCTAVE_ABSOLUTE:
			return getOctaveAbsolute();
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
		case RhythmPackage.MELODY_NOTE__DURATION:
			setDuration((Duration) newValue);
			return;
		case RhythmPackage.MELODY_NOTE__NOTE_TYPE:
			setNoteType((MelodyNoteType) newValue);
			return;
		case RhythmPackage.MELODY_NOTE__OCTAVE_OFFSET:
			setOctaveOffset((Integer) newValue);
			return;
		case RhythmPackage.MELODY_NOTE__OCTAVE_ABSOLUTE:
			setOctaveAbsolute((Integer) newValue);
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
		case RhythmPackage.MELODY_NOTE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case RhythmPackage.MELODY_NOTE__NOTE_TYPE:
			setNoteType(NOTE_TYPE_EDEFAULT);
			return;
		case RhythmPackage.MELODY_NOTE__OCTAVE_OFFSET:
			setOctaveOffset(OCTAVE_OFFSET_EDEFAULT);
			return;
		case RhythmPackage.MELODY_NOTE__OCTAVE_ABSOLUTE:
			setOctaveAbsolute(OCTAVE_ABSOLUTE_EDEFAULT);
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
		case RhythmPackage.MELODY_NOTE__DURATION:
			return duration != DURATION_EDEFAULT;
		case RhythmPackage.MELODY_NOTE__NOTE_TYPE:
			return noteType != NOTE_TYPE_EDEFAULT;
		case RhythmPackage.MELODY_NOTE__OCTAVE_OFFSET:
			return octaveOffset != OCTAVE_OFFSET_EDEFAULT;
		case RhythmPackage.MELODY_NOTE__OCTAVE_ABSOLUTE:
			return octaveAbsolute != OCTAVE_ABSOLUTE_EDEFAULT;
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
		result.append(", octaveOffset: ");
		result.append(octaveOffset);
		result.append(", octaveAbsolute: ");
		result.append(octaveAbsolute);
		result.append(')');
		return result.toString();
	}

} //MelodyNoteImpl
