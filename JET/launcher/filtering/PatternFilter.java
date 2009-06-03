
package filtering;

import org.eclipse.emf.ecore.EObject;
import patternsEngine.ItfPatternEngine;

/**
 * 
 * @author Jeremie SCHEER & Loic SUTTER
 *
 */

public class PatternFilter{
	ItfPatternEngine pe;
	
	public PatternFilter(ItfPatternEngine pe){
		this.pe = pe;
	}

	public EObject[] source2Target(EObject o){
		EObject[] res;
		RunQuery rq = new RunQuery(pe);
		
		
			if((res=rq.runPattern1(o))!=null){
				return res;
			}
		
			if((res=rq.runPattern2(o))!=null){
				return res;
			}
		
		
		return null;
	}
}
	