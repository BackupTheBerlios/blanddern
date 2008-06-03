package interpretor;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class interpretorFacadeKermeta implements InterpretorFacade{
	
	public static interpretorFacadeKermeta intK;
	
	public static interpretorFacadeKermeta getInstance(){
		if (intK == null){
			intK = new interpretorFacadeKermeta();
		}
		return intK;
	}
	
	protected Set<VariableKermeta> env = new TreeSet<VariableKermeta>(new Variable.VariableComparator());
	
	private interpretorFacadeKermeta(){}

	public void setEnvironment(Set<Variable> v) {
		this.env.clear();
		if (v != null && v.size() > 0)
			for (Iterator i = v.iterator(); i.hasNext();) {
				Variable w = (Variable) i.next();
				if (!(w instanceof VariableKermeta)) {
					this.env.clear();
					throw new IllegalArgumentException("Variable " + w.getName() + " is not manageable by KerMeta interpretor.");
				}
				this.env.add((VariableKermeta)w);
			}
	}
	
	public Result interprete(Object self, List<Variable> vars, String interaction){
		
		// Pour l'instant, juste un test, on affiche le tout:
		System.out.println("-Kermeta- > "+self);
		for(int i=0; i<vars.size();i++ ){
			System.out.println("-Kermeta- > "+vars.get(i));
		}
		System.out.println("-Kermeta- > "+interaction);		
		
		return null;
	}

	public Set<Variable> getEnvironment() {
		return new TreeSet<Variable>(this.env);
	}
	
}