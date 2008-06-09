package launcher;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 * 
 * @author Jérémie SCHEER &	Loïc SUTTER
 *
 */

/* find the name of the impl files package in the genmodel
 * file (for instance : lanterne.impl)
 */
public class ImplFinder {
	private File genFile;

	public ImplFinder(File genFile){
		this.genFile = genFile;
	}
	
	/* return the string containing the name of the impl files
	 * package
	 */
	public String implPackage() throws Exception{
		Element root = parse(genFile);
		
		return walkGenFile(root, true);
	}
	
	public String factoryPackage() throws Exception{
		Element root = parse(genFile);
		
		return walkGenFile(root, false);
	}
	
	/* store the genmodel file in a XML document parser 
	 * and returns the root of the document
	 */
	public Element parse(File file) throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder= factory.newDocumentBuilder();
		Document document = builder.parse(file);
		
		return document.getDocumentElement();
	}
	
	/* returns the value of the Node node if it if not null
	 * and if it is a text node
	 */ 
	public String getText(Node node){
		if(node!=null && node.getNodeType()==Node.TEXT_NODE){
			Text text=(Text)node;
			return text.getData();
		}else{
			return "";
		}
	}
	
	/* parses the genmodel file and returns the impl
	 * or the factory package*/
	public String walkGenFile(Node node, boolean impl){
		String implPack = "impl";
		String basePackage = "";
		String ecore = "";
		String ecorePack = "";
		String prefix = "";
		NodeList childrens = node.getChildNodes();
		Element ecoreRoot;
		
		/* parses all the childrens of the root node */
		for(int i=0; i<childrens.getLength(); i++){
			Node child = childrens.item(i);
			
			if(child.getNodeType()==Node.ELEMENT_NODE){
				/* get the relative path of the ecore file associated with the genmodel file */
				if(child.getNodeName().equals("foreignModel")){
					ecore = getText(child.getFirstChild());
				}
				
				/* get the package of the Impl files (attribute of genPackages)
				 * default value : impl
				 */
				if(child.getNodeName().equals("genPackages")){
					Node att = child.getAttributes().getNamedItem("classPackageSuffix");
					if(att!=null){
						implPack = getText(att.getFirstChild());
					}
					
					att = child.getAttributes().getNamedItem("basePackage");
					if(att!=null){
						basePackage = getText(att.getFirstChild())+".";
					}
					
					att = child.getAttributes().getNamedItem("prefix");
					if(att!=null){
						prefix = getText(att.getFirstChild());
					}
				}
			}
		}
		
		/* builds the path of the ecore file and parses this file
		 * in order to find the prefix of the package (for instance : lanterne)
		 */
		ecore = genFile.getAbsolutePath().substring(0, genFile.getAbsolutePath().lastIndexOf('\\'))+"/"+ecore;
		try {
			ecoreRoot = parse(new File(ecore));
			ecorePack = walkEcoreFile(ecoreRoot);
		} catch (Exception e) {
			System.err.println("The ecore file can't be parsed");
			System.exit(-1);
		}
		
		if(impl){
			return basePackage+ecorePack+"."+implPack;
		}else{
			return basePackage+ecorePack+"."+prefix+"Factory";
		}
	}
	
	/* parses the ecore file to find the prefix of the package */
	public String walkEcoreFile(Node node) throws Exception{
		Node att = node.getAttributes().getNamedItem("name");
		
		if(att!=null){
			return getText(att.getFirstChild());
		}else{
			throw new Exception("No name for ecore package");
		}
	}
}
