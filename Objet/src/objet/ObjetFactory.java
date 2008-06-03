/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjetFactory.java,v 1.1 2008/06/03 13:29:26 scheerj Exp $
 */
package objet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see objet.ObjetPackage
 * @generated
 */
public interface ObjetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjetFactory eINSTANCE = objet.impl.ObjetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modele Classes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modele Classes</em>'.
	 * @generated
	 */
	ModeleClasses createModeleClasses();

	/**
	 * Returns a new object of class '<em>Classe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classe</em>'.
	 * @generated
	 */
	Classe createClasse();

	/**
	 * Returns a new object of class '<em>Propriete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propriete</em>'.
	 * @generated
	 */
	Propriete createPropriete();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>Attribut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribut</em>'.
	 * @generated
	 */
	Attribut createAttribut();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ObjetPackage getObjetPackage();

} //ObjetFactory
