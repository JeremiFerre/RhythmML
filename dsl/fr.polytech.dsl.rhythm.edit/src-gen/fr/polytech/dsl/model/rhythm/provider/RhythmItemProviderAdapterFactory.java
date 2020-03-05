/**
 */
package fr.polytech.dsl.model.rhythm.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import fr.polytech.dsl.model.rhythm.util.RhythmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RhythmItemProviderAdapterFactory extends RhythmAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RhythmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.polytech.dsl.model.rhythm.Music} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MusicItemProvider musicItemProvider;

	/**
	 * This creates an adapter for a {@link fr.polytech.dsl.model.rhythm.Music}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMusicAdapter() {
		if (musicItemProvider == null) {
			musicItemProvider = new MusicItemProvider(this);
		}

		return musicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.polytech.dsl.model.rhythm.Track} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackItemProvider trackItemProvider;

	/**
	 * This creates an adapter for a {@link fr.polytech.dsl.model.rhythm.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrackAdapter() {
		if (trackItemProvider == null) {
			trackItemProvider = new TrackItemProvider(this);
		}

		return trackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.polytech.dsl.model.rhythm.Section} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionItemProvider sectionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.polytech.dsl.model.rhythm.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSectionAdapter() {
		if (sectionItemProvider == null) {
			sectionItemProvider = new SectionItemProvider(this);
		}

		return sectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.polytech.dsl.model.rhythm.Battery} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryItemProvider batteryItemProvider;

	/**
	 * This creates an adapter for a {@link fr.polytech.dsl.model.rhythm.Battery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBatteryAdapter() {
		if (batteryItemProvider == null) {
			batteryItemProvider = new BatteryItemProvider(this);
		}

		return batteryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.polytech.dsl.model.rhythm.Piano} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PianoItemProvider pianoItemProvider;

	/**
	 * This creates an adapter for a {@link fr.polytech.dsl.model.rhythm.Piano}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPianoAdapter() {
		if (pianoItemProvider == null) {
			pianoItemProvider = new PianoItemProvider(this);
		}

		return pianoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.polytech.dsl.model.rhythm.BatteryNote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryNoteItemProvider batteryNoteItemProvider;

	/**
	 * This creates an adapter for a {@link fr.polytech.dsl.model.rhythm.BatteryNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBatteryNoteAdapter() {
		if (batteryNoteItemProvider == null) {
			batteryNoteItemProvider = new BatteryNoteItemProvider(this);
		}

		return batteryNoteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.polytech.dsl.model.rhythm.EmptyNote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmptyNoteItemProvider emptyNoteItemProvider;

	/**
	 * This creates an adapter for a {@link fr.polytech.dsl.model.rhythm.EmptyNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmptyNoteAdapter() {
		if (emptyNoteItemProvider == null) {
			emptyNoteItemProvider = new EmptyNoteItemProvider(this);
		}

		return emptyNoteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.polytech.dsl.model.rhythm.Layer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerItemProvider layerItemProvider;

	/**
	 * This creates an adapter for a {@link fr.polytech.dsl.model.rhythm.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayerAdapter() {
		if (layerItemProvider == null) {
			layerItemProvider = new LayerItemProvider(this);
		}

		return layerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.polytech.dsl.model.rhythm.PianoNote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PianoNoteItemProvider pianoNoteItemProvider;

	/**
	 * This creates an adapter for a {@link fr.polytech.dsl.model.rhythm.PianoNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPianoNoteAdapter() {
		if (pianoNoteItemProvider == null) {
			pianoNoteItemProvider = new PianoNoteItemProvider(this);
		}

		return pianoNoteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.polytech.dsl.model.rhythm.CompositeNote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeNoteItemProvider compositeNoteItemProvider;

	/**
	 * This creates an adapter for a {@link fr.polytech.dsl.model.rhythm.CompositeNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeNoteAdapter() {
		if (compositeNoteItemProvider == null) {
			compositeNoteItemProvider = new CompositeNoteItemProvider(this);
		}

		return compositeNoteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.polytech.dsl.model.rhythm.SectionLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionLayerItemProvider sectionLayerItemProvider;

	/**
	 * This creates an adapter for a {@link fr.polytech.dsl.model.rhythm.SectionLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSectionLayerAdapter() {
		if (sectionLayerItemProvider == null) {
			sectionLayerItemProvider = new SectionLayerItemProvider(this);
		}

		return sectionLayerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (musicItemProvider != null)
			musicItemProvider.dispose();
		if (trackItemProvider != null)
			trackItemProvider.dispose();
		if (sectionItemProvider != null)
			sectionItemProvider.dispose();
		if (batteryItemProvider != null)
			batteryItemProvider.dispose();
		if (pianoItemProvider != null)
			pianoItemProvider.dispose();
		if (batteryNoteItemProvider != null)
			batteryNoteItemProvider.dispose();
		if (emptyNoteItemProvider != null)
			emptyNoteItemProvider.dispose();
		if (layerItemProvider != null)
			layerItemProvider.dispose();
		if (pianoNoteItemProvider != null)
			pianoNoteItemProvider.dispose();
		if (compositeNoteItemProvider != null)
			compositeNoteItemProvider.dispose();
		if (sectionLayerItemProvider != null)
			sectionLayerItemProvider.dispose();
	}

}
