package DSA150;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        while (root!= null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
    
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        
        inorder(root,res);
        return res;
    }
    
    private void inorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }
}