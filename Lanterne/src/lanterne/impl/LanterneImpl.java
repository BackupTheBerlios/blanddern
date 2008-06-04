/**
 * <copyright>
 * </copyright>
 *
 * $Id: LanterneImpl.java,v 1.2 2008/06/04 11:50:10 scheerj Exp $
 */
package lanterne.impl;

import lanterne.Lanterne;
import lanterne.LanternePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lanterne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lanterne.impl.LanterneImpl#getIntensite <em>Intensite</em>}</li>
 *   <li>{@link lanterne.impl.LanterneImpl#getLuminosite <em>Luminosite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanterneImpl extends EObjectImpl implements Lanterne {
	/**
	 * The default value of the '{@link #getIntensite() <em>Intensite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensite()
	 * @generated
	 * @ordered
	 */
	protected static final int INTENSITE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntensite() <em>Intensite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensite()
	 * @generated
	 * @ordered
	 */
	protected int intensite = INTENSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuminosite() <em>Luminosite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminosite()
	 * @generated
	 * @ordered
	 */
	protected static final String LUMINOSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLuminosite() <em>Luminosite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminosite()
	 * @generated
	 * @ordered
	 */
	protected String luminosite = LUMINOSITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanterneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LanternePackage.Literals.LANTERNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntensite() {
		return intensite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensite(int newIntensite) {
		int oldIntensite = intensite;
		intensite = newIntensite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanternePackage.LANTERNE__INTENSITE, oldIntensite, intensite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLuminosite() {
		return luminosite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuminosite(String newLuminosite) {
		String oldLuminosite = luminosite;
		luminosite = newLuminosite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanternePackage.LANTERNE__LUMINOSITE, oldLuminosite, luminosite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LanternePackage.LANTERNE__INTENSITE:
				return new Integer(getIntensite());
			case LanternePackage.LANTERNE__LUMINOSITE:
				return getLuminosite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LanternePackage.LANTERNE__INTENSITE:
				setIntensite(((Integer)newValue).intValue());
				return;
			case LanternePackage.LANTERNE__LUMINOSITE:
				setLuminosite((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LanternePackage.LANTERNE__INTENSITE:
				setIntensite(INTENSITE_EDEFAULT);
				return;
			case LanternePackage.LANTERNE__LUMINOSITE:
				setLuminosite(LUMINOSITE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LanternePackage.LANTERNE__INTENSITE:
				return intensite != INTENSITE_EDEFAULT;
			case LanternePackage.LANTERNE__LUMINOSITE:
				return LUMINOSITE_EDEFAULT == null ? luminosite != null : !LUMINOSITE_EDEFAULT.equals(luminosite);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (intensite: ");
		result.append(intensite);
		result.append(", luminosite: ");
		result.append(luminosite);
		result.append(')');
		return result.toString();
	}

} //LanterneImpl
