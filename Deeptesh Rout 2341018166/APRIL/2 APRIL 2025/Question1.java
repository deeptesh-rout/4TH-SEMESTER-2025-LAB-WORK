/*Design a class BSTNode in Java with a member variable info to store an integer and 
two references, left and right, to represent its left and right children. Implement a 
constructor to initialize these attributes. Develop a method to insert a node while 
maintaining the properties of a binary search tree. Extend this implementation by 
adding methods for traversing the tree using pre-order, in-order, and post-order 
techniques. Finally, add a main method to create a binary search tree, insert multiple 
nodes, and invoke the traversal methods to display the tree structure.  */



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
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    
    public void insertMultiple(int[] data) {
        for (int value : data) {
            insert(value);
        }
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

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Insert multiple values");
            System.out.println("2. Inorder Traversal");
            System.out.println("3. Preorder Traversal");
            System.out.println("4. Postorder Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter values to insert (space-separated): ");
                    String[] insertValues = scanner.nextLine().split(" ");
                    int[] insertArr = new int[insertValues.length];
                    for (int i = 0; i < insertValues.length; i++) {
                        insertArr[i] = Integer.parseInt(insertValues[i]);
                    }
                    bst.insertMultiple(insertArr);
                    System.out.println("Values inserted.");
                    break;
                
                case 2:
                	 System.out.println("Inorder Traversal:");
                     bst.inorder();
                     break;
                
                case 3:
                	System.out.println("Preorder Traversal:");
                    bst.preorder();
                    break;
                
                case 4:
                	System.out.println("Postorder Traversal:");
                    bst.postorder();
                    break;
                
                case 5:
                	System.out.println("Exiting program...");
                    scanner.close();
                    return;
                
                
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}







