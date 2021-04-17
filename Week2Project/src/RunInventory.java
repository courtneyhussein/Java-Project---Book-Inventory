/**
 * Name: Hussein, Courtney 	CMIS 242/7386 	Date: 03/24/2021
 * 
 * This RunInventory object displays the menu options available in the Inventory class.
 * The user can continue to choose menu options until they select number 5 and exit the program.
 *  
 * This program, as a whole, allows a user to create books and store them in an inventory.
 * The user can then add more books, remove books, search for books, view inventory of 
 * books and exit the program when they wish.
 */

import java.util.Scanner;

public class RunInventory {
	
	//Display menu options.
	public static void displayMenu() {
		System.out.println("\nMenu");
		System.out.println("1. Add book");
		System.out.println("2. Remove remove");
		System.out.println("3. Find book");
		System.out.println("4. Display all books");
		System.out.println("5. Exit program");
	}

	public static void main(String[] args) {
		
		//Display personal info.
		System.out.println("Name: Hussein, Courtney    Class: CMIS 242/7386    Date: 03/24/2021\n");
		
		Scanner scan = new Scanner(System.in);//Open scanner
		
		//Create new instance of Inventory.
		Inventory inventory1 = new Inventory();
		
		int choice = 0;
		
		//Use while-loop to call displayMenu method, accept user selection and call
		//makeSelection method for as long as user does not choose 5 (Exit program).
		while (choice != 5) {
			displayMenu();
			System.out.println("\nEnter the number of the menu item you want to select: ");
			choice = scan.nextInt();
			inventory1.makeSelection(choice);
		}
		
		


	}

}
