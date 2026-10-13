package InterviewMaster ;

class Solution {
    public int maxDepth(TreeNode root) {
        TreeNode node = root;
        if (node==null) {
            return 0;
        }
        return Math.max(maxDepth(node.left) , maxDepth(node.right))+1 ;
    }
}