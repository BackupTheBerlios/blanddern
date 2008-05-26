/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdaptorPackage.java,v 1.3 2008/05/26 07:05:10 scheerj Exp $
 */
package adaptor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see adaptor.AdaptorFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adaptor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://adaptor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adaptor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptorPackage eINSTANCE = adaptor.impl.AdaptorPackageImpl.init();

	/**
	 * The meta object id for the '{@link adaptor.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.NamedImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link adaptor.impl.AdaptorImpl <em>Adaptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.AdaptorImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getAdaptor()
	 * @generated
	 */
	int ADAPTOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Matching</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__MATCHING = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link adaptor.impl.MatchingImpl <em>Matching</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.MatchingImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getMatching()
	 * @generated
	 */
	int MATCHING = 1;

	/**
	 * The feature id for the '<em><b>Correspondance Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING__CORRESPONDANCE_RULE = 0;

	/**
	 * The feature id for the '<em><b>Composed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING__COMPOSED = 1;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING__LHS = 2;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING__RHS = 3;

	/**
	 * The number of structural features of the '<em>Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link adaptor.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.PatternImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Composed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__COMPOSED = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__QUERY = 1;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link adaptor.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.InstanceImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CONCEPT = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corresponds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CORRESPONDS = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link adaptor.impl.CorrespondanceRuleImpl <em>Correspondance Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.CorrespondanceRuleImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getCorrespondanceRule()
	 * @generated
	 */
	int CORRESPONDANCE_RULE = 4;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDANCE_RULE__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDANCE_RULE__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Correspondance Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDANCE_RULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link adaptor.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.PropertyImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Set Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SET_PART = 0;

	/**
	 * The feature id for the '<em><b>Get Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__GET_PART = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link adaptor.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.QueryImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 6;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__PROXY = 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__REQUEST = 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link adaptor.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.ActionImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REQUEST = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link adaptor.impl.LhsPatternImpl <em>Lhs Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.LhsPatternImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getLhsPattern()
	 * @generated
	 */
	int LHS_PATTERN = 9;

	/**
	 * The feature id for the '<em><b>Composed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LHS_PATTERN__COMPOSED = PATTERN__COMPOSED;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LHS_PATTERN__QUERY = PATTERN__QUERY;

	/**
	 * The number of structural features of the '<em>Lhs Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LHS_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link adaptor.impl.RhsPatternImpl <em>Rhs Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.RhsPatternImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getRhsPattern()
	 * @generated
	 */
	int RHS_PATTERN = 10;

	/**
	 * The feature id for the '<em><b>Composed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHS_PATTERN__COMPOSED = PATTERN__COMPOSED;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHS_PATTERN__QUERY = PATTERN__QUERY;

	/**
	 * The number of structural features of the '<em>Rhs Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHS_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link adaptor.impl.ProxyImpl <em>Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.ProxyImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getProxy()
	 * @generated
	 */
	int PROXY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__PACKAGE = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link adaptor.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.RequestImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Langage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__LANGAGE = 1;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link adaptor.impl.AttributeCorrespondanceImpl <em>Attribute Correspondance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.impl.AttributeCorrespondanceImpl
	 * @see adaptor.impl.AdaptorPackageImpl#getAttributeCorrespondance()
	 * @generated
	 */
	int ATTRIBUTE_CORRESPONDANCE = 13;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CORRESPONDANCE__SRC = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CORRESPONDANCE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Attribute Correspondance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CORRESPONDANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link adaptor.Langage <em>Langage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptor.Langage
	 * @see adaptor.impl.AdaptorPackageImpl#getLangage()
	 * @generated
	 */
	int LANGAGE = 14;


	/**
	 * Returns the meta object for class '{@link adaptor.Adaptor <em>Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptor</em>'.
	 * @see adaptor.Adaptor
	 * @generated
	 */
	EClass getAdaptor();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptor.Adaptor#getMatching <em>Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matching</em>'.
	 * @see adaptor.Adaptor#getMatching()
	 * @see #getAdaptor()
	 * @generated
	 */
	EReference getAdaptor_Matching();

	/**
	 * Returns the meta object for class '{@link adaptor.Matching <em>Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching</em>'.
	 * @see adaptor.Matching
	 * @generated
	 */
	EClass getMatching();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptor.Matching#getCorrespondanceRule <em>Correspondance Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correspondance Rule</em>'.
	 * @see adaptor.Matching#getCorrespondanceRule()
	 * @see #getMatching()
	 * @generated
	 */
	EReference getMatching_CorrespondanceRule();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptor.Matching#getComposed <em>Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed</em>'.
	 * @see adaptor.Matching#getComposed()
	 * @see #getMatching()
	 * @generated
	 */
	EReference getMatching_Composed();

	/**
	 * Returns the meta object for the containment reference '{@link adaptor.Matching#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see adaptor.Matching#getLhs()
	 * @see #getMatching()
	 * @generated
	 */
	EReference getMatching_Lhs();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptor.Matching#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rhs</em>'.
	 * @see adaptor.Matching#getRhs()
	 * @see #getMatching()
	 * @generated
	 */
	EReference getMatching_Rhs();

	/**
	 * Returns the meta object for class '{@link adaptor.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see adaptor.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptor.Pattern#getComposed <em>Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed</em>'.
	 * @see adaptor.Pattern#getComposed()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Composed();

	/**
	 * Returns the meta object for the containment reference '{@link adaptor.Pattern#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see adaptor.Pattern#getQuery()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Query();

	/**
	 * Returns the meta object for class '{@link adaptor.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see adaptor.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link adaptor.Instance#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see adaptor.Instance#getConcept()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Concept();

	/**
	 * Returns the meta object for the containment reference '{@link adaptor.Instance#getCorresponds <em>Corresponds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Corresponds</em>'.
	 * @see adaptor.Instance#getCorresponds()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Corresponds();

	/**
	 * Returns the meta object for class '{@link adaptor.CorrespondanceRule <em>Correspondance Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correspondance Rule</em>'.
	 * @see adaptor.CorrespondanceRule
	 * @generated
	 */
	EClass getCorrespondanceRule();

	/**
	 * Returns the meta object for the reference '{@link adaptor.CorrespondanceRule#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see adaptor.CorrespondanceRule#getFeature()
	 * @see #getCorrespondanceRule()
	 * @generated
	 */
	EReference getCorrespondanceRule_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link adaptor.CorrespondanceRule#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see adaptor.CorrespondanceRule#getProperty()
	 * @see #getCorrespondanceRule()
	 * @generated
	 */
	EReference getCorrespondanceRule_Property();

	/**
	 * Returns the meta object for class '{@link adaptor.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see adaptor.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference '{@link adaptor.Property#getSetPart <em>Set Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Part</em>'.
	 * @see adaptor.Property#getSetPart()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_SetPart();

	/**
	 * Returns the meta object for the containment reference '{@link adaptor.Property#getGetPart <em>Get Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Part</em>'.
	 * @see adaptor.Property#getGetPart()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_GetPart();

	/**
	 * Returns the meta object for class '{@link adaptor.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see adaptor.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference '{@link adaptor.Query#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Proxy</em>'.
	 * @see adaptor.Query#getProxy()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Proxy();

	/**
	 * Returns the meta object for the containment reference '{@link adaptor.Query#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see adaptor.Query#getRequest()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Request();

	/**
	 * Returns the meta object for class '{@link adaptor.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see adaptor.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link adaptor.Action#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see adaptor.Action#getRequest()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Request();

	/**
	 * Returns the meta object for class '{@link adaptor.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see adaptor.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link adaptor.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adaptor.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link adaptor.LhsPattern <em>Lhs Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lhs Pattern</em>'.
	 * @see adaptor.LhsPattern
	 * @generated
	 */
	EClass getLhsPattern();

	/**
	 * Returns the meta object for class '{@link adaptor.RhsPattern <em>Rhs Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rhs Pattern</em>'.
	 * @see adaptor.RhsPattern
	 * @generated
	 */
	EClass getRhsPattern();

	/**
	 * Returns the meta object for class '{@link adaptor.Proxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy</em>'.
	 * @see adaptor.Proxy
	 * @generated
	 */
	EClass getProxy();

	/**
	 * Returns the meta object for the reference '{@link adaptor.Proxy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see adaptor.Proxy#getType()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_Type();

	/**
	 * Returns the meta object for the attribute '{@link adaptor.Proxy#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see adaptor.Proxy#getPackage()
	 * @see #getProxy()
	 * @generated
	 */
	EAttribute getProxy_Package();

	/**
	 * Returns the meta object for class '{@link adaptor.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see adaptor.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the attribute '{@link adaptor.Request#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see adaptor.Request#getExpression()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Expression();

	/**
	 * Returns the meta object for the attribute '{@link adaptor.Request#getLangage <em>Langage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Langage</em>'.
	 * @see adaptor.Request#getLangage()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Langage();

	/**
	 * Returns the meta object for class '{@link adaptor.AttributeCorrespondance <em>Attribute Correspondance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Correspondance</em>'.
	 * @see adaptor.AttributeCorrespondance
	 * @generated
	 */
	EClass getAttributeCorrespondance();

	/**
	 * Returns the meta object for the reference '{@link adaptor.AttributeCorrespondance#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see adaptor.AttributeCorrespondance#getSrc()
	 * @see #getAttributeCorrespondance()
	 * @generated
	 */
	EReference getAttributeCorrespondance_Src();

	/**
	 * Returns the meta object for the reference '{@link adaptor.AttributeCorrespondance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see adaptor.AttributeCorrespondance#getTarget()
	 * @see #getAttributeCorrespondance()
	 * @generated
	 */
	EReference getAttributeCorrespondance_Target();

	/**
	 * Returns the meta object for enum '{@link adaptor.Langage <em>Langage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Langage</em>'.
	 * @see adaptor.Langage
	 * @generated
	 */
	EEnum getLangage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdaptorFactory getAdaptorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link adaptor.impl.AdaptorImpl <em>Adaptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.AdaptorImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getAdaptor()
		 * @generated
		 */
		EClass ADAPTOR = eINSTANCE.getAdaptor();

		/**
		 * The meta object literal for the '<em><b>Matching</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTOR__MATCHING = eINSTANCE.getAdaptor_Matching();

		/**
		 * The meta object literal for the '{@link adaptor.impl.MatchingImpl <em>Matching</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.MatchingImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getMatching()
		 * @generated
		 */
		EClass MATCHING = eINSTANCE.getMatching();

		/**
		 * The meta object literal for the '<em><b>Correspondance Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING__CORRESPONDANCE_RULE = eINSTANCE.getMatching_CorrespondanceRule();

		/**
		 * The meta object literal for the '<em><b>Composed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING__COMPOSED = eINSTANCE.getMatching_Composed();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING__LHS = eINSTANCE.getMatching_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING__RHS = eINSTANCE.getMatching_Rhs();

		/**
		 * The meta object literal for the '{@link adaptor.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.PatternImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Composed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__COMPOSED = eINSTANCE.getPattern_Composed();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__QUERY = eINSTANCE.getPattern_Query();

		/**
		 * The meta object literal for the '{@link adaptor.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.InstanceImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__CONCEPT = eINSTANCE.getInstance_Concept();

		/**
		 * The meta object literal for the '<em><b>Corresponds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__CORRESPONDS = eINSTANCE.getInstance_Corresponds();

		/**
		 * The meta object literal for the '{@link adaptor.impl.CorrespondanceRuleImpl <em>Correspondance Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.CorrespondanceRuleImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getCorrespondanceRule()
		 * @generated
		 */
		EClass CORRESPONDANCE_RULE = eINSTANCE.getCorrespondanceRule();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDANCE_RULE__FEATURE = eINSTANCE.getCorrespondanceRule_Feature();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDANCE_RULE__PROPERTY = eINSTANCE.getCorrespondanceRule_Property();

		/**
		 * The meta object literal for the '{@link adaptor.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.PropertyImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Set Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SET_PART = eINSTANCE.getProperty_SetPart();

		/**
		 * The meta object literal for the '<em><b>Get Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__GET_PART = eINSTANCE.getProperty_GetPart();

		/**
		 * The meta object literal for the '{@link adaptor.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.QueryImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__PROXY = eINSTANCE.getQuery_Proxy();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__REQUEST = eINSTANCE.getQuery_Request();

		/**
		 * The meta object literal for the '{@link adaptor.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.ActionImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__REQUEST = eINSTANCE.getAction_Request();

		/**
		 * The meta object literal for the '{@link adaptor.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.NamedImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link adaptor.impl.LhsPatternImpl <em>Lhs Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.LhsPatternImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getLhsPattern()
		 * @generated
		 */
		EClass LHS_PATTERN = eINSTANCE.getLhsPattern();

		/**
		 * The meta object literal for the '{@link adaptor.impl.RhsPatternImpl <em>Rhs Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.RhsPatternImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getRhsPattern()
		 * @generated
		 */
		EClass RHS_PATTERN = eINSTANCE.getRhsPattern();

		/**
		 * The meta object literal for the '{@link adaptor.impl.ProxyImpl <em>Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.ProxyImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getProxy()
		 * @generated
		 */
		EClass PROXY = eINSTANCE.getProxy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__TYPE = eINSTANCE.getProxy_Type();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY__PACKAGE = eINSTANCE.getProxy_Package();

		/**
		 * The meta object literal for the '{@link adaptor.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.RequestImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__EXPRESSION = eINSTANCE.getRequest_Expression();

		/**
		 * The meta object literal for the '<em><b>Langage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__LANGAGE = eINSTANCE.getRequest_Langage();

		/**
		 * The meta object literal for the '{@link adaptor.impl.AttributeCorrespondanceImpl <em>Attribute Correspondance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.impl.AttributeCorrespondanceImpl
		 * @see adaptor.impl.AdaptorPackageImpl#getAttributeCorrespondance()
		 * @generated
		 */
		EClass ATTRIBUTE_CORRESPONDANCE = eINSTANCE.getAttributeCorrespondance();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CORRESPONDANCE__SRC = eINSTANCE.getAttributeCorrespondance_Src();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CORRESPONDANCE__TARGET = eINSTANCE.getAttributeCorrespondance_Target();

		/**
		 * The meta object literal for the '{@link adaptor.Langage <em>Langage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptor.Langage
		 * @see adaptor.impl.AdaptorPackageImpl#getLangage()
		 * @generated
		 */
		EEnum LANGAGE = eINSTANCE.getLangage();

	}

} //AdaptorPackage
