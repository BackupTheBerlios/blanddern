/**
 * <copyright>
 * </copyright>
 *
 * $Id: Adaptor.java,v 1.1 2009/06/03 07:36:19 bcoppe Exp $
 */
package adaptor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptor.Adaptor#getMatching <em>Matching</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptor.AdaptorPackage#getAdaptor()
 * @model
 * @generated
 */
public interface Adaptor extends Named {
	/**
	 * Returns the value of the '<em><b>Matching</b></em>' containment reference list.
	 * The list contents are of type {@link adaptor.Matching}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching</em>' containment reference list.
	 * @see adaptor.AdaptorPackage#getAdaptor_Matching()
	 * @model type="adaptor.Matching" containment="true"
	 * @generated
	 */
	EList getMatching();

} // Adaptor
