import java.util.ArrayList;
import java.util.Arrays;

/**
 * Alex Chheng and Chloe
 * 10/24/2019
 * Input: No input require
 * Output: String
 */
//http://web.csulb.edu/~mopkins/cecs277/projectmemento.shtml
public class IceCreamMemento {
    private int numberOfScoops; //This ice cream cone can have unlimited scoops of ice cream -- but only one flavor
    private String flavor; //The available flavors are Chocolate, Vanilla, Strawberry and Mimi's Minty
    private String typeOfCone; //There is a choice of three cone types: regular, sugar or waffle
    private ArrayList<String> toppings; //There is no limit to the number of toppings. You may use any toppings that you want.

    //The major difference here will be that the Memento objects themselves are being stored to a file. Do not create/store an ArrayList as shown in the examples. All of the Memento objects will be stored to the same file
    //Again, you are saving the state of the Ice Cream Cone to the Memento object, not the Ice Cream Cone itself.

    public IceCreamMemento(int numberOfScoops, String flavor, String typeOfCone, ArrayList<String> toppings) {
        this.numberOfScoops = numberOfScoops;
        this.flavor = flavor;
        this.typeOfCone = typeOfCone;
        this.toppings = toppings;
    }

    public int getNumberOfScoops() {
        return numberOfScoops;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getTypeOfCone() {
        return typeOfCone;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "numberOfScoops=" + numberOfScoops +
                ", flavor='" + flavor + '\'' +
                ", typeOfCone='" + typeOfCone + '\'' +
                ", toppings=" + toppings +
                '}';
    }

    public AdvancedIceCreamCone getSavedCone() {
        return null;
    }
}
