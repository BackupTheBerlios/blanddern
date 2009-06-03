
package filtering;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import java.util.*;
import java.io.*;
import patternsEngine.*;
import interpretor.*;
import utils.AdapterRelay;

/**
 * 
 * @author Jeremie SCHEER & Loic SUTTER
 *
 */

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
		
			
				
					if(eo.eClass().getName().equalsIgnoreCase("Table")){
						isLhsPattern = true;
					}
				
			
		
		if(isLhsPattern==true) {
			boolean isMapped = false;
			Map correctMap = null;
			
			
			
			
				
					
				
				
			
			
			
			
				Iterator it = prologResult.iterator();
				while(it.hasNext()){
					Map tmp = (Map)it.next();
	
					if(tmp.get("Vart")==eo){
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
			
				objet.ObjetFactory objectInstanced = objet.ObjetFactory.eINSTANCE;
				 boolean instanced = false;
				
				Interpretor interpret = new Interpretor();
				
					
						
						
						
						
						 interpret.addVar("t", (bdd.Table)correctMap.get("Vart"));
					
				
				
				
				
						
							instanced = true;
						
						
						if(instanced){
							res = new EObject[1];
							
								
								
								
								
								
								objet.impl.ClasseImpl o0 = (objet.impl.ClasseImpl)objectInstanced.createClasse();
								
								
									
									
									
										
										o0.t = (bdd.Table)correctMap.get("Vart");
										o0.t.eAdapters().add(new AdapterRelay(o0));
									
								
								
								res[0]=o0;
							
							
							System.out.println("Proxies initialized");
							return res;
						 }
				
				return null;
			
		}else{
			return null;
		}
	}

	public EObject [] runPattern2(EObject eo) {
		String prologFileName = "prologFiles/rp2.pl";
		File prologFile = new File(prologFileName);
		Set<Map> prologResult = pe.executesProlog(prologFile);
		
		
		boolean isLhsPattern = false;
		EObject[] res = null;
		
			
				
					if(eo.eClass().getName().equalsIgnoreCase("Colonne")){
						isLhsPattern = true;
					}
				
			
		
		if(isLhsPattern==true) {
			boolean isMapped = false;
			Map correctMap = null;
			
			
			
			
				
					
				
				
			
			
			
			
				Iterator it = prologResult.iterator();
				while(it.hasNext()){
					Map tmp = (Map)it.next();
	
					if(tmp.get("Varcol")==eo){
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
			
				objet.ObjetFactory objectInstanced = objet.ObjetFactory.eINSTANCE;
				 boolean instanced = false;
				
				Interpretor interpret = new Interpretor();
				
					
						
						
						
						
						 interpret.addVar("col", (bdd.Colonne)correctMap.get("Varcol"));
					
				
				
				
				
						
								 if(interpret.getInterpretorResult("java", "col.getFk()!=null;").getResult().toString().equalsIgnoreCase("true")){
									instanced = true;
								 }
						
						
						if(instanced){
							res = new EObject[1];
							
								
								
								
								
								
								objet.impl.RelationImpl o0 = (objet.impl.RelationImpl)objectInstanced.createRelation();
								
								
									
									
									
										
										o0.col = (bdd.Colonne)correctMap.get("Varcol");
										o0.col.eAdapters().add(new AdapterRelay(o0));
									
								
								
								res[0]=o0;
							
							
							System.out.println("Proxies initialized");
							return res;
						 }
				
						
							instanced = true;
						
						
						if(instanced){
							res = new EObject[1];
							
								
								
								
								
								
								objet.impl.AttributImpl o0 = (objet.impl.AttributImpl)objectInstanced.createAttribut();
								
								
									
									
									
										
										o0.col = (bdd.Colonne)correctMap.get("Varcol");
										o0.col.eAdapters().add(new AdapterRelay(o0));
									
								
								
								res[0]=o0;
							
							
							System.out.println("Proxies initialized");
							return res;
						 }
				
				return null;
			
		}else{
			return null;
		}
	}
}