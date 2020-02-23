/**
 */
package fr.polytech.dsl.model.rhythm.impl;

import fr.polytech.dsl.model.rhythm.PianoNote;
import fr.polytech.dsl.model.rhythm.PianoNoteType;
import fr.polytech.dsl.model.rhythm.RhythmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piano Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.PianoNoteImpl#getNoteType <em>Note Type</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.PianoNoteImpl#getOctaveOffset <em>Octave Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PianoNoteImpl extends MinimalEObjectImpl.Container implements PianoNote {
	/**
	 * The default value of the '{@link #getNoteType() <em>Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteType()
	 * @generated
	 * @ordered
	 */
	protected static final PianoNoteType NOTE_TYPE_EDEFAULT = PianoNoteType.C;

	/**
	 * The cached value of the '{@link #getNoteType() <em>Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteType()
	 * @generated
	 * @ordered
	 */
	protected PianoNoteType noteType = NOTE_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PianoNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmPackage.Literals.PIANO_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PianoNoteType getNoteType() {
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteType(PianoNoteType newNoteType) {
		PianoNoteType oldNoteType = noteType;
		noteType = newNoteType == null ? NOTE_TYPE_EDEFAULT : newNoteType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.PIANO_NOTE__NOTE_TYPE, oldNoteType,
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
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.PIANO_NOTE__OCTAVE_OFFSET,
					oldOctaveOffset, octaveOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RhythmPackage.PIANO_NOTE__NOTE_TYPE:
			return getNoteType();
		case RhythmPackage.PIANO_NOTE__OCTAVE_OFFSET:
			return getOctaveOffset();
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
		case RhythmPackage.PIANO_NOTE__NOTE_TYPE:
			setNoteType((PianoNoteType) newValue);
			return;
		case RhythmPackage.PIANO_NOTE__OCTAVE_OFFSET:
			setOctaveOffset((Integer) newValue);
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
		case RhythmPackage.PIANO_NOTE__NOTE_TYPE:
			setNoteType(NOTE_TYPE_EDEFAULT);
			return;
		case RhythmPackage.PIANO_NOTE__OCTAVE_OFFSET:
			setOctaveOffset(OCTAVE_OFFSET_EDEFAULT);
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
		case RhythmPackage.PIANO_NOTE__NOTE_TYPE:
			return noteType != NOTE_TYPE_EDEFAULT;
		case RhythmPackage.PIANO_NOTE__OCTAVE_OFFSET:
			return octaveOffset != OCTAVE_OFFSET_EDEFAULT;
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
		result.append(", octaveOffset: ");
		result.append(octaveOffset);
		result.append(')');
		return result.toString();
	}

} //PianoNoteImpl
