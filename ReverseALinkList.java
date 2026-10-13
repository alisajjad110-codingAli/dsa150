package DSA150;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr!=null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    
    //Better approach
    public ListNode reverseListBetterOne(ListNode head){
        if (head==null || head.next==null) return head;
        
        ListNode res = reverseListBetterOne(head);
        head.next.next = head;
        head.next = null;
        return res;
    }
}