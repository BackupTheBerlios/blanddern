/**
 * <copyright>
 * </copyright>
 *
 * $Id: CorrespondanceRuleValidator.java,v 1.2 2009/06/09 09:01:05 bcoppe Exp $
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
