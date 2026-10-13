package InterviewMaster;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums , 0 , nums.length-1);
    }
    
    private TreeNode convert(int[] nums, int start , int end) {
        if (start>end) {
            return null ;
        }
        
        int mid = start + (end-start)/2 ;
        
        TreeNode node = new TreeNode(nums[mid]) ;
        node.left = convert(nums, start , mid-1);
        node.right = convert(nums, mid+1 , end);
        
        return node ;
    }
}