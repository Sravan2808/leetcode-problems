/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal=root.val;
        int pVal=p.val;
        int qVal=q.val;

        // explore towards the right subtree
        if(pVal > parentVal && qVal > parentVal){
            return lowestCommonAncestor(root.right,p,q);

        }
        // explore towards the left subtree
        else if(pVal < parentVal && qVal < parentVal){
            return lowestCommonAncestor(root.left,p,q);
        }
        else{
            return root;
        }
        
    }
}