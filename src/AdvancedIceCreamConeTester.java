import java.util.Arrays;

/* This class is used to test the functionality of the IceCreamCone class */
public class AdvancedIceCreamConeTester {
    public static void main(String [] args) {
        AdvancedIceCreamCone ICC = new AdvancedIceCreamCone();
        System.out.println("The new cone is: " + ICC);
        AdvancedIceCreamCone ICC2 = new AdvancedIceCreamCone(2,"chocolate","sugar");
        System.out.println("Cone 2 is: " + ICC2);
        ICC.setFlavor("strawberry");
        System.out.println("The flavor of cone one is now " + ICC.getFlavor());
        ICC.setTypeOfCone("waffle");
        System.out.println("The type of cone one is now " + ICC.getTypeOfCone());
        ICC2.addScoop();
        System.out.println("The number of scoops in cone 2 is now " + ICC2.getNumberOfScoops());
        System.out.println("Cone 2 is: " + ICC2);
        String [] toppings={"sprinkles","chocolate chips","marshmallows",
                "oreo cookies","nuts","cherry"};
        //for (int i=0;i<toppings.length;i++)
        //  ICC.addToppings(toppings[i]);
        ICC.addToppings(Arrays.asList(toppings));
        System.out.println("Cone 2 is: " + ICC2);
    }
}