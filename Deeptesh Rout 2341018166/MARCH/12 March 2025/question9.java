import java.util.InputMismatchException;
import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        int userInput = readInteger();
        System.out.println("You entered: " + userInput);
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt(); // May throw InputMismatchException
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();
        return number;
    }
}
