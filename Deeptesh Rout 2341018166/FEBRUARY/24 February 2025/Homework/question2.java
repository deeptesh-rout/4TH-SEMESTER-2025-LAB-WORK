import java.util.LinkedHashSet;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        LinkedHashSet<String> visitorLog = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Visitor");
            System.out.println("2. Check Visitor");
            System.out.println("3. Display All Visitors");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Visitor ID: ");
                    String id = scanner.nextLine();
                    if (visitorLog.add(id)) {
                        System.out.println("Visitor logged successfully!");
                    } else {
                        System.out.println("Visitor already logged.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Visitor ID to check: ");
                    id = scanner.nextLine();
                    if (visitorLog.contains(id)) {
                        System.out.println("Visitor has entered.");
                    } else {
                        System.out.println("Visitor has NOT entered.");
                    }
                    break;

                case 3:
                    System.out.println("Visitor Log (in order of entry): " + visitorLog);
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
