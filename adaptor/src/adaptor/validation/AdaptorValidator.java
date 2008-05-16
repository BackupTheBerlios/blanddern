/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdaptorValidator.java,v 1.2 2008/05/16 09:05:06 scheerj Exp $
 */
package adaptor.validation;

import adaptor.Matching;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link adaptor.Adaptor}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AdaptorValidator {
	boolean validate();

	boolean validateMatching(EList<Matching> value);
}
