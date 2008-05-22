
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class Go {
	
	
	
	
	
	
	static public void main(String args[]) {
		
		PrologExecutor pex = new PrologExecutor();

		List test = pex.executePrologQuery("D:\\ENSISA\\PROJET2A\\workspace\\PROLOG\\src\\queries.pl" , "D:\\ENSISA\\PROJET2A\\workspace\\PROLOG\\src\\prolog.pl");
		
		Iterator it = test.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		/*FileInputStream fis;
		String program;
		
		
		String query = "habite(loic, Ou).";

		String tmp;
		
		ArrayList prologProgramIntoTab = new ArrayList();
		String fileName = "D:\\User\\ProjetIMM\\workspace\\PROLOG\\src\\prolog.pl";
		
		
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
		}*/
	}
	
	/* */
	
	
	
	
	
	/* Run */
	static private void run(String prog, String query) {
		Term t;
		Engine eng;

        try {
			// second arg null ... nowhere for error to be indicated
                        t = new Term(new ParseString(query,null));
           try {
        	   eng = new Engine(t,ParseString.consult(prog, new Hashtable(),null));
				// don't indicate error
			    
			    //The result of the prolog engine
			    
        	   String result = eng.run(true);
        	   System.out.println(eng.getCall().getarg(1));
        	           	  
        	   
        	   if(!result.equals("No.")){
        		 //Si le resultat est différent de no., on affiche
   			    //L'ideal serai de créer une classe qui stocke toutes ces données
        		   
        		   List pos = indexesOfVars(query);
        		   Iterator i = pos.iterator();
        		   while(i.hasNext()){
        			   System.out.println(eng.getCall().getarg(Integer.valueOf(i.next().toString())));
        		   }

			    }
			   
           } catch (Exception f) { 
                System.out.println("Can't parse program!");
           }
       } catch (Exception f) {
               System.out.println("Can't parse query!\n");
       }
	}
	
	
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
