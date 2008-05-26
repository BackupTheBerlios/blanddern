/**
 * <copyright>
 * </copyright>
 *
 * $Id: Query.java,v 1.3 2008/05/26 09:25:12 scheerj Exp $
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
 *   <li>{@link adaptor.Query#getProxy <em>Proxy</em>}</li>
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
	 * Returns the value of the '<em><b>Proxy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' containment reference.
	 * @see #setProxy(Proxy)
	 * @see adaptor.AdaptorPackage#getQuery_Proxy()
	 * @model containment="true"
	 * @generated
	 */
	Proxy getProxy();

	/**
	 * Sets the value of the '{@link adaptor.Query#getProxy <em>Proxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' containment reference.
	 * @see #getProxy()
	 * @generated
	 */
	void setProxy(Proxy value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Request)
	 * @see adaptor.AdaptorPackage#getQuery_Request()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Request getRequest();

	/**
	 * Sets the value of the '{@link adaptor.Query#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Request value);

} // Query
