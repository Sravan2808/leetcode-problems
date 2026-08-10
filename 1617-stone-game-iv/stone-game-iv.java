class Solution {
    public boolean winnerSquareGame(int n) {
        boolean dp[] = new boolean[n+1];
        Arrays.fill(dp,false);

        dp[0] = false;

        for(int i=1;i<n+1;i++){
            for(int k=1;k*k<=i;k++){
                if(dp[i-(k*k)]==false){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}