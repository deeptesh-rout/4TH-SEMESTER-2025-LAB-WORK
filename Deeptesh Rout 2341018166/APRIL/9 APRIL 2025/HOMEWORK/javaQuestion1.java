/*Create a functional interface Calculator with methods for addition, subtraction, multiplication, and division.
Implement these methods using lambda expressions.
Define the Calculator functional interface with methods for arithmetic operations.
Implement the interface methods using lambda expressions for basic arithmetic operations.
Note: Use Scanner class for user input. */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class javaQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Map of operations
        Map<Integer, Calculator> operations = new HashMap<>();
        operations.put(1, (a, b) -> a + b);
        operations.put(2, (a, b) -> a - b);
        operations.put(3, (a, b) -> a * b);
        operations.put(4, (a, b) -> {
            if (b == 0) {
                System.out.println("Cannot divide by zero.");
                return Double.NaN;
            }
            return a / b;
        });

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        Calculator calc = operations.get(choice);
        if (calc != null) {
            double result = calc.calculate(num1, num2);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
