/**
 * Alex Chheng and Chloe Culver
 * 10/31/2019
 * Input: Not require
 * Output: Testing data
 */

import java.util.*;
public class IceCreamConeTester {
    /* This class is used to test the functionality of the IceCreamCone class */
    public static void main(String [] args) {
        IceCreamCaretaker caretaker = new IceCreamCaretaker(); //object
        AdvancedIceCreamCone ICC = new AdvancedIceCreamCone(); //object
        System.out.println("The new cone is: " + ICC); //output string
        ICC.addScoop(); //add scoops
        ICC.addToppings("chips"); //add topping
        ICC.addToppings("fudge"); //add
        System.out.println("The cone is now: " + ICC); //output
        caretaker.addMemento( ICC.save()); //add
        ICC = new AdvancedIceCreamCone(2,"chocolate","sugar"); //object
        System.out.println("Cone 2 is: " + ICC); //print
        ICC.setFlavor("strawberry"); //set
        System.out.println("The flavor of cone one is now " + ICC.getFlavor()); //output
        ICC.setTypeOfCone("waffle"); //set
        System.out.println("The type of cone one is now " + ICC.getTypeOfCone()); //print
        ICC.addScoop(); //add
        System.out.println("Cone 2 is: " + ICC); //print
        caretaker.addMemento( ICC.save()); //add
        String [] toppings={"sprinkles","chocolate chips","marshmallows", //array
                "oreo cookies","nuts","cherry"};
        ICC.addToppings(Arrays.asList(toppings)); //topping
        System.out.println("Cone 2 is: " + ICC); //print
        ICC.restore(caretaker.getMemento("vanilla") ); //restore method
        System.out.println("The user choice restored to: " + ICC); //print
        ICC.restore(caretaker.getMemento("strawberry") ); //restore
        System.out.println("The user choice restored to: " + ICC); //print
    }
}