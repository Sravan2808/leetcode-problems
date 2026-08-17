class Solution {
    int dp[][];
    private int solve(int l, int r, int[] prefixSum) {
        if(dp[l][r]!=-1) return dp[l][r];
        int value = 0;
        for (int mid = l; mid <= r - 1; mid++) {
            int leftSum = prefixSum[mid];
            if (l - 1 >= 0)
                leftSum -= prefixSum[l - 1];
            int rightSum = prefixSum[r] - prefixSum[mid];

            if (leftSum < rightSum) {
                value = Math.max(value, leftSum + solve(l, mid, prefixSum));
            } else if (leftSum > rightSum) {
                value = Math.max(value, rightSum + solve(mid + 1, r, prefixSum));
            } else {
                value = Math.max(value,
                        Math.max(leftSum + solve(l, mid, prefixSum), rightSum + solve(mid + 1, r, prefixSum)));
            }
        }
        return dp[l][r]=value;
    }

    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        dp = new int[501][501];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int prefixSum[] = new int[n];
        prefixSum[0] = stoneValue[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + stoneValue[i];
        }
        return solve(0, n - 1, prefixSum);
    }
}