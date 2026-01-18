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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int size = 0;
        if (head == null)
            return null;
        while (temp != null){
            temp = temp.next;
            size+=1;
        }

        if(size == n) return head.next;

        int deleteNode = size - n;

        ListNode prev = null;
        ListNode curr = head;
        for (int i = 1; i <deleteNode; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}