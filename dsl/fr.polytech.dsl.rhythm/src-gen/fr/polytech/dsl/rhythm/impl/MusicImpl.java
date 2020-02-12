/**
 */
package fr.polytech.dsl.rhythm.impl;

import fr.polytech.dsl.rhythm.Music;
import fr.polytech.dsl.rhythm.RhythmPackage;
import fr.polytech.dsl.rhythm.Section;
import fr.polytech.dsl.rhythm.Track;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link fr.polytech.dsl.rhythm.impl.MusicImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link fr.polytech.dsl.rhythm.impl.MusicImpl#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MusicImpl extends NamedElementImpl implements Music {
	/**
	 * The cached value of the '{@link #getTrack() <em>Track</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrack()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> track;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> section;

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
	public EList<Track> getTrack() {
		if (track == null) {
			track = new EObjectContainmentEList<Track>(Track.class, this, RhythmPackage.MUSIC__TRACK);
		}
		return track;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSection() {
		if (section == null) {
			section = new EObjectContainmentEList<Section>(Section.class, this, RhythmPackage.MUSIC__SECTION);
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RhythmPackage.MUSIC__TRACK:
			return ((InternalEList<?>) getTrack()).basicRemove(otherEnd, msgs);
		case RhythmPackage.MUSIC__SECTION:
			return ((InternalEList<?>) getSection()).basicRemove(otherEnd, msgs);
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
		case RhythmPackage.MUSIC__TRACK:
			return getTrack();
		case RhythmPackage.MUSIC__SECTION:
			return getSection();
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
		case RhythmPackage.MUSIC__TRACK:
			getTrack().clear();
			getTrack().addAll((Collection<? extends Track>) newValue);
			return;
		case RhythmPackage.MUSIC__SECTION:
			getSection().clear();
			getSection().addAll((Collection<? extends Section>) newValue);
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
		case RhythmPackage.MUSIC__TRACK:
			getTrack().clear();
			return;
		case RhythmPackage.MUSIC__SECTION:
			getSection().clear();
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
		case RhythmPackage.MUSIC__TRACK:
			return track != null && !track.isEmpty();
		case RhythmPackage.MUSIC__SECTION:
			return section != null && !section.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MusicImpl
