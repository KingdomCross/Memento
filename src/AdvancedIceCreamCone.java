/* This class is used to model the properties and behaviors of an ice cream cone.
   There are currently restriction on the construction of the cone: only one
   flavor of ice cream is allowed and up to five toppings. You can only add scoops, you
   cannot remove them. */
import java.io.Serializable;
import java.util.*;
public class AdvancedIceCreamCone  {
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
    //this method returns the number of scoops in the cone
    public int getNumberOfScoops () {
        return numberOfScoops;
    }
    //this method returns the ice cream flavor
    public String getFlavor() {
        return flavor;
    }
    //this method returns the type of cone
    public String getTypeOfCone() {
        return typeOfCone;
    }
    //this method allows you to add one scoop of ice cream at a time
    public void addScoop() {
        numberOfScoops=numberOfScoops+1;
    }
    //this method allows you to change the ice cream flavor
    public void setFlavor(String flv) {
        flavor=flv;
    }
    //this method allows you to change the type of cone
    public void setTypeOfCone(String cone) {
        typeOfCone=cone;
    }
    //this method allows you to add toppings from an ArrayList
    public void addToppings(List<String> top) {
        toppings.addAll(top);
    }
    //this method allows you to add one topping
    public void addToppings(String top) {
        toppings.add(top);
    }
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
        return new IceCreamMemento(this.numberOfScoops, this.flavor, this.typeOfCone);
    }
    public AdvancedIceCreamCone restore(IceCreamMemento m) {
        AdvancedIceCreamCone mc = m.getSavedCone();
        System.out.println("saved cone: " + mc);
        numberOfScoops=mc.getNumberOfScoops();
        flavor=mc.getFlavor();
        typeOfCone=mc.getTypeOfCone();
        toppings = mc.getToppings();
        System.out.println("Originator: State after restoring from Memento: " + this);
        return mc;
    }

}
