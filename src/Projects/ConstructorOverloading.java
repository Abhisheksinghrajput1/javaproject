package Projects;

public class ConstructorOverloading {
	
	    int width, height;
		

	    // Default constructor
	    public ConstructorOverloading() {
	        width = 0;
	        height = 0;
	    }

	    // Parameterized constructor with one parameter
	    public ConstructorOverloading(int side) {
	        width = height = side;  // Square shape
	       
	    }

	    // Parameterized constructor with two parameters
	    public ConstructorOverloading(int width, int height) {
	        this.width = width;
	        this.height = height;
	    }

	    public void display() {
	        System.out.println("Width: " + width + ", Height: " + height);
	    }

	    public static void main(String[] args) {
	    	ConstructorOverloading rect1 = new ConstructorOverloading();           // Calls default constructor
	    	ConstructorOverloading rect2 = new ConstructorOverloading(5);          // Calls single-parameter constructor
	    	ConstructorOverloading rect3 = new ConstructorOverloading(4, 6);       // Calls two-parameter constructor

	        rect1.display();
	        rect2.display();
	        rect3.display();
	    }
	


}
