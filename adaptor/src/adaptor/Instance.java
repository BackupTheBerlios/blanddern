/**
 * <copyright>
 * </copyright>
 *
 * $Id: Instance.java,v 1.4 2008/05/26 09:25:12 scheerj Exp $
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

} // Instance
