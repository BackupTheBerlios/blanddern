package launcher;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import adaptor.Adaptor;
import adaptor.AdaptorPackage;

import utils.Tools;

public class Testtoto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File srcModel = new File("../adaptor/models/model.adaptor");
		
		URI ada = URI.createFileURI(srcModel.getAbsolutePath());
		EObject [] obj = loadModel(ada);
		Adaptor a = (Adaptor)obj[0];
		
		System.out.println(a.getMatching().get(0).getLhs().getComposed().get(0).getConcept().getEStructuralFeature(0));
		
		/*EList<EAttribute>ttref = a.eClass().getEAllAttributes();
        for (EAttribute currentAttribute : ttref) {
            Object values = v.eGet(currentAttribute);
            System.out.println(currentAttribute.getName()+"\n"+values);
        }*/
	}
	
	public static EObject [] loadModel (URI sourceXMI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		AdaptorPackage libraryPackage = AdaptorPackage.eINSTANCE;

		Resource resource = resourceSet.getResource(sourceXMI, true);

		return resource.getContents().toArray(new EObject [resource.getContents().size()]);
	}

}
