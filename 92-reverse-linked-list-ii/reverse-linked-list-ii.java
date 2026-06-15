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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Edge case: if left == right, no reversal needed
        if (left == right) return head;

        // Dummy node to simplify reversal at head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move prev to node before left
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Start reversing from current node
        ListNode curr = prev.next;
        ListNode next = null;

        // Reverse sublist between left and right
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        // Return new head
        return dummy.next;
    }
}