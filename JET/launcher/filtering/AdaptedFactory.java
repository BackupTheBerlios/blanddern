package filtering;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import patternsEngine.ItfPatternEngine;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

public class AdaptedFactory {
	ItfPatternEngine pe;
	
	public AdaptedFactory(ItfPatternEngine pe){
		this.pe = pe;
	}
	
	public List loadModel(EObject[] srcModel){
		List ret = new ArrayList();
		PatternFilter pf = new PatternFilter(pe);
		
		System.out.println("Source models elements are being adapted");
		
		for(int i=0; i<srcModel.length; i++){
			ret.add(pf.source2Target(srcModel[i]));
		}
		
		System.out.println("Source model elements adapted");
		
		return ret;
	}
}
