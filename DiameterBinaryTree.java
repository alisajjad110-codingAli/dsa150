package InterviewMaster ;

class Solution {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
            dfs(root);
            return res ;
        
        
        private int dfs(TreeNode root) {
            if (root==null) {
                return 0;
            }
            res = Math.max(res , dfs(root.left) + dfs(root.right));
            return res;
        }
        
    }
}