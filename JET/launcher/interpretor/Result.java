package interpretor;

import java.util.Set;

public interface Result {
	InterpretorFacade getInterpreter();
	Object getResult();
	Set<Variable> getOuputVars();
}
