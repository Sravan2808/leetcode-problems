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
    public TreeNode searchBST(TreeNode root, int val) {
        // base case condition
        if(root == null || root.val==val){
            return root;
        }
        // traverse the left subtree
        if(val < root.val){
            return searchBST(root.left,val);
        }
        else{
            // traverse the right subtree
            return searchBST(root.right,val);
        }
        
    }
}