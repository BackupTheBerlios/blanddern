/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjetPackage.java,v 1.1 2008/06/03 13:29:26 scheerj Exp $
 */
package objet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see objet.ObjetFactory
 * @model kind="package"
 * @generated
 */
public interface ObjetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "objet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://objet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "objet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjetPackage eINSTANCE = objet.impl.ObjetPackageImpl.init();

	/**
	 * The meta object id for the '{@link objet.impl.ModeleClassesImpl <em>Modele Classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objet.impl.ModeleClassesImpl
	 * @see objet.impl.ObjetPackageImpl#getModeleClasses()
	 * @generated
	 */
	int MODELE_CLASSES = 0;

	/**
	 * The feature id for the '<em><b>M</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_CLASSES__M = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_CLASSES__NAME = 1;

	/**
	 * The number of structural features of the '<em>Modele Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_CLASSES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link objet.impl.ClasseImpl <em>Classe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objet.impl.ClasseImpl
	 * @see objet.impl.ObjetPackageImpl#getClasse()
	 * @generated
	 */
	int CLASSE = 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__A = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link objet.impl.ProprieteImpl <em>Propriete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objet.impl.ProprieteImpl
	 * @see objet.impl.ObjetPackageImpl#getPropriete()
	 * @generated
	 */
	int PROPRIETE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Propriete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link objet.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objet.impl.RelationImpl
	 * @see objet.impl.ObjetPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = PROPRIETE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = PROPRIETE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = PROPRIETE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link objet.impl.AttributImpl <em>Attribut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objet.impl.AttributImpl
	 * @see objet.impl.ObjetPackageImpl#getAttribut()
	 * @generated
	 */
	int ATTRIBUT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__NAME = PROPRIETE__NAME;

	/**
	 * The number of structural features of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_FEATURE_COUNT = PROPRIETE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link objet.ModeleClasses <em>Modele Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modele Classes</em>'.
	 * @see objet.ModeleClasses
	 * @generated
	 */
	EClass getModeleClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link objet.ModeleClasses#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>M</em>'.
	 * @see objet.ModeleClasses#getM()
	 * @see #getModeleClasses()
	 * @generated
	 */
	EReference getModeleClasses_M();

	/**
	 * Returns the meta object for the attribute '{@link objet.ModeleClasses#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objet.ModeleClasses#getName()
	 * @see #getModeleClasses()
	 * @generated
	 */
	EAttribute getModeleClasses_Name();

	/**
	 * Returns the meta object for class '{@link objet.Classe <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classe</em>'.
	 * @see objet.Classe
	 * @generated
	 */
	EClass getClasse();

	/**
	 * Returns the meta object for the containment reference list '{@link objet.Classe#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see objet.Classe#getA()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_A();

	/**
	 * Returns the meta object for the attribute '{@link objet.Classe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objet.Classe#getName()
	 * @see #getClasse()
	 * @generated
	 */
	EAttribute getClasse_Name();

	/**
	 * Returns the meta object for class '{@link objet.Propriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriete</em>'.
	 * @see objet.Propriete
	 * @generated
	 */
	EClass getPropriete();

	/**
	 * Returns the meta object for the attribute '{@link objet.Propriete#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objet.Propriete#getName()
	 * @see #getPropriete()
	 * @generated
	 */
	EAttribute getPropriete_Name();

	/**
	 * Returns the meta object for class '{@link objet.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see objet.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link objet.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see objet.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Type();

	/**
	 * Returns the meta object for class '{@link objet.Attribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribut</em>'.
	 * @see objet.Attribut
	 * @generated
	 */
	EClass getAttribut();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObjetFactory getObjetFactory();

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
		 * The meta object literal for the '{@link objet.impl.ModeleClassesImpl <em>Modele Classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objet.impl.ModeleClassesImpl
		 * @see objet.impl.ObjetPackageImpl#getModeleClasses()
		 * @generated
		 */
		EClass MODELE_CLASSES = eINSTANCE.getModeleClasses();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELE_CLASSES__M = eINSTANCE.getModeleClasses_M();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELE_CLASSES__NAME = eINSTANCE.getModeleClasses_Name();

		/**
		 * The meta object literal for the '{@link objet.impl.ClasseImpl <em>Classe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objet.impl.ClasseImpl
		 * @see objet.impl.ObjetPackageImpl#getClasse()
		 * @generated
		 */
		EClass CLASSE = eINSTANCE.getClasse();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__A = eINSTANCE.getClasse_A();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSE__NAME = eINSTANCE.getClasse_Name();

		/**
		 * The meta object literal for the '{@link objet.impl.ProprieteImpl <em>Propriete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objet.impl.ProprieteImpl
		 * @see objet.impl.ObjetPackageImpl#getPropriete()
		 * @generated
		 */
		EClass PROPRIETE = eINSTANCE.getPropriete();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRIETE__NAME = eINSTANCE.getPropriete_Name();

		/**
		 * The meta object literal for the '{@link objet.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objet.impl.RelationImpl
		 * @see objet.impl.ObjetPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '{@link objet.impl.AttributImpl <em>Attribut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objet.impl.AttributImpl
		 * @see objet.impl.ObjetPackageImpl#getAttribut()
		 * @generated
		 */
		EClass ATTRIBUT = eINSTANCE.getAttribut();

	}

} //ObjetPackage
