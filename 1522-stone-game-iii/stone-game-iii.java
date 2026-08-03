class Solution {
    private int solve(int i, int j, int nums[], int result,int dp[]) {
        if (i >= j)
            return 0;

        if(dp[i]!=-1) return dp[i];

        result = Math.max(result, nums[i] - solve(i + 1, j, nums, result,dp));
        if (i + 1 < j)
            result = Math.max(result, nums[i] + nums[i + 1] - solve(i + 2, j, nums, result,dp));
        if (i + 2 < j)
            result = Math.max(result, nums[i] + nums[i + 1] + nums[i + 2] - solve(i + 3, j, nums, result,dp));
        return dp[i] = result;
    }

    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int diff = solve(0, n, stoneValue, Integer.MIN_VALUE,dp);
        if (diff > 0)
            return "Alice";
        else if (diff == 0)
            return "Tie";
        else
            return "Bob";
    }
}