/**
 * <copyright>
 * </copyright>
 *
 * $Id: VessieImpl.java,v 1.2 2008/05/26 13:48:28 scheerj Exp $
 */
package vessie.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import vessie.Vessie;
import vessie.VessiePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vessie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vessie.impl.VessieImpl#getContenance <em>Contenance</em>}</li>
 *   <li>{@link vessie.impl.VessieImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VessieImpl extends EObjectImpl implements Vessie {
	/**
	 * The default value of the '{@link #getContenance() <em>Contenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenance()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTENANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContenance() <em>Contenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenance()
	 * @generated
	 * @ordered
	 */
	protected int contenance = CONTENANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VessieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VessiePackage.Literals.VESSIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContenance() {
		return contenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenance(int newContenance) {
		int oldContenance = contenance;
		contenance = newContenance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VessiePackage.VESSIE__CONTENANCE, oldContenance, contenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VessiePackage.VESSIE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VessiePackage.VESSIE__CONTENANCE:
				return new Integer(getContenance());
			case VessiePackage.VESSIE__NAME:
				return getName();
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
			case VessiePackage.VESSIE__CONTENANCE:
				setContenance(((Integer)newValue).intValue());
				return;
			case VessiePackage.VESSIE__NAME:
				setName((String)newValue);
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
			case VessiePackage.VESSIE__CONTENANCE:
				setContenance(CONTENANCE_EDEFAULT);
				return;
			case VessiePackage.VESSIE__NAME:
				setName(NAME_EDEFAULT);
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
			case VessiePackage.VESSIE__CONTENANCE:
				return contenance != CONTENANCE_EDEFAULT;
			case VessiePackage.VESSIE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (contenance: ");
		result.append(contenance);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VessieImpl
