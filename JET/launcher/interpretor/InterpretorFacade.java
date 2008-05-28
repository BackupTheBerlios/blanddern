package interpretor;

import java.util.*;

/*
 * Implemented facades should be referenced in InterpretorFactory.createInterpretorFacade
 */
public interface InterpretorFacade {

	void setEnvironment(Set<Variable> v);
	Set<Variable> getEnvironment();
	Result interprete(Object self, List<Variable> vars, String interaction);
	
}