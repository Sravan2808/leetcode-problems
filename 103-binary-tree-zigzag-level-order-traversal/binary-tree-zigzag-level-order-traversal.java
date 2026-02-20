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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int lvl = 0;
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int cnt = 0; cnt < size; cnt++) {
                TreeNode x = q.remove();
                level.add(x.val);
                if (x.left != null)
                    q.add(x.left);
                if (x.right != null)
                    q.add(x.right);
            }
            if (lvl % 2 != 0) {
                Collections.reverse(level);
            }
            res.add(level);
            lvl++;
        }
        return res;
    }
}