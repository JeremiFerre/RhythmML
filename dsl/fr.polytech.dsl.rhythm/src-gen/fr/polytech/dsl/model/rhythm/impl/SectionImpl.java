/**
 */
package fr.polytech.dsl.model.rhythm.impl;

import fr.polytech.dsl.model.rhythm.RhythmPackage;
import fr.polytech.dsl.model.rhythm.Section;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.SectionImpl#getTempo <em>Tempo</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.SectionImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.SectionImpl#getBars <em>Bars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends NamedElementImpl implements Section {
	/**
	 * The default value of the '{@link #getTempo() <em>Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempo()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempo() <em>Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempo()
	 * @generated
	 * @ordered
	 */
	protected int tempo = TEMPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNATURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected int signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBars() <em>Bars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBars()
	 * @generated
	 * @ordered
	 */
	protected static final int BARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBars() <em>Bars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBars()
	 * @generated
	 * @ordered
	 */
	protected int bars = BARS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTempo() {
		return tempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempo(int newTempo) {
		int oldTempo = tempo;
		tempo = newTempo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.SECTION__TEMPO, oldTempo, tempo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(int newSignature) {
		int oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.SECTION__SIGNATURE, oldSignature,
					signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBars() {
		return bars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBars(int newBars) {
		int oldBars = bars;
		bars = newBars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.SECTION__BARS, oldBars, bars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RhythmPackage.SECTION__TEMPO:
			return getTempo();
		case RhythmPackage.SECTION__SIGNATURE:
			return getSignature();
		case RhythmPackage.SECTION__BARS:
			return getBars();
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
		case RhythmPackage.SECTION__TEMPO:
			setTempo((Integer) newValue);
			return;
		case RhythmPackage.SECTION__SIGNATURE:
			setSignature((Integer) newValue);
			return;
		case RhythmPackage.SECTION__BARS:
			setBars((Integer) newValue);
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
		case RhythmPackage.SECTION__TEMPO:
			setTempo(TEMPO_EDEFAULT);
			return;
		case RhythmPackage.SECTION__SIGNATURE:
			setSignature(SIGNATURE_EDEFAULT);
			return;
		case RhythmPackage.SECTION__BARS:
			setBars(BARS_EDEFAULT);
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
		case RhythmPackage.SECTION__TEMPO:
			return tempo != TEMPO_EDEFAULT;
		case RhythmPackage.SECTION__SIGNATURE:
			return signature != SIGNATURE_EDEFAULT;
		case RhythmPackage.SECTION__BARS:
			return bars != BARS_EDEFAULT;
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
		result.append(" (tempo: ");
		result.append(tempo);
		result.append(", signature: ");
		result.append(signature);
		result.append(", bars: ");
		result.append(bars);
		result.append(')');
		return result.toString();
	}

} //SectionImpl
