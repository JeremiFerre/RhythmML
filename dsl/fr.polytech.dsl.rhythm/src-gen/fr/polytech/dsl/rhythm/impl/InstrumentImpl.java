/**
 */
package fr.polytech.dsl.rhythm.impl;

import fr.polytech.dsl.rhythm.Instrument;
import fr.polytech.dsl.rhythm.RhythmPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instrument</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class InstrumentImpl extends NamedElementImpl implements Instrument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstrumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmPackage.Literals.INSTRUMENT;
	}

} //InstrumentImpl
