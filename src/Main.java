import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main 
{

	public static void main(String[] args) 
		{
		
		// TODO Auto-generated method stub

			/**
			 * This class is used to Test Reading and Writing Objects to a file
			 */
	        AdvancedIceCreamCone ICTest = new AdvancedIceCreamCone(3, "Chocolate", "Waffle");
	        try {
	        	FileOutputStream f = new FileOutputStream(new File("IceCream.txt"));
		    	ObjectOutputStream o = new ObjectOutputStream(f);
		    	o.writeObject(ICTest);
		    	o.close();
		    	f.close();
		    	ObjectInputStream in = new ObjectInputStream(  new FileInputStream("IceCream.txt"));
		    	AdvancedIceCreamCone b = (AdvancedIceCreamCone) in.readObject();
		    	System.out.println(b.toString());
	        }
	        catch(Exception ex) {
	        	System.out.println("Bro this don't work");
	        	ex.printStackTrace();
	        }
	        finally{
	        	System.exit(0);
	        	}
	        
	        /**
	         * This portion of code Reads out the file contents
	         */
	        try {
			FileInputStream fi = new FileInputStream(new File("IceCream.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			System.out.println(ICTest.toString());
			oi.close();
			fi.close();
	        }
	        catch(Exception e) {
	        	System.out.println("Bro this don't work");
	        	e.printStackTrace();
	        }
	        

	        
	        
	        
	    }
	 
}
