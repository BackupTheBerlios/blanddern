
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Go {
	static public void main(String args[]) {
		FileInputStream fis;
		String program;
		String query = "habite(Qui, illfurth).";
		String tmp;
		//program = "habite(jean, belfort).habite(lucie, paris).habite(christian, toulouse).habite(adeline, paris).habite(nicolas, paris).";
		//run(program,query);
		
		ArrayList prologProgramIntoTab = new ArrayList();
		String fileName = "D:\\ENSISA\\PROJET2A\\workspace\\PROLOG\\src\\prolog.pl";
		
		cutStringIntoHashTable(query);
		
		//We open the file which contains prolog instructions
		try {
			fis = new FileInputStream(new File(fileName));
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
				
				int i = 0;
				//We go through the ArrayList and call run function with correct argument
				while(i != prologProgramIntoTab.size()){
					String programLine = (String) prologProgramIntoTab.get(i);
					run(programLine,query);
					i++;
				}
				
			} catch (java.io.IOException x) {
				System.out.println("Can't read: " +fileName);
			}
		} catch (FileNotFoundException x) {
			
			System.out.println("Can't open: " +fileName);
		}
	}

	static private void run(String prog, String query) {
		Term t; Engine eng;

        try {
			// second arg null ... nowhere for error to be indicated
                        t = new Term(new ParseString(query,null));
           try {
        	   eng = new Engine(t,ParseString.consult(prog, new Hashtable(),null));
				// don't indicate error
			    
			    //The result of the prolog engine
			    
        	   String result = eng.run(true);
       	              	  
        	   
        	   if(!result.equals("No.")){
        		 //Si le resultat est différent de no., on affiche
   			    //L'ideal serai de créer une classe qui stocke toutes ces données
        		   
        		   System.out.println(eng.getCall().getarg(0));
			    }
			    
			    
			    
			   
			   
           } catch (Exception f) { 
                System.out.println("Can't parse program!");
           }
       } catch (Exception f) {
               System.out.println("Can't parse query!\n");
       }
	}
	
	static public void cutStringIntoHashTable(String query){	
		/*StringTokenizer st = new StringTokenizer(query , "(");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
	     }*/
	}
	
	public void indexOfVar(String var){
		
	}
	
}
