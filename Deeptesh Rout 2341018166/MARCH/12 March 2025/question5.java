import java.util.Arrays;
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array
        int[] numbers = {5, 2, 9, 1, 6, 8};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Searching for an element
        System.out.print("Enter a number to search: ");
        int searchValue = scanner.nextInt();
        int index = Arrays.binarySearch(numbers, searchValue);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        // Accessing an element at a specific index
        System.out.print("Enter an index to access: ");
        try {
            int accessIndex = scanner.nextInt();
            System.out.println("Element at index " + accessIndex + ": " + numbers[accessIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds! Please enter a valid index (0 to " + (numbers.length - 1) + ").");
        }

        scanner.close();
    }
}
