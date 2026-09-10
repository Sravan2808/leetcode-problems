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
    private int result = 0;
    private int getSum(TreeNode root,int[] cnt){
        if(root==null) return 0;

        cnt[0]++;

        int leftSum = getSum(root.left,cnt);
        int rightSum = getSum(root.right,cnt);

        return leftSum+rightSum+root.val;
    }
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return result;
        int cnt[] = new int[]{0};
        int sum = getSum(root,cnt);
        if(sum/cnt[0] == root.val) result+=1;
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return result; 
    }
}