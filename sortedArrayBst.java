package DSA150;

public class Solution {
    public TreeNode sortedArrayBst(int[] nums) {
        return convert(nums, 0, nums.length-1);
    }
    
    private TreeNode convert(int[] nums, int l, int r){
        if (l>r) return null;
        
        int mid = left + (right-left)/2;
        
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = convert(nums, l, mid-1);
        node.right = convert(nums, mid+1, r);
        return node;
    }
}