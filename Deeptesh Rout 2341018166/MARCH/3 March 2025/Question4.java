
import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {
    @SuppressWarnings({ "unchecked" })
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        ArrayList BookName = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Register Book");
            System.out.println("2. Remove Book By title ");
            System.out.println("3. Search Book By title ");
            System.out.println("4. Show the total number of books ");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Name : ");
                    String BookName1 = scanner.nextLine();
                    if (BookName.add(BookName1)) {
                        System.out.println(" registered successfully!");
                    } else {
                        System.out.println("Book already exists.");
                    }

                    break;

                case 2:
                    System.out.print("Enter Roll Number to check: ");
                    String BookName2 = scanner.nextLine();
                    if (BookName.remove(BookName2)) {
                        System.out.println("Book is romove successfully.");
                    } else {
                        System.out.println("Book is NOT found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the element to search: ");
                    String searchElement = scanner.nextLine();
                    int index = BookName.indexOf(searchElement);

                    if (index != -1) {
                        System.out.println("Element '" + searchElement + "' found at index: " + index);
                    } else {
                        System.out.println("Element '" + searchElement + "' not found in the ArrayList.");
                    }

                    break;
                case 4:
                    System.out.println("Displaying books " + BookName);
                    break;
                case 5:
                    System.out.println("Displaying books " + BookName.size());
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}