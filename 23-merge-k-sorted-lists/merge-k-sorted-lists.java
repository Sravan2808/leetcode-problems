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
    public ListNode mergeKLists(ListNode[] lists) {
        // Custom Comparator
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a,b)->a.val-b.val
        );

        // insert the minimum element of each sorted list.
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null)
            pq.add(lists[i]);
        }
        // create our ans LinkedList
        ListNode head = null;
        ListNode curr = head;

        while(!pq.isEmpty()){
            // remove amd return the current ,minimum node in O(logk)
            ListNode currMinNode = pq.poll();
            if(head == null){
                head = new ListNode(currMinNode.val);
                curr = head;
            }
            else{
                curr.next = new ListNode(currMinNode.val);
                curr=curr.next;
            }

            // add the next minimum node
            if(currMinNode.next != null){
                pq.add(currMinNode.next);
            }
        }
        return head;

    }
}