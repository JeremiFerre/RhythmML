/**
 */
package fr.polytech.dsl.model.rhythm.impl;

import fr.polytech.dsl.model.rhythm.Battery;
import fr.polytech.dsl.model.rhythm.BatteryNote;
import fr.polytech.dsl.model.rhythm.BatteryNoteType;
import fr.polytech.dsl.model.rhythm.CompositeNote;
import fr.polytech.dsl.model.rhythm.EmptyNote;
import fr.polytech.dsl.model.rhythm.Instrument;
import fr.polytech.dsl.model.rhythm.Layer;
import fr.polytech.dsl.model.rhythm.Music;
import fr.polytech.dsl.model.rhythm.NamedElement;
import fr.polytech.dsl.model.rhythm.Note;
import fr.polytech.dsl.model.rhythm.Piano;
import fr.polytech.dsl.model.rhythm.PianoNote;
import fr.polytech.dsl.model.rhythm.PianoNoteType;
import fr.polytech.dsl.model.rhythm.RhythmFactory;
import fr.polytech.dsl.model.rhythm.RhythmPackage;
import fr.polytech.dsl.model.rhythm.Section;
import fr.polytech.dsl.model.rhythm.Track;

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
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pianoNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum batteryNoteTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pianoNoteTypeEEnum = null;

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
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#eNS_URI
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
	public EReference getMusic_Tracks() {
		return (EReference) musicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMusic_Sections() {
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
	public EReference getInstrument_Layers() {
		return (EReference) instrumentEClass.getEStructuralFeatures().get(0);
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
	public EClass getPiano() {
		return pianoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatteryNote() {
		return batteryNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryNote_NoteType() {
		return (EAttribute) batteryNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyNote() {
		return emptyNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayer_Notes() {
		return (EReference) layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPianoNote() {
		return pianoNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPianoNote_NoteType() {
		return (EAttribute) pianoNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPianoNote_OctaveOffset() {
		return (EAttribute) pianoNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeNote() {
		return compositeNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeNote_Notes() {
		return (EReference) compositeNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeNote_Repeats() {
		return (EAttribute) compositeNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBatteryNoteType() {
		return batteryNoteTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPianoNoteType() {
		return pianoNoteTypeEEnum;
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
		createEReference(musicEClass, MUSIC__TRACKS);
		createEReference(musicEClass, MUSIC__SECTIONS);

		trackEClass = createEClass(TRACK);
		createEReference(trackEClass, TRACK__INSTRUMENT);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__TEMPO);
		createEAttribute(sectionEClass, SECTION__SIGNATURE);
		createEAttribute(sectionEClass, SECTION__BARS);

		instrumentEClass = createEClass(INSTRUMENT);
		createEReference(instrumentEClass, INSTRUMENT__LAYERS);

		batteryEClass = createEClass(BATTERY);

		pianoEClass = createEClass(PIANO);

		noteEClass = createEClass(NOTE);

		batteryNoteEClass = createEClass(BATTERY_NOTE);
		createEAttribute(batteryNoteEClass, BATTERY_NOTE__NOTE_TYPE);

		emptyNoteEClass = createEClass(EMPTY_NOTE);

		layerEClass = createEClass(LAYER);
		createEReference(layerEClass, LAYER__NOTES);

		pianoNoteEClass = createEClass(PIANO_NOTE);
		createEAttribute(pianoNoteEClass, PIANO_NOTE__NOTE_TYPE);
		createEAttribute(pianoNoteEClass, PIANO_NOTE__OCTAVE_OFFSET);

		compositeNoteEClass = createEClass(COMPOSITE_NOTE);
		createEReference(compositeNoteEClass, COMPOSITE_NOTE__NOTES);
		createEAttribute(compositeNoteEClass, COMPOSITE_NOTE__REPEATS);

		// Create enums
		batteryNoteTypeEEnum = createEEnum(BATTERY_NOTE_TYPE);
		pianoNoteTypeEEnum = createEEnum(PIANO_NOTE_TYPE);
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
		batteryNoteEClass.getESuperTypes().add(this.getNote());
		emptyNoteEClass.getESuperTypes().add(this.getNote());
		pianoNoteEClass.getESuperTypes().add(this.getNote());
		compositeNoteEClass.getESuperTypes().add(this.getNote());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(musicEClass, Music.class, "Music", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMusic_Tracks(), this.getTrack(), null, "tracks", null, 1, -1, Music.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMusic_Sections(), this.getSection(), null, "sections", null, 0, -1, Music.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getInstrument_Layers(), this.getLayer(), null, "layers", null, 0, -1, Instrument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batteryEClass, Battery.class, "Battery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pianoEClass, Piano.class, "Piano", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noteEClass, Note.class, "Note", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(batteryNoteEClass, BatteryNote.class, "BatteryNote", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatteryNote_NoteType(), this.getBatteryNoteType(), "noteType", null, 0, 1, BatteryNote.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyNoteEClass, EmptyNote.class, "EmptyNote", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayer_Notes(), this.getNote(), null, "notes", null, 0, -1, Layer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(pianoNoteEClass, PianoNote.class, "PianoNote", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPianoNote_NoteType(), this.getPianoNoteType(), "noteType", null, 0, 1, PianoNote.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPianoNote_OctaveOffset(), ecorePackage.getEInt(), "octaveOffset", null, 0, 1, PianoNote.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeNoteEClass, CompositeNote.class, "CompositeNote", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeNote_Notes(), this.getNote(), null, "notes", null, 0, -1, CompositeNote.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeNote_Repeats(), ecorePackage.getEInt(), "repeats", null, 0, 1, CompositeNote.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(batteryNoteTypeEEnum, BatteryNoteType.class, "BatteryNoteType");
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.SNARE_DRUM);
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.BASS_DRUM);
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.CLOSED_HIHAT);
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.OPENED_HIHAT);
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.CRASH_CYMBAL);
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.RIDE_CYMBAL);

		initEEnum(pianoNoteTypeEEnum, PianoNoteType.class, "PianoNoteType");
		addEEnumLiteral(pianoNoteTypeEEnum, PianoNoteType.C);
		addEEnumLiteral(pianoNoteTypeEEnum, PianoNoteType.D);
		addEEnumLiteral(pianoNoteTypeEEnum, PianoNoteType.E);
		addEEnumLiteral(pianoNoteTypeEEnum, PianoNoteType.F);
		addEEnumLiteral(pianoNoteTypeEEnum, PianoNoteType.G);
		addEEnumLiteral(pianoNoteTypeEEnum, PianoNoteType.A);
		addEEnumLiteral(pianoNoteTypeEEnum, PianoNoteType.B);

		// Create resource
		createResource(eNS_URI);
	}

} //RhythmPackageImpl
