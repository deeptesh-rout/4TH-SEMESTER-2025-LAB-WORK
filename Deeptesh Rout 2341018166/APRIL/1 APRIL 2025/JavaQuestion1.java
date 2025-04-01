
import java.util.Scanner;

class BinarySearchTree {
    class Node {
        int data;
        Node left, right;
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    
    Node root;
    public BinarySearchTree() {
        root = null;
    }
    public void insert(int data) {
        root = insertRec(root, data);
    }
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    public void delete(int data) {
        root = deleteRec(root, data);
    }
    private Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }
    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
    public void update(int oldData, int newData) {
        delete(oldData);
        insert(newData);
    }
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    public void preorder() {
        preorderRec(root);
        System.out.println();
    }
    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    public void postorder() {
        postorderRec(root);
        System.out.println();
    }
    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}
public class JavaQuestion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Creation");
            System.out.println("2. Insertion");
            System.out.println("3. Deletion");
            System.out.println("4. Update");
            System.out.println("5. Inorder Traversal");
            System.out.println("6. Preorder Traversal");
            System.out.println("7. Postorder Traversal");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Binary search tree created.");
                    break;

                case 2:
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    bst.insert(insertValue);
                    System.out.println("Value inserted.");
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    bst.delete(deleteValue);
                    System.out.println("Value deleted.");
                    break;

                case 4:
                    System.out.print("Enter value to update: ");
                    int oldValue = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    int newValue = scanner.nextInt();
                    bst.update(oldValue, newValue);
                    System.out.println("Value updated.");
                    break;

                case 5:
                    System.out.println("Inorder Traversal:");
                    bst.inorder();
                    break;

                case 6:
                    System.out.println("Preorder Traversal:");
                    bst.preorder();
                    break;

                case 7:
                    System.out.println("Postorder Traversal:");
                    bst.postorder();
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
