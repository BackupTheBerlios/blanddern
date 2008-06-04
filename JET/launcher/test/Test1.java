package test;

import java.util.Iterator;
import java.util.List;

import launcher.Launch;

import org.eclipse.emf.ecore.EObject;

import filtering.AdaptedFactory;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		vessie.VessiePackage libraryPackage = vessie.VessiePackage.eINSTANCE;
		Launch l = new Launch();
		AdaptedFactory fact = l.adapt();
		
		EObject[] objects = l.getModel();
		
		List res = fact.loadModel(new EObject[]{objects[0]});
		
		Iterator it = res.iterator();
		EObject[] objres = (EObject[])it.next();
		lanterne.Lanterne lant= (lanterne.Lanterne)objres[0];
		System.out.println("New Intensite : "+lant.getIntensite());
		System.out.println("New luminosite : "+lant.getLuminosite());
	}
}
