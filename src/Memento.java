import java.util.Arrays;

/**
 * Alex Chheng and Chloe
 * 10/24/2019
 * Input:
 * Output:
 */
//http://web.csulb.edu/~mopkins/cecs277/projectmemento.shtml
public class Memento {
    private String flavor; //The available flavors are Chocolate, Vanilla, Strawberry and Mimi's Minty
    private String cone; //There is a choice of three cone types: regular, sugar or waffle
    private String[] topping; //There is no limit to the number of toppings. You may use any toppings that you want.
    private int scoop; //This ice cream cone can have unlimited scoops of ice cream -- but only one flavor

    //The major difference here will be that the Memento objects themselves are being stored to a file. Do not create/store an ArrayList as shown in the examples. All of the Memento objects will be stored to the same file
    //Again, you are saving the state of the Ice Cream Cone to the Memento object, not the Ice Cream Cone itself.

    public Memento(String flavor, String cone, String[] topping, int scoop) {
        this.flavor = flavor;
        this.cone = cone;
        this.topping = topping;
        this.scoop = scoop;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getCone() {
        return cone;
    }

    public String[] getTopping() {
        return topping;
    }

    public int getScoop() {
        return scoop;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "flavor='" + flavor + '\'' +
                ", cone='" + cone + '\'' +
                ", topping=" + Arrays.toString(topping) +
                ", scoop=" + scoop +
                '}';
    }
}
