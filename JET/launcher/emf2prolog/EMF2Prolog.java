package emf2prolog;


import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.UUID;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.uml2.uml.NamedElement;

/**
 * @author Alix Mougenot
 *
 */
public class EMF2Prolog {

	private String sitename;
	private EObject root;
	private FileWriter fw;
	private Hashtable<Integer, Pair<UUID,Boolean>> visited;
	private HashMap<String, String> namemapping ;

	public EMF2Prolog(EObject root,String sitename){
		this.root = root;
		namemapping = new HashMap<String, String>();
		visited = new Hashtable<Integer, Pair<UUID,Boolean>>();
		this.sitename = sitename; 
	}
	
	
	public void writePrologFile(String outputfile) throws IOException{
			fw = new FileWriter(outputfile);
		    absorb(root);
		    fw.flush();
		    fw.close();
		    
		    FileOutputStream fos = new FileOutputStream(outputfile+".names");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(namemapping);
			oos.close();
			fos.flush();
		
}
	

	void absorb(EObject obj) throws IOException{

		UUID mine = makeNode(obj);
		
		// case it's already done
		if(visited.get(obj.hashCode()).snd()){
			return;
		}
		
		visited.get(obj.hashCode()).snd(true);
		 

		StringBuffer buff = new StringBuffer();
		ArrayList<EObject> toAbsorb = new ArrayList<EObject>(); 
		
		for (Iterator<EReference> it = obj.eClass().getEAllReferences().iterator(); it.hasNext();) {
			EReference current = it.next();
			if (current.isMany()) {
				EList<EObject> referencedElts = (EList<EObject>) obj.eGet(current);
				for (Iterator<EObject> it2 = referencedElts.iterator(); it2.hasNext();) {
					EObject referencedElt = it2.next();
					if(referencedElt != null){
					UUID his = makeNode(referencedElt);
					toAbsorb.add(referencedElt);
					buff.append(PrologGeneratorv6.makeAddReference(obj.eClass().getName(), mine, current.getName(), his, VirtualTimer.getTimeStamp(sitename)));
					buff.append(".\n");
					}
				}
				
			} else {
				EObject referencedElt = (EObject) obj.eGet(current);
				if(referencedElt != null){
				UUID his = makeNode(referencedElt);
				toAbsorb.add(referencedElt);
				buff.append(PrologGeneratorv6.makeAddReference(obj.eClass().getName(), mine, current.getName(), his, VirtualTimer.getTimeStamp(sitename)));
				buff.append(".\n");
				}
			}
			
		}
		
		// writting the refs
		fw.write(buff.toString());
		
		
		// absorbing the discovered elements
		for (EObject elem : toAbsorb) {
			absorb(elem);
		}
		
	}

	

	 UUID makeNode(EObject obj) throws IOException{
		 	

	        if(obj == null){
	            System.err.println("Null Object in canonisation");
	            new Exception().printStackTrace(System.err);
	            System.exit(1);
	        }


	        Pair<UUID,Boolean> infos = visited.get(obj.hashCode());
	        boolean created = infos != null;
	        UUID mine = null;


	        // create the node

	        if(created){
	            return infos.fst();
	        }

	        

	        //adding it to known elements
	        if(!created){
	            mine = UUID.randomUUID();
	            visited.put(obj.hashCode(), new Pair(mine,false));
	        }else{
	            mine = infos.fst();
	        }
	        
	        //writing the create action
	        StringBuffer buff = new StringBuffer();
	        buff.append(PrologGeneratorv6.makeCreate(obj.eClass().getName(), mine, obj.eClass().getName(),VirtualTimer.getTimeStamp(sitename)));
	        buff.append(".\n");

	        fw.write(buff.toString());


	        // adding name, to name mapping
	        NamedElement ne = null;
	        if (obj instanceof NamedElement) {
	            ne = (NamedElement) obj;
	        }

	        if(ne != null)
	            if(ne.getQualifiedName() != null)
	                namemapping.put(PrologGeneratorv6.printID(mine), obj.eClass().getName()+"->"+ne.getQualifiedName());
	            else if(ne.getName() != null)
	                namemapping.put(PrologGeneratorv6.printID(mine), obj.eClass().getName()+"->"+ne.getName());
	            else if(ne.getLabel() != null)
	                namemapping.put(PrologGeneratorv6.printID(mine), obj.eClass().getName()+"->"+ne.getLabel());


	        //writing properties

	        buff = new StringBuffer();
	        EList<EAttribute>ttref = obj.eClass().getEAllAttributes();
	        for (EAttribute currentAttribute : ttref) {
	            Object values = obj.eGet(currentAttribute);


	            //multivalued ?
	            if (currentAttribute.isMany() || values instanceof EList || values instanceof Iterable) {
	                EList Attr = (EList) values;
	                for (EAttribute val : ttref) {
	                    if(val != null){
	                        buff.append(PrologGeneratorv6.makeAddProperty(obj.eClass().getName(),mine, currentAttribute.getName(), val.toString(), VirtualTimer.getTimeStamp(sitename)));
	                        buff.append(".\n");
	                    }
	                }
	            }

	            if(values != null){	
	            buff.append(PrologGeneratorv6.makeAddProperty(obj.eClass().getName(), mine, currentAttribute.getName(), values.toString(), VirtualTimer.getTimeStamp(sitename)));
	            buff.append(".\n");
	            }

	        }
	        fw.write(buff.toString());

	        return mine;

	    }



 
	

}
