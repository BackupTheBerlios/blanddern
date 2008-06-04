/**
 * <copyright>
 * </copyright>
 *
 * $Id: Matching.java,v 1.6 2008/06/04 11:48:40 scheerj Exp $
 */
package adaptor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptor.Matching#getCorrespondanceRule <em>Correspondance Rule</em>}</li>
 *   <li>{@link adaptor.Matching#getComposed <em>Composed</em>}</li>
 *   <li>{@link adaptor.Matching#getLhs <em>Lhs</em>}</li>
 *   <li>{@link adaptor.Matching#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptor.AdaptorPackage#getMatching()
 * @model
 * @generated
 */
public interface Matching extends EObject {
	/**
	 * Returns the value of the '<em><b>Correspondance Rule</b></em>' containment reference list.
	 * The list contents are of type {@link adaptor.CorrespondanceRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspondance Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspondance Rule</em>' containment reference list.
	 * @see adaptor.AdaptorPackage#getMatching_CorrespondanceRule()
	 * @model containment="true"
	 * @generated
	 */
	EList<CorrespondanceRule> getCorrespondanceRule();

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
	 * @see adaptor.AdaptorPackage#getMatching_Composed()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getComposed();

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(LhsPattern)
	 * @see adaptor.AdaptorPackage#getMatching_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LhsPattern getLhs();

	/**
	 * Sets the value of the '{@link adaptor.Matching#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(LhsPattern value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference list.
	 * The list contents are of type {@link adaptor.RhsPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference list.
	 * @see adaptor.AdaptorPackage#getMatching_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	EList<RhsPattern> getRhs();

} // Matching
