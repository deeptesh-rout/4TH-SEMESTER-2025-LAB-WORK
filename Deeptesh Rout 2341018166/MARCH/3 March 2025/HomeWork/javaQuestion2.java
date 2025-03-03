import java.util.LinkedList;
import java.util.Scanner;

class HospitalWaitingList {

    static class Patient {
        int id;
        String name;

        Patient(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "ID: " + id + ", Name: " + name;
        }
    }

    static LinkedList<Patient> waitingList = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "\n1. Add Patient\n2. Remove Patient\n3. Check Waiting List\n4. Display Patients\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    waitingList.add(new Patient(id, name));
                    System.out.println("Patient added.");
                    break;
                case 2:
                    System.out.print("Enter ID to remove: ");
                    id = sc.nextInt();
                    waitingList.removeIf(p -> p.id == id);
                    System.out.println("Patient removed.");
                    break;
                case 3:
                    System.out.println(waitingList.isEmpty() ? "No patients." : "There are patients.");
                    break;
                case 4:
                    if (waitingList.isEmpty())
                        System.out.println("No patients.");
                    else
                        waitingList.forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Exiting.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
