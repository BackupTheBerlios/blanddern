package launcher;

import interpretor.InterpretorFacade;
import interpretor.InterpretorFactory;
import interpretor.Result;
import interpretor.Variable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import filtering.AdaptedFactory;

import adaptor.Adaptor;
import adaptor.AdaptorPackage;

import utils.Tools;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Launch l = new Launch();
		AdaptedFactory fact = l.adapt();
		
		/*int toto=1;
		
		String language = "java";
		InterpretorFacade interpreter = InterpretorFactory.createInterpretorFacade(language);
		if (interpreter == null) {
			System.err.println("The interpreter of the language "+ language +" is not implemented in this version.");
		}

		try {
			String code = "toto==1";
			if(language != null && code != null) {
				
				List<Variable> vars = new ArrayList<Variable>();
				vars.add(new Variable() {

						public String getName() {
							return "toto";
						}

						public Object getValue() {
							return 1;
						}});
				
				
				Result r = interpreter.interprete(null, vars, code);
				
				// handle the output variables
				if (r != null) {
					System.out.println(r.getResult());
				}
			}
		} catch (Throwable x) {
			System.err.println("Problems while executing script: " + x.getMessage());
		}*/
		
		// TODO Auto-generated method stub
		/*File srcModel = new File("../adaptor/models/model.adaptor");
		
		URI ada = URI.createFileURI(srcModel.getAbsolutePath());
		EObject [] obj = Tools.loadModel(ada);
		Adaptor a = (Adaptor)obj[0];
		
		EClass c = a.getMatching().get(0).getLhs().getComposed().get(0).getConcept();
		
		System.out.println(a.getMatching().get(0).getLhs().getComposed().get(0).getConcept().getEPackage().getName());
		System.out.println(a.getMatching().get(0).getLhs().getComposed().get(0).getConcept().getName());
		
		int toto=1;
		if(Boolean.parseBoolean("true")){
			System.out.println("test ok");
		}else{
			System.out.println("test pas ok");
		}*/
		//a.getMatching().get(0).getLhs().getComposed().get(0).getConcept().
		
		/*EList<EAttribute>ttref = c.eClass().getEAllAttributes();
        for (EAttribute currentAttribute : ttref) {
            Object values = c.eGet(currentAttribute);
            System.out.println(currentAttribute.getName()+"\n"+values);
        }*/
	}
}
