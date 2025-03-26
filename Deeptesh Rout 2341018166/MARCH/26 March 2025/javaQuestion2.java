import java.util.Scanner;

public class javaQuestion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Convert to lowercase and uppercase
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        String upperStr1 = str1.toUpperCase();
        String upperStr2 = str2.toUpperCase();

        // Compare strings ignoring case
        boolean areEqualIgnoreCase = lowerStr1.equals(lowerStr2);

        // Display results
        System.out.println("\nConverted Strings:");
        System.out.println("Lowercase - String 1: " + lowerStr1);
        System.out.println("Lowercase - String 2: " + lowerStr2);
        System.out.println("Uppercase - String 1: " + upperStr1);
        System.out.println("Uppercase - String 2: " + upperStr2);

        if (areEqualIgnoreCase) {
            System.out.println("\nResult: The strings are equal (case-insensitive).");
        } else {
            System.out.println("\nResult: The strings are NOT equal (case-insensitive).");
        }

        scanner.close();
    }
}
