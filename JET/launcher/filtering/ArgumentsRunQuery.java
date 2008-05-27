package filtering;

import patternsEngine.ItfPatternEngine;
import adaptor.Adaptor;

public class ArgumentsRunQuery {
	private Adaptor model;
	private String factoryPath;
	private ItfPatternEngine patternEngine;
	
	public ArgumentsRunQuery(Adaptor model , String factoryPath , ItfPatternEngine patternEngine) {
		this.model = model;
		this.factoryPath = factoryPath;
		this.patternEngine = patternEngine;
	}

	public Adaptor getModel() {
		return model;
	}

	public String getFactoryPath() {
		return factoryPath;
	}

	public ItfPatternEngine getPatternEngine() {
		return patternEngine;
	}
}
