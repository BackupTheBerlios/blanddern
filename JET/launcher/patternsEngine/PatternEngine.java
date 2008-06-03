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
 * @author J�r�mie SCHEER & Lo�c SUTTER
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
			int nbMapMax = 0;
			
			/*go through the List of results in order to generate
			 * a List that will contain one map for each possibilities
			 * of matching between the proxy names and the corresponding EObjects
			 */
			Iterator it1 = res.iterator();
			while(it1.hasNext()){
				//There is one List per request that are analyzed
				List query = (List)it1.next();
				
				/* if the query has not enough result to complete all the maps already
				 * created, it returns automatically to the beginning of the predicate results
				 * for this query in order to complete
				 */
				numMap = 0;
				boolean firstIter = true;
				while(firstQuery || (!firstQuery && numMap<nbMapMax)){
					Iterator it2 = query.iterator();
					while(it2.hasNext() && (firstIter || (!firstQuery && numMap<nbMapMax))){/*(firstQuery && it2.hasNext()) || (!firstQuery && numMap<nbMapMax && it2.hasNext())){*/
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
					firstIter = false;
				}
				if(numMap>nbMapMax){
					nbMapMax = numMap;
				}
			}
			
			/* the set of maps is created from the temporary list of maps */
			Iterator lstIt = tmpLst.iterator();
			while(lstIt.hasNext()){
				resultSet.add((Map)lstIt.next());
			}
			return resultSet;
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
	public EObject[] generatesSrcMdlProlog(File srcModel) {
		//launch the transformation with the corrects arguments
		String[] args = {srcModel.getAbsolutePath(), "prologFiles\\sourceModel.pl", "sourceModel"};
		UML21ToPrologV6 trans = new UML21ToPrologV6();
		id2obj = trans.translates(args);
		
		return trans.getModel();
	}
}
