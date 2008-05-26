/**
 * <copyright>
 * </copyright>
 *
 * $Id: MatchingImpl.java,v 1.3 2008/05/26 09:25:12 scheerj Exp $
 */
package adaptor.impl;

import adaptor.AdaptorPackage;
import adaptor.CorrespondanceRule;
import adaptor.Instance;
import adaptor.LhsPattern;
import adaptor.Matching;
import adaptor.RhsPattern;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matching</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adaptor.impl.MatchingImpl#getCorrespondanceRule <em>Correspondance Rule</em>}</li>
 *   <li>{@link adaptor.impl.MatchingImpl#getComposed <em>Composed</em>}</li>
 *   <li>{@link adaptor.impl.MatchingImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link adaptor.impl.MatchingImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchingImpl extends EObjectImpl implements Matching {
	/**
	 * The cached value of the '{@link #getCorrespondanceRule() <em>Correspondance Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondanceRule()
	 * @generated
	 * @ordered
	 */
	protected EList<CorrespondanceRule> correspondanceRule;

	/**
	 * The cached value of the '{@link #getComposed() <em>Composed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposed()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> composed;

	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected LhsPattern lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected EList<RhsPattern> rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorPackage.Literals.MATCHING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CorrespondanceRule> getCorrespondanceRule() {
		if (correspondanceRule == null) {
			correspondanceRule = new EObjectContainmentEList<CorrespondanceRule>(CorrespondanceRule.class, this, AdaptorPackage.MATCHING__CORRESPONDANCE_RULE);
		}
		return correspondanceRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getComposed() {
		if (composed == null) {
			composed = new EObjectContainmentEList<Instance>(Instance.class, this, AdaptorPackage.MATCHING__COMPOSED);
		}
		return composed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LhsPattern getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(LhsPattern newLhs, NotificationChain msgs) {
		LhsPattern oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorPackage.MATCHING__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(LhsPattern newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorPackage.MATCHING__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorPackage.MATCHING__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorPackage.MATCHING__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RhsPattern> getRhs() {
		if (rhs == null) {
			rhs = new EObjectContainmentEList<RhsPattern>(RhsPattern.class, this, AdaptorPackage.MATCHING__RHS);
		}
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptorPackage.MATCHING__CORRESPONDANCE_RULE:
				return ((InternalEList<?>)getCorrespondanceRule()).basicRemove(otherEnd, msgs);
			case AdaptorPackage.MATCHING__COMPOSED:
				return ((InternalEList<?>)getComposed()).basicRemove(otherEnd, msgs);
			case AdaptorPackage.MATCHING__LHS:
				return basicSetLhs(null, msgs);
			case AdaptorPackage.MATCHING__RHS:
				return ((InternalEList<?>)getRhs()).basicRemove(otherEnd, msgs);
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
			case AdaptorPackage.MATCHING__CORRESPONDANCE_RULE:
				return getCorrespondanceRule();
			case AdaptorPackage.MATCHING__COMPOSED:
				return getComposed();
			case AdaptorPackage.MATCHING__LHS:
				return getLhs();
			case AdaptorPackage.MATCHING__RHS:
				return getRhs();
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
			case AdaptorPackage.MATCHING__CORRESPONDANCE_RULE:
				getCorrespondanceRule().clear();
				getCorrespondanceRule().addAll((Collection<? extends CorrespondanceRule>)newValue);
				return;
			case AdaptorPackage.MATCHING__COMPOSED:
				getComposed().clear();
				getComposed().addAll((Collection<? extends Instance>)newValue);
				return;
			case AdaptorPackage.MATCHING__LHS:
				setLhs((LhsPattern)newValue);
				return;
			case AdaptorPackage.MATCHING__RHS:
				getRhs().clear();
				getRhs().addAll((Collection<? extends RhsPattern>)newValue);
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
			case AdaptorPackage.MATCHING__CORRESPONDANCE_RULE:
				getCorrespondanceRule().clear();
				return;
			case AdaptorPackage.MATCHING__COMPOSED:
				getComposed().clear();
				return;
			case AdaptorPackage.MATCHING__LHS:
				setLhs((LhsPattern)null);
				return;
			case AdaptorPackage.MATCHING__RHS:
				getRhs().clear();
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
			case AdaptorPackage.MATCHING__CORRESPONDANCE_RULE:
				return correspondanceRule != null && !correspondanceRule.isEmpty();
			case AdaptorPackage.MATCHING__COMPOSED:
				return composed != null && !composed.isEmpty();
			case AdaptorPackage.MATCHING__LHS:
				return lhs != null;
			case AdaptorPackage.MATCHING__RHS:
				return rhs != null && !rhs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatchingImpl
