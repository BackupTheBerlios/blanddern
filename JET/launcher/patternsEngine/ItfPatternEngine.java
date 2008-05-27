package patternsEngine;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/* provides an interface for the patterns engine */
public interface ItfPatternEngine {
	public void generatesSrcMdlProlog(File srcModel);
	
	public void generatesAdaptorMdlProlog(File adaptorModel);
	
	/* TODO quoi mettre en argument et en retour ?
	 * Retour : List pour y stocker des EClass ? Ou String pour y mettre la requête ?
	 * Est-ce qu'on peut trouver la bonne requete à partir du moteur de patrons ?
	 * Ou est-ce le filtre qui doit la construire à partir de la List retournée ?
	 */
	public Map executesProlog(File queryFile);
}
