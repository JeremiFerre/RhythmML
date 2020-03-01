/**
 */
package fr.polytech.dsl.model.rhythm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage
 * @generated
 */
public interface RhythmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RhythmFactory eINSTANCE = fr.polytech.dsl.model.rhythm.impl.RhythmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Music</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Music</em>'.
	 * @generated
	 */
	Music createMusic();

	/**
	 * Returns a new object of class '<em>Track</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Track</em>'.
	 * @generated
	 */
	Track createTrack();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Battery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery</em>'.
	 * @generated
	 */
	Battery createBattery();

	/**
	 * Returns a new object of class '<em>Piano</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Piano</em>'.
	 * @generated
	 */
	Piano createPiano();

	/**
	 * Returns a new object of class '<em>Battery Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Note</em>'.
	 * @generated
	 */
	BatteryNote createBatteryNote();

	/**
	 * Returns a new object of class '<em>Empty Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Note</em>'.
	 * @generated
	 */
	EmptyNote createEmptyNote();

	/**
	 * Returns a new object of class '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer</em>'.
	 * @generated
	 */
	Layer createLayer();

	/**
	 * Returns a new object of class '<em>Piano Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Piano Note</em>'.
	 * @generated
	 */
	PianoNote createPianoNote();

	/**
	 * Returns a new object of class '<em>Composite Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Note</em>'.
	 * @generated
	 */
	CompositeNote createCompositeNote();

	/**
	 * Returns a new object of class '<em>Piano Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Piano Pattern</em>'.
	 * @generated
	 */
	PianoPattern createPianoPattern();

	/**
	 * Returns a new object of class '<em>Battery Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Pattern</em>'.
	 * @generated
	 */
	BatteryPattern createBatteryPattern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RhythmPackage getRhythmPackage();

} //RhythmFactory
