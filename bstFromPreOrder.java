package DSA150;

public class Solution {
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return bst(preorder, Integer.MAX_VALUE);
    }
    
    public TreeNode bst(int[] preorder, int v) {
        if (i == preorder.length || preorder[i]>v) {
            return null;
        }
        
        TreeNode child = new TreeNode(preorder[i++]);
        child.left = bst(prrorder, child.val);
        child.right = bst(preorder, v);
        return child;
    }
}