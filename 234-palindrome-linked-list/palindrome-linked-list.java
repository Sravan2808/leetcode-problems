/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // reversing the linklist
    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        ListNode current=head;
        while(current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
        }
        head=prev;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        return true;
       
        // finding the midddle element
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverseList(slow.next);
        ListNode first=head;
        ListNode second=newhead;
       
        while(second!=null && first!=null){
            if(first.val!=second.val){ 
             reverseList(newhead);
            return false;
            }
            
                first=first.next;
                second=second.next;
        }
         reverseList(newhead);
        return true;
        
    }
}