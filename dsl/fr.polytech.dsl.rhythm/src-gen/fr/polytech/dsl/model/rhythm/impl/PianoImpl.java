/**
 */
package fr.polytech.dsl.model.rhythm.impl;

import fr.polytech.dsl.model.rhythm.Instruments;
import fr.polytech.dsl.model.rhythm.Piano;
import fr.polytech.dsl.model.rhythm.RhythmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piano</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.PianoImpl#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.PianoImpl#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PianoImpl extends InstrumentImpl implements Piano {
	/**
	 * The default value of the '{@link #getInstrument() <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrument()
	 * @generated
	 * @ordered
	 */
	protected static final Instruments INSTRUMENT_EDEFAULT = Instruments.PIANO;
	/**
	 * The cached value of the '{@link #getInstrument() <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrument()
	 * @generated
	 * @ordered
	 */
	protected Instruments instrument = INSTRUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected String other = OTHER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PianoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmPackage.Literals.PIANO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruments getInstrument() {
		return instrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstrument(Instruments newInstrument) {
		Instruments oldInstrument = instrument;
		instrument = newInstrument == null ? INSTRUMENT_EDEFAULT : newInstrument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.PIANO__INSTRUMENT, oldInstrument,
					instrument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOther(String newOther) {
		String oldOther = other;
		other = newOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.PIANO__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RhythmPackage.PIANO__INSTRUMENT:
			return getInstrument();
		case RhythmPackage.PIANO__OTHER:
			return getOther();
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
		case RhythmPackage.PIANO__INSTRUMENT:
			setInstrument((Instruments) newValue);
			return;
		case RhythmPackage.PIANO__OTHER:
			setOther((String) newValue);
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
		case RhythmPackage.PIANO__INSTRUMENT:
			setInstrument(INSTRUMENT_EDEFAULT);
			return;
		case RhythmPackage.PIANO__OTHER:
			setOther(OTHER_EDEFAULT);
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
		case RhythmPackage.PIANO__INSTRUMENT:
			return instrument != INSTRUMENT_EDEFAULT;
		case RhythmPackage.PIANO__OTHER:
			return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
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
		result.append(" (instrument: ");
		result.append(instrument);
		result.append(", other: ");
		result.append(other);
		result.append(')');
		return result.toString();
	}

} //PianoImpl
