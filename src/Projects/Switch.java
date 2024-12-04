package Projects;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /, %, @): ");
        char operator = scanner.next().charAt(0);

        int result, r1, r2, r3, r4;

        // Switch statement for the calculator
        switch (operator) {
            case '+':
            	System.out.print("Enter first number again: ");
            	int num11 = scanner.nextInt();
                result = num11 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
                
            case '@':
            	   r1 = num1 + num2;
                   System.out.println("Result: " + r1);
                   
                   r2 = num1 - num2;
                   System.out.println("Result: " + r2);
                   
                   r3 = num1 * num2;
                   System.out.println("Result: " + r3);
                   
                   if (num2 != 0) {
                       r4 = num1 / num2;
                       System.out.println("Result: " + r4);
                   } else {
                       System.out.println("Error: Division by zero is not allowed.");
                   }

            default:
                System.out.println("Error: Invalid operator!");
                break;
        }

        scanner.close(); // Closing the scanner to prevent resource leaks
    }
}
