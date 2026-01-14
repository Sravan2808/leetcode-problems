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
    ListNode findMiddle(ListNode head){
        ListNode slow=head,fast=head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }

    public ListNode merge(ListNode left,ListNode right){
        ListNode curr1 = left;
        ListNode curr2 = right;

        ListNode dummy = new ListNode(-1);
        ListNode curr3 = dummy;

        while(curr1!=null && curr2!=null){
            if(curr1.val<=curr2.val){
                curr3.next=curr1;
                curr1=curr1.next;
            }
            else{
            curr3.next=curr2;
            curr2=curr2.next;
            }

            curr3=curr3.next;
        }
        if(curr1!=null) curr3.next=curr1;
        if(curr2!=null) curr3.next=curr2;

        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode middleNode = findMiddle(head);
        ListNode head2 = middleNode.next;
        middleNode.next=null;

        ListNode left = sortList(head); 
        ListNode right = sortList(head2);
        ListNode merged = merge(left,right);
        return merged;
    }
}