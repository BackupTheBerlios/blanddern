package launcher;

import interpretor.InterpretorFacade;
import interpretor.InterpretorFactory;
import interpretor.Result;
import interpretor.Variable;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

import filtering.AdaptedFactory;

import adaptor.Adaptor;
import adaptor.AdaptorPackage;

import utils.Tools;
import vessie.Vessie;
import vessie.VessieContainer;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//bdd.BddPackage  libraryPackage = bdd.BddPackage.eINSTANCE;
		vessie.VessiePackage libraryPackage = vessie.VessiePackage.eINSTANCE;
		Launch l = new Launch();
		AdaptedFactory fact = l.adapt();
		
		EObject[] objects = l.getModel();
		
		List res = fact.loadModel(new EObject[]{((VessieContainer)objects[0]).getVessies().get(0)});
		//List res = fact.loadModel(new EObject[]{((bdd.BaseDeDonnees)objects[0]).getD().get(0)});
		
		System.out.println("toto");
		
		Iterator it = res.iterator();
		EObject[] objres = (EObject[])it.next();
		//lanterne.Lanterne lant= (lanterne.Lanterne)objres[0];
		//objet.Classe cl = (objet.Classe)objres[0];
		//System.out.println(cl.getA());
		//System.out.println(lant.getLuminosite());
	}
}
