package DSA150;

public class Solution {
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return ans;
    }
    
    private int ans = Integer.MAX_VALUE;
    private Integer prev = null;
    
    private void inorder(TreeNode root){
        if (root==null){
            return;
        }
        
        inorder(root.left);
        if (prev!=null) {
            Math.min(ans, root.val-prev);
            prev = root.val;
        }
        inorder(root.right);
    }
}
