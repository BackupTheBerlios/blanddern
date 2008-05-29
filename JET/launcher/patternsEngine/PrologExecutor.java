package patternsEngine;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 
 * @author Loïc SUTTER & Jérémie SCHEER
 * 
 */

/* This class execute query from a prolog file */
public class PrologExecutor implements ItfPrologInterpret{
	
	/* Execute prolog query */
	public List executePrologQuery(String fileNameQueries , String fileNameProgram){
		List queries = getLstQuery(fileNameQueries);
		Iterator it = queries.iterator();
		ArrayList prologProgramIntoTab = new ArrayList();
		String program , tmp;
		
		//We convert the contain of file called with the var fileNameProgram into a ArrayList
		FileInputStream fis;
		//We open the file which contains prolog instructions
		try {
			fis = new FileInputStream(new File(fileNameProgram));
			try {
				//We take the contain of the file and put it into a string
				byte b[] = new byte[fis.available()];
				fis.read(b);
				fis.close();
				program = new String(b,0);
				
				//We go through the string program and take it in part into a table
				StringTokenizer st = new StringTokenizer(program , ".");
				while (st.hasMoreTokens()) {
					tmp = st.nextToken()+".";
					prologProgramIntoTab.add(tmp);
			     }
			} catch (java.io.IOException x) {
				System.out.println("Can't read: " + fileNameProgram);
			}
		} catch (FileNotFoundException x) {
			System.out.println("Can't open: " + fileNameProgram);
		}
		
		List resultats = new ArrayList();
		
		//We go through the queries list and execute query with the file called fileNameProgram which contains prolog program
		while(it.hasNext()){
			String query = (String) it.next();
			
			List lstReq = new ArrayList();
			
			Iterator itPrologProg = prologProgramIntoTab.iterator();
			while(itPrologProg.hasNext()){
				String programLine = (String)itPrologProg.next();
				programLine = programLine.replaceAll("'", "");
				programLine = programLine.replaceAll("=", ",");
				
				//We use WProlog to run prolog query and prolog program
				Term t;
				Engine eng;
				
				try {
					t = new Term(new ParseString(query,null));
		           try {
		        	   eng = new Engine(t,ParseString.consult(programLine, new Hashtable(),null));
						
					    //The result of the prolog engine
					    String result = eng.run(true);  	  
		        	   
					    /* adds String array tabTmp, which contains the functor's name
					     * and the variable's value, to the results List
					     */
					    if(!result.equals("No.")){
					    	List resLine = new ArrayList();
					    	//resLine.add(eng.getCall().getfunctor());
					    	List resProg = new ArrayList();
					    	
		        		   List pos = indexesOfVars(query);
		        		   Iterator i = pos.iterator();
		        		
	        			   List lstProgr = new ArrayList();
		        		   while(i.hasNext()){
		        			   
		        			   
		        			   String [] varProperty = new String[2];
		        			   int index = Integer.valueOf(i.next().toString());
		        			   
		        			   varProperty[0] = valueOfVar(query);
		        			   varProperty[1] = eng.getCall().getarg(index)+"";
		        			   
		        			   lstProgr.add(varProperty);
		        		   }
		        		   //results.add(resLine);
		        		   lstReq.add(lstProgr);
					    }
		           } catch (Exception f) { 
		                
		           }
		       } catch (Exception f) {
		    	   System.out.println("Can't parse query!");
		       }
			}
			resultats.add(lstReq);
		}
		return resultats;
	}
	
	/* Return the list of queries that the file called fileName contains */
	public List getLstQuery(String fileName){
		List lstQuery = new ArrayList();
		
		try {
			//We open the file
			FileInputStream fis;
			fis = new FileInputStream(new File(fileName));
			
			//We go through the file and store every query in lstQuery
			//We take the contain of the file and put it into a string
			byte b[];
			try {
				b = new byte[fis.available()];
				fis.read(b);
				fis.close();
				String queries = new String(b,0);
				String tmp;
				
				String res = queries.replaceAll("\r\n", "");
				queries = res;
				
				StringTokenizer st = new StringTokenizer(queries , ".");
				while (st.hasMoreTokens()) {
					tmp = st.nextToken()+".";
					lstQuery.add(tmp);
			     }
				
			} catch (IOException e) {
				System.out.println("Can't read: " + fileName);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't open: " + fileName);
		}
		return lstQuery;
	}
	
	
	/* Returns indexes of variables in predicates */
	public static List indexesOfVars(String var){
		int posCount=0;
		
		List result = new ArrayList();
		String tmp = var;
		
		tmp = tmp.substring(tmp.indexOf('(')+1);
		
		while(tmp.contains(",") || tmp.contains(")")){
			while(tmp.charAt(0)==' ' || tmp.charAt(0)=='\t' || tmp.charAt(0)=='\n'){
				tmp=tmp.substring(1);
			}
			
			if(Character.isUpperCase(tmp.charAt(0))){
				if(tmp.charAt(0)!='N' || !Character.isDigit(tmp.charAt(1))){
					result.add(posCount);
				}
			}
			
			if(!tmp.contains(",")){
				tmp = tmp.substring(tmp.indexOf(')')+1);
			}else{
				tmp = tmp.substring(tmp.indexOf(',')+1);
			}
			posCount++;
		}
		
		return result;
	}
	
	
	/* Returns  the name of the variable which is present in the query */
	public static String valueOfVar(String query){
		
		List result = new ArrayList();
		String tmp = query;
		
		tmp = tmp.substring(tmp.indexOf('(')+1);
		String [] resultat = tmp.split(",");
		
		return resultat[0];
	}
	
	
	public static void main(String [] args){
		PrologExecutor pe = new PrologExecutor();
		List l1 = pe.executePrologQuery("D:\\ENSISA\\PROJET2A\\workspace\\Blanddern\\prologFiles\\rp1.pl", "D:\\ENSISA\\PROJET2A\\workspace\\Blanddern\\prologFiles\\sourceModel.pl");
		Iterator i1 = l1.iterator();
		while(i1.hasNext()){
			List l2 = (List)i1.next();
			Iterator i2 = l2.iterator();
			
			while(i2.hasNext()){
				List l3 = (List)i2.next();
				Iterator i3 = l3.iterator();
				
				while(i3.hasNext()){
					String [] tabRes = (String[]) i3.next();
					System.out.println("["+tabRes[0]+" , "+tabRes[1]+"]");
				}
				
			}
			
		}
	}
	
}
