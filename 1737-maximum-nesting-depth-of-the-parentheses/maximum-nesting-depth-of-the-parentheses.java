class Solution {
    public int maxDepth(String s) {
        int openBracket=0;
        int result=0;
        for(char ch :s.toCharArray()){
            if(ch=='(')
            {
                openBracket++;
            }
            else if(ch==')')
            {
                openBracket--;
            }
            result=Math.max(result,openBracket);
        }
        return result;
    }
}