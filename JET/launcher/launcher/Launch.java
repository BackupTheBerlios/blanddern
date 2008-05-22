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
import java.util.Set;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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

import translated.AdaptorGeneration;
import utils.Tools;

import adaptor.*;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/* launch the .aj files generation */
public class Launch{
	public static void main(String[] args){
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		// TODO List aspectFiles = new ArrayList();
		
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
		eng.generatesSrcMdlProlog(srcModel);
		
		//TODO just for tests !!!! à supprimer
		List testres = eng.executesProlog(null);
		Iterator it = testres.iterator();
		while(it.hasNext()){
			String[] tmp = (String[])it.next();
			System.out.println(tmp[0]+" "+tmp[1]);
		}
		
		
		/* FileChooser used for the choice of the genmodel file corresponding
		 * to the target metamodel (filter on .genmodel extension)
		 */
		/*TODO plante une fois sur deux : le prog ne se termine pas
		 * TODO comment griser la zone de saisie ?
		 */
		/*String genmodel = "";
		JFileChooser choix = new JFileChooser();
		FileFilter acceptAll = choix.getAcceptAllFileFilter();
		choix.removeChoosableFileFilter(acceptAll);
		choix.setFileFilter(new MyFilter(new String[]{"genmodel"}, "*.genmodel"));
		
		JOptionPane.showMessageDialog(null, "Indiquez le fichier genModel du métamodèle cible");
		int retour = choix.showOpenDialog(null);
		if(retour == JFileChooser.APPROVE_OPTION) {
			genmodel = choix.getSelectedFile().getAbsolutePath();
		}else{
			JOptionPane.showMessageDialog(null, "Pas de fichier genModel choisi");
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
				// TODO aspectFiles.add(file);
			}
			
			launchAspect();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/* executes the class that will launch the aspectJ files */
	public static void launchAspect(){
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