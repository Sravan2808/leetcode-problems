class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int openBracket = 0;
        for(char ch : s.toCharArray()){
            if(ch=='(') openBracket++;
            else if(ch==')') openBracket--;
            ans = Math.max(ans,openBracket);
        }
        return ans;
    }
}