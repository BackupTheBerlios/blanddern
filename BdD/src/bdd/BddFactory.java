/**
 * <copyright>
 * </copyright>
 *
 * $Id: BddFactory.java,v 1.1 2008/06/03 13:28:42 scheerj Exp $
 */
package bdd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bdd.BddPackage
 * @generated
 */
public interface BddFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BddFactory eINSTANCE = bdd.impl.BddFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Base De Donnees</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base De Donnees</em>'.
	 * @generated
	 */
	BaseDeDonnees createBaseDeDonnees();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Colonne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne</em>'.
	 * @generated
	 */
	Colonne createColonne();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BddPackage getBddPackage();

} //BddFactory
