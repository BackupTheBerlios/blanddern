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
public class PrologExecutor {
	
	/* Execute prolog query */
	public List executePrologQuery(String fileNameQueries , String fileNameProgram){
		List results = new ArrayList();
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
		
		//We go through the queries list and execute query with the file called fileNameProgram which contains prolog program
		while(it.hasNext()){
			String query = (String) it.next();
			
			Iterator itPrologProg = prologProgramIntoTab.iterator();
			while(itPrologProg.hasNext()){
				String programLine = (String)itPrologProg.next();
				
				//We use WProlog to run prolog query and prolog program
				Term t;
				Engine eng;
				
				try {
					t = new Term(new ParseString(query,null));
		           try {
		        	   eng = new Engine(t,ParseString.consult(programLine, new Hashtable(),null));
						
					    //The result of the prolog engine
					    String result = eng.run(true);  	  
		        	   
					    if(!result.equals("No.")){
		        		   List pos = indexesOfVars(query);
		        		   Iterator i = pos.iterator();
		        		   while(i.hasNext()){
		        			   int index = Integer.valueOf(i.next().toString());
		        			   /*
		        			    * String [] tabTmp = new String [2];
		        			   tabTmp[0] = eng.getCall().getarg(index).toString();
		        			   tabTmp[1] = eng.getCall().getarg(index).getfunctor();
		        			    */
		        			   
		        			   results.add(eng.getCall().getarg(index));
		        		   }
					    }
		           } catch (Exception f) { 
		                System.out.println("Can't parse program!");
		           }
		       } catch (Exception f) {
		    	   System.out.println("Can't parse query!");
		       }
			}
		}
		return results;
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
					result.add(posCount);
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
	
}
