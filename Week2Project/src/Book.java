/**
 * Name: Hussein, Courtney 	CMIS 242/7386 	Date: 03/24/2021
 * 
 * This book class creates a book with three attributes: id, title, and price.
 * 
 * This program, as a whole, allows a user to create books and store them in an inventory.
 * The user can then add more books, remove books, search for books, view inventory of 
 * books and exit the program when they wish.
 */

public class Book {

	//Attributes
	private int id;
	private String title;
	private double price;
	
	//Constructors with validation.
	public Book(int id, String title, double price) {
		
		//Validate that title is not blank or empty.
		if (title.isBlank() || title.isEmpty()) {
			System.out.println("Invalid id or description value - cannot be null, empty, or blank");
		//Validate that ID is no more than 5 digits long.
		} if (id > 99999){
			System.out.println("Invalid ID - must be 5 digits or less");
		//Validate that price is at least $0.01.
		} if (price < 0.01) {
			System.out.println("Invalid price - must cost at least $0.01.");
		}
		
		this.id = id;
		this.title = title;
		this.price = price;
	}
	
	//Get methods
	
	//Method to get id
	public int getId() {
		return id;
	}
	
	//Method to get title
	public String getTitle() {
		return title;
	}
	
	//Method to get price
	public double getPrice() {
		return price;
	}
}
