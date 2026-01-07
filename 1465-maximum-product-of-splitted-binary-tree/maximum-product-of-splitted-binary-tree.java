class Solution {
    long SUM = 0;
    long maxProduct = 0;
    static final int MOD = 1000000007;

    public long totalSum(TreeNode root) {
        if (root == null) return 0;
        return root.val + totalSum(root.left) + totalSum(root.right);
    }

    long find(TreeNode root){
        if(root == null) return 0;

        long leftSum = find(root.left);
        long rightSum = find(root.right);

        long subTreeSum = root.val + leftSum + rightSum;
        long remaining = SUM - subTreeSum;

        maxProduct = Math.max(maxProduct, subTreeSum * remaining);
        return subTreeSum;
    }

    public int maxProduct(TreeNode root) {
        SUM = totalSum(root);
        find(root);
        return (int)(maxProduct % MOD);
    }
}
