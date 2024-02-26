/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode dummyNode1=headA;
        ListNode dummyNode2=headB;
        
        while(dummyNode1!=dummyNode2){
            dummyNode1=dummyNode1==null?headB:dummyNode1.next;
            dummyNode2=dummyNode2==null?headA:dummyNode2.next;
        }
        return dummyNode2;
    
    }
}