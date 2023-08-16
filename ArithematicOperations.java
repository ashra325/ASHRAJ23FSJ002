package javaFullStack;

/**
 * This program demonstrates basic arithmetic operations.
 * It takes two numbers as input and performs addition,
 * subtraction, multiplication, and division.
 */
public class ArithematicOperations {
    /**
     * The main method is the entry point of the program.
     * It reads two numbers, performs arithmetic operations,
     * and displays the results.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Input two numbers
        double num1 = 20.5;
        double num2 = 10.0;

        // Perform arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        // Display the results
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}

