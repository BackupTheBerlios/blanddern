/**
 * <copyright>
 * </copyright>
 *
 * $Id: Adaptor.java,v 1.3 2009/07/10 17:23:14 bcoppe Exp $
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
 *   <li>{@link adaptor.Adaptor#getEltGraph <em>Elt Graph</em>}</li>
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
	 * @model containment="true"
	 * @generated
	 */
	EList<Matching> getMatching();

	/**
	 * Returns the value of the '<em><b>Elt Graph</b></em>' containment reference list.
	 * The list contents are of type {@link adaptor.Indiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elt Graph</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elt Graph</em>' containment reference list.
	 * @see adaptor.AdaptorPackage#getAdaptor_EltGraph()
	 * @model containment="true"
	 * @generated
	 */
	EList<Indiagram> getEltGraph();

} // Adaptor
