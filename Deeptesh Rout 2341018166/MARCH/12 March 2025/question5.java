import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Outer try block to handle NumberFormatException
            System.out.print("Enter an integer: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input); // This may throw NumberFormatException

            try {
                // Inner try block to handle ArithmeticException
                System.out.print("Enter a divisor: ");
                int divisor = scanner.nextInt();

                int result = number / divisor; // May throw ArithmeticException if divisor is 0
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
