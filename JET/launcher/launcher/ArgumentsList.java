package launcher;

import adaptor.Adaptor;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/* store an adaptor model, the package of an EClass
 * (for instance : lanterne.impl.LanterneImpl), and the
 * name of the eClass
 */
public class ArgumentsList {
	private Adaptor model;
	private String eClass;
	private String ePackage;
	
	public ArgumentsList(Adaptor model, String eclass, String ePackage){
		this.model = model;
		this.eClass = eclass;
		this.ePackage = ePackage;
	}
	
	public Adaptor getModel(){
		return model;
	}
	
	public String getEClass(){
		return eClass;
	}
	
	public String getEPackage(){
		return ePackage;
	}
}
