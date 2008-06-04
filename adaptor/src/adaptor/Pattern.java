/**
 * <copyright>
 * </copyright>
 *
 * $Id: Pattern.java,v 1.6 2008/06/04 11:48:40 scheerj Exp $
 */
package adaptor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptor.Pattern#getComposed <em>Composed</em>}</li>
 *   <li>{@link adaptor.Pattern#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptor.AdaptorPackage#getPattern()
 * @model abstract="true"
 * @generated
 */
public interface Pattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Composed</b></em>' containment reference list.
	 * The list contents are of type {@link adaptor.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed</em>' containment reference list.
	 * @see adaptor.AdaptorPackage#getPattern_Composed()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getComposed();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Query)
	 * @see adaptor.AdaptorPackage#getPattern_Query()
	 * @model containment="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link adaptor.Pattern#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

} // Pattern
