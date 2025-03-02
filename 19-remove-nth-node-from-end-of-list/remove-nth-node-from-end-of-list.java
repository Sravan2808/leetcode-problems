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
        // BruteForceApproach : O(2N);SC:O(1)
        if(head==null || head.next==null) return null;
        ListNode temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt == n){
            ListNode newHead = head.next;
            return newHead;
        }
        int res= cnt-n;
        temp=head;
        while(temp!=null){
            res--;
            if(res==0) break;
            temp=temp.next;
        }
       ListNode delNode = temp.next;
        temp.next = temp.next.next;
        return head;
    }
}