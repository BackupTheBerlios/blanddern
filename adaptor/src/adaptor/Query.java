/**
 * <copyright>
 * </copyright>
 *
 * $Id: Query.java,v 1.1 2008/05/07 13:02:03 fondemen Exp $
 */
package adaptor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptor.Query#getRequest <em>Request</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptor.AdaptorPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject {

	/**
	 * Returns the value of the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' attribute.
	 * @see #setRequest(String)
	 * @see adaptor.AdaptorPackage#getQuery_Request()
	 * @model
	 * @generated
	 */
	String getRequest();

	/**
	 * Sets the value of the '{@link adaptor.Query#getRequest <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' attribute.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(String value);
} // Query
