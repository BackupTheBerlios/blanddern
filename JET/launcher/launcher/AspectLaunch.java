
package launcher;

import org.aspectj.bridge.*;
import org.aspectj.tools.ajc.Main;

import java.io.File;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */

/*
 * This class compile files .aj into field src-gen
 */
public class AspectLaunch {
	/* launch the aspect compiling 
	 * srcDir : path of the source metamodel binary files
	 * targetDir : path of the target metmodel binary files
	 * */
	public void launch(String srcDir, String targetDir) {
		File ajDir = new File("src-gen");
		
		/* create the directory for the archive result file */
		File outputDir = new File("adapted");
		File outputJar = new File("adapted\\VessieLanterneAdapted.jar");
		if(!outputDir.exists()){
			outputDir.mkdir();
		}
		
		/* effectively does the compilation with arguments args */
		String [] args = {"-showWeaveInfo", "-sourceroots"  , ajDir.getAbsolutePath() , "-inpath" , targetDir, "-outjar", outputJar.getAbsolutePath(), "-cp", System.getProperty("java.class.path") + System.getProperty("path.separator") + srcDir};
		
		Main compiler = new Main();
	    MessageHandler m = new MessageHandler();
	    
	    compiler.run(args, m);
	    IMessage[] ms = m.getErrors();
	    m.clearMessages();
	    if(ms.length>0){
	    	System.err.println("AspectJ files has not been correctly executing  --> Incorrect adaptor model");
	    	System.exit(-1);
	    }
	}

}
