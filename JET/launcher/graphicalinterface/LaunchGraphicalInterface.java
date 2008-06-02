package graphicalinterface;

public class LaunchGraphicalInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicalInterface a = new GraphicalInterface("D:\\ENSISA\\PROJET2A\\workspace");
        a.show();
        //We test if the paths exist
        if(a.getPaths().size()!=0){
        	System.out.println("paths");
        }else{
        	System.out.println("paths does not exist");
        }
	}

}
