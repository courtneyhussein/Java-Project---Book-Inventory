/**
 * Name: Hussein, Courtney 	CMIS 242/7386 	Date: 03/24/2021
 * 
 * This Inventory class creates a bookList composed of instances of the Book class.
 * With this class the user can add, remove, find, and display books in the inventory.
 *  
 * This program, as a whole, allows a user to create books and store them in an inventory.
 * The user can then add more books, remove books, search for books, view inventory of 
 * books and exit the program when they wish.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

	//Attribute
	ArrayList<Book> bookList;
	
	//Constructor
	public Inventory() {
		bookList = new ArrayList<Book>();
	}
	
//Method to implement  menu selection**************************************************	
	public void makeSelection(int selection) {
		
		//Use switch statement to call appropriate methods based off of user choice.
		switch(selection) {
		case 1: 
			addBook();//call addBook method.
			break;
		case 2: 
			removeBook();//call removeBook method.
			break;
		case 3: 
			findBook();//call findBook method.
			break;
		case 4: 
			displayBooks();
			break;//call displayBooks method.
		case 5: //Display goodbye method and end program.
			System.out.println("Thank you for using this program. Have a great day!");
			break;
		default:
			System.out.println("Invalid choice.");
		
		}
	}
	
	
//Method Menu Option 1: Add book******************************************************
	
	public void addBook() {
		
		Scanner scan = new Scanner(System.in);//Open scanner.
		
		//Prompt user for book ID.
		System.out.println("What is the book ID (integer value)? ");
		int id = scan.nextInt();
		
		//Use for-loop to search through bookList for an ID match.
		for (int i = 0; i < bookList.size(); i++) {
			Book temp = bookList.get(i);
			
			//Use if statement to print error message if that book already exists.
			if (temp.getId() == id) {
				System.out.println("\nThis book cannot be added. It is already inventoried.");
				return;
			}
		}
		//If the book does not already exist, prompt user for book title and price.
		System.out.println("What is the book title? ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("What is the book price (double value)? ");
		double price = scan.nextDouble();
		
		//Create new instance of Book based off of user input.
		Book tempBook = new Book (id, title, price);
		
		//Display new book information.
		System.out.println("\nYou have added the following book to your inventory: ID- " +
		id + ", Title- " + title + ", Price- $" + price);
		
		//Add new book to bookList.
		bookList.add(tempBook);
	}

	//Method Menu Option 2: Remove book****************************************************
	
	public void removeBook() {
		
	Scanner scan = new Scanner(System.in);//Open scanner.
	
	//Prompt user for book ID.
	System.out.println("Enter the ID of the book you want to remove from inventory: ");
	int id = scan.nextInt();
	
	//Use for loop to search bookList for matching book ID.
	for (int i = 0; i < bookList.size(); i++) {
		Book temp = bookList.get(i);
		
		//Once found, remove that book from bookList and display book's info.
		if (temp.getId() == id) {
			bookList.remove(i);
			System.out.println("\nYou have removed the following book from your inventory: ID- " +
				temp.getId() + ", Title- " +temp.getTitle() + ", Price- $" + temp.getPrice());
			return;
		}
	 //If there is no ID match, print error to screen.	
	} System.out.println("This book cannot be removed. It does not exsist in inventory.");
	
	}
	
	//Method menu option 3: Find book*************************************************
	
	public void findBook() {
		
	Scanner scan = new Scanner(System.in);//Open scanner.
	
	//Prompt user for book ID.
	System.out.println("Enter the ID of the book you want to find in invenotry: ");
	int id = scan.nextInt();
	//Use for loop to search bookList for matching book ID.
	for (int i = 0; i < bookList.size(); i++) {
		Book temp = bookList.get(i);
	
		//If found, display book's info.
		if (temp.getId() == id) {
			System.out.println("\nThe following book has been found in inventory: ID- " +
				temp.getId() + ", Title- " +temp.getTitle() + ", Price- $" + temp.getPrice());
			return;
		}
		 //If there is no ID match, print error message to screen.	
	} System.out.println("This book cannot be found. It does not exsist in inventory.");
	
	}
	
	//Method Menu Option 4: Display books**********************************************
	
	public void displayBooks() {
		
		//If bookList is empty, display error message.
		if (bookList.size() < 1) {
			System.out.println("There are no books in the inventory to display.");
		}else {
		
		System.out.println("\nInventory");
	
		//Use for loop to print out each book's information.
	for (int i = 0; i < bookList.size(); i++) {
		Book temp = bookList.get(i);

		System.out.println("ID- " + temp.getId() + ", Title- " +temp.getTitle() + ", Price- $" + temp.getPrice());
		}
		}
	}
	

}
