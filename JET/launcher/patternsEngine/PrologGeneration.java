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

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
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
		
		/* generate the prolog and save it into a prolog file */
		PatternsGeneration patterns = new PatternsGeneration();
		String result = patterns.generate(a);
		
		result = result.replaceAll("\n", "");
		result = result.replaceAll("\r", "");
		result = result.replaceAll("\t", "");
		result = result.replaceAll(" ", "");
		
		File file = new File("prologFiles/patterns.pl");
		Tools.saveGenerated(result, file);
	}
	
	/* delete the jump lines in the Prolog requests */
	public void deleteGaps(File plFile){
		File tmp = new File("prologFiles/tmp");
		
		try {
			
			
			BufferedReader br = new BufferedReader(new FileReader(plFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(tmp));
			
			String ret;
			
			/* copy the file into a tmp file without the \n, except after the .
			 * that marks the end of a rule
			 */
			while((ret = br.readLine())!=null){
				if(ret.contains(").")){
					ret = ret.substring(0, ret.indexOf(").")+2)+"\n"+ret.substring(ret.indexOf(").")+2);
				}
				bw.write(ret);
			}
			br.close();
			bw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Tools.copyFile(tmp, plFile);
		tmp.delete();
	}
}
