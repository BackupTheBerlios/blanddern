/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdaptorFactoryImpl.java,v 1.3 2008/05/26 07:05:10 scheerj Exp $
 */
package adaptor.impl;

import adaptor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorFactoryImpl extends EFactoryImpl implements AdaptorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdaptorFactory init() {
		try {
			AdaptorFactory theAdaptorFactory = (AdaptorFactory)EPackage.Registry.INSTANCE.getEFactory("http://adaptor"); 
			if (theAdaptorFactory != null) {
				return theAdaptorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdaptorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdaptorPackage.ADAPTOR: return createAdaptor();
			case AdaptorPackage.MATCHING: return createMatching();
			case AdaptorPackage.INSTANCE: return createInstance();
			case AdaptorPackage.CORRESPONDANCE_RULE: return createCorrespondanceRule();
			case AdaptorPackage.PROPERTY: return createProperty();
			case AdaptorPackage.QUERY: return createQuery();
			case AdaptorPackage.ACTION: return createAction();
			case AdaptorPackage.LHS_PATTERN: return createLhsPattern();
			case AdaptorPackage.RHS_PATTERN: return createRhsPattern();
			case AdaptorPackage.PROXY: return createProxy();
			case AdaptorPackage.REQUEST: return createRequest();
			case AdaptorPackage.ATTRIBUTE_CORRESPONDANCE: return createAttributeCorrespondance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptorPackage.LANGAGE:
				return createLangageFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptorPackage.LANGAGE:
				return convertLangageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adaptor createAdaptor() {
		AdaptorImpl adaptor = new AdaptorImpl();
		return adaptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matching createMatching() {
		MatchingImpl matching = new MatchingImpl();
		return matching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondanceRule createCorrespondanceRule() {
		CorrespondanceRuleImpl correspondanceRule = new CorrespondanceRuleImpl();
		return correspondanceRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LhsPattern createLhsPattern() {
		LhsPatternImpl lhsPattern = new LhsPatternImpl();
		return lhsPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RhsPattern createRhsPattern() {
		RhsPatternImpl rhsPattern = new RhsPatternImpl();
		return rhsPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proxy createProxy() {
		ProxyImpl proxy = new ProxyImpl();
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCorrespondance createAttributeCorrespondance() {
		AttributeCorrespondanceImpl attributeCorrespondance = new AttributeCorrespondanceImpl();
		return attributeCorrespondance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Langage createLangageFromString(EDataType eDataType, String initialValue) {
		Langage result = Langage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLangageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorPackage getAdaptorPackage() {
		return (AdaptorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdaptorPackage getPackage() {
		return AdaptorPackage.eINSTANCE;
	}

} //AdaptorFactoryImpl
