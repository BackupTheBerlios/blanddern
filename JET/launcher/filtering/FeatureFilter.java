package filtering;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import adaptor.CorrespondanceRule;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/* filters the features which the getters have to
 * be implemented in the target metamodel Impl files
 */
public class FeatureFilter {
	private CorrespondanceRule rule;
	
	public FeatureFilter(CorrespondanceRule rule){
		this.rule = rule;
	}
	
	/* give the good request for the feature getter */
	public String give_request(){
		EStructuralFeature feature = rule.getFeature();
		
		if(feature instanceof EAttribute){
			return rule.getProperty().getGetPart().getRequest().getExpression();
		}
		
		/* uses the patterns engine */
		if(feature instanceof EReference){
			//TODO utiliser moteur de patrons
			return "Moteur de patrons";
		}
		return null;
	}
}
