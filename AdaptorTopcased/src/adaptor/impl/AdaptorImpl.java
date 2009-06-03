/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdaptorImpl.java,v 1.1 2009/06/03 07:37:06 bcoppe Exp $
 */
package adaptor.impl;

import adaptor.Adaptor;
import adaptor.AdaptorPackage;
import adaptor.Matching;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adaptor.impl.AdaptorImpl#getMatching <em>Matching</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdaptorImpl extends NamedImpl implements Adaptor {
	/**
	 * The cached value of the '{@link #getMatching() <em>Matching</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatching()
	 * @generated
	 * @ordered
	 */
	protected EList matching;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AdaptorPackage.Literals.ADAPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMatching() {
		if (matching == null) {
			matching = new EObjectContainmentEList(Matching.class, this, AdaptorPackage.ADAPTOR__MATCHING);
		}
		return matching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptorPackage.ADAPTOR__MATCHING:
				return ((InternalEList)getMatching()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptorPackage.ADAPTOR__MATCHING:
				return getMatching();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptorPackage.ADAPTOR__MATCHING:
				getMatching().clear();
				getMatching().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdaptorPackage.ADAPTOR__MATCHING:
				getMatching().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdaptorPackage.ADAPTOR__MATCHING:
				return matching != null && !matching.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdaptorImpl
