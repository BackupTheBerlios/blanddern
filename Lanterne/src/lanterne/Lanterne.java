/**
 * <copyright>
 * </copyright>
 *
 * $Id: Lanterne.java,v 1.1 2008/05/16 06:59:56 scheerj Exp $
 */
package lanterne;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lanterne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lanterne.Lanterne#getIntensite <em>Intensite</em>}</li>
 *   <li>{@link lanterne.Lanterne#getLuminosite <em>Luminosite</em>}</li>
 * </ul>
 * </p>
 *
 * @see lanterne.LanternePackage#getLanterne()
 * @model
 * @generated
 */
public interface Lanterne extends EObject {
	/**
	 * Returns the value of the '<em><b>Intensite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intensite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intensite</em>' attribute.
	 * @see #setIntensite(int)
	 * @see lanterne.LanternePackage#getLanterne_Intensite()
	 * @model
	 * @generated
	 */
	int getIntensite();

	/**
	 * Sets the value of the '{@link lanterne.Lanterne#getIntensite <em>Intensite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensite</em>' attribute.
	 * @see #getIntensite()
	 * @generated
	 */
	void setIntensite(int value);

	/**
	 * Returns the value of the '<em><b>Luminosite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminosite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminosite</em>' attribute.
	 * @see #setLuminosite(String)
	 * @see lanterne.LanternePackage#getLanterne_Luminosite()
	 * @model
	 * @generated
	 */
	String getLuminosite();

	/**
	 * Sets the value of the '{@link lanterne.Lanterne#getLuminosite <em>Luminosite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminosite</em>' attribute.
	 * @see #getLuminosite()
	 * @generated
	 */
	void setLuminosite(String value);

} // Lanterne
