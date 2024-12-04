package Projects;

public class Parametrized_Construction {
// Instance varibale 
	    String model;
	    int year;

	    // Parameterized constructor
	    public Parametrized_Construction (String model, int year) {
	    	// this keywords is used for 
	        this.model = model;
	        this.year = year;
	    }

	    public void display() {
	        System.out.println("Model: " + model + ", Year: " + year);
	    }

	    public static void main(String[] args) {
	    	Parametrized_Construction car1 = new Parametrized_Construction("Toyota Corolla", 2020);
	    	Parametrized_Construction car2 = new Parametrized_Construction("Honda Accord", 2022);

	        car1.display();
	        car2.display();
	    }



	

}

