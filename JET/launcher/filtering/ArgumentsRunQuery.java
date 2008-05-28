package filtering;


import adaptor.Adaptor;

public class ArgumentsRunQuery {
	private Adaptor model;
	private String factoryPath;
	
	public ArgumentsRunQuery(Adaptor model , String factoryPath) {
		this.model = model;
		this.factoryPath = factoryPath;
	}

	public Adaptor getModel() {
		return model;
	}

	public String getFactoryPath() {
		return factoryPath;
	}
}
