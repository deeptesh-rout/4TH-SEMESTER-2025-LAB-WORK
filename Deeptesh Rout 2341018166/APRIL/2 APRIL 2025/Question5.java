/*Implement a method to remove node x from a binary search tree while ensuring that 
the tree maintains its properties. The deletion process involves three cases: 
1. Case 1: Node x has no children (a leaf node). 
2. Case 2: Node x has one child (either left or right). 
3. Case 3: Node x has two children, requiring a suitable replacement to maintain 
the BST structure. */

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Question5 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key); // Search in the left subtree
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key); // Search in the right subtree
        } else {
            // Case 1: No children (leaf node) or Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Node with two children
            TreeNode minNode = findMin(root.right); // Find the inorder successor
            root.val = minNode.val; // Replace value with successor
            root.right = deleteNode(root.right, minNode.val); // Delete successor node
        }
        return root;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left; // Find the leftmost node (minimum in right subtree)
        }
        return node;
    }

    // Helper method to insert a node (for testing)
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    // Helper method for in-order traversal (for testing)
    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Question5 tree = new Question5();
        TreeNode root = null;
        root = tree.insert(root, 50);
        root = tree.insert(root, 30);
        root = tree.insert(root, 20);
        root = tree.insert(root, 40);
        root = tree.insert(root, 70);
        root = tree.insert(root, 60);
        root = tree.insert(root, 80);

        System.out.println("Inorder traversal before deletion:");
        tree.inorder(root);

        root = tree.deleteNode(root, 50); // Deleting node 50

        System.out.println("\nInorder traversal after deletion:");
        tree.inorder(root);
    }
}
