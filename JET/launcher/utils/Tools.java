package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import adaptor.AdaptorPackage;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/* Tools methods that are used in some other classes
 * Methods in there are statically accessible
 */
public class Tools {
	
	/* load the model which URI is sourceXMI
	 * an EObject array which contains the model is returned
	 */
	public static EObject [] loadModel (URI sourceXMI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		AdaptorPackage libraryPackage = AdaptorPackage.eINSTANCE;

		Resource resource = resourceSet.getResource(sourceXMI, true);

		return resource.getContents().toArray(new EObject [resource.getContents().size()]);
	}
	
	public static void saveModel (URI targetXMI, EObject [] toBeSaved) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		Resource resource = resourceSet.createResource(targetXMI);

		for (int i = 0; i < toBeSaved.length; i++) {
			resource.getContents().add(toBeSaved[i]);
		}

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Cannot save XMI " + targetXMI, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/* copy the input file into the output file */
	public static void copyFile(File input, File output){
		try {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(input));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(output));
			byte[] buffer = new byte[512];
			int nbLus=0;
			
			while((nbLus=in.read(buffer))!=-1){
				out.write(buffer, 0, nbLus);
			}
			
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e2){
			e2.printStackTrace();
		}
	}
	
	/* recursively deletes path file */
	public static void recursifDelete(File path) throws IOException {
	       if (!path.exists()) throw new IOException(
	          "File not found '" + path.getAbsolutePath() + "'");
	       if (path.isDirectory()) {
	          File[] children = path.listFiles();
	          for (int i=0; children != null && i<children.length; i++)
	             recursifDelete(children[i]);
	          if (!path.delete()) throw new IOException(
	             "No delete path '" + path.getAbsolutePath() + "'");
	       }
	       else if (!path.delete()) throw new IOException(
	          "No delete file '" + path.getAbsolutePath() + "'");
	}
	
	/* saves the result string in the File file */
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
