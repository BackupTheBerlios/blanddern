/**
 * <copyright>
 * </copyright>
 *
 * $Id: CorrespondanceRule.java,v 1.2 2009/06/09 09:01:05 bcoppe Exp $
 */
package adaptor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correspondance Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptor.CorrespondanceRule#getFeature <em>Feature</em>}</li>
 *   <li>{@link adaptor.CorrespondanceRule#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptor.AdaptorPackage#getCorrespondanceRule()
 * @model
 * @generated
 */
public interface CorrespondanceRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see adaptor.AdaptorPackage#getCorrespondanceRule_Feature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link adaptor.CorrespondanceRule#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(Property)
	 * @see adaptor.AdaptorPackage#getCorrespondanceRule_Property()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link adaptor.CorrespondanceRule#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // CorrespondanceRule
