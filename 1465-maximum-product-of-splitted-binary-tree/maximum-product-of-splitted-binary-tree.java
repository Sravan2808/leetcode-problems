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
    long SUM = 0;
    long maxProduct = 0;
    static final int MOD = 1000000007;
    public long totalSum(TreeNode root) {
        if (root == null) return 0;
        long leftSubTreeSum = totalSum(root.left);
        long rightSubTreeSum = totalSum(root.right);
        long sum = root.val + leftSubTreeSum + rightSubTreeSum;
        return sum;
    }
    long find(TreeNode root){
        if(root == null) return 0;
        long leftSum = find(root.left);
        long rightSum = find(root.right);
        long subTreeSum = root.val + leftSum + rightSum;
        long remaining = SUM - subTreeSum;

        maxProduct = Math.max(maxProduct,subTreeSum * remaining);
        return subTreeSum;
    }

    public int maxProduct(TreeNode root) {
        if(root == null) return 0;
        SUM = totalSum(root);

        find(root);

        return (int) (maxProduct%MOD);

    }
}