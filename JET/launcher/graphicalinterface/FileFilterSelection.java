package graphicalinterface;


import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */
public class FileFilterSelection extends FileFilter{

    private String [] suffixs;
    private String  description;
	
    public FileFilterSelection(String [] suffixs, String description){
	this.suffixs = suffixs;
	this.description = description;
    }
    
    public boolean belong( String suffix ){
        for( int i = 0; i<suffixs.length; ++i){
            if(suffix.equals(suffixs[i])){
		return true;
            }
        }
	return false;
    }
    
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
	return suffixe != null && belong(suffixe);
    }

    public String getDescription() {
        return this.description;
    }

}

