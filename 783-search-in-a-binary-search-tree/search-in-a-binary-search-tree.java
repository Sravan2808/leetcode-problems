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
//  Time complexity : O(h)
// Space complexity : O(h)

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // Recursive approach
        // // base case condition
        // if(root == null || root.val==val){
        //     return root;
        // }
        // // traverse the left subtree
        // if(val < root.val){
        //     return searchBST(root.left,val);
        // }
        // else{
        //     // traverse the right subtree
        //     return searchBST(root.right,val);
        // }

        // Iterative approach

        TreeNode current=root;
        TreeNode parentNode=null;
        while(current!=null && current.val!=val){
            if(val<current.val){
                // traverse towards left side
                current=current.left;
            }
            else{
                // traverse towards right side
                current=current.right;
            }
        }
        return current;
        
    }
}