package emf2prolog;


/**
 * Copyright 2008 Alix Mougenot
 * 
 * This file is part of The Praxis Project.
 * 
 * The Praxis Project is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or any later
 * version.
 * 
 * The Praxis Project is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with The Praxis Project. If not, see <http://www.gnu.org/licenses/>.
 */
import java.util.UUID;


/**
 * 
 * @author Alix Mougenot
  * This class generates prolog code for the formalism v6.
  */
public class PrologGeneratorv6 {
	
	
	public static String makeCreate(String nodeName, UUID id,String typename, String TS){
		return "create("+nodeName+","+printID(id)+"," + typename.toLowerCase() + "," + TS +")";
	}
	
	public static String makeDelete(String nodeName, UUID id,String typename, String TS){
		return "delNode("+nodeName+","+printID(id)+"," + typename.toLowerCase() + "," + TS +")";
	}
	
	public static String makeAddProperty(String nodeName, UUID id,String typename,String prop, String TS){
		return "addProperty("+nodeName+","+typename+","+printID(id)+"," + typename.toLowerCase() + ", '"+ prop.replace('\n', ' ').replace('\'',' ') +"' ,"+ TS +")";
	}
	
	public static String makeRemProperty(String nodeName, UUID id,String typename,String prop, String TS){
		return "remProperty("+nodeName+","+typename+","+printID(id)+"," + typename.toLowerCase() + ", '"+ prop.replace('\n', ' ').replace('\'',' ') +"' ,"+ TS +")";
	}
	
	public static String makeAddReference(String nodeName, UUID id,String typename, UUID target, String TS){
		return "addReference("+nodeName+","+typename+","+printID(id)+"," + typename.toLowerCase() + ", "+ printID(target) +" ,"+ TS +")";
	}
	
	public static String makeRemReference(String nodeName, UUID id,String typename, UUID target, String TS){
		return "remReference("+nodeName+","+typename+","+printID(id)+"," + typename.toLowerCase() + ", "+ printID(target) +" ,"+ TS +")";
	}
	
	
	public static String printID(UUID u){
		 return "node"+Math.abs(u.getMostSignificantBits())+"u"+Math.abs(u.getLeastSignificantBits());
	 }

	public static final String idPattern = "(node\\d*u\\d*)";
}
