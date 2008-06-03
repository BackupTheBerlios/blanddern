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
			FileWriter fw = new FileWriter(file.getAbsolutePath());
			fw.write(result);
			fw.close();
		} catch (IOException e) {
			System.err.println("The file"+file.getAbsolutePath()+"has not been correctly generated");
			System.exit(-1);
		}
	}
}
