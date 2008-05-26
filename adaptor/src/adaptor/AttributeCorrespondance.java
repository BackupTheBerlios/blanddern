/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeCorrespondance.java,v 1.1 2008/05/26 07:05:10 scheerj Exp $
 */
package adaptor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Correspondance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptor.AttributeCorrespondance#getSrc <em>Src</em>}</li>
 *   <li>{@link adaptor.AttributeCorrespondance#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptor.AdaptorPackage#getAttributeCorrespondance()
 * @model
 * @generated
 */
public interface AttributeCorrespondance extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(EAttribute)
	 * @see adaptor.AdaptorPackage#getAttributeCorrespondance_Src()
	 * @model
	 * @generated
	 */
	EAttribute getSrc();

	/**
	 * Sets the value of the '{@link adaptor.AttributeCorrespondance#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EAttribute)
	 * @see adaptor.AdaptorPackage#getAttributeCorrespondance_Target()
	 * @model
	 * @generated
	 */
	EAttribute getTarget();

	/**
	 * Sets the value of the '{@link adaptor.AttributeCorrespondance#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EAttribute value);

} // AttributeCorrespondance
