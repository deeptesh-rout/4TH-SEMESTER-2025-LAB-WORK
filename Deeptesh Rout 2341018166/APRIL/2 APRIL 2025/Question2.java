/*Construct a binary search tree from the given array of elements: {10, 20, 30, 40, 50, 60, 
70, 80, 90, 100}. Include a method called CreateTree to construct the binary search 
tree from a sorted array. This method takes an array of integers as input and constructs 
the tree recursively using a binary search algorithm. */

/*

class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree {
    
    private TreeNode root;

   
    public BinarySearchTree() {
        root = null;
    }

   
    public void createTree(int[] sortedArray) {
        root = createTreeRecursive(sortedArray, 0, sortedArray.length - 1);
    }

    
    private TreeNode createTreeRecursive(int[] sortedArray, int start, int end) {
        if (start > end) {
            return null;
        }

     
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(sortedArray[mid]);

       
        node.left = createTreeRecursive(sortedArray, start, mid - 1);
        node.right = createTreeRecursive(sortedArray, mid + 1, end);

        return node;
    }

    
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.value + " ");
            inorderTraversal(node.right);
        }
    }

    
    public TreeNode getRoot() {
        return root;
    }
}

public class Question2 {
    public static void main(String[] args) {
       
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

      
        BinarySearchTree bst = new BinarySearchTree();
        bst.createTree(sortedArray);

        System.out.println("Inorder Traversal of the BST:");
        bst.inorderTraversal(bst.getRoot());
    }
}

	

*/
