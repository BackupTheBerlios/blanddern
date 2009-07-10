/**
 * <copyright>
 * </copyright>
 *
 * $Id: PatternValidator.java,v 1.3 2009/07/10 17:23:14 bcoppe Exp $
 */
package adaptor.validation;

import adaptor.Instance;
import adaptor.Query;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link adaptor.Pattern}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PatternValidator {
	boolean validate();

	boolean validateComposed(EList<Instance> value);
	boolean validateQuery(Query value);
}