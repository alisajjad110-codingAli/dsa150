package DSA150;

public class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        Node leftMost = root;
        
        while (leftMost.left != null) {
            Node currNode = leftMost;
            
            while (currNode != null) {
                curr.left.next = curr.right;
                if (currNode.next != null) {
                    curr.right.next = curr.next.left;
                }
                currNode = currNode.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }
}