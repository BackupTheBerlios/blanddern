/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdaptorImpl.java,v 1.3 2009/07/10 17:23:14 bcoppe Exp $
 */
package adaptor.impl;

import adaptor.Adaptor;
import adaptor.AdaptorPackage;
import adaptor.Indiagram;
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
 *   <li>{@link adaptor.impl.AdaptorImpl#getEltGraph <em>Elt Graph</em>}</li>
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
	protected EList<Matching> matching;

	/**
	 * The cached value of the '{@link #getEltGraph() <em>Elt Graph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEltGraph()
	 * @generated
	 * @ordered
	 */
	protected EList<Indiagram> eltGraph;

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
	@Override
	protected EClass eStaticClass() {
		return AdaptorPackage.Literals.ADAPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matching> getMatching() {
		if (matching == null) {
			matching = new EObjectContainmentEList<Matching>(Matching.class, this, AdaptorPackage.ADAPTOR__MATCHING);
		}
		return matching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Indiagram> getEltGraph() {
		if (eltGraph == null) {
			eltGraph = new EObjectContainmentEList<Indiagram>(Indiagram.class, this, AdaptorPackage.ADAPTOR__ELT_GRAPH);
		}
		return eltGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptorPackage.ADAPTOR__MATCHING:
				return ((InternalEList<?>)getMatching()).basicRemove(otherEnd, msgs);
			case AdaptorPackage.ADAPTOR__ELT_GRAPH:
				return ((InternalEList<?>)getEltGraph()).basicRemove(otherEnd, msgs);
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
			case AdaptorPackage.ADAPTOR__MATCHING:
				return getMatching();
			case AdaptorPackage.ADAPTOR__ELT_GRAPH:
				return getEltGraph();
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
			case AdaptorPackage.ADAPTOR__MATCHING:
				getMatching().clear();
				getMatching().addAll((Collection<? extends Matching>)newValue);
				return;
			case AdaptorPackage.ADAPTOR__ELT_GRAPH:
				getEltGraph().clear();
				getEltGraph().addAll((Collection<? extends Indiagram>)newValue);
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
			case AdaptorPackage.ADAPTOR__MATCHING:
				getMatching().clear();
				return;
			case AdaptorPackage.ADAPTOR__ELT_GRAPH:
				getEltGraph().clear();
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
			case AdaptorPackage.ADAPTOR__MATCHING:
				return matching != null && !matching.isEmpty();
			case AdaptorPackage.ADAPTOR__ELT_GRAPH:
				return eltGraph != null && !eltGraph.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdaptorImpl
