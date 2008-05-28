package launcher;

import java.io.File;

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
