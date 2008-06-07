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
		
		List res = fact.loadModel(new EObject[]{((bdd.BaseDeDonnees)objects[0]).getD().get(0), ((bdd.BaseDeDonnees)objects[0]).getD().get(0).getS().get(2)});
		
		Iterator it = res.iterator();
		EObject[] objres = (EObject[])it.next();
		objet.Classe cl = (objet.Classe)objres[0];
		System.out.println("New Proprietes in adapted Classe "+ cl.getName() + " : ");
		
		Iterator it2 = cl.getA().iterator();
		while(it2.hasNext()){
			objet.Propriete p = (objet.Propriete)it2.next();
		
			System.out.println(p+" Name : "+p.getName());
		}
		
		EObject[] objres2 = (EObject[])it.next();
		objet.Relation rel = (objet.Relation)objres2[0];
		System.out.println("New Classe in adapted Relation " + rel.getName() + " : "+rel.getType().getName());
		
		Iterator it3 = rel.getType().getA().iterator();
		while(it3.hasNext()){
			objet.Propriete p = (objet.Propriete)it3.next();
			System.out.println(p+" Name : "+p.getName());
		}
	}
}
