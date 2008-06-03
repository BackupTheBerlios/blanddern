/**
 * <copyright>
 * </copyright>
 *
 * $Id: BaseDeDonnees.java,v 1.1 2008/06/03 13:28:42 scheerj Exp $
 */
package bdd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base De Donnees</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bdd.BaseDeDonnees#getD <em>D</em>}</li>
 *   <li>{@link bdd.BaseDeDonnees#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see bdd.BddPackage#getBaseDeDonnees()
 * @model
 * @generated
 */
public interface BaseDeDonnees extends EObject {
	/**
	 * Returns the value of the '<em><b>D</b></em>' containment reference list.
	 * The list contents are of type {@link bdd.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' containment reference list.
	 * @see bdd.BddPackage#getBaseDeDonnees_D()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getD();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bdd.BddPackage#getBaseDeDonnees_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bdd.BaseDeDonnees#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BaseDeDonnees
