import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiating variables
		Scanner in = new Scanner (System.in);
		String input;
		System.out.println("Would you like to make an order y/n ?");
		input = in.next();
		input.toUpperCase();
		do {
			switch(input) {
			case "Y":
				// Create Ice Cream Object and set the values using methods from the class
				System.out.println("Enter an Ice Cream Flavor: ");
				System.out.println("A) Vanilla");
				System.out.println("B) Chocolate");
				System.out.println("C) Strawberry");
				String Flavor = in.next();
				switch(Flavor) {
				case "A":
					
					
				}
				
			}
		}while(input != "Q");
	}

}
