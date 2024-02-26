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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0){
            return head;
        }
        ListNode p=head;
        int length=1;
        while(p.next!=null){
            p=p.next;
            length++;
        }
        //p will be pointing to the last node
        p.next=head;
        k=k%length;
        // find new lastNode
        for(int i=0;i<length-k;i++){
            p=p.next;
        }
        // p is our new last node
        head=p.next;
        // point last node next to null
        p.next=null;
        return head; 
    }
}