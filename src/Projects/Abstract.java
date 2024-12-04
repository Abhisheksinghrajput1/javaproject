package Projects;

// Abstract class
public abstract class Abstract {
    //instance variable
	
	String name;

    // Constructor of the abstract class
    public Abstract(String name) {
        this.name = name;
        System.out.println("Abstract constructor called!");
    }

    // Abstract method (subclasses must implement this method)
    public abstract void makeSound();
    {
    	
    }
    
   // public abstract void makeSound1();
    //{
    	
    //}
}

// Subclass (Concrete class) Dog
class MyDog extends Abstract {
	private int leg;
    public MyDog(String name) {
        // Call the constructor of the abstract class
        super(name);
    }
    

    public int getLeg() {
		return leg;
	}


	public void setLeg(int leg) {
		this.leg = leg;
	}


	// Provide implementation for the abstract method
    public void makeSound() {
        System.out.println(name + " barks");
    }
}

// Subclass (Concrete class) Cat
class MyCat extends Abstract {
    public MyCat(String name) {
        // Call the constructor of the abstract class
        super(name);
    }

    // Provide implementation for the abstract method
    public void makeSound() {
        System.out.println(name + " meows");
    }
    
    public void eat() {
        System.out.println(name + " Eating");
    	
    }
// <-- Missing closing brace added here for MyCat class

// Main class to test the functionality

}
