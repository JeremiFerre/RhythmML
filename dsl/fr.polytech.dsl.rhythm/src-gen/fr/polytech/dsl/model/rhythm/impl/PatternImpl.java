/**
 */
package fr.polytech.dsl.model.rhythm.impl;

import fr.polytech.dsl.model.rhythm.CompositeNote;
import fr.polytech.dsl.model.rhythm.Pattern;
import fr.polytech.dsl.model.rhythm.RhythmPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.impl.PatternImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PatternImpl extends NamedElementImpl implements Pattern {
	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected CompositeNote notes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmPackage.Literals.PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNote getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(CompositeNote newNotes, NotificationChain msgs) {
		CompositeNote oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RhythmPackage.PATTERN__NOTES,
					oldNotes, newNotes);
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
	public void setNotes(CompositeNote newNotes) {
		if (newNotes != notes) {
			NotificationChain msgs = null;
			if (notes != null)
				msgs = ((InternalEObject) notes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RhythmPackage.PATTERN__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject) newNotes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RhythmPackage.PATTERN__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmPackage.PATTERN__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RhythmPackage.PATTERN__NOTES:
			return basicSetNotes(null, msgs);
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
		case RhythmPackage.PATTERN__NOTES:
			return getNotes();
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
		case RhythmPackage.PATTERN__NOTES:
			setNotes((CompositeNote) newValue);
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
		case RhythmPackage.PATTERN__NOTES:
			setNotes((CompositeNote) null);
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
		case RhythmPackage.PATTERN__NOTES:
			return notes != null;
		}
		return super.eIsSet(featureID);
	}

} //PatternImpl
