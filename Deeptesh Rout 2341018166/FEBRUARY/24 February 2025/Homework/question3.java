import java.util.Scanner;
import java.util.TreeSet;

public class question3 {
    public static void main(String[] args) {
        TreeSet<Integer> rollNumbers = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Register Student Roll Number");
            System.out.println("2. Check Roll Number");
            System.out.println("3. Display All Roll Numbers");
            System.out.println("4. Find Next Roll Number");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = scanner.nextInt();
                    if (rollNumbers.add(roll)) {
                        System.out.println("Roll number registered successfully!");
                    } else {
                        System.out.println("Roll number already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Roll Number to check: ");
                    roll = scanner.nextInt();
                    if (rollNumbers.contains(roll)) {
                        System.out.println("Roll number is registered.");
                    } else {
                        System.out.println("Roll number NOT found.");
                    }
                    break;

                case 3:
                    System.out.println("Sorted Roll Numbers: " + rollNumbers);
                    break;

                case 4:
                    System.out.print("Enter Roll Number to find the next: ");
                    roll = scanner.nextInt();
                    Integer nextRoll = rollNumbers.higher(roll);
                    if (nextRoll != null) {
                        System.out.println("Next higher roll number: " + nextRoll);
                    } else {
                        System.out.println("No higher roll number found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}