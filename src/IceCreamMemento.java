import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
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
     * 
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
     * 
     * @return returns the number of scoops
     */
    public int getNumberOfScoops() {
        return numberOfScoops;
    }
    /**
     * 
     * @return returns the Flavor of IceCream
     */
    public String getFlavor() {
        return flavor;
    }
    /**
     * 
     * @return returns type of cone
     */
    public String getTypeOfCone() {
        return typeOfCone;
    }
    /**
     * 
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
     * 
     * @param o the AdvancedIceCreamCone Object
     * @return
     */
    public IceCreamMemento getSavedCone()
    {
    	IceCreamMemento b = new IceCreamMemento();
    	ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("IceCream.txt"));
			b = (IceCreamMemento) in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(NullPointerException n) {
			System.out.println("The file does not exist");
		}
    

        return b;
    }

}
