package interpretor;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */
public class Interpretor {
	
	//this attribute contains all the variables that the expression must have to run correctly
	private List<Variable> vars;
	
	public Interpretor(){
		vars = new ArrayList<Variable>();
	}
	
	//This method return a result which is the result of the code express in the language
	public Result getInterpretorResult(String language, String code){
		InterpretorFacade interpreter = InterpretorFactory.createInterpretorFacade(language);
		if (interpreter == null) {
			System.err.println("The interpreter of the language "+ language +" is not implemented in this version.");
		}
		
		try {
			if(language != null && code != null) {
				Result r = interpreter.interprete(null, vars, code);
				
				// handle the output variables
				if (r != null) {
					return r;
				}
			}
		} catch (Throwable x) {
			System.err.println("Problems while executing script: " + x.getMessage());
			return null;
		}
		return null;
	}
	
	
	//This method add a var called "name" with a value "value" into the list vars
	public void addVar(final String name , final Object value){		
		vars.add(new Variable() {

			public String getName() {
				return name;
			}

			public Object getValue() {
				return value;
			}});		
	}
}
