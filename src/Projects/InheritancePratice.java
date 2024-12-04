package Projects;

// Superclass (Parent Class)
public class InheritancePratice {
    // Instance variable
    String name;

    // Constructor
    public InheritancePratice(String name) {
        this.name = name;
    }

    // Method for general behavior
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method to demonstrate sleeping behavior
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
    
    

// Subclass (Child Class) - Dog
class Dog1 extends InheritancePratice {
	
	private int Leg;
	private String Game ;
    // Constructor for Dog
    public Dog1(String name) {
    	
        // Call the superclass constructor
        super(name);
    }
    

    public int getLeg() {
		return Leg;
	}


	public void setLeg(int Leg) {
		this.Leg = Leg;
	}
	


	public String getGame() {
		return Game;
	}


	public void setGame(String Game) {
		this.Game = Game;
	}


	// Method specific to Dog
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Subclass (Child Class) - Cat
class Cat1 extends InheritancePratice {
    // Constructor for Cat
    public Cat1(String name) {
        // Call the superclass constructor
        super(name);
    }

    // Method specific to Cat
    public void mew() {
        System.out.println(name + " is meowing.");
    }


}
