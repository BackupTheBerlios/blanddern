package patternsEngine;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * 
 * @author J�r�mie SCHEER & Lo�c SUTTER
 *
 */

/* provides an interface for the patterns engine */
public interface ItfPatternEngine {
	public void generatesSrcMdlProlog(File srcModel);
	
	public void generatesAdaptorMdlProlog(File adaptorModel);
	
	/* TODO quoi mettre en argument et en retour ?
	 * Retour : List pour y stocker des EClass ? Ou String pour y mettre la requ�te ?
	 * Est-ce qu'on peut trouver la bonne requete � partir du moteur de patrons ?
	 * Ou est-ce le filtre qui doit la construire � partir de la List retourn�e ?
	 */
	public Map executesProlog(File queryFile);
}
