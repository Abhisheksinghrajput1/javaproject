package Projects;

public class AbstractImp {
	
	    public static void main(String[] args) {
	        // Create objects of Dog and Cat
	        Abstract dog = new MyDog("Buddy");
	        dog.makeSound();  // Outputs: Buddy barks
	        
	        
	        Abstract cat = new MyCat("Whiskers");

	        
	        cat.makeSound();  // Outputs: Whiskers meows
	        
	       MyCat  t = new MyCat("ww");
	       t.eat();
	       t.makeSound();
	        
//	        Abstract so = new eat("w");
	        
	    }
	}

	
	


// what is object class and its methpods and uses 