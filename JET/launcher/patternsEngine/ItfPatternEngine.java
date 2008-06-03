package patternsEngine;

import java.io.File;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/* provides an interface for the patterns engine */
public interface ItfPatternEngine {
	public EObject[] generatesSrcMdlProlog(File srcModel);
	
	public void generatesAdaptorMdlProlog(File adaptorModel);
	
	public Set<Map> executesProlog(File queryFile);
}
