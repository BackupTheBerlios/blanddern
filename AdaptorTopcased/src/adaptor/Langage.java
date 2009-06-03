/**
 * <copyright>
 * </copyright>
 *
 * $Id: Langage.java,v 1.1 2009/06/03 07:36:19 bcoppe Exp $
 */
package adaptor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Langage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see adaptor.AdaptorPackage#getLangage()
 * @model
 * @generated
 */
public final class Langage extends AbstractEnumerator {
	/**
	 * The '<em><b>Java</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_LITERAL
	 * @model name="Java"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA = 0;

	/**
	 * The '<em><b>Java</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA
	 * @generated
	 * @ordered
	 */
	public static final Langage JAVA_LITERAL = new Langage(JAVA, "Java", "Java");

	/**
	 * An array of all the '<em><b>Langage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Langage[] VALUES_ARRAY =
		new Langage[] {
			JAVA_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Langage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Langage</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Langage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Langage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Langage</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Langage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Langage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Langage</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Langage get(int value) {
		switch (value) {
			case JAVA: return JAVA_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Langage(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Langage
