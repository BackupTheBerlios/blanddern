/**
 * <copyright>
 * </copyright>
 *
 * $Id: Instance.java,v 1.7 2008/06/04 11:48:40 scheerj Exp $
 */
package adaptor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptor.Instance#getConcept <em>Concept</em>}</li>
 *   <li>{@link adaptor.Instance#isIsMain <em>Is Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptor.AdaptorPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends Named {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference.
	 * @see #setConcept(EClass)
	 * @see adaptor.AdaptorPackage#getInstance_Concept()
	 * @model
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Sets the value of the '{@link adaptor.Instance#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(EClass value);

	/**
	 * Returns the value of the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Main</em>' attribute.
	 * @see #setIsMain(boolean)
	 * @see adaptor.AdaptorPackage#getInstance_IsMain()
	 * @model
	 * @generated
	 */
	boolean isIsMain();

	/**
	 * Sets the value of the '{@link adaptor.Instance#isIsMain <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Main</em>' attribute.
	 * @see #isIsMain()
	 * @generated
	 */
	void setIsMain(boolean value);

} // Instance
