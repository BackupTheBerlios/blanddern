/**
 * <copyright>
 * </copyright>
 *
 * $Id: LanterneFactory.java,v 1.2 2008/06/04 11:50:10 scheerj Exp $
 */
package lanterne;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lanterne.LanternePackage
 * @generated
 */
public interface LanterneFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LanterneFactory eINSTANCE = lanterne.impl.LanterneFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lanterne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lanterne</em>'.
	 * @generated
	 */
	Lanterne createLanterne();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LanternePackage getLanternePackage();

} //LanterneFactory
