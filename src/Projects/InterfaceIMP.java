package Projects;

public class InterfaceIMP {
	
	    public static void main(String[] args) {
	        Duck duck = new Duck();
	        duck.fly();  // Output: Duck is flying
	        duck.swim(); // Output: Duck is swimming
	        duck.setS("Abhishek");
	       System.out.println(duck.getS()); 
	       duck.me();
	       Flyable f=new Duck();
	      f.fly();
	    }
	}
