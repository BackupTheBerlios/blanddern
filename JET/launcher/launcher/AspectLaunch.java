
package launcher;

import org.aspectj.bridge.*;
import org.aspectj.tools.ajc.Main;

import java.io.File;
import java.util.Arrays;


public class AspectLaunch {

	/**
	 * This class compile files .aj into field src-gen
	 */
	public static void main(String[] arg) {
		
		
		String [] args = {"-showWeaveInfo", "-sourceroots"  , "D:\\ENSISA\\PROJET2A\\workspace\\JET\\src-gen" , "-inpath" , "D:\\ENSISA\\PROJET2A\\workspace\\Lanterne\\bin", "-outjar", "D:\\ENSISA\\PROJET2A\\workspace\\JET\\adapted\\VessieLanterneAdapted.jar", "-cp", System.getProperty("java.class.path") + System.getProperty("path.separator") + "D:\\ENSISA\\PROJET2A\\workspace\\Vessie\\bin"};
		
		Main compiler = new Main();
	    MessageHandler m = new MessageHandler();
	    compiler.run(args, m);
	    IMessage[] ms = m.getMessages(null, true);
	    System.out.println("messages: " + Arrays.asList(ms));
	}

}
