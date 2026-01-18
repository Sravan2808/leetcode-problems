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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        if(head==null || head.next==null) return true;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode nextPointer = slow.next;
        slow.next = null;

        ListNode prev = null;
        while(nextPointer!=null){
            ListNode temp = nextPointer.next;
            nextPointer.next = prev;
            prev = nextPointer;
            nextPointer = temp;
        }

        ListNode right = prev; 
        ListNode left = head;

        while(right!=null){
            if(left.val != right.val) return false;
            left=left.next;
            right=right.next;
        }
        return true;

    }
}