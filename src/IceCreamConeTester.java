import java.util.*;
public class IceCreamConeTester {
    /* This class is used to test the functionality of the IceCreamCone class */
    public static void main(String [] args) {
        IceCreamCaretaker caretaker = new IceCreamCaretaker("abc");
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