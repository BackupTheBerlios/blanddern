/**
 * <copyright>
 * </copyright>
 *
 * $Id: Vessie.java,v 1.2 2008/05/26 13:48:28 scheerj Exp $
 */
package vessie;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vessie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vessie.Vessie#getContenance <em>Contenance</em>}</li>
 *   <li>{@link vessie.Vessie#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see vessie.VessiePackage#getVessie()
 * @model
 * @generated
 */
public interface Vessie extends EObject {
	/**
	 * Returns the value of the '<em><b>Contenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenance</em>' attribute.
	 * @see #setContenance(int)
	 * @see vessie.VessiePackage#getVessie_Contenance()
	 * @model
	 * @generated
	 */
	int getContenance();

	/**
	 * Sets the value of the '{@link vessie.Vessie#getContenance <em>Contenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenance</em>' attribute.
	 * @see #getContenance()
	 * @generated
	 */
	void setContenance(int value);

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
	 * @see vessie.VessiePackage#getVessie_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vessie.Vessie#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Vessie
