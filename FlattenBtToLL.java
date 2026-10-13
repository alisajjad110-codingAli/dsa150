package DSA150;

public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        List<Integer> nodes = new ArrayList<>();
        preOrder(root, nodes);
        
        for (int i = 0; i<nodes.size()-1; i++) {
            nodes.get(i).left = null;
            nodes.get(i).right = nodes.get(i+1);
        }
    }
    
    private void preOrder(TreeNode node, List<Integer> nodes) {
        if (node == null) return;
        nodes.add(node);
        preOrder(node.left, nodes);
        preOrder(node.right, nodes);
    }
    
    //Approach-2 : In-place Optimized
    
    public void flatten2(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;
                
                while (temp.right != null) {
                    temp.right = current.right;
                    current.right = current.left;
                    current.left = null;
                }
            }
            current = current.right;
        }
    }
}