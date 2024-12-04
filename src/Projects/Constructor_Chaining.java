package Projects;

public class Constructor_Chaining {

	    String title;
	    String author;
	    double price;

	    // Constructor with two parameters
	    public Constructor_Chaining(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    // Constructor with three parameters (calls the two-parameter constructor)
	    public Constructor_Chaining(String title, String author, double price) {
	        this(title, author);  // Calls the two-parameter constructor
	        this.price = price;
	    }

	    public void display() {
	        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
	    }

	    public static void main(String[] args) {
	    	Constructor_Chaining book = new Constructor_Chaining("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
	        book.display();
	        
	        Constructor_Chaining book1 = new Constructor_Chaining("The", "F. Scott", 10.99);
	        book1.display();
	    }
	}

	
	

