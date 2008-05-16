package launcher;

import java.io.File;

import javax.swing.filechooser.FileFilter;

/* creation of a particular filter for the JFileChooser
 * component 
 * filters the suffixes of the chosen files and give a little 
 * description
 */ 
public class MyFilter extends FileFilter{
	String [] suffixes;
	String  description;
	
	public MyFilter(String [] suffixes, String description){
		this.suffixes = suffixes;
		this.description = description;
	}
	
	/* true if the argument is the same as a filtered 
	 * suffix
	 */
	boolean appartient( String suffixe ){
		for( int i = 0; i<suffixes.length; ++i){
			if(suffixe.equals(suffixes[i])){
				return true;
			}
		}
		return false;
	}
	
	/* true if the chosen file is accepted according to
	 * the filtered suffixes
	 */
	public boolean accept(File f) {
		if (f.isDirectory()){
			return true;
		}
	    String suffixe = null;
	   
	    String s = f.getName();
	    int i = s.lastIndexOf('.');
	    if (i > 0 &&  i < s.length() - 1){
	    	suffixe = s.substring(i+1).toLowerCase();
	    }
	    return suffixe != null && appartient(suffixe);
	}
	
	public String getDescription() {
		return this.description;
	   }	
}

