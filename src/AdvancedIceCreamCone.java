/* 	Alex Chheng Chloe Culver
 * This class is used to model the properties and behaviors of an ice cream cone.
   There are currently restriction on the construction of the cone: only one
   flavor of ice cream is allowed and up to five toppings. You can only add scoops, you
   cannot remove them. */
import java.io.Serializable;
import java.util.*;
public class AdvancedIceCreamCone implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numberOfScoops;
    private String flavor;
    private String typeOfCone;
    private ArrayList<String> toppings = new ArrayList<String>();



    //the default constructor creates a one scoop, vanilla ice cream cone using the regular type of cone and no toppings
    public AdvancedIceCreamCone() {
        numberOfScoops=1;
        flavor="vanilla";
        typeOfCone="regular";
    }
    /*this constructor lets you create an ice cream code to your liking. It takes in three parameters:
      the number of scoops, the flavor of the ice cream and the type of cone */
    public AdvancedIceCreamCone(int ns,String flv,String cone) {
        numberOfScoops=ns;
        flavor=flv;
        typeOfCone=cone;
    }
    /**
     * 
     * @return returns the number of scoops 
     */
    //this method returns the number of scoops in the cone
    public int getNumberOfScoops () {
        return numberOfScoops;
    }
    /**
     * 
     * @return returns the flavor of Ice Cream
     */
    //this method returns the ice cream flavor
    public String getFlavor() {
        return flavor;
    }
    /**
     * 
     * @return return the type of cone
     */
    //this method returns the type of cone
    public String getTypeOfCone() {
        return typeOfCone;
    }
    /**
     *  Adds scoop to order
     */
    //this method allows you to add one scoop of ice cream at a time
    public void addScoop() {
        numberOfScoops=numberOfScoops+1;
    }
    /**
     * setsFlavor of IceCream
     * @param flv name of Flavor
     */
    //this method allows you to change the ice cream flavor
    public void setFlavor(String flv) {
        flavor=flv;
    }
    /**
     * 
     * @param cone name of cone
     */
    //this method allows you to change the type of cone
    public void setTypeOfCone(String cone) {
        typeOfCone=cone;
    }
    /**
     * adds toppings to order
     * @param top the list of toppings that are to be added
     */
    //this method allows you to add toppings from an ArrayList
    public void addToppings(List<String> top) {
        toppings.addAll(top);
    }
    /**
     * adds a single topping
     * @param top
     */
    //this method allows you to add one topping
    public void addToppings(String top) {
        toppings.add(top);
    }
    /**
     * 
     * @return returns a list of toppings
     */
    //this method returns a String with a list of the toppings
    public ArrayList<String> getToppings () {
        return toppings;
    }

    //this method overrides the inherited toString()
    public String toString() {
        return ("The number of scoops is " + numberOfScoops + ". The flavor is " +
                flavor + ". And the type of cone is " + typeOfCone + " and the toppings are: " + getToppings());
    }
    public IceCreamMemento save() {
        System.out.println("Originator: Saving to Memento.");
        return  new IceCreamMemento(this.numberOfScoops, this.flavor, this.typeOfCone, toppings);
    }
    public AdvancedIceCreamCone restore(IceCreamMemento m) {
    	
    	IceCreamMemento mc = m.getSavedCone();
        System.out.println("saved cone: " + mc.toString());
        numberOfScoops=mc.getNumberOfScoops();
        flavor = mc.getFlavor();
        typeOfCone=mc.getTypeOfCone();
        toppings = mc.getToppings();
        System.out.println("Originator: State after restoring from Memento: " + this);
        return this;
    }

}
