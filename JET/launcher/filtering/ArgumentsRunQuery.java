package filtering;


import java.util.Map;

import adaptor.Adaptor;

public class ArgumentsRunQuery {
	private Adaptor model;
	private String factoryPath;
	private String implPath;
	private Map map;
	
	public ArgumentsRunQuery(Adaptor model , String factoryPath, String implPath, Map map) {
		this.model = model;
		this.factoryPath = factoryPath;
		this.implPath = implPath;
		this.map = map;
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
	
	public Map getMap(){
		return map;
	}
}
