package emf2prolog;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;



/**
 * @author Alix Mougenot
 * This class is a translating a .uml file (xmi for uml2.1) to a .pl file in our formalism 
 *
 */
public class UML21ToPrologV6 {

	/**
	 * @param args [file.uml, file.pl]
	 * 
	 * You may want to increase the heap size using the VM argument -Xmx1024M
	 */
	public static void main(String[] args) {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE); 
		Map extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap(); 
		extensionToFactoryMap.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE); 
		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl()); 
		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl()); 


		if(args.length < 3){
			System.err.println("USAGE : UML21ToProlog sourcefile targetfile site_name \nsite_name is the name of the site you want the model to belong to");
			System.exit(1);
		}
		
		long d = System.currentTimeMillis();
		String siteName = args[2];
		Resource resource = resourceSet.getResource(URI.createFileURI(args[0]), true);
		// load resource 
		try {


			resource.load(null);
			//org.eclipse.uml2.uml.Package pack = new ;
			//org.eclipse.uml2.uml.Package pack = (org.eclipse.uml2.uml.P290ackage) resource.getContents().get(0);
			EObject pack = resource.getContents().get(0);
			
			//Canonical can = new Canonical(pack.eClass().eClass());
			System.out.println("In: "+args[0]+" \nOut: "+args[1]+"\nSite: "+siteName);
			
			long deb = System.currentTimeMillis();
			EMF2Prolog converter = new EMF2Prolog(pack,siteName);
			System.out.println("Loading of EMF file done ("+(deb-d)+" ms)");
			System.out.println("Beginning conversion");
			converter.writePrologFile(args[1]);
			long end = System.currentTimeMillis();

			System.out.println("done ("+(end-deb)+" ms)");

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
