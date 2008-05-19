
package launcher;

import org.aspectj.bridge.*;
import org.aspectj.tools.ajc.Main;

import java.io.File;
import java.util.Arrays;


public class AspectLaunch {

	/**
	 * This class compile files .aj into field src-gen
	 */
	public void launch(String srcDir, String targetDir) {
		File ajDir = new File("src-gen");
		
		File outputDir = new File("adapted");
		File outputJar = new File("adapted\\VessieLanterneAdapted.jar");
		if(!outputDir.exists()){
			outputDir.mkdir();
		}
		
		
		String [] args = {"-showWeaveInfo", "-sourceroots"  , ajDir.getAbsolutePath() , "-inpath" , targetDir, "-outjar", outputJar.getAbsolutePath(), "-cp", System.getProperty("java.class.path") + System.getProperty("path.separator") + srcDir};
		
		Main compiler = new Main();
	    MessageHandler m = new MessageHandler();
	    compiler.run(args, m);
	    IMessage[] ms = m.getMessages(null, true);
	    System.out.println("messages: " + Arrays.asList(ms));
	}

}
