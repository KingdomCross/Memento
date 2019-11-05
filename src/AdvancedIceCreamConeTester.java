import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/* This class is used to test the functionality of the IceCreamCone class */
public class AdvancedIceCreamConeTester {
    public static void main(String [] args) {

        
        // This file tests the AdvancedIceCreamCone, the IceCreamMemento, and the IceCreamCareTaker
        IceCreamCaretaker caretaker = new IceCreamCaretaker();
    		AdvancedIceCreamCone ICC = new AdvancedIceCreamCone();
    		System.out.println("The new cone is: " + ICC);
                    ICC.addScoop();
                    ICC.addToppings("chips");
                    ICC.addToppings("fudge");
                    System.out.println("The cone is now: " + ICC);
                    caretaker.addMemento(ICC.save());
    		ICC = new AdvancedIceCreamCone(2,"chocolate","sugar");
    		System.out.println("Cone 2 is: " + ICC);
    		ICC.setFlavor("strawberry");
    		System.out.println("The flavor of cone one is now " + ICC.getFlavor());
    		ICC.setTypeOfCone("waffle");
    		System.out.println("The type of cone one is now " + ICC.getTypeOfCone());
    		ICC.addScoop();
                    System.out.println("Cone 2 is: " + ICC);
                    caretaker.addMemento( ICC.save());
    		String [] toppings={"sprinkles","chocolate chips","marshmallows",
    		  "oreo cookies","nuts","cherry"};
    		ICC.addToppings(Arrays.asList(toppings));
    		System.out.println("Cone 2 is: " + ICC);
                  ICC.restore(caretaker.getMemento("vanilla"));
    		
                    System.out.println("The user choice restored to: " + ICC);
                    
                    
    }
}