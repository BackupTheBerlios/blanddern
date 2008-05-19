package launcher;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import adaptor.Adaptor;

/* store an adaptor model and the package of an EClass
 * (for instance : lanterne.impl.LanterneImpl)
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
