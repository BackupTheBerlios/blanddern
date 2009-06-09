/**
 * <copyright>
 * </copyright>
 *
 * $Id: Request.java,v 1.2 2009/06/09 09:01:05 bcoppe Exp $
 */
package adaptor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptor.Request#getExpression <em>Expression</em>}</li>
 *   <li>{@link adaptor.Request#getLangage <em>Langage</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptor.AdaptorPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends Indiagram {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see adaptor.AdaptorPackage#getRequest_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link adaptor.Request#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Langage</b></em>' attribute.
	 * The literals are from the enumeration {@link adaptor.Langage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Langage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langage</em>' attribute.
	 * @see adaptor.Langage
	 * @see #setLangage(Langage)
	 * @see adaptor.AdaptorPackage#getRequest_Langage()
	 * @model
	 * @generated
	 */
	Langage getLangage();

	/**
	 * Sets the value of the '{@link adaptor.Request#getLangage <em>Langage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Langage</em>' attribute.
	 * @see adaptor.Langage
	 * @see #getLangage()
	 * @generated
	 */
	void setLangage(Langage value);

} // Request
