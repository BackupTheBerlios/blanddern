package test;

import java.util.Iterator;
import java.util.List;

import launcher.Launch;

import org.eclipse.emf.ecore.EObject;

import filtering.AdaptedFactory;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bdd.BddPackage  libraryPackage = bdd.BddPackage.eINSTANCE;
		Launch l = new Launch();
		AdaptedFactory fact = l.adapt();
		
		EObject[] objects = l.getModel();
		
		List res = fact.loadModel(new EObject[]{((bdd.BaseDeDonnees)objects[0]).getD().get(0)});
		
		Iterator it = res.iterator();
		EObject[] objres = (EObject[])it.next();
		objet.Classe cl = (objet.Classe)objres[0];
		System.out.println("New colonnes : "+cl.getA());
	}
}
