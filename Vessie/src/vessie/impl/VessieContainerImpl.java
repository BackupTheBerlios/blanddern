/**
 * <copyright>
 * </copyright>
 *
 * $Id: VessieContainerImpl.java,v 1.1 2008/06/04 11:49:44 scheerj Exp $
 */
package vessie.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vessie.Vessie;
import vessie.VessieContainer;
import vessie.VessiePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vessie.impl.VessieContainerImpl#getVessies <em>Vessies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VessieContainerImpl extends EObjectImpl implements VessieContainer {
	/**
	 * The cached value of the '{@link #getVessies() <em>Vessies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVessies()
	 * @generated
	 * @ordered
	 */
	protected EList<Vessie> vessies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VessieContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VessiePackage.Literals.VESSIE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vessie> getVessies() {
		if (vessies == null) {
			vessies = new EObjectContainmentEList<Vessie>(Vessie.class, this, VessiePackage.VESSIE_CONTAINER__VESSIES);
		}
		return vessies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VessiePackage.VESSIE_CONTAINER__VESSIES:
				return ((InternalEList<?>)getVessies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VessiePackage.VESSIE_CONTAINER__VESSIES:
				return getVessies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VessiePackage.VESSIE_CONTAINER__VESSIES:
				getVessies().clear();
				getVessies().addAll((Collection<? extends Vessie>)newValue);
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
			case VessiePackage.VESSIE_CONTAINER__VESSIES:
				getVessies().clear();
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
			case VessiePackage.VESSIE_CONTAINER__VESSIES:
				return vessies != null && !vessies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VessieContainerImpl
