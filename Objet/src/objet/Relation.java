/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation.java,v 1.1 2008/06/03 13:29:26 scheerj Exp $
 */
package objet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link objet.Relation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see objet.ObjetPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends Propriete {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classe)
	 * @see objet.ObjetPackage#getRelation_Type()
	 * @model
	 * @generated
	 */
	Classe getType();

	/**
	 * Sets the value of the '{@link objet.Relation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classe value);

} // Relation
