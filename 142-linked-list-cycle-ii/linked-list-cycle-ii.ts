/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function detectCycle(head: ListNode | null): ListNode | null {
    let slow:ListNode = head;
    let fast:ListNode = head;

    while(fast!=null && fast.next!=null){
        slow=slow.next
        fast=fast.next.next
        if(slow==fast){
            let temp1:ListNode = head
            let temp2:ListNode = slow
            while(temp1!=temp2){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            return temp1;
        }
    }
    return null;
};