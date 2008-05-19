package patternsEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import patterns.PatternsGeneration;

import adaptor.Adaptor;
import adaptor.AdaptorPackage;

public class PrologGeneration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File adaptModel = new File("../adaptor/models/model.adaptor");
		URI adaptor = URI.createFileURI(adaptModel.getAbsolutePath());
		EObject [] objects = loadModel(adaptor);
		
		Adaptor a = (Adaptor)objects[0];
		
		PatternsGeneration patterns = new PatternsGeneration();
		String result = patterns.generate(a);
		
		File file = new File("prologFiles/patterns.pl");
		saveGenerated(result, file);
	}
	
	public static EObject [] loadModel (URI sourceXMI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		AdaptorPackage libraryPackage = AdaptorPackage.eINSTANCE;

		Resource resource = resourceSet.getResource(sourceXMI, true);

		return resource.getContents().toArray(new EObject [resource.getContents().size()]);
	}
	
	public static void saveGenerated(String result, File file){
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(result);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
