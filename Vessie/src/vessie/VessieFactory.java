/**
 * <copyright>
 * </copyright>
 *
 * $Id: VessieFactory.java,v 1.1 2008/05/16 07:01:05 scheerj Exp $
 */
package vessie;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vessie.VessiePackage
 * @generated
 */
public interface VessieFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VessieFactory eINSTANCE = vessie.impl.VessieFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vessie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vessie</em>'.
	 * @generated
	 */
	Vessie createVessie();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VessiePackage getVessiePackage();

} //VessieFactory
