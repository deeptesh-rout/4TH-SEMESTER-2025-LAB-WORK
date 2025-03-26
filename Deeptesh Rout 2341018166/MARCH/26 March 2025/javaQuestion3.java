import java.util.Scanner;

public class javaQuestion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get string input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Display the character array using a for loop
        System.out.println("\nCharacter Array:");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();

        // Ask user for character to search
        System.out.print("\nEnter a character to search: ");
        char searchChar = scanner.next().charAt(0);

        // Finding first and last occurrence using a for loop
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                if (firstIndex == -1) {
                    firstIndex = i; // Store first occurrence
                }
                lastIndex = i; // Keep updating last occurrence
            }
        }

        // Display results
        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + searchChar + "' is at index: " + firstIndex);
            System.out.println("Last occurrence of '" + searchChar + "' is at index: " + lastIndex);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }

        scanner.close();
    }
}
