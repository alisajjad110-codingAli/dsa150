package DSA150;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        
        ListNode tail = head;
        for (int i = 0; i<k; i++) {
            if (tail==null) return head;
            tail = tail.next;
        }
        
        ListNode newhead = reverse(head, tail);
        head.next = reverseKGroup(tail,k);
        return newhead;
    }
    
    public ListNode reverse(ListNode curr, ListNode end) {
        ListNode prev = null;
        while (curr!=end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}