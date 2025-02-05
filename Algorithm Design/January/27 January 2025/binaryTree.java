


class Node {
    int data;
    Node left, right;

  
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class binaryTree {
    
    Node root;

    binaryTree() {
        root = null;
    }

    
    void preOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");  
        preOrder(node.left);                
        preOrder(node.right);             
    }

    void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);                 
        System.out.print(node.data + " "); 
        inOrder(node.right);               
    }

    
    void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);             
        postOrder(node.right);             
        System.out.print(node.data + " ");  
    }

    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        
       
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("Pre-order Traversal:");
        tree.preOrder(tree.root);

        System.out.println("\nIn-order Traversal:");
        tree.inOrder(tree.root);

        System.out.println("\nPost-order Traversal:");
        tree.postOrder(tree.root);
    }
}
