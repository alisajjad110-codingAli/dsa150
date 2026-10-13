package InterviewMaster;
// REDO
class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root ,root.left , root.right);
    }
    
    public boolean valid(TreeNode root , TreeNode l , TreeNode r) {
        if (l == null || r == null) {
            return false;
        }
        
        return root.value>l.value && root.value<r.value && valid(l , l.left , l.right) && valid(r , r.left , r.right);
    }
}
    