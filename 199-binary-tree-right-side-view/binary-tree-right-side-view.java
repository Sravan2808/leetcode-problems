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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        q.add(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int curr = 1; curr <= levelSize; curr++) {
                TreeNode ele = q.remove();

                if (curr == levelSize) {
                    list.add(ele.val);
                }
                if(ele.left!=null){
                    q.add(ele.left);
                }
                if(ele.right!=null){
                    q.add(ele.right);
                }

            }
        }
        return list;
    }
}