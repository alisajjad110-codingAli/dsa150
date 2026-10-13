package DSA150;

public class Solution {
    public int KSmallestBST(TreeNode root, int k) {
        int count = countNodes(root.left);
        if (k<=count) {
            return KSmallestBST(root.left, k);
        } else if (k > count+1) {
            return KSmallestBST(root.right, k-1-count);
        }
        return root.val;
    }
    
    public int countNodes(TreeNode n) {
        if (n == null) return 0;
        return 1 + countNodes(n.left) + countNodes(n.right);
    }
    
    private static int number = 0;
    private static int count = 0;
    
    public int KSmallestno(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }
    
    public void helper(TreeNode n) {
        if (n.left != null) helper(n.left);
        count--;
        if (count == 0) {
            number = n.val;
            return;
        }
        
        if (n.right != null) helper(n.right);
    }
    
    public int KthSmallestbst(TreeNode root, int k) {
        Stack<Integer> stack = new Stack<>();
        
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        
        while (k!=0) {
            TreeNode n = stack.pop();
            k--;
            if (k == 0) return n.val;
            
            TreeNode right = n.right;
            while (right != null) {
                stack.push(right);
                right = right.left;
            }
        }
        return -1;
    }
}