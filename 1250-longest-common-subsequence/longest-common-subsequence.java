class Solution {
    int dp[][];

    private int solve(int s1,int s2,String text1,String text2){
        if(s1<0 || s2<0) return 0;
        if(dp[s1][s2]!=-1) return dp[s1][s2];
        if(text1.charAt(s1)==text2.charAt(s2)) return dp[s1][s2]=1+solve(s1-1,s2-1,text1,text2);

        return dp[s1][s2]=0+Math.max(solve(s1-1,s2,text1,text2),solve(s1,s2-1,text1,text2));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int s1 = text1.length();
        int s2 = text2.length();
        dp = new int[s1][s2];
        for(int[] x:dp) Arrays.fill(x,-1);
        return solve(s1 - 1, s2 - 1, text1, text2);
    }
}