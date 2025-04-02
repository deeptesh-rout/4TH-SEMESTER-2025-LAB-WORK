/*Determine if a given binary tree is a binary search tree. You will use an isBST method, 
which takes the maximum and minimum range of the values of the nodes. */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Question3 {
   
    public boolean isBST(TreeNode root) {
        return isBSTHelper(root, null, null);
    }

    private boolean isBSTHelper(TreeNode node, Integer min, Integer max) {
       
        if (node == null) {
            return true;
        }

        if ((min != null && node.val <= min) || 
        		(max != null && node.val >= max)) {
            return false;
        }

        return isBSTHelper(node.left, min, node.val) &&
               isBSTHelper(node.right, node.val, max);
    }

    public static void main(String[] args) {
       
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(8);

        Question3 sol = new Question3();
        System.out.println("Is tree 1 a BST? " + sol.isBST(root1)); 

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(7);
        root2.left.left = new TreeNode(2);
        root2.left.right = new TreeNode(8); 
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(9);
        System.out.println("Is tree 2 a BST? " + sol.isBST(root2)); 
        TreeNode root3 = new TreeNode(10);
        System.out.println("Is tree 3 a BST? " + sol.isBST(root3)); 

       
        TreeNode root4 = null;
        System.out.println("Is tree 4 a BST? " + sol.isBST(root4)); 

       
        TreeNode root5 = new TreeNode(10);
        root5.left = new TreeNode(15);
        System.out.println("Is tree 5 a BST? " + sol.isBST(root5)); 
    }
}














