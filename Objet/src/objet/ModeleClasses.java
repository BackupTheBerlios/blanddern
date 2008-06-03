/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModeleClasses.java,v 1.1 2008/06/03 13:29:26 scheerj Exp $
 */
package objet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modele Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link objet.ModeleClasses#getM <em>M</em>}</li>
 *   <li>{@link objet.ModeleClasses#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see objet.ObjetPackage#getModeleClasses()
 * @model
 * @generated
 */
public interface ModeleClasses extends EObject {
	/**
	 * Returns the value of the '<em><b>M</b></em>' containment reference list.
	 * The list contents are of type {@link objet.Classe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M</em>' containment reference list.
	 * @see objet.ObjetPackage#getModeleClasses_M()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classe> getM();

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
	 * @see objet.ObjetPackage#getModeleClasses_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link objet.ModeleClasses#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ModeleClasses
