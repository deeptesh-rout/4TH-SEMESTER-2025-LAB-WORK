import java.util.Arrays;
import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {12, 5, 8, 20, 3, 15};

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Searching for an element using binary search
        System.out.print("Enter a number to search: ");
        int searchKey = scanner.nextInt();
        int index = Arrays.binarySearch(numbers, searchKey);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        // Handling ArrayIndexOutOfBoundsException when accessing elements
        try {
            System.out.print("Enter an index to access: ");
            int accessIndex = scanner.nextInt();
            System.out.println("Element at index " + accessIndex + ": " + numbers[accessIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds! Please enter a valid index (0 to " + (numbers.length - 1) + ").");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }

        scanner.close();
        System.out.println("Program execution completed.");
    }
}
