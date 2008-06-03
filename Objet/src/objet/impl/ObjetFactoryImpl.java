/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjetFactoryImpl.java,v 1.1 2008/06/03 13:29:26 scheerj Exp $
 */
package objet.impl;

import objet.*;

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
public class ObjetFactoryImpl extends EFactoryImpl implements ObjetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjetFactory init() {
		try {
			ObjetFactory theObjetFactory = (ObjetFactory)EPackage.Registry.INSTANCE.getEFactory("http://objet"); 
			if (theObjetFactory != null) {
				return theObjetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ObjetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjetFactoryImpl() {
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
			case ObjetPackage.MODELE_CLASSES: return createModeleClasses();
			case ObjetPackage.CLASSE: return createClasse();
			case ObjetPackage.PROPRIETE: return createPropriete();
			case ObjetPackage.RELATION: return createRelation();
			case ObjetPackage.ATTRIBUT: return createAttribut();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleClasses createModeleClasses() {
		ModeleClassesImpl modeleClasses = new ModeleClassesImpl();
		return modeleClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classe createClasse() {
		ClasseImpl classe = new ClasseImpl();
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propriete createPropriete() {
		ProprieteImpl propriete = new ProprieteImpl();
		return propriete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribut createAttribut() {
		AttributImpl attribut = new AttributImpl();
		return attribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjetPackage getObjetPackage() {
		return (ObjetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ObjetPackage getPackage() {
		return ObjetPackage.eINSTANCE;
	}

} //ObjetFactoryImpl
