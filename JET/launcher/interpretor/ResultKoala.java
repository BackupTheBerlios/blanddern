package interpretor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import koala.dynamicjava.interpreter.Interpreter;

public class ResultKoala implements Result {
	private InterpretorFacade facade;
	private Interpreter interpreter;
	private Object ob = null;
	private Set<Variable> vars;
	
	public ResultKoala(InterpretorFacade facade, Interpreter interpreter, Object ret) {
		this.facade = facade;
		this.interpreter = interpreter;
		this.ob=ret;
	    Set vns = this.interpreter.getVariableNames();
	    this.vars = new HashSet<Variable>();
	    for (Iterator iter = vns.iterator(); iter.hasNext();) {
			final String vn = (String) iter.next();
			final Object val = interpreter.getVariable(vn);
			this.vars.add(new VariableKoala(vn, val));
	    }
	}

	public Object getResult(){
		return ob;
	}

	public Set<Variable> getOuputVars() {
		return this.vars;
		
//		Set<Variable> ret = new TreeSet<Variable>();
//		for (Variable v : this.vars) {
//			ret.add(v);
//		}
//		return ret;
	}

	public InterpretorFacade getInterpreter() {
		return this.facade;
	}		
}
