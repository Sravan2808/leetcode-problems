class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int i=0;
        for(char ch:s.toCharArray()){
            ans += (26 - (ch - 'a')) * (i+1);
            i++;
        }
        return ans;
    }
}