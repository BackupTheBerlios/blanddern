/**
 * 
 */
package interpretor;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import koala.dynamicjava.interpreter.Interpreter;
import koala.dynamicjava.interpreter.InterpreterException;
import koala.dynamicjava.interpreter.TreeInterpreter;
import koala.dynamicjava.parser.wrapper.JavaCCParserFactory;


/**
 * @author rohrer
 *
 */
public class InterpretorFacadeKoala implements InterpretorFacade {

	List<VariableKoala> variables = new ArrayList();
	Map<String, VariableKoala> env = new TreeMap<String, VariableKoala>(new Variable.VariableComparator());
	public static InterpretorFacadeKoala intK;
	
	public static InterpretorFacadeKoala getInstance(){
		if (intK == null){
			intK = new InterpretorFacadeKoala();
		}
		return intK;
	}
	
	private InterpretorFacadeKoala() {};
	
	public void setEnvironment(Set<Variable> v) {
		this.env.clear();
		if (v != null) {
			for (Iterator i = v.iterator(); i.hasNext();) {
				Variable w = (Variable) i.next();
				if (w instanceof Result) ;
				else if (!(w instanceof VariableKoala)) {
					this.env.clear();
					throw new IllegalArgumentException("Variable " + w.getName() + " is not manageable by Koala interpretor.");
				} else
					this.env.put(w.getName(), (VariableKoala)w);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see interpretor.interpretorFacade#interprete(java.lang.Object, java.util.List, java.lang.String)
	 */
	public Result interprete(Object self, List<Variable> vars, String interaction) {
		
		Interpreter interpreter = new TreeInterpreter(new JavaCCParserFactory());
		
		for (Variable variable : this.env.values()) {
			interpreter.defineVariable(variable.getName(), variable.getValue());
		}
		
		if (self != null)
			interpreter.defineVariable("self", self);
		
		List<String> localVars = new ArrayList<String>(vars == null ? 0 : vars.size());
		if (vars != null) {
			for (Variable variable : vars) {
				if (interpreter.getVariableNames().contains(variable.getName())){
					interpreter.setVariable(variable.getName(), variable.getValue());
				} else {
					interpreter.defineVariable(variable.getName(), variable.getValue());
				}
				localVars.add(variable.getName());
			}
		}
		
		// Interpret the script
		try {
		    ResultKoala ret = new ResultKoala(this, interpreter, interpreter.interpret(new StringReader(interaction), "Java"));
		    Set<Variable> outV = ret.getOuputVars();
		    String n; Object val;
		    for (Variable variable : outV) {
		    	n = variable.getName();
				if (localVars.contains(n));
				else if ("self".equals(n));
				else if (this.env.containsKey(n)) {
					val = variable.getValue();
					Object envVarVal = this.env.get(n).getValue();
					if (val != envVarVal)
						this.env.put(n, new VariableKoala(n, variable.getValue()));
				}
			}
		    return ret;
		} catch (InterpreterException e) {
		    System.err.println("The script has not been correctly interpreted");
		    return null;
		} catch (Throwable e) {
			System.err.println("The script has not been correctly interpreted");
		    return null;
		}
	}

	public Set<Variable> getEnvironment() {
		return new HashSet<Variable>(this.env.values());
	}
}
;