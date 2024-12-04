package Projects;

public class AnotherArrayConcept {

	public static void main(String[] args) {
		   int[] numbers = {10, 20, 30, 40, 50};

	        // Display each element of the array using a for loop
	        System.out.println("Array elements are:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Element at index " + ": " + numbers[i]);
	        }

	        // Alternatively, use an enhanced for loop
	        System.out.println("\nUsing enhanced for loop:");
	        for (int number : numbers) {
	            System.out.println( "To Print the data on for each "+number);
	        }
	    }
	

	

}
