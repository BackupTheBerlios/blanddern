/**
 * <copyright>
 * </copyright>
 *
 * $Id: VessieContainerValidator.java,v 1.1 2008/06/04 11:49:44 scheerj Exp $
 */
package vessie.validation;

import org.eclipse.emf.common.util.EList;

import vessie.Vessie;

/**
 * A sample validator interface for {@link vessie.VessieContainer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VessieContainerValidator {
	boolean validate();

	boolean validateVessies(EList<Vessie> value);
}