package interpretor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class InterpretorFactory {
	
	private static Map<String, InterpretorFacade> interpretors = new HashMap<String, InterpretorFacade>();
	
	/** resyet all language interpreter environment */
	public static void resetInterpreters() {
		for (Iterator iter = interpretors.values().iterator(); iter.hasNext();) {
			InterpretorFacade interpretor = (InterpretorFacade) iter.next();
			interpretor.setEnvironment(null);
		}
	}

	/*
	 * Possible interpretors soulb be referenced here...
	 */
	public static InterpretorFacade createInterpretorFacade(String language) {
		
		language = language.toLowerCase();
		InterpretorFacade ret = interpretors.get(language);
		
		if (ret == null) {
			if (language.equals("java") || language.equals("koala"))
				ret = InterpretorFacadeKoala.getInstance();
			else if (language.equals("kermeta"))
				ret = interpretorFacadeKermeta.getInstance();
			else
				return null;
			
			interpretors.put(language, ret);
		}
		
		return ret;
	}
	
}
