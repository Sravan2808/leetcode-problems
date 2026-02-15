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
    TreeNode builtTree(int[] inorder,int[] preorder,int ins,int ine,int prs,int pre){
        if(ins==ine) return new TreeNode(inorder[ins]);
        if(ins>ine) return null;

        TreeNode root = new TreeNode(preorder[prs]);
        int rootIndex = search(inorder,root.val);
        int leftcnt = rootIndex-ins;
        root.left = builtTree(inorder,preorder,ins,rootIndex-1,prs+1,prs+leftcnt);
        root.right = builtTree(inorder,preorder,rootIndex+1,ine,prs+leftcnt+1,pre);
        return root;
    }
    int search(int inorder[],int val){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i] == val) return i;
        }
        return -1;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return builtTree(inorder,preorder,0,inorder.length-1,0,preorder.length-1);
    }
}