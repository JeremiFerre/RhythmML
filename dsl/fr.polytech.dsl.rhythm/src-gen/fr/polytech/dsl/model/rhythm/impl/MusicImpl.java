/**
 */
package fr.polytech.dsl.model.rhythm.impl;

import fr.polytech.dsl.model.rhythm.Music;
import fr.polytech.dsl.model.rhythm.RhythmPackage;
import fr.polytech.dsl.model.rhythm.Section;
import fr.polytech.dsl.model.rhythm.Track;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Music</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.MusicImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.MusicImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.MusicImpl#getSoundBankPath <em>Sound Bank Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MusicImpl extends NamedElementImpl implements Music {
	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> tracks;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

	/**
	 * The default value of the '{@link #getSoundBankPath() <em>Sound Bank Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundBankPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SOUND_BANK_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoundBankPath() <em>Sound Bank Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundBankPath()
	 * @generated
	 * @ordered
	 */
	protected String soundBankPath = SOUND_BANK_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MusicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmPackage.Literals.MUSIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Track> getTracks() {
		if (tracks == null) {
			tracks = new EObjectContainmentEList<Track>(Track.class, this, RhythmPackage.MUSIC__TRACKS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, RhythmPackage.MUSIC__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoundBankPath() {
		return soundBankPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundBankPath(String newSoundBankPath) {
		String oldSoundBankPath = soundBankPath;
		soundBankPath = newSoundBankPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.MUSIC__SOUND_BANK_PATH,
					oldSoundBankPath, soundBankPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RhythmPackage.MUSIC__TRACKS:
			return ((InternalEList<?>) getTracks()).basicRemove(otherEnd, msgs);
		case RhythmPackage.MUSIC__SECTIONS:
			return ((InternalEList<?>) getSections()).basicRemove(otherEnd, msgs);
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
		case RhythmPackage.MUSIC__TRACKS:
			return getTracks();
		case RhythmPackage.MUSIC__SECTIONS:
			return getSections();
		case RhythmPackage.MUSIC__SOUND_BANK_PATH:
			return getSoundBankPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RhythmPackage.MUSIC__TRACKS:
			getTracks().clear();
			getTracks().addAll((Collection<? extends Track>) newValue);
			return;
		case RhythmPackage.MUSIC__SECTIONS:
			getSections().clear();
			getSections().addAll((Collection<? extends Section>) newValue);
			return;
		case RhythmPackage.MUSIC__SOUND_BANK_PATH:
			setSoundBankPath((String) newValue);
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
		case RhythmPackage.MUSIC__TRACKS:
			getTracks().clear();
			return;
		case RhythmPackage.MUSIC__SECTIONS:
			getSections().clear();
			return;
		case RhythmPackage.MUSIC__SOUND_BANK_PATH:
			setSoundBankPath(SOUND_BANK_PATH_EDEFAULT);
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
		case RhythmPackage.MUSIC__TRACKS:
			return tracks != null && !tracks.isEmpty();
		case RhythmPackage.MUSIC__SECTIONS:
			return sections != null && !sections.isEmpty();
		case RhythmPackage.MUSIC__SOUND_BANK_PATH:
			return SOUND_BANK_PATH_EDEFAULT == null ? soundBankPath != null
					: !SOUND_BANK_PATH_EDEFAULT.equals(soundBankPath);
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
		result.append(" (soundBankPath: ");
		result.append(soundBankPath);
		result.append(')');
		return result.toString();
	}

} //MusicImpl
