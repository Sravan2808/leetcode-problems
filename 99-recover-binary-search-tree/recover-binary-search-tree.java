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
    private List<Integer> inorderValue = new ArrayList<>();
    private int index = 0;
    public void recoverTree(TreeNode root) {
        // Step1:Get all inorder Values
        inorder(root);
        // Step2:Sort the data
        Collections.sort(inorderValue);
        // Step3:Restore all the data
        restore(root);
    }
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        inorderValue.add(root.val);
        inorder(root.right);
    }
    private void restore(TreeNode root){
        if(root==null) return;
        restore(root.left);
        root.val = inorderValue.get(index);
        index++;
        restore(root.right);
    }
}