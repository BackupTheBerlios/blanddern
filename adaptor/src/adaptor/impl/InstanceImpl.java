/**
 * <copyright>
 * </copyright>
 *
 * $Id: InstanceImpl.java,v 1.3 2008/05/26 07:05:10 scheerj Exp $
 */
package adaptor.impl;

import adaptor.AdaptorPackage;
import adaptor.AttributeCorrespondance;
import adaptor.Instance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adaptor.impl.InstanceImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link adaptor.impl.InstanceImpl#getCorresponds <em>Corresponds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceImpl extends NamedImpl implements Instance {
	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EClass concept;

	/**
	 * The cached value of the '{@link #getCorresponds() <em>Corresponds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorresponds()
	 * @generated
	 * @ordered
	 */
	protected AttributeCorrespondance corresponds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		if (concept != null && concept.eIsProxy()) {
			InternalEObject oldConcept = (InternalEObject)concept;
			concept = (EClass)eResolveProxy(oldConcept);
			if (concept != oldConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptorPackage.INSTANCE__CONCEPT, oldConcept, concept));
			}
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetConcept() {
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(EClass newConcept) {
		EClass oldConcept = concept;
		concept = newConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorPackage.INSTANCE__CONCEPT, oldConcept, concept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCorrespondance getCorresponds() {
		return corresponds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorresponds(AttributeCorrespondance newCorresponds, NotificationChain msgs) {
		AttributeCorrespondance oldCorresponds = corresponds;
		corresponds = newCorresponds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorPackage.INSTANCE__CORRESPONDS, oldCorresponds, newCorresponds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorresponds(AttributeCorrespondance newCorresponds) {
		if (newCorresponds != corresponds) {
			NotificationChain msgs = null;
			if (corresponds != null)
				msgs = ((InternalEObject)corresponds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorPackage.INSTANCE__CORRESPONDS, null, msgs);
			if (newCorresponds != null)
				msgs = ((InternalEObject)newCorresponds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorPackage.INSTANCE__CORRESPONDS, null, msgs);
			msgs = basicSetCorresponds(newCorresponds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorPackage.INSTANCE__CORRESPONDS, newCorresponds, newCorresponds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptorPackage.INSTANCE__CORRESPONDS:
				return basicSetCorresponds(null, msgs);
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
			case AdaptorPackage.INSTANCE__CONCEPT:
				if (resolve) return getConcept();
				return basicGetConcept();
			case AdaptorPackage.INSTANCE__CORRESPONDS:
				return getCorresponds();
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
			case AdaptorPackage.INSTANCE__CONCEPT:
				setConcept((EClass)newValue);
				return;
			case AdaptorPackage.INSTANCE__CORRESPONDS:
				setCorresponds((AttributeCorrespondance)newValue);
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
			case AdaptorPackage.INSTANCE__CONCEPT:
				setConcept((EClass)null);
				return;
			case AdaptorPackage.INSTANCE__CORRESPONDS:
				setCorresponds((AttributeCorrespondance)null);
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
			case AdaptorPackage.INSTANCE__CONCEPT:
				return concept != null;
			case AdaptorPackage.INSTANCE__CORRESPONDS:
				return corresponds != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceImpl
