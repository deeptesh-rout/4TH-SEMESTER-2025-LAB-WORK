import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = convertToInteger(scanner);
        System.out.println("Converted integer: " + result);
        scanner.close();
    }

    public static int convertToInteger(Scanner scanner) {
        while (true) {
            System.out.print("Enter a numeric value: ");
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
    }
}
