/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertyValidator.java,v 1.4 2008/05/26 12:32:16 scheerj Exp $
 */
package adaptor.validation;

import adaptor.Action;
import adaptor.Query;

/**
 * A sample validator interface for {@link adaptor.Property}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PropertyValidator {
	boolean validate();

	boolean validateSetPart(Action value);
	boolean validateGetPart(Query value);
}
