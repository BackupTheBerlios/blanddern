package emf2prolog;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


/**
 * @author Alix Mougenot
 * This class is a translating a .uml file (xmi for uml2.1) to a .pl file in our formalism 
 *
 */
public class UML21ToPrologV6 {
	EObject[] model = null;
	/**
	 * @param args [file.uml, file.pl]
	 * 
	 * You may want to increase the heap size using the VM argument -Xmx1024M
	 */
	public Map translates(String[] args) {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Map extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl()); 


		if(args.length < 3){
			System.err.println("USAGE : UML21ToProlog sourcefile targetfile site_name \nsite_name is the name of the site you want the model to belong to");
			System.exit(1);
		}
		
		long d = System.currentTimeMillis();
		String siteName = args[2];
		
		URI uri = URI.createFileURI(args[0]);
		
		Resource resource = resourceSet.getResource(URI.createFileURI(args[0]), true);
		// load resource 
		try {
			model = resource.getContents().toArray(new EObject [resource.getContents().size()]);

			resource.load(null);
			EObject pack = resource.getContents().get(0);
			
			System.out.println("In: "+args[0]+" \nOut: "+args[1]+"\nSite: "+siteName);
			
			long deb = System.currentTimeMillis();
			EMF2Prolog converter = new EMF2Prolog(pack,siteName);
			System.out.println("Loading of EMF file done ("+(deb-d)+" ms)");
			System.out.println("Beginning conversion");
			converter.writePrologFile(args[1]);
			long end = System.currentTimeMillis();

			System.out.println("done ("+(end-deb)+" ms)");

			return converter.getId2Obj();
		} catch (IOException e) {
			System.err.println("Error during the source-model prolog transformation");
			System.exit(-1);
		}

		return null;
	}
	
	public EObject[] getModel(){
		return model;
	}
}
