/**
 * <copyright>
 * </copyright>
 *
 * $Id: LanternePackage.java,v 1.2 2008/06/04 11:50:10 scheerj Exp $
 */
package lanterne;

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
 * @see lanterne.LanterneFactory
 * @model kind="package"
 * @generated
 */
public interface LanternePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lanterne";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lanterne";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lanterne";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LanternePackage eINSTANCE = lanterne.impl.LanternePackageImpl.init();

	/**
	 * The meta object id for the '{@link lanterne.impl.LanterneImpl <em>Lanterne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lanterne.impl.LanterneImpl
	 * @see lanterne.impl.LanternePackageImpl#getLanterne()
	 * @generated
	 */
	int LANTERNE = 0;

	/**
	 * The feature id for the '<em><b>Intensite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANTERNE__INTENSITE = 0;

	/**
	 * The feature id for the '<em><b>Luminosite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANTERNE__LUMINOSITE = 1;

	/**
	 * The number of structural features of the '<em>Lanterne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANTERNE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link lanterne.Lanterne <em>Lanterne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lanterne</em>'.
	 * @see lanterne.Lanterne
	 * @generated
	 */
	EClass getLanterne();

	/**
	 * Returns the meta object for the attribute '{@link lanterne.Lanterne#getIntensite <em>Intensite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intensite</em>'.
	 * @see lanterne.Lanterne#getIntensite()
	 * @see #getLanterne()
	 * @generated
	 */
	EAttribute getLanterne_Intensite();

	/**
	 * Returns the meta object for the attribute '{@link lanterne.Lanterne#getLuminosite <em>Luminosite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luminosite</em>'.
	 * @see lanterne.Lanterne#getLuminosite()
	 * @see #getLanterne()
	 * @generated
	 */
	EAttribute getLanterne_Luminosite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LanterneFactory getLanterneFactory();

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
		 * The meta object literal for the '{@link lanterne.impl.LanterneImpl <em>Lanterne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lanterne.impl.LanterneImpl
		 * @see lanterne.impl.LanternePackageImpl#getLanterne()
		 * @generated
		 */
		EClass LANTERNE = eINSTANCE.getLanterne();

		/**
		 * The meta object literal for the '<em><b>Intensite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANTERNE__INTENSITE = eINSTANCE.getLanterne_Intensite();

		/**
		 * The meta object literal for the '<em><b>Luminosite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANTERNE__LUMINOSITE = eINSTANCE.getLanterne_Luminosite();

	}

} //LanternePackage
