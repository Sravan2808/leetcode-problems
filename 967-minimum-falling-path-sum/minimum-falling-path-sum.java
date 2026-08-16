class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // int dp[][] = new int[m][n];
        int prev[] = new int[n];

        for(int j=0;j<n;j++){
            prev[j] = matrix[0][j];
        }

        for(int i=1;i<m;i++){
            int curr[] = new int[n];
            for(int j=0;j<n;j++){
                int up = matrix[i][j] + prev[j];
                int leftdiagonal =(int) 1e9;
                if(j-1>=0) leftdiagonal=matrix[i][j]+prev[j-1];
                int rightdiagonal = (int) 1e9;
                if(j+1<n) rightdiagonal=matrix[i][j]+prev[j+1];
                curr[j]=Math.min(up,Math.min(leftdiagonal,rightdiagonal));
            }
            prev=curr;
        }
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            ans = Math.min(ans,prev[j]);
        }
        return ans;
    }
}