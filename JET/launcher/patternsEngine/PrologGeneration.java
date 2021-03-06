package patternsEngine;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
import adaptor.Matching;

/**
 * 
 * @author J�r�mie SCHEER & Lo�c SUTTER
 *
 */

/* owns the methods to do the prolog generation */
public class PrologGeneration {
	
	/* generates the prolog requests file from the adaptor model */
	public void generateProlog(File adaptModel) {
		/* get back the adaptor model in the form of an array */
		URI adaptor = URI.createFileURI(adaptModel.getAbsolutePath());
		EObject [] objects = Tools.loadModel(adaptor);
		
		Adaptor a = (Adaptor)objects[0];
		String result;
		
		/* go through the matchings and generates for each a prolog file
		 * that will represents the requests of this matching
		 */
		for(int i=0; i<a.getMatching().size(); i++){
			Matching m = a.getMatching().get(i);
			PatternsGeneration patterns = new PatternsGeneration();
			result = patterns.generate(m);
			
			/* delete the gaps in the generated file */
			result = result.replaceAll("\n", "");
			result = result.replaceAll("\r", "");
			result = result.replaceAll("\t", "");
			result = result.replaceAll(" ", "");
			
			File file = new File("prologFiles/rp"+(i+1)+".pl");
			Tools.saveGenerated(result, file);
		}
	}
}
