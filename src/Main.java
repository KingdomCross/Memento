import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main 
{

	public static void main(String[] args) 
		{
		
		// TODO Auto-generated method stub

			Write W = new Write();
	        AdvancedIceCreamCone ICTest = new AdvancedIceCreamCone(3, "Chocolate", "Waffle");
	        try {
	        	FileOutputStream f = new FileOutputStream(new File("IceCream.txt"));
		    	ObjectOutputStream o = new ObjectOutputStream(f);
		    	o.writeObject(ICTest);
		    	o.close();
		    	f.close();
	        }
	        catch(Exception ex) {
	        	System.out.println("Bro this don't work");
	        	ex.printStackTrace();
	        }
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
