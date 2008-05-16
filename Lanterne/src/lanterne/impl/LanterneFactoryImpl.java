/**
 * <copyright>
 * </copyright>
 *
 * $Id: LanterneFactoryImpl.java,v 1.1 2008/05/16 06:59:56 scheerj Exp $
 */
package lanterne.impl;

import lanterne.*;

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
public class LanterneFactoryImpl extends EFactoryImpl implements LanterneFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanterneFactory init() {
		try {
			LanterneFactory theLanterneFactory = (LanterneFactory)EPackage.Registry.INSTANCE.getEFactory("http://lanterne"); 
			if (theLanterneFactory != null) {
				return theLanterneFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LanterneFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanterneFactoryImpl() {
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
			case LanternePackage.LANTERNE: return createLanterne();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lanterne createLanterne() {
		LanterneImpl lanterne = new LanterneImpl();
		return lanterne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanternePackage getLanternePackage() {
		return (LanternePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LanternePackage getPackage() {
		return LanternePackage.eINSTANCE;
	}

} //LanterneFactoryImpl
