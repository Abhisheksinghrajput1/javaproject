package Projects;

import java.util.Scanner;

public class OneD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for the size of the array
        System.out.print("Enter the number of elements you want to store: ");
        int size = scanner.nextInt();

        // Step 2: Create an array with the given size
        int[] numbers = new int[size];

        // Step 3: Get input from the user and store it in the array
       System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();  // Storing user input in array
        
        }
        // Step 4: Display the data stored in the array
        System.out.println("\nThe numbers you entered are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Closing the scanner to prevent resource leaks
        scanner.close();
	}

}
