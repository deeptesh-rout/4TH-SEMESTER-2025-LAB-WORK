import java.util.Scanner;
public class javaQuestion6 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Original StringBuffer: " + sb);
        System.out.println("Select an operation:");
        System.out.println("1. Append");
        System.out.println("2. Delete");
        System.out.println("3. Insert");
        System.out.println("4. Reverse");
        System.out.println("5. Replace");
        System.out.print("Enter your choice (1-5): ");

        int choice = scanner.nextInt(); 
        scanner.nextLine(); 

        switch (choice) {
            case 1: 
                System.out.print("Enter string to append: ");
                String appendStr = scanner.nextLine();
                sb.append(appendStr); 
                System.out.println("After append: " + sb);
                break;

            case 2: 
                System.out.print("Enter start index for delete: ");
                int startDelete = scanner.nextInt();
                System.out.print("Enter end index for delete: ");
                int endDelete = scanner.nextInt();
                sb.delete(startDelete, endDelete); 
                System.out.println("After delete: " + sb);
                break;

            case 3: 
                System.out.print("Enter index to insert: ");
                int insertIndex = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter string to insert: ");
                String insertStr = scanner.nextLine();
                sb.insert(insertIndex, insertStr); 
                System.out.println("After insert: " + sb);
                break;

            case 4: 
                sb.reverse();
                System.out.println("After reverse: " + sb);
                break;

            case 5: 
                System.out.print("Enter start index for replace: ");
                int startReplace = scanner.nextInt();
                System.out.print("Enter end index for replace: ");
                int endReplace = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter string to replace with: ");
                String replaceStr = scanner.nextLine();
                sb.replace(startReplace, endReplace, replaceStr); 
                System.out.println("After replace: " + sb);
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close(); 
    }
}
