/**
 * <copyright>
 * </copyright>
 *
 * $Id: NamedValidator.java,v 1.1 2009/06/03 07:36:40 bcoppe Exp $
 */
package adaptor.validation;


/**
 * A sample validator interface for {@link adaptor.Named}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NamedValidator {
	boolean validate();

	boolean validateName(String value);
}
