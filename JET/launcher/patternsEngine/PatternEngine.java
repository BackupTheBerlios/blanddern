package patternsEngine;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import utils.Tools;
import emf2prolog.UML21ToPrologV6;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/* contains the methods to use properly patterns */
public class PatternEngine implements ItfPatternEngine{
	private Map id2obj;
	
	public PatternEngine(){
		id2obj = null;
	}

	/* binds together the request and program prolog files to
	 * return a list of EClass that correspond to the argument feature
	 */
	public List executesProlog(File queryFile) {
		File programFile = new File("prologFiles/sourceModel.pl");
		
		ItfPrologInterpret pexec = new PrologExecutor();
		List res = pexec.executePrologQuery(queryFile.getAbsolutePath(), programFile.getAbsolutePath());
		
		Iterator it = res.iterator();
		Iterator it2;
		String opPrec;
		while(it.hasNext()){
			
		}
		
		return null;
	}

	/* generates the requests prolog file from the adaptor model */
	public void generatesAdaptorMdlProlog(File adaptorModel) {
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
		String[] args = {umlModel, /*"prologFiles\\sourceModel.pl"*/"prologFiles\\toto.pl", "sourceModel"};
		id2obj = UML21ToPrologV6.translates(args);
	
		umlFile.delete();
	}

}
