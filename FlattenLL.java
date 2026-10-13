package DSA150;

public class Solution {
    // Recursive approach
    public ListNode flatten(ListNode head) {
        ListNode curr = head;
        
        while (curr != null) {
            if (curr.child != null) {
                ListNode next = curr.next;
                curr.next = flatten(curr.child);
                curr.next.prev = curr;
                curr.child = null;
            }
            while (curr.next != null) {
                curr = curr.next;
                if (next != null) {
                    curr.next = next;
                    next.prev = curr;
                }
            }
            curr = curr.next;
        }
        return curr;
    }
    
    //Stach approach
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        
        Node current = head;
        Stack<Node> stack = new Stack<>();
        
        while (current != null) {
            if (current.child != null) {
                Node nextNode = current.next;
                
                // Connect current node to the child list
                current.next = current.child;
                current.child.prev = current;
                current.child = null;
                
                // Push the next node onto the stack for later processing
                if (nextNode != null) {
                    stack.push(nextNode);
                }
            } else if (current.next == null && !stack.isEmpty()) {
                // If there are no more nodes in the current level,
                // pop a node from the stack and connect it to the current node
                Node nextNode = stack.pop();
                current.next = nextNode;
                nextNode.prev = current;
            }
            
            current = current.next;
        }
        
        return head;
    }
}