package patternsEngine;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import utils.Tools;
import emf2prolog.UML21ToPrologV6;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/* contains the methods to use properly patterns */
public class PatternEngine implements ItfPatternEngine{
	private Map id2obj;
	
	public PatternEngine(){
		id2obj = null;
	}

	/* binds together the query and program prolog files to
	 * return a map matching element names with the corresponding EObject
	 */
	public Set<Map> executesProlog(File queryFile) {
		//id2obj is null if the generatesSrcModel method has not been run 
		if(id2obj!=null){
			File programFile = new File("prologFiles/sourceModel.pl");
			
			/* executes the query file on the program file with Prolog interpreter */
			ItfPrologInterpret pexec = new PrologExecutor();
			List res = pexec.executePrologQuery(queryFile.getAbsolutePath(), programFile.getAbsolutePath());
			
			Set<Map> resultSet=new HashSet<Map>();
			List<Map> tmpLst = new ArrayList<Map>();
			int numMap;
			boolean firstQuery = true;
			
			/*go through the List of results in order to generate
			 * a List that will contain one map for each possibilities
			 * of matching between the proxy names and the corresponding EObjects
			 */
			Iterator it1 = res.iterator();
			while(it1.hasNext()){
				//There is one List per request that are analyzed
				List query = (List)it1.next();
				
				Iterator it2 = query.iterator();
				numMap = 0;
				while(it2.hasNext()){
					//One list per predicates that returns some results
					Map map;
					List predicate = (List)it2.next();
					
					Iterator it3 = predicate.iterator();
					String[] matchVars = (String[])it3.next();
					
					//creation of one map per predicates
					if(firstQuery){
						map = new HashMap();
					}else{
						map = tmpLst.get(numMap);
					}
					map.put(matchVars[0], id2obj.get(matchVars[1]));
					tmpLst.add(numMap, map);
					
					numMap++;
				}
				firstQuery = false;
			}
			
			/* the set of maps is created from the temporary list of maps */
			Iterator lstIt = tmpLst.iterator();
			while(lstIt.hasNext()){
				resultSet.add((Map)lstIt.next());
			}
			
			/* go through result List of the prolog interpretation
			 * check if each pattern has a name and match in a new map
			 * the name of a pattern with the corresponding object
			 */
			/*Iterator it = res.iterator();
			Iterator it2;
			String opName="";
			String opPrec="";
			String nodeID = "";
			while(it.hasNext()){
				List resLine = (List)it.next();
				it2 = resLine.iterator();
				
				boolean isOpName=true;
				while(it2.hasNext()){
					if(isOpName){
						opName = (String)it2.next(); 
						
						//check if a create operation is followed by an addProperty operation
						//that defines a name
						if(opPrec.equalsIgnoreCase("create")){
							if(!opName.equalsIgnoreCase("addProperty")){
								System.err.println("Each pattern of the source model must have a name");
								System.exit(-1);
							}
						}
						isOpName=false;
					}else{
						//in a create operation, get the node ID
						//in an addProperty operation, match the name of the element with the object corresponding to the node ID
						if(opName.equalsIgnoreCase("addProperty")){
							resultMap.put((String)it2.next(), id2obj.get(nodeID));
						}else{
							nodeID=(String)it2.next();
						}
					}
				}
				opPrec = opName;
			}
			return resultMap;*/
		}else{
			System.err.println("You must first run the generatesSrcModel method");
			System.exit(-1);
		}
		return null;
	}

	/* generates the requests prolog file from the adaptor model */
	public void generatesAdaptorMdlProlog(File adaptorModel) {
		PrologGeneration gen = new PrologGeneration();
		gen.generateProlog(adaptorModel);
	}

	/* uses the PraxisEMF2Prolog project to convert the adaptor model file into a program prolog file */
	public void generatesSrcMdlProlog(File srcModel) {
		// transforms the extension of the model into a .uml file and copy the original file
		String umlModel = srcModel.getAbsolutePath().substring(srcModel.getAbsolutePath().lastIndexOf('\\'), srcModel.getAbsolutePath().lastIndexOf('.'));
		umlModel = "prologFiles\\"+umlModel+".uml";
		File umlFile = new File(umlModel);
		Tools.copyFile(srcModel, umlFile);
		
		//launch the transformation with the corrects arguments
		String[] args = {srcModel.getAbsolutePath(), "prologFiles\\sourceModel.pl", "sourceModel"};
		id2obj = UML21ToPrologV6.translates(args);
	
		umlFile.delete();
	}

	public Map getMap(){
		return id2obj;
	}
}
