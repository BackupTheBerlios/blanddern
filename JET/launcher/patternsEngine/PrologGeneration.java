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
import utils.Tools;

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
		EObject [] objects = Tools.loadModel(adaptor);
		
		Adaptor a = (Adaptor)objects[0];
		
		PatternsGeneration patterns = new PatternsGeneration();
		String result = patterns.generate(a);
		
		File file = new File("prologFiles/patterns.pl");
		Tools.saveGenerated(result, file);
	}
}
