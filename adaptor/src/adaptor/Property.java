/**
 * <copyright>
 * </copyright>
 *
 * $Id: Property.java,v 1.2 2008/05/16 09:05:06 scheerj Exp $
 */
package adaptor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptor.Property#getSetPart <em>Set Part</em>}</li>
 *   <li>{@link adaptor.Property#getGetPart <em>Get Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptor.AdaptorPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Set Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Part</em>' containment reference.
	 * @see #setSetPart(Action)
	 * @see adaptor.AdaptorPackage#getProperty_SetPart()
	 * @model containment="true"
	 * @generated
	 */
	Action getSetPart();

	/**
	 * Sets the value of the '{@link adaptor.Property#getSetPart <em>Set Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Part</em>' containment reference.
	 * @see #getSetPart()
	 * @generated
	 */
	void setSetPart(Action value);

	/**
	 * Returns the value of the '<em><b>Get Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Part</em>' containment reference.
	 * @see #setGetPart(Query)
	 * @see adaptor.AdaptorPackage#getProperty_GetPart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Query getGetPart();

	/**
	 * Sets the value of the '{@link adaptor.Property#getGetPart <em>Get Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Part</em>' containment reference.
	 * @see #getGetPart()
	 * @generated
	 */
	void setGetPart(Query value);

} // Property
