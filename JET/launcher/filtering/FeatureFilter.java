package filtering;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import adaptor.CorrespondanceRule;

public class FeatureFilter {
	private CorrespondanceRule rule;
	
	public FeatureFilter(CorrespondanceRule rule){
		this.rule = rule;
	}
	
	public String give_request(){
		EStructuralFeature feature = rule.getFeature();
		
		if(feature instanceof EAttribute){
			return rule.getProperty().getGetPart().getRequest().getExpression();
		}
		if(feature instanceof EReference){
			//TODO utiliser moteur de patrons
			return "Moteur de patrons";
		}
		return null;
	}
}
