package Projects;

public class ObjectsClasses {
	

	    // Properties (attributes)
	    String color;
	    String model;
	    int year;

	    // Method (behavior)
	    void startEngine() {
	        System.out.println("The engine of the " + color + " " + model + " is starting.");
	    }
	

	
	    public static void main(String[] args) {
	        // Creating an object of the Car class
	    	ObjectsClasses myCar = new ObjectsClasses();

	        // Assigning values to the object's properties
	        myCar.color = "Red";
	        myCar.model = "Toyota Camry";
	        myCar.year = 2022;

	        // Using the object's method
	        myCar.startEngine();  // Output: The engine of the Red Toyota Camry is starting.
	    }
	}


