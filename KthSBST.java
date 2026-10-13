package InterviewMaster;

class Solution {
    int pos = 0;
    public int kthSmallest(TreeNode root , int k) {
        if (root == null) {
            return -1;
        }
        
        int check = kthSmallest(root.left , k);
        
        if (check>=0) {
            return check;
        }
        
        pos++ ;
        
        if (pos==k) {
            return root.val;
        }
        return kthSmallest(root.right , k);
    }
}