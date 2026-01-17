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
    public ListNode partition(ListNode head, int x) {

        ListNode temp = head;

        ListNode smaller = new ListNode(-1);
        ListNode smallerPointer = smaller;

        ListNode larger = new ListNode(-1);
        ListNode largerPointer = larger;

        if(temp==null || temp.next==null) return temp;

        while(temp!=null){
            if(temp.val < x){
                smallerPointer.next = temp;
                smallerPointer = smallerPointer.next;
            }
            else{
                largerPointer.next = temp;
                largerPointer = largerPointer.next;
            } 
            temp=temp.next;
        }
        largerPointer.next = null;
        smallerPointer.next = larger.next;
        return smaller.next;
        
    }
}