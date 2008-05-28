package interpretor;

public class VariableKoala implements Variable {

	protected String name;
	protected Object value;
	
	public VariableKoala(String name, Object value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}
}
