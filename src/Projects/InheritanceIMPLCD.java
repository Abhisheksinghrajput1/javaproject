package Projects;

public class InheritanceIMPLCD {
	
    public static void main(String[] args) {
    // Create an instance of Dog
    Dog1 dog = new Dog1("om");
    dog.eat();          // Inherited method
    dog.sleep();        // Inherited method
    dog.bark();         // Dog-specific method
    dog.setLeg(5);
    dog.setGame("Abhishek");
    System.out.println(dog.getGame());
   System.out.println(dog.getLeg());
    // Create an instance of Cat
    Cat1 cat = new Cat1("Whiskers");
    cat.eat();          // Inherited method
    cat.mew();          // Cat-specific method
    cat.sleep();        // Inherited method
}

}
