import java.util.HashSet;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        HashSet<String> registeredStudents = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Register Student");
            System.out.println("2. Check Registration");
            System.out.println("3. Display All Registrations");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    if (registeredStudents.add(id)) {
                        System.out.println("Student registered successfully!");
                    } else {
                        System.out.println("Student is already registered.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Student ID to check: ");
                    id = scanner.nextLine();
                    if (registeredStudents.contains(id)) {
                        System.out.println("Student is registered.");
                    } else {
                        System.out.println("Student is NOT registered.");
                    }
                    break;

                case 3:
                    System.out.println("Registered Students: " + registeredStudents);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
