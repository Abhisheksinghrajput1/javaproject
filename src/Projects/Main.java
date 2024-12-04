package Projects;

class Car {
    // Instance variables
    private String color;
    private String model;
    private int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two Car objects with different instance variable values
        Car car1 = new Car("Red", "Toyota Corolla", 2020);
        Car car2 = new Car("Blue", "Honda Civic", 2021);

        // Display information for each car
        car1.displayInfo();
        car2.displayInfo();
    }
}
