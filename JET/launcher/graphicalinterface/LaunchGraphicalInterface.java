package graphicalinterface;

import java.util.ArrayList;
import java.util.List;

public class LaunchGraphicalInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicalInterface a = new GraphicalInterface("D:\\ENSISA\\PROJET2A\\workspace");
        a.setVisible(true);
        //We test if the paths exist
        if(a.getPaths().size()==5){
        	ArrayList lst = (ArrayList) a.getPaths();
        	for(int i=0;i<5;i++){
        		System.out.println("lst["+i+"] = "+lst.get(i).toString());
        	}
        }else{
        	System.out.println("paths does not exist");
        }
	}

}
