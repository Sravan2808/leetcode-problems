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
    TreeNode builtTree(int inorder[],int postorder[],int ins,int ine,int posts,int poste){
        if(ins==ine) return new TreeNode(inorder[ins]);
        if(ins>ine) return null;
        TreeNode root = new TreeNode(postorder[poste]);
        int rootIdx = find(inorder,root.val);
        int leftcnt = rootIdx - ins;
        root.left = builtTree(inorder,postorder,ins,rootIdx-1,posts,posts+leftcnt-1);
        root.right = builtTree(inorder,postorder,rootIdx+1,ine,posts+leftcnt,poste-1);
        return root;
    }
    int find(int inorder[],int val){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i] == val) return i;
        }
        return -1;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return builtTree(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
}