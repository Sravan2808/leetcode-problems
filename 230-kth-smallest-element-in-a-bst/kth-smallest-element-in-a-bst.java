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
    // Function definition
    public ArrayList<Integer> inOrderTraversal(TreeNode root,ArrayList<Integer> result){
        if(root == null){
            return result;
        }
        // 1.Traverse towards the left subtree
        inOrderTraversal(root.left,result);
        // 2.store the elements inside the result array
        result.add(root.val);
        // 3.traverse towards the right subtree
        inOrderTraversal(root.right,result);

        return result;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> result= inOrderTraversal(root,new ArrayList<Integer>());
        // return the kth smallest element
        return result.get(k-1);
        
    }
}