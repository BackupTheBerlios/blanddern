package launcher;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import adaptor.Matching;

/* store an adaptor model and the package of an EClass
 * (for instance : lanterne.impl.LanterneImpl)
 */
public class ArgumentsList {
	private Matching model;
	private String eclass;
	
	public ArgumentsList(Matching model, String eclass){
		this.model = model;
		this.eclass = eclass;
	}
	
	public Matching getModel(){
		return model;
	}
	
	public String getEClass(){
		return eclass;
	}
}
