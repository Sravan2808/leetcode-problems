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
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp);
            temp = temp.next;
        }

        int left = 0;
        int right = list.size()-1;
        List<ListNode> reOrder = new ArrayList<>();
        while(left<right){
            reOrder.add(list.get(left++));
            reOrder.add(list.get(right--));
        }

        if(left==right) reOrder.add(list.get(left));

        temp = reOrder.get(0);
        for(int i=1;i<reOrder.size();i++){
            temp.next = reOrder.get(i);
            temp = temp.next;
        }
        temp.next = null;
    }
}