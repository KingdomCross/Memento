import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/* This class is used to test the functionality of the IceCreamCone class */
public class AdvancedIceCreamConeTester {
    public static void main(String [] args) {
//        AdvancedIceCreamCone ICC = new AdvancedIceCreamCone();
//        System.out.println("The new cone is: " + ICC);
//        AdvancedIceCreamCone ICC2 = new AdvancedIceCreamCone(2,"chocolate","sugar");
//        System.out.println("Cone 2 is: " + ICC2);
//        ICC.setFlavor("strawberry");
//        System.out.println("The flavor of cone one is now " + ICC.getFlavor());
//        ICC.setTypeOfCone("waffle");
//        System.out.println("The type of cone one is now " + ICC.getTypeOfCone());
//        ICC2.addScoop();
//        System.out.println("The number of scoops in cone 2 is now " + ICC2.getNumberOfScoops());
//        System.out.println("Cone 2 is: " + ICC2);
//        String [] toppings={"sprinkles","chocolate chips","marshmallows",
//                "oreo cookies","nuts","cherry"};
//        for (int i=0;i<toppings.length;i++)
//          ICC.addToppings(toppings[i]);
//        ICC.addToppings(Arrays.asList(toppings));
//        System.out.println("Cone 2 is: " + ICC2);
        
        
        // Chloe's added Code for file stuff

                    System.out.println("The user choice restored to: " + ICC);
                    
            		AdvancedIceCreamCone ICC = new AdvancedIceCreamCone();
            		System.out.println("The new cone is: " + ICC);
                            ICC.addScoop();
                            ICC.addToppings("chips");
                            ICC.addToppings("fudge");
                            System.out.println("The cone is now: " + ICC);
                            caretaker.addMemento( ICC.save());
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
                            ICC.restore( caretaker.getMemento("vanilla") );
                            System.out.println("The user choice restored to: " + ICC);
    }
}