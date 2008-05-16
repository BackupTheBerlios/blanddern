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
	
	
	public static String makeCreate(UUID id,String typename, String TS){
		return "create("+printID(id)+"," + typename.toLowerCase() + "," + TS +")";
	}
	
	public static String makeDelete(UUID id,String typename, String TS){
		return "delNode("+printID(id)+"," + typename.toLowerCase() + "," + TS +")";
	}
	
	public static String makeAddProperty(UUID id,String typename,String prop, String TS){
		return "addProperty("+printID(id)+"," + typename.toLowerCase() + ", '"+ prop.replace('\n', ' ').replace('\'',' ') +"' ,"+ TS +")";
	}
	
	public static String makeRemProperty(UUID id,String typename,String prop, String TS){
		return "remProperty("+printID(id)+"," + typename.toLowerCase() + ", '"+ prop.replace('\n', ' ').replace('\'',' ') +"' ,"+ TS +")";
	}
	
	public static String makeAddReference(UUID id,String typename, UUID target, String TS){
		return "addReference("+printID(id)+"," + typename.toLowerCase() + ", "+ printID(target) +" ,"+ TS +")";
	}
	
	public static String makeRemReference(UUID id,String typename, UUID target, String TS){
		return "remReference("+printID(id)+"," + typename.toLowerCase() + ", "+ printID(target) +" ,"+ TS +")";
	}
	
	
	public static String printID(UUID u){
		 return "node"+Math.abs(u.getMostSignificantBits())+"u"+Math.abs(u.getLeastSignificantBits());
	 }

	public static final String idPattern = "(node\\d*u\\d*)";
}
