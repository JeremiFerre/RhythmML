/**
 */
package fr.polytech.dsl.model.rhythm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.dsl.model.rhythm.SectionLayer#getLayers <em>Layers</em>}</li>
 *   <li>{@link fr.polytech.dsl.model.rhythm.SectionLayer#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getSectionLayer()
 * @model
 * @generated
 */
public interface SectionLayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link fr.polytech.dsl.model.rhythm.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getSectionLayer_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

	/**
	 * Returns the value of the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' reference.
	 * @see #setSection(Section)
	 * @see fr.polytech.dsl.model.rhythm.RhythmPackage#getSectionLayer_Section()
	 * @model required="true"
	 * @generated
	 */
	Section getSection();

	/**
	 * Sets the value of the '{@link fr.polytech.dsl.model.rhythm.SectionLayer#getSection <em>Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' reference.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(Section value);

} // SectionLayer
