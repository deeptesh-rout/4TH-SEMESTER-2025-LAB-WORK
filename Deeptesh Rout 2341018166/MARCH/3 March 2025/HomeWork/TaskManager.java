
/*Question 3 */

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out
                    .println("\n1. Add task\n2. Remove task\n3. Display tasks\n4. Find task\n5. Clear tasks\n6. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    manager.tasks.add(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter index to remove: ");
                    int index = sc.nextInt() - 1;
                    if (index >= 0 && index < manager.tasks.size())
                        manager.tasks.remove(index);
                    else
                        System.out.println("Invalid index.");
                    break;
                case 3:
                    if (manager.tasks.isEmpty())
                        System.out.println("No tasks.");
                    else
                        manager.tasks.forEach(t -> System.out.println(t));
                    break;
                case 4:
                    System.out.print("Enter index to find: ");
                    index = sc.nextInt() - 1;
                    if (index >= 0 && index < manager.tasks.size())
                        System.out.println(manager.tasks.get(index));
                    else
                        System.out.println("Invalid index.");
                    break;
                case 5:
                    manager.tasks.clear();
                    System.out.println("All tasks cleared.");
                    break;
                case 6:
                    System.out.println("Exiting.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
