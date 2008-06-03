/**
 * <copyright>
 * </copyright>
 *
 * $Id: BddFactoryImpl.java,v 1.1 2008/06/03 13:28:42 scheerj Exp $
 */
package bdd.impl;

import bdd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BddFactoryImpl extends EFactoryImpl implements BddFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BddFactory init() {
		try {
			BddFactory theBddFactory = (BddFactory)EPackage.Registry.INSTANCE.getEFactory("http://bdd"); 
			if (theBddFactory != null) {
				return theBddFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BddFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BddFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BddPackage.BASE_DE_DONNEES: return createBaseDeDonnees();
			case BddPackage.TABLE: return createTable();
			case BddPackage.COLONNE: return createColonne();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseDeDonnees createBaseDeDonnees() {
		BaseDeDonneesImpl baseDeDonnees = new BaseDeDonneesImpl();
		return baseDeDonnees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colonne createColonne() {
		ColonneImpl colonne = new ColonneImpl();
		return colonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BddPackage getBddPackage() {
		return (BddPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BddPackage getPackage() {
		return BddPackage.eINSTANCE;
	}

} //BddFactoryImpl
