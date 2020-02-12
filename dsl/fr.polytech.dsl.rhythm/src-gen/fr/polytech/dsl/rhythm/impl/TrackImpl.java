/**
 */
package fr.polytech.dsl.rhythm.impl;

import fr.polytech.dsl.rhythm.Instrument;
import fr.polytech.dsl.rhythm.RhythmPackage;
import fr.polytech.dsl.rhythm.Track;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.rhythm.impl.TrackImpl#getInstrument <em>Instrument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackImpl extends NamedElementImpl implements Track {
	/**
	 * The cached value of the '{@link #getInstrument() <em>Instrument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrument()
	 * @generated
	 * @ordered
	 */
	protected Instrument instrument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmPackage.Literals.TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instrument getInstrument() {
		return instrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstrument(Instrument newInstrument, NotificationChain msgs) {
		Instrument oldInstrument = instrument;
		instrument = newInstrument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RhythmPackage.TRACK__INSTRUMENT, oldInstrument, newInstrument);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstrument(Instrument newInstrument) {
		if (newInstrument != instrument) {
			NotificationChain msgs = null;
			if (instrument != null)
				msgs = ((InternalEObject) instrument).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RhythmPackage.TRACK__INSTRUMENT, null, msgs);
			if (newInstrument != null)
				msgs = ((InternalEObject) newInstrument).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RhythmPackage.TRACK__INSTRUMENT, null, msgs);
			msgs = basicSetInstrument(newInstrument, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.TRACK__INSTRUMENT, newInstrument,
					newInstrument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RhythmPackage.TRACK__INSTRUMENT:
			return basicSetInstrument(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RhythmPackage.TRACK__INSTRUMENT:
			return getInstrument();
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
		case RhythmPackage.TRACK__INSTRUMENT:
			setInstrument((Instrument) newValue);
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
		case RhythmPackage.TRACK__INSTRUMENT:
			setInstrument((Instrument) null);
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
		case RhythmPackage.TRACK__INSTRUMENT:
			return instrument != null;
		}
		return super.eIsSet(featureID);
	}

} //TrackImpl
