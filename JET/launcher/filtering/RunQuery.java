
package filtering;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import java.util.*;
import java.io.*;
import patternsEngine.*;
import interpretor.*;

class RunQuery {

private ItfPatternEngine pe;

public RunQuery(ItfPatternEngine pe){
 this.pe = pe;
}


	public EObject [] runPattern1(EObject eo) {
		String prologFileName = "prologFiles/rp1.pl";
		File prologFile = new File(prologFileName);
		Set<Map> prologResult = pe.executesProlog(prologFile);
		
		
		boolean isLhsPattern = false;
		EObject[] res = null;
		
			
				
					if(eo.eClass().getName().equalsIgnoreCase("Vessie")){
						isLhsPattern = true;
					}
				
			
		
		if(isLhsPattern==true) {
			boolean isMapped = false;
			Map correctMap = null;
			
			
			
			
				
					
				
				
			
			
			
			
				Iterator it = prologResult.iterator();
				while(it.hasNext()){
					Map tmp = (Map)it.next();
	
					if(tmp.get("Varv")==eo){
						if(isMapped){
							System.err.println("There can be only one map matching the EObject parameter");
							System.exit(-1);
						}else{
							correctMap = tmp;
							isMapped = true;
						}
					}
				}
				
				if(correctMap==null){
					return null;
				}
			
				lanterne.LanterneFactory objectInstanced = lanterne.LanterneFactory.eINSTANCE;
				 boolean instanced = false;
				
				Interpretor interpret = new Interpretor();
				
					
						
						
						
						
						 interpret.addVar("v", (vessie.Vessie)correctMap.get("Varv"));
					
				
				
				
				
						
							instanced = true;
						
						
						if(instanced){
							res = new EObject[1];
							
								
								
								
								
								
								lanterne.impl.LanterneImpl o0 = (lanterne.impl.LanterneImpl)objectInstanced.createLanterne();
								
								
									
									
									
										
										o0.v = (vessie.Vessie)correctMap.get("Varv");
									
								
								
								res[0]=o0;
							
							return res;
						 }
				
				return null;
			
		}else{
			return null;
		}
	}
}