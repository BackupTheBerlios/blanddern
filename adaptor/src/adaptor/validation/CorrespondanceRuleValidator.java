/**
 * <copyright>
 * </copyright>
 *
 * $Id: CorrespondanceRuleValidator.java,v 1.5 2008/05/26 14:38:45 scheerj Exp $
 */
package adaptor.validation;

import adaptor.Property;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A sample validator interface for {@link adaptor.CorrespondanceRule}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CorrespondanceRuleValidator {
	boolean validate();

	boolean validateFeature(EStructuralFeature value);
	boolean validateProperty(Property value);
}
