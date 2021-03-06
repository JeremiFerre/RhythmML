/**
 */
package fr.polytech.dsl.model.rhythm.impl;

import fr.polytech.dsl.model.rhythm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RhythmFactoryImpl extends EFactoryImpl implements RhythmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RhythmFactory init() {
		try {
			RhythmFactory theRhythmFactory = (RhythmFactory) EPackage.Registry.INSTANCE
					.getEFactory(RhythmPackage.eNS_URI);
			if (theRhythmFactory != null) {
				return theRhythmFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RhythmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RhythmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RhythmPackage.MUSIC:
			return createMusic();
		case RhythmPackage.TRACK:
			return createTrack();
		case RhythmPackage.SECTION:
			return createSection();
		case RhythmPackage.BATTERY:
			return createBattery();
		case RhythmPackage.MELODY:
			return createMelody();
		case RhythmPackage.BATTERY_NOTE:
			return createBatteryNote();
		case RhythmPackage.EMPTY_NOTE:
			return createEmptyNote();
		case RhythmPackage.LAYER:
			return createLayer();
		case RhythmPackage.MELODY_NOTE:
			return createMelodyNote();
		case RhythmPackage.COMPOSITE_NOTE:
			return createCompositeNote();
		case RhythmPackage.SECTION_LAYER:
			return createSectionLayer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RhythmPackage.BATTERY_NOTE_TYPE:
			return createBatteryNoteTypeFromString(eDataType, initialValue);
		case RhythmPackage.MELODY_NOTE_TYPE:
			return createMelodyNoteTypeFromString(eDataType, initialValue);
		case RhythmPackage.INSTRUMENTS:
			return createInstrumentsFromString(eDataType, initialValue);
		case RhythmPackage.DURATION:
			return createDurationFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RhythmPackage.BATTERY_NOTE_TYPE:
			return convertBatteryNoteTypeToString(eDataType, instanceValue);
		case RhythmPackage.MELODY_NOTE_TYPE:
			return convertMelodyNoteTypeToString(eDataType, instanceValue);
		case RhythmPackage.INSTRUMENTS:
			return convertInstrumentsToString(eDataType, instanceValue);
		case RhythmPackage.DURATION:
			return convertDurationToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Music createMusic() {
		MusicImpl music = new MusicImpl();
		return music;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Track createTrack() {
		TrackImpl track = new TrackImpl();
		return track;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Battery createBattery() {
		BatteryImpl battery = new BatteryImpl();
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Melody createMelody() {
		MelodyImpl melody = new MelodyImpl();
		return melody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryNote createBatteryNote() {
		BatteryNoteImpl batteryNote = new BatteryNoteImpl();
		return batteryNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyNote createEmptyNote() {
		EmptyNoteImpl emptyNote = new EmptyNoteImpl();
		return emptyNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MelodyNote createMelodyNote() {
		MelodyNoteImpl melodyNote = new MelodyNoteImpl();
		return melodyNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNote createCompositeNote() {
		CompositeNoteImpl compositeNote = new CompositeNoteImpl();
		return compositeNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionLayer createSectionLayer() {
		SectionLayerImpl sectionLayer = new SectionLayerImpl();
		return sectionLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryNoteType createBatteryNoteTypeFromString(EDataType eDataType, String initialValue) {
		BatteryNoteType result = BatteryNoteType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBatteryNoteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MelodyNoteType createMelodyNoteTypeFromString(EDataType eDataType, String initialValue) {
		MelodyNoteType result = MelodyNoteType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMelodyNoteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruments createInstrumentsFromString(EDataType eDataType, String initialValue) {
		Instruments result = Instruments.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstrumentsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDurationFromString(EDataType eDataType, String initialValue) {
		Duration result = Duration.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RhythmPackage getRhythmPackage() {
		return (RhythmPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RhythmPackage getPackage() {
		return RhythmPackage.eINSTANCE;
	}

} //RhythmFactoryImpl
