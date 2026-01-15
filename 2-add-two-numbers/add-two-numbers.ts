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

function addTwoNumbers(l1: ListNode | null, l2: ListNode | null): ListNode | null {
    let temp1:ListNode = l1;
    let temp2:ListNode = l2;

    let dummyNode:ListNode = new ListNode(-1);
    let temp3:ListNode = dummyNode
    
    let carry = 0;
    while(temp1!=null || temp2!=null){
        let sum=carry
        if(temp1!=null) sum+=temp1.val;
        if(temp2!=null) sum+=temp2.val;

        let newNode:ListNode = new ListNode(sum%10);

        temp3.next = newNode;
        temp3 = temp3.next
        carry = Math.floor(sum/10);

        if(temp1!=null) temp1=temp1.next
        if(temp2!=null) temp2=temp2.next;
    }

    if(carry!=0){
        let newNode:ListNode = new ListNode(carry);
        temp3.next = newNode;
    }
    return dummyNode.next;
};