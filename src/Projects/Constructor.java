package Projects;

public class Constructor {
    String model;
    int year;

    // Default constructor
    public Constructor() {
        model = "Unknown";
        year = 0;
    }

    public void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }



	public static void main(String[] args) {
		
		Constructor car = new Constructor();  // Default constructor is called
        car.display();
	}
		
	}


