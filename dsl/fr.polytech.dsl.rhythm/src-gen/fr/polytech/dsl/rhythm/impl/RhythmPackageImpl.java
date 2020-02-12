/**
 */
package fr.polytech.dsl.rhythm.impl;

import fr.polytech.dsl.rhythm.Battery;
import fr.polytech.dsl.rhythm.BatteryNote;
import fr.polytech.dsl.rhythm.Instrument;
import fr.polytech.dsl.rhythm.Music;
import fr.polytech.dsl.rhythm.NamedElement;
import fr.polytech.dsl.rhythm.Piano;
import fr.polytech.dsl.rhythm.PianoNote;
import fr.polytech.dsl.rhythm.RhythmFactory;
import fr.polytech.dsl.rhythm.RhythmPackage;
import fr.polytech.dsl.rhythm.Section;
import fr.polytech.dsl.rhythm.Track;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RhythmPackageImpl extends EPackageImpl implements RhythmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass musicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instrumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pianoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum batteryNoteEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pianoNoteEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.polytech.dsl.rhythm.RhythmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RhythmPackageImpl() {
		super(eNS_URI, RhythmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RhythmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RhythmPackage init() {
		if (isInited)
			return (RhythmPackage) EPackage.Registry.INSTANCE.getEPackage(RhythmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRhythmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RhythmPackageImpl theRhythmPackage = registeredRhythmPackage instanceof RhythmPackageImpl
				? (RhythmPackageImpl) registeredRhythmPackage
				: new RhythmPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRhythmPackage.createPackageContents();

		// Initialize created meta-data
		theRhythmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRhythmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RhythmPackage.eNS_URI, theRhythmPackage);
		return theRhythmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMusic() {
		return musicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMusic_Track() {
		return (EReference) musicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMusic_Section() {
		return (EReference) musicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrack() {
		return trackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrack_Instrument() {
		return (EReference) trackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Tempo() {
		return (EAttribute) sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Signature() {
		return (EAttribute) sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Bars() {
		return (EAttribute) sectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstrument() {
		return instrumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBattery() {
		return batteryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBattery_Notes() {
		return (EAttribute) batteryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPiano() {
		return pianoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPiano_Notes() {
		return (EAttribute) pianoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBatteryNote() {
		return batteryNoteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPianoNote() {
		return pianoNoteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RhythmFactory getRhythmFactory() {
		return (RhythmFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		musicEClass = createEClass(MUSIC);
		createEReference(musicEClass, MUSIC__TRACK);
		createEReference(musicEClass, MUSIC__SECTION);

		trackEClass = createEClass(TRACK);
		createEReference(trackEClass, TRACK__INSTRUMENT);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__TEMPO);
		createEAttribute(sectionEClass, SECTION__SIGNATURE);
		createEAttribute(sectionEClass, SECTION__BARS);

		instrumentEClass = createEClass(INSTRUMENT);

		batteryEClass = createEClass(BATTERY);
		createEAttribute(batteryEClass, BATTERY__NOTES);

		pianoEClass = createEClass(PIANO);
		createEAttribute(pianoEClass, PIANO__NOTES);

		// Create enums
		batteryNoteEEnum = createEEnum(BATTERY_NOTE);
		pianoNoteEEnum = createEEnum(PIANO_NOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		musicEClass.getESuperTypes().add(this.getNamedElement());
		trackEClass.getESuperTypes().add(this.getNamedElement());
		sectionEClass.getESuperTypes().add(this.getNamedElement());
		instrumentEClass.getESuperTypes().add(this.getNamedElement());
		batteryEClass.getESuperTypes().add(this.getInstrument());
		pianoEClass.getESuperTypes().add(this.getInstrument());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(musicEClass, Music.class, "Music", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMusic_Track(), this.getTrack(), null, "track", null, 1, -1, Music.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMusic_Section(), this.getSection(), null, "section", null, 0, -1, Music.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(trackEClass, Track.class, "Track", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrack_Instrument(), this.getInstrument(), null, "instrument", null, 1, 1, Track.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_Tempo(), ecorePackage.getEInt(), "tempo", null, 1, 1, Section.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Signature(), ecorePackage.getEInt(), "signature", null, 1, 1, Section.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Bars(), ecorePackage.getEInt(), "bars", null, 1, 1, Section.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instrumentEClass, Instrument.class, "Instrument", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(batteryEClass, Battery.class, "Battery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBattery_Notes(), this.getBatteryNote(), "notes", null, 1, -1, Battery.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pianoEClass, Piano.class, "Piano", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPiano_Notes(), this.getPianoNote(), "notes", null, 1, -1, Piano.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(batteryNoteEEnum, BatteryNote.class, "BatteryNote");
		addEEnumLiteral(batteryNoteEEnum, BatteryNote.SNARE_DRUM);
		addEEnumLiteral(batteryNoteEEnum, BatteryNote.BASS_DRUM);
		addEEnumLiteral(batteryNoteEEnum, BatteryNote.CLOSED_HIHAT);
		addEEnumLiteral(batteryNoteEEnum, BatteryNote.OPENED_HIHAT);
		addEEnumLiteral(batteryNoteEEnum, BatteryNote.CRASH_CYMBAL);
		addEEnumLiteral(batteryNoteEEnum, BatteryNote.RIDE_CYMBAL);
		addEEnumLiteral(batteryNoteEEnum, BatteryNote.EMPTY);

		initEEnum(pianoNoteEEnum, PianoNote.class, "PianoNote");
		addEEnumLiteral(pianoNoteEEnum, PianoNote.C);
		addEEnumLiteral(pianoNoteEEnum, PianoNote.D);
		addEEnumLiteral(pianoNoteEEnum, PianoNote.E);
		addEEnumLiteral(pianoNoteEEnum, PianoNote.F);
		addEEnumLiteral(pianoNoteEEnum, PianoNote.G);
		addEEnumLiteral(pianoNoteEEnum, PianoNote.A);
		addEEnumLiteral(pianoNoteEEnum, PianoNote.B);
		addEEnumLiteral(pianoNoteEEnum, PianoNote.EMPTY);

		// Create resource
		createResource(eNS_URI);
	}

} //RhythmPackageImpl
