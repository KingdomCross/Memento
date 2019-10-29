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
				System.out.println("Select an Ice Cream Flavor: ");
				System.out.println("A) Vanilla");
				System.out.println("B) Chocolate");
				System.out.println("C) Strawberry");
				String Flavor = in.next();
				Flavor.toUpperCase();
				switch(Flavor) 
				{
				case "A":
					//Add Ice Cream Flavor and Save to momento here
					System.out.println("Vanilla flavor selected!");
					break;
				case "B":
					//Add Ice Cream Flavor and Save to momento here
					System.out.println("Chocolate flavor selected!");
					break;
				case "C":
					//Add Ice Cream Flavor and Save to momento here
					System.out.println("Strawberry flavor selected!");
					break;
				}
				System.out.println("How many scoops: ");
				int scoops = in.nextInt();
				// put scoops into Ice Cream class and save to momento
				String choice = in.next();
				switch(choice.toUpperCase())
				{
				case "Y":
					//display toppings
					System.out.println("A) Topping 1");
					System.out.println("B) Topping 2");
					System.out.println("C) Topping 3");
					System.out.println("D) Topping 4");
					String Topping = in.next();
					switch(Topping.toUpperCase())
					{
					case "A":
						//Add Topping and Save to momento here
						System.out.println("Topping 1 selected!");
						break;
					case "B":
						//Add Topping and Save to momento here
						System.out.println("Topping 2 selected!");
						break;
					case "C":
						//Add Topping and Save to momento here
						System.out.println("Topping 3 selected!");
						break;
					case "D":
						//Add Topping and Save to momento here
						System.out.println("Topping 4 selected!");
					}
				}
				break;
				
				
			}
		}while(input != "N");
			System.out.println("Thanks for stopping by :)");
	}

}
