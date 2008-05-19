package launcher;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import adaptor.Matching;

/* store an adaptor model and the package of an EClass
 * (for instance : lanterne.impl.LanterneImpl)
 */
public class ArgumentsList {
	private Matching model;
	private String eClass;
	private String ePackage;
	
	public ArgumentsList(Matching model, String eclass, String ePackage){
		this.model = model;
		this.eClass = eclass;
		this.ePackage = ePackage;
	}
	
	public Matching getModel(){
		return model;
	}
	
	public String getEClass(){
		return eClass;
	}
	
	public String getEPackage(){
		return ePackage;
	}
}
