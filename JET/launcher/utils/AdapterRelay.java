
package utils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class AdapterRelay extends AdapterImpl {


	
	
		
			
			
			

	private objet.impl.ClasseImpl o000;
	
	public AdapterRelay(objet.impl.ClasseImpl o000){
		super();
		this.o000 = o000;
	}
		
	
	
	
		
			
			
			

	private objet.impl.RelationImpl o100;
	
	public AdapterRelay(objet.impl.RelationImpl o100){
		super();
		this.o100 = o100;
	}
		
	
		
			
			
			

	private objet.impl.AttributImpl o110;
	
	public AdapterRelay(objet.impl.AttributImpl o110){
		super();
		this.o110 = o110;
	}
		
	

	public void notifyChanged(Notification msg) {
	
	
		
			
			
			
		if(o000 != null) o000.throwNotification(msg);
		
		
	
	
	
		
			
			
			
		if(o100 != null) o100.throwNotification(msg);
		
		
	
		
			
			
			
		if(o110 != null) o110.throwNotification(msg);
		
		
	
	}
	
	public Notifier getOwner() {
	
	
		
			
			
			
		if(o000 != null) return o000;
		
		
	
	
	
		
			
			
			
		if(o100 != null) return o100;
		
		
	
		
			
			
			
		if(o110 != null) return o110;
		
		
	
		return null;
	}
}