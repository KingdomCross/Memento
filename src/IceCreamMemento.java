import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * Alex Chheng and Chloe
 * 10/24/2019
 * Input: No input require
 * Output: String
 */
//http://web.csulb.edu/~mopkins/cecs277/projectmemento.shtml
public class IceCreamMemento implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numberOfScoops; //This ice cream cone can have unlimited scoops of ice cream -- but only one flavor
    private String flavor; //The available flavors are Chocolate, Vanilla, Strawberry and Mimi's Minty
    private String typeOfCone; //There is a choice of three cone types: regular, sugar or waffle
    private ArrayList<String> toppings; //There is no limit to the number of toppings. You may use any toppings that you want.

    //The major difference here will be that the Memento objects themselves are being stored to a file. Do not create/store an ArrayList as shown in the examples. All of the Memento objects will be stored to the same file
    //Again, you are saving the state of the Ice Cream Cone to the Memento object, not the Ice Cream Cone itself.


    public IceCreamMemento() {

    }
    /**
     * Constructor for the Ice Cream Momento
     * @param numberOfScoops number of scoops
     * @param flavor 
     * @param typeOfCone
     */
    public IceCreamMemento(int numberOfScoops, String flavor, String typeOfCone, ArrayList t) {
        this.numberOfScoops = numberOfScoops;
        this.flavor = flavor;
        this.typeOfCone = typeOfCone;
        this.toppings = t;
    }
    /**
     * Returns the number of scoops
     * @return returns the number of scoops
     */
    public int getNumberOfScoops() {
        return numberOfScoops;
    }
    /**
     * Returns the flavor of IceCream
     * @return returns the Flavor of IceCream
     */
    public String getFlavor() {
        return flavor;
    }
    /**
     * Returns the type of cone
     * @return returns type of cone
     */
    public String getTypeOfCone() {
        return typeOfCone;
    }
    /**
     * Returns the list of toppings
     * @return returns the toppings
     */
    public ArrayList<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Memento " +
                "numberOfScoops=" + numberOfScoops +
                ", flavor='" + flavor + '\'' +
                ", typeOfCone='" + typeOfCone + '\'' +
                ", toppings=" + toppings ;
    }
    /**
     * Searches file for savedCone matching the flavor of the object calling it
     * Acts as a work around for the getMemento method in the CareTaker class
     * @param o the AdvancedIceCreamCone Object
     * @return
     */
    public IceCreamMemento getSavedCone()
    {
    	ObjectInputStream in = null;
    	IceCreamMemento object = new IceCreamMemento();
		try {
			
			in = new ObjectInputStream( new FileInputStream("IceCream.txt"));

			 try {
			       object = (IceCreamMemento) in.readObject();
			        for(;;){
			       
			            if(this.flavor.compareTo(object.getFlavor()) ==0) 
			            {
				        	 IceCreamMemento NewCone = object;
				        	// System.out.println("Cone Found: /n "+ NewCone.toString());
				        	 return NewCone;		        	 
			        }
			        }
	
		} 
			 finally {
				    if (in != null) { 

				        in.close(); 
				     
				    } else { 
				        System.out.println("PrintWriter not open");
				    } 
			 }
		}
				    catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			try {
				in.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("File ended");
		}
		catch(NullPointerException O) {
			System.out.println("Object does not exist");
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
    }

}

