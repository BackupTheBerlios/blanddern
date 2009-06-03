/**
 * <copyright>
 * </copyright>
 *
 * $Id: Action.java,v 1.1 2009/06/03 07:36:19 bcoppe Exp $
 */
package adaptor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptor.Action#getRequest <em>Request</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptor.AdaptorPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
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
	 * @see adaptor.AdaptorPackage#getAction_Request()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Request getRequest();

	/**
	 * Sets the value of the '{@link adaptor.Action#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Request value);

} // Action
