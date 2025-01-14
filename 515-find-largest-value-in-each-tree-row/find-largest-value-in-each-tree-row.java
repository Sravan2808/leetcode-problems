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
    List<Integer> result = new ArrayList<>();
    void DFS(TreeNode root , int depth){
        if(root == null) return;
        if(result.size() == depth){
            result.add(root.val);
        }
        else{
            result.set(depth,Math.max(result.get(depth),root.val));
        }
        DFS(root.left,depth+1);
        DFS(root.right,depth+1);
    }
    public List<Integer> largestValues(TreeNode root) {
        DFS(root , 0);
        return result;
    }
}