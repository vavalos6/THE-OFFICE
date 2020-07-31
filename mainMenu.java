/* 
	Valerie Avalos
	The purpose of this program is to provide a menu of options for
	client or clerk to use. The clerk can check for orders and the client
	can create new client information, add/check an order. 
	Menu Screen
*/
	
package big;							//used for packages
import java.util.Scanner;					//for user input

class order {
	int paperpack;						//number of paperpacks
	int writingpack;					//number of writingpacks
	int supplypack;						//number of supplypacks
	double totalCost;
	int count;
	
	public order (int p, int w, int s) {				//constructor for order
	paperpack = p;							//initialize values with constructor
	writingpack = w;						//for paperpack, writingpack and supplypack
	supplypack = s;	
	}
	
	double total(int p, int w, int s) {				//method total calculates total cost of new order
		totalCost = (paperpack * 5.00) + (writingpack * 2.30) + (supplypack * 2.00);
		return totalCost;
	}

}

											//Main class program begins execution
class mainMenu {
	public static void main (String args[]) 
	throws java.io.IOException {							//USER INPUT
	int choice, choice2; 								//user's choice for menu options
	System.out.println("Welcome to THE OFFICE!");					//print out welcome message


	do {										//Do while loop to show Menu @ least 1x
	System.out.println("Please select from the following menu in"
			   + " order to better help you.");
	System.out.println("1) I am the CLIENT");
	System.out.println("2) I am the CLERK");

	
	Scanner sc = new Scanner (System.in);
	choice = Integer.parseInt(sc.nextLine());					//Grab user input

	if (choice < 1 || choice > 2)							//Error Checking for user input out of bounds
		System.out.println("Please select a valid option from the menu.\n");

	} while (choice < 1 || choice > 2);


	switch(choice) {								//Switch menu to work with user choice
		case 1:									
			System.out.println("Welcome Dearest Client! We are happy you are here, how can we help?");
			do {
			System.out.println("1) New Order"); 					
			Scanner sc = new Scanner (System.in);
			choice2 = Integer.parseInt(sc.nextLine());				//Grab user input

			if (choice2 != 1)							//Error Check out of bounds
				System.out.println("Please select a valid option from the menu.");

			} while (choice2 < 1 || choice2 > 2);
			
			
			switch(choice2) {							//inner switch case from second menu
				case 1: 							
					System.out.println("New ORDER");
					
												//gathering information for client new order
					System.out.println("How many paper packs would you like?: ");
					Scanner sc = new Scanner(System.in);
					int p = Integer.parseInt(sc.nextLine());

					System.out.println("How many writing packs would you like?: ");
					int w = Integer.parseInt(sc.nextLine());

					System.out.println("How many supply packs would you like?: ");
					int s = Integer.parseInt(sc.nextLine());

												//Construct complete order
					order newOrder = new order(p, w, s);
					System.out.println("The total cost is: " + "$ " + newOrder.total(p, w, s));
					break;
					}
			break;
		case 2: 
			System.out.println("Thank you for your dedicated work!");
			System.out.println("CHECKING FOR ORDERS:");
			break;
		}	
	}
}
