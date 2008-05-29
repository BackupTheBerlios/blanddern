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

import translated.AdaptorGeneration;
import translated.PatternFilterGeneration;
import translated.RunQueryGeneration;
import utils.Tools;

import adaptor.*;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/* launch the .aj files generation */
public class Launch{
	/*generates the prolog program and request files from the 
	 * adaptor and source models, generates the aspect files and 
	 * executes them, generates the pattern filter files and finally
	 * returns the factory that will adapt the source model into the 
	 * target model
	 */
	public AdaptedFactory adapt(){
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
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
		
		// TODO Demander le chemin du modèle d'adaptateur
		// load the adaptor model and convert it into a prolog file
		File adaptModel = new File("../adaptor/models/model.adaptor");
		URI adaptor = URI.createFileURI(adaptModel.getAbsolutePath());
		EObject [] objects = Tools.loadModel(adaptor);
		eng.generatesAdaptorMdlProlog(adaptModel);
		
		//convert the source model into a prolog file
		//TODO demander chemin du modèle de vessie
		File srcModel = new File("../Vessie/models/model1.vessie");
		
		//TODO demander chemin du métamodèle de vessie
		EPackage.Registry.INSTANCE.put("http://"+URI.createFileURI(srcModel.getAbsolutePath()).fileExtension(), Tools.loadModel(URI.createFileURI("../Vessie/metamodel/vessie.ecore"))[0]);
		eng.generatesSrcMdlProlog(srcModel);
		

		/* FileChooser used for the choice of the genmodel file corresponding
		 * to the target metamodel (filter on .genmodel extension)
		 */
		/*TODO voir s'il est possible d'enlever le filtre acceptAll
		 */
		//FileFilter acceptAll = choix.getAcceptAllFileFilter();
		//choix.removeChoosableFileFilter(acceptAll);
		/*String genmodel = "";
		JFileChooser choix = new JFileChooser();
		choix.setFileFilter(new MyFilter(new String[]{"genmodel"}, "*.genmodel"));
		
		JOptionPane.showMessageDialog(null, "Indiquez le fichier genModel du métamodèle cible");
		int retour = choix.showOpenDialog(null);
		if(retour == JFileChooser.APPROVE_OPTION) {
			genmodel = choix.getSelectedFile().getAbsolutePath();
			
			if(!genmodel.substring(genmodel.lastIndexOf('.')+1).equalsIgnoreCase("genmodel")){
				System.err.println("Le fichier sélectionné doit être de type .genmodel");
				System.exit(-1);
			}
		}else{
			JOptionPane.showMessageDialog(null, "Pas de fichier genModel choisi");
			System.exit(-1);
		}
		
		File genFile = new File(genmodel);
		if(!genFile.exists()){
			System.err.println("Le fichier genmodel n'existe pas");
			System.exit(-1);
		}*/
		
		/* the package where the Impl files are stored is sought */
		ImplFinder implLoc = new ImplFinder(new File(/*genmodel*/"../Lanterne/metamodel/lanterne.genmodel"));
		
		
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
			
			launchAspect();
			
			generateFilter(a, implLoc.factoryPackage(), implLoc.implPackage(), ((PatternEngine)eng).getMap());
			
			return new AdaptedFactory(eng);
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("Error during the creation of the adapted factory");
			System.exit(-1);
		}
		return null;
	}
	
	/* generates the classes that will filter the patterns */
	public void generateFilter(Adaptor a, String factPath, String implPath, Map map){
		/* generates the class that will run the different patterns : RunQuery */
		ArgumentsRunQuery args = new ArgumentsRunQuery(a, factPath, implPath, map);
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
	public void launchAspect(){
		JFileChooser jfile = new JFileChooser();
		jfile.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		String srcDir="..\\Vessie\\bin";
		String targetDir="..\\Lanterne\\bin";
		
		/* asks the user for the directories of the source and target metamodel binaries */
		/*JOptionPane.showMessageDialog(null, "Directory of the source metamodel binaries : ");
		if(jfile.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
			srcDir = jfile.getSelectedFile().getAbsolutePath();
		}else{
			System.err.println("No source metamodel directory chosen");
			System.exit(-1);
		}
		
		JOptionPane.showMessageDialog(null, "Directory of the target metamodel binaries");
		if(jfile.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
			targetDir = jfile.getSelectedFile().getAbsolutePath();
		}else{
			System.err.println("No target metamodel directory chosen");
			System.exit(-1);
		}*/
		
		//execute the compiler
		AspectLaunch al = new AspectLaunch();
		al.launch(new File(srcDir).getAbsolutePath(), new File(targetDir).getAbsolutePath());
	}
	
}