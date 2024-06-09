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
    public ArrayList<Integer> inOrder(TreeNode root,ArrayList<Integer> result){
        if(root==null)
        return result;
        inOrder(root.left,result);
        result.add(root.val);
        inOrder(root.right,result);
        return result;
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> result= inOrder(root,new ArrayList<Integer>());
        int n=result.size();
        int i=0;
        int j=n-1;
        while(i<j){
            if(result.get(i)+result.get(j)==k)
            return true;
            else if(result.get(i)+result.get(j)>k)
            j--;
            else
            i++;
        }
        return false;
    }
}