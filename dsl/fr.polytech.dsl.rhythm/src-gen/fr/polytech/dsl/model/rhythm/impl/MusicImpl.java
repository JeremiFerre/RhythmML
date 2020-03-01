/**
 */
package fr.polytech.dsl.model.rhythm.impl;

import fr.polytech.dsl.model.rhythm.Music;
import fr.polytech.dsl.model.rhythm.Pattern;
import fr.polytech.dsl.model.rhythm.RhythmPackage;
import fr.polytech.dsl.model.rhythm.Section;
import fr.polytech.dsl.model.rhythm.Track;

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
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.MusicImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.MusicImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.MusicImpl#getPatterns <em>Patterns</em>}</li>
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
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> patterns;

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
	public EList<Pattern> getPatterns() {
		if (patterns == null) {
			patterns = new EObjectContainmentEList<Pattern>(Pattern.class, this, RhythmPackage.MUSIC__PATTERNS);
		}
		return patterns;
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
		case RhythmPackage.MUSIC__PATTERNS:
			return ((InternalEList<?>) getPatterns()).basicRemove(otherEnd, msgs);
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
		case RhythmPackage.MUSIC__PATTERNS:
			return getPatterns();
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
		case RhythmPackage.MUSIC__PATTERNS:
			getPatterns().clear();
			getPatterns().addAll((Collection<? extends Pattern>) newValue);
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
		case RhythmPackage.MUSIC__PATTERNS:
			getPatterns().clear();
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
		case RhythmPackage.MUSIC__PATTERNS:
			return patterns != null && !patterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MusicImpl
