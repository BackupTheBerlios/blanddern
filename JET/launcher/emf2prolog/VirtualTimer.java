package emf2prolog;


import java.util.Calendar;

/**
 * 
 * @author Alix Mougenot
 */
 /** Global timer used to get Time Stamps
 *
 */


public class VirtualTimer {

	static private int session = 0;
	static public String currentsite;
	private static Calendar cal= Calendar.getInstance();
	

	
	
	public static String getTimeStamp(){
		return getTimeStamp(currentsite);
	}
	
	public static String getTimeStamp(String sitename){
		session++;
		return "["+ 0 + "," + (cal.getTimeInMillis()+session) +",\'"+sitename+"\']";
	}
	
	
	
	
}
