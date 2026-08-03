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
        for(int i=n-1;i>=0;i--){
            dp[i] = stoneValue[i] - dp[i+1];
            if(i+2<=n) dp[i] = Math.max(dp[i],stoneValue[i]+stoneValue[i+1]-dp[i+2]);
            if(i+3<=n)dp[i] = Math.max(dp[i],stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-dp[i+3]);
        }
        int diff = dp[0];
        if (diff > 0)
            return "Alice";
        else if (diff == 0)
            return "Tie";
        else
            return "Bob";
    }
}