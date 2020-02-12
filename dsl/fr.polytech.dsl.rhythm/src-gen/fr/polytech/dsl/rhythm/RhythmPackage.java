/**
 */
package fr.polytech.dsl.rhythm;

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
 * @see fr.polytech.dsl.rhythm.RhythmFactory
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
	RhythmPackage eINSTANCE = fr.polytech.dsl.rhythm.impl.RhythmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.rhythm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.rhythm.impl.NamedElementImpl
	 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link fr.polytech.dsl.rhythm.impl.MusicImpl <em>Music</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.rhythm.impl.MusicImpl
	 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getMusic()
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
	 * The number of structural features of the '<em>Music</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Music</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.rhythm.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.rhythm.impl.TrackImpl
	 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getTrack()
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
	 * The meta object id for the '{@link fr.polytech.dsl.rhythm.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.rhythm.impl.SectionImpl
	 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getSection()
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
	 * The meta object id for the '{@link fr.polytech.dsl.rhythm.impl.InstrumentImpl <em>Instrument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.rhythm.impl.InstrumentImpl
	 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getInstrument()
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
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT__NOTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.rhythm.impl.BatteryImpl <em>Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.rhythm.impl.BatteryImpl
	 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getBattery()
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
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__NOTES = INSTRUMENT__NOTES;

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
	 * The meta object id for the '{@link fr.polytech.dsl.rhythm.impl.PianoImpl <em>Piano</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.rhythm.impl.PianoImpl
	 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getPiano()
	 * @generated
	 */
	int PIANO = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIANO__NAME = INSTRUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIANO__NOTES = INSTRUMENT__NOTES;

	/**
	 * The number of structural features of the '<em>Piano</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIANO_FEATURE_COUNT = INSTRUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Piano</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIANO_OPERATION_COUNT = INSTRUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.rhythm.Note <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.rhythm.Note
	 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 7;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.polytech.dsl.rhythm.impl.BatteryNoteImpl <em>Battery Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.rhythm.impl.BatteryNoteImpl
	 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getBatteryNote()
	 * @generated
	 */
	int BATTERY_NOTE = 8;

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
	 * The meta object id for the '{@link fr.polytech.dsl.rhythm.impl.EmptyNoteImpl <em>Empty Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.rhythm.impl.EmptyNoteImpl
	 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getEmptyNote()
	 * @generated
	 */
	int EMPTY_NOTE = 9;

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
	 * The meta object id for the '{@link fr.polytech.dsl.rhythm.BatteryNoteType <em>Battery Note Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.dsl.rhythm.BatteryNoteType
	 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getBatteryNoteType()
	 * @generated
	 */
	int BATTERY_NOTE_TYPE = 10;

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.rhythm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.polytech.dsl.rhythm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.rhythm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.polytech.dsl.rhythm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.rhythm.Music <em>Music</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Music</em>'.
	 * @see fr.polytech.dsl.rhythm.Music
	 * @generated
	 */
	EClass getMusic();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.dsl.rhythm.Music#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see fr.polytech.dsl.rhythm.Music#getTracks()
	 * @see #getMusic()
	 * @generated
	 */
	EReference getMusic_Tracks();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.dsl.rhythm.Music#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see fr.polytech.dsl.rhythm.Music#getSections()
	 * @see #getMusic()
	 * @generated
	 */
	EReference getMusic_Sections();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.rhythm.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see fr.polytech.dsl.rhythm.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the containment reference '{@link fr.polytech.dsl.rhythm.Track#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instrument</em>'.
	 * @see fr.polytech.dsl.rhythm.Track#getInstrument()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Instrument();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.rhythm.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see fr.polytech.dsl.rhythm.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.rhythm.Section#getTempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tempo</em>'.
	 * @see fr.polytech.dsl.rhythm.Section#getTempo()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Tempo();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.rhythm.Section#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see fr.polytech.dsl.rhythm.Section#getSignature()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Signature();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.rhythm.Section#getBars <em>Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bars</em>'.
	 * @see fr.polytech.dsl.rhythm.Section#getBars()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Bars();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.rhythm.Instrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrument</em>'.
	 * @see fr.polytech.dsl.rhythm.Instrument
	 * @generated
	 */
	EClass getInstrument();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.dsl.rhythm.Instrument#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see fr.polytech.dsl.rhythm.Instrument#getNotes()
	 * @see #getInstrument()
	 * @generated
	 */
	EReference getInstrument_Notes();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.rhythm.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery</em>'.
	 * @see fr.polytech.dsl.rhythm.Battery
	 * @generated
	 */
	EClass getBattery();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.rhythm.Piano <em>Piano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piano</em>'.
	 * @see fr.polytech.dsl.rhythm.Piano
	 * @generated
	 */
	EClass getPiano();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.rhythm.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see fr.polytech.dsl.rhythm.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.rhythm.BatteryNote <em>Battery Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Note</em>'.
	 * @see fr.polytech.dsl.rhythm.BatteryNote
	 * @generated
	 */
	EClass getBatteryNote();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.dsl.rhythm.BatteryNote#getNoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Type</em>'.
	 * @see fr.polytech.dsl.rhythm.BatteryNote#getNoteType()
	 * @see #getBatteryNote()
	 * @generated
	 */
	EAttribute getBatteryNote_NoteType();

	/**
	 * Returns the meta object for class '{@link fr.polytech.dsl.rhythm.EmptyNote <em>Empty Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Note</em>'.
	 * @see fr.polytech.dsl.rhythm.EmptyNote
	 * @generated
	 */
	EClass getEmptyNote();

	/**
	 * Returns the meta object for enum '{@link fr.polytech.dsl.rhythm.BatteryNoteType <em>Battery Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Battery Note Type</em>'.
	 * @see fr.polytech.dsl.rhythm.BatteryNoteType
	 * @generated
	 */
	EEnum getBatteryNoteType();

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
		 * The meta object literal for the '{@link fr.polytech.dsl.rhythm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.rhythm.impl.NamedElementImpl
		 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link fr.polytech.dsl.rhythm.impl.MusicImpl <em>Music</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.rhythm.impl.MusicImpl
		 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getMusic()
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
		 * The meta object literal for the '{@link fr.polytech.dsl.rhythm.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.rhythm.impl.TrackImpl
		 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getTrack()
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
		 * The meta object literal for the '{@link fr.polytech.dsl.rhythm.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.rhythm.impl.SectionImpl
		 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getSection()
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
		 * The meta object literal for the '{@link fr.polytech.dsl.rhythm.impl.InstrumentImpl <em>Instrument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.rhythm.impl.InstrumentImpl
		 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getInstrument()
		 * @generated
		 */
		EClass INSTRUMENT = eINSTANCE.getInstrument();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUMENT__NOTES = eINSTANCE.getInstrument_Notes();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.rhythm.impl.BatteryImpl <em>Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.rhythm.impl.BatteryImpl
		 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getBattery()
		 * @generated
		 */
		EClass BATTERY = eINSTANCE.getBattery();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.rhythm.impl.PianoImpl <em>Piano</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.rhythm.impl.PianoImpl
		 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getPiano()
		 * @generated
		 */
		EClass PIANO = eINSTANCE.getPiano();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.rhythm.Note <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.rhythm.Note
		 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.rhythm.impl.BatteryNoteImpl <em>Battery Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.rhythm.impl.BatteryNoteImpl
		 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getBatteryNote()
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
		 * The meta object literal for the '{@link fr.polytech.dsl.rhythm.impl.EmptyNoteImpl <em>Empty Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.rhythm.impl.EmptyNoteImpl
		 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getEmptyNote()
		 * @generated
		 */
		EClass EMPTY_NOTE = eINSTANCE.getEmptyNote();

		/**
		 * The meta object literal for the '{@link fr.polytech.dsl.rhythm.BatteryNoteType <em>Battery Note Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.dsl.rhythm.BatteryNoteType
		 * @see fr.polytech.dsl.rhythm.impl.RhythmPackageImpl#getBatteryNoteType()
		 * @generated
		 */
		EEnum BATTERY_NOTE_TYPE = eINSTANCE.getBatteryNoteType();

	}

} //RhythmPackage
