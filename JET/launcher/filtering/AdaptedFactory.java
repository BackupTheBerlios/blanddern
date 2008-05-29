package filtering;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import patternsEngine.ItfPatternEngine;

public class AdaptedFactory {
	ItfPatternEngine pe;
	
	public AdaptedFactory(ItfPatternEngine pe){
		this.pe = pe;
	}
	
	public List loadModel(EObject[] srcModel){
		List ret = new ArrayList();
		PatternFilter pf = new PatternFilter(pe);
		
		for(int i=0; i<srcModel.length; i++){
			ret.add(pf.source2Target(srcModel[i]));
		}
		
		return ret;
	}
}
