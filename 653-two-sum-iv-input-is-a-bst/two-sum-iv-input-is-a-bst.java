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
    private void Inorder(TreeNode root,List<Integer> ans){
        if(root==null) return;
        Inorder(root.left,ans);
        ans.add(root.val);
        Inorder(root.right,ans);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        Inorder(root,ans);
        int i=0;
        int j=ans.size()-1;
        while(i<j){
            int sum = ans.get(i)+ans.get(j);
            if(sum==k) return true;
            else if(sum>k) j--;
            else i++;
        }
        return false;
    }
}