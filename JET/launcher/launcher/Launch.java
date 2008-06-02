package launcher;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import patternsEngine.ItfPatternEngine;
import patternsEngine.PatternEngine;

import emf2prolog.UML21ToPrologV6;
import filtering.AdaptedFactory;
import filtering.ArgumentsRunQuery;
import filtering.MyFilter;
import graphicalinterface.GraphicalInterface;

import translated.AdaptorGeneration;
import translated.PatternFilterGeneration;
import translated.RunQueryGeneration;
import utils.Tools;
import vessie.Vessie;
import vessie.VessiePackage;

import adaptor.*;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/* launch the .aj files generation */
public class Launch{
	EObject[] model = null;
	
	/*generates the prolog program and request files from the 
	 * adaptor and source models, generates the aspect files and 
	 * executes them, generates the pattern filter files and finally
	 * returns the factory that will adapt the source model into the 
	 * target model
	 */
	public AdaptedFactory adapt(){
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		List paths = launchIhm();
		
		/* .aj and prolog files directories creation */
		File ajDir = new File("src-gen/");
		File plDir = new File("prologFiles/");
		try{
			if(ajDir.exists()){
				Tools.recursifDelete(ajDir);
			}
			if(plDir.exists()){
				Tools.recursifDelete(plDir);
			}
			ajDir.mkdir();
			plDir.mkdir();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		ItfPatternEngine eng = new PatternEngine();
		
		// load the adaptor model and convert it into a prolog file
		File adaptModel = new File((String)paths.get(0));
		URI adaptor = URI.createFileURI(adaptModel.getAbsolutePath());
		EObject [] objects = Tools.loadModel(adaptor);
		eng.generatesAdaptorMdlProlog(adaptModel);
		
		//convert the source model into a prolog file
		File srcModel = new File((String)paths.get(1));
		model = eng.generatesSrcMdlProlog(srcModel);
		
		/* the package where the Impl files are stored is sought */
		ImplFinder implLoc = new ImplFinder(new File((String)paths.get(2)));
		
		
		/* search in the adaptor model of all the target metamodel EClass */
		try{
			Adaptor a = (Adaptor)objects[0];
			Set eclasses = new HashSet();
			
			for(int i=0; i<a.getMatching().size(); i++){
				for(int j=0; j<a.getMatching().get(i).getRhs().size(); j++){
					for(int k=0; k<a.getMatching().get(i).getRhs().get(j).getComposed().size(); k++){
						eclasses.add(a.getMatching().get(i).getRhs().get(j).getComposed().get(k).getConcept());
					}
				}
			}
		
			/* JET file used to generate as many .aj files as EClass */
			AdaptorGeneration adapt = new AdaptorGeneration();
			Iterator i = eclasses.iterator();
			while(i.hasNext()){
				EClass c = (EClass)i.next();
			
				ArgumentsList arg = new ArgumentsList(a, c.getName(), implLoc.implPackage()+"."+c.getName()+"Impl");
				String result = adapt.generate(arg);
				
				File file = new File("src-gen/"+c.getName()+".aj");
				Tools.saveGenerated(result, file);
			}
			
			launchAspect((String)paths.get(3), (String)paths.get(4));
			
			generateFilter(a, implLoc.factoryPackage(), implLoc.implPackage());
			
			return new AdaptedFactory(eng);
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("Error during the creation of the adapted factory");
			System.exit(-1);
		}
		return null;
	}
	
	/* generates the classes that will filter the patterns */
	public void generateFilter(Adaptor a, String factPath, String implPath){
		/* generates the class that will run the different patterns : RunQuery */
		ArgumentsRunQuery args = new ArgumentsRunQuery(a, factPath, implPath);
		RunQueryGeneration genRunQuery = new RunQueryGeneration();
		String result = genRunQuery.generate(args);
		File file = new File("launcher/filtering/RunQuery.java");
		Tools.saveGenerated(result, file);
		
		/* generates the class that will filter the pattern of the source model : PatternFilter */
		PatternFilterGeneration genPatternFilter = new PatternFilterGeneration();
		result = genPatternFilter.generate(a);
		file = new File("launcher/filtering/PatternFilter.java");
		Tools.saveGenerated(result, file);
	}
	
	/* executes the class that will launch the aspectJ files */
	public void launchAspect(String srcDir, String targetDir){
		JFileChooser jfile = new JFileChooser();
		jfile.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		//execute the compiler
		AspectLaunch al = new AspectLaunch();
		al.launch(new File(srcDir).getAbsolutePath(), new File(targetDir).getAbsolutePath());
	}
	
	public EObject[] getModel(){
		if(model==null){
			System.err.println("You must first run the adapt method");
			System.exit(-1);
		}else{
			return model;
		}
		return null;
	}
	
	/* launch the graphical interface in order to get the path needed
	 * by the program to run
	 */
	public List launchIhm(){
		String tmp = new File("..").getAbsolutePath();
		String workspace = tmp.substring(0, tmp.indexOf("Blanddern"));
		List res;
		
		GraphicalInterface ihm = new GraphicalInterface(workspace);
		ihm.setVisible(true);
		res = ihm.getPaths();
		
		/* tests if all the needed paths exist */
		if(res.size()<5){
        	System.err.println("Paths are not correct");
        	System.exit(-1);
        }
		return res;
	}
	
}