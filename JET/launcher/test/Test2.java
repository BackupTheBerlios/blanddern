package test;

import java.util.Iterator;
import java.util.List;

import launcher.Launch;

import org.eclipse.emf.ecore.EObject;

import filtering.AdaptedFactory;

import vessie.VessieContainer;

/**
 * 
 * @author J�r�mie SCHEER & Lo�c SUTTER
 *
 */

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		vessie.VessiePackage libraryPackage = vessie.VessiePackage.eINSTANCE;
		Launch l = new Launch();
		AdaptedFactory fact = l.adapt();
		
		EObject[] objects = l.getModel();
		
		List res = fact.loadModel(new EObject[]{((VessieContainer)objects[0]).getVessies().get(0)});
		
		Iterator it = res.iterator();
		EObject[] objres = (EObject[])it.next();
		lanterne.Lanterne lant= (lanterne.Lanterne)objres[0];
		System.out.println("New Intensite in adapted Lanterne : "+lant.getIntensite());
		System.out.println("New luminosite in adapted Lanterne : "+lant.getLuminosite());
	}
}
