/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    int getCount(Node root, int l, int h) {
        // Your code here
        if(root == null) return 0;
        int cnt = 0; 
        if(root.data>=l && root.data<=h) cnt=1;
        return cnt + getCount(root.left,l,h) + getCount(root.right,l,h);
    
    }
}