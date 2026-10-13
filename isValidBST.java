package DSA150;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean valid(TreeNode node, long min, long max) {
        if (node == null) return true;
        
        if (!(node.val>min && node.val<max)) return false;
        
        return valid(node.left, min, node.val) && valid(node.right, node.val, max);
    }
    
    //Stack Approach
    
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (prev != null && root.val<=prev.val) return false;
            prev = root;
            root = root.right;
        }
        return true;
    }
}