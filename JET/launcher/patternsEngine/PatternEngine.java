package patternsEngine;

import java.io.File;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

import utils.Tools;
import emf2prolog.UML21ToPrologV6;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/* contains the methods to use properly patterns */
public class PatternEngine implements ItfPatternEngine{

	/* binds together the request and program prolog files to
	 * return a list of EClass that correspond to the argument feature
	 */
	public List executesProlog(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	/* generates the requests prolog file from the adaptor model */
	public void generatesAdaptorMdlProlog(File adaptorModel) {
		// TODO Auto-generated method stub
		PrologGeneration gen = new PrologGeneration();
		gen.generateProlog(adaptorModel);
	}

	/* uses the PraxisEMF2Prolog project to convert the adaptor model file into a program prolog file */
	public void generatesSrcMdlProlog(File srcModel) {
		// transforms the extension of the model into a .uml file and copy the original file
		String umlModel = srcModel.getAbsolutePath().substring(srcModel.getAbsolutePath().lastIndexOf('\\'), srcModel.getAbsolutePath().lastIndexOf('.'));
		umlModel = "prologFiles\\"+umlModel+".uml";
		File umlFile = new File(umlModel);
		Tools.copyFile(srcModel, umlFile);
		
		//launch the transformation with the corrects arguments
		String[] args = {umlModel, "prologFiles\\sourceModel.pl", "http://sourceModel"};
		UML21ToPrologV6.main(args);
		
		umlFile.delete();
	}

}
