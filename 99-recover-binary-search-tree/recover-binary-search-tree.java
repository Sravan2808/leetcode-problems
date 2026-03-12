/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void recoverTree(TreeNode root) {
        TreeNode curr = root;
        TreeNode prev = null;
        TreeNode pprev = null;
        List<TreeNode> list = new ArrayList<>();
        while (curr != null) {
            if (curr.left != null) {
                TreeNode temp = curr.left;
                while (temp.right != null && temp.right != curr)
                    temp = temp.right;
                if (temp.right == null) {
                    temp.right = curr;
                    curr = curr.left;
                } else {
                    temp.right = null;
                    // value
                    if (prev != null && pprev != null) {
                        if (prev.val > curr.val && prev.val > pprev.val)
                            list.add(prev);
                        if (prev.val < curr.val && prev.val < pprev.val)
                            list.add(prev);
                    } else if (prev != null && prev.val > curr.val)
                        list.add(prev);

                    pprev = prev;
                    prev = curr;
                    curr = curr.right;
                }
            } else {
                // valie
                if (prev != null && pprev != null) {
                    if (prev.val > curr.val && prev.val > pprev.val)
                        list.add(prev);
                    if (prev.val < curr.val && prev.val < pprev.val)
                        list.add(prev);
                } else if (prev != null && prev.val > curr.val)
                    list.add(prev);

                pprev = prev;
                prev = curr;
                curr = curr.right;
            }

        }
        if(prev.val<pprev.val) list.add(prev);
        TreeNode first = list.get(0);
        TreeNode second = list.get(list.size()-1);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}