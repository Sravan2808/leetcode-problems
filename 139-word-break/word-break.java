class Solution {
    private int n;
    private Boolean[] dp;
    private boolean solve(String s,int idx,List<String> wordDict){
        if(idx==n) return true;

        if(dp[idx]!=null) return dp[idx];

        for(int end=idx+1;end<=n;end++){
            String split = s.substring(idx,end);
            if(wordDict.contains(split)&&solve(s,end,wordDict)) return dp[idx]=true;
        }
        return dp[idx] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        n=s.length();
        dp = new Boolean[n];
        return solve(s,0,wordDict);
    }
}