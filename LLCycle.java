package DSA150;

public class Solution {
    //HashTable approach
    
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visitedNodes = new HashSet<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            if(visitedNodes.contains(currentNode)) {
                return true;
            }
            visitedNodes.add(currentNode);
            currentNode = currentNode.next;
        }
        return false;
    }
    
    // Fast and Slow pointers
    public boolean hasCycle2(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    
}