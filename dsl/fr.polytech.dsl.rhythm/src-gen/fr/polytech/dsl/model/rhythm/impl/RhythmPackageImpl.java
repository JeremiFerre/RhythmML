/**
 */
package fr.polytech.dsl.model.rhythm.impl;

import fr.polytech.dsl.model.rhythm.Battery;
import fr.polytech.dsl.model.rhythm.BatteryNote;
import fr.polytech.dsl.model.rhythm.BatteryNoteType;
import fr.polytech.dsl.model.rhythm.CompositeNote;
import fr.polytech.dsl.model.rhythm.Duration;
import fr.polytech.dsl.model.rhythm.EmptyNote;
import fr.polytech.dsl.model.rhythm.Instrument;
import fr.polytech.dsl.model.rhythm.Instruments;
import fr.polytech.dsl.model.rhythm.Layer;
import fr.polytech.dsl.model.rhythm.Melody;
import fr.polytech.dsl.model.rhythm.MelodyNote;
import fr.polytech.dsl.model.rhythm.MelodyNoteType;
import fr.polytech.dsl.model.rhythm.Music;
import fr.polytech.dsl.model.rhythm.NamedElement;
import fr.polytech.dsl.model.rhythm.Note;
import fr.polytech.dsl.model.rhythm.RhythmFactory;
import fr.polytech.dsl.model.rhythm.RhythmPackage;
import fr.polytech.dsl.model.rhythm.Section;
import fr.polytech.dsl.model.rhythm.SectionLayer;
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
	private EClass melodyEClass = null;

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
	private EClass melodyNoteEClass = null;

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
	private EClass sectionLayerEClass = null;

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
	private EEnum melodyNoteTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instrumentsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationEEnum = null;

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
	public EAttribute getMusic_SoundBankPath() {
		return (EAttribute) musicEClass.getEStructuralFeatures().get(2);
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
	public EReference getInstrument_Sections() {
		return (EReference) instrumentEClass.getEStructuralFeatures().get(1);
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
	public EClass getMelody() {
		return melodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMelody_Instrument() {
		return (EAttribute) melodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMelody_Other() {
		return (EAttribute) melodyEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getNote_Duration() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(0);
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
	public EClass getMelodyNote() {
		return melodyNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMelodyNote_NoteType() {
		return (EAttribute) melodyNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMelodyNote_OctaveOffset() {
		return (EAttribute) melodyNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMelodyNote_OctaveAbsolute() {
		return (EAttribute) melodyNoteEClass.getEStructuralFeatures().get(2);
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
	public EClass getSectionLayer() {
		return sectionLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionLayer_Layers() {
		return (EReference) sectionLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionLayer_Section() {
		return (EReference) sectionLayerEClass.getEStructuralFeatures().get(1);
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
	public EEnum getMelodyNoteType() {
		return melodyNoteTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstruments() {
		return instrumentsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDuration() {
		return durationEEnum;
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
		createEAttribute(musicEClass, MUSIC__SOUND_BANK_PATH);

		trackEClass = createEClass(TRACK);
		createEReference(trackEClass, TRACK__INSTRUMENT);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__TEMPO);
		createEAttribute(sectionEClass, SECTION__SIGNATURE);
		createEAttribute(sectionEClass, SECTION__BARS);

		instrumentEClass = createEClass(INSTRUMENT);
		createEReference(instrumentEClass, INSTRUMENT__LAYERS);
		createEReference(instrumentEClass, INSTRUMENT__SECTIONS);

		batteryEClass = createEClass(BATTERY);

		melodyEClass = createEClass(MELODY);
		createEAttribute(melodyEClass, MELODY__INSTRUMENT);
		createEAttribute(melodyEClass, MELODY__OTHER);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__DURATION);

		batteryNoteEClass = createEClass(BATTERY_NOTE);
		createEAttribute(batteryNoteEClass, BATTERY_NOTE__NOTE_TYPE);

		emptyNoteEClass = createEClass(EMPTY_NOTE);

		layerEClass = createEClass(LAYER);
		createEReference(layerEClass, LAYER__NOTES);

		melodyNoteEClass = createEClass(MELODY_NOTE);
		createEAttribute(melodyNoteEClass, MELODY_NOTE__NOTE_TYPE);
		createEAttribute(melodyNoteEClass, MELODY_NOTE__OCTAVE_OFFSET);
		createEAttribute(melodyNoteEClass, MELODY_NOTE__OCTAVE_ABSOLUTE);

		compositeNoteEClass = createEClass(COMPOSITE_NOTE);
		createEReference(compositeNoteEClass, COMPOSITE_NOTE__NOTES);
		createEAttribute(compositeNoteEClass, COMPOSITE_NOTE__REPEATS);

		sectionLayerEClass = createEClass(SECTION_LAYER);
		createEReference(sectionLayerEClass, SECTION_LAYER__LAYERS);
		createEReference(sectionLayerEClass, SECTION_LAYER__SECTION);

		// Create enums
		batteryNoteTypeEEnum = createEEnum(BATTERY_NOTE_TYPE);
		melodyNoteTypeEEnum = createEEnum(MELODY_NOTE_TYPE);
		instrumentsEEnum = createEEnum(INSTRUMENTS);
		durationEEnum = createEEnum(DURATION);
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
		melodyEClass.getESuperTypes().add(this.getInstrument());
		batteryNoteEClass.getESuperTypes().add(this.getNote());
		emptyNoteEClass.getESuperTypes().add(this.getNote());
		melodyNoteEClass.getESuperTypes().add(this.getNote());
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
		initEAttribute(getMusic_SoundBankPath(), ecorePackage.getEString(), "soundBankPath", null, 0, 1, Music.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getInstrument_Sections(), this.getSectionLayer(), null, "sections", null, 0, -1,
				Instrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batteryEClass, Battery.class, "Battery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(melodyEClass, Melody.class, "Melody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMelody_Instrument(), this.getInstruments(), "instrument", "PIANO", 0, 1, Melody.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMelody_Other(), ecorePackage.getEString(), "other", null, 0, 1, Melody.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Duration(), this.getDuration(), "duration", "QUARTER", 0, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(melodyNoteEClass, MelodyNote.class, "MelodyNote", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMelodyNote_NoteType(), this.getMelodyNoteType(), "noteType", null, 0, 1, MelodyNote.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMelodyNote_OctaveOffset(), ecorePackage.getEInt(), "octaveOffset", null, 0, 1,
				MelodyNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMelodyNote_OctaveAbsolute(), ecorePackage.getEInt(), "octaveAbsolute", "5", 0, 1,
				MelodyNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(compositeNoteEClass, CompositeNote.class, "CompositeNote", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeNote_Notes(), this.getNote(), null, "notes", null, 0, -1, CompositeNote.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeNote_Repeats(), ecorePackage.getEInt(), "repeats", null, 0, 1, CompositeNote.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionLayerEClass, SectionLayer.class, "SectionLayer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSectionLayer_Layers(), this.getLayer(), null, "layers", null, 0, -1, SectionLayer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSectionLayer_Section(), this.getSection(), null, "section", null, 1, 1, SectionLayer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(batteryNoteTypeEEnum, BatteryNoteType.class, "BatteryNoteType");
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.SNARE_DRUM);
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.BASS_DRUM);
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.CLOSED_HIHAT);
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.OPENED_HIHAT);
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.CRASH_CYMBAL);
		addEEnumLiteral(batteryNoteTypeEEnum, BatteryNoteType.RIDE_CYMBAL);

		initEEnum(melodyNoteTypeEEnum, MelodyNoteType.class, "MelodyNoteType");
		addEEnumLiteral(melodyNoteTypeEEnum, MelodyNoteType.C);
		addEEnumLiteral(melodyNoteTypeEEnum, MelodyNoteType.D);
		addEEnumLiteral(melodyNoteTypeEEnum, MelodyNoteType.E);
		addEEnumLiteral(melodyNoteTypeEEnum, MelodyNoteType.F);
		addEEnumLiteral(melodyNoteTypeEEnum, MelodyNoteType.G);
		addEEnumLiteral(melodyNoteTypeEEnum, MelodyNoteType.A);
		addEEnumLiteral(melodyNoteTypeEEnum, MelodyNoteType.B);

		initEEnum(instrumentsEEnum, Instruments.class, "Instruments");
		addEEnumLiteral(instrumentsEEnum, Instruments.PIANO);
		addEEnumLiteral(instrumentsEEnum, Instruments.GUITAR);
		addEEnumLiteral(instrumentsEEnum, Instruments.HARPSICHORD);
		addEEnumLiteral(instrumentsEEnum, Instruments.CLAVINET);
		addEEnumLiteral(instrumentsEEnum, Instruments.VIOLIN);
		addEEnumLiteral(instrumentsEEnum, Instruments.SYNTH_BASS_1);
		addEEnumLiteral(instrumentsEEnum, Instruments.OCARINA);
		addEEnumLiteral(instrumentsEEnum, Instruments.ACOUSTIC_BASS);
		addEEnumLiteral(instrumentsEEnum, Instruments.CHURCH_ORGAN);
		addEEnumLiteral(instrumentsEEnum, Instruments.MUSIC_BOX);

		initEEnum(durationEEnum, Duration.class, "Duration");
		addEEnumLiteral(durationEEnum, Duration.WHOLE);
		addEEnumLiteral(durationEEnum, Duration.HALF);
		addEEnumLiteral(durationEEnum, Duration.QUARTER);
		addEEnumLiteral(durationEEnum, Duration.EIGHTH);
		addEEnumLiteral(durationEEnum, Duration.SIXTEENTH);
		addEEnumLiteral(durationEEnum, Duration.THIRTY_SECOND);

		// Create resource
		createResource(eNS_URI);
	}

} //RhythmPackageImpl
