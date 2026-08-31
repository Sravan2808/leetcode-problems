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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int result[] = {-1,-1};

        int minDistance = Integer.MAX_VALUE;

        int previousCriticalIndex = 0;
        int firstCriticalIndex = 0;
        int currentIdx = 1;
        ListNode previousNode = head;
        ListNode currNode = head.next;

        while(currNode.next!=null){
            if((currNode.val<previousNode.val && currNode.val<currNode.next.val) ||
            (currNode.val>previousNode.val && currNode.val>currNode.next.val) ){
                if(previousCriticalIndex==0){
                    previousCriticalIndex = currentIdx;
                    firstCriticalIndex = currentIdx;
                }else{
                    minDistance = Math.min(currentIdx-previousCriticalIndex,minDistance);
                    previousCriticalIndex = currentIdx;
                }
            }
            currentIdx++;
            previousNode = currNode;
            currNode = currNode.next;
        }
        if(minDistance!=Integer.MAX_VALUE){
            int maxDistance = previousCriticalIndex-firstCriticalIndex;
            result = new int[]{minDistance,maxDistance};
        }
        return result;
    }
}