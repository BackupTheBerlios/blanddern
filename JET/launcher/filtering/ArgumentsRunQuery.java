package filtering;


import java.util.Map;

import adaptor.Adaptor;

public class ArgumentsRunQuery {
	private Adaptor model;
	private String factoryPath;
	private String implPath;
	
	public ArgumentsRunQuery(Adaptor model , String factoryPath, String implPath) {
		this.model = model;
		this.factoryPath = factoryPath;
		this.implPath = implPath;
	}

	public Adaptor getModel() {
		return model;
	}

	public String getFactoryPath() {
		return factoryPath;
	}
	
	public String getImplPath(){
		return implPath;
	}
}
