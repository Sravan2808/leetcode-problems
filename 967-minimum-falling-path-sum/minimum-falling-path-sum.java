class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int dp[][] = new int[m][n];

        for(int j=0;j<n;j++){
            dp[0][j] = matrix[0][j];
        }

        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int up = matrix[i][j] + dp[i-1][j];
                int leftdiagonal =(int) 1e9;
                if(j-1>=0) leftdiagonal=matrix[i][j]+dp[i-1][j-1];
                int rightdiagonal = (int) 1e9;
                if(j+1<n) rightdiagonal=matrix[i][j]+dp[i-1][j+1];
                dp[i][j]=Math.min(up,Math.min(leftdiagonal,rightdiagonal));
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            ans = Math.min(ans,dp[m-1][j]);
        }
        return ans;
    }
}