package test;

import java.util.Iterator;
import java.util.List;

import launcher.Launch;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

import filtering.AdaptedFactory;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

public class Test3 {

	static List res;
	static AdaptedFactory fact;
	static EObject[] objects;
	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		bdd.BddPackage  libraryPackage = bdd.BddPackage.eINSTANCE;
		Launch l = new Launch();
		fact = l.adapt();
		
		objects = l.getModel();
		res = fact.loadModel(new EObject[]{((bdd.BaseDeDonnees)objects[0]).getD().get(0), ((bdd.BaseDeDonnees)objects[0]).getD().get(0).getS().get(2)});
		
		
//		bdd.impl.TableImpl t0 = (bdd.impl.TableImpl) ((bdd.BaseDeDonnees)objects[0]).getD().get(0);
//		bdd.impl.TableImpl t1 = (bdd.impl.TableImpl) ((bdd.BaseDeDonnees)objects[0]).getD().get(0).getS().get(2).getFk().getTable();
//		bdd.impl.ColonneImpl c2 = (bdd.impl.ColonneImpl) ((bdd.BaseDeDonnees)objects[0]).getD().get(0).getS().get(2);
//		t0.eAdapters().add(new AdapterImpl(){
//			public void notifyChanged(Notification msg) {
//				System.out.println("*tO = " + msg.getOldValue() + " _ " + msg.getNewValue());
//			}
//		});
//		t1.eAdapters().add(new AdapterImpl(){
//			public void notifyChanged(Notification msg) {
//				System.out.println("*t1 = " + msg.getOldValue() + " _ " + msg.getNewValue());
//			}
//		});
//		c2.eAdapters().add(new AdapterImpl(){
//			public void notifyChanged(Notification msg) {
//				System.out.println("*c2 = " + msg.getOldValue() + " _ " + msg.getNewValue());
//			}
//		});
//		
//		objet.Classe cl0 = ((objet.Classe)((EObject[])res.get(0))[0]);
//		objet.impl.RelationImpl r1 = (objet.impl.RelationImpl) ((utils.AdapterRelay) c2.eAdapters().get(0)).getOwner();
//		cl0.eAdapters().add(new AdapterImpl(){
//			public void notifyChanged(Notification msg) {
//				System.out.println("***clO = " + msg.getOldValue() + " _ " + msg.getNewValue());
//			}
//		});
//		r1.eAdapters().add(new AdapterImpl(){
//			public void notifyChanged(Notification msg) {
//				System.out.println("***r1 = " + msg.getOldValue() + " _ " + msg.getNewValue());
//			}
//		});
//
//		System.out.println(((objet.impl.ClasseImpl)((utils.AdapterRelay) t0.eAdapters().get(0)).getOwner()).getName());
//		System.out.println(cl0);
//		System.out.println(((utils.AdapterRelay) t0.eAdapters().get(0)).getOwner());
//		System.out.println(((objet.impl.RelationImpl)((utils.AdapterRelay) c2.eAdapters().get(0)).getOwner()).getName());
//		System.out.println(r1);
//		System.out.println(((utils.AdapterRelay) c2.eAdapters().get(0)).getOwner());
//		System.out.println("");
//			System.out.println("t0 listener = " + t0.eAdapters());
//			System.out.println("t1 listener = " + t1.eAdapters());
//			System.out.println("c2 listener = " + c2.eAdapters());
//			System.out.println("cl0 listener = " + cl0.eAdapters());
//			System.out.println("r1 listener = " + r1.eAdapters());
//		System.out.println("");
//			showBDD(objects);
//		System.out.println("");
//			showO(res);
//		System.out.println("");
//		System.out.println(((utils.AdapterRelay) t0.eAdapters().get(0)).getOwner());
//		System.out.println(((utils.AdapterRelay) c2.eAdapters().get(0)).getOwner());
//		System.out.println("");
//		
//		
//			t0.setName("Bonhomme");
//		System.out.println("***");
//			bdd.impl.ColonneImpl c = new bdd.impl.ColonneImpl();
//		System.out.println("***");
//			c.setName("etage");
//		System.out.println("***");
//			t1.getS().add(c);
//		System.out.println("***");
//			c.setName("CP");
//		
//
//		System.out.println("");
//			showO(res);
//		System.out.println("");
//			showBDD(objects);
//		System.out.println("");
//			System.out.println("*******");
//		System.out.println("");
//		
//
//			cl0.setName("Personne");
//		System.out.println("***");
//			objet.Propriete p = r1.getType().getA().get(3);
//		System.out.println("***");
//			p.setName("etage");
//		System.out.println("***");
//			r1.getType().getA().remove(p);
//		System.out.println("***");
//			r1.setName("domicile");
			
			
		showO(res);
		showBDD(objects);
	}
	
	public static void showBDD(Object[] objects){
		System.out.println("*** IN BDD");
		bdd.impl.TableImpl t1 = (bdd.impl.TableImpl) ((bdd.BaseDeDonnees)objects[0]).getD().get(0);
		System.out.println("Table :" + t1.getName() + " : ");
		Iterator it1 = t1.getS().iterator();
		while(it1.hasNext()){
			bdd.Colonne c = (bdd.Colonne) it1.next();
			System.out.println(c+" Name : "+c.getName());
		}
		bdd.impl.TableImpl t2 = (bdd.impl.TableImpl) ((bdd.BaseDeDonnees)objects[0]).getD().get(0).getS().get(2).getFk().getTable();
		System.out.println("Table :" + t2.getName() + " : ");
		Iterator it2 = t2.getS().iterator();
		while(it2.hasNext()){
			bdd.Colonne c = (bdd.Colonne) it2.next();
			System.out.println(c+" Name : "+c.getName());
		}
		System.out.println("*** OUT BDD");
	}
	
	public static void showO(List res){
		System.out.println("*** IN O");
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
		System.out.println("*** OUT O");
	}
}
