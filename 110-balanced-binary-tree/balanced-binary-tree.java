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
    int min = Integer.MIN_VALUE;
    int Height(TreeNode root){
        if(root==null) return -1;
        int left = Height(root.left);
        int right = Height(root.right);
        if(left == min || right == min) return min;
        if(Math.abs(right-left)>1) return min ;
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return Height(root)!=min;
    }
}