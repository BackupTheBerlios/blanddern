/**
 * <copyright>
 * </copyright>
 *
 * $Id: VessieContainer.java,v 1.1 2008/06/04 11:49:44 scheerj Exp $
 */
package vessie;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vessie.VessieContainer#getVessies <em>Vessies</em>}</li>
 * </ul>
 * </p>
 *
 * @see vessie.VessiePackage#getVessieContainer()
 * @model
 * @generated
 */
public interface VessieContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Vessies</b></em>' containment reference list.
	 * The list contents are of type {@link vessie.Vessie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vessies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vessies</em>' containment reference list.
	 * @see vessie.VessiePackage#getVessieContainer_Vessies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vessie> getVessies();

} // VessieContainer
