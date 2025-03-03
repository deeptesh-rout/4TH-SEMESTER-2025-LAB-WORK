

import java.util.ArrayList;
import java.util.Scanner;

class Library {
    private ArrayList<String> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Method to add a book
    public void addBook() {
        System.out.print("Enter book title to add: ");
        String bookTitle = scanner.nextLine();
        books.add(bookTitle);
        System.out.println("Book added successfully.");
    }

    // Method to remove a book by title
    public void removeBook() {
        System.out.print("Enter book title to remove: ");
        String bookTitle = scanner.nextLine();
        if (books.remove(bookTitle)) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    // Method to search for a book by title
    public void searchBook() {
        System.out.print("Enter book title to search: ");
        String bookTitle = scanner.nextLine();
        if (books.contains(bookTitle)) {
            System.out.println("Book is available in the collection.");
        } else {
            System.out.println("Book not found.");
        }
    }

    // Method to display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books in the collection:");
            for (String book : books) {
                System.out.println("- " + book);
            }
        }
    }

    // Method to show total number of books
    public void showTotalBooks() {
        System.out.println("Total number of books: " + books.size());
    }

    // Menu to perform operations
    public void menu() {
        int choice;
        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Show Total Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    displayBooks();
                    break;
                case 5:
                    showTotalBooks();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
    }
}

public class javaQuestion1 {
    public static void main(String[] args) {
        Library library = new Library();
        library.menu();
    }
}

