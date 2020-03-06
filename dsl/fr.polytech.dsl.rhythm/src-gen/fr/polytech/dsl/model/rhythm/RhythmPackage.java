/**
 */
package fr.polytech.dsl.model.rhythm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.polytech.dsl.model.rhythm.RhythmFactory
 * @model kind="package"
 * @generated
 */
public interface RhythmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rhythm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.polytech.dsl/rhythm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rhythm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RhythmPackage eINSTANCE = fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.NamedElementImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.MusicImpl <em>Music</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.MusicImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getMusic()
	 * @generated
	 */
	int MUSIC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__TRACKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__SECTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sound Bank Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__SOUND_BANK_PATH = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Music</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Music</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.TrackImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instrument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__INSTRUMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.SectionImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TEMPO = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SIGNATURE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__BARS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.InstrumentImpl <em>Instrument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.InstrumentImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getInstrument()
	 * @generated
	 */
	int INSTRUMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT__LAYERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT__SECTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.BatteryImpl <em>Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.BatteryImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getBattery()
	 * @generated
	 */
	int BATTERY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__NAME = INSTRUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__LAYERS = INSTRUMENT__LAYERS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__SECTIONS = INSTRUMENT__SECTIONS;

	/**
	 * The number of structural features of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_FEATURE_COUNT = INSTRUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_OPERATION_COUNT = INSTRUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.MelodyImpl <em>Melody</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.MelodyImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getMelody()
	 * @generated
	 */
	int MELODY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY__NAME = INSTRUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY__LAYERS = INSTRUMENT__LAYERS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY__SECTIONS = INSTRUMENT__SECTIONS;

	/**
	 * The feature id for the '<em><b>Instrument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY__INSTRUMENT = INSTRUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY__OTHER = INSTRUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Melody</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY_FEATURE_COUNT = INSTRUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Melody</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY_OPERATION_COUNT = INSTRUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.Note <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.Note
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DURATION = 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.BatteryNoteImpl <em>Battery Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.BatteryNoteImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getBatteryNote()
	 * @generated
	 */
	int BATTERY_NOTE = 8;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_NOTE__DURATION = NOTE__DURATION;

	/**
	 * The feature id for the '<em><b>Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_NOTE__NOTE_TYPE = NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Battery Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_NOTE_FEATURE_COUNT = NOTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Battery Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_NOTE_OPERATION_COUNT = NOTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.EmptyNoteImpl <em>Empty Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.EmptyNoteImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getEmptyNote()
	 * @generated
	 */
	int EMPTY_NOTE = 9;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NOTE__DURATION = NOTE__DURATION;

	/**
	 * The number of structural features of the '<em>Empty Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NOTE_FEATURE_COUNT = NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Empty Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NOTE_OPERATION_COUNT = NOTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.LayerImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 10;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NOTES = 0;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.MelodyNoteImpl <em>Melody Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.MelodyNoteImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getMelodyNote()
	 * @generated
	 */
	int MELODY_NOTE = 11;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY_NOTE__DURATION = NOTE__DURATION;

	/**
	 * The feature id for the '<em><b>Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY_NOTE__NOTE_TYPE = NOTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Octave Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY_NOTE__OCTAVE_OFFSET = NOTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Octave Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY_NOTE__OCTAVE_ABSOLUTE = NOTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Melody Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY_NOTE_FEATURE_COUNT = NOTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Melody Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELODY_NOTE_OPERATION_COUNT = NOTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.CompositeNoteImpl <em>Composite Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.CompositeNoteImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getCompositeNote()
	 * @generated
	 */
	int COMPOSITE_NOTE = 12;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NOTE__DURATION = NOTE__DURATION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NOTE__NOTES = NOTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repeats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NOTE__REPEATS = NOTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NOTE_FEATURE_COUNT = NOTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NOTE_OPERATION_COUNT = NOTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.impl.SectionLayerImpl <em>Section Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.impl.SectionLayerImpl
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getSectionLayer()
	 * @generated
	 */
	int SECTION_LAYER = 13;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LAYER__LAYERS = 0;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LAYER__SECTION = 1;

	/**
	 * The number of structural features of the '<em>Section Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Section Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.BatteryNoteType <em>Battery Note Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.BatteryNoteType
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getBatteryNoteType()
	 * @generated
	 */
	int BATTERY_NOTE_TYPE = 14;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.MelodyNoteType <em>Melody Note Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.MelodyNoteType
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getMelodyNoteType()
	 * @generated
	 */
	int MELODY_NOTE_TYPE = 15;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.Instruments <em>Instruments</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.Instruments
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getInstruments()
	 * @generated
	 */
	int INSTRUMENTS = 16;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.model.rhythm.Duration <em>Duration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.model.rhythm.Duration
	 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 17;

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.polytech.dsl.model.rhythm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.polytech.dsl.model.rhythm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.Music <em>Music</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Music</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Music
	 * @generated
	 */
	EClass getMusic();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.dsl.model.rhythm.Music#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Music#getTracks()
	 * @see #getMusic()
	 * @generated
	 */
	EReference getMusic_Tracks();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.dsl.model.rhythm.Music#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Music#getSections()
	 * @see #getMusic()
	 * @generated
	 */
	EReference getMusic_Sections();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.Music#getSoundBankPath <em>Sound Bank Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sound Bank Path</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Music#getSoundBankPath()
	 * @see #getMusic()
	 * @generated
	 */
	EAttribute getMusic_SoundBankPath();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the containment reference '{@link fr.polytech.dsl.model.rhythm.Track#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instrument</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Track#getInstrument()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Instrument();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.Section#getTempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tempo</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Section#getTempo()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Tempo();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.Section#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Section#getSignature()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Signature();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.Section#getBars <em>Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bars</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Section#getBars()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Bars();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.Instrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrument</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Instrument
	 * @generated
	 */
	EClass getInstrument();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.dsl.model.rhythm.Instrument#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Instrument#getLayers()
	 * @see #getInstrument()
	 * @generated
	 */
	EReference getInstrument_Layers();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.dsl.model.rhythm.Instrument#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Instrument#getSections()
	 * @see #getInstrument()
	 * @generated
	 */
	EReference getInstrument_Sections();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Battery
	 * @generated
	 */
	EClass getBattery();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.Melody <em>Melody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Melody</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Melody
	 * @generated
	 */
	EClass getMelody();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.Melody#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instrument</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Melody#getInstrument()
	 * @see #getMelody()
	 * @generated
	 */
	EAttribute getMelody_Instrument();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.Melody#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Melody#getOther()
	 * @see #getMelody()
	 * @generated
	 */
	EAttribute getMelody_Other();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.Note#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Note#getDuration()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Duration();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.BatteryNote <em>Battery Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Note</em>'.
	 * @see fr.polytech.dsl.model.rhythm.BatteryNote
	 * @generated
	 */
	EClass getBatteryNote();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.BatteryNote#getNoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Type</em>'.
	 * @see fr.polytech.dsl.model.rhythm.BatteryNote#getNoteType()
	 * @see #getBatteryNote()
	 * @generated
	 */
	EAttribute getBatteryNote_NoteType();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.EmptyNote <em>Empty Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Note</em>'.
	 * @see fr.polytech.dsl.model.rhythm.EmptyNote
	 * @generated
	 */
	EClass getEmptyNote();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.dsl.model.rhythm.Layer#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Layer#getNotes()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Notes();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.MelodyNote <em>Melody Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Melody Note</em>'.
	 * @see fr.polytech.dsl.model.rhythm.MelodyNote
	 * @generated
	 */
	EClass getMelodyNote();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.MelodyNote#getNoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Type</em>'.
	 * @see fr.polytech.dsl.model.rhythm.MelodyNote#getNoteType()
	 * @see #getMelodyNote()
	 * @generated
	 */
	EAttribute getMelodyNote_NoteType();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.MelodyNote#getOctaveOffset <em>Octave Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Octave Offset</em>'.
	 * @see fr.polytech.dsl.model.rhythm.MelodyNote#getOctaveOffset()
	 * @see #getMelodyNote()
	 * @generated
	 */
	EAttribute getMelodyNote_OctaveOffset();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.MelodyNote#getOctaveAbsolute <em>Octave Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Octave Absolute</em>'.
	 * @see fr.polytech.dsl.model.rhythm.MelodyNote#getOctaveAbsolute()
	 * @see #getMelodyNote()
	 * @generated
	 */
	EAttribute getMelodyNote_OctaveAbsolute();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.CompositeNote <em>Composite Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Note</em>'.
	 * @see fr.polytech.dsl.model.rhythm.CompositeNote
	 * @generated
	 */
	EClass getCompositeNote();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.dsl.model.rhythm.CompositeNote#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see fr.polytech.dsl.model.rhythm.CompositeNote#getNotes()
	 * @see #getCompositeNote()
	 * @generated
	 */
	EReference getCompositeNote_Notes();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.model.rhythm.CompositeNote#getRepeats <em>Repeats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeats</em>'.
	 * @see fr.polytech.dsl.model.rhythm.CompositeNote#getRepeats()
	 * @see #getCompositeNote()
	 * @generated
	 */
	EAttribute getCompositeNote_Repeats();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.model.rhythm.SectionLayer <em>Section Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Layer</em>'.
	 * @see fr.polytech.dsl.model.rhythm.SectionLayer
	 * @generated
	 */
	EClass getSectionLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.dsl.model.rhythm.SectionLayer#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see fr.polytech.dsl.model.rhythm.SectionLayer#getLayers()
	 * @see #getSectionLayer()
	 * @generated
	 */
	EReference getSectionLayer_Layers();

	/**
	 * Returns the meta object for the reference '{@link fr.polytech.dsl.model.rhythm.SectionLayer#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section</em>'.
	 * @see fr.polytech.dsl.model.rhythm.SectionLayer#getSection()
	 * @see #getSectionLayer()
	 * @generated
	 */
	EReference getSectionLayer_Section();

	/**
	 * Returns the meta object for enum '{@link fr.polytech.dsl.model.rhythm.BatteryNoteType <em>Battery Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Battery Note Type</em>'.
	 * @see fr.polytech.dsl.model.rhythm.BatteryNoteType
	 * @generated
	 */
	EEnum getBatteryNoteType();

	/**
	 * Returns the meta object for enum '{@link fr.polytech.dsl.model.rhythm.MelodyNoteType <em>Melody Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Melody Note Type</em>'.
	 * @see fr.polytech.dsl.model.rhythm.MelodyNoteType
	 * @generated
	 */
	EEnum getMelodyNoteType();

	/**
	 * Returns the meta object for enum '{@link fr.polytech.dsl.model.rhythm.Instruments <em>Instruments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instruments</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Instruments
	 * @generated
	 */
	EEnum getInstruments();

	/**
	 * Returns the meta object for enum '{@link fr.polytech.dsl.model.rhythm.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duration</em>'.
	 * @see fr.polytech.dsl.model.rhythm.Duration
	 * @generated
	 */
	EEnum getDuration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RhythmFactory getRhythmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.NamedElementImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.MusicImpl <em>Music</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.MusicImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getMusic()
		 * @generated
		 */
		EClass MUSIC = eINSTANCE.getMusic();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUSIC__TRACKS = eINSTANCE.getMusic_Tracks();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUSIC__SECTIONS = eINSTANCE.getMusic_Sections();

		/**
		 * The meta object literal for the '<em><b>Sound Bank Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC__SOUND_BANK_PATH = eINSTANCE.getMusic_SoundBankPath();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.TrackImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Instrument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__INSTRUMENT = eINSTANCE.getTrack_Instrument();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.SectionImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Tempo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__TEMPO = eINSTANCE.getSection_Tempo();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__SIGNATURE = eINSTANCE.getSection_Signature();

		/**
		 * The meta object literal for the '<em><b>Bars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__BARS = eINSTANCE.getSection_Bars();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.InstrumentImpl <em>Instrument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.InstrumentImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getInstrument()
		 * @generated
		 */
		EClass INSTRUMENT = eINSTANCE.getInstrument();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUMENT__LAYERS = eINSTANCE.getInstrument_Layers();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUMENT__SECTIONS = eINSTANCE.getInstrument_Sections();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.BatteryImpl <em>Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.BatteryImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getBattery()
		 * @generated
		 */
		EClass BATTERY = eINSTANCE.getBattery();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.MelodyImpl <em>Melody</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.MelodyImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getMelody()
		 * @generated
		 */
		EClass MELODY = eINSTANCE.getMelody();

		/**
		 * The meta object literal for the '<em><b>Instrument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELODY__INSTRUMENT = eINSTANCE.getMelody_Instrument();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELODY__OTHER = eINSTANCE.getMelody_Other();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.Note <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.Note
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DURATION = eINSTANCE.getNote_Duration();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.BatteryNoteImpl <em>Battery Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.BatteryNoteImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getBatteryNote()
		 * @generated
		 */
		EClass BATTERY_NOTE = eINSTANCE.getBatteryNote();

		/**
		 * The meta object literal for the '<em><b>Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_NOTE__NOTE_TYPE = eINSTANCE.getBatteryNote_NoteType();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.EmptyNoteImpl <em>Empty Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.EmptyNoteImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getEmptyNote()
		 * @generated
		 */
		EClass EMPTY_NOTE = eINSTANCE.getEmptyNote();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.LayerImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__NOTES = eINSTANCE.getLayer_Notes();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.MelodyNoteImpl <em>Melody Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.MelodyNoteImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getMelodyNote()
		 * @generated
		 */
		EClass MELODY_NOTE = eINSTANCE.getMelodyNote();

		/**
		 * The meta object literal for the '<em><b>Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELODY_NOTE__NOTE_TYPE = eINSTANCE.getMelodyNote_NoteType();

		/**
		 * The meta object literal for the '<em><b>Octave Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELODY_NOTE__OCTAVE_OFFSET = eINSTANCE.getMelodyNote_OctaveOffset();

		/**
		 * The meta object literal for the '<em><b>Octave Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELODY_NOTE__OCTAVE_ABSOLUTE = eINSTANCE.getMelodyNote_OctaveAbsolute();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.CompositeNoteImpl <em>Composite Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.CompositeNoteImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getCompositeNote()
		 * @generated
		 */
		EClass COMPOSITE_NOTE = eINSTANCE.getCompositeNote();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NOTE__NOTES = eINSTANCE.getCompositeNote_Notes();

		/**
		 * The meta object literal for the '<em><b>Repeats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_NOTE__REPEATS = eINSTANCE.getCompositeNote_Repeats();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.impl.SectionLayerImpl <em>Section Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.impl.SectionLayerImpl
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getSectionLayer()
		 * @generated
		 */
		EClass SECTION_LAYER = eINSTANCE.getSectionLayer();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_LAYER__LAYERS = eINSTANCE.getSectionLayer_Layers();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_LAYER__SECTION = eINSTANCE.getSectionLayer_Section();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.BatteryNoteType <em>Battery Note Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.BatteryNoteType
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getBatteryNoteType()
		 * @generated
		 */
		EEnum BATTERY_NOTE_TYPE = eINSTANCE.getBatteryNoteType();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.MelodyNoteType <em>Melody Note Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.MelodyNoteType
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getMelodyNoteType()
		 * @generated
		 */
		EEnum MELODY_NOTE_TYPE = eINSTANCE.getMelodyNoteType();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.Instruments <em>Instruments</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.Instruments
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getInstruments()
		 * @generated
		 */
		EEnum INSTRUMENTS = eINSTANCE.getInstruments();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.model.rhythm.Duration <em>Duration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.model.rhythm.Duration
		 * @see fr.polytech.dsl.model.rhythm.impl.RhythmPackageImpl#getDuration()
		 * @generated
		 */
		EEnum DURATION = eINSTANCE.getDuration();

	}

} //RhythmPackage
