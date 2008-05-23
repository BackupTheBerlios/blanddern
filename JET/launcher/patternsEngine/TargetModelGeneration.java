package patternsEngine;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.String;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Interface;

import adaptor.Adaptor;
import adaptor.Instance;

import lanterne.Lanterne;
import lanterne.LanterneFactory;
import lanterne.impl.LanterneFactoryImpl;

import sun.security.jca.GetInstance;
import utils.Tools;

/**
 * @author Jérémie SCHEER & Loïc SUTTER
 */


//TODO : mettre les dependances dans le projet

/*
 * This class build the final target model
 */
public class TargetModelGeneration {

	private String modelName; //lanterne
	private String packageName; //lanterne.impl
	
	//Constructor
	public TargetModelGeneration(String packageName) {
		this.packageName = packageName;
		modelName = packageName.substring(0, packageName.indexOf('.'));
	}
	
	//Sequence to build the final model
	public void buildModel(){
		EObject [] model = generateRhsPatternModel(getRhsPatternName());
		String fileName = "test."+modelName;
		URI fileURI_model = URI.createFileURI(new File(fileName).getAbsolutePath());
		Tools.saveModel(fileURI_model, model);
		System.out.println("Model is build !!!");
	}

	//We recover the name of the pattern model and we initialize the modelName
	//param : string
	//return EClass[]
	public String getRhsPatternName(){
		URI uri = URI.createFileURI(new File("../adaptor/models/model.adaptor").getAbsolutePath());
		EObject [] model = Tools.loadModel(uri);
		
		Adaptor a = (Adaptor) model[0];
		
		//TODO : Parcours de tout les matchings
		String rhsPatternPackageName = a.getMatching().get(0).getRhs().get(0).getComposed().get(0).getName();
		modelName = rhsPatternPackageName;
		
		String rhsPatternName=rhsPatternPackageName.replaceFirst(".",(rhsPatternPackageName.charAt(0)+"").toUpperCase());
		rhsPatternName = rhsPatternPackageName+".impl."+rhsPatternName+"FactoryImpl";
		
		return rhsPatternName;
	}
	
	//This method generate the rhs model pattern which is the result model
	//Param : Eclass[]
	public EObject[] generateRhsPatternModel(String patternName){		
		try {
			//TODO : ici on cree un objet du type "modelName"
			//TODO : puis on récupère grâce à le fct executesProlog une liste de résultat tab de string[2]
			//TODO : on fai un toLowerCase sur l'elt retourné
			//On execute la méthode correspondant a cet elt
			
			//TODO : IDEE D'ALGO
			
			//TODO : On récupère la List et on la parcours
			
			//TODO : Si elt[0] == 'create' alors creation nouvelle instance
			//TODO : Si elt[0] == 'addProperty' alors setXXX
			
			
			/* Ce qu'il faut mais après introspection */
			/*Lanterne l = ((LanterneFactory) o).createLanterne();
			l.setIntensite(7);
			l.setLuminosite("5");
			*/
			
			//EN BONNE VOIE
			
			//We declare a class which is called with the patterName and an object which is an instance of the previous class
			Class cs = Class.forName(patternName);
			Object obj = cs.newInstance();
			
			//We search method called init in the class which was instantiate on the top
			Method m = obj.getClass().getMethod("init",null);
			Object o = m.invoke(obj,null);
			
			
			Method mandm = o.getClass().getMethod("createLanterne",null);
			
			Class lant = Class.forName("lanterne.impl.LanterneImpl");
			Object lantoo = mandm.invoke(obj,null);
			
			Method setI = lantoo.getClass().getMethod("setIntensite",new Class[]{int.class});
			Method setL = lantoo.getClass().getMethod("setLuminosite",new Class[]{String.class});
			
			setI.invoke(lantoo, 2);
			setL.invoke(lantoo, "3");
			
			return new EObject [] {(EObject) lantoo};
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String getCreateMethodName(){
		return "";
	}
	
	public String getImplClassName(){
		return "";
	}
	
	public void getCalledMethodType(){
		//while...
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TargetModelGeneration tmg = new TargetModelGeneration("lanterne.impl");
		tmg.buildModel();
	}
	
	
	

}
