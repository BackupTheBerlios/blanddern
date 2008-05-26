/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertyImpl.java,v 1.4 2008/05/26 12:32:16 scheerj Exp $
 */
package adaptor.impl;

import adaptor.Action;
import adaptor.AdaptorPackage;
import adaptor.Property;
import adaptor.Query;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adaptor.impl.PropertyImpl#getSetPart <em>Set Part</em>}</li>
 *   <li>{@link adaptor.impl.PropertyImpl#getGetPart <em>Get Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property {
	/**
	 * The cached value of the '{@link #getSetPart() <em>Set Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetPart()
	 * @generated
	 * @ordered
	 */
	protected Action setPart;

	/**
	 * The cached value of the '{@link #getGetPart() <em>Get Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetPart()
	 * @generated
	 * @ordered
	 */
	protected Query getPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSetPart() {
		return setPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetPart(Action newSetPart, NotificationChain msgs) {
		Action oldSetPart = setPart;
		setPart = newSetPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorPackage.PROPERTY__SET_PART, oldSetPart, newSetPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetPart(Action newSetPart) {
		if (newSetPart != setPart) {
			NotificationChain msgs = null;
			if (setPart != null)
				msgs = ((InternalEObject)setPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorPackage.PROPERTY__SET_PART, null, msgs);
			if (newSetPart != null)
				msgs = ((InternalEObject)newSetPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorPackage.PROPERTY__SET_PART, null, msgs);
			msgs = basicSetSetPart(newSetPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorPackage.PROPERTY__SET_PART, newSetPart, newSetPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getGetPart() {
		return getPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetPart(Query newGetPart, NotificationChain msgs) {
		Query oldGetPart = getPart;
		getPart = newGetPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorPackage.PROPERTY__GET_PART, oldGetPart, newGetPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetPart(Query newGetPart) {
		if (newGetPart != getPart) {
			NotificationChain msgs = null;
			if (getPart != null)
				msgs = ((InternalEObject)getPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorPackage.PROPERTY__GET_PART, null, msgs);
			if (newGetPart != null)
				msgs = ((InternalEObject)newGetPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorPackage.PROPERTY__GET_PART, null, msgs);
			msgs = basicSetGetPart(newGetPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorPackage.PROPERTY__GET_PART, newGetPart, newGetPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptorPackage.PROPERTY__SET_PART:
				return basicSetSetPart(null, msgs);
			case AdaptorPackage.PROPERTY__GET_PART:
				return basicSetGetPart(null, msgs);
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
			case AdaptorPackage.PROPERTY__SET_PART:
				return getSetPart();
			case AdaptorPackage.PROPERTY__GET_PART:
				return getGetPart();
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
			case AdaptorPackage.PROPERTY__SET_PART:
				setSetPart((Action)newValue);
				return;
			case AdaptorPackage.PROPERTY__GET_PART:
				setGetPart((Query)newValue);
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
			case AdaptorPackage.PROPERTY__SET_PART:
				setSetPart((Action)null);
				return;
			case AdaptorPackage.PROPERTY__GET_PART:
				setGetPart((Query)null);
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
			case AdaptorPackage.PROPERTY__SET_PART:
				return setPart != null;
			case AdaptorPackage.PROPERTY__GET_PART:
				return getPart != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyImpl
