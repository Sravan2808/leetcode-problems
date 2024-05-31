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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        return result;
        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);
        int lvl=0;
        while(!q.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode x=q.remove();
                level.add(x.val);
                if(x.left!=null)
                    q.add(x.left);
                if(x.right!=null)
                    q.add(x.right);
            }
            if(lvl%2==1)//odd
                Collections.reverse(level);
                result.add(level);
                lvl++;
        }
        return result;
        
        
    }
}