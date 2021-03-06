/**
 */
package fr.polytech.dsl.model.rhythm.util;

import fr.polytech.dsl.model.rhythm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage
 * @generated
 */
public class RhythmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RhythmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RhythmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RhythmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RhythmSwitch<Adapter> modelSwitch = new RhythmSwitch<Adapter>() {
		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseMusic(Music object) {
			return createMusicAdapter();
		}

		@Override
		public Adapter caseTrack(Track object) {
			return createTrackAdapter();
		}

		@Override
		public Adapter caseSection(Section object) {
			return createSectionAdapter();
		}

		@Override
		public Adapter caseInstrument(Instrument object) {
			return createInstrumentAdapter();
		}

		@Override
		public Adapter caseBattery(Battery object) {
			return createBatteryAdapter();
		}

		@Override
		public Adapter caseMelody(Melody object) {
			return createMelodyAdapter();
		}

		@Override
		public Adapter caseNote(Note object) {
			return createNoteAdapter();
		}

		@Override
		public Adapter caseBatteryNote(BatteryNote object) {
			return createBatteryNoteAdapter();
		}

		@Override
		public Adapter caseEmptyNote(EmptyNote object) {
			return createEmptyNoteAdapter();
		}

		@Override
		public Adapter caseLayer(Layer object) {
			return createLayerAdapter();
		}

		@Override
		public Adapter caseMelodyNote(MelodyNote object) {
			return createMelodyNoteAdapter();
		}

		@Override
		public Adapter caseCompositeNote(CompositeNote object) {
			return createCompositeNoteAdapter();
		}

		@Override
		public Adapter caseSectionLayer(SectionLayer object) {
			return createSectionLayerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.Music <em>Music</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.Music
	 * @generated
	 */
	public Adapter createMusicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.Track
	 * @generated
	 */
	public Adapter createTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.Instrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.Instrument
	 * @generated
	 */
	public Adapter createInstrumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.Battery
	 * @generated
	 */
	public Adapter createBatteryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.Melody <em>Melody</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.Melody
	 * @generated
	 */
	public Adapter createMelodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.BatteryNote <em>Battery Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.BatteryNote
	 * @generated
	 */
	public Adapter createBatteryNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.EmptyNote <em>Empty Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.EmptyNote
	 * @generated
	 */
	public Adapter createEmptyNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.MelodyNote <em>Melody Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.MelodyNote
	 * @generated
	 */
	public Adapter createMelodyNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.CompositeNote <em>Composite Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.CompositeNote
	 * @generated
	 */
	public Adapter createCompositeNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.dsl.model.rhythm.SectionLayer <em>Section Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.dsl.model.rhythm.SectionLayer
	 * @generated
	 */
	public Adapter createSectionLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RhythmAdapterFactory
