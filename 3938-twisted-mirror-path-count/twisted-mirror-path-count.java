class Solution {
    int LEFT = 0;
    int UP = 1;
    int MOD = 1_000_000_007;
    int m;
    int n;
    int dp[][][];
    private int solve(int grid[][],int i,int j,int cameFrom){
        if(i>=m || j>=n) return 0;
        if(i==m-1 && j==n-1) return 1;

        if(dp[i][j][cameFrom]!=-1) return dp[i][j][cameFrom];

        if(grid[i][j]==1){
            if(cameFrom == LEFT){
                return dp[i][j][cameFrom] = solve(grid,i+1,j,UP);
            }else return dp[i][j][cameFrom] = solve(grid,i,j+1,LEFT);
        }

        // if(grid[i][j]==0)

        int totalPathCnt = 0;

        totalPathCnt= (totalPathCnt+solve(grid,i+1,j,UP))%MOD;
        totalPathCnt= (totalPathCnt+solve(grid,i,j+1,LEFT))%MOD;

        return dp[i][j][cameFrom]=totalPathCnt;

    }
    public int uniquePaths(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        dp = new int[m][n][2];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j][0] = -1;
                dp[i][j][1] = -1;
            }
        }

        return solve(grid,0,0,LEFT);
        
    }
}