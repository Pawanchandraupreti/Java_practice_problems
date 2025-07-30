package Ques_61_to_70;

// Binary Search Tree Implementation

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class ques61 {
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }
    
    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }
    
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 70);
        inOrder(root); // Output: 30 50 70 
    }
}
