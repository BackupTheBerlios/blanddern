/**
 * <copyright>
 * </copyright>
 *
 * $Id: VessiePackage.java,v 1.2 2008/05/26 13:48:28 scheerj Exp $
 */
package vessie;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vessie.VessieFactory
 * @model kind="package"
 * @generated
 */
public interface VessiePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vessie";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://vessie";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vessie";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VessiePackage eINSTANCE = vessie.impl.VessiePackageImpl.init();

	/**
	 * The meta object id for the '{@link vessie.impl.VessieImpl <em>Vessie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vessie.impl.VessieImpl
	 * @see vessie.impl.VessiePackageImpl#getVessie()
	 * @generated
	 */
	int VESSIE = 0;

	/**
	 * The feature id for the '<em><b>Contenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSIE__CONTENANCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSIE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Vessie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSIE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link vessie.Vessie <em>Vessie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vessie</em>'.
	 * @see vessie.Vessie
	 * @generated
	 */
	EClass getVessie();

	/**
	 * Returns the meta object for the attribute '{@link vessie.Vessie#getContenance <em>Contenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenance</em>'.
	 * @see vessie.Vessie#getContenance()
	 * @see #getVessie()
	 * @generated
	 */
	EAttribute getVessie_Contenance();

	/**
	 * Returns the meta object for the attribute '{@link vessie.Vessie#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vessie.Vessie#getName()
	 * @see #getVessie()
	 * @generated
	 */
	EAttribute getVessie_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VessieFactory getVessieFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link vessie.impl.VessieImpl <em>Vessie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vessie.impl.VessieImpl
		 * @see vessie.impl.VessiePackageImpl#getVessie()
		 * @generated
		 */
		EClass VESSIE = eINSTANCE.getVessie();

		/**
		 * The meta object literal for the '<em><b>Contenance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSIE__CONTENANCE = eINSTANCE.getVessie_Contenance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSIE__NAME = eINSTANCE.getVessie_Name();

	}

} //VessiePackage
