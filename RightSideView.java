package DSA150;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightview(root,result,0);
        return result;
    }
    
    public void rightview(TreeNode root, List<Integer> result, int currDepth) {
        if (root == null) {
            return;
        }
        
        if (currDepth == result.size()) {
            result.add(root.val);
        }
        
        rightview(root.left, result, currDepth+1);
        rightview(root.right, result, currDepth+1);
    }
}